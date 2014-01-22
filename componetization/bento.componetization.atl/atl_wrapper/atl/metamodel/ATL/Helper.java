
package atl.metamodel.ATL;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class Helper {
	private EObject object;
	private atl.metamodel.ATLModel manager;
	
	public Helper(atl.metamodel.ATLModel manager, EObject o) {
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
	public atl.metamodel.ATL.Module getModule() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("module");
		Object result = object.eGet(f);
		return (atl.metamodel.ATL.Module) result;
	}
	public atl.metamodel.ATL.Query getQuery() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("query");
		Object result = object.eGet(f);
		return (atl.metamodel.ATL.Query) result;
	}
	public atl.metamodel.ATL.Library getLibrary() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("library");
		Object result = object.eGet(f);
		return (atl.metamodel.ATL.Library) result;
	}
	public atl.metamodel.OCL.OclFeatureDefinition getDefinition() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("definition");
		Object result = object.eGet(f);
		return (atl.metamodel.OCL.OclFeatureDefinition) result;
	}


	public EObject original() { return object; }
}
