
package atl.metamodel.OCL;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class Operation {
	private EObject object;
	private atl.metamodel.ATLModel manager;
	
	public Operation(atl.metamodel.ATLModel manager, EObject o) {
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
	public atl.metamodel.OCL.OclFeatureDefinition getDefinition() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("definition");
		Object result = object.eGet(f);
		return (atl.metamodel.OCL.OclFeatureDefinition) result;
	}
	public java.lang.String getName() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("name");
		Object result = object.eGet(f);
		return (java.lang.String) result;
	}
	public List<atl.metamodel.OCL.Parameter> getParameters() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("parameters");
		Object result = object.eGet(f);
		return (List<atl.metamodel.OCL.Parameter>) result;
	}
	public atl.metamodel.OCL.OclType getReturnType() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("returnType");
		Object result = object.eGet(f);
		return (atl.metamodel.OCL.OclType) result;
	}
	public atl.metamodel.OCL.OclExpression getBody() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("body");
		Object result = object.eGet(f);
		return (atl.metamodel.OCL.OclExpression) result;
	}


	public EObject original() { return object; }
}
