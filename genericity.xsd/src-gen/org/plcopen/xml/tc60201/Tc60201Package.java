/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.plcopen.xml.tc60201;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.plcopen.xml.tc60201.Tc60201Factory
 * @model kind="package"
 * @generated
 */
public interface Tc60201Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tc60201";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.plcopen.org/xml/tc6_0201";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tc60201";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Tc60201Package eINSTANCE = org.plcopen.xml.tc60201.impl.Tc60201PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.AccessVariableTypeImpl <em>Access Variable Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.AccessVariableTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getAccessVariableType()
	 * @generated
	 */
	int ACCESS_VARIABLE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_VARIABLE_TYPE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Add Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_VARIABLE_TYPE__ADD_DATA = 1;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_VARIABLE_TYPE__DOCUMENTATION = 2;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_VARIABLE_TYPE__ALIAS = 3;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_VARIABLE_TYPE__DIRECTION = 4;

	/**
	 * The feature id for the '<em><b>Instance Path And Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_VARIABLE_TYPE__INSTANCE_PATH_AND_NAME = 5;

	/**
	 * The number of structural features of the '<em>Access Variable Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_VARIABLE_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.ActionBlockTypeImpl <em>Action Block Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.ActionBlockTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getActionBlockType()
	 * @generated
	 */
	int ACTION_BLOCK_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BLOCK_TYPE__POSITION = 0;

	/**
	 * The feature id for the '<em><b>Connection Point In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BLOCK_TYPE__CONNECTION_POINT_IN = 1;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BLOCK_TYPE__ACTION = 2;

	/**
	 * The feature id for the '<em><b>Add Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BLOCK_TYPE__ADD_DATA = 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BLOCK_TYPE__DOCUMENTATION = 4;

	/**
	 * The feature id for the '<em><b>Execution Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BLOCK_TYPE__EXECUTION_ORDER_ID = 5;

	/**
	 * The feature id for the '<em><b>Global Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BLOCK_TYPE__GLOBAL_ID = 6;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BLOCK_TYPE__HEIGHT = 7;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BLOCK_TYPE__LOCAL_ID = 8;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BLOCK_TYPE__NEGATED = 9;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BLOCK_TYPE__WIDTH = 10;

	/**
	 * The number of structural features of the '<em>Action Block Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BLOCK_TYPE_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.ActionsTypeImpl <em>Actions Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.ActionsTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getActionsType()
	 * @generated
	 */
	int ACTIONS_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONS_TYPE__ACTION = 0;

	/**
	 * The number of structural features of the '<em>Actions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.ActionTypeImpl <em>Action Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.ActionTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getActionType()
	 * @generated
	 */
	int ACTION_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Rel Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TYPE__REL_POSITION = 0;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TYPE__REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TYPE__INLINE = 2;

	/**
	 * The feature id for the '<em><b>Connection Point Out</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TYPE__CONNECTION_POINT_OUT = 3;

	/**
	 * The feature id for the '<em><b>Add Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TYPE__ADD_DATA = 4;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TYPE__DOCUMENTATION = 5;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TYPE__DURATION = 6;

	/**
	 * The feature id for the '<em><b>Execution Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TYPE__EXECUTION_ORDER_ID = 7;

	/**
	 * The feature id for the '<em><b>Global Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TYPE__GLOBAL_ID = 8;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TYPE__HEIGHT = 9;

	/**
	 * The feature id for the '<em><b>Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TYPE__INDICATOR = 10;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TYPE__LOCAL_ID = 11;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TYPE__QUALIFIER = 12;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TYPE__WIDTH = 13;

	/**
	 * The number of structural features of the '<em>Action Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TYPE_FEATURE_COUNT = 14;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.ActionType1Impl <em>Action Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.ActionType1Impl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getActionType1()
	 * @generated
	 */
	int ACTION_TYPE1 = 4;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TYPE1__BODY = 0;

	/**
	 * The feature id for the '<em><b>Add Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TYPE1__ADD_DATA = 1;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TYPE1__DOCUMENTATION = 2;

	/**
	 * The feature id for the '<em><b>Global Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TYPE1__GLOBAL_ID = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TYPE1__NAME = 4;

	/**
	 * The number of structural features of the '<em>Action Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TYPE1_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.AddDataImpl <em>Add Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.AddDataImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getAddData()
	 * @generated
	 */
	int ADD_DATA = 5;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_DATA__DATA = 0;

	/**
	 * The number of structural features of the '<em>Add Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_DATA_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.AddDataInfoImpl <em>Add Data Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.AddDataInfoImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getAddDataInfo()
	 * @generated
	 */
	int ADD_DATA_INFO = 6;

	/**
	 * The feature id for the '<em><b>Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_DATA_INFO__INFO = 0;

	/**
	 * The number of structural features of the '<em>Add Data Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_DATA_INFO_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.ArrayTypeImpl <em>Array Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.ArrayTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getArrayType()
	 * @generated
	 */
	int ARRAY_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__DIMENSION = 0;

	/**
	 * The feature id for the '<em><b>Base Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE__BASE_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Array Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.ArrayValueTypeImpl <em>Array Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.ArrayValueTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getArrayValueType()
	 * @generated
	 */
	int ARRAY_VALUE_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_VALUE_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_VALUE_TYPE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Array Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_VALUE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.BlockTypeImpl <em>Block Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.BlockTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getBlockType()
	 * @generated
	 */
	int BLOCK_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_TYPE__POSITION = 0;

	/**
	 * The feature id for the '<em><b>Input Variables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_TYPE__INPUT_VARIABLES = 1;

	/**
	 * The feature id for the '<em><b>In Out Variables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_TYPE__IN_OUT_VARIABLES = 2;

	/**
	 * The feature id for the '<em><b>Output Variables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_TYPE__OUTPUT_VARIABLES = 3;

	/**
	 * The feature id for the '<em><b>Add Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_TYPE__ADD_DATA = 4;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_TYPE__DOCUMENTATION = 5;

	/**
	 * The feature id for the '<em><b>Execution Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_TYPE__EXECUTION_ORDER_ID = 6;

	/**
	 * The feature id for the '<em><b>Global Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_TYPE__GLOBAL_ID = 7;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_TYPE__HEIGHT = 8;

	/**
	 * The feature id for the '<em><b>Instance Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_TYPE__INSTANCE_NAME = 9;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_TYPE__LOCAL_ID = 10;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_TYPE__TYPE_NAME = 11;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_TYPE__WIDTH = 12;

	/**
	 * The number of structural features of the '<em>Block Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_TYPE_FEATURE_COUNT = 13;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.BodyImpl <em>Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.BodyImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getBody()
	 * @generated
	 */
	int BODY = 10;

	/**
	 * The feature id for the '<em><b>IL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__IL = 0;

	/**
	 * The feature id for the '<em><b>ST</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__ST = 1;

	/**
	 * The feature id for the '<em><b>FBD</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__FBD = 2;

	/**
	 * The feature id for the '<em><b>LD</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__LD = 3;

	/**
	 * The feature id for the '<em><b>SFC</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__SFC = 4;

	/**
	 * The feature id for the '<em><b>Add Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__ADD_DATA = 5;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__DOCUMENTATION = 6;

	/**
	 * The feature id for the '<em><b>Global Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__GLOBAL_ID = 7;

	/**
	 * The feature id for the '<em><b>Worksheet Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__WORKSHEET_NAME = 8;

	/**
	 * The number of structural features of the '<em>Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.CoilTypeImpl <em>Coil Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.CoilTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getCoilType()
	 * @generated
	 */
	int COIL_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COIL_TYPE__POSITION = 0;

	/**
	 * The feature id for the '<em><b>Connection Point In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COIL_TYPE__CONNECTION_POINT_IN = 1;

	/**
	 * The feature id for the '<em><b>Connection Point Out</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COIL_TYPE__CONNECTION_POINT_OUT = 2;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COIL_TYPE__VARIABLE = 3;

	/**
	 * The feature id for the '<em><b>Add Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COIL_TYPE__ADD_DATA = 4;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COIL_TYPE__DOCUMENTATION = 5;

	/**
	 * The feature id for the '<em><b>Edge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COIL_TYPE__EDGE = 6;

	/**
	 * The feature id for the '<em><b>Execution Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COIL_TYPE__EXECUTION_ORDER_ID = 7;

	/**
	 * The feature id for the '<em><b>Global Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COIL_TYPE__GLOBAL_ID = 8;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COIL_TYPE__HEIGHT = 9;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COIL_TYPE__LOCAL_ID = 10;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COIL_TYPE__NEGATED = 11;

	/**
	 * The feature id for the '<em><b>Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COIL_TYPE__STORAGE = 12;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COIL_TYPE__WIDTH = 13;

	/**
	 * The number of structural features of the '<em>Coil Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COIL_TYPE_FEATURE_COUNT = 14;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.CommentTypeImpl <em>Comment Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.CommentTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getCommentType()
	 * @generated
	 */
	int COMMENT_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_TYPE__POSITION = 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_TYPE__CONTENT = 1;

	/**
	 * The feature id for the '<em><b>Add Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_TYPE__ADD_DATA = 2;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_TYPE__DOCUMENTATION = 3;

	/**
	 * The feature id for the '<em><b>Global Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_TYPE__GLOBAL_ID = 4;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_TYPE__HEIGHT = 5;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_TYPE__LOCAL_ID = 6;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_TYPE__WIDTH = 7;

	/**
	 * The number of structural features of the '<em>Comment Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.ConditionTypeImpl <em>Condition Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.ConditionTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getConditionType()
	 * @generated
	 */
	int CONDITION_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_TYPE__REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Connection Point In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_TYPE__CONNECTION_POINT_IN = 1;

	/**
	 * The feature id for the '<em><b>Inline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_TYPE__INLINE = 2;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_TYPE__NEGATED = 3;

	/**
	 * The number of structural features of the '<em>Condition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.ConfigurationsTypeImpl <em>Configurations Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.ConfigurationsTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getConfigurationsType()
	 * @generated
	 */
	int CONFIGURATIONS_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATIONS_TYPE__CONFIGURATION = 0;

	/**
	 * The number of structural features of the '<em>Configurations Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATIONS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.ConfigurationTypeImpl <em>Configuration Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.ConfigurationTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getConfigurationType()
	 * @generated
	 */
	int CONFIGURATION_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_TYPE__RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>Global Vars</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_TYPE__GLOBAL_VARS = 1;

	/**
	 * The feature id for the '<em><b>Access Vars</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_TYPE__ACCESS_VARS = 2;

	/**
	 * The feature id for the '<em><b>Config Vars</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_TYPE__CONFIG_VARS = 3;

	/**
	 * The feature id for the '<em><b>Add Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_TYPE__ADD_DATA = 4;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_TYPE__DOCUMENTATION = 5;

	/**
	 * The feature id for the '<em><b>Global Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_TYPE__GLOBAL_ID = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_TYPE__NAME = 7;

	/**
	 * The number of structural features of the '<em>Configuration Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.ConfigVariableTypeImpl <em>Config Variable Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.ConfigVariableTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getConfigVariableType()
	 * @generated
	 */
	int CONFIG_VARIABLE_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_VARIABLE_TYPE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_VARIABLE_TYPE__INITIAL_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Add Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_VARIABLE_TYPE__ADD_DATA = 2;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_VARIABLE_TYPE__DOCUMENTATION = 3;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_VARIABLE_TYPE__ADDRESS = 4;

	/**
	 * The feature id for the '<em><b>Instance Path And Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_VARIABLE_TYPE__INSTANCE_PATH_AND_NAME = 5;

	/**
	 * The number of structural features of the '<em>Config Variable Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_VARIABLE_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.ConnectionImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 17;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__POSITION = 0;

	/**
	 * The feature id for the '<em><b>Add Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__ADD_DATA = 1;

	/**
	 * The feature id for the '<em><b>Formal Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__FORMAL_PARAMETER = 2;

	/**
	 * The feature id for the '<em><b>Global Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__GLOBAL_ID = 3;

	/**
	 * The feature id for the '<em><b>Ref Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__REF_LOCAL_ID = 4;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.ConnectionPointInImpl <em>Connection Point In</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.ConnectionPointInImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getConnectionPointIn()
	 * @generated
	 */
	int CONNECTION_POINT_IN = 18;

	/**
	 * The feature id for the '<em><b>Rel Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_IN__REL_POSITION = 0;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_IN__CONNECTION = 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_IN__EXPRESSION = 2;

	/**
	 * The feature id for the '<em><b>Add Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_IN__ADD_DATA = 3;

	/**
	 * The feature id for the '<em><b>Global Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_IN__GLOBAL_ID = 4;

	/**
	 * The number of structural features of the '<em>Connection Point In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_IN_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.ConnectionPointInTypeImpl <em>Connection Point In Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.ConnectionPointInTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getConnectionPointInType()
	 * @generated
	 */
	int CONNECTION_POINT_IN_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Rel Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_IN_TYPE__REL_POSITION = CONNECTION_POINT_IN__REL_POSITION;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_IN_TYPE__CONNECTION = CONNECTION_POINT_IN__CONNECTION;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_IN_TYPE__EXPRESSION = CONNECTION_POINT_IN__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Add Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_IN_TYPE__ADD_DATA = CONNECTION_POINT_IN__ADD_DATA;

	/**
	 * The feature id for the '<em><b>Global Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_IN_TYPE__GLOBAL_ID = CONNECTION_POINT_IN__GLOBAL_ID;

	/**
	 * The number of structural features of the '<em>Connection Point In Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_IN_TYPE_FEATURE_COUNT = CONNECTION_POINT_IN_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.ConnectionPointOutImpl <em>Connection Point Out</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.ConnectionPointOutImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getConnectionPointOut()
	 * @generated
	 */
	int CONNECTION_POINT_OUT = 20;

	/**
	 * The feature id for the '<em><b>Rel Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_OUT__REL_POSITION = 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_OUT__EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Add Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_OUT__ADD_DATA = 2;

	/**
	 * The feature id for the '<em><b>Global Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_OUT__GLOBAL_ID = 3;

	/**
	 * The number of structural features of the '<em>Connection Point Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_OUT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.ConnectionPointOutActionTypeImpl <em>Connection Point Out Action Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.ConnectionPointOutActionTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getConnectionPointOutActionType()
	 * @generated
	 */
	int CONNECTION_POINT_OUT_ACTION_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Rel Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_OUT_ACTION_TYPE__REL_POSITION = CONNECTION_POINT_OUT__REL_POSITION;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_OUT_ACTION_TYPE__EXPRESSION = CONNECTION_POINT_OUT__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Add Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_OUT_ACTION_TYPE__ADD_DATA = CONNECTION_POINT_OUT__ADD_DATA;

	/**
	 * The feature id for the '<em><b>Global Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_OUT_ACTION_TYPE__GLOBAL_ID = CONNECTION_POINT_OUT__GLOBAL_ID;

	/**
	 * The feature id for the '<em><b>Formal Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_OUT_ACTION_TYPE__FORMAL_PARAMETER = CONNECTION_POINT_OUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Connection Point Out Action Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_OUT_ACTION_TYPE_FEATURE_COUNT = CONNECTION_POINT_OUT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.ConnectionPointOutTypeImpl <em>Connection Point Out Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.ConnectionPointOutTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getConnectionPointOutType()
	 * @generated
	 */
	int CONNECTION_POINT_OUT_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Rel Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_OUT_TYPE__REL_POSITION = CONNECTION_POINT_OUT__REL_POSITION;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_OUT_TYPE__EXPRESSION = CONNECTION_POINT_OUT__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Add Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_OUT_TYPE__ADD_DATA = CONNECTION_POINT_OUT__ADD_DATA;

	/**
	 * The feature id for the '<em><b>Global Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_OUT_TYPE__GLOBAL_ID = CONNECTION_POINT_OUT__GLOBAL_ID;

	/**
	 * The feature id for the '<em><b>Formal Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_OUT_TYPE__FORMAL_PARAMETER = CONNECTION_POINT_OUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Connection Point Out Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_OUT_TYPE_FEATURE_COUNT = CONNECTION_POINT_OUT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.ConnectionPointOutType1Impl <em>Connection Point Out Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.ConnectionPointOutType1Impl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getConnectionPointOutType1()
	 * @generated
	 */
	int CONNECTION_POINT_OUT_TYPE1 = 23;

	/**
	 * The feature id for the '<em><b>Rel Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_OUT_TYPE1__REL_POSITION = CONNECTION_POINT_OUT__REL_POSITION;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_OUT_TYPE1__EXPRESSION = CONNECTION_POINT_OUT__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Add Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_OUT_TYPE1__ADD_DATA = CONNECTION_POINT_OUT__ADD_DATA;

	/**
	 * The feature id for the '<em><b>Global Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_OUT_TYPE1__GLOBAL_ID = CONNECTION_POINT_OUT__GLOBAL_ID;

	/**
	 * The feature id for the '<em><b>Formal Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_OUT_TYPE1__FORMAL_PARAMETER = CONNECTION_POINT_OUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Connection Point Out Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_OUT_TYPE1_FEATURE_COUNT = CONNECTION_POINT_OUT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.ConnectionPointOutType2Impl <em>Connection Point Out Type2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.ConnectionPointOutType2Impl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getConnectionPointOutType2()
	 * @generated
	 */
	int CONNECTION_POINT_OUT_TYPE2 = 24;

	/**
	 * The feature id for the '<em><b>Rel Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_OUT_TYPE2__REL_POSITION = CONNECTION_POINT_OUT__REL_POSITION;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_OUT_TYPE2__EXPRESSION = CONNECTION_POINT_OUT__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Add Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_OUT_TYPE2__ADD_DATA = CONNECTION_POINT_OUT__ADD_DATA;

	/**
	 * The feature id for the '<em><b>Global Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_OUT_TYPE2__GLOBAL_ID = CONNECTION_POINT_OUT__GLOBAL_ID;

	/**
	 * The feature id for the '<em><b>Formal Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_OUT_TYPE2__FORMAL_PARAMETER = CONNECTION_POINT_OUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Connection Point Out Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_OUT_TYPE2_FEATURE_COUNT = CONNECTION_POINT_OUT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.ConnectionPointOutType3Impl <em>Connection Point Out Type3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.ConnectionPointOutType3Impl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getConnectionPointOutType3()
	 * @generated
	 */
	int CONNECTION_POINT_OUT_TYPE3 = 25;

	/**
	 * The feature id for the '<em><b>Rel Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_OUT_TYPE3__REL_POSITION = CONNECTION_POINT_OUT__REL_POSITION;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_OUT_TYPE3__EXPRESSION = CONNECTION_POINT_OUT__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Add Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_OUT_TYPE3__ADD_DATA = CONNECTION_POINT_OUT__ADD_DATA;

	/**
	 * The feature id for the '<em><b>Global Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_OUT_TYPE3__GLOBAL_ID = CONNECTION_POINT_OUT__GLOBAL_ID;

	/**
	 * The feature id for the '<em><b>Formal Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_OUT_TYPE3__FORMAL_PARAMETER = CONNECTION_POINT_OUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Connection Point Out Type3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_POINT_OUT_TYPE3_FEATURE_COUNT = CONNECTION_POINT_OUT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.ConnectorTypeImpl <em>Connector Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.ConnectorTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getConnectorType()
	 * @generated
	 */
	int CONNECTOR_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__POSITION = 0;

	/**
	 * The feature id for the '<em><b>Connection Point In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__CONNECTION_POINT_IN = 1;

	/**
	 * The feature id for the '<em><b>Add Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__ADD_DATA = 2;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__DOCUMENTATION = 3;

	/**
	 * The feature id for the '<em><b>Global Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__GLOBAL_ID = 4;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__HEIGHT = 5;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__LOCAL_ID = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__NAME = 7;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE__WIDTH = 8;

	/**
	 * The number of structural features of the '<em>Connector Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_TYPE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.ContactTypeImpl <em>Contact Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.ContactTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getContactType()
	 * @generated
	 */
	int CONTACT_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_TYPE__POSITION = 0;

	/**
	 * The feature id for the '<em><b>Connection Point In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_TYPE__CONNECTION_POINT_IN = 1;

	/**
	 * The feature id for the '<em><b>Connection Point Out</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_TYPE__CONNECTION_POINT_OUT = 2;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_TYPE__VARIABLE = 3;

	/**
	 * The feature id for the '<em><b>Add Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_TYPE__ADD_DATA = 4;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_TYPE__DOCUMENTATION = 5;

	/**
	 * The feature id for the '<em><b>Edge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_TYPE__EDGE = 6;

	/**
	 * The feature id for the '<em><b>Execution Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_TYPE__EXECUTION_ORDER_ID = 7;

	/**
	 * The feature id for the '<em><b>Global Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_TYPE__GLOBAL_ID = 8;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_TYPE__HEIGHT = 9;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_TYPE__LOCAL_ID = 10;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_TYPE__NEGATED = 11;

	/**
	 * The feature id for the '<em><b>Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_TYPE__STORAGE = 12;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_TYPE__WIDTH = 13;

	/**
	 * The number of structural features of the '<em>Contact Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_TYPE_FEATURE_COUNT = 14;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.ContentHeaderTypeImpl <em>Content Header Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.ContentHeaderTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getContentHeaderType()
	 * @generated
	 */
	int CONTENT_HEADER_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_HEADER_TYPE__COMMENT = 0;

	/**
	 * The feature id for the '<em><b>Coordinate Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_HEADER_TYPE__COORDINATE_INFO = 1;

	/**
	 * The feature id for the '<em><b>Add Data Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_HEADER_TYPE__ADD_DATA_INFO = 2;

	/**
	 * The feature id for the '<em><b>Add Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_HEADER_TYPE__ADD_DATA = 3;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_HEADER_TYPE__AUTHOR = 4;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_HEADER_TYPE__LANGUAGE = 5;

	/**
	 * The feature id for the '<em><b>Modification Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_HEADER_TYPE__MODIFICATION_DATE_TIME = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_HEADER_TYPE__NAME = 7;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_HEADER_TYPE__ORGANIZATION = 8;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_HEADER_TYPE__VERSION = 9;

	/**
	 * The number of structural features of the '<em>Content Header Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_HEADER_TYPE_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.ContinuationTypeImpl <em>Continuation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.ContinuationTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getContinuationType()
	 * @generated
	 */
	int CONTINUATION_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUATION_TYPE__POSITION = 0;

	/**
	 * The feature id for the '<em><b>Connection Point Out</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUATION_TYPE__CONNECTION_POINT_OUT = 1;

	/**
	 * The feature id for the '<em><b>Add Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUATION_TYPE__ADD_DATA = 2;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUATION_TYPE__DOCUMENTATION = 3;

	/**
	 * The feature id for the '<em><b>Global Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUATION_TYPE__GLOBAL_ID = 4;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUATION_TYPE__HEIGHT = 5;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUATION_TYPE__LOCAL_ID = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUATION_TYPE__NAME = 7;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUATION_TYPE__WIDTH = 8;

	/**
	 * The number of structural features of the '<em>Continuation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUATION_TYPE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.CoordinateInfoTypeImpl <em>Coordinate Info Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.CoordinateInfoTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getCoordinateInfoType()
	 * @generated
	 */
	int COORDINATE_INFO_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Page Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE_INFO_TYPE__PAGE_SIZE = 0;

	/**
	 * The feature id for the '<em><b>Fbd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE_INFO_TYPE__FBD = 1;

	/**
	 * The feature id for the '<em><b>Ld</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE_INFO_TYPE__LD = 2;

	/**
	 * The feature id for the '<em><b>Sfc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE_INFO_TYPE__SFC = 3;

	/**
	 * The number of structural features of the '<em>Coordinate Info Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE_INFO_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.DataTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 31;

	/**
	 * The feature id for the '<em><b>BOOL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__BOOL = 0;

	/**
	 * The feature id for the '<em><b>BYTE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__BYTE = 1;

	/**
	 * The feature id for the '<em><b>WORD</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__WORD = 2;

	/**
	 * The feature id for the '<em><b>DWORD</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__DWORD = 3;

	/**
	 * The feature id for the '<em><b>LWORD</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__LWORD = 4;

	/**
	 * The feature id for the '<em><b>SINT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__SINT = 5;

	/**
	 * The feature id for the '<em><b>INT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__INT = 6;

	/**
	 * The feature id for the '<em><b>DINT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__DINT = 7;

	/**
	 * The feature id for the '<em><b>LINT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__LINT = 8;

	/**
	 * The feature id for the '<em><b>USINT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__USINT = 9;

	/**
	 * The feature id for the '<em><b>UINT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__UINT = 10;

	/**
	 * The feature id for the '<em><b>UDINT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__UDINT = 11;

	/**
	 * The feature id for the '<em><b>ULINT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__ULINT = 12;

	/**
	 * The feature id for the '<em><b>REAL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__REAL = 13;

	/**
	 * The feature id for the '<em><b>LREAL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__LREAL = 14;

	/**
	 * The feature id for the '<em><b>TIME</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__TIME = 15;

	/**
	 * The feature id for the '<em><b>DATE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__DATE = 16;

	/**
	 * The feature id for the '<em><b>DT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__DT = 17;

	/**
	 * The feature id for the '<em><b>TOD</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__TOD = 18;

	/**
	 * The feature id for the '<em><b>String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__STRING = 19;

	/**
	 * The feature id for the '<em><b>Wstring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__WSTRING = 20;

	/**
	 * The feature id for the '<em><b>ANY</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__ANY = 21;

	/**
	 * The feature id for the '<em><b>ANYDERIVED</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__ANYDERIVED = 22;

	/**
	 * The feature id for the '<em><b>ANYELEMENTARY</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__ANYELEMENTARY = 23;

	/**
	 * The feature id for the '<em><b>ANYMAGNITUDE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__ANYMAGNITUDE = 24;

	/**
	 * The feature id for the '<em><b>ANYNUM</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__ANYNUM = 25;

	/**
	 * The feature id for the '<em><b>ANYREAL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__ANYREAL = 26;

	/**
	 * The feature id for the '<em><b>ANYINT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__ANYINT = 27;

	/**
	 * The feature id for the '<em><b>ANYBIT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__ANYBIT = 28;

	/**
	 * The feature id for the '<em><b>ANYSTRING</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__ANYSTRING = 29;

	/**
	 * The feature id for the '<em><b>ANYDATE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__ANYDATE = 30;

	/**
	 * The feature id for the '<em><b>Array</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__ARRAY = 31;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__DERIVED = 32;

	/**
	 * The feature id for the '<em><b>Enum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__ENUM = 33;

	/**
	 * The feature id for the '<em><b>Struct</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__STRUCT = 34;

	/**
	 * The feature id for the '<em><b>Subrange Signed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__SUBRANGE_SIGNED = 35;

	/**
	 * The feature id for the '<em><b>Subrange Unsigned</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__SUBRANGE_UNSIGNED = 36;

	/**
	 * The feature id for the '<em><b>Pointer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__POINTER = 37;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = 38;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.DataType1Impl <em>Data Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.DataType1Impl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getDataType1()
	 * @generated
	 */
	int DATA_TYPE1 = 32;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE1__ANY = 0;

	/**
	 * The feature id for the '<em><b>Handle Unknown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE1__HANDLE_UNKNOWN = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE1__NAME = 2;

	/**
	 * The number of structural features of the '<em>Data Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE1_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.DataTypesTypeImpl <em>Data Types Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.DataTypesTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getDataTypesType()
	 * @generated
	 */
	int DATA_TYPES_TYPE = 33;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPES_TYPE__DATA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Data Types Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.DataTypeTypeImpl <em>Data Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.DataTypeTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getDataTypeType()
	 * @generated
	 */
	int DATA_TYPE_TYPE = 34;

	/**
	 * The feature id for the '<em><b>Base Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_TYPE__BASE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_TYPE__INITIAL_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Add Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_TYPE__ADD_DATA = 2;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_TYPE__DOCUMENTATION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_TYPE__NAME = 4;

	/**
	 * The number of structural features of the '<em>Data Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.DerivedTypeImpl <em>Derived Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.DerivedTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getDerivedType()
	 * @generated
	 */
	int DERIVED_TYPE = 35;

	/**
	 * The feature id for the '<em><b>Add Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TYPE__ADD_DATA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TYPE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Derived Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.DocumentRootImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 36;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Project</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROJECT = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.EnumTypeImpl <em>Enum Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.EnumTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getEnumType()
	 * @generated
	 */
	int ENUM_TYPE = 37;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__VALUES = 0;

	/**
	 * The feature id for the '<em><b>Base Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE__BASE_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Enum Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.ErrorTypeImpl <em>Error Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.ErrorTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getErrorType()
	 * @generated
	 */
	int ERROR_TYPE = 38;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TYPE__POSITION = 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TYPE__CONTENT = 1;

	/**
	 * The feature id for the '<em><b>Add Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TYPE__ADD_DATA = 2;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TYPE__DOCUMENTATION = 3;

	/**
	 * The feature id for the '<em><b>Global Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TYPE__GLOBAL_ID = 4;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TYPE__HEIGHT = 5;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TYPE__LOCAL_ID = 6;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TYPE__WIDTH = 7;

	/**
	 * The number of structural features of the '<em>Error Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.VarListPlainImpl <em>Var List Plain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.VarListPlainImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getVarListPlain()
	 * @generated
	 */
	int VAR_LIST_PLAIN = 119;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_LIST_PLAIN__VARIABLE = 0;

	/**
	 * The feature id for the '<em><b>Add Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_LIST_PLAIN__ADD_DATA = 1;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_LIST_PLAIN__DOCUMENTATION = 2;

	/**
	 * The number of structural features of the '<em>Var List Plain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_LIST_PLAIN_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.VarListImpl <em>Var List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.VarListImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getVarList()
	 * @generated
	 */
	int VAR_LIST = 116;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_LIST__VARIABLE = VAR_LIST_PLAIN__VARIABLE;

	/**
	 * The feature id for the '<em><b>Add Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_LIST__ADD_DATA = VAR_LIST_PLAIN__ADD_DATA;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_LIST__DOCUMENTATION = VAR_LIST_PLAIN__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_LIST__CONSTANT = VAR_LIST_PLAIN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_LIST__NAME = VAR_LIST_PLAIN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nonpersistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_LIST__NONPERSISTENT = VAR_LIST_PLAIN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Nonretain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_LIST__NONRETAIN = VAR_LIST_PLAIN_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Persistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_LIST__PERSISTENT = VAR_LIST_PLAIN_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Retain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_LIST__RETAIN = VAR_LIST_PLAIN_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Var List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_LIST_FEATURE_COUNT = VAR_LIST_PLAIN_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.ExternalVarsTypeImpl <em>External Vars Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.ExternalVarsTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getExternalVarsType()
	 * @generated
	 */
	int EXTERNAL_VARS_TYPE = 39;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_VARS_TYPE__VARIABLE = VAR_LIST__VARIABLE;

	/**
	 * The feature id for the '<em><b>Add Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_VARS_TYPE__ADD_DATA = VAR_LIST__ADD_DATA;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_VARS_TYPE__DOCUMENTATION = VAR_LIST__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_VARS_TYPE__CONSTANT = VAR_LIST__CONSTANT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_VARS_TYPE__NAME = VAR_LIST__NAME;

	/**
	 * The feature id for the '<em><b>Nonpersistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_VARS_TYPE__NONPERSISTENT = VAR_LIST__NONPERSISTENT;

	/**
	 * The feature id for the '<em><b>Nonretain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_VARS_TYPE__NONRETAIN = VAR_LIST__NONRETAIN;

	/**
	 * The feature id for the '<em><b>Persistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_VARS_TYPE__PERSISTENT = VAR_LIST__PERSISTENT;

	/**
	 * The feature id for the '<em><b>Retain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_VARS_TYPE__RETAIN = VAR_LIST__RETAIN;

	/**
	 * The number of structural features of the '<em>External Vars Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_VARS_TYPE_FEATURE_COUNT = VAR_LIST_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.FbdTypeImpl <em>Fbd Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.FbdTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getFbdType()
	 * @generated
	 */
	int FBD_TYPE = 40;

	/**
	 * The feature id for the '<em><b>Scaling</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FBD_TYPE__SCALING = 0;

	/**
	 * The number of structural features of the '<em>Fbd Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FBD_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.FBDType1Impl <em>FBD Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.FBDType1Impl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getFBDType1()
	 * @generated
	 */
	int FBD_TYPE1 = 41;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FBD_TYPE1__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FBD_TYPE1__COMMENT = 1;

	/**
	 * The feature id for the '<em><b>Error</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FBD_TYPE1__ERROR = 2;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FBD_TYPE1__CONNECTOR = 3;

	/**
	 * The feature id for the '<em><b>Continuation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FBD_TYPE1__CONTINUATION = 4;

	/**
	 * The feature id for the '<em><b>Action Block</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FBD_TYPE1__ACTION_BLOCK = 5;

	/**
	 * The feature id for the '<em><b>Vendor Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FBD_TYPE1__VENDOR_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FBD_TYPE1__BLOCK = 7;

	/**
	 * The feature id for the '<em><b>In Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FBD_TYPE1__IN_VARIABLE = 8;

	/**
	 * The feature id for the '<em><b>Out Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FBD_TYPE1__OUT_VARIABLE = 9;

	/**
	 * The feature id for the '<em><b>In Out Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FBD_TYPE1__IN_OUT_VARIABLE = 10;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FBD_TYPE1__LABEL = 11;

	/**
	 * The feature id for the '<em><b>Jump</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FBD_TYPE1__JUMP = 12;

	/**
	 * The feature id for the '<em><b>Return</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FBD_TYPE1__RETURN = 13;

	/**
	 * The number of structural features of the '<em>FBD Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FBD_TYPE1_FEATURE_COUNT = 14;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.FileHeaderTypeImpl <em>File Header Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.FileHeaderTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getFileHeaderType()
	 * @generated
	 */
	int FILE_HEADER_TYPE = 42;

	/**
	 * The feature id for the '<em><b>Company Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_HEADER_TYPE__COMPANY_NAME = 0;

	/**
	 * The feature id for the '<em><b>Company URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_HEADER_TYPE__COMPANY_URL = 1;

	/**
	 * The feature id for the '<em><b>Content Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_HEADER_TYPE__CONTENT_DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Creation Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_HEADER_TYPE__CREATION_DATE_TIME = 3;

	/**
	 * The feature id for the '<em><b>Product Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_HEADER_TYPE__PRODUCT_NAME = 4;

	/**
	 * The feature id for the '<em><b>Product Release</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_HEADER_TYPE__PRODUCT_RELEASE = 5;

	/**
	 * The feature id for the '<em><b>Product Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_HEADER_TYPE__PRODUCT_VERSION = 6;

	/**
	 * The number of structural features of the '<em>File Header Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_HEADER_TYPE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.FormattedTextImpl <em>Formatted Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.FormattedTextImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getFormattedText()
	 * @generated
	 */
	int FORMATTED_TEXT = 43;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATTED_TEXT__ANY = 0;

	/**
	 * The number of structural features of the '<em>Formatted Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATTED_TEXT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.GlobalVarsTypeImpl <em>Global Vars Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.GlobalVarsTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getGlobalVarsType()
	 * @generated
	 */
	int GLOBAL_VARS_TYPE = 44;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARS_TYPE__VARIABLE = VAR_LIST__VARIABLE;

	/**
	 * The feature id for the '<em><b>Add Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARS_TYPE__ADD_DATA = VAR_LIST__ADD_DATA;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARS_TYPE__DOCUMENTATION = VAR_LIST__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARS_TYPE__CONSTANT = VAR_LIST__CONSTANT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARS_TYPE__NAME = VAR_LIST__NAME;

	/**
	 * The feature id for the '<em><b>Nonpersistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARS_TYPE__NONPERSISTENT = VAR_LIST__NONPERSISTENT;

	/**
	 * The feature id for the '<em><b>Nonretain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARS_TYPE__NONRETAIN = VAR_LIST__NONRETAIN;

	/**
	 * The feature id for the '<em><b>Persistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARS_TYPE__PERSISTENT = VAR_LIST__PERSISTENT;

	/**
	 * The feature id for the '<em><b>Retain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARS_TYPE__RETAIN = VAR_LIST__RETAIN;

	/**
	 * The number of structural features of the '<em>Global Vars Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_VARS_TYPE_FEATURE_COUNT = VAR_LIST_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.InfoTypeImpl <em>Info Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.InfoTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getInfoType()
	 * @generated
	 */
	int INFO_TYPE = 45;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_TYPE__VENDOR = 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_TYPE__VERSION = 3;

	/**
	 * The number of structural features of the '<em>Info Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.InlineTypeImpl <em>Inline Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.InlineTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getInlineType()
	 * @generated
	 */
	int INLINE_TYPE = 46;

	/**
	 * The feature id for the '<em><b>IL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_TYPE__IL = BODY__IL;

	/**
	 * The feature id for the '<em><b>ST</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_TYPE__ST = BODY__ST;

	/**
	 * The feature id for the '<em><b>FBD</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_TYPE__FBD = BODY__FBD;

	/**
	 * The feature id for the '<em><b>LD</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_TYPE__LD = BODY__LD;

	/**
	 * The feature id for the '<em><b>SFC</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_TYPE__SFC = BODY__SFC;

	/**
	 * The feature id for the '<em><b>Add Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_TYPE__ADD_DATA = BODY__ADD_DATA;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_TYPE__DOCUMENTATION = BODY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Global Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_TYPE__GLOBAL_ID = BODY__GLOBAL_ID;

	/**
	 * The feature id for the '<em><b>Worksheet Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_TYPE__WORKSHEET_NAME = BODY__WORKSHEET_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_TYPE__NAME = BODY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Inline Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_TYPE_FEATURE_COUNT = BODY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.InOutVariablesTypeImpl <em>In Out Variables Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.InOutVariablesTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getInOutVariablesType()
	 * @generated
	 */
	int IN_OUT_VARIABLES_TYPE = 47;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_VARIABLES_TYPE__VARIABLE = 0;

	/**
	 * The number of structural features of the '<em>In Out Variables Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_VARIABLES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.InOutVariablesType1Impl <em>In Out Variables Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.InOutVariablesType1Impl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getInOutVariablesType1()
	 * @generated
	 */
	int IN_OUT_VARIABLES_TYPE1 = 48;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_VARIABLES_TYPE1__VARIABLE = 0;

	/**
	 * The number of structural features of the '<em>In Out Variables Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_VARIABLES_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.InOutVariableTypeImpl <em>In Out Variable Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.InOutVariableTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getInOutVariableType()
	 * @generated
	 */
	int IN_OUT_VARIABLE_TYPE = 49;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_VARIABLE_TYPE__POSITION = 0;

	/**
	 * The feature id for the '<em><b>Connection Point In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_VARIABLE_TYPE__CONNECTION_POINT_IN = 1;

	/**
	 * The feature id for the '<em><b>Connection Point Out</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_VARIABLE_TYPE__CONNECTION_POINT_OUT = 2;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_VARIABLE_TYPE__EXPRESSION = 3;

	/**
	 * The feature id for the '<em><b>Add Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_VARIABLE_TYPE__ADD_DATA = 4;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_VARIABLE_TYPE__DOCUMENTATION = 5;

	/**
	 * The feature id for the '<em><b>Edge In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_VARIABLE_TYPE__EDGE_IN = 6;

	/**
	 * The feature id for the '<em><b>Edge Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_VARIABLE_TYPE__EDGE_OUT = 7;

	/**
	 * The feature id for the '<em><b>Execution Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_VARIABLE_TYPE__EXECUTION_ORDER_ID = 8;

	/**
	 * The feature id for the '<em><b>Global Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_VARIABLE_TYPE__GLOBAL_ID = 9;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_VARIABLE_TYPE__HEIGHT = 10;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_VARIABLE_TYPE__LOCAL_ID = 11;

	/**
	 * The feature id for the '<em><b>Negated In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_VARIABLE_TYPE__NEGATED_IN = 12;

	/**
	 * The feature id for the '<em><b>Negated Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_VARIABLE_TYPE__NEGATED_OUT = 13;

	/**
	 * The feature id for the '<em><b>Storage In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_VARIABLE_TYPE__STORAGE_IN = 14;

	/**
	 * The feature id for the '<em><b>Storage Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_VARIABLE_TYPE__STORAGE_OUT = 15;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_VARIABLE_TYPE__WIDTH = 16;

	/**
	 * The number of structural features of the '<em>In Out Variable Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_VARIABLE_TYPE_FEATURE_COUNT = 17;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.InOutVarsTypeImpl <em>In Out Vars Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.InOutVarsTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getInOutVarsType()
	 * @generated
	 */
	int IN_OUT_VARS_TYPE = 50;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_VARS_TYPE__VARIABLE = VAR_LIST__VARIABLE;

	/**
	 * The feature id for the '<em><b>Add Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_VARS_TYPE__ADD_DATA = VAR_LIST__ADD_DATA;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_VARS_TYPE__DOCUMENTATION = VAR_LIST__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_VARS_TYPE__CONSTANT = VAR_LIST__CONSTANT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_VARS_TYPE__NAME = VAR_LIST__NAME;

	/**
	 * The feature id for the '<em><b>Nonpersistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_VARS_TYPE__NONPERSISTENT = VAR_LIST__NONPERSISTENT;

	/**
	 * The feature id for the '<em><b>Nonretain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_VARS_TYPE__NONRETAIN = VAR_LIST__NONRETAIN;

	/**
	 * The feature id for the '<em><b>Persistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_VARS_TYPE__PERSISTENT = VAR_LIST__PERSISTENT;

	/**
	 * The feature id for the '<em><b>Retain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_VARS_TYPE__RETAIN = VAR_LIST__RETAIN;

	/**
	 * The number of structural features of the '<em>In Out Vars Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OUT_VARS_TYPE_FEATURE_COUNT = VAR_LIST_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.InputVariablesTypeImpl <em>Input Variables Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.InputVariablesTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getInputVariablesType()
	 * @generated
	 */
	int INPUT_VARIABLES_TYPE = 51;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VARIABLES_TYPE__VARIABLE = 0;

	/**
	 * The number of structural features of the '<em>Input Variables Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VARIABLES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.InputVariablesType1Impl <em>Input Variables Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.InputVariablesType1Impl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getInputVariablesType1()
	 * @generated
	 */
	int INPUT_VARIABLES_TYPE1 = 52;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VARIABLES_TYPE1__VARIABLE = 0;

	/**
	 * The number of structural features of the '<em>Input Variables Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VARIABLES_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.InputVarsTypeImpl <em>Input Vars Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.InputVarsTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getInputVarsType()
	 * @generated
	 */
	int INPUT_VARS_TYPE = 53;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VARS_TYPE__VARIABLE = VAR_LIST__VARIABLE;

	/**
	 * The feature id for the '<em><b>Add Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VARS_TYPE__ADD_DATA = VAR_LIST__ADD_DATA;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VARS_TYPE__DOCUMENTATION = VAR_LIST__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VARS_TYPE__CONSTANT = VAR_LIST__CONSTANT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VARS_TYPE__NAME = VAR_LIST__NAME;

	/**
	 * The feature id for the '<em><b>Nonpersistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VARS_TYPE__NONPERSISTENT = VAR_LIST__NONPERSISTENT;

	/**
	 * The feature id for the '<em><b>Nonretain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VARS_TYPE__NONRETAIN = VAR_LIST__NONRETAIN;

	/**
	 * The feature id for the '<em><b>Persistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VARS_TYPE__PERSISTENT = VAR_LIST__PERSISTENT;

	/**
	 * The feature id for the '<em><b>Retain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VARS_TYPE__RETAIN = VAR_LIST__RETAIN;

	/**
	 * The number of structural features of the '<em>Input Vars Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VARS_TYPE_FEATURE_COUNT = VAR_LIST_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.InstancesTypeImpl <em>Instances Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.InstancesTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getInstancesType()
	 * @generated
	 */
	int INSTANCES_TYPE = 54;

	/**
	 * The feature id for the '<em><b>Configurations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCES_TYPE__CONFIGURATIONS = 0;

	/**
	 * The number of structural features of the '<em>Instances Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.InterfaceTypeImpl <em>Interface Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.InterfaceTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getInterfaceType()
	 * @generated
	 */
	int INTERFACE_TYPE = 55;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE__RETURN_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Local Vars</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE__LOCAL_VARS = 2;

	/**
	 * The feature id for the '<em><b>Temp Vars</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE__TEMP_VARS = 3;

	/**
	 * The feature id for the '<em><b>Input Vars</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE__INPUT_VARS = 4;

	/**
	 * The feature id for the '<em><b>Output Vars</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE__OUTPUT_VARS = 5;

	/**
	 * The feature id for the '<em><b>In Out Vars</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE__IN_OUT_VARS = 6;

	/**
	 * The feature id for the '<em><b>External Vars</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE__EXTERNAL_VARS = 7;

	/**
	 * The feature id for the '<em><b>Global Vars</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE__GLOBAL_VARS = 8;

	/**
	 * The feature id for the '<em><b>Access Vars</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE__ACCESS_VARS = 9;

	/**
	 * The feature id for the '<em><b>Add Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE__ADD_DATA = 10;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE__DOCUMENTATION = 11;

	/**
	 * The number of structural features of the '<em>Interface Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_TYPE_FEATURE_COUNT = 12;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.InVariableTypeImpl <em>In Variable Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.InVariableTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getInVariableType()
	 * @generated
	 */
	int IN_VARIABLE_TYPE = 56;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_VARIABLE_TYPE__POSITION = 0;

	/**
	 * The feature id for the '<em><b>Connection Point Out</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_VARIABLE_TYPE__CONNECTION_POINT_OUT = 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_VARIABLE_TYPE__EXPRESSION = 2;

	/**
	 * The feature id for the '<em><b>Add Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_VARIABLE_TYPE__ADD_DATA = 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_VARIABLE_TYPE__DOCUMENTATION = 4;

	/**
	 * The feature id for the '<em><b>Edge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_VARIABLE_TYPE__EDGE = 5;

	/**
	 * The feature id for the '<em><b>Execution Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_VARIABLE_TYPE__EXECUTION_ORDER_ID = 6;

	/**
	 * The feature id for the '<em><b>Global Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_VARIABLE_TYPE__GLOBAL_ID = 7;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_VARIABLE_TYPE__HEIGHT = 8;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_VARIABLE_TYPE__LOCAL_ID = 9;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_VARIABLE_TYPE__NEGATED = 10;

	/**
	 * The feature id for the '<em><b>Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_VARIABLE_TYPE__STORAGE = 11;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_VARIABLE_TYPE__WIDTH = 12;

	/**
	 * The number of structural features of the '<em>In Variable Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_VARIABLE_TYPE_FEATURE_COUNT = 13;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.JumpStepTypeImpl <em>Jump Step Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.JumpStepTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getJumpStepType()
	 * @generated
	 */
	int JUMP_STEP_TYPE = 57;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_STEP_TYPE__POSITION = 0;

	/**
	 * The feature id for the '<em><b>Connection Point In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_STEP_TYPE__CONNECTION_POINT_IN = 1;

	/**
	 * The feature id for the '<em><b>Add Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_STEP_TYPE__ADD_DATA = 2;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_STEP_TYPE__DOCUMENTATION = 3;

	/**
	 * The feature id for the '<em><b>Execution Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_STEP_TYPE__EXECUTION_ORDER_ID = 4;

	/**
	 * The feature id for the '<em><b>Global Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_STEP_TYPE__GLOBAL_ID = 5;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_STEP_TYPE__HEIGHT = 6;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_STEP_TYPE__LOCAL_ID = 7;

	/**
	 * The feature id for the '<em><b>Target Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_STEP_TYPE__TARGET_NAME = 8;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_STEP_TYPE__WIDTH = 9;

	/**
	 * The number of structural features of the '<em>Jump Step Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_STEP_TYPE_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.JumpTypeImpl <em>Jump Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.JumpTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getJumpType()
	 * @generated
	 */
	int JUMP_TYPE = 58;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_TYPE__POSITION = 0;

	/**
	 * The feature id for the '<em><b>Connection Point In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_TYPE__CONNECTION_POINT_IN = 1;

	/**
	 * The feature id for the '<em><b>Add Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_TYPE__ADD_DATA = 2;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_TYPE__DOCUMENTATION = 3;

	/**
	 * The feature id for the '<em><b>Execution Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_TYPE__EXECUTION_ORDER_ID = 4;

	/**
	 * The feature id for the '<em><b>Global Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_TYPE__GLOBAL_ID = 5;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_TYPE__HEIGHT = 6;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_TYPE__LABEL = 7;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_TYPE__LOCAL_ID = 8;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_TYPE__WIDTH = 9;

	/**
	 * The number of structural features of the '<em>Jump Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_TYPE_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.LabelTypeImpl <em>Label Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.LabelTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getLabelType()
	 * @generated
	 */
	int LABEL_TYPE = 59;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_TYPE__POSITION = 0;

	/**
	 * The feature id for the '<em><b>Add Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_TYPE__ADD_DATA = 1;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_TYPE__DOCUMENTATION = 2;

	/**
	 * The feature id for the '<em><b>Execution Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_TYPE__EXECUTION_ORDER_ID = 3;

	/**
	 * The feature id for the '<em><b>Global Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_TYPE__GLOBAL_ID = 4;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_TYPE__HEIGHT = 5;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_TYPE__LABEL = 6;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_TYPE__LOCAL_ID = 7;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_TYPE__WIDTH = 8;

	/**
	 * The number of structural features of the '<em>Label Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_TYPE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.LdTypeImpl <em>Ld Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.LdTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getLdType()
	 * @generated
	 */
	int LD_TYPE = 60;

	/**
	 * The feature id for the '<em><b>Scaling</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LD_TYPE__SCALING = 0;

	/**
	 * The number of structural features of the '<em>Ld Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LD_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.LDType1Impl <em>LD Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.LDType1Impl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getLDType1()
	 * @generated
	 */
	int LD_TYPE1 = 61;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LD_TYPE1__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LD_TYPE1__COMMENT = 1;

	/**
	 * The feature id for the '<em><b>Error</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LD_TYPE1__ERROR = 2;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LD_TYPE1__CONNECTOR = 3;

	/**
	 * The feature id for the '<em><b>Continuation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LD_TYPE1__CONTINUATION = 4;

	/**
	 * The feature id for the '<em><b>Action Block</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LD_TYPE1__ACTION_BLOCK = 5;

	/**
	 * The feature id for the '<em><b>Vendor Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LD_TYPE1__VENDOR_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LD_TYPE1__BLOCK = 7;

	/**
	 * The feature id for the '<em><b>In Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LD_TYPE1__IN_VARIABLE = 8;

	/**
	 * The feature id for the '<em><b>Out Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LD_TYPE1__OUT_VARIABLE = 9;

	/**
	 * The feature id for the '<em><b>In Out Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LD_TYPE1__IN_OUT_VARIABLE = 10;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LD_TYPE1__LABEL = 11;

	/**
	 * The feature id for the '<em><b>Jump</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LD_TYPE1__JUMP = 12;

	/**
	 * The feature id for the '<em><b>Return</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LD_TYPE1__RETURN = 13;

	/**
	 * The feature id for the '<em><b>Left Power Rail</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LD_TYPE1__LEFT_POWER_RAIL = 14;

	/**
	 * The feature id for the '<em><b>Right Power Rail</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LD_TYPE1__RIGHT_POWER_RAIL = 15;

	/**
	 * The feature id for the '<em><b>Coil</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LD_TYPE1__COIL = 16;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LD_TYPE1__CONTACT = 17;

	/**
	 * The number of structural features of the '<em>LD Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LD_TYPE1_FEATURE_COUNT = 18;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.LeftPowerRailTypeImpl <em>Left Power Rail Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.LeftPowerRailTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getLeftPowerRailType()
	 * @generated
	 */
	int LEFT_POWER_RAIL_TYPE = 62;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_POWER_RAIL_TYPE__POSITION = 0;

	/**
	 * The feature id for the '<em><b>Connection Point Out</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_POWER_RAIL_TYPE__CONNECTION_POINT_OUT = 1;

	/**
	 * The feature id for the '<em><b>Add Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_POWER_RAIL_TYPE__ADD_DATA = 2;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_POWER_RAIL_TYPE__DOCUMENTATION = 3;

	/**
	 * The feature id for the '<em><b>Execution Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_POWER_RAIL_TYPE__EXECUTION_ORDER_ID = 4;

	/**
	 * The feature id for the '<em><b>Global Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_POWER_RAIL_TYPE__GLOBAL_ID = 5;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_POWER_RAIL_TYPE__HEIGHT = 6;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_POWER_RAIL_TYPE__LOCAL_ID = 7;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_POWER_RAIL_TYPE__WIDTH = 8;

	/**
	 * The number of structural features of the '<em>Left Power Rail Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_POWER_RAIL_TYPE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.LocalVarsTypeImpl <em>Local Vars Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.LocalVarsTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getLocalVarsType()
	 * @generated
	 */
	int LOCAL_VARS_TYPE = 63;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARS_TYPE__VARIABLE = VAR_LIST__VARIABLE;

	/**
	 * The feature id for the '<em><b>Add Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARS_TYPE__ADD_DATA = VAR_LIST__ADD_DATA;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARS_TYPE__DOCUMENTATION = VAR_LIST__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARS_TYPE__CONSTANT = VAR_LIST__CONSTANT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARS_TYPE__NAME = VAR_LIST__NAME;

	/**
	 * The feature id for the '<em><b>Nonpersistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARS_TYPE__NONPERSISTENT = VAR_LIST__NONPERSISTENT;

	/**
	 * The feature id for the '<em><b>Nonretain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARS_TYPE__NONRETAIN = VAR_LIST__NONRETAIN;

	/**
	 * The feature id for the '<em><b>Persistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARS_TYPE__PERSISTENT = VAR_LIST__PERSISTENT;

	/**
	 * The feature id for the '<em><b>Retain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARS_TYPE__RETAIN = VAR_LIST__RETAIN;

	/**
	 * The number of structural features of the '<em>Local Vars Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARS_TYPE_FEATURE_COUNT = VAR_LIST_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.MacroStepTypeImpl <em>Macro Step Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.MacroStepTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getMacroStepType()
	 * @generated
	 */
	int MACRO_STEP_TYPE = 64;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_STEP_TYPE__POSITION = 0;

	/**
	 * The feature id for the '<em><b>Connection Point In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_STEP_TYPE__CONNECTION_POINT_IN = 1;

	/**
	 * The feature id for the '<em><b>Connection Point Out</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_STEP_TYPE__CONNECTION_POINT_OUT = 2;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_STEP_TYPE__BODY = 3;

	/**
	 * The feature id for the '<em><b>Add Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_STEP_TYPE__ADD_DATA = 4;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_STEP_TYPE__DOCUMENTATION = 5;

	/**
	 * The feature id for the '<em><b>Execution Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_STEP_TYPE__EXECUTION_ORDER_ID = 6;

	/**
	 * The feature id for the '<em><b>Global Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_STEP_TYPE__GLOBAL_ID = 7;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_STEP_TYPE__HEIGHT = 8;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_STEP_TYPE__LOCAL_ID = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_STEP_TYPE__NAME = 10;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_STEP_TYPE__WIDTH = 11;

	/**
	 * The number of structural features of the '<em>Macro Step Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_STEP_TYPE_FEATURE_COUNT = 12;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.OutputVariablesTypeImpl <em>Output Variables Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.OutputVariablesTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getOutputVariablesType()
	 * @generated
	 */
	int OUTPUT_VARIABLES_TYPE = 65;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_VARIABLES_TYPE__VARIABLE = 0;

	/**
	 * The number of structural features of the '<em>Output Variables Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_VARIABLES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.OutputVariablesType1Impl <em>Output Variables Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.OutputVariablesType1Impl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getOutputVariablesType1()
	 * @generated
	 */
	int OUTPUT_VARIABLES_TYPE1 = 66;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_VARIABLES_TYPE1__VARIABLE = 0;

	/**
	 * The number of structural features of the '<em>Output Variables Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_VARIABLES_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.OutputVarsTypeImpl <em>Output Vars Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.OutputVarsTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getOutputVarsType()
	 * @generated
	 */
	int OUTPUT_VARS_TYPE = 67;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_VARS_TYPE__VARIABLE = VAR_LIST__VARIABLE;

	/**
	 * The feature id for the '<em><b>Add Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_VARS_TYPE__ADD_DATA = VAR_LIST__ADD_DATA;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_VARS_TYPE__DOCUMENTATION = VAR_LIST__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_VARS_TYPE__CONSTANT = VAR_LIST__CONSTANT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_VARS_TYPE__NAME = VAR_LIST__NAME;

	/**
	 * The feature id for the '<em><b>Nonpersistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_VARS_TYPE__NONPERSISTENT = VAR_LIST__NONPERSISTENT;

	/**
	 * The feature id for the '<em><b>Nonretain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_VARS_TYPE__NONRETAIN = VAR_LIST__NONRETAIN;

	/**
	 * The feature id for the '<em><b>Persistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_VARS_TYPE__PERSISTENT = VAR_LIST__PERSISTENT;

	/**
	 * The feature id for the '<em><b>Retain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_VARS_TYPE__RETAIN = VAR_LIST__RETAIN;

	/**
	 * The number of structural features of the '<em>Output Vars Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_VARS_TYPE_FEATURE_COUNT = VAR_LIST_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.OutVariableTypeImpl <em>Out Variable Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.OutVariableTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getOutVariableType()
	 * @generated
	 */
	int OUT_VARIABLE_TYPE = 68;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_VARIABLE_TYPE__POSITION = 0;

	/**
	 * The feature id for the '<em><b>Connection Point In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_VARIABLE_TYPE__CONNECTION_POINT_IN = 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_VARIABLE_TYPE__EXPRESSION = 2;

	/**
	 * The feature id for the '<em><b>Add Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_VARIABLE_TYPE__ADD_DATA = 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_VARIABLE_TYPE__DOCUMENTATION = 4;

	/**
	 * The feature id for the '<em><b>Edge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_VARIABLE_TYPE__EDGE = 5;

	/**
	 * The feature id for the '<em><b>Execution Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_VARIABLE_TYPE__EXECUTION_ORDER_ID = 6;

	/**
	 * The feature id for the '<em><b>Global Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_VARIABLE_TYPE__GLOBAL_ID = 7;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_VARIABLE_TYPE__HEIGHT = 8;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_VARIABLE_TYPE__LOCAL_ID = 9;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_VARIABLE_TYPE__NEGATED = 10;

	/**
	 * The feature id for the '<em><b>Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_VARIABLE_TYPE__STORAGE = 11;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_VARIABLE_TYPE__WIDTH = 12;

	/**
	 * The number of structural features of the '<em>Out Variable Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_VARIABLE_TYPE_FEATURE_COUNT = 13;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.PageSizeTypeImpl <em>Page Size Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.PageSizeTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getPageSizeType()
	 * @generated
	 */
	int PAGE_SIZE_TYPE = 69;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_SIZE_TYPE__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_SIZE_TYPE__Y = 1;

	/**
	 * The number of structural features of the '<em>Page Size Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_SIZE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.PointerTypeImpl <em>Pointer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.PointerTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getPointerType()
	 * @generated
	 */
	int POINTER_TYPE = 70;

	/**
	 * The feature id for the '<em><b>Base Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_TYPE__BASE_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Pointer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTER_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.PositionImpl <em>Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.PositionImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getPosition()
	 * @generated
	 */
	int POSITION = 71;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__Y = 1;

	/**
	 * The number of structural features of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.PouInstanceImpl <em>Pou Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.PouInstanceImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getPouInstance()
	 * @generated
	 */
	int POU_INSTANCE = 72;

	/**
	 * The feature id for the '<em><b>Add Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POU_INSTANCE__ADD_DATA = 0;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POU_INSTANCE__DOCUMENTATION = 1;

	/**
	 * The feature id for the '<em><b>Global Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POU_INSTANCE__GLOBAL_ID = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POU_INSTANCE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POU_INSTANCE__TYPE_NAME = 4;

	/**
	 * The number of structural features of the '<em>Pou Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POU_INSTANCE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.PousTypeImpl <em>Pous Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.PousTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getPousType()
	 * @generated
	 */
	int POUS_TYPE = 73;

	/**
	 * The feature id for the '<em><b>Pou</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POUS_TYPE__POU = 0;

	/**
	 * The number of structural features of the '<em>Pous Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POUS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.PouType1Impl <em>Pou Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.PouType1Impl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getPouType1()
	 * @generated
	 */
	int POU_TYPE1 = 74;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POU_TYPE1__INTERFACE = 0;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POU_TYPE1__ACTIONS = 1;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POU_TYPE1__TRANSITIONS = 2;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POU_TYPE1__BODY = 3;

	/**
	 * The feature id for the '<em><b>Add Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POU_TYPE1__ADD_DATA = 4;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POU_TYPE1__DOCUMENTATION = 5;

	/**
	 * The feature id for the '<em><b>Global Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POU_TYPE1__GLOBAL_ID = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POU_TYPE1__NAME = 7;

	/**
	 * The feature id for the '<em><b>Pou Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POU_TYPE1__POU_TYPE = 8;

	/**
	 * The number of structural features of the '<em>Pou Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POU_TYPE1_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.ProjectTypeImpl <em>Project Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.ProjectTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getProjectType()
	 * @generated
	 */
	int PROJECT_TYPE = 75;

	/**
	 * The feature id for the '<em><b>File Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__FILE_HEADER = 0;

	/**
	 * The feature id for the '<em><b>Content Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__CONTENT_HEADER = 1;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__TYPES = 2;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__INSTANCES = 3;

	/**
	 * The feature id for the '<em><b>Add Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__ADD_DATA = 4;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE__DOCUMENTATION = 5;

	/**
	 * The number of structural features of the '<em>Project Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.RangeSignedImpl <em>Range Signed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.RangeSignedImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getRangeSigned()
	 * @generated
	 */
	int RANGE_SIGNED = 76;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_SIGNED__LOWER = 0;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_SIGNED__UPPER = 1;

	/**
	 * The number of structural features of the '<em>Range Signed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_SIGNED_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.RangeUnsignedImpl <em>Range Unsigned</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.RangeUnsignedImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getRangeUnsigned()
	 * @generated
	 */
	int RANGE_UNSIGNED = 77;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_UNSIGNED__LOWER = 0;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_UNSIGNED__UPPER = 1;

	/**
	 * The number of structural features of the '<em>Range Unsigned</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_UNSIGNED_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.ReferenceTypeImpl <em>Reference Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.ReferenceTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getReferenceType()
	 * @generated
	 */
	int REFERENCE_TYPE = 78;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Reference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.ReferenceType1Impl <em>Reference Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.ReferenceType1Impl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getReferenceType1()
	 * @generated
	 */
	int REFERENCE_TYPE1 = 79;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE1__NAME = 0;

	/**
	 * The number of structural features of the '<em>Reference Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.ResourceTypeImpl <em>Resource Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.ResourceTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getResourceType()
	 * @generated
	 */
	int RESOURCE_TYPE = 80;

	/**
	 * The feature id for the '<em><b>Task</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__TASK = 0;

	/**
	 * The feature id for the '<em><b>Global Vars</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__GLOBAL_VARS = 1;

	/**
	 * The feature id for the '<em><b>Pou Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__POU_INSTANCE = 2;

	/**
	 * The feature id for the '<em><b>Add Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__ADD_DATA = 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__DOCUMENTATION = 4;

	/**
	 * The feature id for the '<em><b>Global Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__GLOBAL_ID = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE__NAME = 6;

	/**
	 * The number of structural features of the '<em>Resource Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_TYPE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.ReturnTypeImpl <em>Return Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.ReturnTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getReturnType()
	 * @generated
	 */
	int RETURN_TYPE = 81;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE__POSITION = 0;

	/**
	 * The feature id for the '<em><b>Connection Point In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE__CONNECTION_POINT_IN = 1;

	/**
	 * The feature id for the '<em><b>Add Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE__ADD_DATA = 2;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE__DOCUMENTATION = 3;

	/**
	 * The feature id for the '<em><b>Execution Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE__EXECUTION_ORDER_ID = 4;

	/**
	 * The feature id for the '<em><b>Global Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE__GLOBAL_ID = 5;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE__HEIGHT = 6;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE__LOCAL_ID = 7;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE__WIDTH = 8;

	/**
	 * The number of structural features of the '<em>Return Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.RightPowerRailTypeImpl <em>Right Power Rail Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.RightPowerRailTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getRightPowerRailType()
	 * @generated
	 */
	int RIGHT_POWER_RAIL_TYPE = 82;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_POWER_RAIL_TYPE__POSITION = 0;

	/**
	 * The feature id for the '<em><b>Connection Point In</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_POWER_RAIL_TYPE__CONNECTION_POINT_IN = 1;

	/**
	 * The feature id for the '<em><b>Add Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_POWER_RAIL_TYPE__ADD_DATA = 2;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_POWER_RAIL_TYPE__DOCUMENTATION = 3;

	/**
	 * The feature id for the '<em><b>Execution Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_POWER_RAIL_TYPE__EXECUTION_ORDER_ID = 4;

	/**
	 * The feature id for the '<em><b>Global Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_POWER_RAIL_TYPE__GLOBAL_ID = 5;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_POWER_RAIL_TYPE__HEIGHT = 6;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_POWER_RAIL_TYPE__LOCAL_ID = 7;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_POWER_RAIL_TYPE__WIDTH = 8;

	/**
	 * The number of structural features of the '<em>Right Power Rail Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_POWER_RAIL_TYPE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.ScalingTypeImpl <em>Scaling Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.ScalingTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getScalingType()
	 * @generated
	 */
	int SCALING_TYPE = 83;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_TYPE__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_TYPE__Y = 1;

	/**
	 * The number of structural features of the '<em>Scaling Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.ScalingType1Impl <em>Scaling Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.ScalingType1Impl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getScalingType1()
	 * @generated
	 */
	int SCALING_TYPE1 = 84;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_TYPE1__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_TYPE1__Y = 1;

	/**
	 * The number of structural features of the '<em>Scaling Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_TYPE1_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.ScalingType2Impl <em>Scaling Type2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.ScalingType2Impl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getScalingType2()
	 * @generated
	 */
	int SCALING_TYPE2 = 85;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_TYPE2__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_TYPE2__Y = 1;

	/**
	 * The number of structural features of the '<em>Scaling Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_TYPE2_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.SelectionConvergenceTypeImpl <em>Selection Convergence Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.SelectionConvergenceTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getSelectionConvergenceType()
	 * @generated
	 */
	int SELECTION_CONVERGENCE_TYPE = 86;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_CONVERGENCE_TYPE__POSITION = 0;

	/**
	 * The feature id for the '<em><b>Connection Point In</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_CONVERGENCE_TYPE__CONNECTION_POINT_IN = 1;

	/**
	 * The feature id for the '<em><b>Connection Point Out</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_CONVERGENCE_TYPE__CONNECTION_POINT_OUT = 2;

	/**
	 * The feature id for the '<em><b>Add Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_CONVERGENCE_TYPE__ADD_DATA = 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_CONVERGENCE_TYPE__DOCUMENTATION = 4;

	/**
	 * The feature id for the '<em><b>Global Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_CONVERGENCE_TYPE__GLOBAL_ID = 5;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_CONVERGENCE_TYPE__HEIGHT = 6;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_CONVERGENCE_TYPE__LOCAL_ID = 7;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_CONVERGENCE_TYPE__WIDTH = 8;

	/**
	 * The number of structural features of the '<em>Selection Convergence Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_CONVERGENCE_TYPE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.SelectionDivergenceTypeImpl <em>Selection Divergence Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.SelectionDivergenceTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getSelectionDivergenceType()
	 * @generated
	 */
	int SELECTION_DIVERGENCE_TYPE = 87;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_DIVERGENCE_TYPE__POSITION = 0;

	/**
	 * The feature id for the '<em><b>Connection Point In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_DIVERGENCE_TYPE__CONNECTION_POINT_IN = 1;

	/**
	 * The feature id for the '<em><b>Connection Point Out</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_DIVERGENCE_TYPE__CONNECTION_POINT_OUT = 2;

	/**
	 * The feature id for the '<em><b>Add Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_DIVERGENCE_TYPE__ADD_DATA = 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_DIVERGENCE_TYPE__DOCUMENTATION = 4;

	/**
	 * The feature id for the '<em><b>Global Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_DIVERGENCE_TYPE__GLOBAL_ID = 5;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_DIVERGENCE_TYPE__HEIGHT = 6;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_DIVERGENCE_TYPE__LOCAL_ID = 7;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_DIVERGENCE_TYPE__WIDTH = 8;

	/**
	 * The number of structural features of the '<em>Selection Divergence Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_DIVERGENCE_TYPE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.SfcTypeImpl <em>Sfc Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.SfcTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getSfcType()
	 * @generated
	 */
	int SFC_TYPE = 88;

	/**
	 * The feature id for the '<em><b>Scaling</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFC_TYPE__SCALING = 0;

	/**
	 * The number of structural features of the '<em>Sfc Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFC_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.SFCType1Impl <em>SFC Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.SFCType1Impl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getSFCType1()
	 * @generated
	 */
	int SFC_TYPE1 = 89;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFC_TYPE1__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFC_TYPE1__COMMENT = 1;

	/**
	 * The feature id for the '<em><b>Error</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFC_TYPE1__ERROR = 2;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFC_TYPE1__CONNECTOR = 3;

	/**
	 * The feature id for the '<em><b>Continuation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFC_TYPE1__CONTINUATION = 4;

	/**
	 * The feature id for the '<em><b>Action Block</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFC_TYPE1__ACTION_BLOCK = 5;

	/**
	 * The feature id for the '<em><b>Vendor Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFC_TYPE1__VENDOR_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFC_TYPE1__BLOCK = 7;

	/**
	 * The feature id for the '<em><b>In Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFC_TYPE1__IN_VARIABLE = 8;

	/**
	 * The feature id for the '<em><b>Out Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFC_TYPE1__OUT_VARIABLE = 9;

	/**
	 * The feature id for the '<em><b>In Out Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFC_TYPE1__IN_OUT_VARIABLE = 10;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFC_TYPE1__LABEL = 11;

	/**
	 * The feature id for the '<em><b>Jump</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFC_TYPE1__JUMP = 12;

	/**
	 * The feature id for the '<em><b>Return</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFC_TYPE1__RETURN = 13;

	/**
	 * The feature id for the '<em><b>Left Power Rail</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFC_TYPE1__LEFT_POWER_RAIL = 14;

	/**
	 * The feature id for the '<em><b>Right Power Rail</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFC_TYPE1__RIGHT_POWER_RAIL = 15;

	/**
	 * The feature id for the '<em><b>Coil</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFC_TYPE1__COIL = 16;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFC_TYPE1__CONTACT = 17;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFC_TYPE1__STEP = 18;

	/**
	 * The feature id for the '<em><b>Macro Step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFC_TYPE1__MACRO_STEP = 19;

	/**
	 * The feature id for the '<em><b>Jump Step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFC_TYPE1__JUMP_STEP = 20;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFC_TYPE1__TRANSITION = 21;

	/**
	 * The feature id for the '<em><b>Selection Divergence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFC_TYPE1__SELECTION_DIVERGENCE = 22;

	/**
	 * The feature id for the '<em><b>Selection Convergence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFC_TYPE1__SELECTION_CONVERGENCE = 23;

	/**
	 * The feature id for the '<em><b>Simultaneous Divergence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFC_TYPE1__SIMULTANEOUS_DIVERGENCE = 24;

	/**
	 * The feature id for the '<em><b>Simultaneous Convergence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFC_TYPE1__SIMULTANEOUS_CONVERGENCE = 25;

	/**
	 * The number of structural features of the '<em>SFC Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFC_TYPE1_FEATURE_COUNT = 26;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.SimpleValueTypeImpl <em>Simple Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.SimpleValueTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getSimpleValueType()
	 * @generated
	 */
	int SIMPLE_VALUE_TYPE = 90;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VALUE_TYPE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Simple Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VALUE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.SimultaneousConvergenceTypeImpl <em>Simultaneous Convergence Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.SimultaneousConvergenceTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getSimultaneousConvergenceType()
	 * @generated
	 */
	int SIMULTANEOUS_CONVERGENCE_TYPE = 91;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULTANEOUS_CONVERGENCE_TYPE__POSITION = 0;

	/**
	 * The feature id for the '<em><b>Connection Point In</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULTANEOUS_CONVERGENCE_TYPE__CONNECTION_POINT_IN = 1;

	/**
	 * The feature id for the '<em><b>Connection Point Out</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULTANEOUS_CONVERGENCE_TYPE__CONNECTION_POINT_OUT = 2;

	/**
	 * The feature id for the '<em><b>Add Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULTANEOUS_CONVERGENCE_TYPE__ADD_DATA = 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULTANEOUS_CONVERGENCE_TYPE__DOCUMENTATION = 4;

	/**
	 * The feature id for the '<em><b>Global Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULTANEOUS_CONVERGENCE_TYPE__GLOBAL_ID = 5;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULTANEOUS_CONVERGENCE_TYPE__HEIGHT = 6;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULTANEOUS_CONVERGENCE_TYPE__LOCAL_ID = 7;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULTANEOUS_CONVERGENCE_TYPE__WIDTH = 8;

	/**
	 * The number of structural features of the '<em>Simultaneous Convergence Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULTANEOUS_CONVERGENCE_TYPE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.SimultaneousDivergenceTypeImpl <em>Simultaneous Divergence Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.SimultaneousDivergenceTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getSimultaneousDivergenceType()
	 * @generated
	 */
	int SIMULTANEOUS_DIVERGENCE_TYPE = 92;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULTANEOUS_DIVERGENCE_TYPE__POSITION = 0;

	/**
	 * The feature id for the '<em><b>Connection Point In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULTANEOUS_DIVERGENCE_TYPE__CONNECTION_POINT_IN = 1;

	/**
	 * The feature id for the '<em><b>Connection Point Out</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULTANEOUS_DIVERGENCE_TYPE__CONNECTION_POINT_OUT = 2;

	/**
	 * The feature id for the '<em><b>Add Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULTANEOUS_DIVERGENCE_TYPE__ADD_DATA = 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULTANEOUS_DIVERGENCE_TYPE__DOCUMENTATION = 4;

	/**
	 * The feature id for the '<em><b>Global Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULTANEOUS_DIVERGENCE_TYPE__GLOBAL_ID = 5;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULTANEOUS_DIVERGENCE_TYPE__HEIGHT = 6;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULTANEOUS_DIVERGENCE_TYPE__LOCAL_ID = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULTANEOUS_DIVERGENCE_TYPE__NAME = 8;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULTANEOUS_DIVERGENCE_TYPE__WIDTH = 9;

	/**
	 * The number of structural features of the '<em>Simultaneous Divergence Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULTANEOUS_DIVERGENCE_TYPE_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.StepTypeImpl <em>Step Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.StepTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getStepType()
	 * @generated
	 */
	int STEP_TYPE = 93;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TYPE__POSITION = 0;

	/**
	 * The feature id for the '<em><b>Connection Point In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TYPE__CONNECTION_POINT_IN = 1;

	/**
	 * The feature id for the '<em><b>Connection Point Out</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TYPE__CONNECTION_POINT_OUT = 2;

	/**
	 * The feature id for the '<em><b>Connection Point Out Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TYPE__CONNECTION_POINT_OUT_ACTION = 3;

	/**
	 * The feature id for the '<em><b>Add Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TYPE__ADD_DATA = 4;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TYPE__DOCUMENTATION = 5;

	/**
	 * The feature id for the '<em><b>Execution Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TYPE__EXECUTION_ORDER_ID = 6;

	/**
	 * The feature id for the '<em><b>Global Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TYPE__GLOBAL_ID = 7;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TYPE__HEIGHT = 8;

	/**
	 * The feature id for the '<em><b>Initial Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TYPE__INITIAL_STEP = 9;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TYPE__LOCAL_ID = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TYPE__NAME = 11;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TYPE__NEGATED = 12;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TYPE__WIDTH = 13;

	/**
	 * The number of structural features of the '<em>Step Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TYPE_FEATURE_COUNT = 14;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.StringTypeImpl <em>String Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.StringTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getStringType()
	 * @generated
	 */
	int STRING_TYPE = 94;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__LENGTH = 0;

	/**
	 * The number of structural features of the '<em>String Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.StructValueTypeImpl <em>Struct Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.StructValueTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getStructValueType()
	 * @generated
	 */
	int STRUCT_VALUE_TYPE = 95;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_VALUE_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_VALUE_TYPE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Struct Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_VALUE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.SubrangeSignedTypeImpl <em>Subrange Signed Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.SubrangeSignedTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getSubrangeSignedType()
	 * @generated
	 */
	int SUBRANGE_SIGNED_TYPE = 96;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRANGE_SIGNED_TYPE__RANGE = 0;

	/**
	 * The feature id for the '<em><b>Base Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRANGE_SIGNED_TYPE__BASE_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Subrange Signed Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRANGE_SIGNED_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.SubrangeUnsignedTypeImpl <em>Subrange Unsigned Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.SubrangeUnsignedTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getSubrangeUnsignedType()
	 * @generated
	 */
	int SUBRANGE_UNSIGNED_TYPE = 97;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRANGE_UNSIGNED_TYPE__RANGE = 0;

	/**
	 * The feature id for the '<em><b>Base Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRANGE_UNSIGNED_TYPE__BASE_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Subrange Unsigned Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRANGE_UNSIGNED_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.TaskTypeImpl <em>Task Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.TaskTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getTaskType()
	 * @generated
	 */
	int TASK_TYPE = 98;

	/**
	 * The feature id for the '<em><b>Pou Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__POU_INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Add Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__ADD_DATA = 1;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__DOCUMENTATION = 2;

	/**
	 * The feature id for the '<em><b>Global Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__GLOBAL_ID = 3;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__INTERVAL = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__NAME = 5;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__PRIORITY = 6;

	/**
	 * The feature id for the '<em><b>Single</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE__SINGLE = 7;

	/**
	 * The number of structural features of the '<em>Task Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.TempVarsTypeImpl <em>Temp Vars Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.TempVarsTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getTempVarsType()
	 * @generated
	 */
	int TEMP_VARS_TYPE = 99;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMP_VARS_TYPE__VARIABLE = VAR_LIST__VARIABLE;

	/**
	 * The feature id for the '<em><b>Add Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMP_VARS_TYPE__ADD_DATA = VAR_LIST__ADD_DATA;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMP_VARS_TYPE__DOCUMENTATION = VAR_LIST__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMP_VARS_TYPE__CONSTANT = VAR_LIST__CONSTANT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMP_VARS_TYPE__NAME = VAR_LIST__NAME;

	/**
	 * The feature id for the '<em><b>Nonpersistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMP_VARS_TYPE__NONPERSISTENT = VAR_LIST__NONPERSISTENT;

	/**
	 * The feature id for the '<em><b>Nonretain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMP_VARS_TYPE__NONRETAIN = VAR_LIST__NONRETAIN;

	/**
	 * The feature id for the '<em><b>Persistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMP_VARS_TYPE__PERSISTENT = VAR_LIST__PERSISTENT;

	/**
	 * The feature id for the '<em><b>Retain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMP_VARS_TYPE__RETAIN = VAR_LIST__RETAIN;

	/**
	 * The number of structural features of the '<em>Temp Vars Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMP_VARS_TYPE_FEATURE_COUNT = VAR_LIST_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.TransitionsTypeImpl <em>Transitions Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.TransitionsTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getTransitionsType()
	 * @generated
	 */
	int TRANSITIONS_TYPE = 100;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITIONS_TYPE__TRANSITION = 0;

	/**
	 * The number of structural features of the '<em>Transitions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITIONS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.TransitionTypeImpl <em>Transition Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.TransitionTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getTransitionType()
	 * @generated
	 */
	int TRANSITION_TYPE = 101;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__BODY = 0;

	/**
	 * The feature id for the '<em><b>Add Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__ADD_DATA = 1;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__DOCUMENTATION = 2;

	/**
	 * The feature id for the '<em><b>Global Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__GLOBAL_ID = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE__NAME = 4;

	/**
	 * The number of structural features of the '<em>Transition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.TransitionType1Impl <em>Transition Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.TransitionType1Impl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getTransitionType1()
	 * @generated
	 */
	int TRANSITION_TYPE1 = 102;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE1__POSITION = 0;

	/**
	 * The feature id for the '<em><b>Connection Point In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE1__CONNECTION_POINT_IN = 1;

	/**
	 * The feature id for the '<em><b>Connection Point Out</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE1__CONNECTION_POINT_OUT = 2;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE1__CONDITION = 3;

	/**
	 * The feature id for the '<em><b>Add Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE1__ADD_DATA = 4;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE1__DOCUMENTATION = 5;

	/**
	 * The feature id for the '<em><b>Execution Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE1__EXECUTION_ORDER_ID = 6;

	/**
	 * The feature id for the '<em><b>Global Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE1__GLOBAL_ID = 7;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE1__HEIGHT = 8;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE1__LOCAL_ID = 9;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE1__PRIORITY = 10;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE1__WIDTH = 11;

	/**
	 * The number of structural features of the '<em>Transition Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TYPE1_FEATURE_COUNT = 12;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.TypesTypeImpl <em>Types Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.TypesTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getTypesType()
	 * @generated
	 */
	int TYPES_TYPE = 103;

	/**
	 * The feature id for the '<em><b>Data Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_TYPE__DATA_TYPES = 0;

	/**
	 * The feature id for the '<em><b>Pous</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_TYPE__POUS = 1;

	/**
	 * The number of structural features of the '<em>Types Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.ValueImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 104;

	/**
	 * The feature id for the '<em><b>Simple Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__SIMPLE_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Array Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__ARRAY_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Struct Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__STRUCT_VALUE = 2;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.ValuesTypeImpl <em>Values Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.ValuesTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getValuesType()
	 * @generated
	 */
	int VALUES_TYPE = 105;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Values Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.ValueTypeImpl <em>Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.ValueTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getValueType()
	 * @generated
	 */
	int VALUE_TYPE = 106;

	/**
	 * The feature id for the '<em><b>Simple Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__SIMPLE_VALUE = VALUE__SIMPLE_VALUE;

	/**
	 * The feature id for the '<em><b>Array Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__ARRAY_VALUE = VALUE__ARRAY_VALUE;

	/**
	 * The feature id for the '<em><b>Struct Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__STRUCT_VALUE = VALUE__STRUCT_VALUE;

	/**
	 * The feature id for the '<em><b>Member</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__MEMBER = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.ValueType1Impl <em>Value Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.ValueType1Impl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getValueType1()
	 * @generated
	 */
	int VALUE_TYPE1 = 107;

	/**
	 * The feature id for the '<em><b>Simple Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE1__SIMPLE_VALUE = VALUE__SIMPLE_VALUE;

	/**
	 * The feature id for the '<em><b>Array Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE1__ARRAY_VALUE = VALUE__ARRAY_VALUE;

	/**
	 * The feature id for the '<em><b>Struct Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE1__STRUCT_VALUE = VALUE__STRUCT_VALUE;

	/**
	 * The feature id for the '<em><b>Repetition Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE1__REPETITION_VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Value Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE1_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.ValueType2Impl <em>Value Type2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.ValueType2Impl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getValueType2()
	 * @generated
	 */
	int VALUE_TYPE2 = 108;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE2__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE2__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Value Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE2_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.VariableTypeImpl <em>Variable Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.VariableTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getVariableType()
	 * @generated
	 */
	int VARIABLE_TYPE = 109;

	/**
	 * The feature id for the '<em><b>Connection Point In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE__CONNECTION_POINT_IN = 0;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE__DOCUMENTATION = 1;

	/**
	 * The feature id for the '<em><b>Edge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE__EDGE = 2;

	/**
	 * The feature id for the '<em><b>Formal Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE__FORMAL_PARAMETER = 3;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE__HIDDEN = 4;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE__NEGATED = 5;

	/**
	 * The feature id for the '<em><b>Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE__STORAGE = 6;

	/**
	 * The number of structural features of the '<em>Variable Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.VariableType1Impl <em>Variable Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.VariableType1Impl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getVariableType1()
	 * @generated
	 */
	int VARIABLE_TYPE1 = 110;

	/**
	 * The feature id for the '<em><b>Connection Point Out</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE1__CONNECTION_POINT_OUT = 0;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE1__DOCUMENTATION = 1;

	/**
	 * The feature id for the '<em><b>Edge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE1__EDGE = 2;

	/**
	 * The feature id for the '<em><b>Formal Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE1__FORMAL_PARAMETER = 3;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE1__HIDDEN = 4;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE1__NEGATED = 5;

	/**
	 * The feature id for the '<em><b>Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE1__STORAGE = 6;

	/**
	 * The number of structural features of the '<em>Variable Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE1_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.VariableType2Impl <em>Variable Type2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.VariableType2Impl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getVariableType2()
	 * @generated
	 */
	int VARIABLE_TYPE2 = 111;

	/**
	 * The feature id for the '<em><b>Connection Point In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE2__CONNECTION_POINT_IN = 0;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE2__DOCUMENTATION = 1;

	/**
	 * The feature id for the '<em><b>Edge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE2__EDGE = 2;

	/**
	 * The feature id for the '<em><b>Formal Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE2__FORMAL_PARAMETER = 3;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE2__HIDDEN = 4;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE2__NEGATED = 5;

	/**
	 * The feature id for the '<em><b>Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE2__STORAGE = 6;

	/**
	 * The number of structural features of the '<em>Variable Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE2_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.VariableType3Impl <em>Variable Type3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.VariableType3Impl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getVariableType3()
	 * @generated
	 */
	int VARIABLE_TYPE3 = 112;

	/**
	 * The feature id for the '<em><b>Connection Point In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE3__CONNECTION_POINT_IN = 0;

	/**
	 * The feature id for the '<em><b>Connection Point Out</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE3__CONNECTION_POINT_OUT = 1;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE3__DOCUMENTATION = 2;

	/**
	 * The feature id for the '<em><b>Edge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE3__EDGE = 3;

	/**
	 * The feature id for the '<em><b>Formal Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE3__FORMAL_PARAMETER = 4;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE3__HIDDEN = 5;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE3__NEGATED = 6;

	/**
	 * The feature id for the '<em><b>Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE3__STORAGE = 7;

	/**
	 * The number of structural features of the '<em>Variable Type3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE3_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.VariableType4Impl <em>Variable Type4</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.VariableType4Impl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getVariableType4()
	 * @generated
	 */
	int VARIABLE_TYPE4 = 113;

	/**
	 * The feature id for the '<em><b>Connection Point Out</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE4__CONNECTION_POINT_OUT = 0;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE4__DOCUMENTATION = 1;

	/**
	 * The feature id for the '<em><b>Edge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE4__EDGE = 2;

	/**
	 * The feature id for the '<em><b>Formal Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE4__FORMAL_PARAMETER = 3;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE4__HIDDEN = 4;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE4__NEGATED = 5;

	/**
	 * The feature id for the '<em><b>Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE4__STORAGE = 6;

	/**
	 * The number of structural features of the '<em>Variable Type4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE4_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.VariableType5Impl <em>Variable Type5</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.VariableType5Impl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getVariableType5()
	 * @generated
	 */
	int VARIABLE_TYPE5 = 114;

	/**
	 * The feature id for the '<em><b>Connection Point In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE5__CONNECTION_POINT_IN = 0;

	/**
	 * The feature id for the '<em><b>Connection Point Out</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE5__CONNECTION_POINT_OUT = 1;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE5__DOCUMENTATION = 2;

	/**
	 * The feature id for the '<em><b>Edge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE5__EDGE = 3;

	/**
	 * The feature id for the '<em><b>Formal Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE5__FORMAL_PARAMETER = 4;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE5__HIDDEN = 5;

	/**
	 * The feature id for the '<em><b>Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE5__NEGATED = 6;

	/**
	 * The feature id for the '<em><b>Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE5__STORAGE = 7;

	/**
	 * The number of structural features of the '<em>Variable Type5</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE5_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.VariableType6Impl <em>Variable Type6</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.VariableType6Impl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getVariableType6()
	 * @generated
	 */
	int VARIABLE_TYPE6 = 115;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE6__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE6__INITIAL_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Add Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE6__ADD_DATA = 2;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE6__DOCUMENTATION = 3;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE6__ADDRESS = 4;

	/**
	 * The feature id for the '<em><b>Global Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE6__GLOBAL_ID = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE6__NAME = 6;

	/**
	 * The number of structural features of the '<em>Variable Type6</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE6_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.VarListAccessImpl <em>Var List Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.VarListAccessImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getVarListAccess()
	 * @generated
	 */
	int VAR_LIST_ACCESS = 117;

	/**
	 * The feature id for the '<em><b>Access Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_LIST_ACCESS__ACCESS_VARIABLE = 0;

	/**
	 * The feature id for the '<em><b>Add Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_LIST_ACCESS__ADD_DATA = 1;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_LIST_ACCESS__DOCUMENTATION = 2;

	/**
	 * The number of structural features of the '<em>Var List Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_LIST_ACCESS_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.VarListConfigImpl <em>Var List Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.VarListConfigImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getVarListConfig()
	 * @generated
	 */
	int VAR_LIST_CONFIG = 118;

	/**
	 * The feature id for the '<em><b>Config Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_LIST_CONFIG__CONFIG_VARIABLE = 0;

	/**
	 * The feature id for the '<em><b>Add Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_LIST_CONFIG__ADD_DATA = 1;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_LIST_CONFIG__DOCUMENTATION = 2;

	/**
	 * The number of structural features of the '<em>Var List Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_LIST_CONFIG_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.VendorElementTypeImpl <em>Vendor Element Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.VendorElementTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getVendorElementType()
	 * @generated
	 */
	int VENDOR_ELEMENT_TYPE = 120;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_ELEMENT_TYPE__POSITION = 0;

	/**
	 * The feature id for the '<em><b>Alternative Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_ELEMENT_TYPE__ALTERNATIVE_TEXT = 1;

	/**
	 * The feature id for the '<em><b>Input Variables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_ELEMENT_TYPE__INPUT_VARIABLES = 2;

	/**
	 * The feature id for the '<em><b>In Out Variables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_ELEMENT_TYPE__IN_OUT_VARIABLES = 3;

	/**
	 * The feature id for the '<em><b>Output Variables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_ELEMENT_TYPE__OUTPUT_VARIABLES = 4;

	/**
	 * The feature id for the '<em><b>Add Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_ELEMENT_TYPE__ADD_DATA = 5;

	/**
	 * The feature id for the '<em><b>Execution Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_ELEMENT_TYPE__EXECUTION_ORDER_ID = 6;

	/**
	 * The feature id for the '<em><b>Global Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_ELEMENT_TYPE__GLOBAL_ID = 7;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_ELEMENT_TYPE__HEIGHT = 8;

	/**
	 * The feature id for the '<em><b>Local Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_ELEMENT_TYPE__LOCAL_ID = 9;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_ELEMENT_TYPE__WIDTH = 10;

	/**
	 * The number of structural features of the '<em>Vendor Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENDOR_ELEMENT_TYPE_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.impl.WstringTypeImpl <em>Wstring Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.impl.WstringTypeImpl
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getWstringType()
	 * @generated
	 */
	int WSTRING_TYPE = 121;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSTRING_TYPE__LENGTH = 0;

	/**
	 * The number of structural features of the '<em>Wstring Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSTRING_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.AccessType <em>Access Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.AccessType
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getAccessType()
	 * @generated
	 */
	int ACCESS_TYPE = 122;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.EdgeModifierType <em>Edge Modifier Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.EdgeModifierType
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getEdgeModifierType()
	 * @generated
	 */
	int EDGE_MODIFIER_TYPE = 123;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.HandleUnknownType <em>Handle Unknown Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.HandleUnknownType
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getHandleUnknownType()
	 * @generated
	 */
	int HANDLE_UNKNOWN_TYPE = 124;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.PouType <em>Pou Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.PouType
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getPouType()
	 * @generated
	 */
	int POU_TYPE = 125;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.QualifierType <em>Qualifier Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.QualifierType
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getQualifierType()
	 * @generated
	 */
	int QUALIFIER_TYPE = 126;

	/**
	 * The meta object id for the '{@link org.plcopen.xml.tc60201.StorageModifierType <em>Storage Modifier Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.StorageModifierType
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getStorageModifierType()
	 * @generated
	 */
	int STORAGE_MODIFIER_TYPE = 127;

	/**
	 * The meta object id for the '<em>Access Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.AccessType
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getAccessTypeObject()
	 * @generated
	 */
	int ACCESS_TYPE_OBJECT = 128;

	/**
	 * The meta object id for the '<em>Edge Modifier Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.EdgeModifierType
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getEdgeModifierTypeObject()
	 * @generated
	 */
	int EDGE_MODIFIER_TYPE_OBJECT = 129;

	/**
	 * The meta object id for the '<em>Handle Unknown Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.HandleUnknownType
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getHandleUnknownTypeObject()
	 * @generated
	 */
	int HANDLE_UNKNOWN_TYPE_OBJECT = 130;

	/**
	 * The meta object id for the '<em>Pou Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.PouType
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getPouTypeObject()
	 * @generated
	 */
	int POU_TYPE_OBJECT = 131;

	/**
	 * The meta object id for the '<em>Priority Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getPriorityType()
	 * @generated
	 */
	int PRIORITY_TYPE = 132;

	/**
	 * The meta object id for the '<em>Qualifier Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.QualifierType
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getQualifierTypeObject()
	 * @generated
	 */
	int QUALIFIER_TYPE_OBJECT = 133;

	/**
	 * The meta object id for the '<em>Storage Modifier Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.plcopen.xml.tc60201.StorageModifierType
	 * @see org.plcopen.xml.tc60201.impl.Tc60201PackageImpl#getStorageModifierTypeObject()
	 * @generated
	 */
	int STORAGE_MODIFIER_TYPE_OBJECT = 134;


	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.AccessVariableType <em>Access Variable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Variable Type</em>'.
	 * @see org.plcopen.xml.tc60201.AccessVariableType
	 * @generated
	 */
	EClass getAccessVariableType();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.AccessVariableType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.plcopen.xml.tc60201.AccessVariableType#getType()
	 * @see #getAccessVariableType()
	 * @generated
	 */
	EReference getAccessVariableType_Type();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.AccessVariableType#getAddData <em>Add Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Data</em>'.
	 * @see org.plcopen.xml.tc60201.AccessVariableType#getAddData()
	 * @see #getAccessVariableType()
	 * @generated
	 */
	EReference getAccessVariableType_AddData();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.AccessVariableType#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see org.plcopen.xml.tc60201.AccessVariableType#getDocumentation()
	 * @see #getAccessVariableType()
	 * @generated
	 */
	EReference getAccessVariableType_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.AccessVariableType#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see org.plcopen.xml.tc60201.AccessVariableType#getAlias()
	 * @see #getAccessVariableType()
	 * @generated
	 */
	EAttribute getAccessVariableType_Alias();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.AccessVariableType#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.plcopen.xml.tc60201.AccessVariableType#getDirection()
	 * @see #getAccessVariableType()
	 * @generated
	 */
	EAttribute getAccessVariableType_Direction();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.AccessVariableType#getInstancePathAndName <em>Instance Path And Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Path And Name</em>'.
	 * @see org.plcopen.xml.tc60201.AccessVariableType#getInstancePathAndName()
	 * @see #getAccessVariableType()
	 * @generated
	 */
	EAttribute getAccessVariableType_InstancePathAndName();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.ActionBlockType <em>Action Block Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Block Type</em>'.
	 * @see org.plcopen.xml.tc60201.ActionBlockType
	 * @generated
	 */
	EClass getActionBlockType();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.ActionBlockType#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see org.plcopen.xml.tc60201.ActionBlockType#getPosition()
	 * @see #getActionBlockType()
	 * @generated
	 */
	EReference getActionBlockType_Position();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.ActionBlockType#getConnectionPointIn <em>Connection Point In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connection Point In</em>'.
	 * @see org.plcopen.xml.tc60201.ActionBlockType#getConnectionPointIn()
	 * @see #getActionBlockType()
	 * @generated
	 */
	EReference getActionBlockType_ConnectionPointIn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.ActionBlockType#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action</em>'.
	 * @see org.plcopen.xml.tc60201.ActionBlockType#getAction()
	 * @see #getActionBlockType()
	 * @generated
	 */
	EReference getActionBlockType_Action();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.ActionBlockType#getAddData <em>Add Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Data</em>'.
	 * @see org.plcopen.xml.tc60201.ActionBlockType#getAddData()
	 * @see #getActionBlockType()
	 * @generated
	 */
	EReference getActionBlockType_AddData();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.ActionBlockType#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see org.plcopen.xml.tc60201.ActionBlockType#getDocumentation()
	 * @see #getActionBlockType()
	 * @generated
	 */
	EReference getActionBlockType_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ActionBlockType#getExecutionOrderId <em>Execution Order Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Order Id</em>'.
	 * @see org.plcopen.xml.tc60201.ActionBlockType#getExecutionOrderId()
	 * @see #getActionBlockType()
	 * @generated
	 */
	EAttribute getActionBlockType_ExecutionOrderId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ActionBlockType#getGlobalId <em>Global Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Global Id</em>'.
	 * @see org.plcopen.xml.tc60201.ActionBlockType#getGlobalId()
	 * @see #getActionBlockType()
	 * @generated
	 */
	EAttribute getActionBlockType_GlobalId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ActionBlockType#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.plcopen.xml.tc60201.ActionBlockType#getHeight()
	 * @see #getActionBlockType()
	 * @generated
	 */
	EAttribute getActionBlockType_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ActionBlockType#getLocalId <em>Local Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Id</em>'.
	 * @see org.plcopen.xml.tc60201.ActionBlockType#getLocalId()
	 * @see #getActionBlockType()
	 * @generated
	 */
	EAttribute getActionBlockType_LocalId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ActionBlockType#isNegated <em>Negated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Negated</em>'.
	 * @see org.plcopen.xml.tc60201.ActionBlockType#isNegated()
	 * @see #getActionBlockType()
	 * @generated
	 */
	EAttribute getActionBlockType_Negated();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ActionBlockType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.plcopen.xml.tc60201.ActionBlockType#getWidth()
	 * @see #getActionBlockType()
	 * @generated
	 */
	EAttribute getActionBlockType_Width();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.ActionsType <em>Actions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actions Type</em>'.
	 * @see org.plcopen.xml.tc60201.ActionsType
	 * @generated
	 */
	EClass getActionsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.ActionsType#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action</em>'.
	 * @see org.plcopen.xml.tc60201.ActionsType#getAction()
	 * @see #getActionsType()
	 * @generated
	 */
	EReference getActionsType_Action();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.ActionType <em>Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Type</em>'.
	 * @see org.plcopen.xml.tc60201.ActionType
	 * @generated
	 */
	EClass getActionType();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.ActionType#getRelPosition <em>Rel Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rel Position</em>'.
	 * @see org.plcopen.xml.tc60201.ActionType#getRelPosition()
	 * @see #getActionType()
	 * @generated
	 */
	EReference getActionType_RelPosition();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.ActionType#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference</em>'.
	 * @see org.plcopen.xml.tc60201.ActionType#getReference()
	 * @see #getActionType()
	 * @generated
	 */
	EReference getActionType_Reference();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.ActionType#getInline <em>Inline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inline</em>'.
	 * @see org.plcopen.xml.tc60201.ActionType#getInline()
	 * @see #getActionType()
	 * @generated
	 */
	EReference getActionType_Inline();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.ActionType#getConnectionPointOut <em>Connection Point Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connection Point Out</em>'.
	 * @see org.plcopen.xml.tc60201.ActionType#getConnectionPointOut()
	 * @see #getActionType()
	 * @generated
	 */
	EReference getActionType_ConnectionPointOut();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.ActionType#getAddData <em>Add Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Data</em>'.
	 * @see org.plcopen.xml.tc60201.ActionType#getAddData()
	 * @see #getActionType()
	 * @generated
	 */
	EReference getActionType_AddData();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.ActionType#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see org.plcopen.xml.tc60201.ActionType#getDocumentation()
	 * @see #getActionType()
	 * @generated
	 */
	EReference getActionType_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ActionType#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see org.plcopen.xml.tc60201.ActionType#getDuration()
	 * @see #getActionType()
	 * @generated
	 */
	EAttribute getActionType_Duration();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ActionType#getExecutionOrderId <em>Execution Order Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Order Id</em>'.
	 * @see org.plcopen.xml.tc60201.ActionType#getExecutionOrderId()
	 * @see #getActionType()
	 * @generated
	 */
	EAttribute getActionType_ExecutionOrderId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ActionType#getGlobalId <em>Global Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Global Id</em>'.
	 * @see org.plcopen.xml.tc60201.ActionType#getGlobalId()
	 * @see #getActionType()
	 * @generated
	 */
	EAttribute getActionType_GlobalId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ActionType#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.plcopen.xml.tc60201.ActionType#getHeight()
	 * @see #getActionType()
	 * @generated
	 */
	EAttribute getActionType_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ActionType#getIndicator <em>Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indicator</em>'.
	 * @see org.plcopen.xml.tc60201.ActionType#getIndicator()
	 * @see #getActionType()
	 * @generated
	 */
	EAttribute getActionType_Indicator();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ActionType#getLocalId <em>Local Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Id</em>'.
	 * @see org.plcopen.xml.tc60201.ActionType#getLocalId()
	 * @see #getActionType()
	 * @generated
	 */
	EAttribute getActionType_LocalId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ActionType#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualifier</em>'.
	 * @see org.plcopen.xml.tc60201.ActionType#getQualifier()
	 * @see #getActionType()
	 * @generated
	 */
	EAttribute getActionType_Qualifier();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ActionType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.plcopen.xml.tc60201.ActionType#getWidth()
	 * @see #getActionType()
	 * @generated
	 */
	EAttribute getActionType_Width();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.ActionType1 <em>Action Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Type1</em>'.
	 * @see org.plcopen.xml.tc60201.ActionType1
	 * @generated
	 */
	EClass getActionType1();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.ActionType1#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.plcopen.xml.tc60201.ActionType1#getBody()
	 * @see #getActionType1()
	 * @generated
	 */
	EReference getActionType1_Body();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.ActionType1#getAddData <em>Add Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Data</em>'.
	 * @see org.plcopen.xml.tc60201.ActionType1#getAddData()
	 * @see #getActionType1()
	 * @generated
	 */
	EReference getActionType1_AddData();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.ActionType1#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see org.plcopen.xml.tc60201.ActionType1#getDocumentation()
	 * @see #getActionType1()
	 * @generated
	 */
	EReference getActionType1_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ActionType1#getGlobalId <em>Global Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Global Id</em>'.
	 * @see org.plcopen.xml.tc60201.ActionType1#getGlobalId()
	 * @see #getActionType1()
	 * @generated
	 */
	EAttribute getActionType1_GlobalId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ActionType1#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.plcopen.xml.tc60201.ActionType1#getName()
	 * @see #getActionType1()
	 * @generated
	 */
	EAttribute getActionType1_Name();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.AddData <em>Add Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Data</em>'.
	 * @see org.plcopen.xml.tc60201.AddData
	 * @generated
	 */
	EClass getAddData();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.AddData#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see org.plcopen.xml.tc60201.AddData#getData()
	 * @see #getAddData()
	 * @generated
	 */
	EReference getAddData_Data();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.AddDataInfo <em>Add Data Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Data Info</em>'.
	 * @see org.plcopen.xml.tc60201.AddDataInfo
	 * @generated
	 */
	EClass getAddDataInfo();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.AddDataInfo#getInfo <em>Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Info</em>'.
	 * @see org.plcopen.xml.tc60201.AddDataInfo#getInfo()
	 * @see #getAddDataInfo()
	 * @generated
	 */
	EReference getAddDataInfo_Info();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.ArrayType <em>Array Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Type</em>'.
	 * @see org.plcopen.xml.tc60201.ArrayType
	 * @generated
	 */
	EClass getArrayType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.ArrayType#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dimension</em>'.
	 * @see org.plcopen.xml.tc60201.ArrayType#getDimension()
	 * @see #getArrayType()
	 * @generated
	 */
	EReference getArrayType_Dimension();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.ArrayType#getBaseType <em>Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Base Type</em>'.
	 * @see org.plcopen.xml.tc60201.ArrayType#getBaseType()
	 * @see #getArrayType()
	 * @generated
	 */
	EReference getArrayType_BaseType();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.ArrayValueType <em>Array Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Value Type</em>'.
	 * @see org.plcopen.xml.tc60201.ArrayValueType
	 * @generated
	 */
	EClass getArrayValueType();

	/**
	 * Returns the meta object for the attribute list '{@link org.plcopen.xml.tc60201.ArrayValueType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.plcopen.xml.tc60201.ArrayValueType#getGroup()
	 * @see #getArrayValueType()
	 * @generated
	 */
	EAttribute getArrayValueType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.ArrayValueType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see org.plcopen.xml.tc60201.ArrayValueType#getValue()
	 * @see #getArrayValueType()
	 * @generated
	 */
	EReference getArrayValueType_Value();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.BlockType <em>Block Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Type</em>'.
	 * @see org.plcopen.xml.tc60201.BlockType
	 * @generated
	 */
	EClass getBlockType();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.BlockType#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see org.plcopen.xml.tc60201.BlockType#getPosition()
	 * @see #getBlockType()
	 * @generated
	 */
	EReference getBlockType_Position();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.BlockType#getInputVariables <em>Input Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Variables</em>'.
	 * @see org.plcopen.xml.tc60201.BlockType#getInputVariables()
	 * @see #getBlockType()
	 * @generated
	 */
	EReference getBlockType_InputVariables();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.BlockType#getInOutVariables <em>In Out Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>In Out Variables</em>'.
	 * @see org.plcopen.xml.tc60201.BlockType#getInOutVariables()
	 * @see #getBlockType()
	 * @generated
	 */
	EReference getBlockType_InOutVariables();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.BlockType#getOutputVariables <em>Output Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Variables</em>'.
	 * @see org.plcopen.xml.tc60201.BlockType#getOutputVariables()
	 * @see #getBlockType()
	 * @generated
	 */
	EReference getBlockType_OutputVariables();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.BlockType#getAddData <em>Add Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Data</em>'.
	 * @see org.plcopen.xml.tc60201.BlockType#getAddData()
	 * @see #getBlockType()
	 * @generated
	 */
	EReference getBlockType_AddData();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.BlockType#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see org.plcopen.xml.tc60201.BlockType#getDocumentation()
	 * @see #getBlockType()
	 * @generated
	 */
	EReference getBlockType_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.BlockType#getExecutionOrderId <em>Execution Order Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Order Id</em>'.
	 * @see org.plcopen.xml.tc60201.BlockType#getExecutionOrderId()
	 * @see #getBlockType()
	 * @generated
	 */
	EAttribute getBlockType_ExecutionOrderId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.BlockType#getGlobalId <em>Global Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Global Id</em>'.
	 * @see org.plcopen.xml.tc60201.BlockType#getGlobalId()
	 * @see #getBlockType()
	 * @generated
	 */
	EAttribute getBlockType_GlobalId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.BlockType#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.plcopen.xml.tc60201.BlockType#getHeight()
	 * @see #getBlockType()
	 * @generated
	 */
	EAttribute getBlockType_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.BlockType#getInstanceName <em>Instance Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Name</em>'.
	 * @see org.plcopen.xml.tc60201.BlockType#getInstanceName()
	 * @see #getBlockType()
	 * @generated
	 */
	EAttribute getBlockType_InstanceName();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.BlockType#getLocalId <em>Local Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Id</em>'.
	 * @see org.plcopen.xml.tc60201.BlockType#getLocalId()
	 * @see #getBlockType()
	 * @generated
	 */
	EAttribute getBlockType_LocalId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.BlockType#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see org.plcopen.xml.tc60201.BlockType#getTypeName()
	 * @see #getBlockType()
	 * @generated
	 */
	EAttribute getBlockType_TypeName();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.BlockType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.plcopen.xml.tc60201.BlockType#getWidth()
	 * @see #getBlockType()
	 * @generated
	 */
	EAttribute getBlockType_Width();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.Body <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Body</em>'.
	 * @see org.plcopen.xml.tc60201.Body
	 * @generated
	 */
	EClass getBody();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.Body#getIL <em>IL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IL</em>'.
	 * @see org.plcopen.xml.tc60201.Body#getIL()
	 * @see #getBody()
	 * @generated
	 */
	EReference getBody_IL();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.Body#getST <em>ST</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ST</em>'.
	 * @see org.plcopen.xml.tc60201.Body#getST()
	 * @see #getBody()
	 * @generated
	 */
	EReference getBody_ST();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.Body#getFBD <em>FBD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>FBD</em>'.
	 * @see org.plcopen.xml.tc60201.Body#getFBD()
	 * @see #getBody()
	 * @generated
	 */
	EReference getBody_FBD();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.Body#getLD <em>LD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>LD</em>'.
	 * @see org.plcopen.xml.tc60201.Body#getLD()
	 * @see #getBody()
	 * @generated
	 */
	EReference getBody_LD();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.Body#getSFC <em>SFC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SFC</em>'.
	 * @see org.plcopen.xml.tc60201.Body#getSFC()
	 * @see #getBody()
	 * @generated
	 */
	EReference getBody_SFC();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.Body#getAddData <em>Add Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Data</em>'.
	 * @see org.plcopen.xml.tc60201.Body#getAddData()
	 * @see #getBody()
	 * @generated
	 */
	EReference getBody_AddData();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.Body#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see org.plcopen.xml.tc60201.Body#getDocumentation()
	 * @see #getBody()
	 * @generated
	 */
	EReference getBody_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.Body#getGlobalId <em>Global Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Global Id</em>'.
	 * @see org.plcopen.xml.tc60201.Body#getGlobalId()
	 * @see #getBody()
	 * @generated
	 */
	EAttribute getBody_GlobalId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.Body#getWorksheetName <em>Worksheet Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Worksheet Name</em>'.
	 * @see org.plcopen.xml.tc60201.Body#getWorksheetName()
	 * @see #getBody()
	 * @generated
	 */
	EAttribute getBody_WorksheetName();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.CoilType <em>Coil Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coil Type</em>'.
	 * @see org.plcopen.xml.tc60201.CoilType
	 * @generated
	 */
	EClass getCoilType();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.CoilType#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see org.plcopen.xml.tc60201.CoilType#getPosition()
	 * @see #getCoilType()
	 * @generated
	 */
	EReference getCoilType_Position();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.CoilType#getConnectionPointIn <em>Connection Point In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connection Point In</em>'.
	 * @see org.plcopen.xml.tc60201.CoilType#getConnectionPointIn()
	 * @see #getCoilType()
	 * @generated
	 */
	EReference getCoilType_ConnectionPointIn();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.CoilType#getConnectionPointOut <em>Connection Point Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connection Point Out</em>'.
	 * @see org.plcopen.xml.tc60201.CoilType#getConnectionPointOut()
	 * @see #getCoilType()
	 * @generated
	 */
	EReference getCoilType_ConnectionPointOut();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.CoilType#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see org.plcopen.xml.tc60201.CoilType#getVariable()
	 * @see #getCoilType()
	 * @generated
	 */
	EAttribute getCoilType_Variable();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.CoilType#getAddData <em>Add Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Data</em>'.
	 * @see org.plcopen.xml.tc60201.CoilType#getAddData()
	 * @see #getCoilType()
	 * @generated
	 */
	EReference getCoilType_AddData();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.CoilType#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see org.plcopen.xml.tc60201.CoilType#getDocumentation()
	 * @see #getCoilType()
	 * @generated
	 */
	EReference getCoilType_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.CoilType#getEdge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edge</em>'.
	 * @see org.plcopen.xml.tc60201.CoilType#getEdge()
	 * @see #getCoilType()
	 * @generated
	 */
	EAttribute getCoilType_Edge();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.CoilType#getExecutionOrderId <em>Execution Order Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Order Id</em>'.
	 * @see org.plcopen.xml.tc60201.CoilType#getExecutionOrderId()
	 * @see #getCoilType()
	 * @generated
	 */
	EAttribute getCoilType_ExecutionOrderId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.CoilType#getGlobalId <em>Global Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Global Id</em>'.
	 * @see org.plcopen.xml.tc60201.CoilType#getGlobalId()
	 * @see #getCoilType()
	 * @generated
	 */
	EAttribute getCoilType_GlobalId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.CoilType#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.plcopen.xml.tc60201.CoilType#getHeight()
	 * @see #getCoilType()
	 * @generated
	 */
	EAttribute getCoilType_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.CoilType#getLocalId <em>Local Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Id</em>'.
	 * @see org.plcopen.xml.tc60201.CoilType#getLocalId()
	 * @see #getCoilType()
	 * @generated
	 */
	EAttribute getCoilType_LocalId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.CoilType#isNegated <em>Negated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Negated</em>'.
	 * @see org.plcopen.xml.tc60201.CoilType#isNegated()
	 * @see #getCoilType()
	 * @generated
	 */
	EAttribute getCoilType_Negated();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.CoilType#getStorage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Storage</em>'.
	 * @see org.plcopen.xml.tc60201.CoilType#getStorage()
	 * @see #getCoilType()
	 * @generated
	 */
	EAttribute getCoilType_Storage();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.CoilType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.plcopen.xml.tc60201.CoilType#getWidth()
	 * @see #getCoilType()
	 * @generated
	 */
	EAttribute getCoilType_Width();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.CommentType <em>Comment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment Type</em>'.
	 * @see org.plcopen.xml.tc60201.CommentType
	 * @generated
	 */
	EClass getCommentType();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.CommentType#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see org.plcopen.xml.tc60201.CommentType#getPosition()
	 * @see #getCommentType()
	 * @generated
	 */
	EReference getCommentType_Position();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.CommentType#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see org.plcopen.xml.tc60201.CommentType#getContent()
	 * @see #getCommentType()
	 * @generated
	 */
	EReference getCommentType_Content();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.CommentType#getAddData <em>Add Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Data</em>'.
	 * @see org.plcopen.xml.tc60201.CommentType#getAddData()
	 * @see #getCommentType()
	 * @generated
	 */
	EReference getCommentType_AddData();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.CommentType#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see org.plcopen.xml.tc60201.CommentType#getDocumentation()
	 * @see #getCommentType()
	 * @generated
	 */
	EReference getCommentType_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.CommentType#getGlobalId <em>Global Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Global Id</em>'.
	 * @see org.plcopen.xml.tc60201.CommentType#getGlobalId()
	 * @see #getCommentType()
	 * @generated
	 */
	EAttribute getCommentType_GlobalId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.CommentType#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.plcopen.xml.tc60201.CommentType#getHeight()
	 * @see #getCommentType()
	 * @generated
	 */
	EAttribute getCommentType_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.CommentType#getLocalId <em>Local Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Id</em>'.
	 * @see org.plcopen.xml.tc60201.CommentType#getLocalId()
	 * @see #getCommentType()
	 * @generated
	 */
	EAttribute getCommentType_LocalId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.CommentType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.plcopen.xml.tc60201.CommentType#getWidth()
	 * @see #getCommentType()
	 * @generated
	 */
	EAttribute getCommentType_Width();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.ConditionType <em>Condition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Type</em>'.
	 * @see org.plcopen.xml.tc60201.ConditionType
	 * @generated
	 */
	EClass getConditionType();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.ConditionType#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference</em>'.
	 * @see org.plcopen.xml.tc60201.ConditionType#getReference()
	 * @see #getConditionType()
	 * @generated
	 */
	EReference getConditionType_Reference();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.ConditionType#getConnectionPointIn <em>Connection Point In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connection Point In</em>'.
	 * @see org.plcopen.xml.tc60201.ConditionType#getConnectionPointIn()
	 * @see #getConditionType()
	 * @generated
	 */
	EReference getConditionType_ConnectionPointIn();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.ConditionType#getInline <em>Inline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inline</em>'.
	 * @see org.plcopen.xml.tc60201.ConditionType#getInline()
	 * @see #getConditionType()
	 * @generated
	 */
	EReference getConditionType_Inline();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ConditionType#isNegated <em>Negated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Negated</em>'.
	 * @see org.plcopen.xml.tc60201.ConditionType#isNegated()
	 * @see #getConditionType()
	 * @generated
	 */
	EAttribute getConditionType_Negated();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.ConfigurationsType <em>Configurations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configurations Type</em>'.
	 * @see org.plcopen.xml.tc60201.ConfigurationsType
	 * @generated
	 */
	EClass getConfigurationsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.ConfigurationsType#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configuration</em>'.
	 * @see org.plcopen.xml.tc60201.ConfigurationsType#getConfiguration()
	 * @see #getConfigurationsType()
	 * @generated
	 */
	EReference getConfigurationsType_Configuration();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.ConfigurationType <em>Configuration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Type</em>'.
	 * @see org.plcopen.xml.tc60201.ConfigurationType
	 * @generated
	 */
	EClass getConfigurationType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.ConfigurationType#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource</em>'.
	 * @see org.plcopen.xml.tc60201.ConfigurationType#getResource()
	 * @see #getConfigurationType()
	 * @generated
	 */
	EReference getConfigurationType_Resource();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.ConfigurationType#getGlobalVars <em>Global Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Global Vars</em>'.
	 * @see org.plcopen.xml.tc60201.ConfigurationType#getGlobalVars()
	 * @see #getConfigurationType()
	 * @generated
	 */
	EReference getConfigurationType_GlobalVars();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.ConfigurationType#getAccessVars <em>Access Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Access Vars</em>'.
	 * @see org.plcopen.xml.tc60201.ConfigurationType#getAccessVars()
	 * @see #getConfigurationType()
	 * @generated
	 */
	EReference getConfigurationType_AccessVars();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.ConfigurationType#getConfigVars <em>Config Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Config Vars</em>'.
	 * @see org.plcopen.xml.tc60201.ConfigurationType#getConfigVars()
	 * @see #getConfigurationType()
	 * @generated
	 */
	EReference getConfigurationType_ConfigVars();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.ConfigurationType#getAddData <em>Add Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Data</em>'.
	 * @see org.plcopen.xml.tc60201.ConfigurationType#getAddData()
	 * @see #getConfigurationType()
	 * @generated
	 */
	EReference getConfigurationType_AddData();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.ConfigurationType#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see org.plcopen.xml.tc60201.ConfigurationType#getDocumentation()
	 * @see #getConfigurationType()
	 * @generated
	 */
	EReference getConfigurationType_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ConfigurationType#getGlobalId <em>Global Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Global Id</em>'.
	 * @see org.plcopen.xml.tc60201.ConfigurationType#getGlobalId()
	 * @see #getConfigurationType()
	 * @generated
	 */
	EAttribute getConfigurationType_GlobalId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ConfigurationType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.plcopen.xml.tc60201.ConfigurationType#getName()
	 * @see #getConfigurationType()
	 * @generated
	 */
	EAttribute getConfigurationType_Name();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.ConfigVariableType <em>Config Variable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config Variable Type</em>'.
	 * @see org.plcopen.xml.tc60201.ConfigVariableType
	 * @generated
	 */
	EClass getConfigVariableType();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.ConfigVariableType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.plcopen.xml.tc60201.ConfigVariableType#getType()
	 * @see #getConfigVariableType()
	 * @generated
	 */
	EReference getConfigVariableType_Type();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.ConfigVariableType#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial Value</em>'.
	 * @see org.plcopen.xml.tc60201.ConfigVariableType#getInitialValue()
	 * @see #getConfigVariableType()
	 * @generated
	 */
	EReference getConfigVariableType_InitialValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.ConfigVariableType#getAddData <em>Add Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Data</em>'.
	 * @see org.plcopen.xml.tc60201.ConfigVariableType#getAddData()
	 * @see #getConfigVariableType()
	 * @generated
	 */
	EReference getConfigVariableType_AddData();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.ConfigVariableType#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see org.plcopen.xml.tc60201.ConfigVariableType#getDocumentation()
	 * @see #getConfigVariableType()
	 * @generated
	 */
	EReference getConfigVariableType_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ConfigVariableType#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see org.plcopen.xml.tc60201.ConfigVariableType#getAddress()
	 * @see #getConfigVariableType()
	 * @generated
	 */
	EAttribute getConfigVariableType_Address();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ConfigVariableType#getInstancePathAndName <em>Instance Path And Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Path And Name</em>'.
	 * @see org.plcopen.xml.tc60201.ConfigVariableType#getInstancePathAndName()
	 * @see #getConfigVariableType()
	 * @generated
	 */
	EAttribute getConfigVariableType_InstancePathAndName();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see org.plcopen.xml.tc60201.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.Connection#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Position</em>'.
	 * @see org.plcopen.xml.tc60201.Connection#getPosition()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Position();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.Connection#getAddData <em>Add Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Data</em>'.
	 * @see org.plcopen.xml.tc60201.Connection#getAddData()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_AddData();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.Connection#getFormalParameter <em>Formal Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formal Parameter</em>'.
	 * @see org.plcopen.xml.tc60201.Connection#getFormalParameter()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_FormalParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.Connection#getGlobalId <em>Global Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Global Id</em>'.
	 * @see org.plcopen.xml.tc60201.Connection#getGlobalId()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_GlobalId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.Connection#getRefLocalId <em>Ref Local Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref Local Id</em>'.
	 * @see org.plcopen.xml.tc60201.Connection#getRefLocalId()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_RefLocalId();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.ConnectionPointIn <em>Connection Point In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Point In</em>'.
	 * @see org.plcopen.xml.tc60201.ConnectionPointIn
	 * @generated
	 */
	EClass getConnectionPointIn();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.ConnectionPointIn#getRelPosition <em>Rel Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rel Position</em>'.
	 * @see org.plcopen.xml.tc60201.ConnectionPointIn#getRelPosition()
	 * @see #getConnectionPointIn()
	 * @generated
	 */
	EReference getConnectionPointIn_RelPosition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.ConnectionPointIn#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connection</em>'.
	 * @see org.plcopen.xml.tc60201.ConnectionPointIn#getConnection()
	 * @see #getConnectionPointIn()
	 * @generated
	 */
	EReference getConnectionPointIn_Connection();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ConnectionPointIn#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see org.plcopen.xml.tc60201.ConnectionPointIn#getExpression()
	 * @see #getConnectionPointIn()
	 * @generated
	 */
	EAttribute getConnectionPointIn_Expression();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.ConnectionPointIn#getAddData <em>Add Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Data</em>'.
	 * @see org.plcopen.xml.tc60201.ConnectionPointIn#getAddData()
	 * @see #getConnectionPointIn()
	 * @generated
	 */
	EReference getConnectionPointIn_AddData();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ConnectionPointIn#getGlobalId <em>Global Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Global Id</em>'.
	 * @see org.plcopen.xml.tc60201.ConnectionPointIn#getGlobalId()
	 * @see #getConnectionPointIn()
	 * @generated
	 */
	EAttribute getConnectionPointIn_GlobalId();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.ConnectionPointInType <em>Connection Point In Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Point In Type</em>'.
	 * @see org.plcopen.xml.tc60201.ConnectionPointInType
	 * @generated
	 */
	EClass getConnectionPointInType();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.ConnectionPointOut <em>Connection Point Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Point Out</em>'.
	 * @see org.plcopen.xml.tc60201.ConnectionPointOut
	 * @generated
	 */
	EClass getConnectionPointOut();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.ConnectionPointOut#getRelPosition <em>Rel Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rel Position</em>'.
	 * @see org.plcopen.xml.tc60201.ConnectionPointOut#getRelPosition()
	 * @see #getConnectionPointOut()
	 * @generated
	 */
	EReference getConnectionPointOut_RelPosition();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ConnectionPointOut#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see org.plcopen.xml.tc60201.ConnectionPointOut#getExpression()
	 * @see #getConnectionPointOut()
	 * @generated
	 */
	EAttribute getConnectionPointOut_Expression();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.ConnectionPointOut#getAddData <em>Add Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Data</em>'.
	 * @see org.plcopen.xml.tc60201.ConnectionPointOut#getAddData()
	 * @see #getConnectionPointOut()
	 * @generated
	 */
	EReference getConnectionPointOut_AddData();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ConnectionPointOut#getGlobalId <em>Global Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Global Id</em>'.
	 * @see org.plcopen.xml.tc60201.ConnectionPointOut#getGlobalId()
	 * @see #getConnectionPointOut()
	 * @generated
	 */
	EAttribute getConnectionPointOut_GlobalId();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.ConnectionPointOutActionType <em>Connection Point Out Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Point Out Action Type</em>'.
	 * @see org.plcopen.xml.tc60201.ConnectionPointOutActionType
	 * @generated
	 */
	EClass getConnectionPointOutActionType();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ConnectionPointOutActionType#getFormalParameter <em>Formal Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formal Parameter</em>'.
	 * @see org.plcopen.xml.tc60201.ConnectionPointOutActionType#getFormalParameter()
	 * @see #getConnectionPointOutActionType()
	 * @generated
	 */
	EAttribute getConnectionPointOutActionType_FormalParameter();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.ConnectionPointOutType <em>Connection Point Out Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Point Out Type</em>'.
	 * @see org.plcopen.xml.tc60201.ConnectionPointOutType
	 * @generated
	 */
	EClass getConnectionPointOutType();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ConnectionPointOutType#getFormalParameter <em>Formal Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formal Parameter</em>'.
	 * @see org.plcopen.xml.tc60201.ConnectionPointOutType#getFormalParameter()
	 * @see #getConnectionPointOutType()
	 * @generated
	 */
	EAttribute getConnectionPointOutType_FormalParameter();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.ConnectionPointOutType1 <em>Connection Point Out Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Point Out Type1</em>'.
	 * @see org.plcopen.xml.tc60201.ConnectionPointOutType1
	 * @generated
	 */
	EClass getConnectionPointOutType1();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ConnectionPointOutType1#getFormalParameter <em>Formal Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formal Parameter</em>'.
	 * @see org.plcopen.xml.tc60201.ConnectionPointOutType1#getFormalParameter()
	 * @see #getConnectionPointOutType1()
	 * @generated
	 */
	EAttribute getConnectionPointOutType1_FormalParameter();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.ConnectionPointOutType2 <em>Connection Point Out Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Point Out Type2</em>'.
	 * @see org.plcopen.xml.tc60201.ConnectionPointOutType2
	 * @generated
	 */
	EClass getConnectionPointOutType2();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ConnectionPointOutType2#getFormalParameter <em>Formal Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formal Parameter</em>'.
	 * @see org.plcopen.xml.tc60201.ConnectionPointOutType2#getFormalParameter()
	 * @see #getConnectionPointOutType2()
	 * @generated
	 */
	EAttribute getConnectionPointOutType2_FormalParameter();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.ConnectionPointOutType3 <em>Connection Point Out Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Point Out Type3</em>'.
	 * @see org.plcopen.xml.tc60201.ConnectionPointOutType3
	 * @generated
	 */
	EClass getConnectionPointOutType3();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ConnectionPointOutType3#getFormalParameter <em>Formal Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formal Parameter</em>'.
	 * @see org.plcopen.xml.tc60201.ConnectionPointOutType3#getFormalParameter()
	 * @see #getConnectionPointOutType3()
	 * @generated
	 */
	EAttribute getConnectionPointOutType3_FormalParameter();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.ConnectorType <em>Connector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector Type</em>'.
	 * @see org.plcopen.xml.tc60201.ConnectorType
	 * @generated
	 */
	EClass getConnectorType();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.ConnectorType#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see org.plcopen.xml.tc60201.ConnectorType#getPosition()
	 * @see #getConnectorType()
	 * @generated
	 */
	EReference getConnectorType_Position();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.ConnectorType#getConnectionPointIn <em>Connection Point In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connection Point In</em>'.
	 * @see org.plcopen.xml.tc60201.ConnectorType#getConnectionPointIn()
	 * @see #getConnectorType()
	 * @generated
	 */
	EReference getConnectorType_ConnectionPointIn();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.ConnectorType#getAddData <em>Add Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Data</em>'.
	 * @see org.plcopen.xml.tc60201.ConnectorType#getAddData()
	 * @see #getConnectorType()
	 * @generated
	 */
	EReference getConnectorType_AddData();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.ConnectorType#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see org.plcopen.xml.tc60201.ConnectorType#getDocumentation()
	 * @see #getConnectorType()
	 * @generated
	 */
	EReference getConnectorType_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ConnectorType#getGlobalId <em>Global Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Global Id</em>'.
	 * @see org.plcopen.xml.tc60201.ConnectorType#getGlobalId()
	 * @see #getConnectorType()
	 * @generated
	 */
	EAttribute getConnectorType_GlobalId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ConnectorType#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.plcopen.xml.tc60201.ConnectorType#getHeight()
	 * @see #getConnectorType()
	 * @generated
	 */
	EAttribute getConnectorType_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ConnectorType#getLocalId <em>Local Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Id</em>'.
	 * @see org.plcopen.xml.tc60201.ConnectorType#getLocalId()
	 * @see #getConnectorType()
	 * @generated
	 */
	EAttribute getConnectorType_LocalId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ConnectorType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.plcopen.xml.tc60201.ConnectorType#getName()
	 * @see #getConnectorType()
	 * @generated
	 */
	EAttribute getConnectorType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ConnectorType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.plcopen.xml.tc60201.ConnectorType#getWidth()
	 * @see #getConnectorType()
	 * @generated
	 */
	EAttribute getConnectorType_Width();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.ContactType <em>Contact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contact Type</em>'.
	 * @see org.plcopen.xml.tc60201.ContactType
	 * @generated
	 */
	EClass getContactType();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.ContactType#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see org.plcopen.xml.tc60201.ContactType#getPosition()
	 * @see #getContactType()
	 * @generated
	 */
	EReference getContactType_Position();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.ContactType#getConnectionPointIn <em>Connection Point In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connection Point In</em>'.
	 * @see org.plcopen.xml.tc60201.ContactType#getConnectionPointIn()
	 * @see #getContactType()
	 * @generated
	 */
	EReference getContactType_ConnectionPointIn();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.ContactType#getConnectionPointOut <em>Connection Point Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connection Point Out</em>'.
	 * @see org.plcopen.xml.tc60201.ContactType#getConnectionPointOut()
	 * @see #getContactType()
	 * @generated
	 */
	EReference getContactType_ConnectionPointOut();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ContactType#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see org.plcopen.xml.tc60201.ContactType#getVariable()
	 * @see #getContactType()
	 * @generated
	 */
	EAttribute getContactType_Variable();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.ContactType#getAddData <em>Add Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Data</em>'.
	 * @see org.plcopen.xml.tc60201.ContactType#getAddData()
	 * @see #getContactType()
	 * @generated
	 */
	EReference getContactType_AddData();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.ContactType#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see org.plcopen.xml.tc60201.ContactType#getDocumentation()
	 * @see #getContactType()
	 * @generated
	 */
	EReference getContactType_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ContactType#getEdge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edge</em>'.
	 * @see org.plcopen.xml.tc60201.ContactType#getEdge()
	 * @see #getContactType()
	 * @generated
	 */
	EAttribute getContactType_Edge();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ContactType#getExecutionOrderId <em>Execution Order Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Order Id</em>'.
	 * @see org.plcopen.xml.tc60201.ContactType#getExecutionOrderId()
	 * @see #getContactType()
	 * @generated
	 */
	EAttribute getContactType_ExecutionOrderId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ContactType#getGlobalId <em>Global Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Global Id</em>'.
	 * @see org.plcopen.xml.tc60201.ContactType#getGlobalId()
	 * @see #getContactType()
	 * @generated
	 */
	EAttribute getContactType_GlobalId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ContactType#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.plcopen.xml.tc60201.ContactType#getHeight()
	 * @see #getContactType()
	 * @generated
	 */
	EAttribute getContactType_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ContactType#getLocalId <em>Local Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Id</em>'.
	 * @see org.plcopen.xml.tc60201.ContactType#getLocalId()
	 * @see #getContactType()
	 * @generated
	 */
	EAttribute getContactType_LocalId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ContactType#isNegated <em>Negated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Negated</em>'.
	 * @see org.plcopen.xml.tc60201.ContactType#isNegated()
	 * @see #getContactType()
	 * @generated
	 */
	EAttribute getContactType_Negated();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ContactType#getStorage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Storage</em>'.
	 * @see org.plcopen.xml.tc60201.ContactType#getStorage()
	 * @see #getContactType()
	 * @generated
	 */
	EAttribute getContactType_Storage();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ContactType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.plcopen.xml.tc60201.ContactType#getWidth()
	 * @see #getContactType()
	 * @generated
	 */
	EAttribute getContactType_Width();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.ContentHeaderType <em>Content Header Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Header Type</em>'.
	 * @see org.plcopen.xml.tc60201.ContentHeaderType
	 * @generated
	 */
	EClass getContentHeaderType();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ContentHeaderType#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.plcopen.xml.tc60201.ContentHeaderType#getComment()
	 * @see #getContentHeaderType()
	 * @generated
	 */
	EAttribute getContentHeaderType_Comment();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.ContentHeaderType#getCoordinateInfo <em>Coordinate Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Coordinate Info</em>'.
	 * @see org.plcopen.xml.tc60201.ContentHeaderType#getCoordinateInfo()
	 * @see #getContentHeaderType()
	 * @generated
	 */
	EReference getContentHeaderType_CoordinateInfo();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.ContentHeaderType#getAddDataInfo <em>Add Data Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Data Info</em>'.
	 * @see org.plcopen.xml.tc60201.ContentHeaderType#getAddDataInfo()
	 * @see #getContentHeaderType()
	 * @generated
	 */
	EReference getContentHeaderType_AddDataInfo();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.ContentHeaderType#getAddData <em>Add Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Data</em>'.
	 * @see org.plcopen.xml.tc60201.ContentHeaderType#getAddData()
	 * @see #getContentHeaderType()
	 * @generated
	 */
	EReference getContentHeaderType_AddData();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ContentHeaderType#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see org.plcopen.xml.tc60201.ContentHeaderType#getAuthor()
	 * @see #getContentHeaderType()
	 * @generated
	 */
	EAttribute getContentHeaderType_Author();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ContentHeaderType#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.plcopen.xml.tc60201.ContentHeaderType#getLanguage()
	 * @see #getContentHeaderType()
	 * @generated
	 */
	EAttribute getContentHeaderType_Language();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ContentHeaderType#getModificationDateTime <em>Modification Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modification Date Time</em>'.
	 * @see org.plcopen.xml.tc60201.ContentHeaderType#getModificationDateTime()
	 * @see #getContentHeaderType()
	 * @generated
	 */
	EAttribute getContentHeaderType_ModificationDateTime();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ContentHeaderType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.plcopen.xml.tc60201.ContentHeaderType#getName()
	 * @see #getContentHeaderType()
	 * @generated
	 */
	EAttribute getContentHeaderType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ContentHeaderType#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organization</em>'.
	 * @see org.plcopen.xml.tc60201.ContentHeaderType#getOrganization()
	 * @see #getContentHeaderType()
	 * @generated
	 */
	EAttribute getContentHeaderType_Organization();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ContentHeaderType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.plcopen.xml.tc60201.ContentHeaderType#getVersion()
	 * @see #getContentHeaderType()
	 * @generated
	 */
	EAttribute getContentHeaderType_Version();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.ContinuationType <em>Continuation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Continuation Type</em>'.
	 * @see org.plcopen.xml.tc60201.ContinuationType
	 * @generated
	 */
	EClass getContinuationType();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.ContinuationType#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see org.plcopen.xml.tc60201.ContinuationType#getPosition()
	 * @see #getContinuationType()
	 * @generated
	 */
	EReference getContinuationType_Position();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.ContinuationType#getConnectionPointOut <em>Connection Point Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connection Point Out</em>'.
	 * @see org.plcopen.xml.tc60201.ContinuationType#getConnectionPointOut()
	 * @see #getContinuationType()
	 * @generated
	 */
	EReference getContinuationType_ConnectionPointOut();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.ContinuationType#getAddData <em>Add Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Data</em>'.
	 * @see org.plcopen.xml.tc60201.ContinuationType#getAddData()
	 * @see #getContinuationType()
	 * @generated
	 */
	EReference getContinuationType_AddData();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.ContinuationType#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see org.plcopen.xml.tc60201.ContinuationType#getDocumentation()
	 * @see #getContinuationType()
	 * @generated
	 */
	EReference getContinuationType_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ContinuationType#getGlobalId <em>Global Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Global Id</em>'.
	 * @see org.plcopen.xml.tc60201.ContinuationType#getGlobalId()
	 * @see #getContinuationType()
	 * @generated
	 */
	EAttribute getContinuationType_GlobalId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ContinuationType#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.plcopen.xml.tc60201.ContinuationType#getHeight()
	 * @see #getContinuationType()
	 * @generated
	 */
	EAttribute getContinuationType_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ContinuationType#getLocalId <em>Local Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Id</em>'.
	 * @see org.plcopen.xml.tc60201.ContinuationType#getLocalId()
	 * @see #getContinuationType()
	 * @generated
	 */
	EAttribute getContinuationType_LocalId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ContinuationType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.plcopen.xml.tc60201.ContinuationType#getName()
	 * @see #getContinuationType()
	 * @generated
	 */
	EAttribute getContinuationType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ContinuationType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.plcopen.xml.tc60201.ContinuationType#getWidth()
	 * @see #getContinuationType()
	 * @generated
	 */
	EAttribute getContinuationType_Width();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.CoordinateInfoType <em>Coordinate Info Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordinate Info Type</em>'.
	 * @see org.plcopen.xml.tc60201.CoordinateInfoType
	 * @generated
	 */
	EClass getCoordinateInfoType();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.CoordinateInfoType#getPageSize <em>Page Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Page Size</em>'.
	 * @see org.plcopen.xml.tc60201.CoordinateInfoType#getPageSize()
	 * @see #getCoordinateInfoType()
	 * @generated
	 */
	EReference getCoordinateInfoType_PageSize();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.CoordinateInfoType#getFbd <em>Fbd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fbd</em>'.
	 * @see org.plcopen.xml.tc60201.CoordinateInfoType#getFbd()
	 * @see #getCoordinateInfoType()
	 * @generated
	 */
	EReference getCoordinateInfoType_Fbd();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.CoordinateInfoType#getLd <em>Ld</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ld</em>'.
	 * @see org.plcopen.xml.tc60201.CoordinateInfoType#getLd()
	 * @see #getCoordinateInfoType()
	 * @generated
	 */
	EReference getCoordinateInfoType_Ld();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.CoordinateInfoType#getSfc <em>Sfc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sfc</em>'.
	 * @see org.plcopen.xml.tc60201.CoordinateInfoType#getSfc()
	 * @see #getCoordinateInfoType()
	 * @generated
	 */
	EReference getCoordinateInfoType_Sfc();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see org.plcopen.xml.tc60201.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.DataType#getBOOL <em>BOOL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>BOOL</em>'.
	 * @see org.plcopen.xml.tc60201.DataType#getBOOL()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_BOOL();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.DataType#getBYTE <em>BYTE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>BYTE</em>'.
	 * @see org.plcopen.xml.tc60201.DataType#getBYTE()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_BYTE();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.DataType#getWORD <em>WORD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>WORD</em>'.
	 * @see org.plcopen.xml.tc60201.DataType#getWORD()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_WORD();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.DataType#getDWORD <em>DWORD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DWORD</em>'.
	 * @see org.plcopen.xml.tc60201.DataType#getDWORD()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_DWORD();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.DataType#getLWORD <em>LWORD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>LWORD</em>'.
	 * @see org.plcopen.xml.tc60201.DataType#getLWORD()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_LWORD();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.DataType#getSINT <em>SINT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SINT</em>'.
	 * @see org.plcopen.xml.tc60201.DataType#getSINT()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_SINT();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.DataType#getINT <em>INT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>INT</em>'.
	 * @see org.plcopen.xml.tc60201.DataType#getINT()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_INT();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.DataType#getDINT <em>DINT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DINT</em>'.
	 * @see org.plcopen.xml.tc60201.DataType#getDINT()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_DINT();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.DataType#getLINT <em>LINT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>LINT</em>'.
	 * @see org.plcopen.xml.tc60201.DataType#getLINT()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_LINT();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.DataType#getUSINT <em>USINT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>USINT</em>'.
	 * @see org.plcopen.xml.tc60201.DataType#getUSINT()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_USINT();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.DataType#getUINT <em>UINT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>UINT</em>'.
	 * @see org.plcopen.xml.tc60201.DataType#getUINT()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_UINT();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.DataType#getUDINT <em>UDINT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>UDINT</em>'.
	 * @see org.plcopen.xml.tc60201.DataType#getUDINT()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_UDINT();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.DataType#getULINT <em>ULINT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ULINT</em>'.
	 * @see org.plcopen.xml.tc60201.DataType#getULINT()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_ULINT();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.DataType#getREAL <em>REAL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>REAL</em>'.
	 * @see org.plcopen.xml.tc60201.DataType#getREAL()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_REAL();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.DataType#getLREAL <em>LREAL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>LREAL</em>'.
	 * @see org.plcopen.xml.tc60201.DataType#getLREAL()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_LREAL();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.DataType#getTIME <em>TIME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>TIME</em>'.
	 * @see org.plcopen.xml.tc60201.DataType#getTIME()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_TIME();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.DataType#getDATE <em>DATE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DATE</em>'.
	 * @see org.plcopen.xml.tc60201.DataType#getDATE()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_DATE();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.DataType#getDT <em>DT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DT</em>'.
	 * @see org.plcopen.xml.tc60201.DataType#getDT()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_DT();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.DataType#getTOD <em>TOD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>TOD</em>'.
	 * @see org.plcopen.xml.tc60201.DataType#getTOD()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_TOD();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.DataType#getString <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>String</em>'.
	 * @see org.plcopen.xml.tc60201.DataType#getString()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_String();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.DataType#getWstring <em>Wstring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wstring</em>'.
	 * @see org.plcopen.xml.tc60201.DataType#getWstring()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_Wstring();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.DataType#getANY <em>ANY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ANY</em>'.
	 * @see org.plcopen.xml.tc60201.DataType#getANY()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_ANY();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.DataType#getANYDERIVED <em>ANYDERIVED</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ANYDERIVED</em>'.
	 * @see org.plcopen.xml.tc60201.DataType#getANYDERIVED()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_ANYDERIVED();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.DataType#getANYELEMENTARY <em>ANYELEMENTARY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ANYELEMENTARY</em>'.
	 * @see org.plcopen.xml.tc60201.DataType#getANYELEMENTARY()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_ANYELEMENTARY();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.DataType#getANYMAGNITUDE <em>ANYMAGNITUDE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ANYMAGNITUDE</em>'.
	 * @see org.plcopen.xml.tc60201.DataType#getANYMAGNITUDE()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_ANYMAGNITUDE();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.DataType#getANYNUM <em>ANYNUM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ANYNUM</em>'.
	 * @see org.plcopen.xml.tc60201.DataType#getANYNUM()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_ANYNUM();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.DataType#getANYREAL <em>ANYREAL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ANYREAL</em>'.
	 * @see org.plcopen.xml.tc60201.DataType#getANYREAL()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_ANYREAL();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.DataType#getANYINT <em>ANYINT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ANYINT</em>'.
	 * @see org.plcopen.xml.tc60201.DataType#getANYINT()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_ANYINT();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.DataType#getANYBIT <em>ANYBIT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ANYBIT</em>'.
	 * @see org.plcopen.xml.tc60201.DataType#getANYBIT()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_ANYBIT();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.DataType#getANYSTRING <em>ANYSTRING</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ANYSTRING</em>'.
	 * @see org.plcopen.xml.tc60201.DataType#getANYSTRING()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_ANYSTRING();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.DataType#getANYDATE <em>ANYDATE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ANYDATE</em>'.
	 * @see org.plcopen.xml.tc60201.DataType#getANYDATE()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_ANYDATE();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.DataType#getArray <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Array</em>'.
	 * @see org.plcopen.xml.tc60201.DataType#getArray()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_Array();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.DataType#getDerived <em>Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Derived</em>'.
	 * @see org.plcopen.xml.tc60201.DataType#getDerived()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_Derived();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.DataType#getEnum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Enum</em>'.
	 * @see org.plcopen.xml.tc60201.DataType#getEnum()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_Enum();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.DataType#getStruct <em>Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Struct</em>'.
	 * @see org.plcopen.xml.tc60201.DataType#getStruct()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_Struct();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.DataType#getSubrangeSigned <em>Subrange Signed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subrange Signed</em>'.
	 * @see org.plcopen.xml.tc60201.DataType#getSubrangeSigned()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_SubrangeSigned();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.DataType#getSubrangeUnsigned <em>Subrange Unsigned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subrange Unsigned</em>'.
	 * @see org.plcopen.xml.tc60201.DataType#getSubrangeUnsigned()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_SubrangeUnsigned();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.DataType#getPointer <em>Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pointer</em>'.
	 * @see org.plcopen.xml.tc60201.DataType#getPointer()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_Pointer();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.DataType1 <em>Data Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type1</em>'.
	 * @see org.plcopen.xml.tc60201.DataType1
	 * @generated
	 */
	EClass getDataType1();

	/**
	 * Returns the meta object for the attribute list '{@link org.plcopen.xml.tc60201.DataType1#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.plcopen.xml.tc60201.DataType1#getAny()
	 * @see #getDataType1()
	 * @generated
	 */
	EAttribute getDataType1_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.DataType1#getHandleUnknown <em>Handle Unknown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Handle Unknown</em>'.
	 * @see org.plcopen.xml.tc60201.DataType1#getHandleUnknown()
	 * @see #getDataType1()
	 * @generated
	 */
	EAttribute getDataType1_HandleUnknown();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.DataType1#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.plcopen.xml.tc60201.DataType1#getName()
	 * @see #getDataType1()
	 * @generated
	 */
	EAttribute getDataType1_Name();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.DataTypesType <em>Data Types Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Types Type</em>'.
	 * @see org.plcopen.xml.tc60201.DataTypesType
	 * @generated
	 */
	EClass getDataTypesType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.DataTypesType#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Type</em>'.
	 * @see org.plcopen.xml.tc60201.DataTypesType#getDataType()
	 * @see #getDataTypesType()
	 * @generated
	 */
	EReference getDataTypesType_DataType();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.DataTypeType <em>Data Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type Type</em>'.
	 * @see org.plcopen.xml.tc60201.DataTypeType
	 * @generated
	 */
	EClass getDataTypeType();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.DataTypeType#getBaseType <em>Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Base Type</em>'.
	 * @see org.plcopen.xml.tc60201.DataTypeType#getBaseType()
	 * @see #getDataTypeType()
	 * @generated
	 */
	EReference getDataTypeType_BaseType();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.DataTypeType#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial Value</em>'.
	 * @see org.plcopen.xml.tc60201.DataTypeType#getInitialValue()
	 * @see #getDataTypeType()
	 * @generated
	 */
	EReference getDataTypeType_InitialValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.DataTypeType#getAddData <em>Add Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Data</em>'.
	 * @see org.plcopen.xml.tc60201.DataTypeType#getAddData()
	 * @see #getDataTypeType()
	 * @generated
	 */
	EReference getDataTypeType_AddData();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.DataTypeType#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see org.plcopen.xml.tc60201.DataTypeType#getDocumentation()
	 * @see #getDataTypeType()
	 * @generated
	 */
	EReference getDataTypeType_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.DataTypeType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.plcopen.xml.tc60201.DataTypeType#getName()
	 * @see #getDataTypeType()
	 * @generated
	 */
	EAttribute getDataTypeType_Name();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.DerivedType <em>Derived Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derived Type</em>'.
	 * @see org.plcopen.xml.tc60201.DerivedType
	 * @generated
	 */
	EClass getDerivedType();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.DerivedType#getAddData <em>Add Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Data</em>'.
	 * @see org.plcopen.xml.tc60201.DerivedType#getAddData()
	 * @see #getDerivedType()
	 * @generated
	 */
	EReference getDerivedType_AddData();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.DerivedType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.plcopen.xml.tc60201.DerivedType#getName()
	 * @see #getDerivedType()
	 * @generated
	 */
	EAttribute getDerivedType_Name();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.plcopen.xml.tc60201.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.plcopen.xml.tc60201.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.plcopen.xml.tc60201.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.plcopen.xml.tc60201.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.plcopen.xml.tc60201.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.plcopen.xml.tc60201.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.plcopen.xml.tc60201.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.DocumentRoot#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Project</em>'.
	 * @see org.plcopen.xml.tc60201.DocumentRoot#getProject()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Project();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.EnumType <em>Enum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Type</em>'.
	 * @see org.plcopen.xml.tc60201.EnumType
	 * @generated
	 */
	EClass getEnumType();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.EnumType#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Values</em>'.
	 * @see org.plcopen.xml.tc60201.EnumType#getValues()
	 * @see #getEnumType()
	 * @generated
	 */
	EReference getEnumType_Values();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.EnumType#getBaseType <em>Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Base Type</em>'.
	 * @see org.plcopen.xml.tc60201.EnumType#getBaseType()
	 * @see #getEnumType()
	 * @generated
	 */
	EReference getEnumType_BaseType();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.ErrorType <em>Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Type</em>'.
	 * @see org.plcopen.xml.tc60201.ErrorType
	 * @generated
	 */
	EClass getErrorType();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.ErrorType#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see org.plcopen.xml.tc60201.ErrorType#getPosition()
	 * @see #getErrorType()
	 * @generated
	 */
	EReference getErrorType_Position();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.ErrorType#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see org.plcopen.xml.tc60201.ErrorType#getContent()
	 * @see #getErrorType()
	 * @generated
	 */
	EReference getErrorType_Content();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.ErrorType#getAddData <em>Add Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Data</em>'.
	 * @see org.plcopen.xml.tc60201.ErrorType#getAddData()
	 * @see #getErrorType()
	 * @generated
	 */
	EReference getErrorType_AddData();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.ErrorType#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see org.plcopen.xml.tc60201.ErrorType#getDocumentation()
	 * @see #getErrorType()
	 * @generated
	 */
	EReference getErrorType_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ErrorType#getGlobalId <em>Global Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Global Id</em>'.
	 * @see org.plcopen.xml.tc60201.ErrorType#getGlobalId()
	 * @see #getErrorType()
	 * @generated
	 */
	EAttribute getErrorType_GlobalId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ErrorType#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.plcopen.xml.tc60201.ErrorType#getHeight()
	 * @see #getErrorType()
	 * @generated
	 */
	EAttribute getErrorType_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ErrorType#getLocalId <em>Local Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Id</em>'.
	 * @see org.plcopen.xml.tc60201.ErrorType#getLocalId()
	 * @see #getErrorType()
	 * @generated
	 */
	EAttribute getErrorType_LocalId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ErrorType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.plcopen.xml.tc60201.ErrorType#getWidth()
	 * @see #getErrorType()
	 * @generated
	 */
	EAttribute getErrorType_Width();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.ExternalVarsType <em>External Vars Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Vars Type</em>'.
	 * @see org.plcopen.xml.tc60201.ExternalVarsType
	 * @generated
	 */
	EClass getExternalVarsType();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.FbdType <em>Fbd Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fbd Type</em>'.
	 * @see org.plcopen.xml.tc60201.FbdType
	 * @generated
	 */
	EClass getFbdType();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.FbdType#getScaling <em>Scaling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scaling</em>'.
	 * @see org.plcopen.xml.tc60201.FbdType#getScaling()
	 * @see #getFbdType()
	 * @generated
	 */
	EReference getFbdType_Scaling();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.FBDType1 <em>FBD Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FBD Type1</em>'.
	 * @see org.plcopen.xml.tc60201.FBDType1
	 * @generated
	 */
	EClass getFBDType1();

	/**
	 * Returns the meta object for the attribute list '{@link org.plcopen.xml.tc60201.FBDType1#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.plcopen.xml.tc60201.FBDType1#getGroup()
	 * @see #getFBDType1()
	 * @generated
	 */
	EAttribute getFBDType1_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.FBDType1#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comment</em>'.
	 * @see org.plcopen.xml.tc60201.FBDType1#getComment()
	 * @see #getFBDType1()
	 * @generated
	 */
	EReference getFBDType1_Comment();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.FBDType1#getError <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Error</em>'.
	 * @see org.plcopen.xml.tc60201.FBDType1#getError()
	 * @see #getFBDType1()
	 * @generated
	 */
	EReference getFBDType1_Error();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.FBDType1#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connector</em>'.
	 * @see org.plcopen.xml.tc60201.FBDType1#getConnector()
	 * @see #getFBDType1()
	 * @generated
	 */
	EReference getFBDType1_Connector();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.FBDType1#getContinuation <em>Continuation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Continuation</em>'.
	 * @see org.plcopen.xml.tc60201.FBDType1#getContinuation()
	 * @see #getFBDType1()
	 * @generated
	 */
	EReference getFBDType1_Continuation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.FBDType1#getActionBlock <em>Action Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action Block</em>'.
	 * @see org.plcopen.xml.tc60201.FBDType1#getActionBlock()
	 * @see #getFBDType1()
	 * @generated
	 */
	EReference getFBDType1_ActionBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.FBDType1#getVendorElement <em>Vendor Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vendor Element</em>'.
	 * @see org.plcopen.xml.tc60201.FBDType1#getVendorElement()
	 * @see #getFBDType1()
	 * @generated
	 */
	EReference getFBDType1_VendorElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.FBDType1#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Block</em>'.
	 * @see org.plcopen.xml.tc60201.FBDType1#getBlock()
	 * @see #getFBDType1()
	 * @generated
	 */
	EReference getFBDType1_Block();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.FBDType1#getInVariable <em>In Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>In Variable</em>'.
	 * @see org.plcopen.xml.tc60201.FBDType1#getInVariable()
	 * @see #getFBDType1()
	 * @generated
	 */
	EReference getFBDType1_InVariable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.FBDType1#getOutVariable <em>Out Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Out Variable</em>'.
	 * @see org.plcopen.xml.tc60201.FBDType1#getOutVariable()
	 * @see #getFBDType1()
	 * @generated
	 */
	EReference getFBDType1_OutVariable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.FBDType1#getInOutVariable <em>In Out Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>In Out Variable</em>'.
	 * @see org.plcopen.xml.tc60201.FBDType1#getInOutVariable()
	 * @see #getFBDType1()
	 * @generated
	 */
	EReference getFBDType1_InOutVariable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.FBDType1#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see org.plcopen.xml.tc60201.FBDType1#getLabel()
	 * @see #getFBDType1()
	 * @generated
	 */
	EReference getFBDType1_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.FBDType1#getJump <em>Jump</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Jump</em>'.
	 * @see org.plcopen.xml.tc60201.FBDType1#getJump()
	 * @see #getFBDType1()
	 * @generated
	 */
	EReference getFBDType1_Jump();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.FBDType1#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Return</em>'.
	 * @see org.plcopen.xml.tc60201.FBDType1#getReturn()
	 * @see #getFBDType1()
	 * @generated
	 */
	EReference getFBDType1_Return();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.FileHeaderType <em>File Header Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Header Type</em>'.
	 * @see org.plcopen.xml.tc60201.FileHeaderType
	 * @generated
	 */
	EClass getFileHeaderType();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.FileHeaderType#getCompanyName <em>Company Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Company Name</em>'.
	 * @see org.plcopen.xml.tc60201.FileHeaderType#getCompanyName()
	 * @see #getFileHeaderType()
	 * @generated
	 */
	EAttribute getFileHeaderType_CompanyName();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.FileHeaderType#getCompanyURL <em>Company URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Company URL</em>'.
	 * @see org.plcopen.xml.tc60201.FileHeaderType#getCompanyURL()
	 * @see #getFileHeaderType()
	 * @generated
	 */
	EAttribute getFileHeaderType_CompanyURL();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.FileHeaderType#getContentDescription <em>Content Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Description</em>'.
	 * @see org.plcopen.xml.tc60201.FileHeaderType#getContentDescription()
	 * @see #getFileHeaderType()
	 * @generated
	 */
	EAttribute getFileHeaderType_ContentDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.FileHeaderType#getCreationDateTime <em>Creation Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date Time</em>'.
	 * @see org.plcopen.xml.tc60201.FileHeaderType#getCreationDateTime()
	 * @see #getFileHeaderType()
	 * @generated
	 */
	EAttribute getFileHeaderType_CreationDateTime();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.FileHeaderType#getProductName <em>Product Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Name</em>'.
	 * @see org.plcopen.xml.tc60201.FileHeaderType#getProductName()
	 * @see #getFileHeaderType()
	 * @generated
	 */
	EAttribute getFileHeaderType_ProductName();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.FileHeaderType#getProductRelease <em>Product Release</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Release</em>'.
	 * @see org.plcopen.xml.tc60201.FileHeaderType#getProductRelease()
	 * @see #getFileHeaderType()
	 * @generated
	 */
	EAttribute getFileHeaderType_ProductRelease();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.FileHeaderType#getProductVersion <em>Product Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Version</em>'.
	 * @see org.plcopen.xml.tc60201.FileHeaderType#getProductVersion()
	 * @see #getFileHeaderType()
	 * @generated
	 */
	EAttribute getFileHeaderType_ProductVersion();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.FormattedText <em>Formatted Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formatted Text</em>'.
	 * @see org.plcopen.xml.tc60201.FormattedText
	 * @generated
	 */
	EClass getFormattedText();

	/**
	 * Returns the meta object for the attribute list '{@link org.plcopen.xml.tc60201.FormattedText#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.plcopen.xml.tc60201.FormattedText#getAny()
	 * @see #getFormattedText()
	 * @generated
	 */
	EAttribute getFormattedText_Any();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.GlobalVarsType <em>Global Vars Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Vars Type</em>'.
	 * @see org.plcopen.xml.tc60201.GlobalVarsType
	 * @generated
	 */
	EClass getGlobalVarsType();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.InfoType <em>Info Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Info Type</em>'.
	 * @see org.plcopen.xml.tc60201.InfoType
	 * @generated
	 */
	EClass getInfoType();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.InfoType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.plcopen.xml.tc60201.InfoType#getDescription()
	 * @see #getInfoType()
	 * @generated
	 */
	EReference getInfoType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.InfoType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.plcopen.xml.tc60201.InfoType#getName()
	 * @see #getInfoType()
	 * @generated
	 */
	EAttribute getInfoType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.InfoType#getVendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vendor</em>'.
	 * @see org.plcopen.xml.tc60201.InfoType#getVendor()
	 * @see #getInfoType()
	 * @generated
	 */
	EAttribute getInfoType_Vendor();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.InfoType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.plcopen.xml.tc60201.InfoType#getVersion()
	 * @see #getInfoType()
	 * @generated
	 */
	EAttribute getInfoType_Version();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.InlineType <em>Inline Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inline Type</em>'.
	 * @see org.plcopen.xml.tc60201.InlineType
	 * @generated
	 */
	EClass getInlineType();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.InlineType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.plcopen.xml.tc60201.InlineType#getName()
	 * @see #getInlineType()
	 * @generated
	 */
	EAttribute getInlineType_Name();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.InOutVariablesType <em>In Out Variables Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Out Variables Type</em>'.
	 * @see org.plcopen.xml.tc60201.InOutVariablesType
	 * @generated
	 */
	EClass getInOutVariablesType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.InOutVariablesType#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable</em>'.
	 * @see org.plcopen.xml.tc60201.InOutVariablesType#getVariable()
	 * @see #getInOutVariablesType()
	 * @generated
	 */
	EReference getInOutVariablesType_Variable();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.InOutVariablesType1 <em>In Out Variables Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Out Variables Type1</em>'.
	 * @see org.plcopen.xml.tc60201.InOutVariablesType1
	 * @generated
	 */
	EClass getInOutVariablesType1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.InOutVariablesType1#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable</em>'.
	 * @see org.plcopen.xml.tc60201.InOutVariablesType1#getVariable()
	 * @see #getInOutVariablesType1()
	 * @generated
	 */
	EReference getInOutVariablesType1_Variable();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.InOutVariableType <em>In Out Variable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Out Variable Type</em>'.
	 * @see org.plcopen.xml.tc60201.InOutVariableType
	 * @generated
	 */
	EClass getInOutVariableType();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.InOutVariableType#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see org.plcopen.xml.tc60201.InOutVariableType#getPosition()
	 * @see #getInOutVariableType()
	 * @generated
	 */
	EReference getInOutVariableType_Position();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.InOutVariableType#getConnectionPointIn <em>Connection Point In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connection Point In</em>'.
	 * @see org.plcopen.xml.tc60201.InOutVariableType#getConnectionPointIn()
	 * @see #getInOutVariableType()
	 * @generated
	 */
	EReference getInOutVariableType_ConnectionPointIn();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.InOutVariableType#getConnectionPointOut <em>Connection Point Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connection Point Out</em>'.
	 * @see org.plcopen.xml.tc60201.InOutVariableType#getConnectionPointOut()
	 * @see #getInOutVariableType()
	 * @generated
	 */
	EReference getInOutVariableType_ConnectionPointOut();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.InOutVariableType#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see org.plcopen.xml.tc60201.InOutVariableType#getExpression()
	 * @see #getInOutVariableType()
	 * @generated
	 */
	EAttribute getInOutVariableType_Expression();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.InOutVariableType#getAddData <em>Add Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Data</em>'.
	 * @see org.plcopen.xml.tc60201.InOutVariableType#getAddData()
	 * @see #getInOutVariableType()
	 * @generated
	 */
	EReference getInOutVariableType_AddData();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.InOutVariableType#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see org.plcopen.xml.tc60201.InOutVariableType#getDocumentation()
	 * @see #getInOutVariableType()
	 * @generated
	 */
	EReference getInOutVariableType_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.InOutVariableType#getEdgeIn <em>Edge In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edge In</em>'.
	 * @see org.plcopen.xml.tc60201.InOutVariableType#getEdgeIn()
	 * @see #getInOutVariableType()
	 * @generated
	 */
	EAttribute getInOutVariableType_EdgeIn();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.InOutVariableType#getEdgeOut <em>Edge Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edge Out</em>'.
	 * @see org.plcopen.xml.tc60201.InOutVariableType#getEdgeOut()
	 * @see #getInOutVariableType()
	 * @generated
	 */
	EAttribute getInOutVariableType_EdgeOut();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.InOutVariableType#getExecutionOrderId <em>Execution Order Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Order Id</em>'.
	 * @see org.plcopen.xml.tc60201.InOutVariableType#getExecutionOrderId()
	 * @see #getInOutVariableType()
	 * @generated
	 */
	EAttribute getInOutVariableType_ExecutionOrderId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.InOutVariableType#getGlobalId <em>Global Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Global Id</em>'.
	 * @see org.plcopen.xml.tc60201.InOutVariableType#getGlobalId()
	 * @see #getInOutVariableType()
	 * @generated
	 */
	EAttribute getInOutVariableType_GlobalId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.InOutVariableType#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.plcopen.xml.tc60201.InOutVariableType#getHeight()
	 * @see #getInOutVariableType()
	 * @generated
	 */
	EAttribute getInOutVariableType_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.InOutVariableType#getLocalId <em>Local Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Id</em>'.
	 * @see org.plcopen.xml.tc60201.InOutVariableType#getLocalId()
	 * @see #getInOutVariableType()
	 * @generated
	 */
	EAttribute getInOutVariableType_LocalId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.InOutVariableType#isNegatedIn <em>Negated In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Negated In</em>'.
	 * @see org.plcopen.xml.tc60201.InOutVariableType#isNegatedIn()
	 * @see #getInOutVariableType()
	 * @generated
	 */
	EAttribute getInOutVariableType_NegatedIn();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.InOutVariableType#isNegatedOut <em>Negated Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Negated Out</em>'.
	 * @see org.plcopen.xml.tc60201.InOutVariableType#isNegatedOut()
	 * @see #getInOutVariableType()
	 * @generated
	 */
	EAttribute getInOutVariableType_NegatedOut();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.InOutVariableType#getStorageIn <em>Storage In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Storage In</em>'.
	 * @see org.plcopen.xml.tc60201.InOutVariableType#getStorageIn()
	 * @see #getInOutVariableType()
	 * @generated
	 */
	EAttribute getInOutVariableType_StorageIn();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.InOutVariableType#getStorageOut <em>Storage Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Storage Out</em>'.
	 * @see org.plcopen.xml.tc60201.InOutVariableType#getStorageOut()
	 * @see #getInOutVariableType()
	 * @generated
	 */
	EAttribute getInOutVariableType_StorageOut();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.InOutVariableType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.plcopen.xml.tc60201.InOutVariableType#getWidth()
	 * @see #getInOutVariableType()
	 * @generated
	 */
	EAttribute getInOutVariableType_Width();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.InOutVarsType <em>In Out Vars Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Out Vars Type</em>'.
	 * @see org.plcopen.xml.tc60201.InOutVarsType
	 * @generated
	 */
	EClass getInOutVarsType();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.InputVariablesType <em>Input Variables Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Variables Type</em>'.
	 * @see org.plcopen.xml.tc60201.InputVariablesType
	 * @generated
	 */
	EClass getInputVariablesType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.InputVariablesType#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable</em>'.
	 * @see org.plcopen.xml.tc60201.InputVariablesType#getVariable()
	 * @see #getInputVariablesType()
	 * @generated
	 */
	EReference getInputVariablesType_Variable();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.InputVariablesType1 <em>Input Variables Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Variables Type1</em>'.
	 * @see org.plcopen.xml.tc60201.InputVariablesType1
	 * @generated
	 */
	EClass getInputVariablesType1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.InputVariablesType1#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable</em>'.
	 * @see org.plcopen.xml.tc60201.InputVariablesType1#getVariable()
	 * @see #getInputVariablesType1()
	 * @generated
	 */
	EReference getInputVariablesType1_Variable();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.InputVarsType <em>Input Vars Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Vars Type</em>'.
	 * @see org.plcopen.xml.tc60201.InputVarsType
	 * @generated
	 */
	EClass getInputVarsType();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.InstancesType <em>Instances Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instances Type</em>'.
	 * @see org.plcopen.xml.tc60201.InstancesType
	 * @generated
	 */
	EClass getInstancesType();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.InstancesType#getConfigurations <em>Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configurations</em>'.
	 * @see org.plcopen.xml.tc60201.InstancesType#getConfigurations()
	 * @see #getInstancesType()
	 * @generated
	 */
	EReference getInstancesType_Configurations();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.InterfaceType <em>Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Type</em>'.
	 * @see org.plcopen.xml.tc60201.InterfaceType
	 * @generated
	 */
	EClass getInterfaceType();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.InterfaceType#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Type</em>'.
	 * @see org.plcopen.xml.tc60201.InterfaceType#getReturnType()
	 * @see #getInterfaceType()
	 * @generated
	 */
	EReference getInterfaceType_ReturnType();

	/**
	 * Returns the meta object for the attribute list '{@link org.plcopen.xml.tc60201.InterfaceType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.plcopen.xml.tc60201.InterfaceType#getGroup()
	 * @see #getInterfaceType()
	 * @generated
	 */
	EAttribute getInterfaceType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.InterfaceType#getLocalVars <em>Local Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Local Vars</em>'.
	 * @see org.plcopen.xml.tc60201.InterfaceType#getLocalVars()
	 * @see #getInterfaceType()
	 * @generated
	 */
	EReference getInterfaceType_LocalVars();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.InterfaceType#getTempVars <em>Temp Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Temp Vars</em>'.
	 * @see org.plcopen.xml.tc60201.InterfaceType#getTempVars()
	 * @see #getInterfaceType()
	 * @generated
	 */
	EReference getInterfaceType_TempVars();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.InterfaceType#getInputVars <em>Input Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Vars</em>'.
	 * @see org.plcopen.xml.tc60201.InterfaceType#getInputVars()
	 * @see #getInterfaceType()
	 * @generated
	 */
	EReference getInterfaceType_InputVars();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.InterfaceType#getOutputVars <em>Output Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Vars</em>'.
	 * @see org.plcopen.xml.tc60201.InterfaceType#getOutputVars()
	 * @see #getInterfaceType()
	 * @generated
	 */
	EReference getInterfaceType_OutputVars();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.InterfaceType#getInOutVars <em>In Out Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>In Out Vars</em>'.
	 * @see org.plcopen.xml.tc60201.InterfaceType#getInOutVars()
	 * @see #getInterfaceType()
	 * @generated
	 */
	EReference getInterfaceType_InOutVars();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.InterfaceType#getExternalVars <em>External Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>External Vars</em>'.
	 * @see org.plcopen.xml.tc60201.InterfaceType#getExternalVars()
	 * @see #getInterfaceType()
	 * @generated
	 */
	EReference getInterfaceType_ExternalVars();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.InterfaceType#getGlobalVars <em>Global Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Global Vars</em>'.
	 * @see org.plcopen.xml.tc60201.InterfaceType#getGlobalVars()
	 * @see #getInterfaceType()
	 * @generated
	 */
	EReference getInterfaceType_GlobalVars();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.InterfaceType#getAccessVars <em>Access Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Access Vars</em>'.
	 * @see org.plcopen.xml.tc60201.InterfaceType#getAccessVars()
	 * @see #getInterfaceType()
	 * @generated
	 */
	EReference getInterfaceType_AccessVars();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.InterfaceType#getAddData <em>Add Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Data</em>'.
	 * @see org.plcopen.xml.tc60201.InterfaceType#getAddData()
	 * @see #getInterfaceType()
	 * @generated
	 */
	EReference getInterfaceType_AddData();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.InterfaceType#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see org.plcopen.xml.tc60201.InterfaceType#getDocumentation()
	 * @see #getInterfaceType()
	 * @generated
	 */
	EReference getInterfaceType_Documentation();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.InVariableType <em>In Variable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Variable Type</em>'.
	 * @see org.plcopen.xml.tc60201.InVariableType
	 * @generated
	 */
	EClass getInVariableType();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.InVariableType#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see org.plcopen.xml.tc60201.InVariableType#getPosition()
	 * @see #getInVariableType()
	 * @generated
	 */
	EReference getInVariableType_Position();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.InVariableType#getConnectionPointOut <em>Connection Point Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connection Point Out</em>'.
	 * @see org.plcopen.xml.tc60201.InVariableType#getConnectionPointOut()
	 * @see #getInVariableType()
	 * @generated
	 */
	EReference getInVariableType_ConnectionPointOut();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.InVariableType#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see org.plcopen.xml.tc60201.InVariableType#getExpression()
	 * @see #getInVariableType()
	 * @generated
	 */
	EAttribute getInVariableType_Expression();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.InVariableType#getAddData <em>Add Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Data</em>'.
	 * @see org.plcopen.xml.tc60201.InVariableType#getAddData()
	 * @see #getInVariableType()
	 * @generated
	 */
	EReference getInVariableType_AddData();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.InVariableType#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see org.plcopen.xml.tc60201.InVariableType#getDocumentation()
	 * @see #getInVariableType()
	 * @generated
	 */
	EReference getInVariableType_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.InVariableType#getEdge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edge</em>'.
	 * @see org.plcopen.xml.tc60201.InVariableType#getEdge()
	 * @see #getInVariableType()
	 * @generated
	 */
	EAttribute getInVariableType_Edge();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.InVariableType#getExecutionOrderId <em>Execution Order Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Order Id</em>'.
	 * @see org.plcopen.xml.tc60201.InVariableType#getExecutionOrderId()
	 * @see #getInVariableType()
	 * @generated
	 */
	EAttribute getInVariableType_ExecutionOrderId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.InVariableType#getGlobalId <em>Global Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Global Id</em>'.
	 * @see org.plcopen.xml.tc60201.InVariableType#getGlobalId()
	 * @see #getInVariableType()
	 * @generated
	 */
	EAttribute getInVariableType_GlobalId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.InVariableType#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.plcopen.xml.tc60201.InVariableType#getHeight()
	 * @see #getInVariableType()
	 * @generated
	 */
	EAttribute getInVariableType_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.InVariableType#getLocalId <em>Local Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Id</em>'.
	 * @see org.plcopen.xml.tc60201.InVariableType#getLocalId()
	 * @see #getInVariableType()
	 * @generated
	 */
	EAttribute getInVariableType_LocalId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.InVariableType#isNegated <em>Negated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Negated</em>'.
	 * @see org.plcopen.xml.tc60201.InVariableType#isNegated()
	 * @see #getInVariableType()
	 * @generated
	 */
	EAttribute getInVariableType_Negated();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.InVariableType#getStorage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Storage</em>'.
	 * @see org.plcopen.xml.tc60201.InVariableType#getStorage()
	 * @see #getInVariableType()
	 * @generated
	 */
	EAttribute getInVariableType_Storage();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.InVariableType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.plcopen.xml.tc60201.InVariableType#getWidth()
	 * @see #getInVariableType()
	 * @generated
	 */
	EAttribute getInVariableType_Width();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.JumpStepType <em>Jump Step Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jump Step Type</em>'.
	 * @see org.plcopen.xml.tc60201.JumpStepType
	 * @generated
	 */
	EClass getJumpStepType();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.JumpStepType#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see org.plcopen.xml.tc60201.JumpStepType#getPosition()
	 * @see #getJumpStepType()
	 * @generated
	 */
	EReference getJumpStepType_Position();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.JumpStepType#getConnectionPointIn <em>Connection Point In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connection Point In</em>'.
	 * @see org.plcopen.xml.tc60201.JumpStepType#getConnectionPointIn()
	 * @see #getJumpStepType()
	 * @generated
	 */
	EReference getJumpStepType_ConnectionPointIn();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.JumpStepType#getAddData <em>Add Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Data</em>'.
	 * @see org.plcopen.xml.tc60201.JumpStepType#getAddData()
	 * @see #getJumpStepType()
	 * @generated
	 */
	EReference getJumpStepType_AddData();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.JumpStepType#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see org.plcopen.xml.tc60201.JumpStepType#getDocumentation()
	 * @see #getJumpStepType()
	 * @generated
	 */
	EReference getJumpStepType_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.JumpStepType#getExecutionOrderId <em>Execution Order Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Order Id</em>'.
	 * @see org.plcopen.xml.tc60201.JumpStepType#getExecutionOrderId()
	 * @see #getJumpStepType()
	 * @generated
	 */
	EAttribute getJumpStepType_ExecutionOrderId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.JumpStepType#getGlobalId <em>Global Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Global Id</em>'.
	 * @see org.plcopen.xml.tc60201.JumpStepType#getGlobalId()
	 * @see #getJumpStepType()
	 * @generated
	 */
	EAttribute getJumpStepType_GlobalId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.JumpStepType#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.plcopen.xml.tc60201.JumpStepType#getHeight()
	 * @see #getJumpStepType()
	 * @generated
	 */
	EAttribute getJumpStepType_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.JumpStepType#getLocalId <em>Local Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Id</em>'.
	 * @see org.plcopen.xml.tc60201.JumpStepType#getLocalId()
	 * @see #getJumpStepType()
	 * @generated
	 */
	EAttribute getJumpStepType_LocalId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.JumpStepType#getTargetName <em>Target Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Name</em>'.
	 * @see org.plcopen.xml.tc60201.JumpStepType#getTargetName()
	 * @see #getJumpStepType()
	 * @generated
	 */
	EAttribute getJumpStepType_TargetName();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.JumpStepType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.plcopen.xml.tc60201.JumpStepType#getWidth()
	 * @see #getJumpStepType()
	 * @generated
	 */
	EAttribute getJumpStepType_Width();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.JumpType <em>Jump Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jump Type</em>'.
	 * @see org.plcopen.xml.tc60201.JumpType
	 * @generated
	 */
	EClass getJumpType();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.JumpType#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see org.plcopen.xml.tc60201.JumpType#getPosition()
	 * @see #getJumpType()
	 * @generated
	 */
	EReference getJumpType_Position();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.JumpType#getConnectionPointIn <em>Connection Point In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connection Point In</em>'.
	 * @see org.plcopen.xml.tc60201.JumpType#getConnectionPointIn()
	 * @see #getJumpType()
	 * @generated
	 */
	EReference getJumpType_ConnectionPointIn();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.JumpType#getAddData <em>Add Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Data</em>'.
	 * @see org.plcopen.xml.tc60201.JumpType#getAddData()
	 * @see #getJumpType()
	 * @generated
	 */
	EReference getJumpType_AddData();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.JumpType#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see org.plcopen.xml.tc60201.JumpType#getDocumentation()
	 * @see #getJumpType()
	 * @generated
	 */
	EReference getJumpType_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.JumpType#getExecutionOrderId <em>Execution Order Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Order Id</em>'.
	 * @see org.plcopen.xml.tc60201.JumpType#getExecutionOrderId()
	 * @see #getJumpType()
	 * @generated
	 */
	EAttribute getJumpType_ExecutionOrderId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.JumpType#getGlobalId <em>Global Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Global Id</em>'.
	 * @see org.plcopen.xml.tc60201.JumpType#getGlobalId()
	 * @see #getJumpType()
	 * @generated
	 */
	EAttribute getJumpType_GlobalId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.JumpType#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.plcopen.xml.tc60201.JumpType#getHeight()
	 * @see #getJumpType()
	 * @generated
	 */
	EAttribute getJumpType_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.JumpType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.plcopen.xml.tc60201.JumpType#getLabel()
	 * @see #getJumpType()
	 * @generated
	 */
	EAttribute getJumpType_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.JumpType#getLocalId <em>Local Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Id</em>'.
	 * @see org.plcopen.xml.tc60201.JumpType#getLocalId()
	 * @see #getJumpType()
	 * @generated
	 */
	EAttribute getJumpType_LocalId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.JumpType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.plcopen.xml.tc60201.JumpType#getWidth()
	 * @see #getJumpType()
	 * @generated
	 */
	EAttribute getJumpType_Width();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.LabelType <em>Label Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Type</em>'.
	 * @see org.plcopen.xml.tc60201.LabelType
	 * @generated
	 */
	EClass getLabelType();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.LabelType#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see org.plcopen.xml.tc60201.LabelType#getPosition()
	 * @see #getLabelType()
	 * @generated
	 */
	EReference getLabelType_Position();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.LabelType#getAddData <em>Add Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Data</em>'.
	 * @see org.plcopen.xml.tc60201.LabelType#getAddData()
	 * @see #getLabelType()
	 * @generated
	 */
	EReference getLabelType_AddData();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.LabelType#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see org.plcopen.xml.tc60201.LabelType#getDocumentation()
	 * @see #getLabelType()
	 * @generated
	 */
	EReference getLabelType_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.LabelType#getExecutionOrderId <em>Execution Order Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Order Id</em>'.
	 * @see org.plcopen.xml.tc60201.LabelType#getExecutionOrderId()
	 * @see #getLabelType()
	 * @generated
	 */
	EAttribute getLabelType_ExecutionOrderId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.LabelType#getGlobalId <em>Global Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Global Id</em>'.
	 * @see org.plcopen.xml.tc60201.LabelType#getGlobalId()
	 * @see #getLabelType()
	 * @generated
	 */
	EAttribute getLabelType_GlobalId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.LabelType#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.plcopen.xml.tc60201.LabelType#getHeight()
	 * @see #getLabelType()
	 * @generated
	 */
	EAttribute getLabelType_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.LabelType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.plcopen.xml.tc60201.LabelType#getLabel()
	 * @see #getLabelType()
	 * @generated
	 */
	EAttribute getLabelType_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.LabelType#getLocalId <em>Local Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Id</em>'.
	 * @see org.plcopen.xml.tc60201.LabelType#getLocalId()
	 * @see #getLabelType()
	 * @generated
	 */
	EAttribute getLabelType_LocalId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.LabelType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.plcopen.xml.tc60201.LabelType#getWidth()
	 * @see #getLabelType()
	 * @generated
	 */
	EAttribute getLabelType_Width();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.LdType <em>Ld Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ld Type</em>'.
	 * @see org.plcopen.xml.tc60201.LdType
	 * @generated
	 */
	EClass getLdType();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.LdType#getScaling <em>Scaling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scaling</em>'.
	 * @see org.plcopen.xml.tc60201.LdType#getScaling()
	 * @see #getLdType()
	 * @generated
	 */
	EReference getLdType_Scaling();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.LDType1 <em>LD Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LD Type1</em>'.
	 * @see org.plcopen.xml.tc60201.LDType1
	 * @generated
	 */
	EClass getLDType1();

	/**
	 * Returns the meta object for the attribute list '{@link org.plcopen.xml.tc60201.LDType1#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.plcopen.xml.tc60201.LDType1#getGroup()
	 * @see #getLDType1()
	 * @generated
	 */
	EAttribute getLDType1_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.LDType1#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comment</em>'.
	 * @see org.plcopen.xml.tc60201.LDType1#getComment()
	 * @see #getLDType1()
	 * @generated
	 */
	EReference getLDType1_Comment();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.LDType1#getError <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Error</em>'.
	 * @see org.plcopen.xml.tc60201.LDType1#getError()
	 * @see #getLDType1()
	 * @generated
	 */
	EReference getLDType1_Error();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.LDType1#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connector</em>'.
	 * @see org.plcopen.xml.tc60201.LDType1#getConnector()
	 * @see #getLDType1()
	 * @generated
	 */
	EReference getLDType1_Connector();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.LDType1#getContinuation <em>Continuation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Continuation</em>'.
	 * @see org.plcopen.xml.tc60201.LDType1#getContinuation()
	 * @see #getLDType1()
	 * @generated
	 */
	EReference getLDType1_Continuation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.LDType1#getActionBlock <em>Action Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action Block</em>'.
	 * @see org.plcopen.xml.tc60201.LDType1#getActionBlock()
	 * @see #getLDType1()
	 * @generated
	 */
	EReference getLDType1_ActionBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.LDType1#getVendorElement <em>Vendor Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vendor Element</em>'.
	 * @see org.plcopen.xml.tc60201.LDType1#getVendorElement()
	 * @see #getLDType1()
	 * @generated
	 */
	EReference getLDType1_VendorElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.LDType1#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Block</em>'.
	 * @see org.plcopen.xml.tc60201.LDType1#getBlock()
	 * @see #getLDType1()
	 * @generated
	 */
	EReference getLDType1_Block();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.LDType1#getInVariable <em>In Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>In Variable</em>'.
	 * @see org.plcopen.xml.tc60201.LDType1#getInVariable()
	 * @see #getLDType1()
	 * @generated
	 */
	EReference getLDType1_InVariable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.LDType1#getOutVariable <em>Out Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Out Variable</em>'.
	 * @see org.plcopen.xml.tc60201.LDType1#getOutVariable()
	 * @see #getLDType1()
	 * @generated
	 */
	EReference getLDType1_OutVariable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.LDType1#getInOutVariable <em>In Out Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>In Out Variable</em>'.
	 * @see org.plcopen.xml.tc60201.LDType1#getInOutVariable()
	 * @see #getLDType1()
	 * @generated
	 */
	EReference getLDType1_InOutVariable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.LDType1#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see org.plcopen.xml.tc60201.LDType1#getLabel()
	 * @see #getLDType1()
	 * @generated
	 */
	EReference getLDType1_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.LDType1#getJump <em>Jump</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Jump</em>'.
	 * @see org.plcopen.xml.tc60201.LDType1#getJump()
	 * @see #getLDType1()
	 * @generated
	 */
	EReference getLDType1_Jump();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.LDType1#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Return</em>'.
	 * @see org.plcopen.xml.tc60201.LDType1#getReturn()
	 * @see #getLDType1()
	 * @generated
	 */
	EReference getLDType1_Return();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.LDType1#getLeftPowerRail <em>Left Power Rail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Left Power Rail</em>'.
	 * @see org.plcopen.xml.tc60201.LDType1#getLeftPowerRail()
	 * @see #getLDType1()
	 * @generated
	 */
	EReference getLDType1_LeftPowerRail();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.LDType1#getRightPowerRail <em>Right Power Rail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Right Power Rail</em>'.
	 * @see org.plcopen.xml.tc60201.LDType1#getRightPowerRail()
	 * @see #getLDType1()
	 * @generated
	 */
	EReference getLDType1_RightPowerRail();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.LDType1#getCoil <em>Coil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Coil</em>'.
	 * @see org.plcopen.xml.tc60201.LDType1#getCoil()
	 * @see #getLDType1()
	 * @generated
	 */
	EReference getLDType1_Coil();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.LDType1#getContact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contact</em>'.
	 * @see org.plcopen.xml.tc60201.LDType1#getContact()
	 * @see #getLDType1()
	 * @generated
	 */
	EReference getLDType1_Contact();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.LeftPowerRailType <em>Left Power Rail Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Left Power Rail Type</em>'.
	 * @see org.plcopen.xml.tc60201.LeftPowerRailType
	 * @generated
	 */
	EClass getLeftPowerRailType();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.LeftPowerRailType#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see org.plcopen.xml.tc60201.LeftPowerRailType#getPosition()
	 * @see #getLeftPowerRailType()
	 * @generated
	 */
	EReference getLeftPowerRailType_Position();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.LeftPowerRailType#getConnectionPointOut <em>Connection Point Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connection Point Out</em>'.
	 * @see org.plcopen.xml.tc60201.LeftPowerRailType#getConnectionPointOut()
	 * @see #getLeftPowerRailType()
	 * @generated
	 */
	EReference getLeftPowerRailType_ConnectionPointOut();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.LeftPowerRailType#getAddData <em>Add Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Data</em>'.
	 * @see org.plcopen.xml.tc60201.LeftPowerRailType#getAddData()
	 * @see #getLeftPowerRailType()
	 * @generated
	 */
	EReference getLeftPowerRailType_AddData();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.LeftPowerRailType#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see org.plcopen.xml.tc60201.LeftPowerRailType#getDocumentation()
	 * @see #getLeftPowerRailType()
	 * @generated
	 */
	EReference getLeftPowerRailType_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.LeftPowerRailType#getExecutionOrderId <em>Execution Order Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Order Id</em>'.
	 * @see org.plcopen.xml.tc60201.LeftPowerRailType#getExecutionOrderId()
	 * @see #getLeftPowerRailType()
	 * @generated
	 */
	EAttribute getLeftPowerRailType_ExecutionOrderId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.LeftPowerRailType#getGlobalId <em>Global Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Global Id</em>'.
	 * @see org.plcopen.xml.tc60201.LeftPowerRailType#getGlobalId()
	 * @see #getLeftPowerRailType()
	 * @generated
	 */
	EAttribute getLeftPowerRailType_GlobalId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.LeftPowerRailType#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.plcopen.xml.tc60201.LeftPowerRailType#getHeight()
	 * @see #getLeftPowerRailType()
	 * @generated
	 */
	EAttribute getLeftPowerRailType_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.LeftPowerRailType#getLocalId <em>Local Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Id</em>'.
	 * @see org.plcopen.xml.tc60201.LeftPowerRailType#getLocalId()
	 * @see #getLeftPowerRailType()
	 * @generated
	 */
	EAttribute getLeftPowerRailType_LocalId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.LeftPowerRailType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.plcopen.xml.tc60201.LeftPowerRailType#getWidth()
	 * @see #getLeftPowerRailType()
	 * @generated
	 */
	EAttribute getLeftPowerRailType_Width();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.LocalVarsType <em>Local Vars Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Vars Type</em>'.
	 * @see org.plcopen.xml.tc60201.LocalVarsType
	 * @generated
	 */
	EClass getLocalVarsType();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.MacroStepType <em>Macro Step Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Macro Step Type</em>'.
	 * @see org.plcopen.xml.tc60201.MacroStepType
	 * @generated
	 */
	EClass getMacroStepType();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.MacroStepType#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see org.plcopen.xml.tc60201.MacroStepType#getPosition()
	 * @see #getMacroStepType()
	 * @generated
	 */
	EReference getMacroStepType_Position();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.MacroStepType#getConnectionPointIn <em>Connection Point In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connection Point In</em>'.
	 * @see org.plcopen.xml.tc60201.MacroStepType#getConnectionPointIn()
	 * @see #getMacroStepType()
	 * @generated
	 */
	EReference getMacroStepType_ConnectionPointIn();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.MacroStepType#getConnectionPointOut <em>Connection Point Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connection Point Out</em>'.
	 * @see org.plcopen.xml.tc60201.MacroStepType#getConnectionPointOut()
	 * @see #getMacroStepType()
	 * @generated
	 */
	EReference getMacroStepType_ConnectionPointOut();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.MacroStepType#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.plcopen.xml.tc60201.MacroStepType#getBody()
	 * @see #getMacroStepType()
	 * @generated
	 */
	EReference getMacroStepType_Body();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.MacroStepType#getAddData <em>Add Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Data</em>'.
	 * @see org.plcopen.xml.tc60201.MacroStepType#getAddData()
	 * @see #getMacroStepType()
	 * @generated
	 */
	EReference getMacroStepType_AddData();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.MacroStepType#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see org.plcopen.xml.tc60201.MacroStepType#getDocumentation()
	 * @see #getMacroStepType()
	 * @generated
	 */
	EReference getMacroStepType_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.MacroStepType#getExecutionOrderId <em>Execution Order Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Order Id</em>'.
	 * @see org.plcopen.xml.tc60201.MacroStepType#getExecutionOrderId()
	 * @see #getMacroStepType()
	 * @generated
	 */
	EAttribute getMacroStepType_ExecutionOrderId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.MacroStepType#getGlobalId <em>Global Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Global Id</em>'.
	 * @see org.plcopen.xml.tc60201.MacroStepType#getGlobalId()
	 * @see #getMacroStepType()
	 * @generated
	 */
	EAttribute getMacroStepType_GlobalId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.MacroStepType#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.plcopen.xml.tc60201.MacroStepType#getHeight()
	 * @see #getMacroStepType()
	 * @generated
	 */
	EAttribute getMacroStepType_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.MacroStepType#getLocalId <em>Local Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Id</em>'.
	 * @see org.plcopen.xml.tc60201.MacroStepType#getLocalId()
	 * @see #getMacroStepType()
	 * @generated
	 */
	EAttribute getMacroStepType_LocalId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.MacroStepType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.plcopen.xml.tc60201.MacroStepType#getName()
	 * @see #getMacroStepType()
	 * @generated
	 */
	EAttribute getMacroStepType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.MacroStepType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.plcopen.xml.tc60201.MacroStepType#getWidth()
	 * @see #getMacroStepType()
	 * @generated
	 */
	EAttribute getMacroStepType_Width();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.OutputVariablesType <em>Output Variables Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Variables Type</em>'.
	 * @see org.plcopen.xml.tc60201.OutputVariablesType
	 * @generated
	 */
	EClass getOutputVariablesType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.OutputVariablesType#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable</em>'.
	 * @see org.plcopen.xml.tc60201.OutputVariablesType#getVariable()
	 * @see #getOutputVariablesType()
	 * @generated
	 */
	EReference getOutputVariablesType_Variable();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.OutputVariablesType1 <em>Output Variables Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Variables Type1</em>'.
	 * @see org.plcopen.xml.tc60201.OutputVariablesType1
	 * @generated
	 */
	EClass getOutputVariablesType1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.OutputVariablesType1#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable</em>'.
	 * @see org.plcopen.xml.tc60201.OutputVariablesType1#getVariable()
	 * @see #getOutputVariablesType1()
	 * @generated
	 */
	EReference getOutputVariablesType1_Variable();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.OutputVarsType <em>Output Vars Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Vars Type</em>'.
	 * @see org.plcopen.xml.tc60201.OutputVarsType
	 * @generated
	 */
	EClass getOutputVarsType();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.OutVariableType <em>Out Variable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Out Variable Type</em>'.
	 * @see org.plcopen.xml.tc60201.OutVariableType
	 * @generated
	 */
	EClass getOutVariableType();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.OutVariableType#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see org.plcopen.xml.tc60201.OutVariableType#getPosition()
	 * @see #getOutVariableType()
	 * @generated
	 */
	EReference getOutVariableType_Position();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.OutVariableType#getConnectionPointIn <em>Connection Point In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connection Point In</em>'.
	 * @see org.plcopen.xml.tc60201.OutVariableType#getConnectionPointIn()
	 * @see #getOutVariableType()
	 * @generated
	 */
	EReference getOutVariableType_ConnectionPointIn();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.OutVariableType#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see org.plcopen.xml.tc60201.OutVariableType#getExpression()
	 * @see #getOutVariableType()
	 * @generated
	 */
	EAttribute getOutVariableType_Expression();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.OutVariableType#getAddData <em>Add Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Data</em>'.
	 * @see org.plcopen.xml.tc60201.OutVariableType#getAddData()
	 * @see #getOutVariableType()
	 * @generated
	 */
	EReference getOutVariableType_AddData();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.OutVariableType#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see org.plcopen.xml.tc60201.OutVariableType#getDocumentation()
	 * @see #getOutVariableType()
	 * @generated
	 */
	EReference getOutVariableType_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.OutVariableType#getEdge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edge</em>'.
	 * @see org.plcopen.xml.tc60201.OutVariableType#getEdge()
	 * @see #getOutVariableType()
	 * @generated
	 */
	EAttribute getOutVariableType_Edge();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.OutVariableType#getExecutionOrderId <em>Execution Order Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Order Id</em>'.
	 * @see org.plcopen.xml.tc60201.OutVariableType#getExecutionOrderId()
	 * @see #getOutVariableType()
	 * @generated
	 */
	EAttribute getOutVariableType_ExecutionOrderId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.OutVariableType#getGlobalId <em>Global Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Global Id</em>'.
	 * @see org.plcopen.xml.tc60201.OutVariableType#getGlobalId()
	 * @see #getOutVariableType()
	 * @generated
	 */
	EAttribute getOutVariableType_GlobalId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.OutVariableType#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.plcopen.xml.tc60201.OutVariableType#getHeight()
	 * @see #getOutVariableType()
	 * @generated
	 */
	EAttribute getOutVariableType_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.OutVariableType#getLocalId <em>Local Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Id</em>'.
	 * @see org.plcopen.xml.tc60201.OutVariableType#getLocalId()
	 * @see #getOutVariableType()
	 * @generated
	 */
	EAttribute getOutVariableType_LocalId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.OutVariableType#isNegated <em>Negated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Negated</em>'.
	 * @see org.plcopen.xml.tc60201.OutVariableType#isNegated()
	 * @see #getOutVariableType()
	 * @generated
	 */
	EAttribute getOutVariableType_Negated();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.OutVariableType#getStorage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Storage</em>'.
	 * @see org.plcopen.xml.tc60201.OutVariableType#getStorage()
	 * @see #getOutVariableType()
	 * @generated
	 */
	EAttribute getOutVariableType_Storage();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.OutVariableType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.plcopen.xml.tc60201.OutVariableType#getWidth()
	 * @see #getOutVariableType()
	 * @generated
	 */
	EAttribute getOutVariableType_Width();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.PageSizeType <em>Page Size Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page Size Type</em>'.
	 * @see org.plcopen.xml.tc60201.PageSizeType
	 * @generated
	 */
	EClass getPageSizeType();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.PageSizeType#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.plcopen.xml.tc60201.PageSizeType#getX()
	 * @see #getPageSizeType()
	 * @generated
	 */
	EAttribute getPageSizeType_X();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.PageSizeType#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.plcopen.xml.tc60201.PageSizeType#getY()
	 * @see #getPageSizeType()
	 * @generated
	 */
	EAttribute getPageSizeType_Y();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.PointerType <em>Pointer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pointer Type</em>'.
	 * @see org.plcopen.xml.tc60201.PointerType
	 * @generated
	 */
	EClass getPointerType();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.PointerType#getBaseType <em>Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Base Type</em>'.
	 * @see org.plcopen.xml.tc60201.PointerType#getBaseType()
	 * @see #getPointerType()
	 * @generated
	 */
	EReference getPointerType_BaseType();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position</em>'.
	 * @see org.plcopen.xml.tc60201.Position
	 * @generated
	 */
	EClass getPosition();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.Position#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.plcopen.xml.tc60201.Position#getX()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_X();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.Position#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.plcopen.xml.tc60201.Position#getY()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_Y();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.PouInstance <em>Pou Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pou Instance</em>'.
	 * @see org.plcopen.xml.tc60201.PouInstance
	 * @generated
	 */
	EClass getPouInstance();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.PouInstance#getAddData <em>Add Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Data</em>'.
	 * @see org.plcopen.xml.tc60201.PouInstance#getAddData()
	 * @see #getPouInstance()
	 * @generated
	 */
	EReference getPouInstance_AddData();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.PouInstance#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see org.plcopen.xml.tc60201.PouInstance#getDocumentation()
	 * @see #getPouInstance()
	 * @generated
	 */
	EReference getPouInstance_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.PouInstance#getGlobalId <em>Global Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Global Id</em>'.
	 * @see org.plcopen.xml.tc60201.PouInstance#getGlobalId()
	 * @see #getPouInstance()
	 * @generated
	 */
	EAttribute getPouInstance_GlobalId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.PouInstance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.plcopen.xml.tc60201.PouInstance#getName()
	 * @see #getPouInstance()
	 * @generated
	 */
	EAttribute getPouInstance_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.PouInstance#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see org.plcopen.xml.tc60201.PouInstance#getTypeName()
	 * @see #getPouInstance()
	 * @generated
	 */
	EAttribute getPouInstance_TypeName();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.PousType <em>Pous Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pous Type</em>'.
	 * @see org.plcopen.xml.tc60201.PousType
	 * @generated
	 */
	EClass getPousType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.PousType#getPou <em>Pou</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pou</em>'.
	 * @see org.plcopen.xml.tc60201.PousType#getPou()
	 * @see #getPousType()
	 * @generated
	 */
	EReference getPousType_Pou();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.PouType1 <em>Pou Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pou Type1</em>'.
	 * @see org.plcopen.xml.tc60201.PouType1
	 * @generated
	 */
	EClass getPouType1();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.PouType1#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interface</em>'.
	 * @see org.plcopen.xml.tc60201.PouType1#getInterface()
	 * @see #getPouType1()
	 * @generated
	 */
	EReference getPouType1_Interface();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.PouType1#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Actions</em>'.
	 * @see org.plcopen.xml.tc60201.PouType1#getActions()
	 * @see #getPouType1()
	 * @generated
	 */
	EReference getPouType1_Actions();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.PouType1#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transitions</em>'.
	 * @see org.plcopen.xml.tc60201.PouType1#getTransitions()
	 * @see #getPouType1()
	 * @generated
	 */
	EReference getPouType1_Transitions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.PouType1#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body</em>'.
	 * @see org.plcopen.xml.tc60201.PouType1#getBody()
	 * @see #getPouType1()
	 * @generated
	 */
	EReference getPouType1_Body();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.PouType1#getAddData <em>Add Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Data</em>'.
	 * @see org.plcopen.xml.tc60201.PouType1#getAddData()
	 * @see #getPouType1()
	 * @generated
	 */
	EReference getPouType1_AddData();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.PouType1#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see org.plcopen.xml.tc60201.PouType1#getDocumentation()
	 * @see #getPouType1()
	 * @generated
	 */
	EReference getPouType1_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.PouType1#getGlobalId <em>Global Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Global Id</em>'.
	 * @see org.plcopen.xml.tc60201.PouType1#getGlobalId()
	 * @see #getPouType1()
	 * @generated
	 */
	EAttribute getPouType1_GlobalId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.PouType1#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.plcopen.xml.tc60201.PouType1#getName()
	 * @see #getPouType1()
	 * @generated
	 */
	EAttribute getPouType1_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.PouType1#getPouType <em>Pou Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pou Type</em>'.
	 * @see org.plcopen.xml.tc60201.PouType1#getPouType()
	 * @see #getPouType1()
	 * @generated
	 */
	EAttribute getPouType1_PouType();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.ProjectType <em>Project Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project Type</em>'.
	 * @see org.plcopen.xml.tc60201.ProjectType
	 * @generated
	 */
	EClass getProjectType();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.ProjectType#getFileHeader <em>File Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>File Header</em>'.
	 * @see org.plcopen.xml.tc60201.ProjectType#getFileHeader()
	 * @see #getProjectType()
	 * @generated
	 */
	EReference getProjectType_FileHeader();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.ProjectType#getContentHeader <em>Content Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content Header</em>'.
	 * @see org.plcopen.xml.tc60201.ProjectType#getContentHeader()
	 * @see #getProjectType()
	 * @generated
	 */
	EReference getProjectType_ContentHeader();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.ProjectType#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Types</em>'.
	 * @see org.plcopen.xml.tc60201.ProjectType#getTypes()
	 * @see #getProjectType()
	 * @generated
	 */
	EReference getProjectType_Types();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.ProjectType#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Instances</em>'.
	 * @see org.plcopen.xml.tc60201.ProjectType#getInstances()
	 * @see #getProjectType()
	 * @generated
	 */
	EReference getProjectType_Instances();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.ProjectType#getAddData <em>Add Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Data</em>'.
	 * @see org.plcopen.xml.tc60201.ProjectType#getAddData()
	 * @see #getProjectType()
	 * @generated
	 */
	EReference getProjectType_AddData();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.ProjectType#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see org.plcopen.xml.tc60201.ProjectType#getDocumentation()
	 * @see #getProjectType()
	 * @generated
	 */
	EReference getProjectType_Documentation();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.RangeSigned <em>Range Signed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range Signed</em>'.
	 * @see org.plcopen.xml.tc60201.RangeSigned
	 * @generated
	 */
	EClass getRangeSigned();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.RangeSigned#getLower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower</em>'.
	 * @see org.plcopen.xml.tc60201.RangeSigned#getLower()
	 * @see #getRangeSigned()
	 * @generated
	 */
	EAttribute getRangeSigned_Lower();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.RangeSigned#getUpper <em>Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper</em>'.
	 * @see org.plcopen.xml.tc60201.RangeSigned#getUpper()
	 * @see #getRangeSigned()
	 * @generated
	 */
	EAttribute getRangeSigned_Upper();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.RangeUnsigned <em>Range Unsigned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range Unsigned</em>'.
	 * @see org.plcopen.xml.tc60201.RangeUnsigned
	 * @generated
	 */
	EClass getRangeUnsigned();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.RangeUnsigned#getLower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower</em>'.
	 * @see org.plcopen.xml.tc60201.RangeUnsigned#getLower()
	 * @see #getRangeUnsigned()
	 * @generated
	 */
	EAttribute getRangeUnsigned_Lower();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.RangeUnsigned#getUpper <em>Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper</em>'.
	 * @see org.plcopen.xml.tc60201.RangeUnsigned#getUpper()
	 * @see #getRangeUnsigned()
	 * @generated
	 */
	EAttribute getRangeUnsigned_Upper();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.ReferenceType <em>Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Type</em>'.
	 * @see org.plcopen.xml.tc60201.ReferenceType
	 * @generated
	 */
	EClass getReferenceType();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ReferenceType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.plcopen.xml.tc60201.ReferenceType#getName()
	 * @see #getReferenceType()
	 * @generated
	 */
	EAttribute getReferenceType_Name();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.ReferenceType1 <em>Reference Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Type1</em>'.
	 * @see org.plcopen.xml.tc60201.ReferenceType1
	 * @generated
	 */
	EClass getReferenceType1();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ReferenceType1#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.plcopen.xml.tc60201.ReferenceType1#getName()
	 * @see #getReferenceType1()
	 * @generated
	 */
	EAttribute getReferenceType1_Name();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.ResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Type</em>'.
	 * @see org.plcopen.xml.tc60201.ResourceType
	 * @generated
	 */
	EClass getResourceType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.ResourceType#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task</em>'.
	 * @see org.plcopen.xml.tc60201.ResourceType#getTask()
	 * @see #getResourceType()
	 * @generated
	 */
	EReference getResourceType_Task();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.ResourceType#getGlobalVars <em>Global Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Global Vars</em>'.
	 * @see org.plcopen.xml.tc60201.ResourceType#getGlobalVars()
	 * @see #getResourceType()
	 * @generated
	 */
	EReference getResourceType_GlobalVars();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.ResourceType#getPouInstance <em>Pou Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pou Instance</em>'.
	 * @see org.plcopen.xml.tc60201.ResourceType#getPouInstance()
	 * @see #getResourceType()
	 * @generated
	 */
	EReference getResourceType_PouInstance();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.ResourceType#getAddData <em>Add Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Data</em>'.
	 * @see org.plcopen.xml.tc60201.ResourceType#getAddData()
	 * @see #getResourceType()
	 * @generated
	 */
	EReference getResourceType_AddData();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.ResourceType#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see org.plcopen.xml.tc60201.ResourceType#getDocumentation()
	 * @see #getResourceType()
	 * @generated
	 */
	EReference getResourceType_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ResourceType#getGlobalId <em>Global Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Global Id</em>'.
	 * @see org.plcopen.xml.tc60201.ResourceType#getGlobalId()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_GlobalId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ResourceType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.plcopen.xml.tc60201.ResourceType#getName()
	 * @see #getResourceType()
	 * @generated
	 */
	EAttribute getResourceType_Name();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.ReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Type</em>'.
	 * @see org.plcopen.xml.tc60201.ReturnType
	 * @generated
	 */
	EClass getReturnType();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.ReturnType#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see org.plcopen.xml.tc60201.ReturnType#getPosition()
	 * @see #getReturnType()
	 * @generated
	 */
	EReference getReturnType_Position();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.ReturnType#getConnectionPointIn <em>Connection Point In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connection Point In</em>'.
	 * @see org.plcopen.xml.tc60201.ReturnType#getConnectionPointIn()
	 * @see #getReturnType()
	 * @generated
	 */
	EReference getReturnType_ConnectionPointIn();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.ReturnType#getAddData <em>Add Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Data</em>'.
	 * @see org.plcopen.xml.tc60201.ReturnType#getAddData()
	 * @see #getReturnType()
	 * @generated
	 */
	EReference getReturnType_AddData();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.ReturnType#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see org.plcopen.xml.tc60201.ReturnType#getDocumentation()
	 * @see #getReturnType()
	 * @generated
	 */
	EReference getReturnType_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ReturnType#getExecutionOrderId <em>Execution Order Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Order Id</em>'.
	 * @see org.plcopen.xml.tc60201.ReturnType#getExecutionOrderId()
	 * @see #getReturnType()
	 * @generated
	 */
	EAttribute getReturnType_ExecutionOrderId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ReturnType#getGlobalId <em>Global Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Global Id</em>'.
	 * @see org.plcopen.xml.tc60201.ReturnType#getGlobalId()
	 * @see #getReturnType()
	 * @generated
	 */
	EAttribute getReturnType_GlobalId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ReturnType#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.plcopen.xml.tc60201.ReturnType#getHeight()
	 * @see #getReturnType()
	 * @generated
	 */
	EAttribute getReturnType_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ReturnType#getLocalId <em>Local Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Id</em>'.
	 * @see org.plcopen.xml.tc60201.ReturnType#getLocalId()
	 * @see #getReturnType()
	 * @generated
	 */
	EAttribute getReturnType_LocalId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ReturnType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.plcopen.xml.tc60201.ReturnType#getWidth()
	 * @see #getReturnType()
	 * @generated
	 */
	EAttribute getReturnType_Width();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.RightPowerRailType <em>Right Power Rail Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Right Power Rail Type</em>'.
	 * @see org.plcopen.xml.tc60201.RightPowerRailType
	 * @generated
	 */
	EClass getRightPowerRailType();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.RightPowerRailType#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see org.plcopen.xml.tc60201.RightPowerRailType#getPosition()
	 * @see #getRightPowerRailType()
	 * @generated
	 */
	EReference getRightPowerRailType_Position();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.RightPowerRailType#getConnectionPointIn <em>Connection Point In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connection Point In</em>'.
	 * @see org.plcopen.xml.tc60201.RightPowerRailType#getConnectionPointIn()
	 * @see #getRightPowerRailType()
	 * @generated
	 */
	EReference getRightPowerRailType_ConnectionPointIn();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.RightPowerRailType#getAddData <em>Add Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Data</em>'.
	 * @see org.plcopen.xml.tc60201.RightPowerRailType#getAddData()
	 * @see #getRightPowerRailType()
	 * @generated
	 */
	EReference getRightPowerRailType_AddData();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.RightPowerRailType#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see org.plcopen.xml.tc60201.RightPowerRailType#getDocumentation()
	 * @see #getRightPowerRailType()
	 * @generated
	 */
	EReference getRightPowerRailType_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.RightPowerRailType#getExecutionOrderId <em>Execution Order Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Order Id</em>'.
	 * @see org.plcopen.xml.tc60201.RightPowerRailType#getExecutionOrderId()
	 * @see #getRightPowerRailType()
	 * @generated
	 */
	EAttribute getRightPowerRailType_ExecutionOrderId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.RightPowerRailType#getGlobalId <em>Global Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Global Id</em>'.
	 * @see org.plcopen.xml.tc60201.RightPowerRailType#getGlobalId()
	 * @see #getRightPowerRailType()
	 * @generated
	 */
	EAttribute getRightPowerRailType_GlobalId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.RightPowerRailType#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.plcopen.xml.tc60201.RightPowerRailType#getHeight()
	 * @see #getRightPowerRailType()
	 * @generated
	 */
	EAttribute getRightPowerRailType_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.RightPowerRailType#getLocalId <em>Local Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Id</em>'.
	 * @see org.plcopen.xml.tc60201.RightPowerRailType#getLocalId()
	 * @see #getRightPowerRailType()
	 * @generated
	 */
	EAttribute getRightPowerRailType_LocalId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.RightPowerRailType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.plcopen.xml.tc60201.RightPowerRailType#getWidth()
	 * @see #getRightPowerRailType()
	 * @generated
	 */
	EAttribute getRightPowerRailType_Width();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.ScalingType <em>Scaling Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scaling Type</em>'.
	 * @see org.plcopen.xml.tc60201.ScalingType
	 * @generated
	 */
	EClass getScalingType();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ScalingType#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.plcopen.xml.tc60201.ScalingType#getX()
	 * @see #getScalingType()
	 * @generated
	 */
	EAttribute getScalingType_X();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ScalingType#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.plcopen.xml.tc60201.ScalingType#getY()
	 * @see #getScalingType()
	 * @generated
	 */
	EAttribute getScalingType_Y();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.ScalingType1 <em>Scaling Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scaling Type1</em>'.
	 * @see org.plcopen.xml.tc60201.ScalingType1
	 * @generated
	 */
	EClass getScalingType1();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ScalingType1#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.plcopen.xml.tc60201.ScalingType1#getX()
	 * @see #getScalingType1()
	 * @generated
	 */
	EAttribute getScalingType1_X();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ScalingType1#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.plcopen.xml.tc60201.ScalingType1#getY()
	 * @see #getScalingType1()
	 * @generated
	 */
	EAttribute getScalingType1_Y();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.ScalingType2 <em>Scaling Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scaling Type2</em>'.
	 * @see org.plcopen.xml.tc60201.ScalingType2
	 * @generated
	 */
	EClass getScalingType2();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ScalingType2#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.plcopen.xml.tc60201.ScalingType2#getX()
	 * @see #getScalingType2()
	 * @generated
	 */
	EAttribute getScalingType2_X();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ScalingType2#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.plcopen.xml.tc60201.ScalingType2#getY()
	 * @see #getScalingType2()
	 * @generated
	 */
	EAttribute getScalingType2_Y();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.SelectionConvergenceType <em>Selection Convergence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selection Convergence Type</em>'.
	 * @see org.plcopen.xml.tc60201.SelectionConvergenceType
	 * @generated
	 */
	EClass getSelectionConvergenceType();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.SelectionConvergenceType#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see org.plcopen.xml.tc60201.SelectionConvergenceType#getPosition()
	 * @see #getSelectionConvergenceType()
	 * @generated
	 */
	EReference getSelectionConvergenceType_Position();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.SelectionConvergenceType#getConnectionPointIn <em>Connection Point In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connection Point In</em>'.
	 * @see org.plcopen.xml.tc60201.SelectionConvergenceType#getConnectionPointIn()
	 * @see #getSelectionConvergenceType()
	 * @generated
	 */
	EReference getSelectionConvergenceType_ConnectionPointIn();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.SelectionConvergenceType#getConnectionPointOut <em>Connection Point Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connection Point Out</em>'.
	 * @see org.plcopen.xml.tc60201.SelectionConvergenceType#getConnectionPointOut()
	 * @see #getSelectionConvergenceType()
	 * @generated
	 */
	EReference getSelectionConvergenceType_ConnectionPointOut();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.SelectionConvergenceType#getAddData <em>Add Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Data</em>'.
	 * @see org.plcopen.xml.tc60201.SelectionConvergenceType#getAddData()
	 * @see #getSelectionConvergenceType()
	 * @generated
	 */
	EReference getSelectionConvergenceType_AddData();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.SelectionConvergenceType#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see org.plcopen.xml.tc60201.SelectionConvergenceType#getDocumentation()
	 * @see #getSelectionConvergenceType()
	 * @generated
	 */
	EReference getSelectionConvergenceType_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.SelectionConvergenceType#getGlobalId <em>Global Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Global Id</em>'.
	 * @see org.plcopen.xml.tc60201.SelectionConvergenceType#getGlobalId()
	 * @see #getSelectionConvergenceType()
	 * @generated
	 */
	EAttribute getSelectionConvergenceType_GlobalId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.SelectionConvergenceType#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.plcopen.xml.tc60201.SelectionConvergenceType#getHeight()
	 * @see #getSelectionConvergenceType()
	 * @generated
	 */
	EAttribute getSelectionConvergenceType_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.SelectionConvergenceType#getLocalId <em>Local Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Id</em>'.
	 * @see org.plcopen.xml.tc60201.SelectionConvergenceType#getLocalId()
	 * @see #getSelectionConvergenceType()
	 * @generated
	 */
	EAttribute getSelectionConvergenceType_LocalId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.SelectionConvergenceType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.plcopen.xml.tc60201.SelectionConvergenceType#getWidth()
	 * @see #getSelectionConvergenceType()
	 * @generated
	 */
	EAttribute getSelectionConvergenceType_Width();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.SelectionDivergenceType <em>Selection Divergence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selection Divergence Type</em>'.
	 * @see org.plcopen.xml.tc60201.SelectionDivergenceType
	 * @generated
	 */
	EClass getSelectionDivergenceType();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.SelectionDivergenceType#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see org.plcopen.xml.tc60201.SelectionDivergenceType#getPosition()
	 * @see #getSelectionDivergenceType()
	 * @generated
	 */
	EReference getSelectionDivergenceType_Position();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.SelectionDivergenceType#getConnectionPointIn <em>Connection Point In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connection Point In</em>'.
	 * @see org.plcopen.xml.tc60201.SelectionDivergenceType#getConnectionPointIn()
	 * @see #getSelectionDivergenceType()
	 * @generated
	 */
	EReference getSelectionDivergenceType_ConnectionPointIn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.SelectionDivergenceType#getConnectionPointOut <em>Connection Point Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connection Point Out</em>'.
	 * @see org.plcopen.xml.tc60201.SelectionDivergenceType#getConnectionPointOut()
	 * @see #getSelectionDivergenceType()
	 * @generated
	 */
	EReference getSelectionDivergenceType_ConnectionPointOut();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.SelectionDivergenceType#getAddData <em>Add Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Data</em>'.
	 * @see org.plcopen.xml.tc60201.SelectionDivergenceType#getAddData()
	 * @see #getSelectionDivergenceType()
	 * @generated
	 */
	EReference getSelectionDivergenceType_AddData();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.SelectionDivergenceType#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see org.plcopen.xml.tc60201.SelectionDivergenceType#getDocumentation()
	 * @see #getSelectionDivergenceType()
	 * @generated
	 */
	EReference getSelectionDivergenceType_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.SelectionDivergenceType#getGlobalId <em>Global Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Global Id</em>'.
	 * @see org.plcopen.xml.tc60201.SelectionDivergenceType#getGlobalId()
	 * @see #getSelectionDivergenceType()
	 * @generated
	 */
	EAttribute getSelectionDivergenceType_GlobalId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.SelectionDivergenceType#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.plcopen.xml.tc60201.SelectionDivergenceType#getHeight()
	 * @see #getSelectionDivergenceType()
	 * @generated
	 */
	EAttribute getSelectionDivergenceType_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.SelectionDivergenceType#getLocalId <em>Local Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Id</em>'.
	 * @see org.plcopen.xml.tc60201.SelectionDivergenceType#getLocalId()
	 * @see #getSelectionDivergenceType()
	 * @generated
	 */
	EAttribute getSelectionDivergenceType_LocalId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.SelectionDivergenceType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.plcopen.xml.tc60201.SelectionDivergenceType#getWidth()
	 * @see #getSelectionDivergenceType()
	 * @generated
	 */
	EAttribute getSelectionDivergenceType_Width();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.SfcType <em>Sfc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sfc Type</em>'.
	 * @see org.plcopen.xml.tc60201.SfcType
	 * @generated
	 */
	EClass getSfcType();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.SfcType#getScaling <em>Scaling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scaling</em>'.
	 * @see org.plcopen.xml.tc60201.SfcType#getScaling()
	 * @see #getSfcType()
	 * @generated
	 */
	EReference getSfcType_Scaling();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.SFCType1 <em>SFC Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SFC Type1</em>'.
	 * @see org.plcopen.xml.tc60201.SFCType1
	 * @generated
	 */
	EClass getSFCType1();

	/**
	 * Returns the meta object for the attribute list '{@link org.plcopen.xml.tc60201.SFCType1#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.plcopen.xml.tc60201.SFCType1#getGroup()
	 * @see #getSFCType1()
	 * @generated
	 */
	EAttribute getSFCType1_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.SFCType1#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comment</em>'.
	 * @see org.plcopen.xml.tc60201.SFCType1#getComment()
	 * @see #getSFCType1()
	 * @generated
	 */
	EReference getSFCType1_Comment();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.SFCType1#getError <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Error</em>'.
	 * @see org.plcopen.xml.tc60201.SFCType1#getError()
	 * @see #getSFCType1()
	 * @generated
	 */
	EReference getSFCType1_Error();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.SFCType1#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connector</em>'.
	 * @see org.plcopen.xml.tc60201.SFCType1#getConnector()
	 * @see #getSFCType1()
	 * @generated
	 */
	EReference getSFCType1_Connector();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.SFCType1#getContinuation <em>Continuation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Continuation</em>'.
	 * @see org.plcopen.xml.tc60201.SFCType1#getContinuation()
	 * @see #getSFCType1()
	 * @generated
	 */
	EReference getSFCType1_Continuation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.SFCType1#getActionBlock <em>Action Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action Block</em>'.
	 * @see org.plcopen.xml.tc60201.SFCType1#getActionBlock()
	 * @see #getSFCType1()
	 * @generated
	 */
	EReference getSFCType1_ActionBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.SFCType1#getVendorElement <em>Vendor Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vendor Element</em>'.
	 * @see org.plcopen.xml.tc60201.SFCType1#getVendorElement()
	 * @see #getSFCType1()
	 * @generated
	 */
	EReference getSFCType1_VendorElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.SFCType1#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Block</em>'.
	 * @see org.plcopen.xml.tc60201.SFCType1#getBlock()
	 * @see #getSFCType1()
	 * @generated
	 */
	EReference getSFCType1_Block();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.SFCType1#getInVariable <em>In Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>In Variable</em>'.
	 * @see org.plcopen.xml.tc60201.SFCType1#getInVariable()
	 * @see #getSFCType1()
	 * @generated
	 */
	EReference getSFCType1_InVariable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.SFCType1#getOutVariable <em>Out Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Out Variable</em>'.
	 * @see org.plcopen.xml.tc60201.SFCType1#getOutVariable()
	 * @see #getSFCType1()
	 * @generated
	 */
	EReference getSFCType1_OutVariable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.SFCType1#getInOutVariable <em>In Out Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>In Out Variable</em>'.
	 * @see org.plcopen.xml.tc60201.SFCType1#getInOutVariable()
	 * @see #getSFCType1()
	 * @generated
	 */
	EReference getSFCType1_InOutVariable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.SFCType1#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see org.plcopen.xml.tc60201.SFCType1#getLabel()
	 * @see #getSFCType1()
	 * @generated
	 */
	EReference getSFCType1_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.SFCType1#getJump <em>Jump</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Jump</em>'.
	 * @see org.plcopen.xml.tc60201.SFCType1#getJump()
	 * @see #getSFCType1()
	 * @generated
	 */
	EReference getSFCType1_Jump();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.SFCType1#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Return</em>'.
	 * @see org.plcopen.xml.tc60201.SFCType1#getReturn()
	 * @see #getSFCType1()
	 * @generated
	 */
	EReference getSFCType1_Return();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.SFCType1#getLeftPowerRail <em>Left Power Rail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Left Power Rail</em>'.
	 * @see org.plcopen.xml.tc60201.SFCType1#getLeftPowerRail()
	 * @see #getSFCType1()
	 * @generated
	 */
	EReference getSFCType1_LeftPowerRail();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.SFCType1#getRightPowerRail <em>Right Power Rail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Right Power Rail</em>'.
	 * @see org.plcopen.xml.tc60201.SFCType1#getRightPowerRail()
	 * @see #getSFCType1()
	 * @generated
	 */
	EReference getSFCType1_RightPowerRail();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.SFCType1#getCoil <em>Coil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Coil</em>'.
	 * @see org.plcopen.xml.tc60201.SFCType1#getCoil()
	 * @see #getSFCType1()
	 * @generated
	 */
	EReference getSFCType1_Coil();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.SFCType1#getContact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contact</em>'.
	 * @see org.plcopen.xml.tc60201.SFCType1#getContact()
	 * @see #getSFCType1()
	 * @generated
	 */
	EReference getSFCType1_Contact();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.SFCType1#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Step</em>'.
	 * @see org.plcopen.xml.tc60201.SFCType1#getStep()
	 * @see #getSFCType1()
	 * @generated
	 */
	EReference getSFCType1_Step();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.SFCType1#getMacroStep <em>Macro Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Macro Step</em>'.
	 * @see org.plcopen.xml.tc60201.SFCType1#getMacroStep()
	 * @see #getSFCType1()
	 * @generated
	 */
	EReference getSFCType1_MacroStep();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.SFCType1#getJumpStep <em>Jump Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Jump Step</em>'.
	 * @see org.plcopen.xml.tc60201.SFCType1#getJumpStep()
	 * @see #getSFCType1()
	 * @generated
	 */
	EReference getSFCType1_JumpStep();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.SFCType1#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transition</em>'.
	 * @see org.plcopen.xml.tc60201.SFCType1#getTransition()
	 * @see #getSFCType1()
	 * @generated
	 */
	EReference getSFCType1_Transition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.SFCType1#getSelectionDivergence <em>Selection Divergence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Selection Divergence</em>'.
	 * @see org.plcopen.xml.tc60201.SFCType1#getSelectionDivergence()
	 * @see #getSFCType1()
	 * @generated
	 */
	EReference getSFCType1_SelectionDivergence();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.SFCType1#getSelectionConvergence <em>Selection Convergence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Selection Convergence</em>'.
	 * @see org.plcopen.xml.tc60201.SFCType1#getSelectionConvergence()
	 * @see #getSFCType1()
	 * @generated
	 */
	EReference getSFCType1_SelectionConvergence();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.SFCType1#getSimultaneousDivergence <em>Simultaneous Divergence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Simultaneous Divergence</em>'.
	 * @see org.plcopen.xml.tc60201.SFCType1#getSimultaneousDivergence()
	 * @see #getSFCType1()
	 * @generated
	 */
	EReference getSFCType1_SimultaneousDivergence();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.SFCType1#getSimultaneousConvergence <em>Simultaneous Convergence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Simultaneous Convergence</em>'.
	 * @see org.plcopen.xml.tc60201.SFCType1#getSimultaneousConvergence()
	 * @see #getSFCType1()
	 * @generated
	 */
	EReference getSFCType1_SimultaneousConvergence();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.SimpleValueType <em>Simple Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Value Type</em>'.
	 * @see org.plcopen.xml.tc60201.SimpleValueType
	 * @generated
	 */
	EClass getSimpleValueType();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.SimpleValueType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.plcopen.xml.tc60201.SimpleValueType#getValue()
	 * @see #getSimpleValueType()
	 * @generated
	 */
	EAttribute getSimpleValueType_Value();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.SimultaneousConvergenceType <em>Simultaneous Convergence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simultaneous Convergence Type</em>'.
	 * @see org.plcopen.xml.tc60201.SimultaneousConvergenceType
	 * @generated
	 */
	EClass getSimultaneousConvergenceType();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.SimultaneousConvergenceType#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see org.plcopen.xml.tc60201.SimultaneousConvergenceType#getPosition()
	 * @see #getSimultaneousConvergenceType()
	 * @generated
	 */
	EReference getSimultaneousConvergenceType_Position();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.SimultaneousConvergenceType#getConnectionPointIn <em>Connection Point In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connection Point In</em>'.
	 * @see org.plcopen.xml.tc60201.SimultaneousConvergenceType#getConnectionPointIn()
	 * @see #getSimultaneousConvergenceType()
	 * @generated
	 */
	EReference getSimultaneousConvergenceType_ConnectionPointIn();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.SimultaneousConvergenceType#getConnectionPointOut <em>Connection Point Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connection Point Out</em>'.
	 * @see org.plcopen.xml.tc60201.SimultaneousConvergenceType#getConnectionPointOut()
	 * @see #getSimultaneousConvergenceType()
	 * @generated
	 */
	EReference getSimultaneousConvergenceType_ConnectionPointOut();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.SimultaneousConvergenceType#getAddData <em>Add Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Data</em>'.
	 * @see org.plcopen.xml.tc60201.SimultaneousConvergenceType#getAddData()
	 * @see #getSimultaneousConvergenceType()
	 * @generated
	 */
	EReference getSimultaneousConvergenceType_AddData();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.SimultaneousConvergenceType#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see org.plcopen.xml.tc60201.SimultaneousConvergenceType#getDocumentation()
	 * @see #getSimultaneousConvergenceType()
	 * @generated
	 */
	EReference getSimultaneousConvergenceType_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.SimultaneousConvergenceType#getGlobalId <em>Global Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Global Id</em>'.
	 * @see org.plcopen.xml.tc60201.SimultaneousConvergenceType#getGlobalId()
	 * @see #getSimultaneousConvergenceType()
	 * @generated
	 */
	EAttribute getSimultaneousConvergenceType_GlobalId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.SimultaneousConvergenceType#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.plcopen.xml.tc60201.SimultaneousConvergenceType#getHeight()
	 * @see #getSimultaneousConvergenceType()
	 * @generated
	 */
	EAttribute getSimultaneousConvergenceType_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.SimultaneousConvergenceType#getLocalId <em>Local Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Id</em>'.
	 * @see org.plcopen.xml.tc60201.SimultaneousConvergenceType#getLocalId()
	 * @see #getSimultaneousConvergenceType()
	 * @generated
	 */
	EAttribute getSimultaneousConvergenceType_LocalId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.SimultaneousConvergenceType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.plcopen.xml.tc60201.SimultaneousConvergenceType#getWidth()
	 * @see #getSimultaneousConvergenceType()
	 * @generated
	 */
	EAttribute getSimultaneousConvergenceType_Width();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.SimultaneousDivergenceType <em>Simultaneous Divergence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simultaneous Divergence Type</em>'.
	 * @see org.plcopen.xml.tc60201.SimultaneousDivergenceType
	 * @generated
	 */
	EClass getSimultaneousDivergenceType();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.SimultaneousDivergenceType#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see org.plcopen.xml.tc60201.SimultaneousDivergenceType#getPosition()
	 * @see #getSimultaneousDivergenceType()
	 * @generated
	 */
	EReference getSimultaneousDivergenceType_Position();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.SimultaneousDivergenceType#getConnectionPointIn <em>Connection Point In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connection Point In</em>'.
	 * @see org.plcopen.xml.tc60201.SimultaneousDivergenceType#getConnectionPointIn()
	 * @see #getSimultaneousDivergenceType()
	 * @generated
	 */
	EReference getSimultaneousDivergenceType_ConnectionPointIn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.SimultaneousDivergenceType#getConnectionPointOut <em>Connection Point Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connection Point Out</em>'.
	 * @see org.plcopen.xml.tc60201.SimultaneousDivergenceType#getConnectionPointOut()
	 * @see #getSimultaneousDivergenceType()
	 * @generated
	 */
	EReference getSimultaneousDivergenceType_ConnectionPointOut();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.SimultaneousDivergenceType#getAddData <em>Add Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Data</em>'.
	 * @see org.plcopen.xml.tc60201.SimultaneousDivergenceType#getAddData()
	 * @see #getSimultaneousDivergenceType()
	 * @generated
	 */
	EReference getSimultaneousDivergenceType_AddData();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.SimultaneousDivergenceType#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see org.plcopen.xml.tc60201.SimultaneousDivergenceType#getDocumentation()
	 * @see #getSimultaneousDivergenceType()
	 * @generated
	 */
	EReference getSimultaneousDivergenceType_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.SimultaneousDivergenceType#getGlobalId <em>Global Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Global Id</em>'.
	 * @see org.plcopen.xml.tc60201.SimultaneousDivergenceType#getGlobalId()
	 * @see #getSimultaneousDivergenceType()
	 * @generated
	 */
	EAttribute getSimultaneousDivergenceType_GlobalId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.SimultaneousDivergenceType#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.plcopen.xml.tc60201.SimultaneousDivergenceType#getHeight()
	 * @see #getSimultaneousDivergenceType()
	 * @generated
	 */
	EAttribute getSimultaneousDivergenceType_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.SimultaneousDivergenceType#getLocalId <em>Local Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Id</em>'.
	 * @see org.plcopen.xml.tc60201.SimultaneousDivergenceType#getLocalId()
	 * @see #getSimultaneousDivergenceType()
	 * @generated
	 */
	EAttribute getSimultaneousDivergenceType_LocalId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.SimultaneousDivergenceType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.plcopen.xml.tc60201.SimultaneousDivergenceType#getName()
	 * @see #getSimultaneousDivergenceType()
	 * @generated
	 */
	EAttribute getSimultaneousDivergenceType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.SimultaneousDivergenceType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.plcopen.xml.tc60201.SimultaneousDivergenceType#getWidth()
	 * @see #getSimultaneousDivergenceType()
	 * @generated
	 */
	EAttribute getSimultaneousDivergenceType_Width();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.StepType <em>Step Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step Type</em>'.
	 * @see org.plcopen.xml.tc60201.StepType
	 * @generated
	 */
	EClass getStepType();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.StepType#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see org.plcopen.xml.tc60201.StepType#getPosition()
	 * @see #getStepType()
	 * @generated
	 */
	EReference getStepType_Position();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.StepType#getConnectionPointIn <em>Connection Point In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connection Point In</em>'.
	 * @see org.plcopen.xml.tc60201.StepType#getConnectionPointIn()
	 * @see #getStepType()
	 * @generated
	 */
	EReference getStepType_ConnectionPointIn();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.StepType#getConnectionPointOut <em>Connection Point Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connection Point Out</em>'.
	 * @see org.plcopen.xml.tc60201.StepType#getConnectionPointOut()
	 * @see #getStepType()
	 * @generated
	 */
	EReference getStepType_ConnectionPointOut();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.StepType#getConnectionPointOutAction <em>Connection Point Out Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connection Point Out Action</em>'.
	 * @see org.plcopen.xml.tc60201.StepType#getConnectionPointOutAction()
	 * @see #getStepType()
	 * @generated
	 */
	EReference getStepType_ConnectionPointOutAction();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.StepType#getAddData <em>Add Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Data</em>'.
	 * @see org.plcopen.xml.tc60201.StepType#getAddData()
	 * @see #getStepType()
	 * @generated
	 */
	EReference getStepType_AddData();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.StepType#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see org.plcopen.xml.tc60201.StepType#getDocumentation()
	 * @see #getStepType()
	 * @generated
	 */
	EReference getStepType_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.StepType#getExecutionOrderId <em>Execution Order Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Order Id</em>'.
	 * @see org.plcopen.xml.tc60201.StepType#getExecutionOrderId()
	 * @see #getStepType()
	 * @generated
	 */
	EAttribute getStepType_ExecutionOrderId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.StepType#getGlobalId <em>Global Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Global Id</em>'.
	 * @see org.plcopen.xml.tc60201.StepType#getGlobalId()
	 * @see #getStepType()
	 * @generated
	 */
	EAttribute getStepType_GlobalId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.StepType#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.plcopen.xml.tc60201.StepType#getHeight()
	 * @see #getStepType()
	 * @generated
	 */
	EAttribute getStepType_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.StepType#isInitialStep <em>Initial Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Step</em>'.
	 * @see org.plcopen.xml.tc60201.StepType#isInitialStep()
	 * @see #getStepType()
	 * @generated
	 */
	EAttribute getStepType_InitialStep();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.StepType#getLocalId <em>Local Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Id</em>'.
	 * @see org.plcopen.xml.tc60201.StepType#getLocalId()
	 * @see #getStepType()
	 * @generated
	 */
	EAttribute getStepType_LocalId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.StepType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.plcopen.xml.tc60201.StepType#getName()
	 * @see #getStepType()
	 * @generated
	 */
	EAttribute getStepType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.StepType#isNegated <em>Negated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Negated</em>'.
	 * @see org.plcopen.xml.tc60201.StepType#isNegated()
	 * @see #getStepType()
	 * @generated
	 */
	EAttribute getStepType_Negated();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.StepType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.plcopen.xml.tc60201.StepType#getWidth()
	 * @see #getStepType()
	 * @generated
	 */
	EAttribute getStepType_Width();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.StringType <em>String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Type</em>'.
	 * @see org.plcopen.xml.tc60201.StringType
	 * @generated
	 */
	EClass getStringType();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.StringType#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.plcopen.xml.tc60201.StringType#getLength()
	 * @see #getStringType()
	 * @generated
	 */
	EAttribute getStringType_Length();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.StructValueType <em>Struct Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Struct Value Type</em>'.
	 * @see org.plcopen.xml.tc60201.StructValueType
	 * @generated
	 */
	EClass getStructValueType();

	/**
	 * Returns the meta object for the attribute list '{@link org.plcopen.xml.tc60201.StructValueType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.plcopen.xml.tc60201.StructValueType#getGroup()
	 * @see #getStructValueType()
	 * @generated
	 */
	EAttribute getStructValueType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.StructValueType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see org.plcopen.xml.tc60201.StructValueType#getValue()
	 * @see #getStructValueType()
	 * @generated
	 */
	EReference getStructValueType_Value();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.SubrangeSignedType <em>Subrange Signed Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subrange Signed Type</em>'.
	 * @see org.plcopen.xml.tc60201.SubrangeSignedType
	 * @generated
	 */
	EClass getSubrangeSignedType();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.SubrangeSignedType#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see org.plcopen.xml.tc60201.SubrangeSignedType#getRange()
	 * @see #getSubrangeSignedType()
	 * @generated
	 */
	EReference getSubrangeSignedType_Range();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.SubrangeSignedType#getBaseType <em>Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Base Type</em>'.
	 * @see org.plcopen.xml.tc60201.SubrangeSignedType#getBaseType()
	 * @see #getSubrangeSignedType()
	 * @generated
	 */
	EReference getSubrangeSignedType_BaseType();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.SubrangeUnsignedType <em>Subrange Unsigned Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subrange Unsigned Type</em>'.
	 * @see org.plcopen.xml.tc60201.SubrangeUnsignedType
	 * @generated
	 */
	EClass getSubrangeUnsignedType();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.SubrangeUnsignedType#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see org.plcopen.xml.tc60201.SubrangeUnsignedType#getRange()
	 * @see #getSubrangeUnsignedType()
	 * @generated
	 */
	EReference getSubrangeUnsignedType_Range();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.SubrangeUnsignedType#getBaseType <em>Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Base Type</em>'.
	 * @see org.plcopen.xml.tc60201.SubrangeUnsignedType#getBaseType()
	 * @see #getSubrangeUnsignedType()
	 * @generated
	 */
	EReference getSubrangeUnsignedType_BaseType();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.TaskType <em>Task Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Type</em>'.
	 * @see org.plcopen.xml.tc60201.TaskType
	 * @generated
	 */
	EClass getTaskType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.TaskType#getPouInstance <em>Pou Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pou Instance</em>'.
	 * @see org.plcopen.xml.tc60201.TaskType#getPouInstance()
	 * @see #getTaskType()
	 * @generated
	 */
	EReference getTaskType_PouInstance();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.TaskType#getAddData <em>Add Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Data</em>'.
	 * @see org.plcopen.xml.tc60201.TaskType#getAddData()
	 * @see #getTaskType()
	 * @generated
	 */
	EReference getTaskType_AddData();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.TaskType#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see org.plcopen.xml.tc60201.TaskType#getDocumentation()
	 * @see #getTaskType()
	 * @generated
	 */
	EReference getTaskType_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.TaskType#getGlobalId <em>Global Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Global Id</em>'.
	 * @see org.plcopen.xml.tc60201.TaskType#getGlobalId()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_GlobalId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.TaskType#getInterval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interval</em>'.
	 * @see org.plcopen.xml.tc60201.TaskType#getInterval()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_Interval();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.TaskType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.plcopen.xml.tc60201.TaskType#getName()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.TaskType#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see org.plcopen.xml.tc60201.TaskType#getPriority()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_Priority();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.TaskType#getSingle <em>Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Single</em>'.
	 * @see org.plcopen.xml.tc60201.TaskType#getSingle()
	 * @see #getTaskType()
	 * @generated
	 */
	EAttribute getTaskType_Single();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.TempVarsType <em>Temp Vars Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temp Vars Type</em>'.
	 * @see org.plcopen.xml.tc60201.TempVarsType
	 * @generated
	 */
	EClass getTempVarsType();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.TransitionsType <em>Transitions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transitions Type</em>'.
	 * @see org.plcopen.xml.tc60201.TransitionsType
	 * @generated
	 */
	EClass getTransitionsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.TransitionsType#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transition</em>'.
	 * @see org.plcopen.xml.tc60201.TransitionsType#getTransition()
	 * @see #getTransitionsType()
	 * @generated
	 */
	EReference getTransitionsType_Transition();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.TransitionType <em>Transition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Type</em>'.
	 * @see org.plcopen.xml.tc60201.TransitionType
	 * @generated
	 */
	EClass getTransitionType();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.TransitionType#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.plcopen.xml.tc60201.TransitionType#getBody()
	 * @see #getTransitionType()
	 * @generated
	 */
	EReference getTransitionType_Body();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.TransitionType#getAddData <em>Add Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Data</em>'.
	 * @see org.plcopen.xml.tc60201.TransitionType#getAddData()
	 * @see #getTransitionType()
	 * @generated
	 */
	EReference getTransitionType_AddData();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.TransitionType#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see org.plcopen.xml.tc60201.TransitionType#getDocumentation()
	 * @see #getTransitionType()
	 * @generated
	 */
	EReference getTransitionType_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.TransitionType#getGlobalId <em>Global Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Global Id</em>'.
	 * @see org.plcopen.xml.tc60201.TransitionType#getGlobalId()
	 * @see #getTransitionType()
	 * @generated
	 */
	EAttribute getTransitionType_GlobalId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.TransitionType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.plcopen.xml.tc60201.TransitionType#getName()
	 * @see #getTransitionType()
	 * @generated
	 */
	EAttribute getTransitionType_Name();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.TransitionType1 <em>Transition Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Type1</em>'.
	 * @see org.plcopen.xml.tc60201.TransitionType1
	 * @generated
	 */
	EClass getTransitionType1();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.TransitionType1#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see org.plcopen.xml.tc60201.TransitionType1#getPosition()
	 * @see #getTransitionType1()
	 * @generated
	 */
	EReference getTransitionType1_Position();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.TransitionType1#getConnectionPointIn <em>Connection Point In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connection Point In</em>'.
	 * @see org.plcopen.xml.tc60201.TransitionType1#getConnectionPointIn()
	 * @see #getTransitionType1()
	 * @generated
	 */
	EReference getTransitionType1_ConnectionPointIn();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.TransitionType1#getConnectionPointOut <em>Connection Point Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connection Point Out</em>'.
	 * @see org.plcopen.xml.tc60201.TransitionType1#getConnectionPointOut()
	 * @see #getTransitionType1()
	 * @generated
	 */
	EReference getTransitionType1_ConnectionPointOut();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.TransitionType1#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.plcopen.xml.tc60201.TransitionType1#getCondition()
	 * @see #getTransitionType1()
	 * @generated
	 */
	EReference getTransitionType1_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.TransitionType1#getAddData <em>Add Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Data</em>'.
	 * @see org.plcopen.xml.tc60201.TransitionType1#getAddData()
	 * @see #getTransitionType1()
	 * @generated
	 */
	EReference getTransitionType1_AddData();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.TransitionType1#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see org.plcopen.xml.tc60201.TransitionType1#getDocumentation()
	 * @see #getTransitionType1()
	 * @generated
	 */
	EReference getTransitionType1_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.TransitionType1#getExecutionOrderId <em>Execution Order Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Order Id</em>'.
	 * @see org.plcopen.xml.tc60201.TransitionType1#getExecutionOrderId()
	 * @see #getTransitionType1()
	 * @generated
	 */
	EAttribute getTransitionType1_ExecutionOrderId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.TransitionType1#getGlobalId <em>Global Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Global Id</em>'.
	 * @see org.plcopen.xml.tc60201.TransitionType1#getGlobalId()
	 * @see #getTransitionType1()
	 * @generated
	 */
	EAttribute getTransitionType1_GlobalId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.TransitionType1#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.plcopen.xml.tc60201.TransitionType1#getHeight()
	 * @see #getTransitionType1()
	 * @generated
	 */
	EAttribute getTransitionType1_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.TransitionType1#getLocalId <em>Local Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Id</em>'.
	 * @see org.plcopen.xml.tc60201.TransitionType1#getLocalId()
	 * @see #getTransitionType1()
	 * @generated
	 */
	EAttribute getTransitionType1_LocalId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.TransitionType1#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see org.plcopen.xml.tc60201.TransitionType1#getPriority()
	 * @see #getTransitionType1()
	 * @generated
	 */
	EAttribute getTransitionType1_Priority();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.TransitionType1#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.plcopen.xml.tc60201.TransitionType1#getWidth()
	 * @see #getTransitionType1()
	 * @generated
	 */
	EAttribute getTransitionType1_Width();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.TypesType <em>Types Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Types Type</em>'.
	 * @see org.plcopen.xml.tc60201.TypesType
	 * @generated
	 */
	EClass getTypesType();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.TypesType#getDataTypes <em>Data Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Types</em>'.
	 * @see org.plcopen.xml.tc60201.TypesType#getDataTypes()
	 * @see #getTypesType()
	 * @generated
	 */
	EReference getTypesType_DataTypes();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.TypesType#getPous <em>Pous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pous</em>'.
	 * @see org.plcopen.xml.tc60201.TypesType#getPous()
	 * @see #getTypesType()
	 * @generated
	 */
	EReference getTypesType_Pous();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see org.plcopen.xml.tc60201.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.Value#getSimpleValue <em>Simple Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simple Value</em>'.
	 * @see org.plcopen.xml.tc60201.Value#getSimpleValue()
	 * @see #getValue()
	 * @generated
	 */
	EReference getValue_SimpleValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.Value#getArrayValue <em>Array Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Array Value</em>'.
	 * @see org.plcopen.xml.tc60201.Value#getArrayValue()
	 * @see #getValue()
	 * @generated
	 */
	EReference getValue_ArrayValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.Value#getStructValue <em>Struct Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Struct Value</em>'.
	 * @see org.plcopen.xml.tc60201.Value#getStructValue()
	 * @see #getValue()
	 * @generated
	 */
	EReference getValue_StructValue();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.ValuesType <em>Values Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Values Type</em>'.
	 * @see org.plcopen.xml.tc60201.ValuesType
	 * @generated
	 */
	EClass getValuesType();

	/**
	 * Returns the meta object for the attribute list '{@link org.plcopen.xml.tc60201.ValuesType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.plcopen.xml.tc60201.ValuesType#getGroup()
	 * @see #getValuesType()
	 * @generated
	 */
	EAttribute getValuesType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.ValuesType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see org.plcopen.xml.tc60201.ValuesType#getValue()
	 * @see #getValuesType()
	 * @generated
	 */
	EReference getValuesType_Value();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.ValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Type</em>'.
	 * @see org.plcopen.xml.tc60201.ValueType
	 * @generated
	 */
	EClass getValueType();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ValueType#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Member</em>'.
	 * @see org.plcopen.xml.tc60201.ValueType#getMember()
	 * @see #getValueType()
	 * @generated
	 */
	EAttribute getValueType_Member();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.ValueType1 <em>Value Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Type1</em>'.
	 * @see org.plcopen.xml.tc60201.ValueType1
	 * @generated
	 */
	EClass getValueType1();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ValueType1#getRepetitionValue <em>Repetition Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repetition Value</em>'.
	 * @see org.plcopen.xml.tc60201.ValueType1#getRepetitionValue()
	 * @see #getValueType1()
	 * @generated
	 */
	EAttribute getValueType1_RepetitionValue();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.ValueType2 <em>Value Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Type2</em>'.
	 * @see org.plcopen.xml.tc60201.ValueType2
	 * @generated
	 */
	EClass getValueType2();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ValueType2#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.plcopen.xml.tc60201.ValueType2#getName()
	 * @see #getValueType2()
	 * @generated
	 */
	EAttribute getValueType2_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.ValueType2#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.plcopen.xml.tc60201.ValueType2#getValue()
	 * @see #getValueType2()
	 * @generated
	 */
	EAttribute getValueType2_Value();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.VariableType <em>Variable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Type</em>'.
	 * @see org.plcopen.xml.tc60201.VariableType
	 * @generated
	 */
	EClass getVariableType();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.VariableType#getConnectionPointIn <em>Connection Point In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connection Point In</em>'.
	 * @see org.plcopen.xml.tc60201.VariableType#getConnectionPointIn()
	 * @see #getVariableType()
	 * @generated
	 */
	EReference getVariableType_ConnectionPointIn();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.VariableType#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see org.plcopen.xml.tc60201.VariableType#getDocumentation()
	 * @see #getVariableType()
	 * @generated
	 */
	EReference getVariableType_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.VariableType#getEdge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edge</em>'.
	 * @see org.plcopen.xml.tc60201.VariableType#getEdge()
	 * @see #getVariableType()
	 * @generated
	 */
	EAttribute getVariableType_Edge();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.VariableType#getFormalParameter <em>Formal Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formal Parameter</em>'.
	 * @see org.plcopen.xml.tc60201.VariableType#getFormalParameter()
	 * @see #getVariableType()
	 * @generated
	 */
	EAttribute getVariableType_FormalParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.VariableType#isHidden <em>Hidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hidden</em>'.
	 * @see org.plcopen.xml.tc60201.VariableType#isHidden()
	 * @see #getVariableType()
	 * @generated
	 */
	EAttribute getVariableType_Hidden();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.VariableType#isNegated <em>Negated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Negated</em>'.
	 * @see org.plcopen.xml.tc60201.VariableType#isNegated()
	 * @see #getVariableType()
	 * @generated
	 */
	EAttribute getVariableType_Negated();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.VariableType#getStorage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Storage</em>'.
	 * @see org.plcopen.xml.tc60201.VariableType#getStorage()
	 * @see #getVariableType()
	 * @generated
	 */
	EAttribute getVariableType_Storage();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.VariableType1 <em>Variable Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Type1</em>'.
	 * @see org.plcopen.xml.tc60201.VariableType1
	 * @generated
	 */
	EClass getVariableType1();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.VariableType1#getConnectionPointOut <em>Connection Point Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connection Point Out</em>'.
	 * @see org.plcopen.xml.tc60201.VariableType1#getConnectionPointOut()
	 * @see #getVariableType1()
	 * @generated
	 */
	EReference getVariableType1_ConnectionPointOut();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.VariableType1#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see org.plcopen.xml.tc60201.VariableType1#getDocumentation()
	 * @see #getVariableType1()
	 * @generated
	 */
	EReference getVariableType1_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.VariableType1#getEdge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edge</em>'.
	 * @see org.plcopen.xml.tc60201.VariableType1#getEdge()
	 * @see #getVariableType1()
	 * @generated
	 */
	EAttribute getVariableType1_Edge();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.VariableType1#getFormalParameter <em>Formal Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formal Parameter</em>'.
	 * @see org.plcopen.xml.tc60201.VariableType1#getFormalParameter()
	 * @see #getVariableType1()
	 * @generated
	 */
	EAttribute getVariableType1_FormalParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.VariableType1#isHidden <em>Hidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hidden</em>'.
	 * @see org.plcopen.xml.tc60201.VariableType1#isHidden()
	 * @see #getVariableType1()
	 * @generated
	 */
	EAttribute getVariableType1_Hidden();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.VariableType1#isNegated <em>Negated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Negated</em>'.
	 * @see org.plcopen.xml.tc60201.VariableType1#isNegated()
	 * @see #getVariableType1()
	 * @generated
	 */
	EAttribute getVariableType1_Negated();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.VariableType1#getStorage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Storage</em>'.
	 * @see org.plcopen.xml.tc60201.VariableType1#getStorage()
	 * @see #getVariableType1()
	 * @generated
	 */
	EAttribute getVariableType1_Storage();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.VariableType2 <em>Variable Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Type2</em>'.
	 * @see org.plcopen.xml.tc60201.VariableType2
	 * @generated
	 */
	EClass getVariableType2();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.VariableType2#getConnectionPointIn <em>Connection Point In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connection Point In</em>'.
	 * @see org.plcopen.xml.tc60201.VariableType2#getConnectionPointIn()
	 * @see #getVariableType2()
	 * @generated
	 */
	EReference getVariableType2_ConnectionPointIn();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.VariableType2#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see org.plcopen.xml.tc60201.VariableType2#getDocumentation()
	 * @see #getVariableType2()
	 * @generated
	 */
	EReference getVariableType2_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.VariableType2#getEdge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edge</em>'.
	 * @see org.plcopen.xml.tc60201.VariableType2#getEdge()
	 * @see #getVariableType2()
	 * @generated
	 */
	EAttribute getVariableType2_Edge();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.VariableType2#getFormalParameter <em>Formal Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formal Parameter</em>'.
	 * @see org.plcopen.xml.tc60201.VariableType2#getFormalParameter()
	 * @see #getVariableType2()
	 * @generated
	 */
	EAttribute getVariableType2_FormalParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.VariableType2#isHidden <em>Hidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hidden</em>'.
	 * @see org.plcopen.xml.tc60201.VariableType2#isHidden()
	 * @see #getVariableType2()
	 * @generated
	 */
	EAttribute getVariableType2_Hidden();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.VariableType2#isNegated <em>Negated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Negated</em>'.
	 * @see org.plcopen.xml.tc60201.VariableType2#isNegated()
	 * @see #getVariableType2()
	 * @generated
	 */
	EAttribute getVariableType2_Negated();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.VariableType2#getStorage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Storage</em>'.
	 * @see org.plcopen.xml.tc60201.VariableType2#getStorage()
	 * @see #getVariableType2()
	 * @generated
	 */
	EAttribute getVariableType2_Storage();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.VariableType3 <em>Variable Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Type3</em>'.
	 * @see org.plcopen.xml.tc60201.VariableType3
	 * @generated
	 */
	EClass getVariableType3();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.VariableType3#getConnectionPointIn <em>Connection Point In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connection Point In</em>'.
	 * @see org.plcopen.xml.tc60201.VariableType3#getConnectionPointIn()
	 * @see #getVariableType3()
	 * @generated
	 */
	EReference getVariableType3_ConnectionPointIn();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.VariableType3#getConnectionPointOut <em>Connection Point Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connection Point Out</em>'.
	 * @see org.plcopen.xml.tc60201.VariableType3#getConnectionPointOut()
	 * @see #getVariableType3()
	 * @generated
	 */
	EReference getVariableType3_ConnectionPointOut();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.VariableType3#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see org.plcopen.xml.tc60201.VariableType3#getDocumentation()
	 * @see #getVariableType3()
	 * @generated
	 */
	EReference getVariableType3_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.VariableType3#getEdge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edge</em>'.
	 * @see org.plcopen.xml.tc60201.VariableType3#getEdge()
	 * @see #getVariableType3()
	 * @generated
	 */
	EAttribute getVariableType3_Edge();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.VariableType3#getFormalParameter <em>Formal Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formal Parameter</em>'.
	 * @see org.plcopen.xml.tc60201.VariableType3#getFormalParameter()
	 * @see #getVariableType3()
	 * @generated
	 */
	EAttribute getVariableType3_FormalParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.VariableType3#isHidden <em>Hidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hidden</em>'.
	 * @see org.plcopen.xml.tc60201.VariableType3#isHidden()
	 * @see #getVariableType3()
	 * @generated
	 */
	EAttribute getVariableType3_Hidden();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.VariableType3#isNegated <em>Negated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Negated</em>'.
	 * @see org.plcopen.xml.tc60201.VariableType3#isNegated()
	 * @see #getVariableType3()
	 * @generated
	 */
	EAttribute getVariableType3_Negated();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.VariableType3#getStorage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Storage</em>'.
	 * @see org.plcopen.xml.tc60201.VariableType3#getStorage()
	 * @see #getVariableType3()
	 * @generated
	 */
	EAttribute getVariableType3_Storage();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.VariableType4 <em>Variable Type4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Type4</em>'.
	 * @see org.plcopen.xml.tc60201.VariableType4
	 * @generated
	 */
	EClass getVariableType4();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.VariableType4#getConnectionPointOut <em>Connection Point Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connection Point Out</em>'.
	 * @see org.plcopen.xml.tc60201.VariableType4#getConnectionPointOut()
	 * @see #getVariableType4()
	 * @generated
	 */
	EReference getVariableType4_ConnectionPointOut();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.VariableType4#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see org.plcopen.xml.tc60201.VariableType4#getDocumentation()
	 * @see #getVariableType4()
	 * @generated
	 */
	EReference getVariableType4_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.VariableType4#getEdge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edge</em>'.
	 * @see org.plcopen.xml.tc60201.VariableType4#getEdge()
	 * @see #getVariableType4()
	 * @generated
	 */
	EAttribute getVariableType4_Edge();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.VariableType4#getFormalParameter <em>Formal Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formal Parameter</em>'.
	 * @see org.plcopen.xml.tc60201.VariableType4#getFormalParameter()
	 * @see #getVariableType4()
	 * @generated
	 */
	EAttribute getVariableType4_FormalParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.VariableType4#isHidden <em>Hidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hidden</em>'.
	 * @see org.plcopen.xml.tc60201.VariableType4#isHidden()
	 * @see #getVariableType4()
	 * @generated
	 */
	EAttribute getVariableType4_Hidden();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.VariableType4#isNegated <em>Negated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Negated</em>'.
	 * @see org.plcopen.xml.tc60201.VariableType4#isNegated()
	 * @see #getVariableType4()
	 * @generated
	 */
	EAttribute getVariableType4_Negated();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.VariableType4#getStorage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Storage</em>'.
	 * @see org.plcopen.xml.tc60201.VariableType4#getStorage()
	 * @see #getVariableType4()
	 * @generated
	 */
	EAttribute getVariableType4_Storage();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.VariableType5 <em>Variable Type5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Type5</em>'.
	 * @see org.plcopen.xml.tc60201.VariableType5
	 * @generated
	 */
	EClass getVariableType5();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.VariableType5#getConnectionPointIn <em>Connection Point In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connection Point In</em>'.
	 * @see org.plcopen.xml.tc60201.VariableType5#getConnectionPointIn()
	 * @see #getVariableType5()
	 * @generated
	 */
	EReference getVariableType5_ConnectionPointIn();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.VariableType5#getConnectionPointOut <em>Connection Point Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connection Point Out</em>'.
	 * @see org.plcopen.xml.tc60201.VariableType5#getConnectionPointOut()
	 * @see #getVariableType5()
	 * @generated
	 */
	EReference getVariableType5_ConnectionPointOut();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.VariableType5#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see org.plcopen.xml.tc60201.VariableType5#getDocumentation()
	 * @see #getVariableType5()
	 * @generated
	 */
	EReference getVariableType5_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.VariableType5#getEdge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edge</em>'.
	 * @see org.plcopen.xml.tc60201.VariableType5#getEdge()
	 * @see #getVariableType5()
	 * @generated
	 */
	EAttribute getVariableType5_Edge();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.VariableType5#getFormalParameter <em>Formal Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formal Parameter</em>'.
	 * @see org.plcopen.xml.tc60201.VariableType5#getFormalParameter()
	 * @see #getVariableType5()
	 * @generated
	 */
	EAttribute getVariableType5_FormalParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.VariableType5#isHidden <em>Hidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hidden</em>'.
	 * @see org.plcopen.xml.tc60201.VariableType5#isHidden()
	 * @see #getVariableType5()
	 * @generated
	 */
	EAttribute getVariableType5_Hidden();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.VariableType5#isNegated <em>Negated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Negated</em>'.
	 * @see org.plcopen.xml.tc60201.VariableType5#isNegated()
	 * @see #getVariableType5()
	 * @generated
	 */
	EAttribute getVariableType5_Negated();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.VariableType5#getStorage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Storage</em>'.
	 * @see org.plcopen.xml.tc60201.VariableType5#getStorage()
	 * @see #getVariableType5()
	 * @generated
	 */
	EAttribute getVariableType5_Storage();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.VariableType6 <em>Variable Type6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Type6</em>'.
	 * @see org.plcopen.xml.tc60201.VariableType6
	 * @generated
	 */
	EClass getVariableType6();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.VariableType6#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.plcopen.xml.tc60201.VariableType6#getType()
	 * @see #getVariableType6()
	 * @generated
	 */
	EReference getVariableType6_Type();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.VariableType6#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial Value</em>'.
	 * @see org.plcopen.xml.tc60201.VariableType6#getInitialValue()
	 * @see #getVariableType6()
	 * @generated
	 */
	EReference getVariableType6_InitialValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.VariableType6#getAddData <em>Add Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Data</em>'.
	 * @see org.plcopen.xml.tc60201.VariableType6#getAddData()
	 * @see #getVariableType6()
	 * @generated
	 */
	EReference getVariableType6_AddData();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.VariableType6#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see org.plcopen.xml.tc60201.VariableType6#getDocumentation()
	 * @see #getVariableType6()
	 * @generated
	 */
	EReference getVariableType6_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.VariableType6#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see org.plcopen.xml.tc60201.VariableType6#getAddress()
	 * @see #getVariableType6()
	 * @generated
	 */
	EAttribute getVariableType6_Address();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.VariableType6#getGlobalId <em>Global Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Global Id</em>'.
	 * @see org.plcopen.xml.tc60201.VariableType6#getGlobalId()
	 * @see #getVariableType6()
	 * @generated
	 */
	EAttribute getVariableType6_GlobalId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.VariableType6#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.plcopen.xml.tc60201.VariableType6#getName()
	 * @see #getVariableType6()
	 * @generated
	 */
	EAttribute getVariableType6_Name();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.VarList <em>Var List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var List</em>'.
	 * @see org.plcopen.xml.tc60201.VarList
	 * @generated
	 */
	EClass getVarList();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.VarList#isConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constant</em>'.
	 * @see org.plcopen.xml.tc60201.VarList#isConstant()
	 * @see #getVarList()
	 * @generated
	 */
	EAttribute getVarList_Constant();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.VarList#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.plcopen.xml.tc60201.VarList#getName()
	 * @see #getVarList()
	 * @generated
	 */
	EAttribute getVarList_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.VarList#isNonpersistent <em>Nonpersistent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nonpersistent</em>'.
	 * @see org.plcopen.xml.tc60201.VarList#isNonpersistent()
	 * @see #getVarList()
	 * @generated
	 */
	EAttribute getVarList_Nonpersistent();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.VarList#isNonretain <em>Nonretain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nonretain</em>'.
	 * @see org.plcopen.xml.tc60201.VarList#isNonretain()
	 * @see #getVarList()
	 * @generated
	 */
	EAttribute getVarList_Nonretain();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.VarList#isPersistent <em>Persistent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persistent</em>'.
	 * @see org.plcopen.xml.tc60201.VarList#isPersistent()
	 * @see #getVarList()
	 * @generated
	 */
	EAttribute getVarList_Persistent();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.VarList#isRetain <em>Retain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Retain</em>'.
	 * @see org.plcopen.xml.tc60201.VarList#isRetain()
	 * @see #getVarList()
	 * @generated
	 */
	EAttribute getVarList_Retain();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.VarListAccess <em>Var List Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var List Access</em>'.
	 * @see org.plcopen.xml.tc60201.VarListAccess
	 * @generated
	 */
	EClass getVarListAccess();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.VarListAccess#getAccessVariable <em>Access Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Access Variable</em>'.
	 * @see org.plcopen.xml.tc60201.VarListAccess#getAccessVariable()
	 * @see #getVarListAccess()
	 * @generated
	 */
	EReference getVarListAccess_AccessVariable();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.VarListAccess#getAddData <em>Add Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Data</em>'.
	 * @see org.plcopen.xml.tc60201.VarListAccess#getAddData()
	 * @see #getVarListAccess()
	 * @generated
	 */
	EReference getVarListAccess_AddData();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.VarListAccess#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see org.plcopen.xml.tc60201.VarListAccess#getDocumentation()
	 * @see #getVarListAccess()
	 * @generated
	 */
	EReference getVarListAccess_Documentation();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.VarListConfig <em>Var List Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var List Config</em>'.
	 * @see org.plcopen.xml.tc60201.VarListConfig
	 * @generated
	 */
	EClass getVarListConfig();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.VarListConfig#getConfigVariable <em>Config Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Config Variable</em>'.
	 * @see org.plcopen.xml.tc60201.VarListConfig#getConfigVariable()
	 * @see #getVarListConfig()
	 * @generated
	 */
	EReference getVarListConfig_ConfigVariable();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.VarListConfig#getAddData <em>Add Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Data</em>'.
	 * @see org.plcopen.xml.tc60201.VarListConfig#getAddData()
	 * @see #getVarListConfig()
	 * @generated
	 */
	EReference getVarListConfig_AddData();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.VarListConfig#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see org.plcopen.xml.tc60201.VarListConfig#getDocumentation()
	 * @see #getVarListConfig()
	 * @generated
	 */
	EReference getVarListConfig_Documentation();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.VarListPlain <em>Var List Plain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var List Plain</em>'.
	 * @see org.plcopen.xml.tc60201.VarListPlain
	 * @generated
	 */
	EClass getVarListPlain();

	/**
	 * Returns the meta object for the containment reference list '{@link org.plcopen.xml.tc60201.VarListPlain#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable</em>'.
	 * @see org.plcopen.xml.tc60201.VarListPlain#getVariable()
	 * @see #getVarListPlain()
	 * @generated
	 */
	EReference getVarListPlain_Variable();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.VarListPlain#getAddData <em>Add Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Data</em>'.
	 * @see org.plcopen.xml.tc60201.VarListPlain#getAddData()
	 * @see #getVarListPlain()
	 * @generated
	 */
	EReference getVarListPlain_AddData();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.VarListPlain#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see org.plcopen.xml.tc60201.VarListPlain#getDocumentation()
	 * @see #getVarListPlain()
	 * @generated
	 */
	EReference getVarListPlain_Documentation();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.VendorElementType <em>Vendor Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vendor Element Type</em>'.
	 * @see org.plcopen.xml.tc60201.VendorElementType
	 * @generated
	 */
	EClass getVendorElementType();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.VendorElementType#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see org.plcopen.xml.tc60201.VendorElementType#getPosition()
	 * @see #getVendorElementType()
	 * @generated
	 */
	EReference getVendorElementType_Position();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.VendorElementType#getAlternativeText <em>Alternative Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alternative Text</em>'.
	 * @see org.plcopen.xml.tc60201.VendorElementType#getAlternativeText()
	 * @see #getVendorElementType()
	 * @generated
	 */
	EReference getVendorElementType_AlternativeText();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.VendorElementType#getInputVariables <em>Input Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Variables</em>'.
	 * @see org.plcopen.xml.tc60201.VendorElementType#getInputVariables()
	 * @see #getVendorElementType()
	 * @generated
	 */
	EReference getVendorElementType_InputVariables();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.VendorElementType#getInOutVariables <em>In Out Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>In Out Variables</em>'.
	 * @see org.plcopen.xml.tc60201.VendorElementType#getInOutVariables()
	 * @see #getVendorElementType()
	 * @generated
	 */
	EReference getVendorElementType_InOutVariables();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.VendorElementType#getOutputVariables <em>Output Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Variables</em>'.
	 * @see org.plcopen.xml.tc60201.VendorElementType#getOutputVariables()
	 * @see #getVendorElementType()
	 * @generated
	 */
	EReference getVendorElementType_OutputVariables();

	/**
	 * Returns the meta object for the containment reference '{@link org.plcopen.xml.tc60201.VendorElementType#getAddData <em>Add Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add Data</em>'.
	 * @see org.plcopen.xml.tc60201.VendorElementType#getAddData()
	 * @see #getVendorElementType()
	 * @generated
	 */
	EReference getVendorElementType_AddData();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.VendorElementType#getExecutionOrderId <em>Execution Order Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Order Id</em>'.
	 * @see org.plcopen.xml.tc60201.VendorElementType#getExecutionOrderId()
	 * @see #getVendorElementType()
	 * @generated
	 */
	EAttribute getVendorElementType_ExecutionOrderId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.VendorElementType#getGlobalId <em>Global Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Global Id</em>'.
	 * @see org.plcopen.xml.tc60201.VendorElementType#getGlobalId()
	 * @see #getVendorElementType()
	 * @generated
	 */
	EAttribute getVendorElementType_GlobalId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.VendorElementType#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.plcopen.xml.tc60201.VendorElementType#getHeight()
	 * @see #getVendorElementType()
	 * @generated
	 */
	EAttribute getVendorElementType_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.VendorElementType#getLocalId <em>Local Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Id</em>'.
	 * @see org.plcopen.xml.tc60201.VendorElementType#getLocalId()
	 * @see #getVendorElementType()
	 * @generated
	 */
	EAttribute getVendorElementType_LocalId();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.VendorElementType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.plcopen.xml.tc60201.VendorElementType#getWidth()
	 * @see #getVendorElementType()
	 * @generated
	 */
	EAttribute getVendorElementType_Width();

	/**
	 * Returns the meta object for class '{@link org.plcopen.xml.tc60201.WstringType <em>Wstring Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wstring Type</em>'.
	 * @see org.plcopen.xml.tc60201.WstringType
	 * @generated
	 */
	EClass getWstringType();

	/**
	 * Returns the meta object for the attribute '{@link org.plcopen.xml.tc60201.WstringType#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.plcopen.xml.tc60201.WstringType#getLength()
	 * @see #getWstringType()
	 * @generated
	 */
	EAttribute getWstringType_Length();

	/**
	 * Returns the meta object for enum '{@link org.plcopen.xml.tc60201.AccessType <em>Access Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Access Type</em>'.
	 * @see org.plcopen.xml.tc60201.AccessType
	 * @generated
	 */
	EEnum getAccessType();

	/**
	 * Returns the meta object for enum '{@link org.plcopen.xml.tc60201.EdgeModifierType <em>Edge Modifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Edge Modifier Type</em>'.
	 * @see org.plcopen.xml.tc60201.EdgeModifierType
	 * @generated
	 */
	EEnum getEdgeModifierType();

	/**
	 * Returns the meta object for enum '{@link org.plcopen.xml.tc60201.HandleUnknownType <em>Handle Unknown Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Handle Unknown Type</em>'.
	 * @see org.plcopen.xml.tc60201.HandleUnknownType
	 * @generated
	 */
	EEnum getHandleUnknownType();

	/**
	 * Returns the meta object for enum '{@link org.plcopen.xml.tc60201.PouType <em>Pou Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Pou Type</em>'.
	 * @see org.plcopen.xml.tc60201.PouType
	 * @generated
	 */
	EEnum getPouType();

	/**
	 * Returns the meta object for enum '{@link org.plcopen.xml.tc60201.QualifierType <em>Qualifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Qualifier Type</em>'.
	 * @see org.plcopen.xml.tc60201.QualifierType
	 * @generated
	 */
	EEnum getQualifierType();

	/**
	 * Returns the meta object for enum '{@link org.plcopen.xml.tc60201.StorageModifierType <em>Storage Modifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Storage Modifier Type</em>'.
	 * @see org.plcopen.xml.tc60201.StorageModifierType
	 * @generated
	 */
	EEnum getStorageModifierType();

	/**
	 * Returns the meta object for data type '{@link org.plcopen.xml.tc60201.AccessType <em>Access Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Access Type Object</em>'.
	 * @see org.plcopen.xml.tc60201.AccessType
	 * @model instanceClass="org.plcopen.xml.tc60201.AccessType"
	 *        extendedMetaData="name='accessType:Object' baseType='accessType'"
	 * @generated
	 */
	EDataType getAccessTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.plcopen.xml.tc60201.EdgeModifierType <em>Edge Modifier Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Edge Modifier Type Object</em>'.
	 * @see org.plcopen.xml.tc60201.EdgeModifierType
	 * @model instanceClass="org.plcopen.xml.tc60201.EdgeModifierType"
	 *        extendedMetaData="name='edgeModifierType:Object' baseType='edgeModifierType'"
	 * @generated
	 */
	EDataType getEdgeModifierTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.plcopen.xml.tc60201.HandleUnknownType <em>Handle Unknown Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Handle Unknown Type Object</em>'.
	 * @see org.plcopen.xml.tc60201.HandleUnknownType
	 * @model instanceClass="org.plcopen.xml.tc60201.HandleUnknownType"
	 *        extendedMetaData="name='handleUnknown_._type:Object' baseType='handleUnknown_._type'"
	 * @generated
	 */
	EDataType getHandleUnknownTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.plcopen.xml.tc60201.PouType <em>Pou Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Pou Type Object</em>'.
	 * @see org.plcopen.xml.tc60201.PouType
	 * @model instanceClass="org.plcopen.xml.tc60201.PouType"
	 *        extendedMetaData="name='pouType:Object' baseType='pouType'"
	 * @generated
	 */
	EDataType getPouTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Priority Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Priority Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='priority_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#integer' minInclusive='0' maxInclusive='65535'"
	 * @generated
	 */
	EDataType getPriorityType();

	/**
	 * Returns the meta object for data type '{@link org.plcopen.xml.tc60201.QualifierType <em>Qualifier Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Qualifier Type Object</em>'.
	 * @see org.plcopen.xml.tc60201.QualifierType
	 * @model instanceClass="org.plcopen.xml.tc60201.QualifierType"
	 *        extendedMetaData="name='qualifier_._type:Object' baseType='qualifier_._type'"
	 * @generated
	 */
	EDataType getQualifierTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.plcopen.xml.tc60201.StorageModifierType <em>Storage Modifier Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Storage Modifier Type Object</em>'.
	 * @see org.plcopen.xml.tc60201.StorageModifierType
	 * @model instanceClass="org.plcopen.xml.tc60201.StorageModifierType"
	 *        extendedMetaData="name='storageModifierType:Object' baseType='storageModifierType'"
	 * @generated
	 */
	EDataType getStorageModifierTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Tc60201Factory getTc60201Factory();

} //Tc60201Package
