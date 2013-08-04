/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gcomponent.resource.gcomponent.mopp;

public class GcomponentProblem implements genericity.language.gcomponent.resource.gcomponent.IGcomponentProblem {
	
	private String message;
	private genericity.language.gcomponent.resource.gcomponent.GcomponentEProblemType type;
	private genericity.language.gcomponent.resource.gcomponent.GcomponentEProblemSeverity severity;
	private java.util.Collection<genericity.language.gcomponent.resource.gcomponent.IGcomponentQuickFix> quickFixes;
	
	public GcomponentProblem(String message, genericity.language.gcomponent.resource.gcomponent.GcomponentEProblemType type, genericity.language.gcomponent.resource.gcomponent.GcomponentEProblemSeverity severity) {
		this(message, type, severity, java.util.Collections.<genericity.language.gcomponent.resource.gcomponent.IGcomponentQuickFix>emptySet());
	}
	
	public GcomponentProblem(String message, genericity.language.gcomponent.resource.gcomponent.GcomponentEProblemType type, genericity.language.gcomponent.resource.gcomponent.GcomponentEProblemSeverity severity, genericity.language.gcomponent.resource.gcomponent.IGcomponentQuickFix quickFix) {
		this(message, type, severity, java.util.Collections.singleton(quickFix));
	}
	
	public GcomponentProblem(String message, genericity.language.gcomponent.resource.gcomponent.GcomponentEProblemType type, genericity.language.gcomponent.resource.gcomponent.GcomponentEProblemSeverity severity, java.util.Collection<genericity.language.gcomponent.resource.gcomponent.IGcomponentQuickFix> quickFixes) {
		super();
		this.message = message;
		this.type = type;
		this.severity = severity;
		this.quickFixes = new java.util.LinkedHashSet<genericity.language.gcomponent.resource.gcomponent.IGcomponentQuickFix>();
		this.quickFixes.addAll(quickFixes);
	}
	
	public genericity.language.gcomponent.resource.gcomponent.GcomponentEProblemType getType() {
		return type;
	}
	
	public genericity.language.gcomponent.resource.gcomponent.GcomponentEProblemSeverity getSeverity() {
		return severity;
	}
	
	public String getMessage() {
		return message;
	}
	
	public java.util.Collection<genericity.language.gcomponent.resource.gcomponent.IGcomponentQuickFix> getQuickFixes() {
		return quickFixes;
	}
	
}
