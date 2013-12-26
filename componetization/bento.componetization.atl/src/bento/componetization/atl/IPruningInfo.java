package bento.componetization.atl;

import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface IPruningInfo {

	public Set<EClass> getSelectedClasses();
	public Set<EStructuralFeature> getSelectedFeatures();
	
	public EClass             getTargetClass(EClass klass);
	public EStructuralFeature getTargetFeature(EStructuralFeature feature);
	
}
