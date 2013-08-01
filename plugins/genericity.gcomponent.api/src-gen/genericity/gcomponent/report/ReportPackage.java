/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.gcomponent.report;

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
 * @see genericity.gcomponent.report.ReportFactory
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
	String eNS_URI = "http://genericity/language/gcomponent/report";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gcomponent_report";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReportPackage eINSTANCE = genericity.gcomponent.report.impl.ReportPackageImpl.init();

	/**
	 * The meta object id for the '{@link genericity.gcomponent.report.impl.ReportElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.gcomponent.report.impl.ReportElementImpl
	 * @see genericity.gcomponent.report.impl.ReportPackageImpl#getReportElement()
	 * @generated
	 */
	int REPORT_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_ELEMENT__MESSAGE = 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_ELEMENT__KIND = 1;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_ELEMENT__OBJECT = 2;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link genericity.gcomponent.report.ReportKind <em>Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericity.gcomponent.report.ReportKind
	 * @see genericity.gcomponent.report.impl.ReportPackageImpl#getReportKind()
	 * @generated
	 */
	int REPORT_KIND = 1;


	/**
	 * Returns the meta object for class '{@link genericity.gcomponent.report.ReportElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see genericity.gcomponent.report.ReportElement
	 * @generated
	 */
	EClass getReportElement();

	/**
	 * Returns the meta object for the attribute '{@link genericity.gcomponent.report.ReportElement#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see genericity.gcomponent.report.ReportElement#getMessage()
	 * @see #getReportElement()
	 * @generated
	 */
	EAttribute getReportElement_Message();

	/**
	 * Returns the meta object for the attribute '{@link genericity.gcomponent.report.ReportElement#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see genericity.gcomponent.report.ReportElement#getKind()
	 * @see #getReportElement()
	 * @generated
	 */
	EAttribute getReportElement_Kind();

	/**
	 * Returns the meta object for the reference '{@link genericity.gcomponent.report.ReportElement#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Object</em>'.
	 * @see genericity.gcomponent.report.ReportElement#getObject()
	 * @see #getReportElement()
	 * @generated
	 */
	EReference getReportElement_Object();

	/**
	 * Returns the meta object for enum '{@link genericity.gcomponent.report.ReportKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Kind</em>'.
	 * @see genericity.gcomponent.report.ReportKind
	 * @generated
	 */
	EEnum getReportKind();

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
		 * The meta object literal for the '{@link genericity.gcomponent.report.impl.ReportElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.gcomponent.report.impl.ReportElementImpl
		 * @see genericity.gcomponent.report.impl.ReportPackageImpl#getReportElement()
		 * @generated
		 */
		EClass REPORT_ELEMENT = eINSTANCE.getReportElement();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_ELEMENT__MESSAGE = eINSTANCE.getReportElement_Message();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_ELEMENT__KIND = eINSTANCE.getReportElement_Kind();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPORT_ELEMENT__OBJECT = eINSTANCE.getReportElement_Object();

		/**
		 * The meta object literal for the '{@link genericity.gcomponent.report.ReportKind <em>Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericity.gcomponent.report.ReportKind
		 * @see genericity.gcomponent.report.impl.ReportPackageImpl#getReportKind()
		 * @generated
		 */
		EEnum REPORT_KIND = eINSTANCE.getReportKind();

	}

} //ReportPackage
