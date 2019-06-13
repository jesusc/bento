/**
 */
package sequence_bdsl;

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
 * @see sequence_bdsl.Sequence_bdslFactory
 * @model kind="package"
 * @generated
 */
public interface Sequence_bdslPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sequence_bdsl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://bento/sirius/tests/sequence_bdsl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sequence_bdsl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Sequence_bdslPackage eINSTANCE = sequence_bdsl.impl.Sequence_bdslPackageImpl.init();

	/**
	 * The meta object id for the '{@link sequence_bdsl.impl.SequenceModelImpl <em>Sequence Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sequence_bdsl.impl.SequenceModelImpl
	 * @see sequence_bdsl.impl.Sequence_bdslPackageImpl#getSequenceModel()
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
	 * The feature id for the '<em><b>Contains Metamodel Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_MODEL__CONTAINS_METAMODEL_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Contains Intermediate Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_MODEL__CONTAINS_INTERMEDIATE_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Contains Feature Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_MODEL__CONTAINS_FEATURE_CLASS = 3;

	/**
	 * The feature id for the '<em><b>Contains Metamodel Element Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_MODEL__CONTAINS_METAMODEL_ELEMENT_FEATURE = 4;

	/**
	 * The number of structural features of the '<em>Sequence Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_MODEL_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Sequence Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sequence_bdsl.impl.BindingElementImpl <em>Binding Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sequence_bdsl.impl.BindingElementImpl
	 * @see sequence_bdsl.impl.Sequence_bdslPackageImpl#getBindingElement()
	 * @generated
	 */
	int BINDING_ELEMENT = 3;

	/**
	 * The number of structural features of the '<em>Binding Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Binding Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sequence_bdsl.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sequence_bdsl.impl.ElementImpl
	 * @see sequence_bdsl.impl.Sequence_bdslPackageImpl#getElement()
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
	int ELEMENT__VALUE = BINDING_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NEXT = BINDING_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Containsvalue Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__CONTAINSVALUE_ELEMENT = BINDING_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = BINDING_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = BINDING_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sequence_bdsl.impl.FeatureClassImpl <em>Feature Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sequence_bdsl.impl.FeatureClassImpl
	 * @see sequence_bdsl.impl.Sequence_bdslPackageImpl#getFeatureClass()
	 * @generated
	 */
	int FEATURE_CLASS = 7;

	/**
	 * The number of structural features of the '<em>Feature Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CLASS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Feature Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sequence_bdsl.impl.valueElementImpl <em>value Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sequence_bdsl.impl.valueElementImpl
	 * @see sequence_bdsl.impl.Sequence_bdslPackageImpl#getvalueElement()
	 * @generated
	 */
	int VALUE_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ELEMENT__VALUE = FEATURE_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>value Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ELEMENT_FEATURE_COUNT = FEATURE_CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>value Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ELEMENT_OPERATION_COUNT = FEATURE_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link sequence_bdsl.impl.MetamodelElementImpl <em>Metamodel Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sequence_bdsl.impl.MetamodelElementImpl
	 * @see sequence_bdsl.impl.Sequence_bdslPackageImpl#getMetamodelElement()
	 * @generated
	 */
	int METAMODEL_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Metamodel Element Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_ELEMENT__METAMODEL_ELEMENT_FEATURE = 1;

	/**
	 * The number of structural features of the '<em>Metamodel Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Metamodel Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sequence_bdsl.impl.IntemediateElementImpl <em>Intemediate Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sequence_bdsl.impl.IntemediateElementImpl
	 * @see sequence_bdsl.impl.Sequence_bdslPackageImpl#getIntemediateElement()
	 * @generated
	 */
	int INTEMEDIATE_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Binding Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEMEDIATE_ELEMENT__BINDING_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Metamod Elelement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEMEDIATE_ELEMENT__METAMOD_ELELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Intemediate Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEMEDIATE_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Intemediate Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEMEDIATE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sequence_bdsl.impl.MetamodelElementFeatureImpl <em>Metamodel Element Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sequence_bdsl.impl.MetamodelElementFeatureImpl
	 * @see sequence_bdsl.impl.Sequence_bdslPackageImpl#getMetamodelElementFeature()
	 * @generated
	 */
	int METAMODEL_ELEMENT_FEATURE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_ELEMENT_FEATURE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Feature Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_ELEMENT_FEATURE__FEATURE_CLASS = 1;

	/**
	 * The number of structural features of the '<em>Metamodel Element Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_ELEMENT_FEATURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Metamodel Element Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_ELEMENT_FEATURE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link sequence_bdsl.SequenceModel <em>Sequence Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Model</em>'.
	 * @see sequence_bdsl.SequenceModel
	 * @generated
	 */
	EClass getSequenceModel();

	/**
	 * Returns the meta object for the containment reference list '{@link sequence_bdsl.SequenceModel#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see sequence_bdsl.SequenceModel#getElements()
	 * @see #getSequenceModel()
	 * @generated
	 */
	EReference getSequenceModel_Elements();

	/**
	 * Returns the meta object for the containment reference list '{@link sequence_bdsl.SequenceModel#getContainsMetamodelElement <em>Contains Metamodel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Metamodel Element</em>'.
	 * @see sequence_bdsl.SequenceModel#getContainsMetamodelElement()
	 * @see #getSequenceModel()
	 * @generated
	 */
	EReference getSequenceModel_ContainsMetamodelElement();

	/**
	 * Returns the meta object for the containment reference list '{@link sequence_bdsl.SequenceModel#getContainsIntermediateElement <em>Contains Intermediate Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Intermediate Element</em>'.
	 * @see sequence_bdsl.SequenceModel#getContainsIntermediateElement()
	 * @see #getSequenceModel()
	 * @generated
	 */
	EReference getSequenceModel_ContainsIntermediateElement();

	/**
	 * Returns the meta object for the containment reference list '{@link sequence_bdsl.SequenceModel#getContainsFeatureClass <em>Contains Feature Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Feature Class</em>'.
	 * @see sequence_bdsl.SequenceModel#getContainsFeatureClass()
	 * @see #getSequenceModel()
	 * @generated
	 */
	EReference getSequenceModel_ContainsFeatureClass();

	/**
	 * Returns the meta object for the containment reference list '{@link sequence_bdsl.SequenceModel#getContainsMetamodelElementFeature <em>Contains Metamodel Element Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Metamodel Element Feature</em>'.
	 * @see sequence_bdsl.SequenceModel#getContainsMetamodelElementFeature()
	 * @see #getSequenceModel()
	 * @generated
	 */
	EReference getSequenceModel_ContainsMetamodelElementFeature();

	/**
	 * Returns the meta object for class '{@link sequence_bdsl.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see sequence_bdsl.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link sequence_bdsl.Element#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see sequence_bdsl.Element#getValue()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Value();

	/**
	 * Returns the meta object for the containment reference '{@link sequence_bdsl.Element#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Next</em>'.
	 * @see sequence_bdsl.Element#getNext()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Next();

	/**
	 * Returns the meta object for the containment reference '{@link sequence_bdsl.Element#getContainsvalueElement <em>Containsvalue Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Containsvalue Element</em>'.
	 * @see sequence_bdsl.Element#getContainsvalueElement()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_ContainsvalueElement();

	/**
	 * Returns the meta object for class '{@link sequence_bdsl.valueElement <em>value Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>value Element</em>'.
	 * @see sequence_bdsl.valueElement
	 * @generated
	 */
	EClass getvalueElement();

	/**
	 * Returns the meta object for the attribute '{@link sequence_bdsl.valueElement#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see sequence_bdsl.valueElement#getValue()
	 * @see #getvalueElement()
	 * @generated
	 */
	EAttribute getvalueElement_Value();

	/**
	 * Returns the meta object for class '{@link sequence_bdsl.BindingElement <em>Binding Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Element</em>'.
	 * @see sequence_bdsl.BindingElement
	 * @generated
	 */
	EClass getBindingElement();

	/**
	 * Returns the meta object for class '{@link sequence_bdsl.MetamodelElement <em>Metamodel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metamodel Element</em>'.
	 * @see sequence_bdsl.MetamodelElement
	 * @generated
	 */
	EClass getMetamodelElement();

	/**
	 * Returns the meta object for the attribute '{@link sequence_bdsl.MetamodelElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sequence_bdsl.MetamodelElement#getName()
	 * @see #getMetamodelElement()
	 * @generated
	 */
	EAttribute getMetamodelElement_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link sequence_bdsl.MetamodelElement#getMetamodelElementFeature <em>Metamodel Element Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metamodel Element Feature</em>'.
	 * @see sequence_bdsl.MetamodelElement#getMetamodelElementFeature()
	 * @see #getMetamodelElement()
	 * @generated
	 */
	EReference getMetamodelElement_MetamodelElementFeature();

	/**
	 * Returns the meta object for class '{@link sequence_bdsl.IntemediateElement <em>Intemediate Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intemediate Element</em>'.
	 * @see sequence_bdsl.IntemediateElement
	 * @generated
	 */
	EClass getIntemediateElement();

	/**
	 * Returns the meta object for the reference '{@link sequence_bdsl.IntemediateElement#getBindingElement <em>Binding Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Binding Element</em>'.
	 * @see sequence_bdsl.IntemediateElement#getBindingElement()
	 * @see #getIntemediateElement()
	 * @generated
	 */
	EReference getIntemediateElement_BindingElement();

	/**
	 * Returns the meta object for the reference '{@link sequence_bdsl.IntemediateElement#getMetamodElelement <em>Metamod Elelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Metamod Elelement</em>'.
	 * @see sequence_bdsl.IntemediateElement#getMetamodElelement()
	 * @see #getIntemediateElement()
	 * @generated
	 */
	EReference getIntemediateElement_MetamodElelement();

	/**
	 * Returns the meta object for class '{@link sequence_bdsl.MetamodelElementFeature <em>Metamodel Element Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metamodel Element Feature</em>'.
	 * @see sequence_bdsl.MetamodelElementFeature
	 * @generated
	 */
	EClass getMetamodelElementFeature();

	/**
	 * Returns the meta object for the attribute '{@link sequence_bdsl.MetamodelElementFeature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sequence_bdsl.MetamodelElementFeature#getName()
	 * @see #getMetamodelElementFeature()
	 * @generated
	 */
	EAttribute getMetamodelElementFeature_Name();

	/**
	 * Returns the meta object for the reference list '{@link sequence_bdsl.MetamodelElementFeature#getFeatureClass <em>Feature Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Feature Class</em>'.
	 * @see sequence_bdsl.MetamodelElementFeature#getFeatureClass()
	 * @see #getMetamodelElementFeature()
	 * @generated
	 */
	EReference getMetamodelElementFeature_FeatureClass();

	/**
	 * Returns the meta object for class '{@link sequence_bdsl.FeatureClass <em>Feature Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Class</em>'.
	 * @see sequence_bdsl.FeatureClass
	 * @generated
	 */
	EClass getFeatureClass();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Sequence_bdslFactory getSequence_bdslFactory();

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
		 * The meta object literal for the '{@link sequence_bdsl.impl.SequenceModelImpl <em>Sequence Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sequence_bdsl.impl.SequenceModelImpl
		 * @see sequence_bdsl.impl.Sequence_bdslPackageImpl#getSequenceModel()
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
		 * The meta object literal for the '<em><b>Contains Metamodel Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_MODEL__CONTAINS_METAMODEL_ELEMENT = eINSTANCE.getSequenceModel_ContainsMetamodelElement();

		/**
		 * The meta object literal for the '<em><b>Contains Intermediate Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_MODEL__CONTAINS_INTERMEDIATE_ELEMENT = eINSTANCE.getSequenceModel_ContainsIntermediateElement();

		/**
		 * The meta object literal for the '<em><b>Contains Feature Class</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_MODEL__CONTAINS_FEATURE_CLASS = eINSTANCE.getSequenceModel_ContainsFeatureClass();

		/**
		 * The meta object literal for the '<em><b>Contains Metamodel Element Feature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_MODEL__CONTAINS_METAMODEL_ELEMENT_FEATURE = eINSTANCE.getSequenceModel_ContainsMetamodelElementFeature();

		/**
		 * The meta object literal for the '{@link sequence_bdsl.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sequence_bdsl.impl.ElementImpl
		 * @see sequence_bdsl.impl.Sequence_bdslPackageImpl#getElement()
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

		/**
		 * The meta object literal for the '<em><b>Containsvalue Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__CONTAINSVALUE_ELEMENT = eINSTANCE.getElement_ContainsvalueElement();

		/**
		 * The meta object literal for the '{@link sequence_bdsl.impl.valueElementImpl <em>value Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sequence_bdsl.impl.valueElementImpl
		 * @see sequence_bdsl.impl.Sequence_bdslPackageImpl#getvalueElement()
		 * @generated
		 */
		EClass VALUE_ELEMENT = eINSTANCE.getvalueElement();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_ELEMENT__VALUE = eINSTANCE.getvalueElement_Value();

		/**
		 * The meta object literal for the '{@link sequence_bdsl.impl.BindingElementImpl <em>Binding Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sequence_bdsl.impl.BindingElementImpl
		 * @see sequence_bdsl.impl.Sequence_bdslPackageImpl#getBindingElement()
		 * @generated
		 */
		EClass BINDING_ELEMENT = eINSTANCE.getBindingElement();

		/**
		 * The meta object literal for the '{@link sequence_bdsl.impl.MetamodelElementImpl <em>Metamodel Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sequence_bdsl.impl.MetamodelElementImpl
		 * @see sequence_bdsl.impl.Sequence_bdslPackageImpl#getMetamodelElement()
		 * @generated
		 */
		EClass METAMODEL_ELEMENT = eINSTANCE.getMetamodelElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METAMODEL_ELEMENT__NAME = eINSTANCE.getMetamodelElement_Name();

		/**
		 * The meta object literal for the '<em><b>Metamodel Element Feature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METAMODEL_ELEMENT__METAMODEL_ELEMENT_FEATURE = eINSTANCE.getMetamodelElement_MetamodelElementFeature();

		/**
		 * The meta object literal for the '{@link sequence_bdsl.impl.IntemediateElementImpl <em>Intemediate Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sequence_bdsl.impl.IntemediateElementImpl
		 * @see sequence_bdsl.impl.Sequence_bdslPackageImpl#getIntemediateElement()
		 * @generated
		 */
		EClass INTEMEDIATE_ELEMENT = eINSTANCE.getIntemediateElement();

		/**
		 * The meta object literal for the '<em><b>Binding Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEMEDIATE_ELEMENT__BINDING_ELEMENT = eINSTANCE.getIntemediateElement_BindingElement();

		/**
		 * The meta object literal for the '<em><b>Metamod Elelement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEMEDIATE_ELEMENT__METAMOD_ELELEMENT = eINSTANCE.getIntemediateElement_MetamodElelement();

		/**
		 * The meta object literal for the '{@link sequence_bdsl.impl.MetamodelElementFeatureImpl <em>Metamodel Element Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sequence_bdsl.impl.MetamodelElementFeatureImpl
		 * @see sequence_bdsl.impl.Sequence_bdslPackageImpl#getMetamodelElementFeature()
		 * @generated
		 */
		EClass METAMODEL_ELEMENT_FEATURE = eINSTANCE.getMetamodelElementFeature();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METAMODEL_ELEMENT_FEATURE__NAME = eINSTANCE.getMetamodelElementFeature_Name();

		/**
		 * The meta object literal for the '<em><b>Feature Class</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METAMODEL_ELEMENT_FEATURE__FEATURE_CLASS = eINSTANCE.getMetamodelElementFeature_FeatureClass();

		/**
		 * The meta object literal for the '{@link sequence_bdsl.impl.FeatureClassImpl <em>Feature Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sequence_bdsl.impl.FeatureClassImpl
		 * @see sequence_bdsl.impl.Sequence_bdslPackageImpl#getFeatureClass()
		 * @generated
		 */
		EClass FEATURE_CLASS = eINSTANCE.getFeatureClass();

	}

} //Sequence_bdslPackage
