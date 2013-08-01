/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gcomponent.resource.gcomponent;

public interface IGcomponentProblem {
	public String getMessage();
	public genericity.language.gcomponent.resource.gcomponent.GcomponentEProblemSeverity getSeverity();
	public genericity.language.gcomponent.resource.gcomponent.GcomponentEProblemType getType();
	public java.util.Collection<genericity.language.gcomponent.resource.gcomponent.IGcomponentQuickFix> getQuickFixes();
}
