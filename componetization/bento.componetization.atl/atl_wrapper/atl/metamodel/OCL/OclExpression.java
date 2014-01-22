
package atl.metamodel.OCL;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class OclExpression {
	private EObject object;
	private atl.metamodel.ATLModel manager;
	
	public OclExpression(atl.metamodel.ATLModel manager, EObject o) {
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
	public atl.metamodel.OCL.OclType getType() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("type");
		Object result = object.eGet(f);
		return (atl.metamodel.OCL.OclType) result;
	}
	public atl.metamodel.OCL.IfExp getIfExp3() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("ifExp3");
		Object result = object.eGet(f);
		return (atl.metamodel.OCL.IfExp) result;
	}
	public atl.metamodel.OCL.PropertyCallExp getAppliedProperty() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("appliedProperty");
		Object result = object.eGet(f);
		return (atl.metamodel.OCL.PropertyCallExp) result;
	}
	public atl.metamodel.OCL.CollectionExp getCollection() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("collection");
		Object result = object.eGet(f);
		return (atl.metamodel.OCL.CollectionExp) result;
	}
	public atl.metamodel.OCL.LetExp getLetExp() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("letExp");
		Object result = object.eGet(f);
		return (atl.metamodel.OCL.LetExp) result;
	}
	public atl.metamodel.OCL.LoopExp getLoopExp() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("loopExp");
		Object result = object.eGet(f);
		return (atl.metamodel.OCL.LoopExp) result;
	}
	public atl.metamodel.OCL.OperationCallExp getParentOperation() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("parentOperation");
		Object result = object.eGet(f);
		return (atl.metamodel.OCL.OperationCallExp) result;
	}
	public atl.metamodel.OCL.VariableDeclaration getInitializedVariable() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("initializedVariable");
		Object result = object.eGet(f);
		return (atl.metamodel.OCL.VariableDeclaration) result;
	}
	public atl.metamodel.OCL.IfExp getIfExp2() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("ifExp2");
		Object result = object.eGet(f);
		return (atl.metamodel.OCL.IfExp) result;
	}
	public atl.metamodel.OCL.Operation getOwningOperation() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("owningOperation");
		Object result = object.eGet(f);
		return (atl.metamodel.OCL.Operation) result;
	}
	public atl.metamodel.OCL.IfExp getIfExp1() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("ifExp1");
		Object result = object.eGet(f);
		return (atl.metamodel.OCL.IfExp) result;
	}
	public atl.metamodel.OCL.Attribute getOwningAttribute() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("owningAttribute");
		Object result = object.eGet(f);
		return (atl.metamodel.OCL.Attribute) result;
	}


	public EObject original() { return object; }
}
