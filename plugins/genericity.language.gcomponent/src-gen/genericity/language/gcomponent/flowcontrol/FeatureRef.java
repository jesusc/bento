/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.language.gcomponent.flowcontrol;

import genericity.language.gcomponent.variants.Feature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link genericity.language.gcomponent.flowcontrol.FeatureRef#getFeature <em>Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see genericity.language.gcomponent.flowcontrol.FlowcontrolPackage#getFeatureRef()
 * @model
 * @generated
 */
public interface FeatureRef extends Expression, BooleanValue {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(Feature)
	 * @see genericity.language.gcomponent.flowcontrol.FlowcontrolPackage#getFeatureRef_Feature()
	 * @model required="true"
	 * @generated
	 */
	Feature getFeature();

	/**
	 * Sets the value of the '{@link genericity.language.gcomponent.flowcontrol.FeatureRef#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(Feature value);

} // FeatureRef
