/**
 */
package bento.language.bentocomp.technologies;

import bento.language.bentocomp.core.CorePackage;

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
 * @see bento.language.bentocomp.technologies.TechnologiesFactory
 * @model kind="package"
 * @generated
 */
public interface TechnologiesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "technologies";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://http://www.miso.es/bento/bentocomp/technologies";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bentocomp_technologies";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TechnologiesPackage eINSTANCE = bento.language.bentocomp.technologies.impl.TechnologiesPackageImpl.init();

	/**
	 * The meta object id for the '{@link bento.language.bentocomp.technologies.impl.AtlTemplateImpl <em>Atl Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.language.bentocomp.technologies.impl.AtlTemplateImpl
	 * @see bento.language.bentocomp.technologies.impl.TechnologiesPackageImpl#getAtlTemplate()
	 * @generated
	 */
	int ATL_TEMPLATE = 0;

	/**
	 * The feature id for the '<em><b>Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATL_TEMPLATE__TEMPLATE = CorePackage.TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATL_TEMPLATE__PARAMETERS = CorePackage.TEMPLATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Atl Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATL_TEMPLATE_FEATURE_COUNT = CorePackage.TEMPLATE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link bento.language.bentocomp.technologies.impl.AtlParameterImpl <em>Atl Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.language.bentocomp.technologies.impl.AtlParameterImpl
	 * @see bento.language.bentocomp.technologies.impl.TechnologiesPackageImpl#getAtlParameter()
	 * @generated
	 */
	int ATL_PARAMETER = 1;

	/**
	 * The feature id for the '<em><b>Atl Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATL_PARAMETER__ATL_MODEL_NAME = 0;

	/**
	 * The feature id for the '<em><b>Atl Metamodel Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATL_PARAMETER__ATL_METAMODEL_NAME = 1;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATL_PARAMETER__MODEL = 2;

	/**
	 * The number of structural features of the '<em>Atl Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATL_PARAMETER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link bento.language.bentocomp.technologies.impl.JavaTemplateImpl <em>Java Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.language.bentocomp.technologies.impl.JavaTemplateImpl
	 * @see bento.language.bentocomp.technologies.impl.TechnologiesPackageImpl#getJavaTemplate()
	 * @generated
	 */
	int JAVA_TEMPLATE = 2;

	/**
	 * The feature id for the '<em><b>Qualified Classname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TEMPLATE__QUALIFIED_CLASSNAME = CorePackage.TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Java Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TEMPLATE_FEATURE_COUNT = CorePackage.TEMPLATE_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link bento.language.bentocomp.technologies.impl.SiriusTemplateImpl <em>Sirius Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.language.bentocomp.technologies.impl.SiriusTemplateImpl
	 * @see bento.language.bentocomp.technologies.impl.TechnologiesPackageImpl#getSiriusTemplate()
	 * @generated
	 */
	int SIRIUS_TEMPLATE = 3;

	/**
	 * The feature id for the '<em><b>ODesign File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIRIUS_TEMPLATE__ODESIGN_FILE = CorePackage.TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sirius Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIRIUS_TEMPLATE_FEATURE_COUNT = CorePackage.TEMPLATE_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link bento.language.bentocomp.technologies.AtlTemplate <em>Atl Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atl Template</em>'.
	 * @see bento.language.bentocomp.technologies.AtlTemplate
	 * @generated
	 */
	EClass getAtlTemplate();

	/**
	 * Returns the meta object for the attribute '{@link bento.language.bentocomp.technologies.AtlTemplate#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Template</em>'.
	 * @see bento.language.bentocomp.technologies.AtlTemplate#getTemplate()
	 * @see #getAtlTemplate()
	 * @generated
	 */
	EAttribute getAtlTemplate_Template();

	/**
	 * Returns the meta object for the containment reference list '{@link bento.language.bentocomp.technologies.AtlTemplate#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see bento.language.bentocomp.technologies.AtlTemplate#getParameters()
	 * @see #getAtlTemplate()
	 * @generated
	 */
	EReference getAtlTemplate_Parameters();

	/**
	 * Returns the meta object for class '{@link bento.language.bentocomp.technologies.AtlParameter <em>Atl Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atl Parameter</em>'.
	 * @see bento.language.bentocomp.technologies.AtlParameter
	 * @generated
	 */
	EClass getAtlParameter();

	/**
	 * Returns the meta object for the attribute '{@link bento.language.bentocomp.technologies.AtlParameter#getAtlModelName <em>Atl Model Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Atl Model Name</em>'.
	 * @see bento.language.bentocomp.technologies.AtlParameter#getAtlModelName()
	 * @see #getAtlParameter()
	 * @generated
	 */
	EAttribute getAtlParameter_AtlModelName();

	/**
	 * Returns the meta object for the attribute '{@link bento.language.bentocomp.technologies.AtlParameter#getAtlMetamodelName <em>Atl Metamodel Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Atl Metamodel Name</em>'.
	 * @see bento.language.bentocomp.technologies.AtlParameter#getAtlMetamodelName()
	 * @see #getAtlParameter()
	 * @generated
	 */
	EAttribute getAtlParameter_AtlMetamodelName();

	/**
	 * Returns the meta object for the reference '{@link bento.language.bentocomp.technologies.AtlParameter#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see bento.language.bentocomp.technologies.AtlParameter#getModel()
	 * @see #getAtlParameter()
	 * @generated
	 */
	EReference getAtlParameter_Model();

	/**
	 * Returns the meta object for class '{@link bento.language.bentocomp.technologies.JavaTemplate <em>Java Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Template</em>'.
	 * @see bento.language.bentocomp.technologies.JavaTemplate
	 * @generated
	 */
	EClass getJavaTemplate();

	/**
	 * Returns the meta object for the attribute '{@link bento.language.bentocomp.technologies.JavaTemplate#getQualifiedClassname <em>Qualified Classname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Classname</em>'.
	 * @see bento.language.bentocomp.technologies.JavaTemplate#getQualifiedClassname()
	 * @see #getJavaTemplate()
	 * @generated
	 */
	EAttribute getJavaTemplate_QualifiedClassname();

	/**
	 * Returns the meta object for class '{@link bento.language.bentocomp.technologies.SiriusTemplate <em>Sirius Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sirius Template</em>'.
	 * @see bento.language.bentocomp.technologies.SiriusTemplate
	 * @generated
	 */
	EClass getSiriusTemplate();

	/**
	 * Returns the meta object for the attribute '{@link bento.language.bentocomp.technologies.SiriusTemplate#getODesignFile <em>ODesign File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ODesign File</em>'.
	 * @see bento.language.bentocomp.technologies.SiriusTemplate#getODesignFile()
	 * @see #getSiriusTemplate()
	 * @generated
	 */
	EAttribute getSiriusTemplate_ODesignFile();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TechnologiesFactory getTechnologiesFactory();

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
		 * The meta object literal for the '{@link bento.language.bentocomp.technologies.impl.AtlTemplateImpl <em>Atl Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.language.bentocomp.technologies.impl.AtlTemplateImpl
		 * @see bento.language.bentocomp.technologies.impl.TechnologiesPackageImpl#getAtlTemplate()
		 * @generated
		 */
		EClass ATL_TEMPLATE = eINSTANCE.getAtlTemplate();

		/**
		 * The meta object literal for the '<em><b>Template</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATL_TEMPLATE__TEMPLATE = eINSTANCE.getAtlTemplate_Template();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATL_TEMPLATE__PARAMETERS = eINSTANCE.getAtlTemplate_Parameters();

		/**
		 * The meta object literal for the '{@link bento.language.bentocomp.technologies.impl.AtlParameterImpl <em>Atl Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.language.bentocomp.technologies.impl.AtlParameterImpl
		 * @see bento.language.bentocomp.technologies.impl.TechnologiesPackageImpl#getAtlParameter()
		 * @generated
		 */
		EClass ATL_PARAMETER = eINSTANCE.getAtlParameter();

		/**
		 * The meta object literal for the '<em><b>Atl Model Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATL_PARAMETER__ATL_MODEL_NAME = eINSTANCE.getAtlParameter_AtlModelName();

		/**
		 * The meta object literal for the '<em><b>Atl Metamodel Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATL_PARAMETER__ATL_METAMODEL_NAME = eINSTANCE.getAtlParameter_AtlMetamodelName();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATL_PARAMETER__MODEL = eINSTANCE.getAtlParameter_Model();

		/**
		 * The meta object literal for the '{@link bento.language.bentocomp.technologies.impl.JavaTemplateImpl <em>Java Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.language.bentocomp.technologies.impl.JavaTemplateImpl
		 * @see bento.language.bentocomp.technologies.impl.TechnologiesPackageImpl#getJavaTemplate()
		 * @generated
		 */
		EClass JAVA_TEMPLATE = eINSTANCE.getJavaTemplate();

		/**
		 * The meta object literal for the '<em><b>Qualified Classname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_TEMPLATE__QUALIFIED_CLASSNAME = eINSTANCE.getJavaTemplate_QualifiedClassname();

		/**
		 * The meta object literal for the '{@link bento.language.bentocomp.technologies.impl.SiriusTemplateImpl <em>Sirius Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.language.bentocomp.technologies.impl.SiriusTemplateImpl
		 * @see bento.language.bentocomp.technologies.impl.TechnologiesPackageImpl#getSiriusTemplate()
		 * @generated
		 */
		EClass SIRIUS_TEMPLATE = eINSTANCE.getSiriusTemplate();

		/**
		 * The meta object literal for the '<em><b>ODesign File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIRIUS_TEMPLATE__ODESIGN_FILE = eINSTANCE.getSiriusTemplate_ODesignFile();

	}

} //TechnologiesPackage
