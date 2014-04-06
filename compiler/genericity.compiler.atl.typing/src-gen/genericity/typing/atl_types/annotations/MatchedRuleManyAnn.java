/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.typing.atl_types.annotations;

import genericity.typing.atl_types.Metaclass;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Matched Rule Many Ann</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link genericity.typing.atl_types.annotations.MatchedRuleManyAnn#getInPatternTypes <em>In Pattern Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getMatchedRuleManyAnn()
 * @model
 * @generated
 */
public interface MatchedRuleManyAnn extends MatchedRuleAnn {
	/**
	 * Returns the value of the '<em><b>In Pattern Types</b></em>' reference list.
	 * The list contents are of type {@link genericity.typing.atl_types.Metaclass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Pattern Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Pattern Types</em>' reference list.
	 * @see genericity.typing.atl_types.annotations.AnnotationsPackage#getMatchedRuleManyAnn_InPatternTypes()
	 * @model lower="2"
	 * @generated
	 */
	EList<Metaclass> getInPatternTypes();

} // MatchedRuleManyAnn
