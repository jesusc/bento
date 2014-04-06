/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.typing.atl_types.annotations;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Ann</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link genericity.typing.atl_types.annotations.RuleAnn#getRule <em>Rule</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.RuleAnn#getOutputPatterns <em>Output Patterns</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.RuleAnn#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getRuleAnn()
 * @model abstract="true"
 * @generated
 */
public interface RuleAnn extends AtlAnnotation {
	/**
	 * Returns the value of the '<em><b>Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' reference.
	 * @see #setRule(EObject)
	 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getRuleAnn_Rule()
	 * @model
	 * @generated
	 */
	EObject getRule();

	/**
	 * Sets the value of the '{@link genericity.typing.atl_types.annotations.RuleAnn#getRule <em>Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' reference.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(EObject value);

	/**
	 * Returns the value of the '<em><b>Output Patterns</b></em>' containment reference list.
	 * The list contents are of type {@link genericity.typing.atl_types.annotations.OutputPatternAnn}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Patterns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Patterns</em>' containment reference list.
	 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getRuleAnn_OutputPatterns()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<OutputPatternAnn> getOutputPatterns();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getRuleAnn_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link genericity.typing.atl_types.annotations.RuleAnn#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // RuleAnn
