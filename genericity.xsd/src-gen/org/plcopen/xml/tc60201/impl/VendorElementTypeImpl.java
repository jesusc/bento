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
import org.plcopen.xml.tc60201.FormattedText;
import org.plcopen.xml.tc60201.InOutVariablesType1;
import org.plcopen.xml.tc60201.InputVariablesType1;
import org.plcopen.xml.tc60201.OutputVariablesType1;
import org.plcopen.xml.tc60201.Position;
import org.plcopen.xml.tc60201.Tc60201Package;
import org.plcopen.xml.tc60201.VendorElementType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vendor Element Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.plcopen.xml.tc60201.impl.VendorElementTypeImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.VendorElementTypeImpl#getAlternativeText <em>Alternative Text</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.VendorElementTypeImpl#getInputVariables <em>Input Variables</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.VendorElementTypeImpl#getInOutVariables <em>In Out Variables</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.VendorElementTypeImpl#getOutputVariables <em>Output Variables</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.VendorElementTypeImpl#getAddData <em>Add Data</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.VendorElementTypeImpl#getExecutionOrderId <em>Execution Order Id</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.VendorElementTypeImpl#getGlobalId <em>Global Id</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.VendorElementTypeImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.VendorElementTypeImpl#getLocalId <em>Local Id</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.VendorElementTypeImpl#getWidth <em>Width</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VendorElementTypeImpl extends EObjectImpl implements VendorElementType {
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
	 * The cached value of the '{@link #getAlternativeText() <em>Alternative Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternativeText()
	 * @generated
	 * @ordered
	 */
	protected FormattedText alternativeText;

	/**
	 * The cached value of the '{@link #getInputVariables() <em>Input Variables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputVariables()
	 * @generated
	 * @ordered
	 */
	protected InputVariablesType1 inputVariables;

	/**
	 * The cached value of the '{@link #getInOutVariables() <em>In Out Variables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInOutVariables()
	 * @generated
	 * @ordered
	 */
	protected InOutVariablesType1 inOutVariables;

	/**
	 * The cached value of the '{@link #getOutputVariables() <em>Output Variables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputVariables()
	 * @generated
	 * @ordered
	 */
	protected OutputVariablesType1 outputVariables;

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
	protected VendorElementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tc60201Package.eINSTANCE.getVendorElementType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.VENDOR_ELEMENT_TYPE__POSITION, oldPosition, newPosition);
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
				msgs = ((InternalEObject)position).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.VENDOR_ELEMENT_TYPE__POSITION, null, msgs);
			if (newPosition != null)
				msgs = ((InternalEObject)newPosition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.VENDOR_ELEMENT_TYPE__POSITION, null, msgs);
			msgs = basicSetPosition(newPosition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.VENDOR_ELEMENT_TYPE__POSITION, newPosition, newPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormattedText getAlternativeText() {
		return alternativeText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlternativeText(FormattedText newAlternativeText, NotificationChain msgs) {
		FormattedText oldAlternativeText = alternativeText;
		alternativeText = newAlternativeText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.VENDOR_ELEMENT_TYPE__ALTERNATIVE_TEXT, oldAlternativeText, newAlternativeText);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlternativeText(FormattedText newAlternativeText) {
		if (newAlternativeText != alternativeText) {
			NotificationChain msgs = null;
			if (alternativeText != null)
				msgs = ((InternalEObject)alternativeText).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.VENDOR_ELEMENT_TYPE__ALTERNATIVE_TEXT, null, msgs);
			if (newAlternativeText != null)
				msgs = ((InternalEObject)newAlternativeText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.VENDOR_ELEMENT_TYPE__ALTERNATIVE_TEXT, null, msgs);
			msgs = basicSetAlternativeText(newAlternativeText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.VENDOR_ELEMENT_TYPE__ALTERNATIVE_TEXT, newAlternativeText, newAlternativeText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputVariablesType1 getInputVariables() {
		return inputVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputVariables(InputVariablesType1 newInputVariables, NotificationChain msgs) {
		InputVariablesType1 oldInputVariables = inputVariables;
		inputVariables = newInputVariables;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.VENDOR_ELEMENT_TYPE__INPUT_VARIABLES, oldInputVariables, newInputVariables);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputVariables(InputVariablesType1 newInputVariables) {
		if (newInputVariables != inputVariables) {
			NotificationChain msgs = null;
			if (inputVariables != null)
				msgs = ((InternalEObject)inputVariables).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.VENDOR_ELEMENT_TYPE__INPUT_VARIABLES, null, msgs);
			if (newInputVariables != null)
				msgs = ((InternalEObject)newInputVariables).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.VENDOR_ELEMENT_TYPE__INPUT_VARIABLES, null, msgs);
			msgs = basicSetInputVariables(newInputVariables, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.VENDOR_ELEMENT_TYPE__INPUT_VARIABLES, newInputVariables, newInputVariables));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InOutVariablesType1 getInOutVariables() {
		return inOutVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInOutVariables(InOutVariablesType1 newInOutVariables, NotificationChain msgs) {
		InOutVariablesType1 oldInOutVariables = inOutVariables;
		inOutVariables = newInOutVariables;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.VENDOR_ELEMENT_TYPE__IN_OUT_VARIABLES, oldInOutVariables, newInOutVariables);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInOutVariables(InOutVariablesType1 newInOutVariables) {
		if (newInOutVariables != inOutVariables) {
			NotificationChain msgs = null;
			if (inOutVariables != null)
				msgs = ((InternalEObject)inOutVariables).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.VENDOR_ELEMENT_TYPE__IN_OUT_VARIABLES, null, msgs);
			if (newInOutVariables != null)
				msgs = ((InternalEObject)newInOutVariables).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.VENDOR_ELEMENT_TYPE__IN_OUT_VARIABLES, null, msgs);
			msgs = basicSetInOutVariables(newInOutVariables, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.VENDOR_ELEMENT_TYPE__IN_OUT_VARIABLES, newInOutVariables, newInOutVariables));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputVariablesType1 getOutputVariables() {
		return outputVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputVariables(OutputVariablesType1 newOutputVariables, NotificationChain msgs) {
		OutputVariablesType1 oldOutputVariables = outputVariables;
		outputVariables = newOutputVariables;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.VENDOR_ELEMENT_TYPE__OUTPUT_VARIABLES, oldOutputVariables, newOutputVariables);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputVariables(OutputVariablesType1 newOutputVariables) {
		if (newOutputVariables != outputVariables) {
			NotificationChain msgs = null;
			if (outputVariables != null)
				msgs = ((InternalEObject)outputVariables).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.VENDOR_ELEMENT_TYPE__OUTPUT_VARIABLES, null, msgs);
			if (newOutputVariables != null)
				msgs = ((InternalEObject)newOutputVariables).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.VENDOR_ELEMENT_TYPE__OUTPUT_VARIABLES, null, msgs);
			msgs = basicSetOutputVariables(newOutputVariables, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.VENDOR_ELEMENT_TYPE__OUTPUT_VARIABLES, newOutputVariables, newOutputVariables));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.VENDOR_ELEMENT_TYPE__ADD_DATA, oldAddData, newAddData);
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
				msgs = ((InternalEObject)addData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.VENDOR_ELEMENT_TYPE__ADD_DATA, null, msgs);
			if (newAddData != null)
				msgs = ((InternalEObject)newAddData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.VENDOR_ELEMENT_TYPE__ADD_DATA, null, msgs);
			msgs = basicSetAddData(newAddData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.VENDOR_ELEMENT_TYPE__ADD_DATA, newAddData, newAddData));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.VENDOR_ELEMENT_TYPE__EXECUTION_ORDER_ID, oldExecutionOrderId, executionOrderId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.VENDOR_ELEMENT_TYPE__GLOBAL_ID, oldGlobalId, globalId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.VENDOR_ELEMENT_TYPE__HEIGHT, oldHeight, height));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.VENDOR_ELEMENT_TYPE__LOCAL_ID, oldLocalId, localId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.VENDOR_ELEMENT_TYPE__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Tc60201Package.VENDOR_ELEMENT_TYPE__POSITION:
				return basicSetPosition(null, msgs);
			case Tc60201Package.VENDOR_ELEMENT_TYPE__ALTERNATIVE_TEXT:
				return basicSetAlternativeText(null, msgs);
			case Tc60201Package.VENDOR_ELEMENT_TYPE__INPUT_VARIABLES:
				return basicSetInputVariables(null, msgs);
			case Tc60201Package.VENDOR_ELEMENT_TYPE__IN_OUT_VARIABLES:
				return basicSetInOutVariables(null, msgs);
			case Tc60201Package.VENDOR_ELEMENT_TYPE__OUTPUT_VARIABLES:
				return basicSetOutputVariables(null, msgs);
			case Tc60201Package.VENDOR_ELEMENT_TYPE__ADD_DATA:
				return basicSetAddData(null, msgs);
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
			case Tc60201Package.VENDOR_ELEMENT_TYPE__POSITION:
				return getPosition();
			case Tc60201Package.VENDOR_ELEMENT_TYPE__ALTERNATIVE_TEXT:
				return getAlternativeText();
			case Tc60201Package.VENDOR_ELEMENT_TYPE__INPUT_VARIABLES:
				return getInputVariables();
			case Tc60201Package.VENDOR_ELEMENT_TYPE__IN_OUT_VARIABLES:
				return getInOutVariables();
			case Tc60201Package.VENDOR_ELEMENT_TYPE__OUTPUT_VARIABLES:
				return getOutputVariables();
			case Tc60201Package.VENDOR_ELEMENT_TYPE__ADD_DATA:
				return getAddData();
			case Tc60201Package.VENDOR_ELEMENT_TYPE__EXECUTION_ORDER_ID:
				return getExecutionOrderId();
			case Tc60201Package.VENDOR_ELEMENT_TYPE__GLOBAL_ID:
				return getGlobalId();
			case Tc60201Package.VENDOR_ELEMENT_TYPE__HEIGHT:
				return getHeight();
			case Tc60201Package.VENDOR_ELEMENT_TYPE__LOCAL_ID:
				return getLocalId();
			case Tc60201Package.VENDOR_ELEMENT_TYPE__WIDTH:
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
			case Tc60201Package.VENDOR_ELEMENT_TYPE__POSITION:
				setPosition((Position)newValue);
				return;
			case Tc60201Package.VENDOR_ELEMENT_TYPE__ALTERNATIVE_TEXT:
				setAlternativeText((FormattedText)newValue);
				return;
			case Tc60201Package.VENDOR_ELEMENT_TYPE__INPUT_VARIABLES:
				setInputVariables((InputVariablesType1)newValue);
				return;
			case Tc60201Package.VENDOR_ELEMENT_TYPE__IN_OUT_VARIABLES:
				setInOutVariables((InOutVariablesType1)newValue);
				return;
			case Tc60201Package.VENDOR_ELEMENT_TYPE__OUTPUT_VARIABLES:
				setOutputVariables((OutputVariablesType1)newValue);
				return;
			case Tc60201Package.VENDOR_ELEMENT_TYPE__ADD_DATA:
				setAddData((AddData)newValue);
				return;
			case Tc60201Package.VENDOR_ELEMENT_TYPE__EXECUTION_ORDER_ID:
				setExecutionOrderId((BigInteger)newValue);
				return;
			case Tc60201Package.VENDOR_ELEMENT_TYPE__GLOBAL_ID:
				setGlobalId((String)newValue);
				return;
			case Tc60201Package.VENDOR_ELEMENT_TYPE__HEIGHT:
				setHeight((BigDecimal)newValue);
				return;
			case Tc60201Package.VENDOR_ELEMENT_TYPE__LOCAL_ID:
				setLocalId((BigInteger)newValue);
				return;
			case Tc60201Package.VENDOR_ELEMENT_TYPE__WIDTH:
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
			case Tc60201Package.VENDOR_ELEMENT_TYPE__POSITION:
				setPosition((Position)null);
				return;
			case Tc60201Package.VENDOR_ELEMENT_TYPE__ALTERNATIVE_TEXT:
				setAlternativeText((FormattedText)null);
				return;
			case Tc60201Package.VENDOR_ELEMENT_TYPE__INPUT_VARIABLES:
				setInputVariables((InputVariablesType1)null);
				return;
			case Tc60201Package.VENDOR_ELEMENT_TYPE__IN_OUT_VARIABLES:
				setInOutVariables((InOutVariablesType1)null);
				return;
			case Tc60201Package.VENDOR_ELEMENT_TYPE__OUTPUT_VARIABLES:
				setOutputVariables((OutputVariablesType1)null);
				return;
			case Tc60201Package.VENDOR_ELEMENT_TYPE__ADD_DATA:
				setAddData((AddData)null);
				return;
			case Tc60201Package.VENDOR_ELEMENT_TYPE__EXECUTION_ORDER_ID:
				setExecutionOrderId(EXECUTION_ORDER_ID_EDEFAULT);
				return;
			case Tc60201Package.VENDOR_ELEMENT_TYPE__GLOBAL_ID:
				setGlobalId(GLOBAL_ID_EDEFAULT);
				return;
			case Tc60201Package.VENDOR_ELEMENT_TYPE__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case Tc60201Package.VENDOR_ELEMENT_TYPE__LOCAL_ID:
				setLocalId(LOCAL_ID_EDEFAULT);
				return;
			case Tc60201Package.VENDOR_ELEMENT_TYPE__WIDTH:
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
			case Tc60201Package.VENDOR_ELEMENT_TYPE__POSITION:
				return position != null;
			case Tc60201Package.VENDOR_ELEMENT_TYPE__ALTERNATIVE_TEXT:
				return alternativeText != null;
			case Tc60201Package.VENDOR_ELEMENT_TYPE__INPUT_VARIABLES:
				return inputVariables != null;
			case Tc60201Package.VENDOR_ELEMENT_TYPE__IN_OUT_VARIABLES:
				return inOutVariables != null;
			case Tc60201Package.VENDOR_ELEMENT_TYPE__OUTPUT_VARIABLES:
				return outputVariables != null;
			case Tc60201Package.VENDOR_ELEMENT_TYPE__ADD_DATA:
				return addData != null;
			case Tc60201Package.VENDOR_ELEMENT_TYPE__EXECUTION_ORDER_ID:
				return EXECUTION_ORDER_ID_EDEFAULT == null ? executionOrderId != null : !EXECUTION_ORDER_ID_EDEFAULT.equals(executionOrderId);
			case Tc60201Package.VENDOR_ELEMENT_TYPE__GLOBAL_ID:
				return GLOBAL_ID_EDEFAULT == null ? globalId != null : !GLOBAL_ID_EDEFAULT.equals(globalId);
			case Tc60201Package.VENDOR_ELEMENT_TYPE__HEIGHT:
				return HEIGHT_EDEFAULT == null ? height != null : !HEIGHT_EDEFAULT.equals(height);
			case Tc60201Package.VENDOR_ELEMENT_TYPE__LOCAL_ID:
				return LOCAL_ID_EDEFAULT == null ? localId != null : !LOCAL_ID_EDEFAULT.equals(localId);
			case Tc60201Package.VENDOR_ELEMENT_TYPE__WIDTH:
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
		result.append(" (executionOrderId: ");
		result.append(executionOrderId);
		result.append(", globalId: ");
		result.append(globalId);
		result.append(", height: ");
		result.append(height);
		result.append(", localId: ");
		result.append(localId);
		result.append(", width: ");
		result.append(width);
		result.append(')');
		return result.toString();
	}

} //VendorElementTypeImpl
