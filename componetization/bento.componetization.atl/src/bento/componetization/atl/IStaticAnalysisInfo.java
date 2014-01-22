package bento.componetization.atl;

import genericity.typing.atl_types.annotations.ExpressionAnnotation;

import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import atl.metamodel.ATLModel;

public interface IStaticAnalysisInfo {

	Set<CallSite> getCallSites();
	Set<EClass> getExplicitlyUsedTypes();
	Set<EClass> getImplicitlyUsedTypes();
	Set<EStructuralFeature> getUsedFeatures();	
	
	ATLModel getATL();

	// Utilities to access the type model
	
	ExpressionAnnotation findExpressionAnnotation(EObject expr);
}
