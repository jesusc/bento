/**
 */
package metamodel_bdsl.impl;

import java.util.Collection;

import metamodel_bdsl.BindingElement;
import metamodel_bdsl.Metamodel_bdslPackage;
import metamodel_bdsl.NoneElement;
import metamodel_bdsl.OrderOnStockThreshold;
import metamodel_bdsl.ProcessOutputFlow;
import metamodel_bdsl.SiriusTag;
import metamodel_bdsl.Storage;
import metamodel_bdsl.StorageOutputFlow;
import metamodel_bdsl.initialContentStorage;
import metamodel_bdsl.nameStorage;
import metamodel_bdsl.orderOnStockThresholdStorage22;
import metamodel_bdsl.overflowStorage;
import metamodel_bdsl.processOutputFlowStorage23;
import metamodel_bdsl.sizeStorage;

import metamodel_bdsl.storageOutputFlowStorage21;
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
 * An implementation of the model object '<em><b>Storage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metamodel_bdsl.impl.StorageImpl#getContainsSiriusTag <em>Contains Sirius Tag</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.StorageImpl#getNoneElement <em>None Element</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.StorageImpl#getSize <em>Size</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.StorageImpl#getInitialContent <em>Initial Content</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.StorageImpl#isOverflow <em>Overflow</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.StorageImpl#getStorageOutputFlow <em>Storage Output Flow</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.StorageImpl#getOrderOnStockThreshold <em>Order On Stock Threshold</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.StorageImpl#getProcessOutputFlow <em>Process Output Flow</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.StorageImpl#getEref_storageOutputFlowStorage21 <em>Eref storage Output Flow Storage21</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.StorageImpl#getEref_orderOnStockThresholdStorage22 <em>Eref order On Stock Threshold Storage22</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.StorageImpl#getEref_processOutputFlowStorage23 <em>Eref process Output Flow Storage23</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.StorageImpl#getContainsnameStorage <em>Containsname Storage</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.StorageImpl#getContainssizeStorage <em>Containssize Storage</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.StorageImpl#getContainsinitialContentStorage <em>Containsinitial Content Storage</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.StorageImpl#getContainsoverflowStorage <em>Containsoverflow Storage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StorageImpl extends ComponentImpl implements Storage {
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
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SIZE_EDEFAULT = 100;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected Integer size = SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitialContent() <em>Initial Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialContent()
	 * @generated
	 * @ordered
	 */
	protected static final Integer INITIAL_CONTENT_EDEFAULT = 100;

	/**
	 * The cached value of the '{@link #getInitialContent() <em>Initial Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialContent()
	 * @generated
	 * @ordered
	 */
	protected Integer initialContent = INITIAL_CONTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isOverflow() <em>Overflow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOverflow()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OVERFLOW_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOverflow() <em>Overflow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOverflow()
	 * @generated
	 * @ordered
	 */
	protected boolean overflow = OVERFLOW_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStorageOutputFlow() <em>Storage Output Flow</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageOutputFlow()
	 * @generated
	 * @ordered
	 */
	protected EList<StorageOutputFlow> storageOutputFlow;

	/**
	 * The cached value of the '{@link #getOrderOnStockThreshold() <em>Order On Stock Threshold</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderOnStockThreshold()
	 * @generated
	 * @ordered
	 */
	protected EList<OrderOnStockThreshold> orderOnStockThreshold;

	/**
	 * The cached value of the '{@link #getProcessOutputFlow() <em>Process Output Flow</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessOutputFlow()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessOutputFlow> processOutputFlow;

	/**
	 * The cached value of the '{@link #getEref_storageOutputFlowStorage21() <em>Eref storage Output Flow Storage21</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEref_storageOutputFlowStorage21()
	 * @generated
	 * @ordered
	 */
	protected storageOutputFlowStorage21 eref_storageOutputFlowStorage21;

	/**
	 * The cached value of the '{@link #getEref_orderOnStockThresholdStorage22() <em>Eref order On Stock Threshold Storage22</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEref_orderOnStockThresholdStorage22()
	 * @generated
	 * @ordered
	 */
	protected orderOnStockThresholdStorage22 eref_orderOnStockThresholdStorage22;

	/**
	 * The cached value of the '{@link #getEref_processOutputFlowStorage23() <em>Eref process Output Flow Storage23</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEref_processOutputFlowStorage23()
	 * @generated
	 * @ordered
	 */
	protected processOutputFlowStorage23 eref_processOutputFlowStorage23;

	/**
	 * The cached value of the '{@link #getContainsnameStorage() <em>Containsname Storage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsnameStorage()
	 * @generated
	 * @ordered
	 */
	protected EList<nameStorage> containsnameStorage;

	/**
	 * The cached value of the '{@link #getContainssizeStorage() <em>Containssize Storage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainssizeStorage()
	 * @generated
	 * @ordered
	 */
	protected EList<sizeStorage> containssizeStorage;

	/**
	 * The cached value of the '{@link #getContainsinitialContentStorage() <em>Containsinitial Content Storage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsinitialContentStorage()
	 * @generated
	 * @ordered
	 */
	protected EList<initialContentStorage> containsinitialContentStorage;

	/**
	 * The cached value of the '{@link #getContainsoverflowStorage() <em>Containsoverflow Storage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsoverflowStorage()
	 * @generated
	 * @ordered
	 */
	protected EList<overflowStorage> containsoverflowStorage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StorageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Metamodel_bdslPackage.Literals.STORAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SiriusTag> getContainsSiriusTag() {
		if (containsSiriusTag == null) {
			containsSiriusTag = new EObjectContainmentEList<SiriusTag>(SiriusTag.class, this, Metamodel_bdslPackage.STORAGE__CONTAINS_SIRIUS_TAG);
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
			noneElement = new EObjectResolvingEList<NoneElement>(NoneElement.class, this, Metamodel_bdslPackage.STORAGE__NONE_ELEMENT);
		}
		return noneElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(Integer newSize) {
		Integer oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.STORAGE__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getInitialContent() {
		return initialContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialContent(Integer newInitialContent) {
		Integer oldInitialContent = initialContent;
		initialContent = newInitialContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.STORAGE__INITIAL_CONTENT, oldInitialContent, initialContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOverflow() {
		return overflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverflow(boolean newOverflow) {
		boolean oldOverflow = overflow;
		overflow = newOverflow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.STORAGE__OVERFLOW, oldOverflow, overflow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StorageOutputFlow> getStorageOutputFlow() {
		if (storageOutputFlow == null) {
			storageOutputFlow = new EObjectWithInverseResolvingEList<StorageOutputFlow>(StorageOutputFlow.class, this, Metamodel_bdslPackage.STORAGE__STORAGE_OUTPUT_FLOW, Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW__SOURCE);
		}
		return storageOutputFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrderOnStockThreshold> getOrderOnStockThreshold() {
		if (orderOnStockThreshold == null) {
			orderOnStockThreshold = new EObjectWithInverseResolvingEList<OrderOnStockThreshold>(OrderOnStockThreshold.class, this, Metamodel_bdslPackage.STORAGE__ORDER_ON_STOCK_THRESHOLD, Metamodel_bdslPackage.ORDER_ON_STOCK_THRESHOLD__STORAGE);
		}
		return orderOnStockThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessOutputFlow> getProcessOutputFlow() {
		if (processOutputFlow == null) {
			processOutputFlow = new EObjectWithInverseResolvingEList<ProcessOutputFlow>(ProcessOutputFlow.class, this, Metamodel_bdslPackage.STORAGE__PROCESS_OUTPUT_FLOW, Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__DESTINATION);
		}
		return processOutputFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public storageOutputFlowStorage21 getEref_storageOutputFlowStorage21() {
		return eref_storageOutputFlowStorage21;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEref_storageOutputFlowStorage21(storageOutputFlowStorage21 newEref_storageOutputFlowStorage21, NotificationChain msgs) {
		storageOutputFlowStorage21 oldEref_storageOutputFlowStorage21 = eref_storageOutputFlowStorage21;
		eref_storageOutputFlowStorage21 = newEref_storageOutputFlowStorage21;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.STORAGE__EREF_STORAGE_OUTPUT_FLOW_STORAGE21, oldEref_storageOutputFlowStorage21, newEref_storageOutputFlowStorage21);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEref_storageOutputFlowStorage21(storageOutputFlowStorage21 newEref_storageOutputFlowStorage21) {
		if (newEref_storageOutputFlowStorage21 != eref_storageOutputFlowStorage21) {
			NotificationChain msgs = null;
			if (eref_storageOutputFlowStorage21 != null)
				msgs = ((InternalEObject)eref_storageOutputFlowStorage21).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Metamodel_bdslPackage.STORAGE__EREF_STORAGE_OUTPUT_FLOW_STORAGE21, null, msgs);
			if (newEref_storageOutputFlowStorage21 != null)
				msgs = ((InternalEObject)newEref_storageOutputFlowStorage21).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Metamodel_bdslPackage.STORAGE__EREF_STORAGE_OUTPUT_FLOW_STORAGE21, null, msgs);
			msgs = basicSetEref_storageOutputFlowStorage21(newEref_storageOutputFlowStorage21, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.STORAGE__EREF_STORAGE_OUTPUT_FLOW_STORAGE21, newEref_storageOutputFlowStorage21, newEref_storageOutputFlowStorage21));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public orderOnStockThresholdStorage22 getEref_orderOnStockThresholdStorage22() {
		return eref_orderOnStockThresholdStorage22;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEref_orderOnStockThresholdStorage22(orderOnStockThresholdStorage22 newEref_orderOnStockThresholdStorage22, NotificationChain msgs) {
		orderOnStockThresholdStorage22 oldEref_orderOnStockThresholdStorage22 = eref_orderOnStockThresholdStorage22;
		eref_orderOnStockThresholdStorage22 = newEref_orderOnStockThresholdStorage22;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.STORAGE__EREF_ORDER_ON_STOCK_THRESHOLD_STORAGE22, oldEref_orderOnStockThresholdStorage22, newEref_orderOnStockThresholdStorage22);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEref_orderOnStockThresholdStorage22(orderOnStockThresholdStorage22 newEref_orderOnStockThresholdStorage22) {
		if (newEref_orderOnStockThresholdStorage22 != eref_orderOnStockThresholdStorage22) {
			NotificationChain msgs = null;
			if (eref_orderOnStockThresholdStorage22 != null)
				msgs = ((InternalEObject)eref_orderOnStockThresholdStorage22).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Metamodel_bdslPackage.STORAGE__EREF_ORDER_ON_STOCK_THRESHOLD_STORAGE22, null, msgs);
			if (newEref_orderOnStockThresholdStorage22 != null)
				msgs = ((InternalEObject)newEref_orderOnStockThresholdStorage22).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Metamodel_bdslPackage.STORAGE__EREF_ORDER_ON_STOCK_THRESHOLD_STORAGE22, null, msgs);
			msgs = basicSetEref_orderOnStockThresholdStorage22(newEref_orderOnStockThresholdStorage22, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.STORAGE__EREF_ORDER_ON_STOCK_THRESHOLD_STORAGE22, newEref_orderOnStockThresholdStorage22, newEref_orderOnStockThresholdStorage22));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public processOutputFlowStorage23 getEref_processOutputFlowStorage23() {
		return eref_processOutputFlowStorage23;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEref_processOutputFlowStorage23(processOutputFlowStorage23 newEref_processOutputFlowStorage23, NotificationChain msgs) {
		processOutputFlowStorage23 oldEref_processOutputFlowStorage23 = eref_processOutputFlowStorage23;
		eref_processOutputFlowStorage23 = newEref_processOutputFlowStorage23;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.STORAGE__EREF_PROCESS_OUTPUT_FLOW_STORAGE23, oldEref_processOutputFlowStorage23, newEref_processOutputFlowStorage23);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEref_processOutputFlowStorage23(processOutputFlowStorage23 newEref_processOutputFlowStorage23) {
		if (newEref_processOutputFlowStorage23 != eref_processOutputFlowStorage23) {
			NotificationChain msgs = null;
			if (eref_processOutputFlowStorage23 != null)
				msgs = ((InternalEObject)eref_processOutputFlowStorage23).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Metamodel_bdslPackage.STORAGE__EREF_PROCESS_OUTPUT_FLOW_STORAGE23, null, msgs);
			if (newEref_processOutputFlowStorage23 != null)
				msgs = ((InternalEObject)newEref_processOutputFlowStorage23).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Metamodel_bdslPackage.STORAGE__EREF_PROCESS_OUTPUT_FLOW_STORAGE23, null, msgs);
			msgs = basicSetEref_processOutputFlowStorage23(newEref_processOutputFlowStorage23, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.STORAGE__EREF_PROCESS_OUTPUT_FLOW_STORAGE23, newEref_processOutputFlowStorage23, newEref_processOutputFlowStorage23));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<nameStorage> getContainsnameStorage() {
		if (containsnameStorage == null) {
			containsnameStorage = new EObjectContainmentEList<nameStorage>(nameStorage.class, this, Metamodel_bdslPackage.STORAGE__CONTAINSNAME_STORAGE);
		}
		return containsnameStorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<sizeStorage> getContainssizeStorage() {
		if (containssizeStorage == null) {
			containssizeStorage = new EObjectContainmentEList<sizeStorage>(sizeStorage.class, this, Metamodel_bdslPackage.STORAGE__CONTAINSSIZE_STORAGE);
		}
		return containssizeStorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<initialContentStorage> getContainsinitialContentStorage() {
		if (containsinitialContentStorage == null) {
			containsinitialContentStorage = new EObjectContainmentEList<initialContentStorage>(initialContentStorage.class, this, Metamodel_bdslPackage.STORAGE__CONTAINSINITIAL_CONTENT_STORAGE);
		}
		return containsinitialContentStorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<overflowStorage> getContainsoverflowStorage() {
		if (containsoverflowStorage == null) {
			containsoverflowStorage = new EObjectContainmentEList<overflowStorage>(overflowStorage.class, this, Metamodel_bdslPackage.STORAGE__CONTAINSOVERFLOW_STORAGE);
		}
		return containsoverflowStorage;
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
			case Metamodel_bdslPackage.STORAGE__STORAGE_OUTPUT_FLOW:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStorageOutputFlow()).basicAdd(otherEnd, msgs);
			case Metamodel_bdslPackage.STORAGE__ORDER_ON_STOCK_THRESHOLD:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOrderOnStockThreshold()).basicAdd(otherEnd, msgs);
			case Metamodel_bdslPackage.STORAGE__PROCESS_OUTPUT_FLOW:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProcessOutputFlow()).basicAdd(otherEnd, msgs);
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
			case Metamodel_bdslPackage.STORAGE__CONTAINS_SIRIUS_TAG:
				return ((InternalEList<?>)getContainsSiriusTag()).basicRemove(otherEnd, msgs);
			case Metamodel_bdslPackage.STORAGE__STORAGE_OUTPUT_FLOW:
				return ((InternalEList<?>)getStorageOutputFlow()).basicRemove(otherEnd, msgs);
			case Metamodel_bdslPackage.STORAGE__ORDER_ON_STOCK_THRESHOLD:
				return ((InternalEList<?>)getOrderOnStockThreshold()).basicRemove(otherEnd, msgs);
			case Metamodel_bdslPackage.STORAGE__PROCESS_OUTPUT_FLOW:
				return ((InternalEList<?>)getProcessOutputFlow()).basicRemove(otherEnd, msgs);
			case Metamodel_bdslPackage.STORAGE__EREF_STORAGE_OUTPUT_FLOW_STORAGE21:
				return basicSetEref_storageOutputFlowStorage21(null, msgs);
			case Metamodel_bdslPackage.STORAGE__EREF_ORDER_ON_STOCK_THRESHOLD_STORAGE22:
				return basicSetEref_orderOnStockThresholdStorage22(null, msgs);
			case Metamodel_bdslPackage.STORAGE__EREF_PROCESS_OUTPUT_FLOW_STORAGE23:
				return basicSetEref_processOutputFlowStorage23(null, msgs);
			case Metamodel_bdslPackage.STORAGE__CONTAINSNAME_STORAGE:
				return ((InternalEList<?>)getContainsnameStorage()).basicRemove(otherEnd, msgs);
			case Metamodel_bdslPackage.STORAGE__CONTAINSSIZE_STORAGE:
				return ((InternalEList<?>)getContainssizeStorage()).basicRemove(otherEnd, msgs);
			case Metamodel_bdslPackage.STORAGE__CONTAINSINITIAL_CONTENT_STORAGE:
				return ((InternalEList<?>)getContainsinitialContentStorage()).basicRemove(otherEnd, msgs);
			case Metamodel_bdslPackage.STORAGE__CONTAINSOVERFLOW_STORAGE:
				return ((InternalEList<?>)getContainsoverflowStorage()).basicRemove(otherEnd, msgs);
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
			case Metamodel_bdslPackage.STORAGE__CONTAINS_SIRIUS_TAG:
				return getContainsSiriusTag();
			case Metamodel_bdslPackage.STORAGE__NONE_ELEMENT:
				return getNoneElement();
			case Metamodel_bdslPackage.STORAGE__SIZE:
				return getSize();
			case Metamodel_bdslPackage.STORAGE__INITIAL_CONTENT:
				return getInitialContent();
			case Metamodel_bdslPackage.STORAGE__OVERFLOW:
				return isOverflow();
			case Metamodel_bdslPackage.STORAGE__STORAGE_OUTPUT_FLOW:
				return getStorageOutputFlow();
			case Metamodel_bdslPackage.STORAGE__ORDER_ON_STOCK_THRESHOLD:
				return getOrderOnStockThreshold();
			case Metamodel_bdslPackage.STORAGE__PROCESS_OUTPUT_FLOW:
				return getProcessOutputFlow();
			case Metamodel_bdslPackage.STORAGE__EREF_STORAGE_OUTPUT_FLOW_STORAGE21:
				return getEref_storageOutputFlowStorage21();
			case Metamodel_bdslPackage.STORAGE__EREF_ORDER_ON_STOCK_THRESHOLD_STORAGE22:
				return getEref_orderOnStockThresholdStorage22();
			case Metamodel_bdslPackage.STORAGE__EREF_PROCESS_OUTPUT_FLOW_STORAGE23:
				return getEref_processOutputFlowStorage23();
			case Metamodel_bdslPackage.STORAGE__CONTAINSNAME_STORAGE:
				return getContainsnameStorage();
			case Metamodel_bdslPackage.STORAGE__CONTAINSSIZE_STORAGE:
				return getContainssizeStorage();
			case Metamodel_bdslPackage.STORAGE__CONTAINSINITIAL_CONTENT_STORAGE:
				return getContainsinitialContentStorage();
			case Metamodel_bdslPackage.STORAGE__CONTAINSOVERFLOW_STORAGE:
				return getContainsoverflowStorage();
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
			case Metamodel_bdslPackage.STORAGE__CONTAINS_SIRIUS_TAG:
				getContainsSiriusTag().clear();
				getContainsSiriusTag().addAll((Collection<? extends SiriusTag>)newValue);
				return;
			case Metamodel_bdslPackage.STORAGE__NONE_ELEMENT:
				getNoneElement().clear();
				getNoneElement().addAll((Collection<? extends NoneElement>)newValue);
				return;
			case Metamodel_bdslPackage.STORAGE__SIZE:
				setSize((Integer)newValue);
				return;
			case Metamodel_bdslPackage.STORAGE__INITIAL_CONTENT:
				setInitialContent((Integer)newValue);
				return;
			case Metamodel_bdslPackage.STORAGE__OVERFLOW:
				setOverflow((Boolean)newValue);
				return;
			case Metamodel_bdslPackage.STORAGE__STORAGE_OUTPUT_FLOW:
				getStorageOutputFlow().clear();
				getStorageOutputFlow().addAll((Collection<? extends StorageOutputFlow>)newValue);
				return;
			case Metamodel_bdslPackage.STORAGE__ORDER_ON_STOCK_THRESHOLD:
				getOrderOnStockThreshold().clear();
				getOrderOnStockThreshold().addAll((Collection<? extends OrderOnStockThreshold>)newValue);
				return;
			case Metamodel_bdslPackage.STORAGE__PROCESS_OUTPUT_FLOW:
				getProcessOutputFlow().clear();
				getProcessOutputFlow().addAll((Collection<? extends ProcessOutputFlow>)newValue);
				return;
			case Metamodel_bdslPackage.STORAGE__EREF_STORAGE_OUTPUT_FLOW_STORAGE21:
				setEref_storageOutputFlowStorage21((storageOutputFlowStorage21)newValue);
				return;
			case Metamodel_bdslPackage.STORAGE__EREF_ORDER_ON_STOCK_THRESHOLD_STORAGE22:
				setEref_orderOnStockThresholdStorage22((orderOnStockThresholdStorage22)newValue);
				return;
			case Metamodel_bdslPackage.STORAGE__EREF_PROCESS_OUTPUT_FLOW_STORAGE23:
				setEref_processOutputFlowStorage23((processOutputFlowStorage23)newValue);
				return;
			case Metamodel_bdslPackage.STORAGE__CONTAINSNAME_STORAGE:
				getContainsnameStorage().clear();
				getContainsnameStorage().addAll((Collection<? extends nameStorage>)newValue);
				return;
			case Metamodel_bdslPackage.STORAGE__CONTAINSSIZE_STORAGE:
				getContainssizeStorage().clear();
				getContainssizeStorage().addAll((Collection<? extends sizeStorage>)newValue);
				return;
			case Metamodel_bdslPackage.STORAGE__CONTAINSINITIAL_CONTENT_STORAGE:
				getContainsinitialContentStorage().clear();
				getContainsinitialContentStorage().addAll((Collection<? extends initialContentStorage>)newValue);
				return;
			case Metamodel_bdslPackage.STORAGE__CONTAINSOVERFLOW_STORAGE:
				getContainsoverflowStorage().clear();
				getContainsoverflowStorage().addAll((Collection<? extends overflowStorage>)newValue);
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
			case Metamodel_bdslPackage.STORAGE__CONTAINS_SIRIUS_TAG:
				getContainsSiriusTag().clear();
				return;
			case Metamodel_bdslPackage.STORAGE__NONE_ELEMENT:
				getNoneElement().clear();
				return;
			case Metamodel_bdslPackage.STORAGE__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case Metamodel_bdslPackage.STORAGE__INITIAL_CONTENT:
				setInitialContent(INITIAL_CONTENT_EDEFAULT);
				return;
			case Metamodel_bdslPackage.STORAGE__OVERFLOW:
				setOverflow(OVERFLOW_EDEFAULT);
				return;
			case Metamodel_bdslPackage.STORAGE__STORAGE_OUTPUT_FLOW:
				getStorageOutputFlow().clear();
				return;
			case Metamodel_bdslPackage.STORAGE__ORDER_ON_STOCK_THRESHOLD:
				getOrderOnStockThreshold().clear();
				return;
			case Metamodel_bdslPackage.STORAGE__PROCESS_OUTPUT_FLOW:
				getProcessOutputFlow().clear();
				return;
			case Metamodel_bdslPackage.STORAGE__EREF_STORAGE_OUTPUT_FLOW_STORAGE21:
				setEref_storageOutputFlowStorage21((storageOutputFlowStorage21)null);
				return;
			case Metamodel_bdslPackage.STORAGE__EREF_ORDER_ON_STOCK_THRESHOLD_STORAGE22:
				setEref_orderOnStockThresholdStorage22((orderOnStockThresholdStorage22)null);
				return;
			case Metamodel_bdslPackage.STORAGE__EREF_PROCESS_OUTPUT_FLOW_STORAGE23:
				setEref_processOutputFlowStorage23((processOutputFlowStorage23)null);
				return;
			case Metamodel_bdslPackage.STORAGE__CONTAINSNAME_STORAGE:
				getContainsnameStorage().clear();
				return;
			case Metamodel_bdslPackage.STORAGE__CONTAINSSIZE_STORAGE:
				getContainssizeStorage().clear();
				return;
			case Metamodel_bdslPackage.STORAGE__CONTAINSINITIAL_CONTENT_STORAGE:
				getContainsinitialContentStorage().clear();
				return;
			case Metamodel_bdslPackage.STORAGE__CONTAINSOVERFLOW_STORAGE:
				getContainsoverflowStorage().clear();
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
			case Metamodel_bdslPackage.STORAGE__CONTAINS_SIRIUS_TAG:
				return containsSiriusTag != null && !containsSiriusTag.isEmpty();
			case Metamodel_bdslPackage.STORAGE__NONE_ELEMENT:
				return noneElement != null && !noneElement.isEmpty();
			case Metamodel_bdslPackage.STORAGE__SIZE:
				return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
			case Metamodel_bdslPackage.STORAGE__INITIAL_CONTENT:
				return INITIAL_CONTENT_EDEFAULT == null ? initialContent != null : !INITIAL_CONTENT_EDEFAULT.equals(initialContent);
			case Metamodel_bdslPackage.STORAGE__OVERFLOW:
				return overflow != OVERFLOW_EDEFAULT;
			case Metamodel_bdslPackage.STORAGE__STORAGE_OUTPUT_FLOW:
				return storageOutputFlow != null && !storageOutputFlow.isEmpty();
			case Metamodel_bdslPackage.STORAGE__ORDER_ON_STOCK_THRESHOLD:
				return orderOnStockThreshold != null && !orderOnStockThreshold.isEmpty();
			case Metamodel_bdslPackage.STORAGE__PROCESS_OUTPUT_FLOW:
				return processOutputFlow != null && !processOutputFlow.isEmpty();
			case Metamodel_bdslPackage.STORAGE__EREF_STORAGE_OUTPUT_FLOW_STORAGE21:
				return eref_storageOutputFlowStorage21 != null;
			case Metamodel_bdslPackage.STORAGE__EREF_ORDER_ON_STOCK_THRESHOLD_STORAGE22:
				return eref_orderOnStockThresholdStorage22 != null;
			case Metamodel_bdslPackage.STORAGE__EREF_PROCESS_OUTPUT_FLOW_STORAGE23:
				return eref_processOutputFlowStorage23 != null;
			case Metamodel_bdslPackage.STORAGE__CONTAINSNAME_STORAGE:
				return containsnameStorage != null && !containsnameStorage.isEmpty();
			case Metamodel_bdslPackage.STORAGE__CONTAINSSIZE_STORAGE:
				return containssizeStorage != null && !containssizeStorage.isEmpty();
			case Metamodel_bdslPackage.STORAGE__CONTAINSINITIAL_CONTENT_STORAGE:
				return containsinitialContentStorage != null && !containsinitialContentStorage.isEmpty();
			case Metamodel_bdslPackage.STORAGE__CONTAINSOVERFLOW_STORAGE:
				return containsoverflowStorage != null && !containsoverflowStorage.isEmpty();
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
				case Metamodel_bdslPackage.STORAGE__CONTAINS_SIRIUS_TAG: return Metamodel_bdslPackage.BINDING_ELEMENT__CONTAINS_SIRIUS_TAG;
				case Metamodel_bdslPackage.STORAGE__NONE_ELEMENT: return Metamodel_bdslPackage.BINDING_ELEMENT__NONE_ELEMENT;
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
				case Metamodel_bdslPackage.BINDING_ELEMENT__CONTAINS_SIRIUS_TAG: return Metamodel_bdslPackage.STORAGE__CONTAINS_SIRIUS_TAG;
				case Metamodel_bdslPackage.BINDING_ELEMENT__NONE_ELEMENT: return Metamodel_bdslPackage.STORAGE__NONE_ELEMENT;
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
		result.append(" (size: ");
		result.append(size);
		result.append(", initialContent: ");
		result.append(initialContent);
		result.append(", overflow: ");
		result.append(overflow);
		result.append(')');
		return result.toString();
	}

} //StorageImpl
