/**
 */
package org.eclipse.capra.refinestraceabilitymetamodel.impl;

import org.eclipse.capra.refinestraceabilitymetamodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RefinestraceabilitymetamodelFactoryImpl extends EFactoryImpl implements RefinestraceabilitymetamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RefinestraceabilitymetamodelFactory init() {
		try {
			RefinestraceabilitymetamodelFactory theRefinestraceabilitymetamodelFactory = (RefinestraceabilitymetamodelFactory)EPackage.Registry.INSTANCE.getEFactory(RefinestraceabilitymetamodelPackage.eNS_URI);
			if (theRefinestraceabilitymetamodelFactory != null) {
				return theRefinestraceabilitymetamodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RefinestraceabilitymetamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefinestraceabilitymetamodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RefinestraceabilitymetamodelPackage.REFINES_TRACE_MODEL: return createRefinesTraceModel();
			case RefinestraceabilitymetamodelPackage.REFINES: return createRefines();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefinesTraceModel createRefinesTraceModel() {
		RefinesTraceModelImpl refinesTraceModel = new RefinesTraceModelImpl();
		return refinesTraceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Refines createRefines() {
		RefinesImpl refines = new RefinesImpl();
		return refines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefinestraceabilitymetamodelPackage getRefinestraceabilitymetamodelPackage() {
		return (RefinestraceabilitymetamodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RefinestraceabilitymetamodelPackage getPackage() {
		return RefinestraceabilitymetamodelPackage.eINSTANCE;
	}

} //RefinestraceabilitymetamodelFactoryImpl
