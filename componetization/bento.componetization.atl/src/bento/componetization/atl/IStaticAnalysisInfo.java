package bento.componetization.atl;

import java.util.Set;

import org.eclipse.emf.ecore.EClass;

public interface IStaticAnalysisInfo {

	Set<CallSite> getCallSites();
	Set<EClass> getExplicitlyUsedTypes();
 	
	
}
