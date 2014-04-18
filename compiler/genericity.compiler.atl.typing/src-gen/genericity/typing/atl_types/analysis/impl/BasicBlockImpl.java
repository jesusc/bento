/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.typing.atl_types.analysis.impl;

import genericity.typing.atl_types.analysis.AnalysisPackage;
import genericity.typing.atl_types.analysis.BasicBlock;

import genericity.typing.atl_types.annotations.ExpressionAnnotation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basic Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link genericity.typing.atl_types.analysis.impl.BasicBlockImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link genericity.typing.atl_types.analysis.impl.BasicBlockImpl#getCfNext <em>Cf Next</em>}</li>
 *   <li>{@link genericity.typing.atl_types.analysis.impl.BasicBlockImpl#getCfPrev <em>Cf Prev</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BasicBlockImpl extends EObjectImpl implements BasicBlock {
	/**
	 * The cached value of the '{@link #getExpr() <em>Expr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpr()
	 * @generated
	 * @ordered
	 */
	protected ExpressionAnnotation expr;

	/**
	 * The cached value of the '{@link #getCfNext() <em>Cf Next</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCfNext()
	 * @generated
	 * @ordered
	 */
	protected EList<BasicBlock> cfNext;

	/**
	 * The cached value of the '{@link #getCfPrev() <em>Cf Prev</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCfPrev()
	 * @generated
	 * @ordered
	 */
	protected BasicBlock cfPrev;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasicBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysisPackage.Literals.BASIC_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionAnnotation getExpr() {
		if (expr != null && expr.eIsProxy()) {
			InternalEObject oldExpr = (InternalEObject)expr;
			expr = (ExpressionAnnotation)eResolveProxy(oldExpr);
			if (expr != oldExpr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnalysisPackage.BASIC_BLOCK__EXPR, oldExpr, expr));
			}
		}
		return expr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionAnnotation basicGetExpr() {
		return expr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpr(ExpressionAnnotation newExpr) {
		ExpressionAnnotation oldExpr = expr;
		expr = newExpr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.BASIC_BLOCK__EXPR, oldExpr, expr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BasicBlock> getCfNext() {
		if (cfNext == null) {
			cfNext = new EObjectWithInverseResolvingEList<BasicBlock>(BasicBlock.class, this, AnalysisPackage.BASIC_BLOCK__CF_NEXT, AnalysisPackage.BASIC_BLOCK__CF_PREV);
		}
		return cfNext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicBlock getCfPrev() {
		if (cfPrev != null && cfPrev.eIsProxy()) {
			InternalEObject oldCfPrev = (InternalEObject)cfPrev;
			cfPrev = (BasicBlock)eResolveProxy(oldCfPrev);
			if (cfPrev != oldCfPrev) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnalysisPackage.BASIC_BLOCK__CF_PREV, oldCfPrev, cfPrev));
			}
		}
		return cfPrev;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicBlock basicGetCfPrev() {
		return cfPrev;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCfPrev(BasicBlock newCfPrev, NotificationChain msgs) {
		BasicBlock oldCfPrev = cfPrev;
		cfPrev = newCfPrev;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnalysisPackage.BASIC_BLOCK__CF_PREV, oldCfPrev, newCfPrev);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCfPrev(BasicBlock newCfPrev) {
		if (newCfPrev != cfPrev) {
			NotificationChain msgs = null;
			if (cfPrev != null)
				msgs = ((InternalEObject)cfPrev).eInverseRemove(this, AnalysisPackage.BASIC_BLOCK__CF_NEXT, BasicBlock.class, msgs);
			if (newCfPrev != null)
				msgs = ((InternalEObject)newCfPrev).eInverseAdd(this, AnalysisPackage.BASIC_BLOCK__CF_NEXT, BasicBlock.class, msgs);
			msgs = basicSetCfPrev(newCfPrev, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysisPackage.BASIC_BLOCK__CF_PREV, newCfPrev, newCfPrev));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnalysisPackage.BASIC_BLOCK__CF_NEXT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCfNext()).basicAdd(otherEnd, msgs);
			case AnalysisPackage.BASIC_BLOCK__CF_PREV:
				if (cfPrev != null)
					msgs = ((InternalEObject)cfPrev).eInverseRemove(this, AnalysisPackage.BASIC_BLOCK__CF_NEXT, BasicBlock.class, msgs);
				return basicSetCfPrev((BasicBlock)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnalysisPackage.BASIC_BLOCK__CF_NEXT:
				return ((InternalEList<?>)getCfNext()).basicRemove(otherEnd, msgs);
			case AnalysisPackage.BASIC_BLOCK__CF_PREV:
				return basicSetCfPrev(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AnalysisPackage.BASIC_BLOCK__EXPR:
				if (resolve) return getExpr();
				return basicGetExpr();
			case AnalysisPackage.BASIC_BLOCK__CF_NEXT:
				return getCfNext();
			case AnalysisPackage.BASIC_BLOCK__CF_PREV:
				if (resolve) return getCfPrev();
				return basicGetCfPrev();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AnalysisPackage.BASIC_BLOCK__EXPR:
				setExpr((ExpressionAnnotation)newValue);
				return;
			case AnalysisPackage.BASIC_BLOCK__CF_NEXT:
				getCfNext().clear();
				getCfNext().addAll((Collection<? extends BasicBlock>)newValue);
				return;
			case AnalysisPackage.BASIC_BLOCK__CF_PREV:
				setCfPrev((BasicBlock)newValue);
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
			case AnalysisPackage.BASIC_BLOCK__EXPR:
				setExpr((ExpressionAnnotation)null);
				return;
			case AnalysisPackage.BASIC_BLOCK__CF_NEXT:
				getCfNext().clear();
				return;
			case AnalysisPackage.BASIC_BLOCK__CF_PREV:
				setCfPrev((BasicBlock)null);
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
			case AnalysisPackage.BASIC_BLOCK__EXPR:
				return expr != null;
			case AnalysisPackage.BASIC_BLOCK__CF_NEXT:
				return cfNext != null && !cfNext.isEmpty();
			case AnalysisPackage.BASIC_BLOCK__CF_PREV:
				return cfPrev != null;
		}
		return super.eIsSet(featureID);
	}

} //BasicBlockImpl
