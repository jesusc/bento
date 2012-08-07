/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.plcopen.xml.tc60201.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.plcopen.xml.tc60201.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.plcopen.xml.tc60201.Tc60201Package
 * @generated
 */
public class Tc60201AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Tc60201Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tc60201AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Tc60201Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tc60201Switch<Adapter> modelSwitch =
		new Tc60201Switch<Adapter>() {
			@Override
			public Adapter caseAccessVariableType(AccessVariableType object) {
				return createAccessVariableTypeAdapter();
			}
			@Override
			public Adapter caseActionBlockType(ActionBlockType object) {
				return createActionBlockTypeAdapter();
			}
			@Override
			public Adapter caseActionsType(ActionsType object) {
				return createActionsTypeAdapter();
			}
			@Override
			public Adapter caseActionType(ActionType object) {
				return createActionTypeAdapter();
			}
			@Override
			public Adapter caseActionType1(ActionType1 object) {
				return createActionType1Adapter();
			}
			@Override
			public Adapter caseAddData(AddData object) {
				return createAddDataAdapter();
			}
			@Override
			public Adapter caseAddDataInfo(AddDataInfo object) {
				return createAddDataInfoAdapter();
			}
			@Override
			public Adapter caseArrayType(ArrayType object) {
				return createArrayTypeAdapter();
			}
			@Override
			public Adapter caseArrayValueType(ArrayValueType object) {
				return createArrayValueTypeAdapter();
			}
			@Override
			public Adapter caseBlockType(BlockType object) {
				return createBlockTypeAdapter();
			}
			@Override
			public Adapter caseBody(Body object) {
				return createBodyAdapter();
			}
			@Override
			public Adapter caseCoilType(CoilType object) {
				return createCoilTypeAdapter();
			}
			@Override
			public Adapter caseCommentType(CommentType object) {
				return createCommentTypeAdapter();
			}
			@Override
			public Adapter caseConditionType(ConditionType object) {
				return createConditionTypeAdapter();
			}
			@Override
			public Adapter caseConfigurationsType(ConfigurationsType object) {
				return createConfigurationsTypeAdapter();
			}
			@Override
			public Adapter caseConfigurationType(ConfigurationType object) {
				return createConfigurationTypeAdapter();
			}
			@Override
			public Adapter caseConfigVariableType(ConfigVariableType object) {
				return createConfigVariableTypeAdapter();
			}
			@Override
			public Adapter caseConnection(Connection object) {
				return createConnectionAdapter();
			}
			@Override
			public Adapter caseConnectionPointIn(ConnectionPointIn object) {
				return createConnectionPointInAdapter();
			}
			@Override
			public Adapter caseConnectionPointInType(ConnectionPointInType object) {
				return createConnectionPointInTypeAdapter();
			}
			@Override
			public Adapter caseConnectionPointOut(ConnectionPointOut object) {
				return createConnectionPointOutAdapter();
			}
			@Override
			public Adapter caseConnectionPointOutActionType(ConnectionPointOutActionType object) {
				return createConnectionPointOutActionTypeAdapter();
			}
			@Override
			public Adapter caseConnectionPointOutType(ConnectionPointOutType object) {
				return createConnectionPointOutTypeAdapter();
			}
			@Override
			public Adapter caseConnectionPointOutType1(ConnectionPointOutType1 object) {
				return createConnectionPointOutType1Adapter();
			}
			@Override
			public Adapter caseConnectionPointOutType2(ConnectionPointOutType2 object) {
				return createConnectionPointOutType2Adapter();
			}
			@Override
			public Adapter caseConnectionPointOutType3(ConnectionPointOutType3 object) {
				return createConnectionPointOutType3Adapter();
			}
			@Override
			public Adapter caseConnectorType(ConnectorType object) {
				return createConnectorTypeAdapter();
			}
			@Override
			public Adapter caseContactType(ContactType object) {
				return createContactTypeAdapter();
			}
			@Override
			public Adapter caseContentHeaderType(ContentHeaderType object) {
				return createContentHeaderTypeAdapter();
			}
			@Override
			public Adapter caseContinuationType(ContinuationType object) {
				return createContinuationTypeAdapter();
			}
			@Override
			public Adapter caseCoordinateInfoType(CoordinateInfoType object) {
				return createCoordinateInfoTypeAdapter();
			}
			@Override
			public Adapter caseDataType(DataType object) {
				return createDataTypeAdapter();
			}
			@Override
			public Adapter caseDataType1(DataType1 object) {
				return createDataType1Adapter();
			}
			@Override
			public Adapter caseDataTypesType(DataTypesType object) {
				return createDataTypesTypeAdapter();
			}
			@Override
			public Adapter caseDataTypeType(DataTypeType object) {
				return createDataTypeTypeAdapter();
			}
			@Override
			public Adapter caseDerivedType(DerivedType object) {
				return createDerivedTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseEnumType(EnumType object) {
				return createEnumTypeAdapter();
			}
			@Override
			public Adapter caseErrorType(ErrorType object) {
				return createErrorTypeAdapter();
			}
			@Override
			public Adapter caseExternalVarsType(ExternalVarsType object) {
				return createExternalVarsTypeAdapter();
			}
			@Override
			public Adapter caseFbdType(FbdType object) {
				return createFbdTypeAdapter();
			}
			@Override
			public Adapter caseFBDType1(FBDType1 object) {
				return createFBDType1Adapter();
			}
			@Override
			public Adapter caseFileHeaderType(FileHeaderType object) {
				return createFileHeaderTypeAdapter();
			}
			@Override
			public Adapter caseFormattedText(FormattedText object) {
				return createFormattedTextAdapter();
			}
			@Override
			public Adapter caseGlobalVarsType(GlobalVarsType object) {
				return createGlobalVarsTypeAdapter();
			}
			@Override
			public Adapter caseInfoType(InfoType object) {
				return createInfoTypeAdapter();
			}
			@Override
			public Adapter caseInlineType(InlineType object) {
				return createInlineTypeAdapter();
			}
			@Override
			public Adapter caseInOutVariablesType(InOutVariablesType object) {
				return createInOutVariablesTypeAdapter();
			}
			@Override
			public Adapter caseInOutVariablesType1(InOutVariablesType1 object) {
				return createInOutVariablesType1Adapter();
			}
			@Override
			public Adapter caseInOutVariableType(InOutVariableType object) {
				return createInOutVariableTypeAdapter();
			}
			@Override
			public Adapter caseInOutVarsType(InOutVarsType object) {
				return createInOutVarsTypeAdapter();
			}
			@Override
			public Adapter caseInputVariablesType(InputVariablesType object) {
				return createInputVariablesTypeAdapter();
			}
			@Override
			public Adapter caseInputVariablesType1(InputVariablesType1 object) {
				return createInputVariablesType1Adapter();
			}
			@Override
			public Adapter caseInputVarsType(InputVarsType object) {
				return createInputVarsTypeAdapter();
			}
			@Override
			public Adapter caseInstancesType(InstancesType object) {
				return createInstancesTypeAdapter();
			}
			@Override
			public Adapter caseInterfaceType(InterfaceType object) {
				return createInterfaceTypeAdapter();
			}
			@Override
			public Adapter caseInVariableType(InVariableType object) {
				return createInVariableTypeAdapter();
			}
			@Override
			public Adapter caseJumpStepType(JumpStepType object) {
				return createJumpStepTypeAdapter();
			}
			@Override
			public Adapter caseJumpType(JumpType object) {
				return createJumpTypeAdapter();
			}
			@Override
			public Adapter caseLabelType(LabelType object) {
				return createLabelTypeAdapter();
			}
			@Override
			public Adapter caseLdType(LdType object) {
				return createLdTypeAdapter();
			}
			@Override
			public Adapter caseLDType1(LDType1 object) {
				return createLDType1Adapter();
			}
			@Override
			public Adapter caseLeftPowerRailType(LeftPowerRailType object) {
				return createLeftPowerRailTypeAdapter();
			}
			@Override
			public Adapter caseLocalVarsType(LocalVarsType object) {
				return createLocalVarsTypeAdapter();
			}
			@Override
			public Adapter caseMacroStepType(MacroStepType object) {
				return createMacroStepTypeAdapter();
			}
			@Override
			public Adapter caseOutputVariablesType(OutputVariablesType object) {
				return createOutputVariablesTypeAdapter();
			}
			@Override
			public Adapter caseOutputVariablesType1(OutputVariablesType1 object) {
				return createOutputVariablesType1Adapter();
			}
			@Override
			public Adapter caseOutputVarsType(OutputVarsType object) {
				return createOutputVarsTypeAdapter();
			}
			@Override
			public Adapter caseOutVariableType(OutVariableType object) {
				return createOutVariableTypeAdapter();
			}
			@Override
			public Adapter casePageSizeType(PageSizeType object) {
				return createPageSizeTypeAdapter();
			}
			@Override
			public Adapter casePointerType(PointerType object) {
				return createPointerTypeAdapter();
			}
			@Override
			public Adapter casePosition(Position object) {
				return createPositionAdapter();
			}
			@Override
			public Adapter casePouInstance(PouInstance object) {
				return createPouInstanceAdapter();
			}
			@Override
			public Adapter casePousType(PousType object) {
				return createPousTypeAdapter();
			}
			@Override
			public Adapter casePouType1(PouType1 object) {
				return createPouType1Adapter();
			}
			@Override
			public Adapter caseProjectType(ProjectType object) {
				return createProjectTypeAdapter();
			}
			@Override
			public Adapter caseRangeSigned(RangeSigned object) {
				return createRangeSignedAdapter();
			}
			@Override
			public Adapter caseRangeUnsigned(RangeUnsigned object) {
				return createRangeUnsignedAdapter();
			}
			@Override
			public Adapter caseReferenceType(ReferenceType object) {
				return createReferenceTypeAdapter();
			}
			@Override
			public Adapter caseReferenceType1(ReferenceType1 object) {
				return createReferenceType1Adapter();
			}
			@Override
			public Adapter caseResourceType(ResourceType object) {
				return createResourceTypeAdapter();
			}
			@Override
			public Adapter caseReturnType(ReturnType object) {
				return createReturnTypeAdapter();
			}
			@Override
			public Adapter caseRightPowerRailType(RightPowerRailType object) {
				return createRightPowerRailTypeAdapter();
			}
			@Override
			public Adapter caseScalingType(ScalingType object) {
				return createScalingTypeAdapter();
			}
			@Override
			public Adapter caseScalingType1(ScalingType1 object) {
				return createScalingType1Adapter();
			}
			@Override
			public Adapter caseScalingType2(ScalingType2 object) {
				return createScalingType2Adapter();
			}
			@Override
			public Adapter caseSelectionConvergenceType(SelectionConvergenceType object) {
				return createSelectionConvergenceTypeAdapter();
			}
			@Override
			public Adapter caseSelectionDivergenceType(SelectionDivergenceType object) {
				return createSelectionDivergenceTypeAdapter();
			}
			@Override
			public Adapter caseSfcType(SfcType object) {
				return createSfcTypeAdapter();
			}
			@Override
			public Adapter caseSFCType1(SFCType1 object) {
				return createSFCType1Adapter();
			}
			@Override
			public Adapter caseSimpleValueType(SimpleValueType object) {
				return createSimpleValueTypeAdapter();
			}
			@Override
			public Adapter caseSimultaneousConvergenceType(SimultaneousConvergenceType object) {
				return createSimultaneousConvergenceTypeAdapter();
			}
			@Override
			public Adapter caseSimultaneousDivergenceType(SimultaneousDivergenceType object) {
				return createSimultaneousDivergenceTypeAdapter();
			}
			@Override
			public Adapter caseStepType(StepType object) {
				return createStepTypeAdapter();
			}
			@Override
			public Adapter caseStringType(StringType object) {
				return createStringTypeAdapter();
			}
			@Override
			public Adapter caseStructValueType(StructValueType object) {
				return createStructValueTypeAdapter();
			}
			@Override
			public Adapter caseSubrangeSignedType(SubrangeSignedType object) {
				return createSubrangeSignedTypeAdapter();
			}
			@Override
			public Adapter caseSubrangeUnsignedType(SubrangeUnsignedType object) {
				return createSubrangeUnsignedTypeAdapter();
			}
			@Override
			public Adapter caseTaskType(TaskType object) {
				return createTaskTypeAdapter();
			}
			@Override
			public Adapter caseTempVarsType(TempVarsType object) {
				return createTempVarsTypeAdapter();
			}
			@Override
			public Adapter caseTransitionsType(TransitionsType object) {
				return createTransitionsTypeAdapter();
			}
			@Override
			public Adapter caseTransitionType(TransitionType object) {
				return createTransitionTypeAdapter();
			}
			@Override
			public Adapter caseTransitionType1(TransitionType1 object) {
				return createTransitionType1Adapter();
			}
			@Override
			public Adapter caseTypesType(TypesType object) {
				return createTypesTypeAdapter();
			}
			@Override
			public Adapter caseValue(Value object) {
				return createValueAdapter();
			}
			@Override
			public Adapter caseValuesType(ValuesType object) {
				return createValuesTypeAdapter();
			}
			@Override
			public Adapter caseValueType(ValueType object) {
				return createValueTypeAdapter();
			}
			@Override
			public Adapter caseValueType1(ValueType1 object) {
				return createValueType1Adapter();
			}
			@Override
			public Adapter caseValueType2(ValueType2 object) {
				return createValueType2Adapter();
			}
			@Override
			public Adapter caseVariableType(VariableType object) {
				return createVariableTypeAdapter();
			}
			@Override
			public Adapter caseVariableType1(VariableType1 object) {
				return createVariableType1Adapter();
			}
			@Override
			public Adapter caseVariableType2(VariableType2 object) {
				return createVariableType2Adapter();
			}
			@Override
			public Adapter caseVariableType3(VariableType3 object) {
				return createVariableType3Adapter();
			}
			@Override
			public Adapter caseVariableType4(VariableType4 object) {
				return createVariableType4Adapter();
			}
			@Override
			public Adapter caseVariableType5(VariableType5 object) {
				return createVariableType5Adapter();
			}
			@Override
			public Adapter caseVariableType6(VariableType6 object) {
				return createVariableType6Adapter();
			}
			@Override
			public Adapter caseVarList(VarList object) {
				return createVarListAdapter();
			}
			@Override
			public Adapter caseVarListAccess(VarListAccess object) {
				return createVarListAccessAdapter();
			}
			@Override
			public Adapter caseVarListConfig(VarListConfig object) {
				return createVarListConfigAdapter();
			}
			@Override
			public Adapter caseVarListPlain(VarListPlain object) {
				return createVarListPlainAdapter();
			}
			@Override
			public Adapter caseVendorElementType(VendorElementType object) {
				return createVendorElementTypeAdapter();
			}
			@Override
			public Adapter caseWstringType(WstringType object) {
				return createWstringTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.AccessVariableType <em>Access Variable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.AccessVariableType
	 * @generated
	 */
	public Adapter createAccessVariableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.ActionBlockType <em>Action Block Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.ActionBlockType
	 * @generated
	 */
	public Adapter createActionBlockTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.ActionsType <em>Actions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.ActionsType
	 * @generated
	 */
	public Adapter createActionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.ActionType <em>Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.ActionType
	 * @generated
	 */
	public Adapter createActionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.ActionType1 <em>Action Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.ActionType1
	 * @generated
	 */
	public Adapter createActionType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.AddData <em>Add Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.AddData
	 * @generated
	 */
	public Adapter createAddDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.AddDataInfo <em>Add Data Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.AddDataInfo
	 * @generated
	 */
	public Adapter createAddDataInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.ArrayType <em>Array Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.ArrayType
	 * @generated
	 */
	public Adapter createArrayTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.ArrayValueType <em>Array Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.ArrayValueType
	 * @generated
	 */
	public Adapter createArrayValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.BlockType <em>Block Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.BlockType
	 * @generated
	 */
	public Adapter createBlockTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.Body <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.Body
	 * @generated
	 */
	public Adapter createBodyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.CoilType <em>Coil Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.CoilType
	 * @generated
	 */
	public Adapter createCoilTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.CommentType <em>Comment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.CommentType
	 * @generated
	 */
	public Adapter createCommentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.ConditionType <em>Condition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.ConditionType
	 * @generated
	 */
	public Adapter createConditionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.ConfigurationsType <em>Configurations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.ConfigurationsType
	 * @generated
	 */
	public Adapter createConfigurationsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.ConfigurationType <em>Configuration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.ConfigurationType
	 * @generated
	 */
	public Adapter createConfigurationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.ConfigVariableType <em>Config Variable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.ConfigVariableType
	 * @generated
	 */
	public Adapter createConfigVariableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.Connection
	 * @generated
	 */
	public Adapter createConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.ConnectionPointIn <em>Connection Point In</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.ConnectionPointIn
	 * @generated
	 */
	public Adapter createConnectionPointInAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.ConnectionPointInType <em>Connection Point In Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.ConnectionPointInType
	 * @generated
	 */
	public Adapter createConnectionPointInTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.ConnectionPointOut <em>Connection Point Out</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.ConnectionPointOut
	 * @generated
	 */
	public Adapter createConnectionPointOutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.ConnectionPointOutActionType <em>Connection Point Out Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.ConnectionPointOutActionType
	 * @generated
	 */
	public Adapter createConnectionPointOutActionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.ConnectionPointOutType <em>Connection Point Out Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.ConnectionPointOutType
	 * @generated
	 */
	public Adapter createConnectionPointOutTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.ConnectionPointOutType1 <em>Connection Point Out Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.ConnectionPointOutType1
	 * @generated
	 */
	public Adapter createConnectionPointOutType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.ConnectionPointOutType2 <em>Connection Point Out Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.ConnectionPointOutType2
	 * @generated
	 */
	public Adapter createConnectionPointOutType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.ConnectionPointOutType3 <em>Connection Point Out Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.ConnectionPointOutType3
	 * @generated
	 */
	public Adapter createConnectionPointOutType3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.ConnectorType <em>Connector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.ConnectorType
	 * @generated
	 */
	public Adapter createConnectorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.ContactType <em>Contact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.ContactType
	 * @generated
	 */
	public Adapter createContactTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.ContentHeaderType <em>Content Header Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.ContentHeaderType
	 * @generated
	 */
	public Adapter createContentHeaderTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.ContinuationType <em>Continuation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.ContinuationType
	 * @generated
	 */
	public Adapter createContinuationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.CoordinateInfoType <em>Coordinate Info Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.CoordinateInfoType
	 * @generated
	 */
	public Adapter createCoordinateInfoTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.DataType
	 * @generated
	 */
	public Adapter createDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.DataType1 <em>Data Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.DataType1
	 * @generated
	 */
	public Adapter createDataType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.DataTypesType <em>Data Types Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.DataTypesType
	 * @generated
	 */
	public Adapter createDataTypesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.DataTypeType <em>Data Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.DataTypeType
	 * @generated
	 */
	public Adapter createDataTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.DerivedType <em>Derived Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.DerivedType
	 * @generated
	 */
	public Adapter createDerivedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.EnumType <em>Enum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.EnumType
	 * @generated
	 */
	public Adapter createEnumTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.ErrorType <em>Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.ErrorType
	 * @generated
	 */
	public Adapter createErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.ExternalVarsType <em>External Vars Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.ExternalVarsType
	 * @generated
	 */
	public Adapter createExternalVarsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.FbdType <em>Fbd Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.FbdType
	 * @generated
	 */
	public Adapter createFbdTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.FBDType1 <em>FBD Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.FBDType1
	 * @generated
	 */
	public Adapter createFBDType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.FileHeaderType <em>File Header Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.FileHeaderType
	 * @generated
	 */
	public Adapter createFileHeaderTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.FormattedText <em>Formatted Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.FormattedText
	 * @generated
	 */
	public Adapter createFormattedTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.GlobalVarsType <em>Global Vars Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.GlobalVarsType
	 * @generated
	 */
	public Adapter createGlobalVarsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.InfoType <em>Info Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.InfoType
	 * @generated
	 */
	public Adapter createInfoTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.InlineType <em>Inline Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.InlineType
	 * @generated
	 */
	public Adapter createInlineTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.InOutVariablesType <em>In Out Variables Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.InOutVariablesType
	 * @generated
	 */
	public Adapter createInOutVariablesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.InOutVariablesType1 <em>In Out Variables Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.InOutVariablesType1
	 * @generated
	 */
	public Adapter createInOutVariablesType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.InOutVariableType <em>In Out Variable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.InOutVariableType
	 * @generated
	 */
	public Adapter createInOutVariableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.InOutVarsType <em>In Out Vars Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.InOutVarsType
	 * @generated
	 */
	public Adapter createInOutVarsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.InputVariablesType <em>Input Variables Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.InputVariablesType
	 * @generated
	 */
	public Adapter createInputVariablesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.InputVariablesType1 <em>Input Variables Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.InputVariablesType1
	 * @generated
	 */
	public Adapter createInputVariablesType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.InputVarsType <em>Input Vars Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.InputVarsType
	 * @generated
	 */
	public Adapter createInputVarsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.InstancesType <em>Instances Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.InstancesType
	 * @generated
	 */
	public Adapter createInstancesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.InterfaceType <em>Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.InterfaceType
	 * @generated
	 */
	public Adapter createInterfaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.InVariableType <em>In Variable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.InVariableType
	 * @generated
	 */
	public Adapter createInVariableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.JumpStepType <em>Jump Step Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.JumpStepType
	 * @generated
	 */
	public Adapter createJumpStepTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.JumpType <em>Jump Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.JumpType
	 * @generated
	 */
	public Adapter createJumpTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.LabelType <em>Label Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.LabelType
	 * @generated
	 */
	public Adapter createLabelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.LdType <em>Ld Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.LdType
	 * @generated
	 */
	public Adapter createLdTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.LDType1 <em>LD Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.LDType1
	 * @generated
	 */
	public Adapter createLDType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.LeftPowerRailType <em>Left Power Rail Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.LeftPowerRailType
	 * @generated
	 */
	public Adapter createLeftPowerRailTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.LocalVarsType <em>Local Vars Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.LocalVarsType
	 * @generated
	 */
	public Adapter createLocalVarsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.MacroStepType <em>Macro Step Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.MacroStepType
	 * @generated
	 */
	public Adapter createMacroStepTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.OutputVariablesType <em>Output Variables Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.OutputVariablesType
	 * @generated
	 */
	public Adapter createOutputVariablesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.OutputVariablesType1 <em>Output Variables Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.OutputVariablesType1
	 * @generated
	 */
	public Adapter createOutputVariablesType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.OutputVarsType <em>Output Vars Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.OutputVarsType
	 * @generated
	 */
	public Adapter createOutputVarsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.OutVariableType <em>Out Variable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.OutVariableType
	 * @generated
	 */
	public Adapter createOutVariableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.PageSizeType <em>Page Size Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.PageSizeType
	 * @generated
	 */
	public Adapter createPageSizeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.PointerType <em>Pointer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.PointerType
	 * @generated
	 */
	public Adapter createPointerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.Position
	 * @generated
	 */
	public Adapter createPositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.PouInstance <em>Pou Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.PouInstance
	 * @generated
	 */
	public Adapter createPouInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.PousType <em>Pous Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.PousType
	 * @generated
	 */
	public Adapter createPousTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.PouType1 <em>Pou Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.PouType1
	 * @generated
	 */
	public Adapter createPouType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.ProjectType <em>Project Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.ProjectType
	 * @generated
	 */
	public Adapter createProjectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.RangeSigned <em>Range Signed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.RangeSigned
	 * @generated
	 */
	public Adapter createRangeSignedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.RangeUnsigned <em>Range Unsigned</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.RangeUnsigned
	 * @generated
	 */
	public Adapter createRangeUnsignedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.ReferenceType <em>Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.ReferenceType
	 * @generated
	 */
	public Adapter createReferenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.ReferenceType1 <em>Reference Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.ReferenceType1
	 * @generated
	 */
	public Adapter createReferenceType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.ResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.ResourceType
	 * @generated
	 */
	public Adapter createResourceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.ReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.ReturnType
	 * @generated
	 */
	public Adapter createReturnTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.RightPowerRailType <em>Right Power Rail Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.RightPowerRailType
	 * @generated
	 */
	public Adapter createRightPowerRailTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.ScalingType <em>Scaling Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.ScalingType
	 * @generated
	 */
	public Adapter createScalingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.ScalingType1 <em>Scaling Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.ScalingType1
	 * @generated
	 */
	public Adapter createScalingType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.ScalingType2 <em>Scaling Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.ScalingType2
	 * @generated
	 */
	public Adapter createScalingType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.SelectionConvergenceType <em>Selection Convergence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.SelectionConvergenceType
	 * @generated
	 */
	public Adapter createSelectionConvergenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.SelectionDivergenceType <em>Selection Divergence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.SelectionDivergenceType
	 * @generated
	 */
	public Adapter createSelectionDivergenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.SfcType <em>Sfc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.SfcType
	 * @generated
	 */
	public Adapter createSfcTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.SFCType1 <em>SFC Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.SFCType1
	 * @generated
	 */
	public Adapter createSFCType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.SimpleValueType <em>Simple Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.SimpleValueType
	 * @generated
	 */
	public Adapter createSimpleValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.SimultaneousConvergenceType <em>Simultaneous Convergence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.SimultaneousConvergenceType
	 * @generated
	 */
	public Adapter createSimultaneousConvergenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.SimultaneousDivergenceType <em>Simultaneous Divergence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.SimultaneousDivergenceType
	 * @generated
	 */
	public Adapter createSimultaneousDivergenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.StepType <em>Step Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.StepType
	 * @generated
	 */
	public Adapter createStepTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.StringType <em>String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.StringType
	 * @generated
	 */
	public Adapter createStringTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.StructValueType <em>Struct Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.StructValueType
	 * @generated
	 */
	public Adapter createStructValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.SubrangeSignedType <em>Subrange Signed Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.SubrangeSignedType
	 * @generated
	 */
	public Adapter createSubrangeSignedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.SubrangeUnsignedType <em>Subrange Unsigned Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.SubrangeUnsignedType
	 * @generated
	 */
	public Adapter createSubrangeUnsignedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.TaskType <em>Task Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.TaskType
	 * @generated
	 */
	public Adapter createTaskTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.TempVarsType <em>Temp Vars Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.TempVarsType
	 * @generated
	 */
	public Adapter createTempVarsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.TransitionsType <em>Transitions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.TransitionsType
	 * @generated
	 */
	public Adapter createTransitionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.TransitionType <em>Transition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.TransitionType
	 * @generated
	 */
	public Adapter createTransitionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.TransitionType1 <em>Transition Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.TransitionType1
	 * @generated
	 */
	public Adapter createTransitionType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.TypesType <em>Types Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.TypesType
	 * @generated
	 */
	public Adapter createTypesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.Value
	 * @generated
	 */
	public Adapter createValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.ValuesType <em>Values Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.ValuesType
	 * @generated
	 */
	public Adapter createValuesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.ValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.ValueType
	 * @generated
	 */
	public Adapter createValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.ValueType1 <em>Value Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.ValueType1
	 * @generated
	 */
	public Adapter createValueType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.ValueType2 <em>Value Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.ValueType2
	 * @generated
	 */
	public Adapter createValueType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.VariableType <em>Variable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.VariableType
	 * @generated
	 */
	public Adapter createVariableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.VariableType1 <em>Variable Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.VariableType1
	 * @generated
	 */
	public Adapter createVariableType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.VariableType2 <em>Variable Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.VariableType2
	 * @generated
	 */
	public Adapter createVariableType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.VariableType3 <em>Variable Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.VariableType3
	 * @generated
	 */
	public Adapter createVariableType3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.VariableType4 <em>Variable Type4</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.VariableType4
	 * @generated
	 */
	public Adapter createVariableType4Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.VariableType5 <em>Variable Type5</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.VariableType5
	 * @generated
	 */
	public Adapter createVariableType5Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.VariableType6 <em>Variable Type6</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.VariableType6
	 * @generated
	 */
	public Adapter createVariableType6Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.VarList <em>Var List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.VarList
	 * @generated
	 */
	public Adapter createVarListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.VarListAccess <em>Var List Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.VarListAccess
	 * @generated
	 */
	public Adapter createVarListAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.VarListConfig <em>Var List Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.VarListConfig
	 * @generated
	 */
	public Adapter createVarListConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.VarListPlain <em>Var List Plain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.VarListPlain
	 * @generated
	 */
	public Adapter createVarListPlainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.VendorElementType <em>Vendor Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.VendorElementType
	 * @generated
	 */
	public Adapter createVendorElementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.plcopen.xml.tc60201.WstringType <em>Wstring Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.plcopen.xml.tc60201.WstringType
	 * @generated
	 */
	public Adapter createWstringTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Tc60201AdapterFactory
