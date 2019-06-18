/**
 */
package bento.sirius.tests.metamodels.workflow.impl;

import bento.sirius.tests.metamodels.workflow.FlowDiagram;
import bento.sirius.tests.metamodels.workflow.FlowEdge;
import bento.sirius.tests.metamodels.workflow.Node;
import bento.sirius.tests.metamodels.workflow.WorkflowPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bento.sirius.tests.metamodels.workflow.impl.FlowDiagramImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link bento.sirius.tests.metamodels.workflow.impl.FlowDiagramImpl#getEdges <em>Edges</em>}</li>
 *   <li>{@link bento.sirius.tests.metamodels.workflow.impl.FlowDiagramImpl#isIsFinalMandatory <em>Is Final Mandatory</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlowDiagramImpl extends MinimalEObjectImpl.Container implements FlowDiagram {
	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> nodes;

	/**
	 * The cached value of the '{@link #getEdges() <em>Edges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<FlowEdge> edges;

	/**
	 * The default value of the '{@link #isIsFinalMandatory() <em>Is Final Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFinalMandatory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FINAL_MANDATORY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsFinalMandatory() <em>Is Final Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFinalMandatory()
	 * @generated
	 * @ordered
	 */
	protected boolean isFinalMandatory = IS_FINAL_MANDATORY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.FLOW_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Node> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentEList<Node>(Node.class, this, WorkflowPackage.FLOW_DIAGRAM__NODES);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FlowEdge> getEdges() {
		if (edges == null) {
			edges = new EObjectContainmentEList<FlowEdge>(FlowEdge.class, this, WorkflowPackage.FLOW_DIAGRAM__EDGES);
		}
		return edges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsFinalMandatory() {
		return isFinalMandatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsFinalMandatory(boolean newIsFinalMandatory) {
		boolean oldIsFinalMandatory = isFinalMandatory;
		isFinalMandatory = newIsFinalMandatory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.FLOW_DIAGRAM__IS_FINAL_MANDATORY, oldIsFinalMandatory, isFinalMandatory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WorkflowPackage.FLOW_DIAGRAM__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
			case WorkflowPackage.FLOW_DIAGRAM__EDGES:
				return ((InternalEList<?>)getEdges()).basicRemove(otherEnd, msgs);
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
			case WorkflowPackage.FLOW_DIAGRAM__NODES:
				return getNodes();
			case WorkflowPackage.FLOW_DIAGRAM__EDGES:
				return getEdges();
			case WorkflowPackage.FLOW_DIAGRAM__IS_FINAL_MANDATORY:
				return isIsFinalMandatory();
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
			case WorkflowPackage.FLOW_DIAGRAM__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends Node>)newValue);
				return;
			case WorkflowPackage.FLOW_DIAGRAM__EDGES:
				getEdges().clear();
				getEdges().addAll((Collection<? extends FlowEdge>)newValue);
				return;
			case WorkflowPackage.FLOW_DIAGRAM__IS_FINAL_MANDATORY:
				setIsFinalMandatory((Boolean)newValue);
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
			case WorkflowPackage.FLOW_DIAGRAM__NODES:
				getNodes().clear();
				return;
			case WorkflowPackage.FLOW_DIAGRAM__EDGES:
				getEdges().clear();
				return;
			case WorkflowPackage.FLOW_DIAGRAM__IS_FINAL_MANDATORY:
				setIsFinalMandatory(IS_FINAL_MANDATORY_EDEFAULT);
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
			case WorkflowPackage.FLOW_DIAGRAM__NODES:
				return nodes != null && !nodes.isEmpty();
			case WorkflowPackage.FLOW_DIAGRAM__EDGES:
				return edges != null && !edges.isEmpty();
			case WorkflowPackage.FLOW_DIAGRAM__IS_FINAL_MANDATORY:
				return isFinalMandatory != IS_FINAL_MANDATORY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (isFinalMandatory: ");
		result.append(isFinalMandatory);
		result.append(')');
		return result.toString();
	}

} //FlowDiagramImpl
