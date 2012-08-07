/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.emftext.language.gbind.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.emftext.language.gbind.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GbindFactoryImpl extends EFactoryImpl implements GbindFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GbindFactory init() {
		try {
			GbindFactory theGbindFactory = (GbindFactory)EPackage.Registry.INSTANCE.getEFactory("http://genericity/language/gbind"); 
			if (theGbindFactory != null) {
				return theGbindFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GbindFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GbindFactoryImpl() {
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
			case GbindPackage.BINDING_MODEL: return createBindingModel();
			case GbindPackage.CONCEPT_METACLASS: return createConceptMetaclass();
			case GbindPackage.CONCRETE_METACLASS: return createConcreteMetaclass();
			case GbindPackage.CLASS_BINDING: return createClassBinding();
			case GbindPackage.BASE_FEATURE_BINDING: return createBaseFeatureBinding();
			case GbindPackage.RENAMING_FEATURE_BINDING: return createRenamingFeatureBinding();
			case GbindPackage.OCL_FEATURE_BINDING: return createOclFeatureBinding();
			case GbindPackage.BASE_HELPER: return createBaseHelper();
			case GbindPackage.CONCEPT_HELPER: return createConceptHelper();
			case GbindPackage.LOCAL_HELPER: return createLocalHelper();
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
	public GbindPackage getGbindPackage() {
		return (GbindPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GbindPackage getPackage() {
		return GbindPackage.eINSTANCE;
	}

} //GbindFactoryImpl
