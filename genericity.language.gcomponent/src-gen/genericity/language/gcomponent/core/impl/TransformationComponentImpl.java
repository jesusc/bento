/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.language.gcomponent.core.impl;

import genericity.language.gcomponent.core.Concept;
import genericity.language.gcomponent.core.Constraint;
import genericity.language.gcomponent.core.CorePackage;
import genericity.language.gcomponent.core.Tag;
import genericity.language.gcomponent.core.Tagged;
import genericity.language.gcomponent.core.Template;
import genericity.language.gcomponent.core.TransformationComponent;

import genericity.language.gcomponent.variants.Parameter;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformation Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link genericity.language.gcomponent.core.impl.TransformationComponentImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link genericity.language.gcomponent.core.impl.TransformationComponentImpl#isIsM2M <em>Is M2M</em>}</li>
 *   <li>{@link genericity.language.gcomponent.core.impl.TransformationComponentImpl#getTemplate <em>Template</em>}</li>
 *   <li>{@link genericity.language.gcomponent.core.impl.TransformationComponentImpl#getConstraints <em>Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransformationComponentImpl extends ComponentImpl implements TransformationComponent {
	/**
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected EList<Tag> tags;

	/**
	 * The default value of the '{@link #isIsM2M() <em>Is M2M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsM2M()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_M2M_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsM2M() <em>Is M2M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsM2M()
	 * @generated
	 * @ordered
	 */
	protected boolean isM2M = IS_M2M_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTemplate() <em>Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplate()
	 * @generated
	 * @ordered
	 */
	protected Template template;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> constraints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformationComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.TRANSFORMATION_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tag> getTags() {
		if (tags == null) {
			tags = new EObjectContainmentEList<Tag>(Tag.class, this, CorePackage.TRANSFORMATION_COMPONENT__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsM2M() {
		return isM2M;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsM2M(boolean newIsM2M) {
		boolean oldIsM2M = isM2M;
		isM2M = newIsM2M;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TRANSFORMATION_COMPONENT__IS_M2M, oldIsM2M, isM2M));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Template getTemplate() {
		return template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplate(Template newTemplate, NotificationChain msgs) {
		Template oldTemplate = template;
		template = newTemplate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.TRANSFORMATION_COMPONENT__TEMPLATE, oldTemplate, newTemplate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplate(Template newTemplate) {
		if (newTemplate != template) {
			NotificationChain msgs = null;
			if (template != null)
				msgs = ((InternalEObject)template).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.TRANSFORMATION_COMPONENT__TEMPLATE, null, msgs);
			if (newTemplate != null)
				msgs = ((InternalEObject)newTemplate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.TRANSFORMATION_COMPONENT__TEMPLATE, null, msgs);
			msgs = basicSetTemplate(newTemplate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TRANSFORMATION_COMPONENT__TEMPLATE, newTemplate, newTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentEList<Constraint>(Constraint.class, this, CorePackage.TRANSFORMATION_COMPONENT__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.TRANSFORMATION_COMPONENT__TAGS:
				return ((InternalEList<?>)getTags()).basicRemove(otherEnd, msgs);
			case CorePackage.TRANSFORMATION_COMPONENT__TEMPLATE:
				return basicSetTemplate(null, msgs);
			case CorePackage.TRANSFORMATION_COMPONENT__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
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
			case CorePackage.TRANSFORMATION_COMPONENT__TAGS:
				return getTags();
			case CorePackage.TRANSFORMATION_COMPONENT__IS_M2M:
				return isIsM2M();
			case CorePackage.TRANSFORMATION_COMPONENT__TEMPLATE:
				return getTemplate();
			case CorePackage.TRANSFORMATION_COMPONENT__CONSTRAINTS:
				return getConstraints();
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
			case CorePackage.TRANSFORMATION_COMPONENT__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends Tag>)newValue);
				return;
			case CorePackage.TRANSFORMATION_COMPONENT__IS_M2M:
				setIsM2M((Boolean)newValue);
				return;
			case CorePackage.TRANSFORMATION_COMPONENT__TEMPLATE:
				setTemplate((Template)newValue);
				return;
			case CorePackage.TRANSFORMATION_COMPONENT__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends Constraint>)newValue);
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
			case CorePackage.TRANSFORMATION_COMPONENT__TAGS:
				getTags().clear();
				return;
			case CorePackage.TRANSFORMATION_COMPONENT__IS_M2M:
				setIsM2M(IS_M2M_EDEFAULT);
				return;
			case CorePackage.TRANSFORMATION_COMPONENT__TEMPLATE:
				setTemplate((Template)null);
				return;
			case CorePackage.TRANSFORMATION_COMPONENT__CONSTRAINTS:
				getConstraints().clear();
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
			case CorePackage.TRANSFORMATION_COMPONENT__TAGS:
				return tags != null && !tags.isEmpty();
			case CorePackage.TRANSFORMATION_COMPONENT__IS_M2M:
				return isM2M != IS_M2M_EDEFAULT;
			case CorePackage.TRANSFORMATION_COMPONENT__TEMPLATE:
				return template != null;
			case CorePackage.TRANSFORMATION_COMPONENT__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Tagged.class) {
			switch (derivedFeatureID) {
				case CorePackage.TRANSFORMATION_COMPONENT__TAGS: return CorePackage.TAGGED__TAGS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Tagged.class) {
			switch (baseFeatureID) {
				case CorePackage.TAGGED__TAGS: return CorePackage.TRANSFORMATION_COMPONENT__TAGS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isM2M: ");
		result.append(isM2M);
		result.append(')');
		return result.toString();
	}

} //TransformationComponentImpl
