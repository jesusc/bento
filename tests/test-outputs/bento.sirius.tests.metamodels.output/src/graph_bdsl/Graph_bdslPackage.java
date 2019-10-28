/**
 */
package graph_bdsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see graph_bdsl.Graph_bdslFactory
 * @model kind="package"
 * @generated
 */
public interface Graph_bdslPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "graph_bdsl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://bento/sirius/tests/graph_bdsl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "graph_bdsl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Graph_bdslPackage eINSTANCE = graph_bdsl.impl.Graph_bdslPackageImpl.init();

	/**
	 * The meta object id for the '{@link graph_bdsl.impl.GraphModelImpl <em>Graph Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graph_bdsl.impl.GraphModelImpl
	 * @see graph_bdsl.impl.Graph_bdslPackageImpl#getGraphModel()
	 * @generated
	 */
	int GRAPH_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_MODEL__NODE = 0;

	/**
	 * The feature id for the '<em><b>Edge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_MODEL__EDGE = 1;

	/**
	 * The feature id for the '<em><b>Contains None Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_MODEL__CONTAINS_NONE_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Contains Binding Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_MODEL__CONTAINS_BINDING_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Contains Intermediate Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_MODEL__CONTAINS_INTERMEDIATE_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Contains Metamodel Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_MODEL__CONTAINS_METAMODEL_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Contains Metamodel Element Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_MODEL__CONTAINS_METAMODEL_ELEMENT_FEATURE = 6;

	/**
	 * The feature id for the '<em><b>Contains Binding Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_MODEL__CONTAINS_BINDING_ATTRIBUTE = 7;

	/**
	 * The feature id for the '<em><b>Contains Virtual Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_MODEL__CONTAINS_VIRTUAL_ATTRIBUTE = 8;

	/**
	 * The feature id for the '<em><b>Source MM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_MODEL__SOURCE_MM = 9;

	/**
	 * The number of structural features of the '<em>Graph Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_MODEL_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Graph Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link graph_bdsl.impl.BindingElementImpl <em>Binding Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graph_bdsl.impl.BindingElementImpl
	 * @see graph_bdsl.impl.Graph_bdslPackageImpl#getBindingElement()
	 * @generated
	 */
	int BINDING_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Contains Sirius Tag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_ELEMENT__CONTAINS_SIRIUS_TAG = 0;

	/**
	 * The feature id for the '<em><b>None Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_ELEMENT__NONE_ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Binding Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Binding Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link graph_bdsl.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graph_bdsl.impl.NodeImpl
	 * @see graph_bdsl.impl.Graph_bdslPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 1;

	/**
	 * The feature id for the '<em><b>Contains Sirius Tag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__CONTAINS_SIRIUS_TAG = BINDING_ELEMENT__CONTAINS_SIRIUS_TAG;

	/**
	 * The feature id for the '<em><b>None Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NONE_ELEMENT = BINDING_ELEMENT__NONE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__VALUE = BINDING_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Containsvalue Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__CONTAINSVALUE_NODE = BINDING_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = BINDING_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = BINDING_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graph_bdsl.impl.EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graph_bdsl.impl.EdgeImpl
	 * @see graph_bdsl.impl.Graph_bdslPackageImpl#getEdge()
	 * @generated
	 */
	int EDGE = 2;

	/**
	 * The feature id for the '<em><b>Contains Sirius Tag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__CONTAINS_SIRIUS_TAG = BINDING_ELEMENT__CONTAINS_SIRIUS_TAG;

	/**
	 * The feature id for the '<em><b>None Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__NONE_ELEMENT = BINDING_ELEMENT__NONE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__LABEL = BINDING_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__SRC = BINDING_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tgt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__TGT = BINDING_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Eref src Edge21</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__EREF_SRC_EDGE21 = BINDING_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Eref tgt Edge22</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__EREF_TGT_EDGE22 = BINDING_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Containslabel Edge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__CONTAINSLABEL_EDGE = BINDING_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_COUNT = BINDING_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_OPERATION_COUNT = BINDING_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graph_bdsl.impl.BindingAttributeImpl <em>Binding Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graph_bdsl.impl.BindingAttributeImpl
	 * @see graph_bdsl.impl.Graph_bdslPackageImpl#getBindingAttribute()
	 * @generated
	 */
	int BINDING_ATTRIBUTE = 12;

	/**
	 * The number of structural features of the '<em>Binding Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_ATTRIBUTE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Binding Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link graph_bdsl.impl.srcEdge21Impl <em>src Edge21</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graph_bdsl.impl.srcEdge21Impl
	 * @see graph_bdsl.impl.Graph_bdslPackageImpl#getsrcEdge21()
	 * @generated
	 */
	int SRC_EDGE21 = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EDGE21__NAME = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>src Edge21</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EDGE21_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>src Edge21</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_EDGE21_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graph_bdsl.impl.tgtEdge22Impl <em>tgt Edge22</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graph_bdsl.impl.tgtEdge22Impl
	 * @see graph_bdsl.impl.Graph_bdslPackageImpl#gettgtEdge22()
	 * @generated
	 */
	int TGT_EDGE22 = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGT_EDGE22__NAME = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>tgt Edge22</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGT_EDGE22_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>tgt Edge22</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGT_EDGE22_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graph_bdsl.impl.valueNodeImpl <em>value Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graph_bdsl.impl.valueNodeImpl
	 * @see graph_bdsl.impl.Graph_bdslPackageImpl#getvalueNode()
	 * @generated
	 */
	int VALUE_NODE = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_NODE__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>value Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_NODE_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>value Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_NODE_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graph_bdsl.impl.labelEdgeImpl <em>label Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graph_bdsl.impl.labelEdgeImpl
	 * @see graph_bdsl.impl.Graph_bdslPackageImpl#getlabelEdge()
	 * @generated
	 */
	int LABEL_EDGE = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_EDGE__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>label Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_EDGE_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>label Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_EDGE_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link graph_bdsl.impl.NoneElementImpl <em>None Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graph_bdsl.impl.NoneElementImpl
	 * @see graph_bdsl.impl.Graph_bdslPackageImpl#getNoneElement()
	 * @generated
	 */
	int NONE_ELEMENT = 7;

	/**
	 * The number of structural features of the '<em>None Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONE_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>None Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link graph_bdsl.impl.IntermediateElementImpl <em>Intermediate Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graph_bdsl.impl.IntermediateElementImpl
	 * @see graph_bdsl.impl.Graph_bdslPackageImpl#getIntermediateElement()
	 * @generated
	 */
	int INTERMEDIATE_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Binding Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_ELEMENT__BINDING_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Metamodel Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_ELEMENT__METAMODEL_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Id target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_ELEMENT__ID_TARGET = 2;

	/**
	 * The number of structural features of the '<em>Intermediate Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Intermediate Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link graph_bdsl.impl.MetamodelElementImpl <em>Metamodel Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graph_bdsl.impl.MetamodelElementImpl
	 * @see graph_bdsl.impl.Graph_bdslPackageImpl#getMetamodelElement()
	 * @generated
	 */
	int METAMODEL_ELEMENT = 10;

	/**
	 * The feature id for the '<em><b>Virtual Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_ELEMENT__VIRTUAL_ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Metamodel Element Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_ELEMENT__METAMODEL_ELEMENT_FEATURE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_ELEMENT__NAME = 2;

	/**
	 * The number of structural features of the '<em>Metamodel Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Metamodel Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link graph_bdsl.impl.MetamodelElementFeatureImpl <em>Metamodel Element Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graph_bdsl.impl.MetamodelElementFeatureImpl
	 * @see graph_bdsl.impl.Graph_bdslPackageImpl#getMetamodelElementFeature()
	 * @generated
	 */
	int METAMODEL_ELEMENT_FEATURE = 11;

	/**
	 * The feature id for the '<em><b>Feature Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_ELEMENT_FEATURE__FEATURE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_ELEMENT_FEATURE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Metamodel Element Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_ELEMENT_FEATURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Metamodel Element Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_ELEMENT_FEATURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link graph_bdsl.impl.VirtualAttributeImpl <em>Virtual Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graph_bdsl.impl.VirtualAttributeImpl
	 * @see graph_bdsl.impl.Graph_bdslPackageImpl#getVirtualAttribute()
	 * @generated
	 */
	int VIRTUAL_ATTRIBUTE = 13;

	/**
	 * The feature id for the '<em><b>To virtual Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_ATTRIBUTE__TO_VIRTUAL_ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_ATTRIBUTE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_ATTRIBUTE__EXPRESSION = 2;

	/**
	 * The number of structural features of the '<em>Virtual Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_ATTRIBUTE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Virtual Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link graph_bdsl.impl.SiriusTagImpl <em>Sirius Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graph_bdsl.impl.SiriusTagImpl
	 * @see graph_bdsl.impl.Graph_bdslPackageImpl#getSiriusTag()
	 * @generated
	 */
	int SIRIUS_TAG = 14;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIRIUS_TAG__TAG = 0;

	/**
	 * The number of structural features of the '<em>Sirius Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIRIUS_TAG_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Sirius Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIRIUS_TAG_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link graph_bdsl.GraphModel <em>Graph Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph Model</em>'.
	 * @see graph_bdsl.GraphModel
	 * @generated
	 */
	EClass getGraphModel();

	/**
	 * Returns the meta object for the containment reference list '{@link graph_bdsl.GraphModel#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node</em>'.
	 * @see graph_bdsl.GraphModel#getNode()
	 * @see #getGraphModel()
	 * @generated
	 */
	EReference getGraphModel_Node();

	/**
	 * Returns the meta object for the containment reference list '{@link graph_bdsl.GraphModel#getEdge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Edge</em>'.
	 * @see graph_bdsl.GraphModel#getEdge()
	 * @see #getGraphModel()
	 * @generated
	 */
	EReference getGraphModel_Edge();

	/**
	 * Returns the meta object for the containment reference list '{@link graph_bdsl.GraphModel#getContainsNoneElement <em>Contains None Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains None Element</em>'.
	 * @see graph_bdsl.GraphModel#getContainsNoneElement()
	 * @see #getGraphModel()
	 * @generated
	 */
	EReference getGraphModel_ContainsNoneElement();

	/**
	 * Returns the meta object for the containment reference list '{@link graph_bdsl.GraphModel#getContainsBindingElement <em>Contains Binding Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Binding Element</em>'.
	 * @see graph_bdsl.GraphModel#getContainsBindingElement()
	 * @see #getGraphModel()
	 * @generated
	 */
	EReference getGraphModel_ContainsBindingElement();

	/**
	 * Returns the meta object for the containment reference list '{@link graph_bdsl.GraphModel#getContainsIntermediateElement <em>Contains Intermediate Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Intermediate Element</em>'.
	 * @see graph_bdsl.GraphModel#getContainsIntermediateElement()
	 * @see #getGraphModel()
	 * @generated
	 */
	EReference getGraphModel_ContainsIntermediateElement();

	/**
	 * Returns the meta object for the containment reference list '{@link graph_bdsl.GraphModel#getContainsMetamodelElement <em>Contains Metamodel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Metamodel Element</em>'.
	 * @see graph_bdsl.GraphModel#getContainsMetamodelElement()
	 * @see #getGraphModel()
	 * @generated
	 */
	EReference getGraphModel_ContainsMetamodelElement();

	/**
	 * Returns the meta object for the containment reference list '{@link graph_bdsl.GraphModel#getContainsMetamodelElementFeature <em>Contains Metamodel Element Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Metamodel Element Feature</em>'.
	 * @see graph_bdsl.GraphModel#getContainsMetamodelElementFeature()
	 * @see #getGraphModel()
	 * @generated
	 */
	EReference getGraphModel_ContainsMetamodelElementFeature();

	/**
	 * Returns the meta object for the containment reference list '{@link graph_bdsl.GraphModel#getContainsBindingAttribute <em>Contains Binding Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Binding Attribute</em>'.
	 * @see graph_bdsl.GraphModel#getContainsBindingAttribute()
	 * @see #getGraphModel()
	 * @generated
	 */
	EReference getGraphModel_ContainsBindingAttribute();

	/**
	 * Returns the meta object for the containment reference list '{@link graph_bdsl.GraphModel#getContainsVirtualAttribute <em>Contains Virtual Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Virtual Attribute</em>'.
	 * @see graph_bdsl.GraphModel#getContainsVirtualAttribute()
	 * @see #getGraphModel()
	 * @generated
	 */
	EReference getGraphModel_ContainsVirtualAttribute();

	/**
	 * Returns the meta object for the attribute '{@link graph_bdsl.GraphModel#getSourceMM <em>Source MM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source MM</em>'.
	 * @see graph_bdsl.GraphModel#getSourceMM()
	 * @see #getGraphModel()
	 * @generated
	 */
	EAttribute getGraphModel_SourceMM();

	/**
	 * Returns the meta object for class '{@link graph_bdsl.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see graph_bdsl.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link graph_bdsl.Node#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see graph_bdsl.Node#getValue()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Value();

	/**
	 * Returns the meta object for the containment reference list '{@link graph_bdsl.Node#getContainsvalueNode <em>Containsvalue Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containsvalue Node</em>'.
	 * @see graph_bdsl.Node#getContainsvalueNode()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_ContainsvalueNode();

	/**
	 * Returns the meta object for class '{@link graph_bdsl.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see graph_bdsl.Edge
	 * @generated
	 */
	EClass getEdge();

	/**
	 * Returns the meta object for the attribute '{@link graph_bdsl.Edge#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see graph_bdsl.Edge#getLabel()
	 * @see #getEdge()
	 * @generated
	 */
	EAttribute getEdge_Label();

	/**
	 * Returns the meta object for the reference '{@link graph_bdsl.Edge#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Src</em>'.
	 * @see graph_bdsl.Edge#getSrc()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Src();

	/**
	 * Returns the meta object for the reference '{@link graph_bdsl.Edge#getTgt <em>Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tgt</em>'.
	 * @see graph_bdsl.Edge#getTgt()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Tgt();

	/**
	 * Returns the meta object for the containment reference '{@link graph_bdsl.Edge#getEref_srcEdge21 <em>Eref src Edge21</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Eref src Edge21</em>'.
	 * @see graph_bdsl.Edge#getEref_srcEdge21()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Eref_srcEdge21();

	/**
	 * Returns the meta object for the containment reference '{@link graph_bdsl.Edge#getEref_tgtEdge22 <em>Eref tgt Edge22</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Eref tgt Edge22</em>'.
	 * @see graph_bdsl.Edge#getEref_tgtEdge22()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Eref_tgtEdge22();

	/**
	 * Returns the meta object for the containment reference list '{@link graph_bdsl.Edge#getContainslabelEdge <em>Containslabel Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containslabel Edge</em>'.
	 * @see graph_bdsl.Edge#getContainslabelEdge()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_ContainslabelEdge();

	/**
	 * Returns the meta object for class '{@link graph_bdsl.srcEdge21 <em>src Edge21</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>src Edge21</em>'.
	 * @see graph_bdsl.srcEdge21
	 * @generated
	 */
	EClass getsrcEdge21();

	/**
	 * Returns the meta object for the attribute '{@link graph_bdsl.srcEdge21#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see graph_bdsl.srcEdge21#getName()
	 * @see #getsrcEdge21()
	 * @generated
	 */
	EAttribute getsrcEdge21_Name();

	/**
	 * Returns the meta object for class '{@link graph_bdsl.tgtEdge22 <em>tgt Edge22</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>tgt Edge22</em>'.
	 * @see graph_bdsl.tgtEdge22
	 * @generated
	 */
	EClass gettgtEdge22();

	/**
	 * Returns the meta object for the attribute '{@link graph_bdsl.tgtEdge22#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see graph_bdsl.tgtEdge22#getName()
	 * @see #gettgtEdge22()
	 * @generated
	 */
	EAttribute gettgtEdge22_Name();

	/**
	 * Returns the meta object for class '{@link graph_bdsl.valueNode <em>value Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>value Node</em>'.
	 * @see graph_bdsl.valueNode
	 * @generated
	 */
	EClass getvalueNode();

	/**
	 * Returns the meta object for the attribute '{@link graph_bdsl.valueNode#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see graph_bdsl.valueNode#getValue()
	 * @see #getvalueNode()
	 * @generated
	 */
	EAttribute getvalueNode_Value();

	/**
	 * Returns the meta object for class '{@link graph_bdsl.labelEdge <em>label Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>label Edge</em>'.
	 * @see graph_bdsl.labelEdge
	 * @generated
	 */
	EClass getlabelEdge();

	/**
	 * Returns the meta object for the attribute '{@link graph_bdsl.labelEdge#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see graph_bdsl.labelEdge#getValue()
	 * @see #getlabelEdge()
	 * @generated
	 */
	EAttribute getlabelEdge_Value();

	/**
	 * Returns the meta object for class '{@link graph_bdsl.NoneElement <em>None Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>None Element</em>'.
	 * @see graph_bdsl.NoneElement
	 * @generated
	 */
	EClass getNoneElement();

	/**
	 * Returns the meta object for class '{@link graph_bdsl.BindingElement <em>Binding Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Element</em>'.
	 * @see graph_bdsl.BindingElement
	 * @generated
	 */
	EClass getBindingElement();

	/**
	 * Returns the meta object for the containment reference list '{@link graph_bdsl.BindingElement#getContainsSiriusTag <em>Contains Sirius Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Sirius Tag</em>'.
	 * @see graph_bdsl.BindingElement#getContainsSiriusTag()
	 * @see #getBindingElement()
	 * @generated
	 */
	EReference getBindingElement_ContainsSiriusTag();

	/**
	 * Returns the meta object for the reference list '{@link graph_bdsl.BindingElement#getNoneElement <em>None Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>None Element</em>'.
	 * @see graph_bdsl.BindingElement#getNoneElement()
	 * @see #getBindingElement()
	 * @generated
	 */
	EReference getBindingElement_NoneElement();

	/**
	 * Returns the meta object for class '{@link graph_bdsl.IntermediateElement <em>Intermediate Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intermediate Element</em>'.
	 * @see graph_bdsl.IntermediateElement
	 * @generated
	 */
	EClass getIntermediateElement();

	/**
	 * Returns the meta object for the reference '{@link graph_bdsl.IntermediateElement#getBindingElement <em>Binding Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Binding Element</em>'.
	 * @see graph_bdsl.IntermediateElement#getBindingElement()
	 * @see #getIntermediateElement()
	 * @generated
	 */
	EReference getIntermediateElement_BindingElement();

	/**
	 * Returns the meta object for the reference list '{@link graph_bdsl.IntermediateElement#getMetamodelElement <em>Metamodel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Metamodel Element</em>'.
	 * @see graph_bdsl.IntermediateElement#getMetamodelElement()
	 * @see #getIntermediateElement()
	 * @generated
	 */
	EReference getIntermediateElement_MetamodelElement();

	/**
	 * Returns the meta object for the attribute '{@link graph_bdsl.IntermediateElement#getId_target <em>Id target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id target</em>'.
	 * @see graph_bdsl.IntermediateElement#getId_target()
	 * @see #getIntermediateElement()
	 * @generated
	 */
	EAttribute getIntermediateElement_Id_target();

	/**
	 * Returns the meta object for class '{@link graph_bdsl.MetamodelElement <em>Metamodel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metamodel Element</em>'.
	 * @see graph_bdsl.MetamodelElement
	 * @generated
	 */
	EClass getMetamodelElement();

	/**
	 * Returns the meta object for the containment reference list '{@link graph_bdsl.MetamodelElement#getVirtualAttribute <em>Virtual Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Virtual Attribute</em>'.
	 * @see graph_bdsl.MetamodelElement#getVirtualAttribute()
	 * @see #getMetamodelElement()
	 * @generated
	 */
	EReference getMetamodelElement_VirtualAttribute();

	/**
	 * Returns the meta object for the containment reference list '{@link graph_bdsl.MetamodelElement#getMetamodelElementFeature <em>Metamodel Element Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metamodel Element Feature</em>'.
	 * @see graph_bdsl.MetamodelElement#getMetamodelElementFeature()
	 * @see #getMetamodelElement()
	 * @generated
	 */
	EReference getMetamodelElement_MetamodelElementFeature();

	/**
	 * Returns the meta object for the attribute '{@link graph_bdsl.MetamodelElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see graph_bdsl.MetamodelElement#getName()
	 * @see #getMetamodelElement()
	 * @generated
	 */
	EAttribute getMetamodelElement_Name();

	/**
	 * Returns the meta object for class '{@link graph_bdsl.MetamodelElementFeature <em>Metamodel Element Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metamodel Element Feature</em>'.
	 * @see graph_bdsl.MetamodelElementFeature
	 * @generated
	 */
	EClass getMetamodelElementFeature();

	/**
	 * Returns the meta object for the reference list '{@link graph_bdsl.MetamodelElementFeature#getFeatureClass <em>Feature Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Feature Class</em>'.
	 * @see graph_bdsl.MetamodelElementFeature#getFeatureClass()
	 * @see #getMetamodelElementFeature()
	 * @generated
	 */
	EReference getMetamodelElementFeature_FeatureClass();

	/**
	 * Returns the meta object for the attribute '{@link graph_bdsl.MetamodelElementFeature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see graph_bdsl.MetamodelElementFeature#getName()
	 * @see #getMetamodelElementFeature()
	 * @generated
	 */
	EAttribute getMetamodelElementFeature_Name();

	/**
	 * Returns the meta object for class '{@link graph_bdsl.BindingAttribute <em>Binding Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Attribute</em>'.
	 * @see graph_bdsl.BindingAttribute
	 * @generated
	 */
	EClass getBindingAttribute();

	/**
	 * Returns the meta object for class '{@link graph_bdsl.VirtualAttribute <em>Virtual Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Attribute</em>'.
	 * @see graph_bdsl.VirtualAttribute
	 * @generated
	 */
	EClass getVirtualAttribute();

	/**
	 * Returns the meta object for the reference '{@link graph_bdsl.VirtualAttribute#getTo_virtualAttribute <em>To virtual Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To virtual Attribute</em>'.
	 * @see graph_bdsl.VirtualAttribute#getTo_virtualAttribute()
	 * @see #getVirtualAttribute()
	 * @generated
	 */
	EReference getVirtualAttribute_To_virtualAttribute();

	/**
	 * Returns the meta object for the attribute '{@link graph_bdsl.VirtualAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see graph_bdsl.VirtualAttribute#getName()
	 * @see #getVirtualAttribute()
	 * @generated
	 */
	EAttribute getVirtualAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link graph_bdsl.VirtualAttribute#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see graph_bdsl.VirtualAttribute#getExpression()
	 * @see #getVirtualAttribute()
	 * @generated
	 */
	EAttribute getVirtualAttribute_Expression();

	/**
	 * Returns the meta object for class '{@link graph_bdsl.SiriusTag <em>Sirius Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sirius Tag</em>'.
	 * @see graph_bdsl.SiriusTag
	 * @generated
	 */
	EClass getSiriusTag();

	/**
	 * Returns the meta object for the attribute '{@link graph_bdsl.SiriusTag#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see graph_bdsl.SiriusTag#getTag()
	 * @see #getSiriusTag()
	 * @generated
	 */
	EAttribute getSiriusTag_Tag();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Graph_bdslFactory getGraph_bdslFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link graph_bdsl.impl.GraphModelImpl <em>Graph Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graph_bdsl.impl.GraphModelImpl
		 * @see graph_bdsl.impl.Graph_bdslPackageImpl#getGraphModel()
		 * @generated
		 */
		EClass GRAPH_MODEL = eINSTANCE.getGraphModel();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH_MODEL__NODE = eINSTANCE.getGraphModel_Node();

		/**
		 * The meta object literal for the '<em><b>Edge</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH_MODEL__EDGE = eINSTANCE.getGraphModel_Edge();

		/**
		 * The meta object literal for the '<em><b>Contains None Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH_MODEL__CONTAINS_NONE_ELEMENT = eINSTANCE.getGraphModel_ContainsNoneElement();

		/**
		 * The meta object literal for the '<em><b>Contains Binding Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH_MODEL__CONTAINS_BINDING_ELEMENT = eINSTANCE.getGraphModel_ContainsBindingElement();

		/**
		 * The meta object literal for the '<em><b>Contains Intermediate Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH_MODEL__CONTAINS_INTERMEDIATE_ELEMENT = eINSTANCE.getGraphModel_ContainsIntermediateElement();

		/**
		 * The meta object literal for the '<em><b>Contains Metamodel Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH_MODEL__CONTAINS_METAMODEL_ELEMENT = eINSTANCE.getGraphModel_ContainsMetamodelElement();

		/**
		 * The meta object literal for the '<em><b>Contains Metamodel Element Feature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH_MODEL__CONTAINS_METAMODEL_ELEMENT_FEATURE = eINSTANCE.getGraphModel_ContainsMetamodelElementFeature();

		/**
		 * The meta object literal for the '<em><b>Contains Binding Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH_MODEL__CONTAINS_BINDING_ATTRIBUTE = eINSTANCE.getGraphModel_ContainsBindingAttribute();

		/**
		 * The meta object literal for the '<em><b>Contains Virtual Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH_MODEL__CONTAINS_VIRTUAL_ATTRIBUTE = eINSTANCE.getGraphModel_ContainsVirtualAttribute();

		/**
		 * The meta object literal for the '<em><b>Source MM</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH_MODEL__SOURCE_MM = eINSTANCE.getGraphModel_SourceMM();

		/**
		 * The meta object literal for the '{@link graph_bdsl.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graph_bdsl.impl.NodeImpl
		 * @see graph_bdsl.impl.Graph_bdslPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__VALUE = eINSTANCE.getNode_Value();

		/**
		 * The meta object literal for the '<em><b>Containsvalue Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__CONTAINSVALUE_NODE = eINSTANCE.getNode_ContainsvalueNode();

		/**
		 * The meta object literal for the '{@link graph_bdsl.impl.EdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graph_bdsl.impl.EdgeImpl
		 * @see graph_bdsl.impl.Graph_bdslPackageImpl#getEdge()
		 * @generated
		 */
		EClass EDGE = eINSTANCE.getEdge();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE__LABEL = eINSTANCE.getEdge_Label();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__SRC = eINSTANCE.getEdge_Src();

		/**
		 * The meta object literal for the '<em><b>Tgt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__TGT = eINSTANCE.getEdge_Tgt();

		/**
		 * The meta object literal for the '<em><b>Eref src Edge21</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__EREF_SRC_EDGE21 = eINSTANCE.getEdge_Eref_srcEdge21();

		/**
		 * The meta object literal for the '<em><b>Eref tgt Edge22</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__EREF_TGT_EDGE22 = eINSTANCE.getEdge_Eref_tgtEdge22();

		/**
		 * The meta object literal for the '<em><b>Containslabel Edge</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__CONTAINSLABEL_EDGE = eINSTANCE.getEdge_ContainslabelEdge();

		/**
		 * The meta object literal for the '{@link graph_bdsl.impl.srcEdge21Impl <em>src Edge21</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graph_bdsl.impl.srcEdge21Impl
		 * @see graph_bdsl.impl.Graph_bdslPackageImpl#getsrcEdge21()
		 * @generated
		 */
		EClass SRC_EDGE21 = eINSTANCE.getsrcEdge21();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_EDGE21__NAME = eINSTANCE.getsrcEdge21_Name();

		/**
		 * The meta object literal for the '{@link graph_bdsl.impl.tgtEdge22Impl <em>tgt Edge22</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graph_bdsl.impl.tgtEdge22Impl
		 * @see graph_bdsl.impl.Graph_bdslPackageImpl#gettgtEdge22()
		 * @generated
		 */
		EClass TGT_EDGE22 = eINSTANCE.gettgtEdge22();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TGT_EDGE22__NAME = eINSTANCE.gettgtEdge22_Name();

		/**
		 * The meta object literal for the '{@link graph_bdsl.impl.valueNodeImpl <em>value Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graph_bdsl.impl.valueNodeImpl
		 * @see graph_bdsl.impl.Graph_bdslPackageImpl#getvalueNode()
		 * @generated
		 */
		EClass VALUE_NODE = eINSTANCE.getvalueNode();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_NODE__VALUE = eINSTANCE.getvalueNode_Value();

		/**
		 * The meta object literal for the '{@link graph_bdsl.impl.labelEdgeImpl <em>label Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graph_bdsl.impl.labelEdgeImpl
		 * @see graph_bdsl.impl.Graph_bdslPackageImpl#getlabelEdge()
		 * @generated
		 */
		EClass LABEL_EDGE = eINSTANCE.getlabelEdge();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL_EDGE__VALUE = eINSTANCE.getlabelEdge_Value();

		/**
		 * The meta object literal for the '{@link graph_bdsl.impl.NoneElementImpl <em>None Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graph_bdsl.impl.NoneElementImpl
		 * @see graph_bdsl.impl.Graph_bdslPackageImpl#getNoneElement()
		 * @generated
		 */
		EClass NONE_ELEMENT = eINSTANCE.getNoneElement();

		/**
		 * The meta object literal for the '{@link graph_bdsl.impl.BindingElementImpl <em>Binding Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graph_bdsl.impl.BindingElementImpl
		 * @see graph_bdsl.impl.Graph_bdslPackageImpl#getBindingElement()
		 * @generated
		 */
		EClass BINDING_ELEMENT = eINSTANCE.getBindingElement();

		/**
		 * The meta object literal for the '<em><b>Contains Sirius Tag</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_ELEMENT__CONTAINS_SIRIUS_TAG = eINSTANCE.getBindingElement_ContainsSiriusTag();

		/**
		 * The meta object literal for the '<em><b>None Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_ELEMENT__NONE_ELEMENT = eINSTANCE.getBindingElement_NoneElement();

		/**
		 * The meta object literal for the '{@link graph_bdsl.impl.IntermediateElementImpl <em>Intermediate Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graph_bdsl.impl.IntermediateElementImpl
		 * @see graph_bdsl.impl.Graph_bdslPackageImpl#getIntermediateElement()
		 * @generated
		 */
		EClass INTERMEDIATE_ELEMENT = eINSTANCE.getIntermediateElement();

		/**
		 * The meta object literal for the '<em><b>Binding Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERMEDIATE_ELEMENT__BINDING_ELEMENT = eINSTANCE.getIntermediateElement_BindingElement();

		/**
		 * The meta object literal for the '<em><b>Metamodel Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERMEDIATE_ELEMENT__METAMODEL_ELEMENT = eINSTANCE.getIntermediateElement_MetamodelElement();

		/**
		 * The meta object literal for the '<em><b>Id target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERMEDIATE_ELEMENT__ID_TARGET = eINSTANCE.getIntermediateElement_Id_target();

		/**
		 * The meta object literal for the '{@link graph_bdsl.impl.MetamodelElementImpl <em>Metamodel Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graph_bdsl.impl.MetamodelElementImpl
		 * @see graph_bdsl.impl.Graph_bdslPackageImpl#getMetamodelElement()
		 * @generated
		 */
		EClass METAMODEL_ELEMENT = eINSTANCE.getMetamodelElement();

		/**
		 * The meta object literal for the '<em><b>Virtual Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METAMODEL_ELEMENT__VIRTUAL_ATTRIBUTE = eINSTANCE.getMetamodelElement_VirtualAttribute();

		/**
		 * The meta object literal for the '<em><b>Metamodel Element Feature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METAMODEL_ELEMENT__METAMODEL_ELEMENT_FEATURE = eINSTANCE.getMetamodelElement_MetamodelElementFeature();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METAMODEL_ELEMENT__NAME = eINSTANCE.getMetamodelElement_Name();

		/**
		 * The meta object literal for the '{@link graph_bdsl.impl.MetamodelElementFeatureImpl <em>Metamodel Element Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graph_bdsl.impl.MetamodelElementFeatureImpl
		 * @see graph_bdsl.impl.Graph_bdslPackageImpl#getMetamodelElementFeature()
		 * @generated
		 */
		EClass METAMODEL_ELEMENT_FEATURE = eINSTANCE.getMetamodelElementFeature();

		/**
		 * The meta object literal for the '<em><b>Feature Class</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METAMODEL_ELEMENT_FEATURE__FEATURE_CLASS = eINSTANCE.getMetamodelElementFeature_FeatureClass();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METAMODEL_ELEMENT_FEATURE__NAME = eINSTANCE.getMetamodelElementFeature_Name();

		/**
		 * The meta object literal for the '{@link graph_bdsl.impl.BindingAttributeImpl <em>Binding Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graph_bdsl.impl.BindingAttributeImpl
		 * @see graph_bdsl.impl.Graph_bdslPackageImpl#getBindingAttribute()
		 * @generated
		 */
		EClass BINDING_ATTRIBUTE = eINSTANCE.getBindingAttribute();

		/**
		 * The meta object literal for the '{@link graph_bdsl.impl.VirtualAttributeImpl <em>Virtual Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graph_bdsl.impl.VirtualAttributeImpl
		 * @see graph_bdsl.impl.Graph_bdslPackageImpl#getVirtualAttribute()
		 * @generated
		 */
		EClass VIRTUAL_ATTRIBUTE = eINSTANCE.getVirtualAttribute();

		/**
		 * The meta object literal for the '<em><b>To virtual Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_ATTRIBUTE__TO_VIRTUAL_ATTRIBUTE = eINSTANCE.getVirtualAttribute_To_virtualAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_ATTRIBUTE__NAME = eINSTANCE.getVirtualAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_ATTRIBUTE__EXPRESSION = eINSTANCE.getVirtualAttribute_Expression();

		/**
		 * The meta object literal for the '{@link graph_bdsl.impl.SiriusTagImpl <em>Sirius Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graph_bdsl.impl.SiriusTagImpl
		 * @see graph_bdsl.impl.Graph_bdslPackageImpl#getSiriusTag()
		 * @generated
		 */
		EClass SIRIUS_TAG = eINSTANCE.getSiriusTag();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIRIUS_TAG__TAG = eINSTANCE.getSiriusTag_Tag();

	}

} //Graph_bdslPackage
