/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.typing.atl_types.impl;

import genericity.typing.atl_types.AtlTypingFactory;
import genericity.typing.atl_types.AtlTypingPackage;
import genericity.typing.atl_types.BooleanType;
import genericity.typing.atl_types.CollectionType;
import genericity.typing.atl_types.EmptyCollection;
import genericity.typing.atl_types.EnumType;
import genericity.typing.atl_types.FloatType;
import genericity.typing.atl_types.IntegerType;
import genericity.typing.atl_types.MapType;
import genericity.typing.atl_types.Metaclass;
import genericity.typing.atl_types.OclUndefinedType;
import genericity.typing.atl_types.PrimitiveType;
import genericity.typing.atl_types.RefType;
import genericity.typing.atl_types.ReflectiveClass;
import genericity.typing.atl_types.ReflectiveType;
import genericity.typing.atl_types.SequenceType;
import genericity.typing.atl_types.SetType;
import genericity.typing.atl_types.StringType;
import genericity.typing.atl_types.ThisModuleType;
import genericity.typing.atl_types.TupleAttribute;
import genericity.typing.atl_types.TupleType;
import genericity.typing.atl_types.Type;
import genericity.typing.atl_types.UnionType;
import genericity.typing.atl_types.Unknown;
import genericity.typing.atl_types.UnknownFeature;
import genericity.typing.atl_types.annotations.AnnotationsPackage;
import genericity.typing.atl_types.annotations.impl.AnnotationsPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AtlTypingPackageImpl extends EPackageImpl implements AtlTypingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclUndefinedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floatTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tupleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tupleAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unknownEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unknownFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emptyCollectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metaclassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reflectiveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thisModuleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reflectiveClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setTypeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see genericity.typing.atl_types.AtlTypingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AtlTypingPackageImpl() {
		super(eNS_URI, AtlTypingFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link AtlTypingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AtlTypingPackage init() {
		if (isInited) return (AtlTypingPackage)EPackage.Registry.INSTANCE.getEPackage(AtlTypingPackage.eNS_URI);

		// Obtain or create and register package
		AtlTypingPackageImpl theAtlTypingPackage = (AtlTypingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AtlTypingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AtlTypingPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		AnnotationsPackageImpl theAnnotationsPackage = (AnnotationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AnnotationsPackage.eNS_URI) instanceof AnnotationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AnnotationsPackage.eNS_URI) : AnnotationsPackage.eINSTANCE);

		// Create package meta-data objects
		theAtlTypingPackage.createPackageContents();
		theAnnotationsPackage.createPackageContents();

		// Initialize created meta-data
		theAtlTypingPackage.initializePackageContents();
		theAnnotationsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAtlTypingPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AtlTypingPackage.eNS_URI, theAtlTypingPackage);
		return theAtlTypingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getType_Multivalued() {
		return (EAttribute)typeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getType_MetamodelRef() {
		return (EAttribute)typeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOclUndefinedType() {
		return oclUndefinedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveType() {
		return primitiveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanType() {
		return booleanTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanType_KindOfTypes() {
		return (EReference)booleanTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerType() {
		return integerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringType() {
		return stringTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloatType() {
		return floatTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTupleType() {
		return tupleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTupleType_Attributes() {
		return (EReference)tupleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapType() {
		return mapTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapType_KeyType() {
		return (EReference)mapTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapType_ValueType() {
		return (EReference)mapTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTupleAttribute() {
		return tupleAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTupleAttribute_Name() {
		return (EAttribute)tupleAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTupleAttribute_Type() {
		return (EReference)tupleAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefType() {
		return refTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnknown() {
		return unknownEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnknownFeature() {
		return unknownFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnknownFeature_TheContainingClass() {
		return (EReference)unknownFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmptyCollection() {
		return emptyCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumType() {
		return enumTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumType_Name() {
		return (EAttribute)enumTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumType_Eenum() {
		return (EReference)enumTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetaclass() {
		return metaclassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetaclass_Name() {
		return (EAttribute)metaclassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetaclass_ExplicitOcurrence() {
		return (EAttribute)metaclassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetaclass_Klass() {
		return (EReference)metaclassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReflectiveType() {
		return reflectiveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnionType() {
		return unionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnionType_PossibleTypes() {
		return (EReference)unionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThisModuleType() {
		return thisModuleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReflectiveClass() {
		return reflectiveClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectionType() {
		return collectionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionType_ContainedType() {
		return (EReference)collectionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceType() {
		return sequenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetType() {
		return setTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtlTypingFactory getAtlTypingFactory() {
		return (AtlTypingFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		typeEClass = createEClass(TYPE);
		createEAttribute(typeEClass, TYPE__MULTIVALUED);
		createEAttribute(typeEClass, TYPE__METAMODEL_REF);

		oclUndefinedTypeEClass = createEClass(OCL_UNDEFINED_TYPE);

		primitiveTypeEClass = createEClass(PRIMITIVE_TYPE);

		booleanTypeEClass = createEClass(BOOLEAN_TYPE);
		createEReference(booleanTypeEClass, BOOLEAN_TYPE__KIND_OF_TYPES);

		integerTypeEClass = createEClass(INTEGER_TYPE);

		stringTypeEClass = createEClass(STRING_TYPE);

		floatTypeEClass = createEClass(FLOAT_TYPE);

		tupleTypeEClass = createEClass(TUPLE_TYPE);
		createEReference(tupleTypeEClass, TUPLE_TYPE__ATTRIBUTES);

		mapTypeEClass = createEClass(MAP_TYPE);
		createEReference(mapTypeEClass, MAP_TYPE__KEY_TYPE);
		createEReference(mapTypeEClass, MAP_TYPE__VALUE_TYPE);

		tupleAttributeEClass = createEClass(TUPLE_ATTRIBUTE);
		createEAttribute(tupleAttributeEClass, TUPLE_ATTRIBUTE__NAME);
		createEReference(tupleAttributeEClass, TUPLE_ATTRIBUTE__TYPE);

		refTypeEClass = createEClass(REF_TYPE);

		unknownEClass = createEClass(UNKNOWN);

		unknownFeatureEClass = createEClass(UNKNOWN_FEATURE);
		createEReference(unknownFeatureEClass, UNKNOWN_FEATURE__THE_CONTAINING_CLASS);

		emptyCollectionEClass = createEClass(EMPTY_COLLECTION);

		enumTypeEClass = createEClass(ENUM_TYPE);
		createEAttribute(enumTypeEClass, ENUM_TYPE__NAME);
		createEReference(enumTypeEClass, ENUM_TYPE__EENUM);

		metaclassEClass = createEClass(METACLASS);
		createEAttribute(metaclassEClass, METACLASS__NAME);
		createEAttribute(metaclassEClass, METACLASS__EXPLICIT_OCURRENCE);
		createEReference(metaclassEClass, METACLASS__KLASS);

		reflectiveTypeEClass = createEClass(REFLECTIVE_TYPE);

		unionTypeEClass = createEClass(UNION_TYPE);
		createEReference(unionTypeEClass, UNION_TYPE__POSSIBLE_TYPES);

		thisModuleTypeEClass = createEClass(THIS_MODULE_TYPE);

		reflectiveClassEClass = createEClass(REFLECTIVE_CLASS);

		collectionTypeEClass = createEClass(COLLECTION_TYPE);
		createEReference(collectionTypeEClass, COLLECTION_TYPE__CONTAINED_TYPE);

		sequenceTypeEClass = createEClass(SEQUENCE_TYPE);

		setTypeEClass = createEClass(SET_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		AnnotationsPackage theAnnotationsPackage = (AnnotationsPackage)EPackage.Registry.INSTANCE.getEPackage(AnnotationsPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theAnnotationsPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		oclUndefinedTypeEClass.getESuperTypes().add(this.getType());
		primitiveTypeEClass.getESuperTypes().add(this.getType());
		booleanTypeEClass.getESuperTypes().add(this.getPrimitiveType());
		integerTypeEClass.getESuperTypes().add(this.getPrimitiveType());
		stringTypeEClass.getESuperTypes().add(this.getPrimitiveType());
		floatTypeEClass.getESuperTypes().add(this.getPrimitiveType());
		tupleTypeEClass.getESuperTypes().add(this.getType());
		mapTypeEClass.getESuperTypes().add(this.getType());
		refTypeEClass.getESuperTypes().add(this.getType());
		unknownEClass.getESuperTypes().add(this.getRefType());
		unknownFeatureEClass.getESuperTypes().add(ecorePackage.getEStructuralFeature());
		emptyCollectionEClass.getESuperTypes().add(this.getType());
		enumTypeEClass.getESuperTypes().add(this.getType());
		metaclassEClass.getESuperTypes().add(this.getRefType());
		reflectiveTypeEClass.getESuperTypes().add(this.getType());
		unionTypeEClass.getESuperTypes().add(this.getType());
		thisModuleTypeEClass.getESuperTypes().add(this.getType());
		reflectiveClassEClass.getESuperTypes().add(this.getReflectiveType());
		collectionTypeEClass.getESuperTypes().add(this.getType());
		sequenceTypeEClass.getESuperTypes().add(this.getCollectionType());
		setTypeEClass.getESuperTypes().add(this.getCollectionType());

		// Initialize classes and features; add operations and parameters
		initEClass(typeEClass, Type.class, "Type", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getType_Multivalued(), ecorePackage.getEBoolean(), "multivalued", "false", 1, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getType_MetamodelRef(), ecorePackage.getEJavaObject(), "metamodelRef", null, 0, 1, Type.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oclUndefinedTypeEClass, OclUndefinedType.class, "OclUndefinedType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(primitiveTypeEClass, PrimitiveType.class, "PrimitiveType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(booleanTypeEClass, BooleanType.class, "BooleanType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBooleanType_KindOfTypes(), this.getMetaclass(), null, "kindOfTypes", null, 0, -1, BooleanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerTypeEClass, IntegerType.class, "IntegerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stringTypeEClass, StringType.class, "StringType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(floatTypeEClass, FloatType.class, "FloatType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tupleTypeEClass, TupleType.class, "TupleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTupleType_Attributes(), this.getTupleAttribute(), null, "attributes", null, 0, -1, TupleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mapTypeEClass, MapType.class, "MapType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMapType_KeyType(), this.getType(), null, "keyType", null, 1, 1, MapType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapType_ValueType(), this.getType(), null, "valueType", null, 1, 1, MapType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tupleAttributeEClass, TupleAttribute.class, "TupleAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTupleAttribute_Name(), ecorePackage.getEString(), "name", null, 1, 1, TupleAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTupleAttribute_Type(), this.getType(), null, "type", null, 1, 1, TupleAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(refTypeEClass, RefType.class, "RefType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unknownEClass, Unknown.class, "Unknown", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unknownFeatureEClass, UnknownFeature.class, "UnknownFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnknownFeature_TheContainingClass(), ecorePackage.getEClass(), null, "theContainingClass", null, 1, 1, UnknownFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emptyCollectionEClass, EmptyCollection.class, "EmptyCollection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(enumTypeEClass, EnumType.class, "EnumType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnumType_Name(), ecorePackage.getEString(), "name", null, 1, 1, EnumType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnumType_Eenum(), ecorePackage.getEObject(), null, "eenum", null, 1, 1, EnumType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metaclassEClass, Metaclass.class, "Metaclass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetaclass_Name(), ecorePackage.getEString(), "name", null, 1, 1, Metaclass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetaclass_ExplicitOcurrence(), ecorePackage.getEBoolean(), "explicitOcurrence", null, 0, 1, Metaclass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetaclass_Klass(), ecorePackage.getEClass(), null, "klass", null, 1, 1, Metaclass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reflectiveTypeEClass, ReflectiveType.class, "ReflectiveType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unionTypeEClass, UnionType.class, "UnionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnionType_PossibleTypes(), this.getType(), null, "possibleTypes", null, 0, -1, UnionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(thisModuleTypeEClass, ThisModuleType.class, "ThisModuleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(reflectiveClassEClass, ReflectiveClass.class, "ReflectiveClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(collectionTypeEClass, CollectionType.class, "CollectionType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollectionType_ContainedType(), this.getType(), null, "containedType", null, 1, 1, CollectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sequenceTypeEClass, SequenceType.class, "SequenceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(setTypeEClass, SetType.class, "SetType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //AtlTypingPackageImpl
