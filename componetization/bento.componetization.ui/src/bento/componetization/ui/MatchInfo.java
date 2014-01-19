package bento.componetization.ui;

import bento.componetization.atl.refactorings.IConceptRefactoring;
import bento.componetization.atl.refactorings.IMatch;

/**
 * A wrapper to show information about matches
 * for refactorings.
 * 
 * @author jesus
 *
 */
public class MatchInfo {
	private IMatch match;
	private IConceptRefactoring refactoring;

	public MatchInfo(IConceptRefactoring r, IMatch match) {
		this.refactoring = r;
		this.match = match;
	}
	
	public String getRefactoring() {
		return refactoring.getClass().getName();
	}
}
