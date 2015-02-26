/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package bento.language.bentocomp.resource.bento.mopp;

/**
 * The BentoTokenResolverFactory class provides access to all generated token
 * resolvers. By giving the name of a defined token, the corresponding resolve can
 * be obtained. Despite the fact that this class is called TokenResolverFactory is
 * does NOT create new token resolvers whenever a client calls methods to obtain a
 * resolver. Rather, this class maintains a map of all resolvers and creates each
 * resolver at most once.
 */
public class BentoTokenResolverFactory implements bento.language.bentocomp.resource.bento.IBentoTokenResolverFactory {
	
	private java.util.Map<String, bento.language.bentocomp.resource.bento.IBentoTokenResolver> tokenName2TokenResolver;
	private java.util.Map<String, bento.language.bentocomp.resource.bento.IBentoTokenResolver> featureName2CollectInTokenResolver;
	private static bento.language.bentocomp.resource.bento.IBentoTokenResolver defaultResolver = new bento.language.bentocomp.resource.bento.analysis.BentoDefaultTokenResolver();
	
	public BentoTokenResolverFactory() {
		tokenName2TokenResolver = new java.util.LinkedHashMap<String, bento.language.bentocomp.resource.bento.IBentoTokenResolver>();
		featureName2CollectInTokenResolver = new java.util.LinkedHashMap<String, bento.language.bentocomp.resource.bento.IBentoTokenResolver>();
		registerTokenResolver("QNAME", new bento.language.bentocomp.resource.bento.analysis.BentoQNAMETokenResolver());
		registerTokenResolver("TEXT", new bento.language.bentocomp.resource.bento.analysis.BentoTEXTTokenResolver());
		registerTokenResolver("QUOTED_34_34", new bento.language.bentocomp.resource.bento.analysis.BentoQUOTED_34_34TokenResolver());
	}
	
	public bento.language.bentocomp.resource.bento.IBentoTokenResolver createTokenResolver(String tokenName) {
		return internalCreateResolver(tokenName2TokenResolver, tokenName);
	}
	
	public bento.language.bentocomp.resource.bento.IBentoTokenResolver createCollectInTokenResolver(String featureName) {
		return internalCreateResolver(featureName2CollectInTokenResolver, featureName);
	}
	
	protected boolean registerTokenResolver(String tokenName, bento.language.bentocomp.resource.bento.IBentoTokenResolver resolver){
		return internalRegisterTokenResolver(tokenName2TokenResolver, tokenName, resolver);
	}
	
	protected boolean registerCollectInTokenResolver(String featureName, bento.language.bentocomp.resource.bento.IBentoTokenResolver resolver){
		return internalRegisterTokenResolver(featureName2CollectInTokenResolver, featureName, resolver);
	}
	
	protected bento.language.bentocomp.resource.bento.IBentoTokenResolver deRegisterTokenResolver(String tokenName){
		return tokenName2TokenResolver.remove(tokenName);
	}
	
	private bento.language.bentocomp.resource.bento.IBentoTokenResolver internalCreateResolver(java.util.Map<String, bento.language.bentocomp.resource.bento.IBentoTokenResolver> resolverMap, String key) {
		if (resolverMap.containsKey(key)){
			return resolverMap.get(key);
		} else {
			return defaultResolver;
		}
	}
	
	private boolean internalRegisterTokenResolver(java.util.Map<String, bento.language.bentocomp.resource.bento.IBentoTokenResolver> resolverMap, String key, bento.language.bentocomp.resource.bento.IBentoTokenResolver resolver) {
		if (!resolverMap.containsKey(key)) {
			resolverMap.put(key,resolver);
			return true;
		}
		return false;
	}
	
}
