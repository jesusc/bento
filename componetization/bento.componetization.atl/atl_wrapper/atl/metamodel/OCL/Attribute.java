
package atl.metamodel.OCL;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class Attribute {
	private EObject object;
	private atl.metamodel.ATLModel manager;
	
	public Attribute(atl.metamodel.ATLModel manager, EObject o) {
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
	public atl.metamodel.OCL.OclExpression getInitExpression() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("initExpression");
		Object result = object.eGet(f);
		return (atl.metamodel.OCL.OclExpression) result;
	}
	public atl.metamodel.OCL.OclType getType() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("type");
		Object result = object.eGet(f);
		return (atl.metamodel.OCL.OclType) result;
	}


	public EObject original() { return object; }
}
