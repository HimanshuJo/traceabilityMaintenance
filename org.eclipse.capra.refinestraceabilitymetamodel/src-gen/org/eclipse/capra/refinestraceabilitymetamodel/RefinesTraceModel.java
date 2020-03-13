/**
 */
package org.eclipse.capra.refinestraceabilitymetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Refines Trace Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.capra.refinestraceabilitymetamodel.RefinesTraceModel#getItem <em>Item</em>}</li>
 * </ul>
 *
 * @see org.eclipse.capra.refinestraceabilitymetamodel.RefinestraceabilitymetamodelPackage#getRefinesTraceModel()
 * @model
 * @generated
 */
public interface RefinesTraceModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.capra.refinestraceabilitymetamodel.TraceLinks}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' containment reference list.
	 * @see org.eclipse.capra.refinestraceabilitymetamodel.RefinestraceabilitymetamodelPackage#getRefinesTraceModel_Item()
	 * @model containment="true"
	 * @generated
	 */
	EList<TraceLinks> getItem();

} // RefinesTraceModel
