/**
 */
package graph_bdsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graph_bdsl.GraphModel#getNode <em>Node</em>}</li>
 *   <li>{@link graph_bdsl.GraphModel#getEdge <em>Edge</em>}</li>
 *   <li>{@link graph_bdsl.GraphModel#getContainsNoneElement <em>Contains None Element</em>}</li>
 *   <li>{@link graph_bdsl.GraphModel#getContainsBindingElement <em>Contains Binding Element</em>}</li>
 *   <li>{@link graph_bdsl.GraphModel#getContainsIntermediateElement <em>Contains Intermediate Element</em>}</li>
 *   <li>{@link graph_bdsl.GraphModel#getContainsMetamodelElement <em>Contains Metamodel Element</em>}</li>
 *   <li>{@link graph_bdsl.GraphModel#getContainsMetamodelElementFeature <em>Contains Metamodel Element Feature</em>}</li>
 *   <li>{@link graph_bdsl.GraphModel#getContainsBindingAttribute <em>Contains Binding Attribute</em>}</li>
 *   <li>{@link graph_bdsl.GraphModel#getContainsVirtualAttribute <em>Contains Virtual Attribute</em>}</li>
 *   <li>{@link graph_bdsl.GraphModel#getSourceMM <em>Source MM</em>}</li>
 * </ul>
 *
 * @see graph_bdsl.Graph_bdslPackage#getGraphModel()
 * @model
 * @generated
 */
public interface GraphModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Node</b></em>' containment reference list.
	 * The list contents are of type {@link graph_bdsl.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' containment reference list.
	 * @see graph_bdsl.Graph_bdslPackage#getGraphModel_Node()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getNode();

	/**
	 * Returns the value of the '<em><b>Edge</b></em>' containment reference list.
	 * The list contents are of type {@link graph_bdsl.Edge}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge</em>' containment reference list.
	 * @see graph_bdsl.Graph_bdslPackage#getGraphModel_Edge()
	 * @model containment="true"
	 * @generated
	 */
	EList<Edge> getEdge();

	/**
	 * Returns the value of the '<em><b>Contains None Element</b></em>' containment reference list.
	 * The list contents are of type {@link graph_bdsl.NoneElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains None Element</em>' containment reference list.
	 * @see graph_bdsl.Graph_bdslPackage#getGraphModel_ContainsNoneElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<NoneElement> getContainsNoneElement();

	/**
	 * Returns the value of the '<em><b>Contains Binding Element</b></em>' containment reference list.
	 * The list contents are of type {@link graph_bdsl.BindingElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Binding Element</em>' containment reference list.
	 * @see graph_bdsl.Graph_bdslPackage#getGraphModel_ContainsBindingElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<BindingElement> getContainsBindingElement();

	/**
	 * Returns the value of the '<em><b>Contains Intermediate Element</b></em>' containment reference list.
	 * The list contents are of type {@link graph_bdsl.IntermediateElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Intermediate Element</em>' containment reference list.
	 * @see graph_bdsl.Graph_bdslPackage#getGraphModel_ContainsIntermediateElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<IntermediateElement> getContainsIntermediateElement();

	/**
	 * Returns the value of the '<em><b>Contains Metamodel Element</b></em>' containment reference list.
	 * The list contents are of type {@link graph_bdsl.MetamodelElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Metamodel Element</em>' containment reference list.
	 * @see graph_bdsl.Graph_bdslPackage#getGraphModel_ContainsMetamodelElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<MetamodelElement> getContainsMetamodelElement();

	/**
	 * Returns the value of the '<em><b>Contains Metamodel Element Feature</b></em>' containment reference list.
	 * The list contents are of type {@link graph_bdsl.MetamodelElementFeature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Metamodel Element Feature</em>' containment reference list.
	 * @see graph_bdsl.Graph_bdslPackage#getGraphModel_ContainsMetamodelElementFeature()
	 * @model containment="true"
	 * @generated
	 */
	EList<MetamodelElementFeature> getContainsMetamodelElementFeature();

	/**
	 * Returns the value of the '<em><b>Contains Binding Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link graph_bdsl.BindingAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Binding Attribute</em>' containment reference list.
	 * @see graph_bdsl.Graph_bdslPackage#getGraphModel_ContainsBindingAttribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<BindingAttribute> getContainsBindingAttribute();

	/**
	 * Returns the value of the '<em><b>Contains Virtual Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link graph_bdsl.VirtualAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Virtual Attribute</em>' containment reference list.
	 * @see graph_bdsl.Graph_bdslPackage#getGraphModel_ContainsVirtualAttribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<VirtualAttribute> getContainsVirtualAttribute();

	/**
	 * Returns the value of the '<em><b>Source MM</b></em>' attribute.
	 * The default value is <code>"http://bento/sirius/tests/graph_bdsl"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source MM</em>' attribute.
	 * @see #setSourceMM(String)
	 * @see graph_bdsl.Graph_bdslPackage#getGraphModel_SourceMM()
	 * @model default="http://bento/sirius/tests/graph_bdsl"
	 * @generated
	 */
	String getSourceMM();

	/**
	 * Sets the value of the '{@link graph_bdsl.GraphModel#getSourceMM <em>Source MM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source MM</em>' attribute.
	 * @see #getSourceMM()
	 * @generated
	 */
	void setSourceMM(String value);

} // GraphModel
