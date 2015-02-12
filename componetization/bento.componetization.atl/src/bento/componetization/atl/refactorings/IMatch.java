package bento.componetization.atl.refactorings;

import java.util.Collection;

import org.eclipse.emf.ecore.EClass;

public interface IMatch {

	public String getRefactoringHumanName();
		
	boolean coevolutionRequired();
	
	void apply();
	
	Collection<EClass> getAffectedClasses();
	
}
