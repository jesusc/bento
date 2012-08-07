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

import org.plcopen.xml.tc60201.AddData;
import org.plcopen.xml.tc60201.Body;
import org.plcopen.xml.tc60201.FBDType1;
import org.plcopen.xml.tc60201.FormattedText;
import org.plcopen.xml.tc60201.LDType1;
import org.plcopen.xml.tc60201.SFCType1;
import org.plcopen.xml.tc60201.Tc60201Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.plcopen.xml.tc60201.impl.BodyImpl#getIL <em>IL</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.BodyImpl#getST <em>ST</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.BodyImpl#getFBD <em>FBD</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.BodyImpl#getLD <em>LD</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.BodyImpl#getSFC <em>SFC</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.BodyImpl#getAddData <em>Add Data</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.BodyImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.BodyImpl#getGlobalId <em>Global Id</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.BodyImpl#getWorksheetName <em>Worksheet Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BodyImpl extends EObjectImpl implements Body {
	/**
	 * The cached value of the '{@link #getIL() <em>IL</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIL()
	 * @generated
	 * @ordered
	 */
	protected FormattedText iL;

	/**
	 * The cached value of the '{@link #getST() <em>ST</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getST()
	 * @generated
	 * @ordered
	 */
	protected FormattedText sT;

	/**
	 * The cached value of the '{@link #getFBD() <em>FBD</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFBD()
	 * @generated
	 * @ordered
	 */
	protected FBDType1 fBD;

	/**
	 * The cached value of the '{@link #getLD() <em>LD</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLD()
	 * @generated
	 * @ordered
	 */
	protected LDType1 lD;

	/**
	 * The cached value of the '{@link #getSFC() <em>SFC</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSFC()
	 * @generated
	 * @ordered
	 */
	protected SFCType1 sFC;

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
	 * The default value of the '{@link #getWorksheetName() <em>Worksheet Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorksheetName()
	 * @generated
	 * @ordered
	 */
	protected static final String WORKSHEET_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorksheetName() <em>Worksheet Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorksheetName()
	 * @generated
	 * @ordered
	 */
	protected String worksheetName = WORKSHEET_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BodyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tc60201Package.eINSTANCE.getBody();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormattedText getIL() {
		return iL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIL(FormattedText newIL, NotificationChain msgs) {
		FormattedText oldIL = iL;
		iL = newIL;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.BODY__IL, oldIL, newIL);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIL(FormattedText newIL) {
		if (newIL != iL) {
			NotificationChain msgs = null;
			if (iL != null)
				msgs = ((InternalEObject)iL).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.BODY__IL, null, msgs);
			if (newIL != null)
				msgs = ((InternalEObject)newIL).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.BODY__IL, null, msgs);
			msgs = basicSetIL(newIL, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.BODY__IL, newIL, newIL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormattedText getST() {
		return sT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetST(FormattedText newST, NotificationChain msgs) {
		FormattedText oldST = sT;
		sT = newST;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.BODY__ST, oldST, newST);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setST(FormattedText newST) {
		if (newST != sT) {
			NotificationChain msgs = null;
			if (sT != null)
				msgs = ((InternalEObject)sT).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.BODY__ST, null, msgs);
			if (newST != null)
				msgs = ((InternalEObject)newST).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.BODY__ST, null, msgs);
			msgs = basicSetST(newST, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.BODY__ST, newST, newST));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FBDType1 getFBD() {
		return fBD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFBD(FBDType1 newFBD, NotificationChain msgs) {
		FBDType1 oldFBD = fBD;
		fBD = newFBD;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.BODY__FBD, oldFBD, newFBD);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFBD(FBDType1 newFBD) {
		if (newFBD != fBD) {
			NotificationChain msgs = null;
			if (fBD != null)
				msgs = ((InternalEObject)fBD).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.BODY__FBD, null, msgs);
			if (newFBD != null)
				msgs = ((InternalEObject)newFBD).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.BODY__FBD, null, msgs);
			msgs = basicSetFBD(newFBD, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.BODY__FBD, newFBD, newFBD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LDType1 getLD() {
		return lD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLD(LDType1 newLD, NotificationChain msgs) {
		LDType1 oldLD = lD;
		lD = newLD;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.BODY__LD, oldLD, newLD);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLD(LDType1 newLD) {
		if (newLD != lD) {
			NotificationChain msgs = null;
			if (lD != null)
				msgs = ((InternalEObject)lD).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.BODY__LD, null, msgs);
			if (newLD != null)
				msgs = ((InternalEObject)newLD).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.BODY__LD, null, msgs);
			msgs = basicSetLD(newLD, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.BODY__LD, newLD, newLD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SFCType1 getSFC() {
		return sFC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSFC(SFCType1 newSFC, NotificationChain msgs) {
		SFCType1 oldSFC = sFC;
		sFC = newSFC;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.BODY__SFC, oldSFC, newSFC);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSFC(SFCType1 newSFC) {
		if (newSFC != sFC) {
			NotificationChain msgs = null;
			if (sFC != null)
				msgs = ((InternalEObject)sFC).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.BODY__SFC, null, msgs);
			if (newSFC != null)
				msgs = ((InternalEObject)newSFC).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.BODY__SFC, null, msgs);
			msgs = basicSetSFC(newSFC, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.BODY__SFC, newSFC, newSFC));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.BODY__ADD_DATA, oldAddData, newAddData);
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
				msgs = ((InternalEObject)addData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.BODY__ADD_DATA, null, msgs);
			if (newAddData != null)
				msgs = ((InternalEObject)newAddData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.BODY__ADD_DATA, null, msgs);
			msgs = basicSetAddData(newAddData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.BODY__ADD_DATA, newAddData, newAddData));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Tc60201Package.BODY__DOCUMENTATION, oldDocumentation, newDocumentation);
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
				msgs = ((InternalEObject)documentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.BODY__DOCUMENTATION, null, msgs);
			if (newDocumentation != null)
				msgs = ((InternalEObject)newDocumentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Tc60201Package.BODY__DOCUMENTATION, null, msgs);
			msgs = basicSetDocumentation(newDocumentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.BODY__DOCUMENTATION, newDocumentation, newDocumentation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.BODY__GLOBAL_ID, oldGlobalId, globalId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWorksheetName() {
		return worksheetName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorksheetName(String newWorksheetName) {
		String oldWorksheetName = worksheetName;
		worksheetName = newWorksheetName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Tc60201Package.BODY__WORKSHEET_NAME, oldWorksheetName, worksheetName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Tc60201Package.BODY__IL:
				return basicSetIL(null, msgs);
			case Tc60201Package.BODY__ST:
				return basicSetST(null, msgs);
			case Tc60201Package.BODY__FBD:
				return basicSetFBD(null, msgs);
			case Tc60201Package.BODY__LD:
				return basicSetLD(null, msgs);
			case Tc60201Package.BODY__SFC:
				return basicSetSFC(null, msgs);
			case Tc60201Package.BODY__ADD_DATA:
				return basicSetAddData(null, msgs);
			case Tc60201Package.BODY__DOCUMENTATION:
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
			case Tc60201Package.BODY__IL:
				return getIL();
			case Tc60201Package.BODY__ST:
				return getST();
			case Tc60201Package.BODY__FBD:
				return getFBD();
			case Tc60201Package.BODY__LD:
				return getLD();
			case Tc60201Package.BODY__SFC:
				return getSFC();
			case Tc60201Package.BODY__ADD_DATA:
				return getAddData();
			case Tc60201Package.BODY__DOCUMENTATION:
				return getDocumentation();
			case Tc60201Package.BODY__GLOBAL_ID:
				return getGlobalId();
			case Tc60201Package.BODY__WORKSHEET_NAME:
				return getWorksheetName();
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
			case Tc60201Package.BODY__IL:
				setIL((FormattedText)newValue);
				return;
			case Tc60201Package.BODY__ST:
				setST((FormattedText)newValue);
				return;
			case Tc60201Package.BODY__FBD:
				setFBD((FBDType1)newValue);
				return;
			case Tc60201Package.BODY__LD:
				setLD((LDType1)newValue);
				return;
			case Tc60201Package.BODY__SFC:
				setSFC((SFCType1)newValue);
				return;
			case Tc60201Package.BODY__ADD_DATA:
				setAddData((AddData)newValue);
				return;
			case Tc60201Package.BODY__DOCUMENTATION:
				setDocumentation((FormattedText)newValue);
				return;
			case Tc60201Package.BODY__GLOBAL_ID:
				setGlobalId((String)newValue);
				return;
			case Tc60201Package.BODY__WORKSHEET_NAME:
				setWorksheetName((String)newValue);
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
			case Tc60201Package.BODY__IL:
				setIL((FormattedText)null);
				return;
			case Tc60201Package.BODY__ST:
				setST((FormattedText)null);
				return;
			case Tc60201Package.BODY__FBD:
				setFBD((FBDType1)null);
				return;
			case Tc60201Package.BODY__LD:
				setLD((LDType1)null);
				return;
			case Tc60201Package.BODY__SFC:
				setSFC((SFCType1)null);
				return;
			case Tc60201Package.BODY__ADD_DATA:
				setAddData((AddData)null);
				return;
			case Tc60201Package.BODY__DOCUMENTATION:
				setDocumentation((FormattedText)null);
				return;
			case Tc60201Package.BODY__GLOBAL_ID:
				setGlobalId(GLOBAL_ID_EDEFAULT);
				return;
			case Tc60201Package.BODY__WORKSHEET_NAME:
				setWorksheetName(WORKSHEET_NAME_EDEFAULT);
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
			case Tc60201Package.BODY__IL:
				return iL != null;
			case Tc60201Package.BODY__ST:
				return sT != null;
			case Tc60201Package.BODY__FBD:
				return fBD != null;
			case Tc60201Package.BODY__LD:
				return lD != null;
			case Tc60201Package.BODY__SFC:
				return sFC != null;
			case Tc60201Package.BODY__ADD_DATA:
				return addData != null;
			case Tc60201Package.BODY__DOCUMENTATION:
				return documentation != null;
			case Tc60201Package.BODY__GLOBAL_ID:
				return GLOBAL_ID_EDEFAULT == null ? globalId != null : !GLOBAL_ID_EDEFAULT.equals(globalId);
			case Tc60201Package.BODY__WORKSHEET_NAME:
				return WORKSHEET_NAME_EDEFAULT == null ? worksheetName != null : !WORKSHEET_NAME_EDEFAULT.equals(worksheetName);
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
		result.append(", worksheetName: ");
		result.append(worksheetName);
		result.append(')');
		return result.toString();
	}

} //BodyImpl
