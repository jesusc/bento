/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gcomponent.resource.gcomponent.ui;

public class GcomponentCompletionProcessor implements org.eclipse.jface.text.contentassist.IContentAssistProcessor {
	
	private genericity.language.gcomponent.resource.gcomponent.IGcomponentResourceProvider resourceProvider;
	private genericity.language.gcomponent.resource.gcomponent.ui.IGcomponentBracketHandlerProvider bracketHandlerProvider;
	
	public GcomponentCompletionProcessor(genericity.language.gcomponent.resource.gcomponent.IGcomponentResourceProvider resourceProvider, genericity.language.gcomponent.resource.gcomponent.ui.IGcomponentBracketHandlerProvider bracketHandlerProvider) {
		this.resourceProvider = resourceProvider;
		this.bracketHandlerProvider = bracketHandlerProvider;
	}
	
	public org.eclipse.jface.text.contentassist.ICompletionProposal[] computeCompletionProposals(org.eclipse.jface.text.ITextViewer viewer, int offset) {
		genericity.language.gcomponent.resource.gcomponent.IGcomponentTextResource textResource = resourceProvider.getResource();
		String content = viewer.getDocument().get();
		genericity.language.gcomponent.resource.gcomponent.ui.GcomponentCodeCompletionHelper helper = new genericity.language.gcomponent.resource.gcomponent.ui.GcomponentCodeCompletionHelper();
		genericity.language.gcomponent.resource.gcomponent.ui.GcomponentCompletionProposal[] computedProposals = helper.computeCompletionProposals(textResource, content, offset);
		
		// call completion proposal post processor to allow for customizing the proposals
		genericity.language.gcomponent.resource.gcomponent.ui.GcomponentProposalPostProcessor proposalPostProcessor = new genericity.language.gcomponent.resource.gcomponent.ui.GcomponentProposalPostProcessor();
		java.util.List<genericity.language.gcomponent.resource.gcomponent.ui.GcomponentCompletionProposal> computedProposalList = java.util.Arrays.asList(computedProposals);
		java.util.List<genericity.language.gcomponent.resource.gcomponent.ui.GcomponentCompletionProposal> extendedProposalList = proposalPostProcessor.process(computedProposalList);
		if (extendedProposalList == null) {
			extendedProposalList = java.util.Collections.emptyList();
		}
		java.util.List<genericity.language.gcomponent.resource.gcomponent.ui.GcomponentCompletionProposal> finalProposalList = new java.util.ArrayList<genericity.language.gcomponent.resource.gcomponent.ui.GcomponentCompletionProposal>();
		for (genericity.language.gcomponent.resource.gcomponent.ui.GcomponentCompletionProposal proposal : extendedProposalList) {
			if (proposal.getMatchesPrefix()) {
				finalProposalList.add(proposal);
			}
		}
		org.eclipse.jface.text.contentassist.ICompletionProposal[] result = new org.eclipse.jface.text.contentassist.ICompletionProposal[finalProposalList.size()];
		int i = 0;
		for (genericity.language.gcomponent.resource.gcomponent.ui.GcomponentCompletionProposal proposal : finalProposalList) {
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
			genericity.language.gcomponent.resource.gcomponent.ui.IGcomponentBracketHandler bracketHandler = bracketHandlerProvider.getBracketHandler();
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
