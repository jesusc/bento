/**
 */
package metamodel_bdsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supplier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metamodel_bdsl.Supplier#getDeliveredPercentage <em>Delivered Percentage</em>}</li>
 *   <li>{@link metamodel_bdsl.Supplier#getRefillPolicy <em>Refill Policy</em>}</li>
 *   <li>{@link metamodel_bdsl.Supplier#getSupplierDelay <em>Supplier Delay</em>}</li>
 *   <li>{@link metamodel_bdsl.Supplier#getEref_refillPolicySupplier31 <em>Eref refill Policy Supplier31</em>}</li>
 *   <li>{@link metamodel_bdsl.Supplier#getEref_supplierDelaySupplier32 <em>Eref supplier Delay Supplier32</em>}</li>
 *   <li>{@link metamodel_bdsl.Supplier#getContainsnameSupplier <em>Containsname Supplier</em>}</li>
 *   <li>{@link metamodel_bdsl.Supplier#getContainsdeliveredPercentageSupplier <em>Containsdelivered Percentage Supplier</em>}</li>
 * </ul>
 *
 * @see metamodel_bdsl.Metamodel_bdslPackage#getSupplier()
 * @model
 * @generated
 */
public interface Supplier extends Component, BindingElement {
	/**
	 * Returns the value of the '<em><b>Delivered Percentage</b></em>' attribute.
	 * The default value is <code>"100"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delivered Percentage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delivered Percentage</em>' attribute.
	 * @see #setDeliveredPercentage(Double)
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getSupplier_DeliveredPercentage()
	 * @model default="100" dataType="metamodel_bdsl.Percent"
	 * @generated
	 */
	Double getDeliveredPercentage();

	/**
	 * Sets the value of the '{@link metamodel_bdsl.Supplier#getDeliveredPercentage <em>Delivered Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delivered Percentage</em>' attribute.
	 * @see #getDeliveredPercentage()
	 * @generated
	 */
	void setDeliveredPercentage(Double value);

	/**
	 * Returns the value of the '<em><b>Refill Policy</b></em>' reference list.
	 * The list contents are of type {@link metamodel_bdsl.OrderOnStockThreshold}.
	 * It is bidirectional and its opposite is '{@link metamodel_bdsl.OrderOnStockThreshold#getSupplier <em>Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refill Policy</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refill Policy</em>' reference list.
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getSupplier_RefillPolicy()
	 * @see metamodel_bdsl.OrderOnStockThreshold#getSupplier
	 * @model opposite="supplier"
	 * @generated
	 */
	EList<OrderOnStockThreshold> getRefillPolicy();

	/**
	 * Returns the value of the '<em><b>Supplier Delay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplier Delay</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplier Delay</em>' containment reference.
	 * @see #setSupplierDelay(Probability)
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getSupplier_SupplierDelay()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Probability getSupplierDelay();

	/**
	 * Sets the value of the '{@link metamodel_bdsl.Supplier#getSupplierDelay <em>Supplier Delay</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplier Delay</em>' containment reference.
	 * @see #getSupplierDelay()
	 * @generated
	 */
	void setSupplierDelay(Probability value);

	/**
	 * Returns the value of the '<em><b>Eref refill Policy Supplier31</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eref refill Policy Supplier31</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eref refill Policy Supplier31</em>' containment reference.
	 * @see #setEref_refillPolicySupplier31(refillPolicySupplier31)
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getSupplier_Eref_refillPolicySupplier31()
	 * @model containment="true"
	 * @generated
	 */
	refillPolicySupplier31 getEref_refillPolicySupplier31();

	/**
	 * Sets the value of the '{@link metamodel_bdsl.Supplier#getEref_refillPolicySupplier31 <em>Eref refill Policy Supplier31</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eref refill Policy Supplier31</em>' containment reference.
	 * @see #getEref_refillPolicySupplier31()
	 * @generated
	 */
	void setEref_refillPolicySupplier31(refillPolicySupplier31 value);

	/**
	 * Returns the value of the '<em><b>Eref supplier Delay Supplier32</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eref supplier Delay Supplier32</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eref supplier Delay Supplier32</em>' containment reference.
	 * @see #setEref_supplierDelaySupplier32(supplierDelaySupplier32)
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getSupplier_Eref_supplierDelaySupplier32()
	 * @model containment="true"
	 * @generated
	 */
	supplierDelaySupplier32 getEref_supplierDelaySupplier32();

	/**
	 * Sets the value of the '{@link metamodel_bdsl.Supplier#getEref_supplierDelaySupplier32 <em>Eref supplier Delay Supplier32</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eref supplier Delay Supplier32</em>' containment reference.
	 * @see #getEref_supplierDelaySupplier32()
	 * @generated
	 */
	void setEref_supplierDelaySupplier32(supplierDelaySupplier32 value);

	/**
	 * Returns the value of the '<em><b>Containsname Supplier</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel_bdsl.nameSupplier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containsname Supplier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsname Supplier</em>' containment reference list.
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getSupplier_ContainsnameSupplier()
	 * @model containment="true"
	 * @generated
	 */
	EList<nameSupplier> getContainsnameSupplier();

	/**
	 * Returns the value of the '<em><b>Containsdelivered Percentage Supplier</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel_bdsl.deliveredPercentageSupplier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containsdelivered Percentage Supplier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsdelivered Percentage Supplier</em>' containment reference list.
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getSupplier_ContainsdeliveredPercentageSupplier()
	 * @model containment="true"
	 * @generated
	 */
	EList<deliveredPercentageSupplier> getContainsdeliveredPercentageSupplier();

} // Supplier
