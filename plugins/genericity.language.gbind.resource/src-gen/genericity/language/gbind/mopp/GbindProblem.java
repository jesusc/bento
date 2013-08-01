/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gbind.mopp;

public class GbindProblem implements genericity.language.gbind.IGbindProblem {
	
	private String message;
	private genericity.language.gbind.GbindEProblemType type;
	private genericity.language.gbind.GbindEProblemSeverity severity;
	private java.util.Collection<genericity.language.gbind.IGbindQuickFix> quickFixes;
	
	public GbindProblem(String message, genericity.language.gbind.GbindEProblemType type, genericity.language.gbind.GbindEProblemSeverity severity) {
		this(message, type, severity, java.util.Collections.<genericity.language.gbind.IGbindQuickFix>emptySet());
	}
	
	public GbindProblem(String message, genericity.language.gbind.GbindEProblemType type, genericity.language.gbind.GbindEProblemSeverity severity, genericity.language.gbind.IGbindQuickFix quickFix) {
		this(message, type, severity, java.util.Collections.singleton(quickFix));
	}
	
	public GbindProblem(String message, genericity.language.gbind.GbindEProblemType type, genericity.language.gbind.GbindEProblemSeverity severity, java.util.Collection<genericity.language.gbind.IGbindQuickFix> quickFixes) {
		super();
		this.message = message;
		this.type = type;
		this.severity = severity;
		this.quickFixes = new java.util.LinkedHashSet<genericity.language.gbind.IGbindQuickFix>();
		this.quickFixes.addAll(quickFixes);
	}
	
	public genericity.language.gbind.GbindEProblemType getType() {
		return type;
	}
	
	public genericity.language.gbind.GbindEProblemSeverity getSeverity() {
		return severity;
	}
	
	public String getMessage() {
		return message;
	}
	
	public java.util.Collection<genericity.language.gbind.IGbindQuickFix> getQuickFixes() {
		return quickFixes;
	}
	
}
