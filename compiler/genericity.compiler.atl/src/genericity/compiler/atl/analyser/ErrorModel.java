package genericity.compiler.atl.analyser;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import genericity.compiler.atl.analyser.namespaces.ClassNamespace;
import genericity.compiler.atl.analyser.namespaces.MetamodelNamespace;
import genericity.compiler.atl.analyser.namespaces.TypeErrorNamespace;
import genericity.compiler.atl.analyser.recovery.IRecoveryAction;
import genericity.compiler.atl.analyser.recovery.RecoverOperationNotFound;
import genericity.typing.atl_types.Metaclass;
import genericity.typing.atl_types.TupleType;
import genericity.typing.atl_types.Type;
import genericity.typing.atl_types.TypeError;
import genericity.typing.atl_types.UnionType;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import atl.metamodel.ATL.Binding;
import atl.metamodel.ATL.ForEachOutPatternElement;
import atl.metamodel.ATL.LocatedElement;
import atl.metamodel.ATL.OutPatternElement;
import atl.metamodel.ATL.SimpleOutPatternElement;
import atl.metamodel.OCL.EnumLiteralExp;
import atl.metamodel.OCL.IfExp;
import atl.metamodel.OCL.OperationCallExp;
import atl.metamodel.OCL.VariableDeclaration;
import bento.analysis.atl_analysis.AnalysisResult;
import bento.analysis.atl_analysis.AtlAnalysisFactory;
import bento.analysis.atl_analysis.Problem;
import bento.analysis.atl_analysis.Recovery;
import bento.analysis.atl_analysis.atl_error.AtlErrorsFactory;
import bento.analysis.atl_analysis.atl_error.BindingExpectedOneAssignedMany;
import bento.analysis.atl_analysis.atl_error.DifferentBranchTypes;
import bento.analysis.atl_analysis.atl_error.FeatureNotFound;
import bento.analysis.atl_analysis.atl_error.FeatureNotFoundInUnionType;
import bento.analysis.atl_analysis.atl_error.FlattenOverNonNestedCollection;
import bento.analysis.atl_analysis.atl_error.LocalProblem;
import bento.analysis.atl_analysis.atl_error.CollectionOperationOverNoCollectionError;
import bento.analysis.atl_analysis.atl_error.NoBindingForCompulsoryFeature;
import bento.analysis.atl_analysis.atl_error.NoContainerForRefImmediateComposite;
import bento.analysis.atl_analysis.atl_error.OperationNotFound;
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
	
	public AnalysisResult getAnalysis() {
		return result;
	}
	
	public void signalNoModel(String name, LocatedElement element) {
		signalNoRecoverableError("No model: " + name, element);
	}

	public void signalNoClass(String name, MetamodelNamespace mmspace, LocatedElement element) {
		signalNoRecoverableError("No class " + name + " found in meta-model " + mmspace.getName(), element);
	}

	public Type signalNoFeature(EClass c, String featureName, LocatedElement element) {
		FeatureNotFound error = AtlErrorsFactory.eINSTANCE.createFeatureNotFound();
		initProblem(error, element);
		
		signalError("No feature " + c.getName() + "." + featureName + " found", element);
		return AnalyserContext.getTypingModel().newTypeErrorType(error);
	}

	public Type signalNoFeatureInOclAny(String featureName, LocatedElement element) {
		FeatureNotFound error = AtlErrorsFactory.eINSTANCE.createFeatureNotFound();
		initProblem(error, element);
		
		signalError("No feature " + "OclAny" + "." + featureName + " found", element);
		return AnalyserContext.getTypingModel().newTypeErrorType(error);
	}

	public Type signalNoTupleFeature(TupleType tuple, String featureName, LocatedElement element) {
		FeatureNotFound error = AtlErrorsFactory.eINSTANCE.createFeatureNotFound();
		initProblem(error, element);
		
		signalError("No feature " + "Tuple" + "." + featureName + " found", element);
		return AnalyserContext.getTypingModel().newTypeErrorType(error);
	}

	public boolean isErrorType(Type t) {
		return t instanceof TypeError;
	}
	
	public Type createDependentError(Problem p, Type t) {
		TypeError error = (TypeError) t;
		Problem parent = ((TypeErrorNamespace) error.getMetamodelRef()).getProblem();
		parent.getDependents().add(p);
		return AnalyserContext.getTypingModel().newTypeErrorType(p, error);
	}
	
	public Type signalCollectionOperationOverNoCollectionType(Type receptorType, LocatedElement element, IRecoveryAction ra) {
		CollectionOperationOverNoCollectionError error = AtlErrorsFactory.eINSTANCE.createCollectionOperationOverNoCollectionError();
		initProblem(error, element);

		if ( isErrorType(receptorType) )
			return createDependentError(error, receptorType);
			
		
		
		Type result = ra.recover(this, error);
		if ( result != null ) {
			signalWarning("Collection operation over " + TypeUtils.typeToString(receptorType), element);
			return result;
		}
		signalNoRecoverableError("Collection operation over " + TypeUtils.typeToString(receptorType), element);
		return null;
	}

	public Type signalDifferentBranchTypes(Type thenPart, Type elsePart, LocatedElement node, IRecoveryAction ra) {
		DifferentBranchTypes error = AtlErrorsFactory.eINSTANCE.createDifferentBranchTypes();
		initProblem(error, node);
		
		Type result = ra.recover(this, error);
		if ( result != null ) {
			signalWarning("Different types in if/else branches: " + TypeUtils.typeToString(thenPart) + " - " + TypeUtils.typeToString(elsePart), node);	
			return result;
		}
		
		signalNoRecoverableError("Different types in if/else branches: " + TypeUtils.typeToString(thenPart) + " - " + TypeUtils.typeToString(elsePart), node);	
		return null;
	}

	public Type signalNoOperationFound(Type receptorType, String operationName, LocatedElement node, IRecoveryAction ra) {
		OperationNotFound error = AtlErrorsFactory.eINSTANCE.createOperationNotFound();
		initProblem(error, node);

		error.setOperationName(operationName);
		error.setType(receptorType);
		
		if ( ra != null ) {
			Type result = ra.recover(this, error);
			if ( result != null ) {
				signalWarning("No operation " + TypeUtils.typeToString(receptorType) + "." + operationName, node);	
				return result;
			}
		}
		
		signalNoRecoverableError("No operation " + TypeUtils.typeToString(receptorType) + "." + operationName, node);	
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
		p.setElement(element.original_());
		result.getProblems().add(p);
	}

	public void signalIteratorOverNoCollectionType(Type receptorType, LocatedElement element) {
		signalNoRecoverableError("Iterator operation over " + receptorType, element);		
	}

	public void signalNoThisModuleOperation(String operationName, LocatedElement node) {
		signalNoRecoverableError("No operation " + operationName + " in thisModule", node);		
	}

	public void signalNoThisModuleFeature(String featureName, LocatedElement node) {
		signalNoRecoverableError("No feature " + featureName + " in thisModule", node);				
	}

	
	
	public void signalNoRecoverableError(String msg, LocatedElement l) {
		throw new NoRecoverableError(msg + ". " + l.getLocation());
	}

	private void signalError(String msg, LocatedElement l) {
		System.out.println("ERROR: " + msg + ". " + l.getLocation());		
	}
	
	private void signalWarning(String msg, LocatedElement l) {
		System.out.println("WARNING: " + msg + ". " + l.getLocation());		
	}

	public void warningVarDclIncoherentTypes(Type exprType, Type declared, LocatedElement node) {
		signalWarning("Incoherent types in variable declaration " + TypeUtils.typeToString(exprType) + " - " + TypeUtils.typeToString(declared), node);
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

	// Binding problems
	
	public void signalNoBindingForCompulsoryFeature(EStructuralFeature unboundCompulsoryFeature, OutPatternElement pe) {
		NoBindingForCompulsoryFeature error = AtlErrorsFactory.eINSTANCE.createNoBindingForCompulsoryFeature();
		initProblem(error, pe);
		error.setFeature(unboundCompulsoryFeature);
		error.setFeatureName(unboundCompulsoryFeature.getName());
		
		signalWarning("In rule " + pe.getOutPattern().getRule().getName() + ", no binding for compulsory " + unboundCompulsoryFeature.getEContainingClass().getName() + "." + unboundCompulsoryFeature.getName(), pe);						
	}

	
	public void signalBindingExpectedOneAssignedMany(Binding binding, Metaclass targetVar, String propertyName) {
		BindingExpectedOneAssignedMany error = AtlErrorsFactory.eINSTANCE.createBindingExpectedOneAssignedMany();
		initProblem(error, binding);
		error.setFeatureName(propertyName);
		signalWarning("In binding " + targetVar.getName() + "." + propertyName + ", expected mono-valued, received collection", binding);
	}

	public void signalFlattenOverNonNestedCollection(Type nestedType, LocatedElement node) {
		FlattenOverNonNestedCollection error = AtlErrorsFactory.eINSTANCE.createFlattenOverNonNestedCollection();
		initProblem(error, node);
		
		signalWarning("Flatten over non-nested collection", node);
	}

	// End-of binding problems
	
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

	

	public void signalBindingPrimitiveExpectedButObjectAssigned(Binding binding, Metaclass targetVar, String propertyName) {
		signalWarning("In binding " + targetVar.getName() + "." + propertyName + ", expected primitive type, received objects", binding);		
	}

	public void signalBindingObjectExpectedButPrimitiveAssigned(Binding binding, Metaclass targetVar, String propertyName) {
		signalWarning("In binding " + targetVar.getName() + "." + propertyName + ", expected object type, received primitive value", binding);				
	}

	public void signalWarningInvalidMapKeyType(LocatedElement node) {
		signalWarning("Invalid type for key in Map ", node);								
	}

	public void signalOperationOverCollectionType(OperationCallExp node) {
		signalWarning("Operation over collection type. TODO: Not sure if this is error (try ATL execution) ", node);										
	}

	public static class NoRecoverableError extends RuntimeException {
		private static final long	serialVersionUID	= 4507844062130557035L;

		public NoRecoverableError(String msg) { super(msg); }
	}

	public void signalExpectedCollectionInForEachOutputPattern(ForEachOutPatternElement e) {
		signalWarning("Expected collection in ForEach output pattern element", e);
	}


	
}
