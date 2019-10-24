/**
 */
package mindstorms_bdsl.impl;

import java.util.Collection;

import mindstorms_bdsl.Behavior;
import mindstorms_bdsl.BindingElement;
import mindstorms_bdsl.Block;
import mindstorms_bdsl.BlockContainer;
import mindstorms_bdsl.Condition;
import mindstorms_bdsl.ConditionContainer;
import mindstorms_bdsl.Mindstorms_bdslPackage;
import mindstorms_bdsl.NoneElement;
import mindstorms_bdsl.nameBehavior;

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
 * An implementation of the model object '<em><b>Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mindstorms_bdsl.impl.BehaviorImpl#getBlocks <em>Blocks</em>}</li>
 *   <li>{@link mindstorms_bdsl.impl.BehaviorImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link mindstorms_bdsl.impl.BehaviorImpl#getNoneElement <em>None Element</em>}</li>
 *   <li>{@link mindstorms_bdsl.impl.BehaviorImpl#getContainsnameBehavior <em>Containsname Behavior</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BehaviorImpl extends NamedElementImpl implements Behavior {
	/**
	 * The cached value of the '{@link #getBlocks() <em>Blocks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlocks()
	 * @generated
	 * @ordered
	 */
	protected EList<Block> blocks;

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
	 * The cached value of the '{@link #getContainsnameBehavior() <em>Containsname Behavior</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsnameBehavior()
	 * @generated
	 * @ordered
	 */
	protected EList<nameBehavior> containsnameBehavior;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mindstorms_bdslPackage.Literals.BEHAVIOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Block> getBlocks() {
		if (blocks == null) {
			blocks = new EObjectContainmentEList<Block>(Block.class, this, Mindstorms_bdslPackage.BEHAVIOR__BLOCKS);
		}
		return blocks;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Mindstorms_bdslPackage.BEHAVIOR__CONDITION, oldCondition, newCondition);
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
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Mindstorms_bdslPackage.BEHAVIOR__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Mindstorms_bdslPackage.BEHAVIOR__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mindstorms_bdslPackage.BEHAVIOR__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NoneElement> getNoneElement() {
		if (noneElement == null) {
			noneElement = new EObjectResolvingEList<NoneElement>(NoneElement.class, this, Mindstorms_bdslPackage.BEHAVIOR__NONE_ELEMENT);
		}
		return noneElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<nameBehavior> getContainsnameBehavior() {
		if (containsnameBehavior == null) {
			containsnameBehavior = new EObjectContainmentEList<nameBehavior>(nameBehavior.class, this, Mindstorms_bdslPackage.BEHAVIOR__CONTAINSNAME_BEHAVIOR);
		}
		return containsnameBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mindstorms_bdslPackage.BEHAVIOR__BLOCKS:
				return ((InternalEList<?>)getBlocks()).basicRemove(otherEnd, msgs);
			case Mindstorms_bdslPackage.BEHAVIOR__CONDITION:
				return basicSetCondition(null, msgs);
			case Mindstorms_bdslPackage.BEHAVIOR__CONTAINSNAME_BEHAVIOR:
				return ((InternalEList<?>)getContainsnameBehavior()).basicRemove(otherEnd, msgs);
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
			case Mindstorms_bdslPackage.BEHAVIOR__BLOCKS:
				return getBlocks();
			case Mindstorms_bdslPackage.BEHAVIOR__CONDITION:
				return getCondition();
			case Mindstorms_bdslPackage.BEHAVIOR__NONE_ELEMENT:
				return getNoneElement();
			case Mindstorms_bdslPackage.BEHAVIOR__CONTAINSNAME_BEHAVIOR:
				return getContainsnameBehavior();
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
			case Mindstorms_bdslPackage.BEHAVIOR__BLOCKS:
				getBlocks().clear();
				getBlocks().addAll((Collection<? extends Block>)newValue);
				return;
			case Mindstorms_bdslPackage.BEHAVIOR__CONDITION:
				setCondition((Condition)newValue);
				return;
			case Mindstorms_bdslPackage.BEHAVIOR__NONE_ELEMENT:
				getNoneElement().clear();
				getNoneElement().addAll((Collection<? extends NoneElement>)newValue);
				return;
			case Mindstorms_bdslPackage.BEHAVIOR__CONTAINSNAME_BEHAVIOR:
				getContainsnameBehavior().clear();
				getContainsnameBehavior().addAll((Collection<? extends nameBehavior>)newValue);
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
			case Mindstorms_bdslPackage.BEHAVIOR__BLOCKS:
				getBlocks().clear();
				return;
			case Mindstorms_bdslPackage.BEHAVIOR__CONDITION:
				setCondition((Condition)null);
				return;
			case Mindstorms_bdslPackage.BEHAVIOR__NONE_ELEMENT:
				getNoneElement().clear();
				return;
			case Mindstorms_bdslPackage.BEHAVIOR__CONTAINSNAME_BEHAVIOR:
				getContainsnameBehavior().clear();
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
			case Mindstorms_bdslPackage.BEHAVIOR__BLOCKS:
				return blocks != null && !blocks.isEmpty();
			case Mindstorms_bdslPackage.BEHAVIOR__CONDITION:
				return condition != null;
			case Mindstorms_bdslPackage.BEHAVIOR__NONE_ELEMENT:
				return noneElement != null && !noneElement.isEmpty();
			case Mindstorms_bdslPackage.BEHAVIOR__CONTAINSNAME_BEHAVIOR:
				return containsnameBehavior != null && !containsnameBehavior.isEmpty();
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
		if (baseClass == BlockContainer.class) {
			switch (derivedFeatureID) {
				case Mindstorms_bdslPackage.BEHAVIOR__BLOCKS: return Mindstorms_bdslPackage.BLOCK_CONTAINER__BLOCKS;
				default: return -1;
			}
		}
		if (baseClass == ConditionContainer.class) {
			switch (derivedFeatureID) {
				case Mindstorms_bdslPackage.BEHAVIOR__CONDITION: return Mindstorms_bdslPackage.CONDITION_CONTAINER__CONDITION;
				default: return -1;
			}
		}
		if (baseClass == BindingElement.class) {
			switch (derivedFeatureID) {
				case Mindstorms_bdslPackage.BEHAVIOR__NONE_ELEMENT: return Mindstorms_bdslPackage.BINDING_ELEMENT__NONE_ELEMENT;
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
		if (baseClass == BlockContainer.class) {
			switch (baseFeatureID) {
				case Mindstorms_bdslPackage.BLOCK_CONTAINER__BLOCKS: return Mindstorms_bdslPackage.BEHAVIOR__BLOCKS;
				default: return -1;
			}
		}
		if (baseClass == ConditionContainer.class) {
			switch (baseFeatureID) {
				case Mindstorms_bdslPackage.CONDITION_CONTAINER__CONDITION: return Mindstorms_bdslPackage.BEHAVIOR__CONDITION;
				default: return -1;
			}
		}
		if (baseClass == BindingElement.class) {
			switch (baseFeatureID) {
				case Mindstorms_bdslPackage.BINDING_ELEMENT__NONE_ELEMENT: return Mindstorms_bdslPackage.BEHAVIOR__NONE_ELEMENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //BehaviorImpl
