/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gbind.mopp;

public class GbindFoldingInformationProvider {
	
	public org.eclipse.emf.ecore.EClass[] getFoldableClasses() {
		return new org.eclipse.emf.ecore.EClass[] {
			gbind.simpleocl.SimpleoclPackage.eINSTANCE.getOclFeatureDefinition(),
		};
	}
	
}
