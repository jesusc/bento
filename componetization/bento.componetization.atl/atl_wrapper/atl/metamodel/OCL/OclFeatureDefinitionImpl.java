
package atl.metamodel.OCL;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class OclFeatureDefinitionImpl extends atl.metamodel.ATLModelBaseObject implements OclFeatureDefinition {
	
	public OclFeatureDefinitionImpl(atl.metamodel.ATLModel manager, EObject object) {
		super(manager, object);
	}
	
	@Override
	public java.lang.String getLocation() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("location");
		Object result = object.eGet(f);
		return (java.lang.String) result;
	}
	
	@Override
	public List<java.lang.String> getCommentsBefore() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("commentsBefore");
		Object result = object.eGet(f);
		return (List<java.lang.String>) result;
	}
	
	@Override
	public List<java.lang.String> getCommentsAfter() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("commentsAfter");
		Object result = object.eGet(f);
		return (List<java.lang.String>) result;
	}
	
	@Override
	public atl.metamodel.OCL.OclFeature getFeature() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("feature");
		Object result = object.eGet(f);
		return (atl.metamodel.OCL.OclFeature) result;
	}
	
	@Override
	public atl.metamodel.OCL.OclContextDefinition getContext_() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("context_");
		Object result = object.eGet(f);
		return (atl.metamodel.OCL.OclContextDefinition) result;
	}
	

	public Class<OclFeatureDefinition> getImplementedInterface() { return OclFeatureDefinition.class; }
}
