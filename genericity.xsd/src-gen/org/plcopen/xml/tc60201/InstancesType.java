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
 * A representation of the model object '<em><b>Instances Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.plcopen.xml.tc60201.InstancesType#getConfigurations <em>Configurations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.plcopen.xml.tc60201.Tc60201Package#getInstancesType()
 * @model extendedMetaData="name='instances_._type' kind='elementOnly'"
 * @generated
 */
public interface InstancesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Configurations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configurations</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configurations</em>' containment reference.
	 * @see #setConfigurations(ConfigurationsType)
	 * @see org.plcopen.xml.tc60201.Tc60201Package#getInstancesType_Configurations()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='configurations' namespace='##targetNamespace'"
	 * @generated
	 */
	ConfigurationsType getConfigurations();

	/**
	 * Sets the value of the '{@link org.plcopen.xml.tc60201.InstancesType#getConfigurations <em>Configurations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configurations</em>' containment reference.
	 * @see #getConfigurations()
	 * @generated
	 */
	void setConfigurations(ConfigurationsType value);

} // InstancesType
