package bento.componetization.atl.refactorings;

import java.util.List;

public interface IConceptRefactoring {

	public boolean match();

	public void apply();

	public List<IMatch> getAllMatches();
	
}
