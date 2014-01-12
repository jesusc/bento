/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bento.componetization.reveng;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see bento.componetization.reveng.RevengFactory
 * @model kind="package"
 * @generated
 */
public interface RevengPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "reveng";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://bento/componetization/reveng_model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "reveng_model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RevengPackage eINSTANCE = bento.componetization.reveng.impl.RevengPackageImpl.init();

	/**
	 * The meta object id for the '{@link bento.componetization.reveng.impl.RevengModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.componetization.reveng.impl.RevengModelImpl
	 * @see bento.componetization.reveng.impl.RevengPackageImpl#getRevengModel()
	 * @generated
	 */
	int REVENG_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Transformation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVENG_MODEL__TRANSFORMATION = 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVENG_MODEL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link bento.componetization.reveng.impl.TransformationImpl <em>Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.componetization.reveng.impl.TransformationImpl
	 * @see bento.componetization.reveng.impl.RevengPackageImpl#getTransformation()
	 * @generated
	 */
	int TRANSFORMATION = 1;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__PATH = 0;

	/**
	 * The number of structural features of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link bento.componetization.reveng.impl.AtlTransformationImpl <em>Atl Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.componetization.reveng.impl.AtlTransformationImpl
	 * @see bento.componetization.reveng.impl.RevengPackageImpl#getAtlTransformation()
	 * @generated
	 */
	int ATL_TRANSFORMATION = 2;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATL_TRANSFORMATION__PATH = TRANSFORMATION__PATH;

	/**
	 * The feature id for the '<em><b>Metamodels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATL_TRANSFORMATION__METAMODELS = TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Atl Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATL_TRANSFORMATION_FEATURE_COUNT = TRANSFORMATION_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link bento.componetization.reveng.impl.MetamodelImpl <em>Metamodel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.componetization.reveng.impl.MetamodelImpl
	 * @see bento.componetization.reveng.impl.RevengPackageImpl#getMetamodel()
	 * @generated
	 */
	int METAMODEL = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__URI = 1;

	/**
	 * The number of structural features of the '<em>Metamodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link bento.componetization.reveng.RevengModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see bento.componetization.reveng.RevengModel
	 * @generated
	 */
	EClass getRevengModel();

	/**
	 * Returns the meta object for the containment reference '{@link bento.componetization.reveng.RevengModel#getTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transformation</em>'.
	 * @see bento.componetization.reveng.RevengModel#getTransformation()
	 * @see #getRevengModel()
	 * @generated
	 */
	EReference getRevengModel_Transformation();

	/**
	 * Returns the meta object for class '{@link bento.componetization.reveng.Transformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation</em>'.
	 * @see bento.componetization.reveng.Transformation
	 * @generated
	 */
	EClass getTransformation();

	/**
	 * Returns the meta object for the attribute '{@link bento.componetization.reveng.Transformation#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see bento.componetization.reveng.Transformation#getPath()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_Path();

	/**
	 * Returns the meta object for class '{@link bento.componetization.reveng.AtlTransformation <em>Atl Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atl Transformation</em>'.
	 * @see bento.componetization.reveng.AtlTransformation
	 * @generated
	 */
	EClass getAtlTransformation();

	/**
	 * Returns the meta object for the containment reference list '{@link bento.componetization.reveng.AtlTransformation#getMetamodels <em>Metamodels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metamodels</em>'.
	 * @see bento.componetization.reveng.AtlTransformation#getMetamodels()
	 * @see #getAtlTransformation()
	 * @generated
	 */
	EReference getAtlTransformation_Metamodels();

	/**
	 * Returns the meta object for class '{@link bento.componetization.reveng.Metamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metamodel</em>'.
	 * @see bento.componetization.reveng.Metamodel
	 * @generated
	 */
	EClass getMetamodel();

	/**
	 * Returns the meta object for the attribute '{@link bento.componetization.reveng.Metamodel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bento.componetization.reveng.Metamodel#getName()
	 * @see #getMetamodel()
	 * @generated
	 */
	EAttribute getMetamodel_Name();

	/**
	 * Returns the meta object for the attribute '{@link bento.componetization.reveng.Metamodel#getURI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URI</em>'.
	 * @see bento.componetization.reveng.Metamodel#getURI()
	 * @see #getMetamodel()
	 * @generated
	 */
	EAttribute getMetamodel_URI();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RevengFactory getRevengFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link bento.componetization.reveng.impl.RevengModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.componetization.reveng.impl.RevengModelImpl
		 * @see bento.componetization.reveng.impl.RevengPackageImpl#getRevengModel()
		 * @generated
		 */
		EClass REVENG_MODEL = eINSTANCE.getRevengModel();

		/**
		 * The meta object literal for the '<em><b>Transformation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REVENG_MODEL__TRANSFORMATION = eINSTANCE.getRevengModel_Transformation();

		/**
		 * The meta object literal for the '{@link bento.componetization.reveng.impl.TransformationImpl <em>Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.componetization.reveng.impl.TransformationImpl
		 * @see bento.componetization.reveng.impl.RevengPackageImpl#getTransformation()
		 * @generated
		 */
		EClass TRANSFORMATION = eINSTANCE.getTransformation();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__PATH = eINSTANCE.getTransformation_Path();

		/**
		 * The meta object literal for the '{@link bento.componetization.reveng.impl.AtlTransformationImpl <em>Atl Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.componetization.reveng.impl.AtlTransformationImpl
		 * @see bento.componetization.reveng.impl.RevengPackageImpl#getAtlTransformation()
		 * @generated
		 */
		EClass ATL_TRANSFORMATION = eINSTANCE.getAtlTransformation();

		/**
		 * The meta object literal for the '<em><b>Metamodels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATL_TRANSFORMATION__METAMODELS = eINSTANCE.getAtlTransformation_Metamodels();

		/**
		 * The meta object literal for the '{@link bento.componetization.reveng.impl.MetamodelImpl <em>Metamodel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.componetization.reveng.impl.MetamodelImpl
		 * @see bento.componetization.reveng.impl.RevengPackageImpl#getMetamodel()
		 * @generated
		 */
		EClass METAMODEL = eINSTANCE.getMetamodel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METAMODEL__NAME = eINSTANCE.getMetamodel_Name();

		/**
		 * The meta object literal for the '<em><b>URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METAMODEL__URI = eINSTANCE.getMetamodel_URI();

	}

} //RevengPackage
