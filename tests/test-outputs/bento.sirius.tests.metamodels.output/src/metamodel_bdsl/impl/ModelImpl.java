/**
 */
package metamodel_bdsl.impl;

import java.util.Collection;

import metamodel_bdsl.BindingAttribute;
import metamodel_bdsl.BindingElement;
import metamodel_bdsl.Component;
import metamodel_bdsl.Flow;
import metamodel_bdsl.IntermediateElement;
import metamodel_bdsl.MetamodelElement;
import metamodel_bdsl.MetamodelElementFeature;
import metamodel_bdsl.Metamodel_bdslPackage;
import metamodel_bdsl.Model;
import metamodel_bdsl.NoneElement;
import metamodel_bdsl.OrderOnStockThreshold;
import metamodel_bdsl.Query;
import metamodel_bdsl.VirtualAttribute;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metamodel_bdsl.impl.ModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.ModelImpl#getQuery <em>Query</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.ModelImpl#getOrderOnStockThreshold <em>Order On Stock Threshold</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.ModelImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.ModelImpl#getFlow <em>Flow</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.ModelImpl#getContainsNoneElement <em>Contains None Element</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.ModelImpl#getContainsBindingElement <em>Contains Binding Element</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.ModelImpl#getContainsIntermediateElement <em>Contains Intermediate Element</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.ModelImpl#getContainsMetamodelElement <em>Contains Metamodel Element</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.ModelImpl#getContainsMetamodelElementFeature <em>Contains Metamodel Element Feature</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.ModelImpl#getContainsBindingAttribute <em>Contains Binding Attribute</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.ModelImpl#getContainsVirtualAttribute <em>Contains Virtual Attribute</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.ModelImpl#getSourceMM <em>Source MM</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model {
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
	 * The cached value of the '{@link #getQuery() <em>Query</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuery()
	 * @generated
	 * @ordered
	 */
	protected EList<Query> query;

	/**
	 * The cached value of the '{@link #getOrderOnStockThreshold() <em>Order On Stock Threshold</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderOnStockThreshold()
	 * @generated
	 * @ordered
	 */
	protected EList<OrderOnStockThreshold> orderOnStockThreshold;

	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> component;

	/**
	 * The cached value of the '{@link #getFlow() <em>Flow</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlow()
	 * @generated
	 * @ordered
	 */
	protected EList<Flow> flow;

	/**
	 * The cached value of the '{@link #getContainsNoneElement() <em>Contains None Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsNoneElement()
	 * @generated
	 * @ordered
	 */
	protected EList<NoneElement> containsNoneElement;

	/**
	 * The cached value of the '{@link #getContainsBindingElement() <em>Contains Binding Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsBindingElement()
	 * @generated
	 * @ordered
	 */
	protected EList<BindingElement> containsBindingElement;

	/**
	 * The cached value of the '{@link #getContainsIntermediateElement() <em>Contains Intermediate Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsIntermediateElement()
	 * @generated
	 * @ordered
	 */
	protected EList<IntermediateElement> containsIntermediateElement;

	/**
	 * The cached value of the '{@link #getContainsMetamodelElement() <em>Contains Metamodel Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsMetamodelElement()
	 * @generated
	 * @ordered
	 */
	protected EList<MetamodelElement> containsMetamodelElement;

	/**
	 * The cached value of the '{@link #getContainsMetamodelElementFeature() <em>Contains Metamodel Element Feature</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsMetamodelElementFeature()
	 * @generated
	 * @ordered
	 */
	protected EList<MetamodelElementFeature> containsMetamodelElementFeature;

	/**
	 * The cached value of the '{@link #getContainsBindingAttribute() <em>Contains Binding Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsBindingAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<BindingAttribute> containsBindingAttribute;

	/**
	 * The cached value of the '{@link #getContainsVirtualAttribute() <em>Contains Virtual Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsVirtualAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<VirtualAttribute> containsVirtualAttribute;

	/**
	 * The default value of the '{@link #getSourceMM() <em>Source MM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceMM()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_MM_EDEFAULT = "http://www.example.org/metamodel_bdsl";

	/**
	 * The cached value of the '{@link #getSourceMM() <em>Source MM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceMM()
	 * @generated
	 * @ordered
	 */
	protected String sourceMM = SOURCE_MM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Metamodel_bdslPackage.Literals.MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Query> getQuery() {
		if (query == null) {
			query = new EObjectContainmentEList<Query>(Query.class, this, Metamodel_bdslPackage.MODEL__QUERY);
		}
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrderOnStockThreshold> getOrderOnStockThreshold() {
		if (orderOnStockThreshold == null) {
			orderOnStockThreshold = new EObjectContainmentEList<OrderOnStockThreshold>(OrderOnStockThreshold.class, this, Metamodel_bdslPackage.MODEL__ORDER_ON_STOCK_THRESHOLD);
		}
		return orderOnStockThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getComponent() {
		if (component == null) {
			component = new EObjectContainmentEList<Component>(Component.class, this, Metamodel_bdslPackage.MODEL__COMPONENT);
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Flow> getFlow() {
		if (flow == null) {
			flow = new EObjectContainmentEList<Flow>(Flow.class, this, Metamodel_bdslPackage.MODEL__FLOW);
		}
		return flow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NoneElement> getContainsNoneElement() {
		if (containsNoneElement == null) {
			containsNoneElement = new EObjectContainmentEList<NoneElement>(NoneElement.class, this, Metamodel_bdslPackage.MODEL__CONTAINS_NONE_ELEMENT);
		}
		return containsNoneElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BindingElement> getContainsBindingElement() {
		if (containsBindingElement == null) {
			containsBindingElement = new EObjectContainmentEList<BindingElement>(BindingElement.class, this, Metamodel_bdslPackage.MODEL__CONTAINS_BINDING_ELEMENT);
		}
		return containsBindingElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IntermediateElement> getContainsIntermediateElement() {
		if (containsIntermediateElement == null) {
			containsIntermediateElement = new EObjectContainmentEList<IntermediateElement>(IntermediateElement.class, this, Metamodel_bdslPackage.MODEL__CONTAINS_INTERMEDIATE_ELEMENT);
		}
		return containsIntermediateElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MetamodelElement> getContainsMetamodelElement() {
		if (containsMetamodelElement == null) {
			containsMetamodelElement = new EObjectContainmentEList<MetamodelElement>(MetamodelElement.class, this, Metamodel_bdslPackage.MODEL__CONTAINS_METAMODEL_ELEMENT);
		}
		return containsMetamodelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MetamodelElementFeature> getContainsMetamodelElementFeature() {
		if (containsMetamodelElementFeature == null) {
			containsMetamodelElementFeature = new EObjectContainmentEList<MetamodelElementFeature>(MetamodelElementFeature.class, this, Metamodel_bdslPackage.MODEL__CONTAINS_METAMODEL_ELEMENT_FEATURE);
		}
		return containsMetamodelElementFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BindingAttribute> getContainsBindingAttribute() {
		if (containsBindingAttribute == null) {
			containsBindingAttribute = new EObjectContainmentEList<BindingAttribute>(BindingAttribute.class, this, Metamodel_bdslPackage.MODEL__CONTAINS_BINDING_ATTRIBUTE);
		}
		return containsBindingAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VirtualAttribute> getContainsVirtualAttribute() {
		if (containsVirtualAttribute == null) {
			containsVirtualAttribute = new EObjectContainmentEList<VirtualAttribute>(VirtualAttribute.class, this, Metamodel_bdslPackage.MODEL__CONTAINS_VIRTUAL_ATTRIBUTE);
		}
		return containsVirtualAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceMM() {
		return sourceMM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceMM(String newSourceMM) {
		String oldSourceMM = sourceMM;
		sourceMM = newSourceMM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.MODEL__SOURCE_MM, oldSourceMM, sourceMM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Metamodel_bdslPackage.MODEL__QUERY:
				return ((InternalEList<?>)getQuery()).basicRemove(otherEnd, msgs);
			case Metamodel_bdslPackage.MODEL__ORDER_ON_STOCK_THRESHOLD:
				return ((InternalEList<?>)getOrderOnStockThreshold()).basicRemove(otherEnd, msgs);
			case Metamodel_bdslPackage.MODEL__COMPONENT:
				return ((InternalEList<?>)getComponent()).basicRemove(otherEnd, msgs);
			case Metamodel_bdslPackage.MODEL__FLOW:
				return ((InternalEList<?>)getFlow()).basicRemove(otherEnd, msgs);
			case Metamodel_bdslPackage.MODEL__CONTAINS_NONE_ELEMENT:
				return ((InternalEList<?>)getContainsNoneElement()).basicRemove(otherEnd, msgs);
			case Metamodel_bdslPackage.MODEL__CONTAINS_BINDING_ELEMENT:
				return ((InternalEList<?>)getContainsBindingElement()).basicRemove(otherEnd, msgs);
			case Metamodel_bdslPackage.MODEL__CONTAINS_INTERMEDIATE_ELEMENT:
				return ((InternalEList<?>)getContainsIntermediateElement()).basicRemove(otherEnd, msgs);
			case Metamodel_bdslPackage.MODEL__CONTAINS_METAMODEL_ELEMENT:
				return ((InternalEList<?>)getContainsMetamodelElement()).basicRemove(otherEnd, msgs);
			case Metamodel_bdslPackage.MODEL__CONTAINS_METAMODEL_ELEMENT_FEATURE:
				return ((InternalEList<?>)getContainsMetamodelElementFeature()).basicRemove(otherEnd, msgs);
			case Metamodel_bdslPackage.MODEL__CONTAINS_BINDING_ATTRIBUTE:
				return ((InternalEList<?>)getContainsBindingAttribute()).basicRemove(otherEnd, msgs);
			case Metamodel_bdslPackage.MODEL__CONTAINS_VIRTUAL_ATTRIBUTE:
				return ((InternalEList<?>)getContainsVirtualAttribute()).basicRemove(otherEnd, msgs);
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
			case Metamodel_bdslPackage.MODEL__NAME:
				return getName();
			case Metamodel_bdslPackage.MODEL__QUERY:
				return getQuery();
			case Metamodel_bdslPackage.MODEL__ORDER_ON_STOCK_THRESHOLD:
				return getOrderOnStockThreshold();
			case Metamodel_bdslPackage.MODEL__COMPONENT:
				return getComponent();
			case Metamodel_bdslPackage.MODEL__FLOW:
				return getFlow();
			case Metamodel_bdslPackage.MODEL__CONTAINS_NONE_ELEMENT:
				return getContainsNoneElement();
			case Metamodel_bdslPackage.MODEL__CONTAINS_BINDING_ELEMENT:
				return getContainsBindingElement();
			case Metamodel_bdslPackage.MODEL__CONTAINS_INTERMEDIATE_ELEMENT:
				return getContainsIntermediateElement();
			case Metamodel_bdslPackage.MODEL__CONTAINS_METAMODEL_ELEMENT:
				return getContainsMetamodelElement();
			case Metamodel_bdslPackage.MODEL__CONTAINS_METAMODEL_ELEMENT_FEATURE:
				return getContainsMetamodelElementFeature();
			case Metamodel_bdslPackage.MODEL__CONTAINS_BINDING_ATTRIBUTE:
				return getContainsBindingAttribute();
			case Metamodel_bdslPackage.MODEL__CONTAINS_VIRTUAL_ATTRIBUTE:
				return getContainsVirtualAttribute();
			case Metamodel_bdslPackage.MODEL__SOURCE_MM:
				return getSourceMM();
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
			case Metamodel_bdslPackage.MODEL__NAME:
				setName((String)newValue);
				return;
			case Metamodel_bdslPackage.MODEL__QUERY:
				getQuery().clear();
				getQuery().addAll((Collection<? extends Query>)newValue);
				return;
			case Metamodel_bdslPackage.MODEL__ORDER_ON_STOCK_THRESHOLD:
				getOrderOnStockThreshold().clear();
				getOrderOnStockThreshold().addAll((Collection<? extends OrderOnStockThreshold>)newValue);
				return;
			case Metamodel_bdslPackage.MODEL__COMPONENT:
				getComponent().clear();
				getComponent().addAll((Collection<? extends Component>)newValue);
				return;
			case Metamodel_bdslPackage.MODEL__FLOW:
				getFlow().clear();
				getFlow().addAll((Collection<? extends Flow>)newValue);
				return;
			case Metamodel_bdslPackage.MODEL__CONTAINS_NONE_ELEMENT:
				getContainsNoneElement().clear();
				getContainsNoneElement().addAll((Collection<? extends NoneElement>)newValue);
				return;
			case Metamodel_bdslPackage.MODEL__CONTAINS_BINDING_ELEMENT:
				getContainsBindingElement().clear();
				getContainsBindingElement().addAll((Collection<? extends BindingElement>)newValue);
				return;
			case Metamodel_bdslPackage.MODEL__CONTAINS_INTERMEDIATE_ELEMENT:
				getContainsIntermediateElement().clear();
				getContainsIntermediateElement().addAll((Collection<? extends IntermediateElement>)newValue);
				return;
			case Metamodel_bdslPackage.MODEL__CONTAINS_METAMODEL_ELEMENT:
				getContainsMetamodelElement().clear();
				getContainsMetamodelElement().addAll((Collection<? extends MetamodelElement>)newValue);
				return;
			case Metamodel_bdslPackage.MODEL__CONTAINS_METAMODEL_ELEMENT_FEATURE:
				getContainsMetamodelElementFeature().clear();
				getContainsMetamodelElementFeature().addAll((Collection<? extends MetamodelElementFeature>)newValue);
				return;
			case Metamodel_bdslPackage.MODEL__CONTAINS_BINDING_ATTRIBUTE:
				getContainsBindingAttribute().clear();
				getContainsBindingAttribute().addAll((Collection<? extends BindingAttribute>)newValue);
				return;
			case Metamodel_bdslPackage.MODEL__CONTAINS_VIRTUAL_ATTRIBUTE:
				getContainsVirtualAttribute().clear();
				getContainsVirtualAttribute().addAll((Collection<? extends VirtualAttribute>)newValue);
				return;
			case Metamodel_bdslPackage.MODEL__SOURCE_MM:
				setSourceMM((String)newValue);
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
			case Metamodel_bdslPackage.MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Metamodel_bdslPackage.MODEL__QUERY:
				getQuery().clear();
				return;
			case Metamodel_bdslPackage.MODEL__ORDER_ON_STOCK_THRESHOLD:
				getOrderOnStockThreshold().clear();
				return;
			case Metamodel_bdslPackage.MODEL__COMPONENT:
				getComponent().clear();
				return;
			case Metamodel_bdslPackage.MODEL__FLOW:
				getFlow().clear();
				return;
			case Metamodel_bdslPackage.MODEL__CONTAINS_NONE_ELEMENT:
				getContainsNoneElement().clear();
				return;
			case Metamodel_bdslPackage.MODEL__CONTAINS_BINDING_ELEMENT:
				getContainsBindingElement().clear();
				return;
			case Metamodel_bdslPackage.MODEL__CONTAINS_INTERMEDIATE_ELEMENT:
				getContainsIntermediateElement().clear();
				return;
			case Metamodel_bdslPackage.MODEL__CONTAINS_METAMODEL_ELEMENT:
				getContainsMetamodelElement().clear();
				return;
			case Metamodel_bdslPackage.MODEL__CONTAINS_METAMODEL_ELEMENT_FEATURE:
				getContainsMetamodelElementFeature().clear();
				return;
			case Metamodel_bdslPackage.MODEL__CONTAINS_BINDING_ATTRIBUTE:
				getContainsBindingAttribute().clear();
				return;
			case Metamodel_bdslPackage.MODEL__CONTAINS_VIRTUAL_ATTRIBUTE:
				getContainsVirtualAttribute().clear();
				return;
			case Metamodel_bdslPackage.MODEL__SOURCE_MM:
				setSourceMM(SOURCE_MM_EDEFAULT);
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
			case Metamodel_bdslPackage.MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Metamodel_bdslPackage.MODEL__QUERY:
				return query != null && !query.isEmpty();
			case Metamodel_bdslPackage.MODEL__ORDER_ON_STOCK_THRESHOLD:
				return orderOnStockThreshold != null && !orderOnStockThreshold.isEmpty();
			case Metamodel_bdslPackage.MODEL__COMPONENT:
				return component != null && !component.isEmpty();
			case Metamodel_bdslPackage.MODEL__FLOW:
				return flow != null && !flow.isEmpty();
			case Metamodel_bdslPackage.MODEL__CONTAINS_NONE_ELEMENT:
				return containsNoneElement != null && !containsNoneElement.isEmpty();
			case Metamodel_bdslPackage.MODEL__CONTAINS_BINDING_ELEMENT:
				return containsBindingElement != null && !containsBindingElement.isEmpty();
			case Metamodel_bdslPackage.MODEL__CONTAINS_INTERMEDIATE_ELEMENT:
				return containsIntermediateElement != null && !containsIntermediateElement.isEmpty();
			case Metamodel_bdslPackage.MODEL__CONTAINS_METAMODEL_ELEMENT:
				return containsMetamodelElement != null && !containsMetamodelElement.isEmpty();
			case Metamodel_bdslPackage.MODEL__CONTAINS_METAMODEL_ELEMENT_FEATURE:
				return containsMetamodelElementFeature != null && !containsMetamodelElementFeature.isEmpty();
			case Metamodel_bdslPackage.MODEL__CONTAINS_BINDING_ATTRIBUTE:
				return containsBindingAttribute != null && !containsBindingAttribute.isEmpty();
			case Metamodel_bdslPackage.MODEL__CONTAINS_VIRTUAL_ATTRIBUTE:
				return containsVirtualAttribute != null && !containsVirtualAttribute.isEmpty();
			case Metamodel_bdslPackage.MODEL__SOURCE_MM:
				return SOURCE_MM_EDEFAULT == null ? sourceMM != null : !SOURCE_MM_EDEFAULT.equals(sourceMM);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", SourceMM: ");
		result.append(sourceMM);
		result.append(')');
		return result.toString();
	}

} //ModelImpl
