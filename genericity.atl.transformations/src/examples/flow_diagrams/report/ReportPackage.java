/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package examples.flow_diagrams.report;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see examples.flow_diagrams.report.ReportFactory
 * @model kind="package"
 * @generated
 */
public interface ReportPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "report";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://petrinet.report";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "report";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReportPackage eINSTANCE = examples.flow_diagrams.report.impl.ReportPackageImpl.init();

	/**
	 * The meta object id for the '{@link examples.flow_diagrams.report.impl.ReportImpl <em>Report</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see examples.flow_diagrams.report.impl.ReportImpl
	 * @see examples.flow_diagrams.report.impl.ReportPackageImpl#getReport()
	 * @generated
	 */
	int REPORT = 0;

	/**
	 * The feature id for the '<em><b>Errors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT__ERRORS = 0;

	/**
	 * The number of structural features of the '<em>Report</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link examples.flow_diagrams.report.impl.ProblemImpl <em>Problem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see examples.flow_diagrams.report.impl.ProblemImpl
	 * @see examples.flow_diagrams.report.impl.ReportPackageImpl#getProblem()
	 * @generated
	 */
	int PROBLEM = 1;

	/**
	 * The feature id for the '<em><b>Problem Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM__PROBLEM_KIND = 0;

	/**
	 * The number of structural features of the '<em>Problem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link examples.flow_diagrams.report.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see examples.flow_diagrams.report.impl.StateImpl
	 * @see examples.flow_diagrams.report.impl.ReportPackageImpl#getState()
	 * @generated
	 */
	int STATE = 2;

	/**
	 * The feature id for the '<em><b>Places</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__PLACES = 0;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link examples.flow_diagrams.report.impl.PlaceImpl <em>Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see examples.flow_diagrams.report.impl.PlaceImpl
	 * @see examples.flow_diagrams.report.impl.ReportPackageImpl#getPlace()
	 * @generated
	 */
	int PLACE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link examples.flow_diagrams.report.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see examples.flow_diagrams.report.impl.TransitionImpl
	 * @see examples.flow_diagrams.report.impl.ReportPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link examples.flow_diagrams.report.impl.NoOptionToCompleteImpl <em>No Option To Complete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see examples.flow_diagrams.report.impl.NoOptionToCompleteImpl
	 * @see examples.flow_diagrams.report.impl.ReportPackageImpl#getNoOptionToComplete()
	 * @generated
	 */
	int NO_OPTION_TO_COMPLETE = 5;

	/**
	 * The feature id for the '<em><b>Problem Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_OPTION_TO_COMPLETE__PROBLEM_KIND = PROBLEM__PROBLEM_KIND;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_OPTION_TO_COMPLETE__STATES = PROBLEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>No Option To Complete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_OPTION_TO_COMPLETE_FEATURE_COUNT = PROBLEM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link examples.flow_diagrams.report.impl.NoProperCompletionImpl <em>No Proper Completion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see examples.flow_diagrams.report.impl.NoProperCompletionImpl
	 * @see examples.flow_diagrams.report.impl.ReportPackageImpl#getNoProperCompletion()
	 * @generated
	 */
	int NO_PROPER_COMPLETION = 6;

	/**
	 * The feature id for the '<em><b>Problem Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_PROPER_COMPLETION__PROBLEM_KIND = PROBLEM__PROBLEM_KIND;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_PROPER_COMPLETION__STATES = PROBLEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>No Proper Completion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_PROPER_COMPLETION_FEATURE_COUNT = PROBLEM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link examples.flow_diagrams.report.impl.HasNeedlessElementsImpl <em>Has Needless Elements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see examples.flow_diagrams.report.impl.HasNeedlessElementsImpl
	 * @see examples.flow_diagrams.report.impl.ReportPackageImpl#getHasNeedlessElements()
	 * @generated
	 */
	int HAS_NEEDLESS_ELEMENTS = 7;

	/**
	 * The feature id for the '<em><b>Problem Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_NEEDLESS_ELEMENTS__PROBLEM_KIND = PROBLEM__PROBLEM_KIND;

	/**
	 * The feature id for the '<em><b>Needless Places</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_NEEDLESS_ELEMENTS__NEEDLESS_PLACES = PROBLEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Needless Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_NEEDLESS_ELEMENTS__NEEDLESS_TRANSITIONS = PROBLEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Has Needless Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_NEEDLESS_ELEMENTS_FEATURE_COUNT = PROBLEM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link examples.flow_diagrams.report.ProblemKind <em>Problem Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see examples.flow_diagrams.report.ProblemKind
	 * @see examples.flow_diagrams.report.impl.ReportPackageImpl#getProblemKind()
	 * @generated
	 */
	int PROBLEM_KIND = 8;


	/**
	 * Returns the meta object for class '{@link examples.flow_diagrams.report.Report <em>Report</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Report</em>'.
	 * @see examples.flow_diagrams.report.Report
	 * @generated
	 */
	EClass getReport();

	/**
	 * Returns the meta object for the containment reference list '{@link examples.flow_diagrams.report.Report#getErrors <em>Errors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Errors</em>'.
	 * @see examples.flow_diagrams.report.Report#getErrors()
	 * @see #getReport()
	 * @generated
	 */
	EReference getReport_Errors();

	/**
	 * Returns the meta object for class '{@link examples.flow_diagrams.report.Problem <em>Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Problem</em>'.
	 * @see examples.flow_diagrams.report.Problem
	 * @generated
	 */
	EClass getProblem();

	/**
	 * Returns the meta object for the attribute '{@link examples.flow_diagrams.report.Problem#getProblemKind <em>Problem Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Problem Kind</em>'.
	 * @see examples.flow_diagrams.report.Problem#getProblemKind()
	 * @see #getProblem()
	 * @generated
	 */
	EAttribute getProblem_ProblemKind();

	/**
	 * Returns the meta object for class '{@link examples.flow_diagrams.report.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see examples.flow_diagrams.report.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the containment reference list '{@link examples.flow_diagrams.report.State#getPlaces <em>Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Places</em>'.
	 * @see examples.flow_diagrams.report.State#getPlaces()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Places();

	/**
	 * Returns the meta object for class '{@link examples.flow_diagrams.report.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place</em>'.
	 * @see examples.flow_diagrams.report.Place
	 * @generated
	 */
	EClass getPlace();

	/**
	 * Returns the meta object for the attribute '{@link examples.flow_diagrams.report.Place#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see examples.flow_diagrams.report.Place#getName()
	 * @see #getPlace()
	 * @generated
	 */
	EAttribute getPlace_Name();

	/**
	 * Returns the meta object for class '{@link examples.flow_diagrams.report.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see examples.flow_diagrams.report.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the attribute '{@link examples.flow_diagrams.report.Transition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see examples.flow_diagrams.report.Transition#getName()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Name();

	/**
	 * Returns the meta object for class '{@link examples.flow_diagrams.report.NoOptionToComplete <em>No Option To Complete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>No Option To Complete</em>'.
	 * @see examples.flow_diagrams.report.NoOptionToComplete
	 * @generated
	 */
	EClass getNoOptionToComplete();

	/**
	 * Returns the meta object for the containment reference list '{@link examples.flow_diagrams.report.NoOptionToComplete#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see examples.flow_diagrams.report.NoOptionToComplete#getStates()
	 * @see #getNoOptionToComplete()
	 * @generated
	 */
	EReference getNoOptionToComplete_States();

	/**
	 * Returns the meta object for class '{@link examples.flow_diagrams.report.NoProperCompletion <em>No Proper Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>No Proper Completion</em>'.
	 * @see examples.flow_diagrams.report.NoProperCompletion
	 * @generated
	 */
	EClass getNoProperCompletion();

	/**
	 * Returns the meta object for the containment reference list '{@link examples.flow_diagrams.report.NoProperCompletion#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see examples.flow_diagrams.report.NoProperCompletion#getStates()
	 * @see #getNoProperCompletion()
	 * @generated
	 */
	EReference getNoProperCompletion_States();

	/**
	 * Returns the meta object for class '{@link examples.flow_diagrams.report.HasNeedlessElements <em>Has Needless Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Has Needless Elements</em>'.
	 * @see examples.flow_diagrams.report.HasNeedlessElements
	 * @generated
	 */
	EClass getHasNeedlessElements();

	/**
	 * Returns the meta object for the containment reference list '{@link examples.flow_diagrams.report.HasNeedlessElements#getNeedlessPlaces <em>Needless Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Needless Places</em>'.
	 * @see examples.flow_diagrams.report.HasNeedlessElements#getNeedlessPlaces()
	 * @see #getHasNeedlessElements()
	 * @generated
	 */
	EReference getHasNeedlessElements_NeedlessPlaces();

	/**
	 * Returns the meta object for the containment reference list '{@link examples.flow_diagrams.report.HasNeedlessElements#getNeedlessTransitions <em>Needless Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Needless Transitions</em>'.
	 * @see examples.flow_diagrams.report.HasNeedlessElements#getNeedlessTransitions()
	 * @see #getHasNeedlessElements()
	 * @generated
	 */
	EReference getHasNeedlessElements_NeedlessTransitions();

	/**
	 * Returns the meta object for enum '{@link examples.flow_diagrams.report.ProblemKind <em>Problem Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Problem Kind</em>'.
	 * @see examples.flow_diagrams.report.ProblemKind
	 * @generated
	 */
	EEnum getProblemKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ReportFactory getReportFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link examples.flow_diagrams.report.impl.ReportImpl <em>Report</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see examples.flow_diagrams.report.impl.ReportImpl
		 * @see examples.flow_diagrams.report.impl.ReportPackageImpl#getReport()
		 * @generated
		 */
		EClass REPORT = eINSTANCE.getReport();

		/**
		 * The meta object literal for the '<em><b>Errors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPORT__ERRORS = eINSTANCE.getReport_Errors();

		/**
		 * The meta object literal for the '{@link examples.flow_diagrams.report.impl.ProblemImpl <em>Problem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see examples.flow_diagrams.report.impl.ProblemImpl
		 * @see examples.flow_diagrams.report.impl.ReportPackageImpl#getProblem()
		 * @generated
		 */
		EClass PROBLEM = eINSTANCE.getProblem();

		/**
		 * The meta object literal for the '<em><b>Problem Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROBLEM__PROBLEM_KIND = eINSTANCE.getProblem_ProblemKind();

		/**
		 * The meta object literal for the '{@link examples.flow_diagrams.report.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see examples.flow_diagrams.report.impl.StateImpl
		 * @see examples.flow_diagrams.report.impl.ReportPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Places</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__PLACES = eINSTANCE.getState_Places();

		/**
		 * The meta object literal for the '{@link examples.flow_diagrams.report.impl.PlaceImpl <em>Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see examples.flow_diagrams.report.impl.PlaceImpl
		 * @see examples.flow_diagrams.report.impl.ReportPackageImpl#getPlace()
		 * @generated
		 */
		EClass PLACE = eINSTANCE.getPlace();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE__NAME = eINSTANCE.getPlace_Name();

		/**
		 * The meta object literal for the '{@link examples.flow_diagrams.report.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see examples.flow_diagrams.report.impl.TransitionImpl
		 * @see examples.flow_diagrams.report.impl.ReportPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__NAME = eINSTANCE.getTransition_Name();

		/**
		 * The meta object literal for the '{@link examples.flow_diagrams.report.impl.NoOptionToCompleteImpl <em>No Option To Complete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see examples.flow_diagrams.report.impl.NoOptionToCompleteImpl
		 * @see examples.flow_diagrams.report.impl.ReportPackageImpl#getNoOptionToComplete()
		 * @generated
		 */
		EClass NO_OPTION_TO_COMPLETE = eINSTANCE.getNoOptionToComplete();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NO_OPTION_TO_COMPLETE__STATES = eINSTANCE.getNoOptionToComplete_States();

		/**
		 * The meta object literal for the '{@link examples.flow_diagrams.report.impl.NoProperCompletionImpl <em>No Proper Completion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see examples.flow_diagrams.report.impl.NoProperCompletionImpl
		 * @see examples.flow_diagrams.report.impl.ReportPackageImpl#getNoProperCompletion()
		 * @generated
		 */
		EClass NO_PROPER_COMPLETION = eINSTANCE.getNoProperCompletion();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NO_PROPER_COMPLETION__STATES = eINSTANCE.getNoProperCompletion_States();

		/**
		 * The meta object literal for the '{@link examples.flow_diagrams.report.impl.HasNeedlessElementsImpl <em>Has Needless Elements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see examples.flow_diagrams.report.impl.HasNeedlessElementsImpl
		 * @see examples.flow_diagrams.report.impl.ReportPackageImpl#getHasNeedlessElements()
		 * @generated
		 */
		EClass HAS_NEEDLESS_ELEMENTS = eINSTANCE.getHasNeedlessElements();

		/**
		 * The meta object literal for the '<em><b>Needless Places</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAS_NEEDLESS_ELEMENTS__NEEDLESS_PLACES = eINSTANCE.getHasNeedlessElements_NeedlessPlaces();

		/**
		 * The meta object literal for the '<em><b>Needless Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAS_NEEDLESS_ELEMENTS__NEEDLESS_TRANSITIONS = eINSTANCE.getHasNeedlessElements_NeedlessTransitions();

		/**
		 * The meta object literal for the '{@link examples.flow_diagrams.report.ProblemKind <em>Problem Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see examples.flow_diagrams.report.ProblemKind
		 * @see examples.flow_diagrams.report.impl.ReportPackageImpl#getProblemKind()
		 * @generated
		 */
		EEnum PROBLEM_KIND = eINSTANCE.getProblemKind();

	}

} //ReportPackage
