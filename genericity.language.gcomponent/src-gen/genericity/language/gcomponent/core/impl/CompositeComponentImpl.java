/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.language.gcomponent.core.impl;

import genericity.language.gcomponent.core.BindingDeclaration;
import genericity.language.gcomponent.core.Component;
import genericity.language.gcomponent.core.CompositeComponent;
import genericity.language.gcomponent.core.CorePackage;

import genericity.language.gcomponent.flowcontrol.Composition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link genericity.language.gcomponent.core.impl.CompositeComponentImpl#getUses <em>Uses</em>}</li>
 *   <li>{@link genericity.language.gcomponent.core.impl.CompositeComponentImpl#getComposition <em>Composition</em>}</li>
 *   <li>{@link genericity.language.gcomponent.core.impl.CompositeComponentImpl#getBindings <em>Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompositeComponentImpl extends ComponentImpl implements CompositeComponent {
	/**
	 * The cached value of the '{@link #getUses() <em>Uses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUses()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> uses;

	/**
	 * The cached value of the '{@link #getComposition() <em>Composition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposition()
	 * @generated
	 * @ordered
	 */
	protected Composition composition;

	/**
	 * The cached value of the '{@link #getBindings() <em>Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<BindingDeclaration> bindings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.COMPOSITE_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getUses() {
		if (uses == null) {
			uses = new EObjectResolvingEList<Component>(Component.class, this, CorePackage.COMPOSITE_COMPONENT__USES);
		}
		return uses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composition getComposition() {
		return composition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComposition(Composition newComposition, NotificationChain msgs) {
		Composition oldComposition = composition;
		composition = newComposition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.COMPOSITE_COMPONENT__COMPOSITION, oldComposition, newComposition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComposition(Composition newComposition) {
		if (newComposition != composition) {
			NotificationChain msgs = null;
			if (composition != null)
				msgs = ((InternalEObject)composition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.COMPOSITE_COMPONENT__COMPOSITION, null, msgs);
			if (newComposition != null)
				msgs = ((InternalEObject)newComposition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.COMPOSITE_COMPONENT__COMPOSITION, null, msgs);
			msgs = basicSetComposition(newComposition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.COMPOSITE_COMPONENT__COMPOSITION, newComposition, newComposition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BindingDeclaration> getBindings() {
		if (bindings == null) {
			bindings = new EObjectContainmentEList<BindingDeclaration>(BindingDeclaration.class, this, CorePackage.COMPOSITE_COMPONENT__BINDINGS);
		}
		return bindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.COMPOSITE_COMPONENT__COMPOSITION:
				return basicSetComposition(null, msgs);
			case CorePackage.COMPOSITE_COMPONENT__BINDINGS:
				return ((InternalEList<?>)getBindings()).basicRemove(otherEnd, msgs);
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
			case CorePackage.COMPOSITE_COMPONENT__USES:
				return getUses();
			case CorePackage.COMPOSITE_COMPONENT__COMPOSITION:
				return getComposition();
			case CorePackage.COMPOSITE_COMPONENT__BINDINGS:
				return getBindings();
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
			case CorePackage.COMPOSITE_COMPONENT__USES:
				getUses().clear();
				getUses().addAll((Collection<? extends Component>)newValue);
				return;
			case CorePackage.COMPOSITE_COMPONENT__COMPOSITION:
				setComposition((Composition)newValue);
				return;
			case CorePackage.COMPOSITE_COMPONENT__BINDINGS:
				getBindings().clear();
				getBindings().addAll((Collection<? extends BindingDeclaration>)newValue);
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
			case CorePackage.COMPOSITE_COMPONENT__USES:
				getUses().clear();
				return;
			case CorePackage.COMPOSITE_COMPONENT__COMPOSITION:
				setComposition((Composition)null);
				return;
			case CorePackage.COMPOSITE_COMPONENT__BINDINGS:
				getBindings().clear();
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
			case CorePackage.COMPOSITE_COMPONENT__USES:
				return uses != null && !uses.isEmpty();
			case CorePackage.COMPOSITE_COMPONENT__COMPOSITION:
				return composition != null;
			case CorePackage.COMPOSITE_COMPONENT__BINDINGS:
				return bindings != null && !bindings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CompositeComponentImpl
