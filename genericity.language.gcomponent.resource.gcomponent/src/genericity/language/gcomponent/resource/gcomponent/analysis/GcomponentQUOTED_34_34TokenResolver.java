/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gcomponent.resource.gcomponent.analysis;

public class GcomponentQUOTED_34_34TokenResolver implements genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver {
	
	private genericity.language.gcomponent.resource.gcomponent.analysis.GcomponentDefaultTokenResolver defaultTokenResolver = new genericity.language.gcomponent.resource.gcomponent.analysis.GcomponentDefaultTokenResolver(true);
	
	public String deResolve(Object value, org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container) {
		// By default token de-resolving is delegated to the DefaultTokenResolver.
		String result = defaultTokenResolver.deResolve(value, feature, container, "\"", "\"", null);
		return result;
	}
	
	public void resolve(String lexem, org.eclipse.emf.ecore.EStructuralFeature feature, genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolveResult result) {
		// By default token resolving is delegated to the DefaultTokenResolver.
		defaultTokenResolver.resolve(lexem, feature, result, "\"", "\"", null);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		defaultTokenResolver.setOptions(options);
	}
	
}
