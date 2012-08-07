/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.gbind.resource.gbind.mopp;

public class GbindProblem implements org.emftext.language.gbind.resource.gbind.IGbindProblem {
	
	private String message;
	private org.emftext.language.gbind.resource.gbind.GbindEProblemType type;
	private org.emftext.language.gbind.resource.gbind.GbindEProblemSeverity severity;
	private java.util.Collection<org.emftext.language.gbind.resource.gbind.IGbindQuickFix> quickFixes;
	
	public GbindProblem(String message, org.emftext.language.gbind.resource.gbind.GbindEProblemType type, org.emftext.language.gbind.resource.gbind.GbindEProblemSeverity severity) {
		this(message, type, severity, java.util.Collections.<org.emftext.language.gbind.resource.gbind.IGbindQuickFix>emptySet());
	}
	
	public GbindProblem(String message, org.emftext.language.gbind.resource.gbind.GbindEProblemType type, org.emftext.language.gbind.resource.gbind.GbindEProblemSeverity severity, org.emftext.language.gbind.resource.gbind.IGbindQuickFix quickFix) {
		this(message, type, severity, java.util.Collections.singleton(quickFix));
	}
	
	public GbindProblem(String message, org.emftext.language.gbind.resource.gbind.GbindEProblemType type, org.emftext.language.gbind.resource.gbind.GbindEProblemSeverity severity, java.util.Collection<org.emftext.language.gbind.resource.gbind.IGbindQuickFix> quickFixes) {
		super();
		this.message = message;
		this.type = type;
		this.severity = severity;
		this.quickFixes = new java.util.LinkedHashSet<org.emftext.language.gbind.resource.gbind.IGbindQuickFix>();
		this.quickFixes.addAll(quickFixes);
	}
	
	public org.emftext.language.gbind.resource.gbind.GbindEProblemType getType() {
		return type;
	}
	
	public org.emftext.language.gbind.resource.gbind.GbindEProblemSeverity getSeverity() {
		return severity;
	}
	
	public String getMessage() {
		return message;
	}
	
	public java.util.Collection<org.emftext.language.gbind.resource.gbind.IGbindQuickFix> getQuickFixes() {
		return quickFixes;
	}
	
}
