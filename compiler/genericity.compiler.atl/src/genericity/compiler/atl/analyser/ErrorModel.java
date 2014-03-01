package genericity.compiler.atl.analyser;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import genericity.compiler.atl.analyser.namespaces.ClassNamespace;
import genericity.compiler.atl.analyser.namespaces.MetamodelNamespace;
import genericity.compiler.atl.analyser.recovery.IRecoveryAction;
import genericity.typing.atl_types.Metaclass;
import genericity.typing.atl_types.Type;
import genericity.typing.atl_types.UnionType;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import atl.metamodel.ATL.Binding;
import atl.metamodel.ATL.LocatedElement;
import atl.metamodel.ATL.OutPatternElement;
import atl.metamodel.ATL.SimpleOutPatternElement;
import atl.metamodel.OCL.EnumLiteralExp;
import atl.metamodel.OCL.IfExp;
import atl.metamodel.OCL.VariableDeclaration;
import bento.analysis.atl_analysis.AnalysisResult;
import bento.analysis.atl_analysis.AtlAnalysisFactory;
import bento.analysis.atl_analysis.Recovery;
import bento.analysis.atl_analysis.atl_error.AtlErrorsFactory;
import bento.analysis.atl_analysis.atl_error.FeatureNotFound;
import bento.analysis.atl_analysis.atl_error.FeatureNotFoundInUnionType;
import bento.analysis.atl_analysis.atl_error.LocalProblem;
import bento.analysis.atl_analysis.atl_error.CollectionOperationOverNoCollectionError;
import bento.analysis.atl_analysis.atl_error.NoContainerForRefImmediateComposite;
import bento.analysis.atl_analysis.atl_recovery.AtlRecoveryFactory;
import bento.analysis.atl_analysis.atl_recovery.FeatureFoundInSubclass;
import bento.analysis.atl_analysis.atl_recovery.TentativeTypeAssigned;
import bento.analysis.atl_analysis.atl_recovery.impl.AtlRecoveryFactoryImpl;

public class ErrorModel {
	
	protected Resource r;
	private AnalysisResult	result;
	
	public ErrorModel() {
		result = AtlAnalysisFactory.eINSTANCE.createAnalysisResult();
	}
	
	public void signalNoModel(String name, LocatedElement element) {
		signalNoRecoverableError("No model: " + name, element);
	}

	public void signalNoClass(String name, MetamodelNamespace mmspace, LocatedElement element) {
		signalNoRecoverableError("No class " + name + " found in meta-model " + mmspace.getName(), element);
	}

	public void signalNoFeature(EClass c, String featureName, LocatedElement element) {
		signalNoRecoverableError("No feature " + c.getName() + "." + featureName + " found", element);
	}
	

	public Type signalCollectionOperationOverNoCollectionType(Type receptorType, LocatedElement element, IRecoveryAction ra) {
		CollectionOperationOverNoCollectionError error = AtlErrorsFactory.eINSTANCE.createCollectionOperationOverNoCollectionError();
		initProblem(error, element);
		
		Type result = ra.recover(this, error);
		if ( result != null ) {
			signalWarning("Collection operation over " + receptorType, element);
			return result;
		}
		signalNoRecoverableError("Collection operation over " + receptorType, element);
		return null;
	}

	public void warningFeatureFoundInSubType(Metaclass type, Metaclass subtype, String featureName, LocatedElement node) {
		FeatureNotFound error = AtlErrorsFactory.eINSTANCE.createFeatureNotFound();
		initProblem(error, node);

		error.setFeatureName(featureName);
		error.setClassName(type.getName());
		error.setMetamodelName(((ClassNamespace) type.getMetamodelRef()).getMetamodelName());
		
		FeatureFoundInSubclass recovery = AtlRecoveryFactory.eINSTANCE.createFeatureFoundInSubclass();
		recovery.setSubclassName(subtype.getName());
		
		System.err.println("Feature " + featureName + " expected in " + type.getName() + " but found in subtype " + subtype.getName() + ". " + node.getLocation() );
	}


	public void warningOperationFoundInSubType(Metaclass type, Metaclass subtype, String operationName, LocatedElement node) {
		System.err.println("WARNING: Feature " + operationName + " expected in " + type.getName() + " but found in subtype " + subtype.getName() + ". " + node.getLocation() );		
	} 

	public void signalInvalidOperand(String operatorSymbol, LocatedElement node, IRecoveryAction recovery) {
		FeatureNotFound error = AtlErrorsFactory.eINSTANCE.createFeatureNotFound();
		initProblem(error, node);
		
	}

