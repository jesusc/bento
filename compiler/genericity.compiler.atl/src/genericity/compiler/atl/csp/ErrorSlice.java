package genericity.compiler.atl.csp;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import bento.analyser.footprint.IEffectiveMetamodelData;

import genericity.compiler.atl.analyser.Analyser;
import genericity.compiler.atl.analyser.TypingModel;
import genericity.typing.atl_types.Metaclass;

public class ErrorSlice implements IEffectiveMetamodelData {
	private HashSet<EClass> explicitTypes = new HashSet<EClass>();
	private HashSet<EStructuralFeature> explicitFeatures = new HashSet<EStructuralFeature>();

	private Analyser	analyser;
	private String	metamodelName;
	
	public ErrorSlice(Analyser analyser, String metamodelName) {
		this.analyser = analyser;
		this.metamodelName = metamodelName;
	}

	public void addExplicitMetaclass(Metaclass type) {
		if ( type.getModel().getName().equals(metamodelName) )
			explicitTypes.add(type.getKlass());
	}
	
	public TypingModel getTypingModel() {
		return analyser.getTyping();
	}

	public void addExplicitFeature(EStructuralFeature f ) {
		explicitFeatures.add(f);
	}

	@Override
	public Set<EClass> getClasses() {
		return Collections.unmodifiableSet(this.explicitTypes);
	}

	@Override
	public Set<EStructuralFeature> getFeatures() {
		return Collections.unmodifiableSet(this.explicitFeatures);
	}
}
