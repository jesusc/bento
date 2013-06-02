/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gbind.dsl.impl;

import gbind.dsl.DslPackage;
import gbind.dsl.VirtualMetaclass;
import gbind.dsl.VirtualReference;

import gbind.simpleocl.OclExpression;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtual Metaclass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gbind.dsl.impl.VirtualMetaclassImpl#getReferences <em>References</em>}</li>
 *   <li>{@link gbind.dsl.impl.VirtualMetaclassImpl#getInit <em>Init</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VirtualMetaclassImpl extends MetaclassImpl implements VirtualMetaclass {
	/**
	 * The cached value of the '{@link #getReferences() <em>References</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<VirtualReference> references;

	/**
	 * The cached value of the '{@link #getInit() <em>Init</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInit()
	 * @generated
	 * @ordered
	 */
	protected OclExpression init;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualMetaclassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslPackage.Literals.VIRTUAL_METACLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VirtualReference> getReferences() {
		if (references == null) {
			references = new EObjectContainmentEList<VirtualReference>(VirtualReference.class, this, DslPackage.VIRTUAL_METACLASS__REFERENCES);
		}
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclExpression getInit() {
		return init;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInit(OclExpression newInit, NotificationChain msgs) {
		OclExpression oldInit = init;
		init = newInit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.VIRTUAL_METACLASS__INIT, oldInit, newInit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInit(OclExpression newInit) {
		if (newInit != init) {
			NotificationChain msgs = null;
			if (init != null)
				msgs = ((InternalEObject)init).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.VIRTUAL_METACLASS__INIT, null, msgs);
			if (newInit != null)
				msgs = ((InternalEObject)newInit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.VIRTUAL_METACLASS__INIT, null, msgs);
			msgs = basicSetInit(newInit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.VIRTUAL_METACLASS__INIT, newInit, newInit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DslPackage.VIRTUAL_METACLASS__REFERENCES:
				return ((InternalEList<?>)getReferences()).basicRemove(otherEnd, msgs);
			case DslPackage.VIRTUAL_METACLASS__INIT:
				return basicSetInit(null, msgs);
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
			case DslPackage.VIRTUAL_METACLASS__REFERENCES:
				return getReferences();
			case DslPackage.VIRTUAL_METACLASS__INIT:
				return getInit();
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
			case DslPackage.VIRTUAL_METACLASS__REFERENCES:
				getReferences().clear();
				getReferences().addAll((Collection<? extends VirtualReference>)newValue);
				return;
			case DslPackage.VIRTUAL_METACLASS__INIT:
				setInit((OclExpression)newValue);
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
			case DslPackage.VIRTUAL_METACLASS__REFERENCES:
				getReferences().clear();
				return;
			case DslPackage.VIRTUAL_METACLASS__INIT:
				setInit((OclExpression)null);
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
			case DslPackage.VIRTUAL_METACLASS__REFERENCES:
				return references != null && !references.isEmpty();
			case DslPackage.VIRTUAL_METACLASS__INIT:
				return init != null;
		}
		return super.eIsSet(featureID);
	}

} //VirtualMetaclassImpl
