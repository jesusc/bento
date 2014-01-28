/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bento.componetization.reveng.impl;

import bento.componetization.reveng.Concept;
import bento.componetization.reveng.Metamodel;
import bento.componetization.reveng.ModelKind;
import bento.componetization.reveng.RevengPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metamodel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bento.componetization.reveng.impl.MetamodelImpl#getName <em>Name</em>}</li>
 *   <li>{@link bento.componetization.reveng.impl.MetamodelImpl#getModelName <em>Model Name</em>}</li>
 *   <li>{@link bento.componetization.reveng.impl.MetamodelImpl#isBecomeConcept <em>Become Concept</em>}</li>
 *   <li>{@link bento.componetization.reveng.impl.MetamodelImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link bento.componetization.reveng.impl.MetamodelImpl#getExtractedConcept <em>Extracted Concept</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetamodelImpl extends ResourceImpl implements Metamodel {
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
	 * The default value of the '{@link #getModelName() <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelName()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelName() <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelName()
	 * @generated
	 * @ordered
	 */
	protected String modelName = MODEL_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isBecomeConcept() <em>Become Concept</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBecomeConcept()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BECOME_CONCEPT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBecomeConcept() <em>Become Concept</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBecomeConcept()
	 * @generated
	 * @ordered
	 */
	protected boolean becomeConcept = BECOME_CONCEPT_EDEFAULT;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final ModelKind KIND_EDEFAULT = ModelKind.IN;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected ModelKind kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExtractedConcept() <em>Extracted Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtractedConcept()
	 * @generated
	 * @ordered
	 */
	protected Concept extractedConcept;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetamodelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RevengPackage.Literals.METAMODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RevengPackage.METAMODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModelName() {
		return modelName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelName(String newModelName) {
		String oldModelName = modelName;
		modelName = newModelName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RevengPackage.METAMODEL__MODEL_NAME, oldModelName, modelName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBecomeConcept() {
		return becomeConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBecomeConcept(boolean newBecomeConcept) {
		boolean oldBecomeConcept = becomeConcept;
		becomeConcept = newBecomeConcept;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RevengPackage.METAMODEL__BECOME_CONCEPT, oldBecomeConcept, becomeConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(ModelKind newKind) {
		ModelKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RevengPackage.METAMODEL__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concept getExtractedConcept() {
		return extractedConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtractedConcept(Concept newExtractedConcept, NotificationChain msgs) {
		Concept oldExtractedConcept = extractedConcept;
		extractedConcept = newExtractedConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RevengPackage.METAMODEL__EXTRACTED_CONCEPT, oldExtractedConcept, newExtractedConcept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtractedConcept(Concept newExtractedConcept) {
		if (newExtractedConcept != extractedConcept) {
			NotificationChain msgs = null;
			if (extractedConcept != null)
				msgs = ((InternalEObject)extractedConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RevengPackage.METAMODEL__EXTRACTED_CONCEPT, null, msgs);
			if (newExtractedConcept != null)
				msgs = ((InternalEObject)newExtractedConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RevengPackage.METAMODEL__EXTRACTED_CONCEPT, null, msgs);
			msgs = basicSetExtractedConcept(newExtractedConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RevengPackage.METAMODEL__EXTRACTED_CONCEPT, newExtractedConcept, newExtractedConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RevengPackage.METAMODEL__EXTRACTED_CONCEPT:
				return basicSetExtractedConcept(null, msgs);
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
			case RevengPackage.METAMODEL__NAME:
				return getName();
			case RevengPackage.METAMODEL__MODEL_NAME:
				return getModelName();
			case RevengPackage.METAMODEL__BECOME_CONCEPT:
				return isBecomeConcept();
			case RevengPackage.METAMODEL__KIND:
				return getKind();
			case RevengPackage.METAMODEL__EXTRACTED_CONCEPT:
				return getExtractedConcept();
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
			case RevengPackage.METAMODEL__NAME:
				setName((String)newValue);
				return;
			case RevengPackage.METAMODEL__MODEL_NAME:
				setModelName((String)newValue);
				return;
			case RevengPackage.METAMODEL__BECOME_CONCEPT:
				setBecomeConcept((Boolean)newValue);
				return;
			case RevengPackage.METAMODEL__KIND:
				setKind((ModelKind)newValue);
				return;
			case RevengPackage.METAMODEL__EXTRACTED_CONCEPT:
				setExtractedConcept((Concept)newValue);
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
			case RevengPackage.METAMODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RevengPackage.METAMODEL__MODEL_NAME:
				setModelName(MODEL_NAME_EDEFAULT);
				return;
			case RevengPackage.METAMODEL__BECOME_CONCEPT:
				setBecomeConcept(BECOME_CONCEPT_EDEFAULT);
				return;
			case RevengPackage.METAMODEL__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case RevengPackage.METAMODEL__EXTRACTED_CONCEPT:
				setExtractedConcept((Concept)null);
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
			case RevengPackage.METAMODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RevengPackage.METAMODEL__MODEL_NAME:
				return MODEL_NAME_EDEFAULT == null ? modelName != null : !MODEL_NAME_EDEFAULT.equals(modelName);
			case RevengPackage.METAMODEL__BECOME_CONCEPT:
				return becomeConcept != BECOME_CONCEPT_EDEFAULT;
			case RevengPackage.METAMODEL__KIND:
				return kind != KIND_EDEFAULT;
			case RevengPackage.METAMODEL__EXTRACTED_CONCEPT:
				return extractedConcept != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", modelName: ");
		result.append(modelName);
		result.append(", becomeConcept: ");
		result.append(becomeConcept);
		result.append(", kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //MetamodelImpl
