/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gcomponent.resource.gcomponent.grammar;

public class GcomponentContainment extends genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentTerminal {
	
	private final org.eclipse.emf.ecore.EClass[] allowedTypes;
	
	public GcomponentContainment(org.eclipse.emf.ecore.EStructuralFeature feature, genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentCardinality cardinality, org.eclipse.emf.ecore.EClass[] allowedTypes, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.allowedTypes = allowedTypes;
	}
	
	public org.eclipse.emf.ecore.EClass[] getAllowedTypes() {
		return allowedTypes;
	}
	
	public String toString() {
		String typeRestrictions = null;
		if (allowedTypes != null && allowedTypes.length > 0) {
			typeRestrictions = genericity.language.gcomponent.resource.gcomponent.util.GcomponentStringUtil.explode(allowedTypes, ", ", new genericity.language.gcomponent.resource.gcomponent.IGcomponentFunction1<String, org.eclipse.emf.ecore.EClass>() {
				public String execute(org.eclipse.emf.ecore.EClass eClass) {
					return eClass.getName();
				}
			});
		}
		return getFeature().getName() + (typeRestrictions == null ? "" : "[" + typeRestrictions + "]");
	}
	
}
