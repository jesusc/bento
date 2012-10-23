/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gbind.analysis;

public class VariableExpReferredVariableReferenceResolver implements genericity.language.gbind.IGbindReferenceResolver<gbind.simpleocl.VariableExp, gbind.simpleocl.VariableDeclaration> {
	
	private genericity.language.gbind.analysis.GbindDefaultResolverDelegate<gbind.simpleocl.VariableExp, gbind.simpleocl.VariableDeclaration> delegate = new genericity.language.gbind.analysis.GbindDefaultResolverDelegate<gbind.simpleocl.VariableExp, gbind.simpleocl.VariableDeclaration>();
	
	public void resolve(String identifier, gbind.simpleocl.VariableExp container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final genericity.language.gbind.IGbindReferenceResolveResult<gbind.simpleocl.VariableDeclaration> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(gbind.simpleocl.VariableDeclaration element, gbind.simpleocl.VariableExp container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
