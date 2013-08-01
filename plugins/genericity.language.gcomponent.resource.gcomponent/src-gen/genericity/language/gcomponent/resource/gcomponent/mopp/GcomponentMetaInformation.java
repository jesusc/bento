/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gcomponent.resource.gcomponent.mopp;

public class GcomponentMetaInformation implements genericity.language.gcomponent.resource.gcomponent.IGcomponentMetaInformation {
	
	public String getSyntaxName() {
		return "gcomponent";
	}
	
	public String getURI() {
		return "http://genericity/language/gcomponent";
	}
	
	public genericity.language.gcomponent.resource.gcomponent.IGcomponentTextScanner createLexer() {
		return new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentAntlrScanner(new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentLexer());
	}
	
	public genericity.language.gcomponent.resource.gcomponent.IGcomponentTextParser createParser(java.io.InputStream inputStream, String encoding) {
		return new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentParser().createInstance(inputStream, encoding);
	}
	
	public genericity.language.gcomponent.resource.gcomponent.IGcomponentTextPrinter createPrinter(java.io.OutputStream outputStream, genericity.language.gcomponent.resource.gcomponent.IGcomponentTextResource resource) {
		return new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentPrinter2(outputStream, resource);
	}
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentSyntaxCoverageInformationProvider().getClassesWithSyntax();
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentSyntaxCoverageInformationProvider().getStartSymbols();
	}
	
	public genericity.language.gcomponent.resource.gcomponent.IGcomponentReferenceResolverSwitch getReferenceResolverSwitch() {
		return new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentReferenceResolverSwitch();
	}
	
	public genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolverFactory getTokenResolverFactory() {
		return new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTokenResolverFactory();
	}
	
	public String getPathToCSDefinition() {
		return "genericity.language.gcomponent/metamodel/gcomponent.cs";
	}
	
	public String[] getTokenNames() {
		return genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentParser.tokenNames;
	}
	
	public genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenStyle getDefaultTokenStyle(String tokenName) {
		return new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTokenStyleInformationProvider().getDefaultTokenStyle(tokenName);
	}
	
	public java.util.Collection<genericity.language.gcomponent.resource.gcomponent.IGcomponentBracketPair> getBracketPairs() {
		return new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentBracketInformationProvider().getBracketPairs();
	}
	
	public org.eclipse.emf.ecore.EClass[] getFoldableClasses() {
		return new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentFoldingInformationProvider().getFoldableClasses();
	}
	
	public org.eclipse.emf.ecore.resource.Resource.Factory createResourceFactory() {
		return new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentResourceFactory();
	}
	
	public genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentNewFileContentProvider getNewFileContentProvider() {
		return new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentNewFileContentProvider();
	}
	
	public void registerResourceFactory() {
		org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(getSyntaxName(), new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentResourceFactory());
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
		return "genericity.language.gcomponent.resource.gcomponent.ui.launchConfigurationType";
	}
	
	public genericity.language.gcomponent.resource.gcomponent.IGcomponentNameProvider createNameProvider() {
		return new genericity.language.gcomponent.resource.gcomponent.analysis.GcomponentDefaultNameProvider();
	}
	
	public String[] getSyntaxHighlightableTokenNames() {
		genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentAntlrTokenHelper tokenHelper = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentAntlrTokenHelper();
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
		highlightableTokens.add(genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTokenStyleInformationProvider.TASK_ITEM_TOKEN_NAME);
		return highlightableTokens.toArray(new String[highlightableTokens.size()]);
	}
	
}
