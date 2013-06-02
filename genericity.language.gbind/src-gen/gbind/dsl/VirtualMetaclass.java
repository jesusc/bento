/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gbind.dsl;

import gbind.simpleocl.OclExpression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virtual Metaclass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gbind.dsl.VirtualMetaclass#getReferences <em>References</em>}</li>
 *   <li>{@link gbind.dsl.VirtualMetaclass#getInit <em>Init</em>}</li>
 * </ul>
 * </p>
 *
 * @see gbind.dsl.DslPackage#getVirtualMetaclass()
 * @model
 * @generated
 */
public interface VirtualMetaclass extends Metaclass {
	/**
	 * Returns the value of the '<em><b>References</b></em>' containment reference list.
	 * The list contents are of type {@link gbind.dsl.VirtualReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' containment reference list.
	 * @see gbind.dsl.DslPackage#getVirtualMetaclass_References()
	 * @model containment="true"
	 * @generated
	 */
	EList<VirtualReference> getReferences();

	/**
	 * Returns the value of the '<em><b>Init</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init</em>' containment reference.
	 * @see #setInit(OclExpression)
	 * @see gbind.dsl.DslPackage#getVirtualMetaclass_Init()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OclExpression getInit();

	/**
	 * Sets the value of the '{@link gbind.dsl.VirtualMetaclass#getInit <em>Init</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init</em>' containment reference.
	 * @see #getInit()
	 * @generated
	 */
	void setInit(OclExpression value);

} // VirtualMetaclass
