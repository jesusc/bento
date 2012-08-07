/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.gbind.resource.gbind.mopp;

/**
 * The GbindTokenResolverFactory class provides access to all generated token
 * resolvers. By giving the name of a defined token, the corresponding resolve can
 * be obtained. Despite the fact that this class is called TokenResolverFactory is
 * does NOT create new token resolvers whenever a client calls methods to obtain a
 * resolver. Rather, this class maintains a map of all resolvers and creates each
 * resolver at most once.
 */
public class GbindTokenResolverFactory implements org.emftext.language.gbind.resource.gbind.IGbindTokenResolverFactory {
	
	private java.util.Map<String, org.emftext.language.gbind.resource.gbind.IGbindTokenResolver> tokenName2TokenResolver;
	private java.util.Map<String, org.emftext.language.gbind.resource.gbind.IGbindTokenResolver> featureName2CollectInTokenResolver;
	private static org.emftext.language.gbind.resource.gbind.IGbindTokenResolver defaultResolver = new org.emftext.language.gbind.resource.gbind.analysis.GbindDefaultTokenResolver();
	
	public GbindTokenResolverFactory() {
		tokenName2TokenResolver = new java.util.LinkedHashMap<String, org.emftext.language.gbind.resource.gbind.IGbindTokenResolver>();
		featureName2CollectInTokenResolver = new java.util.LinkedHashMap<String, org.emftext.language.gbind.resource.gbind.IGbindTokenResolver>();
		registerTokenResolver("QUOTED_91_93", new org.emftext.language.gbind.resource.gbind.analysis.GbindQUOTED_91_93TokenResolver());
		registerTokenResolver("NOTOP", new org.emftext.language.gbind.resource.gbind.analysis.SimpleoclNOTOPTokenResolver());
		registerTokenResolver("BOOLOP", new org.emftext.language.gbind.resource.gbind.analysis.SimpleoclBOOLOPTokenResolver());
		registerTokenResolver("INTOP", new org.emftext.language.gbind.resource.gbind.analysis.SimpleoclINTOPTokenResolver());
		registerTokenResolver("RELOP", new org.emftext.language.gbind.resource.gbind.analysis.SimpleoclRELOPTokenResolver());
		registerTokenResolver("EQ", new org.emftext.language.gbind.resource.gbind.analysis.SimpleoclEQTokenResolver());
		registerTokenResolver("NEQ", new org.emftext.language.gbind.resource.gbind.analysis.SimpleoclNEQTokenResolver());
		registerTokenResolver("ADDOP", new org.emftext.language.gbind.resource.gbind.analysis.SimpleoclADDOPTokenResolver());
		registerTokenResolver("MULOP", new org.emftext.language.gbind.resource.gbind.analysis.SimpleoclMULOPTokenResolver());
		registerTokenResolver("FLOAT", new org.emftext.language.gbind.resource.gbind.analysis.SimpleoclFLOATTokenResolver());
		registerTokenResolver("INTEGER", new org.emftext.language.gbind.resource.gbind.analysis.SimpleoclINTEGERTokenResolver());
		registerTokenResolver("STRINGTYPE", new org.emftext.language.gbind.resource.gbind.analysis.SimpleoclSTRINGTYPETokenResolver());
		registerTokenResolver("BOOLEANTYPE", new org.emftext.language.gbind.resource.gbind.analysis.SimpleoclBOOLEANTYPETokenResolver());
		registerTokenResolver("INTEGERTYPE", new org.emftext.language.gbind.resource.gbind.analysis.SimpleoclINTEGERTYPETokenResolver());
		registerTokenResolver("REALTYPE", new org.emftext.language.gbind.resource.gbind.analysis.SimpleoclREALTYPETokenResolver());
		registerTokenResolver("COLLECTIONTYPE", new org.emftext.language.gbind.resource.gbind.analysis.SimpleoclCOLLECTIONTYPETokenResolver());
		registerTokenResolver("BAGTYPE", new org.emftext.language.gbind.resource.gbind.analysis.SimpleoclBAGTYPETokenResolver());
		registerTokenResolver("ORDEREDSETTYPE", new org.emftext.language.gbind.resource.gbind.analysis.SimpleoclORDEREDSETTYPETokenResolver());
		registerTokenResolver("SEQUENCETYPE", new org.emftext.language.gbind.resource.gbind.analysis.SimpleoclSEQUENCETYPETokenResolver());
		registerTokenResolver("SETTYPE", new org.emftext.language.gbind.resource.gbind.analysis.SimpleoclSETTYPETokenResolver());
		registerTokenResolver("OCLANYTYPE", new org.emftext.language.gbind.resource.gbind.analysis.SimpleoclOCLANYTYPETokenResolver());
		registerTokenResolver("OCLTYPE", new org.emftext.language.gbind.resource.gbind.analysis.SimpleoclOCLTYPETokenResolver());
		registerTokenResolver("TUPLETYPE", new org.emftext.language.gbind.resource.gbind.analysis.SimpleoclTUPLETYPETokenResolver());
		registerTokenResolver("TUPLE", new org.emftext.language.gbind.resource.gbind.analysis.SimpleoclTUPLETokenResolver());
		registerTokenResolver("MAPTYPE", new org.emftext.language.gbind.resource.gbind.analysis.SimpleoclMAPTYPETokenResolver());
		registerTokenResolver("LAMBDATYPE", new org.emftext.language.gbind.resource.gbind.analysis.SimpleoclLAMBDATYPETokenResolver());
		registerTokenResolver("ENVTYPE", new org.emftext.language.gbind.resource.gbind.analysis.SimpleoclENVTYPETokenResolver());
		registerTokenResolver("TEXT", new org.emftext.language.gbind.resource.gbind.analysis.SimpleoclTEXTTokenResolver());
		registerTokenResolver("QUOTED_34_34_92", new org.emftext.language.gbind.resource.gbind.analysis.SimpleoclQUOTED_34_34_92TokenResolver());
		registerTokenResolver("QUOTED_39_39_92", new org.emftext.language.gbind.resource.gbind.analysis.SimpleoclQUOTED_39_39_92TokenResolver());
	}
	
