/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package bento.language.bentocomp.resource.bento.grammar;

public class BentoContainment extends bento.language.bentocomp.resource.bento.grammar.BentoTerminal {
	
	private final org.eclipse.emf.ecore.EClass[] allowedTypes;
	
	public BentoContainment(org.eclipse.emf.ecore.EStructuralFeature feature, bento.language.bentocomp.resource.bento.grammar.BentoCardinality cardinality, org.eclipse.emf.ecore.EClass[] allowedTypes, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.allowedTypes = allowedTypes;
	}
	
	public org.eclipse.emf.ecore.EClass[] getAllowedTypes() {
		return allowedTypes;
	}
	
	public String toString() {
		String typeRestrictions = null;
		if (allowedTypes != null && allowedTypes.length > 0) {
			typeRestrictions = bento.language.bentocomp.resource.bento.util.BentoStringUtil.explode(allowedTypes, ", ", new bento.language.bentocomp.resource.bento.IBentoFunction1<String, org.eclipse.emf.ecore.EClass>() {
				public String execute(org.eclipse.emf.ecore.EClass eClass) {
					return eClass.getName();
				}
			});
		}
		return getFeature().getName() + (typeRestrictions == null ? "" : "[" + typeRestrictions + "]");
	}
	
}
