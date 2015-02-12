package bento.componetization.atl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import anatlyzer.atl.model.ATLModel;
import anatlyzer.atlext.ATL.Helper;
import anatlyzer.atlext.ATL.Rule;
import anatlyzer.atlext.OCL.OperationCallExp;
import anatlyzer.footprint.CallSite;

public interface IStaticAnalysisInfo {

	Set<CallSite> getCallSites();
	Set<EClass> getExplicitlyUsedTypes();
	Set<EClass> getImplicitlyUsedTypes();
	Set<EStructuralFeature> getUsedFeatures();	
	
	ATLModel getATL();

	// Search utilities for the ATL model
	List<OperationCallExp> getAllInstancesUsages(EClass clazz);
	public HashSet<Rule> getRuleUsages(EClass clazz);		
	public List<Helper> getHelperUsages(EClass clazz);
}
