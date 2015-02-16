/**
 */
package gbind.dsl;

import gbind.simpleocl.TupleExp;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virtual Tuple Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gbind.dsl.VirtualTupleExp#getTypeName <em>Type Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see gbind.dsl.DslPackage#getVirtualTupleExp()
 * @model
 * @generated
 */
public interface VirtualTupleExp extends TupleExp {
	/**
	 * Returns the value of the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Name</em>' attribute.
	 * @see #setTypeName(String)
	 * @see gbind.dsl.DslPackage#getVirtualTupleExp_TypeName()
	 * @model required="true"
	 * @generated
	 */
	String getTypeName();

	/**
	 * Sets the value of the '{@link gbind.dsl.VirtualTupleExp#getTypeName <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Name</em>' attribute.
	 * @see #getTypeName()
	 * @generated
	 */
	void setTypeName(String value);

} // VirtualTupleExp
