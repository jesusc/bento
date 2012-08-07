/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.plcopen.xml.tc60201.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.plcopen.xml.tc60201.AddData;
import org.plcopen.xml.tc60201.DataType;
import org.plcopen.xml.tc60201.ExternalVarsType;
import org.plcopen.xml.tc60201.FormattedText;
import org.plcopen.xml.tc60201.GlobalVarsType;
import org.plcopen.xml.tc60201.InOutVarsType;
import org.plcopen.xml.tc60201.InputVarsType;
import org.plcopen.xml.tc60201.InterfaceType;
import org.plcopen.xml.tc60201.LocalVarsType;
import org.plcopen.xml.tc60201.OutputVarsType;
import org.plcopen.xml.tc60201.Tc60201Package;
import org.plcopen.xml.tc60201.TempVarsType;
import org.plcopen.xml.tc60201.VarList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.plcopen.xml.tc60201.impl.InterfaceTypeImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.InterfaceTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.InterfaceTypeImpl#getLocalVars <em>Local Vars</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.InterfaceTypeImpl#getTempVars <em>Temp Vars</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.InterfaceTypeImpl#getInputVars <em>Input Vars</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.InterfaceTypeImpl#getOutputVars <em>Output Vars</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.InterfaceTypeImpl#getInOutVars <em>In Out Vars</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.InterfaceTypeImpl#getExternalVars <em>External Vars</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.InterfaceTypeImpl#getGlobalVars <em>Global Vars</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.InterfaceTypeImpl#getAccessVars <em>Access Vars</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.InterfaceTypeImpl#getAddData <em>Add Data</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.InterfaceTypeImpl#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterfaceTypeImpl extends EObjectImpl implements InterfaceType {
	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected DataType returnType;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tc60201Package.eINSTANCE.getInterfaceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturnType(DataType newReturnType, NotificationChain msgs) {
		DataType oldReturnType = returnType;
		returnType = newReturnType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.INTERFACE_TYPE__RETURN_TYPE, oldReturnType, newReturnType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(DataType newReturnType) {
		if (newReturnType != returnType) {
			NotificationChain msgs = null;
			if (returnType != null)
				msgs = ((InternalEObject)returnType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.INTERFACE_TYPE__RETURN_TYPE, null, msgs);
			if (newReturnType != null)
				msgs = ((InternalEObject)newReturnType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.INTERFACE_TYPE__RETURN_TYPE, null, msgs);
			msgs = basicSetReturnType(newReturnType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.INTERFACE_TYPE__RETURN_TYPE, newReturnType, newReturnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, Tc60201Package.INTERFACE_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocalVarsType> getLocalVars() {
		return getGroup().list(Tc60201Package.eINSTANCE.getInterfaceType_LocalVars());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TempVarsType> getTempVars() {
		return getGroup().list(Tc60201Package.eINSTANCE.getInterfaceType_TempVars());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputVarsType> getInputVars() {
		return getGroup().list(Tc60201Package.eINSTANCE.getInterfaceType_InputVars());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputVarsType> getOutputVars() {
		return getGroup().list(Tc60201Package.eINSTANCE.getInterfaceType_OutputVars());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InOutVarsType> getInOutVars() {
		return getGroup().list(Tc60201Package.eINSTANCE.getInterfaceType_InOutVars());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExternalVarsType> getExternalVars() {
		return getGroup().list(Tc60201Package.eINSTANCE.getInterfaceType_ExternalVars());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalVarsType> getGlobalVars() {
		return getGroup().list(Tc60201Package.eINSTANCE.getInterfaceType_GlobalVars());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VarList> getAccessVars() {
		return getGroup().list(Tc60201Package.eINSTANCE.getInterfaceType_AccessVars());
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.INTERFACE_TYPE__ADD_DATA, oldAddData, newAddData);
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
				msgs = ((InternalEObject)addData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.INTERFACE_TYPE__ADD_DATA, null, msgs);
			if (newAddData != null)
				msgs = ((InternalEObject)newAddData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.INTERFACE_TYPE__ADD_DATA, null, msgs);
			msgs = basicSetAddData(newAddData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.INTERFACE_TYPE__ADD_DATA, newAddData, newAddData));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.INTERFACE_TYPE__DOCUMENTATION, oldDocumentation, newDocumentation);
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
				msgs = ((InternalEObject)documentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.INTERFACE_TYPE__DOCUMENTATION, null, msgs);
			if (newDocumentation != null)
				msgs = ((InternalEObject)newDocumentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.INTERFACE_TYPE__DOCUMENTATION, null, msgs);
			msgs = basicSetDocumentation(newDocumentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.INTERFACE_TYPE__DOCUMENTATION, newDocumentation, newDocumentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Tc60201Package.INTERFACE_TYPE__RETURN_TYPE:
				return basicSetReturnType(null, msgs);
			case Tc60201Package.INTERFACE_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case Tc60201Package.INTERFACE_TYPE__LOCAL_VARS:
				return ((InternalEList<?>)getLocalVars()).basicRemove(otherEnd, msgs);
			case Tc60201Package.INTERFACE_TYPE__TEMP_VARS:
				return ((InternalEList<?>)getTempVars()).basicRemove(otherEnd, msgs);
			case Tc60201Package.INTERFACE_TYPE__INPUT_VARS:
				return ((InternalEList<?>)getInputVars()).basicRemove(otherEnd, msgs);
			case Tc60201Package.INTERFACE_TYPE__OUTPUT_VARS:
				return ((InternalEList<?>)getOutputVars()).basicRemove(otherEnd, msgs);
			case Tc60201Package.INTERFACE_TYPE__IN_OUT_VARS:
				return ((InternalEList<?>)getInOutVars()).basicRemove(otherEnd, msgs);
			case Tc60201Package.INTERFACE_TYPE__EXTERNAL_VARS:
				return ((InternalEList<?>)getExternalVars()).basicRemove(otherEnd, msgs);
			case Tc60201Package.INTERFACE_TYPE__GLOBAL_VARS:
				return ((InternalEList<?>)getGlobalVars()).basicRemove(otherEnd, msgs);
			case Tc60201Package.INTERFACE_TYPE__ACCESS_VARS:
				return ((InternalEList<?>)getAccessVars()).basicRemove(otherEnd, msgs);
			case Tc60201Package.INTERFACE_TYPE__ADD_DATA:
				return basicSetAddData(null, msgs);
			case Tc60201Package.INTERFACE_TYPE__DOCUMENTATION:
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
			case Tc60201Package.INTERFACE_TYPE__RETURN_TYPE:
				return getReturnType();
			case Tc60201Package.INTERFACE_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case Tc60201Package.INTERFACE_TYPE__LOCAL_VARS:
				return getLocalVars();
			case Tc60201Package.INTERFACE_TYPE__TEMP_VARS:
				return getTempVars();
			case Tc60201Package.INTERFACE_TYPE__INPUT_VARS:
				return getInputVars();
			case Tc60201Package.INTERFACE_TYPE__OUTPUT_VARS:
				return getOutputVars();
			case Tc60201Package.INTERFACE_TYPE__IN_OUT_VARS:
				return getInOutVars();
			case Tc60201Package.INTERFACE_TYPE__EXTERNAL_VARS:
				return getExternalVars();
			case Tc60201Package.INTERFACE_TYPE__GLOBAL_VARS:
				return getGlobalVars();
			case Tc60201Package.INTERFACE_TYPE__ACCESS_VARS:
				return getAccessVars();
			case Tc60201Package.INTERFACE_TYPE__ADD_DATA:
				return getAddData();
			case Tc60201Package.INTERFACE_TYPE__DOCUMENTATION:
				return getDocumentation();
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
			case Tc60201Package.INTERFACE_TYPE__RETURN_TYPE:
				setReturnType((DataType)newValue);
				return;
			case Tc60201Package.INTERFACE_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case Tc60201Package.INTERFACE_TYPE__LOCAL_VARS:
				getLocalVars().clear();
				getLocalVars().addAll((Collection<? extends LocalVarsType>)newValue);
				return;
			case Tc60201Package.INTERFACE_TYPE__TEMP_VARS:
				getTempVars().clear();
				getTempVars().addAll((Collection<? extends TempVarsType>)newValue);
				return;
			case Tc60201Package.INTERFACE_TYPE__INPUT_VARS:
				getInputVars().clear();
				getInputVars().addAll((Collection<? extends InputVarsType>)newValue);
				return;
			case Tc60201Package.INTERFACE_TYPE__OUTPUT_VARS:
				getOutputVars().clear();
				getOutputVars().addAll((Collection<? extends OutputVarsType>)newValue);
				return;
			case Tc60201Package.INTERFACE_TYPE__IN_OUT_VARS:
				getInOutVars().clear();
				getInOutVars().addAll((Collection<? extends InOutVarsType>)newValue);
				return;
			case Tc60201Package.INTERFACE_TYPE__EXTERNAL_VARS:
				getExternalVars().clear();
				getExternalVars().addAll((Collection<? extends ExternalVarsType>)newValue);
				return;
			case Tc60201Package.INTERFACE_TYPE__GLOBAL_VARS:
				getGlobalVars().clear();
				getGlobalVars().addAll((Collection<? extends GlobalVarsType>)newValue);
				return;
			case Tc60201Package.INTERFACE_TYPE__ACCESS_VARS:
				getAccessVars().clear();
				getAccessVars().addAll((Collection<? extends VarList>)newValue);
				return;
			case Tc60201Package.INTERFACE_TYPE__ADD_DATA:
				setAddData((AddData)newValue);
				return;
			case Tc60201Package.INTERFACE_TYPE__DOCUMENTATION:
				setDocumentation((FormattedText)newValue);
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
			case Tc60201Package.INTERFACE_TYPE__RETURN_TYPE:
				setReturnType((DataType)null);
				return;
			case Tc60201Package.INTERFACE_TYPE__GROUP:
				getGroup().clear();
				return;
			case Tc60201Package.INTERFACE_TYPE__LOCAL_VARS:
				getLocalVars().clear();
				return;
			case Tc60201Package.INTERFACE_TYPE__TEMP_VARS:
				getTempVars().clear();
				return;
			case Tc60201Package.INTERFACE_TYPE__INPUT_VARS:
				getInputVars().clear();
				return;
			case Tc60201Package.INTERFACE_TYPE__OUTPUT_VARS:
				getOutputVars().clear();
				return;
			case Tc60201Package.INTERFACE_TYPE__IN_OUT_VARS:
				getInOutVars().clear();
				return;
			case Tc60201Package.INTERFACE_TYPE__EXTERNAL_VARS:
				getExternalVars().clear();
				return;
			case Tc60201Package.INTERFACE_TYPE__GLOBAL_VARS:
				getGlobalVars().clear();
				return;
			case Tc60201Package.INTERFACE_TYPE__ACCESS_VARS:
				getAccessVars().clear();
				return;
			case Tc60201Package.INTERFACE_TYPE__ADD_DATA:
				setAddData((AddData)null);
				return;
			case Tc60201Package.INTERFACE_TYPE__DOCUMENTATION:
				setDocumentation((FormattedText)null);
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
			case Tc60201Package.INTERFACE_TYPE__RETURN_TYPE:
				return returnType != null;
			case Tc60201Package.INTERFACE_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case Tc60201Package.INTERFACE_TYPE__LOCAL_VARS:
				return !getLocalVars().isEmpty();
			case Tc60201Package.INTERFACE_TYPE__TEMP_VARS:
				return !getTempVars().isEmpty();
			case Tc60201Package.INTERFACE_TYPE__INPUT_VARS:
				return !getInputVars().isEmpty();
			case Tc60201Package.INTERFACE_TYPE__OUTPUT_VARS:
				return !getOutputVars().isEmpty();
			case Tc60201Package.INTERFACE_TYPE__IN_OUT_VARS:
				return !getInOutVars().isEmpty();
			case Tc60201Package.INTERFACE_TYPE__EXTERNAL_VARS:
				return !getExternalVars().isEmpty();
			case Tc60201Package.INTERFACE_TYPE__GLOBAL_VARS:
				return !getGlobalVars().isEmpty();
			case Tc60201Package.INTERFACE_TYPE__ACCESS_VARS:
				return !getAccessVars().isEmpty();
			case Tc60201Package.INTERFACE_TYPE__ADD_DATA:
				return addData != null;
			case Tc60201Package.INTERFACE_TYPE__DOCUMENTATION:
				return documentation != null;
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
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //InterfaceTypeImpl
