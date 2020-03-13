/**
 */
package org.eclipse.capra.refinestraceabilitymetamodel.impl;

import java.util.Collection;

import org.eclipse.capra.refinestraceabilitymetamodel.RefinesTraceModel;
import org.eclipse.capra.refinestraceabilitymetamodel.RefinestraceabilitymetamodelPackage;
import org.eclipse.capra.refinestraceabilitymetamodel.TraceLinks;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Refines Trace Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.capra.refinestraceabilitymetamodel.impl.RefinesTraceModelImpl#getItem <em>Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RefinesTraceModelImpl extends MinimalEObjectImpl.Container implements RefinesTraceModel {
	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected EList<TraceLinks> item;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RefinesTraceModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RefinestraceabilitymetamodelPackage.Literals.REFINES_TRACE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TraceLinks> getItem() {
		if (item == null) {
			item = new EObjectContainmentEList<TraceLinks>(TraceLinks.class, this, RefinestraceabilitymetamodelPackage.REFINES_TRACE_MODEL__ITEM);
		}
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RefinestraceabilitymetamodelPackage.REFINES_TRACE_MODEL__ITEM:
				return ((InternalEList<?>)getItem()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RefinestraceabilitymetamodelPackage.REFINES_TRACE_MODEL__ITEM:
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
			case RefinestraceabilitymetamodelPackage.REFINES_TRACE_MODEL__ITEM:
				getItem().clear();
				getItem().addAll((Collection<? extends TraceLinks>)newValue);
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
			case RefinestraceabilitymetamodelPackage.REFINES_TRACE_MODEL__ITEM:
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
			case RefinestraceabilitymetamodelPackage.REFINES_TRACE_MODEL__ITEM:
				return item != null && !item.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RefinesTraceModelImpl
