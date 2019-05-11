/**
 */
package bento.sirius.tests.metamodels.linkedlist.impl;

import bento.sirius.tests.metamodels.linkedlist.AbstractListNode;
import bento.sirius.tests.metamodels.linkedlist.FinalNode;
import bento.sirius.tests.metamodels.linkedlist.InitialNode;
import bento.sirius.tests.metamodels.linkedlist.LinkedList;
import bento.sirius.tests.metamodels.linkedlist.LinkedlistFactory;
import bento.sirius.tests.metamodels.linkedlist.LinkedlistPackage;
import bento.sirius.tests.metamodels.linkedlist.ListNode;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LinkedlistPackageImpl extends EPackageImpl implements LinkedlistPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkedListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractListNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalNodeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see bento.sirius.tests.metamodels.linkedlist.LinkedlistPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LinkedlistPackageImpl() {
		super(eNS_URI, LinkedlistFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link LinkedlistPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LinkedlistPackage init() {
		if (isInited) return (LinkedlistPackage)EPackage.Registry.INSTANCE.getEPackage(LinkedlistPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredLinkedlistPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		LinkedlistPackageImpl theLinkedlistPackage = registeredLinkedlistPackage instanceof LinkedlistPackageImpl ? (LinkedlistPackageImpl)registeredLinkedlistPackage : new LinkedlistPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theLinkedlistPackage.createPackageContents();

		// Initialize created meta-data
		theLinkedlistPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLinkedlistPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LinkedlistPackage.eNS_URI, theLinkedlistPackage);
		return theLinkedlistPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLinkedList() {
		return linkedListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLinkedList_Nodes() {
		return (EReference)linkedListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractListNode() {
		return abstractListNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractListNode_Next() {
		return (EReference)abstractListNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInitialNode() {
		return initialNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getListNode() {
		return listNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getListNode_Value() {
		return (EAttribute)listNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFinalNode() {
		return finalNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinkedlistFactory getLinkedlistFactory() {
		return (LinkedlistFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		linkedListEClass = createEClass(LINKED_LIST);
		createEReference(linkedListEClass, LINKED_LIST__NODES);

		abstractListNodeEClass = createEClass(ABSTRACT_LIST_NODE);
		createEReference(abstractListNodeEClass, ABSTRACT_LIST_NODE__NEXT);

		initialNodeEClass = createEClass(INITIAL_NODE);

		listNodeEClass = createEClass(LIST_NODE);
		createEAttribute(listNodeEClass, LIST_NODE__VALUE);

		finalNodeEClass = createEClass(FINAL_NODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		initialNodeEClass.getESuperTypes().add(this.getAbstractListNode());
		listNodeEClass.getESuperTypes().add(this.getAbstractListNode());
		finalNodeEClass.getESuperTypes().add(this.getAbstractListNode());

		// Initialize classes, features, and operations; add parameters
		initEClass(linkedListEClass, LinkedList.class, "LinkedList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinkedList_Nodes(), this.getListNode(), null, "nodes", null, 0, -1, LinkedList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractListNodeEClass, AbstractListNode.class, "AbstractListNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractListNode_Next(), this.getAbstractListNode(), null, "next", null, 0, 1, AbstractListNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initialNodeEClass, InitialNode.class, "InitialNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(listNodeEClass, ListNode.class, "ListNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getListNode_Value(), ecorePackage.getEString(), "value", null, 1, 1, ListNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(finalNodeEClass, FinalNode.class, "FinalNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //LinkedlistPackageImpl
