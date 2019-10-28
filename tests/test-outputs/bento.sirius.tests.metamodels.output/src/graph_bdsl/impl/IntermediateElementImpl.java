/**
 */
package graph_bdsl.impl;

import graph_bdsl.BindingElement;
import graph_bdsl.Graph_bdslPackage;
import graph_bdsl.IntermediateElement;
import graph_bdsl.MetamodelElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intermediate Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graph_bdsl.impl.IntermediateElementImpl#getBindingElement <em>Binding Element</em>}</li>
 *   <li>{@link graph_bdsl.impl.IntermediateElementImpl#getMetamodelElement <em>Metamodel Element</em>}</li>
 *   <li>{@link graph_bdsl.impl.IntermediateElementImpl#getId_target <em>Id target</em>}</li>
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
	 * The default value of the '{@link #getId_target() <em>Id target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId_target()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_TARGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId_target() <em>Id target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId_target()
	 * @generated
	 * @ordered
	 */
	protected String id_target = ID_TARGET_EDEFAULT;

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
		return Graph_bdslPackage.Literals.INTERMEDIATE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BindingElement getBindingElement() {
		if (bindingElement != null && bindingElement.eIsProxy()) {
			InternalEObject oldBindingElement = (InternalEObject)bindingElement;
			bindingElement = (BindingElement)eResolveProxy(oldBindingElement);
			if (bindingElement != oldBindingElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Graph_bdslPackage.INTERMEDIATE_ELEMENT__BINDING_ELEMENT, oldBindingElement, bindingElement));
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
	@Override
	public void setBindingElement(BindingElement newBindingElement) {
		BindingElement oldBindingElement = bindingElement;
		bindingElement = newBindingElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graph_bdslPackage.INTERMEDIATE_ELEMENT__BINDING_ELEMENT, oldBindingElement, bindingElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MetamodelElement> getMetamodelElement() {
		if (metamodelElement == null) {
			metamodelElement = new EObjectResolvingEList<MetamodelElement>(MetamodelElement.class, this, Graph_bdslPackage.INTERMEDIATE_ELEMENT__METAMODEL_ELEMENT);
		}
		return metamodelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId_target() {
		return id_target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId_target(String newId_target) {
		String oldId_target = id_target;
		id_target = newId_target;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graph_bdslPackage.INTERMEDIATE_ELEMENT__ID_TARGET, oldId_target, id_target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Graph_bdslPackage.INTERMEDIATE_ELEMENT__BINDING_ELEMENT:
				if (resolve) return getBindingElement();
				return basicGetBindingElement();
			case Graph_bdslPackage.INTERMEDIATE_ELEMENT__METAMODEL_ELEMENT:
				return getMetamodelElement();
			case Graph_bdslPackage.INTERMEDIATE_ELEMENT__ID_TARGET:
				return getId_target();
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
			case Graph_bdslPackage.INTERMEDIATE_ELEMENT__BINDING_ELEMENT:
				setBindingElement((BindingElement)newValue);
				return;
			case Graph_bdslPackage.INTERMEDIATE_ELEMENT__METAMODEL_ELEMENT:
				getMetamodelElement().clear();
				getMetamodelElement().addAll((Collection<? extends MetamodelElement>)newValue);
				return;
			case Graph_bdslPackage.INTERMEDIATE_ELEMENT__ID_TARGET:
				setId_target((String)newValue);
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
			case Graph_bdslPackage.INTERMEDIATE_ELEMENT__BINDING_ELEMENT:
				setBindingElement((BindingElement)null);
				return;
			case Graph_bdslPackage.INTERMEDIATE_ELEMENT__METAMODEL_ELEMENT:
				getMetamodelElement().clear();
				return;
			case Graph_bdslPackage.INTERMEDIATE_ELEMENT__ID_TARGET:
				setId_target(ID_TARGET_EDEFAULT);
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
			case Graph_bdslPackage.INTERMEDIATE_ELEMENT__BINDING_ELEMENT:
				return bindingElement != null;
			case Graph_bdslPackage.INTERMEDIATE_ELEMENT__METAMODEL_ELEMENT:
				return metamodelElement != null && !metamodelElement.isEmpty();
			case Graph_bdslPackage.INTERMEDIATE_ELEMENT__ID_TARGET:
				return ID_TARGET_EDEFAULT == null ? id_target != null : !ID_TARGET_EDEFAULT.equals(id_target);
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id_target: ");
		result.append(id_target);
		result.append(')');
		return result.toString();
	}

} //IntermediateElementImpl
