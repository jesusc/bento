/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gbind;

public interface IGbindProblem {
	public String getMessage();
	public genericity.language.gbind.GbindEProblemSeverity getSeverity();
	public genericity.language.gbind.GbindEProblemType getType();
	public java.util.Collection<genericity.language.gbind.IGbindQuickFix> getQuickFixes();
}
