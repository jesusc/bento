/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.plcopen.xml.tc60201;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.plcopen.xml.tc60201.ProjectType#getFileHeader <em>File Header</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.ProjectType#getContentHeader <em>Content Header</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.ProjectType#getTypes <em>Types</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.ProjectType#getInstances <em>Instances</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.ProjectType#getAddData <em>Add Data</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.ProjectType#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.plcopen.xml.tc60201.Tc60201Package#getProjectType()
 * @model extendedMetaData="name='project_._type' kind='elementOnly'"
 * @generated
 */
public interface ProjectType extends EObject {
	/**
	 * Returns the value of the '<em><b>File Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Header</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Header</em>' containment reference.
	 * @see #setFileHeader(FileHeaderType)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getProjectType_FileHeader()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='fileHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	FileHeaderType getFileHeader();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.ProjectType#getFileHeader <em>File Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Header</em>' containment reference.
	 * @see #getFileHeader()
	 * @generated
	 */
	void setFileHeader(FileHeaderType value);

	/**
	 * Returns the value of the '<em><b>Content Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Header</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Header</em>' containment reference.
	 * @see #setContentHeader(ContentHeaderType)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getProjectType_ContentHeader()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='contentHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	ContentHeaderType getContentHeader();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.ProjectType#getContentHeader <em>Content Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Header</em>' containment reference.
	 * @see #getContentHeader()
	 * @generated
	 */
	void setContentHeader(ContentHeaderType value);

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference.
	 * @see #setTypes(TypesType)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getProjectType_Types()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='types' namespace='##targetNamespace'"
	 * @generated
	 */
	TypesType getTypes();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.ProjectType#getTypes <em>Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Types</em>' containment reference.
	 * @see #getTypes()
	 * @generated
	 */
	void setTypes(TypesType value);

	/**
	 * Returns the value of the '<em><b>Instances</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instances</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' containment reference.
	 * @see #setInstances(InstancesType)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getProjectType_Instances()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='instances' namespace='##targetNamespace'"
	 * @generated
	 */
	InstancesType getInstances();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.ProjectType#getInstances <em>Instances</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instances</em>' containment reference.
	 * @see #getInstances()
	 * @generated
	 */
	void setInstances(InstancesType value);

	/**
	 * Returns the value of the '<em><b>Add Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Add Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Data</em>' containment reference.
	 * @see #setAddData(AddData)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getProjectType_AddData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='addData' namespace='##targetNamespace'"
	 * @generated
	 */
	AddData getAddData();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.ProjectType#getAddData <em>Add Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add Data</em>' containment reference.
	 * @see #getAddData()
	 * @generated
	 */
	void setAddData(AddData value);

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional userspecific information to the element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference.
	 * @see #setDocumentation(FormattedText)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getProjectType_Documentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='documentation' namespace='##targetNamespace'"
	 * @generated
	 */
	FormattedText getDocumentation();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.ProjectType#getDocumentation <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' containment reference.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(FormattedText value);

} // ProjectType
