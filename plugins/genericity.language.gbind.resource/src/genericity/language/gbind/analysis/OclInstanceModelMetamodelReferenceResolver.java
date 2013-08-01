/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gbind.analysis;

public class OclInstanceModelMetamodelReferenceResolver implements genericity.language.gbind.IGbindReferenceResolver<gbind.simpleocl.OclInstanceModel, gbind.simpleocl.OclMetamodel> {
	
	private genericity.language.gbind.analysis.GbindDefaultResolverDelegate<gbind.simpleocl.OclInstanceModel, gbind.simpleocl.OclMetamodel> delegate = new genericity.language.gbind.analysis.GbindDefaultResolverDelegate<gbind.simpleocl.OclInstanceModel, gbind.simpleocl.OclMetamodel>();
	
	public void resolve(String identifier, gbind.simpleocl.OclInstanceModel container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final genericity.language.gbind.IGbindReferenceResolveResult<gbind.simpleocl.OclMetamodel> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(gbind.simpleocl.OclMetamodel element, gbind.simpleocl.OclInstanceModel container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
