/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.typing.atl_types.impl;

import genericity.typing.atl_types.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AtlTypingFactoryImpl extends EFactoryImpl implements AtlTypingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AtlTypingFactory init() {
		try {
			AtlTypingFactory theAtlTypingFactory = (AtlTypingFactory)EPackage.Registry.INSTANCE.getEFactory("http://genericity/types/atl"); 
			if (theAtlTypingFactory != null) {
				return theAtlTypingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AtlTypingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtlTypingFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AtlTypingPackage.OCL_UNDEFINED_TYPE: return createOclUndefinedType();
			case AtlTypingPackage.BOOLEAN_TYPE: return createBooleanType();
			case AtlTypingPackage.INTEGER_TYPE: return createIntegerType();
			case AtlTypingPackage.STRING_TYPE: return createStringType();
			case AtlTypingPackage.FLOAT_TYPE: return createFloatType();
			case AtlTypingPackage.TUPLE_TYPE: return createTupleType();
			case AtlTypingPackage.MAP_TYPE: return createMapType();
			case AtlTypingPackage.TUPLE_ATTRIBUTE: return createTupleAttribute();
			case AtlTypingPackage.REF_TYPE: return createRefType();
			case AtlTypingPackage.UNKNOWN: return createUnknown();
			case AtlTypingPackage.UNKNOWN_FEATURE: return createUnknownFeature();
			case AtlTypingPackage.EMPTY_COLLECTION: return createEmptyCollection();
			case AtlTypingPackage.ENUM_TYPE: return createEnumType();
			case AtlTypingPackage.METACLASS: return createMetaclass();
			case AtlTypingPackage.UNION_TYPE: return createUnionType();
			case AtlTypingPackage.THIS_MODULE_TYPE: return createThisModuleType();
			case AtlTypingPackage.REFLECTIVE_CLASS: return createReflectiveClass();
			case AtlTypingPackage.SEQUENCE_TYPE: return createSequenceType();
			case AtlTypingPackage.SET_TYPE: return createSetType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclUndefinedType createOclUndefinedType() {
		OclUndefinedTypeImpl oclUndefinedType = new OclUndefinedTypeImpl();
		return oclUndefinedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanType createBooleanType() {
		BooleanTypeImpl booleanType = new BooleanTypeImpl();
		return booleanType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerType createIntegerType() {
		IntegerTypeImpl integerType = new IntegerTypeImpl();
		return integerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringType createStringType() {
		StringTypeImpl stringType = new StringTypeImpl();
		return stringType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloatType createFloatType() {
		FloatTypeImpl floatType = new FloatTypeImpl();
		return floatType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TupleType createTupleType() {
		TupleTypeImpl tupleType = new TupleTypeImpl();
		return tupleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapType createMapType() {
		MapTypeImpl mapType = new MapTypeImpl();
		return mapType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TupleAttribute createTupleAttribute() {
		TupleAttributeImpl tupleAttribute = new TupleAttributeImpl();
		return tupleAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefType createRefType() {
		RefTypeImpl refType = new RefTypeImpl();
		return refType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unknown createUnknown() {
		UnknownImpl unknown = new UnknownImpl();
		return unknown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnknownFeature createUnknownFeature() {
		UnknownFeatureImpl unknownFeature = new UnknownFeatureImpl();
		return unknownFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmptyCollection createEmptyCollection() {
		EmptyCollectionImpl emptyCollection = new EmptyCollectionImpl();
		return emptyCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumType createEnumType() {
		EnumTypeImpl enumType = new EnumTypeImpl();
		return enumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metaclass createMetaclass() {
		MetaclassImpl metaclass = new MetaclassImpl();
		return metaclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnionType createUnionType() {
		UnionTypeImpl unionType = new UnionTypeImpl();
		return unionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThisModuleType createThisModuleType() {
		ThisModuleTypeImpl thisModuleType = new ThisModuleTypeImpl();
		return thisModuleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReflectiveClass createReflectiveClass() {
		ReflectiveClassImpl reflectiveClass = new ReflectiveClassImpl();
		return reflectiveClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceType createSequenceType() {
		SequenceTypeImpl sequenceType = new SequenceTypeImpl();
		return sequenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetType createSetType() {
		SetTypeImpl setType = new SetTypeImpl();
		return setType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtlTypingPackage getAtlTypingPackage() {
		return (AtlTypingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AtlTypingPackage getPackage() {
		return AtlTypingPackage.eINSTANCE;
	}

} //AtlTypingFactoryImpl
