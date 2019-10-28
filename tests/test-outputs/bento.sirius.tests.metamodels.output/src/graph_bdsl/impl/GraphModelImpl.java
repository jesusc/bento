/**
 */
package graph_bdsl.impl;

import graph_bdsl.BindingAttribute;
import graph_bdsl.BindingElement;
import graph_bdsl.Edge;
import graph_bdsl.GraphModel;
import graph_bdsl.Graph_bdslPackage;
import graph_bdsl.IntermediateElement;
import graph_bdsl.MetamodelElement;
import graph_bdsl.MetamodelElementFeature;
import graph_bdsl.Node;
import graph_bdsl.NoneElement;
import graph_bdsl.VirtualAttribute;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Graph Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graph_bdsl.impl.GraphModelImpl#getNode <em>Node</em>}</li>
 *   <li>{@link graph_bdsl.impl.GraphModelImpl#getEdge <em>Edge</em>}</li>
 *   <li>{@link graph_bdsl.impl.GraphModelImpl#getContainsNoneElement <em>Contains None Element</em>}</li>
 *   <li>{@link graph_bdsl.impl.GraphModelImpl#getContainsBindingElement <em>Contains Binding Element</em>}</li>
 *   <li>{@link graph_bdsl.impl.GraphModelImpl#getContainsIntermediateElement <em>Contains Intermediate Element</em>}</li>
 *   <li>{@link graph_bdsl.impl.GraphModelImpl#getContainsMetamodelElement <em>Contains Metamodel Element</em>}</li>
 *   <li>{@link graph_bdsl.impl.GraphModelImpl#getContainsMetamodelElementFeature <em>Contains Metamodel Element Feature</em>}</li>
 *   <li>{@link graph_bdsl.impl.GraphModelImpl#getContainsBindingAttribute <em>Contains Binding Attribute</em>}</li>
 *   <li>{@link graph_bdsl.impl.GraphModelImpl#getContainsVirtualAttribute <em>Contains Virtual Attribute</em>}</li>
 *   <li>{@link graph_bdsl.impl.GraphModelImpl#getSourceMM <em>Source MM</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphModelImpl extends MinimalEObjectImpl.Container implements GraphModel {
	/**
	 * The cached value of the '{@link #getNode() <em>Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> node;

	/**
	 * The cached value of the '{@link #getEdge() <em>Edge</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdge()
	 * @generated
	 * @ordered
	 */
	protected EList<Edge> edge;

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
	protected static final String SOURCE_MM_EDEFAULT = "http://bento/sirius/tests/graph_bdsl";

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
	protected GraphModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Graph_bdslPackage.Literals.GRAPH_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Node> getNode() {
		if (node == null) {
			node = new EObjectContainmentEList<Node>(Node.class, this, Graph_bdslPackage.GRAPH_MODEL__NODE);
		}
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Edge> getEdge() {
		if (edge == null) {
			edge = new EObjectContainmentEList<Edge>(Edge.class, this, Graph_bdslPackage.GRAPH_MODEL__EDGE);
		}
		return edge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NoneElement> getContainsNoneElement() {
		if (containsNoneElement == null) {
			containsNoneElement = new EObjectContainmentEList<NoneElement>(NoneElement.class, this, Graph_bdslPackage.GRAPH_MODEL__CONTAINS_NONE_ELEMENT);
		}
		return containsNoneElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BindingElement> getContainsBindingElement() {
		if (containsBindingElement == null) {
			containsBindingElement = new EObjectContainmentEList<BindingElement>(BindingElement.class, this, Graph_bdslPackage.GRAPH_MODEL__CONTAINS_BINDING_ELEMENT);
		}
		return containsBindingElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IntermediateElement> getContainsIntermediateElement() {
		if (containsIntermediateElement == null) {
			containsIntermediateElement = new EObjectContainmentEList<IntermediateElement>(IntermediateElement.class, this, Graph_bdslPackage.GRAPH_MODEL__CONTAINS_INTERMEDIATE_ELEMENT);
		}
		return containsIntermediateElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MetamodelElement> getContainsMetamodelElement() {
		if (containsMetamodelElement == null) {
			containsMetamodelElement = new EObjectContainmentEList<MetamodelElement>(MetamodelElement.class, this, Graph_bdslPackage.GRAPH_MODEL__CONTAINS_METAMODEL_ELEMENT);
		}
		return containsMetamodelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MetamodelElementFeature> getContainsMetamodelElementFeature() {
		if (containsMetamodelElementFeature == null) {
			containsMetamodelElementFeature = new EObjectContainmentEList<MetamodelElementFeature>(MetamodelElementFeature.class, this, Graph_bdslPackage.GRAPH_MODEL__CONTAINS_METAMODEL_ELEMENT_FEATURE);
		}
		return containsMetamodelElementFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BindingAttribute> getContainsBindingAttribute() {
		if (containsBindingAttribute == null) {
			containsBindingAttribute = new EObjectContainmentEList<BindingAttribute>(BindingAttribute.class, this, Graph_bdslPackage.GRAPH_MODEL__CONTAINS_BINDING_ATTRIBUTE);
		}
		return containsBindingAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VirtualAttribute> getContainsVirtualAttribute() {
		if (containsVirtualAttribute == null) {
			containsVirtualAttribute = new EObjectContainmentEList<VirtualAttribute>(VirtualAttribute.class, this, Graph_bdslPackage.GRAPH_MODEL__CONTAINS_VIRTUAL_ATTRIBUTE);
		}
		return containsVirtualAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSourceMM() {
		return sourceMM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceMM(String newSourceMM) {
		String oldSourceMM = sourceMM;
		sourceMM = newSourceMM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graph_bdslPackage.GRAPH_MODEL__SOURCE_MM, oldSourceMM, sourceMM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Graph_bdslPackage.GRAPH_MODEL__NODE:
				return ((InternalEList<?>)getNode()).basicRemove(otherEnd, msgs);
			case Graph_bdslPackage.GRAPH_MODEL__EDGE:
				return ((InternalEList<?>)getEdge()).basicRemove(otherEnd, msgs);
			case Graph_bdslPackage.GRAPH_MODEL__CONTAINS_NONE_ELEMENT:
				return ((InternalEList<?>)getContainsNoneElement()).basicRemove(otherEnd, msgs);
			case Graph_bdslPackage.GRAPH_MODEL__CONTAINS_BINDING_ELEMENT:
				return ((InternalEList<?>)getContainsBindingElement()).basicRemove(otherEnd, msgs);
			case Graph_bdslPackage.GRAPH_MODEL__CONTAINS_INTERMEDIATE_ELEMENT:
				return ((InternalEList<?>)getContainsIntermediateElement()).basicRemove(otherEnd, msgs);
			case Graph_bdslPackage.GRAPH_MODEL__CONTAINS_METAMODEL_ELEMENT:
				return ((InternalEList<?>)getContainsMetamodelElement()).basicRemove(otherEnd, msgs);
			case Graph_bdslPackage.GRAPH_MODEL__CONTAINS_METAMODEL_ELEMENT_FEATURE:
				return ((InternalEList<?>)getContainsMetamodelElementFeature()).basicRemove(otherEnd, msgs);
			case Graph_bdslPackage.GRAPH_MODEL__CONTAINS_BINDING_ATTRIBUTE:
				return ((InternalEList<?>)getContainsBindingAttribute()).basicRemove(otherEnd, msgs);
			case Graph_bdslPackage.GRAPH_MODEL__CONTAINS_VIRTUAL_ATTRIBUTE:
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
			case Graph_bdslPackage.GRAPH_MODEL__NODE:
				return getNode();
			case Graph_bdslPackage.GRAPH_MODEL__EDGE:
				return getEdge();
			case Graph_bdslPackage.GRAPH_MODEL__CONTAINS_NONE_ELEMENT:
				return getContainsNoneElement();
			case Graph_bdslPackage.GRAPH_MODEL__CONTAINS_BINDING_ELEMENT:
				return getContainsBindingElement();
			case Graph_bdslPackage.GRAPH_MODEL__CONTAINS_INTERMEDIATE_ELEMENT:
				return getContainsIntermediateElement();
			case Graph_bdslPackage.GRAPH_MODEL__CONTAINS_METAMODEL_ELEMENT:
				return getContainsMetamodelElement();
			case Graph_bdslPackage.GRAPH_MODEL__CONTAINS_METAMODEL_ELEMENT_FEATURE:
				return getContainsMetamodelElementFeature();
			case Graph_bdslPackage.GRAPH_MODEL__CONTAINS_BINDING_ATTRIBUTE:
				return getContainsBindingAttribute();
			case Graph_bdslPackage.GRAPH_MODEL__CONTAINS_VIRTUAL_ATTRIBUTE:
				return getContainsVirtualAttribute();
			case Graph_bdslPackage.GRAPH_MODEL__SOURCE_MM:
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
			case Graph_bdslPackage.GRAPH_MODEL__NODE:
				getNode().clear();
				getNode().addAll((Collection<? extends Node>)newValue);
				return;
			case Graph_bdslPackage.GRAPH_MODEL__EDGE:
				getEdge().clear();
				getEdge().addAll((Collection<? extends Edge>)newValue);
				return;
			case Graph_bdslPackage.GRAPH_MODEL__CONTAINS_NONE_ELEMENT:
				getContainsNoneElement().clear();
				getContainsNoneElement().addAll((Collection<? extends NoneElement>)newValue);
				return;
			case Graph_bdslPackage.GRAPH_MODEL__CONTAINS_BINDING_ELEMENT:
				getContainsBindingElement().clear();
				getContainsBindingElement().addAll((Collection<? extends BindingElement>)newValue);
				return;
			case Graph_bdslPackage.GRAPH_MODEL__CONTAINS_INTERMEDIATE_ELEMENT:
				getContainsIntermediateElement().clear();
				getContainsIntermediateElement().addAll((Collection<? extends IntermediateElement>)newValue);
				return;
			case Graph_bdslPackage.GRAPH_MODEL__CONTAINS_METAMODEL_ELEMENT:
				getContainsMetamodelElement().clear();
				getContainsMetamodelElement().addAll((Collection<? extends MetamodelElement>)newValue);
				return;
			case Graph_bdslPackage.GRAPH_MODEL__CONTAINS_METAMODEL_ELEMENT_FEATURE:
				getContainsMetamodelElementFeature().clear();
				getContainsMetamodelElementFeature().addAll((Collection<? extends MetamodelElementFeature>)newValue);
				return;
			case Graph_bdslPackage.GRAPH_MODEL__CONTAINS_BINDING_ATTRIBUTE:
				getContainsBindingAttribute().clear();
				getContainsBindingAttribute().addAll((Collection<? extends BindingAttribute>)newValue);
				return;
			case Graph_bdslPackage.GRAPH_MODEL__CONTAINS_VIRTUAL_ATTRIBUTE:
				getContainsVirtualAttribute().clear();
				getContainsVirtualAttribute().addAll((Collection<? extends VirtualAttribute>)newValue);
				return;
			case Graph_bdslPackage.GRAPH_MODEL__SOURCE_MM:
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
			case Graph_bdslPackage.GRAPH_MODEL__NODE:
				getNode().clear();
				return;
			case Graph_bdslPackage.GRAPH_MODEL__EDGE:
				getEdge().clear();
				return;
			case Graph_bdslPackage.GRAPH_MODEL__CONTAINS_NONE_ELEMENT:
				getContainsNoneElement().clear();
				return;
			case Graph_bdslPackage.GRAPH_MODEL__CONTAINS_BINDING_ELEMENT:
				getContainsBindingElement().clear();
				return;
			case Graph_bdslPackage.GRAPH_MODEL__CONTAINS_INTERMEDIATE_ELEMENT:
				getContainsIntermediateElement().clear();
				return;
			case Graph_bdslPackage.GRAPH_MODEL__CONTAINS_METAMODEL_ELEMENT:
				getContainsMetamodelElement().clear();
				return;
			case Graph_bdslPackage.GRAPH_MODEL__CONTAINS_METAMODEL_ELEMENT_FEATURE:
				getContainsMetamodelElementFeature().clear();
				return;
			case Graph_bdslPackage.GRAPH_MODEL__CONTAINS_BINDING_ATTRIBUTE:
				getContainsBindingAttribute().clear();
				return;
			case Graph_bdslPackage.GRAPH_MODEL__CONTAINS_VIRTUAL_ATTRIBUTE:
				getContainsVirtualAttribute().clear();
				return;
			case Graph_bdslPackage.GRAPH_MODEL__SOURCE_MM:
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
			case Graph_bdslPackage.GRAPH_MODEL__NODE:
				return node != null && !node.isEmpty();
			case Graph_bdslPackage.GRAPH_MODEL__EDGE:
				return edge != null && !edge.isEmpty();
			case Graph_bdslPackage.GRAPH_MODEL__CONTAINS_NONE_ELEMENT:
				return containsNoneElement != null && !containsNoneElement.isEmpty();
			case Graph_bdslPackage.GRAPH_MODEL__CONTAINS_BINDING_ELEMENT:
				return containsBindingElement != null && !containsBindingElement.isEmpty();
			case Graph_bdslPackage.GRAPH_MODEL__CONTAINS_INTERMEDIATE_ELEMENT:
				return containsIntermediateElement != null && !containsIntermediateElement.isEmpty();
			case Graph_bdslPackage.GRAPH_MODEL__CONTAINS_METAMODEL_ELEMENT:
				return containsMetamodelElement != null && !containsMetamodelElement.isEmpty();
			case Graph_bdslPackage.GRAPH_MODEL__CONTAINS_METAMODEL_ELEMENT_FEATURE:
				return containsMetamodelElementFeature != null && !containsMetamodelElementFeature.isEmpty();
			case Graph_bdslPackage.GRAPH_MODEL__CONTAINS_BINDING_ATTRIBUTE:
				return containsBindingAttribute != null && !containsBindingAttribute.isEmpty();
			case Graph_bdslPackage.GRAPH_MODEL__CONTAINS_VIRTUAL_ATTRIBUTE:
				return containsVirtualAttribute != null && !containsVirtualAttribute.isEmpty();
			case Graph_bdslPackage.GRAPH_MODEL__SOURCE_MM:
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
		result.append(" (SourceMM: ");
		result.append(sourceMM);
		result.append(')');
		return result.toString();
	}

} //GraphModelImpl
