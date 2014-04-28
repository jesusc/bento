/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bento.analysis.atl_analysis.atl_error;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding Possibly Unresolved</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bento.analysis.atl_analysis.atl_error.BindingPossiblyUnresolved#getProblematicClasses <em>Problematic Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @see bento.analysis.atl_analysis.atl_error.AtlErrorsPackage#getBindingPossiblyUnresolved()
 * @model
 * @generated
 */
public interface BindingPossiblyUnresolved extends BindingProblem, BindingResolution {

	/**
	 * Returns the value of the '<em><b>Problematic Classes</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Problematic Classes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Problematic Classes</em>' reference list.
	 * @see bento.analysis.atl_analysis.atl_error.AtlErrorsPackage#getBindingPossiblyUnresolved_ProblematicClasses()
	 * @model required="true"
	 * @generated
	 */
	EList<EClass> getProblematicClasses();
} // BindingPossiblyUnresolved
