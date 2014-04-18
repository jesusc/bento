/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.typing.atl_types.analysis.impl;

import genericity.typing.atl_types.analysis.AnalysisPackage;
import genericity.typing.atl_types.analysis.NavigationBasicBlock;

import genericity.typing.atl_types.annotations.ExpressionAnnotation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Navigation Basic Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link genericity.typing.atl_types.analysis.impl.NavigationBasicBlockImpl#getSubexprStart <em>Subexpr Start</em>}</li>
 *   <li>{@link genericity.typing.atl_types.analysis.impl.NavigationBasicBlockImpl#getSubexprEnd <em>Subexpr End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NavigationBasicBlockImpl extends BasicBlockImpl implements NavigationBasicBlock {
	/**
	 * The cached value of the '{@link #getSubexprStart() <em>Subexpr Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubexprStart()
	 * @generated
	 * @ordered
	 */
	protected ExpressionAnnotation subexprStart;

	/**
	 * The cached value of the '{@link #getSubexprEnd() <em>Subexpr End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubexprEnd()
	 * @generated
	 * @ordered
	 */
	protected ExpressionAnnotation subexprEnd;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NavigationBasicBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysisPackage.Literals.NAVIGATION_BASIC_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionAnnotation getSubexprStart() {
		if (subexprStart != null && subexprStart.eIsProxy()) {
			InternalEObject oldSubexprStart = (InternalEObject)subexprStart;
			subexprStart = (ExpressionAnnotation)eResolveProxy(oldSubexprStart);
			if (subexprStart != oldSubexprStart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnalysisPackage.NAVIGATION_BASIC_BLOCK__SUBEXPR_START, oldSubexprStart, subexprStart));
			}
		}
		return subexprStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionAnnotation basicGetSubexprStart() {
		return subexprStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubexprStart(ExpressionAnnotation newSubexprStart) {
		ExpressionAnnotation oldSubexprStart = subexprStart;
		subexprStart = newSubexprStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.NAVIGATION_BASIC_BLOCK__SUBEXPR_START, oldSubexprStart, subexprStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionAnnotation getSubexprEnd() {
		if (subexprEnd != null && subexprEnd.eIsProxy()) {
			InternalEObject oldSubexprEnd = (InternalEObject)subexprEnd;
			subexprEnd = (ExpressionAnnotation)eResolveProxy(oldSubexprEnd);
			if (subexprEnd != oldSubexprEnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnalysisPackage.NAVIGATION_BASIC_BLOCK__SUBEXPR_END, oldSubexprEnd, subexprEnd));
			}
		}
		return subexprEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionAnnotation basicGetSubexprEnd() {
		return subexprEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubexprEnd(ExpressionAnnotation newSubexprEnd) {
		ExpressionAnnotation oldSubexprEnd = subexprEnd;
		subexprEnd = newSubexprEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.NAVIGATION_BASIC_BLOCK__SUBEXPR_END, oldSubexprEnd, subexprEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AnalysisPackage.NAVIGATION_BASIC_BLOCK__SUBEXPR_START:
				if (resolve) return getSubexprStart();
				return basicGetSubexprStart();
			case AnalysisPackage.NAVIGATION_BASIC_BLOCK__SUBEXPR_END:
				if (resolve) return getSubexprEnd();
				return basicGetSubexprEnd();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AnalysisPackage.NAVIGATION_BASIC_BLOCK__SUBEXPR_START:
				setSubexprStart((ExpressionAnnotation)newValue);
				return;
			case AnalysisPackage.NAVIGATION_BASIC_BLOCK__SUBEXPR_END:
				setSubexprEnd((ExpressionAnnotation)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AnalysisPackage.NAVIGATION_BASIC_BLOCK__SUBEXPR_START:
				setSubexprStart((ExpressionAnnotation)null);
				return;
			case AnalysisPackage.NAVIGATION_BASIC_BLOCK__SUBEXPR_END:
				setSubexprEnd((ExpressionAnnotation)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AnalysisPackage.NAVIGATION_BASIC_BLOCK__SUBEXPR_START:
				return subexprStart != null;
			case AnalysisPackage.NAVIGATION_BASIC_BLOCK__SUBEXPR_END:
				return subexprEnd != null;
		}
		return super.eIsSet(featureID);
	}

} //NavigationBasicBlockImpl
