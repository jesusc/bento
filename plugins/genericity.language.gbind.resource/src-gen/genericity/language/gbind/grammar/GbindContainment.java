/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gbind.grammar;

public class GbindContainment extends genericity.language.gbind.grammar.GbindTerminal {
	
	private final org.eclipse.emf.ecore.EClass[] allowedTypes;
	
	public GbindContainment(org.eclipse.emf.ecore.EStructuralFeature feature, genericity.language.gbind.grammar.GbindCardinality cardinality, org.eclipse.emf.ecore.EClass[] allowedTypes, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.allowedTypes = allowedTypes;
	}
	
	public org.eclipse.emf.ecore.EClass[] getAllowedTypes() {
		return allowedTypes;
	}
	
	public String toString() {
		String typeRestrictions = null;
		if (allowedTypes != null && allowedTypes.length > 0) {
			typeRestrictions = genericity.language.gbind.util.GbindStringUtil.explode(allowedTypes, ", ", new genericity.language.gbind.IGbindFunction1<String, org.eclipse.emf.ecore.EClass>() {
				public String execute(org.eclipse.emf.ecore.EClass eClass) {
					return eClass.getName();
				}
			});
		}
		return getFeature().getName() + (typeRestrictions == null ? "" : "[" + typeRestrictions + "]");
	}
	
}
