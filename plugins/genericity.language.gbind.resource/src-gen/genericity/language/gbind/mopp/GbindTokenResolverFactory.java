/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gbind.mopp;

/**
 * The GbindTokenResolverFactory class provides access to all generated token
 * resolvers. By giving the name of a defined token, the corresponding resolve can
 * be obtained. Despite the fact that this class is called TokenResolverFactory is
 * does NOT create new token resolvers whenever a client calls methods to obtain a
 * resolver. Rather, this class maintains a map of all resolvers and creates each
 * resolver at most once.
 */
public class GbindTokenResolverFactory implements genericity.language.gbind.IGbindTokenResolverFactory {
	
	private java.util.Map<String, genericity.language.gbind.IGbindTokenResolver> tokenName2TokenResolver;
	private java.util.Map<String, genericity.language.gbind.IGbindTokenResolver> featureName2CollectInTokenResolver;
	private static genericity.language.gbind.IGbindTokenResolver defaultResolver = new genericity.language.gbind.analysis.GbindDefaultTokenResolver();
	
	public GbindTokenResolverFactory() {
		tokenName2TokenResolver = new java.util.LinkedHashMap<String, genericity.language.gbind.IGbindTokenResolver>();
		featureName2CollectInTokenResolver = new java.util.LinkedHashMap<String, genericity.language.gbind.IGbindTokenResolver>();
		registerTokenResolver("NOTOP", new genericity.language.gbind.analysis.GbindNOTOPTokenResolver());
		registerTokenResolver("BOOLOP", new genericity.language.gbind.analysis.GbindBOOLOPTokenResolver());
		registerTokenResolver("INTOP", new genericity.language.gbind.analysis.GbindINTOPTokenResolver());
		registerTokenResolver("RELOP", new genericity.language.gbind.analysis.GbindRELOPTokenResolver());
		registerTokenResolver("EQ", new genericity.language.gbind.analysis.GbindEQTokenResolver());
		registerTokenResolver("NEQ", new genericity.language.gbind.analysis.GbindNEQTokenResolver());
		registerTokenResolver("ADDOP", new genericity.language.gbind.analysis.GbindADDOPTokenResolver());
		registerTokenResolver("MULOP", new genericity.language.gbind.analysis.GbindMULOPTokenResolver());
		registerTokenResolver("FLOAT", new genericity.language.gbind.analysis.GbindFLOATTokenResolver());
		registerTokenResolver("INTEGER", new genericity.language.gbind.analysis.GbindINTEGERTokenResolver());
		registerTokenResolver("STRINGTYPE", new genericity.language.gbind.analysis.GbindSTRINGTYPETokenResolver());
		registerTokenResolver("BOOLEANTYPE", new genericity.language.gbind.analysis.GbindBOOLEANTYPETokenResolver());
		registerTokenResolver("INTEGERTYPE", new genericity.language.gbind.analysis.GbindINTEGERTYPETokenResolver());
		registerTokenResolver("REALTYPE", new genericity.language.gbind.analysis.GbindREALTYPETokenResolver());
		registerTokenResolver("COLLECTIONTYPE", new genericity.language.gbind.analysis.GbindCOLLECTIONTYPETokenResolver());
		registerTokenResolver("BAGTYPE", new genericity.language.gbind.analysis.GbindBAGTYPETokenResolver());
		registerTokenResolver("ORDEREDSETTYPE", new genericity.language.gbind.analysis.GbindORDEREDSETTYPETokenResolver());
		registerTokenResolver("SEQUENCETYPE", new genericity.language.gbind.analysis.GbindSEQUENCETYPETokenResolver());
		registerTokenResolver("SETTYPE", new genericity.language.gbind.analysis.GbindSETTYPETokenResolver());
		registerTokenResolver("OCLANYTYPE", new genericity.language.gbind.analysis.GbindOCLANYTYPETokenResolver());
		registerTokenResolver("OCLTYPE", new genericity.language.gbind.analysis.GbindOCLTYPETokenResolver());
		registerTokenResolver("TUPLETYPE", new genericity.language.gbind.analysis.GbindTUPLETYPETokenResolver());
		registerTokenResolver("TUPLE", new genericity.language.gbind.analysis.GbindTUPLETokenResolver());
		registerTokenResolver("MAPTYPE", new genericity.language.gbind.analysis.GbindMAPTYPETokenResolver());
		registerTokenResolver("LAMBDATYPE", new genericity.language.gbind.analysis.GbindLAMBDATYPETokenResolver());
		registerTokenResolver("ENVTYPE", new genericity.language.gbind.analysis.GbindENVTYPETokenResolver());
		registerTokenResolver("TEXT", new genericity.language.gbind.analysis.GbindTEXTTokenResolver());
		registerTokenResolver("QUOTED_34_34_92", new genericity.language.gbind.analysis.GbindQUOTED_34_34_92TokenResolver());
		registerTokenResolver("QUOTED_39_39_92", new genericity.language.gbind.analysis.GbindQUOTED_39_39_92TokenResolver());
		registerTokenResolver("QUOTED_91_93", new genericity.language.gbind.analysis.GbindQUOTED_91_93TokenResolver());
	}
	
	public genericity.language.gbind.IGbindTokenResolver createTokenResolver(String tokenName) {
		return internalCreateResolver(tokenName2TokenResolver, tokenName);
	}
	
	public genericity.language.gbind.IGbindTokenResolver createCollectInTokenResolver(String featureName) {
		return internalCreateResolver(featureName2CollectInTokenResolver, featureName);
	}
	
	protected boolean registerTokenResolver(String tokenName, genericity.language.gbind.IGbindTokenResolver resolver){
		return internalRegisterTokenResolver(tokenName2TokenResolver, tokenName, resolver);
	}
	
	protected boolean registerCollectInTokenResolver(String featureName, genericity.language.gbind.IGbindTokenResolver resolver){
		return internalRegisterTokenResolver(featureName2CollectInTokenResolver, featureName, resolver);
	}
	
	protected genericity.language.gbind.IGbindTokenResolver deRegisterTokenResolver(String tokenName){
		return tokenName2TokenResolver.remove(tokenName);
	}
	
	private genericity.language.gbind.IGbindTokenResolver internalCreateResolver(java.util.Map<String, genericity.language.gbind.IGbindTokenResolver> resolverMap, String key) {
		if (resolverMap.containsKey(key)){
			return resolverMap.get(key);
		} else {
			return defaultResolver;
		}
	}
	
	private boolean internalRegisterTokenResolver(java.util.Map<String, genericity.language.gbind.IGbindTokenResolver> resolverMap, String key, genericity.language.gbind.IGbindTokenResolver resolver) {
		if (!resolverMap.containsKey(key)) {
			resolverMap.put(key,resolver);
			return true;
		}
		return false;
	}
	
}
