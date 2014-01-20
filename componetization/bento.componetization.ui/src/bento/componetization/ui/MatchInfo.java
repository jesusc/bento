package bento.componetization.ui;

import java.util.Collection;

import org.eclipse.emf.ecore.EClass;

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
	private boolean selected;
	
	public MatchInfo(IConceptRefactoring r, IMatch match) {
		this.refactoring = r;
		this.match = match;
		this.selected = true;
	}
	
	public String getRefactoringHumanName() {
		String s = refactoring.getClass().getSimpleName();
		String result = s.charAt(0) + "";
		for(int i = 1; i < s.length(); i++) {
			char c = s.charAt(i);
			if ( Character.isUpperCase(c) ) {				
				result = result + " " + c; 
			} else {
				result = result + c;
			}
		}
		return result;
	}
	
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	public boolean isSelected() {
		return selected;
	}

	public IMatch getMatch() {
		return match;
	}
	
	public String getText() {
		String classes = "";
		for (EClass eClass : match.getAffectedClasses()) {
			classes = classes + eClass.getName() + " ";
		}
		return classes;
	}
}
