/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gbind.simpleocl.impl;

import gbind.simpleocl.LocatedElement;
import gbind.simpleocl.SimpleoclPackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Located Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gbind.simpleocl.impl.LocatedElementImpl#getLine <em>Line</em>}</li>
 *   <li>{@link gbind.simpleocl.impl.LocatedElementImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link gbind.simpleocl.impl.LocatedElementImpl#getCharStart <em>Char Start</em>}</li>
 *   <li>{@link gbind.simpleocl.impl.LocatedElementImpl#getCharEnd <em>Char End</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class LocatedElementImpl extends EObjectImpl implements LocatedElement {
	/**
	 * The default value of the '{@link #getLine() <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected static final int LINE_EDEFAULT = -1;

	/**
	 * The default value of the '{@link #getColumn() <em>Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected static final int COLUMN_EDEFAULT = -1;

	/**
	 * The default value of the '{@link #getCharStart() <em>Char Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharStart()
	 * @generated
	 * @ordered
	 */
	protected static final int CHAR_START_EDEFAULT = -1;

	/**
	 * The default value of the '{@link #getCharEnd() <em>Char End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharEnd()
	 * @generated
	 * @ordered
	 */
	protected static final int CHAR_END_EDEFAULT = -1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocatedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleoclPackage.Literals.LOCATED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLine() {
		// TODO: implement this method to return the 'Line' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getColumn() {
		// TODO: implement this method to return the 'Column' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCharStart() {
		// TODO: implement this method to return the 'Char Start' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCharEnd() {
		// TODO: implement this method to return the 'Char End' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimpleoclPackage.LOCATED_ELEMENT__LINE:
				return getLine();
			case SimpleoclPackage.LOCATED_ELEMENT__COLUMN:
				return getColumn();
			case SimpleoclPackage.LOCATED_ELEMENT__CHAR_START:
				return getCharStart();
			case SimpleoclPackage.LOCATED_ELEMENT__CHAR_END:
				return getCharEnd();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SimpleoclPackage.LOCATED_ELEMENT__LINE:
				return getLine() != LINE_EDEFAULT;
			case SimpleoclPackage.LOCATED_ELEMENT__COLUMN:
				return getColumn() != COLUMN_EDEFAULT;
			case SimpleoclPackage.LOCATED_ELEMENT__CHAR_START:
				return getCharStart() != CHAR_START_EDEFAULT;
			case SimpleoclPackage.LOCATED_ELEMENT__CHAR_END:
				return getCharEnd() != CHAR_END_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //LocatedElementImpl
