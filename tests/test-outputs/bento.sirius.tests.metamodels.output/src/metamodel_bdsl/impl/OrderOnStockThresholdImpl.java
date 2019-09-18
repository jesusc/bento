/**
 */
package metamodel_bdsl.impl;

import java.util.Collection;

import metamodel_bdsl.Metamodel_bdslPackage;
import metamodel_bdsl.OrderOnStockThreshold;
import metamodel_bdsl.OrderType;
import metamodel_bdsl.Storage;
import metamodel_bdsl.Supplier;
import metamodel_bdsl.nameOrderOnStockThreshold;
import metamodel_bdsl.orderQuantityOrderOnStockThreshold;
import metamodel_bdsl.orderTypeOrderOnStockThreshold;
import metamodel_bdsl.periodOrderOnStockThreshold;
import metamodel_bdsl.storageOrderOnStockThreshold82;
import metamodel_bdsl.supplierOrderOnStockThreshold81;
import metamodel_bdsl.thresholdOrderOnStockThreshold;

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
 * An implementation of the model object '<em><b>Order On Stock Threshold</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metamodel_bdsl.impl.OrderOnStockThresholdImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.OrderOnStockThresholdImpl#getThreshold <em>Threshold</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.OrderOnStockThresholdImpl#getName <em>Name</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.OrderOnStockThresholdImpl#getOrderQuantity <em>Order Quantity</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.OrderOnStockThresholdImpl#getOrderType <em>Order Type</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.OrderOnStockThresholdImpl#getSupplier <em>Supplier</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.OrderOnStockThresholdImpl#getStorage <em>Storage</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.OrderOnStockThresholdImpl#getEref_supplierOrderOnStockThreshold81 <em>Eref supplier Order On Stock Threshold81</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.OrderOnStockThresholdImpl#getEref_storageOrderOnStockThreshold82 <em>Eref storage Order On Stock Threshold82</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.OrderOnStockThresholdImpl#getContainsperiodOrderOnStockThreshold <em>Containsperiod Order On Stock Threshold</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.OrderOnStockThresholdImpl#getContainsthresholdOrderOnStockThreshold <em>Containsthreshold Order On Stock Threshold</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.OrderOnStockThresholdImpl#getContainsnameOrderOnStockThreshold <em>Containsname Order On Stock Threshold</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.OrderOnStockThresholdImpl#getContainsorderQuantityOrderOnStockThreshold <em>Containsorder Quantity Order On Stock Threshold</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.OrderOnStockThresholdImpl#getContainsorderTypeOrderOnStockThreshold <em>Containsorder Type Order On Stock Threshold</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderOnStockThresholdImpl extends BindingElementImpl implements OrderOnStockThreshold {
	/**
	 * The default value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final Double PERIOD_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected Double period = PERIOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getThreshold() <em>Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final Integer THRESHOLD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getThreshold() <em>Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreshold()
	 * @generated
	 * @ordered
	 */
	protected Integer threshold = THRESHOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrderQuantity() <em>Order Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ORDER_QUANTITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOrderQuantity() <em>Order Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderQuantity()
	 * @generated
	 * @ordered
	 */
	protected Integer orderQuantity = ORDER_QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrderType() <em>Order Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderType()
	 * @generated
	 * @ordered
	 */
	protected static final OrderType ORDER_TYPE_EDEFAULT = OrderType.FIXED;

	/**
	 * The cached value of the '{@link #getOrderType() <em>Order Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderType()
	 * @generated
	 * @ordered
	 */
	protected OrderType orderType = ORDER_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSupplier() <em>Supplier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplier()
	 * @generated
	 * @ordered
	 */
	protected Supplier supplier;

	/**
	 * The cached value of the '{@link #getStorage() <em>Storage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorage()
	 * @generated
	 * @ordered
	 */
	protected Storage storage;

	/**
	 * The cached value of the '{@link #getEref_supplierOrderOnStockThreshold81() <em>Eref supplier Order On Stock Threshold81</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEref_supplierOrderOnStockThreshold81()
	 * @generated
	 * @ordered
	 */
	protected supplierOrderOnStockThreshold81 eref_supplierOrderOnStockThreshold81;

	/**
	 * The cached value of the '{@link #getEref_storageOrderOnStockThreshold82() <em>Eref storage Order On Stock Threshold82</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEref_storageOrderOnStockThreshold82()
	 * @generated
	 * @ordered
	 */
	protected storageOrderOnStockThreshold82 eref_storageOrderOnStockThreshold82;

	/**
	 * The cached value of the '{@link #getContainsperiodOrderOnStockThreshold() <em>Containsperiod Order On Stock Threshold</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsperiodOrderOnStockThreshold()
	 * @generated
	 * @ordered
	 */
	protected EList<periodOrderOnStockThreshold> containsperiodOrderOnStockThreshold;

	/**
	 * The cached value of the '{@link #getContainsthresholdOrderOnStockThreshold() <em>Containsthreshold Order On Stock Threshold</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsthresholdOrderOnStockThreshold()
	 * @generated
	 * @ordered
	 */
	protected EList<thresholdOrderOnStockThreshold> containsthresholdOrderOnStockThreshold;

	/**
	 * The cached value of the '{@link #getContainsnameOrderOnStockThreshold() <em>Containsname Order On Stock Threshold</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsnameOrderOnStockThreshold()
	 * @generated
	 * @ordered
	 */
	protected EList<nameOrderOnStockThreshold> containsnameOrderOnStockThreshold;

	/**
	 * The cached value of the '{@link #getContainsorderQuantityOrderOnStockThreshold() <em>Containsorder Quantity Order On Stock Threshold</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsorderQuantityOrderOnStockThreshold()
	 * @generated
	 * @ordered
	 */
	protected EList<orderQuantityOrderOnStockThreshold> containsorderQuantityOrderOnStockThreshold;

	/**
	 * The cached value of the '{@link #getContainsorderTypeOrderOnStockThreshold() <em>Containsorder Type Order On Stock Threshold</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsorderTypeOrderOnStockThreshold()
	 * @generated
	 * @ordered
	 */
	protected EList<orderTypeOrderOnStockThreshold> containsorderTypeOrderOnStockThreshold;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderOnStockThresholdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Metamodel_bdslPackage.Literals.ORDER_ON_STOCK_THRESHOLD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(Double newPeriod) {
		Double oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__PERIOD, oldPeriod, period));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getThreshold() {
		return threshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThreshold(Integer newThreshold) {
		Integer oldThreshold = threshold;
		threshold = newThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__THRESHOLD, oldThreshold, threshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getOrderQuantity() {
		return orderQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderQuantity(Integer newOrderQuantity) {
		Integer oldOrderQuantity = orderQuantity;
		orderQuantity = newOrderQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__ORDER_QUANTITY, oldOrderQuantity, orderQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderType getOrderType() {
		return orderType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderType(OrderType newOrderType) {
		OrderType oldOrderType = orderType;
		orderType = newOrderType == null ? ORDER_TYPE_EDEFAULT : newOrderType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__ORDER_TYPE, oldOrderType, orderType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Supplier getSupplier() {
		if (supplier != null && supplier.eIsProxy()) {
			InternalEObject oldSupplier = (InternalEObject)supplier;
			supplier = (Supplier)eResolveProxy(oldSupplier);
			if (supplier != oldSupplier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__SUPPLIER, oldSupplier, supplier));
			}
		}
		return supplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Supplier basicGetSupplier() {
		return supplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupplier(Supplier newSupplier, NotificationChain msgs) {
		Supplier oldSupplier = supplier;
		supplier = newSupplier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__SUPPLIER, oldSupplier, newSupplier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupplier(Supplier newSupplier) {
		if (newSupplier != supplier) {
			NotificationChain msgs = null;
			if (supplier != null)
				msgs = ((InternalEObject)supplier).eInverseRemove(this, Metamodel_bdslPackage.SUPPLIER__REFILL_POLICY, Supplier.class, msgs);
			if (newSupplier != null)
				msgs = ((InternalEObject)newSupplier).eInverseAdd(this, Metamodel_bdslPackage.SUPPLIER__REFILL_POLICY, Supplier.class, msgs);
			msgs = basicSetSupplier(newSupplier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__SUPPLIER, newSupplier, newSupplier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Storage getStorage() {
		if (storage != null && storage.eIsProxy()) {
			InternalEObject oldStorage = (InternalEObject)storage;
			storage = (Storage)eResolveProxy(oldStorage);
			if (storage != oldStorage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__STORAGE, oldStorage, storage));
			}
		}
		return storage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Storage basicGetStorage() {
		return storage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStorage(Storage newStorage, NotificationChain msgs) {
		Storage oldStorage = storage;
		storage = newStorage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__STORAGE, oldStorage, newStorage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStorage(Storage newStorage) {
		if (newStorage != storage) {
			NotificationChain msgs = null;
			if (storage != null)
				msgs = ((InternalEObject)storage).eInverseRemove(this, Metamodel_bdslPackage.STORAGE__ORDER_ON_STOCK_THRESHOLD, Storage.class, msgs);
			if (newStorage != null)
				msgs = ((InternalEObject)newStorage).eInverseAdd(this, Metamodel_bdslPackage.STORAGE__ORDER_ON_STOCK_THRESHOLD, Storage.class, msgs);
			msgs = basicSetStorage(newStorage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__STORAGE, newStorage, newStorage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public supplierOrderOnStockThreshold81 getEref_supplierOrderOnStockThreshold81() {
		return eref_supplierOrderOnStockThreshold81;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEref_supplierOrderOnStockThreshold81(supplierOrderOnStockThreshold81 newEref_supplierOrderOnStockThreshold81, NotificationChain msgs) {
		supplierOrderOnStockThreshold81 oldEref_supplierOrderOnStockThreshold81 = eref_supplierOrderOnStockThreshold81;
		eref_supplierOrderOnStockThreshold81 = newEref_supplierOrderOnStockThreshold81;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__EREF_SUPPLIER_ORDER_ON_STOCK_THRESHOLD81, oldEref_supplierOrderOnStockThreshold81, newEref_supplierOrderOnStockThreshold81);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEref_supplierOrderOnStockThreshold81(supplierOrderOnStockThreshold81 newEref_supplierOrderOnStockThreshold81) {
		if (newEref_supplierOrderOnStockThreshold81 != eref_supplierOrderOnStockThreshold81) {
			NotificationChain msgs = null;
			if (eref_supplierOrderOnStockThreshold81 != null)
				msgs = ((InternalEObject)eref_supplierOrderOnStockThreshold81).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__EREF_SUPPLIER_ORDER_ON_STOCK_THRESHOLD81, null, msgs);
			if (newEref_supplierOrderOnStockThreshold81 != null)
				msgs = ((InternalEObject)newEref_supplierOrderOnStockThreshold81).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__EREF_SUPPLIER_ORDER_ON_STOCK_THRESHOLD81, null, msgs);
			msgs = basicSetEref_supplierOrderOnStockThreshold81(newEref_supplierOrderOnStockThreshold81, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__EREF_SUPPLIER_ORDER_ON_STOCK_THRESHOLD81, newEref_supplierOrderOnStockThreshold81, newEref_supplierOrderOnStockThreshold81));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public storageOrderOnStockThreshold82 getEref_storageOrderOnStockThreshold82() {
		return eref_storageOrderOnStockThreshold82;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEref_storageOrderOnStockThreshold82(storageOrderOnStockThreshold82 newEref_storageOrderOnStockThreshold82, NotificationChain msgs) {
		storageOrderOnStockThreshold82 oldEref_storageOrderOnStockThreshold82 = eref_storageOrderOnStockThreshold82;
		eref_storageOrderOnStockThreshold82 = newEref_storageOrderOnStockThreshold82;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__EREF_STORAGE_ORDER_ON_STOCK_THRESHOLD82, oldEref_storageOrderOnStockThreshold82, newEref_storageOrderOnStockThreshold82);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEref_storageOrderOnStockThreshold82(storageOrderOnStockThreshold82 newEref_storageOrderOnStockThreshold82) {
		if (newEref_storageOrderOnStockThreshold82 != eref_storageOrderOnStockThreshold82) {
			NotificationChain msgs = null;
			if (eref_storageOrderOnStockThreshold82 != null)
				msgs = ((InternalEObject)eref_storageOrderOnStockThreshold82).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__EREF_STORAGE_ORDER_ON_STOCK_THRESHOLD82, null, msgs);
			if (newEref_storageOrderOnStockThreshold82 != null)
				msgs = ((InternalEObject)newEref_storageOrderOnStockThreshold82).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__EREF_STORAGE_ORDER_ON_STOCK_THRESHOLD82, null, msgs);
			msgs = basicSetEref_storageOrderOnStockThreshold82(newEref_storageOrderOnStockThreshold82, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__EREF_STORAGE_ORDER_ON_STOCK_THRESHOLD82, newEref_storageOrderOnStockThreshold82, newEref_storageOrderOnStockThreshold82));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<periodOrderOnStockThreshold> getContainsperiodOrderOnStockThreshold() {
		if (containsperiodOrderOnStockThreshold == null) {
			containsperiodOrderOnStockThreshold = new EObjectContainmentEList<periodOrderOnStockThreshold>(periodOrderOnStockThreshold.class, this, Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__CONTAINSPERIOD_ORDER_ON_STOCK_THRESHOLD);
		}
		return containsperiodOrderOnStockThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<thresholdOrderOnStockThreshold> getContainsthresholdOrderOnStockThreshold() {
		if (containsthresholdOrderOnStockThreshold == null) {
			containsthresholdOrderOnStockThreshold = new EObjectContainmentEList<thresholdOrderOnStockThreshold>(thresholdOrderOnStockThreshold.class, this, Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__CONTAINSTHRESHOLD_ORDER_ON_STOCK_THRESHOLD);
		}
		return containsthresholdOrderOnStockThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<nameOrderOnStockThreshold> getContainsnameOrderOnStockThreshold() {
		if (containsnameOrderOnStockThreshold == null) {
			containsnameOrderOnStockThreshold = new EObjectContainmentEList<nameOrderOnStockThreshold>(nameOrderOnStockThreshold.class, this, Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__CONTAINSNAME_ORDER_ON_STOCK_THRESHOLD);
		}
		return containsnameOrderOnStockThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<orderQuantityOrderOnStockThreshold> getContainsorderQuantityOrderOnStockThreshold() {
		if (containsorderQuantityOrderOnStockThreshold == null) {
			containsorderQuantityOrderOnStockThreshold = new EObjectContainmentEList<orderQuantityOrderOnStockThreshold>(orderQuantityOrderOnStockThreshold.class, this, Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__CONTAINSORDER_QUANTITY_ORDER_ON_STOCK_THRESHOLD);
		}
		return containsorderQuantityOrderOnStockThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<orderTypeOrderOnStockThreshold> getContainsorderTypeOrderOnStockThreshold() {
		if (containsorderTypeOrderOnStockThreshold == null) {
			containsorderTypeOrderOnStockThreshold = new EObjectContainmentEList<orderTypeOrderOnStockThreshold>(orderTypeOrderOnStockThreshold.class, this, Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__CONTAINSORDER_TYPE_ORDER_ON_STOCK_THRESHOLD);
		}
		return containsorderTypeOrderOnStockThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__SUPPLIER:
				if (supplier != null)
					msgs = ((InternalEObject)supplier).eInverseRemove(this, Metamodel_bdslPackage.SUPPLIER__REFILL_POLICY, Supplier.class, msgs);
				return basicSetSupplier((Supplier)otherEnd, msgs);
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__STORAGE:
				if (storage != null)
					msgs = ((InternalEObject)storage).eInverseRemove(this, Metamodel_bdslPackage.STORAGE__ORDER_ON_STOCK_THRESHOLD, Storage.class, msgs);
				return basicSetStorage((Storage)otherEnd, msgs);
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
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__SUPPLIER:
				return basicSetSupplier(null, msgs);
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__STORAGE:
				return basicSetStorage(null, msgs);
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__EREF_SUPPLIER_ORDER_ON_STOCK_THRESHOLD81:
				return basicSetEref_supplierOrderOnStockThreshold81(null, msgs);
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__EREF_STORAGE_ORDER_ON_STOCK_THRESHOLD82:
				return basicSetEref_storageOrderOnStockThreshold82(null, msgs);
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__CONTAINSPERIOD_ORDER_ON_STOCK_THRESHOLD:
				return ((InternalEList<?>)getContainsperiodOrderOnStockThreshold()).basicRemove(otherEnd, msgs);
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__CONTAINSTHRESHOLD_ORDER_ON_STOCK_THRESHOLD:
				return ((InternalEList<?>)getContainsthresholdOrderOnStockThreshold()).basicRemove(otherEnd, msgs);
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__CONTAINSNAME_ORDER_ON_STOCK_THRESHOLD:
				return ((InternalEList<?>)getContainsnameOrderOnStockThreshold()).basicRemove(otherEnd, msgs);
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__CONTAINSORDER_QUANTITY_ORDER_ON_STOCK_THRESHOLD:
				return ((InternalEList<?>)getContainsorderQuantityOrderOnStockThreshold()).basicRemove(otherEnd, msgs);
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__CONTAINSORDER_TYPE_ORDER_ON_STOCK_THRESHOLD:
				return ((InternalEList<?>)getContainsorderTypeOrderOnStockThreshold()).basicRemove(otherEnd, msgs);
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
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__PERIOD:
				return getPeriod();
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__THRESHOLD:
				return getThreshold();
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__NAME:
				return getName();
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__ORDER_QUANTITY:
				return getOrderQuantity();
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__ORDER_TYPE:
				return getOrderType();
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__SUPPLIER:
				if (resolve) return getSupplier();
				return basicGetSupplier();
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__STORAGE:
				if (resolve) return getStorage();
				return basicGetStorage();
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__EREF_SUPPLIER_ORDER_ON_STOCK_THRESHOLD81:
				return getEref_supplierOrderOnStockThreshold81();
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__EREF_STORAGE_ORDER_ON_STOCK_THRESHOLD82:
				return getEref_storageOrderOnStockThreshold82();
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__CONTAINSPERIOD_ORDER_ON_STOCK_THRESHOLD:
				return getContainsperiodOrderOnStockThreshold();
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__CONTAINSTHRESHOLD_ORDER_ON_STOCK_THRESHOLD:
				return getContainsthresholdOrderOnStockThreshold();
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__CONTAINSNAME_ORDER_ON_STOCK_THRESHOLD:
				return getContainsnameOrderOnStockThreshold();
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__CONTAINSORDER_QUANTITY_ORDER_ON_STOCK_THRESHOLD:
				return getContainsorderQuantityOrderOnStockThreshold();
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__CONTAINSORDER_TYPE_ORDER_ON_STOCK_THRESHOLD:
				return getContainsorderTypeOrderOnStockThreshold();
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
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__PERIOD:
				setPeriod((Double)newValue);
				return;
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__THRESHOLD:
				setThreshold((Integer)newValue);
				return;
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__NAME:
				setName((String)newValue);
				return;
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__ORDER_QUANTITY:
				setOrderQuantity((Integer)newValue);
				return;
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__ORDER_TYPE:
				setOrderType((OrderType)newValue);
				return;
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__SUPPLIER:
				setSupplier((Supplier)newValue);
				return;
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__STORAGE:
				setStorage((Storage)newValue);
				return;
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__EREF_SUPPLIER_ORDER_ON_STOCK_THRESHOLD81:
				setEref_supplierOrderOnStockThreshold81((supplierOrderOnStockThreshold81)newValue);
				return;
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__EREF_STORAGE_ORDER_ON_STOCK_THRESHOLD82:
				setEref_storageOrderOnStockThreshold82((storageOrderOnStockThreshold82)newValue);
				return;
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__CONTAINSPERIOD_ORDER_ON_STOCK_THRESHOLD:
				getContainsperiodOrderOnStockThreshold().clear();
				getContainsperiodOrderOnStockThreshold().addAll((Collection<? extends periodOrderOnStockThreshold>)newValue);
				return;
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__CONTAINSTHRESHOLD_ORDER_ON_STOCK_THRESHOLD:
				getContainsthresholdOrderOnStockThreshold().clear();
				getContainsthresholdOrderOnStockThreshold().addAll((Collection<? extends thresholdOrderOnStockThreshold>)newValue);
				return;
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__CONTAINSNAME_ORDER_ON_STOCK_THRESHOLD:
				getContainsnameOrderOnStockThreshold().clear();
				getContainsnameOrderOnStockThreshold().addAll((Collection<? extends nameOrderOnStockThreshold>)newValue);
				return;
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__CONTAINSORDER_QUANTITY_ORDER_ON_STOCK_THRESHOLD:
				getContainsorderQuantityOrderOnStockThreshold().clear();
				getContainsorderQuantityOrderOnStockThreshold().addAll((Collection<? extends orderQuantityOrderOnStockThreshold>)newValue);
				return;
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__CONTAINSORDER_TYPE_ORDER_ON_STOCK_THRESHOLD:
				getContainsorderTypeOrderOnStockThreshold().clear();
				getContainsorderTypeOrderOnStockThreshold().addAll((Collection<? extends orderTypeOrderOnStockThreshold>)newValue);
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
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__PERIOD:
				setPeriod(PERIOD_EDEFAULT);
				return;
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__THRESHOLD:
				setThreshold(THRESHOLD_EDEFAULT);
				return;
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__ORDER_QUANTITY:
				setOrderQuantity(ORDER_QUANTITY_EDEFAULT);
				return;
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__ORDER_TYPE:
				setOrderType(ORDER_TYPE_EDEFAULT);
				return;
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__SUPPLIER:
				setSupplier((Supplier)null);
				return;
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__STORAGE:
				setStorage((Storage)null);
				return;
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__EREF_SUPPLIER_ORDER_ON_STOCK_THRESHOLD81:
				setEref_supplierOrderOnStockThreshold81((supplierOrderOnStockThreshold81)null);
				return;
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__EREF_STORAGE_ORDER_ON_STOCK_THRESHOLD82:
				setEref_storageOrderOnStockThreshold82((storageOrderOnStockThreshold82)null);
				return;
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__CONTAINSPERIOD_ORDER_ON_STOCK_THRESHOLD:
				getContainsperiodOrderOnStockThreshold().clear();
				return;
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__CONTAINSTHRESHOLD_ORDER_ON_STOCK_THRESHOLD:
				getContainsthresholdOrderOnStockThreshold().clear();
				return;
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__CONTAINSNAME_ORDER_ON_STOCK_THRESHOLD:
				getContainsnameOrderOnStockThreshold().clear();
				return;
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__CONTAINSORDER_QUANTITY_ORDER_ON_STOCK_THRESHOLD:
				getContainsorderQuantityOrderOnStockThreshold().clear();
				return;
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__CONTAINSORDER_TYPE_ORDER_ON_STOCK_THRESHOLD:
				getContainsorderTypeOrderOnStockThreshold().clear();
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
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__PERIOD:
				return PERIOD_EDEFAULT == null ? period != null : !PERIOD_EDEFAULT.equals(period);
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__THRESHOLD:
				return THRESHOLD_EDEFAULT == null ? threshold != null : !THRESHOLD_EDEFAULT.equals(threshold);
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__ORDER_QUANTITY:
				return ORDER_QUANTITY_EDEFAULT == null ? orderQuantity != null : !ORDER_QUANTITY_EDEFAULT.equals(orderQuantity);
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__ORDER_TYPE:
				return orderType != ORDER_TYPE_EDEFAULT;
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__SUPPLIER:
				return supplier != null;
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__STORAGE:
				return storage != null;
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__EREF_SUPPLIER_ORDER_ON_STOCK_THRESHOLD81:
				return eref_supplierOrderOnStockThreshold81 != null;
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__EREF_STORAGE_ORDER_ON_STOCK_THRESHOLD82:
				return eref_storageOrderOnStockThreshold82 != null;
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__CONTAINSPERIOD_ORDER_ON_STOCK_THRESHOLD:
				return containsperiodOrderOnStockThreshold != null && !containsperiodOrderOnStockThreshold.isEmpty();
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__CONTAINSTHRESHOLD_ORDER_ON_STOCK_THRESHOLD:
				return containsthresholdOrderOnStockThreshold != null && !containsthresholdOrderOnStockThreshold.isEmpty();
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__CONTAINSNAME_ORDER_ON_STOCK_THRESHOLD:
				return containsnameOrderOnStockThreshold != null && !containsnameOrderOnStockThreshold.isEmpty();
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__CONTAINSORDER_QUANTITY_ORDER_ON_STOCK_THRESHOLD:
				return containsorderQuantityOrderOnStockThreshold != null && !containsorderQuantityOrderOnStockThreshold.isEmpty();
			case Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__CONTAINSORDER_TYPE_ORDER_ON_STOCK_THRESHOLD:
				return containsorderTypeOrderOnStockThreshold != null && !containsorderTypeOrderOnStockThreshold.isEmpty();
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
		result.append(" (period: ");
		result.append(period);
		result.append(", threshold: ");
		result.append(threshold);
		result.append(", name: ");
		result.append(name);
		result.append(", orderQuantity: ");
		result.append(orderQuantity);
		result.append(", orderType: ");
		result.append(orderType);
		result.append(')');
		return result.toString();
	}

} //OrderOnStockThresholdImpl
