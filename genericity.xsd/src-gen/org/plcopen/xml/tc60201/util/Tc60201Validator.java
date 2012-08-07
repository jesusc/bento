/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.plcopen.xml.tc60201.util;

import java.math.BigInteger;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.plcopen.xml.tc60201.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.plcopen.xml.tc60201.Tc60201Package
 * @generated
 */
public class Tc60201Validator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Tc60201Validator INSTANCE = new Tc60201Validator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.plcopen.xml.tc60201";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tc60201Validator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return Tc60201Package.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case Tc60201Package.ACCESS_VARIABLE_TYPE:
				return validateAccessVariableType((AccessVariableType)value, diagnostics, context);
			case Tc60201Package.ACTION_BLOCK_TYPE:
				return validateActionBlockType((ActionBlockType)value, diagnostics, context);
			case Tc60201Package.ACTIONS_TYPE:
				return validateActionsType((ActionsType)value, diagnostics, context);
			case Tc60201Package.ACTION_TYPE:
				return validateActionType((ActionType)value, diagnostics, context);
			case Tc60201Package.ACTION_TYPE1:
				return validateActionType1((ActionType1)value, diagnostics, context);
			case Tc60201Package.ADD_DATA:
				return validateAddData((AddData)value, diagnostics, context);
			case Tc60201Package.ADD_DATA_INFO:
				return validateAddDataInfo((AddDataInfo)value, diagnostics, context);
			case Tc60201Package.ARRAY_TYPE:
				return validateArrayType((ArrayType)value, diagnostics, context);
			case Tc60201Package.ARRAY_VALUE_TYPE:
				return validateArrayValueType((ArrayValueType)value, diagnostics, context);
			case Tc60201Package.BLOCK_TYPE:
				return validateBlockType((BlockType)value, diagnostics, context);
			case Tc60201Package.BODY:
				return validateBody((Body)value, diagnostics, context);
			case Tc60201Package.COIL_TYPE:
				return validateCoilType((CoilType)value, diagnostics, context);
			case Tc60201Package.COMMENT_TYPE:
				return validateCommentType((CommentType)value, diagnostics, context);
			case Tc60201Package.CONDITION_TYPE:
				return validateConditionType((ConditionType)value, diagnostics, context);
			case Tc60201Package.CONFIGURATIONS_TYPE:
				return validateConfigurationsType((ConfigurationsType)value, diagnostics, context);
			case Tc60201Package.CONFIGURATION_TYPE:
				return validateConfigurationType((ConfigurationType)value, diagnostics, context);
			case Tc60201Package.CONFIG_VARIABLE_TYPE:
				return validateConfigVariableType((ConfigVariableType)value, diagnostics, context);
			case Tc60201Package.CONNECTION:
				return validateConnection((Connection)value, diagnostics, context);
			case Tc60201Package.CONNECTION_POINT_IN:
				return validateConnectionPointIn((ConnectionPointIn)value, diagnostics, context);
			case Tc60201Package.CONNECTION_POINT_IN_TYPE:
				return validateConnectionPointInType((ConnectionPointInType)value, diagnostics, context);
			case Tc60201Package.CONNECTION_POINT_OUT:
				return validateConnectionPointOut((ConnectionPointOut)value, diagnostics, context);
			case Tc60201Package.CONNECTION_POINT_OUT_ACTION_TYPE:
				return validateConnectionPointOutActionType((ConnectionPointOutActionType)value, diagnostics, context);
			case Tc60201Package.CONNECTION_POINT_OUT_TYPE:
				return validateConnectionPointOutType((ConnectionPointOutType)value, diagnostics, context);
			case Tc60201Package.CONNECTION_POINT_OUT_TYPE1:
				return validateConnectionPointOutType1((ConnectionPointOutType1)value, diagnostics, context);
			case Tc60201Package.CONNECTION_POINT_OUT_TYPE2:
				return validateConnectionPointOutType2((ConnectionPointOutType2)value, diagnostics, context);
			case Tc60201Package.CONNECTION_POINT_OUT_TYPE3:
				return validateConnectionPointOutType3((ConnectionPointOutType3)value, diagnostics, context);
			case Tc60201Package.CONNECTOR_TYPE:
				return validateConnectorType((ConnectorType)value, diagnostics, context);
			case Tc60201Package.CONTACT_TYPE:
				return validateContactType((ContactType)value, diagnostics, context);
			case Tc60201Package.CONTENT_HEADER_TYPE:
				return validateContentHeaderType((ContentHeaderType)value, diagnostics, context);
			case Tc60201Package.CONTINUATION_TYPE:
				return validateContinuationType((ContinuationType)value, diagnostics, context);
			case Tc60201Package.COORDINATE_INFO_TYPE:
				return validateCoordinateInfoType((CoordinateInfoType)value, diagnostics, context);
			case Tc60201Package.DATA_TYPE:
				return validateDataType((DataType)value, diagnostics, context);
			case Tc60201Package.DATA_TYPE1:
				return validateDataType1((DataType1)value, diagnostics, context);
			case Tc60201Package.DATA_TYPES_TYPE:
				return validateDataTypesType((DataTypesType)value, diagnostics, context);
			case Tc60201Package.DATA_TYPE_TYPE:
				return validateDataTypeType((DataTypeType)value, diagnostics, context);
			case Tc60201Package.DERIVED_TYPE:
				return validateDerivedType((DerivedType)value, diagnostics, context);
			case Tc60201Package.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case Tc60201Package.ENUM_TYPE:
				return validateEnumType((EnumType)value, diagnostics, context);
			case Tc60201Package.ERROR_TYPE:
				return validateErrorType((ErrorType)value, diagnostics, context);
			case Tc60201Package.EXTERNAL_VARS_TYPE:
				return validateExternalVarsType((ExternalVarsType)value, diagnostics, context);
			case Tc60201Package.FBD_TYPE:
				return validateFbdType((FbdType)value, diagnostics, context);
			case Tc60201Package.FBD_TYPE1:
				return validateFBDType1((FBDType1)value, diagnostics, context);
			case Tc60201Package.FILE_HEADER_TYPE:
				return validateFileHeaderType((FileHeaderType)value, diagnostics, context);
			case Tc60201Package.FORMATTED_TEXT:
				return validateFormattedText((FormattedText)value, diagnostics, context);
			case Tc60201Package.GLOBAL_VARS_TYPE:
				return validateGlobalVarsType((GlobalVarsType)value, diagnostics, context);
			case Tc60201Package.INFO_TYPE:
				return validateInfoType((InfoType)value, diagnostics, context);
			case Tc60201Package.INLINE_TYPE:
				return validateInlineType((InlineType)value, diagnostics, context);
			case Tc60201Package.IN_OUT_VARIABLES_TYPE:
				return validateInOutVariablesType((InOutVariablesType)value, diagnostics, context);
			case Tc60201Package.IN_OUT_VARIABLES_TYPE1:
				return validateInOutVariablesType1((InOutVariablesType1)value, diagnostics, context);
			case Tc60201Package.IN_OUT_VARIABLE_TYPE:
				return validateInOutVariableType((InOutVariableType)value, diagnostics, context);
			case Tc60201Package.IN_OUT_VARS_TYPE:
				return validateInOutVarsType((InOutVarsType)value, diagnostics, context);
			case Tc60201Package.INPUT_VARIABLES_TYPE:
				return validateInputVariablesType((InputVariablesType)value, diagnostics, context);
			case Tc60201Package.INPUT_VARIABLES_TYPE1:
				return validateInputVariablesType1((InputVariablesType1)value, diagnostics, context);
			case Tc60201Package.INPUT_VARS_TYPE:
				return validateInputVarsType((InputVarsType)value, diagnostics, context);
			case Tc60201Package.INSTANCES_TYPE:
				return validateInstancesType((InstancesType)value, diagnostics, context);
			case Tc60201Package.INTERFACE_TYPE:
				return validateInterfaceType((InterfaceType)value, diagnostics, context);
			case Tc60201Package.IN_VARIABLE_TYPE:
				return validateInVariableType((InVariableType)value, diagnostics, context);
			case Tc60201Package.JUMP_STEP_TYPE:
				return validateJumpStepType((JumpStepType)value, diagnostics, context);
			case Tc60201Package.JUMP_TYPE:
				return validateJumpType((JumpType)value, diagnostics, context);
			case Tc60201Package.LABEL_TYPE:
				return validateLabelType((LabelType)value, diagnostics, context);
			case Tc60201Package.LD_TYPE:
				return validateLdType((LdType)value, diagnostics, context);
			case Tc60201Package.LD_TYPE1:
				return validateLDType1((LDType1)value, diagnostics, context);
			case Tc60201Package.LEFT_POWER_RAIL_TYPE:
				return validateLeftPowerRailType((LeftPowerRailType)value, diagnostics, context);
			case Tc60201Package.LOCAL_VARS_TYPE:
				return validateLocalVarsType((LocalVarsType)value, diagnostics, context);
			case Tc60201Package.MACRO_STEP_TYPE:
				return validateMacroStepType((MacroStepType)value, diagnostics, context);
			case Tc60201Package.OUTPUT_VARIABLES_TYPE:
				return validateOutputVariablesType((OutputVariablesType)value, diagnostics, context);
			case Tc60201Package.OUTPUT_VARIABLES_TYPE1:
				return validateOutputVariablesType1((OutputVariablesType1)value, diagnostics, context);
			case Tc60201Package.OUTPUT_VARS_TYPE:
				return validateOutputVarsType((OutputVarsType)value, diagnostics, context);
			case Tc60201Package.OUT_VARIABLE_TYPE:
				return validateOutVariableType((OutVariableType)value, diagnostics, context);
			case Tc60201Package.PAGE_SIZE_TYPE:
				return validatePageSizeType((PageSizeType)value, diagnostics, context);
			case Tc60201Package.POINTER_TYPE:
				return validatePointerType((PointerType)value, diagnostics, context);
			case Tc60201Package.POSITION:
				return validatePosition((Position)value, diagnostics, context);
			case Tc60201Package.POU_INSTANCE:
				return validatePouInstance((PouInstance)value, diagnostics, context);
			case Tc60201Package.POUS_TYPE:
				return validatePousType((PousType)value, diagnostics, context);
			case Tc60201Package.POU_TYPE1:
				return validatePouType1((PouType1)value, diagnostics, context);
			case Tc60201Package.PROJECT_TYPE:
				return validateProjectType((ProjectType)value, diagnostics, context);
			case Tc60201Package.RANGE_SIGNED:
				return validateRangeSigned((RangeSigned)value, diagnostics, context);
			case Tc60201Package.RANGE_UNSIGNED:
				return validateRangeUnsigned((RangeUnsigned)value, diagnostics, context);
			case Tc60201Package.REFERENCE_TYPE:
				return validateReferenceType((ReferenceType)value, diagnostics, context);
			case Tc60201Package.REFERENCE_TYPE1:
				return validateReferenceType1((ReferenceType1)value, diagnostics, context);
			case Tc60201Package.RESOURCE_TYPE:
				return validateResourceType((ResourceType)value, diagnostics, context);
			case Tc60201Package.RETURN_TYPE:
				return validateReturnType((ReturnType)value, diagnostics, context);
			case Tc60201Package.RIGHT_POWER_RAIL_TYPE:
				return validateRightPowerRailType((RightPowerRailType)value, diagnostics, context);
			case Tc60201Package.SCALING_TYPE:
				return validateScalingType((ScalingType)value, diagnostics, context);
			case Tc60201Package.SCALING_TYPE1:
				return validateScalingType1((ScalingType1)value, diagnostics, context);
			case Tc60201Package.SCALING_TYPE2:
				return validateScalingType2((ScalingType2)value, diagnostics, context);
			case Tc60201Package.SELECTION_CONVERGENCE_TYPE:
				return validateSelectionConvergenceType((SelectionConvergenceType)value, diagnostics, context);
			case Tc60201Package.SELECTION_DIVERGENCE_TYPE:
				return validateSelectionDivergenceType((SelectionDivergenceType)value, diagnostics, context);
			case Tc60201Package.SFC_TYPE:
				return validateSfcType((SfcType)value, diagnostics, context);
			case Tc60201Package.SFC_TYPE1:
				return validateSFCType1((SFCType1)value, diagnostics, context);
			case Tc60201Package.SIMPLE_VALUE_TYPE:
				return validateSimpleValueType((SimpleValueType)value, diagnostics, context);
			case Tc60201Package.SIMULTANEOUS_CONVERGENCE_TYPE:
				return validateSimultaneousConvergenceType((SimultaneousConvergenceType)value, diagnostics, context);
			case Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE:
				return validateSimultaneousDivergenceType((SimultaneousDivergenceType)value, diagnostics, context);
			case Tc60201Package.STEP_TYPE:
				return validateStepType((StepType)value, diagnostics, context);
			case Tc60201Package.STRING_TYPE:
				return validateStringType((StringType)value, diagnostics, context);
			case Tc60201Package.STRUCT_VALUE_TYPE:
				return validateStructValueType((StructValueType)value, diagnostics, context);
			case Tc60201Package.SUBRANGE_SIGNED_TYPE:
				return validateSubrangeSignedType((SubrangeSignedType)value, diagnostics, context);
			case Tc60201Package.SUBRANGE_UNSIGNED_TYPE:
				return validateSubrangeUnsignedType((SubrangeUnsignedType)value, diagnostics, context);
			case Tc60201Package.TASK_TYPE:
				return validateTaskType((TaskType)value, diagnostics, context);
			case Tc60201Package.TEMP_VARS_TYPE:
				return validateTempVarsType((TempVarsType)value, diagnostics, context);
			case Tc60201Package.TRANSITIONS_TYPE:
				return validateTransitionsType((TransitionsType)value, diagnostics, context);
			case Tc60201Package.TRANSITION_TYPE:
				return validateTransitionType((TransitionType)value, diagnostics, context);
			case Tc60201Package.TRANSITION_TYPE1:
				return validateTransitionType1((TransitionType1)value, diagnostics, context);
			case Tc60201Package.TYPES_TYPE:
				return validateTypesType((TypesType)value, diagnostics, context);
			case Tc60201Package.VALUE:
				return validateValue((Value)value, diagnostics, context);
			case Tc60201Package.VALUES_TYPE:
				return validateValuesType((ValuesType)value, diagnostics, context);
			case Tc60201Package.VALUE_TYPE:
				return validateValueType((ValueType)value, diagnostics, context);
			case Tc60201Package.VALUE_TYPE1:
				return validateValueType1((ValueType1)value, diagnostics, context);
			case Tc60201Package.VALUE_TYPE2:
				return validateValueType2((ValueType2)value, diagnostics, context);
			case Tc60201Package.VARIABLE_TYPE:
				return validateVariableType((VariableType)value, diagnostics, context);
			case Tc60201Package.VARIABLE_TYPE1:
				return validateVariableType1((VariableType1)value, diagnostics, context);
			case Tc60201Package.VARIABLE_TYPE2:
				return validateVariableType2((VariableType2)value, diagnostics, context);
			case Tc60201Package.VARIABLE_TYPE3:
				return validateVariableType3((VariableType3)value, diagnostics, context);
			case Tc60201Package.VARIABLE_TYPE4:
				return validateVariableType4((VariableType4)value, diagnostics, context);
			case Tc60201Package.VARIABLE_TYPE5:
				return validateVariableType5((VariableType5)value, diagnostics, context);
			case Tc60201Package.VARIABLE_TYPE6:
				return validateVariableType6((VariableType6)value, diagnostics, context);
			case Tc60201Package.VAR_LIST:
				return validateVarList((VarList)value, diagnostics, context);
			case Tc60201Package.VAR_LIST_ACCESS:
				return validateVarListAccess((VarListAccess)value, diagnostics, context);
			case Tc60201Package.VAR_LIST_CONFIG:
				return validateVarListConfig((VarListConfig)value, diagnostics, context);
			case Tc60201Package.VAR_LIST_PLAIN:
				return validateVarListPlain((VarListPlain)value, diagnostics, context);
			case Tc60201Package.VENDOR_ELEMENT_TYPE:
				return validateVendorElementType((VendorElementType)value, diagnostics, context);
			case Tc60201Package.WSTRING_TYPE:
				return validateWstringType((WstringType)value, diagnostics, context);
			case Tc60201Package.ACCESS_TYPE:
				return validateAccessType((AccessType)value, diagnostics, context);
			case Tc60201Package.EDGE_MODIFIER_TYPE:
				return validateEdgeModifierType((EdgeModifierType)value, diagnostics, context);
			case Tc60201Package.HANDLE_UNKNOWN_TYPE:
				return validateHandleUnknownType((HandleUnknownType)value, diagnostics, context);
			case Tc60201Package.POU_TYPE:
				return validatePouType((PouType)value, diagnostics, context);
			case Tc60201Package.QUALIFIER_TYPE:
				return validateQualifierType((QualifierType)value, diagnostics, context);
			case Tc60201Package.STORAGE_MODIFIER_TYPE:
				return validateStorageModifierType((StorageModifierType)value, diagnostics, context);
			case Tc60201Package.ACCESS_TYPE_OBJECT:
				return validateAccessTypeObject((AccessType)value, diagnostics, context);
			case Tc60201Package.EDGE_MODIFIER_TYPE_OBJECT:
				return validateEdgeModifierTypeObject((EdgeModifierType)value, diagnostics, context);
			case Tc60201Package.HANDLE_UNKNOWN_TYPE_OBJECT:
				return validateHandleUnknownTypeObject((HandleUnknownType)value, diagnostics, context);
			case Tc60201Package.POU_TYPE_OBJECT:
				return validatePouTypeObject((PouType)value, diagnostics, context);
			case Tc60201Package.PRIORITY_TYPE:
				return validatePriorityType((BigInteger)value, diagnostics, context);
			case Tc60201Package.QUALIFIER_TYPE_OBJECT:
				return validateQualifierTypeObject((QualifierType)value, diagnostics, context);
			case Tc60201Package.STORAGE_MODIFIER_TYPE_OBJECT:
				return validateStorageModifierTypeObject((StorageModifierType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessVariableType(AccessVariableType accessVariableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(accessVariableType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionBlockType(ActionBlockType actionBlockType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actionBlockType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionsType(ActionsType actionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionType(ActionType actionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionType1(ActionType1 actionType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actionType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddData(AddData addData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(addData, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddDataInfo(AddDataInfo addDataInfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(addDataInfo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArrayType(ArrayType arrayType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(arrayType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArrayValueType(ArrayValueType arrayValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(arrayValueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBlockType(BlockType blockType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(blockType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBody(Body body, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(body, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoilType(CoilType coilType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(coilType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommentType(CommentType commentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(commentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionType(ConditionType conditionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conditionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfigurationsType(ConfigurationsType configurationsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(configurationsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfigurationType(ConfigurationType configurationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(configurationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfigVariableType(ConfigVariableType configVariableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(configVariableType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnection(Connection connection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(connection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectionPointIn(ConnectionPointIn connectionPointIn, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(connectionPointIn, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectionPointInType(ConnectionPointInType connectionPointInType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(connectionPointInType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectionPointOut(ConnectionPointOut connectionPointOut, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(connectionPointOut, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectionPointOutActionType(ConnectionPointOutActionType connectionPointOutActionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(connectionPointOutActionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectionPointOutType(ConnectionPointOutType connectionPointOutType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(connectionPointOutType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectionPointOutType1(ConnectionPointOutType1 connectionPointOutType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(connectionPointOutType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectionPointOutType2(ConnectionPointOutType2 connectionPointOutType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(connectionPointOutType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectionPointOutType3(ConnectionPointOutType3 connectionPointOutType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(connectionPointOutType3, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectorType(ConnectorType connectorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(connectorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContactType(ContactType contactType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contactType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContentHeaderType(ContentHeaderType contentHeaderType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contentHeaderType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuationType(ContinuationType continuationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(continuationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoordinateInfoType(CoordinateInfoType coordinateInfoType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(coordinateInfoType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataType(DataType dataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataType1(DataType1 dataType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataTypesType(DataTypesType dataTypesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataTypesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataTypeType(DataTypeType dataTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataTypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDerivedType(DerivedType derivedType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(derivedType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumType(EnumType enumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enumType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateErrorType(ErrorType errorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(errorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalVarsType(ExternalVarsType externalVarsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(externalVarsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFbdType(FbdType fbdType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fbdType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFBDType1(FBDType1 fbdType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fbdType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFileHeaderType(FileHeaderType fileHeaderType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fileHeaderType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormattedText(FormattedText formattedText, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(formattedText, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalVarsType(GlobalVarsType globalVarsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(globalVarsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfoType(InfoType infoType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(infoType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInlineType(InlineType inlineType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inlineType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInOutVariablesType(InOutVariablesType inOutVariablesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inOutVariablesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInOutVariablesType1(InOutVariablesType1 inOutVariablesType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inOutVariablesType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInOutVariableType(InOutVariableType inOutVariableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inOutVariableType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInOutVarsType(InOutVarsType inOutVarsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inOutVarsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputVariablesType(InputVariablesType inputVariablesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inputVariablesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputVariablesType1(InputVariablesType1 inputVariablesType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inputVariablesType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputVarsType(InputVarsType inputVarsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inputVarsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstancesType(InstancesType instancesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(instancesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceType(InterfaceType interfaceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interfaceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInVariableType(InVariableType inVariableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inVariableType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJumpStepType(JumpStepType jumpStepType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(jumpStepType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJumpType(JumpType jumpType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(jumpType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLabelType(LabelType labelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(labelType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLdType(LdType ldType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ldType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLDType1(LDType1 ldType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ldType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLeftPowerRailType(LeftPowerRailType leftPowerRailType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(leftPowerRailType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocalVarsType(LocalVarsType localVarsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(localVarsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMacroStepType(MacroStepType macroStepType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(macroStepType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputVariablesType(OutputVariablesType outputVariablesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(outputVariablesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputVariablesType1(OutputVariablesType1 outputVariablesType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(outputVariablesType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputVarsType(OutputVarsType outputVarsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(outputVarsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutVariableType(OutVariableType outVariableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(outVariableType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePageSizeType(PageSizeType pageSizeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pageSizeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePointerType(PointerType pointerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pointerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePosition(Position position, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(position, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePouInstance(PouInstance pouInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pouInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePousType(PousType pousType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pousType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePouType1(PouType1 pouType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pouType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProjectType(ProjectType projectType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(projectType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRangeSigned(RangeSigned rangeSigned, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rangeSigned, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRangeUnsigned(RangeUnsigned rangeUnsigned, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rangeUnsigned, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenceType(ReferenceType referenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(referenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenceType1(ReferenceType1 referenceType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(referenceType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceType(ResourceType resourceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resourceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReturnType(ReturnType returnType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(returnType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRightPowerRailType(RightPowerRailType rightPowerRailType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rightPowerRailType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScalingType(ScalingType scalingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(scalingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScalingType1(ScalingType1 scalingType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(scalingType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScalingType2(ScalingType2 scalingType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(scalingType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelectionConvergenceType(SelectionConvergenceType selectionConvergenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(selectionConvergenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelectionDivergenceType(SelectionDivergenceType selectionDivergenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(selectionDivergenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSfcType(SfcType sfcType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sfcType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSFCType1(SFCType1 sfcType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sfcType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleValueType(SimpleValueType simpleValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(simpleValueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimultaneousConvergenceType(SimultaneousConvergenceType simultaneousConvergenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(simultaneousConvergenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimultaneousDivergenceType(SimultaneousDivergenceType simultaneousDivergenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(simultaneousDivergenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStepType(StepType stepType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stepType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringType(StringType stringType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stringType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructValueType(StructValueType structValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structValueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubrangeSignedType(SubrangeSignedType subrangeSignedType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subrangeSignedType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubrangeUnsignedType(SubrangeUnsignedType subrangeUnsignedType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subrangeUnsignedType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskType(TaskType taskType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(taskType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTempVarsType(TempVarsType tempVarsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tempVarsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransitionsType(TransitionsType transitionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transitionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransitionType(TransitionType transitionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transitionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransitionType1(TransitionType1 transitionType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transitionType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypesType(TypesType typesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValue(Value value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(value, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValuesType(ValuesType valuesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valuesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueType(ValueType valueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueType1(ValueType1 valueType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueType2(ValueType2 valueType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableType(VariableType variableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variableType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableType1(VariableType1 variableType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variableType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableType2(VariableType2 variableType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variableType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableType3(VariableType3 variableType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variableType3, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableType4(VariableType4 variableType4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variableType4, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableType5(VariableType5 variableType5, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variableType5, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableType6(VariableType6 variableType6, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variableType6, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVarList(VarList varList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(varList, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVarListAccess(VarListAccess varListAccess, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(varListAccess, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVarListConfig(VarListConfig varListConfig, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(varListConfig, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVarListPlain(VarListPlain varListPlain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(varListPlain, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVendorElementType(VendorElementType vendorElementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vendorElementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWstringType(WstringType wstringType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wstringType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessType(AccessType accessType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEdgeModifierType(EdgeModifierType edgeModifierType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHandleUnknownType(HandleUnknownType handleUnknownType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePouType(PouType pouType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQualifierType(QualifierType qualifierType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStorageModifierType(StorageModifierType storageModifierType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessTypeObject(AccessType accessTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEdgeModifierTypeObject(EdgeModifierType edgeModifierTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHandleUnknownTypeObject(HandleUnknownType handleUnknownTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePouTypeObject(PouType pouTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriorityType(BigInteger priorityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePriorityType_Min(priorityType, diagnostics, context);
		if (result || diagnostics != null) result &= validatePriorityType_Max(priorityType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePriorityType_Min
	 */
	public static final BigInteger PRIORITY_TYPE__MIN__VALUE = new BigInteger("0");

	/**
	 * Validates the Min constraint of '<em>Priority Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriorityType_Min(BigInteger priorityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = priorityType.compareTo(PRIORITY_TYPE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(Tc60201Package.eINSTANCE.getPriorityType(), priorityType, PRIORITY_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePriorityType_Max
	 */
	public static final BigInteger PRIORITY_TYPE__MAX__VALUE = new BigInteger("65535");

	/**
	 * Validates the Max constraint of '<em>Priority Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriorityType_Max(BigInteger priorityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = priorityType.compareTo(PRIORITY_TYPE__MAX__VALUE) <= 0;
		if (!result && diagnostics != null)
			reportMaxViolation(Tc60201Package.eINSTANCE.getPriorityType(), priorityType, PRIORITY_TYPE__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQualifierTypeObject(QualifierType qualifierTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStorageModifierTypeObject(StorageModifierType storageModifierTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //Tc60201Validator
