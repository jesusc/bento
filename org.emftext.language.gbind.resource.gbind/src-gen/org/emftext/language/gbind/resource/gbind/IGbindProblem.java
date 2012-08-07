/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.gbind.resource.gbind;

public interface IGbindProblem {
	public String getMessage();
	public org.emftext.language.gbind.resource.gbind.GbindEProblemSeverity getSeverity();
	public org.emftext.language.gbind.resource.gbind.GbindEProblemType getType();
	public java.util.Collection<org.emftext.language.gbind.resource.gbind.IGbindQuickFix> getQuickFixes();
}
