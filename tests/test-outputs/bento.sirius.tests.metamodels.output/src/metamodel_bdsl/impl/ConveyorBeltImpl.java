/**
 */
package metamodel_bdsl.impl;

import java.util.Collection;

import metamodel_bdsl.BindingElement;
import metamodel_bdsl.ConveyorBelt;
import metamodel_bdsl.Metamodel_bdslPackage;
import metamodel_bdsl.NoneElement;
import metamodel_bdsl.Output;
import metamodel_bdsl.minimalSeparationBetweenBatchesConveyorBelt;
import metamodel_bdsl.nameConveyorBelt;

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
 * An implementation of the model object '<em><b>Conveyor Belt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metamodel_bdsl.impl.ConveyorBeltImpl#getNoneElement <em>None Element</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.ConveyorBeltImpl#getMinimalSeparationBetweenBatches <em>Minimal Separation Between Batches</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.ConveyorBeltImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.ConveyorBeltImpl#getContainsnameConveyorBelt <em>Containsname Conveyor Belt</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.ConveyorBeltImpl#getContainsminimalSeparationBetweenBatchesConveyorBelt <em>Containsminimal Separation Between Batches Conveyor Belt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConveyorBeltImpl extends ProcessImpl implements ConveyorBelt {
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
	 * The default value of the '{@link #getMinimalSeparationBetweenBatches() <em>Minimal Separation Between Batches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimalSeparationBetweenBatches()
	 * @generated
	 * @ordered
	 */
	protected static final Double MINIMAL_SEPARATION_BETWEEN_BATCHES_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getMinimalSeparationBetweenBatches() <em>Minimal Separation Between Batches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimalSeparationBetweenBatches()
	 * @generated
	 * @ordered
	 */
	protected Double minimalSeparationBetweenBatches = MINIMAL_SEPARATION_BETWEEN_BATCHES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected Output output;

	/**
	 * The cached value of the '{@link #getContainsnameConveyorBelt() <em>Containsname Conveyor Belt</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsnameConveyorBelt()
	 * @generated
	 * @ordered
	 */
	protected EList<nameConveyorBelt> containsnameConveyorBelt;

	/**
	 * The cached value of the '{@link #getContainsminimalSeparationBetweenBatchesConveyorBelt() <em>Containsminimal Separation Between Batches Conveyor Belt</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsminimalSeparationBetweenBatchesConveyorBelt()
	 * @generated
	 * @ordered
	 */
	protected EList<minimalSeparationBetweenBatchesConveyorBelt> containsminimalSeparationBetweenBatchesConveyorBelt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConveyorBeltImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Metamodel_bdslPackage.Literals.CONVEYOR_BELT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NoneElement> getNoneElement() {
		if (noneElement == null) {
			noneElement = new EObjectResolvingEList<NoneElement>(NoneElement.class, this, Metamodel_bdslPackage.CONVEYOR_BELT__NONE_ELEMENT);
		}
		return noneElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMinimalSeparationBetweenBatches() {
		return minimalSeparationBetweenBatches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimalSeparationBetweenBatches(Double newMinimalSeparationBetweenBatches) {
		Double oldMinimalSeparationBetweenBatches = minimalSeparationBetweenBatches;
		minimalSeparationBetweenBatches = newMinimalSeparationBetweenBatches;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.CONVEYOR_BELT__MINIMAL_SEPARATION_BETWEEN_BATCHES, oldMinimalSeparationBetweenBatches, minimalSeparationBetweenBatches));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Output getOutput() {
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutput(Output newOutput, NotificationChain msgs) {
		Output oldOutput = output;
		output = newOutput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.CONVEYOR_BELT__OUTPUT, oldOutput, newOutput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput(Output newOutput) {
		if (newOutput != output) {
			NotificationChain msgs = null;
			if (output != null)
				msgs = ((InternalEObject)output).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Metamodel_bdslPackage.CONVEYOR_BELT__OUTPUT, null, msgs);
			if (newOutput != null)
				msgs = ((InternalEObject)newOutput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Metamodel_bdslPackage.CONVEYOR_BELT__OUTPUT, null, msgs);
			msgs = basicSetOutput(newOutput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.CONVEYOR_BELT__OUTPUT, newOutput, newOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<nameConveyorBelt> getContainsnameConveyorBelt() {
		if (containsnameConveyorBelt == null) {
			containsnameConveyorBelt = new EObjectContainmentEList<nameConveyorBelt>(nameConveyorBelt.class, this, Metamodel_bdslPackage.CONVEYOR_BELT__CONTAINSNAME_CONVEYOR_BELT);
		}
		return containsnameConveyorBelt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<minimalSeparationBetweenBatchesConveyorBelt> getContainsminimalSeparationBetweenBatchesConveyorBelt() {
		if (containsminimalSeparationBetweenBatchesConveyorBelt == null) {
			containsminimalSeparationBetweenBatchesConveyorBelt = new EObjectContainmentEList<minimalSeparationBetweenBatchesConveyorBelt>(minimalSeparationBetweenBatchesConveyorBelt.class, this, Metamodel_bdslPackage.CONVEYOR_BELT__CONTAINSMINIMAL_SEPARATION_BETWEEN_BATCHES_CONVEYOR_BELT);
		}
		return containsminimalSeparationBetweenBatchesConveyorBelt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Metamodel_bdslPackage.CONVEYOR_BELT__OUTPUT:
				return basicSetOutput(null, msgs);
			case Metamodel_bdslPackage.CONVEYOR_BELT__CONTAINSNAME_CONVEYOR_BELT:
				return ((InternalEList<?>)getContainsnameConveyorBelt()).basicRemove(otherEnd, msgs);
			case Metamodel_bdslPackage.CONVEYOR_BELT__CONTAINSMINIMAL_SEPARATION_BETWEEN_BATCHES_CONVEYOR_BELT:
				return ((InternalEList<?>)getContainsminimalSeparationBetweenBatchesConveyorBelt()).basicRemove(otherEnd, msgs);
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
			case Metamodel_bdslPackage.CONVEYOR_BELT__NONE_ELEMENT:
				return getNoneElement();
			case Metamodel_bdslPackage.CONVEYOR_BELT__MINIMAL_SEPARATION_BETWEEN_BATCHES:
				return getMinimalSeparationBetweenBatches();
			case Metamodel_bdslPackage.CONVEYOR_BELT__OUTPUT:
				return getOutput();
			case Metamodel_bdslPackage.CONVEYOR_BELT__CONTAINSNAME_CONVEYOR_BELT:
				return getContainsnameConveyorBelt();
			case Metamodel_bdslPackage.CONVEYOR_BELT__CONTAINSMINIMAL_SEPARATION_BETWEEN_BATCHES_CONVEYOR_BELT:
				return getContainsminimalSeparationBetweenBatchesConveyorBelt();
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
			case Metamodel_bdslPackage.CONVEYOR_BELT__NONE_ELEMENT:
				getNoneElement().clear();
				getNoneElement().addAll((Collection<? extends NoneElement>)newValue);
				return;
			case Metamodel_bdslPackage.CONVEYOR_BELT__MINIMAL_SEPARATION_BETWEEN_BATCHES:
				setMinimalSeparationBetweenBatches((Double)newValue);
				return;
			case Metamodel_bdslPackage.CONVEYOR_BELT__OUTPUT:
				setOutput((Output)newValue);
				return;
			case Metamodel_bdslPackage.CONVEYOR_BELT__CONTAINSNAME_CONVEYOR_BELT:
				getContainsnameConveyorBelt().clear();
				getContainsnameConveyorBelt().addAll((Collection<? extends nameConveyorBelt>)newValue);
				return;
			case Metamodel_bdslPackage.CONVEYOR_BELT__CONTAINSMINIMAL_SEPARATION_BETWEEN_BATCHES_CONVEYOR_BELT:
				getContainsminimalSeparationBetweenBatchesConveyorBelt().clear();
				getContainsminimalSeparationBetweenBatchesConveyorBelt().addAll((Collection<? extends minimalSeparationBetweenBatchesConveyorBelt>)newValue);
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
			case Metamodel_bdslPackage.CONVEYOR_BELT__NONE_ELEMENT:
				getNoneElement().clear();
				return;
			case Metamodel_bdslPackage.CONVEYOR_BELT__MINIMAL_SEPARATION_BETWEEN_BATCHES:
				setMinimalSeparationBetweenBatches(MINIMAL_SEPARATION_BETWEEN_BATCHES_EDEFAULT);
				return;
			case Metamodel_bdslPackage.CONVEYOR_BELT__OUTPUT:
				setOutput((Output)null);
				return;
			case Metamodel_bdslPackage.CONVEYOR_BELT__CONTAINSNAME_CONVEYOR_BELT:
				getContainsnameConveyorBelt().clear();
				return;
			case Metamodel_bdslPackage.CONVEYOR_BELT__CONTAINSMINIMAL_SEPARATION_BETWEEN_BATCHES_CONVEYOR_BELT:
				getContainsminimalSeparationBetweenBatchesConveyorBelt().clear();
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
			case Metamodel_bdslPackage.CONVEYOR_BELT__NONE_ELEMENT:
				return noneElement != null && !noneElement.isEmpty();
			case Metamodel_bdslPackage.CONVEYOR_BELT__MINIMAL_SEPARATION_BETWEEN_BATCHES:
				return MINIMAL_SEPARATION_BETWEEN_BATCHES_EDEFAULT == null ? minimalSeparationBetweenBatches != null : !MINIMAL_SEPARATION_BETWEEN_BATCHES_EDEFAULT.equals(minimalSeparationBetweenBatches);
			case Metamodel_bdslPackage.CONVEYOR_BELT__OUTPUT:
				return output != null;
			case Metamodel_bdslPackage.CONVEYOR_BELT__CONTAINSNAME_CONVEYOR_BELT:
				return containsnameConveyorBelt != null && !containsnameConveyorBelt.isEmpty();
			case Metamodel_bdslPackage.CONVEYOR_BELT__CONTAINSMINIMAL_SEPARATION_BETWEEN_BATCHES_CONVEYOR_BELT:
				return containsminimalSeparationBetweenBatchesConveyorBelt != null && !containsminimalSeparationBetweenBatchesConveyorBelt.isEmpty();
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
				case Metamodel_bdslPackage.CONVEYOR_BELT__NONE_ELEMENT: return Metamodel_bdslPackage.BINDING_ELEMENT__NONE_ELEMENT;
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
				case Metamodel_bdslPackage.BINDING_ELEMENT__NONE_ELEMENT: return Metamodel_bdslPackage.CONVEYOR_BELT__NONE_ELEMENT;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (minimalSeparationBetweenBatches: ");
		result.append(minimalSeparationBetweenBatches);
		result.append(')');
		return result.toString();
	}

} //ConveyorBeltImpl
