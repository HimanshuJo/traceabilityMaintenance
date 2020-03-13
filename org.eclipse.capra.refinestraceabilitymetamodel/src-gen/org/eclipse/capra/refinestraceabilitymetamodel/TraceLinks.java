/**
 */
package org.eclipse.capra.refinestraceabilitymetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace Links</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.capra.refinestraceabilitymetamodel.TraceLinks#getItem <em>Item</em>}</li>
 * </ul>
 *
 * @see org.eclipse.capra.refinestraceabilitymetamodel.RefinestraceabilitymetamodelPackage#getTraceLinks()
 * @model abstract="true"
 * @generated
 */
public interface TraceLinks extends EObject {
	/**
	 * Returns the value of the '<em><b>Item</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' reference list.
	 * @see org.eclipse.capra.refinestraceabilitymetamodel.RefinestraceabilitymetamodelPackage#getTraceLinks_Item()
	 * @model
	 * @generated
	 */
	EList<EObject> getItem();

} // TraceLinks
