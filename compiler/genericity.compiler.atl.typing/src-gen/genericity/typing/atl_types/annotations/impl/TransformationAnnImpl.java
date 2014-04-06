/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.typing.atl_types.annotations.impl;

import genericity.typing.atl_types.annotations.AnnotationsPackage;
import genericity.typing.atl_types.annotations.CalledRuleAnn;
import genericity.typing.atl_types.annotations.HelperAnn;
import genericity.typing.atl_types.annotations.LazyRuleAnn;
import genericity.typing.atl_types.annotations.MatchedRuleAnn;
import genericity.typing.atl_types.annotations.RuleAnn;
import genericity.typing.atl_types.annotations.TransformationAnn;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformation Ann</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link genericity.typing.atl_types.annotations.impl.TransformationAnnImpl#getModule <em>Module</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.impl.TransformationAnnImpl#getMatchedRules <em>Matched Rules</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.impl.TransformationAnnImpl#getCalledRules <em>Called Rules</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.impl.TransformationAnnImpl#getLazyRules <em>Lazy Rules</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.impl.TransformationAnnImpl#getHelpers <em>Helpers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransformationAnnImpl extends AtlAnnotationImpl implements TransformationAnn {
	/**
	 * The cached value of the '{@link #getModule() <em>Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModule()
	 * @generated
	 * @ordered
	 */
	protected EObject module;

	/**
	 * The cached value of the '{@link #getMatchedRules() <em>Matched Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchedRules()
	 * @generated
	 * @ordered
	 */
	protected EList<MatchedRuleAnn> matchedRules;

	/**
	 * The cached value of the '{@link #getCalledRules() <em>Called Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalledRules()
	 * @generated
	 * @ordered
	 */
	protected EList<CalledRuleAnn> calledRules;

	/**
	 * The cached value of the '{@link #getLazyRules() <em>Lazy Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLazyRules()
	 * @generated
	 * @ordered
	 */
	protected EList<LazyRuleAnn> lazyRules;

	/**
	 * The cached value of the '{@link #getHelpers() <em>Helpers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelpers()
	 * @generated
	 * @ordered
	 */
	protected EList<HelperAnn> helpers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformationAnnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnnotationsPackage.Literals.TRANSFORMATION_ANN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getModule() {
		if (module != null && module.eIsProxy()) {
			InternalEObject oldModule = (InternalEObject)module;
			module = eResolveProxy(oldModule);
			if (module != oldModule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnnotationsPackage.TRANSFORMATION_ANN__MODULE, oldModule, module));
			}
		}
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetModule() {
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModule(EObject newModule) {
		EObject oldModule = module;
		module = newModule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsPackage.TRANSFORMATION_ANN__MODULE, oldModule, module));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MatchedRuleAnn> getMatchedRules() {
		if (matchedRules == null) {
			matchedRules = new EObjectContainmentEList<MatchedRuleAnn>(MatchedRuleAnn.class, this, AnnotationsPackage.TRANSFORMATION_ANN__MATCHED_RULES);
		}
		return matchedRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CalledRuleAnn> getCalledRules() {
		if (calledRules == null) {
			calledRules = new EObjectContainmentEList<CalledRuleAnn>(CalledRuleAnn.class, this, AnnotationsPackage.TRANSFORMATION_ANN__CALLED_RULES);
		}
		return calledRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LazyRuleAnn> getLazyRules() {
		if (lazyRules == null) {
			lazyRules = new EObjectContainmentEList<LazyRuleAnn>(LazyRuleAnn.class, this, AnnotationsPackage.TRANSFORMATION_ANN__LAZY_RULES);
		}
		return lazyRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HelperAnn> getHelpers() {
		if (helpers == null) {
			helpers = new EObjectContainmentEList<HelperAnn>(HelperAnn.class, this, AnnotationsPackage.TRANSFORMATION_ANN__HELPERS);
		}
		return helpers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnnotationsPackage.TRANSFORMATION_ANN__MATCHED_RULES:
				return ((InternalEList<?>)getMatchedRules()).basicRemove(otherEnd, msgs);
			case AnnotationsPackage.TRANSFORMATION_ANN__CALLED_RULES:
				return ((InternalEList<?>)getCalledRules()).basicRemove(otherEnd, msgs);
			case AnnotationsPackage.TRANSFORMATION_ANN__LAZY_RULES:
				return ((InternalEList<?>)getLazyRules()).basicRemove(otherEnd, msgs);
			case AnnotationsPackage.TRANSFORMATION_ANN__HELPERS:
				return ((InternalEList<?>)getHelpers()).basicRemove(otherEnd, msgs);
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
			case AnnotationsPackage.TRANSFORMATION_ANN__MODULE:
				if (resolve) return getModule();
				return basicGetModule();
			case AnnotationsPackage.TRANSFORMATION_ANN__MATCHED_RULES:
				return getMatchedRules();
			case AnnotationsPackage.TRANSFORMATION_ANN__CALLED_RULES:
				return getCalledRules();
			case AnnotationsPackage.TRANSFORMATION_ANN__LAZY_RULES:
				return getLazyRules();
			case AnnotationsPackage.TRANSFORMATION_ANN__HELPERS:
				return getHelpers();
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
			case AnnotationsPackage.TRANSFORMATION_ANN__MODULE:
				setModule((EObject)newValue);
				return;
			case AnnotationsPackage.TRANSFORMATION_ANN__MATCHED_RULES:
				getMatchedRules().clear();
				getMatchedRules().addAll((Collection<? extends MatchedRuleAnn>)newValue);
				return;
			case AnnotationsPackage.TRANSFORMATION_ANN__CALLED_RULES:
				getCalledRules().clear();
				getCalledRules().addAll((Collection<? extends CalledRuleAnn>)newValue);
				return;
			case AnnotationsPackage.TRANSFORMATION_ANN__LAZY_RULES:
				getLazyRules().clear();
				getLazyRules().addAll((Collection<? extends LazyRuleAnn>)newValue);
				return;
			case AnnotationsPackage.TRANSFORMATION_ANN__HELPERS:
				getHelpers().clear();
				getHelpers().addAll((Collection<? extends HelperAnn>)newValue);
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
			case AnnotationsPackage.TRANSFORMATION_ANN__MODULE:
				setModule((EObject)null);
				return;
			case AnnotationsPackage.TRANSFORMATION_ANN__MATCHED_RULES:
				getMatchedRules().clear();
				return;
			case AnnotationsPackage.TRANSFORMATION_ANN__CALLED_RULES:
				getCalledRules().clear();
				return;
			case AnnotationsPackage.TRANSFORMATION_ANN__LAZY_RULES:
				getLazyRules().clear();
				return;
			case AnnotationsPackage.TRANSFORMATION_ANN__HELPERS:
				getHelpers().clear();
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
			case AnnotationsPackage.TRANSFORMATION_ANN__MODULE:
				return module != null;
			case AnnotationsPackage.TRANSFORMATION_ANN__MATCHED_RULES:
				return matchedRules != null && !matchedRules.isEmpty();
			case AnnotationsPackage.TRANSFORMATION_ANN__CALLED_RULES:
				return calledRules != null && !calledRules.isEmpty();
			case AnnotationsPackage.TRANSFORMATION_ANN__LAZY_RULES:
				return lazyRules != null && !lazyRules.isEmpty();
			case AnnotationsPackage.TRANSFORMATION_ANN__HELPERS:
				return helpers != null && !helpers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TransformationAnnImpl
