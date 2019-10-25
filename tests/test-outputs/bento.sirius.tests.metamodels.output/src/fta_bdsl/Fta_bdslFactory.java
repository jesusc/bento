/**
 */
package fta_bdsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fta_bdsl.Fta_bdslPackage
 * @generated
 */
public interface Fta_bdslFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Fta_bdslFactory eINSTANCE = fta_bdsl.impl.Fta_bdslFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event</em>'.
	 * @generated
	 */
	Event createEvent();

	/**
	 * Returns a new object of class '<em>Gate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gate</em>'.
	 * @generated
	 */
	Gate createGate();

	/**
	 * Returns a new object of class '<em>FTA Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FTA Model</em>'.
	 * @generated
	 */
	FTAModel createFTAModel();

	/**
	 * Returns a new object of class '<em>gate Event11</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>gate Event11</em>'.
	 * @generated
	 */
	gateEvent11 creategateEvent11();

	/**
	 * Returns a new object of class '<em>events Gate21</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>events Gate21</em>'.
	 * @generated
	 */
	eventsGate21 createeventsGate21();

	/**
	 * Returns a new object of class '<em>type Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>type Event</em>'.
	 * @generated
	 */
	typeEvent createtypeEvent();

	/**
	 * Returns a new object of class '<em>name Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>name Event</em>'.
	 * @generated
	 */
	nameEvent createnameEvent();

	/**
	 * Returns a new object of class '<em>probability Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>probability Event</em>'.
	 * @generated
	 */
	probabilityEvent createprobabilityEvent();

	/**
	 * Returns a new object of class '<em>description Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>description Event</em>'.
	 * @generated
	 */
	descriptionEvent createdescriptionEvent();

	/**
	 * Returns a new object of class '<em>related Object Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>related Object Event</em>'.
	 * @generated
	 */
	relatedObjectEvent createrelatedObjectEvent();

	/**
	 * Returns a new object of class '<em>reference Count Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>reference Count Event</em>'.
	 * @generated
	 */
	referenceCountEvent createreferenceCountEvent();

	/**
	 * Returns a new object of class '<em>type Gate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>type Gate</em>'.
	 * @generated
	 */
	typeGate createtypeGate();

	/**
	 * Returns a new object of class '<em>description Gate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>description Gate</em>'.
	 * @generated
	 */
	descriptionGate createdescriptionGate();

	/**
	 * Returns a new object of class '<em>nb Occurrences Gate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>nb Occurrences Gate</em>'.
	 * @generated
	 */
	nbOccurrencesGate createnbOccurrencesGate();

	/**
	 * Returns a new object of class '<em>None Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>None Element</em>'.
	 * @generated
	 */
	NoneElement createNoneElement();

	/**
	 * Returns a new object of class '<em>Intermediate Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intermediate Element</em>'.
	 * @generated
	 */
	IntermediateElement createIntermediateElement();

	/**
	 * Returns a new object of class '<em>Metamodel Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metamodel Element</em>'.
	 * @generated
	 */
	MetamodelElement createMetamodelElement();

	/**
	 * Returns a new object of class '<em>Metamodel Element Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metamodel Element Feature</em>'.
	 * @generated
	 */
	MetamodelElementFeature createMetamodelElementFeature();

	/**
	 * Returns a new object of class '<em>Virtual Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Virtual Attribute</em>'.
	 * @generated
	 */
	VirtualAttribute createVirtualAttribute();

	/**
	 * Returns a new object of class '<em>Sirius Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sirius Tag</em>'.
	 * @generated
	 */
	SiriusTag createSiriusTag();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Fta_bdslPackage getFta_bdslPackage();

} //Fta_bdslFactory
