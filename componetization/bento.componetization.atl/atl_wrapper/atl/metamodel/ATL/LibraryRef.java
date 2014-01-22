
package atl.metamodel.ATL;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class LibraryRef {
	private EObject object;
	private atl.metamodel.ATLModel manager;
	
	public LibraryRef(atl.metamodel.ATLModel manager, EObject o) {
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
	public atl.metamodel.ATL.Unit getUnit() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("unit");
		Object result = object.eGet(f);
		return (atl.metamodel.ATL.Unit) result;
	}
	public java.lang.String getName() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("name");
		Object result = object.eGet(f);
		return (java.lang.String) result;
	}


	public EObject original() { return object; }
}
