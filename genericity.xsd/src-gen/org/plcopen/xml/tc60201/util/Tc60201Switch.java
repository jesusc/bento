/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.plcopen.xml.tc60201.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.plcopen.xml.tc60201.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.plcopen.xml.tc60201.Tc60201Package
 * @generated
 */
public class Tc60201Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Tc60201Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tc60201Switch() {
		if (modelPackage == null) {
			modelPackage = Tc60201Package.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Tc60201Package.ACCESS_VARIABLE_TYPE: {
				AccessVariableType accessVariableType = (AccessVariableType)theEObject;
				T result = caseAccessVariableType(accessVariableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.ACTION_BLOCK_TYPE: {
				ActionBlockType actionBlockType = (ActionBlockType)theEObject;
				T result = caseActionBlockType(actionBlockType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.ACTIONS_TYPE: {
				ActionsType actionsType = (ActionsType)theEObject;
				T result = caseActionsType(actionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.ACTION_TYPE: {
				ActionType actionType = (ActionType)theEObject;
				T result = caseActionType(actionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.ACTION_TYPE1: {
				ActionType1 actionType1 = (ActionType1)theEObject;
				T result = caseActionType1(actionType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.ADD_DATA: {
				AddData addData = (AddData)theEObject;
				T result = caseAddData(addData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.ADD_DATA_INFO: {
				AddDataInfo addDataInfo = (AddDataInfo)theEObject;
				T result = caseAddDataInfo(addDataInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.ARRAY_TYPE: {
				ArrayType arrayType = (ArrayType)theEObject;
				T result = caseArrayType(arrayType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.ARRAY_VALUE_TYPE: {
				ArrayValueType arrayValueType = (ArrayValueType)theEObject;
				T result = caseArrayValueType(arrayValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.BLOCK_TYPE: {
				BlockType blockType = (BlockType)theEObject;
				T result = caseBlockType(blockType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.BODY: {
				Body body = (Body)theEObject;
				T result = caseBody(body);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.COIL_TYPE: {
				CoilType coilType = (CoilType)theEObject;
				T result = caseCoilType(coilType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.COMMENT_TYPE: {
				CommentType commentType = (CommentType)theEObject;
				T result = caseCommentType(commentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.CONDITION_TYPE: {
				ConditionType conditionType = (ConditionType)theEObject;
				T result = caseConditionType(conditionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.CONFIGURATIONS_TYPE: {
				ConfigurationsType configurationsType = (ConfigurationsType)theEObject;
				T result = caseConfigurationsType(configurationsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.CONFIGURATION_TYPE: {
				ConfigurationType configurationType = (ConfigurationType)theEObject;
				T result = caseConfigurationType(configurationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.CONFIG_VARIABLE_TYPE: {
				ConfigVariableType configVariableType = (ConfigVariableType)theEObject;
				T result = caseConfigVariableType(configVariableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.CONNECTION: {
				Connection connection = (Connection)theEObject;
				T result = caseConnection(connection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.CONNECTION_POINT_IN: {
				ConnectionPointIn connectionPointIn = (ConnectionPointIn)theEObject;
				T result = caseConnectionPointIn(connectionPointIn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.CONNECTION_POINT_IN_TYPE: {
				ConnectionPointInType connectionPointInType = (ConnectionPointInType)theEObject;
				T result = caseConnectionPointInType(connectionPointInType);
				if (result == null) result = caseConnectionPointIn(connectionPointInType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.CONNECTION_POINT_OUT: {
				ConnectionPointOut connectionPointOut = (ConnectionPointOut)theEObject;
				T result = caseConnectionPointOut(connectionPointOut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.CONNECTION_POINT_OUT_ACTION_TYPE: {
				ConnectionPointOutActionType connectionPointOutActionType = (ConnectionPointOutActionType)theEObject;
				T result = caseConnectionPointOutActionType(connectionPointOutActionType);
				if (result == null) result = caseConnectionPointOut(connectionPointOutActionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.CONNECTION_POINT_OUT_TYPE: {
				ConnectionPointOutType connectionPointOutType = (ConnectionPointOutType)theEObject;
				T result = caseConnectionPointOutType(connectionPointOutType);
				if (result == null) result = caseConnectionPointOut(connectionPointOutType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.CONNECTION_POINT_OUT_TYPE1: {
				ConnectionPointOutType1 connectionPointOutType1 = (ConnectionPointOutType1)theEObject;
				T result = caseConnectionPointOutType1(connectionPointOutType1);
				if (result == null) result = caseConnectionPointOut(connectionPointOutType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.CONNECTION_POINT_OUT_TYPE2: {
				ConnectionPointOutType2 connectionPointOutType2 = (ConnectionPointOutType2)theEObject;
				T result = caseConnectionPointOutType2(connectionPointOutType2);
				if (result == null) result = caseConnectionPointOut(connectionPointOutType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.CONNECTION_POINT_OUT_TYPE3: {
				ConnectionPointOutType3 connectionPointOutType3 = (ConnectionPointOutType3)theEObject;
				T result = caseConnectionPointOutType3(connectionPointOutType3);
				if (result == null) result = caseConnectionPointOut(connectionPointOutType3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.CONNECTOR_TYPE: {
				ConnectorType connectorType = (ConnectorType)theEObject;
				T result = caseConnectorType(connectorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.CONTACT_TYPE: {
				ContactType contactType = (ContactType)theEObject;
				T result = caseContactType(contactType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.CONTENT_HEADER_TYPE: {
				ContentHeaderType contentHeaderType = (ContentHeaderType)theEObject;
				T result = caseContentHeaderType(contentHeaderType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.CONTINUATION_TYPE: {
				ContinuationType continuationType = (ContinuationType)theEObject;
				T result = caseContinuationType(continuationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.COORDINATE_INFO_TYPE: {
				CoordinateInfoType coordinateInfoType = (CoordinateInfoType)theEObject;
				T result = caseCoordinateInfoType(coordinateInfoType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.DATA_TYPE: {
				DataType dataType = (DataType)theEObject;
				T result = caseDataType(dataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.DATA_TYPE1: {
				DataType1 dataType1 = (DataType1)theEObject;
				T result = caseDataType1(dataType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.DATA_TYPES_TYPE: {
				DataTypesType dataTypesType = (DataTypesType)theEObject;
				T result = caseDataTypesType(dataTypesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.DATA_TYPE_TYPE: {
				DataTypeType dataTypeType = (DataTypeType)theEObject;
				T result = caseDataTypeType(dataTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.DERIVED_TYPE: {
				DerivedType derivedType = (DerivedType)theEObject;
				T result = caseDerivedType(derivedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.ENUM_TYPE: {
				EnumType enumType = (EnumType)theEObject;
				T result = caseEnumType(enumType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.ERROR_TYPE: {
				ErrorType errorType = (ErrorType)theEObject;
				T result = caseErrorType(errorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.EXTERNAL_VARS_TYPE: {
				ExternalVarsType externalVarsType = (ExternalVarsType)theEObject;
				T result = caseExternalVarsType(externalVarsType);
				if (result == null) result = caseVarList(externalVarsType);
				if (result == null) result = caseVarListPlain(externalVarsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.FBD_TYPE: {
				FbdType fbdType = (FbdType)theEObject;
				T result = caseFbdType(fbdType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.FBD_TYPE1: {
				FBDType1 fbdType1 = (FBDType1)theEObject;
				T result = caseFBDType1(fbdType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.FILE_HEADER_TYPE: {
				FileHeaderType fileHeaderType = (FileHeaderType)theEObject;
				T result = caseFileHeaderType(fileHeaderType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.FORMATTED_TEXT: {
				FormattedText formattedText = (FormattedText)theEObject;
				T result = caseFormattedText(formattedText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.GLOBAL_VARS_TYPE: {
				GlobalVarsType globalVarsType = (GlobalVarsType)theEObject;
				T result = caseGlobalVarsType(globalVarsType);
				if (result == null) result = caseVarList(globalVarsType);
				if (result == null) result = caseVarListPlain(globalVarsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.INFO_TYPE: {
				InfoType infoType = (InfoType)theEObject;
				T result = caseInfoType(infoType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.INLINE_TYPE: {
				InlineType inlineType = (InlineType)theEObject;
				T result = caseInlineType(inlineType);
				if (result == null) result = caseBody(inlineType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.IN_OUT_VARIABLES_TYPE: {
				InOutVariablesType inOutVariablesType = (InOutVariablesType)theEObject;
				T result = caseInOutVariablesType(inOutVariablesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.IN_OUT_VARIABLES_TYPE1: {
				InOutVariablesType1 inOutVariablesType1 = (InOutVariablesType1)theEObject;
				T result = caseInOutVariablesType1(inOutVariablesType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.IN_OUT_VARIABLE_TYPE: {
				InOutVariableType inOutVariableType = (InOutVariableType)theEObject;
				T result = caseInOutVariableType(inOutVariableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.IN_OUT_VARS_TYPE: {
				InOutVarsType inOutVarsType = (InOutVarsType)theEObject;
				T result = caseInOutVarsType(inOutVarsType);
				if (result == null) result = caseVarList(inOutVarsType);
				if (result == null) result = caseVarListPlain(inOutVarsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.INPUT_VARIABLES_TYPE: {
				InputVariablesType inputVariablesType = (InputVariablesType)theEObject;
				T result = caseInputVariablesType(inputVariablesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.INPUT_VARIABLES_TYPE1: {
				InputVariablesType1 inputVariablesType1 = (InputVariablesType1)theEObject;
				T result = caseInputVariablesType1(inputVariablesType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.INPUT_VARS_TYPE: {
				InputVarsType inputVarsType = (InputVarsType)theEObject;
				T result = caseInputVarsType(inputVarsType);
				if (result == null) result = caseVarList(inputVarsType);
				if (result == null) result = caseVarListPlain(inputVarsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.INSTANCES_TYPE: {
				InstancesType instancesType = (InstancesType)theEObject;
				T result = caseInstancesType(instancesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.INTERFACE_TYPE: {
				InterfaceType interfaceType = (InterfaceType)theEObject;
				T result = caseInterfaceType(interfaceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.IN_VARIABLE_TYPE: {
				InVariableType inVariableType = (InVariableType)theEObject;
				T result = caseInVariableType(inVariableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.JUMP_STEP_TYPE: {
				JumpStepType jumpStepType = (JumpStepType)theEObject;
				T result = caseJumpStepType(jumpStepType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.JUMP_TYPE: {
				JumpType jumpType = (JumpType)theEObject;
				T result = caseJumpType(jumpType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.LABEL_TYPE: {
				LabelType labelType = (LabelType)theEObject;
				T result = caseLabelType(labelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.LD_TYPE: {
				LdType ldType = (LdType)theEObject;
				T result = caseLdType(ldType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.LD_TYPE1: {
				LDType1 ldType1 = (LDType1)theEObject;
				T result = caseLDType1(ldType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.LEFT_POWER_RAIL_TYPE: {
				LeftPowerRailType leftPowerRailType = (LeftPowerRailType)theEObject;
				T result = caseLeftPowerRailType(leftPowerRailType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.LOCAL_VARS_TYPE: {
				LocalVarsType localVarsType = (LocalVarsType)theEObject;
				T result = caseLocalVarsType(localVarsType);
				if (result == null) result = caseVarList(localVarsType);
				if (result == null) result = caseVarListPlain(localVarsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.MACRO_STEP_TYPE: {
				MacroStepType macroStepType = (MacroStepType)theEObject;
				T result = caseMacroStepType(macroStepType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.OUTPUT_VARIABLES_TYPE: {
				OutputVariablesType outputVariablesType = (OutputVariablesType)theEObject;
				T result = caseOutputVariablesType(outputVariablesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.OUTPUT_VARIABLES_TYPE1: {
				OutputVariablesType1 outputVariablesType1 = (OutputVariablesType1)theEObject;
				T result = caseOutputVariablesType1(outputVariablesType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.OUTPUT_VARS_TYPE: {
				OutputVarsType outputVarsType = (OutputVarsType)theEObject;
				T result = caseOutputVarsType(outputVarsType);
				if (result == null) result = caseVarList(outputVarsType);
				if (result == null) result = caseVarListPlain(outputVarsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.OUT_VARIABLE_TYPE: {
				OutVariableType outVariableType = (OutVariableType)theEObject;
				T result = caseOutVariableType(outVariableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.PAGE_SIZE_TYPE: {
				PageSizeType pageSizeType = (PageSizeType)theEObject;
				T result = casePageSizeType(pageSizeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.POINTER_TYPE: {
				PointerType pointerType = (PointerType)theEObject;
				T result = casePointerType(pointerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.POSITION: {
				Position position = (Position)theEObject;
				T result = casePosition(position);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.POU_INSTANCE: {
				PouInstance pouInstance = (PouInstance)theEObject;
				T result = casePouInstance(pouInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.POUS_TYPE: {
				PousType pousType = (PousType)theEObject;
				T result = casePousType(pousType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.POU_TYPE1: {
				PouType1 pouType1 = (PouType1)theEObject;
				T result = casePouType1(pouType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.PROJECT_TYPE: {
				ProjectType projectType = (ProjectType)theEObject;
				T result = caseProjectType(projectType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.RANGE_SIGNED: {
				RangeSigned rangeSigned = (RangeSigned)theEObject;
				T result = caseRangeSigned(rangeSigned);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.RANGE_UNSIGNED: {
				RangeUnsigned rangeUnsigned = (RangeUnsigned)theEObject;
				T result = caseRangeUnsigned(rangeUnsigned);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.REFERENCE_TYPE: {
				ReferenceType referenceType = (ReferenceType)theEObject;
				T result = caseReferenceType(referenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.REFERENCE_TYPE1: {
				ReferenceType1 referenceType1 = (ReferenceType1)theEObject;
				T result = caseReferenceType1(referenceType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.RESOURCE_TYPE: {
				ResourceType resourceType = (ResourceType)theEObject;
				T result = caseResourceType(resourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.RETURN_TYPE: {
				ReturnType returnType = (ReturnType)theEObject;
				T result = caseReturnType(returnType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.RIGHT_POWER_RAIL_TYPE: {
				RightPowerRailType rightPowerRailType = (RightPowerRailType)theEObject;
				T result = caseRightPowerRailType(rightPowerRailType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.SCALING_TYPE: {
				ScalingType scalingType = (ScalingType)theEObject;
				T result = caseScalingType(scalingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.SCALING_TYPE1: {
				ScalingType1 scalingType1 = (ScalingType1)theEObject;
				T result = caseScalingType1(scalingType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.SCALING_TYPE2: {
				ScalingType2 scalingType2 = (ScalingType2)theEObject;
				T result = caseScalingType2(scalingType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.SELECTION_CONVERGENCE_TYPE: {
				SelectionConvergenceType selectionConvergenceType = (SelectionConvergenceType)theEObject;
				T result = caseSelectionConvergenceType(selectionConvergenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.SELECTION_DIVERGENCE_TYPE: {
				SelectionDivergenceType selectionDivergenceType = (SelectionDivergenceType)theEObject;
				T result = caseSelectionDivergenceType(selectionDivergenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.SFC_TYPE: {
				SfcType sfcType = (SfcType)theEObject;
				T result = caseSfcType(sfcType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.SFC_TYPE1: {
				SFCType1 sfcType1 = (SFCType1)theEObject;
				T result = caseSFCType1(sfcType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.SIMPLE_VALUE_TYPE: {
				SimpleValueType simpleValueType = (SimpleValueType)theEObject;
				T result = caseSimpleValueType(simpleValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.SIMULTANEOUS_CONVERGENCE_TYPE: {
				SimultaneousConvergenceType simultaneousConvergenceType = (SimultaneousConvergenceType)theEObject;
				T result = caseSimultaneousConvergenceType(simultaneousConvergenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.SIMULTANEOUS_DIVERGENCE_TYPE: {
				SimultaneousDivergenceType simultaneousDivergenceType = (SimultaneousDivergenceType)theEObject;
				T result = caseSimultaneousDivergenceType(simultaneousDivergenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.STEP_TYPE: {
				StepType stepType = (StepType)theEObject;
				T result = caseStepType(stepType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.STRING_TYPE: {
				StringType stringType = (StringType)theEObject;
				T result = caseStringType(stringType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.STRUCT_VALUE_TYPE: {
				StructValueType structValueType = (StructValueType)theEObject;
				T result = caseStructValueType(structValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.SUBRANGE_SIGNED_TYPE: {
				SubrangeSignedType subrangeSignedType = (SubrangeSignedType)theEObject;
				T result = caseSubrangeSignedType(subrangeSignedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.SUBRANGE_UNSIGNED_TYPE: {
				SubrangeUnsignedType subrangeUnsignedType = (SubrangeUnsignedType)theEObject;
				T result = caseSubrangeUnsignedType(subrangeUnsignedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.TASK_TYPE: {
				TaskType taskType = (TaskType)theEObject;
				T result = caseTaskType(taskType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.TEMP_VARS_TYPE: {
				TempVarsType tempVarsType = (TempVarsType)theEObject;
				T result = caseTempVarsType(tempVarsType);
				if (result == null) result = caseVarList(tempVarsType);
				if (result == null) result = caseVarListPlain(tempVarsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.TRANSITIONS_TYPE: {
				TransitionsType transitionsType = (TransitionsType)theEObject;
				T result = caseTransitionsType(transitionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.TRANSITION_TYPE: {
				TransitionType transitionType = (TransitionType)theEObject;
				T result = caseTransitionType(transitionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.TRANSITION_TYPE1: {
				TransitionType1 transitionType1 = (TransitionType1)theEObject;
				T result = caseTransitionType1(transitionType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.TYPES_TYPE: {
				TypesType typesType = (TypesType)theEObject;
				T result = caseTypesType(typesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.VALUE: {
				Value value = (Value)theEObject;
				T result = caseValue(value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.VALUES_TYPE: {
				ValuesType valuesType = (ValuesType)theEObject;
				T result = caseValuesType(valuesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.VALUE_TYPE: {
				ValueType valueType = (ValueType)theEObject;
				T result = caseValueType(valueType);
				if (result == null) result = caseValue(valueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.VALUE_TYPE1: {
				ValueType1 valueType1 = (ValueType1)theEObject;
				T result = caseValueType1(valueType1);
				if (result == null) result = caseValue(valueType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.VALUE_TYPE2: {
				ValueType2 valueType2 = (ValueType2)theEObject;
				T result = caseValueType2(valueType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.VARIABLE_TYPE: {
				VariableType variableType = (VariableType)theEObject;
				T result = caseVariableType(variableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.VARIABLE_TYPE1: {
				VariableType1 variableType1 = (VariableType1)theEObject;
				T result = caseVariableType1(variableType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.VARIABLE_TYPE2: {
				VariableType2 variableType2 = (VariableType2)theEObject;
				T result = caseVariableType2(variableType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.VARIABLE_TYPE3: {
				VariableType3 variableType3 = (VariableType3)theEObject;
				T result = caseVariableType3(variableType3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.VARIABLE_TYPE4: {
				VariableType4 variableType4 = (VariableType4)theEObject;
				T result = caseVariableType4(variableType4);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.VARIABLE_TYPE5: {
				VariableType5 variableType5 = (VariableType5)theEObject;
				T result = caseVariableType5(variableType5);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.VARIABLE_TYPE6: {
				VariableType6 variableType6 = (VariableType6)theEObject;
				T result = caseVariableType6(variableType6);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.VAR_LIST: {
				VarList varList = (VarList)theEObject;
				T result = caseVarList(varList);
				if (result == null) result = caseVarListPlain(varList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.VAR_LIST_ACCESS: {
				VarListAccess varListAccess = (VarListAccess)theEObject;
				T result = caseVarListAccess(varListAccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.VAR_LIST_CONFIG: {
				VarListConfig varListConfig = (VarListConfig)theEObject;
				T result = caseVarListConfig(varListConfig);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.VAR_LIST_PLAIN: {
				VarListPlain varListPlain = (VarListPlain)theEObject;
				T result = caseVarListPlain(varListPlain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.VENDOR_ELEMENT_TYPE: {
				VendorElementType vendorElementType = (VendorElementType)theEObject;
				T result = caseVendorElementType(vendorElementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Tc60201Package.WSTRING_TYPE: {
				WstringType wstringType = (WstringType)theEObject;
				T result = caseWstringType(wstringType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Access Variable Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Access Variable Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessVariableType(AccessVariableType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Block Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Block Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionBlockType(ActionBlockType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionsType(ActionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionType(ActionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionType1(ActionType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddData(AddData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Data Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Data Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddDataInfo(AddDataInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayType(ArrayType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayValueType(ArrayValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlockType(BlockType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Body</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Body</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBody(Body object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coil Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coil Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoilType(CoilType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comment Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comment Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommentType(CommentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionType(ConditionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configurations Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configurations Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurationsType(ConfigurationsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurationType(ConfigurationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Config Variable Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Config Variable Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigVariableType(ConfigVariableType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnection(Connection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Point In</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Point In</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionPointIn(ConnectionPointIn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Point In Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Point In Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionPointInType(ConnectionPointInType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Point Out</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Point Out</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionPointOut(ConnectionPointOut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Point Out Action Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Point Out Action Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionPointOutActionType(ConnectionPointOutActionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Point Out Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Point Out Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionPointOutType(ConnectionPointOutType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Point Out Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Point Out Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionPointOutType1(ConnectionPointOutType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Point Out Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Point Out Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionPointOutType2(ConnectionPointOutType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Point Out Type3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Point Out Type3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionPointOutType3(ConnectionPointOutType3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectorType(ConnectorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contact Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contact Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContactType(ContactType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Header Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Header Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentHeaderType(ContentHeaderType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Continuation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Continuation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContinuationType(ContinuationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coordinate Info Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coordinate Info Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoordinateInfoType(CoordinateInfoType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataType(DataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataType1(DataType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Types Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Types Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataTypesType(DataTypesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataTypeType(DataTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Derived Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Derived Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDerivedType(DerivedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumType(EnumType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorType(ErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Vars Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Vars Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalVarsType(ExternalVarsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fbd Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fbd Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFbdType(FbdType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FBD Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FBD Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFBDType1(FBDType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Header Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Header Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileHeaderType(FileHeaderType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Formatted Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Formatted Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormattedText(FormattedText object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Vars Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Vars Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalVarsType(GlobalVarsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Info Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Info Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfoType(InfoType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inline Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inline Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInlineType(InlineType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>In Out Variables Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>In Out Variables Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInOutVariablesType(InOutVariablesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>In Out Variables Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>In Out Variables Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInOutVariablesType1(InOutVariablesType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>In Out Variable Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>In Out Variable Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInOutVariableType(InOutVariableType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>In Out Vars Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>In Out Vars Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInOutVarsType(InOutVarsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Variables Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Variables Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputVariablesType(InputVariablesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Variables Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Variables Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputVariablesType1(InputVariablesType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Vars Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Vars Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputVarsType(InputVarsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instances Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instances Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstancesType(InstancesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceType(InterfaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>In Variable Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>In Variable Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInVariableType(InVariableType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jump Step Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jump Step Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJumpStepType(JumpStepType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jump Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jump Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJumpType(JumpType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabelType(LabelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ld Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ld Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLdType(LdType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LD Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LD Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLDType1(LDType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Left Power Rail Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Left Power Rail Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeftPowerRailType(LeftPowerRailType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Vars Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Vars Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalVarsType(LocalVarsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Macro Step Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Macro Step Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMacroStepType(MacroStepType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Variables Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Variables Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputVariablesType(OutputVariablesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Variables Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Variables Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputVariablesType1(OutputVariablesType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Vars Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Vars Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputVarsType(OutputVarsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Out Variable Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Out Variable Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutVariableType(OutVariableType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page Size Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page Size Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePageSizeType(PageSizeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pointer Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pointer Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointerType(PointerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Position</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Position</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePosition(Position object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pou Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pou Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePouInstance(PouInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pous Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pous Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePousType(PousType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pou Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pou Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePouType1(PouType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProjectType(ProjectType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range Signed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range Signed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRangeSigned(RangeSigned object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range Unsigned</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range Unsigned</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRangeUnsigned(RangeUnsigned object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceType(ReferenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceType1(ReferenceType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceType(ResourceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnType(ReturnType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Right Power Rail Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Right Power Rail Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRightPowerRailType(RightPowerRailType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scaling Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scaling Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScalingType(ScalingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scaling Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scaling Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScalingType1(ScalingType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scaling Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scaling Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScalingType2(ScalingType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Selection Convergence Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selection Convergence Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectionConvergenceType(SelectionConvergenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Selection Divergence Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selection Divergence Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectionDivergenceType(SelectionDivergenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sfc Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sfc Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSfcType(SfcType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SFC Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SFC Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSFCType1(SFCType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleValueType(SimpleValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simultaneous Convergence Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simultaneous Convergence Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimultaneousConvergenceType(SimultaneousConvergenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simultaneous Divergence Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simultaneous Divergence Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimultaneousDivergenceType(SimultaneousDivergenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStepType(StepType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringType(StringType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Struct Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Struct Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructValueType(StructValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subrange Signed Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subrange Signed Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubrangeSignedType(SubrangeSignedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subrange Unsigned Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subrange Unsigned Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubrangeUnsignedType(SubrangeUnsignedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskType(TaskType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temp Vars Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temp Vars Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTempVarsType(TempVarsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transitions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transitions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitionsType(TransitionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitionType(TransitionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransitionType1(TransitionType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Types Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Types Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypesType(TypesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValue(Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Values Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Values Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValuesType(ValuesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueType(ValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueType1(ValueType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueType2(ValueType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableType(VariableType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableType1(VariableType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableType2(VariableType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Type3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Type3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableType3(VariableType3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Type4</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Type4</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableType4(VariableType4 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Type5</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Type5</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableType5(VariableType5 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Type6</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Type6</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableType6(VariableType6 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Var List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Var List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVarList(VarList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Var List Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Var List Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVarListAccess(VarListAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Var List Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Var List Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVarListConfig(VarListConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Var List Plain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Var List Plain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVarListPlain(VarListPlain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vendor Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vendor Element Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVendorElementType(VendorElementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wstring Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wstring Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWstringType(WstringType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //Tc60201Switch
