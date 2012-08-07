/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.plcopen.xml.tc60201.impl;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.plcopen.xml.tc60201.AddData;
import org.plcopen.xml.tc60201.ConnectionPointIn;
import org.plcopen.xml.tc60201.ConnectionPointOutType2;
import org.plcopen.xml.tc60201.FormattedText;
import org.plcopen.xml.tc60201.Position;
import org.plcopen.xml.tc60201.SimultaneousDivergenceType;
import org.plcopen.xml.tc60201.Tc60201Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simultaneous Divergence Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.plcopen.xml.tc60201.impl.SimultaneousDivergenceTypeImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.SimultaneousDivergenceTypeImpl#getConnectionPointIn <em>Connection Point In</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.SimultaneousDivergenceTypeImpl#getConnectionPointOut <em>Connection Point Out</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.SimultaneousDivergenceTypeImpl#getAddData <em>Add Data</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.SimultaneousDivergenceTypeImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.SimultaneousDivergenceTypeImpl#getGlobalId <em>Global Id</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.SimultaneousDivergenceTypeImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.SimultaneousDivergenceTypeImpl#getLocalId <em>Local Id</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.SimultaneousDivergenceTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.SimultaneousDivergenceTypeImpl#getWidth <em>Width</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimultaneousDivergenceTypeImpl extends EObjectImpl implements SimultaneousDivergenceType {
	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected Position position;

	/**
	 * The cached value of the '{@link #getConnectionPointIn() <em>Connection Point In</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionPointIn()
	 * @generated
	 * @ordered
	 */
	protected ConnectionPointIn connectionPointIn;

	/**
	 * The cached value of the '{@link #getConnectionPointOut() <em>Connection Point Out</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionPointOut()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectionPointOutType2> connectionPointOut;

	/**
	 * The cached value of the '{@link #getAddData() <em>Add Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddData()
	 * @generated
	 * @ordered
	 */
	protected AddData addData;

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
	 * The default value of the '{@link #getGlobalId() <em>Global Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalId()
	 * @generated
	 * @ordered
	 */
	protected static final String GLOBAL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGlobalId() <em>Global Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalId()
	 * @generated
	 * @ordered
	 */
	protected String globalId = GLOBAL_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocalId() <em>Local Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalId()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger LOCAL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocalId() <em>Local Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalId()
	 * @generated
	 * @ordered
	 */
	protected BigInteger localId = LOCAL_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal width = WIDTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimultaneousDivergenceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tc60201Package.eINSTANCE.getSimultaneousDivergenceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPosition(Position newPosition, NotificationChain msgs) {
		Position oldPosition = position;
		position = newPosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE__POSITION, oldPosition, newPosition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(Position newPosition) {
		if (newPosition != position) {
			NotificationChain msgs = null;
			if (position != null)
				msgs = ((InternalEObject)position).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE__POSITION, null, msgs);
			if (newPosition != null)
				msgs = ((InternalEObject)newPosition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE__POSITION, null, msgs);
			msgs = basicSetPosition(newPosition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE__POSITION, newPosition, newPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionPointIn getConnectionPointIn() {
		return connectionPointIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectionPointIn(ConnectionPointIn newConnectionPointIn, NotificationChain msgs) {
		ConnectionPointIn oldConnectionPointIn = connectionPointIn;
		connectionPointIn = newConnectionPointIn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE__CONNECTION_POINT_IN, oldConnectionPointIn, newConnectionPointIn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionPointIn(ConnectionPointIn newConnectionPointIn) {
		if (newConnectionPointIn != connectionPointIn) {
			NotificationChain msgs = null;
			if (connectionPointIn != null)
				msgs = ((InternalEObject)connectionPointIn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE__CONNECTION_POINT_IN, null, msgs);
			if (newConnectionPointIn != null)
				msgs = ((InternalEObject)newConnectionPointIn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE__CONNECTION_POINT_IN, null, msgs);
			msgs = basicSetConnectionPointIn(newConnectionPointIn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE__CONNECTION_POINT_IN, newConnectionPointIn, newConnectionPointIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectionPointOutType2> getConnectionPointOut() {
		if (connectionPointOut == null) {
			connectionPointOut = new EObjectContainmentEList<ConnectionPointOutType2>(ConnectionPointOutType2.class, this, Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE__CONNECTION_POINT_OUT);
		}
		return connectionPointOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddData getAddData() {
		return addData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddData(AddData newAddData, NotificationChain msgs) {
		AddData oldAddData = addData;
		addData = newAddData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE__ADD_DATA, oldAddData, newAddData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddData(AddData newAddData) {
		if (newAddData != addData) {
			NotificationChain msgs = null;
			if (addData != null)
				msgs = ((InternalEObject)addData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE__ADD_DATA, null, msgs);
			if (newAddData != null)
				msgs = ((InternalEObject)newAddData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE__ADD_DATA, null, msgs);
			msgs = basicSetAddData(newAddData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE__ADD_DATA, newAddData, newAddData));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE__DOCUMENTATION, oldDocumentation, newDocumentation);
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
				msgs = ((InternalEObject)documentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE__DOCUMENTATION, null, msgs);
			if (newDocumentation != null)
				msgs = ((InternalEObject)newDocumentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE__DOCUMENTATION, null, msgs);
			msgs = basicSetDocumentation(newDocumentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE__DOCUMENTATION, newDocumentation, newDocumentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGlobalId() {
		return globalId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalId(String newGlobalId) {
		String oldGlobalId = globalId;
		globalId = newGlobalId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE__GLOBAL_ID, oldGlobalId, globalId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(BigDecimal newHeight) {
		BigDecimal oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getLocalId() {
		return localId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalId(BigInteger newLocalId) {
		BigInteger oldLocalId = localId;
		localId = newLocalId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE__LOCAL_ID, oldLocalId, localId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(BigDecimal newWidth) {
		BigDecimal oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE__POSITION:
				return basicSetPosition(null, msgs);
			case Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE__CONNECTION_POINT_IN:
				return basicSetConnectionPointIn(null, msgs);
			case Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE__CONNECTION_POINT_OUT:
				return ((InternalEList<?>)getConnectionPointOut()).basicRemove(otherEnd, msgs);
			case Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE__ADD_DATA:
				return basicSetAddData(null, msgs);
			case Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE__DOCUMENTATION:
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
			case Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE__POSITION:
				return getPosition();
			case Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE__CONNECTION_POINT_IN:
				return getConnectionPointIn();
			case Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE__CONNECTION_POINT_OUT:
				return getConnectionPointOut();
			case Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE__ADD_DATA:
				return getAddData();
			case Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE__DOCUMENTATION:
				return getDocumentation();
			case Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE__GLOBAL_ID:
				return getGlobalId();
			case Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE__HEIGHT:
				return getHeight();
			case Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE__LOCAL_ID:
				return getLocalId();
			case Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE__NAME:
				return getName();
			case Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE__WIDTH:
				return getWidth();
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
			case Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE__POSITION:
				setPosition((Position)newValue);
				return;
			case Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE__CONNECTION_POINT_IN:
				setConnectionPointIn((ConnectionPointIn)newValue);
				return;
			case Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE__CONNECTION_POINT_OUT:
				getConnectionPointOut().clear();
				getConnectionPointOut().addAll((Collection<? extends ConnectionPointOutType2>)newValue);
				return;
			case Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE__ADD_DATA:
				setAddData((AddData)newValue);
				return;
			case Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE__DOCUMENTATION:
				setDocumentation((FormattedText)newValue);
				return;
			case Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE__GLOBAL_ID:
				setGlobalId((String)newValue);
				return;
			case Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE__HEIGHT:
				setHeight((BigDecimal)newValue);
				return;
			case Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE__LOCAL_ID:
				setLocalId((BigInteger)newValue);
				return;
			case Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE__NAME:
				setName((String)newValue);
				return;
			case Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE__WIDTH:
				setWidth((BigDecimal)newValue);
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
			case Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE__POSITION:
				setPosition((Position)null);
				return;
			case Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE__CONNECTION_POINT_IN:
				setConnectionPointIn((ConnectionPointIn)null);
				return;
			case Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE__CONNECTION_POINT_OUT:
				getConnectionPointOut().clear();
				return;
			case Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE__ADD_DATA:
				setAddData((AddData)null);
				return;
			case Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE__DOCUMENTATION:
				setDocumentation((FormattedText)null);
				return;
			case Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE__GLOBAL_ID:
				setGlobalId(GLOBAL_ID_EDEFAULT);
				return;
			case Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE__LOCAL_ID:
				setLocalId(LOCAL_ID_EDEFAULT);
				return;
			case Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
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
			case Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE__POSITION:
				return position != null;
			case Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE__CONNECTION_POINT_IN:
				return connectionPointIn != null;
			case Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE__CONNECTION_POINT_OUT:
				return connectionPointOut != null && !connectionPointOut.isEmpty();
			case Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE__ADD_DATA:
				return addData != null;
			case Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE__DOCUMENTATION:
				return documentation != null;
			case Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE__GLOBAL_ID:
				return GLOBAL_ID_EDEFAULT == null ? globalId != null : !GLOBAL_ID_EDEFAULT.equals(globalId);
			case Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE__HEIGHT:
				return HEIGHT_EDEFAULT == null ? height != null : !HEIGHT_EDEFAULT.equals(height);
			case Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE__LOCAL_ID:
				return LOCAL_ID_EDEFAULT == null ? localId != null : !LOCAL_ID_EDEFAULT.equals(localId);
			case Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE__WIDTH:
				return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
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
		result.append(" (globalId: ");
		result.append(globalId);
		result.append(", height: ");
		result.append(height);
		result.append(", localId: ");
		result.append(localId);
		result.append(", name: ");
		result.append(name);
		result.append(", width: ");
		result.append(width);
		result.append(')');
		return result.toString();
	}

} //SimultaneousDivergenceTypeImpl
