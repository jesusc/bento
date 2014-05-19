package genericity.compiler.atl.analyser;

import genericity.compiler.atl.analyser.namespaces.ClassNamespace;
import genericity.compiler.atl.analyser.namespaces.MetamodelNamespace;
import genericity.compiler.atl.analyser.namespaces.TypeErrorNamespace;
import genericity.compiler.atl.analyser.recovery.IRecoveryAction;
import genericity.typing.atl_types.Metaclass;
import genericity.typing.atl_types.TupleType;
import genericity.typing.atl_types.Type;
import genericity.typing.atl_types.TypeError;
import genericity.typing.atl_types.UnionType;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import atl.metamodel.ATL.Binding;
import atl.metamodel.ATL.ForEachOutPatternElement;
import atl.metamodel.ATL.ForStat;
import atl.metamodel.ATL.LocatedElement;
import atl.metamodel.ATL.MatchedRule;
import atl.metamodel.ATL.OutPatternElement;
import atl.metamodel.OCL.IteratorExp;
import atl.metamodel.OCL.OclModelElement;
import atl.metamodel.OCL.OperationCallExp;
import bento.analysis.atl_analysis.AnalysisResult;
import bento.analysis.atl_analysis.AtlAnalysisFactory;
import bento.analysis.atl_analysis.Problem;
import bento.analysis.atl_analysis.Recovery;
import bento.analysis.atl_analysis.SeverityKind;
import bento.analysis.atl_analysis.atl_error.AmbiguousTargetModelReference;
import bento.analysis.atl_analysis.atl_error.AtlErrorsFactory;
import bento.analysis.atl_analysis.atl_error.BindingExpectedOneAssignedMany;
import bento.analysis.atl_analysis.atl_error.BindingPossiblyUnresolved;
import bento.analysis.atl_analysis.atl_error.BindingWithResolvedByIncompatibleRule;
import bento.analysis.atl_analysis.atl_error.BindingWithoutRule;
import bento.analysis.atl_analysis.atl_error.CollectionOperationOverNoCollectionError;
import bento.analysis.atl_analysis.atl_error.DifferentBranchTypes;
import bento.analysis.atl_analysis.atl_error.ExpectedCollectionInForEach;
import bento.analysis.atl_analysis.atl_error.FeatureAccessInCollection;
import bento.analysis.atl_analysis.atl_error.FeatureNotFound;
import bento.analysis.atl_analysis.atl_error.FeatureNotFoundInUnionType;
import bento.analysis.atl_analysis.atl_error.FlattenOverNonNestedCollection;
import bento.analysis.atl_analysis.atl_error.InvalidArgument;
import bento.analysis.atl_analysis.atl_error.IteratorBodyWrongType;
import bento.analysis.atl_analysis.atl_error.IteratorOverEmptySequence;
import bento.analysis.atl_analysis.atl_error.LocalProblem;
import bento.analysis.atl_analysis.atl_error.NoBindingForCompulsoryFeature;
import bento.analysis.atl_analysis.atl_error.NoClassFoundInMetamodel;
import bento.analysis.atl_analysis.atl_error.NoContainerForRefImmediateComposite;
import bento.analysis.atl_analysis.atl_error.NoModelFound;
import bento.analysis.atl_analysis.atl_error.OperationNotFound;
import bento.analysis.atl_analysis.atl_error.ReadingTargetModel;
import bento.analysis.atl_analysis.atl_error.ResolvedRuleInfo;
import bento.analysis.atl_analysis.atl_recovery.AtlRecoveryFactory;
import bento.analysis.atl_analysis.atl_recovery.FeatureFoundInSubclass;
import bento.analysis.atl_analysis.atl_recovery.TentativeTypeAssigned;

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
		NoModelFound error = AtlErrorsFactory.eINSTANCE.createNoModelFound();
		initProblem(error, element);
		
		signalError(error, "Invalid meta-model: " + name, element);
	}

	public void signalNoClass(String name, MetamodelNamespace mmspace, LocatedElement element) {
		NoClassFoundInMetamodel error = AtlErrorsFactory.eINSTANCE.createNoClassFoundInMetamodel();
		initProblem(error, element);
		
		error.setClassName(name);
		
		signalError(error, "No class " + name + " found in meta-model " + mmspace.getName(), element);
	}

	public Type signalNoFeature(EClass c, String featureName, LocatedElement element) {
		FeatureNotFound error = AtlErrorsFactory.eINSTANCE.createFeatureNotFound();
		initProblem(error, element);
		
		signalError(error, "No feature " + c.getName() + "." + featureName + " found", element);
		return AnalyserContext.getTypingModel().newTypeErrorType(error);
	}

	public Type signalNoFeatureInOclAny(String featureName, LocatedElement element) {
		FeatureNotFound error = AtlErrorsFactory.eINSTANCE.createFeatureNotFound();
		initProblem(error, element);
		
		signalError(error, "No feature " + "OclAny" + "." + featureName + " found", element);
		return AnalyserContext.getTypingModel().newTypeErrorType(error);
	}

	public Type signalNoTupleFeature(TupleType tuple, String featureName, LocatedElement element) {
		FeatureNotFound error = AtlErrorsFactory.eINSTANCE.createFeatureNotFound();
		initProblem(error, element);
		
		signalError(error, "No feature " + "Tuple" + "." + featureName + " found", element);
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
			signalWarning(error, "Collection operation over " + TypeUtils.typeToString(receptorType), element);
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
			signalWarning(error, "Different types in if/else branches: " + TypeUtils.typeToString(thenPart) + " - " + TypeUtils.typeToString(elsePart), node);	
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
				signalWarning(error, "No operation " + TypeUtils.typeToString(receptorType) + "." + operationName, node);	
				return result;
			}
		}
		
		signalError(error, "No operation " + TypeUtils.typeToString(receptorType) + "." + operationName, node);	
		return AnalyserContext.getTypingModel().newTypeErrorType(error);
	}

	
	public void warningFeatureFoundInSubType(Metaclass type, Metaclass subtype, String featureName, LocatedElement node) {
		FeatureNotFound error = AtlErrorsFactory.eINSTANCE.createFeatureNotFound();
		initProblem(error, node);

		error.setFeatureName(featureName);
		error.setClassName(type.getName());
		error.setMetamodelName(((ClassNamespace) type.getMetamodelRef()).getMetamodelName());
		
		FeatureFoundInSubclass recovery = AtlRecoveryFactory.eINSTANCE.createFeatureFoundInSubclass();
		recovery.setSubclassName(subtype.getName());
		
		signalError(error, "Feature " + featureName + " expected in " + type.getName() + " but found in subtype " + subtype.getName(), node);
	}

	public void warningOperationFoundInSubType(Metaclass type, Metaclass subtype, String operationName, LocatedElement node) {
		OperationNotFound error = AtlErrorsFactory.eINSTANCE.createOperationNotFound();
		initProblem(error, node);

		error.setOperationName(operationName);
		error.setClassName(type.getName());
		error.setMetamodelName(((ClassNamespace) type.getMetamodelRef()).getMetamodelName());
		
		FeatureFoundInSubclass recovery = AtlRecoveryFactory.eINSTANCE.createFeatureFoundInSubclass();
		recovery.setSubclassName(subtype.getName());
		
		signalError(error, "Operation " + operationName + " expected in " + type.getName() + " but found in subtype " + subtype.getName(), node);

		// System.err.println("WARNING: Feature " + operationName + " expected in " + type.getName() + " but found in subtype " + subtype.getName() + ". " + node.getLocation() );		
	} 

	public Type signalInvalidOperand(String operatorSymbol, LocatedElement node, IRecoveryAction ra) {
		FeatureNotFound error = AtlErrorsFactory.eINSTANCE.createFeatureNotFound();
		initProblem(error, node);
		
		if ( ra == null ) 
			throw new IllegalArgumentException();
		
		Type result = ra.recover(this, error);
		if ( result != null ) {
			signalError(error, "Invalid operand " + operatorSymbol, node);
			return result;
		}
	
		return AnalyserContext.getTypingModel().newTypeErrorType(error);
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

	private void signalError(Problem p, String msg, LocatedElement l) {
		p.setDescription(msg);
		p.setSeverity(SeverityKind.ERROR);
		
		System.out.println("ERROR: " + msg + ". " + l.getLocation());		
	}
	
	private void signalWarning(Problem p, String msg, LocatedElement l) {
		p.setDescription(msg);
		p.setSeverity(SeverityKind.WARNING);
		
		System.out.println("WARNING: " + msg + ". " + l.getLocation());		
	}

	private void signalWarning_WITHOUTERROR_TODO( String msg, LocatedElement l) {
		System.out.println("WARNING: " + msg + ". " + l.getLocation());		
	}

	public void warningVarDclIncoherentTypes(Type exprType, Type declared, LocatedElement node) {
		signalWarning_WITHOUTERROR_TODO("Incoherent types in variable declaration " + TypeUtils.typeToString(exprType) + " - " + TypeUtils.typeToString(declared), node);
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
		
		signalWarning(error, "In rule " + pe.getOutPattern().getRule().getName() + ", no binding for compulsory " + unboundCompulsoryFeature.getEContainingClass().getName() + "." + unboundCompulsoryFeature.getName(), pe);						
	}

	
	public void signalBindingExpectedOneAssignedMany(Binding binding, Metaclass targetVar, String propertyName) {
		BindingExpectedOneAssignedMany error = AtlErrorsFactory.eINSTANCE.createBindingExpectedOneAssignedMany();
		initProblem(error, binding);
		error.setFeatureName(propertyName);
		signalWarning(error, "In binding " + targetVar.getName() + "." + propertyName + ", expected mono-valued, received collection", binding);
	}

	public void signalIteratorOverEmptyCollection(IteratorExp node) {
		IteratorOverEmptySequence error = AtlErrorsFactory.eINSTANCE.createIteratorOverEmptySequence();
		initProblem(error, node);
		signalWarning(error, "Iterator over empty sequence", node);
	}

	public void signalFlattenOverNonNestedCollection(Type nestedType, LocatedElement node) {
		FlattenOverNonNestedCollection error = AtlErrorsFactory.eINSTANCE.createFlattenOverNonNestedCollection();
		initProblem(error, node);
		
		signalWarning(error, "Flatten over non-nested collection", node);
	}



	public void signalBindingWithoutRule(Binding b, EClass rightType, EClass targetType) {
		BindingWithoutRule error = AtlErrorsFactory.eINSTANCE.createBindingWithoutRule();
		initProblem(error, b);
		
		error.setRightType(rightType);
		error.setTargetType(targetType);
		error.setFeatureName(b.getPropertyName());
		

		signalWarning(error, "No rule for binding", b);
		
	}
	
	public void signalBindingWithResolvedByIncompatibleRule(Binding b, EClass rightType, EClass targetType,
			List<MatchedRule> problematicRules, List<EClass> sourceClasses, List<EClass> targetClasses) {
		
		BindingWithResolvedByIncompatibleRule error = AtlErrorsFactory.eINSTANCE.createBindingWithResolvedByIncompatibleRule();
		initProblem(error, b);

		error.setRightType(rightType);
		error.setTargetType(targetType);
		error.setFeatureName(b.getPropertyName());
		// error.setFeature(); // TODO: Set the EStructuralFeature
		
		int i = 0;
		for (MatchedRule r : problematicRules) {
			ResolvedRuleInfo rinfo = AtlErrorsFactory.eINSTANCE.createResolvedRuleInfo();
			rinfo.setLocation(r.getLocation());
			rinfo.setElement(r.original_());
			rinfo.setRuleName(r.getName());
			rinfo.setInputType(sourceClasses.get(i));
			rinfo.setOutputType(targetClasses.get(i));
			i++;
			error.getRules().add(rinfo);
		}
		
		String s = "Binding may be resolved by rule with invalid target type. " + b.getLocation() + "\n";
		for (ResolvedRuleInfo rinfo : error.getRules()) {
			s += "\t" + rinfo.getRuleName() + " " + rinfo.getLocation() + "\n";
		}
		
		signalWarning(error, s, b);		
	}
	
	public void signalBindingPossiblyUnresolved(Binding b, EClass rightType, EClass targetType, List<EClass> problematicClasses) {
		BindingPossiblyUnresolved error = AtlErrorsFactory.eINSTANCE.createBindingPossiblyUnresolved();
		initProblem(error, b);

		error.setRightType(rightType);
		error.setTargetType(targetType);
		error.setFeatureName(b.getPropertyName());
		
		error.getProblematicClasses().addAll(problematicClasses);
		String s = "";
		for (EClass eClass : problematicClasses) {
			s += ", " + eClass.getName();
		}
		s = s.replaceFirst(",", "");
		
		signalWarning(error, "Possibly unresolved binding: " + s, b);
	}
	// End-of binding problems


	public void signalIteratorBodyWrongType(IteratorExp node, Type bodyType) {
		IteratorBodyWrongType error = AtlErrorsFactory.eINSTANCE.createIteratorBodyWrongType();
		initProblem(error, node);
		
		signalError(error, "Wrong iterator body type " + TypeUtils.typeToString(bodyType), node);
	}
	public void signalReadingTargetModel(OclModelElement model) {
		ReadingTargetModel error = AtlErrorsFactory.eINSTANCE.createReadingTargetModel();
		initProblem(error, model);
		error.setModelName(model.getName());
		
		signalError(error, "Reading target model " + model.getModel().getName() + "!" + model.getName(), model);
	}
	
	public void signalAmbiguousTargetModelReference(OclModelElement model) {
		AmbiguousTargetModelReference error = AtlErrorsFactory.eINSTANCE.createAmbiguousTargetModelReference();
		initProblem(error, model);
		error.setModelName(model.getName());
		
		signalError(error, "Ambiguous target model reference " + model.getModel().getName() + "!" + model.getName(), model);	
	}

	public void signalMatchedRuleWithoutOutputPattern(MatchedRule rule) {
		AmbiguousTargetModelReference error = AtlErrorsFactory.eINSTANCE.createAmbiguousTargetModelReference();
		initProblem(error, rule);
		
		signalWarning(error, "Matched rule without output pattern: " + rule.getName(), rule);		
	}
	
	
	public void signalNoEnumLiteral(String name, LocatedElement node) {
		signalNoRecoverableError("No enum literal " + name, node);
	}

	public void warningMissingFeatureInUnionType(List<Type> noFeatureTypes, LocatedElement node) {
		String strTypes = "";
		for (Type type : noFeatureTypes) {
			strTypes += TypeUtils.typeToString(type) + " ";
		}
		signalWarning_WITHOUTERROR_TODO("Missing feature in these types: [" + strTypes + "]", node);
	}

	

	public void signalBindingPrimitiveExpectedButObjectAssigned(Binding binding, Metaclass targetVar, String propertyName) {
		signalWarning_WITHOUTERROR_TODO("In binding " + targetVar.getName() + "." + propertyName + ", expected primitive type, received objects", binding);		
	}

	public void signalBindingObjectExpectedButPrimitiveAssigned(Binding binding, Metaclass targetVar, String propertyName) {
		signalWarning_WITHOUTERROR_TODO("In binding " + targetVar.getName() + "." + propertyName + ", expected object type, received primitive value", binding);				
	}

	public void signalWarningInvalidMapKeyType(LocatedElement node) {
		signalWarning_WITHOUTERROR_TODO("Invalid type for key in Map ", node);								
	}

	public void signalOperationOverCollectionType(OperationCallExp node) {
		signalWarning_WITHOUTERROR_TODO("Operation over collection type. TODO: Not sure if this is error (try ATL execution) ", node);										
	}

	public static class NoRecoverableError extends RuntimeException {
		private static final long	serialVersionUID	= 4507844062130557035L;

		public NoRecoverableError(String msg) { super(msg); }
	}

	public Type signalExpectedCollectionInForEachOutputPattern(ForEachOutPatternElement e) {
		ExpectedCollectionInForEach error = AtlErrorsFactory.eINSTANCE.createExpectedCollectionInForEach();
		initProblem(error, e);
		
		signalError(error, "Expected collection in ForEachOutputPattern", e);		
		return AnalyserContext.getTypingModel().newTypeErrorType(error);
	}

	public Type signalExpectedCollectionInForStat(ForStat fs) {
		ExpectedCollectionInForEach error = AtlErrorsFactory.eINSTANCE.createExpectedCollectionInForEach();
		initProblem(error, fs);
		
		signalError(error, "Expected collection in ForStat", fs);		
		return AnalyserContext.getTypingModel().newTypeErrorType(error);
	}

	public Type signalInvalidArgument(String operationName, LocatedElement node) {
		InvalidArgument error = AtlErrorsFactory.eINSTANCE.createInvalidArgument();
		initProblem(error, node);

		signalError(error, "Invalid argument", node);		
		return AnalyserContext.getTypingModel().newTypeErrorType(error);
	}

	public Type signalFeatureAccessInCollection(String featureName, LocatedElement node) {
		FeatureAccessInCollection error = AtlErrorsFactory.eINSTANCE.createFeatureAccessInCollection();
		initProblem(error, node);
		
		error.setFeatureName(featureName);

		signalError(error, "Feature access in collection, " + featureName, node);		
		return AnalyserContext.getTypingModel().newTypeErrorType(error);
	}


	
}
