/**
 */
package sequence_bdsl.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import sequence_bdsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see sequence_bdsl.Sequence_bdslPackage
 * @generated
 */
public class Sequence_bdslAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Sequence_bdslPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence_bdslAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Sequence_bdslPackage.eINSTANCE;
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
	protected Sequence_bdslSwitch<Adapter> modelSwitch =
		new Sequence_bdslSwitch<Adapter>() {
			@Override
			public Adapter caseSequenceModel(SequenceModel object) {
				return createSequenceModelAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter casevalueElement(valueElement object) {
				return createvalueElementAdapter();
			}
			@Override
			public Adapter caseBindingElement(BindingElement object) {
				return createBindingElementAdapter();
			}
			@Override
			public Adapter caseMetamodelElement(MetamodelElement object) {
				return createMetamodelElementAdapter();
			}
			@Override
			public Adapter caseIntemediateElement(IntemediateElement object) {
				return createIntemediateElementAdapter();
			}
			@Override
			public Adapter caseMetamodelElementFeature(MetamodelElementFeature object) {
				return createMetamodelElementFeatureAdapter();
			}
			@Override
			public Adapter caseFeatureClass(FeatureClass object) {
				return createFeatureClassAdapter();
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
	 * Creates a new adapter for an object of class '{@link sequence_bdsl.SequenceModel <em>Sequence Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sequence_bdsl.SequenceModel
	 * @generated
	 */
	public Adapter createSequenceModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sequence_bdsl.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sequence_bdsl.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sequence_bdsl.valueElement <em>value Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sequence_bdsl.valueElement
	 * @generated
	 */
	public Adapter createvalueElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sequence_bdsl.BindingElement <em>Binding Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sequence_bdsl.BindingElement
	 * @generated
	 */
	public Adapter createBindingElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sequence_bdsl.MetamodelElement <em>Metamodel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sequence_bdsl.MetamodelElement
	 * @generated
	 */
	public Adapter createMetamodelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sequence_bdsl.IntemediateElement <em>Intemediate Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sequence_bdsl.IntemediateElement
	 * @generated
	 */
	public Adapter createIntemediateElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sequence_bdsl.MetamodelElementFeature <em>Metamodel Element Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sequence_bdsl.MetamodelElementFeature
	 * @generated
	 */
	public Adapter createMetamodelElementFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sequence_bdsl.FeatureClass <em>Feature Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sequence_bdsl.FeatureClass
	 * @generated
	 */
	public Adapter createFeatureClassAdapter() {
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

} //Sequence_bdslAdapterFactory
