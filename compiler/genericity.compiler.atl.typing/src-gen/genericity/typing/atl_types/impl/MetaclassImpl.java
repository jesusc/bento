/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.typing.atl_types.impl;

import genericity.typing.atl_types.AtlTypingPackage;
import genericity.typing.atl_types.Metaclass;

import genericity.typing.atl_types.Model;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metaclass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link genericity.typing.atl_types.impl.MetaclassImpl#getName <em>Name</em>}</li>
 *   <li>{@link genericity.typing.atl_types.impl.MetaclassImpl#isExplicitOcurrence <em>Explicit Ocurrence</em>}</li>
 *   <li>{@link genericity.typing.atl_types.impl.MetaclassImpl#getKlass <em>Klass</em>}</li>
 *   <li>{@link genericity.typing.atl_types.impl.MetaclassImpl#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetaclassImpl extends RefTypeImpl implements Metaclass {
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
	 * The default value of the '{@link #isExplicitOcurrence() <em>Explicit Ocurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExplicitOcurrence()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXPLICIT_OCURRENCE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExplicitOcurrence() <em>Explicit Ocurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExplicitOcurrence()
	 * @generated
	 * @ordered
	 */
	protected boolean explicitOcurrence = EXPLICIT_OCURRENCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getKlass() <em>Klass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKlass()
	 * @generated
	 * @ordered
	 */
	protected EClass klass;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected Model model;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetaclassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AtlTypingPackage.Literals.METACLASS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AtlTypingPackage.METACLASS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExplicitOcurrence() {
		return explicitOcurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExplicitOcurrence(boolean newExplicitOcurrence) {
		boolean oldExplicitOcurrence = explicitOcurrence;
		explicitOcurrence = newExplicitOcurrence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtlTypingPackage.METACLASS__EXPLICIT_OCURRENCE, oldExplicitOcurrence, explicitOcurrence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKlass() {
		if (klass != null && klass.eIsProxy()) {
			InternalEObject oldKlass = (InternalEObject)klass;
			klass = (EClass)eResolveProxy(oldKlass);
			if (klass != oldKlass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AtlTypingPackage.METACLASS__KLASS, oldKlass, klass));
			}
		}
		return klass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetKlass() {
		return klass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKlass(EClass newKlass) {
		EClass oldKlass = klass;
		klass = newKlass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtlTypingPackage.METACLASS__KLASS, oldKlass, klass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model getModel() {
		if (model != null && model.eIsProxy()) {
			InternalEObject oldModel = (InternalEObject)model;
			model = (Model)eResolveProxy(oldModel);
			if (model != oldModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AtlTypingPackage.METACLASS__MODEL, oldModel, model));
			}
		}
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model basicGetModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(Model newModel) {
		Model oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtlTypingPackage.METACLASS__MODEL, oldModel, model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AtlTypingPackage.METACLASS__NAME:
				return getName();
			case AtlTypingPackage.METACLASS__EXPLICIT_OCURRENCE:
				return isExplicitOcurrence();
			case AtlTypingPackage.METACLASS__KLASS:
				if (resolve) return getKlass();
				return basicGetKlass();
			case AtlTypingPackage.METACLASS__MODEL:
				if (resolve) return getModel();
				return basicGetModel();
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
			case AtlTypingPackage.METACLASS__NAME:
				setName((String)newValue);
				return;
			case AtlTypingPackage.METACLASS__EXPLICIT_OCURRENCE:
				setExplicitOcurrence((Boolean)newValue);
				return;
			case AtlTypingPackage.METACLASS__KLASS:
				setKlass((EClass)newValue);
				return;
			case AtlTypingPackage.METACLASS__MODEL:
				setModel((Model)newValue);
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
			case AtlTypingPackage.METACLASS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AtlTypingPackage.METACLASS__EXPLICIT_OCURRENCE:
				setExplicitOcurrence(EXPLICIT_OCURRENCE_EDEFAULT);
				return;
			case AtlTypingPackage.METACLASS__KLASS:
				setKlass((EClass)null);
				return;
			case AtlTypingPackage.METACLASS__MODEL:
				setModel((Model)null);
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
			case AtlTypingPackage.METACLASS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AtlTypingPackage.METACLASS__EXPLICIT_OCURRENCE:
				return explicitOcurrence != EXPLICIT_OCURRENCE_EDEFAULT;
			case AtlTypingPackage.METACLASS__KLASS:
				return klass != null;
			case AtlTypingPackage.METACLASS__MODEL:
				return model != null;
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
		result.append(", explicitOcurrence: ");
		result.append(explicitOcurrence);
		result.append(')');
		return result.toString();
	}

} //MetaclassImpl
