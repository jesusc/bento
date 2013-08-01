/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.gcomponent.instantiation.util;

import genericity.gcomponent.instantiation.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see genericity.gcomponent.instantiation.ComponentInstantiationPackage
 * @generated
 */
public class ComponentInstantiationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ComponentInstantiationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstantiationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ComponentInstantiationPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentInstantiationSwitch<Adapter> modelSwitch =
		new ComponentInstantiationSwitch<Adapter>() {
			@Override
			public Adapter caseComponentInstantiation(ComponentInstantiation object) {
				return createComponentInstantiationAdapter();
			}
			@Override
			public Adapter caseExecutableTransformation(ExecutableTransformation object) {
				return createExecutableTransformationAdapter();
			}
			@Override
			public Adapter caseAdaptedTransformation(AdaptedTransformation object) {
				return createAdaptedTransformationAdapter();
			}
			@Override
			public Adapter caseAdaptWithBinding(AdaptWithBinding object) {
				return createAdaptWithBindingAdapter();
			}
			@Override
			public Adapter caseTemplateSpecificData(TemplateSpecificData object) {
				return createTemplateSpecificDataAdapter();
			}
			@Override
			public Adapter caseAtlTemplateData(AtlTemplateData object) {
				return createAtlTemplateDataAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link genericity.gcomponent.instantiation.ComponentInstantiation <em>Component Instantiation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericity.gcomponent.instantiation.ComponentInstantiation
	 * @generated
	 */
	public Adapter createComponentInstantiationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericity.gcomponent.instantiation.ExecutableTransformation <em>Executable Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericity.gcomponent.instantiation.ExecutableTransformation
	 * @generated
	 */
	public Adapter createExecutableTransformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericity.gcomponent.instantiation.AdaptedTransformation <em>Adapted Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericity.gcomponent.instantiation.AdaptedTransformation
	 * @generated
	 */
	public Adapter createAdaptedTransformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericity.gcomponent.instantiation.AdaptWithBinding <em>Adapt With Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericity.gcomponent.instantiation.AdaptWithBinding
	 * @generated
	 */
	public Adapter createAdaptWithBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericity.gcomponent.instantiation.TemplateSpecificData <em>Template Specific Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericity.gcomponent.instantiation.TemplateSpecificData
	 * @generated
	 */
	public Adapter createTemplateSpecificDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link genericity.gcomponent.instantiation.AtlTemplateData <em>Atl Template Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see genericity.gcomponent.instantiation.AtlTemplateData
	 * @generated
	 */
	public Adapter createAtlTemplateDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ComponentInstantiationAdapterFactory
