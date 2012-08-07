/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.plcopen.xml.tc60201.impl;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.plcopen.xml.tc60201.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Tc60201FactoryImpl extends EFactoryImpl implements Tc60201Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Tc60201Factory init() {
		try {
			Tc60201Factory theTc60201Factory = (Tc60201Factory)EPackage.Registry.INSTANCE.getEFactory("http://www.plcopen.org/xml/tc6_0201"); 
			if (theTc60201Factory != null) {
				return theTc60201Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Tc60201FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tc60201FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Tc60201Package.ACCESS_VARIABLE_TYPE: return createAccessVariableType();
			case Tc60201Package.ACTION_BLOCK_TYPE: return createActionBlockType();
			case Tc60201Package.ACTIONS_TYPE: return createActionsType();
			case Tc60201Package.ACTION_TYPE: return createActionType();
			case Tc60201Package.ACTION_TYPE1: return createActionType1();
			case Tc60201Package.ADD_DATA: return createAddData();
			case Tc60201Package.ADD_DATA_INFO: return createAddDataInfo();
			case Tc60201Package.ARRAY_TYPE: return createArrayType();
			case Tc60201Package.ARRAY_VALUE_TYPE: return createArrayValueType();
			case Tc60201Package.BLOCK_TYPE: return createBlockType();
			case Tc60201Package.BODY: return createBody();
			case Tc60201Package.COIL_TYPE: return createCoilType();
			case Tc60201Package.COMMENT_TYPE: return createCommentType();
			case Tc60201Package.CONDITION_TYPE: return createConditionType();
			case Tc60201Package.CONFIGURATIONS_TYPE: return createConfigurationsType();
			case Tc60201Package.CONFIGURATION_TYPE: return createConfigurationType();
			case Tc60201Package.CONFIG_VARIABLE_TYPE: return createConfigVariableType();
			case Tc60201Package.CONNECTION: return createConnection();
			case Tc60201Package.CONNECTION_POINT_IN: return createConnectionPointIn();
			case Tc60201Package.CONNECTION_POINT_IN_TYPE: return createConnectionPointInType();
			case Tc60201Package.CONNECTION_POINT_OUT: return createConnectionPointOut();
			case Tc60201Package.CONNECTION_POINT_OUT_ACTION_TYPE: return createConnectionPointOutActionType();
			case Tc60201Package.CONNECTION_POINT_OUT_TYPE: return createConnectionPointOutType();
			case Tc60201Package.CONNECTION_POINT_OUT_TYPE1: return createConnectionPointOutType1();
			case Tc60201Package.CONNECTION_POINT_OUT_TYPE2: return createConnectionPointOutType2();
			case Tc60201Package.CONNECTION_POINT_OUT_TYPE3: return createConnectionPointOutType3();
			case Tc60201Package.CONNECTOR_TYPE: return createConnectorType();
			case Tc60201Package.CONTACT_TYPE: return createContactType();
			case Tc60201Package.CONTENT_HEADER_TYPE: return createContentHeaderType();
			case Tc60201Package.CONTINUATION_TYPE: return createContinuationType();
			case Tc60201Package.COORDINATE_INFO_TYPE: return createCoordinateInfoType();
			case Tc60201Package.DATA_TYPE: return createDataType();
			case Tc60201Package.DATA_TYPE1: return createDataType1();
			case Tc60201Package.DATA_TYPES_TYPE: return createDataTypesType();
			case Tc60201Package.DATA_TYPE_TYPE: return createDataTypeType();
			case Tc60201Package.DERIVED_TYPE: return createDerivedType();
			case Tc60201Package.DOCUMENT_ROOT: return createDocumentRoot();
			case Tc60201Package.ENUM_TYPE: return createEnumType();
			case Tc60201Package.ERROR_TYPE: return createErrorType();
			case Tc60201Package.EXTERNAL_VARS_TYPE: return createExternalVarsType();
			case Tc60201Package.FBD_TYPE: return createFbdType();
			case Tc60201Package.FBD_TYPE1: return createFBDType1();
			case Tc60201Package.FILE_HEADER_TYPE: return createFileHeaderType();
			case Tc60201Package.FORMATTED_TEXT: return createFormattedText();
			case Tc60201Package.GLOBAL_VARS_TYPE: return createGlobalVarsType();
			case Tc60201Package.INFO_TYPE: return createInfoType();
			case Tc60201Package.INLINE_TYPE: return createInlineType();
			case Tc60201Package.IN_OUT_VARIABLES_TYPE: return createInOutVariablesType();
			case Tc60201Package.IN_OUT_VARIABLES_TYPE1: return createInOutVariablesType1();
			case Tc60201Package.IN_OUT_VARIABLE_TYPE: return createInOutVariableType();
			case Tc60201Package.IN_OUT_VARS_TYPE: return createInOutVarsType();
			case Tc60201Package.INPUT_VARIABLES_TYPE: return createInputVariablesType();
			case Tc60201Package.INPUT_VARIABLES_TYPE1: return createInputVariablesType1();
			case Tc60201Package.INPUT_VARS_TYPE: return createInputVarsType();
			case Tc60201Package.INSTANCES_TYPE: return createInstancesType();
			case Tc60201Package.INTERFACE_TYPE: return createInterfaceType();
			case Tc60201Package.IN_VARIABLE_TYPE: return createInVariableType();
			case Tc60201Package.JUMP_STEP_TYPE: return createJumpStepType();
			case Tc60201Package.JUMP_TYPE: return createJumpType();
			case Tc60201Package.LABEL_TYPE: return createLabelType();
			case Tc60201Package.LD_TYPE: return createLdType();
			case Tc60201Package.LD_TYPE1: return createLDType1();
			case Tc60201Package.LEFT_POWER_RAIL_TYPE: return createLeftPowerRailType();
			case Tc60201Package.LOCAL_VARS_TYPE: return createLocalVarsType();
			case Tc60201Package.MACRO_STEP_TYPE: return createMacroStepType();
			case Tc60201Package.OUTPUT_VARIABLES_TYPE: return createOutputVariablesType();
			case Tc60201Package.OUTPUT_VARIABLES_TYPE1: return createOutputVariablesType1();
			case Tc60201Package.OUTPUT_VARS_TYPE: return createOutputVarsType();
			case Tc60201Package.OUT_VARIABLE_TYPE: return createOutVariableType();
			case Tc60201Package.PAGE_SIZE_TYPE: return createPageSizeType();
			case Tc60201Package.POINTER_TYPE: return createPointerType();
			case Tc60201Package.POSITION: return createPosition();
			case Tc60201Package.POU_INSTANCE: return createPouInstance();
			case Tc60201Package.POUS_TYPE: return createPousType();
			case Tc60201Package.POU_TYPE1: return createPouType1();
			case Tc60201Package.PROJECT_TYPE: return createProjectType();
			case Tc60201Package.RANGE_SIGNED: return createRangeSigned();
			case Tc60201Package.RANGE_UNSIGNED: return createRangeUnsigned();
			case Tc60201Package.REFERENCE_TYPE: return createReferenceType();
			case Tc60201Package.REFERENCE_TYPE1: return createReferenceType1();
			case Tc60201Package.RESOURCE_TYPE: return createResourceType();
			case Tc60201Package.RETURN_TYPE: return createReturnType();
			case Tc60201Package.RIGHT_POWER_RAIL_TYPE: return createRightPowerRailType();
			case Tc60201Package.SCALING_TYPE: return createScalingType();
			case Tc60201Package.SCALING_TYPE1: return createScalingType1();
			case Tc60201Package.SCALING_TYPE2: return createScalingType2();
			case Tc60201Package.SELECTION_CONVERGENCE_TYPE: return createSelectionConvergenceType();
			case Tc60201Package.SELECTION_DIVERGENCE_TYPE: return createSelectionDivergenceType();
			case Tc60201Package.SFC_TYPE: return createSfcType();
			case Tc60201Package.SFC_TYPE1: return createSFCType1();
			case Tc60201Package.SIMPLE_VALUE_TYPE: return createSimpleValueType();
			case Tc60201Package.SIMULTANEOUS_CONVERGENCE_TYPE: return createSimultaneousConvergenceType();
			case Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE: return createSimultaneousDivergenceType();
			case Tc60201Package.STEP_TYPE: return createStepType();
			case Tc60201Package.STRING_TYPE: return createStringType();
			case Tc60201Package.STRUCT_VALUE_TYPE: return createStructValueType();
			case Tc60201Package.SUBRANGE_SIGNED_TYPE: return createSubrangeSignedType();
			case Tc60201Package.SUBRANGE_UNSIGNED_TYPE: return createSubrangeUnsignedType();
			case Tc60201Package.TASK_TYPE: return createTaskType();
			case Tc60201Package.TEMP_VARS_TYPE: return createTempVarsType();
			case Tc60201Package.TRANSITIONS_TYPE: return createTransitionsType();
			case Tc60201Package.TRANSITION_TYPE: return createTransitionType();
			case Tc60201Package.TRANSITION_TYPE1: return createTransitionType1();
			case Tc60201Package.TYPES_TYPE: return createTypesType();
			case Tc60201Package.VALUE: return createValue();
			case Tc60201Package.VALUES_TYPE: return createValuesType();
			case Tc60201Package.VALUE_TYPE: return createValueType();
			case Tc60201Package.VALUE_TYPE1: return createValueType1();
			case Tc60201Package.VALUE_TYPE2: return createValueType2();
			case Tc60201Package.VARIABLE_TYPE: return createVariableType();
			case Tc60201Package.VARIABLE_TYPE1: return createVariableType1();
			case Tc60201Package.VARIABLE_TYPE2: return createVariableType2();
			case Tc60201Package.VARIABLE_TYPE3: return createVariableType3();
			case Tc60201Package.VARIABLE_TYPE4: return createVariableType4();
			case Tc60201Package.VARIABLE_TYPE5: return createVariableType5();
			case Tc60201Package.VARIABLE_TYPE6: return createVariableType6();
			case Tc60201Package.VAR_LIST: return createVarList();
			case Tc60201Package.VAR_LIST_ACCESS: return createVarListAccess();
			case Tc60201Package.VAR_LIST_CONFIG: return createVarListConfig();
			case Tc60201Package.VAR_LIST_PLAIN: return createVarListPlain();
			case Tc60201Package.VENDOR_ELEMENT_TYPE: return createVendorElementType();
			case Tc60201Package.WSTRING_TYPE: return createWstringType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Tc60201Package.ACCESS_TYPE:
				return createAccessTypeFromString(eDataType, initialValue);
			case Tc60201Package.EDGE_MODIFIER_TYPE:
				return createEdgeModifierTypeFromString(eDataType, initialValue);
			case Tc60201Package.HANDLE_UNKNOWN_TYPE:
				return createHandleUnknownTypeFromString(eDataType, initialValue);
			case Tc60201Package.POU_TYPE:
				return createPouTypeFromString(eDataType, initialValue);
			case Tc60201Package.QUALIFIER_TYPE:
				return createQualifierTypeFromString(eDataType, initialValue);
			case Tc60201Package.STORAGE_MODIFIER_TYPE:
				return createStorageModifierTypeFromString(eDataType, initialValue);
			case Tc60201Package.ACCESS_TYPE_OBJECT:
				return createAccessTypeObjectFromString(eDataType, initialValue);
			case Tc60201Package.EDGE_MODIFIER_TYPE_OBJECT:
				return createEdgeModifierTypeObjectFromString(eDataType, initialValue);
			case Tc60201Package.HANDLE_UNKNOWN_TYPE_OBJECT:
				return createHandleUnknownTypeObjectFromString(eDataType, initialValue);
			case Tc60201Package.POU_TYPE_OBJECT:
				return createPouTypeObjectFromString(eDataType, initialValue);
			case Tc60201Package.PRIORITY_TYPE:
				return createPriorityTypeFromString(eDataType, initialValue);
			case Tc60201Package.QUALIFIER_TYPE_OBJECT:
				return createQualifierTypeObjectFromString(eDataType, initialValue);
			case Tc60201Package.STORAGE_MODIFIER_TYPE_OBJECT:
				return createStorageModifierTypeObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Tc60201Package.ACCESS_TYPE:
				return convertAccessTypeToString(eDataType, instanceValue);
			case Tc60201Package.EDGE_MODIFIER_TYPE:
				return convertEdgeModifierTypeToString(eDataType, instanceValue);
			case Tc60201Package.HANDLE_UNKNOWN_TYPE:
				return convertHandleUnknownTypeToString(eDataType, instanceValue);
			case Tc60201Package.POU_TYPE:
				return convertPouTypeToString(eDataType, instanceValue);
			case Tc60201Package.QUALIFIER_TYPE:
				return convertQualifierTypeToString(eDataType, instanceValue);
			case Tc60201Package.STORAGE_MODIFIER_TYPE:
				return convertStorageModifierTypeToString(eDataType, instanceValue);
			case Tc60201Package.ACCESS_TYPE_OBJECT:
				return convertAccessTypeObjectToString(eDataType, instanceValue);
			case Tc60201Package.EDGE_MODIFIER_TYPE_OBJECT:
				return convertEdgeModifierTypeObjectToString(eDataType, instanceValue);
			case Tc60201Package.HANDLE_UNKNOWN_TYPE_OBJECT:
				return convertHandleUnknownTypeObjectToString(eDataType, instanceValue);
			case Tc60201Package.POU_TYPE_OBJECT:
				return convertPouTypeObjectToString(eDataType, instanceValue);
			case Tc60201Package.PRIORITY_TYPE:
				return convertPriorityTypeToString(eDataType, instanceValue);
			case Tc60201Package.QUALIFIER_TYPE_OBJECT:
				return convertQualifierTypeObjectToString(eDataType, instanceValue);
			case Tc60201Package.STORAGE_MODIFIER_TYPE_OBJECT:
				return convertStorageModifierTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessVariableType createAccessVariableType() {
		AccessVariableTypeImpl accessVariableType = new AccessVariableTypeImpl();
		return accessVariableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionBlockType createActionBlockType() {
		ActionBlockTypeImpl actionBlockType = new ActionBlockTypeImpl();
		return actionBlockType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionsType createActionsType() {
		ActionsTypeImpl actionsType = new ActionsTypeImpl();
		return actionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionType createActionType() {
		ActionTypeImpl actionType = new ActionTypeImpl();
		return actionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionType1 createActionType1() {
		ActionType1Impl actionType1 = new ActionType1Impl();
		return actionType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddData createAddData() {
		AddDataImpl addData = new AddDataImpl();
		return addData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddDataInfo createAddDataInfo() {
		AddDataInfoImpl addDataInfo = new AddDataInfoImpl();
		return addDataInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayType createArrayType() {
		ArrayTypeImpl arrayType = new ArrayTypeImpl();
		return arrayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayValueType createArrayValueType() {
		ArrayValueTypeImpl arrayValueType = new ArrayValueTypeImpl();
		return arrayValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockType createBlockType() {
		BlockTypeImpl blockType = new BlockTypeImpl();
		return blockType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Body createBody() {
		BodyImpl body = new BodyImpl();
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoilType createCoilType() {
		CoilTypeImpl coilType = new CoilTypeImpl();
		return coilType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommentType createCommentType() {
		CommentTypeImpl commentType = new CommentTypeImpl();
		return commentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionType createConditionType() {
		ConditionTypeImpl conditionType = new ConditionTypeImpl();
		return conditionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationsType createConfigurationsType() {
		ConfigurationsTypeImpl configurationsType = new ConfigurationsTypeImpl();
		return configurationsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationType createConfigurationType() {
		ConfigurationTypeImpl configurationType = new ConfigurationTypeImpl();
		return configurationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigVariableType createConfigVariableType() {
		ConfigVariableTypeImpl configVariableType = new ConfigVariableTypeImpl();
		return configVariableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection createConnection() {
		ConnectionImpl connection = new ConnectionImpl();
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionPointIn createConnectionPointIn() {
		ConnectionPointInImpl connectionPointIn = new ConnectionPointInImpl();
		return connectionPointIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionPointInType createConnectionPointInType() {
		ConnectionPointInTypeImpl connectionPointInType = new ConnectionPointInTypeImpl();
		return connectionPointInType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionPointOut createConnectionPointOut() {
		ConnectionPointOutImpl connectionPointOut = new ConnectionPointOutImpl();
		return connectionPointOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionPointOutActionType createConnectionPointOutActionType() {
		ConnectionPointOutActionTypeImpl connectionPointOutActionType = new ConnectionPointOutActionTypeImpl();
		return connectionPointOutActionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionPointOutType createConnectionPointOutType() {
		ConnectionPointOutTypeImpl connectionPointOutType = new ConnectionPointOutTypeImpl();
		return connectionPointOutType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionPointOutType1 createConnectionPointOutType1() {
		ConnectionPointOutType1Impl connectionPointOutType1 = new ConnectionPointOutType1Impl();
		return connectionPointOutType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionPointOutType2 createConnectionPointOutType2() {
		ConnectionPointOutType2Impl connectionPointOutType2 = new ConnectionPointOutType2Impl();
		return connectionPointOutType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionPointOutType3 createConnectionPointOutType3() {
		ConnectionPointOutType3Impl connectionPointOutType3 = new ConnectionPointOutType3Impl();
		return connectionPointOutType3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorType createConnectorType() {
		ConnectorTypeImpl connectorType = new ConnectorTypeImpl();
		return connectorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactType createContactType() {
		ContactTypeImpl contactType = new ContactTypeImpl();
		return contactType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentHeaderType createContentHeaderType() {
		ContentHeaderTypeImpl contentHeaderType = new ContentHeaderTypeImpl();
		return contentHeaderType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinuationType createContinuationType() {
		ContinuationTypeImpl continuationType = new ContinuationTypeImpl();
		return continuationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinateInfoType createCoordinateInfoType() {
		CoordinateInfoTypeImpl coordinateInfoType = new CoordinateInfoTypeImpl();
		return coordinateInfoType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataType() {
		DataTypeImpl dataType = new DataTypeImpl();
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType1 createDataType1() {
		DataType1Impl dataType1 = new DataType1Impl();
		return dataType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypesType createDataTypesType() {
		DataTypesTypeImpl dataTypesType = new DataTypesTypeImpl();
		return dataTypesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeType createDataTypeType() {
		DataTypeTypeImpl dataTypeType = new DataTypeTypeImpl();
		return dataTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivedType createDerivedType() {
		DerivedTypeImpl derivedType = new DerivedTypeImpl();
		return derivedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumType createEnumType() {
		EnumTypeImpl enumType = new EnumTypeImpl();
		return enumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorType createErrorType() {
		ErrorTypeImpl errorType = new ErrorTypeImpl();
		return errorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalVarsType createExternalVarsType() {
		ExternalVarsTypeImpl externalVarsType = new ExternalVarsTypeImpl();
		return externalVarsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FbdType createFbdType() {
		FbdTypeImpl fbdType = new FbdTypeImpl();
		return fbdType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FBDType1 createFBDType1() {
		FBDType1Impl fbdType1 = new FBDType1Impl();
		return fbdType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileHeaderType createFileHeaderType() {
		FileHeaderTypeImpl fileHeaderType = new FileHeaderTypeImpl();
		return fileHeaderType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormattedText createFormattedText() {
		FormattedTextImpl formattedText = new FormattedTextImpl();
		return formattedText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalVarsType createGlobalVarsType() {
		GlobalVarsTypeImpl globalVarsType = new GlobalVarsTypeImpl();
		return globalVarsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfoType createInfoType() {
		InfoTypeImpl infoType = new InfoTypeImpl();
		return infoType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InlineType createInlineType() {
		InlineTypeImpl inlineType = new InlineTypeImpl();
		return inlineType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InOutVariablesType createInOutVariablesType() {
		InOutVariablesTypeImpl inOutVariablesType = new InOutVariablesTypeImpl();
		return inOutVariablesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InOutVariablesType1 createInOutVariablesType1() {
		InOutVariablesType1Impl inOutVariablesType1 = new InOutVariablesType1Impl();
		return inOutVariablesType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InOutVariableType createInOutVariableType() {
		InOutVariableTypeImpl inOutVariableType = new InOutVariableTypeImpl();
		return inOutVariableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InOutVarsType createInOutVarsType() {
		InOutVarsTypeImpl inOutVarsType = new InOutVarsTypeImpl();
		return inOutVarsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputVariablesType createInputVariablesType() {
		InputVariablesTypeImpl inputVariablesType = new InputVariablesTypeImpl();
		return inputVariablesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputVariablesType1 createInputVariablesType1() {
		InputVariablesType1Impl inputVariablesType1 = new InputVariablesType1Impl();
		return inputVariablesType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputVarsType createInputVarsType() {
		InputVarsTypeImpl inputVarsType = new InputVarsTypeImpl();
		return inputVarsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstancesType createInstancesType() {
		InstancesTypeImpl instancesType = new InstancesTypeImpl();
		return instancesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceType createInterfaceType() {
		InterfaceTypeImpl interfaceType = new InterfaceTypeImpl();
		return interfaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InVariableType createInVariableType() {
		InVariableTypeImpl inVariableType = new InVariableTypeImpl();
		return inVariableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JumpStepType createJumpStepType() {
		JumpStepTypeImpl jumpStepType = new JumpStepTypeImpl();
		return jumpStepType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JumpType createJumpType() {
		JumpTypeImpl jumpType = new JumpTypeImpl();
		return jumpType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelType createLabelType() {
		LabelTypeImpl labelType = new LabelTypeImpl();
		return labelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LdType createLdType() {
		LdTypeImpl ldType = new LdTypeImpl();
		return ldType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LDType1 createLDType1() {
		LDType1Impl ldType1 = new LDType1Impl();
		return ldType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeftPowerRailType createLeftPowerRailType() {
		LeftPowerRailTypeImpl leftPowerRailType = new LeftPowerRailTypeImpl();
		return leftPowerRailType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalVarsType createLocalVarsType() {
		LocalVarsTypeImpl localVarsType = new LocalVarsTypeImpl();
		return localVarsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MacroStepType createMacroStepType() {
		MacroStepTypeImpl macroStepType = new MacroStepTypeImpl();
		return macroStepType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputVariablesType createOutputVariablesType() {
		OutputVariablesTypeImpl outputVariablesType = new OutputVariablesTypeImpl();
		return outputVariablesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputVariablesType1 createOutputVariablesType1() {
		OutputVariablesType1Impl outputVariablesType1 = new OutputVariablesType1Impl();
		return outputVariablesType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputVarsType createOutputVarsType() {
		OutputVarsTypeImpl outputVarsType = new OutputVarsTypeImpl();
		return outputVarsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutVariableType createOutVariableType() {
		OutVariableTypeImpl outVariableType = new OutVariableTypeImpl();
		return outVariableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageSizeType createPageSizeType() {
		PageSizeTypeImpl pageSizeType = new PageSizeTypeImpl();
		return pageSizeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointerType createPointerType() {
		PointerTypeImpl pointerType = new PointerTypeImpl();
		return pointerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position createPosition() {
		PositionImpl position = new PositionImpl();
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PouInstance createPouInstance() {
		PouInstanceImpl pouInstance = new PouInstanceImpl();
		return pouInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PousType createPousType() {
		PousTypeImpl pousType = new PousTypeImpl();
		return pousType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PouType1 createPouType1() {
		PouType1Impl pouType1 = new PouType1Impl();
		return pouType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectType createProjectType() {
		ProjectTypeImpl projectType = new ProjectTypeImpl();
		return projectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeSigned createRangeSigned() {
		RangeSignedImpl rangeSigned = new RangeSignedImpl();
		return rangeSigned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeUnsigned createRangeUnsigned() {
		RangeUnsignedImpl rangeUnsigned = new RangeUnsignedImpl();
		return rangeUnsigned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceType createReferenceType() {
		ReferenceTypeImpl referenceType = new ReferenceTypeImpl();
		return referenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceType1 createReferenceType1() {
		ReferenceType1Impl referenceType1 = new ReferenceType1Impl();
		return referenceType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceType createResourceType() {
		ResourceTypeImpl resourceType = new ResourceTypeImpl();
		return resourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnType createReturnType() {
		ReturnTypeImpl returnType = new ReturnTypeImpl();
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RightPowerRailType createRightPowerRailType() {
		RightPowerRailTypeImpl rightPowerRailType = new RightPowerRailTypeImpl();
		return rightPowerRailType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScalingType createScalingType() {
		ScalingTypeImpl scalingType = new ScalingTypeImpl();
		return scalingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScalingType1 createScalingType1() {
		ScalingType1Impl scalingType1 = new ScalingType1Impl();
		return scalingType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScalingType2 createScalingType2() {
		ScalingType2Impl scalingType2 = new ScalingType2Impl();
		return scalingType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectionConvergenceType createSelectionConvergenceType() {
		SelectionConvergenceTypeImpl selectionConvergenceType = new SelectionConvergenceTypeImpl();
		return selectionConvergenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectionDivergenceType createSelectionDivergenceType() {
		SelectionDivergenceTypeImpl selectionDivergenceType = new SelectionDivergenceTypeImpl();
		return selectionDivergenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SfcType createSfcType() {
		SfcTypeImpl sfcType = new SfcTypeImpl();
		return sfcType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SFCType1 createSFCType1() {
		SFCType1Impl sfcType1 = new SFCType1Impl();
		return sfcType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleValueType createSimpleValueType() {
		SimpleValueTypeImpl simpleValueType = new SimpleValueTypeImpl();
		return simpleValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimultaneousConvergenceType createSimultaneousConvergenceType() {
		SimultaneousConvergenceTypeImpl simultaneousConvergenceType = new SimultaneousConvergenceTypeImpl();
		return simultaneousConvergenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimultaneousDivergenceType createSimultaneousDivergenceType() {
		SimultaneousDivergenceTypeImpl simultaneousDivergenceType = new SimultaneousDivergenceTypeImpl();
		return simultaneousDivergenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepType createStepType() {
		StepTypeImpl stepType = new StepTypeImpl();
		return stepType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringType createStringType() {
		StringTypeImpl stringType = new StringTypeImpl();
		return stringType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructValueType createStructValueType() {
		StructValueTypeImpl structValueType = new StructValueTypeImpl();
		return structValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubrangeSignedType createSubrangeSignedType() {
		SubrangeSignedTypeImpl subrangeSignedType = new SubrangeSignedTypeImpl();
		return subrangeSignedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubrangeUnsignedType createSubrangeUnsignedType() {
		SubrangeUnsignedTypeImpl subrangeUnsignedType = new SubrangeUnsignedTypeImpl();
		return subrangeUnsignedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskType createTaskType() {
		TaskTypeImpl taskType = new TaskTypeImpl();
		return taskType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TempVarsType createTempVarsType() {
		TempVarsTypeImpl tempVarsType = new TempVarsTypeImpl();
		return tempVarsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionsType createTransitionsType() {
		TransitionsTypeImpl transitionsType = new TransitionsTypeImpl();
		return transitionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionType createTransitionType() {
		TransitionTypeImpl transitionType = new TransitionTypeImpl();
		return transitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionType1 createTransitionType1() {
		TransitionType1Impl transitionType1 = new TransitionType1Impl();
		return transitionType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesType createTypesType() {
		TypesTypeImpl typesType = new TypesTypeImpl();
		return typesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value createValue() {
		ValueImpl value = new ValueImpl();
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuesType createValuesType() {
		ValuesTypeImpl valuesType = new ValuesTypeImpl();
		return valuesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueType createValueType() {
		ValueTypeImpl valueType = new ValueTypeImpl();
		return valueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueType1 createValueType1() {
		ValueType1Impl valueType1 = new ValueType1Impl();
		return valueType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueType2 createValueType2() {
		ValueType2Impl valueType2 = new ValueType2Impl();
		return valueType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableType createVariableType() {
		VariableTypeImpl variableType = new VariableTypeImpl();
		return variableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableType1 createVariableType1() {
		VariableType1Impl variableType1 = new VariableType1Impl();
		return variableType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableType2 createVariableType2() {
		VariableType2Impl variableType2 = new VariableType2Impl();
		return variableType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableType3 createVariableType3() {
		VariableType3Impl variableType3 = new VariableType3Impl();
		return variableType3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableType4 createVariableType4() {
		VariableType4Impl variableType4 = new VariableType4Impl();
		return variableType4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableType5 createVariableType5() {
		VariableType5Impl variableType5 = new VariableType5Impl();
		return variableType5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableType6 createVariableType6() {
		VariableType6Impl variableType6 = new VariableType6Impl();
		return variableType6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarList createVarList() {
		VarListImpl varList = new VarListImpl();
		return varList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarListAccess createVarListAccess() {
		VarListAccessImpl varListAccess = new VarListAccessImpl();
		return varListAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarListConfig createVarListConfig() {
		VarListConfigImpl varListConfig = new VarListConfigImpl();
		return varListConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarListPlain createVarListPlain() {
		VarListPlainImpl varListPlain = new VarListPlainImpl();
		return varListPlain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VendorElementType createVendorElementType() {
		VendorElementTypeImpl vendorElementType = new VendorElementTypeImpl();
		return vendorElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WstringType createWstringType() {
		WstringTypeImpl wstringType = new WstringTypeImpl();
		return wstringType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessType createAccessTypeFromString(EDataType eDataType, String initialValue) {
		AccessType result = AccessType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccessTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeModifierType createEdgeModifierTypeFromString(EDataType eDataType, String initialValue) {
		EdgeModifierType result = EdgeModifierType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEdgeModifierTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HandleUnknownType createHandleUnknownTypeFromString(EDataType eDataType, String initialValue) {
		HandleUnknownType result = HandleUnknownType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHandleUnknownTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PouType createPouTypeFromString(EDataType eDataType, String initialValue) {
		PouType result = PouType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPouTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualifierType createQualifierTypeFromString(EDataType eDataType, String initialValue) {
		QualifierType result = QualifierType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQualifierTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorageModifierType createStorageModifierTypeFromString(EDataType eDataType, String initialValue) {
		StorageModifierType result = StorageModifierType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStorageModifierTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessType createAccessTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAccessTypeFromString(Tc60201Package.eINSTANCE.getAccessType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccessTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAccessTypeToString(Tc60201Package.eINSTANCE.getAccessType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeModifierType createEdgeModifierTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createEdgeModifierTypeFromString(Tc60201Package.eINSTANCE.getEdgeModifierType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEdgeModifierTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEdgeModifierTypeToString(Tc60201Package.eINSTANCE.getEdgeModifierType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HandleUnknownType createHandleUnknownTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createHandleUnknownTypeFromString(Tc60201Package.eINSTANCE.getHandleUnknownType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHandleUnknownTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertHandleUnknownTypeToString(Tc60201Package.eINSTANCE.getHandleUnknownType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PouType createPouTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createPouTypeFromString(Tc60201Package.eINSTANCE.getPouType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPouTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPouTypeToString(Tc60201Package.eINSTANCE.getPouType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createPriorityTypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPriorityTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualifierType createQualifierTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createQualifierTypeFromString(Tc60201Package.eINSTANCE.getQualifierType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQualifierTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertQualifierTypeToString(Tc60201Package.eINSTANCE.getQualifierType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorageModifierType createStorageModifierTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createStorageModifierTypeFromString(Tc60201Package.eINSTANCE.getStorageModifierType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStorageModifierTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStorageModifierTypeToString(Tc60201Package.eINSTANCE.getStorageModifierType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tc60201Package getTc60201Package() {
		return (Tc60201Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Tc60201Package getPackage() {
		return Tc60201Package.eINSTANCE;
	}

} //Tc60201FactoryImpl
