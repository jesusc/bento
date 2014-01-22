
package atl.metamodel.ATL;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class Binding {
	private EObject object;
	private atl.metamodel.ATLModel manager;
	
	public Binding(atl.metamodel.ATLModel manager, EObject o) {
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
	public atl.metamodel.OCL.OclExpression getValue() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("value");
		Object result = object.eGet(f);
		return (atl.metamodel.OCL.OclExpression) result;
	}
	public atl.metamodel.ATL.OutPatternElement getOutPatternElement() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("outPatternElement");
		Object result = object.eGet(f);
		return (atl.metamodel.ATL.OutPatternElement) result;
	}
	public java.lang.String getPropertyName() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("propertyName");
		Object result = object.eGet(f);
		return (java.lang.String) result;
	}
	public Boolean getIsAssignment() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("isAssignment");
		Object result = object.eGet(f);
		return (Boolean) result;
	}


	public EObject original() { return object; }
}
