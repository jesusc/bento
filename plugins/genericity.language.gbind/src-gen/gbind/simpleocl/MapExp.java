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
 * A representation of the model object '<em><b>Map Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gbind.simpleocl.MapExp#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see gbind.simpleocl.SimpleoclPackage#getMapExp()
 * @model
 * @generated
 */
public interface MapExp extends OclExpression {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link gbind.simpleocl.MapElement}.
	 * It is bidirectional and its opposite is '{@link gbind.simpleocl.MapElement#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see gbind.simpleocl.SimpleoclPackage#getMapExp_Elements()
	 * @see gbind.simpleocl.MapElement#getMap
	 * @model opposite="map" containment="true"
	 * @generated
	 */
	EList<MapElement> getElements();

} // MapExp
