
package atl.metamodel.OCL;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class OclFeatureDefinition {
	private EObject object;
	private atl.metamodel.ATLModel manager;
	
	public OclFeatureDefinition(atl.metamodel.ATLModel manager, EObject o) {
		this.manager = manager;
		this.object  = o;
	}
	
	public java.lang.String getLocation() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("location");
		Object result = object.eGet(f);
		return (java.lang.String) result;
	}
	public List<java.lang.String> getCommentsBefore() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("commentsBefore");
		Object result = object.eGet(f);
		return (List<java.lang.String>) result;
	}
	public List<java.lang.String> getCommentsAfter() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("commentsAfter");
		Object result = object.eGet(f);
		return (List<java.lang.String>) result;
	}
	public atl.metamodel.OCL.OclFeature getFeature() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("feature");
		Object result = object.eGet(f);
		return (atl.metamodel.OCL.OclFeature) result;
	}
	public atl.metamodel.OCL.OclContextDefinition getContext_() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("context_");
		Object result = object.eGet(f);
		return (atl.metamodel.OCL.OclContextDefinition) result;
	}


	public EObject original() { return object; }
}
