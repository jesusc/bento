
package atl.metamodel.OCL;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class OrderedSetExpImpl extends atl.metamodel.ATLModelBaseObject implements OrderedSetExp {
	
	public OrderedSetExpImpl(atl.metamodel.ATLModel manager, EObject object) {
		super(manager, object);
	}
	
	@Override
	public java.lang.String getLocation() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("location");
		Object result = object.eGet(f);
		if ( result == null ) 
			return null;
		return (java.lang.String) result;
	}
	
	@Override
	public void setLocation(java.lang.String v) {
		EStructuralFeature f = object.eClass().getEStructuralFeature("location");
		Object o = v;

	
		if ( f.isMany() ) {
			((List<Object>) object.eGet(f)).add(o);
		} else {
			object.eSet(f, o);
		}
	}
	@Override
	public List<java.lang.String> getCommentsBefore() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("commentsBefore");
		Object result = object.eGet(f);
		if ( result == null ) 
			return null;
		return (List<java.lang.String>) result;
	}
	
	@Override
	public void addCommentsBefore(java.lang.String v) {
		EStructuralFeature f = object.eClass().getEStructuralFeature("commentsBefore");
		Object o = v;

	
		if ( f.isMany() ) {
			((List<Object>) object.eGet(f)).add(o);
		} else {
			object.eSet(f, o);
		}
	}
	@Override
	public List<java.lang.String> getCommentsAfter() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("commentsAfter");
		Object result = object.eGet(f);
		if ( result == null ) 
			return null;
		return (List<java.lang.String>) result;
	}
	
	@Override
	public void addCommentsAfter(java.lang.String v) {
		EStructuralFeature f = object.eClass().getEStructuralFeature("commentsAfter");
		Object o = v;

	
		if ( f.isMany() ) {
			((List<Object>) object.eGet(f)).add(o);
		} else {
			object.eSet(f, o);
		}
	}
	@Override
	public atl.metamodel.OCL.OclType getType() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("type");
		Object result = object.eGet(f);
		if ( result == null ) 
			return null;
		result = manager.wrap(result);
		return (atl.metamodel.OCL.OclType) result;
	}
	
	@Override
	public void setType(atl.metamodel.OCL.OclType v) {
		EStructuralFeature f = object.eClass().getEStructuralFeature("type");
		Object o = v;

		o = v.original_();
	
		if ( f.isMany() ) {
			((List<Object>) object.eGet(f)).add(o);
		} else {
			object.eSet(f, o);
		}
	}
	@Override
	public atl.metamodel.OCL.IfExp getIfExp3() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("ifExp3");
		Object result = object.eGet(f);
		if ( result == null ) 
			return null;
		result = manager.wrap(result);
		return (atl.metamodel.OCL.IfExp) result;
	}
	
	@Override
	public void setIfExp3(atl.metamodel.OCL.IfExp v) {
		EStructuralFeature f = object.eClass().getEStructuralFeature("ifExp3");
		Object o = v;

		o = v.original_();
	
		if ( f.isMany() ) {
			((List<Object>) object.eGet(f)).add(o);
		} else {
			object.eSet(f, o);
		}
	}
	@Override
	public atl.metamodel.OCL.PropertyCallExp getAppliedProperty() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("appliedProperty");
		Object result = object.eGet(f);
		if ( result == null ) 
			return null;
		result = manager.wrap(result);
		return (atl.metamodel.OCL.PropertyCallExp) result;
	}
	
	@Override
	public void setAppliedProperty(atl.metamodel.OCL.PropertyCallExp v) {
		EStructuralFeature f = object.eClass().getEStructuralFeature("appliedProperty");
		Object o = v;

		o = v.original_();
	
		if ( f.isMany() ) {
			((List<Object>) object.eGet(f)).add(o);
		} else {
			object.eSet(f, o);
		}
	}
	@Override
	public atl.metamodel.OCL.CollectionExp getCollection() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("collection");
		Object result = object.eGet(f);
		if ( result == null ) 
			return null;
		result = manager.wrap(result);
		return (atl.metamodel.OCL.CollectionExp) result;
	}
	
	@Override
	public void setCollection(atl.metamodel.OCL.CollectionExp v) {
		EStructuralFeature f = object.eClass().getEStructuralFeature("collection");
		Object o = v;

		o = v.original_();
	
		if ( f.isMany() ) {
			((List<Object>) object.eGet(f)).add(o);
		} else {
			object.eSet(f, o);
		}
	}
	@Override
	public atl.metamodel.OCL.LetExp getLetExp() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("letExp");
		Object result = object.eGet(f);
		if ( result == null ) 
			return null;
		result = manager.wrap(result);
		return (atl.metamodel.OCL.LetExp) result;
	}
	
	@Override
	public void setLetExp(atl.metamodel.OCL.LetExp v) {
		EStructuralFeature f = object.eClass().getEStructuralFeature("letExp");
		Object o = v;

		o = v.original_();
	
		if ( f.isMany() ) {
			((List<Object>) object.eGet(f)).add(o);
		} else {
			object.eSet(f, o);
		}
	}
	@Override
	public atl.metamodel.OCL.LoopExp getLoopExp() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("loopExp");
		Object result = object.eGet(f);
		if ( result == null ) 
			return null;
		result = manager.wrap(result);
		return (atl.metamodel.OCL.LoopExp) result;
	}
	
	@Override
	public void setLoopExp(atl.metamodel.OCL.LoopExp v) {
		EStructuralFeature f = object.eClass().getEStructuralFeature("loopExp");
		Object o = v;

		o = v.original_();
	
		if ( f.isMany() ) {
			((List<Object>) object.eGet(f)).add(o);
		} else {
			object.eSet(f, o);
		}
	}
	@Override
	public atl.metamodel.OCL.OperationCallExp getParentOperation() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("parentOperation");
		Object result = object.eGet(f);
		if ( result == null ) 
			return null;
		result = manager.wrap(result);
		return (atl.metamodel.OCL.OperationCallExp) result;
	}
	
	@Override
	public void setParentOperation(atl.metamodel.OCL.OperationCallExp v) {
		EStructuralFeature f = object.eClass().getEStructuralFeature("parentOperation");
		Object o = v;

		o = v.original_();
	
		if ( f.isMany() ) {
			((List<Object>) object.eGet(f)).add(o);
		} else {
			object.eSet(f, o);
		}
	}
	@Override
	public atl.metamodel.OCL.VariableDeclaration getInitializedVariable() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("initializedVariable");
		Object result = object.eGet(f);
		if ( result == null ) 
			return null;
		result = manager.wrap(result);
		return (atl.metamodel.OCL.VariableDeclaration) result;
	}
	
	@Override
	public void setInitializedVariable(atl.metamodel.OCL.VariableDeclaration v) {
		EStructuralFeature f = object.eClass().getEStructuralFeature("initializedVariable");
		Object o = v;

		o = v.original_();
	
		if ( f.isMany() ) {
			((List<Object>) object.eGet(f)).add(o);
		} else {
			object.eSet(f, o);
		}
	}
	@Override
	public atl.metamodel.OCL.IfExp getIfExp2() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("ifExp2");
		Object result = object.eGet(f);
		if ( result == null ) 
			return null;
		result = manager.wrap(result);
		return (atl.metamodel.OCL.IfExp) result;
	}
	
	@Override
	public void setIfExp2(atl.metamodel.OCL.IfExp v) {
		EStructuralFeature f = object.eClass().getEStructuralFeature("ifExp2");
		Object o = v;

		o = v.original_();
	
		if ( f.isMany() ) {
			((List<Object>) object.eGet(f)).add(o);
		} else {
			object.eSet(f, o);
		}
	}
	@Override
	public atl.metamodel.OCL.Operation getOwningOperation() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("owningOperation");
		Object result = object.eGet(f);
		if ( result == null ) 
			return null;
		result = manager.wrap(result);
		return (atl.metamodel.OCL.Operation) result;
	}
	
	@Override
	public void setOwningOperation(atl.metamodel.OCL.Operation v) {
		EStructuralFeature f = object.eClass().getEStructuralFeature("owningOperation");
		Object o = v;

		o = v.original_();
	
		if ( f.isMany() ) {
			((List<Object>) object.eGet(f)).add(o);
		} else {
			object.eSet(f, o);
		}
	}
	@Override
	public atl.metamodel.OCL.IfExp getIfExp1() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("ifExp1");
		Object result = object.eGet(f);
		if ( result == null ) 
			return null;
		result = manager.wrap(result);
		return (atl.metamodel.OCL.IfExp) result;
	}
	
	@Override
	public void setIfExp1(atl.metamodel.OCL.IfExp v) {
		EStructuralFeature f = object.eClass().getEStructuralFeature("ifExp1");
		Object o = v;

		o = v.original_();
	
		if ( f.isMany() ) {
			((List<Object>) object.eGet(f)).add(o);
		} else {
			object.eSet(f, o);
		}
	}
	@Override
	public atl.metamodel.OCL.Attribute getOwningAttribute() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("owningAttribute");
		Object result = object.eGet(f);
		if ( result == null ) 
			return null;
		result = manager.wrap(result);
		return (atl.metamodel.OCL.Attribute) result;
	}
	
	@Override
	public void setOwningAttribute(atl.metamodel.OCL.Attribute v) {
		EStructuralFeature f = object.eClass().getEStructuralFeature("owningAttribute");
		Object o = v;

		o = v.original_();
	
		if ( f.isMany() ) {
			((List<Object>) object.eGet(f)).add(o);
		} else {
			object.eSet(f, o);
		}
	}
	@Override
	public List<atl.metamodel.OCL.OclExpression> getElements() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("elements");
		Object result = object.eGet(f);
		if ( result == null ) 
			return null;
		result = manager.wrap(result);
		return (List<atl.metamodel.OCL.OclExpression>) result;
	}
	
	@Override
	public void addElements(atl.metamodel.OCL.OclExpression v) {
		EStructuralFeature f = object.eClass().getEStructuralFeature("elements");
		Object o = v;

		o = v.original_();
	
		if ( f.isMany() ) {
			((List<Object>) object.eGet(f)).add(o);
		} else {
			object.eSet(f, o);
		}
	}

	public Class<OrderedSetExp> getImplementedInterface() { return OrderedSetExp.class; }
}
