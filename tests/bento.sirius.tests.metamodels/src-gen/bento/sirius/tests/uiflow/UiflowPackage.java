/**
 */
package bento.sirius.tests.uiflow;

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
 * @see bento.sirius.tests.uiflow.UiflowFactory
 * @model kind="package"
 * @generated
 */
public interface UiflowPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "uiflow";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://bento/sirius/uiflow";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "uiflow";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UiflowPackage eINSTANCE = bento.sirius.tests.uiflow.impl.UiflowPackageImpl.init();

	/**
	 * The meta object id for the '{@link bento.sirius.tests.uiflow.impl.UIFlowImpl <em>UI Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.sirius.tests.uiflow.impl.UIFlowImpl
	 * @see bento.sirius.tests.uiflow.impl.UiflowPackageImpl#getUIFlow()
	 * @generated
	 */
	int UI_FLOW = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FLOW__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>UI Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FLOW_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>UI Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FLOW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bento.sirius.tests.uiflow.impl.FlowElementImpl <em>Flow Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.sirius.tests.uiflow.impl.FlowElementImpl
	 * @see bento.sirius.tests.uiflow.impl.UiflowPackageImpl#getFlowElement()
	 * @generated
	 */
	int FLOW_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT__NEXT = 1;

	/**
	 * The number of structural features of the '<em>Flow Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Flow Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bento.sirius.tests.uiflow.impl.FlowTransitionImpl <em>Flow Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.sirius.tests.uiflow.impl.FlowTransitionImpl
	 * @see bento.sirius.tests.uiflow.impl.UiflowPackageImpl#getFlowTransition()
	 * @generated
	 */
	int FLOW_TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_TRANSITION__ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Flow Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_TRANSITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Flow Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_TRANSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bento.sirius.tests.uiflow.impl.InitialImpl <em>Initial</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.sirius.tests.uiflow.impl.InitialImpl
	 * @see bento.sirius.tests.uiflow.impl.UiflowPackageImpl#getInitial()
	 * @generated
	 */
	int INITIAL = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL__NAME = FLOW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL__NEXT = FLOW_ELEMENT__NEXT;

	/**
	 * The number of structural features of the '<em>Initial</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_FEATURE_COUNT = FLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Initial</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_OPERATION_COUNT = FLOW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bento.sirius.tests.uiflow.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.sirius.tests.uiflow.impl.ActionImpl
	 * @see bento.sirius.tests.uiflow.impl.UiflowPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = FLOW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NEXT = FLOW_ELEMENT__NEXT;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = FLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = FLOW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bento.sirius.tests.uiflow.impl.ViewImpl <em>View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.sirius.tests.uiflow.impl.ViewImpl
	 * @see bento.sirius.tests.uiflow.impl.UiflowPackageImpl#getView()
	 * @generated
	 */
	int VIEW = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__NAME = FLOW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__NEXT = FLOW_ELEMENT__NEXT;

	/**
	 * The number of structural features of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE_COUNT = FLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_OPERATION_COUNT = FLOW_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link bento.sirius.tests.uiflow.UIFlow <em>UI Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Flow</em>'.
	 * @see bento.sirius.tests.uiflow.UIFlow
	 * @generated
	 */
	EClass getUIFlow();

	/**
	 * Returns the meta object for the containment reference list '{@link bento.sirius.tests.uiflow.UIFlow#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see bento.sirius.tests.uiflow.UIFlow#getElements()
	 * @see #getUIFlow()
	 * @generated
	 */
	EReference getUIFlow_Elements();

	/**
	 * Returns the meta object for class '{@link bento.sirius.tests.uiflow.FlowElement <em>Flow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Element</em>'.
	 * @see bento.sirius.tests.uiflow.FlowElement
	 * @generated
	 */
	EClass getFlowElement();

	/**
	 * Returns the meta object for the attribute '{@link bento.sirius.tests.uiflow.FlowElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bento.sirius.tests.uiflow.FlowElement#getName()
	 * @see #getFlowElement()
	 * @generated
	 */
	EAttribute getFlowElement_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link bento.sirius.tests.uiflow.FlowElement#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Next</em>'.
	 * @see bento.sirius.tests.uiflow.FlowElement#getNext()
	 * @see #getFlowElement()
	 * @generated
	 */
	EReference getFlowElement_Next();

	/**
	 * Returns the meta object for class '{@link bento.sirius.tests.uiflow.FlowTransition <em>Flow Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Transition</em>'.
	 * @see bento.sirius.tests.uiflow.FlowTransition
	 * @generated
	 */
	EClass getFlowTransition();

	/**
	 * Returns the meta object for the reference '{@link bento.sirius.tests.uiflow.FlowTransition#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see bento.sirius.tests.uiflow.FlowTransition#getElement()
	 * @see #getFlowTransition()
	 * @generated
	 */
	EReference getFlowTransition_Element();

	/**
	 * Returns the meta object for class '{@link bento.sirius.tests.uiflow.Initial <em>Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial</em>'.
	 * @see bento.sirius.tests.uiflow.Initial
	 * @generated
	 */
	EClass getInitial();

	/**
	 * Returns the meta object for class '{@link bento.sirius.tests.uiflow.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see bento.sirius.tests.uiflow.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for class '{@link bento.sirius.tests.uiflow.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View</em>'.
	 * @see bento.sirius.tests.uiflow.View
	 * @generated
	 */
	EClass getView();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UiflowFactory getUiflowFactory();

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
		 * The meta object literal for the '{@link bento.sirius.tests.uiflow.impl.UIFlowImpl <em>UI Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.sirius.tests.uiflow.impl.UIFlowImpl
		 * @see bento.sirius.tests.uiflow.impl.UiflowPackageImpl#getUIFlow()
		 * @generated
		 */
		EClass UI_FLOW = eINSTANCE.getUIFlow();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_FLOW__ELEMENTS = eINSTANCE.getUIFlow_Elements();

		/**
		 * The meta object literal for the '{@link bento.sirius.tests.uiflow.impl.FlowElementImpl <em>Flow Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.sirius.tests.uiflow.impl.FlowElementImpl
		 * @see bento.sirius.tests.uiflow.impl.UiflowPackageImpl#getFlowElement()
		 * @generated
		 */
		EClass FLOW_ELEMENT = eINSTANCE.getFlowElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_ELEMENT__NAME = eINSTANCE.getFlowElement_Name();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_ELEMENT__NEXT = eINSTANCE.getFlowElement_Next();

		/**
		 * The meta object literal for the '{@link bento.sirius.tests.uiflow.impl.FlowTransitionImpl <em>Flow Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.sirius.tests.uiflow.impl.FlowTransitionImpl
		 * @see bento.sirius.tests.uiflow.impl.UiflowPackageImpl#getFlowTransition()
		 * @generated
		 */
		EClass FLOW_TRANSITION = eINSTANCE.getFlowTransition();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_TRANSITION__ELEMENT = eINSTANCE.getFlowTransition_Element();

		/**
		 * The meta object literal for the '{@link bento.sirius.tests.uiflow.impl.InitialImpl <em>Initial</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.sirius.tests.uiflow.impl.InitialImpl
		 * @see bento.sirius.tests.uiflow.impl.UiflowPackageImpl#getInitial()
		 * @generated
		 */
		EClass INITIAL = eINSTANCE.getInitial();

		/**
		 * The meta object literal for the '{@link bento.sirius.tests.uiflow.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.sirius.tests.uiflow.impl.ActionImpl
		 * @see bento.sirius.tests.uiflow.impl.UiflowPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link bento.sirius.tests.uiflow.impl.ViewImpl <em>View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.sirius.tests.uiflow.impl.ViewImpl
		 * @see bento.sirius.tests.uiflow.impl.UiflowPackageImpl#getView()
		 * @generated
		 */
		EClass VIEW = eINSTANCE.getView();

	}

} //UiflowPackage
