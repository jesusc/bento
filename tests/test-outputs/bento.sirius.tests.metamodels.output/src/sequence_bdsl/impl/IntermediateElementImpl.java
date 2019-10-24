/**
 */
package sequence_bdsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import sequence_bdsl.BindingElement;
import sequence_bdsl.IntermediateElement;
import sequence_bdsl.MetamodelElement;
import sequence_bdsl.Sequence_bdslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intermediate Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sequence_bdsl.impl.IntermediateElementImpl#getBindingElement <em>Binding Element</em>}</li>
 *   <li>{@link sequence_bdsl.impl.IntermediateElementImpl#getMetamodelElement <em>Metamodel Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntermediateElementImpl extends MinimalEObjectImpl.Container implements IntermediateElement {
	/**
	 * The cached value of the '{@link #getBindingElement() <em>Binding Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingElement()
	 * @generated
	 * @ordered
	 */
	protected BindingElement bindingElement;

	/**
	 * The cached value of the '{@link #getMetamodelElement() <em>Metamodel Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetamodelElement()
	 * @generated
	 * @ordered
	 */
	protected EList<MetamodelElement> metamodelElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntermediateElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Sequence_bdslPackage.Literals.INTERMEDIATE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingElement getBindingElement() {
		if (bindingElement != null && bindingElement.eIsProxy()) {
			InternalEObject oldBindingElement = (InternalEObject)bindingElement;
			bindingElement = (BindingElement)eResolveProxy(oldBindingElement);
			if (bindingElement != oldBindingElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Sequence_bdslPackage.INTERMEDIATE_ELEMENT__BINDING_ELEMENT, oldBindingElement, bindingElement));
			}
		}
		return bindingElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingElement basicGetBindingElement() {
		return bindingElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBindingElement(BindingElement newBindingElement) {
		BindingElement oldBindingElement = bindingElement;
		bindingElement = newBindingElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Sequence_bdslPackage.INTERMEDIATE_ELEMENT__BINDING_ELEMENT, oldBindingElement, bindingElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MetamodelElement> getMetamodelElement() {
		if (metamodelElement == null) {
			metamodelElement = new EObjectResolvingEList<MetamodelElement>(MetamodelElement.class, this, Sequence_bdslPackage.INTERMEDIATE_ELEMENT__METAMODEL_ELEMENT);
		}
		return metamodelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Sequence_bdslPackage.INTERMEDIATE_ELEMENT__BINDING_ELEMENT:
				if (resolve) return getBindingElement();
				return basicGetBindingElement();
			case Sequence_bdslPackage.INTERMEDIATE_ELEMENT__METAMODEL_ELEMENT:
				return getMetamodelElement();
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
			case Sequence_bdslPackage.INTERMEDIATE_ELEMENT__BINDING_ELEMENT:
				setBindingElement((BindingElement)newValue);
				return;
			case Sequence_bdslPackage.INTERMEDIATE_ELEMENT__METAMODEL_ELEMENT:
				getMetamodelElement().clear();
				getMetamodelElement().addAll((Collection<? extends MetamodelElement>)newValue);
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
			case Sequence_bdslPackage.INTERMEDIATE_ELEMENT__BINDING_ELEMENT:
				setBindingElement((BindingElement)null);
				return;
			case Sequence_bdslPackage.INTERMEDIATE_ELEMENT__METAMODEL_ELEMENT:
				getMetamodelElement().clear();
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
			case Sequence_bdslPackage.INTERMEDIATE_ELEMENT__BINDING_ELEMENT:
				return bindingElement != null;
			case Sequence_bdslPackage.INTERMEDIATE_ELEMENT__METAMODEL_ELEMENT:
				return metamodelElement != null && !metamodelElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IntermediateElementImpl
