/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gbind.dsl.impl;

import gbind.dsl.*;

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
public class DslFactoryImpl extends EFactoryImpl implements DslFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DslFactory init() {
		try {
			DslFactory theDslFactory = (DslFactory)EPackage.Registry.INSTANCE.getEFactory("http://http://genericity/language/gbind/dsl"); 
			if (theDslFactory != null) {
				return theDslFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DslFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DslFactoryImpl() {
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
			case DslPackage.BINDING_MODEL: return createBindingModel();
			case DslPackage.BINDING_OPTIONS: return createBindingOptions();
			case DslPackage.METAMODEL_DECLARATION: return createMetamodelDeclaration();
			case DslPackage.CONCEPT_METACLASS: return createConceptMetaclass();
			case DslPackage.CONCRETE_METACLASS: return createConcreteMetaclass();
			case DslPackage.CLASS_BINDING: return createClassBinding();
			case DslPackage.INTERMEDIATE_CLASS_BINDING: return createIntermediateClassBinding();
			case DslPackage.CONCRETE_REFERENC_DECLARING_VAR: return createConcreteReferencDeclaringVar();
			case DslPackage.VIRTUAL_METACLASS: return createVirtualMetaclass();
			case DslPackage.VIRTUAL_FEATURE: return createVirtualFeature();
			case DslPackage.VIRTUAL_REFERENCE: return createVirtualReference();
			case DslPackage.VIRTUAL_ATTRIBUTE: return createVirtualAttribute();
			case DslPackage.VIRTUAL_CLASS_BINDING: return createVirtualClassBinding();
			case DslPackage.CONCEPT_FEATURE_REF: return createConceptFeatureRef();
			case DslPackage.BASE_FEATURE_BINDING: return createBaseFeatureBinding();
			case DslPackage.RENAMING_FEATURE_BINDING: return createRenamingFeatureBinding();
			case DslPackage.OCL_FEATURE_BINDING: return createOclFeatureBinding();
			case DslPackage.BASE_HELPER: return createBaseHelper();
			case DslPackage.CONCEPT_HELPER: return createConceptHelper();
			case DslPackage.LOCAL_HELPER: return createLocalHelper();
			case DslPackage.HELPER_PARAMETER: return createHelperParameter();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingModel createBindingModel() {
		BindingModelImpl bindingModel = new BindingModelImpl();
		return bindingModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingOptions createBindingOptions() {
		BindingOptionsImpl bindingOptions = new BindingOptionsImpl();
		return bindingOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelDeclaration createMetamodelDeclaration() {
		MetamodelDeclarationImpl metamodelDeclaration = new MetamodelDeclarationImpl();
		return metamodelDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMetaclass createConceptMetaclass() {
		ConceptMetaclassImpl conceptMetaclass = new ConceptMetaclassImpl();
		return conceptMetaclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteMetaclass createConcreteMetaclass() {
		ConcreteMetaclassImpl concreteMetaclass = new ConcreteMetaclassImpl();
		return concreteMetaclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassBinding createClassBinding() {
		ClassBindingImpl classBinding = new ClassBindingImpl();
		return classBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateClassBinding createIntermediateClassBinding() {
		IntermediateClassBindingImpl intermediateClassBinding = new IntermediateClassBindingImpl();
		return intermediateClassBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteReferencDeclaringVar createConcreteReferencDeclaringVar() {
		ConcreteReferencDeclaringVarImpl concreteReferencDeclaringVar = new ConcreteReferencDeclaringVarImpl();
		return concreteReferencDeclaringVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualMetaclass createVirtualMetaclass() {
		VirtualMetaclassImpl virtualMetaclass = new VirtualMetaclassImpl();
		return virtualMetaclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualFeature createVirtualFeature() {
		VirtualFeatureImpl virtualFeature = new VirtualFeatureImpl();
		return virtualFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualReference createVirtualReference() {
		VirtualReferenceImpl virtualReference = new VirtualReferenceImpl();
		return virtualReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualAttribute createVirtualAttribute() {
		VirtualAttributeImpl virtualAttribute = new VirtualAttributeImpl();
		return virtualAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualClassBinding createVirtualClassBinding() {
		VirtualClassBindingImpl virtualClassBinding = new VirtualClassBindingImpl();
		return virtualClassBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptFeatureRef createConceptFeatureRef() {
		ConceptFeatureRefImpl conceptFeatureRef = new ConceptFeatureRefImpl();
		return conceptFeatureRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseFeatureBinding createBaseFeatureBinding() {
		BaseFeatureBindingImpl baseFeatureBinding = new BaseFeatureBindingImpl();
		return baseFeatureBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RenamingFeatureBinding createRenamingFeatureBinding() {
		RenamingFeatureBindingImpl renamingFeatureBinding = new RenamingFeatureBindingImpl();
		return renamingFeatureBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclFeatureBinding createOclFeatureBinding() {
		OclFeatureBindingImpl oclFeatureBinding = new OclFeatureBindingImpl();
		return oclFeatureBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseHelper createBaseHelper() {
		BaseHelperImpl baseHelper = new BaseHelperImpl();
		return baseHelper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptHelper createConceptHelper() {
		ConceptHelperImpl conceptHelper = new ConceptHelperImpl();
		return conceptHelper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalHelper createLocalHelper() {
		LocalHelperImpl localHelper = new LocalHelperImpl();
		return localHelper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HelperParameter createHelperParameter() {
		HelperParameterImpl helperParameter = new HelperParameterImpl();
		return helperParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DslPackage getDslPackage() {
		return (DslPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DslPackage getPackage() {
		return DslPackage.eINSTANCE;
	}

} //DslFactoryImpl
