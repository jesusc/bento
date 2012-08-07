/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.plcopen.xml.tc60201.impl;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.plcopen.xml.tc60201.AddData;
import org.plcopen.xml.tc60201.ConnectionPointIn;
import org.plcopen.xml.tc60201.ConnectionPointOut;
import org.plcopen.xml.tc60201.EdgeModifierType;
import org.plcopen.xml.tc60201.FormattedText;
import org.plcopen.xml.tc60201.InOutVariableType;
import org.plcopen.xml.tc60201.Position;
import org.plcopen.xml.tc60201.StorageModifierType;
import org.plcopen.xml.tc60201.Tc60201Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>In Out Variable Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.plcopen.xml.tc60201.impl.InOutVariableTypeImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.InOutVariableTypeImpl#getConnectionPointIn <em>Connection Point In</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.InOutVariableTypeImpl#getConnectionPointOut <em>Connection Point Out</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.InOutVariableTypeImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.InOutVariableTypeImpl#getAddData <em>Add Data</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.InOutVariableTypeImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.InOutVariableTypeImpl#getEdgeIn <em>Edge In</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.InOutVariableTypeImpl#getEdgeOut <em>Edge Out</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.InOutVariableTypeImpl#getExecutionOrderId <em>Execution Order Id</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.InOutVariableTypeImpl#getGlobalId <em>Global Id</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.InOutVariableTypeImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.InOutVariableTypeImpl#getLocalId <em>Local Id</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.InOutVariableTypeImpl#isNegatedIn <em>Negated In</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.InOutVariableTypeImpl#isNegatedOut <em>Negated Out</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.InOutVariableTypeImpl#getStorageIn <em>Storage In</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.InOutVariableTypeImpl#getStorageOut <em>Storage Out</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.InOutVariableTypeImpl#getWidth <em>Width</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InOutVariableTypeImpl extends EObjectImpl implements InOutVariableType {
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
	 * The cached value of the '{@link #getConnectionPointOut() <em>Connection Point Out</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionPointOut()
	 * @generated
	 * @ordered
	 */
	protected ConnectionPointOut connectionPointOut;

	/**
	 * The default value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected String expression = EXPRESSION_EDEFAULT;

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
	 * The default value of the '{@link #getEdgeIn() <em>Edge In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdgeIn()
	 * @generated
	 * @ordered
	 */
	protected static final EdgeModifierType EDGE_IN_EDEFAULT = EdgeModifierType.NONE;

	/**
	 * The cached value of the '{@link #getEdgeIn() <em>Edge In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdgeIn()
	 * @generated
	 * @ordered
	 */
	protected EdgeModifierType edgeIn = EDGE_IN_EDEFAULT;

	/**
	 * This is true if the Edge In attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean edgeInESet;

	/**
	 * The default value of the '{@link #getEdgeOut() <em>Edge Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdgeOut()
	 * @generated
	 * @ordered
	 */
	protected static final EdgeModifierType EDGE_OUT_EDEFAULT = EdgeModifierType.NONE;

	/**
	 * The cached value of the '{@link #getEdgeOut() <em>Edge Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdgeOut()
	 * @generated
	 * @ordered
	 */
	protected EdgeModifierType edgeOut = EDGE_OUT_EDEFAULT;

	/**
	 * This is true if the Edge Out attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean edgeOutESet;

	/**
	 * The default value of the '{@link #getExecutionOrderId() <em>Execution Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionOrderId()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger EXECUTION_ORDER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExecutionOrderId() <em>Execution Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionOrderId()
	 * @generated
	 * @ordered
	 */
	protected BigInteger executionOrderId = EXECUTION_ORDER_ID_EDEFAULT;

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
	 * The default value of the '{@link #isNegatedIn() <em>Negated In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNegatedIn()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEGATED_IN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNegatedIn() <em>Negated In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNegatedIn()
	 * @generated
	 * @ordered
	 */
	protected boolean negatedIn = NEGATED_IN_EDEFAULT;

	/**
	 * This is true if the Negated In attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean negatedInESet;

	/**
	 * The default value of the '{@link #isNegatedOut() <em>Negated Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNegatedOut()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEGATED_OUT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNegatedOut() <em>Negated Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNegatedOut()
	 * @generated
	 * @ordered
	 */
	protected boolean negatedOut = NEGATED_OUT_EDEFAULT;

	/**
	 * This is true if the Negated Out attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean negatedOutESet;

	/**
	 * The default value of the '{@link #getStorageIn() <em>Storage In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageIn()
	 * @generated
	 * @ordered
	 */
	protected static final StorageModifierType STORAGE_IN_EDEFAULT = StorageModifierType.NONE;

	/**
	 * The cached value of the '{@link #getStorageIn() <em>Storage In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageIn()
	 * @generated
	 * @ordered
	 */
	protected StorageModifierType storageIn = STORAGE_IN_EDEFAULT;

	/**
	 * This is true if the Storage In attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean storageInESet;

	/**
	 * The default value of the '{@link #getStorageOut() <em>Storage Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageOut()
	 * @generated
	 * @ordered
	 */
	protected static final StorageModifierType STORAGE_OUT_EDEFAULT = StorageModifierType.NONE;

	/**
	 * The cached value of the '{@link #getStorageOut() <em>Storage Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageOut()
	 * @generated
	 * @ordered
	 */
	protected StorageModifierType storageOut = STORAGE_OUT_EDEFAULT;

	/**
	 * This is true if the Storage Out attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean storageOutESet;

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
	protected InOutVariableTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tc60201Package.eINSTANCE.getInOutVariableType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.IN_OUT_VARIABLE_TYPE__POSITION, oldPosition, newPosition);
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
				msgs = ((InternalEObject)position).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.IN_OUT_VARIABLE_TYPE__POSITION, null, msgs);
			if (newPosition != null)
				msgs = ((InternalEObject)newPosition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.IN_OUT_VARIABLE_TYPE__POSITION, null, msgs);
			msgs = basicSetPosition(newPosition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.IN_OUT_VARIABLE_TYPE__POSITION, newPosition, newPosition));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.IN_OUT_VARIABLE_TYPE__CONNECTION_POINT_IN, oldConnectionPointIn, newConnectionPointIn);
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
				msgs = ((InternalEObject)connectionPointIn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.IN_OUT_VARIABLE_TYPE__CONNECTION_POINT_IN, null, msgs);
			if (newConnectionPointIn != null)
				msgs = ((InternalEObject)newConnectionPointIn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.IN_OUT_VARIABLE_TYPE__CONNECTION_POINT_IN, null, msgs);
			msgs = basicSetConnectionPointIn(newConnectionPointIn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.IN_OUT_VARIABLE_TYPE__CONNECTION_POINT_IN, newConnectionPointIn, newConnectionPointIn));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.IN_OUT_VARIABLE_TYPE__CONNECTION_POINT_OUT, oldConnectionPointOut, newConnectionPointOut);
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
				msgs = ((InternalEObject)connectionPointOut).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.IN_OUT_VARIABLE_TYPE__CONNECTION_POINT_OUT, null, msgs);
			if (newConnectionPointOut != null)
				msgs = ((InternalEObject)newConnectionPointOut).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.IN_OUT_VARIABLE_TYPE__CONNECTION_POINT_OUT, null, msgs);
			msgs = basicSetConnectionPointOut(newConnectionPointOut, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.IN_OUT_VARIABLE_TYPE__CONNECTION_POINT_OUT, newConnectionPointOut, newConnectionPointOut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(String newExpression) {
		String oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.IN_OUT_VARIABLE_TYPE__EXPRESSION, oldExpression, expression));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.IN_OUT_VARIABLE_TYPE__ADD_DATA, oldAddData, newAddData);
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
				msgs = ((InternalEObject)addData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.IN_OUT_VARIABLE_TYPE__ADD_DATA, null, msgs);
			if (newAddData != null)
				msgs = ((InternalEObject)newAddData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.IN_OUT_VARIABLE_TYPE__ADD_DATA, null, msgs);
			msgs = basicSetAddData(newAddData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.IN_OUT_VARIABLE_TYPE__ADD_DATA, newAddData, newAddData));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.IN_OUT_VARIABLE_TYPE__DOCUMENTATION, oldDocumentation, newDocumentation);
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
				msgs = ((InternalEObject)documentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.IN_OUT_VARIABLE_TYPE__DOCUMENTATION, null, msgs);
			if (newDocumentation != null)
				msgs = ((InternalEObject)newDocumentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.IN_OUT_VARIABLE_TYPE__DOCUMENTATION, null, msgs);
			msgs = basicSetDocumentation(newDocumentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.IN_OUT_VARIABLE_TYPE__DOCUMENTATION, newDocumentation, newDocumentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeModifierType getEdgeIn() {
		return edgeIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdgeIn(EdgeModifierType newEdgeIn) {
		EdgeModifierType oldEdgeIn = edgeIn;
		edgeIn = newEdgeIn == null ? EDGE_IN_EDEFAULT : newEdgeIn;
		boolean oldEdgeInESet = edgeInESet;
		edgeInESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.IN_OUT_VARIABLE_TYPE__EDGE_IN, oldEdgeIn, edgeIn, !oldEdgeInESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEdgeIn() {
		EdgeModifierType oldEdgeIn = edgeIn;
		boolean oldEdgeInESet = edgeInESet;
		edgeIn = EDGE_IN_EDEFAULT;
		edgeInESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Tc60201Package.IN_OUT_VARIABLE_TYPE__EDGE_IN, oldEdgeIn, EDGE_IN_EDEFAULT, oldEdgeInESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEdgeIn() {
		return edgeInESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeModifierType getEdgeOut() {
		return edgeOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdgeOut(EdgeModifierType newEdgeOut) {
		EdgeModifierType oldEdgeOut = edgeOut;
		edgeOut = newEdgeOut == null ? EDGE_OUT_EDEFAULT : newEdgeOut;
		boolean oldEdgeOutESet = edgeOutESet;
		edgeOutESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.IN_OUT_VARIABLE_TYPE__EDGE_OUT, oldEdgeOut, edgeOut, !oldEdgeOutESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEdgeOut() {
		EdgeModifierType oldEdgeOut = edgeOut;
		boolean oldEdgeOutESet = edgeOutESet;
		edgeOut = EDGE_OUT_EDEFAULT;
		edgeOutESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Tc60201Package.IN_OUT_VARIABLE_TYPE__EDGE_OUT, oldEdgeOut, EDGE_OUT_EDEFAULT, oldEdgeOutESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEdgeOut() {
		return edgeOutESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getExecutionOrderId() {
		return executionOrderId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutionOrderId(BigInteger newExecutionOrderId) {
		BigInteger oldExecutionOrderId = executionOrderId;
		executionOrderId = newExecutionOrderId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.IN_OUT_VARIABLE_TYPE__EXECUTION_ORDER_ID, oldExecutionOrderId, executionOrderId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.IN_OUT_VARIABLE_TYPE__GLOBAL_ID, oldGlobalId, globalId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.IN_OUT_VARIABLE_TYPE__HEIGHT, oldHeight, height));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.IN_OUT_VARIABLE_TYPE__LOCAL_ID, oldLocalId, localId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNegatedIn() {
		return negatedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNegatedIn(boolean newNegatedIn) {
		boolean oldNegatedIn = negatedIn;
		negatedIn = newNegatedIn;
		boolean oldNegatedInESet = negatedInESet;
		negatedInESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.IN_OUT_VARIABLE_TYPE__NEGATED_IN, oldNegatedIn, negatedIn, !oldNegatedInESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNegatedIn() {
		boolean oldNegatedIn = negatedIn;
		boolean oldNegatedInESet = negatedInESet;
		negatedIn = NEGATED_IN_EDEFAULT;
		negatedInESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Tc60201Package.IN_OUT_VARIABLE_TYPE__NEGATED_IN, oldNegatedIn, NEGATED_IN_EDEFAULT, oldNegatedInESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNegatedIn() {
		return negatedInESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNegatedOut() {
		return negatedOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNegatedOut(boolean newNegatedOut) {
		boolean oldNegatedOut = negatedOut;
		negatedOut = newNegatedOut;
		boolean oldNegatedOutESet = negatedOutESet;
		negatedOutESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.IN_OUT_VARIABLE_TYPE__NEGATED_OUT, oldNegatedOut, negatedOut, !oldNegatedOutESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNegatedOut() {
		boolean oldNegatedOut = negatedOut;
		boolean oldNegatedOutESet = negatedOutESet;
		negatedOut = NEGATED_OUT_EDEFAULT;
		negatedOutESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Tc60201Package.IN_OUT_VARIABLE_TYPE__NEGATED_OUT, oldNegatedOut, NEGATED_OUT_EDEFAULT, oldNegatedOutESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNegatedOut() {
		return negatedOutESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorageModifierType getStorageIn() {
		return storageIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStorageIn(StorageModifierType newStorageIn) {
		StorageModifierType oldStorageIn = storageIn;
		storageIn = newStorageIn == null ? STORAGE_IN_EDEFAULT : newStorageIn;
		boolean oldStorageInESet = storageInESet;
		storageInESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.IN_OUT_VARIABLE_TYPE__STORAGE_IN, oldStorageIn, storageIn, !oldStorageInESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStorageIn() {
		StorageModifierType oldStorageIn = storageIn;
		boolean oldStorageInESet = storageInESet;
		storageIn = STORAGE_IN_EDEFAULT;
		storageInESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Tc60201Package.IN_OUT_VARIABLE_TYPE__STORAGE_IN, oldStorageIn, STORAGE_IN_EDEFAULT, oldStorageInESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStorageIn() {
		return storageInESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorageModifierType getStorageOut() {
		return storageOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStorageOut(StorageModifierType newStorageOut) {
		StorageModifierType oldStorageOut = storageOut;
		storageOut = newStorageOut == null ? STORAGE_OUT_EDEFAULT : newStorageOut;
		boolean oldStorageOutESet = storageOutESet;
		storageOutESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.IN_OUT_VARIABLE_TYPE__STORAGE_OUT, oldStorageOut, storageOut, !oldStorageOutESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStorageOut() {
		StorageModifierType oldStorageOut = storageOut;
		boolean oldStorageOutESet = storageOutESet;
		storageOut = STORAGE_OUT_EDEFAULT;
		storageOutESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Tc60201Package.IN_OUT_VARIABLE_TYPE__STORAGE_OUT, oldStorageOut, STORAGE_OUT_EDEFAULT, oldStorageOutESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStorageOut() {
		return storageOutESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.IN_OUT_VARIABLE_TYPE__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__POSITION:
				return basicSetPosition(null, msgs);
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__CONNECTION_POINT_IN:
				return basicSetConnectionPointIn(null, msgs);
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__CONNECTION_POINT_OUT:
				return basicSetConnectionPointOut(null, msgs);
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__ADD_DATA:
				return basicSetAddData(null, msgs);
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__DOCUMENTATION:
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
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__POSITION:
				return getPosition();
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__CONNECTION_POINT_IN:
				return getConnectionPointIn();
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__CONNECTION_POINT_OUT:
				return getConnectionPointOut();
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__EXPRESSION:
				return getExpression();
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__ADD_DATA:
				return getAddData();
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__DOCUMENTATION:
				return getDocumentation();
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__EDGE_IN:
				return getEdgeIn();
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__EDGE_OUT:
				return getEdgeOut();
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__EXECUTION_ORDER_ID:
				return getExecutionOrderId();
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__GLOBAL_ID:
				return getGlobalId();
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__HEIGHT:
				return getHeight();
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__LOCAL_ID:
				return getLocalId();
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__NEGATED_IN:
				return isNegatedIn();
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__NEGATED_OUT:
				return isNegatedOut();
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__STORAGE_IN:
				return getStorageIn();
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__STORAGE_OUT:
				return getStorageOut();
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__WIDTH:
				return getWidth();
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
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__POSITION:
				setPosition((Position)newValue);
				return;
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__CONNECTION_POINT_IN:
				setConnectionPointIn((ConnectionPointIn)newValue);
				return;
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__CONNECTION_POINT_OUT:
				setConnectionPointOut((ConnectionPointOut)newValue);
				return;
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__EXPRESSION:
				setExpression((String)newValue);
				return;
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__ADD_DATA:
				setAddData((AddData)newValue);
				return;
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__DOCUMENTATION:
				setDocumentation((FormattedText)newValue);
				return;
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__EDGE_IN:
				setEdgeIn((EdgeModifierType)newValue);
				return;
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__EDGE_OUT:
				setEdgeOut((EdgeModifierType)newValue);
				return;
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__EXECUTION_ORDER_ID:
				setExecutionOrderId((BigInteger)newValue);
				return;
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__GLOBAL_ID:
				setGlobalId((String)newValue);
				return;
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__HEIGHT:
				setHeight((BigDecimal)newValue);
				return;
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__LOCAL_ID:
				setLocalId((BigInteger)newValue);
				return;
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__NEGATED_IN:
				setNegatedIn((Boolean)newValue);
				return;
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__NEGATED_OUT:
				setNegatedOut((Boolean)newValue);
				return;
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__STORAGE_IN:
				setStorageIn((StorageModifierType)newValue);
				return;
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__STORAGE_OUT:
				setStorageOut((StorageModifierType)newValue);
				return;
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__WIDTH:
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
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__POSITION:
				setPosition((Position)null);
				return;
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__CONNECTION_POINT_IN:
				setConnectionPointIn((ConnectionPointIn)null);
				return;
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__CONNECTION_POINT_OUT:
				setConnectionPointOut((ConnectionPointOut)null);
				return;
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__EXPRESSION:
				setExpression(EXPRESSION_EDEFAULT);
				return;
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__ADD_DATA:
				setAddData((AddData)null);
				return;
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__DOCUMENTATION:
				setDocumentation((FormattedText)null);
				return;
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__EDGE_IN:
				unsetEdgeIn();
				return;
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__EDGE_OUT:
				unsetEdgeOut();
				return;
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__EXECUTION_ORDER_ID:
				setExecutionOrderId(EXECUTION_ORDER_ID_EDEFAULT);
				return;
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__GLOBAL_ID:
				setGlobalId(GLOBAL_ID_EDEFAULT);
				return;
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__LOCAL_ID:
				setLocalId(LOCAL_ID_EDEFAULT);
				return;
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__NEGATED_IN:
				unsetNegatedIn();
				return;
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__NEGATED_OUT:
				unsetNegatedOut();
				return;
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__STORAGE_IN:
				unsetStorageIn();
				return;
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__STORAGE_OUT:
				unsetStorageOut();
				return;
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__WIDTH:
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
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__POSITION:
				return position != null;
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__CONNECTION_POINT_IN:
				return connectionPointIn != null;
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__CONNECTION_POINT_OUT:
				return connectionPointOut != null;
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__EXPRESSION:
				return EXPRESSION_EDEFAULT == null ? expression != null : !EXPRESSION_EDEFAULT.equals(expression);
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__ADD_DATA:
				return addData != null;
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__DOCUMENTATION:
				return documentation != null;
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__EDGE_IN:
				return isSetEdgeIn();
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__EDGE_OUT:
				return isSetEdgeOut();
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__EXECUTION_ORDER_ID:
				return EXECUTION_ORDER_ID_EDEFAULT == null ? executionOrderId != null : !EXECUTION_ORDER_ID_EDEFAULT.equals(executionOrderId);
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__GLOBAL_ID:
				return GLOBAL_ID_EDEFAULT == null ? globalId != null : !GLOBAL_ID_EDEFAULT.equals(globalId);
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__HEIGHT:
				return HEIGHT_EDEFAULT == null ? height != null : !HEIGHT_EDEFAULT.equals(height);
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__LOCAL_ID:
				return LOCAL_ID_EDEFAULT == null ? localId != null : !LOCAL_ID_EDEFAULT.equals(localId);
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__NEGATED_IN:
				return isSetNegatedIn();
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__NEGATED_OUT:
				return isSetNegatedOut();
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__STORAGE_IN:
				return isSetStorageIn();
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__STORAGE_OUT:
				return isSetStorageOut();
			case Tc60201Package.IN_OUT_VARIABLE_TYPE__WIDTH:
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
		result.append(" (expression: ");
		result.append(expression);
		result.append(", edgeIn: ");
		if (edgeInESet) result.append(edgeIn); else result.append("<unset>");
		result.append(", edgeOut: ");
		if (edgeOutESet) result.append(edgeOut); else result.append("<unset>");
		result.append(", executionOrderId: ");
		result.append(executionOrderId);
		result.append(", globalId: ");
		result.append(globalId);
		result.append(", height: ");
		result.append(height);
		result.append(", localId: ");
		result.append(localId);
		result.append(", negatedIn: ");
		if (negatedInESet) result.append(negatedIn); else result.append("<unset>");
		result.append(", negatedOut: ");
		if (negatedOutESet) result.append(negatedOut); else result.append("<unset>");
		result.append(", storageIn: ");
		if (storageInESet) result.append(storageIn); else result.append("<unset>");
		result.append(", storageOut: ");
		if (storageOutESet) result.append(storageOut); else result.append("<unset>");
		result.append(", width: ");
		result.append(width);
		result.append(')');
		return result.toString();
	}

} //InOutVariableTypeImpl
