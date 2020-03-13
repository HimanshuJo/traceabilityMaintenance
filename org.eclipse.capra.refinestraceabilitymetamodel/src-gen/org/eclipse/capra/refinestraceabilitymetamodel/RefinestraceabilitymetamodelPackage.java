/**
 */
package org.eclipse.capra.refinestraceabilitymetamodel;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.capra.refinestraceabilitymetamodel.RefinestraceabilitymetamodelFactory
 * @model kind="package"
 * @generated
 */
public interface RefinestraceabilitymetamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "refinestraceabilitymetamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.eclipse.capra.refinestraceabilitymetamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "refinestraceabilitymetamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RefinestraceabilitymetamodelPackage eINSTANCE = org.eclipse.capra.refinestraceabilitymetamodel.impl.RefinestraceabilitymetamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.capra.refinestraceabilitymetamodel.impl.RefinesTraceModelImpl <em>Refines Trace Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capra.refinestraceabilitymetamodel.impl.RefinesTraceModelImpl
	 * @see org.eclipse.capra.refinestraceabilitymetamodel.impl.RefinestraceabilitymetamodelPackageImpl#getRefinesTraceModel()
	 * @generated
	 */
	int REFINES_TRACE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINES_TRACE_MODEL__ITEM = 0;

	/**
	 * The number of structural features of the '<em>Refines Trace Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINES_TRACE_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Refines Trace Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINES_TRACE_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.capra.refinestraceabilitymetamodel.impl.TraceLinksImpl <em>Trace Links</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capra.refinestraceabilitymetamodel.impl.TraceLinksImpl
	 * @see org.eclipse.capra.refinestraceabilitymetamodel.impl.RefinestraceabilitymetamodelPackageImpl#getTraceLinks()
	 * @generated
	 */
	int TRACE_LINKS = 1;

	/**
	 * The feature id for the '<em><b>Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINKS__ITEM = 0;

	/**
	 * The number of structural features of the '<em>Trace Links</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINKS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Trace Links</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINKS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.capra.refinestraceabilitymetamodel.impl.RefinesImpl <em>Refines</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.capra.refinestraceabilitymetamodel.impl.RefinesImpl
	 * @see org.eclipse.capra.refinestraceabilitymetamodel.impl.RefinestraceabilitymetamodelPackageImpl#getRefines()
	 * @generated
	 */
	int REFINES = 2;

	/**
	 * The feature id for the '<em><b>Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINES__ITEM = TRACE_LINKS__ITEM;

	/**
	 * The number of structural features of the '<em>Refines</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINES_FEATURE_COUNT = TRACE_LINKS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Refines</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINES_OPERATION_COUNT = TRACE_LINKS_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.capra.refinestraceabilitymetamodel.RefinesTraceModel <em>Refines Trace Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refines Trace Model</em>'.
	 * @see org.eclipse.capra.refinestraceabilitymetamodel.RefinesTraceModel
	 * @generated
	 */
	EClass getRefinesTraceModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.capra.refinestraceabilitymetamodel.RefinesTraceModel#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item</em>'.
	 * @see org.eclipse.capra.refinestraceabilitymetamodel.RefinesTraceModel#getItem()
	 * @see #getRefinesTraceModel()
	 * @generated
	 */
	EReference getRefinesTraceModel_Item();

	/**
	 * Returns the meta object for class '{@link org.eclipse.capra.refinestraceabilitymetamodel.TraceLinks <em>Trace Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace Links</em>'.
	 * @see org.eclipse.capra.refinestraceabilitymetamodel.TraceLinks
	 * @generated
	 */
	EClass getTraceLinks();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.capra.refinestraceabilitymetamodel.TraceLinks#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Item</em>'.
	 * @see org.eclipse.capra.refinestraceabilitymetamodel.TraceLinks#getItem()
	 * @see #getTraceLinks()
	 * @generated
	 */
	EReference getTraceLinks_Item();

	/**
	 * Returns the meta object for class '{@link org.eclipse.capra.refinestraceabilitymetamodel.Refines <em>Refines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refines</em>'.
	 * @see org.eclipse.capra.refinestraceabilitymetamodel.Refines
	 * @generated
	 */
	EClass getRefines();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RefinestraceabilitymetamodelFactory getRefinestraceabilitymetamodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.capra.refinestraceabilitymetamodel.impl.RefinesTraceModelImpl <em>Refines Trace Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.capra.refinestraceabilitymetamodel.impl.RefinesTraceModelImpl
		 * @see org.eclipse.capra.refinestraceabilitymetamodel.impl.RefinestraceabilitymetamodelPackageImpl#getRefinesTraceModel()
		 * @generated
		 */
		EClass REFINES_TRACE_MODEL = eINSTANCE.getRefinesTraceModel();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFINES_TRACE_MODEL__ITEM = eINSTANCE.getRefinesTraceModel_Item();

		/**
		 * The meta object literal for the '{@link org.eclipse.capra.refinestraceabilitymetamodel.impl.TraceLinksImpl <em>Trace Links</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.capra.refinestraceabilitymetamodel.impl.TraceLinksImpl
		 * @see org.eclipse.capra.refinestraceabilitymetamodel.impl.RefinestraceabilitymetamodelPackageImpl#getTraceLinks()
		 * @generated
		 */
		EClass TRACE_LINKS = eINSTANCE.getTraceLinks();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_LINKS__ITEM = eINSTANCE.getTraceLinks_Item();

		/**
		 * The meta object literal for the '{@link org.eclipse.capra.refinestraceabilitymetamodel.impl.RefinesImpl <em>Refines</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.capra.refinestraceabilitymetamodel.impl.RefinesImpl
		 * @see org.eclipse.capra.refinestraceabilitymetamodel.impl.RefinestraceabilitymetamodelPackageImpl#getRefines()
		 * @generated
		 */
		EClass REFINES = eINSTANCE.getRefines();

	}

} //RefinestraceabilitymetamodelPackage