	private void initProblem(LocalProblem p, LocatedElement element) {
		p.setLocation(element.getLocation());
		result.getProblems().add(p);
	}

	public void signalIteratorOverNoCollectionType(Type receptorType, LocatedElement element) {
		signalNoRecoverableError("Iterator operation over " + receptorType, element);		
	}

	public void signalNoOperationFound(Type receptorType, String operationName, LocatedElement node) {
		signalNoRecoverableError("No operation " + TypeUtils.typeToString(receptorType) + "." + operationName, node);
	}

	public void signalNoThisModuleOperation(String operationName, LocatedElement node) {
		signalNoRecoverableError("No operation " + operationName + " in thisModule", node);		
	}

	public void signalNoThisModuleFeature(String featureName, LocatedElement node) {
		signalNoRecoverableError("No feature " + featureName + " in thisModule", node);				
	}

	public void signalDifferentBranchTypes(Type thenPart, Type elsePart, LocatedElement node) {
		signalNoRecoverableError("Different types in if/else branches: " + TypeUtils.typeToString(thenPart) + " - " + TypeUtils.typeToString(elsePart), node);	
	}
	
	public void signalNoRecoverableError(String msg, LocatedElement l) {
		throw new RuntimeException(msg + ". " + l.getLocation());
	}

	private void signalWarning(String msg, LocatedElement l) {
		System.out.println("WARNING: " + msg + ". " + l.getLocation());		
	}

	public void warningVarDclIncoherentTypes(Type exprType, Type declared, LocatedElement node) {
		signalWarning("Incoherent types in variable declaration " + exprType + " - " + declared, node);
	}
	
	/** Recovery methods **/ 
	
	public Recovery recoveryTentativeTypeAssigned(Type t) {
		TentativeTypeAssigned rec = AtlRecoveryFactory.eINSTANCE.createTentativeTypeAssigned();
		rec.setType(t);
		return rec;
	}

	public void signalNoContainerForRefImmediateComposite(Metaclass clazz, LocatedElement node) {
		NoContainerForRefImmediateComposite error = AtlErrorsFactory.eINSTANCE.createNoContainerForRefImmediateComposite();
		initProblem(error, node);
		error.setClassName(clazz.getName());
		error.setMetamodelName(((ClassNamespace) clazz.getMetamodelRef()).getMetamodelName());
		
		signalNoRecoverableError("No container is possible for class " + clazz.getName(), node);
	}

	public void signalNoFeatureInUnionType(UnionType type, String featureName, LocatedElement node) {
		FeatureNotFoundInUnionType error = AtlErrorsFactory.eINSTANCE.createFeatureNotFoundInUnionType();
		initProblem(error, node);
		error.setFeatureName(featureName);
		
		signalNoRecoverableError("No feature " + featureName + " for " + TypeUtils.typeToString(type), node);
	}

	public void signalNoEnumLiteral(String name, LocatedElement node) {
		signalNoRecoverableError("No enum literal " + name, node);
	}

	public void warningMissingFeatureInUnionType(List<Type> noFeatureTypes, LocatedElement node) {
		String strTypes = "";
		for (Type type : noFeatureTypes) {
			strTypes += TypeUtils.typeToString(type) + " ";
		}
		signalWarning("Missing feature in these types: [" + strTypes + "]", node);
	}

	public void signalBindingExpectedOneAssignedMany(Binding binding, Metaclass targetVar, String propertyName) {
		signalWarning("In binding " + targetVar.getName() + "." + propertyName + ", expected mono-valued, received collection", binding);
	}

	public void signalBindingPrimitiveExpectedButObjectAssigned(Binding binding, Metaclass targetVar, String propertyName) {
		signalWarning("In binding " + targetVar.getName() + "." + propertyName + ", expected primitive type, received objects", binding);		
	}

	public void signalBindingObjectExpectedButPrimitiveAssigned(Binding binding, Metaclass targetVar, String propertyName) {
		signalWarning("In binding " + targetVar.getName() + "." + propertyName + ", expected object type, received primitive value", binding);				
	}

	public void signalNoBindingForCompulsoryFeature(EStructuralFeature unboundCompulsoryFeature, OutPatternElement pe) {
		signalWarning("In rule " + pe.getOutPattern().getRule().getName() + ", no binding for compulsory " + unboundCompulsoryFeature.getEContainingClass().getName() + "." + unboundCompulsoryFeature.getName(), pe);						
	}




}
