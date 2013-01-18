/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.gcomponent.report;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link genericity.gcomponent.report.ReportElement#getMessage <em>Message</em>}</li>
 *   <li>{@link genericity.gcomponent.report.ReportElement#getKind <em>Kind</em>}</li>
 *   <li>{@link genericity.gcomponent.report.ReportElement#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see genericity.gcomponent.report.ReportPackage#getReportElement()
 * @model
 * @generated
 */
public interface ReportElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see genericity.gcomponent.report.ReportPackage#getReportElement_Message()
	 * @model required="true"
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link genericity.gcomponent.report.ReportElement#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link genericity.gcomponent.report.ReportKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see genericity.gcomponent.report.ReportKind
	 * @see #setKind(ReportKind)
	 * @see genericity.gcomponent.report.ReportPackage#getReportElement_Kind()
	 * @model required="true"
	 * @generated
	 */
	ReportKind getKind();

	/**
	 * Sets the value of the '{@link genericity.gcomponent.report.ReportElement#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see genericity.gcomponent.report.ReportKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ReportKind value);

	/**
	 * Returns the value of the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' reference.
	 * @see #setObject(EObject)
	 * @see genericity.gcomponent.report.ReportPackage#getReportElement_Object()
	 * @model required="true"
	 * @generated
	 */
	EObject getObject();

	/**
	 * Sets the value of the '{@link genericity.gcomponent.report.ReportElement#getObject <em>Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(EObject value);

} // ReportElement
