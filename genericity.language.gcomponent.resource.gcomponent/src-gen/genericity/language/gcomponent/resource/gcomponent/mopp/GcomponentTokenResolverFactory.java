/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gcomponent.resource.gcomponent.mopp;

/**
 * The GcomponentTokenResolverFactory class provides access to all generated token
 * resolvers. By giving the name of a defined token, the corresponding resolve can
 * be obtained. Despite the fact that this class is called TokenResolverFactory is
 * does NOT create new token resolvers whenever a client calls methods to obtain a
 * resolver. Rather, this class maintains a map of all resolvers and creates each
 * resolver at most once.
 */
public class GcomponentTokenResolverFactory implements genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolverFactory {
	
	private java.util.Map<String, genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver> tokenName2TokenResolver;
	private java.util.Map<String, genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver> featureName2CollectInTokenResolver;
	private static genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver defaultResolver = new genericity.language.gcomponent.resource.gcomponent.analysis.GcomponentDefaultTokenResolver();
	
	public GcomponentTokenResolverFactory() {
		tokenName2TokenResolver = new java.util.LinkedHashMap<String, genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver>();
		featureName2CollectInTokenResolver = new java.util.LinkedHashMap<String, genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver>();
		registerTokenResolver("TEXT", new genericity.language.gcomponent.resource.gcomponent.analysis.GcomponentTEXTTokenResolver());
		registerTokenResolver("QUOTED_34_34", new genericity.language.gcomponent.resource.gcomponent.analysis.GcomponentQUOTED_34_34TokenResolver());
	}
	
	public genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver createTokenResolver(String tokenName) {
		return internalCreateResolver(tokenName2TokenResolver, tokenName);
	}
	
	public genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver createCollectInTokenResolver(String featureName) {
		return internalCreateResolver(featureName2CollectInTokenResolver, featureName);
	}
	
	protected boolean registerTokenResolver(String tokenName, genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver resolver){
		return internalRegisterTokenResolver(tokenName2TokenResolver, tokenName, resolver);
	}
	
	protected boolean registerCollectInTokenResolver(String featureName, genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver resolver){
		return internalRegisterTokenResolver(featureName2CollectInTokenResolver, featureName, resolver);
	}
	
	protected genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver deRegisterTokenResolver(String tokenName){
		return tokenName2TokenResolver.remove(tokenName);
	}
	
	private genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver internalCreateResolver(java.util.Map<String, genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver> resolverMap, String key) {
		if (resolverMap.containsKey(key)){
			return resolverMap.get(key);
		} else {
			return defaultResolver;
		}
	}
	
	private boolean internalRegisterTokenResolver(java.util.Map<String, genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver> resolverMap, String key, genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver resolver) {
		if (!resolverMap.containsKey(key)) {
			resolverMap.put(key,resolver);
			return true;
		}
		return false;
	}
	
}