	public org.emftext.language.gbind.resource.gbind.IGbindTokenResolver createTokenResolver(String tokenName) {
		return internalCreateResolver(tokenName2TokenResolver, tokenName);
	}
	
	public org.emftext.language.gbind.resource.gbind.IGbindTokenResolver createCollectInTokenResolver(String featureName) {
		return internalCreateResolver(featureName2CollectInTokenResolver, featureName);
	}
	
	protected boolean registerTokenResolver(String tokenName, org.emftext.language.gbind.resource.gbind.IGbindTokenResolver resolver){
		return internalRegisterTokenResolver(tokenName2TokenResolver, tokenName, resolver);
	}
	
	protected boolean registerCollectInTokenResolver(String featureName, org.emftext.language.gbind.resource.gbind.IGbindTokenResolver resolver){
		return internalRegisterTokenResolver(featureName2CollectInTokenResolver, featureName, resolver);
	}
	
	protected org.emftext.language.gbind.resource.gbind.IGbindTokenResolver deRegisterTokenResolver(String tokenName){
		return tokenName2TokenResolver.remove(tokenName);
	}
	
	private org.emftext.language.gbind.resource.gbind.IGbindTokenResolver internalCreateResolver(java.util.Map<String, org.emftext.language.gbind.resource.gbind.IGbindTokenResolver> resolverMap, String key) {
		if (resolverMap.containsKey(key)){
			return resolverMap.get(key);
		} else {
			return defaultResolver;
		}
	}
	
	private boolean internalRegisterTokenResolver(java.util.Map<String, org.emftext.language.gbind.resource.gbind.IGbindTokenResolver> resolverMap, String key, org.emftext.language.gbind.resource.gbind.IGbindTokenResolver resolver) {
		if (!resolverMap.containsKey(key)) {
			resolverMap.put(key,resolver);
			return true;
		}
		return false;
	}
	
}
