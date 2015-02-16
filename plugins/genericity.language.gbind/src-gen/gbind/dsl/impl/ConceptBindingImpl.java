/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gbind.dsl.impl;

import gbind.dsl.BindingModel;
import gbind.dsl.ConceptBinding;
import gbind.dsl.DslPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concept Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gbind.dsl.impl.ConceptBindingImpl#getDebugName <em>Debug Name</em>}</li>
 *   <li>{@link gbind.dsl.impl.ConceptBindingImpl#getModel_ <em>Model </em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ConceptBindingImpl extends EObjectImpl implements ConceptBinding {
	/**
	 * The default value of the '{@link #getDebugName() <em>Debug Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebugName()
	 * @generated
	 * @ordered
	 */
	protected static final String DEBUG_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDebugName() <em>Debug Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebugName()
	 * @generated
	 * @ordered
	 */
	protected String debugName = DEBUG_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslPackage.Literals.CONCEPT_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDebugName() {
		return debugName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDebugName(String newDebugName) {
		String oldDebugName = debugName;
		debugName = newDebugName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.CONCEPT_BINDING__DEBUG_NAME, oldDebugName, debugName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingModel getModel_() {
		if (eContainerFeatureID() != DslPackage.CONCEPT_BINDING__MODEL_) return null;
		return (BindingModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel_(BindingModel newModel_, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newModel_, DslPackage.CONCEPT_BINDING__MODEL_, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel_(BindingModel newModel_) {
		if (newModel_ != eInternalContainer() || (eContainerFeatureID() != DslPackage.CONCEPT_BINDING__MODEL_ && newModel_ != null)) {
			if (EcoreUtil.isAncestor(this, newModel_))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModel_ != null)
				msgs = ((InternalEObject)newModel_).eInverseAdd(this, DslPackage.BINDING_MODEL__BINDINGS, BindingModel.class, msgs);
			msgs = basicSetModel_(newModel_, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.CONCEPT_BINDING__MODEL_, newModel_, newModel_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DslPackage.CONCEPT_BINDING__MODEL_:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetModel_((BindingModel)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DslPackage.CONCEPT_BINDING__MODEL_:
				return basicSetModel_(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case DslPackage.CONCEPT_BINDING__MODEL_:
				return eInternalContainer().eInverseRemove(this, DslPackage.BINDING_MODEL__BINDINGS, BindingModel.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DslPackage.CONCEPT_BINDING__DEBUG_NAME:
				return getDebugName();
			case DslPackage.CONCEPT_BINDING__MODEL_:
				return getModel_();
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
			case DslPackage.CONCEPT_BINDING__DEBUG_NAME:
				setDebugName((String)newValue);
				return;
			case DslPackage.CONCEPT_BINDING__MODEL_:
				setModel_((BindingModel)newValue);
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
			case DslPackage.CONCEPT_BINDING__DEBUG_NAME:
				setDebugName(DEBUG_NAME_EDEFAULT);
				return;
			case DslPackage.CONCEPT_BINDING__MODEL_:
				setModel_((BindingModel)null);
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
			case DslPackage.CONCEPT_BINDING__DEBUG_NAME:
				return DEBUG_NAME_EDEFAULT == null ? debugName != null : !DEBUG_NAME_EDEFAULT.equals(debugName);
			case DslPackage.CONCEPT_BINDING__MODEL_:
				return getModel_() != null;
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
		result.append(" (debugName: ");
		result.append(debugName);
		result.append(')');
		return result.toString();
	}

} //ConceptBindingImpl
