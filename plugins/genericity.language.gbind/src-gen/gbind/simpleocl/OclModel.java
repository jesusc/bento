/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gbind.simpleocl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ocl Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gbind.simpleocl.OclModel#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see gbind.simpleocl.SimpleoclPackage#getOclModel()
 * @model abstract="true"
 * @generated
 */
public interface OclModel extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' reference list.
	 * The list contents are of type {@link gbind.simpleocl.OclModelElement}.
	 * It is bidirectional and its opposite is '{@link gbind.simpleocl.OclModelElement#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' reference list.
	 * @see gbind.simpleocl.SimpleoclPackage#getOclModel_Elements()
	 * @see gbind.simpleocl.OclModelElement#getModel
	 * @model opposite="model" ordered="false"
	 * @generated
	 */
	EList<OclModelElement> getElements();

} // OclModel
