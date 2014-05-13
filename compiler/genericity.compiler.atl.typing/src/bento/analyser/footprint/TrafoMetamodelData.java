package bento.analyser.footprint;

import genericity.compiler.atl.analyser.namespaces.MetamodelNamespace;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclectic.modeling.emf.BasicEMFModel;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import atl.metamodel.ATLModel;

public class TrafoMetamodelData extends FootprintComputation implements IEffectiveMetamodelData {

	public TrafoMetamodelData(ATLModel atlModel, MetamodelNamespace mm, BasicEMFModel typing, String slicedURI) {
		super(atlModel, mm, typing, slicedURI);
		computeFootprint();
	}

	@Override
	public Set<EClass> getClasses() {
		HashSet<EClass> result = new HashSet<EClass>();
		result.addAll(directUsedTypes);
		result.addAll(indirectUsedTypes);
		return result;
	}

	@Override
	public Set<EStructuralFeature> getFeatures() {
		HashSet<EStructuralFeature> result = new HashSet<EStructuralFeature>();
		result.addAll(this.usedAttributes);
		result.addAll(this.usedReferences);
		return result;
	}

	@Override
	public Collection<EAnnotation> getPackageAnnotations() {
		return new ArrayList<EAnnotation>();
	}

}