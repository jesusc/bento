package bento.componetization.atl;

import genericity.typing.atl_types.annotations.ExpressionAnnotation;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import atl.metamodel.ATLModel;
import atl.metamodel.ATL.Helper;
import atl.metamodel.ATL.Rule;
import atl.metamodel.OCL.OperationCallExp;

public interface IStaticAnalysisInfo {

	Set<CallSite> getCallSites();
	Set<EClass> getExplicitlyUsedTypes();
	Set<EClass> getImplicitlyUsedTypes();
	Set<EStructuralFeature> getUsedFeatures();	
	
	ATLModel getATL();

	// Utilities to access the type model
	
	ExpressionAnnotation findExpressionAnnotation(EObject expr);


	// Search utilities for the ATL model
	List<OperationCallExp> getAllInstancesUsages(EClass clazz);
	public HashSet<Rule> getRuleUsages(EClass clazz);		
	public List<Helper> getHelperUsages(EClass clazz);
}
