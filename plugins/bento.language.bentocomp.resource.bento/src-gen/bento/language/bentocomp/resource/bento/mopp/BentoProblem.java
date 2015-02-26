/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package bento.language.bentocomp.resource.bento.mopp;

public class BentoProblem implements bento.language.bentocomp.resource.bento.IBentoProblem {
	
	private String message;
	private bento.language.bentocomp.resource.bento.BentoEProblemType type;
	private bento.language.bentocomp.resource.bento.BentoEProblemSeverity severity;
	private java.util.Collection<bento.language.bentocomp.resource.bento.IBentoQuickFix> quickFixes;
	
	public BentoProblem(String message, bento.language.bentocomp.resource.bento.BentoEProblemType type, bento.language.bentocomp.resource.bento.BentoEProblemSeverity severity) {
		this(message, type, severity, java.util.Collections.<bento.language.bentocomp.resource.bento.IBentoQuickFix>emptySet());
	}
	
	public BentoProblem(String message, bento.language.bentocomp.resource.bento.BentoEProblemType type, bento.language.bentocomp.resource.bento.BentoEProblemSeverity severity, bento.language.bentocomp.resource.bento.IBentoQuickFix quickFix) {
		this(message, type, severity, java.util.Collections.singleton(quickFix));
	}
	
	public BentoProblem(String message, bento.language.bentocomp.resource.bento.BentoEProblemType type, bento.language.bentocomp.resource.bento.BentoEProblemSeverity severity, java.util.Collection<bento.language.bentocomp.resource.bento.IBentoQuickFix> quickFixes) {
		super();
		this.message = message;
		this.type = type;
		this.severity = severity;
		this.quickFixes = new java.util.LinkedHashSet<bento.language.bentocomp.resource.bento.IBentoQuickFix>();
		this.quickFixes.addAll(quickFixes);
	}
	
	public bento.language.bentocomp.resource.bento.BentoEProblemType getType() {
		return type;
	}
	
	public bento.language.bentocomp.resource.bento.BentoEProblemSeverity getSeverity() {
		return severity;
	}
	
	public String getMessage() {
		return message;
	}
	
	public java.util.Collection<bento.language.bentocomp.resource.bento.IBentoQuickFix> getQuickFixes() {
		return quickFixes;
	}
	
}
