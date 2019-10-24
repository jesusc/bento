/**
 */
package mindstorms_bdsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see mindstorms_bdsl.Mindstorms_bdslFactory
 * @model kind="package"
 * @generated
 */
public interface Mindstorms_bdslPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mindstorms_bdsl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.obeo.fr/dsl/mindstorms/1.0.0_bdsl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mindstorms_bdsl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Mindstorms_bdslPackage eINSTANCE = mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl.init();

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.NamedElementImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Contains None Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__CONTAINS_NONE_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Contains Binding Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__CONTAINS_BINDING_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Contains Intermediate Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__CONTAINS_INTERMEDIATE_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Contains Metamodel Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__CONTAINS_METAMODEL_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Contains Metamodel Element Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__CONTAINS_METAMODEL_ELEMENT_FEATURE = 5;

	/**
	 * The feature id for the '<em><b>Contains Binding Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__CONTAINS_BINDING_ATTRIBUTE = 6;

	/**
	 * The feature id for the '<em><b>Contains Virtual Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__CONTAINS_VIRTUAL_ATTRIBUTE = 7;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.BindingElementImpl <em>Binding Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.BindingElementImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getBindingElement()
	 * @generated
	 */
	int BINDING_ELEMENT = 66;

	/**
	 * The feature id for the '<em><b>None Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_ELEMENT__NONE_ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Binding Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Binding Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.MainImpl <em>Main</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.MainImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getMain()
	 * @generated
	 */
	int MAIN = 1;

	/**
	 * The feature id for the '<em><b>None Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN__NONE_ELEMENT = BINDING_ELEMENT__NONE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN__INSTRUCTIONS = BINDING_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Main</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_FEATURE_COUNT = BINDING_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Main</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_OPERATION_COUNT = BINDING_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.InstructionImpl <em>Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.InstructionImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getInstruction()
	 * @generated
	 */
	int INSTRUCTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Contains None Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__CONTAINS_NONE_ELEMENT = NAMED_ELEMENT__CONTAINS_NONE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Binding Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__CONTAINS_BINDING_ELEMENT = NAMED_ELEMENT__CONTAINS_BINDING_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Intermediate Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__CONTAINS_INTERMEDIATE_ELEMENT = NAMED_ELEMENT__CONTAINS_INTERMEDIATE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Metamodel Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__CONTAINS_METAMODEL_ELEMENT = NAMED_ELEMENT__CONTAINS_METAMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Metamodel Element Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__CONTAINS_METAMODEL_ELEMENT_FEATURE = NAMED_ELEMENT__CONTAINS_METAMODEL_ELEMENT_FEATURE;

	/**
	 * The feature id for the '<em><b>Contains Binding Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__CONTAINS_BINDING_ATTRIBUTE = NAMED_ELEMENT__CONTAINS_BINDING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Contains Virtual Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__CONTAINS_VIRTUAL_ATTRIBUTE = NAMED_ELEMENT__CONTAINS_VIRTUAL_ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.BlockContainerImpl <em>Block Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.BlockContainerImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getBlockContainer()
	 * @generated
	 */
	int BLOCK_CONTAINER = 3;

	/**
	 * The feature id for the '<em><b>Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_CONTAINER__BLOCKS = 0;

	/**
	 * The number of structural features of the '<em>Block Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Block Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.ProcedureImpl <em>Procedure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.ProcedureImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getProcedure()
	 * @generated
	 */
	int PROCEDURE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__NAME = INSTRUCTION__NAME;

	/**
	 * The feature id for the '<em><b>Contains None Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__CONTAINS_NONE_ELEMENT = INSTRUCTION__CONTAINS_NONE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Binding Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__CONTAINS_BINDING_ELEMENT = INSTRUCTION__CONTAINS_BINDING_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Intermediate Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__CONTAINS_INTERMEDIATE_ELEMENT = INSTRUCTION__CONTAINS_INTERMEDIATE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Metamodel Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__CONTAINS_METAMODEL_ELEMENT = INSTRUCTION__CONTAINS_METAMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Metamodel Element Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__CONTAINS_METAMODEL_ELEMENT_FEATURE = INSTRUCTION__CONTAINS_METAMODEL_ELEMENT_FEATURE;

	/**
	 * The feature id for the '<em><b>Contains Binding Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__CONTAINS_BINDING_ATTRIBUTE = INSTRUCTION__CONTAINS_BINDING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Contains Virtual Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__CONTAINS_VIRTUAL_ATTRIBUTE = INSTRUCTION__CONTAINS_VIRTUAL_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__BLOCKS = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>None Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__NONE_ELEMENT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Containsname Procedure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__CONTAINSNAME_PROCEDURE = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Procedure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Procedure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.ArbitratorImpl <em>Arbitrator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.ArbitratorImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getArbitrator()
	 * @generated
	 */
	int ARBITRATOR = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRATOR__NAME = INSTRUCTION__NAME;

	/**
	 * The feature id for the '<em><b>Contains None Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRATOR__CONTAINS_NONE_ELEMENT = INSTRUCTION__CONTAINS_NONE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Binding Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRATOR__CONTAINS_BINDING_ELEMENT = INSTRUCTION__CONTAINS_BINDING_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Intermediate Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRATOR__CONTAINS_INTERMEDIATE_ELEMENT = INSTRUCTION__CONTAINS_INTERMEDIATE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Metamodel Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRATOR__CONTAINS_METAMODEL_ELEMENT = INSTRUCTION__CONTAINS_METAMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Metamodel Element Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRATOR__CONTAINS_METAMODEL_ELEMENT_FEATURE = INSTRUCTION__CONTAINS_METAMODEL_ELEMENT_FEATURE;

	/**
	 * The feature id for the '<em><b>Contains Binding Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRATOR__CONTAINS_BINDING_ATTRIBUTE = INSTRUCTION__CONTAINS_BINDING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Contains Virtual Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRATOR__CONTAINS_VIRTUAL_ATTRIBUTE = INSTRUCTION__CONTAINS_VIRTUAL_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRATOR__CONDITION = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>None Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRATOR__NONE_ELEMENT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Behaviors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRATOR__BEHAVIORS = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Reuse</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRATOR__REUSE = INSTRUCTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Containsname Arbitrator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRATOR__CONTAINSNAME_ARBITRATOR = INSTRUCTION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Arbitrator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRATOR_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Arbitrator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITRATOR_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.BehaviorImpl <em>Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.BehaviorImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getBehavior()
	 * @generated
	 */
	int BEHAVIOR = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Contains None Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__CONTAINS_NONE_ELEMENT = NAMED_ELEMENT__CONTAINS_NONE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Binding Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__CONTAINS_BINDING_ELEMENT = NAMED_ELEMENT__CONTAINS_BINDING_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Intermediate Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__CONTAINS_INTERMEDIATE_ELEMENT = NAMED_ELEMENT__CONTAINS_INTERMEDIATE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Metamodel Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__CONTAINS_METAMODEL_ELEMENT = NAMED_ELEMENT__CONTAINS_METAMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Metamodel Element Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__CONTAINS_METAMODEL_ELEMENT_FEATURE = NAMED_ELEMENT__CONTAINS_METAMODEL_ELEMENT_FEATURE;

	/**
	 * The feature id for the '<em><b>Contains Binding Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__CONTAINS_BINDING_ATTRIBUTE = NAMED_ELEMENT__CONTAINS_BINDING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Contains Virtual Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__CONTAINS_VIRTUAL_ATTRIBUTE = NAMED_ELEMENT__CONTAINS_VIRTUAL_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__BLOCKS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__CONDITION = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>None Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__NONE_ELEMENT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Containsname Behavior</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__CONTAINSNAME_BEHAVIOR = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.ReuseInstructionImpl <em>Reuse Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.ReuseInstructionImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getReuseInstruction()
	 * @generated
	 */
	int REUSE_INSTRUCTION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_INSTRUCTION__NAME = INSTRUCTION__NAME;

	/**
	 * The feature id for the '<em><b>Contains None Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_INSTRUCTION__CONTAINS_NONE_ELEMENT = INSTRUCTION__CONTAINS_NONE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Binding Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_INSTRUCTION__CONTAINS_BINDING_ELEMENT = INSTRUCTION__CONTAINS_BINDING_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Intermediate Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_INSTRUCTION__CONTAINS_INTERMEDIATE_ELEMENT = INSTRUCTION__CONTAINS_INTERMEDIATE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Metamodel Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_INSTRUCTION__CONTAINS_METAMODEL_ELEMENT = INSTRUCTION__CONTAINS_METAMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Metamodel Element Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_INSTRUCTION__CONTAINS_METAMODEL_ELEMENT_FEATURE = INSTRUCTION__CONTAINS_METAMODEL_ELEMENT_FEATURE;

	/**
	 * The feature id for the '<em><b>Contains Binding Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_INSTRUCTION__CONTAINS_BINDING_ATTRIBUTE = INSTRUCTION__CONTAINS_BINDING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Contains Virtual Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_INSTRUCTION__CONTAINS_VIRTUAL_ATTRIBUTE = INSTRUCTION__CONTAINS_VIRTUAL_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>None Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_INSTRUCTION__NONE_ELEMENT = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reuse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_INSTRUCTION__REUSE = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Containsname Reuse Instruction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_INSTRUCTION__CONTAINSNAME_REUSE_INSTRUCTION = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Reuse Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_INSTRUCTION_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Reuse Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_INSTRUCTION_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.BlockImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__NAME = INSTRUCTION__NAME;

	/**
	 * The feature id for the '<em><b>Contains None Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__CONTAINS_NONE_ELEMENT = INSTRUCTION__CONTAINS_NONE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Binding Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__CONTAINS_BINDING_ELEMENT = INSTRUCTION__CONTAINS_BINDING_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Intermediate Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__CONTAINS_INTERMEDIATE_ELEMENT = INSTRUCTION__CONTAINS_INTERMEDIATE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Metamodel Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__CONTAINS_METAMODEL_ELEMENT = INSTRUCTION__CONTAINS_METAMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Metamodel Element Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__CONTAINS_METAMODEL_ELEMENT_FEATURE = INSTRUCTION__CONTAINS_METAMODEL_ELEMENT_FEATURE;

	/**
	 * The feature id for the '<em><b>Contains Binding Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__CONTAINS_BINDING_ATTRIBUTE = INSTRUCTION__CONTAINS_BINDING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Contains Virtual Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__CONTAINS_VIRTUAL_ATTRIBUTE = INSTRUCTION__CONTAINS_VIRTUAL_ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.ActionImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = BLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Contains None Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__CONTAINS_NONE_ELEMENT = BLOCK__CONTAINS_NONE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Binding Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__CONTAINS_BINDING_ELEMENT = BLOCK__CONTAINS_BINDING_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Intermediate Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__CONTAINS_INTERMEDIATE_ELEMENT = BLOCK__CONTAINS_INTERMEDIATE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Metamodel Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__CONTAINS_METAMODEL_ELEMENT = BLOCK__CONTAINS_METAMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Metamodel Element Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__CONTAINS_METAMODEL_ELEMENT_FEATURE = BLOCK__CONTAINS_METAMODEL_ELEMENT_FEATURE;

	/**
	 * The feature id for the '<em><b>Contains Binding Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__CONTAINS_BINDING_ATTRIBUTE = BLOCK__CONTAINS_BINDING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Contains Virtual Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__CONTAINS_VIRTUAL_ATTRIBUTE = BLOCK__CONTAINS_VIRTUAL_ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.FlowImpl <em>Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.FlowImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getFlow()
	 * @generated
	 */
	int FLOW = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__NAME = BLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Contains None Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__CONTAINS_NONE_ELEMENT = BLOCK__CONTAINS_NONE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Binding Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__CONTAINS_BINDING_ELEMENT = BLOCK__CONTAINS_BINDING_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Intermediate Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__CONTAINS_INTERMEDIATE_ELEMENT = BLOCK__CONTAINS_INTERMEDIATE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Metamodel Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__CONTAINS_METAMODEL_ELEMENT = BLOCK__CONTAINS_METAMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Metamodel Element Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__CONTAINS_METAMODEL_ELEMENT_FEATURE = BLOCK__CONTAINS_METAMODEL_ELEMENT_FEATURE;

	/**
	 * The feature id for the '<em><b>Contains Binding Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__CONTAINS_BINDING_ATTRIBUTE = BLOCK__CONTAINS_BINDING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Contains Virtual Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__CONTAINS_VIRTUAL_ATTRIBUTE = BLOCK__CONTAINS_VIRTUAL_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__BLOCKS = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__CONDITION = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.SensorImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Contains None Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__CONTAINS_NONE_ELEMENT = NAMED_ELEMENT__CONTAINS_NONE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Binding Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__CONTAINS_BINDING_ELEMENT = NAMED_ELEMENT__CONTAINS_BINDING_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Intermediate Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__CONTAINS_INTERMEDIATE_ELEMENT = NAMED_ELEMENT__CONTAINS_INTERMEDIATE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Metamodel Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__CONTAINS_METAMODEL_ELEMENT = NAMED_ELEMENT__CONTAINS_METAMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Metamodel Element Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__CONTAINS_METAMODEL_ELEMENT_FEATURE = NAMED_ELEMENT__CONTAINS_METAMODEL_ELEMENT_FEATURE;

	/**
	 * The feature id for the '<em><b>Contains Binding Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__CONTAINS_BINDING_ATTRIBUTE = NAMED_ELEMENT__CONTAINS_BINDING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Contains Virtual Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__CONTAINS_VIRTUAL_ATTRIBUTE = NAMED_ELEMENT__CONTAINS_VIRTUAL_ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.ConditionImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 12;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.IfImpl <em>If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.IfImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getIf()
	 * @generated
	 */
	int IF = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__NAME = FLOW__NAME;

	/**
	 * The feature id for the '<em><b>Contains None Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__CONTAINS_NONE_ELEMENT = FLOW__CONTAINS_NONE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Binding Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__CONTAINS_BINDING_ELEMENT = FLOW__CONTAINS_BINDING_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Intermediate Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__CONTAINS_INTERMEDIATE_ELEMENT = FLOW__CONTAINS_INTERMEDIATE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Metamodel Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__CONTAINS_METAMODEL_ELEMENT = FLOW__CONTAINS_METAMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Metamodel Element Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__CONTAINS_METAMODEL_ELEMENT_FEATURE = FLOW__CONTAINS_METAMODEL_ELEMENT_FEATURE;

	/**
	 * The feature id for the '<em><b>Contains Binding Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__CONTAINS_BINDING_ATTRIBUTE = FLOW__CONTAINS_BINDING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Contains Virtual Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__CONTAINS_VIRTUAL_ATTRIBUTE = FLOW__CONTAINS_VIRTUAL_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__BLOCKS = FLOW__BLOCKS;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__CONDITION = FLOW__CONDITION;

	/**
	 * The feature id for the '<em><b>None Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__NONE_ELEMENT = FLOW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Containsname If</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__CONTAINSNAME_IF = FLOW_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_FEATURE_COUNT = FLOW_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_OPERATION_COUNT = FLOW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.WhileImpl <em>While</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.WhileImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getWhile()
	 * @generated
	 */
	int WHILE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__NAME = FLOW__NAME;

	/**
	 * The feature id for the '<em><b>Contains None Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__CONTAINS_NONE_ELEMENT = FLOW__CONTAINS_NONE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Binding Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__CONTAINS_BINDING_ELEMENT = FLOW__CONTAINS_BINDING_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Intermediate Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__CONTAINS_INTERMEDIATE_ELEMENT = FLOW__CONTAINS_INTERMEDIATE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Metamodel Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__CONTAINS_METAMODEL_ELEMENT = FLOW__CONTAINS_METAMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Metamodel Element Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__CONTAINS_METAMODEL_ELEMENT_FEATURE = FLOW__CONTAINS_METAMODEL_ELEMENT_FEATURE;

	/**
	 * The feature id for the '<em><b>Contains Binding Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__CONTAINS_BINDING_ATTRIBUTE = FLOW__CONTAINS_BINDING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Contains Virtual Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__CONTAINS_VIRTUAL_ATTRIBUTE = FLOW__CONTAINS_VIRTUAL_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__BLOCKS = FLOW__BLOCKS;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__CONDITION = FLOW__CONDITION;

	/**
	 * The feature id for the '<em><b>None Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__NONE_ELEMENT = FLOW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Containsname While</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__CONTAINSNAME_WHILE = FLOW_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>While</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_FEATURE_COUNT = FLOW_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>While</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_OPERATION_COUNT = FLOW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.GoForwardImpl <em>Go Forward</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.GoForwardImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getGoForward()
	 * @generated
	 */
	int GO_FORWARD = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_FORWARD__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Contains None Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_FORWARD__CONTAINS_NONE_ELEMENT = ACTION__CONTAINS_NONE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Binding Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_FORWARD__CONTAINS_BINDING_ELEMENT = ACTION__CONTAINS_BINDING_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Intermediate Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_FORWARD__CONTAINS_INTERMEDIATE_ELEMENT = ACTION__CONTAINS_INTERMEDIATE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Metamodel Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_FORWARD__CONTAINS_METAMODEL_ELEMENT = ACTION__CONTAINS_METAMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Metamodel Element Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_FORWARD__CONTAINS_METAMODEL_ELEMENT_FEATURE = ACTION__CONTAINS_METAMODEL_ELEMENT_FEATURE;

	/**
	 * The feature id for the '<em><b>Contains Binding Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_FORWARD__CONTAINS_BINDING_ATTRIBUTE = ACTION__CONTAINS_BINDING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Contains Virtual Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_FORWARD__CONTAINS_VIRTUAL_ATTRIBUTE = ACTION__CONTAINS_VIRTUAL_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>None Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_FORWARD__NONE_ELEMENT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_FORWARD__CM = ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Infinite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_FORWARD__INFINITE = ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Containsname Go Forward</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_FORWARD__CONTAINSNAME_GO_FORWARD = ACTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Containscm Go Forward</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_FORWARD__CONTAINSCM_GO_FORWARD = ACTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Containsinfinite Go Forward</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_FORWARD__CONTAINSINFINITE_GO_FORWARD = ACTION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Go Forward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_FORWARD_FEATURE_COUNT = ACTION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Go Forward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_FORWARD_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.GoBackwardImpl <em>Go Backward</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.GoBackwardImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getGoBackward()
	 * @generated
	 */
	int GO_BACKWARD = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_BACKWARD__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Contains None Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_BACKWARD__CONTAINS_NONE_ELEMENT = ACTION__CONTAINS_NONE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Binding Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_BACKWARD__CONTAINS_BINDING_ELEMENT = ACTION__CONTAINS_BINDING_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Intermediate Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_BACKWARD__CONTAINS_INTERMEDIATE_ELEMENT = ACTION__CONTAINS_INTERMEDIATE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Metamodel Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_BACKWARD__CONTAINS_METAMODEL_ELEMENT = ACTION__CONTAINS_METAMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Metamodel Element Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_BACKWARD__CONTAINS_METAMODEL_ELEMENT_FEATURE = ACTION__CONTAINS_METAMODEL_ELEMENT_FEATURE;

	/**
	 * The feature id for the '<em><b>Contains Binding Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_BACKWARD__CONTAINS_BINDING_ATTRIBUTE = ACTION__CONTAINS_BINDING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Contains Virtual Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_BACKWARD__CONTAINS_VIRTUAL_ATTRIBUTE = ACTION__CONTAINS_VIRTUAL_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>None Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_BACKWARD__NONE_ELEMENT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_BACKWARD__CM = ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Infinite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_BACKWARD__INFINITE = ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Containsname Go Backward</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_BACKWARD__CONTAINSNAME_GO_BACKWARD = ACTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Containscm Go Backward</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_BACKWARD__CONTAINSCM_GO_BACKWARD = ACTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Containsinfinite Go Backward</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_BACKWARD__CONTAINSINFINITE_GO_BACKWARD = ACTION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Go Backward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_BACKWARD_FEATURE_COUNT = ACTION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Go Backward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_BACKWARD_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.RotateImpl <em>Rotate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.RotateImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getRotate()
	 * @generated
	 */
	int ROTATE = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Contains None Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE__CONTAINS_NONE_ELEMENT = ACTION__CONTAINS_NONE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Binding Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE__CONTAINS_BINDING_ELEMENT = ACTION__CONTAINS_BINDING_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Intermediate Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE__CONTAINS_INTERMEDIATE_ELEMENT = ACTION__CONTAINS_INTERMEDIATE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Metamodel Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE__CONTAINS_METAMODEL_ELEMENT = ACTION__CONTAINS_METAMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Metamodel Element Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE__CONTAINS_METAMODEL_ELEMENT_FEATURE = ACTION__CONTAINS_METAMODEL_ELEMENT_FEATURE;

	/**
	 * The feature id for the '<em><b>Contains Binding Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE__CONTAINS_BINDING_ATTRIBUTE = ACTION__CONTAINS_BINDING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Contains Virtual Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE__CONTAINS_VIRTUAL_ATTRIBUTE = ACTION__CONTAINS_VIRTUAL_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>None Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE__NONE_ELEMENT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Degrees</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE__DEGREES = ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Random</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE__RANDOM = ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Containsname Rotate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE__CONTAINSNAME_ROTATE = ACTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Containsdegrees Rotate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE__CONTAINSDEGREES_ROTATE = ACTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Containsrandom Rotate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE__CONTAINSRANDOM_ROTATE = ACTION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Rotate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_FEATURE_COUNT = ACTION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Rotate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.GoToImpl <em>Go To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.GoToImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getGoTo()
	 * @generated
	 */
	int GO_TO = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Contains None Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO__CONTAINS_NONE_ELEMENT = ACTION__CONTAINS_NONE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Binding Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO__CONTAINS_BINDING_ELEMENT = ACTION__CONTAINS_BINDING_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Intermediate Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO__CONTAINS_INTERMEDIATE_ELEMENT = ACTION__CONTAINS_INTERMEDIATE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Metamodel Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO__CONTAINS_METAMODEL_ELEMENT = ACTION__CONTAINS_METAMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Metamodel Element Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO__CONTAINS_METAMODEL_ELEMENT_FEATURE = ACTION__CONTAINS_METAMODEL_ELEMENT_FEATURE;

	/**
	 * The feature id for the '<em><b>Contains Binding Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO__CONTAINS_BINDING_ATTRIBUTE = ACTION__CONTAINS_BINDING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Contains Virtual Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO__CONTAINS_VIRTUAL_ATTRIBUTE = ACTION__CONTAINS_VIRTUAL_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>None Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO__NONE_ELEMENT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO__X = ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO__Y = ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Containsname Go To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO__CONTAINSNAME_GO_TO = ACTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Containsx Go To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO__CONTAINSX_GO_TO = ACTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Containsy Go To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO__CONTAINSY_GO_TO = ACTION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Go To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO_FEATURE_COUNT = ACTION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Go To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.ReturnToBaseImpl <em>Return To Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.ReturnToBaseImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getReturnToBase()
	 * @generated
	 */
	int RETURN_TO_BASE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TO_BASE__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Contains None Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TO_BASE__CONTAINS_NONE_ELEMENT = ACTION__CONTAINS_NONE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Binding Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TO_BASE__CONTAINS_BINDING_ELEMENT = ACTION__CONTAINS_BINDING_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Intermediate Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TO_BASE__CONTAINS_INTERMEDIATE_ELEMENT = ACTION__CONTAINS_INTERMEDIATE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Metamodel Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TO_BASE__CONTAINS_METAMODEL_ELEMENT = ACTION__CONTAINS_METAMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Metamodel Element Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TO_BASE__CONTAINS_METAMODEL_ELEMENT_FEATURE = ACTION__CONTAINS_METAMODEL_ELEMENT_FEATURE;

	/**
	 * The feature id for the '<em><b>Contains Binding Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TO_BASE__CONTAINS_BINDING_ATTRIBUTE = ACTION__CONTAINS_BINDING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Contains Virtual Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TO_BASE__CONTAINS_VIRTUAL_ATTRIBUTE = ACTION__CONTAINS_VIRTUAL_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>None Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TO_BASE__NONE_ELEMENT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Containsname Return To Base</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TO_BASE__CONTAINSNAME_RETURN_TO_BASE = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Return To Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TO_BASE_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Return To Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TO_BASE_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.GrabImpl <em>Grab</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.GrabImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getGrab()
	 * @generated
	 */
	int GRAB = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAB__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Contains None Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAB__CONTAINS_NONE_ELEMENT = ACTION__CONTAINS_NONE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Binding Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAB__CONTAINS_BINDING_ELEMENT = ACTION__CONTAINS_BINDING_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Intermediate Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAB__CONTAINS_INTERMEDIATE_ELEMENT = ACTION__CONTAINS_INTERMEDIATE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Metamodel Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAB__CONTAINS_METAMODEL_ELEMENT = ACTION__CONTAINS_METAMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Metamodel Element Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAB__CONTAINS_METAMODEL_ELEMENT_FEATURE = ACTION__CONTAINS_METAMODEL_ELEMENT_FEATURE;

	/**
	 * The feature id for the '<em><b>Contains Binding Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAB__CONTAINS_BINDING_ATTRIBUTE = ACTION__CONTAINS_BINDING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Contains Virtual Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAB__CONTAINS_VIRTUAL_ATTRIBUTE = ACTION__CONTAINS_VIRTUAL_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>None Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAB__NONE_ELEMENT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Containsname Grab</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAB__CONTAINSNAME_GRAB = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Grab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAB_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Grab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAB_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.ReleaseImpl <em>Release</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.ReleaseImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getRelease()
	 * @generated
	 */
	int RELEASE = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Contains None Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__CONTAINS_NONE_ELEMENT = ACTION__CONTAINS_NONE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Binding Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__CONTAINS_BINDING_ELEMENT = ACTION__CONTAINS_BINDING_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Intermediate Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__CONTAINS_INTERMEDIATE_ELEMENT = ACTION__CONTAINS_INTERMEDIATE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Metamodel Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__CONTAINS_METAMODEL_ELEMENT = ACTION__CONTAINS_METAMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Metamodel Element Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__CONTAINS_METAMODEL_ELEMENT_FEATURE = ACTION__CONTAINS_METAMODEL_ELEMENT_FEATURE;

	/**
	 * The feature id for the '<em><b>Contains Binding Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__CONTAINS_BINDING_ATTRIBUTE = ACTION__CONTAINS_BINDING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Contains Virtual Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__CONTAINS_VIRTUAL_ATTRIBUTE = ACTION__CONTAINS_VIRTUAL_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>None Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__NONE_ELEMENT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Containsname Release</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__CONTAINSNAME_RELEASE = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Release</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Release</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.DelayImpl <em>Delay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.DelayImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getDelay()
	 * @generated
	 */
	int DELAY = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Contains None Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__CONTAINS_NONE_ELEMENT = ACTION__CONTAINS_NONE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Binding Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__CONTAINS_BINDING_ELEMENT = ACTION__CONTAINS_BINDING_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Intermediate Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__CONTAINS_INTERMEDIATE_ELEMENT = ACTION__CONTAINS_INTERMEDIATE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Metamodel Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__CONTAINS_METAMODEL_ELEMENT = ACTION__CONTAINS_METAMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Metamodel Element Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__CONTAINS_METAMODEL_ELEMENT_FEATURE = ACTION__CONTAINS_METAMODEL_ELEMENT_FEATURE;

	/**
	 * The feature id for the '<em><b>Contains Binding Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__CONTAINS_BINDING_ATTRIBUTE = ACTION__CONTAINS_BINDING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Contains Virtual Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__CONTAINS_VIRTUAL_ATTRIBUTE = ACTION__CONTAINS_VIRTUAL_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>None Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__NONE_ELEMENT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ms</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__MS = ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Containsname Delay</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__CONTAINSNAME_DELAY = ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Containsms Delay</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__CONTAINSMS_DELAY = ACTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Delay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_FEATURE_COUNT = ACTION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Delay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.AvoidObstacleImpl <em>Avoid Obstacle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.AvoidObstacleImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getAvoidObstacle()
	 * @generated
	 */
	int AVOID_OBSTACLE = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVOID_OBSTACLE__NAME = BEHAVIOR__NAME;

	/**
	 * The feature id for the '<em><b>Contains None Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVOID_OBSTACLE__CONTAINS_NONE_ELEMENT = BEHAVIOR__CONTAINS_NONE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Binding Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVOID_OBSTACLE__CONTAINS_BINDING_ELEMENT = BEHAVIOR__CONTAINS_BINDING_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Intermediate Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVOID_OBSTACLE__CONTAINS_INTERMEDIATE_ELEMENT = BEHAVIOR__CONTAINS_INTERMEDIATE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Metamodel Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVOID_OBSTACLE__CONTAINS_METAMODEL_ELEMENT = BEHAVIOR__CONTAINS_METAMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Metamodel Element Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVOID_OBSTACLE__CONTAINS_METAMODEL_ELEMENT_FEATURE = BEHAVIOR__CONTAINS_METAMODEL_ELEMENT_FEATURE;

	/**
	 * The feature id for the '<em><b>Contains Binding Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVOID_OBSTACLE__CONTAINS_BINDING_ATTRIBUTE = BEHAVIOR__CONTAINS_BINDING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Contains Virtual Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVOID_OBSTACLE__CONTAINS_VIRTUAL_ATTRIBUTE = BEHAVIOR__CONTAINS_VIRTUAL_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVOID_OBSTACLE__BLOCKS = BEHAVIOR__BLOCKS;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVOID_OBSTACLE__CONDITION = BEHAVIOR__CONDITION;

	/**
	 * The feature id for the '<em><b>None Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVOID_OBSTACLE__NONE_ELEMENT = BEHAVIOR__NONE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Containsname Behavior</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVOID_OBSTACLE__CONTAINSNAME_BEHAVIOR = BEHAVIOR__CONTAINSNAME_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Containsname Avoid Obstacle</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVOID_OBSTACLE__CONTAINSNAME_AVOID_OBSTACLE = BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Avoid Obstacle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVOID_OBSTACLE_FEATURE_COUNT = BEHAVIOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Avoid Obstacle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVOID_OBSTACLE_OPERATION_COUNT = BEHAVIOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.ReturnBottleToBaseImpl <em>Return Bottle To Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.ReturnBottleToBaseImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getReturnBottleToBase()
	 * @generated
	 */
	int RETURN_BOTTLE_TO_BASE = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_BOTTLE_TO_BASE__NAME = BEHAVIOR__NAME;

	/**
	 * The feature id for the '<em><b>Contains None Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_BOTTLE_TO_BASE__CONTAINS_NONE_ELEMENT = BEHAVIOR__CONTAINS_NONE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Binding Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_BOTTLE_TO_BASE__CONTAINS_BINDING_ELEMENT = BEHAVIOR__CONTAINS_BINDING_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Intermediate Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_BOTTLE_TO_BASE__CONTAINS_INTERMEDIATE_ELEMENT = BEHAVIOR__CONTAINS_INTERMEDIATE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Metamodel Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_BOTTLE_TO_BASE__CONTAINS_METAMODEL_ELEMENT = BEHAVIOR__CONTAINS_METAMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Metamodel Element Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_BOTTLE_TO_BASE__CONTAINS_METAMODEL_ELEMENT_FEATURE = BEHAVIOR__CONTAINS_METAMODEL_ELEMENT_FEATURE;

	/**
	 * The feature id for the '<em><b>Contains Binding Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_BOTTLE_TO_BASE__CONTAINS_BINDING_ATTRIBUTE = BEHAVIOR__CONTAINS_BINDING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Contains Virtual Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_BOTTLE_TO_BASE__CONTAINS_VIRTUAL_ATTRIBUTE = BEHAVIOR__CONTAINS_VIRTUAL_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_BOTTLE_TO_BASE__BLOCKS = BEHAVIOR__BLOCKS;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_BOTTLE_TO_BASE__CONDITION = BEHAVIOR__CONDITION;

	/**
	 * The feature id for the '<em><b>None Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_BOTTLE_TO_BASE__NONE_ELEMENT = BEHAVIOR__NONE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Containsname Behavior</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_BOTTLE_TO_BASE__CONTAINSNAME_BEHAVIOR = BEHAVIOR__CONTAINSNAME_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Containsname Return Bottle To Base</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_BOTTLE_TO_BASE__CONTAINSNAME_RETURN_BOTTLE_TO_BASE = BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Return Bottle To Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_BOTTLE_TO_BASE_FEATURE_COUNT = BEHAVIOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Return Bottle To Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_BOTTLE_TO_BASE_OPERATION_COUNT = BEHAVIOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.ExploreForwardImpl <em>Explore Forward</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.ExploreForwardImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getExploreForward()
	 * @generated
	 */
	int EXPLORE_FORWARD = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLORE_FORWARD__NAME = BEHAVIOR__NAME;

	/**
	 * The feature id for the '<em><b>Contains None Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLORE_FORWARD__CONTAINS_NONE_ELEMENT = BEHAVIOR__CONTAINS_NONE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Binding Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLORE_FORWARD__CONTAINS_BINDING_ELEMENT = BEHAVIOR__CONTAINS_BINDING_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Intermediate Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLORE_FORWARD__CONTAINS_INTERMEDIATE_ELEMENT = BEHAVIOR__CONTAINS_INTERMEDIATE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Metamodel Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLORE_FORWARD__CONTAINS_METAMODEL_ELEMENT = BEHAVIOR__CONTAINS_METAMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Metamodel Element Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLORE_FORWARD__CONTAINS_METAMODEL_ELEMENT_FEATURE = BEHAVIOR__CONTAINS_METAMODEL_ELEMENT_FEATURE;

	/**
	 * The feature id for the '<em><b>Contains Binding Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLORE_FORWARD__CONTAINS_BINDING_ATTRIBUTE = BEHAVIOR__CONTAINS_BINDING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Contains Virtual Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLORE_FORWARD__CONTAINS_VIRTUAL_ATTRIBUTE = BEHAVIOR__CONTAINS_VIRTUAL_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLORE_FORWARD__BLOCKS = BEHAVIOR__BLOCKS;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLORE_FORWARD__CONDITION = BEHAVIOR__CONDITION;

	/**
	 * The feature id for the '<em><b>None Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLORE_FORWARD__NONE_ELEMENT = BEHAVIOR__NONE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Containsname Behavior</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLORE_FORWARD__CONTAINSNAME_BEHAVIOR = BEHAVIOR__CONTAINSNAME_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Containsname Explore Forward</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLORE_FORWARD__CONTAINSNAME_EXPLORE_FORWARD = BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Explore Forward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLORE_FORWARD_FEATURE_COUNT = BEHAVIOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Explore Forward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPLORE_FORWARD_OPERATION_COUNT = BEHAVIOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.TouchSensorImpl <em>Touch Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.TouchSensorImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getTouchSensor()
	 * @generated
	 */
	int TOUCH_SENSOR = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_SENSOR__NAME = SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Contains None Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_SENSOR__CONTAINS_NONE_ELEMENT = SENSOR__CONTAINS_NONE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Binding Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_SENSOR__CONTAINS_BINDING_ELEMENT = SENSOR__CONTAINS_BINDING_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Intermediate Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_SENSOR__CONTAINS_INTERMEDIATE_ELEMENT = SENSOR__CONTAINS_INTERMEDIATE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Metamodel Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_SENSOR__CONTAINS_METAMODEL_ELEMENT = SENSOR__CONTAINS_METAMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Metamodel Element Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_SENSOR__CONTAINS_METAMODEL_ELEMENT_FEATURE = SENSOR__CONTAINS_METAMODEL_ELEMENT_FEATURE;

	/**
	 * The feature id for the '<em><b>Contains Binding Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_SENSOR__CONTAINS_BINDING_ATTRIBUTE = SENSOR__CONTAINS_BINDING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Contains Virtual Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_SENSOR__CONTAINS_VIRTUAL_ATTRIBUTE = SENSOR__CONTAINS_VIRTUAL_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>None Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_SENSOR__NONE_ELEMENT = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Pressed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_SENSOR__IS_PRESSED = SENSOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Containsname Touch Sensor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_SENSOR__CONTAINSNAME_TOUCH_SENSOR = SENSOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Containsis Pressed Touch Sensor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_SENSOR__CONTAINSIS_PRESSED_TOUCH_SENSOR = SENSOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Touch Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Touch Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_SENSOR_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.UltrasonicSensorImpl <em>Ultrasonic Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.UltrasonicSensorImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getUltrasonicSensor()
	 * @generated
	 */
	int ULTRASONIC_SENSOR = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULTRASONIC_SENSOR__NAME = SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Contains None Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULTRASONIC_SENSOR__CONTAINS_NONE_ELEMENT = SENSOR__CONTAINS_NONE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Binding Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULTRASONIC_SENSOR__CONTAINS_BINDING_ELEMENT = SENSOR__CONTAINS_BINDING_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Intermediate Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULTRASONIC_SENSOR__CONTAINS_INTERMEDIATE_ELEMENT = SENSOR__CONTAINS_INTERMEDIATE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Metamodel Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULTRASONIC_SENSOR__CONTAINS_METAMODEL_ELEMENT = SENSOR__CONTAINS_METAMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Metamodel Element Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULTRASONIC_SENSOR__CONTAINS_METAMODEL_ELEMENT_FEATURE = SENSOR__CONTAINS_METAMODEL_ELEMENT_FEATURE;

	/**
	 * The feature id for the '<em><b>Contains Binding Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULTRASONIC_SENSOR__CONTAINS_BINDING_ATTRIBUTE = SENSOR__CONTAINS_BINDING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Contains Virtual Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULTRASONIC_SENSOR__CONTAINS_VIRTUAL_ATTRIBUTE = SENSOR__CONTAINS_VIRTUAL_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>None Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULTRASONIC_SENSOR__NONE_ELEMENT = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULTRASONIC_SENSOR__OPERATOR = SENSOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULTRASONIC_SENSOR__VALUE = SENSOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Containsname Ultrasonic Sensor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULTRASONIC_SENSOR__CONTAINSNAME_ULTRASONIC_SENSOR = SENSOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Containsoperator Ultrasonic Sensor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULTRASONIC_SENSOR__CONTAINSOPERATOR_ULTRASONIC_SENSOR = SENSOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Containsvalue Ultrasonic Sensor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULTRASONIC_SENSOR__CONTAINSVALUE_ULTRASONIC_SENSOR = SENSOR_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Ultrasonic Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULTRASONIC_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Ultrasonic Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULTRASONIC_SENSOR_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.ColorSensorImpl <em>Color Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.ColorSensorImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getColorSensor()
	 * @generated
	 */
	int COLOR_SENSOR = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_SENSOR__NAME = SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Contains None Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_SENSOR__CONTAINS_NONE_ELEMENT = SENSOR__CONTAINS_NONE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Binding Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_SENSOR__CONTAINS_BINDING_ELEMENT = SENSOR__CONTAINS_BINDING_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Intermediate Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_SENSOR__CONTAINS_INTERMEDIATE_ELEMENT = SENSOR__CONTAINS_INTERMEDIATE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Metamodel Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_SENSOR__CONTAINS_METAMODEL_ELEMENT = SENSOR__CONTAINS_METAMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Metamodel Element Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_SENSOR__CONTAINS_METAMODEL_ELEMENT_FEATURE = SENSOR__CONTAINS_METAMODEL_ELEMENT_FEATURE;

	/**
	 * The feature id for the '<em><b>Contains Binding Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_SENSOR__CONTAINS_BINDING_ATTRIBUTE = SENSOR__CONTAINS_BINDING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Contains Virtual Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_SENSOR__CONTAINS_VIRTUAL_ATTRIBUTE = SENSOR__CONTAINS_VIRTUAL_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>None Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_SENSOR__NONE_ELEMENT = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_SENSOR__COLOR = SENSOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Containsname Color Sensor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_SENSOR__CONTAINSNAME_COLOR_SENSOR = SENSOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Containscolor Color Sensor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_SENSOR__CONTAINSCOLOR_COLOR_SENSOR = SENSOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Color Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Color Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_SENSOR_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.ConditionContainerImpl <em>Condition Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.ConditionContainerImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getConditionContainer()
	 * @generated
	 */
	int CONDITION_CONTAINER = 29;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_CONTAINER__CONDITION = 0;

	/**
	 * The number of structural features of the '<em>Condition Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Condition Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.GoToEnemyImpl <em>Go To Enemy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.GoToEnemyImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getGoToEnemy()
	 * @generated
	 */
	int GO_TO_ENEMY = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO_ENEMY__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Contains None Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO_ENEMY__CONTAINS_NONE_ELEMENT = ACTION__CONTAINS_NONE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Binding Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO_ENEMY__CONTAINS_BINDING_ELEMENT = ACTION__CONTAINS_BINDING_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Intermediate Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO_ENEMY__CONTAINS_INTERMEDIATE_ELEMENT = ACTION__CONTAINS_INTERMEDIATE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Metamodel Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO_ENEMY__CONTAINS_METAMODEL_ELEMENT = ACTION__CONTAINS_METAMODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Contains Metamodel Element Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO_ENEMY__CONTAINS_METAMODEL_ELEMENT_FEATURE = ACTION__CONTAINS_METAMODEL_ELEMENT_FEATURE;

	/**
	 * The feature id for the '<em><b>Contains Binding Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO_ENEMY__CONTAINS_BINDING_ATTRIBUTE = ACTION__CONTAINS_BINDING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Contains Virtual Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO_ENEMY__CONTAINS_VIRTUAL_ATTRIBUTE = ACTION__CONTAINS_VIRTUAL_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>None Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO_ENEMY__NONE_ELEMENT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Containsname Go To Enemy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO_ENEMY__CONTAINSNAME_GO_TO_ENEMY = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Go To Enemy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO_ENEMY_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Go To Enemy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO_ENEMY_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.BindingAttributeImpl <em>Binding Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.BindingAttributeImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getBindingAttribute()
	 * @generated
	 */
	int BINDING_ATTRIBUTE = 70;

	/**
	 * The number of structural features of the '<em>Binding Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_ATTRIBUTE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Binding Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.nameProcedureImpl <em>name Procedure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.nameProcedureImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getnameProcedure()
	 * @generated
	 */
	int NAME_PROCEDURE = 31;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_PROCEDURE__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>name Procedure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_PROCEDURE_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>name Procedure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_PROCEDURE_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.nameArbitratorImpl <em>name Arbitrator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.nameArbitratorImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getnameArbitrator()
	 * @generated
	 */
	int NAME_ARBITRATOR = 32;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_ARBITRATOR__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>name Arbitrator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_ARBITRATOR_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>name Arbitrator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_ARBITRATOR_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.nameBehaviorImpl <em>name Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.nameBehaviorImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getnameBehavior()
	 * @generated
	 */
	int NAME_BEHAVIOR = 33;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_BEHAVIOR__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>name Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_BEHAVIOR_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>name Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_BEHAVIOR_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.nameReuseInstructionImpl <em>name Reuse Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.nameReuseInstructionImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getnameReuseInstruction()
	 * @generated
	 */
	int NAME_REUSE_INSTRUCTION = 34;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_REUSE_INSTRUCTION__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>name Reuse Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_REUSE_INSTRUCTION_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>name Reuse Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_REUSE_INSTRUCTION_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.nameIfImpl <em>name If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.nameIfImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getnameIf()
	 * @generated
	 */
	int NAME_IF = 35;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_IF__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>name If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_IF_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>name If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_IF_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.nameWhileImpl <em>name While</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.nameWhileImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getnameWhile()
	 * @generated
	 */
	int NAME_WHILE = 36;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_WHILE__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>name While</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_WHILE_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>name While</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_WHILE_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.nameGoForwardImpl <em>name Go Forward</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.nameGoForwardImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getnameGoForward()
	 * @generated
	 */
	int NAME_GO_FORWARD = 37;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_GO_FORWARD__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>name Go Forward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_GO_FORWARD_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>name Go Forward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_GO_FORWARD_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.cmGoForwardImpl <em>cm Go Forward</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.cmGoForwardImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getcmGoForward()
	 * @generated
	 */
	int CM_GO_FORWARD = 38;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_GO_FORWARD__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>cm Go Forward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_GO_FORWARD_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>cm Go Forward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_GO_FORWARD_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.infiniteGoForwardImpl <em>infinite Go Forward</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.infiniteGoForwardImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getinfiniteGoForward()
	 * @generated
	 */
	int INFINITE_GO_FORWARD = 39;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFINITE_GO_FORWARD__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>infinite Go Forward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFINITE_GO_FORWARD_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>infinite Go Forward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFINITE_GO_FORWARD_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.nameGoBackwardImpl <em>name Go Backward</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.nameGoBackwardImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getnameGoBackward()
	 * @generated
	 */
	int NAME_GO_BACKWARD = 40;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_GO_BACKWARD__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>name Go Backward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_GO_BACKWARD_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>name Go Backward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_GO_BACKWARD_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.cmGoBackwardImpl <em>cm Go Backward</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.cmGoBackwardImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getcmGoBackward()
	 * @generated
	 */
	int CM_GO_BACKWARD = 41;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_GO_BACKWARD__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>cm Go Backward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_GO_BACKWARD_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>cm Go Backward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CM_GO_BACKWARD_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.infiniteGoBackwardImpl <em>infinite Go Backward</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.infiniteGoBackwardImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getinfiniteGoBackward()
	 * @generated
	 */
	int INFINITE_GO_BACKWARD = 42;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFINITE_GO_BACKWARD__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>infinite Go Backward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFINITE_GO_BACKWARD_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>infinite Go Backward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFINITE_GO_BACKWARD_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.nameRotateImpl <em>name Rotate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.nameRotateImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getnameRotate()
	 * @generated
	 */
	int NAME_ROTATE = 43;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_ROTATE__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>name Rotate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_ROTATE_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>name Rotate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_ROTATE_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.degreesRotateImpl <em>degrees Rotate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.degreesRotateImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getdegreesRotate()
	 * @generated
	 */
	int DEGREES_ROTATE = 44;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREES_ROTATE__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>degrees Rotate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREES_ROTATE_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>degrees Rotate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEGREES_ROTATE_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.randomRotateImpl <em>random Rotate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.randomRotateImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getrandomRotate()
	 * @generated
	 */
	int RANDOM_ROTATE = 45;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_ROTATE__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>random Rotate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_ROTATE_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>random Rotate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_ROTATE_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.nameGoToImpl <em>name Go To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.nameGoToImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getnameGoTo()
	 * @generated
	 */
	int NAME_GO_TO = 46;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_GO_TO__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>name Go To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_GO_TO_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>name Go To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_GO_TO_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.xGoToImpl <em>xGo To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.xGoToImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getxGoTo()
	 * @generated
	 */
	int XGO_TO = 47;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XGO_TO__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>xGo To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XGO_TO_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>xGo To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XGO_TO_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.yGoToImpl <em>yGo To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.yGoToImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getyGoTo()
	 * @generated
	 */
	int YGO_TO = 48;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGO_TO__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>yGo To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGO_TO_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>yGo To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YGO_TO_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.nameReturnToBaseImpl <em>name Return To Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.nameReturnToBaseImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getnameReturnToBase()
	 * @generated
	 */
	int NAME_RETURN_TO_BASE = 49;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_RETURN_TO_BASE__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>name Return To Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_RETURN_TO_BASE_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>name Return To Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_RETURN_TO_BASE_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.nameGrabImpl <em>name Grab</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.nameGrabImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getnameGrab()
	 * @generated
	 */
	int NAME_GRAB = 50;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_GRAB__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>name Grab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_GRAB_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>name Grab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_GRAB_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.nameReleaseImpl <em>name Release</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.nameReleaseImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getnameRelease()
	 * @generated
	 */
	int NAME_RELEASE = 51;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_RELEASE__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>name Release</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_RELEASE_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>name Release</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_RELEASE_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.nameDelayImpl <em>name Delay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.nameDelayImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getnameDelay()
	 * @generated
	 */
	int NAME_DELAY = 52;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_DELAY__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>name Delay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_DELAY_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>name Delay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_DELAY_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.msDelayImpl <em>ms Delay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.msDelayImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getmsDelay()
	 * @generated
	 */
	int MS_DELAY = 53;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_DELAY__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ms Delay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_DELAY_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>ms Delay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MS_DELAY_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.nameAvoidObstacleImpl <em>name Avoid Obstacle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.nameAvoidObstacleImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getnameAvoidObstacle()
	 * @generated
	 */
	int NAME_AVOID_OBSTACLE = 54;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_AVOID_OBSTACLE__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>name Avoid Obstacle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_AVOID_OBSTACLE_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>name Avoid Obstacle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_AVOID_OBSTACLE_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.nameReturnBottleToBaseImpl <em>name Return Bottle To Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.nameReturnBottleToBaseImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getnameReturnBottleToBase()
	 * @generated
	 */
	int NAME_RETURN_BOTTLE_TO_BASE = 55;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_RETURN_BOTTLE_TO_BASE__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>name Return Bottle To Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_RETURN_BOTTLE_TO_BASE_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>name Return Bottle To Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_RETURN_BOTTLE_TO_BASE_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.nameExploreForwardImpl <em>name Explore Forward</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.nameExploreForwardImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getnameExploreForward()
	 * @generated
	 */
	int NAME_EXPLORE_FORWARD = 56;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_EXPLORE_FORWARD__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>name Explore Forward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_EXPLORE_FORWARD_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>name Explore Forward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_EXPLORE_FORWARD_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.nameTouchSensorImpl <em>name Touch Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.nameTouchSensorImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getnameTouchSensor()
	 * @generated
	 */
	int NAME_TOUCH_SENSOR = 57;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_TOUCH_SENSOR__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>name Touch Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_TOUCH_SENSOR_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>name Touch Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_TOUCH_SENSOR_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.isPressedTouchSensorImpl <em>is Pressed Touch Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.isPressedTouchSensorImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getisPressedTouchSensor()
	 * @generated
	 */
	int IS_PRESSED_TOUCH_SENSOR = 58;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_PRESSED_TOUCH_SENSOR__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>is Pressed Touch Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_PRESSED_TOUCH_SENSOR_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>is Pressed Touch Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_PRESSED_TOUCH_SENSOR_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.nameUltrasonicSensorImpl <em>name Ultrasonic Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.nameUltrasonicSensorImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getnameUltrasonicSensor()
	 * @generated
	 */
	int NAME_ULTRASONIC_SENSOR = 59;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_ULTRASONIC_SENSOR__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>name Ultrasonic Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_ULTRASONIC_SENSOR_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>name Ultrasonic Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_ULTRASONIC_SENSOR_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.operatorUltrasonicSensorImpl <em>operator Ultrasonic Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.operatorUltrasonicSensorImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getoperatorUltrasonicSensor()
	 * @generated
	 */
	int OPERATOR_ULTRASONIC_SENSOR = 60;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_ULTRASONIC_SENSOR__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>operator Ultrasonic Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_ULTRASONIC_SENSOR_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>operator Ultrasonic Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_ULTRASONIC_SENSOR_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.valueUltrasonicSensorImpl <em>value Ultrasonic Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.valueUltrasonicSensorImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getvalueUltrasonicSensor()
	 * @generated
	 */
	int VALUE_ULTRASONIC_SENSOR = 61;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ULTRASONIC_SENSOR__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>value Ultrasonic Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ULTRASONIC_SENSOR_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>value Ultrasonic Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_ULTRASONIC_SENSOR_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.nameColorSensorImpl <em>name Color Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.nameColorSensorImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getnameColorSensor()
	 * @generated
	 */
	int NAME_COLOR_SENSOR = 62;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_COLOR_SENSOR__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>name Color Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_COLOR_SENSOR_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>name Color Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_COLOR_SENSOR_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.colorColorSensorImpl <em>color Color Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.colorColorSensorImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getcolorColorSensor()
	 * @generated
	 */
	int COLOR_COLOR_SENSOR = 63;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_COLOR_SENSOR__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>color Color Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_COLOR_SENSOR_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>color Color Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_COLOR_SENSOR_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.nameGoToEnemyImpl <em>name Go To Enemy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.nameGoToEnemyImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getnameGoToEnemy()
	 * @generated
	 */
	int NAME_GO_TO_ENEMY = 64;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_GO_TO_ENEMY__VALUE = BINDING_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>name Go To Enemy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_GO_TO_ENEMY_FEATURE_COUNT = BINDING_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>name Go To Enemy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_GO_TO_ENEMY_OPERATION_COUNT = BINDING_ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.NoneElementImpl <em>None Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.NoneElementImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getNoneElement()
	 * @generated
	 */
	int NONE_ELEMENT = 65;

	/**
	 * The number of structural features of the '<em>None Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONE_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>None Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.IntermediateElementImpl <em>Intermediate Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.IntermediateElementImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getIntermediateElement()
	 * @generated
	 */
	int INTERMEDIATE_ELEMENT = 67;

	/**
	 * The feature id for the '<em><b>Binding Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_ELEMENT__BINDING_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Metamodel Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_ELEMENT__METAMODEL_ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Intermediate Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Intermediate Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.MetamodelElementImpl <em>Metamodel Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.MetamodelElementImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getMetamodelElement()
	 * @generated
	 */
	int METAMODEL_ELEMENT = 68;

	/**
	 * The feature id for the '<em><b>Virtual Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_ELEMENT__VIRTUAL_ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Metamodel Element Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_ELEMENT__METAMODEL_ELEMENT_FEATURE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_ELEMENT__NAME = 2;

	/**
	 * The number of structural features of the '<em>Metamodel Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Metamodel Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.impl.MetamodelElementFeatureImpl <em>Metamodel Element Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.MetamodelElementFeatureImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getMetamodelElementFeature()
	 * @generated
	 */
	int METAMODEL_ELEMENT_FEATURE = 69;

	/**
	 * The feature id for the '<em><b>Feature Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_ELEMENT_FEATURE__FEATURE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_ELEMENT_FEATURE__NAME = 1;

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
	 * The meta object id for the '{@link mindstorms_bdsl.impl.VirtualAttributeImpl <em>Virtual Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.impl.VirtualAttributeImpl
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getVirtualAttribute()
	 * @generated
	 */
	int VIRTUAL_ATTRIBUTE = 71;

	/**
	 * The feature id for the '<em><b>To virtual Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_ATTRIBUTE__TO_VIRTUAL_ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_ATTRIBUTE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_ATTRIBUTE__EXPRESSION = 2;

	/**
	 * The number of structural features of the '<em>Virtual Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_ATTRIBUTE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Virtual Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.Color <em>Color</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.Color
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 72;

	/**
	 * The meta object id for the '{@link mindstorms_bdsl.OperatorKind <em>Operator Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mindstorms_bdsl.OperatorKind
	 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getOperatorKind()
	 * @generated
	 */
	int OPERATOR_KIND = 73;


	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see mindstorms_bdsl.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link mindstorms_bdsl.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mindstorms_bdsl.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link mindstorms_bdsl.NamedElement#getContainsNoneElement <em>Contains None Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains None Element</em>'.
	 * @see mindstorms_bdsl.NamedElement#getContainsNoneElement()
	 * @see #getNamedElement()
	 * @generated
	 */
	EReference getNamedElement_ContainsNoneElement();

	/**
	 * Returns the meta object for the containment reference list '{@link mindstorms_bdsl.NamedElement#getContainsBindingElement <em>Contains Binding Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Binding Element</em>'.
	 * @see mindstorms_bdsl.NamedElement#getContainsBindingElement()
	 * @see #getNamedElement()
	 * @generated
	 */
	EReference getNamedElement_ContainsBindingElement();

	/**
	 * Returns the meta object for the containment reference list '{@link mindstorms_bdsl.NamedElement#getContainsIntermediateElement <em>Contains Intermediate Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Intermediate Element</em>'.
	 * @see mindstorms_bdsl.NamedElement#getContainsIntermediateElement()
	 * @see #getNamedElement()
	 * @generated
	 */
	EReference getNamedElement_ContainsIntermediateElement();

	/**
	 * Returns the meta object for the containment reference list '{@link mindstorms_bdsl.NamedElement#getContainsMetamodelElement <em>Contains Metamodel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Metamodel Element</em>'.
	 * @see mindstorms_bdsl.NamedElement#getContainsMetamodelElement()
	 * @see #getNamedElement()
	 * @generated
	 */
	EReference getNamedElement_ContainsMetamodelElement();

	/**
	 * Returns the meta object for the containment reference list '{@link mindstorms_bdsl.NamedElement#getContainsMetamodelElementFeature <em>Contains Metamodel Element Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Metamodel Element Feature</em>'.
	 * @see mindstorms_bdsl.NamedElement#getContainsMetamodelElementFeature()
	 * @see #getNamedElement()
	 * @generated
	 */
	EReference getNamedElement_ContainsMetamodelElementFeature();

	/**
	 * Returns the meta object for the containment reference list '{@link mindstorms_bdsl.NamedElement#getContainsBindingAttribute <em>Contains Binding Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Binding Attribute</em>'.
	 * @see mindstorms_bdsl.NamedElement#getContainsBindingAttribute()
	 * @see #getNamedElement()
	 * @generated
	 */
	EReference getNamedElement_ContainsBindingAttribute();

	/**
	 * Returns the meta object for the containment reference list '{@link mindstorms_bdsl.NamedElement#getContainsVirtualAttribute <em>Contains Virtual Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Virtual Attribute</em>'.
	 * @see mindstorms_bdsl.NamedElement#getContainsVirtualAttribute()
	 * @see #getNamedElement()
	 * @generated
	 */
	EReference getNamedElement_ContainsVirtualAttribute();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.Main <em>Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Main</em>'.
	 * @see mindstorms_bdsl.Main
	 * @generated
	 */
	EClass getMain();

	/**
	 * Returns the meta object for the containment reference list '{@link mindstorms_bdsl.Main#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instructions</em>'.
	 * @see mindstorms_bdsl.Main#getInstructions()
	 * @see #getMain()
	 * @generated
	 */
	EReference getMain_Instructions();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction</em>'.
	 * @see mindstorms_bdsl.Instruction
	 * @generated
	 */
	EClass getInstruction();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.BlockContainer <em>Block Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Container</em>'.
	 * @see mindstorms_bdsl.BlockContainer
	 * @generated
	 */
	EClass getBlockContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link mindstorms_bdsl.BlockContainer#getBlocks <em>Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Blocks</em>'.
	 * @see mindstorms_bdsl.BlockContainer#getBlocks()
	 * @see #getBlockContainer()
	 * @generated
	 */
	EReference getBlockContainer_Blocks();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.Procedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Procedure</em>'.
	 * @see mindstorms_bdsl.Procedure
	 * @generated
	 */
	EClass getProcedure();

	/**
	 * Returns the meta object for the containment reference list '{@link mindstorms_bdsl.Procedure#getContainsnameProcedure <em>Containsname Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containsname Procedure</em>'.
	 * @see mindstorms_bdsl.Procedure#getContainsnameProcedure()
	 * @see #getProcedure()
	 * @generated
	 */
	EReference getProcedure_ContainsnameProcedure();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.Arbitrator <em>Arbitrator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arbitrator</em>'.
	 * @see mindstorms_bdsl.Arbitrator
	 * @generated
	 */
	EClass getArbitrator();

	/**
	 * Returns the meta object for the containment reference list '{@link mindstorms_bdsl.Arbitrator#getBehaviors <em>Behaviors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Behaviors</em>'.
	 * @see mindstorms_bdsl.Arbitrator#getBehaviors()
	 * @see #getArbitrator()
	 * @generated
	 */
	EReference getArbitrator_Behaviors();

	/**
	 * Returns the meta object for the reference list '{@link mindstorms_bdsl.Arbitrator#getReuse <em>Reuse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reuse</em>'.
	 * @see mindstorms_bdsl.Arbitrator#getReuse()
	 * @see #getArbitrator()
	 * @generated
	 */
	EReference getArbitrator_Reuse();

	/**
	 * Returns the meta object for the containment reference list '{@link mindstorms_bdsl.Arbitrator#getContainsnameArbitrator <em>Containsname Arbitrator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containsname Arbitrator</em>'.
	 * @see mindstorms_bdsl.Arbitrator#getContainsnameArbitrator()
	 * @see #getArbitrator()
	 * @generated
	 */
	EReference getArbitrator_ContainsnameArbitrator();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.Behavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior</em>'.
	 * @see mindstorms_bdsl.Behavior
	 * @generated
	 */
	EClass getBehavior();

	/**
	 * Returns the meta object for the containment reference list '{@link mindstorms_bdsl.Behavior#getContainsnameBehavior <em>Containsname Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containsname Behavior</em>'.
	 * @see mindstorms_bdsl.Behavior#getContainsnameBehavior()
	 * @see #getBehavior()
	 * @generated
	 */
	EReference getBehavior_ContainsnameBehavior();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.ReuseInstruction <em>Reuse Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reuse Instruction</em>'.
	 * @see mindstorms_bdsl.ReuseInstruction
	 * @generated
	 */
	EClass getReuseInstruction();

	/**
	 * Returns the meta object for the reference '{@link mindstorms_bdsl.ReuseInstruction#getReuse <em>Reuse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reuse</em>'.
	 * @see mindstorms_bdsl.ReuseInstruction#getReuse()
	 * @see #getReuseInstruction()
	 * @generated
	 */
	EReference getReuseInstruction_Reuse();

	/**
	 * Returns the meta object for the containment reference list '{@link mindstorms_bdsl.ReuseInstruction#getContainsnameReuseInstruction <em>Containsname Reuse Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containsname Reuse Instruction</em>'.
	 * @see mindstorms_bdsl.ReuseInstruction#getContainsnameReuseInstruction()
	 * @see #getReuseInstruction()
	 * @generated
	 */
	EReference getReuseInstruction_ContainsnameReuseInstruction();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see mindstorms_bdsl.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see mindstorms_bdsl.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.Flow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow</em>'.
	 * @see mindstorms_bdsl.Flow
	 * @generated
	 */
	EClass getFlow();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see mindstorms_bdsl.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see mindstorms_bdsl.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If</em>'.
	 * @see mindstorms_bdsl.If
	 * @generated
	 */
	EClass getIf();

	/**
	 * Returns the meta object for the containment reference list '{@link mindstorms_bdsl.If#getContainsnameIf <em>Containsname If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containsname If</em>'.
	 * @see mindstorms_bdsl.If#getContainsnameIf()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_ContainsnameIf();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.While <em>While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>While</em>'.
	 * @see mindstorms_bdsl.While
	 * @generated
	 */
	EClass getWhile();

	/**
	 * Returns the meta object for the containment reference list '{@link mindstorms_bdsl.While#getContainsnameWhile <em>Containsname While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containsname While</em>'.
	 * @see mindstorms_bdsl.While#getContainsnameWhile()
	 * @see #getWhile()
	 * @generated
	 */
	EReference getWhile_ContainsnameWhile();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.GoForward <em>Go Forward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Go Forward</em>'.
	 * @see mindstorms_bdsl.GoForward
	 * @generated
	 */
	EClass getGoForward();

	/**
	 * Returns the meta object for the attribute '{@link mindstorms_bdsl.GoForward#getCm <em>Cm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cm</em>'.
	 * @see mindstorms_bdsl.GoForward#getCm()
	 * @see #getGoForward()
	 * @generated
	 */
	EAttribute getGoForward_Cm();

	/**
	 * Returns the meta object for the attribute '{@link mindstorms_bdsl.GoForward#isInfinite <em>Infinite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Infinite</em>'.
	 * @see mindstorms_bdsl.GoForward#isInfinite()
	 * @see #getGoForward()
	 * @generated
	 */
	EAttribute getGoForward_Infinite();

	/**
	 * Returns the meta object for the containment reference list '{@link mindstorms_bdsl.GoForward#getContainsnameGoForward <em>Containsname Go Forward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containsname Go Forward</em>'.
	 * @see mindstorms_bdsl.GoForward#getContainsnameGoForward()
	 * @see #getGoForward()
	 * @generated
	 */
	EReference getGoForward_ContainsnameGoForward();

	/**
	 * Returns the meta object for the containment reference list '{@link mindstorms_bdsl.GoForward#getContainscmGoForward <em>Containscm Go Forward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containscm Go Forward</em>'.
	 * @see mindstorms_bdsl.GoForward#getContainscmGoForward()
	 * @see #getGoForward()
	 * @generated
	 */
	EReference getGoForward_ContainscmGoForward();

	/**
	 * Returns the meta object for the containment reference list '{@link mindstorms_bdsl.GoForward#getContainsinfiniteGoForward <em>Containsinfinite Go Forward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containsinfinite Go Forward</em>'.
	 * @see mindstorms_bdsl.GoForward#getContainsinfiniteGoForward()
	 * @see #getGoForward()
	 * @generated
	 */
	EReference getGoForward_ContainsinfiniteGoForward();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.GoBackward <em>Go Backward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Go Backward</em>'.
	 * @see mindstorms_bdsl.GoBackward
	 * @generated
	 */
	EClass getGoBackward();

	/**
	 * Returns the meta object for the attribute '{@link mindstorms_bdsl.GoBackward#getCm <em>Cm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cm</em>'.
	 * @see mindstorms_bdsl.GoBackward#getCm()
	 * @see #getGoBackward()
	 * @generated
	 */
	EAttribute getGoBackward_Cm();

	/**
	 * Returns the meta object for the attribute '{@link mindstorms_bdsl.GoBackward#isInfinite <em>Infinite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Infinite</em>'.
	 * @see mindstorms_bdsl.GoBackward#isInfinite()
	 * @see #getGoBackward()
	 * @generated
	 */
	EAttribute getGoBackward_Infinite();

	/**
	 * Returns the meta object for the containment reference list '{@link mindstorms_bdsl.GoBackward#getContainsnameGoBackward <em>Containsname Go Backward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containsname Go Backward</em>'.
	 * @see mindstorms_bdsl.GoBackward#getContainsnameGoBackward()
	 * @see #getGoBackward()
	 * @generated
	 */
	EReference getGoBackward_ContainsnameGoBackward();

	/**
	 * Returns the meta object for the containment reference list '{@link mindstorms_bdsl.GoBackward#getContainscmGoBackward <em>Containscm Go Backward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containscm Go Backward</em>'.
	 * @see mindstorms_bdsl.GoBackward#getContainscmGoBackward()
	 * @see #getGoBackward()
	 * @generated
	 */
	EReference getGoBackward_ContainscmGoBackward();

	/**
	 * Returns the meta object for the containment reference list '{@link mindstorms_bdsl.GoBackward#getContainsinfiniteGoBackward <em>Containsinfinite Go Backward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containsinfinite Go Backward</em>'.
	 * @see mindstorms_bdsl.GoBackward#getContainsinfiniteGoBackward()
	 * @see #getGoBackward()
	 * @generated
	 */
	EReference getGoBackward_ContainsinfiniteGoBackward();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.Rotate <em>Rotate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rotate</em>'.
	 * @see mindstorms_bdsl.Rotate
	 * @generated
	 */
	EClass getRotate();

	/**
	 * Returns the meta object for the attribute '{@link mindstorms_bdsl.Rotate#getDegrees <em>Degrees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Degrees</em>'.
	 * @see mindstorms_bdsl.Rotate#getDegrees()
	 * @see #getRotate()
	 * @generated
	 */
	EAttribute getRotate_Degrees();

	/**
	 * Returns the meta object for the attribute '{@link mindstorms_bdsl.Rotate#isRandom <em>Random</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Random</em>'.
	 * @see mindstorms_bdsl.Rotate#isRandom()
	 * @see #getRotate()
	 * @generated
	 */
	EAttribute getRotate_Random();

	/**
	 * Returns the meta object for the containment reference list '{@link mindstorms_bdsl.Rotate#getContainsnameRotate <em>Containsname Rotate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containsname Rotate</em>'.
	 * @see mindstorms_bdsl.Rotate#getContainsnameRotate()
	 * @see #getRotate()
	 * @generated
	 */
	EReference getRotate_ContainsnameRotate();

	/**
	 * Returns the meta object for the containment reference list '{@link mindstorms_bdsl.Rotate#getContainsdegreesRotate <em>Containsdegrees Rotate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containsdegrees Rotate</em>'.
	 * @see mindstorms_bdsl.Rotate#getContainsdegreesRotate()
	 * @see #getRotate()
	 * @generated
	 */
	EReference getRotate_ContainsdegreesRotate();

	/**
	 * Returns the meta object for the containment reference list '{@link mindstorms_bdsl.Rotate#getContainsrandomRotate <em>Containsrandom Rotate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containsrandom Rotate</em>'.
	 * @see mindstorms_bdsl.Rotate#getContainsrandomRotate()
	 * @see #getRotate()
	 * @generated
	 */
	EReference getRotate_ContainsrandomRotate();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.GoTo <em>Go To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Go To</em>'.
	 * @see mindstorms_bdsl.GoTo
	 * @generated
	 */
	EClass getGoTo();

	/**
	 * Returns the meta object for the attribute '{@link mindstorms_bdsl.GoTo#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see mindstorms_bdsl.GoTo#getX()
	 * @see #getGoTo()
	 * @generated
	 */
	EAttribute getGoTo_X();

	/**
	 * Returns the meta object for the attribute '{@link mindstorms_bdsl.GoTo#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see mindstorms_bdsl.GoTo#getY()
	 * @see #getGoTo()
	 * @generated
	 */
	EAttribute getGoTo_Y();

	/**
	 * Returns the meta object for the containment reference list '{@link mindstorms_bdsl.GoTo#getContainsnameGoTo <em>Containsname Go To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containsname Go To</em>'.
	 * @see mindstorms_bdsl.GoTo#getContainsnameGoTo()
	 * @see #getGoTo()
	 * @generated
	 */
	EReference getGoTo_ContainsnameGoTo();

	/**
	 * Returns the meta object for the containment reference list '{@link mindstorms_bdsl.GoTo#getContainsxGoTo <em>Containsx Go To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containsx Go To</em>'.
	 * @see mindstorms_bdsl.GoTo#getContainsxGoTo()
	 * @see #getGoTo()
	 * @generated
	 */
	EReference getGoTo_ContainsxGoTo();

	/**
	 * Returns the meta object for the containment reference list '{@link mindstorms_bdsl.GoTo#getContainsyGoTo <em>Containsy Go To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containsy Go To</em>'.
	 * @see mindstorms_bdsl.GoTo#getContainsyGoTo()
	 * @see #getGoTo()
	 * @generated
	 */
	EReference getGoTo_ContainsyGoTo();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.ReturnToBase <em>Return To Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return To Base</em>'.
	 * @see mindstorms_bdsl.ReturnToBase
	 * @generated
	 */
	EClass getReturnToBase();

	/**
	 * Returns the meta object for the containment reference list '{@link mindstorms_bdsl.ReturnToBase#getContainsnameReturnToBase <em>Containsname Return To Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containsname Return To Base</em>'.
	 * @see mindstorms_bdsl.ReturnToBase#getContainsnameReturnToBase()
	 * @see #getReturnToBase()
	 * @generated
	 */
	EReference getReturnToBase_ContainsnameReturnToBase();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.Grab <em>Grab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grab</em>'.
	 * @see mindstorms_bdsl.Grab
	 * @generated
	 */
	EClass getGrab();

	/**
	 * Returns the meta object for the containment reference list '{@link mindstorms_bdsl.Grab#getContainsnameGrab <em>Containsname Grab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containsname Grab</em>'.
	 * @see mindstorms_bdsl.Grab#getContainsnameGrab()
	 * @see #getGrab()
	 * @generated
	 */
	EReference getGrab_ContainsnameGrab();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.Release <em>Release</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Release</em>'.
	 * @see mindstorms_bdsl.Release
	 * @generated
	 */
	EClass getRelease();

	/**
	 * Returns the meta object for the containment reference list '{@link mindstorms_bdsl.Release#getContainsnameRelease <em>Containsname Release</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containsname Release</em>'.
	 * @see mindstorms_bdsl.Release#getContainsnameRelease()
	 * @see #getRelease()
	 * @generated
	 */
	EReference getRelease_ContainsnameRelease();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.Delay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delay</em>'.
	 * @see mindstorms_bdsl.Delay
	 * @generated
	 */
	EClass getDelay();

	/**
	 * Returns the meta object for the attribute '{@link mindstorms_bdsl.Delay#getMs <em>Ms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ms</em>'.
	 * @see mindstorms_bdsl.Delay#getMs()
	 * @see #getDelay()
	 * @generated
	 */
	EAttribute getDelay_Ms();

	/**
	 * Returns the meta object for the containment reference list '{@link mindstorms_bdsl.Delay#getContainsnameDelay <em>Containsname Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containsname Delay</em>'.
	 * @see mindstorms_bdsl.Delay#getContainsnameDelay()
	 * @see #getDelay()
	 * @generated
	 */
	EReference getDelay_ContainsnameDelay();

	/**
	 * Returns the meta object for the containment reference list '{@link mindstorms_bdsl.Delay#getContainsmsDelay <em>Containsms Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containsms Delay</em>'.
	 * @see mindstorms_bdsl.Delay#getContainsmsDelay()
	 * @see #getDelay()
	 * @generated
	 */
	EReference getDelay_ContainsmsDelay();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.AvoidObstacle <em>Avoid Obstacle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Avoid Obstacle</em>'.
	 * @see mindstorms_bdsl.AvoidObstacle
	 * @generated
	 */
	EClass getAvoidObstacle();

	/**
	 * Returns the meta object for the containment reference list '{@link mindstorms_bdsl.AvoidObstacle#getContainsnameAvoidObstacle <em>Containsname Avoid Obstacle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containsname Avoid Obstacle</em>'.
	 * @see mindstorms_bdsl.AvoidObstacle#getContainsnameAvoidObstacle()
	 * @see #getAvoidObstacle()
	 * @generated
	 */
	EReference getAvoidObstacle_ContainsnameAvoidObstacle();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.ReturnBottleToBase <em>Return Bottle To Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Bottle To Base</em>'.
	 * @see mindstorms_bdsl.ReturnBottleToBase
	 * @generated
	 */
	EClass getReturnBottleToBase();

	/**
	 * Returns the meta object for the containment reference list '{@link mindstorms_bdsl.ReturnBottleToBase#getContainsnameReturnBottleToBase <em>Containsname Return Bottle To Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containsname Return Bottle To Base</em>'.
	 * @see mindstorms_bdsl.ReturnBottleToBase#getContainsnameReturnBottleToBase()
	 * @see #getReturnBottleToBase()
	 * @generated
	 */
	EReference getReturnBottleToBase_ContainsnameReturnBottleToBase();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.ExploreForward <em>Explore Forward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Explore Forward</em>'.
	 * @see mindstorms_bdsl.ExploreForward
	 * @generated
	 */
	EClass getExploreForward();

	/**
	 * Returns the meta object for the containment reference list '{@link mindstorms_bdsl.ExploreForward#getContainsnameExploreForward <em>Containsname Explore Forward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containsname Explore Forward</em>'.
	 * @see mindstorms_bdsl.ExploreForward#getContainsnameExploreForward()
	 * @see #getExploreForward()
	 * @generated
	 */
	EReference getExploreForward_ContainsnameExploreForward();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.TouchSensor <em>Touch Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Touch Sensor</em>'.
	 * @see mindstorms_bdsl.TouchSensor
	 * @generated
	 */
	EClass getTouchSensor();

	/**
	 * Returns the meta object for the attribute '{@link mindstorms_bdsl.TouchSensor#isIsPressed <em>Is Pressed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Pressed</em>'.
	 * @see mindstorms_bdsl.TouchSensor#isIsPressed()
	 * @see #getTouchSensor()
	 * @generated
	 */
	EAttribute getTouchSensor_IsPressed();

	/**
	 * Returns the meta object for the containment reference list '{@link mindstorms_bdsl.TouchSensor#getContainsnameTouchSensor <em>Containsname Touch Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containsname Touch Sensor</em>'.
	 * @see mindstorms_bdsl.TouchSensor#getContainsnameTouchSensor()
	 * @see #getTouchSensor()
	 * @generated
	 */
	EReference getTouchSensor_ContainsnameTouchSensor();

	/**
	 * Returns the meta object for the containment reference list '{@link mindstorms_bdsl.TouchSensor#getContainsisPressedTouchSensor <em>Containsis Pressed Touch Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containsis Pressed Touch Sensor</em>'.
	 * @see mindstorms_bdsl.TouchSensor#getContainsisPressedTouchSensor()
	 * @see #getTouchSensor()
	 * @generated
	 */
	EReference getTouchSensor_ContainsisPressedTouchSensor();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.UltrasonicSensor <em>Ultrasonic Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ultrasonic Sensor</em>'.
	 * @see mindstorms_bdsl.UltrasonicSensor
	 * @generated
	 */
	EClass getUltrasonicSensor();

	/**
	 * Returns the meta object for the attribute '{@link mindstorms_bdsl.UltrasonicSensor#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see mindstorms_bdsl.UltrasonicSensor#getOperator()
	 * @see #getUltrasonicSensor()
	 * @generated
	 */
	EAttribute getUltrasonicSensor_Operator();

	/**
	 * Returns the meta object for the attribute '{@link mindstorms_bdsl.UltrasonicSensor#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mindstorms_bdsl.UltrasonicSensor#getValue()
	 * @see #getUltrasonicSensor()
	 * @generated
	 */
	EAttribute getUltrasonicSensor_Value();

	/**
	 * Returns the meta object for the containment reference list '{@link mindstorms_bdsl.UltrasonicSensor#getContainsnameUltrasonicSensor <em>Containsname Ultrasonic Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containsname Ultrasonic Sensor</em>'.
	 * @see mindstorms_bdsl.UltrasonicSensor#getContainsnameUltrasonicSensor()
	 * @see #getUltrasonicSensor()
	 * @generated
	 */
	EReference getUltrasonicSensor_ContainsnameUltrasonicSensor();

	/**
	 * Returns the meta object for the containment reference list '{@link mindstorms_bdsl.UltrasonicSensor#getContainsoperatorUltrasonicSensor <em>Containsoperator Ultrasonic Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containsoperator Ultrasonic Sensor</em>'.
	 * @see mindstorms_bdsl.UltrasonicSensor#getContainsoperatorUltrasonicSensor()
	 * @see #getUltrasonicSensor()
	 * @generated
	 */
	EReference getUltrasonicSensor_ContainsoperatorUltrasonicSensor();

	/**
	 * Returns the meta object for the containment reference list '{@link mindstorms_bdsl.UltrasonicSensor#getContainsvalueUltrasonicSensor <em>Containsvalue Ultrasonic Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containsvalue Ultrasonic Sensor</em>'.
	 * @see mindstorms_bdsl.UltrasonicSensor#getContainsvalueUltrasonicSensor()
	 * @see #getUltrasonicSensor()
	 * @generated
	 */
	EReference getUltrasonicSensor_ContainsvalueUltrasonicSensor();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.ColorSensor <em>Color Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color Sensor</em>'.
	 * @see mindstorms_bdsl.ColorSensor
	 * @generated
	 */
	EClass getColorSensor();

	/**
	 * Returns the meta object for the attribute '{@link mindstorms_bdsl.ColorSensor#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see mindstorms_bdsl.ColorSensor#getColor()
	 * @see #getColorSensor()
	 * @generated
	 */
	EAttribute getColorSensor_Color();

	/**
	 * Returns the meta object for the containment reference list '{@link mindstorms_bdsl.ColorSensor#getContainsnameColorSensor <em>Containsname Color Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containsname Color Sensor</em>'.
	 * @see mindstorms_bdsl.ColorSensor#getContainsnameColorSensor()
	 * @see #getColorSensor()
	 * @generated
	 */
	EReference getColorSensor_ContainsnameColorSensor();

	/**
	 * Returns the meta object for the containment reference list '{@link mindstorms_bdsl.ColorSensor#getContainscolorColorSensor <em>Containscolor Color Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containscolor Color Sensor</em>'.
	 * @see mindstorms_bdsl.ColorSensor#getContainscolorColorSensor()
	 * @see #getColorSensor()
	 * @generated
	 */
	EReference getColorSensor_ContainscolorColorSensor();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.ConditionContainer <em>Condition Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Container</em>'.
	 * @see mindstorms_bdsl.ConditionContainer
	 * @generated
	 */
	EClass getConditionContainer();

	/**
	 * Returns the meta object for the containment reference '{@link mindstorms_bdsl.ConditionContainer#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see mindstorms_bdsl.ConditionContainer#getCondition()
	 * @see #getConditionContainer()
	 * @generated
	 */
	EReference getConditionContainer_Condition();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.GoToEnemy <em>Go To Enemy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Go To Enemy</em>'.
	 * @see mindstorms_bdsl.GoToEnemy
	 * @generated
	 */
	EClass getGoToEnemy();

	/**
	 * Returns the meta object for the containment reference list '{@link mindstorms_bdsl.GoToEnemy#getContainsnameGoToEnemy <em>Containsname Go To Enemy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containsname Go To Enemy</em>'.
	 * @see mindstorms_bdsl.GoToEnemy#getContainsnameGoToEnemy()
	 * @see #getGoToEnemy()
	 * @generated
	 */
	EReference getGoToEnemy_ContainsnameGoToEnemy();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.nameProcedure <em>name Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>name Procedure</em>'.
	 * @see mindstorms_bdsl.nameProcedure
	 * @generated
	 */
	EClass getnameProcedure();

	/**
	 * Returns the meta object for the attribute '{@link mindstorms_bdsl.nameProcedure#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mindstorms_bdsl.nameProcedure#getValue()
	 * @see #getnameProcedure()
	 * @generated
	 */
	EAttribute getnameProcedure_Value();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.nameArbitrator <em>name Arbitrator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>name Arbitrator</em>'.
	 * @see mindstorms_bdsl.nameArbitrator
	 * @generated
	 */
	EClass getnameArbitrator();

	/**
	 * Returns the meta object for the attribute '{@link mindstorms_bdsl.nameArbitrator#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mindstorms_bdsl.nameArbitrator#getValue()
	 * @see #getnameArbitrator()
	 * @generated
	 */
	EAttribute getnameArbitrator_Value();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.nameBehavior <em>name Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>name Behavior</em>'.
	 * @see mindstorms_bdsl.nameBehavior
	 * @generated
	 */
	EClass getnameBehavior();

	/**
	 * Returns the meta object for the attribute '{@link mindstorms_bdsl.nameBehavior#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mindstorms_bdsl.nameBehavior#getValue()
	 * @see #getnameBehavior()
	 * @generated
	 */
	EAttribute getnameBehavior_Value();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.nameReuseInstruction <em>name Reuse Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>name Reuse Instruction</em>'.
	 * @see mindstorms_bdsl.nameReuseInstruction
	 * @generated
	 */
	EClass getnameReuseInstruction();

	/**
	 * Returns the meta object for the attribute '{@link mindstorms_bdsl.nameReuseInstruction#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mindstorms_bdsl.nameReuseInstruction#getValue()
	 * @see #getnameReuseInstruction()
	 * @generated
	 */
	EAttribute getnameReuseInstruction_Value();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.nameIf <em>name If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>name If</em>'.
	 * @see mindstorms_bdsl.nameIf
	 * @generated
	 */
	EClass getnameIf();

	/**
	 * Returns the meta object for the attribute '{@link mindstorms_bdsl.nameIf#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mindstorms_bdsl.nameIf#getValue()
	 * @see #getnameIf()
	 * @generated
	 */
	EAttribute getnameIf_Value();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.nameWhile <em>name While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>name While</em>'.
	 * @see mindstorms_bdsl.nameWhile
	 * @generated
	 */
	EClass getnameWhile();

	/**
	 * Returns the meta object for the attribute '{@link mindstorms_bdsl.nameWhile#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mindstorms_bdsl.nameWhile#getValue()
	 * @see #getnameWhile()
	 * @generated
	 */
	EAttribute getnameWhile_Value();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.nameGoForward <em>name Go Forward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>name Go Forward</em>'.
	 * @see mindstorms_bdsl.nameGoForward
	 * @generated
	 */
	EClass getnameGoForward();

	/**
	 * Returns the meta object for the attribute '{@link mindstorms_bdsl.nameGoForward#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mindstorms_bdsl.nameGoForward#getValue()
	 * @see #getnameGoForward()
	 * @generated
	 */
	EAttribute getnameGoForward_Value();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.cmGoForward <em>cm Go Forward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>cm Go Forward</em>'.
	 * @see mindstorms_bdsl.cmGoForward
	 * @generated
	 */
	EClass getcmGoForward();

	/**
	 * Returns the meta object for the attribute '{@link mindstorms_bdsl.cmGoForward#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mindstorms_bdsl.cmGoForward#getValue()
	 * @see #getcmGoForward()
	 * @generated
	 */
	EAttribute getcmGoForward_Value();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.infiniteGoForward <em>infinite Go Forward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>infinite Go Forward</em>'.
	 * @see mindstorms_bdsl.infiniteGoForward
	 * @generated
	 */
	EClass getinfiniteGoForward();

	/**
	 * Returns the meta object for the attribute '{@link mindstorms_bdsl.infiniteGoForward#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mindstorms_bdsl.infiniteGoForward#isValue()
	 * @see #getinfiniteGoForward()
	 * @generated
	 */
	EAttribute getinfiniteGoForward_Value();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.nameGoBackward <em>name Go Backward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>name Go Backward</em>'.
	 * @see mindstorms_bdsl.nameGoBackward
	 * @generated
	 */
	EClass getnameGoBackward();

	/**
	 * Returns the meta object for the attribute '{@link mindstorms_bdsl.nameGoBackward#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mindstorms_bdsl.nameGoBackward#getValue()
	 * @see #getnameGoBackward()
	 * @generated
	 */
	EAttribute getnameGoBackward_Value();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.cmGoBackward <em>cm Go Backward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>cm Go Backward</em>'.
	 * @see mindstorms_bdsl.cmGoBackward
	 * @generated
	 */
	EClass getcmGoBackward();

	/**
	 * Returns the meta object for the attribute '{@link mindstorms_bdsl.cmGoBackward#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mindstorms_bdsl.cmGoBackward#getValue()
	 * @see #getcmGoBackward()
	 * @generated
	 */
	EAttribute getcmGoBackward_Value();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.infiniteGoBackward <em>infinite Go Backward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>infinite Go Backward</em>'.
	 * @see mindstorms_bdsl.infiniteGoBackward
	 * @generated
	 */
	EClass getinfiniteGoBackward();

	/**
	 * Returns the meta object for the attribute '{@link mindstorms_bdsl.infiniteGoBackward#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mindstorms_bdsl.infiniteGoBackward#isValue()
	 * @see #getinfiniteGoBackward()
	 * @generated
	 */
	EAttribute getinfiniteGoBackward_Value();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.nameRotate <em>name Rotate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>name Rotate</em>'.
	 * @see mindstorms_bdsl.nameRotate
	 * @generated
	 */
	EClass getnameRotate();

	/**
	 * Returns the meta object for the attribute '{@link mindstorms_bdsl.nameRotate#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mindstorms_bdsl.nameRotate#getValue()
	 * @see #getnameRotate()
	 * @generated
	 */
	EAttribute getnameRotate_Value();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.degreesRotate <em>degrees Rotate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>degrees Rotate</em>'.
	 * @see mindstorms_bdsl.degreesRotate
	 * @generated
	 */
	EClass getdegreesRotate();

	/**
	 * Returns the meta object for the attribute '{@link mindstorms_bdsl.degreesRotate#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mindstorms_bdsl.degreesRotate#getValue()
	 * @see #getdegreesRotate()
	 * @generated
	 */
	EAttribute getdegreesRotate_Value();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.randomRotate <em>random Rotate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>random Rotate</em>'.
	 * @see mindstorms_bdsl.randomRotate
	 * @generated
	 */
	EClass getrandomRotate();

	/**
	 * Returns the meta object for the attribute '{@link mindstorms_bdsl.randomRotate#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mindstorms_bdsl.randomRotate#isValue()
	 * @see #getrandomRotate()
	 * @generated
	 */
	EAttribute getrandomRotate_Value();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.nameGoTo <em>name Go To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>name Go To</em>'.
	 * @see mindstorms_bdsl.nameGoTo
	 * @generated
	 */
	EClass getnameGoTo();

	/**
	 * Returns the meta object for the attribute '{@link mindstorms_bdsl.nameGoTo#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mindstorms_bdsl.nameGoTo#getValue()
	 * @see #getnameGoTo()
	 * @generated
	 */
	EAttribute getnameGoTo_Value();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.xGoTo <em>xGo To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>xGo To</em>'.
	 * @see mindstorms_bdsl.xGoTo
	 * @generated
	 */
	EClass getxGoTo();

	/**
	 * Returns the meta object for the attribute '{@link mindstorms_bdsl.xGoTo#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mindstorms_bdsl.xGoTo#getValue()
	 * @see #getxGoTo()
	 * @generated
	 */
	EAttribute getxGoTo_Value();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.yGoTo <em>yGo To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>yGo To</em>'.
	 * @see mindstorms_bdsl.yGoTo
	 * @generated
	 */
	EClass getyGoTo();

	/**
	 * Returns the meta object for the attribute '{@link mindstorms_bdsl.yGoTo#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mindstorms_bdsl.yGoTo#getValue()
	 * @see #getyGoTo()
	 * @generated
	 */
	EAttribute getyGoTo_Value();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.nameReturnToBase <em>name Return To Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>name Return To Base</em>'.
	 * @see mindstorms_bdsl.nameReturnToBase
	 * @generated
	 */
	EClass getnameReturnToBase();

	/**
	 * Returns the meta object for the attribute '{@link mindstorms_bdsl.nameReturnToBase#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mindstorms_bdsl.nameReturnToBase#getValue()
	 * @see #getnameReturnToBase()
	 * @generated
	 */
	EAttribute getnameReturnToBase_Value();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.nameGrab <em>name Grab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>name Grab</em>'.
	 * @see mindstorms_bdsl.nameGrab
	 * @generated
	 */
	EClass getnameGrab();

	/**
	 * Returns the meta object for the attribute '{@link mindstorms_bdsl.nameGrab#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mindstorms_bdsl.nameGrab#getValue()
	 * @see #getnameGrab()
	 * @generated
	 */
	EAttribute getnameGrab_Value();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.nameRelease <em>name Release</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>name Release</em>'.
	 * @see mindstorms_bdsl.nameRelease
	 * @generated
	 */
	EClass getnameRelease();

	/**
	 * Returns the meta object for the attribute '{@link mindstorms_bdsl.nameRelease#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mindstorms_bdsl.nameRelease#getValue()
	 * @see #getnameRelease()
	 * @generated
	 */
	EAttribute getnameRelease_Value();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.nameDelay <em>name Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>name Delay</em>'.
	 * @see mindstorms_bdsl.nameDelay
	 * @generated
	 */
	EClass getnameDelay();

	/**
	 * Returns the meta object for the attribute '{@link mindstorms_bdsl.nameDelay#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mindstorms_bdsl.nameDelay#getValue()
	 * @see #getnameDelay()
	 * @generated
	 */
	EAttribute getnameDelay_Value();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.msDelay <em>ms Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ms Delay</em>'.
	 * @see mindstorms_bdsl.msDelay
	 * @generated
	 */
	EClass getmsDelay();

	/**
	 * Returns the meta object for the attribute '{@link mindstorms_bdsl.msDelay#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mindstorms_bdsl.msDelay#getValue()
	 * @see #getmsDelay()
	 * @generated
	 */
	EAttribute getmsDelay_Value();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.nameAvoidObstacle <em>name Avoid Obstacle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>name Avoid Obstacle</em>'.
	 * @see mindstorms_bdsl.nameAvoidObstacle
	 * @generated
	 */
	EClass getnameAvoidObstacle();

	/**
	 * Returns the meta object for the attribute '{@link mindstorms_bdsl.nameAvoidObstacle#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mindstorms_bdsl.nameAvoidObstacle#getValue()
	 * @see #getnameAvoidObstacle()
	 * @generated
	 */
	EAttribute getnameAvoidObstacle_Value();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.nameReturnBottleToBase <em>name Return Bottle To Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>name Return Bottle To Base</em>'.
	 * @see mindstorms_bdsl.nameReturnBottleToBase
	 * @generated
	 */
	EClass getnameReturnBottleToBase();

	/**
	 * Returns the meta object for the attribute '{@link mindstorms_bdsl.nameReturnBottleToBase#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mindstorms_bdsl.nameReturnBottleToBase#getValue()
	 * @see #getnameReturnBottleToBase()
	 * @generated
	 */
	EAttribute getnameReturnBottleToBase_Value();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.nameExploreForward <em>name Explore Forward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>name Explore Forward</em>'.
	 * @see mindstorms_bdsl.nameExploreForward
	 * @generated
	 */
	EClass getnameExploreForward();

	/**
	 * Returns the meta object for the attribute '{@link mindstorms_bdsl.nameExploreForward#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mindstorms_bdsl.nameExploreForward#getValue()
	 * @see #getnameExploreForward()
	 * @generated
	 */
	EAttribute getnameExploreForward_Value();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.nameTouchSensor <em>name Touch Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>name Touch Sensor</em>'.
	 * @see mindstorms_bdsl.nameTouchSensor
	 * @generated
	 */
	EClass getnameTouchSensor();

	/**
	 * Returns the meta object for the attribute '{@link mindstorms_bdsl.nameTouchSensor#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mindstorms_bdsl.nameTouchSensor#getValue()
	 * @see #getnameTouchSensor()
	 * @generated
	 */
	EAttribute getnameTouchSensor_Value();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.isPressedTouchSensor <em>is Pressed Touch Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>is Pressed Touch Sensor</em>'.
	 * @see mindstorms_bdsl.isPressedTouchSensor
	 * @generated
	 */
	EClass getisPressedTouchSensor();

	/**
	 * Returns the meta object for the attribute '{@link mindstorms_bdsl.isPressedTouchSensor#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mindstorms_bdsl.isPressedTouchSensor#isValue()
	 * @see #getisPressedTouchSensor()
	 * @generated
	 */
	EAttribute getisPressedTouchSensor_Value();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.nameUltrasonicSensor <em>name Ultrasonic Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>name Ultrasonic Sensor</em>'.
	 * @see mindstorms_bdsl.nameUltrasonicSensor
	 * @generated
	 */
	EClass getnameUltrasonicSensor();

	/**
	 * Returns the meta object for the attribute '{@link mindstorms_bdsl.nameUltrasonicSensor#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mindstorms_bdsl.nameUltrasonicSensor#getValue()
	 * @see #getnameUltrasonicSensor()
	 * @generated
	 */
	EAttribute getnameUltrasonicSensor_Value();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.operatorUltrasonicSensor <em>operator Ultrasonic Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>operator Ultrasonic Sensor</em>'.
	 * @see mindstorms_bdsl.operatorUltrasonicSensor
	 * @generated
	 */
	EClass getoperatorUltrasonicSensor();

	/**
	 * Returns the meta object for the attribute '{@link mindstorms_bdsl.operatorUltrasonicSensor#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mindstorms_bdsl.operatorUltrasonicSensor#getValue()
	 * @see #getoperatorUltrasonicSensor()
	 * @generated
	 */
	EAttribute getoperatorUltrasonicSensor_Value();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.valueUltrasonicSensor <em>value Ultrasonic Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>value Ultrasonic Sensor</em>'.
	 * @see mindstorms_bdsl.valueUltrasonicSensor
	 * @generated
	 */
	EClass getvalueUltrasonicSensor();

	/**
	 * Returns the meta object for the attribute '{@link mindstorms_bdsl.valueUltrasonicSensor#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mindstorms_bdsl.valueUltrasonicSensor#getValue()
	 * @see #getvalueUltrasonicSensor()
	 * @generated
	 */
	EAttribute getvalueUltrasonicSensor_Value();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.nameColorSensor <em>name Color Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>name Color Sensor</em>'.
	 * @see mindstorms_bdsl.nameColorSensor
	 * @generated
	 */
	EClass getnameColorSensor();

	/**
	 * Returns the meta object for the attribute '{@link mindstorms_bdsl.nameColorSensor#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mindstorms_bdsl.nameColorSensor#getValue()
	 * @see #getnameColorSensor()
	 * @generated
	 */
	EAttribute getnameColorSensor_Value();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.colorColorSensor <em>color Color Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>color Color Sensor</em>'.
	 * @see mindstorms_bdsl.colorColorSensor
	 * @generated
	 */
	EClass getcolorColorSensor();

	/**
	 * Returns the meta object for the attribute '{@link mindstorms_bdsl.colorColorSensor#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mindstorms_bdsl.colorColorSensor#getValue()
	 * @see #getcolorColorSensor()
	 * @generated
	 */
	EAttribute getcolorColorSensor_Value();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.nameGoToEnemy <em>name Go To Enemy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>name Go To Enemy</em>'.
	 * @see mindstorms_bdsl.nameGoToEnemy
	 * @generated
	 */
	EClass getnameGoToEnemy();

	/**
	 * Returns the meta object for the attribute '{@link mindstorms_bdsl.nameGoToEnemy#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mindstorms_bdsl.nameGoToEnemy#getValue()
	 * @see #getnameGoToEnemy()
	 * @generated
	 */
	EAttribute getnameGoToEnemy_Value();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.NoneElement <em>None Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>None Element</em>'.
	 * @see mindstorms_bdsl.NoneElement
	 * @generated
	 */
	EClass getNoneElement();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.BindingElement <em>Binding Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Element</em>'.
	 * @see mindstorms_bdsl.BindingElement
	 * @generated
	 */
	EClass getBindingElement();

	/**
	 * Returns the meta object for the reference list '{@link mindstorms_bdsl.BindingElement#getNoneElement <em>None Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>None Element</em>'.
	 * @see mindstorms_bdsl.BindingElement#getNoneElement()
	 * @see #getBindingElement()
	 * @generated
	 */
	EReference getBindingElement_NoneElement();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.IntermediateElement <em>Intermediate Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intermediate Element</em>'.
	 * @see mindstorms_bdsl.IntermediateElement
	 * @generated
	 */
	EClass getIntermediateElement();

	/**
	 * Returns the meta object for the reference '{@link mindstorms_bdsl.IntermediateElement#getBindingElement <em>Binding Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Binding Element</em>'.
	 * @see mindstorms_bdsl.IntermediateElement#getBindingElement()
	 * @see #getIntermediateElement()
	 * @generated
	 */
	EReference getIntermediateElement_BindingElement();

	/**
	 * Returns the meta object for the reference list '{@link mindstorms_bdsl.IntermediateElement#getMetamodelElement <em>Metamodel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Metamodel Element</em>'.
	 * @see mindstorms_bdsl.IntermediateElement#getMetamodelElement()
	 * @see #getIntermediateElement()
	 * @generated
	 */
	EReference getIntermediateElement_MetamodelElement();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.MetamodelElement <em>Metamodel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metamodel Element</em>'.
	 * @see mindstorms_bdsl.MetamodelElement
	 * @generated
	 */
	EClass getMetamodelElement();

	/**
	 * Returns the meta object for the containment reference list '{@link mindstorms_bdsl.MetamodelElement#getVirtualAttribute <em>Virtual Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Virtual Attribute</em>'.
	 * @see mindstorms_bdsl.MetamodelElement#getVirtualAttribute()
	 * @see #getMetamodelElement()
	 * @generated
	 */
	EReference getMetamodelElement_VirtualAttribute();

	/**
	 * Returns the meta object for the containment reference list '{@link mindstorms_bdsl.MetamodelElement#getMetamodelElementFeature <em>Metamodel Element Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metamodel Element Feature</em>'.
	 * @see mindstorms_bdsl.MetamodelElement#getMetamodelElementFeature()
	 * @see #getMetamodelElement()
	 * @generated
	 */
	EReference getMetamodelElement_MetamodelElementFeature();

	/**
	 * Returns the meta object for the attribute '{@link mindstorms_bdsl.MetamodelElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mindstorms_bdsl.MetamodelElement#getName()
	 * @see #getMetamodelElement()
	 * @generated
	 */
	EAttribute getMetamodelElement_Name();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.MetamodelElementFeature <em>Metamodel Element Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metamodel Element Feature</em>'.
	 * @see mindstorms_bdsl.MetamodelElementFeature
	 * @generated
	 */
	EClass getMetamodelElementFeature();

	/**
	 * Returns the meta object for the reference list '{@link mindstorms_bdsl.MetamodelElementFeature#getFeatureClass <em>Feature Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Feature Class</em>'.
	 * @see mindstorms_bdsl.MetamodelElementFeature#getFeatureClass()
	 * @see #getMetamodelElementFeature()
	 * @generated
	 */
	EReference getMetamodelElementFeature_FeatureClass();

	/**
	 * Returns the meta object for the attribute '{@link mindstorms_bdsl.MetamodelElementFeature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mindstorms_bdsl.MetamodelElementFeature#getName()
	 * @see #getMetamodelElementFeature()
	 * @generated
	 */
	EAttribute getMetamodelElementFeature_Name();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.BindingAttribute <em>Binding Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Attribute</em>'.
	 * @see mindstorms_bdsl.BindingAttribute
	 * @generated
	 */
	EClass getBindingAttribute();

	/**
	 * Returns the meta object for class '{@link mindstorms_bdsl.VirtualAttribute <em>Virtual Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Attribute</em>'.
	 * @see mindstorms_bdsl.VirtualAttribute
	 * @generated
	 */
	EClass getVirtualAttribute();

	/**
	 * Returns the meta object for the reference '{@link mindstorms_bdsl.VirtualAttribute#getTo_virtualAttribute <em>To virtual Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To virtual Attribute</em>'.
	 * @see mindstorms_bdsl.VirtualAttribute#getTo_virtualAttribute()
	 * @see #getVirtualAttribute()
	 * @generated
	 */
	EReference getVirtualAttribute_To_virtualAttribute();

	/**
	 * Returns the meta object for the attribute '{@link mindstorms_bdsl.VirtualAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mindstorms_bdsl.VirtualAttribute#getName()
	 * @see #getVirtualAttribute()
	 * @generated
	 */
	EAttribute getVirtualAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link mindstorms_bdsl.VirtualAttribute#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see mindstorms_bdsl.VirtualAttribute#getExpression()
	 * @see #getVirtualAttribute()
	 * @generated
	 */
	EAttribute getVirtualAttribute_Expression();

	/**
	 * Returns the meta object for enum '{@link mindstorms_bdsl.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Color</em>'.
	 * @see mindstorms_bdsl.Color
	 * @generated
	 */
	EEnum getColor();

	/**
	 * Returns the meta object for enum '{@link mindstorms_bdsl.OperatorKind <em>Operator Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operator Kind</em>'.
	 * @see mindstorms_bdsl.OperatorKind
	 * @generated
	 */
	EEnum getOperatorKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Mindstorms_bdslFactory getMindstorms_bdslFactory();

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
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.NamedElementImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '<em><b>Contains None Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_ELEMENT__CONTAINS_NONE_ELEMENT = eINSTANCE.getNamedElement_ContainsNoneElement();

		/**
		 * The meta object literal for the '<em><b>Contains Binding Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_ELEMENT__CONTAINS_BINDING_ELEMENT = eINSTANCE.getNamedElement_ContainsBindingElement();

		/**
		 * The meta object literal for the '<em><b>Contains Intermediate Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_ELEMENT__CONTAINS_INTERMEDIATE_ELEMENT = eINSTANCE.getNamedElement_ContainsIntermediateElement();

		/**
		 * The meta object literal for the '<em><b>Contains Metamodel Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_ELEMENT__CONTAINS_METAMODEL_ELEMENT = eINSTANCE.getNamedElement_ContainsMetamodelElement();

		/**
		 * The meta object literal for the '<em><b>Contains Metamodel Element Feature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_ELEMENT__CONTAINS_METAMODEL_ELEMENT_FEATURE = eINSTANCE.getNamedElement_ContainsMetamodelElementFeature();

		/**
		 * The meta object literal for the '<em><b>Contains Binding Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_ELEMENT__CONTAINS_BINDING_ATTRIBUTE = eINSTANCE.getNamedElement_ContainsBindingAttribute();

		/**
		 * The meta object literal for the '<em><b>Contains Virtual Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_ELEMENT__CONTAINS_VIRTUAL_ATTRIBUTE = eINSTANCE.getNamedElement_ContainsVirtualAttribute();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.MainImpl <em>Main</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.MainImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getMain()
		 * @generated
		 */
		EClass MAIN = eINSTANCE.getMain();

		/**
		 * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN__INSTRUCTIONS = eINSTANCE.getMain_Instructions();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.InstructionImpl <em>Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.InstructionImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getInstruction()
		 * @generated
		 */
		EClass INSTRUCTION = eINSTANCE.getInstruction();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.BlockContainerImpl <em>Block Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.BlockContainerImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getBlockContainer()
		 * @generated
		 */
		EClass BLOCK_CONTAINER = eINSTANCE.getBlockContainer();

		/**
		 * The meta object literal for the '<em><b>Blocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_CONTAINER__BLOCKS = eINSTANCE.getBlockContainer_Blocks();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.ProcedureImpl <em>Procedure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.ProcedureImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getProcedure()
		 * @generated
		 */
		EClass PROCEDURE = eINSTANCE.getProcedure();

		/**
		 * The meta object literal for the '<em><b>Containsname Procedure</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCEDURE__CONTAINSNAME_PROCEDURE = eINSTANCE.getProcedure_ContainsnameProcedure();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.ArbitratorImpl <em>Arbitrator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.ArbitratorImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getArbitrator()
		 * @generated
		 */
		EClass ARBITRATOR = eINSTANCE.getArbitrator();

		/**
		 * The meta object literal for the '<em><b>Behaviors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARBITRATOR__BEHAVIORS = eINSTANCE.getArbitrator_Behaviors();

		/**
		 * The meta object literal for the '<em><b>Reuse</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARBITRATOR__REUSE = eINSTANCE.getArbitrator_Reuse();

		/**
		 * The meta object literal for the '<em><b>Containsname Arbitrator</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARBITRATOR__CONTAINSNAME_ARBITRATOR = eINSTANCE.getArbitrator_ContainsnameArbitrator();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.BehaviorImpl <em>Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.BehaviorImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getBehavior()
		 * @generated
		 */
		EClass BEHAVIOR = eINSTANCE.getBehavior();

		/**
		 * The meta object literal for the '<em><b>Containsname Behavior</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR__CONTAINSNAME_BEHAVIOR = eINSTANCE.getBehavior_ContainsnameBehavior();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.ReuseInstructionImpl <em>Reuse Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.ReuseInstructionImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getReuseInstruction()
		 * @generated
		 */
		EClass REUSE_INSTRUCTION = eINSTANCE.getReuseInstruction();

		/**
		 * The meta object literal for the '<em><b>Reuse</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REUSE_INSTRUCTION__REUSE = eINSTANCE.getReuseInstruction_Reuse();

		/**
		 * The meta object literal for the '<em><b>Containsname Reuse Instruction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REUSE_INSTRUCTION__CONTAINSNAME_REUSE_INSTRUCTION = eINSTANCE.getReuseInstruction_ContainsnameReuseInstruction();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.BlockImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.ActionImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.FlowImpl <em>Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.FlowImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getFlow()
		 * @generated
		 */
		EClass FLOW = eINSTANCE.getFlow();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.SensorImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.ConditionImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.IfImpl <em>If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.IfImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getIf()
		 * @generated
		 */
		EClass IF = eINSTANCE.getIf();

		/**
		 * The meta object literal for the '<em><b>Containsname If</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__CONTAINSNAME_IF = eINSTANCE.getIf_ContainsnameIf();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.WhileImpl <em>While</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.WhileImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getWhile()
		 * @generated
		 */
		EClass WHILE = eINSTANCE.getWhile();

		/**
		 * The meta object literal for the '<em><b>Containsname While</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE__CONTAINSNAME_WHILE = eINSTANCE.getWhile_ContainsnameWhile();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.GoForwardImpl <em>Go Forward</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.GoForwardImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getGoForward()
		 * @generated
		 */
		EClass GO_FORWARD = eINSTANCE.getGoForward();

		/**
		 * The meta object literal for the '<em><b>Cm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GO_FORWARD__CM = eINSTANCE.getGoForward_Cm();

		/**
		 * The meta object literal for the '<em><b>Infinite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GO_FORWARD__INFINITE = eINSTANCE.getGoForward_Infinite();

		/**
		 * The meta object literal for the '<em><b>Containsname Go Forward</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GO_FORWARD__CONTAINSNAME_GO_FORWARD = eINSTANCE.getGoForward_ContainsnameGoForward();

		/**
		 * The meta object literal for the '<em><b>Containscm Go Forward</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GO_FORWARD__CONTAINSCM_GO_FORWARD = eINSTANCE.getGoForward_ContainscmGoForward();

		/**
		 * The meta object literal for the '<em><b>Containsinfinite Go Forward</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GO_FORWARD__CONTAINSINFINITE_GO_FORWARD = eINSTANCE.getGoForward_ContainsinfiniteGoForward();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.GoBackwardImpl <em>Go Backward</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.GoBackwardImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getGoBackward()
		 * @generated
		 */
		EClass GO_BACKWARD = eINSTANCE.getGoBackward();

		/**
		 * The meta object literal for the '<em><b>Cm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GO_BACKWARD__CM = eINSTANCE.getGoBackward_Cm();

		/**
		 * The meta object literal for the '<em><b>Infinite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GO_BACKWARD__INFINITE = eINSTANCE.getGoBackward_Infinite();

		/**
		 * The meta object literal for the '<em><b>Containsname Go Backward</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GO_BACKWARD__CONTAINSNAME_GO_BACKWARD = eINSTANCE.getGoBackward_ContainsnameGoBackward();

		/**
		 * The meta object literal for the '<em><b>Containscm Go Backward</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GO_BACKWARD__CONTAINSCM_GO_BACKWARD = eINSTANCE.getGoBackward_ContainscmGoBackward();

		/**
		 * The meta object literal for the '<em><b>Containsinfinite Go Backward</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GO_BACKWARD__CONTAINSINFINITE_GO_BACKWARD = eINSTANCE.getGoBackward_ContainsinfiniteGoBackward();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.RotateImpl <em>Rotate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.RotateImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getRotate()
		 * @generated
		 */
		EClass ROTATE = eINSTANCE.getRotate();

		/**
		 * The meta object literal for the '<em><b>Degrees</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROTATE__DEGREES = eINSTANCE.getRotate_Degrees();

		/**
		 * The meta object literal for the '<em><b>Random</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROTATE__RANDOM = eINSTANCE.getRotate_Random();

		/**
		 * The meta object literal for the '<em><b>Containsname Rotate</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROTATE__CONTAINSNAME_ROTATE = eINSTANCE.getRotate_ContainsnameRotate();

		/**
		 * The meta object literal for the '<em><b>Containsdegrees Rotate</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROTATE__CONTAINSDEGREES_ROTATE = eINSTANCE.getRotate_ContainsdegreesRotate();

		/**
		 * The meta object literal for the '<em><b>Containsrandom Rotate</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROTATE__CONTAINSRANDOM_ROTATE = eINSTANCE.getRotate_ContainsrandomRotate();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.GoToImpl <em>Go To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.GoToImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getGoTo()
		 * @generated
		 */
		EClass GO_TO = eINSTANCE.getGoTo();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GO_TO__X = eINSTANCE.getGoTo_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GO_TO__Y = eINSTANCE.getGoTo_Y();

		/**
		 * The meta object literal for the '<em><b>Containsname Go To</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GO_TO__CONTAINSNAME_GO_TO = eINSTANCE.getGoTo_ContainsnameGoTo();

		/**
		 * The meta object literal for the '<em><b>Containsx Go To</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GO_TO__CONTAINSX_GO_TO = eINSTANCE.getGoTo_ContainsxGoTo();

		/**
		 * The meta object literal for the '<em><b>Containsy Go To</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GO_TO__CONTAINSY_GO_TO = eINSTANCE.getGoTo_ContainsyGoTo();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.ReturnToBaseImpl <em>Return To Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.ReturnToBaseImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getReturnToBase()
		 * @generated
		 */
		EClass RETURN_TO_BASE = eINSTANCE.getReturnToBase();

		/**
		 * The meta object literal for the '<em><b>Containsname Return To Base</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_TO_BASE__CONTAINSNAME_RETURN_TO_BASE = eINSTANCE.getReturnToBase_ContainsnameReturnToBase();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.GrabImpl <em>Grab</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.GrabImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getGrab()
		 * @generated
		 */
		EClass GRAB = eINSTANCE.getGrab();

		/**
		 * The meta object literal for the '<em><b>Containsname Grab</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAB__CONTAINSNAME_GRAB = eINSTANCE.getGrab_ContainsnameGrab();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.ReleaseImpl <em>Release</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.ReleaseImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getRelease()
		 * @generated
		 */
		EClass RELEASE = eINSTANCE.getRelease();

		/**
		 * The meta object literal for the '<em><b>Containsname Release</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELEASE__CONTAINSNAME_RELEASE = eINSTANCE.getRelease_ContainsnameRelease();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.DelayImpl <em>Delay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.DelayImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getDelay()
		 * @generated
		 */
		EClass DELAY = eINSTANCE.getDelay();

		/**
		 * The meta object literal for the '<em><b>Ms</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELAY__MS = eINSTANCE.getDelay_Ms();

		/**
		 * The meta object literal for the '<em><b>Containsname Delay</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELAY__CONTAINSNAME_DELAY = eINSTANCE.getDelay_ContainsnameDelay();

		/**
		 * The meta object literal for the '<em><b>Containsms Delay</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELAY__CONTAINSMS_DELAY = eINSTANCE.getDelay_ContainsmsDelay();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.AvoidObstacleImpl <em>Avoid Obstacle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.AvoidObstacleImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getAvoidObstacle()
		 * @generated
		 */
		EClass AVOID_OBSTACLE = eINSTANCE.getAvoidObstacle();

		/**
		 * The meta object literal for the '<em><b>Containsname Avoid Obstacle</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AVOID_OBSTACLE__CONTAINSNAME_AVOID_OBSTACLE = eINSTANCE.getAvoidObstacle_ContainsnameAvoidObstacle();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.ReturnBottleToBaseImpl <em>Return Bottle To Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.ReturnBottleToBaseImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getReturnBottleToBase()
		 * @generated
		 */
		EClass RETURN_BOTTLE_TO_BASE = eINSTANCE.getReturnBottleToBase();

		/**
		 * The meta object literal for the '<em><b>Containsname Return Bottle To Base</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_BOTTLE_TO_BASE__CONTAINSNAME_RETURN_BOTTLE_TO_BASE = eINSTANCE.getReturnBottleToBase_ContainsnameReturnBottleToBase();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.ExploreForwardImpl <em>Explore Forward</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.ExploreForwardImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getExploreForward()
		 * @generated
		 */
		EClass EXPLORE_FORWARD = eINSTANCE.getExploreForward();

		/**
		 * The meta object literal for the '<em><b>Containsname Explore Forward</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPLORE_FORWARD__CONTAINSNAME_EXPLORE_FORWARD = eINSTANCE.getExploreForward_ContainsnameExploreForward();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.TouchSensorImpl <em>Touch Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.TouchSensorImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getTouchSensor()
		 * @generated
		 */
		EClass TOUCH_SENSOR = eINSTANCE.getTouchSensor();

		/**
		 * The meta object literal for the '<em><b>Is Pressed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCH_SENSOR__IS_PRESSED = eINSTANCE.getTouchSensor_IsPressed();

		/**
		 * The meta object literal for the '<em><b>Containsname Touch Sensor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOUCH_SENSOR__CONTAINSNAME_TOUCH_SENSOR = eINSTANCE.getTouchSensor_ContainsnameTouchSensor();

		/**
		 * The meta object literal for the '<em><b>Containsis Pressed Touch Sensor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOUCH_SENSOR__CONTAINSIS_PRESSED_TOUCH_SENSOR = eINSTANCE.getTouchSensor_ContainsisPressedTouchSensor();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.UltrasonicSensorImpl <em>Ultrasonic Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.UltrasonicSensorImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getUltrasonicSensor()
		 * @generated
		 */
		EClass ULTRASONIC_SENSOR = eINSTANCE.getUltrasonicSensor();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ULTRASONIC_SENSOR__OPERATOR = eINSTANCE.getUltrasonicSensor_Operator();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ULTRASONIC_SENSOR__VALUE = eINSTANCE.getUltrasonicSensor_Value();

		/**
		 * The meta object literal for the '<em><b>Containsname Ultrasonic Sensor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ULTRASONIC_SENSOR__CONTAINSNAME_ULTRASONIC_SENSOR = eINSTANCE.getUltrasonicSensor_ContainsnameUltrasonicSensor();

		/**
		 * The meta object literal for the '<em><b>Containsoperator Ultrasonic Sensor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ULTRASONIC_SENSOR__CONTAINSOPERATOR_ULTRASONIC_SENSOR = eINSTANCE.getUltrasonicSensor_ContainsoperatorUltrasonicSensor();

		/**
		 * The meta object literal for the '<em><b>Containsvalue Ultrasonic Sensor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ULTRASONIC_SENSOR__CONTAINSVALUE_ULTRASONIC_SENSOR = eINSTANCE.getUltrasonicSensor_ContainsvalueUltrasonicSensor();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.ColorSensorImpl <em>Color Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.ColorSensorImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getColorSensor()
		 * @generated
		 */
		EClass COLOR_SENSOR = eINSTANCE.getColorSensor();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR_SENSOR__COLOR = eINSTANCE.getColorSensor_Color();

		/**
		 * The meta object literal for the '<em><b>Containsname Color Sensor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLOR_SENSOR__CONTAINSNAME_COLOR_SENSOR = eINSTANCE.getColorSensor_ContainsnameColorSensor();

		/**
		 * The meta object literal for the '<em><b>Containscolor Color Sensor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLOR_SENSOR__CONTAINSCOLOR_COLOR_SENSOR = eINSTANCE.getColorSensor_ContainscolorColorSensor();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.ConditionContainerImpl <em>Condition Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.ConditionContainerImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getConditionContainer()
		 * @generated
		 */
		EClass CONDITION_CONTAINER = eINSTANCE.getConditionContainer();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_CONTAINER__CONDITION = eINSTANCE.getConditionContainer_Condition();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.GoToEnemyImpl <em>Go To Enemy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.GoToEnemyImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getGoToEnemy()
		 * @generated
		 */
		EClass GO_TO_ENEMY = eINSTANCE.getGoToEnemy();

		/**
		 * The meta object literal for the '<em><b>Containsname Go To Enemy</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GO_TO_ENEMY__CONTAINSNAME_GO_TO_ENEMY = eINSTANCE.getGoToEnemy_ContainsnameGoToEnemy();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.nameProcedureImpl <em>name Procedure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.nameProcedureImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getnameProcedure()
		 * @generated
		 */
		EClass NAME_PROCEDURE = eINSTANCE.getnameProcedure();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_PROCEDURE__VALUE = eINSTANCE.getnameProcedure_Value();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.nameArbitratorImpl <em>name Arbitrator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.nameArbitratorImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getnameArbitrator()
		 * @generated
		 */
		EClass NAME_ARBITRATOR = eINSTANCE.getnameArbitrator();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_ARBITRATOR__VALUE = eINSTANCE.getnameArbitrator_Value();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.nameBehaviorImpl <em>name Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.nameBehaviorImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getnameBehavior()
		 * @generated
		 */
		EClass NAME_BEHAVIOR = eINSTANCE.getnameBehavior();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_BEHAVIOR__VALUE = eINSTANCE.getnameBehavior_Value();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.nameReuseInstructionImpl <em>name Reuse Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.nameReuseInstructionImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getnameReuseInstruction()
		 * @generated
		 */
		EClass NAME_REUSE_INSTRUCTION = eINSTANCE.getnameReuseInstruction();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_REUSE_INSTRUCTION__VALUE = eINSTANCE.getnameReuseInstruction_Value();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.nameIfImpl <em>name If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.nameIfImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getnameIf()
		 * @generated
		 */
		EClass NAME_IF = eINSTANCE.getnameIf();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_IF__VALUE = eINSTANCE.getnameIf_Value();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.nameWhileImpl <em>name While</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.nameWhileImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getnameWhile()
		 * @generated
		 */
		EClass NAME_WHILE = eINSTANCE.getnameWhile();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_WHILE__VALUE = eINSTANCE.getnameWhile_Value();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.nameGoForwardImpl <em>name Go Forward</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.nameGoForwardImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getnameGoForward()
		 * @generated
		 */
		EClass NAME_GO_FORWARD = eINSTANCE.getnameGoForward();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_GO_FORWARD__VALUE = eINSTANCE.getnameGoForward_Value();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.cmGoForwardImpl <em>cm Go Forward</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.cmGoForwardImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getcmGoForward()
		 * @generated
		 */
		EClass CM_GO_FORWARD = eINSTANCE.getcmGoForward();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_GO_FORWARD__VALUE = eINSTANCE.getcmGoForward_Value();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.infiniteGoForwardImpl <em>infinite Go Forward</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.infiniteGoForwardImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getinfiniteGoForward()
		 * @generated
		 */
		EClass INFINITE_GO_FORWARD = eINSTANCE.getinfiniteGoForward();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFINITE_GO_FORWARD__VALUE = eINSTANCE.getinfiniteGoForward_Value();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.nameGoBackwardImpl <em>name Go Backward</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.nameGoBackwardImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getnameGoBackward()
		 * @generated
		 */
		EClass NAME_GO_BACKWARD = eINSTANCE.getnameGoBackward();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_GO_BACKWARD__VALUE = eINSTANCE.getnameGoBackward_Value();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.cmGoBackwardImpl <em>cm Go Backward</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.cmGoBackwardImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getcmGoBackward()
		 * @generated
		 */
		EClass CM_GO_BACKWARD = eINSTANCE.getcmGoBackward();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CM_GO_BACKWARD__VALUE = eINSTANCE.getcmGoBackward_Value();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.infiniteGoBackwardImpl <em>infinite Go Backward</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.infiniteGoBackwardImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getinfiniteGoBackward()
		 * @generated
		 */
		EClass INFINITE_GO_BACKWARD = eINSTANCE.getinfiniteGoBackward();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFINITE_GO_BACKWARD__VALUE = eINSTANCE.getinfiniteGoBackward_Value();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.nameRotateImpl <em>name Rotate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.nameRotateImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getnameRotate()
		 * @generated
		 */
		EClass NAME_ROTATE = eINSTANCE.getnameRotate();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_ROTATE__VALUE = eINSTANCE.getnameRotate_Value();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.degreesRotateImpl <em>degrees Rotate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.degreesRotateImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getdegreesRotate()
		 * @generated
		 */
		EClass DEGREES_ROTATE = eINSTANCE.getdegreesRotate();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEGREES_ROTATE__VALUE = eINSTANCE.getdegreesRotate_Value();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.randomRotateImpl <em>random Rotate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.randomRotateImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getrandomRotate()
		 * @generated
		 */
		EClass RANDOM_ROTATE = eINSTANCE.getrandomRotate();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANDOM_ROTATE__VALUE = eINSTANCE.getrandomRotate_Value();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.nameGoToImpl <em>name Go To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.nameGoToImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getnameGoTo()
		 * @generated
		 */
		EClass NAME_GO_TO = eINSTANCE.getnameGoTo();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_GO_TO__VALUE = eINSTANCE.getnameGoTo_Value();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.xGoToImpl <em>xGo To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.xGoToImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getxGoTo()
		 * @generated
		 */
		EClass XGO_TO = eINSTANCE.getxGoTo();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XGO_TO__VALUE = eINSTANCE.getxGoTo_Value();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.yGoToImpl <em>yGo To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.yGoToImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getyGoTo()
		 * @generated
		 */
		EClass YGO_TO = eINSTANCE.getyGoTo();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YGO_TO__VALUE = eINSTANCE.getyGoTo_Value();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.nameReturnToBaseImpl <em>name Return To Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.nameReturnToBaseImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getnameReturnToBase()
		 * @generated
		 */
		EClass NAME_RETURN_TO_BASE = eINSTANCE.getnameReturnToBase();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_RETURN_TO_BASE__VALUE = eINSTANCE.getnameReturnToBase_Value();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.nameGrabImpl <em>name Grab</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.nameGrabImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getnameGrab()
		 * @generated
		 */
		EClass NAME_GRAB = eINSTANCE.getnameGrab();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_GRAB__VALUE = eINSTANCE.getnameGrab_Value();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.nameReleaseImpl <em>name Release</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.nameReleaseImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getnameRelease()
		 * @generated
		 */
		EClass NAME_RELEASE = eINSTANCE.getnameRelease();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_RELEASE__VALUE = eINSTANCE.getnameRelease_Value();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.nameDelayImpl <em>name Delay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.nameDelayImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getnameDelay()
		 * @generated
		 */
		EClass NAME_DELAY = eINSTANCE.getnameDelay();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_DELAY__VALUE = eINSTANCE.getnameDelay_Value();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.msDelayImpl <em>ms Delay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.msDelayImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getmsDelay()
		 * @generated
		 */
		EClass MS_DELAY = eINSTANCE.getmsDelay();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MS_DELAY__VALUE = eINSTANCE.getmsDelay_Value();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.nameAvoidObstacleImpl <em>name Avoid Obstacle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.nameAvoidObstacleImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getnameAvoidObstacle()
		 * @generated
		 */
		EClass NAME_AVOID_OBSTACLE = eINSTANCE.getnameAvoidObstacle();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_AVOID_OBSTACLE__VALUE = eINSTANCE.getnameAvoidObstacle_Value();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.nameReturnBottleToBaseImpl <em>name Return Bottle To Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.nameReturnBottleToBaseImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getnameReturnBottleToBase()
		 * @generated
		 */
		EClass NAME_RETURN_BOTTLE_TO_BASE = eINSTANCE.getnameReturnBottleToBase();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_RETURN_BOTTLE_TO_BASE__VALUE = eINSTANCE.getnameReturnBottleToBase_Value();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.nameExploreForwardImpl <em>name Explore Forward</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.nameExploreForwardImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getnameExploreForward()
		 * @generated
		 */
		EClass NAME_EXPLORE_FORWARD = eINSTANCE.getnameExploreForward();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_EXPLORE_FORWARD__VALUE = eINSTANCE.getnameExploreForward_Value();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.nameTouchSensorImpl <em>name Touch Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.nameTouchSensorImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getnameTouchSensor()
		 * @generated
		 */
		EClass NAME_TOUCH_SENSOR = eINSTANCE.getnameTouchSensor();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_TOUCH_SENSOR__VALUE = eINSTANCE.getnameTouchSensor_Value();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.isPressedTouchSensorImpl <em>is Pressed Touch Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.isPressedTouchSensorImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getisPressedTouchSensor()
		 * @generated
		 */
		EClass IS_PRESSED_TOUCH_SENSOR = eINSTANCE.getisPressedTouchSensor();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IS_PRESSED_TOUCH_SENSOR__VALUE = eINSTANCE.getisPressedTouchSensor_Value();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.nameUltrasonicSensorImpl <em>name Ultrasonic Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.nameUltrasonicSensorImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getnameUltrasonicSensor()
		 * @generated
		 */
		EClass NAME_ULTRASONIC_SENSOR = eINSTANCE.getnameUltrasonicSensor();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_ULTRASONIC_SENSOR__VALUE = eINSTANCE.getnameUltrasonicSensor_Value();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.operatorUltrasonicSensorImpl <em>operator Ultrasonic Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.operatorUltrasonicSensorImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getoperatorUltrasonicSensor()
		 * @generated
		 */
		EClass OPERATOR_ULTRASONIC_SENSOR = eINSTANCE.getoperatorUltrasonicSensor();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATOR_ULTRASONIC_SENSOR__VALUE = eINSTANCE.getoperatorUltrasonicSensor_Value();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.valueUltrasonicSensorImpl <em>value Ultrasonic Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.valueUltrasonicSensorImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getvalueUltrasonicSensor()
		 * @generated
		 */
		EClass VALUE_ULTRASONIC_SENSOR = eINSTANCE.getvalueUltrasonicSensor();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_ULTRASONIC_SENSOR__VALUE = eINSTANCE.getvalueUltrasonicSensor_Value();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.nameColorSensorImpl <em>name Color Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.nameColorSensorImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getnameColorSensor()
		 * @generated
		 */
		EClass NAME_COLOR_SENSOR = eINSTANCE.getnameColorSensor();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_COLOR_SENSOR__VALUE = eINSTANCE.getnameColorSensor_Value();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.colorColorSensorImpl <em>color Color Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.colorColorSensorImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getcolorColorSensor()
		 * @generated
		 */
		EClass COLOR_COLOR_SENSOR = eINSTANCE.getcolorColorSensor();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR_COLOR_SENSOR__VALUE = eINSTANCE.getcolorColorSensor_Value();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.nameGoToEnemyImpl <em>name Go To Enemy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.nameGoToEnemyImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getnameGoToEnemy()
		 * @generated
		 */
		EClass NAME_GO_TO_ENEMY = eINSTANCE.getnameGoToEnemy();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_GO_TO_ENEMY__VALUE = eINSTANCE.getnameGoToEnemy_Value();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.NoneElementImpl <em>None Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.NoneElementImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getNoneElement()
		 * @generated
		 */
		EClass NONE_ELEMENT = eINSTANCE.getNoneElement();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.BindingElementImpl <em>Binding Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.BindingElementImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getBindingElement()
		 * @generated
		 */
		EClass BINDING_ELEMENT = eINSTANCE.getBindingElement();

		/**
		 * The meta object literal for the '<em><b>None Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_ELEMENT__NONE_ELEMENT = eINSTANCE.getBindingElement_NoneElement();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.IntermediateElementImpl <em>Intermediate Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.IntermediateElementImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getIntermediateElement()
		 * @generated
		 */
		EClass INTERMEDIATE_ELEMENT = eINSTANCE.getIntermediateElement();

		/**
		 * The meta object literal for the '<em><b>Binding Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERMEDIATE_ELEMENT__BINDING_ELEMENT = eINSTANCE.getIntermediateElement_BindingElement();

		/**
		 * The meta object literal for the '<em><b>Metamodel Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERMEDIATE_ELEMENT__METAMODEL_ELEMENT = eINSTANCE.getIntermediateElement_MetamodelElement();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.MetamodelElementImpl <em>Metamodel Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.MetamodelElementImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getMetamodelElement()
		 * @generated
		 */
		EClass METAMODEL_ELEMENT = eINSTANCE.getMetamodelElement();

		/**
		 * The meta object literal for the '<em><b>Virtual Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METAMODEL_ELEMENT__VIRTUAL_ATTRIBUTE = eINSTANCE.getMetamodelElement_VirtualAttribute();

		/**
		 * The meta object literal for the '<em><b>Metamodel Element Feature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METAMODEL_ELEMENT__METAMODEL_ELEMENT_FEATURE = eINSTANCE.getMetamodelElement_MetamodelElementFeature();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METAMODEL_ELEMENT__NAME = eINSTANCE.getMetamodelElement_Name();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.MetamodelElementFeatureImpl <em>Metamodel Element Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.MetamodelElementFeatureImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getMetamodelElementFeature()
		 * @generated
		 */
		EClass METAMODEL_ELEMENT_FEATURE = eINSTANCE.getMetamodelElementFeature();

		/**
		 * The meta object literal for the '<em><b>Feature Class</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METAMODEL_ELEMENT_FEATURE__FEATURE_CLASS = eINSTANCE.getMetamodelElementFeature_FeatureClass();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METAMODEL_ELEMENT_FEATURE__NAME = eINSTANCE.getMetamodelElementFeature_Name();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.BindingAttributeImpl <em>Binding Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.BindingAttributeImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getBindingAttribute()
		 * @generated
		 */
		EClass BINDING_ATTRIBUTE = eINSTANCE.getBindingAttribute();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.impl.VirtualAttributeImpl <em>Virtual Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.impl.VirtualAttributeImpl
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getVirtualAttribute()
		 * @generated
		 */
		EClass VIRTUAL_ATTRIBUTE = eINSTANCE.getVirtualAttribute();

		/**
		 * The meta object literal for the '<em><b>To virtual Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIRTUAL_ATTRIBUTE__TO_VIRTUAL_ATTRIBUTE = eINSTANCE.getVirtualAttribute_To_virtualAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_ATTRIBUTE__NAME = eINSTANCE.getVirtualAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_ATTRIBUTE__EXPRESSION = eINSTANCE.getVirtualAttribute_Expression();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.Color <em>Color</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.Color
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getColor()
		 * @generated
		 */
		EEnum COLOR = eINSTANCE.getColor();

		/**
		 * The meta object literal for the '{@link mindstorms_bdsl.OperatorKind <em>Operator Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mindstorms_bdsl.OperatorKind
		 * @see mindstorms_bdsl.impl.Mindstorms_bdslPackageImpl#getOperatorKind()
		 * @generated
		 */
		EEnum OPERATOR_KIND = eINSTANCE.getOperatorKind();

	}

} //Mindstorms_bdslPackage
