/**
 */
package org.eclipse.capra.refinestraceabilitymetamodel.impl;

import org.eclipse.capra.refinestraceabilitymetamodel.Refines;
import org.eclipse.capra.refinestraceabilitymetamodel.RefinesTraceModel;
import org.eclipse.capra.refinestraceabilitymetamodel.RefinestraceabilitymetamodelFactory;
import org.eclipse.capra.refinestraceabilitymetamodel.RefinestraceabilitymetamodelPackage;
import org.eclipse.capra.refinestraceabilitymetamodel.TraceLinks;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RefinestraceabilitymetamodelPackageImpl extends EPackageImpl implements RefinestraceabilitymetamodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refinesTraceModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traceLinksEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refinesEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.capra.refinestraceabilitymetamodel.RefinestraceabilitymetamodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RefinestraceabilitymetamodelPackageImpl() {
		super(eNS_URI, RefinestraceabilitymetamodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link RefinestraceabilitymetamodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RefinestraceabilitymetamodelPackage init() {
		if (isInited) return (RefinestraceabilitymetamodelPackage)EPackage.Registry.INSTANCE.getEPackage(RefinestraceabilitymetamodelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRefinestraceabilitymetamodelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RefinestraceabilitymetamodelPackageImpl theRefinestraceabilitymetamodelPackage = registeredRefinestraceabilitymetamodelPackage instanceof RefinestraceabilitymetamodelPackageImpl ? (RefinestraceabilitymetamodelPackageImpl)registeredRefinestraceabilitymetamodelPackage : new RefinestraceabilitymetamodelPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theRefinestraceabilitymetamodelPackage.createPackageContents();

		// Initialize created meta-data
		theRefinestraceabilitymetamodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRefinestraceabilitymetamodelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RefinestraceabilitymetamodelPackage.eNS_URI, theRefinestraceabilitymetamodelPackage);
		return theRefinestraceabilitymetamodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefinesTraceModel() {
		return refinesTraceModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefinesTraceModel_Item() {
		return (EReference)refinesTraceModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTraceLinks() {
		return traceLinksEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTraceLinks_Item() {
		return (EReference)traceLinksEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefines() {
		return refinesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefinestraceabilitymetamodelFactory getRefinestraceabilitymetamodelFactory() {
		return (RefinestraceabilitymetamodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		refinesTraceModelEClass = createEClass(REFINES_TRACE_MODEL);
		createEReference(refinesTraceModelEClass, REFINES_TRACE_MODEL__ITEM);

		traceLinksEClass = createEClass(TRACE_LINKS);
		createEReference(traceLinksEClass, TRACE_LINKS__ITEM);

		refinesEClass = createEClass(REFINES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		refinesEClass.getESuperTypes().add(this.getTraceLinks());

		// Initialize classes, features, and operations; add parameters
		initEClass(refinesTraceModelEClass, RefinesTraceModel.class, "RefinesTraceModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRefinesTraceModel_Item(), this.getTraceLinks(), null, "item", null, 0, -1, RefinesTraceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(traceLinksEClass, TraceLinks.class, "TraceLinks", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTraceLinks_Item(), theEcorePackage.getEObject(), null, "item", null, 0, -1, TraceLinks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(refinesEClass, Refines.class, "Refines", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //RefinestraceabilitymetamodelPackageImpl
