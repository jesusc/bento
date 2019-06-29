/**
 */
package metamodel.impl;

import java.util.Collection;

import metamodel.MetamodelPackage;
import metamodel.OrderOnStockThreshold;
import metamodel.Probability;
import metamodel.Supplier;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
 *   <li>{@link metamodel.impl.SupplierImpl#getDeliveredPercentage <em>Delivered Percentage</em>}</li>
 *   <li>{@link metamodel.impl.SupplierImpl#getRefillPolicy <em>Refill Policy</em>}</li>
 *   <li>{@link metamodel.impl.SupplierImpl#getSupplierDelay <em>Supplier Delay</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SupplierImpl extends ComponentImpl implements Supplier {
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
		return MetamodelPackage.Literals.SUPPLIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getDeliveredPercentage() {
		return deliveredPercentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeliveredPercentage(Double newDeliveredPercentage) {
		Double oldDeliveredPercentage = deliveredPercentage;
		deliveredPercentage = newDeliveredPercentage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.SUPPLIER__DELIVERED_PERCENTAGE, oldDeliveredPercentage, deliveredPercentage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OrderOnStockThreshold> getRefillPolicy() {
		if (refillPolicy == null) {
			refillPolicy = new EObjectWithInverseResolvingEList<OrderOnStockThreshold>(OrderOnStockThreshold.class, this, MetamodelPackage.SUPPLIER__REFILL_POLICY, MetamodelPackage.ORDER_ON_STOCK_THRESHOLD__SUPPLIER);
		}
		return refillPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetamodelPackage.SUPPLIER__SUPPLIER_DELAY, oldSupplierDelay, newSupplierDelay);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupplierDelay(Probability newSupplierDelay) {
		if (newSupplierDelay != supplierDelay) {
			NotificationChain msgs = null;
			if (supplierDelay != null)
				msgs = ((InternalEObject)supplierDelay).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetamodelPackage.SUPPLIER__SUPPLIER_DELAY, null, msgs);
			if (newSupplierDelay != null)
				msgs = ((InternalEObject)newSupplierDelay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetamodelPackage.SUPPLIER__SUPPLIER_DELAY, null, msgs);
			msgs = basicSetSupplierDelay(newSupplierDelay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.SUPPLIER__SUPPLIER_DELAY, newSupplierDelay, newSupplierDelay));
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
			case MetamodelPackage.SUPPLIER__REFILL_POLICY:
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
			case MetamodelPackage.SUPPLIER__REFILL_POLICY:
				return ((InternalEList<?>)getRefillPolicy()).basicRemove(otherEnd, msgs);
			case MetamodelPackage.SUPPLIER__SUPPLIER_DELAY:
				return basicSetSupplierDelay(null, msgs);
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
			case MetamodelPackage.SUPPLIER__DELIVERED_PERCENTAGE:
				return getDeliveredPercentage();
			case MetamodelPackage.SUPPLIER__REFILL_POLICY:
				return getRefillPolicy();
			case MetamodelPackage.SUPPLIER__SUPPLIER_DELAY:
				return getSupplierDelay();
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
			case MetamodelPackage.SUPPLIER__DELIVERED_PERCENTAGE:
				setDeliveredPercentage((Double)newValue);
				return;
			case MetamodelPackage.SUPPLIER__REFILL_POLICY:
				getRefillPolicy().clear();
				getRefillPolicy().addAll((Collection<? extends OrderOnStockThreshold>)newValue);
				return;
			case MetamodelPackage.SUPPLIER__SUPPLIER_DELAY:
				setSupplierDelay((Probability)newValue);
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
			case MetamodelPackage.SUPPLIER__DELIVERED_PERCENTAGE:
				setDeliveredPercentage(DELIVERED_PERCENTAGE_EDEFAULT);
				return;
			case MetamodelPackage.SUPPLIER__REFILL_POLICY:
				getRefillPolicy().clear();
				return;
			case MetamodelPackage.SUPPLIER__SUPPLIER_DELAY:
				setSupplierDelay((Probability)null);
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
			case MetamodelPackage.SUPPLIER__DELIVERED_PERCENTAGE:
				return DELIVERED_PERCENTAGE_EDEFAULT == null ? deliveredPercentage != null : !DELIVERED_PERCENTAGE_EDEFAULT.equals(deliveredPercentage);
			case MetamodelPackage.SUPPLIER__REFILL_POLICY:
				return refillPolicy != null && !refillPolicy.isEmpty();
			case MetamodelPackage.SUPPLIER__SUPPLIER_DELAY:
				return supplierDelay != null;
		}
		return super.eIsSet(featureID);
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
