/**
 */
package mindstorms_bdsl.impl;

import java.util.Collection;

import mindstorms_bdsl.BindingElement;
import mindstorms_bdsl.Instruction;
import mindstorms_bdsl.Mindstorms_bdslPackage;
import mindstorms_bdsl.NoneElement;
import mindstorms_bdsl.ReuseInstruction;
import mindstorms_bdsl.nameReuseInstruction;

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
 * An implementation of the model object '<em><b>Reuse Instruction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mindstorms_bdsl.impl.ReuseInstructionImpl#getNoneElement <em>None Element</em>}</li>
 *   <li>{@link mindstorms_bdsl.impl.ReuseInstructionImpl#getReuse <em>Reuse</em>}</li>
 *   <li>{@link mindstorms_bdsl.impl.ReuseInstructionImpl#getContainsnameReuseInstruction <em>Containsname Reuse Instruction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReuseInstructionImpl extends InstructionImpl implements ReuseInstruction {
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
	 * The cached value of the '{@link #getReuse() <em>Reuse</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReuse()
	 * @generated
	 * @ordered
	 */
	protected Instruction reuse;

	/**
	 * The cached value of the '{@link #getContainsnameReuseInstruction() <em>Containsname Reuse Instruction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsnameReuseInstruction()
	 * @generated
	 * @ordered
	 */
	protected EList<nameReuseInstruction> containsnameReuseInstruction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReuseInstructionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mindstorms_bdslPackage.Literals.REUSE_INSTRUCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NoneElement> getNoneElement() {
		if (noneElement == null) {
			noneElement = new EObjectResolvingEList<NoneElement>(NoneElement.class, this, Mindstorms_bdslPackage.REUSE_INSTRUCTION__NONE_ELEMENT);
		}
		return noneElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instruction getReuse() {
		if (reuse != null && reuse.eIsProxy()) {
			InternalEObject oldReuse = (InternalEObject)reuse;
			reuse = (Instruction)eResolveProxy(oldReuse);
			if (reuse != oldReuse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Mindstorms_bdslPackage.REUSE_INSTRUCTION__REUSE, oldReuse, reuse));
			}
		}
		return reuse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instruction basicGetReuse() {
		return reuse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReuse(Instruction newReuse) {
		Instruction oldReuse = reuse;
		reuse = newReuse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mindstorms_bdslPackage.REUSE_INSTRUCTION__REUSE, oldReuse, reuse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<nameReuseInstruction> getContainsnameReuseInstruction() {
		if (containsnameReuseInstruction == null) {
			containsnameReuseInstruction = new EObjectContainmentEList<nameReuseInstruction>(nameReuseInstruction.class, this, Mindstorms_bdslPackage.REUSE_INSTRUCTION__CONTAINSNAME_REUSE_INSTRUCTION);
		}
		return containsnameReuseInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mindstorms_bdslPackage.REUSE_INSTRUCTION__CONTAINSNAME_REUSE_INSTRUCTION:
				return ((InternalEList<?>)getContainsnameReuseInstruction()).basicRemove(otherEnd, msgs);
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
			case Mindstorms_bdslPackage.REUSE_INSTRUCTION__NONE_ELEMENT:
				return getNoneElement();
			case Mindstorms_bdslPackage.REUSE_INSTRUCTION__REUSE:
				if (resolve) return getReuse();
				return basicGetReuse();
			case Mindstorms_bdslPackage.REUSE_INSTRUCTION__CONTAINSNAME_REUSE_INSTRUCTION:
				return getContainsnameReuseInstruction();
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
			case Mindstorms_bdslPackage.REUSE_INSTRUCTION__NONE_ELEMENT:
				getNoneElement().clear();
				getNoneElement().addAll((Collection<? extends NoneElement>)newValue);
				return;
			case Mindstorms_bdslPackage.REUSE_INSTRUCTION__REUSE:
				setReuse((Instruction)newValue);
				return;
			case Mindstorms_bdslPackage.REUSE_INSTRUCTION__CONTAINSNAME_REUSE_INSTRUCTION:
				getContainsnameReuseInstruction().clear();
				getContainsnameReuseInstruction().addAll((Collection<? extends nameReuseInstruction>)newValue);
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
			case Mindstorms_bdslPackage.REUSE_INSTRUCTION__NONE_ELEMENT:
				getNoneElement().clear();
				return;
			case Mindstorms_bdslPackage.REUSE_INSTRUCTION__REUSE:
				setReuse((Instruction)null);
				return;
			case Mindstorms_bdslPackage.REUSE_INSTRUCTION__CONTAINSNAME_REUSE_INSTRUCTION:
				getContainsnameReuseInstruction().clear();
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
			case Mindstorms_bdslPackage.REUSE_INSTRUCTION__NONE_ELEMENT:
				return noneElement != null && !noneElement.isEmpty();
			case Mindstorms_bdslPackage.REUSE_INSTRUCTION__REUSE:
				return reuse != null;
			case Mindstorms_bdslPackage.REUSE_INSTRUCTION__CONTAINSNAME_REUSE_INSTRUCTION:
				return containsnameReuseInstruction != null && !containsnameReuseInstruction.isEmpty();
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
		if (baseClass == BindingElement.class) {
			switch (derivedFeatureID) {
				case Mindstorms_bdslPackage.REUSE_INSTRUCTION__NONE_ELEMENT: return Mindstorms_bdslPackage.BINDING_ELEMENT__NONE_ELEMENT;
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
		if (baseClass == BindingElement.class) {
			switch (baseFeatureID) {
				case Mindstorms_bdslPackage.BINDING_ELEMENT__NONE_ELEMENT: return Mindstorms_bdslPackage.REUSE_INSTRUCTION__NONE_ELEMENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ReuseInstructionImpl
