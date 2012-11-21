/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.gcomponent.instantiation.impl;

import genericity.gcomponent.instantiation.*;

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
public class ComponentInstantiationFactoryImpl extends EFactoryImpl implements ComponentInstantiationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComponentInstantiationFactory init() {
		try {
			ComponentInstantiationFactory theComponentInstantiationFactory = (ComponentInstantiationFactory)EPackage.Registry.INSTANCE.getEFactory("http://genericity/language/gcomponent/instantiation"); 
			if (theComponentInstantiationFactory != null) {
				return theComponentInstantiationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ComponentInstantiationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstantiationFactoryImpl() {
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
			case ComponentInstantiationPackage.COMPONENT_INSTANTIATION: return createComponentInstantiation();
			case ComponentInstantiationPackage.ADAPTED_TRANSFORMATION: return createAdaptedTransformation();
			case ComponentInstantiationPackage.ADAPT_WITH_BINDING: return createAdaptWithBinding();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstantiation createComponentInstantiation() {
		ComponentInstantiationImpl componentInstantiation = new ComponentInstantiationImpl();
		return componentInstantiation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptedTransformation createAdaptedTransformation() {
		AdaptedTransformationImpl adaptedTransformation = new AdaptedTransformationImpl();
		return adaptedTransformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptWithBinding createAdaptWithBinding() {
		AdaptWithBindingImpl adaptWithBinding = new AdaptWithBindingImpl();
		return adaptWithBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstantiationPackage getComponentInstantiationPackage() {
		return (ComponentInstantiationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ComponentInstantiationPackage getPackage() {
		return ComponentInstantiationPackage.eINSTANCE;
	}

} //ComponentInstantiationFactoryImpl
