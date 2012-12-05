/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gbind.dsl.util;

import gbind.dsl.*;

import gbind.simpleocl.LocatedElement;
import gbind.simpleocl.NamedElement;
import gbind.simpleocl.OclMetamodel;
import gbind.simpleocl.OclModel;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see gbind.dsl.DslPackage
 * @generated
 */
public class DslAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DslPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DslAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DslPackage.eINSTANCE;
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
	protected DslSwitch<Adapter> modelSwitch =
		new DslSwitch<Adapter>() {
			@Override
			public Adapter caseBindingModel(BindingModel object) {
				return createBindingModelAdapter();
			}
			@Override
			public Adapter caseMetamodelDeclaration(MetamodelDeclaration object) {
				return createMetamodelDeclarationAdapter();
			}
			@Override
			public Adapter caseMetaclass(Metaclass object) {
				return createMetaclassAdapter();
			}
			@Override
			public Adapter caseConceptMetaclass(ConceptMetaclass object) {
				return createConceptMetaclassAdapter();
			}
			@Override
			public Adapter caseConcreteMetaclass(ConcreteMetaclass object) {
				return createConcreteMetaclassAdapter();
			}
			@Override
			public Adapter caseConceptBinding(ConceptBinding object) {
				return createConceptBindingAdapter();
			}
			@Override
			public Adapter caseClassBinding(ClassBinding object) {
				return createClassBindingAdapter();
			}
			@Override
			public Adapter caseBaseFeatureBinding(BaseFeatureBinding object) {
				return createBaseFeatureBindingAdapter();
			}
			@Override
			public Adapter caseRenamingFeatureBinding(RenamingFeatureBinding object) {
				return createRenamingFeatureBindingAdapter();
			}
			@Override
			public Adapter caseOclFeatureBinding(OclFeatureBinding object) {
				return createOclFeatureBindingAdapter();
			}
			@Override
			public Adapter caseBaseHelper(BaseHelper object) {
				return createBaseHelperAdapter();
			}
			@Override
			public Adapter caseConceptHelper(ConceptHelper object) {
				return createConceptHelperAdapter();
			}
			@Override
			public Adapter caseLocalHelper(LocalHelper object) {
				return createLocalHelperAdapter();
			}
			@Override
			public Adapter caseLocatedElement(LocatedElement object) {
				return createLocatedElementAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseOclModel(OclModel object) {
				return createOclModelAdapter();
			}
			@Override
			public Adapter caseOclMetamodel(OclMetamodel object) {
				return createOclMetamodelAdapter();
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
	 * Creates a new adapter for an object of class '{@link gbind.dsl.BindingModel <em>Binding Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gbind.dsl.BindingModel
	 * @generated
	 */
	public Adapter createBindingModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gbind.dsl.MetamodelDeclaration <em>Metamodel Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gbind.dsl.MetamodelDeclaration
	 * @generated
	 */
	public Adapter createMetamodelDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gbind.dsl.Metaclass <em>Metaclass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gbind.dsl.Metaclass
	 * @generated
	 */
	public Adapter createMetaclassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gbind.dsl.ConceptMetaclass <em>Concept Metaclass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gbind.dsl.ConceptMetaclass
	 * @generated
	 */
	public Adapter createConceptMetaclassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gbind.dsl.ConcreteMetaclass <em>Concrete Metaclass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gbind.dsl.ConcreteMetaclass
	 * @generated
	 */
	public Adapter createConcreteMetaclassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gbind.dsl.ConceptBinding <em>Concept Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gbind.dsl.ConceptBinding
	 * @generated
	 */
	public Adapter createConceptBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gbind.dsl.ClassBinding <em>Class Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gbind.dsl.ClassBinding
	 * @generated
	 */
	public Adapter createClassBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gbind.dsl.BaseFeatureBinding <em>Base Feature Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gbind.dsl.BaseFeatureBinding
	 * @generated
	 */
	public Adapter createBaseFeatureBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gbind.dsl.RenamingFeatureBinding <em>Renaming Feature Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gbind.dsl.RenamingFeatureBinding
	 * @generated
	 */
	public Adapter createRenamingFeatureBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gbind.dsl.OclFeatureBinding <em>Ocl Feature Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gbind.dsl.OclFeatureBinding
	 * @generated
	 */
	public Adapter createOclFeatureBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gbind.dsl.BaseHelper <em>Base Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gbind.dsl.BaseHelper
	 * @generated
	 */
	public Adapter createBaseHelperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gbind.dsl.ConceptHelper <em>Concept Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gbind.dsl.ConceptHelper
	 * @generated
	 */
	public Adapter createConceptHelperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gbind.dsl.LocalHelper <em>Local Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gbind.dsl.LocalHelper
	 * @generated
	 */
	public Adapter createLocalHelperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gbind.simpleocl.LocatedElement <em>Located Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gbind.simpleocl.LocatedElement
	 * @generated
	 */
	public Adapter createLocatedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gbind.simpleocl.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gbind.simpleocl.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gbind.simpleocl.OclModel <em>Ocl Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gbind.simpleocl.OclModel
	 * @generated
	 */
	public Adapter createOclModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gbind.simpleocl.OclMetamodel <em>Ocl Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gbind.simpleocl.OclMetamodel
	 * @generated
	 */
	public Adapter createOclMetamodelAdapter() {
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

} //DslAdapterFactory
