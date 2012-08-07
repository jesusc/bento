/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.plcopen.xml.tc60201.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.plcopen.xml.tc60201.ConnectionPointOut;
import org.plcopen.xml.tc60201.EdgeModifierType;
import org.plcopen.xml.tc60201.FormattedText;
import org.plcopen.xml.tc60201.StorageModifierType;
import org.plcopen.xml.tc60201.Tc60201Package;
import org.plcopen.xml.tc60201.VariableType1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.plcopen.xml.tc60201.impl.VariableType1Impl#getConnectionPointOut <em>Connection Point Out</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.VariableType1Impl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.VariableType1Impl#getEdge <em>Edge</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.VariableType1Impl#getFormalParameter <em>Formal Parameter</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.VariableType1Impl#isHidden <em>Hidden</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.VariableType1Impl#isNegated <em>Negated</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.VariableType1Impl#getStorage <em>Storage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableType1Impl extends EObjectImpl implements VariableType1 {
	/**
	 * The cached value of the '{@link #getConnectionPointOut() <em>Connection Point Out</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionPointOut()
	 * @generated
	 * @ordered
	 */
	protected ConnectionPointOut connectionPointOut;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected FormattedText documentation;

	/**
	 * The default value of the '{@link #getEdge() <em>Edge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdge()
	 * @generated
	 * @ordered
	 */
	protected static final EdgeModifierType EDGE_EDEFAULT = EdgeModifierType.NONE;

	/**
	 * The cached value of the '{@link #getEdge() <em>Edge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdge()
	 * @generated
	 * @ordered
	 */
	protected EdgeModifierType edge = EDGE_EDEFAULT;

	/**
	 * This is true if the Edge attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean edgeESet;

	/**
	 * The default value of the '{@link #getFormalParameter() <em>Formal Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormalParameter()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMAL_PARAMETER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormalParameter() <em>Formal Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormalParameter()
	 * @generated
	 * @ordered
	 */
	protected String formalParameter = FORMAL_PARAMETER_EDEFAULT;

	/**
	 * The default value of the '{@link #isHidden() <em>Hidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHidden()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HIDDEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHidden() <em>Hidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHidden()
	 * @generated
	 * @ordered
	 */
	protected boolean hidden = HIDDEN_EDEFAULT;

	/**
	 * This is true if the Hidden attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hiddenESet;

	/**
	 * The default value of the '{@link #isNegated() <em>Negated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNegated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEGATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNegated() <em>Negated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNegated()
	 * @generated
	 * @ordered
	 */
	protected boolean negated = NEGATED_EDEFAULT;

	/**
	 * This is true if the Negated attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean negatedESet;

	/**
	 * The default value of the '{@link #getStorage() <em>Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorage()
	 * @generated
	 * @ordered
	 */
	protected static final StorageModifierType STORAGE_EDEFAULT = StorageModifierType.NONE;

	/**
	 * The cached value of the '{@link #getStorage() <em>Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorage()
	 * @generated
	 * @ordered
	 */
	protected StorageModifierType storage = STORAGE_EDEFAULT;

	/**
	 * This is true if the Storage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean storageESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tc60201Package.eINSTANCE.getVariableType1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionPointOut getConnectionPointOut() {
		return connectionPointOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectionPointOut(ConnectionPointOut newConnectionPointOut, NotificationChain msgs) {
		ConnectionPointOut oldConnectionPointOut = connectionPointOut;
		connectionPointOut = newConnectionPointOut;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.VARIABLE_TYPE1__CONNECTION_POINT_OUT, oldConnectionPointOut, newConnectionPointOut);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionPointOut(ConnectionPointOut newConnectionPointOut) {
		if (newConnectionPointOut != connectionPointOut) {
			NotificationChain msgs = null;
			if (connectionPointOut != null)
				msgs = ((InternalEObject)connectionPointOut).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.VARIABLE_TYPE1__CONNECTION_POINT_OUT, null, msgs);
			if (newConnectionPointOut != null)
				msgs = ((InternalEObject)newConnectionPointOut).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.VARIABLE_TYPE1__CONNECTION_POINT_OUT, null, msgs);
			msgs = basicSetConnectionPointOut(newConnectionPointOut, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.VARIABLE_TYPE1__CONNECTION_POINT_OUT, newConnectionPointOut, newConnectionPointOut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormattedText getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentation(FormattedText newDocumentation, NotificationChain msgs) {
		FormattedText oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.VARIABLE_TYPE1__DOCUMENTATION, oldDocumentation, newDocumentation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentation(FormattedText newDocumentation) {
		if (newDocumentation != documentation) {
			NotificationChain msgs = null;
			if (documentation != null)
				msgs = ((InternalEObject)documentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.VARIABLE_TYPE1__DOCUMENTATION, null, msgs);
			if (newDocumentation != null)
				msgs = ((InternalEObject)newDocumentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.VARIABLE_TYPE1__DOCUMENTATION, null, msgs);
			msgs = basicSetDocumentation(newDocumentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.VARIABLE_TYPE1__DOCUMENTATION, newDocumentation, newDocumentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeModifierType getEdge() {
		return edge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdge(EdgeModifierType newEdge) {
		EdgeModifierType oldEdge = edge;
		edge = newEdge == null ? EDGE_EDEFAULT : newEdge;
		boolean oldEdgeESet = edgeESet;
		edgeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.VARIABLE_TYPE1__EDGE, oldEdge, edge, !oldEdgeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEdge() {
		EdgeModifierType oldEdge = edge;
		boolean oldEdgeESet = edgeESet;
		edge = EDGE_EDEFAULT;
		edgeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Tc60201Package.VARIABLE_TYPE1__EDGE, oldEdge, EDGE_EDEFAULT, oldEdgeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEdge() {
		return edgeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormalParameter() {
		return formalParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormalParameter(String newFormalParameter) {
		String oldFormalParameter = formalParameter;
		formalParameter = newFormalParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.VARIABLE_TYPE1__FORMAL_PARAMETER, oldFormalParameter, formalParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHidden() {
		return hidden;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHidden(boolean newHidden) {
		boolean oldHidden = hidden;
		hidden = newHidden;
		boolean oldHiddenESet = hiddenESet;
		hiddenESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.VARIABLE_TYPE1__HIDDEN, oldHidden, hidden, !oldHiddenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHidden() {
		boolean oldHidden = hidden;
		boolean oldHiddenESet = hiddenESet;
		hidden = HIDDEN_EDEFAULT;
		hiddenESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Tc60201Package.VARIABLE_TYPE1__HIDDEN, oldHidden, HIDDEN_EDEFAULT, oldHiddenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHidden() {
		return hiddenESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNegated() {
		return negated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNegated(boolean newNegated) {
		boolean oldNegated = negated;
		negated = newNegated;
		boolean oldNegatedESet = negatedESet;
		negatedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.VARIABLE_TYPE1__NEGATED, oldNegated, negated, !oldNegatedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNegated() {
		boolean oldNegated = negated;
		boolean oldNegatedESet = negatedESet;
		negated = NEGATED_EDEFAULT;
		negatedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Tc60201Package.VARIABLE_TYPE1__NEGATED, oldNegated, NEGATED_EDEFAULT, oldNegatedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNegated() {
		return negatedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorageModifierType getStorage() {
		return storage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStorage(StorageModifierType newStorage) {
		StorageModifierType oldStorage = storage;
		storage = newStorage == null ? STORAGE_EDEFAULT : newStorage;
		boolean oldStorageESet = storageESet;
		storageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.VARIABLE_TYPE1__STORAGE, oldStorage, storage, !oldStorageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStorage() {
		StorageModifierType oldStorage = storage;
		boolean oldStorageESet = storageESet;
		storage = STORAGE_EDEFAULT;
		storageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Tc60201Package.VARIABLE_TYPE1__STORAGE, oldStorage, STORAGE_EDEFAULT, oldStorageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStorage() {
		return storageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Tc60201Package.VARIABLE_TYPE1__CONNECTION_POINT_OUT:
				return basicSetConnectionPointOut(null, msgs);
			case Tc60201Package.VARIABLE_TYPE1__DOCUMENTATION:
				return basicSetDocumentation(null, msgs);
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
			case Tc60201Package.VARIABLE_TYPE1__CONNECTION_POINT_OUT:
				return getConnectionPointOut();
			case Tc60201Package.VARIABLE_TYPE1__DOCUMENTATION:
				return getDocumentation();
			case Tc60201Package.VARIABLE_TYPE1__EDGE:
				return getEdge();
			case Tc60201Package.VARIABLE_TYPE1__FORMAL_PARAMETER:
				return getFormalParameter();
			case Tc60201Package.VARIABLE_TYPE1__HIDDEN:
				return isHidden();
			case Tc60201Package.VARIABLE_TYPE1__NEGATED:
				return isNegated();
			case Tc60201Package.VARIABLE_TYPE1__STORAGE:
				return getStorage();
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
			case Tc60201Package.VARIABLE_TYPE1__CONNECTION_POINT_OUT:
				setConnectionPointOut((ConnectionPointOut)newValue);
				return;
			case Tc60201Package.VARIABLE_TYPE1__DOCUMENTATION:
				setDocumentation((FormattedText)newValue);
				return;
			case Tc60201Package.VARIABLE_TYPE1__EDGE:
				setEdge((EdgeModifierType)newValue);
				return;
			case Tc60201Package.VARIABLE_TYPE1__FORMAL_PARAMETER:
				setFormalParameter((String)newValue);
				return;
			case Tc60201Package.VARIABLE_TYPE1__HIDDEN:
				setHidden((Boolean)newValue);
				return;
			case Tc60201Package.VARIABLE_TYPE1__NEGATED:
				setNegated((Boolean)newValue);
				return;
			case Tc60201Package.VARIABLE_TYPE1__STORAGE:
				setStorage((StorageModifierType)newValue);
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
			case Tc60201Package.VARIABLE_TYPE1__CONNECTION_POINT_OUT:
				setConnectionPointOut((ConnectionPointOut)null);
				return;
			case Tc60201Package.VARIABLE_TYPE1__DOCUMENTATION:
				setDocumentation((FormattedText)null);
				return;
			case Tc60201Package.VARIABLE_TYPE1__EDGE:
				unsetEdge();
				return;
			case Tc60201Package.VARIABLE_TYPE1__FORMAL_PARAMETER:
				setFormalParameter(FORMAL_PARAMETER_EDEFAULT);
				return;
			case Tc60201Package.VARIABLE_TYPE1__HIDDEN:
				unsetHidden();
				return;
			case Tc60201Package.VARIABLE_TYPE1__NEGATED:
				unsetNegated();
				return;
			case Tc60201Package.VARIABLE_TYPE1__STORAGE:
				unsetStorage();
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
			case Tc60201Package.VARIABLE_TYPE1__CONNECTION_POINT_OUT:
				return connectionPointOut != null;
			case Tc60201Package.VARIABLE_TYPE1__DOCUMENTATION:
				return documentation != null;
			case Tc60201Package.VARIABLE_TYPE1__EDGE:
				return isSetEdge();
			case Tc60201Package.VARIABLE_TYPE1__FORMAL_PARAMETER:
				return FORMAL_PARAMETER_EDEFAULT == null ? formalParameter != null : !FORMAL_PARAMETER_EDEFAULT.equals(formalParameter);
			case Tc60201Package.VARIABLE_TYPE1__HIDDEN:
				return isSetHidden();
			case Tc60201Package.VARIABLE_TYPE1__NEGATED:
				return isSetNegated();
			case Tc60201Package.VARIABLE_TYPE1__STORAGE:
				return isSetStorage();
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (edge: ");
		if (edgeESet) result.append(edge); else result.append("<unset>");
		result.append(", formalParameter: ");
		result.append(formalParameter);
		result.append(", hidden: ");
		if (hiddenESet) result.append(hidden); else result.append("<unset>");
		result.append(", negated: ");
		if (negatedESet) result.append(negated); else result.append("<unset>");
		result.append(", storage: ");
		if (storageESet) result.append(storage); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //VariableType1Impl
