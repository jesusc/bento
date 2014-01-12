/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bento.componetization.reveng;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atl Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bento.componetization.reveng.AtlTransformation#getMetamodels <em>Metamodels</em>}</li>
 * </ul>
 * </p>
 *
 * @see bento.componetization.reveng.RevengPackage#getAtlTransformation()
 * @model
 * @generated
 */
public interface AtlTransformation extends Transformation {

	/**
	 * Returns the value of the '<em><b>Metamodels</b></em>' containment reference list.
	 * The list contents are of type {@link bento.componetization.reveng.Metamodel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metamodels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metamodels</em>' containment reference list.
	 * @see bento.componetization.reveng.RevengPackage#getAtlTransformation_Metamodels()
	 * @model containment="true"
	 * @generated
	 */
	EList<Metamodel> getMetamodels();
} // AtlTransformation
