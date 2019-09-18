/**
 */
package metamodel_bdsl.impl;

import java.util.Collection;

import metamodel_bdsl.BindingElement;
import metamodel_bdsl.Metamodel_bdslPackage;
import metamodel_bdsl.NoneElement;
import metamodel_bdsl.OrderOnStockThreshold;
import metamodel_bdsl.Probability;
import metamodel_bdsl.SiriusTag;
import metamodel_bdsl.Supplier;
import metamodel_bdsl.deliveredPercentageSupplier;
import metamodel_bdsl.nameSupplier;

import metamodel_bdsl.refillPolicySupplier31;
import metamodel_bdsl.supplierDelaySupplier32;
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
 *   <li>{@link metamodel_bdsl.impl.SupplierImpl#getContainsSiriusTag <em>Contains Sirius Tag</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.SupplierImpl#getNoneElement <em>None Element</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.SupplierImpl#getDeliveredPercentage <em>Delivered Percentage</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.SupplierImpl#getRefillPolicy <em>Refill Policy</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.SupplierImpl#getSupplierDelay <em>Supplier Delay</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.SupplierImpl#getEref_refillPolicySupplier31 <em>Eref refill Policy Supplier31</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.SupplierImpl#getEref_supplierDelaySupplier32 <em>Eref supplier Delay Supplier32</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.SupplierImpl#getContainsnameSupplier <em>Containsname Supplier</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.SupplierImpl#getContainsdeliveredPercentageSupplier <em>Containsdelivered Percentage Supplier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SupplierImpl extends ComponentImpl implements Supplier {
	/**
	 * The cached value of the '{@link #getContainsSiriusTag() <em>Contains Sirius Tag</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsSiriusTag()
	 * @generated
	 * @ordered
	 */
	protected EList<SiriusTag> containsSiriusTag;

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
	 * The cached value of the '{@link #getEref_refillPolicySupplier31() <em>Eref refill Policy Supplier31</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEref_refillPolicySupplier31()
	 * @generated
	 * @ordered
	 */
	protected refillPolicySupplier31 eref_refillPolicySupplier31;

	/**
	 * The cached value of the '{@link #getEref_supplierDelaySupplier32() <em>Eref supplier Delay Supplier32</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEref_supplierDelaySupplier32()
	 * @generated
	 * @ordered
	 */
	protected supplierDelaySupplier32 eref_supplierDelaySupplier32;

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
	public EList<SiriusTag> getContainsSiriusTag() {
		if (containsSiriusTag == null) {
			containsSiriusTag = new EObjectContainmentEList<SiriusTag>(SiriusTag.class, this, Metamodel_bdslPackage.SUPPLIER__CONTAINS_SIRIUS_TAG);
		}
		return containsSiriusTag;
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
	public refillPolicySupplier31 getEref_refillPolicySupplier31() {
		return eref_refillPolicySupplier31;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEref_refillPolicySupplier31(refillPolicySupplier31 newEref_refillPolicySupplier31, NotificationChain msgs) {
		refillPolicySupplier31 oldEref_refillPolicySupplier31 = eref_refillPolicySupplier31;
		eref_refillPolicySupplier31 = newEref_refillPolicySupplier31;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.SUPPLIER__EREF_REFILL_POLICY_SUPPLIER31, oldEref_refillPolicySupplier31, newEref_refillPolicySupplier31);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEref_refillPolicySupplier31(refillPolicySupplier31 newEref_refillPolicySupplier31) {
		if (newEref_refillPolicySupplier31 != eref_refillPolicySupplier31) {
			NotificationChain msgs = null;
			if (eref_refillPolicySupplier31 != null)
				msgs = ((InternalEObject)eref_refillPolicySupplier31).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Metamodel_bdslPackage.SUPPLIER__EREF_REFILL_POLICY_SUPPLIER31, null, msgs);
			if (newEref_refillPolicySupplier31 != null)
				msgs = ((InternalEObject)newEref_refillPolicySupplier31).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Metamodel_bdslPackage.SUPPLIER__EREF_REFILL_POLICY_SUPPLIER31, null, msgs);
			msgs = basicSetEref_refillPolicySupplier31(newEref_refillPolicySupplier31, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.SUPPLIER__EREF_REFILL_POLICY_SUPPLIER31, newEref_refillPolicySupplier31, newEref_refillPolicySupplier31));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public supplierDelaySupplier32 getEref_supplierDelaySupplier32() {
		return eref_supplierDelaySupplier32;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEref_supplierDelaySupplier32(supplierDelaySupplier32 newEref_supplierDelaySupplier32, NotificationChain msgs) {
		supplierDelaySupplier32 oldEref_supplierDelaySupplier32 = eref_supplierDelaySupplier32;
		eref_supplierDelaySupplier32 = newEref_supplierDelaySupplier32;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.SUPPLIER__EREF_SUPPLIER_DELAY_SUPPLIER32, oldEref_supplierDelaySupplier32, newEref_supplierDelaySupplier32);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEref_supplierDelaySupplier32(supplierDelaySupplier32 newEref_supplierDelaySupplier32) {
		if (newEref_supplierDelaySupplier32 != eref_supplierDelaySupplier32) {
			NotificationChain msgs = null;
			if (eref_supplierDelaySupplier32 != null)
				msgs = ((InternalEObject)eref_supplierDelaySupplier32).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Metamodel_bdslPackage.SUPPLIER__EREF_SUPPLIER_DELAY_SUPPLIER32, null, msgs);
			if (newEref_supplierDelaySupplier32 != null)
				msgs = ((InternalEObject)newEref_supplierDelaySupplier32).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Metamodel_bdslPackage.SUPPLIER__EREF_SUPPLIER_DELAY_SUPPLIER32, null, msgs);
			msgs = basicSetEref_supplierDelaySupplier32(newEref_supplierDelaySupplier32, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.SUPPLIER__EREF_SUPPLIER_DELAY_SUPPLIER32, newEref_supplierDelaySupplier32, newEref_supplierDelaySupplier32));
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
			case Metamodel_bdslPackage.SUPPLIER__CONTAINS_SIRIUS_TAG:
				return ((InternalEList<?>)getContainsSiriusTag()).basicRemove(otherEnd, msgs);
			case Metamodel_bdslPackage.SUPPLIER__REFILL_POLICY:
				return ((InternalEList<?>)getRefillPolicy()).basicRemove(otherEnd, msgs);
			case Metamodel_bdslPackage.SUPPLIER__SUPPLIER_DELAY:
				return basicSetSupplierDelay(null, msgs);
			case Metamodel_bdslPackage.SUPPLIER__EREF_REFILL_POLICY_SUPPLIER31:
				return basicSetEref_refillPolicySupplier31(null, msgs);
			case Metamodel_bdslPackage.SUPPLIER__EREF_SUPPLIER_DELAY_SUPPLIER32:
				return basicSetEref_supplierDelaySupplier32(null, msgs);
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
			case Metamodel_bdslPackage.SUPPLIER__CONTAINS_SIRIUS_TAG:
				return getContainsSiriusTag();
			case Metamodel_bdslPackage.SUPPLIER__NONE_ELEMENT:
				return getNoneElement();
			case Metamodel_bdslPackage.SUPPLIER__DELIVERED_PERCENTAGE:
				return getDeliveredPercentage();
			case Metamodel_bdslPackage.SUPPLIER__REFILL_POLICY:
				return getRefillPolicy();
			case Metamodel_bdslPackage.SUPPLIER__SUPPLIER_DELAY:
				return getSupplierDelay();
			case Metamodel_bdslPackage.SUPPLIER__EREF_REFILL_POLICY_SUPPLIER31:
				return getEref_refillPolicySupplier31();
			case Metamodel_bdslPackage.SUPPLIER__EREF_SUPPLIER_DELAY_SUPPLIER32:
				return getEref_supplierDelaySupplier32();
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
			case Metamodel_bdslPackage.SUPPLIER__CONTAINS_SIRIUS_TAG:
				getContainsSiriusTag().clear();
				getContainsSiriusTag().addAll((Collection<? extends SiriusTag>)newValue);
				return;
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
			case Metamodel_bdslPackage.SUPPLIER__EREF_REFILL_POLICY_SUPPLIER31:
				setEref_refillPolicySupplier31((refillPolicySupplier31)newValue);
				return;
			case Metamodel_bdslPackage.SUPPLIER__EREF_SUPPLIER_DELAY_SUPPLIER32:
				setEref_supplierDelaySupplier32((supplierDelaySupplier32)newValue);
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
			case Metamodel_bdslPackage.SUPPLIER__CONTAINS_SIRIUS_TAG:
				getContainsSiriusTag().clear();
				return;
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
			case Metamodel_bdslPackage.SUPPLIER__EREF_REFILL_POLICY_SUPPLIER31:
				setEref_refillPolicySupplier31((refillPolicySupplier31)null);
				return;
			case Metamodel_bdslPackage.SUPPLIER__EREF_SUPPLIER_DELAY_SUPPLIER32:
				setEref_supplierDelaySupplier32((supplierDelaySupplier32)null);
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
			case Metamodel_bdslPackage.SUPPLIER__CONTAINS_SIRIUS_TAG:
				return containsSiriusTag != null && !containsSiriusTag.isEmpty();
			case Metamodel_bdslPackage.SUPPLIER__NONE_ELEMENT:
				return noneElement != null && !noneElement.isEmpty();
			case Metamodel_bdslPackage.SUPPLIER__DELIVERED_PERCENTAGE:
				return DELIVERED_PERCENTAGE_EDEFAULT == null ? deliveredPercentage != null : !DELIVERED_PERCENTAGE_EDEFAULT.equals(deliveredPercentage);
			case Metamodel_bdslPackage.SUPPLIER__REFILL_POLICY:
				return refillPolicy != null && !refillPolicy.isEmpty();
			case Metamodel_bdslPackage.SUPPLIER__SUPPLIER_DELAY:
				return supplierDelay != null;
			case Metamodel_bdslPackage.SUPPLIER__EREF_REFILL_POLICY_SUPPLIER31:
				return eref_refillPolicySupplier31 != null;
			case Metamodel_bdslPackage.SUPPLIER__EREF_SUPPLIER_DELAY_SUPPLIER32:
				return eref_supplierDelaySupplier32 != null;
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
				case Metamodel_bdslPackage.SUPPLIER__CONTAINS_SIRIUS_TAG: return Metamodel_bdslPackage.BINDING_ELEMENT__CONTAINS_SIRIUS_TAG;
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
				case Metamodel_bdslPackage.BINDING_ELEMENT__CONTAINS_SIRIUS_TAG: return Metamodel_bdslPackage.SUPPLIER__CONTAINS_SIRIUS_TAG;
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
