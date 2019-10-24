/**
 */
package metamodel_bdsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order On Stock Threshold</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metamodel_bdsl.OrderOnStockThreshold#getPeriod <em>Period</em>}</li>
 *   <li>{@link metamodel_bdsl.OrderOnStockThreshold#getThreshold <em>Threshold</em>}</li>
 *   <li>{@link metamodel_bdsl.OrderOnStockThreshold#getName <em>Name</em>}</li>
 *   <li>{@link metamodel_bdsl.OrderOnStockThreshold#getOrderQuantity <em>Order Quantity</em>}</li>
 *   <li>{@link metamodel_bdsl.OrderOnStockThreshold#getOrderType <em>Order Type</em>}</li>
 *   <li>{@link metamodel_bdsl.OrderOnStockThreshold#getSupplier <em>Supplier</em>}</li>
 *   <li>{@link metamodel_bdsl.OrderOnStockThreshold#getStorage <em>Storage</em>}</li>
 *   <li>{@link metamodel_bdsl.OrderOnStockThreshold#getEref_supplierOrderOnStockThreshold81 <em>Eref supplier Order On Stock Threshold81</em>}</li>
 *   <li>{@link metamodel_bdsl.OrderOnStockThreshold#getEref_storageOrderOnStockThreshold82 <em>Eref storage Order On Stock Threshold82</em>}</li>
 *   <li>{@link metamodel_bdsl.OrderOnStockThreshold#getContainsperiodOrderOnStockThreshold <em>Containsperiod Order On Stock Threshold</em>}</li>
 *   <li>{@link metamodel_bdsl.OrderOnStockThreshold#getContainsthresholdOrderOnStockThreshold <em>Containsthreshold Order On Stock Threshold</em>}</li>
 *   <li>{@link metamodel_bdsl.OrderOnStockThreshold#getContainsnameOrderOnStockThreshold <em>Containsname Order On Stock Threshold</em>}</li>
 *   <li>{@link metamodel_bdsl.OrderOnStockThreshold#getContainsorderQuantityOrderOnStockThreshold <em>Containsorder Quantity Order On Stock Threshold</em>}</li>
 *   <li>{@link metamodel_bdsl.OrderOnStockThreshold#getContainsorderTypeOrderOnStockThreshold <em>Containsorder Type Order On Stock Threshold</em>}</li>
 * </ul>
 *
 * @see metamodel_bdsl.Metamodel_bdslPackage#getOrderOnStockThreshold()
 * @model
 * @generated
 */
public interface OrderOnStockThreshold extends BindingElement {
	/**
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see #setPeriod(Double)
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getOrderOnStockThreshold_Period()
	 * @model default="0" dataType="metamodel_bdsl.PositiveDouble"
	 * @generated
	 */
	Double getPeriod();

	/**
	 * Sets the value of the '{@link metamodel_bdsl.OrderOnStockThreshold#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Double value);

	/**
	 * Returns the value of the '<em><b>Threshold</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Threshold</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threshold</em>' attribute.
	 * @see #setThreshold(Integer)
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getOrderOnStockThreshold_Threshold()
	 * @model default="0" dataType="metamodel_bdsl.PositiveInt"
	 * @generated
	 */
	Integer getThreshold();

	/**
	 * Sets the value of the '{@link metamodel_bdsl.OrderOnStockThreshold#getThreshold <em>Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threshold</em>' attribute.
	 * @see #getThreshold()
	 * @generated
	 */
	void setThreshold(Integer value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getOrderOnStockThreshold_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link metamodel_bdsl.OrderOnStockThreshold#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Order Quantity</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Quantity</em>' attribute.
	 * @see #setOrderQuantity(Integer)
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getOrderOnStockThreshold_OrderQuantity()
	 * @model default="0" dataType="metamodel_bdsl.PositiveInt"
	 * @generated
	 */
	Integer getOrderQuantity();

	/**
	 * Sets the value of the '{@link metamodel_bdsl.OrderOnStockThreshold#getOrderQuantity <em>Order Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Quantity</em>' attribute.
	 * @see #getOrderQuantity()
	 * @generated
	 */
	void setOrderQuantity(Integer value);

	/**
	 * Returns the value of the '<em><b>Order Type</b></em>' attribute.
	 * The literals are from the enumeration {@link metamodel_bdsl.OrderType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Type</em>' attribute.
	 * @see metamodel_bdsl.OrderType
	 * @see #setOrderType(OrderType)
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getOrderOnStockThreshold_OrderType()
	 * @model
	 * @generated
	 */
	OrderType getOrderType();

	/**
	 * Sets the value of the '{@link metamodel_bdsl.OrderOnStockThreshold#getOrderType <em>Order Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Type</em>' attribute.
	 * @see metamodel_bdsl.OrderType
	 * @see #getOrderType()
	 * @generated
	 */
	void setOrderType(OrderType value);

	/**
	 * Returns the value of the '<em><b>Supplier</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link metamodel_bdsl.Supplier#getRefillPolicy <em>Refill Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplier</em>' reference.
	 * @see #setSupplier(Supplier)
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getOrderOnStockThreshold_Supplier()
	 * @see metamodel_bdsl.Supplier#getRefillPolicy
	 * @model opposite="refillPolicy" required="true"
	 * @generated
	 */
	Supplier getSupplier();

	/**
	 * Sets the value of the '{@link metamodel_bdsl.OrderOnStockThreshold#getSupplier <em>Supplier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplier</em>' reference.
	 * @see #getSupplier()
	 * @generated
	 */
	void setSupplier(Supplier value);

	/**
	 * Returns the value of the '<em><b>Storage</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link metamodel_bdsl.Storage#getOrderOnStockThreshold <em>Order On Stock Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Storage</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage</em>' reference.
	 * @see #setStorage(Storage)
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getOrderOnStockThreshold_Storage()
	 * @see metamodel_bdsl.Storage#getOrderOnStockThreshold
	 * @model opposite="orderOnStockThreshold" required="true"
	 * @generated
	 */
	Storage getStorage();

	/**
	 * Sets the value of the '{@link metamodel_bdsl.OrderOnStockThreshold#getStorage <em>Storage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage</em>' reference.
	 * @see #getStorage()
	 * @generated
	 */
	void setStorage(Storage value);

	/**
	 * Returns the value of the '<em><b>Eref supplier Order On Stock Threshold81</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eref supplier Order On Stock Threshold81</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eref supplier Order On Stock Threshold81</em>' containment reference.
	 * @see #setEref_supplierOrderOnStockThreshold81(supplierOrderOnStockThreshold81)
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getOrderOnStockThreshold_Eref_supplierOrderOnStockThreshold81()
	 * @model containment="true"
	 * @generated
	 */
	supplierOrderOnStockThreshold81 getEref_supplierOrderOnStockThreshold81();

	/**
	 * Sets the value of the '{@link metamodel_bdsl.OrderOnStockThreshold#getEref_supplierOrderOnStockThreshold81 <em>Eref supplier Order On Stock Threshold81</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eref supplier Order On Stock Threshold81</em>' containment reference.
	 * @see #getEref_supplierOrderOnStockThreshold81()
	 * @generated
	 */
	void setEref_supplierOrderOnStockThreshold81(supplierOrderOnStockThreshold81 value);

	/**
	 * Returns the value of the '<em><b>Eref storage Order On Stock Threshold82</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eref storage Order On Stock Threshold82</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eref storage Order On Stock Threshold82</em>' containment reference.
	 * @see #setEref_storageOrderOnStockThreshold82(storageOrderOnStockThreshold82)
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getOrderOnStockThreshold_Eref_storageOrderOnStockThreshold82()
	 * @model containment="true"
	 * @generated
	 */
	storageOrderOnStockThreshold82 getEref_storageOrderOnStockThreshold82();

	/**
	 * Sets the value of the '{@link metamodel_bdsl.OrderOnStockThreshold#getEref_storageOrderOnStockThreshold82 <em>Eref storage Order On Stock Threshold82</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eref storage Order On Stock Threshold82</em>' containment reference.
	 * @see #getEref_storageOrderOnStockThreshold82()
	 * @generated
	 */
	void setEref_storageOrderOnStockThreshold82(storageOrderOnStockThreshold82 value);

	/**
	 * Returns the value of the '<em><b>Containsperiod Order On Stock Threshold</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel_bdsl.periodOrderOnStockThreshold}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containsperiod Order On Stock Threshold</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsperiod Order On Stock Threshold</em>' containment reference list.
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getOrderOnStockThreshold_ContainsperiodOrderOnStockThreshold()
	 * @model containment="true"
	 * @generated
	 */
	EList<periodOrderOnStockThreshold> getContainsperiodOrderOnStockThreshold();

	/**
	 * Returns the value of the '<em><b>Containsthreshold Order On Stock Threshold</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel_bdsl.thresholdOrderOnStockThreshold}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containsthreshold Order On Stock Threshold</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsthreshold Order On Stock Threshold</em>' containment reference list.
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getOrderOnStockThreshold_ContainsthresholdOrderOnStockThreshold()
	 * @model containment="true"
	 * @generated
	 */
	EList<thresholdOrderOnStockThreshold> getContainsthresholdOrderOnStockThreshold();

	/**
	 * Returns the value of the '<em><b>Containsname Order On Stock Threshold</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel_bdsl.nameOrderOnStockThreshold}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containsname Order On Stock Threshold</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsname Order On Stock Threshold</em>' containment reference list.
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getOrderOnStockThreshold_ContainsnameOrderOnStockThreshold()
	 * @model containment="true"
	 * @generated
	 */
	EList<nameOrderOnStockThreshold> getContainsnameOrderOnStockThreshold();

	/**
	 * Returns the value of the '<em><b>Containsorder Quantity Order On Stock Threshold</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel_bdsl.orderQuantityOrderOnStockThreshold}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containsorder Quantity Order On Stock Threshold</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsorder Quantity Order On Stock Threshold</em>' containment reference list.
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getOrderOnStockThreshold_ContainsorderQuantityOrderOnStockThreshold()
	 * @model containment="true"
	 * @generated
	 */
	EList<orderQuantityOrderOnStockThreshold> getContainsorderQuantityOrderOnStockThreshold();

	/**
	 * Returns the value of the '<em><b>Containsorder Type Order On Stock Threshold</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel_bdsl.orderTypeOrderOnStockThreshold}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containsorder Type Order On Stock Threshold</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsorder Type Order On Stock Threshold</em>' containment reference list.
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getOrderOnStockThreshold_ContainsorderTypeOrderOnStockThreshold()
	 * @model containment="true"
	 * @generated
	 */
	EList<orderTypeOrderOnStockThreshold> getContainsorderTypeOrderOnStockThreshold();

} // OrderOnStockThreshold
