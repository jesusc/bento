/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.typing.atl_types;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see genericity.typing.atl_types.AtlTypingFactory
 * @model kind="package"
 * @generated
 */
public interface AtlTypingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "atl_types";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://genericity/types/atl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "atl_types";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AtlTypingPackage eINSTANCE = genericity.typing.atl_types.impl.AtlTypingPackageImpl.init();

	/**
	 * The meta object id for the '{@link genericity.typing.atl_types.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.typing.atl_types.impl.TypeImpl
	 * @see genericity.typing.atl_types.impl.AtlTypingPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 0;

	/**
	 * The feature id for the '<em><b>Multivalued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__MULTIVALUED = 0;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link genericity.typing.atl_types.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.typing.atl_types.impl.PrimitiveTypeImpl
	 * @see genericity.typing.atl_types.impl.AtlTypingPackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Multivalued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__MULTIVALUED = TYPE__MULTIVALUED;

	/**
	 * The number of structural features of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link genericity.typing.atl_types.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.typing.atl_types.impl.BooleanTypeImpl
	 * @see genericity.typing.atl_types.impl.AtlTypingPackageImpl#getBooleanType()
	 * @generated
	 */
	int BOOLEAN_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Multivalued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__MULTIVALUED = PRIMITIVE_TYPE__MULTIVALUED;

	/**
	 * The number of structural features of the '<em>Boolean Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link genericity.typing.atl_types.impl.IntegerTypeImpl <em>Integer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.typing.atl_types.impl.IntegerTypeImpl
	 * @see genericity.typing.atl_types.impl.AtlTypingPackageImpl#getIntegerType()
	 * @generated
	 */
	int INTEGER_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Multivalued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__MULTIVALUED = PRIMITIVE_TYPE__MULTIVALUED;

	/**
	 * The number of structural features of the '<em>Integer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link genericity.typing.atl_types.impl.StringTypeImpl <em>String Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.typing.atl_types.impl.StringTypeImpl
	 * @see genericity.typing.atl_types.impl.AtlTypingPackageImpl#getStringType()
	 * @generated
	 */
	int STRING_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Multivalued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__MULTIVALUED = PRIMITIVE_TYPE__MULTIVALUED;

	/**
	 * The number of structural features of the '<em>String Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link genericity.typing.atl_types.impl.FloatTypeImpl <em>Float Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.typing.atl_types.impl.FloatTypeImpl
	 * @see genericity.typing.atl_types.impl.AtlTypingPackageImpl#getFloatType()
	 * @generated
	 */
	int FLOAT_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Multivalued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_TYPE__MULTIVALUED = PRIMITIVE_TYPE__MULTIVALUED;

	/**
	 * The number of structural features of the '<em>Float Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_TYPE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link genericity.typing.atl_types.impl.TupleTypeImpl <em>Tuple Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.typing.atl_types.impl.TupleTypeImpl
	 * @see genericity.typing.atl_types.impl.AtlTypingPackageImpl#getTupleType()
	 * @generated
	 */
	int TUPLE_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Multivalued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE__MULTIVALUED = TYPE__MULTIVALUED;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE__ATTRIBUTES = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tuple Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link genericity.typing.atl_types.impl.TupleAttributeImpl <em>Tuple Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.typing.atl_types.impl.TupleAttributeImpl
	 * @see genericity.typing.atl_types.impl.AtlTypingPackageImpl#getTupleAttribute()
	 * @generated
	 */
	int TUPLE_ATTRIBUTE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_ATTRIBUTE__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Tuple Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_ATTRIBUTE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link genericity.typing.atl_types.impl.RefTypeImpl <em>Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.typing.atl_types.impl.RefTypeImpl
	 * @see genericity.typing.atl_types.impl.AtlTypingPackageImpl#getRefType()
	 * @generated
	 */
	int REF_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Multivalued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_TYPE__MULTIVALUED = TYPE__MULTIVALUED;

	/**
	 * The number of structural features of the '<em>Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link genericity.typing.atl_types.impl.UnknownImpl <em>Unknown</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.typing.atl_types.impl.UnknownImpl
	 * @see genericity.typing.atl_types.impl.AtlTypingPackageImpl#getUnknown()
	 * @generated
	 */
	int UNKNOWN = 9;

	/**
	 * The feature id for the '<em><b>Multivalued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN__MULTIVALUED = REF_TYPE__MULTIVALUED;

	/**
	 * The number of structural features of the '<em>Unknown</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_FEATURE_COUNT = REF_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link genericity.typing.atl_types.impl.EmptyCollectionImpl <em>Empty Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.typing.atl_types.impl.EmptyCollectionImpl
	 * @see genericity.typing.atl_types.impl.AtlTypingPackageImpl#getEmptyCollection()
	 * @generated
	 */
	int EMPTY_COLLECTION = 10;

	/**
	 * The feature id for the '<em><b>Multivalued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_COLLECTION__MULTIVALUED = TYPE__MULTIVALUED;

	/**
	 * The number of structural features of the '<em>Empty Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_COLLECTION_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link genericity.typing.atl_types.impl.MetaclassImpl <em>Metaclass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.typing.atl_types.impl.MetaclassImpl
	 * @see genericity.typing.atl_types.impl.AtlTypingPackageImpl#getMetaclass()
	 * @generated
	 */
	int METACLASS = 11;

	/**
	 * The feature id for the '<em><b>Multivalued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METACLASS__MULTIVALUED = REF_TYPE__MULTIVALUED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METACLASS__NAME = REF_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Klass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METACLASS__KLASS = REF_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Metaclass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METACLASS_FEATURE_COUNT = REF_TYPE_FEATURE_COUNT + 2;


	/**
	 * The meta object id for the '{@link genericity.typing.atl_types.impl.ReflectiveTypeImpl <em>Reflective Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.typing.atl_types.impl.ReflectiveTypeImpl
	 * @see genericity.typing.atl_types.impl.AtlTypingPackageImpl#getReflectiveType()
	 * @generated
	 */
	int REFLECTIVE_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Multivalued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLECTIVE_TYPE__MULTIVALUED = TYPE__MULTIVALUED;

	/**
	 * The number of structural features of the '<em>Reflective Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLECTIVE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link genericity.typing.atl_types.impl.UnionTypeImpl <em>Union Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.typing.atl_types.impl.UnionTypeImpl
	 * @see genericity.typing.atl_types.impl.AtlTypingPackageImpl#getUnionType()
	 * @generated
	 */
	int UNION_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Multivalued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE__MULTIVALUED = TYPE__MULTIVALUED;

	/**
	 * The feature id for the '<em><b>Possible Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE__POSSIBLE_TYPES = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Union Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link genericity.typing.atl_types.impl.ThisModuleTypeImpl <em>This Module Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.typing.atl_types.impl.ThisModuleTypeImpl
	 * @see genericity.typing.atl_types.impl.AtlTypingPackageImpl#getThisModuleType()
	 * @generated
	 */
	int THIS_MODULE_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Multivalued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIS_MODULE_TYPE__MULTIVALUED = TYPE__MULTIVALUED;

	/**
	 * The number of structural features of the '<em>This Module Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIS_MODULE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link genericity.typing.atl_types.impl.ReflectiveClassImpl <em>Reflective Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.typing.atl_types.impl.ReflectiveClassImpl
	 * @see genericity.typing.atl_types.impl.AtlTypingPackageImpl#getReflectiveClass()
	 * @generated
	 */
	int REFLECTIVE_CLASS = 15;

	/**
	 * The feature id for the '<em><b>Multivalued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLECTIVE_CLASS__MULTIVALUED = REFLECTIVE_TYPE__MULTIVALUED;

	/**
	 * The number of structural features of the '<em>Reflective Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFLECTIVE_CLASS_FEATURE_COUNT = REFLECTIVE_TYPE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link genericity.typing.atl_types.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see genericity.typing.atl_types.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the attribute '{@link genericity.typing.atl_types.Type#isMultivalued <em>Multivalued</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multivalued</em>'.
	 * @see genericity.typing.atl_types.Type#isMultivalued()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_Multivalued();

	/**
	 * Returns the meta object for class '{@link genericity.typing.atl_types.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type</em>'.
	 * @see genericity.typing.atl_types.PrimitiveType
	 * @generated
	 */
	EClass getPrimitiveType();

	/**
	 * Returns the meta object for class '{@link genericity.typing.atl_types.BooleanType <em>Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Type</em>'.
	 * @see genericity.typing.atl_types.BooleanType
	 * @generated
	 */
	EClass getBooleanType();

	/**
	 * Returns the meta object for class '{@link genericity.typing.atl_types.IntegerType <em>Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Type</em>'.
	 * @see genericity.typing.atl_types.IntegerType
	 * @generated
	 */
	EClass getIntegerType();

	/**
	 * Returns the meta object for class '{@link genericity.typing.atl_types.StringType <em>String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Type</em>'.
	 * @see genericity.typing.atl_types.StringType
	 * @generated
	 */
	EClass getStringType();

	/**
	 * Returns the meta object for class '{@link genericity.typing.atl_types.FloatType <em>Float Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float Type</em>'.
	 * @see genericity.typing.atl_types.FloatType
	 * @generated
	 */
	EClass getFloatType();

	/**
	 * Returns the meta object for class '{@link genericity.typing.atl_types.TupleType <em>Tuple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuple Type</em>'.
	 * @see genericity.typing.atl_types.TupleType
	 * @generated
	 */
	EClass getTupleType();

	/**
	 * Returns the meta object for the containment reference list '{@link genericity.typing.atl_types.TupleType#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see genericity.typing.atl_types.TupleType#getAttributes()
	 * @see #getTupleType()
	 * @generated
	 */
	EReference getTupleType_Attributes();

	/**
	 * Returns the meta object for class '{@link genericity.typing.atl_types.TupleAttribute <em>Tuple Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuple Attribute</em>'.
	 * @see genericity.typing.atl_types.TupleAttribute
	 * @generated
	 */
	EClass getTupleAttribute();

	/**
	 * Returns the meta object for the attribute '{@link genericity.typing.atl_types.TupleAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see genericity.typing.atl_types.TupleAttribute#getName()
	 * @see #getTupleAttribute()
	 * @generated
	 */
	EAttribute getTupleAttribute_Name();

	/**
	 * Returns the meta object for the containment reference '{@link genericity.typing.atl_types.TupleAttribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see genericity.typing.atl_types.TupleAttribute#getType()
	 * @see #getTupleAttribute()
	 * @generated
	 */
	EReference getTupleAttribute_Type();

	/**
	 * Returns the meta object for class '{@link genericity.typing.atl_types.RefType <em>Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref Type</em>'.
	 * @see genericity.typing.atl_types.RefType
	 * @generated
	 */
	EClass getRefType();

	/**
	 * Returns the meta object for class '{@link genericity.typing.atl_types.Unknown <em>Unknown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unknown</em>'.
	 * @see genericity.typing.atl_types.Unknown
	 * @generated
	 */
	EClass getUnknown();

	/**
	 * Returns the meta object for class '{@link genericity.typing.atl_types.EmptyCollection <em>Empty Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empty Collection</em>'.
	 * @see genericity.typing.atl_types.EmptyCollection
	 * @generated
	 */
	EClass getEmptyCollection();

	/**
	 * Returns the meta object for class '{@link genericity.typing.atl_types.Metaclass <em>Metaclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metaclass</em>'.
	 * @see genericity.typing.atl_types.Metaclass
	 * @generated
	 */
	EClass getMetaclass();

	/**
	 * Returns the meta object for the attribute '{@link genericity.typing.atl_types.Metaclass#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see genericity.typing.atl_types.Metaclass#getName()
	 * @see #getMetaclass()
	 * @generated
	 */
	EAttribute getMetaclass_Name();

	/**
	 * Returns the meta object for the reference '{@link genericity.typing.atl_types.Metaclass#getKlass <em>Klass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Klass</em>'.
	 * @see genericity.typing.atl_types.Metaclass#getKlass()
	 * @see #getMetaclass()
	 * @generated
	 */
	EReference getMetaclass_Klass();

	/**
	 * Returns the meta object for class '{@link genericity.typing.atl_types.ReflectiveType <em>Reflective Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reflective Type</em>'.
	 * @see genericity.typing.atl_types.ReflectiveType
	 * @generated
	 */
	EClass getReflectiveType();

	/**
	 * Returns the meta object for class '{@link genericity.typing.atl_types.UnionType <em>Union Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Union Type</em>'.
	 * @see genericity.typing.atl_types.UnionType
	 * @generated
	 */
	EClass getUnionType();

	/**
	 * Returns the meta object for the containment reference list '{@link genericity.typing.atl_types.UnionType#getPossibleTypes <em>Possible Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Possible Types</em>'.
	 * @see genericity.typing.atl_types.UnionType#getPossibleTypes()
	 * @see #getUnionType()
	 * @generated
	 */
	EReference getUnionType_PossibleTypes();

	/**
	 * Returns the meta object for class '{@link genericity.typing.atl_types.ThisModuleType <em>This Module Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>This Module Type</em>'.
	 * @see genericity.typing.atl_types.ThisModuleType
	 * @generated
	 */
	EClass getThisModuleType();

	/**
	 * Returns the meta object for class '{@link genericity.typing.atl_types.ReflectiveClass <em>Reflective Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reflective Class</em>'.
	 * @see genericity.typing.atl_types.ReflectiveClass
	 * @generated
	 */
	EClass getReflectiveClass();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AtlTypingFactory getAtlTypingFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link genericity.typing.atl_types.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.typing.atl_types.impl.TypeImpl
		 * @see genericity.typing.atl_types.impl.AtlTypingPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Multivalued</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__MULTIVALUED = eINSTANCE.getType_Multivalued();

		/**
		 * The meta object literal for the '{@link genericity.typing.atl_types.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.typing.atl_types.impl.PrimitiveTypeImpl
		 * @see genericity.typing.atl_types.impl.AtlTypingPackageImpl#getPrimitiveType()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

		/**
		 * The meta object literal for the '{@link genericity.typing.atl_types.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.typing.atl_types.impl.BooleanTypeImpl
		 * @see genericity.typing.atl_types.impl.AtlTypingPackageImpl#getBooleanType()
		 * @generated
		 */
		EClass BOOLEAN_TYPE = eINSTANCE.getBooleanType();

		/**
		 * The meta object literal for the '{@link genericity.typing.atl_types.impl.IntegerTypeImpl <em>Integer Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.typing.atl_types.impl.IntegerTypeImpl
		 * @see genericity.typing.atl_types.impl.AtlTypingPackageImpl#getIntegerType()
		 * @generated
		 */
		EClass INTEGER_TYPE = eINSTANCE.getIntegerType();

		/**
		 * The meta object literal for the '{@link genericity.typing.atl_types.impl.StringTypeImpl <em>String Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.typing.atl_types.impl.StringTypeImpl
		 * @see genericity.typing.atl_types.impl.AtlTypingPackageImpl#getStringType()
		 * @generated
		 */
		EClass STRING_TYPE = eINSTANCE.getStringType();

		/**
		 * The meta object literal for the '{@link genericity.typing.atl_types.impl.FloatTypeImpl <em>Float Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.typing.atl_types.impl.FloatTypeImpl
		 * @see genericity.typing.atl_types.impl.AtlTypingPackageImpl#getFloatType()
		 * @generated
		 */
		EClass FLOAT_TYPE = eINSTANCE.getFloatType();

		/**
		 * The meta object literal for the '{@link genericity.typing.atl_types.impl.TupleTypeImpl <em>Tuple Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.typing.atl_types.impl.TupleTypeImpl
		 * @see genericity.typing.atl_types.impl.AtlTypingPackageImpl#getTupleType()
		 * @generated
		 */
		EClass TUPLE_TYPE = eINSTANCE.getTupleType();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TUPLE_TYPE__ATTRIBUTES = eINSTANCE.getTupleType_Attributes();

		/**
		 * The meta object literal for the '{@link genericity.typing.atl_types.impl.TupleAttributeImpl <em>Tuple Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.typing.atl_types.impl.TupleAttributeImpl
		 * @see genericity.typing.atl_types.impl.AtlTypingPackageImpl#getTupleAttribute()
		 * @generated
		 */
		EClass TUPLE_ATTRIBUTE = eINSTANCE.getTupleAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUPLE_ATTRIBUTE__NAME = eINSTANCE.getTupleAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TUPLE_ATTRIBUTE__TYPE = eINSTANCE.getTupleAttribute_Type();

		/**
		 * The meta object literal for the '{@link genericity.typing.atl_types.impl.RefTypeImpl <em>Ref Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.typing.atl_types.impl.RefTypeImpl
		 * @see genericity.typing.atl_types.impl.AtlTypingPackageImpl#getRefType()
		 * @generated
		 */
		EClass REF_TYPE = eINSTANCE.getRefType();

		/**
		 * The meta object literal for the '{@link genericity.typing.atl_types.impl.UnknownImpl <em>Unknown</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.typing.atl_types.impl.UnknownImpl
		 * @see genericity.typing.atl_types.impl.AtlTypingPackageImpl#getUnknown()
		 * @generated
		 */
		EClass UNKNOWN = eINSTANCE.getUnknown();

		/**
		 * The meta object literal for the '{@link genericity.typing.atl_types.impl.EmptyCollectionImpl <em>Empty Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.typing.atl_types.impl.EmptyCollectionImpl
		 * @see genericity.typing.atl_types.impl.AtlTypingPackageImpl#getEmptyCollection()
		 * @generated
		 */
		EClass EMPTY_COLLECTION = eINSTANCE.getEmptyCollection();

		/**
		 * The meta object literal for the '{@link genericity.typing.atl_types.impl.MetaclassImpl <em>Metaclass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.typing.atl_types.impl.MetaclassImpl
		 * @see genericity.typing.atl_types.impl.AtlTypingPackageImpl#getMetaclass()
		 * @generated
		 */
		EClass METACLASS = eINSTANCE.getMetaclass();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METACLASS__NAME = eINSTANCE.getMetaclass_Name();

		/**
		 * The meta object literal for the '<em><b>Klass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METACLASS__KLASS = eINSTANCE.getMetaclass_Klass();

		/**
		 * The meta object literal for the '{@link genericity.typing.atl_types.impl.ReflectiveTypeImpl <em>Reflective Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.typing.atl_types.impl.ReflectiveTypeImpl
		 * @see genericity.typing.atl_types.impl.AtlTypingPackageImpl#getReflectiveType()
		 * @generated
		 */
		EClass REFLECTIVE_TYPE = eINSTANCE.getReflectiveType();

		/**
		 * The meta object literal for the '{@link genericity.typing.atl_types.impl.UnionTypeImpl <em>Union Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.typing.atl_types.impl.UnionTypeImpl
		 * @see genericity.typing.atl_types.impl.AtlTypingPackageImpl#getUnionType()
		 * @generated
		 */
		EClass UNION_TYPE = eINSTANCE.getUnionType();

		/**
		 * The meta object literal for the '<em><b>Possible Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNION_TYPE__POSSIBLE_TYPES = eINSTANCE.getUnionType_PossibleTypes();

		/**
		 * The meta object literal for the '{@link genericity.typing.atl_types.impl.ThisModuleTypeImpl <em>This Module Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.typing.atl_types.impl.ThisModuleTypeImpl
		 * @see genericity.typing.atl_types.impl.AtlTypingPackageImpl#getThisModuleType()
		 * @generated
		 */
		EClass THIS_MODULE_TYPE = eINSTANCE.getThisModuleType();

		/**
		 * The meta object literal for the '{@link genericity.typing.atl_types.impl.ReflectiveClassImpl <em>Reflective Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.typing.atl_types.impl.ReflectiveClassImpl
		 * @see genericity.typing.atl_types.impl.AtlTypingPackageImpl#getReflectiveClass()
		 * @generated
		 */
		EClass REFLECTIVE_CLASS = eINSTANCE.getReflectiveClass();

	}

} //AtlTypingPackage
