/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.gbind.resource.gbind.mopp;

public class GbindMetaInformation implements org.emftext.language.gbind.resource.gbind.IGbindMetaInformation {
	
	public String getSyntaxName() {
		return "gbind";
	}
	
	public String getURI() {
		return "http://genericity/language/gbind";
	}
	
	public org.emftext.language.gbind.resource.gbind.IGbindTextScanner createLexer() {
		return new org.emftext.language.gbind.resource.gbind.mopp.GbindAntlrScanner(new org.emftext.language.gbind.resource.gbind.mopp.GbindLexer());
	}
	
	public org.emftext.language.gbind.resource.gbind.IGbindTextParser createParser(java.io.InputStream inputStream, String encoding) {
		return new org.emftext.language.gbind.resource.gbind.mopp.GbindParser().createInstance(inputStream, encoding);
	}
	
	public org.emftext.language.gbind.resource.gbind.IGbindTextPrinter createPrinter(java.io.OutputStream outputStream, org.emftext.language.gbind.resource.gbind.IGbindTextResource resource) {
		return new org.emftext.language.gbind.resource.gbind.mopp.GbindPrinter2(outputStream, resource);
	}
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new org.emftext.language.gbind.resource.gbind.mopp.GbindSyntaxCoverageInformationProvider().getClassesWithSyntax();
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new org.emftext.language.gbind.resource.gbind.mopp.GbindSyntaxCoverageInformationProvider().getStartSymbols();
	}
	
	public org.emftext.language.gbind.resource.gbind.IGbindReferenceResolverSwitch getReferenceResolverSwitch() {
		return new org.emftext.language.gbind.resource.gbind.mopp.GbindReferenceResolverSwitch();
	}
	
	public org.emftext.language.gbind.resource.gbind.IGbindTokenResolverFactory getTokenResolverFactory() {
		return new org.emftext.language.gbind.resource.gbind.mopp.GbindTokenResolverFactory();
	}
	
	public String getPathToCSDefinition() {
		return "genericity.language.gbind/metamodel/gbind.cs";
	}
	
	public String[] getTokenNames() {
		return new org.emftext.language.gbind.resource.gbind.mopp.GbindParser(null).getTokenNames();
	}
	
	public org.emftext.language.gbind.resource.gbind.IGbindTokenStyle getDefaultTokenStyle(String tokenName) {
		return new org.emftext.language.gbind.resource.gbind.mopp.GbindTokenStyleInformationProvider().getDefaultTokenStyle(tokenName);
	}
	
	public java.util.Collection<org.emftext.language.gbind.resource.gbind.IGbindBracketPair> getBracketPairs() {
		return new org.emftext.language.gbind.resource.gbind.mopp.GbindBracketInformationProvider().getBracketPairs();
	}
	
	public org.eclipse.emf.ecore.EClass[] getFoldableClasses() {
		return new org.emftext.language.gbind.resource.gbind.mopp.GbindFoldingInformationProvider().getFoldableClasses();
	}
	
	public org.eclipse.emf.ecore.resource.Resource.Factory createResourceFactory() {
		return new org.emftext.language.gbind.resource.gbind.mopp.GbindResourceFactory();
	}
	
	public org.emftext.language.gbind.resource.gbind.mopp.GbindNewFileContentProvider getNewFileContentProvider() {
		return new org.emftext.language.gbind.resource.gbind.mopp.GbindNewFileContentProvider();
	}
	
	public void registerResourceFactory() {
		org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(getSyntaxName(), new org.emftext.language.gbind.resource.gbind.mopp.GbindResourceFactory());
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
		return "org.emftext.language.gbind.resource.gbind.ui.launchConfigurationType";
	}
	
}
