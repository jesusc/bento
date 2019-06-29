/**
 */
package metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order On Stock Threshold</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metamodel.OrderOnStockThreshold#getPeriod <em>Period</em>}</li>
 *   <li>{@link metamodel.OrderOnStockThreshold#getThreshold <em>Threshold</em>}</li>
 *   <li>{@link metamodel.OrderOnStockThreshold#getName <em>Name</em>}</li>
 *   <li>{@link metamodel.OrderOnStockThreshold#getOrderQuantity <em>Order Quantity</em>}</li>
 *   <li>{@link metamodel.OrderOnStockThreshold#getOrderType <em>Order Type</em>}</li>
 *   <li>{@link metamodel.OrderOnStockThreshold#getSupplier <em>Supplier</em>}</li>
 *   <li>{@link metamodel.OrderOnStockThreshold#getStorage <em>Storage</em>}</li>
 * </ul>
 *
 * @see metamodel.MetamodelPackage#getOrderOnStockThreshold()
 * @model
 * @generated
 */
public interface OrderOnStockThreshold extends EObject {
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
	 * @see metamodel.MetamodelPackage#getOrderOnStockThreshold_Period()
	 * @model default="0" dataType="metamodel.PositiveDouble"
	 * @generated
	 */
	Double getPeriod();

	/**
	 * Sets the value of the '{@link metamodel.OrderOnStockThreshold#getPeriod <em>Period</em>}' attribute.
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
	 * @see metamodel.MetamodelPackage#getOrderOnStockThreshold_Threshold()
	 * @model default="0" dataType="metamodel.PositiveInt"
	 * @generated
	 */
	Integer getThreshold();

	/**
	 * Sets the value of the '{@link metamodel.OrderOnStockThreshold#getThreshold <em>Threshold</em>}' attribute.
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
	 * @see metamodel.MetamodelPackage#getOrderOnStockThreshold_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link metamodel.OrderOnStockThreshold#getName <em>Name</em>}' attribute.
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
	 * @see metamodel.MetamodelPackage#getOrderOnStockThreshold_OrderQuantity()
	 * @model default="0" dataType="metamodel.PositiveInt"
	 * @generated
	 */
	Integer getOrderQuantity();

	/**
	 * Sets the value of the '{@link metamodel.OrderOnStockThreshold#getOrderQuantity <em>Order Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Quantity</em>' attribute.
	 * @see #getOrderQuantity()
	 * @generated
	 */
	void setOrderQuantity(Integer value);

	/**
	 * Returns the value of the '<em><b>Order Type</b></em>' attribute.
	 * The literals are from the enumeration {@link metamodel.OrderType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Type</em>' attribute.
	 * @see metamodel.OrderType
	 * @see #setOrderType(OrderType)
	 * @see metamodel.MetamodelPackage#getOrderOnStockThreshold_OrderType()
	 * @model
	 * @generated
	 */
	OrderType getOrderType();

	/**
	 * Sets the value of the '{@link metamodel.OrderOnStockThreshold#getOrderType <em>Order Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Type</em>' attribute.
	 * @see metamodel.OrderType
	 * @see #getOrderType()
	 * @generated
	 */
	void setOrderType(OrderType value);

	/**
	 * Returns the value of the '<em><b>Supplier</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link metamodel.Supplier#getRefillPolicy <em>Refill Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplier</em>' reference.
	 * @see #setSupplier(Supplier)
	 * @see metamodel.MetamodelPackage#getOrderOnStockThreshold_Supplier()
	 * @see metamodel.Supplier#getRefillPolicy
	 * @model opposite="refillPolicy" required="true"
	 * @generated
	 */
	Supplier getSupplier();

	/**
	 * Sets the value of the '{@link metamodel.OrderOnStockThreshold#getSupplier <em>Supplier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplier</em>' reference.
	 * @see #getSupplier()
	 * @generated
	 */
	void setSupplier(Supplier value);

	/**
	 * Returns the value of the '<em><b>Storage</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link metamodel.Storage#getOrderOnStockThreshold <em>Order On Stock Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Storage</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage</em>' reference.
	 * @see #setStorage(Storage)
	 * @see metamodel.MetamodelPackage#getOrderOnStockThreshold_Storage()
	 * @see metamodel.Storage#getOrderOnStockThreshold
	 * @model opposite="orderOnStockThreshold" required="true"
	 * @generated
	 */
	Storage getStorage();

	/**
	 * Sets the value of the '{@link metamodel.OrderOnStockThreshold#getStorage <em>Storage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage</em>' reference.
	 * @see #getStorage()
	 * @generated
	 */
	void setStorage(Storage value);

} // OrderOnStockThreshold
