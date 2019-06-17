/**
 */
package bento.sirius.tests.metamodels.workflow.impl;

import bento.sirius.tests.metamodels.workflow.FlowEdge;
import bento.sirius.tests.metamodels.workflow.Node;
import bento.sirius.tests.metamodels.workflow.WorkflowPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bento.sirius.tests.metamodels.workflow.impl.NodeImpl#getOuts <em>Outs</em>}</li>
 *   <li>{@link bento.sirius.tests.metamodels.workflow.impl.NodeImpl#getIns <em>Ins</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class NodeImpl extends MinimalEObjectImpl.Container implements Node {
	/**
	 * The cached value of the '{@link #getOuts() <em>Outs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuts()
	 * @generated
	 * @ordered
	 */
	protected EList<FlowEdge> outs;

	/**
	 * The cached value of the '{@link #getIns() <em>Ins</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIns()
	 * @generated
	 * @ordered
	 */
	protected EList<FlowEdge> ins;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FlowEdge> getOuts() {
		if (outs == null) {
			outs = new EObjectWithInverseResolvingEList<FlowEdge>(FlowEdge.class, this, WorkflowPackage.NODE__OUTS, WorkflowPackage.FLOW_EDGE__IN);
		}
		return outs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FlowEdge> getIns() {
		if (ins == null) {
			ins = new EObjectWithInverseResolvingEList<FlowEdge>(FlowEdge.class, this, WorkflowPackage.NODE__INS, WorkflowPackage.FLOW_EDGE__OUT);
		}
		return ins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WorkflowPackage.NODE__OUTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOuts()).basicAdd(otherEnd, msgs);
			case WorkflowPackage.NODE__INS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIns()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WorkflowPackage.NODE__OUTS:
				return ((InternalEList<?>)getOuts()).basicRemove(otherEnd, msgs);
			case WorkflowPackage.NODE__INS:
				return ((InternalEList<?>)getIns()).basicRemove(otherEnd, msgs);
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
			case WorkflowPackage.NODE__OUTS:
				return getOuts();
			case WorkflowPackage.NODE__INS:
				return getIns();
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
			case WorkflowPackage.NODE__OUTS:
				getOuts().clear();
				getOuts().addAll((Collection<? extends FlowEdge>)newValue);
				return;
			case WorkflowPackage.NODE__INS:
				getIns().clear();
				getIns().addAll((Collection<? extends FlowEdge>)newValue);
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
			case WorkflowPackage.NODE__OUTS:
				getOuts().clear();
				return;
			case WorkflowPackage.NODE__INS:
				getIns().clear();
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
			case WorkflowPackage.NODE__OUTS:
				return outs != null && !outs.isEmpty();
			case WorkflowPackage.NODE__INS:
				return ins != null && !ins.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NodeImpl
