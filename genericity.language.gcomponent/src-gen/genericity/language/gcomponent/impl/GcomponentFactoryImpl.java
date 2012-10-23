/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.language.gcomponent.impl;

import genericity.language.gcomponent.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class GcomponentFactoryImpl extends EFactoryImpl implements GcomponentFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static GcomponentFactory init()
  {
		try {
			GcomponentFactory theGcomponentFactory = (GcomponentFactory)EPackage.Registry.INSTANCE.getEFactory("http://genericity/language/gcomponent"); 
			if (theGcomponentFactory != null) {
				return theGcomponentFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GcomponentFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public GcomponentFactoryImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public EObject create(EClass eClass)
  {
		switch (eClass.getClassifierID()) {
			case GcomponentPackage.TRANSFORMATION_COMPONENT: return createTransformationComponent();
			case GcomponentPackage.ATL_TEMPLATE: return createAtlTemplate();
			case GcomponentPackage.OCL_CONSTRAINT: return createOclConstraint();
			case GcomponentPackage.METAMODEL: return createMetamodel();
			case GcomponentPackage.TAG: return createTag();
			case GcomponentPackage.CONCEPT: return createConcept();
			case GcomponentPackage.SPECIFICATION: return createSpecification();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationComponent createTransformationComponent() {
		TransformationComponentImpl transformationComponent = new TransformationComponentImpl();
		return transformationComponent;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtlTemplate createAtlTemplate() {
		AtlTemplateImpl atlTemplate = new AtlTemplateImpl();
		return atlTemplate;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclConstraint createOclConstraint() {
		OclConstraintImpl oclConstraint = new OclConstraintImpl();
		return oclConstraint;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metamodel createMetamodel() {
		MetamodelImpl metamodel = new MetamodelImpl();
		return metamodel;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tag createTag() {
		TagImpl tag = new TagImpl();
		return tag;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concept createConcept() {
		ConceptImpl concept = new ConceptImpl();
		return concept;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specification createSpecification() {
		SpecificationImpl specification = new SpecificationImpl();
		return specification;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public GcomponentPackage getGcomponentPackage()
  {
		return (GcomponentPackage)getEPackage();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static GcomponentPackage getPackage()
  {
		return GcomponentPackage.eINSTANCE;
	}

} //GcomponentFactoryImpl
