/**
 */
package org.eclipse.capra.refinestraceabilitymetamodel.impl;

import java.util.Collection;

import org.eclipse.capra.refinestraceabilitymetamodel.RefinestraceabilitymetamodelPackage;
import org.eclipse.capra.refinestraceabilitymetamodel.TraceLinks;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trace Links</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.capra.refinestraceabilitymetamodel.impl.TraceLinksImpl#getItem <em>Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TraceLinksImpl extends MinimalEObjectImpl.Container implements TraceLinks {
	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> item;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraceLinksImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RefinestraceabilitymetamodelPackage.Literals.TRACE_LINKS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EObject> getItem() {
		if (item == null) {
			item = new EObjectResolvingEList<EObject>(EObject.class, this, RefinestraceabilitymetamodelPackage.TRACE_LINKS__ITEM);
		}
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RefinestraceabilitymetamodelPackage.TRACE_LINKS__ITEM:
				return getItem();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RefinestraceabilitymetamodelPackage.TRACE_LINKS__ITEM:
				getItem().clear();
				getItem().addAll((Collection<? extends EObject>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RefinestraceabilitymetamodelPackage.TRACE_LINKS__ITEM:
				getItem().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RefinestraceabilitymetamodelPackage.TRACE_LINKS__ITEM:
				return item != null && !item.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TraceLinksImpl
