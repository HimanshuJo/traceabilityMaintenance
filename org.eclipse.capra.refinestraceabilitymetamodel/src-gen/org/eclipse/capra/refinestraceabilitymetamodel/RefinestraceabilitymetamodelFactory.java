/**
 */
package org.eclipse.capra.refinestraceabilitymetamodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.capra.refinestraceabilitymetamodel.RefinestraceabilitymetamodelPackage
 * @generated
 */
public interface RefinestraceabilitymetamodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RefinestraceabilitymetamodelFactory eINSTANCE = org.eclipse.capra.refinestraceabilitymetamodel.impl.RefinestraceabilitymetamodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Refines Trace Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Refines Trace Model</em>'.
	 * @generated
	 */
	RefinesTraceModel createRefinesTraceModel();

	/**
	 * Returns a new object of class '<em>Refines</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Refines</em>'.
	 * @generated
	 */
	Refines createRefines();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RefinestraceabilitymetamodelPackage getRefinestraceabilitymetamodelPackage();

} //RefinestraceabilitymetamodelFactory
