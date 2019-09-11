/**
 */
package metamodel_bdsl.impl;

import java.util.Collection;

import metamodel_bdsl.BindingElement;
import metamodel_bdsl.Metamodel_bdslPackage;
import metamodel_bdsl.NoneElement;
import metamodel_bdsl.OrderOnStockThreshold;
import metamodel_bdsl.Probability;
import metamodel_bdsl.Supplier;
import metamodel_bdsl.deliveredPercentageSupplier;
import metamodel_bdsl.nameSupplier;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Supplier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metamodel_bdsl.impl.SupplierImpl#getNoneElement <em>None Element</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.SupplierImpl#getDeliveredPercentage <em>Delivered Percentage</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.SupplierImpl#getRefillPolicy <em>Refill Policy</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.SupplierImpl#getSupplierDelay <em>Supplier Delay</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.SupplierImpl#getContainsnameSupplier <em>Containsname Supplier</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.SupplierImpl#getContainsdeliveredPercentageSupplier <em>Containsdelivered Percentage Supplier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SupplierImpl extends ComponentImpl implements Supplier {
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
	 * The default value of the '{@link #getDeliveredPercentage() <em>Delivered Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveredPercentage()
	 * @generated
	 * @ordered
	 */
	protected static final Double DELIVERED_PERCENTAGE_EDEFAULT = 100.0;

	/**
	 * The cached value of the '{@link #getDeliveredPercentage() <em>Delivered Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveredPercentage()
	 * @generated
	 * @ordered
	 */
	protected Double deliveredPercentage = DELIVERED_PERCENTAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRefillPolicy() <em>Refill Policy</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefillPolicy()
	 * @generated
	 * @ordered
	 */
	protected EList<OrderOnStockThreshold> refillPolicy;

	/**
	 * The cached value of the '{@link #getSupplierDelay() <em>Supplier Delay</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplierDelay()
	 * @generated
	 * @ordered
	 */
	protected Probability supplierDelay;

	/**
	 * The cached value of the '{@link #getContainsnameSupplier() <em>Containsname Supplier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsnameSupplier()
	 * @generated
	 * @ordered
	 */
	protected EList<nameSupplier> containsnameSupplier;

	/**
	 * The cached value of the '{@link #getContainsdeliveredPercentageSupplier() <em>Containsdelivered Percentage Supplier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsdeliveredPercentageSupplier()
	 * @generated
	 * @ordered
	 */
	protected EList<deliveredPercentageSupplier> containsdeliveredPercentageSupplier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupplierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Metamodel_bdslPackage.Literals.SUPPLIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NoneElement> getNoneElement() {
		if (noneElement == null) {
			noneElement = new EObjectResolvingEList<NoneElement>(NoneElement.class, this, Metamodel_bdslPackage.SUPPLIER__NONE_ELEMENT);
		}
		return noneElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getDeliveredPercentage() {
		return deliveredPercentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeliveredPercentage(Double newDeliveredPercentage) {
		Double oldDeliveredPercentage = deliveredPercentage;
		deliveredPercentage = newDeliveredPercentage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.SUPPLIER__DELIVERED_PERCENTAGE, oldDeliveredPercentage, deliveredPercentage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrderOnStockThreshold> getRefillPolicy() {
		if (refillPolicy == null) {
			refillPolicy = new EObjectWithInverseResolvingEList<OrderOnStockThreshold>(OrderOnStockThreshold.class, this, Metamodel_bdslPackage.SUPPLIER__REFILL_POLICY, Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__SUPPLIER);
		}
		return refillPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Probability getSupplierDelay() {
		return supplierDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupplierDelay(Probability newSupplierDelay, NotificationChain msgs) {
		Probability oldSupplierDelay = supplierDelay;
		supplierDelay = newSupplierDelay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.SUPPLIER__SUPPLIER_DELAY, oldSupplierDelay, newSupplierDelay);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupplierDelay(Probability newSupplierDelay) {
		if (newSupplierDelay != supplierDelay) {
			NotificationChain msgs = null;
			if (supplierDelay != null)
				msgs = ((InternalEObject)supplierDelay).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Metamodel_bdslPackage.SUPPLIER__SUPPLIER_DELAY, null, msgs);
			if (newSupplierDelay != null)
				msgs = ((InternalEObject)newSupplierDelay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Metamodel_bdslPackage.SUPPLIER__SUPPLIER_DELAY, null, msgs);
			msgs = basicSetSupplierDelay(newSupplierDelay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.SUPPLIER__SUPPLIER_DELAY, newSupplierDelay, newSupplierDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<nameSupplier> getContainsnameSupplier() {
		if (containsnameSupplier == null) {
			containsnameSupplier = new EObjectContainmentEList<nameSupplier>(nameSupplier.class, this, Metamodel_bdslPackage.SUPPLIER__CONTAINSNAME_SUPPLIER);
		}
		return containsnameSupplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<deliveredPercentageSupplier> getContainsdeliveredPercentageSupplier() {
		if (containsdeliveredPercentageSupplier == null) {
			containsdeliveredPercentageSupplier = new EObjectContainmentEList<deliveredPercentageSupplier>(deliveredPercentageSupplier.class, this, Metamodel_bdslPackage.SUPPLIER__CONTAINSDELIVERED_PERCENTAGE_SUPPLIER);
		}
		return containsdeliveredPercentageSupplier;
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
			case Metamodel_bdslPackage.SUPPLIER__REFILL_POLICY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRefillPolicy()).basicAdd(otherEnd, msgs);
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
			case Metamodel_bdslPackage.SUPPLIER__REFILL_POLICY:
				return ((InternalEList<?>)getRefillPolicy()).basicRemove(otherEnd, msgs);
			case Metamodel_bdslPackage.SUPPLIER__SUPPLIER_DELAY:
				return basicSetSupplierDelay(null, msgs);
			case Metamodel_bdslPackage.SUPPLIER__CONTAINSNAME_SUPPLIER:
				return ((InternalEList<?>)getContainsnameSupplier()).basicRemove(otherEnd, msgs);
			case Metamodel_bdslPackage.SUPPLIER__CONTAINSDELIVERED_PERCENTAGE_SUPPLIER:
				return ((InternalEList<?>)getContainsdeliveredPercentageSupplier()).basicRemove(otherEnd, msgs);
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
			case Metamodel_bdslPackage.SUPPLIER__NONE_ELEMENT:
				return getNoneElement();
			case Metamodel_bdslPackage.SUPPLIER__DELIVERED_PERCENTAGE:
				return getDeliveredPercentage();
			case Metamodel_bdslPackage.SUPPLIER__REFILL_POLICY:
				return getRefillPolicy();
			case Metamodel_bdslPackage.SUPPLIER__SUPPLIER_DELAY:
				return getSupplierDelay();
			case Metamodel_bdslPackage.SUPPLIER__CONTAINSNAME_SUPPLIER:
				return getContainsnameSupplier();
			case Metamodel_bdslPackage.SUPPLIER__CONTAINSDELIVERED_PERCENTAGE_SUPPLIER:
				return getContainsdeliveredPercentageSupplier();
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
			case Metamodel_bdslPackage.SUPPLIER__NONE_ELEMENT:
				getNoneElement().clear();
				getNoneElement().addAll((Collection<? extends NoneElement>)newValue);
				return;
			case Metamodel_bdslPackage.SUPPLIER__DELIVERED_PERCENTAGE:
				setDeliveredPercentage((Double)newValue);
				return;
			case Metamodel_bdslPackage.SUPPLIER__REFILL_POLICY:
				getRefillPolicy().clear();
				getRefillPolicy().addAll((Collection<? extends OrderOnStockThreshold>)newValue);
				return;
			case Metamodel_bdslPackage.SUPPLIER__SUPPLIER_DELAY:
				setSupplierDelay((Probability)newValue);
				return;
			case Metamodel_bdslPackage.SUPPLIER__CONTAINSNAME_SUPPLIER:
				getContainsnameSupplier().clear();
				getContainsnameSupplier().addAll((Collection<? extends nameSupplier>)newValue);
				return;
			case Metamodel_bdslPackage.SUPPLIER__CONTAINSDELIVERED_PERCENTAGE_SUPPLIER:
				getContainsdeliveredPercentageSupplier().clear();
				getContainsdeliveredPercentageSupplier().addAll((Collection<? extends deliveredPercentageSupplier>)newValue);
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
			case Metamodel_bdslPackage.SUPPLIER__NONE_ELEMENT:
				getNoneElement().clear();
				return;
			case Metamodel_bdslPackage.SUPPLIER__DELIVERED_PERCENTAGE:
				setDeliveredPercentage(DELIVERED_PERCENTAGE_EDEFAULT);
				return;
			case Metamodel_bdslPackage.SUPPLIER__REFILL_POLICY:
				getRefillPolicy().clear();
				return;
			case Metamodel_bdslPackage.SUPPLIER__SUPPLIER_DELAY:
				setSupplierDelay((Probability)null);
				return;
			case Metamodel_bdslPackage.SUPPLIER__CONTAINSNAME_SUPPLIER:
				getContainsnameSupplier().clear();
				return;
			case Metamodel_bdslPackage.SUPPLIER__CONTAINSDELIVERED_PERCENTAGE_SUPPLIER:
				getContainsdeliveredPercentageSupplier().clear();
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
			case Metamodel_bdslPackage.SUPPLIER__NONE_ELEMENT:
				return noneElement != null && !noneElement.isEmpty();
			case Metamodel_bdslPackage.SUPPLIER__DELIVERED_PERCENTAGE:
				return DELIVERED_PERCENTAGE_EDEFAULT == null ? deliveredPercentage != null : !DELIVERED_PERCENTAGE_EDEFAULT.equals(deliveredPercentage);
			case Metamodel_bdslPackage.SUPPLIER__REFILL_POLICY:
				return refillPolicy != null && !refillPolicy.isEmpty();
			case Metamodel_bdslPackage.SUPPLIER__SUPPLIER_DELAY:
				return supplierDelay != null;
			case Metamodel_bdslPackage.SUPPLIER__CONTAINSNAME_SUPPLIER:
				return containsnameSupplier != null && !containsnameSupplier.isEmpty();
			case Metamodel_bdslPackage.SUPPLIER__CONTAINSDELIVERED_PERCENTAGE_SUPPLIER:
				return containsdeliveredPercentageSupplier != null && !containsdeliveredPercentageSupplier.isEmpty();
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
				case Metamodel_bdslPackage.SUPPLIER__NONE_ELEMENT: return Metamodel_bdslPackage.BINDING_ELEMENT__NONE_ELEMENT;
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
				case Metamodel_bdslPackage.BINDING_ELEMENT__NONE_ELEMENT: return Metamodel_bdslPackage.SUPPLIER__NONE_ELEMENT;
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
		result.append(" (deliveredPercentage: ");
		result.append(deliveredPercentage);
		result.append(')');
		return result.toString();
	}

} //SupplierImpl
