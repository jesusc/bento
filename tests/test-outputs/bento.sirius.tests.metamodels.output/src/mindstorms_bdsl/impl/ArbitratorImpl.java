/**
 */
package mindstorms_bdsl.impl;

import java.util.Collection;

import mindstorms_bdsl.Arbitrator;
import mindstorms_bdsl.Behavior;
import mindstorms_bdsl.BindingElement;
import mindstorms_bdsl.Condition;
import mindstorms_bdsl.ConditionContainer;
import mindstorms_bdsl.Mindstorms_bdslPackage;
import mindstorms_bdsl.NoneElement;
import mindstorms_bdsl.nameArbitrator;

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
 * An implementation of the model object '<em><b>Arbitrator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mindstorms_bdsl.impl.ArbitratorImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link mindstorms_bdsl.impl.ArbitratorImpl#getNoneElement <em>None Element</em>}</li>
 *   <li>{@link mindstorms_bdsl.impl.ArbitratorImpl#getBehaviors <em>Behaviors</em>}</li>
 *   <li>{@link mindstorms_bdsl.impl.ArbitratorImpl#getReuse <em>Reuse</em>}</li>
 *   <li>{@link mindstorms_bdsl.impl.ArbitratorImpl#getContainsnameArbitrator <em>Containsname Arbitrator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArbitratorImpl extends InstructionImpl implements Arbitrator {
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Condition condition;

	/**
	 * The cached value of the '{@link #getNoneElement() <em>None Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoneElement()
	 * @generated
	 * @ordered
	 */
	protected EList<NoneElement> noneElement;

	/**
	 * The cached value of the '{@link #getBehaviors() <em>Behaviors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviors()
	 * @generated
	 * @ordered
	 */
	protected EList<Behavior> behaviors;

	/**
	 * The cached value of the '{@link #getReuse() <em>Reuse</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReuse()
	 * @generated
	 * @ordered
	 */
	protected EList<Behavior> reuse;

	/**
	 * The cached value of the '{@link #getContainsnameArbitrator() <em>Containsname Arbitrator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsnameArbitrator()
	 * @generated
	 * @ordered
	 */
	protected EList<nameArbitrator> containsnameArbitrator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArbitratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mindstorms_bdslPackage.Literals.ARBITRATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Condition newCondition, NotificationChain msgs) {
		Condition oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mindstorms_bdslPackage.ARBITRATOR__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(Condition newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mindstorms_bdslPackage.ARBITRATOR__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mindstorms_bdslPackage.ARBITRATOR__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mindstorms_bdslPackage.ARBITRATOR__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NoneElement> getNoneElement() {
		if (noneElement == null) {
			noneElement = new EObjectResolvingEList<NoneElement>(NoneElement.class, this, Mindstorms_bdslPackage.ARBITRATOR__NONE_ELEMENT);
		}
		return noneElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Behavior> getBehaviors() {
		if (behaviors == null) {
			behaviors = new EObjectContainmentEList<Behavior>(Behavior.class, this, Mindstorms_bdslPackage.ARBITRATOR__BEHAVIORS);
		}
		return behaviors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Behavior> getReuse() {
		if (reuse == null) {
			reuse = new EObjectResolvingEList<Behavior>(Behavior.class, this, Mindstorms_bdslPackage.ARBITRATOR__REUSE);
		}
		return reuse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<nameArbitrator> getContainsnameArbitrator() {
		if (containsnameArbitrator == null) {
			containsnameArbitrator = new EObjectContainmentEList<nameArbitrator>(nameArbitrator.class, this, Mindstorms_bdslPackage.ARBITRATOR__CONTAINSNAME_ARBITRATOR);
		}
		return containsnameArbitrator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mindstorms_bdslPackage.ARBITRATOR__CONDITION:
				return basicSetCondition(null, msgs);
			case Mindstorms_bdslPackage.ARBITRATOR__BEHAVIORS:
				return ((InternalEList<?>)getBehaviors()).basicRemove(otherEnd, msgs);
			case Mindstorms_bdslPackage.ARBITRATOR__CONTAINSNAME_ARBITRATOR:
				return ((InternalEList<?>)getContainsnameArbitrator()).basicRemove(otherEnd, msgs);
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
			case Mindstorms_bdslPackage.ARBITRATOR__CONDITION:
				return getCondition();
			case Mindstorms_bdslPackage.ARBITRATOR__NONE_ELEMENT:
				return getNoneElement();
			case Mindstorms_bdslPackage.ARBITRATOR__BEHAVIORS:
				return getBehaviors();
			case Mindstorms_bdslPackage.ARBITRATOR__REUSE:
				return getReuse();
			case Mindstorms_bdslPackage.ARBITRATOR__CONTAINSNAME_ARBITRATOR:
				return getContainsnameArbitrator();
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
			case Mindstorms_bdslPackage.ARBITRATOR__CONDITION:
				setCondition((Condition)newValue);
				return;
			case Mindstorms_bdslPackage.ARBITRATOR__NONE_ELEMENT:
				getNoneElement().clear();
				getNoneElement().addAll((Collection<? extends NoneElement>)newValue);
				return;
			case Mindstorms_bdslPackage.ARBITRATOR__BEHAVIORS:
				getBehaviors().clear();
				getBehaviors().addAll((Collection<? extends Behavior>)newValue);
				return;
			case Mindstorms_bdslPackage.ARBITRATOR__REUSE:
				getReuse().clear();
				getReuse().addAll((Collection<? extends Behavior>)newValue);
				return;
			case Mindstorms_bdslPackage.ARBITRATOR__CONTAINSNAME_ARBITRATOR:
				getContainsnameArbitrator().clear();
				getContainsnameArbitrator().addAll((Collection<? extends nameArbitrator>)newValue);
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
			case Mindstorms_bdslPackage.ARBITRATOR__CONDITION:
				setCondition((Condition)null);
				return;
			case Mindstorms_bdslPackage.ARBITRATOR__NONE_ELEMENT:
				getNoneElement().clear();
				return;
			case Mindstorms_bdslPackage.ARBITRATOR__BEHAVIORS:
				getBehaviors().clear();
				return;
			case Mindstorms_bdslPackage.ARBITRATOR__REUSE:
				getReuse().clear();
				return;
			case Mindstorms_bdslPackage.ARBITRATOR__CONTAINSNAME_ARBITRATOR:
				getContainsnameArbitrator().clear();
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
			case Mindstorms_bdslPackage.ARBITRATOR__CONDITION:
				return condition != null;
			case Mindstorms_bdslPackage.ARBITRATOR__NONE_ELEMENT:
				return noneElement != null && !noneElement.isEmpty();
			case Mindstorms_bdslPackage.ARBITRATOR__BEHAVIORS:
				return behaviors != null && !behaviors.isEmpty();
			case Mindstorms_bdslPackage.ARBITRATOR__REUSE:
				return reuse != null && !reuse.isEmpty();
			case Mindstorms_bdslPackage.ARBITRATOR__CONTAINSNAME_ARBITRATOR:
				return containsnameArbitrator != null && !containsnameArbitrator.isEmpty();
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
		if (baseClass == ConditionContainer.class) {
			switch (derivedFeatureID) {
				case Mindstorms_bdslPackage.ARBITRATOR__CONDITION: return Mindstorms_bdslPackage.CONDITION_CONTAINER__CONDITION;
				default: return -1;
			}
		}
		if (baseClass == BindingElement.class) {
			switch (derivedFeatureID) {
				case Mindstorms_bdslPackage.ARBITRATOR__NONE_ELEMENT: return Mindstorms_bdslPackage.BINDING_ELEMENT__NONE_ELEMENT;
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
		if (baseClass == ConditionContainer.class) {
			switch (baseFeatureID) {
				case Mindstorms_bdslPackage.CONDITION_CONTAINER__CONDITION: return Mindstorms_bdslPackage.ARBITRATOR__CONDITION;
				default: return -1;
			}
		}
		if (baseClass == BindingElement.class) {
			switch (baseFeatureID) {
				case Mindstorms_bdslPackage.BINDING_ELEMENT__NONE_ELEMENT: return Mindstorms_bdslPackage.ARBITRATOR__NONE_ELEMENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ArbitratorImpl
