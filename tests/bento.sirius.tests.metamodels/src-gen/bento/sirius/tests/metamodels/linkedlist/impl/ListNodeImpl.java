/**
 */
package bento.sirius.tests.metamodels.linkedlist.impl;

import bento.sirius.tests.metamodels.linkedlist.LinkedlistPackage;
import bento.sirius.tests.metamodels.linkedlist.ListNode;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bento.sirius.tests.metamodels.linkedlist.impl.ListNodeImpl#getNodeValue <em>Node Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListNodeImpl extends AbstractListNodeImpl implements ListNode {
	/**
	 * The default value of the '{@link #getNodeValue() <em>Node Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeValue()
	 * @generated
	 * @ordered
	 */
	protected static final String NODE_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNodeValue() <em>Node Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeValue()
	 * @generated
	 * @ordered
	 */
	protected String nodeValue = NODE_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LinkedlistPackage.Literals.LIST_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNodeValue() {
		return nodeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNodeValue(String newNodeValue) {
		String oldNodeValue = nodeValue;
		nodeValue = newNodeValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinkedlistPackage.LIST_NODE__NODE_VALUE, oldNodeValue, nodeValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LinkedlistPackage.LIST_NODE__NODE_VALUE:
				return getNodeValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LinkedlistPackage.LIST_NODE__NODE_VALUE:
				setNodeValue((String)newValue);
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
			case LinkedlistPackage.LIST_NODE__NODE_VALUE:
				setNodeValue(NODE_VALUE_EDEFAULT);
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
			case LinkedlistPackage.LIST_NODE__NODE_VALUE:
				return NODE_VALUE_EDEFAULT == null ? nodeValue != null : !NODE_VALUE_EDEFAULT.equals(nodeValue);
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
		result.append(" (nodeValue: ");
		result.append(nodeValue);
		result.append(')');
		return result.toString();
	}

} //ListNodeImpl
