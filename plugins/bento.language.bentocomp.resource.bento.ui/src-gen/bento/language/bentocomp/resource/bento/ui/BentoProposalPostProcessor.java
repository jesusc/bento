/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package bento.language.bentocomp.resource.bento.ui;

/**
 * A class which can be overridden to customize code completion proposals.
 */
public class BentoProposalPostProcessor {
	
	public java.util.List<bento.language.bentocomp.resource.bento.ui.BentoCompletionProposal> process(java.util.List<bento.language.bentocomp.resource.bento.ui.BentoCompletionProposal> proposals) {
		// the default implementation does returns the proposals as they are
		return proposals;
	}
	
}
