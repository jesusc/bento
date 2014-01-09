package bento.componetization.atl;

import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface IStaticAnalysisInfo {

	Set<CallSite> getCallSites();
	Set<EClass> getExplicitlyUsedTypes();
	Set<EClass> getImplicitlyUsedTypes();
	Set<EStructuralFeature> getUsedFeatures();	
}
