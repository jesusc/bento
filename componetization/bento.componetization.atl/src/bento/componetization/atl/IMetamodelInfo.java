package bento.componetization.atl;

import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface IMetamodelInfo {

	public Set<EClass> getClasses();
	public Set<EStructuralFeature> getFeatures();
	
}
