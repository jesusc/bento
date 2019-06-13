/**
 */
package scenes_bdsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import scenes_bdsl.BindingElement;
import scenes_bdsl.IntemediateElement;
import scenes_bdsl.MetamodelElement;
import scenes_bdsl.Scenes_bdslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intemediate Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link scenes_bdsl.impl.IntemediateElementImpl#getBindingElement <em>Binding Element</em>}</li>
 *   <li>{@link scenes_bdsl.impl.IntemediateElementImpl#getMetamodElelement <em>Metamod Elelement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntemediateElementImpl extends MinimalEObjectImpl.Container implements IntemediateElement {
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
	 * The cached value of the '{@link #getMetamodElelement() <em>Metamod Elelement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetamodElelement()
	 * @generated
	 * @ordered
	 */
	protected MetamodelElement metamodElelement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntemediateElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Scenes_bdslPackage.Literals.INTEMEDIATE_ELEMENT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Scenes_bdslPackage.INTEMEDIATE_ELEMENT__BINDING_ELEMENT, oldBindingElement, bindingElement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Scenes_bdslPackage.INTEMEDIATE_ELEMENT__BINDING_ELEMENT, oldBindingElement, bindingElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelElement getMetamodElelement() {
		if (metamodElelement != null && metamodElelement.eIsProxy()) {
			InternalEObject oldMetamodElelement = (InternalEObject)metamodElelement;
			metamodElelement = (MetamodelElement)eResolveProxy(oldMetamodElelement);
			if (metamodElelement != oldMetamodElelement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Scenes_bdslPackage.INTEMEDIATE_ELEMENT__METAMOD_ELELEMENT, oldMetamodElelement, metamodElelement));
			}
		}
		return metamodElelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelElement basicGetMetamodElelement() {
		return metamodElelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetamodElelement(MetamodelElement newMetamodElelement) {
		MetamodelElement oldMetamodElelement = metamodElelement;
		metamodElelement = newMetamodElelement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Scenes_bdslPackage.INTEMEDIATE_ELEMENT__METAMOD_ELELEMENT, oldMetamodElelement, metamodElelement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Scenes_bdslPackage.INTEMEDIATE_ELEMENT__BINDING_ELEMENT:
				if (resolve) return getBindingElement();
				return basicGetBindingElement();
			case Scenes_bdslPackage.INTEMEDIATE_ELEMENT__METAMOD_ELELEMENT:
				if (resolve) return getMetamodElelement();
				return basicGetMetamodElelement();
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
			case Scenes_bdslPackage.INTEMEDIATE_ELEMENT__BINDING_ELEMENT:
				setBindingElement((BindingElement)newValue);
				return;
			case Scenes_bdslPackage.INTEMEDIATE_ELEMENT__METAMOD_ELELEMENT:
				setMetamodElelement((MetamodelElement)newValue);
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
			case Scenes_bdslPackage.INTEMEDIATE_ELEMENT__BINDING_ELEMENT:
				setBindingElement((BindingElement)null);
				return;
			case Scenes_bdslPackage.INTEMEDIATE_ELEMENT__METAMOD_ELELEMENT:
				setMetamodElelement((MetamodelElement)null);
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
			case Scenes_bdslPackage.INTEMEDIATE_ELEMENT__BINDING_ELEMENT:
				return bindingElement != null;
			case Scenes_bdslPackage.INTEMEDIATE_ELEMENT__METAMOD_ELELEMENT:
				return metamodElelement != null;
		}
		return super.eIsSet(featureID);
	}

} //IntemediateElementImpl
