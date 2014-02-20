package genericity.compiler.atl.analyser;

import genericity.compiler.atl.analyser.namespaces.MetamodelNamespace;
import genericity.typing.atl_types.Metaclass;
import genericity.typing.atl_types.Type;

import org.eclipse.emf.ecore.EClass;

import atl.metamodel.ATL.LocatedElement;
import atl.metamodel.OCL.CollectionOperationCallExp;
import atl.metamodel.OCL.IteratorExp;
import atl.metamodel.OCL.OclModelElement;

public class ErrorModel {
	
	public void signalNoModel(String name, LocatedElement element) {
		signalNoRecoverableError("No model: " + name, element);
	}

	public void signalNoClass(String name, MetamodelNamespace mmspace, LocatedElement element) {
		signalNoRecoverableError("No class " + name + " found in meta-model " + mmspace.getName(), element);
	}

	public void signalNoFeature(EClass c, String featureName, LocatedElement element) {
		signalNoRecoverableError("No feature " + c.getName() + "." + featureName + " found", element);
	}
	

	public void signalCollectionOperationOverNoCollectionType(Type receptorType, LocatedElement element) {
		signalNoRecoverableError("Collection operation over " + receptorType, element);
	}

	public void signalIteratorOverNoCollectionType(Type receptorType, LocatedElement element) {
		signalNoRecoverableError("Iterator operation over " + receptorType, element);		
	}

	public void signalNoOperationFound(Type receptorType, String operationName, LocatedElement node) {
		signalNoRecoverableError("No operation " + operationName, node);
	}

	public void signalNoRecoverableError(String msg, LocatedElement l) {
		throw new RuntimeException(msg + ". " + l.getLocation());
	}

	public void signalNoThisModuleOperation(String operationName, LocatedElement node) {
		signalNoRecoverableError("No operation " + operationName + " in thisModule", node);		
	}

	public void signalNoThisModuleFeature(String featureName, LocatedElement node) {
		signalNoRecoverableError("No feature " + featureName + " in thisModule", node);				
	}

	public void warningFeatureFoundInSubType(Metaclass type, Metaclass subtype, String featureName, LocatedElement node) {
		System.err.println("WARNING: Feature " + featureName + " expected in " + type.getName() + " but found in subtype " + subtype.getName() + ". " + node.getLocation() );
	}



}
