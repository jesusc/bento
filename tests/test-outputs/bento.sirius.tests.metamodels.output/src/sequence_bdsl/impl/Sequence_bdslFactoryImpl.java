/**
 */
package sequence_bdsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import sequence_bdsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Sequence_bdslFactoryImpl extends EFactoryImpl implements Sequence_bdslFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Sequence_bdslFactory init() {
		try {
			Sequence_bdslFactory theSequence_bdslFactory = (Sequence_bdslFactory)EPackage.Registry.INSTANCE.getEFactory(Sequence_bdslPackage.eNS_URI);
			if (theSequence_bdslFactory != null) {
				return theSequence_bdslFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Sequence_bdslFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence_bdslFactoryImpl() {
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
			case Sequence_bdslPackage.SEQUENCE_MODEL: return createSequenceModel();
			case Sequence_bdslPackage.ELEMENT: return createElement();
			case Sequence_bdslPackage.VALUE_ELEMENT: return createvalueElement();
			case Sequence_bdslPackage.METAMODEL_ELEMENT: return createMetamodelElement();
			case Sequence_bdslPackage.INTEMEDIATE_ELEMENT: return createIntemediateElement();
			case Sequence_bdslPackage.METAMODEL_ELEMENT_FEATURE: return createMetamodelElementFeature();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceModel createSequenceModel() {
		SequenceModelImpl sequenceModel = new SequenceModelImpl();
		return sequenceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element createElement() {
		ElementImpl element = new ElementImpl();
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public valueElement createvalueElement() {
		valueElementImpl valueElement = new valueElementImpl();
		return valueElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelElement createMetamodelElement() {
		MetamodelElementImpl metamodelElement = new MetamodelElementImpl();
		return metamodelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntemediateElement createIntemediateElement() {
		IntemediateElementImpl intemediateElement = new IntemediateElementImpl();
		return intemediateElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelElementFeature createMetamodelElementFeature() {
		MetamodelElementFeatureImpl metamodelElementFeature = new MetamodelElementFeatureImpl();
		return metamodelElementFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence_bdslPackage getSequence_bdslPackage() {
		return (Sequence_bdslPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Sequence_bdslPackage getPackage() {
		return Sequence_bdslPackage.eINSTANCE;
	}

} //Sequence_bdslFactoryImpl
