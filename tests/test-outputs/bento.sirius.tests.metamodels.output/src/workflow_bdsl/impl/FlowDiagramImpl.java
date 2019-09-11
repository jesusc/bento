/**
 */
package workflow_bdsl.impl;

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

import workflow_bdsl.BindingAttribute;
import workflow_bdsl.BindingElement;
import workflow_bdsl.FlowDiagram;
import workflow_bdsl.FlowEdge;
import workflow_bdsl.IntermediateElement;
import workflow_bdsl.MetamodelElement;
import workflow_bdsl.MetamodelElementFeature;
import workflow_bdsl.Node;
import workflow_bdsl.NoneElement;
import workflow_bdsl.VirtualAttribute;
import workflow_bdsl.Workflow_bdslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link workflow_bdsl.impl.FlowDiagramImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link workflow_bdsl.impl.FlowDiagramImpl#getEdges <em>Edges</em>}</li>
 *   <li>{@link workflow_bdsl.impl.FlowDiagramImpl#isIsFinalMandatory <em>Is Final Mandatory</em>}</li>
 *   <li>{@link workflow_bdsl.impl.FlowDiagramImpl#getContainsNoneElement <em>Contains None Element</em>}</li>
 *   <li>{@link workflow_bdsl.impl.FlowDiagramImpl#getContainsBindingElement <em>Contains Binding Element</em>}</li>
 *   <li>{@link workflow_bdsl.impl.FlowDiagramImpl#getContainsIntermediateElement <em>Contains Intermediate Element</em>}</li>
 *   <li>{@link workflow_bdsl.impl.FlowDiagramImpl#getContainsMetamodelElement <em>Contains Metamodel Element</em>}</li>
 *   <li>{@link workflow_bdsl.impl.FlowDiagramImpl#getContainsMetamodelElementFeature <em>Contains Metamodel Element Feature</em>}</li>
 *   <li>{@link workflow_bdsl.impl.FlowDiagramImpl#getContainsBindingAttribute <em>Contains Binding Attribute</em>}</li>
 *   <li>{@link workflow_bdsl.impl.FlowDiagramImpl#getContainsVirtualAttribute <em>Contains Virtual Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlowDiagramImpl extends MinimalEObjectImpl.Container implements FlowDiagram {
	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> nodes;

	/**
	 * The cached value of the '{@link #getEdges() <em>Edges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<FlowEdge> edges;

	/**
	 * The default value of the '{@link #isIsFinalMandatory() <em>Is Final Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFinalMandatory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FINAL_MANDATORY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsFinalMandatory() <em>Is Final Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFinalMandatory()
	 * @generated
	 * @ordered
	 */
	protected boolean isFinalMandatory = IS_FINAL_MANDATORY_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Workflow_bdslPackage.Literals.FLOW_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentEList<Node>(Node.class, this, Workflow_bdslPackage.FLOW_DIAGRAM__NODES);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FlowEdge> getEdges() {
		if (edges == null) {
			edges = new EObjectContainmentEList<FlowEdge>(FlowEdge.class, this, Workflow_bdslPackage.FLOW_DIAGRAM__EDGES);
		}
		return edges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsFinalMandatory() {
		return isFinalMandatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFinalMandatory(boolean newIsFinalMandatory) {
		boolean oldIsFinalMandatory = isFinalMandatory;
		isFinalMandatory = newIsFinalMandatory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Workflow_bdslPackage.FLOW_DIAGRAM__IS_FINAL_MANDATORY, oldIsFinalMandatory, isFinalMandatory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NoneElement> getContainsNoneElement() {
		if (containsNoneElement == null) {
			containsNoneElement = new EObjectContainmentEList<NoneElement>(NoneElement.class, this, Workflow_bdslPackage.FLOW_DIAGRAM__CONTAINS_NONE_ELEMENT);
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
			containsBindingElement = new EObjectContainmentEList<BindingElement>(BindingElement.class, this, Workflow_bdslPackage.FLOW_DIAGRAM__CONTAINS_BINDING_ELEMENT);
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
			containsIntermediateElement = new EObjectContainmentEList<IntermediateElement>(IntermediateElement.class, this, Workflow_bdslPackage.FLOW_DIAGRAM__CONTAINS_INTERMEDIATE_ELEMENT);
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
			containsMetamodelElement = new EObjectContainmentEList<MetamodelElement>(MetamodelElement.class, this, Workflow_bdslPackage.FLOW_DIAGRAM__CONTAINS_METAMODEL_ELEMENT);
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
			containsMetamodelElementFeature = new EObjectContainmentEList<MetamodelElementFeature>(MetamodelElementFeature.class, this, Workflow_bdslPackage.FLOW_DIAGRAM__CONTAINS_METAMODEL_ELEMENT_FEATURE);
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
			containsBindingAttribute = new EObjectContainmentEList<BindingAttribute>(BindingAttribute.class, this, Workflow_bdslPackage.FLOW_DIAGRAM__CONTAINS_BINDING_ATTRIBUTE);
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
			containsVirtualAttribute = new EObjectContainmentEList<VirtualAttribute>(VirtualAttribute.class, this, Workflow_bdslPackage.FLOW_DIAGRAM__CONTAINS_VIRTUAL_ATTRIBUTE);
		}
		return containsVirtualAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Workflow_bdslPackage.FLOW_DIAGRAM__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
			case Workflow_bdslPackage.FLOW_DIAGRAM__EDGES:
				return ((InternalEList<?>)getEdges()).basicRemove(otherEnd, msgs);
			case Workflow_bdslPackage.FLOW_DIAGRAM__CONTAINS_NONE_ELEMENT:
				return ((InternalEList<?>)getContainsNoneElement()).basicRemove(otherEnd, msgs);
			case Workflow_bdslPackage.FLOW_DIAGRAM__CONTAINS_BINDING_ELEMENT:
				return ((InternalEList<?>)getContainsBindingElement()).basicRemove(otherEnd, msgs);
			case Workflow_bdslPackage.FLOW_DIAGRAM__CONTAINS_INTERMEDIATE_ELEMENT:
				return ((InternalEList<?>)getContainsIntermediateElement()).basicRemove(otherEnd, msgs);
			case Workflow_bdslPackage.FLOW_DIAGRAM__CONTAINS_METAMODEL_ELEMENT:
				return ((InternalEList<?>)getContainsMetamodelElement()).basicRemove(otherEnd, msgs);
			case Workflow_bdslPackage.FLOW_DIAGRAM__CONTAINS_METAMODEL_ELEMENT_FEATURE:
				return ((InternalEList<?>)getContainsMetamodelElementFeature()).basicRemove(otherEnd, msgs);
			case Workflow_bdslPackage.FLOW_DIAGRAM__CONTAINS_BINDING_ATTRIBUTE:
				return ((InternalEList<?>)getContainsBindingAttribute()).basicRemove(otherEnd, msgs);
			case Workflow_bdslPackage.FLOW_DIAGRAM__CONTAINS_VIRTUAL_ATTRIBUTE:
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
			case Workflow_bdslPackage.FLOW_DIAGRAM__NODES:
				return getNodes();
			case Workflow_bdslPackage.FLOW_DIAGRAM__EDGES:
				return getEdges();
			case Workflow_bdslPackage.FLOW_DIAGRAM__IS_FINAL_MANDATORY:
				return isIsFinalMandatory();
			case Workflow_bdslPackage.FLOW_DIAGRAM__CONTAINS_NONE_ELEMENT:
				return getContainsNoneElement();
			case Workflow_bdslPackage.FLOW_DIAGRAM__CONTAINS_BINDING_ELEMENT:
				return getContainsBindingElement();
			case Workflow_bdslPackage.FLOW_DIAGRAM__CONTAINS_INTERMEDIATE_ELEMENT:
				return getContainsIntermediateElement();
			case Workflow_bdslPackage.FLOW_DIAGRAM__CONTAINS_METAMODEL_ELEMENT:
				return getContainsMetamodelElement();
			case Workflow_bdslPackage.FLOW_DIAGRAM__CONTAINS_METAMODEL_ELEMENT_FEATURE:
				return getContainsMetamodelElementFeature();
			case Workflow_bdslPackage.FLOW_DIAGRAM__CONTAINS_BINDING_ATTRIBUTE:
				return getContainsBindingAttribute();
			case Workflow_bdslPackage.FLOW_DIAGRAM__CONTAINS_VIRTUAL_ATTRIBUTE:
				return getContainsVirtualAttribute();
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
			case Workflow_bdslPackage.FLOW_DIAGRAM__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends Node>)newValue);
				return;
			case Workflow_bdslPackage.FLOW_DIAGRAM__EDGES:
				getEdges().clear();
				getEdges().addAll((Collection<? extends FlowEdge>)newValue);
				return;
			case Workflow_bdslPackage.FLOW_DIAGRAM__IS_FINAL_MANDATORY:
				setIsFinalMandatory((Boolean)newValue);
				return;
			case Workflow_bdslPackage.FLOW_DIAGRAM__CONTAINS_NONE_ELEMENT:
				getContainsNoneElement().clear();
				getContainsNoneElement().addAll((Collection<? extends NoneElement>)newValue);
				return;
			case Workflow_bdslPackage.FLOW_DIAGRAM__CONTAINS_BINDING_ELEMENT:
				getContainsBindingElement().clear();
				getContainsBindingElement().addAll((Collection<? extends BindingElement>)newValue);
				return;
			case Workflow_bdslPackage.FLOW_DIAGRAM__CONTAINS_INTERMEDIATE_ELEMENT:
				getContainsIntermediateElement().clear();
				getContainsIntermediateElement().addAll((Collection<? extends IntermediateElement>)newValue);
				return;
			case Workflow_bdslPackage.FLOW_DIAGRAM__CONTAINS_METAMODEL_ELEMENT:
				getContainsMetamodelElement().clear();
				getContainsMetamodelElement().addAll((Collection<? extends MetamodelElement>)newValue);
				return;
			case Workflow_bdslPackage.FLOW_DIAGRAM__CONTAINS_METAMODEL_ELEMENT_FEATURE:
				getContainsMetamodelElementFeature().clear();
				getContainsMetamodelElementFeature().addAll((Collection<? extends MetamodelElementFeature>)newValue);
				return;
			case Workflow_bdslPackage.FLOW_DIAGRAM__CONTAINS_BINDING_ATTRIBUTE:
				getContainsBindingAttribute().clear();
				getContainsBindingAttribute().addAll((Collection<? extends BindingAttribute>)newValue);
				return;
			case Workflow_bdslPackage.FLOW_DIAGRAM__CONTAINS_VIRTUAL_ATTRIBUTE:
				getContainsVirtualAttribute().clear();
				getContainsVirtualAttribute().addAll((Collection<? extends VirtualAttribute>)newValue);
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
			case Workflow_bdslPackage.FLOW_DIAGRAM__NODES:
				getNodes().clear();
				return;
			case Workflow_bdslPackage.FLOW_DIAGRAM__EDGES:
				getEdges().clear();
				return;
			case Workflow_bdslPackage.FLOW_DIAGRAM__IS_FINAL_MANDATORY:
				setIsFinalMandatory(IS_FINAL_MANDATORY_EDEFAULT);
				return;
			case Workflow_bdslPackage.FLOW_DIAGRAM__CONTAINS_NONE_ELEMENT:
				getContainsNoneElement().clear();
				return;
			case Workflow_bdslPackage.FLOW_DIAGRAM__CONTAINS_BINDING_ELEMENT:
				getContainsBindingElement().clear();
				return;
			case Workflow_bdslPackage.FLOW_DIAGRAM__CONTAINS_INTERMEDIATE_ELEMENT:
				getContainsIntermediateElement().clear();
				return;
			case Workflow_bdslPackage.FLOW_DIAGRAM__CONTAINS_METAMODEL_ELEMENT:
				getContainsMetamodelElement().clear();
				return;
			case Workflow_bdslPackage.FLOW_DIAGRAM__CONTAINS_METAMODEL_ELEMENT_FEATURE:
				getContainsMetamodelElementFeature().clear();
				return;
			case Workflow_bdslPackage.FLOW_DIAGRAM__CONTAINS_BINDING_ATTRIBUTE:
				getContainsBindingAttribute().clear();
				return;
			case Workflow_bdslPackage.FLOW_DIAGRAM__CONTAINS_VIRTUAL_ATTRIBUTE:
				getContainsVirtualAttribute().clear();
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
			case Workflow_bdslPackage.FLOW_DIAGRAM__NODES:
				return nodes != null && !nodes.isEmpty();
			case Workflow_bdslPackage.FLOW_DIAGRAM__EDGES:
				return edges != null && !edges.isEmpty();
			case Workflow_bdslPackage.FLOW_DIAGRAM__IS_FINAL_MANDATORY:
				return isFinalMandatory != IS_FINAL_MANDATORY_EDEFAULT;
			case Workflow_bdslPackage.FLOW_DIAGRAM__CONTAINS_NONE_ELEMENT:
				return containsNoneElement != null && !containsNoneElement.isEmpty();
			case Workflow_bdslPackage.FLOW_DIAGRAM__CONTAINS_BINDING_ELEMENT:
				return containsBindingElement != null && !containsBindingElement.isEmpty();
			case Workflow_bdslPackage.FLOW_DIAGRAM__CONTAINS_INTERMEDIATE_ELEMENT:
				return containsIntermediateElement != null && !containsIntermediateElement.isEmpty();
			case Workflow_bdslPackage.FLOW_DIAGRAM__CONTAINS_METAMODEL_ELEMENT:
				return containsMetamodelElement != null && !containsMetamodelElement.isEmpty();
			case Workflow_bdslPackage.FLOW_DIAGRAM__CONTAINS_METAMODEL_ELEMENT_FEATURE:
				return containsMetamodelElementFeature != null && !containsMetamodelElementFeature.isEmpty();
			case Workflow_bdslPackage.FLOW_DIAGRAM__CONTAINS_BINDING_ATTRIBUTE:
				return containsBindingAttribute != null && !containsBindingAttribute.isEmpty();
			case Workflow_bdslPackage.FLOW_DIAGRAM__CONTAINS_VIRTUAL_ATTRIBUTE:
				return containsVirtualAttribute != null && !containsVirtualAttribute.isEmpty();
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
		result.append(" (isFinalMandatory: ");
		result.append(isFinalMandatory);
		result.append(')');
		return result.toString();
	}

} //FlowDiagramImpl
