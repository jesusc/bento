/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.typing.atl_types.annotations.impl;

import genericity.typing.atl_types.Type;

import genericity.typing.atl_types.annotations.AnnotationsPackage;
import genericity.typing.atl_types.annotations.BindingAnn;
import genericity.typing.atl_types.annotations.OutputPatternAnn;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Pattern Ann</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link genericity.typing.atl_types.annotations.impl.OutputPatternAnnImpl#getOutputPatternElement <em>Output Pattern Element</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.impl.OutputPatternAnnImpl#getType <em>Type</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.impl.OutputPatternAnnImpl#getBindings <em>Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutputPatternAnnImpl extends RuleAnnImpl implements OutputPatternAnn {
	/**
	 * The cached value of the '{@link #getOutputPatternElement() <em>Output Pattern Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputPatternElement()
	 * @generated
	 * @ordered
	 */
	protected EObject outputPatternElement;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type;

	/**
	 * The cached value of the '{@link #getBindings() <em>Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<BindingAnn> bindings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputPatternAnnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnnotationsPackage.Literals.OUTPUT_PATTERN_ANN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getOutputPatternElement() {
		if (outputPatternElement != null && outputPatternElement.eIsProxy()) {
			InternalEObject oldOutputPatternElement = (InternalEObject)outputPatternElement;
			outputPatternElement = eResolveProxy(oldOutputPatternElement);
			if (outputPatternElement != oldOutputPatternElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnnotationsPackage.OUTPUT_PATTERN_ANN__OUTPUT_PATTERN_ELEMENT, oldOutputPatternElement, outputPatternElement));
			}
		}
		return outputPatternElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetOutputPatternElement() {
		return outputPatternElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputPatternElement(EObject newOutputPatternElement) {
		EObject oldOutputPatternElement = outputPatternElement;
		outputPatternElement = newOutputPatternElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsPackage.OUTPUT_PATTERN_ANN__OUTPUT_PATTERN_ELEMENT, oldOutputPatternElement, outputPatternElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Type)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnnotationsPackage.OUTPUT_PATTERN_ANN__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		Type oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsPackage.OUTPUT_PATTERN_ANN__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BindingAnn> getBindings() {
		if (bindings == null) {
			bindings = new EObjectContainmentEList<BindingAnn>(BindingAnn.class, this, AnnotationsPackage.OUTPUT_PATTERN_ANN__BINDINGS);
		}
		return bindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnnotationsPackage.OUTPUT_PATTERN_ANN__BINDINGS:
				return ((InternalEList<?>)getBindings()).basicRemove(otherEnd, msgs);
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
			case AnnotationsPackage.OUTPUT_PATTERN_ANN__OUTPUT_PATTERN_ELEMENT:
				if (resolve) return getOutputPatternElement();
				return basicGetOutputPatternElement();
			case AnnotationsPackage.OUTPUT_PATTERN_ANN__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case AnnotationsPackage.OUTPUT_PATTERN_ANN__BINDINGS:
				return getBindings();
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
			case AnnotationsPackage.OUTPUT_PATTERN_ANN__OUTPUT_PATTERN_ELEMENT:
				setOutputPatternElement((EObject)newValue);
				return;
			case AnnotationsPackage.OUTPUT_PATTERN_ANN__TYPE:
				setType((Type)newValue);
				return;
			case AnnotationsPackage.OUTPUT_PATTERN_ANN__BINDINGS:
				getBindings().clear();
				getBindings().addAll((Collection<? extends BindingAnn>)newValue);
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
			case AnnotationsPackage.OUTPUT_PATTERN_ANN__OUTPUT_PATTERN_ELEMENT:
				setOutputPatternElement((EObject)null);
				return;
			case AnnotationsPackage.OUTPUT_PATTERN_ANN__TYPE:
				setType((Type)null);
				return;
			case AnnotationsPackage.OUTPUT_PATTERN_ANN__BINDINGS:
				getBindings().clear();
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
			case AnnotationsPackage.OUTPUT_PATTERN_ANN__OUTPUT_PATTERN_ELEMENT:
				return outputPatternElement != null;
			case AnnotationsPackage.OUTPUT_PATTERN_ANN__TYPE:
				return type != null;
			case AnnotationsPackage.OUTPUT_PATTERN_ANN__BINDINGS:
				return bindings != null && !bindings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OutputPatternAnnImpl
