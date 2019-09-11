/**
 */
package metamodel_bdsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Storage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metamodel_bdsl.Storage#getSize <em>Size</em>}</li>
 *   <li>{@link metamodel_bdsl.Storage#getInitialContent <em>Initial Content</em>}</li>
 *   <li>{@link metamodel_bdsl.Storage#isOverflow <em>Overflow</em>}</li>
 *   <li>{@link metamodel_bdsl.Storage#getStorageOutputFlow <em>Storage Output Flow</em>}</li>
 *   <li>{@link metamodel_bdsl.Storage#getOrderOnStockThreshold <em>Order On Stock Threshold</em>}</li>
 *   <li>{@link metamodel_bdsl.Storage#getProcessOutputFlow <em>Process Output Flow</em>}</li>
 *   <li>{@link metamodel_bdsl.Storage#getContainsnameStorage <em>Containsname Storage</em>}</li>
 *   <li>{@link metamodel_bdsl.Storage#getContainssizeStorage <em>Containssize Storage</em>}</li>
 *   <li>{@link metamodel_bdsl.Storage#getContainsinitialContentStorage <em>Containsinitial Content Storage</em>}</li>
 *   <li>{@link metamodel_bdsl.Storage#getContainsoverflowStorage <em>Containsoverflow Storage</em>}</li>
 * </ul>
 *
 * @see metamodel_bdsl.Metamodel_bdslPackage#getStorage()
 * @model
 * @generated
 */
public interface Storage extends Component, BindingElement {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * The default value is <code>"100"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(Integer)
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getStorage_Size()
	 * @model default="100" dataType="metamodel_bdsl.PositiveIntNotNull"
	 * @generated
	 */
	Integer getSize();

	/**
	 * Sets the value of the '{@link metamodel_bdsl.Storage#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(Integer value);

	/**
	 * Returns the value of the '<em><b>Initial Content</b></em>' attribute.
	 * The default value is <code>"100"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Content</em>' attribute.
	 * @see #setInitialContent(Integer)
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getStorage_InitialContent()
	 * @model default="100" dataType="metamodel_bdsl.PositiveInt"
	 * @generated
	 */
	Integer getInitialContent();

	/**
	 * Sets the value of the '{@link metamodel_bdsl.Storage#getInitialContent <em>Initial Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Content</em>' attribute.
	 * @see #getInitialContent()
	 * @generated
	 */
	void setInitialContent(Integer value);

	/**
	 * Returns the value of the '<em><b>Overflow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overflow</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overflow</em>' attribute.
	 * @see #setOverflow(boolean)
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getStorage_Overflow()
	 * @model
	 * @generated
	 */
	boolean isOverflow();

	/**
	 * Sets the value of the '{@link metamodel_bdsl.Storage#isOverflow <em>Overflow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overflow</em>' attribute.
	 * @see #isOverflow()
	 * @generated
	 */
	void setOverflow(boolean value);

	/**
	 * Returns the value of the '<em><b>Storage Output Flow</b></em>' reference list.
	 * The list contents are of type {@link metamodel_bdsl.StorageOutputFlow}.
	 * It is bidirectional and its opposite is '{@link metamodel_bdsl.StorageOutputFlow#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Storage Output Flow</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage Output Flow</em>' reference list.
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getStorage_StorageOutputFlow()
	 * @see metamodel_bdsl.StorageOutputFlow#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<StorageOutputFlow> getStorageOutputFlow();

	/**
	 * Returns the value of the '<em><b>Order On Stock Threshold</b></em>' reference list.
	 * The list contents are of type {@link metamodel_bdsl.OrderOnStockThreshold}.
	 * It is bidirectional and its opposite is '{@link metamodel_bdsl.OrderOnStockThreshold#getStorage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order On Stock Threshold</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order On Stock Threshold</em>' reference list.
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getStorage_OrderOnStockThreshold()
	 * @see metamodel_bdsl.OrderOnStockThreshold#getStorage
	 * @model opposite="storage"
	 * @generated
	 */
	EList<OrderOnStockThreshold> getOrderOnStockThreshold();

	/**
	 * Returns the value of the '<em><b>Process Output Flow</b></em>' reference list.
	 * The list contents are of type {@link metamodel_bdsl.ProcessOutputFlow}.
	 * It is bidirectional and its opposite is '{@link metamodel_bdsl.ProcessOutputFlow#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Output Flow</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Output Flow</em>' reference list.
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getStorage_ProcessOutputFlow()
	 * @see metamodel_bdsl.ProcessOutputFlow#getDestination
	 * @model opposite="destination"
	 * @generated
	 */
	EList<ProcessOutputFlow> getProcessOutputFlow();

	/**
	 * Returns the value of the '<em><b>Containsname Storage</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel_bdsl.nameStorage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containsname Storage</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsname Storage</em>' containment reference list.
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getStorage_ContainsnameStorage()
	 * @model containment="true"
	 * @generated
	 */
	EList<nameStorage> getContainsnameStorage();

	/**
	 * Returns the value of the '<em><b>Containssize Storage</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel_bdsl.sizeStorage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containssize Storage</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containssize Storage</em>' containment reference list.
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getStorage_ContainssizeStorage()
	 * @model containment="true"
	 * @generated
	 */
	EList<sizeStorage> getContainssizeStorage();

	/**
	 * Returns the value of the '<em><b>Containsinitial Content Storage</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel_bdsl.initialContentStorage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containsinitial Content Storage</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsinitial Content Storage</em>' containment reference list.
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getStorage_ContainsinitialContentStorage()
	 * @model containment="true"
	 * @generated
	 */
	EList<initialContentStorage> getContainsinitialContentStorage();

	/**
	 * Returns the value of the '<em><b>Containsoverflow Storage</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel_bdsl.overflowStorage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containsoverflow Storage</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsoverflow Storage</em>' containment reference list.
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getStorage_ContainsoverflowStorage()
	 * @model containment="true"
	 * @generated
	 */
	EList<overflowStorage> getContainsoverflowStorage();

} // Storage
