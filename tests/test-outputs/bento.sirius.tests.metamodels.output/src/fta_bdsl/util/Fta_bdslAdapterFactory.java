/**
 */
package fta_bdsl.util;

import fta_bdsl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fta_bdsl.Fta_bdslPackage
 * @generated
 */
public class Fta_bdslAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Fta_bdslPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fta_bdslAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Fta_bdslPackage.eINSTANCE;
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
	protected Fta_bdslSwitch<Adapter> modelSwitch =
		new Fta_bdslSwitch<Adapter>() {
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter caseGate(Gate object) {
				return createGateAdapter();
			}
			@Override
			public Adapter caseFTAModel(FTAModel object) {
				return createFTAModelAdapter();
			}
			@Override
			public Adapter casegateEvent11(gateEvent11 object) {
				return creategateEvent11Adapter();
			}
			@Override
			public Adapter caseeventsGate21(eventsGate21 object) {
				return createeventsGate21Adapter();
			}
			@Override
			public Adapter casetypeEvent(typeEvent object) {
				return createtypeEventAdapter();
			}
			@Override
			public Adapter casenameEvent(nameEvent object) {
				return createnameEventAdapter();
			}
			@Override
			public Adapter caseprobabilityEvent(probabilityEvent object) {
				return createprobabilityEventAdapter();
			}
			@Override
			public Adapter casedescriptionEvent(descriptionEvent object) {
				return createdescriptionEventAdapter();
			}
			@Override
			public Adapter caserelatedObjectEvent(relatedObjectEvent object) {
				return createrelatedObjectEventAdapter();
			}
			@Override
			public Adapter casereferenceCountEvent(referenceCountEvent object) {
				return createreferenceCountEventAdapter();
			}
			@Override
			public Adapter casetypeGate(typeGate object) {
				return createtypeGateAdapter();
			}
			@Override
			public Adapter casedescriptionGate(descriptionGate object) {
				return createdescriptionGateAdapter();
			}
			@Override
			public Adapter casenbOccurrencesGate(nbOccurrencesGate object) {
				return createnbOccurrencesGateAdapter();
			}
			@Override
			public Adapter caseNoneElement(NoneElement object) {
				return createNoneElementAdapter();
			}
			@Override
			public Adapter caseBindingElement(BindingElement object) {
				return createBindingElementAdapter();
			}
			@Override
			public Adapter caseIntermediateElement(IntermediateElement object) {
				return createIntermediateElementAdapter();
			}
			@Override
			public Adapter caseMetamodelElement(MetamodelElement object) {
				return createMetamodelElementAdapter();
			}
			@Override
			public Adapter caseMetamodelElementFeature(MetamodelElementFeature object) {
				return createMetamodelElementFeatureAdapter();
			}
			@Override
			public Adapter caseBindingAttribute(BindingAttribute object) {
				return createBindingAttributeAdapter();
			}
			@Override
			public Adapter caseVirtualAttribute(VirtualAttribute object) {
				return createVirtualAttributeAdapter();
			}
			@Override
			public Adapter caseSiriusTag(SiriusTag object) {
				return createSiriusTagAdapter();
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
	 * Creates a new adapter for an object of class '{@link fta_bdsl.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fta_bdsl.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fta_bdsl.Gate <em>Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fta_bdsl.Gate
	 * @generated
	 */
	public Adapter createGateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fta_bdsl.FTAModel <em>FTA Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fta_bdsl.FTAModel
	 * @generated
	 */
	public Adapter createFTAModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fta_bdsl.gateEvent11 <em>gate Event11</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fta_bdsl.gateEvent11
	 * @generated
	 */
	public Adapter creategateEvent11Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fta_bdsl.eventsGate21 <em>events Gate21</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fta_bdsl.eventsGate21
	 * @generated
	 */
	public Adapter createeventsGate21Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fta_bdsl.typeEvent <em>type Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fta_bdsl.typeEvent
	 * @generated
	 */
	public Adapter createtypeEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fta_bdsl.nameEvent <em>name Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fta_bdsl.nameEvent
	 * @generated
	 */
	public Adapter createnameEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fta_bdsl.probabilityEvent <em>probability Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fta_bdsl.probabilityEvent
	 * @generated
	 */
	public Adapter createprobabilityEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fta_bdsl.descriptionEvent <em>description Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fta_bdsl.descriptionEvent
	 * @generated
	 */
	public Adapter createdescriptionEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fta_bdsl.relatedObjectEvent <em>related Object Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fta_bdsl.relatedObjectEvent
	 * @generated
	 */
	public Adapter createrelatedObjectEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fta_bdsl.referenceCountEvent <em>reference Count Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fta_bdsl.referenceCountEvent
	 * @generated
	 */
	public Adapter createreferenceCountEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fta_bdsl.typeGate <em>type Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fta_bdsl.typeGate
	 * @generated
	 */
	public Adapter createtypeGateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fta_bdsl.descriptionGate <em>description Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fta_bdsl.descriptionGate
	 * @generated
	 */
	public Adapter createdescriptionGateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fta_bdsl.nbOccurrencesGate <em>nb Occurrences Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fta_bdsl.nbOccurrencesGate
	 * @generated
	 */
	public Adapter createnbOccurrencesGateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fta_bdsl.NoneElement <em>None Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fta_bdsl.NoneElement
	 * @generated
	 */
	public Adapter createNoneElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fta_bdsl.BindingElement <em>Binding Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fta_bdsl.BindingElement
	 * @generated
	 */
	public Adapter createBindingElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fta_bdsl.IntermediateElement <em>Intermediate Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fta_bdsl.IntermediateElement
	 * @generated
	 */
	public Adapter createIntermediateElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fta_bdsl.MetamodelElement <em>Metamodel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fta_bdsl.MetamodelElement
	 * @generated
	 */
	public Adapter createMetamodelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fta_bdsl.MetamodelElementFeature <em>Metamodel Element Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fta_bdsl.MetamodelElementFeature
	 * @generated
	 */
	public Adapter createMetamodelElementFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fta_bdsl.BindingAttribute <em>Binding Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fta_bdsl.BindingAttribute
	 * @generated
	 */
	public Adapter createBindingAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fta_bdsl.VirtualAttribute <em>Virtual Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fta_bdsl.VirtualAttribute
	 * @generated
	 */
	public Adapter createVirtualAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fta_bdsl.SiriusTag <em>Sirius Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fta_bdsl.SiriusTag
	 * @generated
	 */
	public Adapter createSiriusTagAdapter() {
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

} //Fta_bdslAdapterFactory
