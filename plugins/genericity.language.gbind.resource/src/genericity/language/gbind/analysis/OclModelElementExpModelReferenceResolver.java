/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gbind.analysis;

public class OclModelElementExpModelReferenceResolver implements genericity.language.gbind.IGbindReferenceResolver<gbind.simpleocl.OclModelElementExp, gbind.simpleocl.OclModel> {
	
	private genericity.language.gbind.analysis.GbindDefaultResolverDelegate<gbind.simpleocl.OclModelElementExp, gbind.simpleocl.OclModel> delegate = new genericity.language.gbind.analysis.GbindDefaultResolverDelegate<gbind.simpleocl.OclModelElementExp, gbind.simpleocl.OclModel>();
	
	public void resolve(String identifier, gbind.simpleocl.OclModelElementExp container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final genericity.language.gbind.IGbindReferenceResolveResult<gbind.simpleocl.OclModel> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(gbind.simpleocl.OclModel element, gbind.simpleocl.OclModelElementExp container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
