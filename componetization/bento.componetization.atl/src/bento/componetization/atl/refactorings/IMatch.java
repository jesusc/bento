package bento.componetization.atl.refactorings;

import java.util.Collection;

import org.eclipse.emf.ecore.EClass;

public interface IMatch {

	void apply();
	
	Collection<EClass> getAffectedClasses();
	
}
