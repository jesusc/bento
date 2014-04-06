package bento.analyser.footprint;

import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface IEffectiveMetamodelData {

	Set<EClass> getClasses(); 
	Set<EStructuralFeature> getFeatures();
	
}
