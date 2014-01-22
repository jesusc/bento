
package atl.metamodel.OCL;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class MapElement {
	private EObject object;
	private atl.metamodel.ATLModel manager;
	
	public MapElement(atl.metamodel.ATLModel manager, EObject o) {
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
	public atl.metamodel.OCL.MapExp getMap() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("map");
		Object result = object.eGet(f);
		return (atl.metamodel.OCL.MapExp) result;
	}
	public atl.metamodel.OCL.OclExpression getKey() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("key");
		Object result = object.eGet(f);
		return (atl.metamodel.OCL.OclExpression) result;
	}
	public atl.metamodel.OCL.OclExpression getValue() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("value");
		Object result = object.eGet(f);
		return (atl.metamodel.OCL.OclExpression) result;
	}


	public EObject original() { return object; }
}
