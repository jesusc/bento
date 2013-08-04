/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gbind.dsl.impl;

import gbind.dsl.ClassBinding;
import gbind.dsl.ConceptMetaclass;
import gbind.dsl.ConcreteMetaclass;
import gbind.dsl.DslPackage;

import gbind.simpleocl.OclExpression;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gbind.dsl.impl.ClassBindingImpl#getConcept <em>Concept</em>}</li>
 *   <li>{@link gbind.dsl.impl.ClassBindingImpl#getConcrete <em>Concrete</em>}</li>
 *   <li>{@link gbind.dsl.impl.ClassBindingImpl#getWhenClause <em>When Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassBindingImpl extends ConceptBindingImpl implements ClassBinding {
	/**
	 * The cached value of the '{@link #getConcept() <em>Concept</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcept()
	 * @generated
	 * @ordered
	 */
	protected ConceptMetaclass concept;

	/**
	 * The cached value of the '{@link #getConcrete() <em>Concrete</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcrete()
	 * @generated
	 * @ordered
	 */
	protected EList<ConcreteMetaclass> concrete;

	/**
	 * The cached value of the '{@link #getWhenClause() <em>When Clause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhenClause()
	 * @generated
	 * @ordered
	 */
	protected OclExpression whenClause;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslPackage.Literals.CLASS_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMetaclass getConcept() {
		if (concept != null && concept.eIsProxy()) {
			InternalEObject oldConcept = (InternalEObject)concept;
			concept = (ConceptMetaclass)eResolveProxy(oldConcept);
			if (concept != oldConcept) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslPackage.CLASS_BINDING__CONCEPT, oldConcept, concept));
			}
		}
		return concept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMetaclass basicGetConcept() {
		return concept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcept(ConceptMetaclass newConcept) {
		ConceptMetaclass oldConcept = concept;
		concept = newConcept;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.CLASS_BINDING__CONCEPT, oldConcept, concept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConcreteMetaclass> getConcrete() {
		if (concrete == null) {
			concrete = new EObjectResolvingEList<ConcreteMetaclass>(ConcreteMetaclass.class, this, DslPackage.CLASS_BINDING__CONCRETE);
		}
		return concrete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclExpression getWhenClause() {
		return whenClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhenClause(OclExpression newWhenClause, NotificationChain msgs) {
		OclExpression oldWhenClause = whenClause;
		whenClause = newWhenClause;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.CLASS_BINDING__WHEN_CLAUSE, oldWhenClause, newWhenClause);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhenClause(OclExpression newWhenClause) {
		if (newWhenClause != whenClause) {
			NotificationChain msgs = null;
			if (whenClause != null)
				msgs = ((InternalEObject)whenClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.CLASS_BINDING__WHEN_CLAUSE, null, msgs);
			if (newWhenClause != null)
				msgs = ((InternalEObject)newWhenClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.CLASS_BINDING__WHEN_CLAUSE, null, msgs);
			msgs = basicSetWhenClause(newWhenClause, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.CLASS_BINDING__WHEN_CLAUSE, newWhenClause, newWhenClause));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DslPackage.CLASS_BINDING__WHEN_CLAUSE:
				return basicSetWhenClause(null, msgs);
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
			case DslPackage.CLASS_BINDING__CONCEPT:
				if (resolve) return getConcept();
				return basicGetConcept();
			case DslPackage.CLASS_BINDING__CONCRETE:
				return getConcrete();
			case DslPackage.CLASS_BINDING__WHEN_CLAUSE:
				return getWhenClause();
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
			case DslPackage.CLASS_BINDING__CONCEPT:
				setConcept((ConceptMetaclass)newValue);
				return;
			case DslPackage.CLASS_BINDING__CONCRETE:
				getConcrete().clear();
				getConcrete().addAll((Collection<? extends ConcreteMetaclass>)newValue);
				return;
			case DslPackage.CLASS_BINDING__WHEN_CLAUSE:
				setWhenClause((OclExpression)newValue);
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
			case DslPackage.CLASS_BINDING__CONCEPT:
				setConcept((ConceptMetaclass)null);
				return;
			case DslPackage.CLASS_BINDING__CONCRETE:
				getConcrete().clear();
				return;
			case DslPackage.CLASS_BINDING__WHEN_CLAUSE:
				setWhenClause((OclExpression)null);
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
			case DslPackage.CLASS_BINDING__CONCEPT:
				return concept != null;
			case DslPackage.CLASS_BINDING__CONCRETE:
				return concrete != null && !concrete.isEmpty();
			case DslPackage.CLASS_BINDING__WHEN_CLAUSE:
				return whenClause != null;
		}
		return super.eIsSet(featureID);
	}

} //ClassBindingImpl
