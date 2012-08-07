/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.gbind.resource.gbind.ui;

public class GbindCompletionProcessor implements org.eclipse.jface.text.contentassist.IContentAssistProcessor {
	
	private org.emftext.language.gbind.resource.gbind.IGbindResourceProvider resourceProvider;
	private org.emftext.language.gbind.resource.gbind.ui.IGbindBracketHandlerProvider bracketHandlerProvider;
	
	public GbindCompletionProcessor(org.emftext.language.gbind.resource.gbind.IGbindResourceProvider resourceProvider, org.emftext.language.gbind.resource.gbind.ui.IGbindBracketHandlerProvider bracketHandlerProvider) {
		this.resourceProvider = resourceProvider;
		this.bracketHandlerProvider = bracketHandlerProvider;
	}
	
	public org.eclipse.jface.text.contentassist.ICompletionProposal[] computeCompletionProposals(org.eclipse.jface.text.ITextViewer viewer, int offset) {
		org.emftext.language.gbind.resource.gbind.IGbindTextResource textResource = resourceProvider.getResource();
		String content = viewer.getDocument().get();
		org.emftext.language.gbind.resource.gbind.ui.GbindCodeCompletionHelper helper = new org.emftext.language.gbind.resource.gbind.ui.GbindCodeCompletionHelper();
		org.emftext.language.gbind.resource.gbind.ui.GbindCompletionProposal[] computedProposals = helper.computeCompletionProposals(textResource, content, offset);
		
		// call completion proposal post processor to allow for customizing the proposals
		org.emftext.language.gbind.resource.gbind.ui.GbindProposalPostProcessor proposalPostProcessor = new org.emftext.language.gbind.resource.gbind.ui.GbindProposalPostProcessor();
		java.util.List<org.emftext.language.gbind.resource.gbind.ui.GbindCompletionProposal> computedProposalList = java.util.Arrays.asList(computedProposals);
		java.util.List<org.emftext.language.gbind.resource.gbind.ui.GbindCompletionProposal> extendedProposalList = proposalPostProcessor.process(computedProposalList);
		if (extendedProposalList == null) {
			extendedProposalList = java.util.Collections.emptyList();
		}
		java.util.List<org.emftext.language.gbind.resource.gbind.ui.GbindCompletionProposal> finalProposalList = new java.util.ArrayList<org.emftext.language.gbind.resource.gbind.ui.GbindCompletionProposal>();
		for (org.emftext.language.gbind.resource.gbind.ui.GbindCompletionProposal proposal : extendedProposalList) {
			if (proposal.getMatchesPrefix()) {
				finalProposalList.add(proposal);
			}
		}
		org.eclipse.jface.text.contentassist.ICompletionProposal[] result = new org.eclipse.jface.text.contentassist.ICompletionProposal[finalProposalList.size()];
		int i = 0;
		for (org.emftext.language.gbind.resource.gbind.ui.GbindCompletionProposal proposal : finalProposalList) {
			String proposalString = proposal.getInsertString();
			String displayString = proposal.getDisplayString();
			String prefix = proposal.getPrefix();
			org.eclipse.swt.graphics.Image image = proposal.getImage();
			org.eclipse.jface.text.contentassist.IContextInformation info;
			info = new org.eclipse.jface.text.contentassist.ContextInformation(image, proposalString, proposalString);
			int begin = offset - prefix.length();
			int replacementLength = prefix.length();
			// if a closing bracket was automatically inserted right before, we enlarge the
			// replacement length in order to overwrite the bracket.
			org.emftext.language.gbind.resource.gbind.ui.IGbindBracketHandler bracketHandler = bracketHandlerProvider.getBracketHandler();
			String closingBracket = bracketHandler.getClosingBracket();
			if (bracketHandler.addedClosingBracket() && proposalString.endsWith(closingBracket)) {
				replacementLength += closingBracket.length();
			}
			result[i++] = new org.eclipse.jface.text.contentassist.CompletionProposal(proposalString, begin, replacementLength, proposalString.length(), image, displayString, info, proposalString);
		}
		return result;
	}
	
	public org.eclipse.jface.text.contentassist.IContextInformation[] computeContextInformation(org.eclipse.jface.text.ITextViewer viewer, int offset) {
		return null;
	}
	
	public char[] getCompletionProposalAutoActivationCharacters() {
		return null;
	}
	
	public char[] getContextInformationAutoActivationCharacters() {
		return null;
	}
	
	public org.eclipse.jface.text.contentassist.IContextInformationValidator getContextInformationValidator() {
		return null;
	}
	
	public String getErrorMessage() {
		return null;
	}
}
