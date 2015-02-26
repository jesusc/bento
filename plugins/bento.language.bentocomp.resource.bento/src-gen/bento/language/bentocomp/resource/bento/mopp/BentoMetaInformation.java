/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package bento.language.bentocomp.resource.bento.mopp;

public class BentoMetaInformation implements bento.language.bentocomp.resource.bento.IBentoMetaInformation {
	
	public String getSyntaxName() {
		return "bento";
	}
	
	public String getURI() {
		return "http://www.miso.es/bento/bentocomp";
	}
	
	public bento.language.bentocomp.resource.bento.IBentoTextScanner createLexer() {
		return new bento.language.bentocomp.resource.bento.mopp.BentoAntlrScanner(new bento.language.bentocomp.resource.bento.mopp.BentoLexer());
	}
	
	public bento.language.bentocomp.resource.bento.IBentoTextParser createParser(java.io.InputStream inputStream, String encoding) {
		return new bento.language.bentocomp.resource.bento.mopp.BentoParser().createInstance(inputStream, encoding);
	}
	
	public bento.language.bentocomp.resource.bento.IBentoTextPrinter createPrinter(java.io.OutputStream outputStream, bento.language.bentocomp.resource.bento.IBentoTextResource resource) {
		return new bento.language.bentocomp.resource.bento.mopp.BentoPrinter2(outputStream, resource);
	}
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new bento.language.bentocomp.resource.bento.mopp.BentoSyntaxCoverageInformationProvider().getClassesWithSyntax();
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new bento.language.bentocomp.resource.bento.mopp.BentoSyntaxCoverageInformationProvider().getStartSymbols();
	}
	
	public bento.language.bentocomp.resource.bento.IBentoReferenceResolverSwitch getReferenceResolverSwitch() {
		return new bento.language.bentocomp.resource.bento.mopp.BentoReferenceResolverSwitch();
	}
	
	public bento.language.bentocomp.resource.bento.IBentoTokenResolverFactory getTokenResolverFactory() {
		return new bento.language.bentocomp.resource.bento.mopp.BentoTokenResolverFactory();
	}
	
	public String getPathToCSDefinition() {
		return "bento.language.bentocomp/metamodel/bentoDSL.cs";
	}
	
	public String[] getTokenNames() {
		return bento.language.bentocomp.resource.bento.mopp.BentoParser.tokenNames;
	}
	
	public bento.language.bentocomp.resource.bento.IBentoTokenStyle getDefaultTokenStyle(String tokenName) {
		return new bento.language.bentocomp.resource.bento.mopp.BentoTokenStyleInformationProvider().getDefaultTokenStyle(tokenName);
	}
	
	public java.util.Collection<bento.language.bentocomp.resource.bento.IBentoBracketPair> getBracketPairs() {
		return new bento.language.bentocomp.resource.bento.mopp.BentoBracketInformationProvider().getBracketPairs();
	}
	
	public org.eclipse.emf.ecore.EClass[] getFoldableClasses() {
		return new bento.language.bentocomp.resource.bento.mopp.BentoFoldingInformationProvider().getFoldableClasses();
	}
	
	public org.eclipse.emf.ecore.resource.Resource.Factory createResourceFactory() {
		return new bento.language.bentocomp.resource.bento.mopp.BentoResourceFactory();
	}
	
	public bento.language.bentocomp.resource.bento.mopp.BentoNewFileContentProvider getNewFileContentProvider() {
		return new bento.language.bentocomp.resource.bento.mopp.BentoNewFileContentProvider();
	}
	
	public void registerResourceFactory() {
		org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(getSyntaxName(), new bento.language.bentocomp.resource.bento.mopp.BentoResourceFactory());
	}
	
	/**
	 * Returns the key of the option that can be used to register a preprocessor that
	 * is used as a pipe when loading resources. This key is language-specific. To
	 * register one preprocessor for multiple resource types, it must be registered
	 * individually using all keys.
	 */
	public String getInputStreamPreprocessorProviderOptionKey() {
		return getSyntaxName() + "_" + "INPUT_STREAM_PREPROCESSOR_PROVIDER";
	}
	
	/**
	 * Returns the key of the option that can be used to register a post-processors
	 * that are invoked after loading resources. This key is language-specific. To
	 * register one post-processor for multiple resource types, it must be registered
	 * individually using all keys.
	 */
	public String getResourcePostProcessorProviderOptionKey() {
		return getSyntaxName() + "_" + "RESOURCE_POSTPROCESSOR_PROVIDER";
	}
	
	public String getLaunchConfigurationType() {
		return "bento.language.bentocomp.resource.bento.ui.launchConfigurationType";
	}
	
	public bento.language.bentocomp.resource.bento.IBentoNameProvider createNameProvider() {
		return new bento.language.bentocomp.resource.bento.analysis.BentoDefaultNameProvider();
	}
	
	public String[] getSyntaxHighlightableTokenNames() {
		bento.language.bentocomp.resource.bento.mopp.BentoAntlrTokenHelper tokenHelper = new bento.language.bentocomp.resource.bento.mopp.BentoAntlrTokenHelper();
		java.util.List<String> highlightableTokens = new java.util.ArrayList<String>();
		String[] parserTokenNames = getTokenNames();
		for (int i = 0; i < parserTokenNames.length; i++) {
			// If ANTLR is used we need to normalize the token names
			if (!tokenHelper.canBeUsedForSyntaxHighlighting(i)) {
				continue;
			}
			String tokenName = tokenHelper.getTokenName(parserTokenNames, i);
			if (tokenName == null) {
				continue;
			}
			highlightableTokens.add(tokenName);
		}
		highlightableTokens.add(bento.language.bentocomp.resource.bento.mopp.BentoTokenStyleInformationProvider.TASK_ITEM_TOKEN_NAME);
		return highlightableTokens.toArray(new String[highlightableTokens.size()]);
	}
	
}
