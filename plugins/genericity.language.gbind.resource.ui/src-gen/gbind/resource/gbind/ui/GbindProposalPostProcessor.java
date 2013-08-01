/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package gbind.resource.gbind.ui;

/**
 * A class which can be overridden to customize code completion proposals.
 */
public class GbindProposalPostProcessor {
	
	public java.util.List<gbind.resource.gbind.ui.GbindCompletionProposal> process(java.util.List<gbind.resource.gbind.ui.GbindCompletionProposal> proposals) {
		// the default implementation does returns the proposals as they are
		return proposals;
	}
	
}
