/**
 */
package bento.sirius.tests.metamodels.sequence;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see bento.sirius.tests.metamodels.sequence.SequenceFactory
 * @model kind="package"
 * @generated
 */
public interface SequencePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sequence";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://bento/sirius/tests/sequence";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sequence";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SequencePackage eINSTANCE = bento.sirius.tests.metamodels.sequence.impl.SequencePackageImpl.init();

	/**
	 * The meta object id for the '{@link bento.sirius.tests.metamodels.sequence.impl.SequenceModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.sirius.tests.metamodels.sequence.impl.SequenceModelImpl
	 * @see bento.sirius.tests.metamodels.sequence.impl.SequencePackageImpl#getSequenceModel()
	 * @generated
	 */
	int SEQUENCE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_MODEL__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bento.sirius.tests.metamodels.sequence.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.sirius.tests.metamodels.sequence.impl.ElementImpl
	 * @see bento.sirius.tests.metamodels.sequence.impl.SequencePackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NEXT = 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link bento.sirius.tests.metamodels.sequence.SequenceModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see bento.sirius.tests.metamodels.sequence.SequenceModel
	 * @generated
	 */
	EClass getSequenceModel();

	/**
	 * Returns the meta object for the containment reference list '{@link bento.sirius.tests.metamodels.sequence.SequenceModel#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see bento.sirius.tests.metamodels.sequence.SequenceModel#getElements()
	 * @see #getSequenceModel()
	 * @generated
	 */
	EReference getSequenceModel_Elements();

	/**
	 * Returns the meta object for class '{@link bento.sirius.tests.metamodels.sequence.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see bento.sirius.tests.metamodels.sequence.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link bento.sirius.tests.metamodels.sequence.Element#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see bento.sirius.tests.metamodels.sequence.Element#getValue()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Value();

	/**
	 * Returns the meta object for the containment reference '{@link bento.sirius.tests.metamodels.sequence.Element#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Next</em>'.
	 * @see bento.sirius.tests.metamodels.sequence.Element#getNext()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Next();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SequenceFactory getSequenceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link bento.sirius.tests.metamodels.sequence.impl.SequenceModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.sirius.tests.metamodels.sequence.impl.SequenceModelImpl
		 * @see bento.sirius.tests.metamodels.sequence.impl.SequencePackageImpl#getSequenceModel()
		 * @generated
		 */
		EClass SEQUENCE_MODEL = eINSTANCE.getSequenceModel();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_MODEL__ELEMENTS = eINSTANCE.getSequenceModel_Elements();

		/**
		 * The meta object literal for the '{@link bento.sirius.tests.metamodels.sequence.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.sirius.tests.metamodels.sequence.impl.ElementImpl
		 * @see bento.sirius.tests.metamodels.sequence.impl.SequencePackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__VALUE = eINSTANCE.getElement_Value();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__NEXT = eINSTANCE.getElement_Next();

	}

} //SequencePackage
