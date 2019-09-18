/**
 */
package metamodel_bdsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see metamodel_bdsl.Metamodel_bdslFactory
 * @model kind="package"
 * @generated
 */
public interface Metamodel_bdslPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "metamodel_bdsl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/metamodel_bdsl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "metamodel_bdsl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Metamodel_bdslPackage eINSTANCE = metamodel_bdsl.impl.Metamodel_bdslPackageImpl.init();

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.ModelImpl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__QUERY = 1;

	/**
	 * The feature id for the '<em><b>Order On Stock Threshold</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ORDER_ON_STOCK_THRESHOLD = 2;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__COMPONENT = 3;

	/**
	 * The feature id for the '<em><b>Flow</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__FLOW = 4;

	/**
	 * The feature id for the '<em><b>Contains None Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__CONTAINS_NONE_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Contains Binding Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__CONTAINS_BINDING_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Contains Intermediate Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__CONTAINS_INTERMEDIATE_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Contains Metamodel Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__CONTAINS_METAMODEL_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Contains Metamodel Element Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__CONTAINS_METAMODEL_ELEMENT_FEATURE = 9;

	/**
	 * The feature id for the '<em><b>Contains Binding Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__CONTAINS_BINDING_ATTRIBUTE = 10;

	/**
	 * The feature id for the '<em><b>Contains Virtual Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__CONTAINS_VIRTUAL_ATTRIBUTE = 11;

	/**
	 * The feature id for the '<em><b>Source MM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__SOURCE_MM = 12;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.BindingElementImpl <em>Binding Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.BindingElementImpl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getBindingElement()
	 * @generated
	 */
	int BINDING_ELEMENT = 70;

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
	 * The meta object id for the '{@link metamodel_bdsl.impl.QueryImpl <em>Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.QueryImpl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getQuery()
	 * @generated
	 */
	int QUERY = 1;

	/**
	 * The feature id for the '<em><b>Contains Sirius Tag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__CONTAINS_SIRIUS_TAG = BINDING_ELEMENT__CONTAINS_SIRIUS_TAG;

	/**
	 * The feature id for the '<em><b>None Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__NONE_ELEMENT = BINDING_ELEMENT__NONE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__NAME = BINDING_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__VALUE = BINDING_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__ERROR = BINDING_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__TYPE = BINDING_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__SYSTEM = BINDING_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Containsname Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__CONTAINSNAME_QUERY = BINDING_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Containsvalue Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__CONTAINSVALUE_QUERY = BINDING_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Containserror Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__CONTAINSERROR_QUERY = BINDING_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Containstype Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__CONTAINSTYPE_QUERY = BINDING_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Containssystem Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__CONTAINSSYSTEM_QUERY = BINDING_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_FEATURE_COUNT = BINDING_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_OPERATION_COUNT = BINDING_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.ComponentImpl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.StorageImpl <em>Storage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.StorageImpl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getStorage()
	 * @generated
	 */
	int STORAGE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Contains Sirius Tag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__CONTAINS_SIRIUS_TAG = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>None Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__NONE_ELEMENT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__SIZE = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Initial Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__INITIAL_CONTENT = COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Overflow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__OVERFLOW = COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Storage Output Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__STORAGE_OUTPUT_FLOW = COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Order On Stock Threshold</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__ORDER_ON_STOCK_THRESHOLD = COMPONENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Process Output Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__PROCESS_OUTPUT_FLOW = COMPONENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Eref storage Output Flow Storage21</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__EREF_STORAGE_OUTPUT_FLOW_STORAGE21 = COMPONENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Eref order On Stock Threshold Storage22</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__EREF_ORDER_ON_STOCK_THRESHOLD_STORAGE22 = COMPONENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Eref process Output Flow Storage23</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__EREF_PROCESS_OUTPUT_FLOW_STORAGE23 = COMPONENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Containsname Storage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__CONTAINSNAME_STORAGE = COMPONENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Containssize Storage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__CONTAINSSIZE_STORAGE = COMPONENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Containsinitial Content Storage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__CONTAINSINITIAL_CONTENT_STORAGE = COMPONENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Containsoverflow Storage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE__CONTAINSOVERFLOW_STORAGE = COMPONENT_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 15;

	/**
	 * The number of operations of the '<em>Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.SupplierImpl <em>Supplier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.SupplierImpl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getSupplier()
	 * @generated
	 */
	int SUPPLIER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Contains Sirius Tag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER__CONTAINS_SIRIUS_TAG = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>None Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER__NONE_ELEMENT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Delivered Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER__DELIVERED_PERCENTAGE = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Refill Policy</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER__REFILL_POLICY = COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Supplier Delay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER__SUPPLIER_DELAY = COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Eref refill Policy Supplier31</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER__EREF_REFILL_POLICY_SUPPLIER31 = COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Eref supplier Delay Supplier32</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER__EREF_SUPPLIER_DELAY_SUPPLIER32 = COMPONENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Containsname Supplier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER__CONTAINSNAME_SUPPLIER = COMPONENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Containsdelivered Percentage Supplier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER__CONTAINSDELIVERED_PERCENTAGE_SUPPLIER = COMPONENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Supplier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Supplier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.ProcessImpl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Storage Output Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__STORAGE_OUTPUT_FLOW = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__DURATION = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.BatchProcessImpl <em>Batch Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.BatchProcessImpl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getBatchProcess()
	 * @generated
	 */
	int BATCH_PROCESS = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATCH_PROCESS__NAME = PROCESS__NAME;

	/**
	 * The feature id for the '<em><b>Storage Output Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATCH_PROCESS__STORAGE_OUTPUT_FLOW = PROCESS__STORAGE_OUTPUT_FLOW;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATCH_PROCESS__DURATION = PROCESS__DURATION;

	/**
	 * The feature id for the '<em><b>Contains Sirius Tag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATCH_PROCESS__CONTAINS_SIRIUS_TAG = PROCESS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>None Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATCH_PROCESS__NONE_ELEMENT = PROCESS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Percentage Of Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATCH_PROCESS__PERCENTAGE_OF_SUCCESS = PROCESS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Number Of Chains</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATCH_PROCESS__NUMBER_OF_CHAINS = PROCESS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATCH_PROCESS__OUTPUTS = PROCESS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Eref storage Output Flow Batch Process41</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATCH_PROCESS__EREF_STORAGE_OUTPUT_FLOW_BATCH_PROCESS41 = PROCESS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Eref duration Batch Process42</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATCH_PROCESS__EREF_DURATION_BATCH_PROCESS42 = PROCESS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Eref outputs Batch Process43</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATCH_PROCESS__EREF_OUTPUTS_BATCH_PROCESS43 = PROCESS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Containsname Batch Process</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATCH_PROCESS__CONTAINSNAME_BATCH_PROCESS = PROCESS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Containspercentage Of Success Batch Process</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATCH_PROCESS__CONTAINSPERCENTAGE_OF_SUCCESS_BATCH_PROCESS = PROCESS_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Containsnumber Of Chains Batch Process</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATCH_PROCESS__CONTAINSNUMBER_OF_CHAINS_BATCH_PROCESS = PROCESS_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Batch Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATCH_PROCESS_FEATURE_COUNT = PROCESS_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Batch Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATCH_PROCESS_OPERATION_COUNT = PROCESS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.OutputImpl <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.OutputImpl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getOutput()
	 * @generated
	 */
	int OUTPUT = 5;

	/**
	 * The feature id for the '<em><b>Contains Sirius Tag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__CONTAINS_SIRIUS_TAG = BINDING_ELEMENT__CONTAINS_SIRIUS_TAG;

	/**
	 * The feature id for the '<em><b>None Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__NONE_ELEMENT = BINDING_ELEMENT__NONE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__TYPE = BINDING_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Process Output Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__PROCESS_OUTPUT_FLOW = BINDING_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__DESCRIPTION = BINDING_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Eref process Output Flow Output51</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__EREF_PROCESS_OUTPUT_FLOW_OUTPUT51 = BINDING_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Containstype Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__CONTAINSTYPE_OUTPUT = BINDING_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Containsdescription Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__CONTAINSDESCRIPTION_OUTPUT = BINDING_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FEATURE_COUNT = BINDING_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_OPERATION_COUNT = BINDING_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.FlowImpl <em>Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.FlowImpl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getFlow()
	 * @generated
	 */
	int FLOW = 11;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__QUANTITY = 0;

	/**
	 * The number of structural features of the '<em>Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.StorageOutputFlowImpl <em>Storage Output Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.StorageOutputFlowImpl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getStorageOutputFlow()
	 * @generated
	 */
	int STORAGE_OUTPUT_FLOW = 6;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_OUTPUT_FLOW__QUANTITY = FLOW__QUANTITY;

	/**
	 * The feature id for the '<em><b>Contains Sirius Tag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_OUTPUT_FLOW__CONTAINS_SIRIUS_TAG = FLOW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>None Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_OUTPUT_FLOW__NONE_ELEMENT = FLOW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_OUTPUT_FLOW__SOURCE = FLOW_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_OUTPUT_FLOW__DESTINATION = FLOW_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Eref quantity Storage Output Flow61</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_OUTPUT_FLOW__EREF_QUANTITY_STORAGE_OUTPUT_FLOW61 = FLOW_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Eref source Storage Output Flow62</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_OUTPUT_FLOW__EREF_SOURCE_STORAGE_OUTPUT_FLOW62 = FLOW_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Eref destination Storage Output Flow63</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_OUTPUT_FLOW__EREF_DESTINATION_STORAGE_OUTPUT_FLOW63 = FLOW_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Storage Output Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_OUTPUT_FLOW_FEATURE_COUNT = FLOW_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Storage Output Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_OUTPUT_FLOW_OPERATION_COUNT = FLOW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.ProcessOutputFlowImpl <em>Process Output Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.ProcessOutputFlowImpl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getProcessOutputFlow()
	 * @generated
	 */
	int PROCESS_OUTPUT_FLOW = 7;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OUTPUT_FLOW__QUANTITY = FLOW__QUANTITY;

	/**
	 * The feature id for the '<em><b>Contains Sirius Tag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OUTPUT_FLOW__CONTAINS_SIRIUS_TAG = FLOW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>None Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OUTPUT_FLOW__NONE_ELEMENT = FLOW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OUTPUT_FLOW__SOURCE = FLOW_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Process Output Flow Delay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OUTPUT_FLOW__PROCESS_OUTPUT_FLOW_DELAY = FLOW_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OUTPUT_FLOW__DESTINATION = FLOW_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Eref quantity Process Output Flow71</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OUTPUT_FLOW__EREF_QUANTITY_PROCESS_OUTPUT_FLOW71 = FLOW_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Eref source Process Output Flow72</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OUTPUT_FLOW__EREF_SOURCE_PROCESS_OUTPUT_FLOW72 = FLOW_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Eref process Output Flow Delay Process Output Flow73</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OUTPUT_FLOW__EREF_PROCESS_OUTPUT_FLOW_DELAY_PROCESS_OUTPUT_FLOW73 = FLOW_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Eref destination Process Output Flow74</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OUTPUT_FLOW__EREF_DESTINATION_PROCESS_OUTPUT_FLOW74 = FLOW_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Process Output Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OUTPUT_FLOW_FEATURE_COUNT = FLOW_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Process Output Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OUTPUT_FLOW_OPERATION_COUNT = FLOW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.OrderOnStockThresholdImpl <em>Order On Stock Threshold</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.OrderOnStockThresholdImpl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getOrderOnStockThreshold()
	 * @generated
	 */
	int ORDER_ON_STOCK_THRESHOLD = 9;

	/**
	 * The feature id for the '<em><b>Contains Sirius Tag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ON_STOCK_THRESHOLD__CONTAINS_SIRIUS_TAG = BINDING_ELEMENT__CONTAINS_SIRIUS_TAG;

	/**
	 * The feature id for the '<em><b>None Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ON_STOCK_THRESHOLD__NONE_ELEMENT = BINDING_ELEMENT__NONE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ON_STOCK_THRESHOLD__PERIOD = BINDING_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ON_STOCK_THRESHOLD__THRESHOLD = BINDING_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ON_STOCK_THRESHOLD__NAME = BINDING_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Order Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ON_STOCK_THRESHOLD__ORDER_QUANTITY = BINDING_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Order Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ON_STOCK_THRESHOLD__ORDER_TYPE = BINDING_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Supplier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ON_STOCK_THRESHOLD__SUPPLIER = BINDING_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Storage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ON_STOCK_THRESHOLD__STORAGE = BINDING_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Eref supplier Order On Stock Threshold81</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ON_STOCK_THRESHOLD__EREF_SUPPLIER_ORDER_ON_STOCK_THRESHOLD81 = BINDING_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Eref storage Order On Stock Threshold82</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ON_STOCK_THRESHOLD__EREF_STORAGE_ORDER_ON_STOCK_THRESHOLD82 = BINDING_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Containsperiod Order On Stock Threshold</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ON_STOCK_THRESHOLD__CONTAINSPERIOD_ORDER_ON_STOCK_THRESHOLD = BINDING_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Containsthreshold Order On Stock Threshold</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ON_STOCK_THRESHOLD__CONTAINSTHRESHOLD_ORDER_ON_STOCK_THRESHOLD = BINDING_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Containsname Order On Stock Threshold</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ON_STOCK_THRESHOLD__CONTAINSNAME_ORDER_ON_STOCK_THRESHOLD = BINDING_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Containsorder Quantity Order On Stock Threshold</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ON_STOCK_THRESHOLD__CONTAINSORDER_QUANTITY_ORDER_ON_STOCK_THRESHOLD = BINDING_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Containsorder Type Order On Stock Threshold</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ON_STOCK_THRESHOLD__CONTAINSORDER_TYPE_ORDER_ON_STOCK_THRESHOLD = BINDING_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Order On Stock Threshold</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ON_STOCK_THRESHOLD_FEATURE_COUNT = BINDING_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>Order On Stock Threshold</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ON_STOCK_THRESHOLD_OPERATION_COUNT = BINDING_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.ProbabilityImpl <em>Probability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.ProbabilityImpl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getProbability()
	 * @generated
	 */
	int PROBABILITY = 12;

	/**
	 * The number of structural features of the '<em>Probability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILITY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Probability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.DistributionImpl <em>Distribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.DistributionImpl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getDistribution()
	 * @generated
	 */
	int DISTRIBUTION = 13;

	/**
	 * The number of structural features of the '<em>Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_FEATURE_COUNT = PROBABILITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_OPERATION_COUNT = PROBABILITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.ScalarImpl <em>Scalar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.ScalarImpl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getScalar()
	 * @generated
	 */
	int SCALAR = 14;

	/**
	 * The feature id for the '<em><b>Contains Sirius Tag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR__CONTAINS_SIRIUS_TAG = PROBABILITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>None Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR__NONE_ELEMENT = PROBABILITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR__VALUE = PROBABILITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Containsvalue Scalar</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR__CONTAINSVALUE_SCALAR = PROBABILITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Scalar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_FEATURE_COUNT = PROBABILITY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Scalar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_OPERATION_COUNT = PROBABILITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.GaussianImpl <em>Gaussian</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.GaussianImpl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getGaussian()
	 * @generated
	 */
	int GAUSSIAN = 15;

	/**
	 * The feature id for the '<em><b>Contains Sirius Tag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN__CONTAINS_SIRIUS_TAG = DISTRIBUTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>None Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN__NONE_ELEMENT = DISTRIBUTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN__LOCATION = DISTRIBUTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN__SCALE = DISTRIBUTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Containslocation Gaussian</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN__CONTAINSLOCATION_GAUSSIAN = DISTRIBUTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Containsscale Gaussian</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN__CONTAINSSCALE_GAUSSIAN = DISTRIBUTION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Gaussian</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN_FEATURE_COUNT = DISTRIBUTION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Gaussian</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSSIAN_OPERATION_COUNT = DISTRIBUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.PoissonImpl <em>Poisson</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.PoissonImpl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getPoisson()
	 * @generated
	 */
	int POISSON = 16;

	/**
	 * The feature id for the '<em><b>Contains Sirius Tag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POISSON__CONTAINS_SIRIUS_TAG = DISTRIBUTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>None Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POISSON__NONE_ELEMENT = DISTRIBUTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POISSON__INTERVAL = DISTRIBUTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Containsinterval Poisson</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POISSON__CONTAINSINTERVAL_POISSON = DISTRIBUTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Poisson</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POISSON_FEATURE_COUNT = DISTRIBUTION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Poisson</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POISSON_OPERATION_COUNT = DISTRIBUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.UniformImpl <em>Uniform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.UniformImpl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getUniform()
	 * @generated
	 */
	int UNIFORM = 17;

	/**
	 * The feature id for the '<em><b>Contains Sirius Tag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM__CONTAINS_SIRIUS_TAG = DISTRIBUTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>None Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM__NONE_ELEMENT = DISTRIBUTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM__MINIMUM = DISTRIBUTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM__MAXIMUM = DISTRIBUTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Containsminimum Uniform</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM__CONTAINSMINIMUM_UNIFORM = DISTRIBUTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Containsmaximum Uniform</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM__CONTAINSMAXIMUM_UNIFORM = DISTRIBUTION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Uniform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_FEATURE_COUNT = DISTRIBUTION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Uniform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_OPERATION_COUNT = DISTRIBUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.ConveyorBeltImpl <em>Conveyor Belt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.ConveyorBeltImpl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getConveyorBelt()
	 * @generated
	 */
	int CONVEYOR_BELT = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT__NAME = PROCESS__NAME;

	/**
	 * The feature id for the '<em><b>Storage Output Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT__STORAGE_OUTPUT_FLOW = PROCESS__STORAGE_OUTPUT_FLOW;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT__DURATION = PROCESS__DURATION;

	/**
	 * The feature id for the '<em><b>Contains Sirius Tag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT__CONTAINS_SIRIUS_TAG = PROCESS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>None Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT__NONE_ELEMENT = PROCESS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Minimal Separation Between Batches</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT__MINIMAL_SEPARATION_BETWEEN_BATCHES = PROCESS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT__OUTPUT = PROCESS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Eref storage Output Flow Conveyor Belt131</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT__EREF_STORAGE_OUTPUT_FLOW_CONVEYOR_BELT131 = PROCESS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Eref duration Conveyor Belt132</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT__EREF_DURATION_CONVEYOR_BELT132 = PROCESS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Eref output Conveyor Belt133</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT__EREF_OUTPUT_CONVEYOR_BELT133 = PROCESS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Containsname Conveyor Belt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT__CONTAINSNAME_CONVEYOR_BELT = PROCESS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Containsminimal Separation Between Batches Conveyor Belt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT__CONTAINSMINIMAL_SEPARATION_BETWEEN_BATCHES_CONVEYOR_BELT = PROCESS_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Conveyor Belt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT_FEATURE_COUNT = PROCESS_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Conveyor Belt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_BELT_OPERATION_COUNT = PROCESS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.BindingAttributeImpl <em>Binding Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.BindingAttributeImpl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getBindingAttribute()
	 * @generated
	 */
	int BINDING_ATTRIBUTE = 74;

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
	 * The meta object id for the '{@link metamodel_bdsl.impl.storageOutputFlowStorage21Impl <em>storage Output Flow Storage21</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.storageOutputFlowStorage21Impl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getstorageOutputFlowStorage21()
	 * @generated
	 */
	int STORAGE_OUTPUT_FLOW_STORAGE21 = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_OUTPUT_FLOW_STORAGE21__NAME = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>storage Output Flow Storage21</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_OUTPUT_FLOW_STORAGE21_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>storage Output Flow Storage21</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_OUTPUT_FLOW_STORAGE21_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.orderOnStockThresholdStorage22Impl <em>order On Stock Threshold Storage22</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.orderOnStockThresholdStorage22Impl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getorderOnStockThresholdStorage22()
	 * @generated
	 */
	int ORDER_ON_STOCK_THRESHOLD_STORAGE22 = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ON_STOCK_THRESHOLD_STORAGE22__NAME = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>order On Stock Threshold Storage22</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ON_STOCK_THRESHOLD_STORAGE22_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>order On Stock Threshold Storage22</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ON_STOCK_THRESHOLD_STORAGE22_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.processOutputFlowStorage23Impl <em>process Output Flow Storage23</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.processOutputFlowStorage23Impl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getprocessOutputFlowStorage23()
	 * @generated
	 */
	int PROCESS_OUTPUT_FLOW_STORAGE23 = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OUTPUT_FLOW_STORAGE23__NAME = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>process Output Flow Storage23</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OUTPUT_FLOW_STORAGE23_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>process Output Flow Storage23</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OUTPUT_FLOW_STORAGE23_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.refillPolicySupplier31Impl <em>refill Policy Supplier31</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.refillPolicySupplier31Impl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getrefillPolicySupplier31()
	 * @generated
	 */
	int REFILL_POLICY_SUPPLIER31 = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFILL_POLICY_SUPPLIER31__NAME = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>refill Policy Supplier31</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFILL_POLICY_SUPPLIER31_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>refill Policy Supplier31</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFILL_POLICY_SUPPLIER31_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.supplierDelaySupplier32Impl <em>supplier Delay Supplier32</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.supplierDelaySupplier32Impl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getsupplierDelaySupplier32()
	 * @generated
	 */
	int SUPPLIER_DELAY_SUPPLIER32 = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_DELAY_SUPPLIER32__NAME = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>supplier Delay Supplier32</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_DELAY_SUPPLIER32_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>supplier Delay Supplier32</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_DELAY_SUPPLIER32_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.storageOutputFlowBatchProcess41Impl <em>storage Output Flow Batch Process41</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.storageOutputFlowBatchProcess41Impl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getstorageOutputFlowBatchProcess41()
	 * @generated
	 */
	int STORAGE_OUTPUT_FLOW_BATCH_PROCESS41 = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_OUTPUT_FLOW_BATCH_PROCESS41__NAME = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>storage Output Flow Batch Process41</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_OUTPUT_FLOW_BATCH_PROCESS41_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>storage Output Flow Batch Process41</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_OUTPUT_FLOW_BATCH_PROCESS41_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.durationBatchProcess42Impl <em>duration Batch Process42</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.durationBatchProcess42Impl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getdurationBatchProcess42()
	 * @generated
	 */
	int DURATION_BATCH_PROCESS42 = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_BATCH_PROCESS42__NAME = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>duration Batch Process42</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_BATCH_PROCESS42_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>duration Batch Process42</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_BATCH_PROCESS42_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.outputsBatchProcess43Impl <em>outputs Batch Process43</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.outputsBatchProcess43Impl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getoutputsBatchProcess43()
	 * @generated
	 */
	int OUTPUTS_BATCH_PROCESS43 = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUTS_BATCH_PROCESS43__NAME = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>outputs Batch Process43</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUTS_BATCH_PROCESS43_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>outputs Batch Process43</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUTS_BATCH_PROCESS43_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.processOutputFlowOutput51Impl <em>process Output Flow Output51</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.processOutputFlowOutput51Impl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getprocessOutputFlowOutput51()
	 * @generated
	 */
	int PROCESS_OUTPUT_FLOW_OUTPUT51 = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OUTPUT_FLOW_OUTPUT51__NAME = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>process Output Flow Output51</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OUTPUT_FLOW_OUTPUT51_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>process Output Flow Output51</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OUTPUT_FLOW_OUTPUT51_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.quantityStorageOutputFlow61Impl <em>quantity Storage Output Flow61</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.quantityStorageOutputFlow61Impl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getquantityStorageOutputFlow61()
	 * @generated
	 */
	int QUANTITY_STORAGE_OUTPUT_FLOW61 = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_STORAGE_OUTPUT_FLOW61__NAME = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>quantity Storage Output Flow61</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_STORAGE_OUTPUT_FLOW61_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>quantity Storage Output Flow61</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_STORAGE_OUTPUT_FLOW61_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.sourceStorageOutputFlow62Impl <em>source Storage Output Flow62</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.sourceStorageOutputFlow62Impl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getsourceStorageOutputFlow62()
	 * @generated
	 */
	int SOURCE_STORAGE_OUTPUT_FLOW62 = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_STORAGE_OUTPUT_FLOW62__NAME = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>source Storage Output Flow62</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_STORAGE_OUTPUT_FLOW62_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>source Storage Output Flow62</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_STORAGE_OUTPUT_FLOW62_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.destinationStorageOutputFlow63Impl <em>destination Storage Output Flow63</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.destinationStorageOutputFlow63Impl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getdestinationStorageOutputFlow63()
	 * @generated
	 */
	int DESTINATION_STORAGE_OUTPUT_FLOW63 = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTINATION_STORAGE_OUTPUT_FLOW63__NAME = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>destination Storage Output Flow63</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTINATION_STORAGE_OUTPUT_FLOW63_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>destination Storage Output Flow63</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTINATION_STORAGE_OUTPUT_FLOW63_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.quantityProcessOutputFlow71Impl <em>quantity Process Output Flow71</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.quantityProcessOutputFlow71Impl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getquantityProcessOutputFlow71()
	 * @generated
	 */
	int QUANTITY_PROCESS_OUTPUT_FLOW71 = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_PROCESS_OUTPUT_FLOW71__NAME = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>quantity Process Output Flow71</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_PROCESS_OUTPUT_FLOW71_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>quantity Process Output Flow71</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_PROCESS_OUTPUT_FLOW71_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.sourceProcessOutputFlow72Impl <em>source Process Output Flow72</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.sourceProcessOutputFlow72Impl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getsourceProcessOutputFlow72()
	 * @generated
	 */
	int SOURCE_PROCESS_OUTPUT_FLOW72 = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_PROCESS_OUTPUT_FLOW72__NAME = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>source Process Output Flow72</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_PROCESS_OUTPUT_FLOW72_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>source Process Output Flow72</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_PROCESS_OUTPUT_FLOW72_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.processOutputFlowDelayProcessOutputFlow73Impl <em>process Output Flow Delay Process Output Flow73</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.processOutputFlowDelayProcessOutputFlow73Impl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getprocessOutputFlowDelayProcessOutputFlow73()
	 * @generated
	 */
	int PROCESS_OUTPUT_FLOW_DELAY_PROCESS_OUTPUT_FLOW73 = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OUTPUT_FLOW_DELAY_PROCESS_OUTPUT_FLOW73__NAME = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>process Output Flow Delay Process Output Flow73</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OUTPUT_FLOW_DELAY_PROCESS_OUTPUT_FLOW73_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>process Output Flow Delay Process Output Flow73</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OUTPUT_FLOW_DELAY_PROCESS_OUTPUT_FLOW73_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.destinationProcessOutputFlow74Impl <em>destination Process Output Flow74</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.destinationProcessOutputFlow74Impl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getdestinationProcessOutputFlow74()
	 * @generated
	 */
	int DESTINATION_PROCESS_OUTPUT_FLOW74 = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTINATION_PROCESS_OUTPUT_FLOW74__NAME = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>destination Process Output Flow74</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTINATION_PROCESS_OUTPUT_FLOW74_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>destination Process Output Flow74</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTINATION_PROCESS_OUTPUT_FLOW74_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.supplierOrderOnStockThreshold81Impl <em>supplier Order On Stock Threshold81</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.supplierOrderOnStockThreshold81Impl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getsupplierOrderOnStockThreshold81()
	 * @generated
	 */
	int SUPPLIER_ORDER_ON_STOCK_THRESHOLD81 = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_ORDER_ON_STOCK_THRESHOLD81__NAME = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>supplier Order On Stock Threshold81</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_ORDER_ON_STOCK_THRESHOLD81_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>supplier Order On Stock Threshold81</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_ORDER_ON_STOCK_THRESHOLD81_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.storageOrderOnStockThreshold82Impl <em>storage Order On Stock Threshold82</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.storageOrderOnStockThreshold82Impl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getstorageOrderOnStockThreshold82()
	 * @generated
	 */
	int STORAGE_ORDER_ON_STOCK_THRESHOLD82 = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_ORDER_ON_STOCK_THRESHOLD82__NAME = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>storage Order On Stock Threshold82</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_ORDER_ON_STOCK_THRESHOLD82_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>storage Order On Stock Threshold82</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_ORDER_ON_STOCK_THRESHOLD82_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.storageOutputFlowConveyorBelt131Impl <em>storage Output Flow Conveyor Belt131</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.storageOutputFlowConveyorBelt131Impl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getstorageOutputFlowConveyorBelt131()
	 * @generated
	 */
	int STORAGE_OUTPUT_FLOW_CONVEYOR_BELT131 = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_OUTPUT_FLOW_CONVEYOR_BELT131__NAME = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>storage Output Flow Conveyor Belt131</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_OUTPUT_FLOW_CONVEYOR_BELT131_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>storage Output Flow Conveyor Belt131</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_OUTPUT_FLOW_CONVEYOR_BELT131_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.durationConveyorBelt132Impl <em>duration Conveyor Belt132</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.durationConveyorBelt132Impl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getdurationConveyorBelt132()
	 * @generated
	 */
	int DURATION_CONVEYOR_BELT132 = 38;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_CONVEYOR_BELT132__NAME = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>duration Conveyor Belt132</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_CONVEYOR_BELT132_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>duration Conveyor Belt132</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURATION_CONVEYOR_BELT132_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.outputConveyorBelt133Impl <em>output Conveyor Belt133</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.outputConveyorBelt133Impl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getoutputConveyorBelt133()
	 * @generated
	 */
	int OUTPUT_CONVEYOR_BELT133 = 39;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_CONVEYOR_BELT133__NAME = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>output Conveyor Belt133</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_CONVEYOR_BELT133_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>output Conveyor Belt133</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_CONVEYOR_BELT133_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.nameQueryImpl <em>name Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.nameQueryImpl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getnameQuery()
	 * @generated
	 */
	int NAME_QUERY = 40;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_QUERY__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>name Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_QUERY_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>name Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_QUERY_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.valueQueryImpl <em>value Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.valueQueryImpl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getvalueQuery()
	 * @generated
	 */
	int VALUE_QUERY = 41;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_QUERY__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>value Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_QUERY_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>value Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_QUERY_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.errorQueryImpl <em>error Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.errorQueryImpl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#geterrorQuery()
	 * @generated
	 */
	int ERROR_QUERY = 42;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_QUERY__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>error Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_QUERY_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>error Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_QUERY_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.typeQueryImpl <em>type Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.typeQueryImpl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#gettypeQuery()
	 * @generated
	 */
	int TYPE_QUERY = 43;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_QUERY__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>type Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_QUERY_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>type Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_QUERY_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.systemQueryImpl <em>system Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.systemQueryImpl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getsystemQuery()
	 * @generated
	 */
	int SYSTEM_QUERY = 44;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_QUERY__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>system Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_QUERY_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>system Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_QUERY_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.nameStorageImpl <em>name Storage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.nameStorageImpl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getnameStorage()
	 * @generated
	 */
	int NAME_STORAGE = 45;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_STORAGE__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>name Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_STORAGE_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>name Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_STORAGE_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.sizeStorageImpl <em>size Storage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.sizeStorageImpl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getsizeStorage()
	 * @generated
	 */
	int SIZE_STORAGE = 46;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_STORAGE__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>size Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_STORAGE_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>size Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_STORAGE_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.initialContentStorageImpl <em>initial Content Storage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.initialContentStorageImpl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getinitialContentStorage()
	 * @generated
	 */
	int INITIAL_CONTENT_STORAGE = 47;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_CONTENT_STORAGE__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>initial Content Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_CONTENT_STORAGE_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>initial Content Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_CONTENT_STORAGE_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.overflowStorageImpl <em>overflow Storage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.overflowStorageImpl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getoverflowStorage()
	 * @generated
	 */
	int OVERFLOW_STORAGE = 48;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERFLOW_STORAGE__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>overflow Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERFLOW_STORAGE_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>overflow Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERFLOW_STORAGE_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.nameSupplierImpl <em>name Supplier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.nameSupplierImpl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getnameSupplier()
	 * @generated
	 */
	int NAME_SUPPLIER = 49;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_SUPPLIER__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>name Supplier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_SUPPLIER_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>name Supplier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_SUPPLIER_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.deliveredPercentageSupplierImpl <em>delivered Percentage Supplier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.deliveredPercentageSupplierImpl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getdeliveredPercentageSupplier()
	 * @generated
	 */
	int DELIVERED_PERCENTAGE_SUPPLIER = 50;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERED_PERCENTAGE_SUPPLIER__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>delivered Percentage Supplier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERED_PERCENTAGE_SUPPLIER_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>delivered Percentage Supplier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERED_PERCENTAGE_SUPPLIER_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.nameBatchProcessImpl <em>name Batch Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.nameBatchProcessImpl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getnameBatchProcess()
	 * @generated
	 */
	int NAME_BATCH_PROCESS = 51;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_BATCH_PROCESS__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>name Batch Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_BATCH_PROCESS_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>name Batch Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_BATCH_PROCESS_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.percentageOfSuccessBatchProcessImpl <em>percentage Of Success Batch Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.percentageOfSuccessBatchProcessImpl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getpercentageOfSuccessBatchProcess()
	 * @generated
	 */
	int PERCENTAGE_OF_SUCCESS_BATCH_PROCESS = 52;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_OF_SUCCESS_BATCH_PROCESS__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>percentage Of Success Batch Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_OF_SUCCESS_BATCH_PROCESS_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>percentage Of Success Batch Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERCENTAGE_OF_SUCCESS_BATCH_PROCESS_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.numberOfChainsBatchProcessImpl <em>number Of Chains Batch Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.numberOfChainsBatchProcessImpl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getnumberOfChainsBatchProcess()
	 * @generated
	 */
	int NUMBER_OF_CHAINS_BATCH_PROCESS = 53;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CHAINS_BATCH_PROCESS__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>number Of Chains Batch Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CHAINS_BATCH_PROCESS_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>number Of Chains Batch Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CHAINS_BATCH_PROCESS_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.typeOutputImpl <em>type Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.typeOutputImpl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#gettypeOutput()
	 * @generated
	 */
	int TYPE_OUTPUT = 54;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OUTPUT__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>type Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OUTPUT_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>type Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OUTPUT_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.descriptionOutputImpl <em>description Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.descriptionOutputImpl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getdescriptionOutput()
	 * @generated
	 */
	int DESCRIPTION_OUTPUT = 55;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_OUTPUT__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>description Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_OUTPUT_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>description Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_OUTPUT_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.periodOrderOnStockThresholdImpl <em>period Order On Stock Threshold</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.periodOrderOnStockThresholdImpl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getperiodOrderOnStockThreshold()
	 * @generated
	 */
	int PERIOD_ORDER_ON_STOCK_THRESHOLD = 56;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_ORDER_ON_STOCK_THRESHOLD__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>period Order On Stock Threshold</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_ORDER_ON_STOCK_THRESHOLD_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>period Order On Stock Threshold</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_ORDER_ON_STOCK_THRESHOLD_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.thresholdOrderOnStockThresholdImpl <em>threshold Order On Stock Threshold</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.thresholdOrderOnStockThresholdImpl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getthresholdOrderOnStockThreshold()
	 * @generated
	 */
	int THRESHOLD_ORDER_ON_STOCK_THRESHOLD = 57;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRESHOLD_ORDER_ON_STOCK_THRESHOLD__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>threshold Order On Stock Threshold</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRESHOLD_ORDER_ON_STOCK_THRESHOLD_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>threshold Order On Stock Threshold</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRESHOLD_ORDER_ON_STOCK_THRESHOLD_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.nameOrderOnStockThresholdImpl <em>name Order On Stock Threshold</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.nameOrderOnStockThresholdImpl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getnameOrderOnStockThreshold()
	 * @generated
	 */
	int NAME_ORDER_ON_STOCK_THRESHOLD = 58;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_ORDER_ON_STOCK_THRESHOLD__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>name Order On Stock Threshold</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_ORDER_ON_STOCK_THRESHOLD_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>name Order On Stock Threshold</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_ORDER_ON_STOCK_THRESHOLD_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.orderQuantityOrderOnStockThresholdImpl <em>order Quantity Order On Stock Threshold</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.orderQuantityOrderOnStockThresholdImpl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getorderQuantityOrderOnStockThreshold()
	 * @generated
	 */
	int ORDER_QUANTITY_ORDER_ON_STOCK_THRESHOLD = 59;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_QUANTITY_ORDER_ON_STOCK_THRESHOLD__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>order Quantity Order On Stock Threshold</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_QUANTITY_ORDER_ON_STOCK_THRESHOLD_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>order Quantity Order On Stock Threshold</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_QUANTITY_ORDER_ON_STOCK_THRESHOLD_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.orderTypeOrderOnStockThresholdImpl <em>order Type Order On Stock Threshold</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.orderTypeOrderOnStockThresholdImpl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getorderTypeOrderOnStockThreshold()
	 * @generated
	 */
	int ORDER_TYPE_ORDER_ON_STOCK_THRESHOLD = 60;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_TYPE_ORDER_ON_STOCK_THRESHOLD__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>order Type Order On Stock Threshold</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_TYPE_ORDER_ON_STOCK_THRESHOLD_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>order Type Order On Stock Threshold</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_TYPE_ORDER_ON_STOCK_THRESHOLD_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.valueScalarImpl <em>value Scalar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.valueScalarImpl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getvalueScalar()
	 * @generated
	 */
	int VALUE_SCALAR = 61;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SCALAR__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>value Scalar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SCALAR_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>value Scalar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SCALAR_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.locationGaussianImpl <em>location Gaussian</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.locationGaussianImpl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getlocationGaussian()
	 * @generated
	 */
	int LOCATION_GAUSSIAN = 62;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_GAUSSIAN__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>location Gaussian</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_GAUSSIAN_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>location Gaussian</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_GAUSSIAN_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.scaleGaussianImpl <em>scale Gaussian</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.scaleGaussianImpl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getscaleGaussian()
	 * @generated
	 */
	int SCALE_GAUSSIAN = 63;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_GAUSSIAN__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>scale Gaussian</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_GAUSSIAN_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>scale Gaussian</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_GAUSSIAN_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.intervalPoissonImpl <em>interval Poisson</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.intervalPoissonImpl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getintervalPoisson()
	 * @generated
	 */
	int INTERVAL_POISSON = 64;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_POISSON__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>interval Poisson</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_POISSON_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>interval Poisson</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_POISSON_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.minimumUniformImpl <em>minimum Uniform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.minimumUniformImpl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getminimumUniform()
	 * @generated
	 */
	int MINIMUM_UNIFORM = 65;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMUM_UNIFORM__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>minimum Uniform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMUM_UNIFORM_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>minimum Uniform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMUM_UNIFORM_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.maximumUniformImpl <em>maximum Uniform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.maximumUniformImpl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getmaximumUniform()
	 * @generated
	 */
	int MAXIMUM_UNIFORM = 66;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAXIMUM_UNIFORM__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>maximum Uniform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAXIMUM_UNIFORM_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>maximum Uniform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAXIMUM_UNIFORM_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.nameConveyorBeltImpl <em>name Conveyor Belt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.nameConveyorBeltImpl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getnameConveyorBelt()
	 * @generated
	 */
	int NAME_CONVEYOR_BELT = 67;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_CONVEYOR_BELT__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>name Conveyor Belt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_CONVEYOR_BELT_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>name Conveyor Belt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_CONVEYOR_BELT_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.minimalSeparationBetweenBatchesConveyorBeltImpl <em>minimal Separation Between Batches Conveyor Belt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.minimalSeparationBetweenBatchesConveyorBeltImpl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getminimalSeparationBetweenBatchesConveyorBelt()
	 * @generated
	 */
	int MINIMAL_SEPARATION_BETWEEN_BATCHES_CONVEYOR_BELT = 68;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMAL_SEPARATION_BETWEEN_BATCHES_CONVEYOR_BELT__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>minimal Separation Between Batches Conveyor Belt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMAL_SEPARATION_BETWEEN_BATCHES_CONVEYOR_BELT_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>minimal Separation Between Batches Conveyor Belt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINIMAL_SEPARATION_BETWEEN_BATCHES_CONVEYOR_BELT_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.NoneElementImpl <em>None Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.NoneElementImpl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getNoneElement()
	 * @generated
	 */
	int NONE_ELEMENT = 69;

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
	 * The meta object id for the '{@link metamodel_bdsl.impl.IntermediateElementImpl <em>Intermediate Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.IntermediateElementImpl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getIntermediateElement()
	 * @generated
	 */
	int INTERMEDIATE_ELEMENT = 71;

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
	 * The number of structural features of the '<em>Intermediate Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Intermediate Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.impl.MetamodelElementImpl <em>Metamodel Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.MetamodelElementImpl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getMetamodelElement()
	 * @generated
	 */
	int METAMODEL_ELEMENT = 72;

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
	 * The meta object id for the '{@link metamodel_bdsl.impl.MetamodelElementFeatureImpl <em>Metamodel Element Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.MetamodelElementFeatureImpl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getMetamodelElementFeature()
	 * @generated
	 */
	int METAMODEL_ELEMENT_FEATURE = 73;

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
	 * The meta object id for the '{@link metamodel_bdsl.impl.VirtualAttributeImpl <em>Virtual Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.VirtualAttributeImpl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getVirtualAttribute()
	 * @generated
	 */
	int VIRTUAL_ATTRIBUTE = 75;

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
	 * The meta object id for the '{@link metamodel_bdsl.impl.SiriusTagImpl <em>Sirius Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.impl.SiriusTagImpl
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getSiriusTag()
	 * @generated
	 */
	int SIRIUS_TAG = 76;

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
	 * The meta object id for the '{@link metamodel_bdsl.OrderType <em>Order Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.OrderType
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getOrderType()
	 * @generated
	 */
	int ORDER_TYPE = 77;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.OutputType <em>Output Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.OutputType
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getOutputType()
	 * @generated
	 */
	int OUTPUT_TYPE = 78;

	/**
	 * The meta object id for the '{@link metamodel_bdsl.QueryType <em>Query Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodel_bdsl.QueryType
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getQueryType()
	 * @generated
	 */
	int QUERY_TYPE = 79;

	/**
	 * The meta object id for the '<em>Percent</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getPercent()
	 * @generated
	 */
	int PERCENT = 80;

	/**
	 * The meta object id for the '<em>Positive Int</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getPositiveInt()
	 * @generated
	 */
	int POSITIVE_INT = 81;

	/**
	 * The meta object id for the '<em>Positive Double</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getPositiveDouble()
	 * @generated
	 */
	int POSITIVE_DOUBLE = 82;

	/**
	 * The meta object id for the '<em>Positive Int Not Null</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getPositiveIntNotNull()
	 * @generated
	 */
	int POSITIVE_INT_NOT_NULL = 83;

	/**
	 * The meta object id for the '<em>Positive Double Not Null</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getPositiveDoubleNotNull()
	 * @generated
	 */
	int POSITIVE_DOUBLE_NOT_NULL = 84;


	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see metamodel_bdsl.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.Model#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metamodel_bdsl.Model#getName()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodel_bdsl.Model#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Query</em>'.
	 * @see metamodel_bdsl.Model#getQuery()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Query();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodel_bdsl.Model#getOrderOnStockThreshold <em>Order On Stock Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Order On Stock Threshold</em>'.
	 * @see metamodel_bdsl.Model#getOrderOnStockThreshold()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_OrderOnStockThreshold();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodel_bdsl.Model#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component</em>'.
	 * @see metamodel_bdsl.Model#getComponent()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Component();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodel_bdsl.Model#getFlow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flow</em>'.
	 * @see metamodel_bdsl.Model#getFlow()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Flow();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodel_bdsl.Model#getContainsNoneElement <em>Contains None Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains None Element</em>'.
	 * @see metamodel_bdsl.Model#getContainsNoneElement()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_ContainsNoneElement();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodel_bdsl.Model#getContainsBindingElement <em>Contains Binding Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Binding Element</em>'.
	 * @see metamodel_bdsl.Model#getContainsBindingElement()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_ContainsBindingElement();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodel_bdsl.Model#getContainsIntermediateElement <em>Contains Intermediate Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Intermediate Element</em>'.
	 * @see metamodel_bdsl.Model#getContainsIntermediateElement()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_ContainsIntermediateElement();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodel_bdsl.Model#getContainsMetamodelElement <em>Contains Metamodel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Metamodel Element</em>'.
	 * @see metamodel_bdsl.Model#getContainsMetamodelElement()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_ContainsMetamodelElement();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodel_bdsl.Model#getContainsMetamodelElementFeature <em>Contains Metamodel Element Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Metamodel Element Feature</em>'.
	 * @see metamodel_bdsl.Model#getContainsMetamodelElementFeature()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_ContainsMetamodelElementFeature();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodel_bdsl.Model#getContainsBindingAttribute <em>Contains Binding Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Binding Attribute</em>'.
	 * @see metamodel_bdsl.Model#getContainsBindingAttribute()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_ContainsBindingAttribute();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodel_bdsl.Model#getContainsVirtualAttribute <em>Contains Virtual Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Virtual Attribute</em>'.
	 * @see metamodel_bdsl.Model#getContainsVirtualAttribute()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_ContainsVirtualAttribute();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.Model#getSourceMM <em>Source MM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source MM</em>'.
	 * @see metamodel_bdsl.Model#getSourceMM()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_SourceMM();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.Query <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query</em>'.
	 * @see metamodel_bdsl.Query
	 * @generated
	 */
	EClass getQuery();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.Query#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metamodel_bdsl.Query#getName()
	 * @see #getQuery()
	 * @generated
	 */
	EAttribute getQuery_Name();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.Query#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see metamodel_bdsl.Query#getValue()
	 * @see #getQuery()
	 * @generated
	 */
	EAttribute getQuery_Value();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.Query#getError <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error</em>'.
	 * @see metamodel_bdsl.Query#getError()
	 * @see #getQuery()
	 * @generated
	 */
	EAttribute getQuery_Error();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.Query#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see metamodel_bdsl.Query#getType()
	 * @see #getQuery()
	 * @generated
	 */
	EAttribute getQuery_Type();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.Query#isSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System</em>'.
	 * @see metamodel_bdsl.Query#isSystem()
	 * @see #getQuery()
	 * @generated
	 */
	EAttribute getQuery_System();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodel_bdsl.Query#getContainsnameQuery <em>Containsname Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containsname Query</em>'.
	 * @see metamodel_bdsl.Query#getContainsnameQuery()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_ContainsnameQuery();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodel_bdsl.Query#getContainsvalueQuery <em>Containsvalue Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containsvalue Query</em>'.
	 * @see metamodel_bdsl.Query#getContainsvalueQuery()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_ContainsvalueQuery();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodel_bdsl.Query#getContainserrorQuery <em>Containserror Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containserror Query</em>'.
	 * @see metamodel_bdsl.Query#getContainserrorQuery()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_ContainserrorQuery();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodel_bdsl.Query#getContainstypeQuery <em>Containstype Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containstype Query</em>'.
	 * @see metamodel_bdsl.Query#getContainstypeQuery()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_ContainstypeQuery();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodel_bdsl.Query#getContainssystemQuery <em>Containssystem Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containssystem Query</em>'.
	 * @see metamodel_bdsl.Query#getContainssystemQuery()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_ContainssystemQuery();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.Storage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage</em>'.
	 * @see metamodel_bdsl.Storage
	 * @generated
	 */
	EClass getStorage();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.Storage#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see metamodel_bdsl.Storage#getSize()
	 * @see #getStorage()
	 * @generated
	 */
	EAttribute getStorage_Size();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.Storage#getInitialContent <em>Initial Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Content</em>'.
	 * @see metamodel_bdsl.Storage#getInitialContent()
	 * @see #getStorage()
	 * @generated
	 */
	EAttribute getStorage_InitialContent();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.Storage#isOverflow <em>Overflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overflow</em>'.
	 * @see metamodel_bdsl.Storage#isOverflow()
	 * @see #getStorage()
	 * @generated
	 */
	EAttribute getStorage_Overflow();

	/**
	 * Returns the meta object for the reference list '{@link metamodel_bdsl.Storage#getStorageOutputFlow <em>Storage Output Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Storage Output Flow</em>'.
	 * @see metamodel_bdsl.Storage#getStorageOutputFlow()
	 * @see #getStorage()
	 * @generated
	 */
	EReference getStorage_StorageOutputFlow();

	/**
	 * Returns the meta object for the reference list '{@link metamodel_bdsl.Storage#getOrderOnStockThreshold <em>Order On Stock Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Order On Stock Threshold</em>'.
	 * @see metamodel_bdsl.Storage#getOrderOnStockThreshold()
	 * @see #getStorage()
	 * @generated
	 */
	EReference getStorage_OrderOnStockThreshold();

	/**
	 * Returns the meta object for the reference list '{@link metamodel_bdsl.Storage#getProcessOutputFlow <em>Process Output Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Process Output Flow</em>'.
	 * @see metamodel_bdsl.Storage#getProcessOutputFlow()
	 * @see #getStorage()
	 * @generated
	 */
	EReference getStorage_ProcessOutputFlow();

	/**
	 * Returns the meta object for the containment reference '{@link metamodel_bdsl.Storage#getEref_storageOutputFlowStorage21 <em>Eref storage Output Flow Storage21</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Eref storage Output Flow Storage21</em>'.
	 * @see metamodel_bdsl.Storage#getEref_storageOutputFlowStorage21()
	 * @see #getStorage()
	 * @generated
	 */
	EReference getStorage_Eref_storageOutputFlowStorage21();

	/**
	 * Returns the meta object for the containment reference '{@link metamodel_bdsl.Storage#getEref_orderOnStockThresholdStorage22 <em>Eref order On Stock Threshold Storage22</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Eref order On Stock Threshold Storage22</em>'.
	 * @see metamodel_bdsl.Storage#getEref_orderOnStockThresholdStorage22()
	 * @see #getStorage()
	 * @generated
	 */
	EReference getStorage_Eref_orderOnStockThresholdStorage22();

	/**
	 * Returns the meta object for the containment reference '{@link metamodel_bdsl.Storage#getEref_processOutputFlowStorage23 <em>Eref process Output Flow Storage23</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Eref process Output Flow Storage23</em>'.
	 * @see metamodel_bdsl.Storage#getEref_processOutputFlowStorage23()
	 * @see #getStorage()
	 * @generated
	 */
	EReference getStorage_Eref_processOutputFlowStorage23();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodel_bdsl.Storage#getContainsnameStorage <em>Containsname Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containsname Storage</em>'.
	 * @see metamodel_bdsl.Storage#getContainsnameStorage()
	 * @see #getStorage()
	 * @generated
	 */
	EReference getStorage_ContainsnameStorage();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodel_bdsl.Storage#getContainssizeStorage <em>Containssize Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containssize Storage</em>'.
	 * @see metamodel_bdsl.Storage#getContainssizeStorage()
	 * @see #getStorage()
	 * @generated
	 */
	EReference getStorage_ContainssizeStorage();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodel_bdsl.Storage#getContainsinitialContentStorage <em>Containsinitial Content Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containsinitial Content Storage</em>'.
	 * @see metamodel_bdsl.Storage#getContainsinitialContentStorage()
	 * @see #getStorage()
	 * @generated
	 */
	EReference getStorage_ContainsinitialContentStorage();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodel_bdsl.Storage#getContainsoverflowStorage <em>Containsoverflow Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containsoverflow Storage</em>'.
	 * @see metamodel_bdsl.Storage#getContainsoverflowStorage()
	 * @see #getStorage()
	 * @generated
	 */
	EReference getStorage_ContainsoverflowStorage();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.Supplier <em>Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supplier</em>'.
	 * @see metamodel_bdsl.Supplier
	 * @generated
	 */
	EClass getSupplier();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.Supplier#getDeliveredPercentage <em>Delivered Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delivered Percentage</em>'.
	 * @see metamodel_bdsl.Supplier#getDeliveredPercentage()
	 * @see #getSupplier()
	 * @generated
	 */
	EAttribute getSupplier_DeliveredPercentage();

	/**
	 * Returns the meta object for the reference list '{@link metamodel_bdsl.Supplier#getRefillPolicy <em>Refill Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refill Policy</em>'.
	 * @see metamodel_bdsl.Supplier#getRefillPolicy()
	 * @see #getSupplier()
	 * @generated
	 */
	EReference getSupplier_RefillPolicy();

	/**
	 * Returns the meta object for the containment reference '{@link metamodel_bdsl.Supplier#getSupplierDelay <em>Supplier Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Supplier Delay</em>'.
	 * @see metamodel_bdsl.Supplier#getSupplierDelay()
	 * @see #getSupplier()
	 * @generated
	 */
	EReference getSupplier_SupplierDelay();

	/**
	 * Returns the meta object for the containment reference '{@link metamodel_bdsl.Supplier#getEref_refillPolicySupplier31 <em>Eref refill Policy Supplier31</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Eref refill Policy Supplier31</em>'.
	 * @see metamodel_bdsl.Supplier#getEref_refillPolicySupplier31()
	 * @see #getSupplier()
	 * @generated
	 */
	EReference getSupplier_Eref_refillPolicySupplier31();

	/**
	 * Returns the meta object for the containment reference '{@link metamodel_bdsl.Supplier#getEref_supplierDelaySupplier32 <em>Eref supplier Delay Supplier32</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Eref supplier Delay Supplier32</em>'.
	 * @see metamodel_bdsl.Supplier#getEref_supplierDelaySupplier32()
	 * @see #getSupplier()
	 * @generated
	 */
	EReference getSupplier_Eref_supplierDelaySupplier32();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodel_bdsl.Supplier#getContainsnameSupplier <em>Containsname Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containsname Supplier</em>'.
	 * @see metamodel_bdsl.Supplier#getContainsnameSupplier()
	 * @see #getSupplier()
	 * @generated
	 */
	EReference getSupplier_ContainsnameSupplier();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodel_bdsl.Supplier#getContainsdeliveredPercentageSupplier <em>Containsdelivered Percentage Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containsdelivered Percentage Supplier</em>'.
	 * @see metamodel_bdsl.Supplier#getContainsdeliveredPercentageSupplier()
	 * @see #getSupplier()
	 * @generated
	 */
	EReference getSupplier_ContainsdeliveredPercentageSupplier();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.BatchProcess <em>Batch Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Batch Process</em>'.
	 * @see metamodel_bdsl.BatchProcess
	 * @generated
	 */
	EClass getBatchProcess();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.BatchProcess#getPercentageOfSuccess <em>Percentage Of Success</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage Of Success</em>'.
	 * @see metamodel_bdsl.BatchProcess#getPercentageOfSuccess()
	 * @see #getBatchProcess()
	 * @generated
	 */
	EAttribute getBatchProcess_PercentageOfSuccess();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.BatchProcess#getNumberOfChains <em>Number Of Chains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Chains</em>'.
	 * @see metamodel_bdsl.BatchProcess#getNumberOfChains()
	 * @see #getBatchProcess()
	 * @generated
	 */
	EAttribute getBatchProcess_NumberOfChains();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodel_bdsl.BatchProcess#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputs</em>'.
	 * @see metamodel_bdsl.BatchProcess#getOutputs()
	 * @see #getBatchProcess()
	 * @generated
	 */
	EReference getBatchProcess_Outputs();

	/**
	 * Returns the meta object for the containment reference '{@link metamodel_bdsl.BatchProcess#getEref_storageOutputFlowBatchProcess41 <em>Eref storage Output Flow Batch Process41</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Eref storage Output Flow Batch Process41</em>'.
	 * @see metamodel_bdsl.BatchProcess#getEref_storageOutputFlowBatchProcess41()
	 * @see #getBatchProcess()
	 * @generated
	 */
	EReference getBatchProcess_Eref_storageOutputFlowBatchProcess41();

	/**
	 * Returns the meta object for the containment reference '{@link metamodel_bdsl.BatchProcess#getEref_durationBatchProcess42 <em>Eref duration Batch Process42</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Eref duration Batch Process42</em>'.
	 * @see metamodel_bdsl.BatchProcess#getEref_durationBatchProcess42()
	 * @see #getBatchProcess()
	 * @generated
	 */
	EReference getBatchProcess_Eref_durationBatchProcess42();

	/**
	 * Returns the meta object for the containment reference '{@link metamodel_bdsl.BatchProcess#getEref_outputsBatchProcess43 <em>Eref outputs Batch Process43</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Eref outputs Batch Process43</em>'.
	 * @see metamodel_bdsl.BatchProcess#getEref_outputsBatchProcess43()
	 * @see #getBatchProcess()
	 * @generated
	 */
	EReference getBatchProcess_Eref_outputsBatchProcess43();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodel_bdsl.BatchProcess#getContainsnameBatchProcess <em>Containsname Batch Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containsname Batch Process</em>'.
	 * @see metamodel_bdsl.BatchProcess#getContainsnameBatchProcess()
	 * @see #getBatchProcess()
	 * @generated
	 */
	EReference getBatchProcess_ContainsnameBatchProcess();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodel_bdsl.BatchProcess#getContainspercentageOfSuccessBatchProcess <em>Containspercentage Of Success Batch Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containspercentage Of Success Batch Process</em>'.
	 * @see metamodel_bdsl.BatchProcess#getContainspercentageOfSuccessBatchProcess()
	 * @see #getBatchProcess()
	 * @generated
	 */
	EReference getBatchProcess_ContainspercentageOfSuccessBatchProcess();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodel_bdsl.BatchProcess#getContainsnumberOfChainsBatchProcess <em>Containsnumber Of Chains Batch Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containsnumber Of Chains Batch Process</em>'.
	 * @see metamodel_bdsl.BatchProcess#getContainsnumberOfChainsBatchProcess()
	 * @see #getBatchProcess()
	 * @generated
	 */
	EReference getBatchProcess_ContainsnumberOfChainsBatchProcess();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see metamodel_bdsl.Output
	 * @generated
	 */
	EClass getOutput();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.Output#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see metamodel_bdsl.Output#getType()
	 * @see #getOutput()
	 * @generated
	 */
	EAttribute getOutput_Type();

	/**
	 * Returns the meta object for the reference list '{@link metamodel_bdsl.Output#getProcessOutputFlow <em>Process Output Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Process Output Flow</em>'.
	 * @see metamodel_bdsl.Output#getProcessOutputFlow()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_ProcessOutputFlow();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.Output#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see metamodel_bdsl.Output#getDescription()
	 * @see #getOutput()
	 * @generated
	 */
	EAttribute getOutput_Description();

	/**
	 * Returns the meta object for the containment reference '{@link metamodel_bdsl.Output#getEref_processOutputFlowOutput51 <em>Eref process Output Flow Output51</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Eref process Output Flow Output51</em>'.
	 * @see metamodel_bdsl.Output#getEref_processOutputFlowOutput51()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_Eref_processOutputFlowOutput51();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodel_bdsl.Output#getContainstypeOutput <em>Containstype Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containstype Output</em>'.
	 * @see metamodel_bdsl.Output#getContainstypeOutput()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_ContainstypeOutput();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodel_bdsl.Output#getContainsdescriptionOutput <em>Containsdescription Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containsdescription Output</em>'.
	 * @see metamodel_bdsl.Output#getContainsdescriptionOutput()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_ContainsdescriptionOutput();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.StorageOutputFlow <em>Storage Output Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage Output Flow</em>'.
	 * @see metamodel_bdsl.StorageOutputFlow
	 * @generated
	 */
	EClass getStorageOutputFlow();

	/**
	 * Returns the meta object for the reference '{@link metamodel_bdsl.StorageOutputFlow#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see metamodel_bdsl.StorageOutputFlow#getSource()
	 * @see #getStorageOutputFlow()
	 * @generated
	 */
	EReference getStorageOutputFlow_Source();

	/**
	 * Returns the meta object for the reference '{@link metamodel_bdsl.StorageOutputFlow#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see metamodel_bdsl.StorageOutputFlow#getDestination()
	 * @see #getStorageOutputFlow()
	 * @generated
	 */
	EReference getStorageOutputFlow_Destination();

	/**
	 * Returns the meta object for the containment reference '{@link metamodel_bdsl.StorageOutputFlow#getEref_quantityStorageOutputFlow61 <em>Eref quantity Storage Output Flow61</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Eref quantity Storage Output Flow61</em>'.
	 * @see metamodel_bdsl.StorageOutputFlow#getEref_quantityStorageOutputFlow61()
	 * @see #getStorageOutputFlow()
	 * @generated
	 */
	EReference getStorageOutputFlow_Eref_quantityStorageOutputFlow61();

	/**
	 * Returns the meta object for the containment reference '{@link metamodel_bdsl.StorageOutputFlow#getEref_sourceStorageOutputFlow62 <em>Eref source Storage Output Flow62</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Eref source Storage Output Flow62</em>'.
	 * @see metamodel_bdsl.StorageOutputFlow#getEref_sourceStorageOutputFlow62()
	 * @see #getStorageOutputFlow()
	 * @generated
	 */
	EReference getStorageOutputFlow_Eref_sourceStorageOutputFlow62();

	/**
	 * Returns the meta object for the containment reference '{@link metamodel_bdsl.StorageOutputFlow#getEref_destinationStorageOutputFlow63 <em>Eref destination Storage Output Flow63</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Eref destination Storage Output Flow63</em>'.
	 * @see metamodel_bdsl.StorageOutputFlow#getEref_destinationStorageOutputFlow63()
	 * @see #getStorageOutputFlow()
	 * @generated
	 */
	EReference getStorageOutputFlow_Eref_destinationStorageOutputFlow63();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.ProcessOutputFlow <em>Process Output Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Output Flow</em>'.
	 * @see metamodel_bdsl.ProcessOutputFlow
	 * @generated
	 */
	EClass getProcessOutputFlow();

	/**
	 * Returns the meta object for the reference '{@link metamodel_bdsl.ProcessOutputFlow#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see metamodel_bdsl.ProcessOutputFlow#getSource()
	 * @see #getProcessOutputFlow()
	 * @generated
	 */
	EReference getProcessOutputFlow_Source();

	/**
	 * Returns the meta object for the containment reference '{@link metamodel_bdsl.ProcessOutputFlow#getProcessOutputFlowDelay <em>Process Output Flow Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Process Output Flow Delay</em>'.
	 * @see metamodel_bdsl.ProcessOutputFlow#getProcessOutputFlowDelay()
	 * @see #getProcessOutputFlow()
	 * @generated
	 */
	EReference getProcessOutputFlow_ProcessOutputFlowDelay();

	/**
	 * Returns the meta object for the reference '{@link metamodel_bdsl.ProcessOutputFlow#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see metamodel_bdsl.ProcessOutputFlow#getDestination()
	 * @see #getProcessOutputFlow()
	 * @generated
	 */
	EReference getProcessOutputFlow_Destination();

	/**
	 * Returns the meta object for the containment reference '{@link metamodel_bdsl.ProcessOutputFlow#getEref_quantityProcessOutputFlow71 <em>Eref quantity Process Output Flow71</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Eref quantity Process Output Flow71</em>'.
	 * @see metamodel_bdsl.ProcessOutputFlow#getEref_quantityProcessOutputFlow71()
	 * @see #getProcessOutputFlow()
	 * @generated
	 */
	EReference getProcessOutputFlow_Eref_quantityProcessOutputFlow71();

	/**
	 * Returns the meta object for the containment reference '{@link metamodel_bdsl.ProcessOutputFlow#getEref_sourceProcessOutputFlow72 <em>Eref source Process Output Flow72</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Eref source Process Output Flow72</em>'.
	 * @see metamodel_bdsl.ProcessOutputFlow#getEref_sourceProcessOutputFlow72()
	 * @see #getProcessOutputFlow()
	 * @generated
	 */
	EReference getProcessOutputFlow_Eref_sourceProcessOutputFlow72();

	/**
	 * Returns the meta object for the containment reference '{@link metamodel_bdsl.ProcessOutputFlow#getEref_processOutputFlowDelayProcessOutputFlow73 <em>Eref process Output Flow Delay Process Output Flow73</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Eref process Output Flow Delay Process Output Flow73</em>'.
	 * @see metamodel_bdsl.ProcessOutputFlow#getEref_processOutputFlowDelayProcessOutputFlow73()
	 * @see #getProcessOutputFlow()
	 * @generated
	 */
	EReference getProcessOutputFlow_Eref_processOutputFlowDelayProcessOutputFlow73();

	/**
	 * Returns the meta object for the containment reference '{@link metamodel_bdsl.ProcessOutputFlow#getEref_destinationProcessOutputFlow74 <em>Eref destination Process Output Flow74</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Eref destination Process Output Flow74</em>'.
	 * @see metamodel_bdsl.ProcessOutputFlow#getEref_destinationProcessOutputFlow74()
	 * @see #getProcessOutputFlow()
	 * @generated
	 */
	EReference getProcessOutputFlow_Eref_destinationProcessOutputFlow74();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see metamodel_bdsl.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for the reference list '{@link metamodel_bdsl.Process#getStorageOutputFlow <em>Storage Output Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Storage Output Flow</em>'.
	 * @see metamodel_bdsl.Process#getStorageOutputFlow()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_StorageOutputFlow();

	/**
	 * Returns the meta object for the containment reference '{@link metamodel_bdsl.Process#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Duration</em>'.
	 * @see metamodel_bdsl.Process#getDuration()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Duration();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.OrderOnStockThreshold <em>Order On Stock Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order On Stock Threshold</em>'.
	 * @see metamodel_bdsl.OrderOnStockThreshold
	 * @generated
	 */
	EClass getOrderOnStockThreshold();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.OrderOnStockThreshold#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see metamodel_bdsl.OrderOnStockThreshold#getPeriod()
	 * @see #getOrderOnStockThreshold()
	 * @generated
	 */
	EAttribute getOrderOnStockThreshold_Period();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.OrderOnStockThreshold#getThreshold <em>Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Threshold</em>'.
	 * @see metamodel_bdsl.OrderOnStockThreshold#getThreshold()
	 * @see #getOrderOnStockThreshold()
	 * @generated
	 */
	EAttribute getOrderOnStockThreshold_Threshold();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.OrderOnStockThreshold#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metamodel_bdsl.OrderOnStockThreshold#getName()
	 * @see #getOrderOnStockThreshold()
	 * @generated
	 */
	EAttribute getOrderOnStockThreshold_Name();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.OrderOnStockThreshold#getOrderQuantity <em>Order Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Quantity</em>'.
	 * @see metamodel_bdsl.OrderOnStockThreshold#getOrderQuantity()
	 * @see #getOrderOnStockThreshold()
	 * @generated
	 */
	EAttribute getOrderOnStockThreshold_OrderQuantity();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.OrderOnStockThreshold#getOrderType <em>Order Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Type</em>'.
	 * @see metamodel_bdsl.OrderOnStockThreshold#getOrderType()
	 * @see #getOrderOnStockThreshold()
	 * @generated
	 */
	EAttribute getOrderOnStockThreshold_OrderType();

	/**
	 * Returns the meta object for the reference '{@link metamodel_bdsl.OrderOnStockThreshold#getSupplier <em>Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Supplier</em>'.
	 * @see metamodel_bdsl.OrderOnStockThreshold#getSupplier()
	 * @see #getOrderOnStockThreshold()
	 * @generated
	 */
	EReference getOrderOnStockThreshold_Supplier();

	/**
	 * Returns the meta object for the reference '{@link metamodel_bdsl.OrderOnStockThreshold#getStorage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Storage</em>'.
	 * @see metamodel_bdsl.OrderOnStockThreshold#getStorage()
	 * @see #getOrderOnStockThreshold()
	 * @generated
	 */
	EReference getOrderOnStockThreshold_Storage();

	/**
	 * Returns the meta object for the containment reference '{@link metamodel_bdsl.OrderOnStockThreshold#getEref_supplierOrderOnStockThreshold81 <em>Eref supplier Order On Stock Threshold81</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Eref supplier Order On Stock Threshold81</em>'.
	 * @see metamodel_bdsl.OrderOnStockThreshold#getEref_supplierOrderOnStockThreshold81()
	 * @see #getOrderOnStockThreshold()
	 * @generated
	 */
	EReference getOrderOnStockThreshold_Eref_supplierOrderOnStockThreshold81();

	/**
	 * Returns the meta object for the containment reference '{@link metamodel_bdsl.OrderOnStockThreshold#getEref_storageOrderOnStockThreshold82 <em>Eref storage Order On Stock Threshold82</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Eref storage Order On Stock Threshold82</em>'.
	 * @see metamodel_bdsl.OrderOnStockThreshold#getEref_storageOrderOnStockThreshold82()
	 * @see #getOrderOnStockThreshold()
	 * @generated
	 */
	EReference getOrderOnStockThreshold_Eref_storageOrderOnStockThreshold82();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodel_bdsl.OrderOnStockThreshold#getContainsperiodOrderOnStockThreshold <em>Containsperiod Order On Stock Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containsperiod Order On Stock Threshold</em>'.
	 * @see metamodel_bdsl.OrderOnStockThreshold#getContainsperiodOrderOnStockThreshold()
	 * @see #getOrderOnStockThreshold()
	 * @generated
	 */
	EReference getOrderOnStockThreshold_ContainsperiodOrderOnStockThreshold();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodel_bdsl.OrderOnStockThreshold#getContainsthresholdOrderOnStockThreshold <em>Containsthreshold Order On Stock Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containsthreshold Order On Stock Threshold</em>'.
	 * @see metamodel_bdsl.OrderOnStockThreshold#getContainsthresholdOrderOnStockThreshold()
	 * @see #getOrderOnStockThreshold()
	 * @generated
	 */
	EReference getOrderOnStockThreshold_ContainsthresholdOrderOnStockThreshold();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodel_bdsl.OrderOnStockThreshold#getContainsnameOrderOnStockThreshold <em>Containsname Order On Stock Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containsname Order On Stock Threshold</em>'.
	 * @see metamodel_bdsl.OrderOnStockThreshold#getContainsnameOrderOnStockThreshold()
	 * @see #getOrderOnStockThreshold()
	 * @generated
	 */
	EReference getOrderOnStockThreshold_ContainsnameOrderOnStockThreshold();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodel_bdsl.OrderOnStockThreshold#getContainsorderQuantityOrderOnStockThreshold <em>Containsorder Quantity Order On Stock Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containsorder Quantity Order On Stock Threshold</em>'.
	 * @see metamodel_bdsl.OrderOnStockThreshold#getContainsorderQuantityOrderOnStockThreshold()
	 * @see #getOrderOnStockThreshold()
	 * @generated
	 */
	EReference getOrderOnStockThreshold_ContainsorderQuantityOrderOnStockThreshold();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodel_bdsl.OrderOnStockThreshold#getContainsorderTypeOrderOnStockThreshold <em>Containsorder Type Order On Stock Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containsorder Type Order On Stock Threshold</em>'.
	 * @see metamodel_bdsl.OrderOnStockThreshold#getContainsorderTypeOrderOnStockThreshold()
	 * @see #getOrderOnStockThreshold()
	 * @generated
	 */
	EReference getOrderOnStockThreshold_ContainsorderTypeOrderOnStockThreshold();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see metamodel_bdsl.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.Component#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metamodel_bdsl.Component#getName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Name();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.Flow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow</em>'.
	 * @see metamodel_bdsl.Flow
	 * @generated
	 */
	EClass getFlow();

	/**
	 * Returns the meta object for the containment reference '{@link metamodel_bdsl.Flow#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Quantity</em>'.
	 * @see metamodel_bdsl.Flow#getQuantity()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Quantity();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.Probability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Probability</em>'.
	 * @see metamodel_bdsl.Probability
	 * @generated
	 */
	EClass getProbability();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.Distribution <em>Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distribution</em>'.
	 * @see metamodel_bdsl.Distribution
	 * @generated
	 */
	EClass getDistribution();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.Scalar <em>Scalar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scalar</em>'.
	 * @see metamodel_bdsl.Scalar
	 * @generated
	 */
	EClass getScalar();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.Scalar#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see metamodel_bdsl.Scalar#getValue()
	 * @see #getScalar()
	 * @generated
	 */
	EAttribute getScalar_Value();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodel_bdsl.Scalar#getContainsvalueScalar <em>Containsvalue Scalar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containsvalue Scalar</em>'.
	 * @see metamodel_bdsl.Scalar#getContainsvalueScalar()
	 * @see #getScalar()
	 * @generated
	 */
	EReference getScalar_ContainsvalueScalar();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.Gaussian <em>Gaussian</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gaussian</em>'.
	 * @see metamodel_bdsl.Gaussian
	 * @generated
	 */
	EClass getGaussian();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.Gaussian#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see metamodel_bdsl.Gaussian#getLocation()
	 * @see #getGaussian()
	 * @generated
	 */
	EAttribute getGaussian_Location();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.Gaussian#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see metamodel_bdsl.Gaussian#getScale()
	 * @see #getGaussian()
	 * @generated
	 */
	EAttribute getGaussian_Scale();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodel_bdsl.Gaussian#getContainslocationGaussian <em>Containslocation Gaussian</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containslocation Gaussian</em>'.
	 * @see metamodel_bdsl.Gaussian#getContainslocationGaussian()
	 * @see #getGaussian()
	 * @generated
	 */
	EReference getGaussian_ContainslocationGaussian();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodel_bdsl.Gaussian#getContainsscaleGaussian <em>Containsscale Gaussian</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containsscale Gaussian</em>'.
	 * @see metamodel_bdsl.Gaussian#getContainsscaleGaussian()
	 * @see #getGaussian()
	 * @generated
	 */
	EReference getGaussian_ContainsscaleGaussian();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.Poisson <em>Poisson</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Poisson</em>'.
	 * @see metamodel_bdsl.Poisson
	 * @generated
	 */
	EClass getPoisson();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.Poisson#getInterval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interval</em>'.
	 * @see metamodel_bdsl.Poisson#getInterval()
	 * @see #getPoisson()
	 * @generated
	 */
	EAttribute getPoisson_Interval();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodel_bdsl.Poisson#getContainsintervalPoisson <em>Containsinterval Poisson</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containsinterval Poisson</em>'.
	 * @see metamodel_bdsl.Poisson#getContainsintervalPoisson()
	 * @see #getPoisson()
	 * @generated
	 */
	EReference getPoisson_ContainsintervalPoisson();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.Uniform <em>Uniform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uniform</em>'.
	 * @see metamodel_bdsl.Uniform
	 * @generated
	 */
	EClass getUniform();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.Uniform#getMinimum <em>Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum</em>'.
	 * @see metamodel_bdsl.Uniform#getMinimum()
	 * @see #getUniform()
	 * @generated
	 */
	EAttribute getUniform_Minimum();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.Uniform#getMaximum <em>Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum</em>'.
	 * @see metamodel_bdsl.Uniform#getMaximum()
	 * @see #getUniform()
	 * @generated
	 */
	EAttribute getUniform_Maximum();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodel_bdsl.Uniform#getContainsminimumUniform <em>Containsminimum Uniform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containsminimum Uniform</em>'.
	 * @see metamodel_bdsl.Uniform#getContainsminimumUniform()
	 * @see #getUniform()
	 * @generated
	 */
	EReference getUniform_ContainsminimumUniform();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodel_bdsl.Uniform#getContainsmaximumUniform <em>Containsmaximum Uniform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containsmaximum Uniform</em>'.
	 * @see metamodel_bdsl.Uniform#getContainsmaximumUniform()
	 * @see #getUniform()
	 * @generated
	 */
	EReference getUniform_ContainsmaximumUniform();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.ConveyorBelt <em>Conveyor Belt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conveyor Belt</em>'.
	 * @see metamodel_bdsl.ConveyorBelt
	 * @generated
	 */
	EClass getConveyorBelt();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.ConveyorBelt#getMinimalSeparationBetweenBatches <em>Minimal Separation Between Batches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimal Separation Between Batches</em>'.
	 * @see metamodel_bdsl.ConveyorBelt#getMinimalSeparationBetweenBatches()
	 * @see #getConveyorBelt()
	 * @generated
	 */
	EAttribute getConveyorBelt_MinimalSeparationBetweenBatches();

	/**
	 * Returns the meta object for the containment reference '{@link metamodel_bdsl.ConveyorBelt#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output</em>'.
	 * @see metamodel_bdsl.ConveyorBelt#getOutput()
	 * @see #getConveyorBelt()
	 * @generated
	 */
	EReference getConveyorBelt_Output();

	/**
	 * Returns the meta object for the containment reference '{@link metamodel_bdsl.ConveyorBelt#getEref_storageOutputFlowConveyorBelt131 <em>Eref storage Output Flow Conveyor Belt131</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Eref storage Output Flow Conveyor Belt131</em>'.
	 * @see metamodel_bdsl.ConveyorBelt#getEref_storageOutputFlowConveyorBelt131()
	 * @see #getConveyorBelt()
	 * @generated
	 */
	EReference getConveyorBelt_Eref_storageOutputFlowConveyorBelt131();

	/**
	 * Returns the meta object for the containment reference '{@link metamodel_bdsl.ConveyorBelt#getEref_durationConveyorBelt132 <em>Eref duration Conveyor Belt132</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Eref duration Conveyor Belt132</em>'.
	 * @see metamodel_bdsl.ConveyorBelt#getEref_durationConveyorBelt132()
	 * @see #getConveyorBelt()
	 * @generated
	 */
	EReference getConveyorBelt_Eref_durationConveyorBelt132();

	/**
	 * Returns the meta object for the containment reference '{@link metamodel_bdsl.ConveyorBelt#getEref_outputConveyorBelt133 <em>Eref output Conveyor Belt133</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Eref output Conveyor Belt133</em>'.
	 * @see metamodel_bdsl.ConveyorBelt#getEref_outputConveyorBelt133()
	 * @see #getConveyorBelt()
	 * @generated
	 */
	EReference getConveyorBelt_Eref_outputConveyorBelt133();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodel_bdsl.ConveyorBelt#getContainsnameConveyorBelt <em>Containsname Conveyor Belt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containsname Conveyor Belt</em>'.
	 * @see metamodel_bdsl.ConveyorBelt#getContainsnameConveyorBelt()
	 * @see #getConveyorBelt()
	 * @generated
	 */
	EReference getConveyorBelt_ContainsnameConveyorBelt();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodel_bdsl.ConveyorBelt#getContainsminimalSeparationBetweenBatchesConveyorBelt <em>Containsminimal Separation Between Batches Conveyor Belt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containsminimal Separation Between Batches Conveyor Belt</em>'.
	 * @see metamodel_bdsl.ConveyorBelt#getContainsminimalSeparationBetweenBatchesConveyorBelt()
	 * @see #getConveyorBelt()
	 * @generated
	 */
	EReference getConveyorBelt_ContainsminimalSeparationBetweenBatchesConveyorBelt();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.storageOutputFlowStorage21 <em>storage Output Flow Storage21</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>storage Output Flow Storage21</em>'.
	 * @see metamodel_bdsl.storageOutputFlowStorage21
	 * @generated
	 */
	EClass getstorageOutputFlowStorage21();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.storageOutputFlowStorage21#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metamodel_bdsl.storageOutputFlowStorage21#getName()
	 * @see #getstorageOutputFlowStorage21()
	 * @generated
	 */
	EAttribute getstorageOutputFlowStorage21_Name();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.orderOnStockThresholdStorage22 <em>order On Stock Threshold Storage22</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>order On Stock Threshold Storage22</em>'.
	 * @see metamodel_bdsl.orderOnStockThresholdStorage22
	 * @generated
	 */
	EClass getorderOnStockThresholdStorage22();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.orderOnStockThresholdStorage22#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metamodel_bdsl.orderOnStockThresholdStorage22#getName()
	 * @see #getorderOnStockThresholdStorage22()
	 * @generated
	 */
	EAttribute getorderOnStockThresholdStorage22_Name();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.processOutputFlowStorage23 <em>process Output Flow Storage23</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>process Output Flow Storage23</em>'.
	 * @see metamodel_bdsl.processOutputFlowStorage23
	 * @generated
	 */
	EClass getprocessOutputFlowStorage23();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.processOutputFlowStorage23#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metamodel_bdsl.processOutputFlowStorage23#getName()
	 * @see #getprocessOutputFlowStorage23()
	 * @generated
	 */
	EAttribute getprocessOutputFlowStorage23_Name();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.refillPolicySupplier31 <em>refill Policy Supplier31</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>refill Policy Supplier31</em>'.
	 * @see metamodel_bdsl.refillPolicySupplier31
	 * @generated
	 */
	EClass getrefillPolicySupplier31();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.refillPolicySupplier31#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metamodel_bdsl.refillPolicySupplier31#getName()
	 * @see #getrefillPolicySupplier31()
	 * @generated
	 */
	EAttribute getrefillPolicySupplier31_Name();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.supplierDelaySupplier32 <em>supplier Delay Supplier32</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>supplier Delay Supplier32</em>'.
	 * @see metamodel_bdsl.supplierDelaySupplier32
	 * @generated
	 */
	EClass getsupplierDelaySupplier32();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.supplierDelaySupplier32#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metamodel_bdsl.supplierDelaySupplier32#getName()
	 * @see #getsupplierDelaySupplier32()
	 * @generated
	 */
	EAttribute getsupplierDelaySupplier32_Name();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.storageOutputFlowBatchProcess41 <em>storage Output Flow Batch Process41</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>storage Output Flow Batch Process41</em>'.
	 * @see metamodel_bdsl.storageOutputFlowBatchProcess41
	 * @generated
	 */
	EClass getstorageOutputFlowBatchProcess41();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.storageOutputFlowBatchProcess41#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metamodel_bdsl.storageOutputFlowBatchProcess41#getName()
	 * @see #getstorageOutputFlowBatchProcess41()
	 * @generated
	 */
	EAttribute getstorageOutputFlowBatchProcess41_Name();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.durationBatchProcess42 <em>duration Batch Process42</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>duration Batch Process42</em>'.
	 * @see metamodel_bdsl.durationBatchProcess42
	 * @generated
	 */
	EClass getdurationBatchProcess42();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.durationBatchProcess42#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metamodel_bdsl.durationBatchProcess42#getName()
	 * @see #getdurationBatchProcess42()
	 * @generated
	 */
	EAttribute getdurationBatchProcess42_Name();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.outputsBatchProcess43 <em>outputs Batch Process43</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>outputs Batch Process43</em>'.
	 * @see metamodel_bdsl.outputsBatchProcess43
	 * @generated
	 */
	EClass getoutputsBatchProcess43();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.outputsBatchProcess43#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metamodel_bdsl.outputsBatchProcess43#getName()
	 * @see #getoutputsBatchProcess43()
	 * @generated
	 */
	EAttribute getoutputsBatchProcess43_Name();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.processOutputFlowOutput51 <em>process Output Flow Output51</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>process Output Flow Output51</em>'.
	 * @see metamodel_bdsl.processOutputFlowOutput51
	 * @generated
	 */
	EClass getprocessOutputFlowOutput51();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.processOutputFlowOutput51#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metamodel_bdsl.processOutputFlowOutput51#getName()
	 * @see #getprocessOutputFlowOutput51()
	 * @generated
	 */
	EAttribute getprocessOutputFlowOutput51_Name();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.quantityStorageOutputFlow61 <em>quantity Storage Output Flow61</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>quantity Storage Output Flow61</em>'.
	 * @see metamodel_bdsl.quantityStorageOutputFlow61
	 * @generated
	 */
	EClass getquantityStorageOutputFlow61();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.quantityStorageOutputFlow61#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metamodel_bdsl.quantityStorageOutputFlow61#getName()
	 * @see #getquantityStorageOutputFlow61()
	 * @generated
	 */
	EAttribute getquantityStorageOutputFlow61_Name();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.sourceStorageOutputFlow62 <em>source Storage Output Flow62</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>source Storage Output Flow62</em>'.
	 * @see metamodel_bdsl.sourceStorageOutputFlow62
	 * @generated
	 */
	EClass getsourceStorageOutputFlow62();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.sourceStorageOutputFlow62#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metamodel_bdsl.sourceStorageOutputFlow62#getName()
	 * @see #getsourceStorageOutputFlow62()
	 * @generated
	 */
	EAttribute getsourceStorageOutputFlow62_Name();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.destinationStorageOutputFlow63 <em>destination Storage Output Flow63</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>destination Storage Output Flow63</em>'.
	 * @see metamodel_bdsl.destinationStorageOutputFlow63
	 * @generated
	 */
	EClass getdestinationStorageOutputFlow63();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.destinationStorageOutputFlow63#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metamodel_bdsl.destinationStorageOutputFlow63#getName()
	 * @see #getdestinationStorageOutputFlow63()
	 * @generated
	 */
	EAttribute getdestinationStorageOutputFlow63_Name();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.quantityProcessOutputFlow71 <em>quantity Process Output Flow71</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>quantity Process Output Flow71</em>'.
	 * @see metamodel_bdsl.quantityProcessOutputFlow71
	 * @generated
	 */
	EClass getquantityProcessOutputFlow71();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.quantityProcessOutputFlow71#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metamodel_bdsl.quantityProcessOutputFlow71#getName()
	 * @see #getquantityProcessOutputFlow71()
	 * @generated
	 */
	EAttribute getquantityProcessOutputFlow71_Name();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.sourceProcessOutputFlow72 <em>source Process Output Flow72</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>source Process Output Flow72</em>'.
	 * @see metamodel_bdsl.sourceProcessOutputFlow72
	 * @generated
	 */
	EClass getsourceProcessOutputFlow72();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.sourceProcessOutputFlow72#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metamodel_bdsl.sourceProcessOutputFlow72#getName()
	 * @see #getsourceProcessOutputFlow72()
	 * @generated
	 */
	EAttribute getsourceProcessOutputFlow72_Name();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.processOutputFlowDelayProcessOutputFlow73 <em>process Output Flow Delay Process Output Flow73</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>process Output Flow Delay Process Output Flow73</em>'.
	 * @see metamodel_bdsl.processOutputFlowDelayProcessOutputFlow73
	 * @generated
	 */
	EClass getprocessOutputFlowDelayProcessOutputFlow73();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.processOutputFlowDelayProcessOutputFlow73#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metamodel_bdsl.processOutputFlowDelayProcessOutputFlow73#getName()
	 * @see #getprocessOutputFlowDelayProcessOutputFlow73()
	 * @generated
	 */
	EAttribute getprocessOutputFlowDelayProcessOutputFlow73_Name();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.destinationProcessOutputFlow74 <em>destination Process Output Flow74</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>destination Process Output Flow74</em>'.
	 * @see metamodel_bdsl.destinationProcessOutputFlow74
	 * @generated
	 */
	EClass getdestinationProcessOutputFlow74();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.destinationProcessOutputFlow74#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metamodel_bdsl.destinationProcessOutputFlow74#getName()
	 * @see #getdestinationProcessOutputFlow74()
	 * @generated
	 */
	EAttribute getdestinationProcessOutputFlow74_Name();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.supplierOrderOnStockThreshold81 <em>supplier Order On Stock Threshold81</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>supplier Order On Stock Threshold81</em>'.
	 * @see metamodel_bdsl.supplierOrderOnStockThreshold81
	 * @generated
	 */
	EClass getsupplierOrderOnStockThreshold81();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.supplierOrderOnStockThreshold81#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metamodel_bdsl.supplierOrderOnStockThreshold81#getName()
	 * @see #getsupplierOrderOnStockThreshold81()
	 * @generated
	 */
	EAttribute getsupplierOrderOnStockThreshold81_Name();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.storageOrderOnStockThreshold82 <em>storage Order On Stock Threshold82</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>storage Order On Stock Threshold82</em>'.
	 * @see metamodel_bdsl.storageOrderOnStockThreshold82
	 * @generated
	 */
	EClass getstorageOrderOnStockThreshold82();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.storageOrderOnStockThreshold82#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metamodel_bdsl.storageOrderOnStockThreshold82#getName()
	 * @see #getstorageOrderOnStockThreshold82()
	 * @generated
	 */
	EAttribute getstorageOrderOnStockThreshold82_Name();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.storageOutputFlowConveyorBelt131 <em>storage Output Flow Conveyor Belt131</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>storage Output Flow Conveyor Belt131</em>'.
	 * @see metamodel_bdsl.storageOutputFlowConveyorBelt131
	 * @generated
	 */
	EClass getstorageOutputFlowConveyorBelt131();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.storageOutputFlowConveyorBelt131#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metamodel_bdsl.storageOutputFlowConveyorBelt131#getName()
	 * @see #getstorageOutputFlowConveyorBelt131()
	 * @generated
	 */
	EAttribute getstorageOutputFlowConveyorBelt131_Name();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.durationConveyorBelt132 <em>duration Conveyor Belt132</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>duration Conveyor Belt132</em>'.
	 * @see metamodel_bdsl.durationConveyorBelt132
	 * @generated
	 */
	EClass getdurationConveyorBelt132();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.durationConveyorBelt132#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metamodel_bdsl.durationConveyorBelt132#getName()
	 * @see #getdurationConveyorBelt132()
	 * @generated
	 */
	EAttribute getdurationConveyorBelt132_Name();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.outputConveyorBelt133 <em>output Conveyor Belt133</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>output Conveyor Belt133</em>'.
	 * @see metamodel_bdsl.outputConveyorBelt133
	 * @generated
	 */
	EClass getoutputConveyorBelt133();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.outputConveyorBelt133#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metamodel_bdsl.outputConveyorBelt133#getName()
	 * @see #getoutputConveyorBelt133()
	 * @generated
	 */
	EAttribute getoutputConveyorBelt133_Name();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.nameQuery <em>name Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>name Query</em>'.
	 * @see metamodel_bdsl.nameQuery
	 * @generated
	 */
	EClass getnameQuery();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.nameQuery#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see metamodel_bdsl.nameQuery#getValue()
	 * @see #getnameQuery()
	 * @generated
	 */
	EAttribute getnameQuery_Value();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.valueQuery <em>value Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>value Query</em>'.
	 * @see metamodel_bdsl.valueQuery
	 * @generated
	 */
	EClass getvalueQuery();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.valueQuery#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see metamodel_bdsl.valueQuery#getValue()
	 * @see #getvalueQuery()
	 * @generated
	 */
	EAttribute getvalueQuery_Value();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.errorQuery <em>error Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>error Query</em>'.
	 * @see metamodel_bdsl.errorQuery
	 * @generated
	 */
	EClass geterrorQuery();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.errorQuery#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see metamodel_bdsl.errorQuery#getValue()
	 * @see #geterrorQuery()
	 * @generated
	 */
	EAttribute geterrorQuery_Value();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.typeQuery <em>type Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>type Query</em>'.
	 * @see metamodel_bdsl.typeQuery
	 * @generated
	 */
	EClass gettypeQuery();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.typeQuery#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see metamodel_bdsl.typeQuery#getValue()
	 * @see #gettypeQuery()
	 * @generated
	 */
	EAttribute gettypeQuery_Value();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.systemQuery <em>system Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>system Query</em>'.
	 * @see metamodel_bdsl.systemQuery
	 * @generated
	 */
	EClass getsystemQuery();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.systemQuery#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see metamodel_bdsl.systemQuery#isValue()
	 * @see #getsystemQuery()
	 * @generated
	 */
	EAttribute getsystemQuery_Value();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.nameStorage <em>name Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>name Storage</em>'.
	 * @see metamodel_bdsl.nameStorage
	 * @generated
	 */
	EClass getnameStorage();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.nameStorage#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see metamodel_bdsl.nameStorage#getValue()
	 * @see #getnameStorage()
	 * @generated
	 */
	EAttribute getnameStorage_Value();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.sizeStorage <em>size Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>size Storage</em>'.
	 * @see metamodel_bdsl.sizeStorage
	 * @generated
	 */
	EClass getsizeStorage();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.sizeStorage#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see metamodel_bdsl.sizeStorage#getValue()
	 * @see #getsizeStorage()
	 * @generated
	 */
	EAttribute getsizeStorage_Value();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.initialContentStorage <em>initial Content Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>initial Content Storage</em>'.
	 * @see metamodel_bdsl.initialContentStorage
	 * @generated
	 */
	EClass getinitialContentStorage();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.initialContentStorage#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see metamodel_bdsl.initialContentStorage#getValue()
	 * @see #getinitialContentStorage()
	 * @generated
	 */
	EAttribute getinitialContentStorage_Value();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.overflowStorage <em>overflow Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>overflow Storage</em>'.
	 * @see metamodel_bdsl.overflowStorage
	 * @generated
	 */
	EClass getoverflowStorage();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.overflowStorage#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see metamodel_bdsl.overflowStorage#isValue()
	 * @see #getoverflowStorage()
	 * @generated
	 */
	EAttribute getoverflowStorage_Value();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.nameSupplier <em>name Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>name Supplier</em>'.
	 * @see metamodel_bdsl.nameSupplier
	 * @generated
	 */
	EClass getnameSupplier();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.nameSupplier#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see metamodel_bdsl.nameSupplier#getValue()
	 * @see #getnameSupplier()
	 * @generated
	 */
	EAttribute getnameSupplier_Value();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.deliveredPercentageSupplier <em>delivered Percentage Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>delivered Percentage Supplier</em>'.
	 * @see metamodel_bdsl.deliveredPercentageSupplier
	 * @generated
	 */
	EClass getdeliveredPercentageSupplier();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.deliveredPercentageSupplier#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see metamodel_bdsl.deliveredPercentageSupplier#getValue()
	 * @see #getdeliveredPercentageSupplier()
	 * @generated
	 */
	EAttribute getdeliveredPercentageSupplier_Value();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.nameBatchProcess <em>name Batch Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>name Batch Process</em>'.
	 * @see metamodel_bdsl.nameBatchProcess
	 * @generated
	 */
	EClass getnameBatchProcess();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.nameBatchProcess#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see metamodel_bdsl.nameBatchProcess#getValue()
	 * @see #getnameBatchProcess()
	 * @generated
	 */
	EAttribute getnameBatchProcess_Value();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.percentageOfSuccessBatchProcess <em>percentage Of Success Batch Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>percentage Of Success Batch Process</em>'.
	 * @see metamodel_bdsl.percentageOfSuccessBatchProcess
	 * @generated
	 */
	EClass getpercentageOfSuccessBatchProcess();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.percentageOfSuccessBatchProcess#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see metamodel_bdsl.percentageOfSuccessBatchProcess#getValue()
	 * @see #getpercentageOfSuccessBatchProcess()
	 * @generated
	 */
	EAttribute getpercentageOfSuccessBatchProcess_Value();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.numberOfChainsBatchProcess <em>number Of Chains Batch Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>number Of Chains Batch Process</em>'.
	 * @see metamodel_bdsl.numberOfChainsBatchProcess
	 * @generated
	 */
	EClass getnumberOfChainsBatchProcess();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.numberOfChainsBatchProcess#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see metamodel_bdsl.numberOfChainsBatchProcess#getValue()
	 * @see #getnumberOfChainsBatchProcess()
	 * @generated
	 */
	EAttribute getnumberOfChainsBatchProcess_Value();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.typeOutput <em>type Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>type Output</em>'.
	 * @see metamodel_bdsl.typeOutput
	 * @generated
	 */
	EClass gettypeOutput();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.typeOutput#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see metamodel_bdsl.typeOutput#getValue()
	 * @see #gettypeOutput()
	 * @generated
	 */
	EAttribute gettypeOutput_Value();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.descriptionOutput <em>description Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>description Output</em>'.
	 * @see metamodel_bdsl.descriptionOutput
	 * @generated
	 */
	EClass getdescriptionOutput();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.descriptionOutput#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see metamodel_bdsl.descriptionOutput#getValue()
	 * @see #getdescriptionOutput()
	 * @generated
	 */
	EAttribute getdescriptionOutput_Value();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.periodOrderOnStockThreshold <em>period Order On Stock Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>period Order On Stock Threshold</em>'.
	 * @see metamodel_bdsl.periodOrderOnStockThreshold
	 * @generated
	 */
	EClass getperiodOrderOnStockThreshold();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.periodOrderOnStockThreshold#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see metamodel_bdsl.periodOrderOnStockThreshold#getValue()
	 * @see #getperiodOrderOnStockThreshold()
	 * @generated
	 */
	EAttribute getperiodOrderOnStockThreshold_Value();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.thresholdOrderOnStockThreshold <em>threshold Order On Stock Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>threshold Order On Stock Threshold</em>'.
	 * @see metamodel_bdsl.thresholdOrderOnStockThreshold
	 * @generated
	 */
	EClass getthresholdOrderOnStockThreshold();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.thresholdOrderOnStockThreshold#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see metamodel_bdsl.thresholdOrderOnStockThreshold#getValue()
	 * @see #getthresholdOrderOnStockThreshold()
	 * @generated
	 */
	EAttribute getthresholdOrderOnStockThreshold_Value();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.nameOrderOnStockThreshold <em>name Order On Stock Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>name Order On Stock Threshold</em>'.
	 * @see metamodel_bdsl.nameOrderOnStockThreshold
	 * @generated
	 */
	EClass getnameOrderOnStockThreshold();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.nameOrderOnStockThreshold#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see metamodel_bdsl.nameOrderOnStockThreshold#getValue()
	 * @see #getnameOrderOnStockThreshold()
	 * @generated
	 */
	EAttribute getnameOrderOnStockThreshold_Value();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.orderQuantityOrderOnStockThreshold <em>order Quantity Order On Stock Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>order Quantity Order On Stock Threshold</em>'.
	 * @see metamodel_bdsl.orderQuantityOrderOnStockThreshold
	 * @generated
	 */
	EClass getorderQuantityOrderOnStockThreshold();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.orderQuantityOrderOnStockThreshold#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see metamodel_bdsl.orderQuantityOrderOnStockThreshold#getValue()
	 * @see #getorderQuantityOrderOnStockThreshold()
	 * @generated
	 */
	EAttribute getorderQuantityOrderOnStockThreshold_Value();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.orderTypeOrderOnStockThreshold <em>order Type Order On Stock Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>order Type Order On Stock Threshold</em>'.
	 * @see metamodel_bdsl.orderTypeOrderOnStockThreshold
	 * @generated
	 */
	EClass getorderTypeOrderOnStockThreshold();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.orderTypeOrderOnStockThreshold#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see metamodel_bdsl.orderTypeOrderOnStockThreshold#getValue()
	 * @see #getorderTypeOrderOnStockThreshold()
	 * @generated
	 */
	EAttribute getorderTypeOrderOnStockThreshold_Value();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.valueScalar <em>value Scalar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>value Scalar</em>'.
	 * @see metamodel_bdsl.valueScalar
	 * @generated
	 */
	EClass getvalueScalar();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.valueScalar#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see metamodel_bdsl.valueScalar#getValue()
	 * @see #getvalueScalar()
	 * @generated
	 */
	EAttribute getvalueScalar_Value();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.locationGaussian <em>location Gaussian</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>location Gaussian</em>'.
	 * @see metamodel_bdsl.locationGaussian
	 * @generated
	 */
	EClass getlocationGaussian();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.locationGaussian#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see metamodel_bdsl.locationGaussian#getValue()
	 * @see #getlocationGaussian()
	 * @generated
	 */
	EAttribute getlocationGaussian_Value();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.scaleGaussian <em>scale Gaussian</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>scale Gaussian</em>'.
	 * @see metamodel_bdsl.scaleGaussian
	 * @generated
	 */
	EClass getscaleGaussian();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.scaleGaussian#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see metamodel_bdsl.scaleGaussian#getValue()
	 * @see #getscaleGaussian()
	 * @generated
	 */
	EAttribute getscaleGaussian_Value();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.intervalPoisson <em>interval Poisson</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>interval Poisson</em>'.
	 * @see metamodel_bdsl.intervalPoisson
	 * @generated
	 */
	EClass getintervalPoisson();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.intervalPoisson#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see metamodel_bdsl.intervalPoisson#getValue()
	 * @see #getintervalPoisson()
	 * @generated
	 */
	EAttribute getintervalPoisson_Value();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.minimumUniform <em>minimum Uniform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>minimum Uniform</em>'.
	 * @see metamodel_bdsl.minimumUniform
	 * @generated
	 */
	EClass getminimumUniform();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.minimumUniform#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see metamodel_bdsl.minimumUniform#getValue()
	 * @see #getminimumUniform()
	 * @generated
	 */
	EAttribute getminimumUniform_Value();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.maximumUniform <em>maximum Uniform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>maximum Uniform</em>'.
	 * @see metamodel_bdsl.maximumUniform
	 * @generated
	 */
	EClass getmaximumUniform();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.maximumUniform#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see metamodel_bdsl.maximumUniform#getValue()
	 * @see #getmaximumUniform()
	 * @generated
	 */
	EAttribute getmaximumUniform_Value();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.nameConveyorBelt <em>name Conveyor Belt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>name Conveyor Belt</em>'.
	 * @see metamodel_bdsl.nameConveyorBelt
	 * @generated
	 */
	EClass getnameConveyorBelt();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.nameConveyorBelt#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see metamodel_bdsl.nameConveyorBelt#getValue()
	 * @see #getnameConveyorBelt()
	 * @generated
	 */
	EAttribute getnameConveyorBelt_Value();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.minimalSeparationBetweenBatchesConveyorBelt <em>minimal Separation Between Batches Conveyor Belt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>minimal Separation Between Batches Conveyor Belt</em>'.
	 * @see metamodel_bdsl.minimalSeparationBetweenBatchesConveyorBelt
	 * @generated
	 */
	EClass getminimalSeparationBetweenBatchesConveyorBelt();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.minimalSeparationBetweenBatchesConveyorBelt#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see metamodel_bdsl.minimalSeparationBetweenBatchesConveyorBelt#getValue()
	 * @see #getminimalSeparationBetweenBatchesConveyorBelt()
	 * @generated
	 */
	EAttribute getminimalSeparationBetweenBatchesConveyorBelt_Value();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.NoneElement <em>None Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>None Element</em>'.
	 * @see metamodel_bdsl.NoneElement
	 * @generated
	 */
	EClass getNoneElement();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.BindingElement <em>Binding Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Element</em>'.
	 * @see metamodel_bdsl.BindingElement
	 * @generated
	 */
	EClass getBindingElement();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodel_bdsl.BindingElement#getContainsSiriusTag <em>Contains Sirius Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Sirius Tag</em>'.
	 * @see metamodel_bdsl.BindingElement#getContainsSiriusTag()
	 * @see #getBindingElement()
	 * @generated
	 */
	EReference getBindingElement_ContainsSiriusTag();

	/**
	 * Returns the meta object for the reference list '{@link metamodel_bdsl.BindingElement#getNoneElement <em>None Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>None Element</em>'.
	 * @see metamodel_bdsl.BindingElement#getNoneElement()
	 * @see #getBindingElement()
	 * @generated
	 */
	EReference getBindingElement_NoneElement();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.IntermediateElement <em>Intermediate Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intermediate Element</em>'.
	 * @see metamodel_bdsl.IntermediateElement
	 * @generated
	 */
	EClass getIntermediateElement();

	/**
	 * Returns the meta object for the reference '{@link metamodel_bdsl.IntermediateElement#getBindingElement <em>Binding Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Binding Element</em>'.
	 * @see metamodel_bdsl.IntermediateElement#getBindingElement()
	 * @see #getIntermediateElement()
	 * @generated
	 */
	EReference getIntermediateElement_BindingElement();

	/**
	 * Returns the meta object for the reference list '{@link metamodel_bdsl.IntermediateElement#getMetamodelElement <em>Metamodel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Metamodel Element</em>'.
	 * @see metamodel_bdsl.IntermediateElement#getMetamodelElement()
	 * @see #getIntermediateElement()
	 * @generated
	 */
	EReference getIntermediateElement_MetamodelElement();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.MetamodelElement <em>Metamodel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metamodel Element</em>'.
	 * @see metamodel_bdsl.MetamodelElement
	 * @generated
	 */
	EClass getMetamodelElement();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodel_bdsl.MetamodelElement#getVirtualAttribute <em>Virtual Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Virtual Attribute</em>'.
	 * @see metamodel_bdsl.MetamodelElement#getVirtualAttribute()
	 * @see #getMetamodelElement()
	 * @generated
	 */
	EReference getMetamodelElement_VirtualAttribute();

	/**
	 * Returns the meta object for the containment reference list '{@link metamodel_bdsl.MetamodelElement#getMetamodelElementFeature <em>Metamodel Element Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metamodel Element Feature</em>'.
	 * @see metamodel_bdsl.MetamodelElement#getMetamodelElementFeature()
	 * @see #getMetamodelElement()
	 * @generated
	 */
	EReference getMetamodelElement_MetamodelElementFeature();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.MetamodelElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metamodel_bdsl.MetamodelElement#getName()
	 * @see #getMetamodelElement()
	 * @generated
	 */
	EAttribute getMetamodelElement_Name();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.MetamodelElementFeature <em>Metamodel Element Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metamodel Element Feature</em>'.
	 * @see metamodel_bdsl.MetamodelElementFeature
	 * @generated
	 */
	EClass getMetamodelElementFeature();

	/**
	 * Returns the meta object for the reference list '{@link metamodel_bdsl.MetamodelElementFeature#getFeatureClass <em>Feature Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Feature Class</em>'.
	 * @see metamodel_bdsl.MetamodelElementFeature#getFeatureClass()
	 * @see #getMetamodelElementFeature()
	 * @generated
	 */
	EReference getMetamodelElementFeature_FeatureClass();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.MetamodelElementFeature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metamodel_bdsl.MetamodelElementFeature#getName()
	 * @see #getMetamodelElementFeature()
	 * @generated
	 */
	EAttribute getMetamodelElementFeature_Name();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.BindingAttribute <em>Binding Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Attribute</em>'.
	 * @see metamodel_bdsl.BindingAttribute
	 * @generated
	 */
	EClass getBindingAttribute();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.VirtualAttribute <em>Virtual Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Attribute</em>'.
	 * @see metamodel_bdsl.VirtualAttribute
	 * @generated
	 */
	EClass getVirtualAttribute();

	/**
	 * Returns the meta object for the reference '{@link metamodel_bdsl.VirtualAttribute#getTo_virtualAttribute <em>To virtual Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To virtual Attribute</em>'.
	 * @see metamodel_bdsl.VirtualAttribute#getTo_virtualAttribute()
	 * @see #getVirtualAttribute()
	 * @generated
	 */
	EReference getVirtualAttribute_To_virtualAttribute();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.VirtualAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metamodel_bdsl.VirtualAttribute#getName()
	 * @see #getVirtualAttribute()
	 * @generated
	 */
	EAttribute getVirtualAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.VirtualAttribute#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see metamodel_bdsl.VirtualAttribute#getExpression()
	 * @see #getVirtualAttribute()
	 * @generated
	 */
	EAttribute getVirtualAttribute_Expression();

	/**
	 * Returns the meta object for class '{@link metamodel_bdsl.SiriusTag <em>Sirius Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sirius Tag</em>'.
	 * @see metamodel_bdsl.SiriusTag
	 * @generated
	 */
	EClass getSiriusTag();

	/**
	 * Returns the meta object for the attribute '{@link metamodel_bdsl.SiriusTag#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see metamodel_bdsl.SiriusTag#getTag()
	 * @see #getSiriusTag()
	 * @generated
	 */
	EAttribute getSiriusTag_Tag();

	/**
	 * Returns the meta object for enum '{@link metamodel_bdsl.OrderType <em>Order Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Order Type</em>'.
	 * @see metamodel_bdsl.OrderType
	 * @generated
	 */
	EEnum getOrderType();

	/**
	 * Returns the meta object for enum '{@link metamodel_bdsl.OutputType <em>Output Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Output Type</em>'.
	 * @see metamodel_bdsl.OutputType
	 * @generated
	 */
	EEnum getOutputType();

	/**
	 * Returns the meta object for enum '{@link metamodel_bdsl.QueryType <em>Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Query Type</em>'.
	 * @see metamodel_bdsl.QueryType
	 * @generated
	 */
	EEnum getQueryType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Percent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Percent</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        extendedMetaData="baseType='http://www.eclipse.org/emf/2002/Ecore#EDouble' minInclusive='0' maxInclusive='100'"
	 * @generated
	 */
	EDataType getPercent();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>Positive Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Positive Int</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 *        extendedMetaData="baseType='http://www.eclipse.org/emf/2002/Ecore#EInt' minInclusive='0' name='PositiveInt'"
	 * @generated
	 */
	EDataType getPositiveInt();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Positive Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Positive Double</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        extendedMetaData="minInclusive='0' baseType='http://www.eclipse.org/emf/2002/Ecore#EDouble'"
	 * @generated
	 */
	EDataType getPositiveDouble();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>Positive Int Not Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Positive Int Not Null</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 *        extendedMetaData="baseType='http://www.eclipse.org/emf/2002/Ecore#EInt' minInclusive='1'"
	 * @generated
	 */
	EDataType getPositiveIntNotNull();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Positive Double Not Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Positive Double Not Null</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        extendedMetaData="name='PositiveDoubleNotNull' minExclusive='0' baseType='http://www.eclipse.org/emf/2002/Ecore#EDouble'"
	 * @generated
	 */
	EDataType getPositiveDoubleNotNull();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Metamodel_bdslFactory getMetamodel_bdslFactory();

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
		 * The meta object literal for the '{@link metamodel_bdsl.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.ModelImpl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__QUERY = eINSTANCE.getModel_Query();

		/**
		 * The meta object literal for the '<em><b>Order On Stock Threshold</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__ORDER_ON_STOCK_THRESHOLD = eINSTANCE.getModel_OrderOnStockThreshold();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__COMPONENT = eINSTANCE.getModel_Component();

		/**
		 * The meta object literal for the '<em><b>Flow</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__FLOW = eINSTANCE.getModel_Flow();

		/**
		 * The meta object literal for the '<em><b>Contains None Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__CONTAINS_NONE_ELEMENT = eINSTANCE.getModel_ContainsNoneElement();

		/**
		 * The meta object literal for the '<em><b>Contains Binding Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__CONTAINS_BINDING_ELEMENT = eINSTANCE.getModel_ContainsBindingElement();

		/**
		 * The meta object literal for the '<em><b>Contains Intermediate Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__CONTAINS_INTERMEDIATE_ELEMENT = eINSTANCE.getModel_ContainsIntermediateElement();

		/**
		 * The meta object literal for the '<em><b>Contains Metamodel Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__CONTAINS_METAMODEL_ELEMENT = eINSTANCE.getModel_ContainsMetamodelElement();

		/**
		 * The meta object literal for the '<em><b>Contains Metamodel Element Feature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__CONTAINS_METAMODEL_ELEMENT_FEATURE = eINSTANCE.getModel_ContainsMetamodelElementFeature();

		/**
		 * The meta object literal for the '<em><b>Contains Binding Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__CONTAINS_BINDING_ATTRIBUTE = eINSTANCE.getModel_ContainsBindingAttribute();

		/**
		 * The meta object literal for the '<em><b>Contains Virtual Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__CONTAINS_VIRTUAL_ATTRIBUTE = eINSTANCE.getModel_ContainsVirtualAttribute();

		/**
		 * The meta object literal for the '<em><b>Source MM</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__SOURCE_MM = eINSTANCE.getModel_SourceMM();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.QueryImpl <em>Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.QueryImpl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getQuery()
		 * @generated
		 */
		EClass QUERY = eINSTANCE.getQuery();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY__NAME = eINSTANCE.getQuery_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY__VALUE = eINSTANCE.getQuery_Value();

		/**
		 * The meta object literal for the '<em><b>Error</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY__ERROR = eINSTANCE.getQuery_Error();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY__TYPE = eINSTANCE.getQuery_Type();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY__SYSTEM = eINSTANCE.getQuery_System();

		/**
		 * The meta object literal for the '<em><b>Containsname Query</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY__CONTAINSNAME_QUERY = eINSTANCE.getQuery_ContainsnameQuery();

		/**
		 * The meta object literal for the '<em><b>Containsvalue Query</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY__CONTAINSVALUE_QUERY = eINSTANCE.getQuery_ContainsvalueQuery();

		/**
		 * The meta object literal for the '<em><b>Containserror Query</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY__CONTAINSERROR_QUERY = eINSTANCE.getQuery_ContainserrorQuery();

		/**
		 * The meta object literal for the '<em><b>Containstype Query</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY__CONTAINSTYPE_QUERY = eINSTANCE.getQuery_ContainstypeQuery();

		/**
		 * The meta object literal for the '<em><b>Containssystem Query</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY__CONTAINSSYSTEM_QUERY = eINSTANCE.getQuery_ContainssystemQuery();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.StorageImpl <em>Storage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.StorageImpl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getStorage()
		 * @generated
		 */
		EClass STORAGE = eINSTANCE.getStorage();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGE__SIZE = eINSTANCE.getStorage_Size();

		/**
		 * The meta object literal for the '<em><b>Initial Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGE__INITIAL_CONTENT = eINSTANCE.getStorage_InitialContent();

		/**
		 * The meta object literal for the '<em><b>Overflow</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGE__OVERFLOW = eINSTANCE.getStorage_Overflow();

		/**
		 * The meta object literal for the '<em><b>Storage Output Flow</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORAGE__STORAGE_OUTPUT_FLOW = eINSTANCE.getStorage_StorageOutputFlow();

		/**
		 * The meta object literal for the '<em><b>Order On Stock Threshold</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORAGE__ORDER_ON_STOCK_THRESHOLD = eINSTANCE.getStorage_OrderOnStockThreshold();

		/**
		 * The meta object literal for the '<em><b>Process Output Flow</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORAGE__PROCESS_OUTPUT_FLOW = eINSTANCE.getStorage_ProcessOutputFlow();

		/**
		 * The meta object literal for the '<em><b>Eref storage Output Flow Storage21</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORAGE__EREF_STORAGE_OUTPUT_FLOW_STORAGE21 = eINSTANCE.getStorage_Eref_storageOutputFlowStorage21();

		/**
		 * The meta object literal for the '<em><b>Eref order On Stock Threshold Storage22</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORAGE__EREF_ORDER_ON_STOCK_THRESHOLD_STORAGE22 = eINSTANCE.getStorage_Eref_orderOnStockThresholdStorage22();

		/**
		 * The meta object literal for the '<em><b>Eref process Output Flow Storage23</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORAGE__EREF_PROCESS_OUTPUT_FLOW_STORAGE23 = eINSTANCE.getStorage_Eref_processOutputFlowStorage23();

		/**
		 * The meta object literal for the '<em><b>Containsname Storage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORAGE__CONTAINSNAME_STORAGE = eINSTANCE.getStorage_ContainsnameStorage();

		/**
		 * The meta object literal for the '<em><b>Containssize Storage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORAGE__CONTAINSSIZE_STORAGE = eINSTANCE.getStorage_ContainssizeStorage();

		/**
		 * The meta object literal for the '<em><b>Containsinitial Content Storage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORAGE__CONTAINSINITIAL_CONTENT_STORAGE = eINSTANCE.getStorage_ContainsinitialContentStorage();

		/**
		 * The meta object literal for the '<em><b>Containsoverflow Storage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORAGE__CONTAINSOVERFLOW_STORAGE = eINSTANCE.getStorage_ContainsoverflowStorage();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.SupplierImpl <em>Supplier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.SupplierImpl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getSupplier()
		 * @generated
		 */
		EClass SUPPLIER = eINSTANCE.getSupplier();

		/**
		 * The meta object literal for the '<em><b>Delivered Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER__DELIVERED_PERCENTAGE = eINSTANCE.getSupplier_DeliveredPercentage();

		/**
		 * The meta object literal for the '<em><b>Refill Policy</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPLIER__REFILL_POLICY = eINSTANCE.getSupplier_RefillPolicy();

		/**
		 * The meta object literal for the '<em><b>Supplier Delay</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPLIER__SUPPLIER_DELAY = eINSTANCE.getSupplier_SupplierDelay();

		/**
		 * The meta object literal for the '<em><b>Eref refill Policy Supplier31</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPLIER__EREF_REFILL_POLICY_SUPPLIER31 = eINSTANCE.getSupplier_Eref_refillPolicySupplier31();

		/**
		 * The meta object literal for the '<em><b>Eref supplier Delay Supplier32</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPLIER__EREF_SUPPLIER_DELAY_SUPPLIER32 = eINSTANCE.getSupplier_Eref_supplierDelaySupplier32();

		/**
		 * The meta object literal for the '<em><b>Containsname Supplier</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPLIER__CONTAINSNAME_SUPPLIER = eINSTANCE.getSupplier_ContainsnameSupplier();

		/**
		 * The meta object literal for the '<em><b>Containsdelivered Percentage Supplier</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPLIER__CONTAINSDELIVERED_PERCENTAGE_SUPPLIER = eINSTANCE.getSupplier_ContainsdeliveredPercentageSupplier();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.BatchProcessImpl <em>Batch Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.BatchProcessImpl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getBatchProcess()
		 * @generated
		 */
		EClass BATCH_PROCESS = eINSTANCE.getBatchProcess();

		/**
		 * The meta object literal for the '<em><b>Percentage Of Success</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BATCH_PROCESS__PERCENTAGE_OF_SUCCESS = eINSTANCE.getBatchProcess_PercentageOfSuccess();

		/**
		 * The meta object literal for the '<em><b>Number Of Chains</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BATCH_PROCESS__NUMBER_OF_CHAINS = eINSTANCE.getBatchProcess_NumberOfChains();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BATCH_PROCESS__OUTPUTS = eINSTANCE.getBatchProcess_Outputs();

		/**
		 * The meta object literal for the '<em><b>Eref storage Output Flow Batch Process41</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BATCH_PROCESS__EREF_STORAGE_OUTPUT_FLOW_BATCH_PROCESS41 = eINSTANCE.getBatchProcess_Eref_storageOutputFlowBatchProcess41();

		/**
		 * The meta object literal for the '<em><b>Eref duration Batch Process42</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BATCH_PROCESS__EREF_DURATION_BATCH_PROCESS42 = eINSTANCE.getBatchProcess_Eref_durationBatchProcess42();

		/**
		 * The meta object literal for the '<em><b>Eref outputs Batch Process43</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BATCH_PROCESS__EREF_OUTPUTS_BATCH_PROCESS43 = eINSTANCE.getBatchProcess_Eref_outputsBatchProcess43();

		/**
		 * The meta object literal for the '<em><b>Containsname Batch Process</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BATCH_PROCESS__CONTAINSNAME_BATCH_PROCESS = eINSTANCE.getBatchProcess_ContainsnameBatchProcess();

		/**
		 * The meta object literal for the '<em><b>Containspercentage Of Success Batch Process</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BATCH_PROCESS__CONTAINSPERCENTAGE_OF_SUCCESS_BATCH_PROCESS = eINSTANCE.getBatchProcess_ContainspercentageOfSuccessBatchProcess();

		/**
		 * The meta object literal for the '<em><b>Containsnumber Of Chains Batch Process</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BATCH_PROCESS__CONTAINSNUMBER_OF_CHAINS_BATCH_PROCESS = eINSTANCE.getBatchProcess_ContainsnumberOfChainsBatchProcess();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.OutputImpl <em>Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.OutputImpl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getOutput()
		 * @generated
		 */
		EClass OUTPUT = eINSTANCE.getOutput();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT__TYPE = eINSTANCE.getOutput_Type();

		/**
		 * The meta object literal for the '<em><b>Process Output Flow</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT__PROCESS_OUTPUT_FLOW = eINSTANCE.getOutput_ProcessOutputFlow();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT__DESCRIPTION = eINSTANCE.getOutput_Description();

		/**
		 * The meta object literal for the '<em><b>Eref process Output Flow Output51</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT__EREF_PROCESS_OUTPUT_FLOW_OUTPUT51 = eINSTANCE.getOutput_Eref_processOutputFlowOutput51();

		/**
		 * The meta object literal for the '<em><b>Containstype Output</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT__CONTAINSTYPE_OUTPUT = eINSTANCE.getOutput_ContainstypeOutput();

		/**
		 * The meta object literal for the '<em><b>Containsdescription Output</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT__CONTAINSDESCRIPTION_OUTPUT = eINSTANCE.getOutput_ContainsdescriptionOutput();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.StorageOutputFlowImpl <em>Storage Output Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.StorageOutputFlowImpl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getStorageOutputFlow()
		 * @generated
		 */
		EClass STORAGE_OUTPUT_FLOW = eINSTANCE.getStorageOutputFlow();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORAGE_OUTPUT_FLOW__SOURCE = eINSTANCE.getStorageOutputFlow_Source();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORAGE_OUTPUT_FLOW__DESTINATION = eINSTANCE.getStorageOutputFlow_Destination();

		/**
		 * The meta object literal for the '<em><b>Eref quantity Storage Output Flow61</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORAGE_OUTPUT_FLOW__EREF_QUANTITY_STORAGE_OUTPUT_FLOW61 = eINSTANCE.getStorageOutputFlow_Eref_quantityStorageOutputFlow61();

		/**
		 * The meta object literal for the '<em><b>Eref source Storage Output Flow62</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORAGE_OUTPUT_FLOW__EREF_SOURCE_STORAGE_OUTPUT_FLOW62 = eINSTANCE.getStorageOutputFlow_Eref_sourceStorageOutputFlow62();

		/**
		 * The meta object literal for the '<em><b>Eref destination Storage Output Flow63</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORAGE_OUTPUT_FLOW__EREF_DESTINATION_STORAGE_OUTPUT_FLOW63 = eINSTANCE.getStorageOutputFlow_Eref_destinationStorageOutputFlow63();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.ProcessOutputFlowImpl <em>Process Output Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.ProcessOutputFlowImpl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getProcessOutputFlow()
		 * @generated
		 */
		EClass PROCESS_OUTPUT_FLOW = eINSTANCE.getProcessOutputFlow();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_OUTPUT_FLOW__SOURCE = eINSTANCE.getProcessOutputFlow_Source();

		/**
		 * The meta object literal for the '<em><b>Process Output Flow Delay</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_OUTPUT_FLOW__PROCESS_OUTPUT_FLOW_DELAY = eINSTANCE.getProcessOutputFlow_ProcessOutputFlowDelay();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_OUTPUT_FLOW__DESTINATION = eINSTANCE.getProcessOutputFlow_Destination();

		/**
		 * The meta object literal for the '<em><b>Eref quantity Process Output Flow71</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_OUTPUT_FLOW__EREF_QUANTITY_PROCESS_OUTPUT_FLOW71 = eINSTANCE.getProcessOutputFlow_Eref_quantityProcessOutputFlow71();

		/**
		 * The meta object literal for the '<em><b>Eref source Process Output Flow72</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_OUTPUT_FLOW__EREF_SOURCE_PROCESS_OUTPUT_FLOW72 = eINSTANCE.getProcessOutputFlow_Eref_sourceProcessOutputFlow72();

		/**
		 * The meta object literal for the '<em><b>Eref process Output Flow Delay Process Output Flow73</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_OUTPUT_FLOW__EREF_PROCESS_OUTPUT_FLOW_DELAY_PROCESS_OUTPUT_FLOW73 = eINSTANCE.getProcessOutputFlow_Eref_processOutputFlowDelayProcessOutputFlow73();

		/**
		 * The meta object literal for the '<em><b>Eref destination Process Output Flow74</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_OUTPUT_FLOW__EREF_DESTINATION_PROCESS_OUTPUT_FLOW74 = eINSTANCE.getProcessOutputFlow_Eref_destinationProcessOutputFlow74();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.ProcessImpl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getProcess()
		 * @generated
		 */
		EClass PROCESS = eINSTANCE.getProcess();

		/**
		 * The meta object literal for the '<em><b>Storage Output Flow</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__STORAGE_OUTPUT_FLOW = eINSTANCE.getProcess_StorageOutputFlow();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__DURATION = eINSTANCE.getProcess_Duration();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.OrderOnStockThresholdImpl <em>Order On Stock Threshold</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.OrderOnStockThresholdImpl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getOrderOnStockThreshold()
		 * @generated
		 */
		EClass ORDER_ON_STOCK_THRESHOLD = eINSTANCE.getOrderOnStockThreshold();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ON_STOCK_THRESHOLD__PERIOD = eINSTANCE.getOrderOnStockThreshold_Period();

		/**
		 * The meta object literal for the '<em><b>Threshold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ON_STOCK_THRESHOLD__THRESHOLD = eINSTANCE.getOrderOnStockThreshold_Threshold();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ON_STOCK_THRESHOLD__NAME = eINSTANCE.getOrderOnStockThreshold_Name();

		/**
		 * The meta object literal for the '<em><b>Order Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ON_STOCK_THRESHOLD__ORDER_QUANTITY = eINSTANCE.getOrderOnStockThreshold_OrderQuantity();

		/**
		 * The meta object literal for the '<em><b>Order Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ON_STOCK_THRESHOLD__ORDER_TYPE = eINSTANCE.getOrderOnStockThreshold_OrderType();

		/**
		 * The meta object literal for the '<em><b>Supplier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ON_STOCK_THRESHOLD__SUPPLIER = eINSTANCE.getOrderOnStockThreshold_Supplier();

		/**
		 * The meta object literal for the '<em><b>Storage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ON_STOCK_THRESHOLD__STORAGE = eINSTANCE.getOrderOnStockThreshold_Storage();

		/**
		 * The meta object literal for the '<em><b>Eref supplier Order On Stock Threshold81</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ON_STOCK_THRESHOLD__EREF_SUPPLIER_ORDER_ON_STOCK_THRESHOLD81 = eINSTANCE.getOrderOnStockThreshold_Eref_supplierOrderOnStockThreshold81();

		/**
		 * The meta object literal for the '<em><b>Eref storage Order On Stock Threshold82</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ON_STOCK_THRESHOLD__EREF_STORAGE_ORDER_ON_STOCK_THRESHOLD82 = eINSTANCE.getOrderOnStockThreshold_Eref_storageOrderOnStockThreshold82();

		/**
		 * The meta object literal for the '<em><b>Containsperiod Order On Stock Threshold</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ON_STOCK_THRESHOLD__CONTAINSPERIOD_ORDER_ON_STOCK_THRESHOLD = eINSTANCE.getOrderOnStockThreshold_ContainsperiodOrderOnStockThreshold();

		/**
		 * The meta object literal for the '<em><b>Containsthreshold Order On Stock Threshold</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ON_STOCK_THRESHOLD__CONTAINSTHRESHOLD_ORDER_ON_STOCK_THRESHOLD = eINSTANCE.getOrderOnStockThreshold_ContainsthresholdOrderOnStockThreshold();

		/**
		 * The meta object literal for the '<em><b>Containsname Order On Stock Threshold</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ON_STOCK_THRESHOLD__CONTAINSNAME_ORDER_ON_STOCK_THRESHOLD = eINSTANCE.getOrderOnStockThreshold_ContainsnameOrderOnStockThreshold();

		/**
		 * The meta object literal for the '<em><b>Containsorder Quantity Order On Stock Threshold</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ON_STOCK_THRESHOLD__CONTAINSORDER_QUANTITY_ORDER_ON_STOCK_THRESHOLD = eINSTANCE.getOrderOnStockThreshold_ContainsorderQuantityOrderOnStockThreshold();

		/**
		 * The meta object literal for the '<em><b>Containsorder Type Order On Stock Threshold</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_ON_STOCK_THRESHOLD__CONTAINSORDER_TYPE_ORDER_ON_STOCK_THRESHOLD = eINSTANCE.getOrderOnStockThreshold_ContainsorderTypeOrderOnStockThreshold();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.ComponentImpl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.FlowImpl <em>Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.FlowImpl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getFlow()
		 * @generated
		 */
		EClass FLOW = eINSTANCE.getFlow();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__QUANTITY = eINSTANCE.getFlow_Quantity();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.ProbabilityImpl <em>Probability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.ProbabilityImpl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getProbability()
		 * @generated
		 */
		EClass PROBABILITY = eINSTANCE.getProbability();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.DistributionImpl <em>Distribution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.DistributionImpl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getDistribution()
		 * @generated
		 */
		EClass DISTRIBUTION = eINSTANCE.getDistribution();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.ScalarImpl <em>Scalar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.ScalarImpl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getScalar()
		 * @generated
		 */
		EClass SCALAR = eINSTANCE.getScalar();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCALAR__VALUE = eINSTANCE.getScalar_Value();

		/**
		 * The meta object literal for the '<em><b>Containsvalue Scalar</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCALAR__CONTAINSVALUE_SCALAR = eINSTANCE.getScalar_ContainsvalueScalar();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.GaussianImpl <em>Gaussian</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.GaussianImpl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getGaussian()
		 * @generated
		 */
		EClass GAUSSIAN = eINSTANCE.getGaussian();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAUSSIAN__LOCATION = eINSTANCE.getGaussian_Location();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAUSSIAN__SCALE = eINSTANCE.getGaussian_Scale();

		/**
		 * The meta object literal for the '<em><b>Containslocation Gaussian</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAUSSIAN__CONTAINSLOCATION_GAUSSIAN = eINSTANCE.getGaussian_ContainslocationGaussian();

		/**
		 * The meta object literal for the '<em><b>Containsscale Gaussian</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAUSSIAN__CONTAINSSCALE_GAUSSIAN = eINSTANCE.getGaussian_ContainsscaleGaussian();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.PoissonImpl <em>Poisson</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.PoissonImpl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getPoisson()
		 * @generated
		 */
		EClass POISSON = eINSTANCE.getPoisson();

		/**
		 * The meta object literal for the '<em><b>Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POISSON__INTERVAL = eINSTANCE.getPoisson_Interval();

		/**
		 * The meta object literal for the '<em><b>Containsinterval Poisson</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POISSON__CONTAINSINTERVAL_POISSON = eINSTANCE.getPoisson_ContainsintervalPoisson();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.UniformImpl <em>Uniform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.UniformImpl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getUniform()
		 * @generated
		 */
		EClass UNIFORM = eINSTANCE.getUniform();

		/**
		 * The meta object literal for the '<em><b>Minimum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIFORM__MINIMUM = eINSTANCE.getUniform_Minimum();

		/**
		 * The meta object literal for the '<em><b>Maximum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIFORM__MAXIMUM = eINSTANCE.getUniform_Maximum();

		/**
		 * The meta object literal for the '<em><b>Containsminimum Uniform</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIFORM__CONTAINSMINIMUM_UNIFORM = eINSTANCE.getUniform_ContainsminimumUniform();

		/**
		 * The meta object literal for the '<em><b>Containsmaximum Uniform</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIFORM__CONTAINSMAXIMUM_UNIFORM = eINSTANCE.getUniform_ContainsmaximumUniform();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.ConveyorBeltImpl <em>Conveyor Belt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.ConveyorBeltImpl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getConveyorBelt()
		 * @generated
		 */
		EClass CONVEYOR_BELT = eINSTANCE.getConveyorBelt();

		/**
		 * The meta object literal for the '<em><b>Minimal Separation Between Batches</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONVEYOR_BELT__MINIMAL_SEPARATION_BETWEEN_BATCHES = eINSTANCE.getConveyorBelt_MinimalSeparationBetweenBatches();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVEYOR_BELT__OUTPUT = eINSTANCE.getConveyorBelt_Output();

		/**
		 * The meta object literal for the '<em><b>Eref storage Output Flow Conveyor Belt131</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVEYOR_BELT__EREF_STORAGE_OUTPUT_FLOW_CONVEYOR_BELT131 = eINSTANCE.getConveyorBelt_Eref_storageOutputFlowConveyorBelt131();

		/**
		 * The meta object literal for the '<em><b>Eref duration Conveyor Belt132</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVEYOR_BELT__EREF_DURATION_CONVEYOR_BELT132 = eINSTANCE.getConveyorBelt_Eref_durationConveyorBelt132();

		/**
		 * The meta object literal for the '<em><b>Eref output Conveyor Belt133</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVEYOR_BELT__EREF_OUTPUT_CONVEYOR_BELT133 = eINSTANCE.getConveyorBelt_Eref_outputConveyorBelt133();

		/**
		 * The meta object literal for the '<em><b>Containsname Conveyor Belt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVEYOR_BELT__CONTAINSNAME_CONVEYOR_BELT = eINSTANCE.getConveyorBelt_ContainsnameConveyorBelt();

		/**
		 * The meta object literal for the '<em><b>Containsminimal Separation Between Batches Conveyor Belt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVEYOR_BELT__CONTAINSMINIMAL_SEPARATION_BETWEEN_BATCHES_CONVEYOR_BELT = eINSTANCE.getConveyorBelt_ContainsminimalSeparationBetweenBatchesConveyorBelt();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.storageOutputFlowStorage21Impl <em>storage Output Flow Storage21</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.storageOutputFlowStorage21Impl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getstorageOutputFlowStorage21()
		 * @generated
		 */
		EClass STORAGE_OUTPUT_FLOW_STORAGE21 = eINSTANCE.getstorageOutputFlowStorage21();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGE_OUTPUT_FLOW_STORAGE21__NAME = eINSTANCE.getstorageOutputFlowStorage21_Name();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.orderOnStockThresholdStorage22Impl <em>order On Stock Threshold Storage22</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.orderOnStockThresholdStorage22Impl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getorderOnStockThresholdStorage22()
		 * @generated
		 */
		EClass ORDER_ON_STOCK_THRESHOLD_STORAGE22 = eINSTANCE.getorderOnStockThresholdStorage22();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ON_STOCK_THRESHOLD_STORAGE22__NAME = eINSTANCE.getorderOnStockThresholdStorage22_Name();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.processOutputFlowStorage23Impl <em>process Output Flow Storage23</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.processOutputFlowStorage23Impl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getprocessOutputFlowStorage23()
		 * @generated
		 */
		EClass PROCESS_OUTPUT_FLOW_STORAGE23 = eINSTANCE.getprocessOutputFlowStorage23();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_OUTPUT_FLOW_STORAGE23__NAME = eINSTANCE.getprocessOutputFlowStorage23_Name();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.refillPolicySupplier31Impl <em>refill Policy Supplier31</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.refillPolicySupplier31Impl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getrefillPolicySupplier31()
		 * @generated
		 */
		EClass REFILL_POLICY_SUPPLIER31 = eINSTANCE.getrefillPolicySupplier31();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFILL_POLICY_SUPPLIER31__NAME = eINSTANCE.getrefillPolicySupplier31_Name();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.supplierDelaySupplier32Impl <em>supplier Delay Supplier32</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.supplierDelaySupplier32Impl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getsupplierDelaySupplier32()
		 * @generated
		 */
		EClass SUPPLIER_DELAY_SUPPLIER32 = eINSTANCE.getsupplierDelaySupplier32();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER_DELAY_SUPPLIER32__NAME = eINSTANCE.getsupplierDelaySupplier32_Name();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.storageOutputFlowBatchProcess41Impl <em>storage Output Flow Batch Process41</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.storageOutputFlowBatchProcess41Impl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getstorageOutputFlowBatchProcess41()
		 * @generated
		 */
		EClass STORAGE_OUTPUT_FLOW_BATCH_PROCESS41 = eINSTANCE.getstorageOutputFlowBatchProcess41();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGE_OUTPUT_FLOW_BATCH_PROCESS41__NAME = eINSTANCE.getstorageOutputFlowBatchProcess41_Name();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.durationBatchProcess42Impl <em>duration Batch Process42</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.durationBatchProcess42Impl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getdurationBatchProcess42()
		 * @generated
		 */
		EClass DURATION_BATCH_PROCESS42 = eINSTANCE.getdurationBatchProcess42();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DURATION_BATCH_PROCESS42__NAME = eINSTANCE.getdurationBatchProcess42_Name();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.outputsBatchProcess43Impl <em>outputs Batch Process43</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.outputsBatchProcess43Impl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getoutputsBatchProcess43()
		 * @generated
		 */
		EClass OUTPUTS_BATCH_PROCESS43 = eINSTANCE.getoutputsBatchProcess43();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUTS_BATCH_PROCESS43__NAME = eINSTANCE.getoutputsBatchProcess43_Name();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.processOutputFlowOutput51Impl <em>process Output Flow Output51</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.processOutputFlowOutput51Impl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getprocessOutputFlowOutput51()
		 * @generated
		 */
		EClass PROCESS_OUTPUT_FLOW_OUTPUT51 = eINSTANCE.getprocessOutputFlowOutput51();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_OUTPUT_FLOW_OUTPUT51__NAME = eINSTANCE.getprocessOutputFlowOutput51_Name();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.quantityStorageOutputFlow61Impl <em>quantity Storage Output Flow61</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.quantityStorageOutputFlow61Impl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getquantityStorageOutputFlow61()
		 * @generated
		 */
		EClass QUANTITY_STORAGE_OUTPUT_FLOW61 = eINSTANCE.getquantityStorageOutputFlow61();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTITY_STORAGE_OUTPUT_FLOW61__NAME = eINSTANCE.getquantityStorageOutputFlow61_Name();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.sourceStorageOutputFlow62Impl <em>source Storage Output Flow62</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.sourceStorageOutputFlow62Impl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getsourceStorageOutputFlow62()
		 * @generated
		 */
		EClass SOURCE_STORAGE_OUTPUT_FLOW62 = eINSTANCE.getsourceStorageOutputFlow62();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_STORAGE_OUTPUT_FLOW62__NAME = eINSTANCE.getsourceStorageOutputFlow62_Name();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.destinationStorageOutputFlow63Impl <em>destination Storage Output Flow63</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.destinationStorageOutputFlow63Impl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getdestinationStorageOutputFlow63()
		 * @generated
		 */
		EClass DESTINATION_STORAGE_OUTPUT_FLOW63 = eINSTANCE.getdestinationStorageOutputFlow63();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESTINATION_STORAGE_OUTPUT_FLOW63__NAME = eINSTANCE.getdestinationStorageOutputFlow63_Name();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.quantityProcessOutputFlow71Impl <em>quantity Process Output Flow71</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.quantityProcessOutputFlow71Impl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getquantityProcessOutputFlow71()
		 * @generated
		 */
		EClass QUANTITY_PROCESS_OUTPUT_FLOW71 = eINSTANCE.getquantityProcessOutputFlow71();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTITY_PROCESS_OUTPUT_FLOW71__NAME = eINSTANCE.getquantityProcessOutputFlow71_Name();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.sourceProcessOutputFlow72Impl <em>source Process Output Flow72</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.sourceProcessOutputFlow72Impl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getsourceProcessOutputFlow72()
		 * @generated
		 */
		EClass SOURCE_PROCESS_OUTPUT_FLOW72 = eINSTANCE.getsourceProcessOutputFlow72();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_PROCESS_OUTPUT_FLOW72__NAME = eINSTANCE.getsourceProcessOutputFlow72_Name();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.processOutputFlowDelayProcessOutputFlow73Impl <em>process Output Flow Delay Process Output Flow73</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.processOutputFlowDelayProcessOutputFlow73Impl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getprocessOutputFlowDelayProcessOutputFlow73()
		 * @generated
		 */
		EClass PROCESS_OUTPUT_FLOW_DELAY_PROCESS_OUTPUT_FLOW73 = eINSTANCE.getprocessOutputFlowDelayProcessOutputFlow73();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_OUTPUT_FLOW_DELAY_PROCESS_OUTPUT_FLOW73__NAME = eINSTANCE.getprocessOutputFlowDelayProcessOutputFlow73_Name();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.destinationProcessOutputFlow74Impl <em>destination Process Output Flow74</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.destinationProcessOutputFlow74Impl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getdestinationProcessOutputFlow74()
		 * @generated
		 */
		EClass DESTINATION_PROCESS_OUTPUT_FLOW74 = eINSTANCE.getdestinationProcessOutputFlow74();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESTINATION_PROCESS_OUTPUT_FLOW74__NAME = eINSTANCE.getdestinationProcessOutputFlow74_Name();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.supplierOrderOnStockThreshold81Impl <em>supplier Order On Stock Threshold81</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.supplierOrderOnStockThreshold81Impl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getsupplierOrderOnStockThreshold81()
		 * @generated
		 */
		EClass SUPPLIER_ORDER_ON_STOCK_THRESHOLD81 = eINSTANCE.getsupplierOrderOnStockThreshold81();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER_ORDER_ON_STOCK_THRESHOLD81__NAME = eINSTANCE.getsupplierOrderOnStockThreshold81_Name();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.storageOrderOnStockThreshold82Impl <em>storage Order On Stock Threshold82</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.storageOrderOnStockThreshold82Impl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getstorageOrderOnStockThreshold82()
		 * @generated
		 */
		EClass STORAGE_ORDER_ON_STOCK_THRESHOLD82 = eINSTANCE.getstorageOrderOnStockThreshold82();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGE_ORDER_ON_STOCK_THRESHOLD82__NAME = eINSTANCE.getstorageOrderOnStockThreshold82_Name();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.storageOutputFlowConveyorBelt131Impl <em>storage Output Flow Conveyor Belt131</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.storageOutputFlowConveyorBelt131Impl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getstorageOutputFlowConveyorBelt131()
		 * @generated
		 */
		EClass STORAGE_OUTPUT_FLOW_CONVEYOR_BELT131 = eINSTANCE.getstorageOutputFlowConveyorBelt131();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGE_OUTPUT_FLOW_CONVEYOR_BELT131__NAME = eINSTANCE.getstorageOutputFlowConveyorBelt131_Name();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.durationConveyorBelt132Impl <em>duration Conveyor Belt132</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.durationConveyorBelt132Impl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getdurationConveyorBelt132()
		 * @generated
		 */
		EClass DURATION_CONVEYOR_BELT132 = eINSTANCE.getdurationConveyorBelt132();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DURATION_CONVEYOR_BELT132__NAME = eINSTANCE.getdurationConveyorBelt132_Name();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.outputConveyorBelt133Impl <em>output Conveyor Belt133</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.outputConveyorBelt133Impl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getoutputConveyorBelt133()
		 * @generated
		 */
		EClass OUTPUT_CONVEYOR_BELT133 = eINSTANCE.getoutputConveyorBelt133();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_CONVEYOR_BELT133__NAME = eINSTANCE.getoutputConveyorBelt133_Name();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.nameQueryImpl <em>name Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.nameQueryImpl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getnameQuery()
		 * @generated
		 */
		EClass NAME_QUERY = eINSTANCE.getnameQuery();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_QUERY__VALUE = eINSTANCE.getnameQuery_Value();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.valueQueryImpl <em>value Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.valueQueryImpl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getvalueQuery()
		 * @generated
		 */
		EClass VALUE_QUERY = eINSTANCE.getvalueQuery();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_QUERY__VALUE = eINSTANCE.getvalueQuery_Value();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.errorQueryImpl <em>error Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.errorQueryImpl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#geterrorQuery()
		 * @generated
		 */
		EClass ERROR_QUERY = eINSTANCE.geterrorQuery();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_QUERY__VALUE = eINSTANCE.geterrorQuery_Value();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.typeQueryImpl <em>type Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.typeQueryImpl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#gettypeQuery()
		 * @generated
		 */
		EClass TYPE_QUERY = eINSTANCE.gettypeQuery();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_QUERY__VALUE = eINSTANCE.gettypeQuery_Value();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.systemQueryImpl <em>system Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.systemQueryImpl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getsystemQuery()
		 * @generated
		 */
		EClass SYSTEM_QUERY = eINSTANCE.getsystemQuery();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_QUERY__VALUE = eINSTANCE.getsystemQuery_Value();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.nameStorageImpl <em>name Storage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.nameStorageImpl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getnameStorage()
		 * @generated
		 */
		EClass NAME_STORAGE = eINSTANCE.getnameStorage();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_STORAGE__VALUE = eINSTANCE.getnameStorage_Value();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.sizeStorageImpl <em>size Storage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.sizeStorageImpl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getsizeStorage()
		 * @generated
		 */
		EClass SIZE_STORAGE = eINSTANCE.getsizeStorage();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIZE_STORAGE__VALUE = eINSTANCE.getsizeStorage_Value();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.initialContentStorageImpl <em>initial Content Storage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.initialContentStorageImpl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getinitialContentStorage()
		 * @generated
		 */
		EClass INITIAL_CONTENT_STORAGE = eINSTANCE.getinitialContentStorage();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INITIAL_CONTENT_STORAGE__VALUE = eINSTANCE.getinitialContentStorage_Value();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.overflowStorageImpl <em>overflow Storage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.overflowStorageImpl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getoverflowStorage()
		 * @generated
		 */
		EClass OVERFLOW_STORAGE = eINSTANCE.getoverflowStorage();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OVERFLOW_STORAGE__VALUE = eINSTANCE.getoverflowStorage_Value();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.nameSupplierImpl <em>name Supplier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.nameSupplierImpl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getnameSupplier()
		 * @generated
		 */
		EClass NAME_SUPPLIER = eINSTANCE.getnameSupplier();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_SUPPLIER__VALUE = eINSTANCE.getnameSupplier_Value();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.deliveredPercentageSupplierImpl <em>delivered Percentage Supplier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.deliveredPercentageSupplierImpl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getdeliveredPercentageSupplier()
		 * @generated
		 */
		EClass DELIVERED_PERCENTAGE_SUPPLIER = eINSTANCE.getdeliveredPercentageSupplier();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIVERED_PERCENTAGE_SUPPLIER__VALUE = eINSTANCE.getdeliveredPercentageSupplier_Value();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.nameBatchProcessImpl <em>name Batch Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.nameBatchProcessImpl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getnameBatchProcess()
		 * @generated
		 */
		EClass NAME_BATCH_PROCESS = eINSTANCE.getnameBatchProcess();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_BATCH_PROCESS__VALUE = eINSTANCE.getnameBatchProcess_Value();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.percentageOfSuccessBatchProcessImpl <em>percentage Of Success Batch Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.percentageOfSuccessBatchProcessImpl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getpercentageOfSuccessBatchProcess()
		 * @generated
		 */
		EClass PERCENTAGE_OF_SUCCESS_BATCH_PROCESS = eINSTANCE.getpercentageOfSuccessBatchProcess();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERCENTAGE_OF_SUCCESS_BATCH_PROCESS__VALUE = eINSTANCE.getpercentageOfSuccessBatchProcess_Value();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.numberOfChainsBatchProcessImpl <em>number Of Chains Batch Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.numberOfChainsBatchProcessImpl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getnumberOfChainsBatchProcess()
		 * @generated
		 */
		EClass NUMBER_OF_CHAINS_BATCH_PROCESS = eINSTANCE.getnumberOfChainsBatchProcess();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_OF_CHAINS_BATCH_PROCESS__VALUE = eINSTANCE.getnumberOfChainsBatchProcess_Value();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.typeOutputImpl <em>type Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.typeOutputImpl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#gettypeOutput()
		 * @generated
		 */
		EClass TYPE_OUTPUT = eINSTANCE.gettypeOutput();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_OUTPUT__VALUE = eINSTANCE.gettypeOutput_Value();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.descriptionOutputImpl <em>description Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.descriptionOutputImpl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getdescriptionOutput()
		 * @generated
		 */
		EClass DESCRIPTION_OUTPUT = eINSTANCE.getdescriptionOutput();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION_OUTPUT__VALUE = eINSTANCE.getdescriptionOutput_Value();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.periodOrderOnStockThresholdImpl <em>period Order On Stock Threshold</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.periodOrderOnStockThresholdImpl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getperiodOrderOnStockThreshold()
		 * @generated
		 */
		EClass PERIOD_ORDER_ON_STOCK_THRESHOLD = eINSTANCE.getperiodOrderOnStockThreshold();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIOD_ORDER_ON_STOCK_THRESHOLD__VALUE = eINSTANCE.getperiodOrderOnStockThreshold_Value();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.thresholdOrderOnStockThresholdImpl <em>threshold Order On Stock Threshold</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.thresholdOrderOnStockThresholdImpl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getthresholdOrderOnStockThreshold()
		 * @generated
		 */
		EClass THRESHOLD_ORDER_ON_STOCK_THRESHOLD = eINSTANCE.getthresholdOrderOnStockThreshold();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THRESHOLD_ORDER_ON_STOCK_THRESHOLD__VALUE = eINSTANCE.getthresholdOrderOnStockThreshold_Value();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.nameOrderOnStockThresholdImpl <em>name Order On Stock Threshold</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.nameOrderOnStockThresholdImpl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getnameOrderOnStockThreshold()
		 * @generated
		 */
		EClass NAME_ORDER_ON_STOCK_THRESHOLD = eINSTANCE.getnameOrderOnStockThreshold();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_ORDER_ON_STOCK_THRESHOLD__VALUE = eINSTANCE.getnameOrderOnStockThreshold_Value();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.orderQuantityOrderOnStockThresholdImpl <em>order Quantity Order On Stock Threshold</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.orderQuantityOrderOnStockThresholdImpl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getorderQuantityOrderOnStockThreshold()
		 * @generated
		 */
		EClass ORDER_QUANTITY_ORDER_ON_STOCK_THRESHOLD = eINSTANCE.getorderQuantityOrderOnStockThreshold();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_QUANTITY_ORDER_ON_STOCK_THRESHOLD__VALUE = eINSTANCE.getorderQuantityOrderOnStockThreshold_Value();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.orderTypeOrderOnStockThresholdImpl <em>order Type Order On Stock Threshold</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.orderTypeOrderOnStockThresholdImpl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getorderTypeOrderOnStockThreshold()
		 * @generated
		 */
		EClass ORDER_TYPE_ORDER_ON_STOCK_THRESHOLD = eINSTANCE.getorderTypeOrderOnStockThreshold();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_TYPE_ORDER_ON_STOCK_THRESHOLD__VALUE = eINSTANCE.getorderTypeOrderOnStockThreshold_Value();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.valueScalarImpl <em>value Scalar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.valueScalarImpl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getvalueScalar()
		 * @generated
		 */
		EClass VALUE_SCALAR = eINSTANCE.getvalueScalar();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_SCALAR__VALUE = eINSTANCE.getvalueScalar_Value();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.locationGaussianImpl <em>location Gaussian</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.locationGaussianImpl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getlocationGaussian()
		 * @generated
		 */
		EClass LOCATION_GAUSSIAN = eINSTANCE.getlocationGaussian();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_GAUSSIAN__VALUE = eINSTANCE.getlocationGaussian_Value();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.scaleGaussianImpl <em>scale Gaussian</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.scaleGaussianImpl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getscaleGaussian()
		 * @generated
		 */
		EClass SCALE_GAUSSIAN = eINSTANCE.getscaleGaussian();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCALE_GAUSSIAN__VALUE = eINSTANCE.getscaleGaussian_Value();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.intervalPoissonImpl <em>interval Poisson</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.intervalPoissonImpl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getintervalPoisson()
		 * @generated
		 */
		EClass INTERVAL_POISSON = eINSTANCE.getintervalPoisson();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERVAL_POISSON__VALUE = eINSTANCE.getintervalPoisson_Value();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.minimumUniformImpl <em>minimum Uniform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.minimumUniformImpl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getminimumUniform()
		 * @generated
		 */
		EClass MINIMUM_UNIFORM = eINSTANCE.getminimumUniform();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MINIMUM_UNIFORM__VALUE = eINSTANCE.getminimumUniform_Value();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.maximumUniformImpl <em>maximum Uniform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.maximumUniformImpl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getmaximumUniform()
		 * @generated
		 */
		EClass MAXIMUM_UNIFORM = eINSTANCE.getmaximumUniform();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAXIMUM_UNIFORM__VALUE = eINSTANCE.getmaximumUniform_Value();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.nameConveyorBeltImpl <em>name Conveyor Belt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.nameConveyorBeltImpl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getnameConveyorBelt()
		 * @generated
		 */
		EClass NAME_CONVEYOR_BELT = eINSTANCE.getnameConveyorBelt();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_CONVEYOR_BELT__VALUE = eINSTANCE.getnameConveyorBelt_Value();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.minimalSeparationBetweenBatchesConveyorBeltImpl <em>minimal Separation Between Batches Conveyor Belt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.minimalSeparationBetweenBatchesConveyorBeltImpl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getminimalSeparationBetweenBatchesConveyorBelt()
		 * @generated
		 */
		EClass MINIMAL_SEPARATION_BETWEEN_BATCHES_CONVEYOR_BELT = eINSTANCE.getminimalSeparationBetweenBatchesConveyorBelt();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MINIMAL_SEPARATION_BETWEEN_BATCHES_CONVEYOR_BELT__VALUE = eINSTANCE.getminimalSeparationBetweenBatchesConveyorBelt_Value();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.NoneElementImpl <em>None Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.NoneElementImpl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getNoneElement()
		 * @generated
		 */
		EClass NONE_ELEMENT = eINSTANCE.getNoneElement();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.BindingElementImpl <em>Binding Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.BindingElementImpl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getBindingElement()
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
		 * The meta object literal for the '{@link metamodel_bdsl.impl.IntermediateElementImpl <em>Intermediate Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.IntermediateElementImpl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getIntermediateElement()
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
		 * The meta object literal for the '{@link metamodel_bdsl.impl.MetamodelElementImpl <em>Metamodel Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.MetamodelElementImpl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getMetamodelElement()
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
		 * The meta object literal for the '{@link metamodel_bdsl.impl.MetamodelElementFeatureImpl <em>Metamodel Element Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.MetamodelElementFeatureImpl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getMetamodelElementFeature()
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
		 * The meta object literal for the '{@link metamodel_bdsl.impl.BindingAttributeImpl <em>Binding Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.BindingAttributeImpl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getBindingAttribute()
		 * @generated
		 */
		EClass BINDING_ATTRIBUTE = eINSTANCE.getBindingAttribute();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.impl.VirtualAttributeImpl <em>Virtual Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.VirtualAttributeImpl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getVirtualAttribute()
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
		 * The meta object literal for the '{@link metamodel_bdsl.impl.SiriusTagImpl <em>Sirius Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.impl.SiriusTagImpl
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getSiriusTag()
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

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.OrderType <em>Order Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.OrderType
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getOrderType()
		 * @generated
		 */
		EEnum ORDER_TYPE = eINSTANCE.getOrderType();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.OutputType <em>Output Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.OutputType
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getOutputType()
		 * @generated
		 */
		EEnum OUTPUT_TYPE = eINSTANCE.getOutputType();

		/**
		 * The meta object literal for the '{@link metamodel_bdsl.QueryType <em>Query Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodel_bdsl.QueryType
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getQueryType()
		 * @generated
		 */
		EEnum QUERY_TYPE = eINSTANCE.getQueryType();

		/**
		 * The meta object literal for the '<em>Percent</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getPercent()
		 * @generated
		 */
		EDataType PERCENT = eINSTANCE.getPercent();

		/**
		 * The meta object literal for the '<em>Positive Int</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getPositiveInt()
		 * @generated
		 */
		EDataType POSITIVE_INT = eINSTANCE.getPositiveInt();

		/**
		 * The meta object literal for the '<em>Positive Double</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getPositiveDouble()
		 * @generated
		 */
		EDataType POSITIVE_DOUBLE = eINSTANCE.getPositiveDouble();

		/**
		 * The meta object literal for the '<em>Positive Int Not Null</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getPositiveIntNotNull()
		 * @generated
		 */
		EDataType POSITIVE_INT_NOT_NULL = eINSTANCE.getPositiveIntNotNull();

		/**
		 * The meta object literal for the '<em>Positive Double Not Null</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see metamodel_bdsl.impl.Metamodel_bdslPackageImpl#getPositiveDoubleNotNull()
		 * @generated
		 */
		EDataType POSITIVE_DOUBLE_NOT_NULL = eINSTANCE.getPositiveDoubleNotNull();

	}

} //Metamodel_bdslPackage
