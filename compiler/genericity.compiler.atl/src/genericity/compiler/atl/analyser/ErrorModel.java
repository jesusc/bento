package genericity.compiler.atl.analyser;

import genericity.compiler.atl.analyser.namespaces.ClassNamespace;
import genericity.compiler.atl.analyser.namespaces.MetamodelNamespace;
import genericity.compiler.atl.analyser.recovery.IRecoveryAction;
import genericity.typing.atl_types.Metaclass;
import genericity.typing.atl_types.Type;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;

import atl.metamodel.ATL.LocatedElement;
import atl.metamodel.OCL.IfExp;
import bento.analysis.atl_analysis.AnalysisResult;
import bento.analysis.atl_analysis.AtlAnalysisFactory;
import bento.analysis.atl_analysis.atl_error.AtlErrorsFactory;
import bento.analysis.atl_analysis.atl_error.FeatureNotFound;
import bento.analysis.atl_analysis.atl_error.LocalProblem;
import bento.analysis.atl_analysis.atl_error.CollectionOperationOverNoCollectionError;
import bento.analysis.atl_analysis.atl_recovery.AtlRecoveryFactory;
import bento.analysis.atl_analysis.atl_recovery.FeatureFoundInSubclass;

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
	

	public void signalCollectionOperationOverNoCollectionType(Type receptorType, LocatedElement element, IRecoveryAction ra) {
		CollectionOperationOverNoCollectionError error = AtlErrorsFactory.eINSTANCE.createCollectionOperationOverNoCollectionError();
		initProblem(error, element);
		
		if ( ra.recover() ) {
			signalWarning("Collection operation over " + receptorType, element);
			return;
		}
		signalNoRecoverableError("Collection operation over " + receptorType, element);
	}

	public void warningFeatureFoundInSubType(Metaclass type, Metaclass subtype, String featureName, LocatedElement node) {
		FeatureNotFound error = AtlErrorsFactory.eINSTANCE.createFeatureNotFound();
		initProblem(error, node);

		error.setFeatureName(featureName);
		error.setClassName(type.getName());
		error.setMetamodelName(((ClassNamespace) type.getMetamodelRef()).getMetamodelName());
		
		FeatureFoundInSubclass recovery = AtlRecoveryFactory.eINSTANCE.createFeatureFoundInSubclass();
		recovery.setSubclassName(subtype.getName());
		
		System.err.println("WARNING: Feature " + featureName + " expected in " + type.getName() + " but found in subtype " + subtype.getName() + ". " + node.getLocation() );
	}


	private void initProblem(LocalProblem p, LocatedElement element) {
		p.setLocation(element.getLocation());
		result.getProblems().add(p);
	}

	public void signalIteratorOverNoCollectionType(Type receptorType, LocatedElement element) {
		signalNoRecoverableError("Iterator operation over " + receptorType, element);		
	}

	public void signalNoOperationFound(Type receptorType, String operationName, LocatedElement node) {
		signalNoRecoverableError("No operation " + operationName, node);
	}

	public void signalNoThisModuleOperation(String operationName, LocatedElement node) {
		signalNoRecoverableError("No operation " + operationName + " in thisModule", node);		
	}

	public void signalNoThisModuleFeature(String featureName, LocatedElement node) {
		signalNoRecoverableError("No feature " + featureName + " in thisModule", node);				
	}

	public void signalDifferentBranchTypes(Type thenPart, Type elsePart, LocatedElement node) {
		signalNoRecoverableError("Different types in if/else braches" + thenPart + " - " + elsePart, node);	
	}
	
	public void signalNoRecoverableError(String msg, LocatedElement l) {
		throw new RuntimeException(msg + ". " + l.getLocation());
	}

	private void signalWarning(String msg, LocatedElement l) {
		System.out.println(msg + ". " + l.getLocation());		
	}

	

}
