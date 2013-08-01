/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gbind.mopp;

public class GbindMetaInformation implements genericity.language.gbind.IGbindMetaInformation {
	
	public String getSyntaxName() {
		return "gbind";
	}
	
	public String getURI() {
		return "http://genericity/language/gbind";
	}
	
	public genericity.language.gbind.IGbindTextScanner createLexer() {
		return new genericity.language.gbind.mopp.GbindAntlrScanner(new genericity.language.gbind.mopp.GbindLexer());
	}
	
	public genericity.language.gbind.IGbindTextParser createParser(java.io.InputStream inputStream, String encoding) {
		return new genericity.language.gbind.mopp.GbindParser().createInstance(inputStream, encoding);
	}
	
	public genericity.language.gbind.IGbindTextPrinter createPrinter(java.io.OutputStream outputStream, genericity.language.gbind.IGbindTextResource resource) {
		return new genericity.language.gbind.mopp.GbindPrinter2(outputStream, resource);
	}
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new genericity.language.gbind.mopp.GbindSyntaxCoverageInformationProvider().getClassesWithSyntax();
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new genericity.language.gbind.mopp.GbindSyntaxCoverageInformationProvider().getStartSymbols();
	}
	
	public genericity.language.gbind.IGbindReferenceResolverSwitch getReferenceResolverSwitch() {
		return new genericity.language.gbind.mopp.GbindReferenceResolverSwitch();
	}
	
	public genericity.language.gbind.IGbindTokenResolverFactory getTokenResolverFactory() {
		return new genericity.language.gbind.mopp.GbindTokenResolverFactory();
	}
	
	public String getPathToCSDefinition() {
		return "genericity.language.gbind/metamodel/gbind.cs";
	}
	
	public String[] getTokenNames() {
		return genericity.language.gbind.mopp.GbindParser.tokenNames;
	}
	
	public genericity.language.gbind.IGbindTokenStyle getDefaultTokenStyle(String tokenName) {
		return new genericity.language.gbind.mopp.GbindTokenStyleInformationProvider().getDefaultTokenStyle(tokenName);
	}
	
	public java.util.Collection<genericity.language.gbind.IGbindBracketPair> getBracketPairs() {
		return new genericity.language.gbind.mopp.GbindBracketInformationProvider().getBracketPairs();
	}
	
	public org.eclipse.emf.ecore.EClass[] getFoldableClasses() {
		return new genericity.language.gbind.mopp.GbindFoldingInformationProvider().getFoldableClasses();
	}
	
	public org.eclipse.emf.ecore.resource.Resource.Factory createResourceFactory() {
		return new genericity.language.gbind.mopp.GbindResourceFactory();
	}
	
	public genericity.language.gbind.mopp.GbindNewFileContentProvider getNewFileContentProvider() {
		return new genericity.language.gbind.mopp.GbindNewFileContentProvider();
	}
	
	public void registerResourceFactory() {
		org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(getSyntaxName(), new genericity.language.gbind.mopp.GbindResourceFactory());
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
		return "genericity.language.gbind.resource.ui.launchConfigurationType";
	}
	
	public genericity.language.gbind.IGbindNameProvider createNameProvider() {
		return new genericity.language.gbind.analysis.GbindDefaultNameProvider();
	}
	
	public String[] getSyntaxHighlightableTokenNames() {
		genericity.language.gbind.mopp.GbindAntlrTokenHelper tokenHelper = new genericity.language.gbind.mopp.GbindAntlrTokenHelper();
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
		highlightableTokens.add(genericity.language.gbind.mopp.GbindTokenStyleInformationProvider.TASK_ITEM_TOKEN_NAME);
		return highlightableTokens.toArray(new String[highlightableTokens.size()]);
	}
	
}
