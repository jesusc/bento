/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gcomponent.resource.gcomponent.mopp;

public class GcomponentSyntaxCoverageInformationProvider {
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new org.eclipse.emf.ecore.EClass[] {
			genericity.language.gcomponent.GcomponentPackage.eINSTANCE.getTransformationComponent(),
			genericity.language.gcomponent.GcomponentPackage.eINSTANCE.getConcept(),
			genericity.language.gcomponent.GcomponentPackage.eINSTANCE.getTag(),
		};
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new org.eclipse.emf.ecore.EClass[] {
			genericity.language.gcomponent.GcomponentPackage.eINSTANCE.getTransformationComponent(),
		};
	}
	
}
