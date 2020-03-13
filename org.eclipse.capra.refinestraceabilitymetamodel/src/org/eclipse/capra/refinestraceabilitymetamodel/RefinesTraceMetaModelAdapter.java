package org.eclipse.capra.refinestraceabilitymetamodel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.capra.core.adapters.Connection;
import org.eclipse.capra.core.adapters.TraceMetaModelAdapter;
import org.eclipse.capra.core.adapters.TracePersistenceAdapter;
import org.eclipse.capra.core.handlers.IArtifactHandler;
import org.eclipse.capra.core.helpers.ArtifactHelper;
import org.eclipse.capra.core.helpers.ExtensionPointHelper;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class RefinesTraceMetaModelAdapter implements TraceMetaModelAdapter {

	private static final int DEFAULT_INITIAL_TRANSITIVITY_DEPTH = 1;

	public RefinesTraceMetaModelAdapter() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public EObject createModel() {
		return RefinestraceabilitymetamodelFactory.eINSTANCE.createRefinesTraceModel();
	}

	@Override
	public Collection<EClass> getAvailableTraceTypes(List<EObject> selection) {
		Collection<EClass> traceTypes = new ArrayList<>();
		if (selection.size() > 1) {
			traceTypes.add(RefinestraceabilitymetamodelPackage.eINSTANCE.getRefines());
		}
		return traceTypes;
	}

	@Override
	public EObject createTrace(EClass traceType, EObject traceModel, List<EObject> selection) {
		RefinesTraceModel tm = (RefinesTraceModel) traceModel;
		EObject trace = RefinestraceabilitymetamodelFactory.eINSTANCE.create(traceType);
		Refines refinesTrace = (Refines) trace;
		refinesTrace.getItem().addAll(selection);
		TracePersistenceAdapter persistenceAdapter = ExtensionPointHelper.getTracePersistenceAdapter().get();
		EObject artifactModel = persistenceAdapter.getArtifactWrappers(new ResourceSetImpl());
		ArtifactHelper artifactHelper = new ArtifactHelper(artifactModel);
		StringBuilder name = new StringBuilder();
		for (Object obj : selection) {
			name.append(" ")
					.append(artifactHelper.getHandler(artifactHelper.unwrapWrapper(obj)).get()
							.withCastedHandler(artifactHelper.unwrapWrapper(obj), (h, e) -> h.getDisplayName(e))
							.orElseGet(obj::toString));
		}
		tm.getItem().add(refinesTrace);
		return refinesTrace;
	}

	@Override
	public boolean isThereATraceBetween(EObject firstElement, EObject secondElement, EObject traceModel) {
		RefinesTraceModel root = (RefinesTraceModel) traceModel;
		List<Refines> relevantLinks = new ArrayList<Refines>();
		List<TraceLinks> allTraces = root.getItem();

		for (TraceLinks trace : allTraces) {
			if (!firstElement.equals(secondElement)) {
				if (trace.getItem().contains(firstElement) && trace.getItem().contains(secondElement)) {
					relevantLinks.add((Refines) trace);
				}
			}
		}
		return relevantLinks.size() > 0;
	}

	@Override
	public List<Connection> getConnectedElements(EObject element, EObject tracemodel) {
		RefinesTraceModel root = (RefinesTraceModel) tracemodel;
		List<Connection> connections = new ArrayList<>();
		List<TraceLinks> traces = root.getItem();

		if (element instanceof Refines) {
			Refines trace = (Refines) element;
			connections.add(new Connection(element, trace.getItem(), trace));
		} else {
			for (TraceLinks trace : traces) {
				for (EObject item : trace.getItem()) {
					if (EcoreUtil.equals(item, element)) {
						connections.add(new Connection(element, trace.getItem(), trace));
					}
				}
			}
		}
		return connections;
	}

	private List<Connection> getTransitivelyConnectedElements(EObject element, EObject traceModel,
			List<Object> accumulator, int currentDepth, int maximumDepth) {
		List<Connection> directElements = getConnectedElements(element, traceModel);
		List<Connection> allElements = new ArrayList<>();

		int currDepth = currentDepth + 1;
		for (Connection connection : directElements) {
			if (!accumulator.contains(connection.getTlink())) {
				allElements.add(connection);
				accumulator.add(connection.getTlink());
				for (EObject e : connection.getTargets()) {
					if (maximumDepth == 0 || currDepth <= maximumDepth) {
						allElements.addAll(
								getTransitivelyConnectedElements(e, traceModel, accumulator, currDepth, maximumDepth));
					}
				}
			}
		}
		return allElements;
	}

	@Override
	public List<Connection> getTransitivelyConnectedElements(EObject element, EObject traceModel, int maximumDepth) {
		List<Object> accumulator = new ArrayList<>();
		return getTransitivelyConnectedElements(element, traceModel, accumulator, DEFAULT_INITIAL_TRANSITIVITY_DEPTH,
				maximumDepth);
	}

	@Override
	public List<Connection> getAllTraceLinks(EObject traceModel) {
		RefinesTraceModel model = (RefinesTraceModel) traceModel;
		List<Connection> allLinks = new ArrayList<>();

		for (TraceLinks trace : model.getItem()) {
			List<EObject> allItems = new ArrayList<>();
			allItems.addAll(trace.getItem());
			EObject origin = allItems.get(0);
			allItems.remove(0);
			allLinks.add(new Connection(origin, allItems, trace));
		}
		return allLinks;
	}

	@Override
	public void deleteTrace(List<Connection> toDelete, EObject traceModel) {
		List<Object> toRemove = new ArrayList<>();
		if (traceModel instanceof RefinesTraceModel) {
			RefinesTraceModel tModel = (RefinesTraceModel) traceModel;
			for (Connection c : toDelete) {
				for (TraceLinks trace : tModel.getItem()) {
					if (EcoreUtil.equals(trace, c.getTlink())) {
						toRemove.add(trace);
					}
				}
			}
			for (Object trace : toRemove) {
				tModel.getItem().remove(trace);
			}

			TracePersistenceAdapter persistenceAdapter = ExtensionPointHelper.getTracePersistenceAdapter().get();
			persistenceAdapter.saveTracesAndArtifacts(tModel,
					persistenceAdapter.getArtifactWrappers(new ResourceSetImpl()));
		}

	}

	@Override
	public List<Connection> getInternalElements(EObject element, EObject traceModel,
			List<String> selectedRelationshipTypes, boolean traceLinksTransitive, int transitivityDepth,
			List<Connection> existingTraces) {
		List<Connection> allElements = new ArrayList<>();
		List<Connection> directElements;
		if (traceLinksTransitive) {
			directElements = getTransitivelyConnectedElements(element, traceModel, selectedRelationshipTypes,
					transitivityDepth);
		} else {
			directElements = getConnectedElements(element, traceModel, selectedRelationshipTypes);
		}
		List<Integer> hashCodes = new ArrayList<>();

		for (Connection conn : existingTraces) {
			int connectionHash = conn.getOrigin().hashCode() + conn.getTlink().hashCode();
			for (EObject targ : conn.getTargets()) {
				connectionHash += targ.hashCode();
			}
			hashCodes.add(connectionHash);
		}

		ResourceSet resourceSet = new ResourceSetImpl();
		TracePersistenceAdapter persistenceAdapter = ExtensionPointHelper.getTracePersistenceAdapter().get();
		EObject artifactModel = persistenceAdapter.getArtifactWrappers(resourceSet);
		ArtifactHelper artifactHelper = new ArtifactHelper(artifactModel);
		for (Connection conn : directElements) {
			int connectionHash = conn.getOrigin().hashCode() + conn.getTlink().hashCode();
			for (EObject targ : conn.getTargets()) {
				connectionHash += targ.hashCode();
			}
			if (!hashCodes.contains(connectionHash)) {
				allElements.add(conn);
			}
			// get internal links from source
			Object origin = artifactHelper.unwrapWrapper(conn.getOrigin());
			IArtifactHandler<?> originHandler = artifactHelper.getHandler(origin).get();
			if (originHandler != null) {
				allElements.addAll(originHandler.addInternalLinks(conn.getOrigin(), selectedRelationshipTypes));
			}
			// get internal links from targets
			for (EObject o : conn.getTargets()) {
				Object originalObject = artifactHelper.unwrapWrapper(o);
				IArtifactHandler<?> handler = artifactHelper.getHandler(originalObject).get();
				if (handler != null) {
					allElements.addAll(handler.addInternalLinks(o, selectedRelationshipTypes));
				}
			}
		}
		// show internal links even when no Capra links are present
		if (directElements.size() == 0) {
			Object originalObject = artifactHelper.unwrapWrapper(element);
			IArtifactHandler<?> handler = artifactHelper.getHandler(originalObject).get();
			if (handler != null) {
				allElements.addAll(handler.addInternalLinks(element, selectedRelationshipTypes));
			}

		}

		if (element.getClass().getPackage().toString().contains("org.eclipse.eatop")) {
			@SuppressWarnings("unchecked")
			IArtifactHandler<Object> handler = (IArtifactHandler<Object>) artifactHelper.getHandler(element)
					.orElse(null);
			allElements.addAll(handler.addInternalLinks(element, selectedRelationshipTypes));
		}
		return allElements;
	}

	@Override
	public List<Connection> getInternalElementsTransitive(EObject element, EObject traceModel,
			List<String> selectedRelationshipTypes, int transitivityDepth, List<Connection> existingTraces) {
		return getInternalElementsTransitive(element, traceModel, selectedRelationshipTypes, transitivityDepth,
				existingTraces);
	}

	@Override
	public boolean isThereAnInternalTraceBetween(EObject first, EObject second) {

		ResourceSet resourceSet = new ResourceSetImpl();
		TracePersistenceAdapter persistenceAdapter = ExtensionPointHelper.getTracePersistenceAdapter().get();
		EObject artifactModel = persistenceAdapter.getArtifactWrappers(resourceSet);
		ArtifactHelper artifactHelper = new ArtifactHelper(artifactModel);
		IArtifactHandler<?> handlerFirstElement = artifactHelper.getHandler(first).orElse(null);
		IArtifactHandler<?> handlerSecondElement = artifactHelper.getHandler(second).orElse(null);

		return handlerFirstElement.isThereAnInternalTraceBetween(first, second)
				|| handlerSecondElement.isThereAnInternalTraceBetween(first, second);
	}

	@Override
	public List<Connection> getTransitivelyConnectedElements(EObject element, EObject traceModel,
			List<String> selectedRelationshipTypes, int maximumDepth) {
		List<Object> accumulator = new ArrayList<>();
		return getTransitivelyConnectedElements(element, traceModel, accumulator, selectedRelationshipTypes,
				DEFAULT_INITIAL_TRANSITIVITY_DEPTH, maximumDepth);
	}

	private List<Connection> getTransitivelyConnectedElements(EObject element, EObject traceModel,
			List<Object> accumulator, List<String> selectedRelationshipTypes, int currentDepth, int maximumDepth) {
		List<Connection> directElements = getConnectedElements(element, traceModel, selectedRelationshipTypes);
		List<Connection> allElements = new ArrayList<>();
		int currDepth = currentDepth + 1;
		for (Connection connection : directElements) {
			if (!accumulator.contains(connection.getTlink())) {
				allElements.add(connection);
				accumulator.add(connection.getTlink());
				for (EObject e : connection.getTargets()) {
					if (maximumDepth == 0 || currDepth <= maximumDepth) {
						allElements.addAll(getTransitivelyConnectedElements(e, traceModel, accumulator,
								selectedRelationshipTypes, currDepth, maximumDepth));
					}
				}
			}
		}

		return allElements;
	}

	@Override
	public List<Connection> getConnectedElements(EObject element, EObject traceModel,
			List<String> selectedRelationshipTypes) {
		RefinesTraceModel root = (RefinesTraceModel) traceModel;
		List<Connection> connections = new ArrayList<>();
		List<TraceLinks> traces = root.getItem();

		if (selectedRelationshipTypes.size() == 0 || selectedRelationshipTypes
				.contains(RefinestraceabilitymetamodelPackage.eINSTANCE.getRefines().getName())) {
			if (element instanceof Refines) {
				Refines trace = (Refines) element;
				connections.add(new Connection(element, trace.getItem(), trace));
			} else {
				for (TraceLinks trace : traces) {
					for (EObject item : trace.getItem()) {
						if (EcoreUtil.equals(item, element)) {
							connections.add(new Connection(element, trace.getItem(), trace));
						}
					}
				}
			}
		}
		return connections;
	}
}
