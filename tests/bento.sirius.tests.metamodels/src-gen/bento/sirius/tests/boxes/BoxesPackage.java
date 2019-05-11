/**
 */
package bento.sirius.tests.boxes;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see bento.sirius.tests.boxes.BoxesFactory
 * @model kind="package"
 * @generated
 */
public interface BoxesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "boxes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://bento/sirius/tests/boxes";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "boxes";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BoxesPackage eINSTANCE = bento.sirius.tests.boxes.impl.BoxesPackageImpl.init();

	/**
	 * The meta object id for the '{@link bento.sirius.tests.boxes.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.sirius.tests.boxes.impl.ModelImpl
	 * @see bento.sirius.tests.boxes.impl.BoxesPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Boxes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__BOXES = 0;

	/**
	 * The feature id for the '<em><b>Arrows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ARROWS = 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bento.sirius.tests.boxes.impl.BoxNodeImpl <em>Box Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.sirius.tests.boxes.impl.BoxNodeImpl
	 * @see bento.sirius.tests.boxes.impl.BoxesPackageImpl#getBoxNode()
	 * @generated
	 */
	int BOX_NODE = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX_NODE__LABEL = 0;

	/**
	 * The number of structural features of the '<em>Box Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX_NODE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Box Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX_NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bento.sirius.tests.boxes.impl.ArrowImpl <em>Arrow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.sirius.tests.boxes.impl.ArrowImpl
	 * @see bento.sirius.tests.boxes.impl.BoxesPackageImpl#getArrow()
	 * @generated
	 */
	int ARROW = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW__SRC = 1;

	/**
	 * The feature id for the '<em><b>Tgt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW__TGT = 2;

	/**
	 * The number of structural features of the '<em>Arrow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Arrow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARROW_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link bento.sirius.tests.boxes.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see bento.sirius.tests.boxes.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link bento.sirius.tests.boxes.Model#getBoxes <em>Boxes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Boxes</em>'.
	 * @see bento.sirius.tests.boxes.Model#getBoxes()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Boxes();

	/**
	 * Returns the meta object for the containment reference list '{@link bento.sirius.tests.boxes.Model#getArrows <em>Arrows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arrows</em>'.
	 * @see bento.sirius.tests.boxes.Model#getArrows()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Arrows();

	/**
	 * Returns the meta object for class '{@link bento.sirius.tests.boxes.BoxNode <em>Box Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Box Node</em>'.
	 * @see bento.sirius.tests.boxes.BoxNode
	 * @generated
	 */
	EClass getBoxNode();

	/**
	 * Returns the meta object for the attribute '{@link bento.sirius.tests.boxes.BoxNode#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see bento.sirius.tests.boxes.BoxNode#getLabel()
	 * @see #getBoxNode()
	 * @generated
	 */
	EAttribute getBoxNode_Label();

	/**
	 * Returns the meta object for class '{@link bento.sirius.tests.boxes.Arrow <em>Arrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arrow</em>'.
	 * @see bento.sirius.tests.boxes.Arrow
	 * @generated
	 */
	EClass getArrow();

	/**
	 * Returns the meta object for the attribute '{@link bento.sirius.tests.boxes.Arrow#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see bento.sirius.tests.boxes.Arrow#getLabel()
	 * @see #getArrow()
	 * @generated
	 */
	EAttribute getArrow_Label();

	/**
	 * Returns the meta object for the reference '{@link bento.sirius.tests.boxes.Arrow#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Src</em>'.
	 * @see bento.sirius.tests.boxes.Arrow#getSrc()
	 * @see #getArrow()
	 * @generated
	 */
	EReference getArrow_Src();

	/**
	 * Returns the meta object for the reference '{@link bento.sirius.tests.boxes.Arrow#getTgt <em>Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tgt</em>'.
	 * @see bento.sirius.tests.boxes.Arrow#getTgt()
	 * @see #getArrow()
	 * @generated
	 */
	EReference getArrow_Tgt();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BoxesFactory getBoxesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link bento.sirius.tests.boxes.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.sirius.tests.boxes.impl.ModelImpl
		 * @see bento.sirius.tests.boxes.impl.BoxesPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Boxes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__BOXES = eINSTANCE.getModel_Boxes();

		/**
		 * The meta object literal for the '<em><b>Arrows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__ARROWS = eINSTANCE.getModel_Arrows();

		/**
		 * The meta object literal for the '{@link bento.sirius.tests.boxes.impl.BoxNodeImpl <em>Box Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.sirius.tests.boxes.impl.BoxNodeImpl
		 * @see bento.sirius.tests.boxes.impl.BoxesPackageImpl#getBoxNode()
		 * @generated
		 */
		EClass BOX_NODE = eINSTANCE.getBoxNode();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOX_NODE__LABEL = eINSTANCE.getBoxNode_Label();

		/**
		 * The meta object literal for the '{@link bento.sirius.tests.boxes.impl.ArrowImpl <em>Arrow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.sirius.tests.boxes.impl.ArrowImpl
		 * @see bento.sirius.tests.boxes.impl.BoxesPackageImpl#getArrow()
		 * @generated
		 */
		EClass ARROW = eINSTANCE.getArrow();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARROW__LABEL = eINSTANCE.getArrow_Label();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARROW__SRC = eINSTANCE.getArrow_Src();

		/**
		 * The meta object literal for the '<em><b>Tgt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARROW__TGT = eINSTANCE.getArrow_Tgt();

	}

} //BoxesPackage
