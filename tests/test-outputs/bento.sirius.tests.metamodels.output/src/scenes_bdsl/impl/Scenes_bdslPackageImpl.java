/**
 */
package scenes_bdsl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import scenes_bdsl.Action;
import scenes_bdsl.ActionType;
import scenes_bdsl.BindingElement;
import scenes_bdsl.Comment;
import scenes_bdsl.Element;
import scenes_bdsl.FeatureClass;
import scenes_bdsl.History;
import scenes_bdsl.IntemediateElement;
import scenes_bdsl.MetamodelElement;
import scenes_bdsl.MetamodelElementFeature;
import scenes_bdsl.NamedElement;
import scenes_bdsl.Place;
import scenes_bdsl.Scene;
import scenes_bdsl.Scenes_bdslFactory;
import scenes_bdsl.Scenes_bdslPackage;
import scenes_bdsl.nameAction;
import scenes_bdsl.nameCharacter;
import scenes_bdsl.namePlace;
import scenes_bdsl.nameScene;
import scenes_bdsl.textComment;
import scenes_bdsl.typeAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Scenes_bdslPackageImpl extends EPackageImpl implements Scenes_bdslPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sceneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass characterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameSceneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameCharacterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namePlaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textCommentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metamodelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intemediateElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metamodelElementFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actionTypeEEnum = null;

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
	 * @see scenes_bdsl.Scenes_bdslPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Scenes_bdslPackageImpl() {
		super(eNS_URI, Scenes_bdslFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Scenes_bdslPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Scenes_bdslPackage init() {
		if (isInited) return (Scenes_bdslPackage)EPackage.Registry.INSTANCE.getEPackage(Scenes_bdslPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredScenes_bdslPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Scenes_bdslPackageImpl theScenes_bdslPackage = registeredScenes_bdslPackage instanceof Scenes_bdslPackageImpl ? (Scenes_bdslPackageImpl)registeredScenes_bdslPackage : new Scenes_bdslPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theScenes_bdslPackage.createPackageContents();

		// Initialize created meta-data
		theScenes_bdslPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theScenes_bdslPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Scenes_bdslPackage.eNS_URI, theScenes_bdslPackage);
		return theScenes_bdslPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHistory() {
		return historyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHistory_Scenes() {
		return (EReference)historyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHistory_Elements() {
		return (EReference)historyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHistory_ContainsMetamodelElement() {
		return (EReference)historyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHistory_ContainsIntermediateElement() {
		return (EReference)historyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHistory_ContainsFeatureClass() {
		return (EReference)historyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHistory_ContainsMetamodelElementFeature() {
		return (EReference)historyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScene() {
		return sceneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScene_Elements() {
		return (EReference)sceneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScene_Next() {
		return (EReference)sceneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScene_Actions() {
		return (EReference)sceneEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScene_Description() {
		return (EReference)sceneEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScene_ContainsnameScene() {
		return (EReference)sceneEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacter() {
		return characterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCharacter_ContainsnameCharacter() {
		return (EReference)characterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlace() {
		return placeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlace_ContainsnamePlace() {
		return (EReference)placeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_Characters() {
		return (EReference)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAction_Type() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_ContainsnameAction() {
		return (EReference)actionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_ContainstypeAction() {
		return (EReference)actionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComment() {
		return commentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComment_Text() {
		return (EAttribute)commentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComment_ContainstextComment() {
		return (EReference)commentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getnameScene() {
		return nameSceneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getnameScene_Value() {
		return (EAttribute)nameSceneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getnameCharacter() {
		return nameCharacterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getnameCharacter_Value() {
		return (EAttribute)nameCharacterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getnamePlace() {
		return namePlaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getnamePlace_Value() {
		return (EAttribute)namePlaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getnameAction() {
		return nameActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getnameAction_Value() {
		return (EAttribute)nameActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass gettypeAction() {
		return typeActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute gettypeAction_Value() {
		return (EAttribute)typeActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass gettextComment() {
		return textCommentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute gettextComment_Value() {
		return (EAttribute)textCommentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBindingElement() {
		return bindingElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetamodelElement() {
		return metamodelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetamodelElement_Name() {
		return (EAttribute)metamodelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetamodelElement_MetamodelElementFeature() {
		return (EReference)metamodelElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntemediateElement() {
		return intemediateElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntemediateElement_BindingElement() {
		return (EReference)intemediateElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntemediateElement_MetamodElelement() {
		return (EReference)intemediateElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetamodelElementFeature() {
		return metamodelElementFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetamodelElementFeature_Name() {
		return (EAttribute)metamodelElementFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetamodelElementFeature_FeatureClass() {
		return (EReference)metamodelElementFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureClass() {
		return featureClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getActionType() {
		return actionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenes_bdslFactory getScenes_bdslFactory() {
		return (Scenes_bdslFactory)getEFactoryInstance();
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
		historyEClass = createEClass(HISTORY);
		createEReference(historyEClass, HISTORY__SCENES);
		createEReference(historyEClass, HISTORY__ELEMENTS);
		createEReference(historyEClass, HISTORY__CONTAINS_METAMODEL_ELEMENT);
		createEReference(historyEClass, HISTORY__CONTAINS_INTERMEDIATE_ELEMENT);
		createEReference(historyEClass, HISTORY__CONTAINS_FEATURE_CLASS);
		createEReference(historyEClass, HISTORY__CONTAINS_METAMODEL_ELEMENT_FEATURE);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		sceneEClass = createEClass(SCENE);
		createEReference(sceneEClass, SCENE__ELEMENTS);
		createEReference(sceneEClass, SCENE__NEXT);
		createEReference(sceneEClass, SCENE__ACTIONS);
		createEReference(sceneEClass, SCENE__DESCRIPTION);
		createEReference(sceneEClass, SCENE__CONTAINSNAME_SCENE);

		characterEClass = createEClass(CHARACTER);
		createEReference(characterEClass, CHARACTER__CONTAINSNAME_CHARACTER);

		placeEClass = createEClass(PLACE);
		createEReference(placeEClass, PLACE__CONTAINSNAME_PLACE);

		actionEClass = createEClass(ACTION);
		createEReference(actionEClass, ACTION__CHARACTERS);
		createEAttribute(actionEClass, ACTION__TYPE);
		createEReference(actionEClass, ACTION__CONTAINSNAME_ACTION);
		createEReference(actionEClass, ACTION__CONTAINSTYPE_ACTION);

		elementEClass = createEClass(ELEMENT);

		commentEClass = createEClass(COMMENT);
		createEAttribute(commentEClass, COMMENT__TEXT);
		createEReference(commentEClass, COMMENT__CONTAINSTEXT_COMMENT);

		nameSceneEClass = createEClass(NAME_SCENE);
		createEAttribute(nameSceneEClass, NAME_SCENE__VALUE);

		nameCharacterEClass = createEClass(NAME_CHARACTER);
		createEAttribute(nameCharacterEClass, NAME_CHARACTER__VALUE);

		namePlaceEClass = createEClass(NAME_PLACE);
		createEAttribute(namePlaceEClass, NAME_PLACE__VALUE);

		nameActionEClass = createEClass(NAME_ACTION);
		createEAttribute(nameActionEClass, NAME_ACTION__VALUE);

		typeActionEClass = createEClass(TYPE_ACTION);
		createEAttribute(typeActionEClass, TYPE_ACTION__VALUE);

		textCommentEClass = createEClass(TEXT_COMMENT);
		createEAttribute(textCommentEClass, TEXT_COMMENT__VALUE);

		bindingElementEClass = createEClass(BINDING_ELEMENT);

		metamodelElementEClass = createEClass(METAMODEL_ELEMENT);
		createEAttribute(metamodelElementEClass, METAMODEL_ELEMENT__NAME);
		createEReference(metamodelElementEClass, METAMODEL_ELEMENT__METAMODEL_ELEMENT_FEATURE);

		intemediateElementEClass = createEClass(INTEMEDIATE_ELEMENT);
		createEReference(intemediateElementEClass, INTEMEDIATE_ELEMENT__BINDING_ELEMENT);
		createEReference(intemediateElementEClass, INTEMEDIATE_ELEMENT__METAMOD_ELELEMENT);

		metamodelElementFeatureEClass = createEClass(METAMODEL_ELEMENT_FEATURE);
		createEAttribute(metamodelElementFeatureEClass, METAMODEL_ELEMENT_FEATURE__NAME);
		createEReference(metamodelElementFeatureEClass, METAMODEL_ELEMENT_FEATURE__FEATURE_CLASS);

		featureClassEClass = createEClass(FEATURE_CLASS);

		// Create enums
		actionTypeEEnum = createEEnum(ACTION_TYPE);
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
		sceneEClass.getESuperTypes().add(this.getNamedElement());
		sceneEClass.getESuperTypes().add(this.getBindingElement());
		characterEClass.getESuperTypes().add(this.getElement());
		characterEClass.getESuperTypes().add(this.getBindingElement());
		placeEClass.getESuperTypes().add(this.getElement());
		placeEClass.getESuperTypes().add(this.getBindingElement());
		actionEClass.getESuperTypes().add(this.getNamedElement());
		actionEClass.getESuperTypes().add(this.getBindingElement());
		elementEClass.getESuperTypes().add(this.getNamedElement());
		commentEClass.getESuperTypes().add(this.getBindingElement());
		nameSceneEClass.getESuperTypes().add(this.getFeatureClass());
		nameCharacterEClass.getESuperTypes().add(this.getFeatureClass());
		namePlaceEClass.getESuperTypes().add(this.getFeatureClass());
		nameActionEClass.getESuperTypes().add(this.getFeatureClass());
		typeActionEClass.getESuperTypes().add(this.getFeatureClass());
		textCommentEClass.getESuperTypes().add(this.getFeatureClass());

		// Initialize classes, features, and operations; add parameters
		initEClass(historyEClass, History.class, "History", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHistory_Scenes(), this.getScene(), null, "scenes", null, 1, -1, History.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHistory_Elements(), this.getElement(), null, "elements", null, 0, -1, History.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHistory_ContainsMetamodelElement(), this.getMetamodelElement(), null, "containsMetamodelElement", null, 0, -1, History.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHistory_ContainsIntermediateElement(), this.getIntemediateElement(), null, "containsIntermediateElement", null, 0, -1, History.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHistory_ContainsFeatureClass(), this.getFeatureClass(), null, "containsFeatureClass", null, 0, -1, History.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHistory_ContainsMetamodelElementFeature(), this.getFeatureClass(), null, "containsMetamodelElementFeature", null, 0, -1, History.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sceneEClass, Scene.class, "Scene", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScene_Elements(), this.getElement(), null, "elements", null, 0, -1, Scene.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScene_Next(), this.getScene(), null, "next", null, 0, 1, Scene.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScene_Actions(), this.getAction(), null, "actions", null, 0, -1, Scene.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScene_Description(), this.getComment(), null, "description", null, 0, 1, Scene.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScene_ContainsnameScene(), this.getnameScene(), null, "containsnameScene", null, 0, 1, Scene.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(characterEClass, scenes_bdsl.Character.class, "Character", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCharacter_ContainsnameCharacter(), this.getnameCharacter(), null, "containsnameCharacter", null, 0, 1, scenes_bdsl.Character.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(placeEClass, Place.class, "Place", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlace_ContainsnamePlace(), this.getnamePlace(), null, "containsnamePlace", null, 0, 1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAction_Characters(), this.getCharacter(), null, "characters", null, 1, -1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_Type(), this.getActionType(), "type", null, 1, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAction_ContainsnameAction(), this.getnameAction(), null, "containsnameAction", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAction_ContainstypeAction(), this.gettypeAction(), null, "containstypeAction", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(commentEClass, Comment.class, "Comment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComment_Text(), ecorePackage.getEString(), "text", null, 1, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComment_ContainstextComment(), this.gettextComment(), null, "containstextComment", null, 0, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameSceneEClass, nameScene.class, "nameScene", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getnameScene_Value(), ecorePackage.getEString(), "value", null, 0, 1, nameScene.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameCharacterEClass, nameCharacter.class, "nameCharacter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getnameCharacter_Value(), ecorePackage.getEString(), "value", null, 0, 1, nameCharacter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namePlaceEClass, namePlace.class, "namePlace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getnamePlace_Value(), ecorePackage.getEString(), "value", null, 0, 1, namePlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameActionEClass, nameAction.class, "nameAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getnameAction_Value(), ecorePackage.getEString(), "value", null, 0, 1, nameAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeActionEClass, typeAction.class, "typeAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(gettypeAction_Value(), this.getActionType(), "value", "FIGHT", 0, 1, typeAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textCommentEClass, textComment.class, "textComment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(gettextComment_Value(), ecorePackage.getEString(), "value", null, 0, 1, textComment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bindingElementEClass, BindingElement.class, "BindingElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(metamodelElementEClass, MetamodelElement.class, "MetamodelElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetamodelElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, MetamodelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetamodelElement_MetamodelElementFeature(), this.getMetamodelElementFeature(), null, "metamodelElementFeature", null, 0, -1, MetamodelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intemediateElementEClass, IntemediateElement.class, "IntemediateElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntemediateElement_BindingElement(), this.getBindingElement(), null, "bindingElement", null, 1, 1, IntemediateElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIntemediateElement_MetamodElelement(), this.getMetamodelElement(), null, "metamodElelement", null, 1, 1, IntemediateElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metamodelElementFeatureEClass, MetamodelElementFeature.class, "MetamodelElementFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetamodelElementFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, MetamodelElementFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetamodelElementFeature_FeatureClass(), this.getFeatureClass(), null, "featureClass", null, 0, -1, MetamodelElementFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureClassEClass, FeatureClass.class, "FeatureClass", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(actionTypeEEnum, ActionType.class, "ActionType");
		addEEnumLiteral(actionTypeEEnum, ActionType.FIGHT);
		addEEnumLiteral(actionTypeEEnum, ActionType.LOVE);
		addEEnumLiteral(actionTypeEEnum, ActionType.DIE);
		addEEnumLiteral(actionTypeEEnum, ActionType.CALL);
		addEEnumLiteral(actionTypeEEnum, ActionType.MOVE);
		addEEnumLiteral(actionTypeEEnum, ActionType.TALK);
		addEEnumLiteral(actionTypeEEnum, ActionType.WRITE);

		// Create resource
		createResource(eNS_URI);
	}

} //Scenes_bdslPackageImpl
