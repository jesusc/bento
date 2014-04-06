/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.typing.atl_types.annotations.impl;

import genericity.typing.atl_types.Metaclass;

import genericity.typing.atl_types.annotations.AnnotationsPackage;
import genericity.typing.atl_types.annotations.MatchedRuleManyAnn;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Matched Rule Many Ann</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link genericity.typing.atl_types.annotations.impl.MatchedRuleManyAnnImpl#getInPatternTypes <em>In Pattern Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MatchedRuleManyAnnImpl extends MatchedRuleAnnImpl implements MatchedRuleManyAnn {
	/**
	 * The cached value of the '{@link #getInPatternTypes() <em>In Pattern Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInPatternTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Metaclass> inPatternTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatchedRuleManyAnnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnnotationsPackage.Literals.MATCHED_RULE_MANY_ANN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Metaclass> getInPatternTypes() {
		if (inPatternTypes == null) {
			inPatternTypes = new EObjectResolvingEList<Metaclass>(Metaclass.class, this, AnnotationsPackage.MATCHED_RULE_MANY_ANN__IN_PATTERN_TYPES);
		}
		return inPatternTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AnnotationsPackage.MATCHED_RULE_MANY_ANN__IN_PATTERN_TYPES:
				return getInPatternTypes();
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
			case AnnotationsPackage.MATCHED_RULE_MANY_ANN__IN_PATTERN_TYPES:
				getInPatternTypes().clear();
				getInPatternTypes().addAll((Collection<? extends Metaclass>)newValue);
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
			case AnnotationsPackage.MATCHED_RULE_MANY_ANN__IN_PATTERN_TYPES:
				getInPatternTypes().clear();
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
			case AnnotationsPackage.MATCHED_RULE_MANY_ANN__IN_PATTERN_TYPES:
				return inPatternTypes != null && !inPatternTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MatchedRuleManyAnnImpl
