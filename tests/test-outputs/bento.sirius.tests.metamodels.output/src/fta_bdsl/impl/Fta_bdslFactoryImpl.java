/**
 */
package fta_bdsl.impl;

import fta_bdsl.*;

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
public class Fta_bdslFactoryImpl extends EFactoryImpl implements Fta_bdslFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Fta_bdslFactory init() {
		try {
			Fta_bdslFactory theFta_bdslFactory = (Fta_bdslFactory)EPackage.Registry.INSTANCE.getEFactory(Fta_bdslPackage.eNS_URI);
			if (theFta_bdslFactory != null) {
				return theFta_bdslFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Fta_bdslFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fta_bdslFactoryImpl() {
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
			case Fta_bdslPackage.EVENT: return createEvent();
			case Fta_bdslPackage.GATE: return createGate();
			case Fta_bdslPackage.FTA_MODEL: return createFTAModel();
			case Fta_bdslPackage.GATE_EVENT11: return creategateEvent11();
			case Fta_bdslPackage.EVENTS_GATE21: return createeventsGate21();
			case Fta_bdslPackage.TYPE_EVENT: return createtypeEvent();
			case Fta_bdslPackage.NAME_EVENT: return createnameEvent();
			case Fta_bdslPackage.PROBABILITY_EVENT: return createprobabilityEvent();
			case Fta_bdslPackage.DESCRIPTION_EVENT: return createdescriptionEvent();
			case Fta_bdslPackage.RELATED_OBJECT_EVENT: return createrelatedObjectEvent();
			case Fta_bdslPackage.REFERENCE_COUNT_EVENT: return createreferenceCountEvent();
			case Fta_bdslPackage.TYPE_GATE: return createtypeGate();
			case Fta_bdslPackage.DESCRIPTION_GATE: return createdescriptionGate();
			case Fta_bdslPackage.NB_OCCURRENCES_GATE: return createnbOccurrencesGate();
			case Fta_bdslPackage.NONE_ELEMENT: return createNoneElement();
			case Fta_bdslPackage.INTERMEDIATE_ELEMENT: return createIntermediateElement();
			case Fta_bdslPackage.METAMODEL_ELEMENT: return createMetamodelElement();
			case Fta_bdslPackage.METAMODEL_ELEMENT_FEATURE: return createMetamodelElementFeature();
			case Fta_bdslPackage.VIRTUAL_ATTRIBUTE: return createVirtualAttribute();
			case Fta_bdslPackage.SIRIUS_TAG: return createSiriusTag();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Fta_bdslPackage.EVENT_TYPE:
				return createEventTypeFromString(eDataType, initialValue);
			case Fta_bdslPackage.GATE_TYPE:
				return createGateTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Fta_bdslPackage.EVENT_TYPE:
				return convertEventTypeToString(eDataType, instanceValue);
			case Fta_bdslPackage.GATE_TYPE:
				return convertGateTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Gate createGate() {
		GateImpl gate = new GateImpl();
		return gate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FTAModel createFTAModel() {
		FTAModelImpl ftaModel = new FTAModelImpl();
		return ftaModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public gateEvent11 creategateEvent11() {
		gateEvent11Impl gateEvent11 = new gateEvent11Impl();
		return gateEvent11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public eventsGate21 createeventsGate21() {
		eventsGate21Impl eventsGate21 = new eventsGate21Impl();
		return eventsGate21;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public typeEvent createtypeEvent() {
		typeEventImpl typeEvent = new typeEventImpl();
		return typeEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public nameEvent createnameEvent() {
		nameEventImpl nameEvent = new nameEventImpl();
		return nameEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public probabilityEvent createprobabilityEvent() {
		probabilityEventImpl probabilityEvent = new probabilityEventImpl();
		return probabilityEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public descriptionEvent createdescriptionEvent() {
		descriptionEventImpl descriptionEvent = new descriptionEventImpl();
		return descriptionEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public relatedObjectEvent createrelatedObjectEvent() {
		relatedObjectEventImpl relatedObjectEvent = new relatedObjectEventImpl();
		return relatedObjectEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public referenceCountEvent createreferenceCountEvent() {
		referenceCountEventImpl referenceCountEvent = new referenceCountEventImpl();
		return referenceCountEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public typeGate createtypeGate() {
		typeGateImpl typeGate = new typeGateImpl();
		return typeGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public descriptionGate createdescriptionGate() {
		descriptionGateImpl descriptionGate = new descriptionGateImpl();
		return descriptionGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public nbOccurrencesGate createnbOccurrencesGate() {
		nbOccurrencesGateImpl nbOccurrencesGate = new nbOccurrencesGateImpl();
		return nbOccurrencesGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NoneElement createNoneElement() {
		NoneElementImpl noneElement = new NoneElementImpl();
		return noneElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntermediateElement createIntermediateElement() {
		IntermediateElementImpl intermediateElement = new IntermediateElementImpl();
		return intermediateElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetamodelElement createMetamodelElement() {
		MetamodelElementImpl metamodelElement = new MetamodelElementImpl();
		return metamodelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetamodelElementFeature createMetamodelElementFeature() {
		MetamodelElementFeatureImpl metamodelElementFeature = new MetamodelElementFeatureImpl();
		return metamodelElementFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VirtualAttribute createVirtualAttribute() {
		VirtualAttributeImpl virtualAttribute = new VirtualAttributeImpl();
		return virtualAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SiriusTag createSiriusTag() {
		SiriusTagImpl siriusTag = new SiriusTagImpl();
		return siriusTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventType createEventTypeFromString(EDataType eDataType, String initialValue) {
		EventType result = EventType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GateType createGateTypeFromString(EDataType eDataType, String initialValue) {
		GateType result = GateType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGateTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fta_bdslPackage getFta_bdslPackage() {
		return (Fta_bdslPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Fta_bdslPackage getPackage() {
		return Fta_bdslPackage.eINSTANCE;
	}

} //Fta_bdslFactoryImpl
