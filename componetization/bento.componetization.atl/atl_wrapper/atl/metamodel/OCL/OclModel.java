
package atl.metamodel.OCL;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class OclModel {
	private EObject object;
	private atl.metamodel.ATLModel manager;
	
	public OclModel(atl.metamodel.ATLModel manager, EObject o) {
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
	public java.lang.String getName() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("name");
		Object result = object.eGet(f);
		return (java.lang.String) result;
	}
	public atl.metamodel.OCL.OclModel getMetamodel() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("metamodel");
		Object result = object.eGet(f);
		return (atl.metamodel.OCL.OclModel) result;
	}
	public List<atl.metamodel.OCL.OclModelElement> getElements() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("elements");
		Object result = object.eGet(f);
		return (List<atl.metamodel.OCL.OclModelElement>) result;
	}
	public List<atl.metamodel.OCL.OclModel> getModel() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("model");
		Object result = object.eGet(f);
		return (List<atl.metamodel.OCL.OclModel>) result;
	}


	public EObject original() { return object; }
}
