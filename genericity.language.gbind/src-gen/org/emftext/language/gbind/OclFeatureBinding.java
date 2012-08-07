/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.emftext.language.gbind;

import be.ac.vub.simpleocl.OclExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ocl Feature Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftext.language.gbind.OclFeatureBinding#getConcrete <em>Concrete</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftext.language.gbind.GbindPackage#getOclFeatureBinding()
 * @model
 * @generated
 */
public interface OclFeatureBinding extends BaseFeatureBinding {
	/**
	 * Returns the value of the '<em><b>Concrete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concrete</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concrete</em>' containment reference.
	 * @see #setConcrete(OclExpression)
	 * @see org.emftext.language.gbind.GbindPackage#getOclFeatureBinding_Concrete()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OclExpression getConcrete();

	/**
	 * Sets the value of the '{@link org.emftext.language.gbind.OclFeatureBinding#getConcrete <em>Concrete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concrete</em>' containment reference.
	 * @see #getConcrete()
	 * @generated
	 */
	void setConcrete(OclExpression value);

} // OclFeatureBinding
