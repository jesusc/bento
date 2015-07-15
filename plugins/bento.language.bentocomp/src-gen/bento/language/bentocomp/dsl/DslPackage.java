/**
 */
package bento.language.bentocomp.dsl;

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
 * @see bento.language.bentocomp.dsl.DslFactory
 * @model kind="package"
 * @generated
 */
public interface DslPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dsl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.miso.es/bento/bentocomp/dsl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bentocomp_dsl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DslPackage eINSTANCE = bento.language.bentocomp.dsl.impl.DslPackageImpl.init();

	/**
	 * The meta object id for the '{@link bento.language.bentocomp.dsl.impl.DefinitionRootImpl <em>Definition Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.language.bentocomp.dsl.impl.DefinitionRootImpl
	 * @see bento.language.bentocomp.dsl.impl.DslPackageImpl#getDefinitionRoot()
	 * @generated
	 */
	int DEFINITION_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_ROOT__COMPONENT = 0;

	/**
	 * The number of structural features of the '<em>Definition Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_ROOT_FEATURE_COUNT = 1;


	/**
	 * The meta object id for the '{@link bento.language.bentocomp.dsl.impl.ComponentExecutionImpl <em>Component Execution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bento.language.bentocomp.dsl.impl.ComponentExecutionImpl
	 * @see bento.language.bentocomp.dsl.impl.DslPackageImpl#getComponentExecution()
	 * @generated
	 */
	int COMPONENT_EXECUTION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXECUTION__NAME = CorePackage.COMPOSITE_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXECUTION__TAGS = CorePackage.COMPOSITE_COMPONENT__TAGS;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXECUTION__OWNER = CorePackage.COMPOSITE_COMPONENT__OWNER;

	/**
	 * The feature id for the '<em><b>Contributors</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXECUTION__CONTRIBUTORS = CorePackage.COMPOSITE_COMPONENT__CONTRIBUTORS;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXECUTION__VERSION = CorePackage.COMPOSITE_COMPONENT__VERSION;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXECUTION__STATUS = CorePackage.COMPOSITE_COMPONENT__STATUS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXECUTION__SOURCE = CorePackage.COMPOSITE_COMPONENT__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXECUTION__TARGET = CorePackage.COMPOSITE_COMPONENT__TARGET;

	/**
	 * The feature id for the '<em><b>Source Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXECUTION__SOURCE_MODELS = CorePackage.COMPOSITE_COMPONENT__SOURCE_MODELS;

	/**
	 * The feature id for the '<em><b>Target Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXECUTION__TARGET_MODELS = CorePackage.COMPOSITE_COMPONENT__TARGET_MODELS;

	/**
	 * The feature id for the '<em><b>Generate Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXECUTION__GENERATE_MODELS = CorePackage.COMPOSITE_COMPONENT__GENERATE_MODELS;

	/**
	 * The feature id for the '<em><b>Formal Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXECUTION__FORMAL_PARAMETERS = CorePackage.COMPOSITE_COMPONENT__FORMAL_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXECUTION__USES = CorePackage.COMPOSITE_COMPONENT__USES;

	/**
	 * The feature id for the '<em><b>Composition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXECUTION__COMPOSITION = CorePackage.COMPOSITE_COMPONENT__COMPOSITION;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXECUTION__BINDINGS = CorePackage.COMPOSITE_COMPONENT__BINDINGS;

	/**
	 * The number of structural features of the '<em>Component Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_EXECUTION_FEATURE_COUNT = CorePackage.COMPOSITE_COMPONENT_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link bento.language.bentocomp.dsl.DefinitionRoot <em>Definition Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition Root</em>'.
	 * @see bento.language.bentocomp.dsl.DefinitionRoot
	 * @generated
	 */
	EClass getDefinitionRoot();

	/**
	 * Returns the meta object for the containment reference '{@link bento.language.bentocomp.dsl.DefinitionRoot#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Component</em>'.
	 * @see bento.language.bentocomp.dsl.DefinitionRoot#getComponent()
	 * @see #getDefinitionRoot()
	 * @generated
	 */
	EReference getDefinitionRoot_Component();

	/**
	 * Returns the meta object for class '{@link bento.language.bentocomp.dsl.ComponentExecution <em>Component Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Execution</em>'.
	 * @see bento.language.bentocomp.dsl.ComponentExecution
	 * @generated
	 */
	EClass getComponentExecution();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DslFactory getDslFactory();

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
		 * The meta object literal for the '{@link bento.language.bentocomp.dsl.impl.DefinitionRootImpl <em>Definition Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.language.bentocomp.dsl.impl.DefinitionRootImpl
		 * @see bento.language.bentocomp.dsl.impl.DslPackageImpl#getDefinitionRoot()
		 * @generated
		 */
		EClass DEFINITION_ROOT = eINSTANCE.getDefinitionRoot();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITION_ROOT__COMPONENT = eINSTANCE.getDefinitionRoot_Component();

		/**
		 * The meta object literal for the '{@link bento.language.bentocomp.dsl.impl.ComponentExecutionImpl <em>Component Execution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bento.language.bentocomp.dsl.impl.ComponentExecutionImpl
		 * @see bento.language.bentocomp.dsl.impl.DslPackageImpl#getComponentExecution()
		 * @generated
		 */
		EClass COMPONENT_EXECUTION = eINSTANCE.getComponentExecution();

	}

} //DslPackage
