/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package bento.language.bentocomp.resource.bento;

public interface IBentoProblem {
	public String getMessage();
	public bento.language.bentocomp.resource.bento.BentoEProblemSeverity getSeverity();
	public bento.language.bentocomp.resource.bento.BentoEProblemType getType();
	public java.util.Collection<bento.language.bentocomp.resource.bento.IBentoQuickFix> getQuickFixes();
}
