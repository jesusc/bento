/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gcomponent.resource.gcomponent.ui;

/**
 * A class which can be overridden to customize code completion proposals.
 */
public class GcomponentProposalPostProcessor {
	
	public java.util.List<genericity.language.gcomponent.resource.gcomponent.ui.GcomponentCompletionProposal> process(java.util.List<genericity.language.gcomponent.resource.gcomponent.ui.GcomponentCompletionProposal> proposals) {
		// the default implementation does returns the proposals as they are
		return proposals;
	}
	
}
