
package atl.metamodel.OCL;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EReference;

public class BagTypeImpl extends atl.metamodel.ATLModelBaseObject implements BagType {
	
	public BagTypeImpl(atl.metamodel.ATLModel manager, EObject object) {
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
	public java.lang.String getName() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("name");
		Object result = object.eGet(f);
		if ( result == null ) 
			return null;
		return (java.lang.String) result;
	}
	
	@Override
	public void setName(java.lang.String v) {
		EStructuralFeature f = object.eClass().getEStructuralFeature("name");
		Object o = v;

	
		if ( f.isMany() ) {
			((List<Object>) object.eGet(f)).add(o);
		} else {
			object.eSet(f, o);
		}
	}
	@Override
	public atl.metamodel.OCL.OclContextDefinition getDefinitions() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("definitions");
		Object result = object.eGet(f);
		if ( result == null ) 
			return null;
		result = manager.wrap(result);
		return (atl.metamodel.OCL.OclContextDefinition) result;
	}
	
	@Override
	public void setDefinitions(atl.metamodel.OCL.OclContextDefinition v) {
		EStructuralFeature f = object.eClass().getEStructuralFeature("definitions");
		Object o = v;

		o = v.original_();
	
		if ( f.isMany() ) {
			((List<Object>) object.eGet(f)).add(o);
		} else {
			object.eSet(f, o);
		}
	}
	@Override
	public atl.metamodel.OCL.OclExpression getOclExpression() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("oclExpression");
		Object result = object.eGet(f);
		if ( result == null ) 
			return null;
		result = manager.wrap(result);
		return (atl.metamodel.OCL.OclExpression) result;
	}
	
	@Override
	public void setOclExpression(atl.metamodel.OCL.OclExpression v) {
		EStructuralFeature f = object.eClass().getEStructuralFeature("oclExpression");
		Object o = v;

		o = v.original_();
	
		if ( f.isMany() ) {
			((List<Object>) object.eGet(f)).add(o);
		} else {
			object.eSet(f, o);
		}
	}
	@Override
	public atl.metamodel.OCL.Operation getOperation() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("operation");
		Object result = object.eGet(f);
		if ( result == null ) 
			return null;
		result = manager.wrap(result);
		return (atl.metamodel.OCL.Operation) result;
	}
	
	@Override
	public void setOperation(atl.metamodel.OCL.Operation v) {
		EStructuralFeature f = object.eClass().getEStructuralFeature("operation");
		Object o = v;

		o = v.original_();
	
		if ( f.isMany() ) {
			((List<Object>) object.eGet(f)).add(o);
		} else {
			object.eSet(f, o);
		}
	}
	@Override
	public atl.metamodel.OCL.MapType getMapType2() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("mapType2");
		Object result = object.eGet(f);
		if ( result == null ) 
			return null;
		result = manager.wrap(result);
		return (atl.metamodel.OCL.MapType) result;
	}
	
	@Override
	public void setMapType2(atl.metamodel.OCL.MapType v) {
		EStructuralFeature f = object.eClass().getEStructuralFeature("mapType2");
		Object o = v;

		o = v.original_();
	
		if ( f.isMany() ) {
			((List<Object>) object.eGet(f)).add(o);
		} else {
			object.eSet(f, o);
		}
	}
	@Override
	public atl.metamodel.OCL.Attribute getAttribute() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("attribute");
		Object result = object.eGet(f);
		if ( result == null ) 
			return null;
		result = manager.wrap(result);
		return (atl.metamodel.OCL.Attribute) result;
	}
	
	@Override
	public void setAttribute(atl.metamodel.OCL.Attribute v) {
		EStructuralFeature f = object.eClass().getEStructuralFeature("attribute");
		Object o = v;

		o = v.original_();
	
		if ( f.isMany() ) {
			((List<Object>) object.eGet(f)).add(o);
		} else {
			object.eSet(f, o);
		}
	}
	@Override
	public atl.metamodel.OCL.MapType getMapType() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("mapType");
		Object result = object.eGet(f);
		if ( result == null ) 
			return null;
		result = manager.wrap(result);
		return (atl.metamodel.OCL.MapType) result;
	}
	
	@Override
	public void setMapType(atl.metamodel.OCL.MapType v) {
		EStructuralFeature f = object.eClass().getEStructuralFeature("mapType");
		Object o = v;

		o = v.original_();
	
		if ( f.isMany() ) {
			((List<Object>) object.eGet(f)).add(o);
		} else {
			object.eSet(f, o);
		}
	}
	@Override
	public atl.metamodel.OCL.CollectionType getCollectionTypes() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("collectionTypes");
		Object result = object.eGet(f);
		if ( result == null ) 
			return null;
		result = manager.wrap(result);
		return (atl.metamodel.OCL.CollectionType) result;
	}
	
	@Override
	public void setCollectionTypes(atl.metamodel.OCL.CollectionType v) {
		EStructuralFeature f = object.eClass().getEStructuralFeature("collectionTypes");
		Object o = v;

		o = v.original_();
	
		if ( f.isMany() ) {
			((List<Object>) object.eGet(f)).add(o);
		} else {
			object.eSet(f, o);
		}
	}
	@Override
	public atl.metamodel.OCL.TupleTypeAttribute getTupleTypeAttribute() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("tupleTypeAttribute");
		Object result = object.eGet(f);
		if ( result == null ) 
			return null;
		result = manager.wrap(result);
		return (atl.metamodel.OCL.TupleTypeAttribute) result;
	}
	
	@Override
	public void setTupleTypeAttribute(atl.metamodel.OCL.TupleTypeAttribute v) {
		EStructuralFeature f = object.eClass().getEStructuralFeature("tupleTypeAttribute");
		Object o = v;

		o = v.original_();
	
		if ( f.isMany() ) {
			((List<Object>) object.eGet(f)).add(o);
		} else {
			object.eSet(f, o);
		}
	}
	@Override
	public atl.metamodel.OCL.VariableDeclaration getVariableDeclaration() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("variableDeclaration");
		Object result = object.eGet(f);
		if ( result == null ) 
			return null;
		result = manager.wrap(result);
		return (atl.metamodel.OCL.VariableDeclaration) result;
	}
	
	@Override
	public void setVariableDeclaration(atl.metamodel.OCL.VariableDeclaration v) {
		EStructuralFeature f = object.eClass().getEStructuralFeature("variableDeclaration");
		Object o = v;

		o = v.original_();
	
		if ( f.isMany() ) {
			((List<Object>) object.eGet(f)).add(o);
		} else {
			object.eSet(f, o);
		}
	}
	@Override
	public atl.metamodel.OCL.OclType getElementType() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("elementType");
		Object result = object.eGet(f);
		if ( result == null ) 
			return null;
		result = manager.wrap(result);
		return (atl.metamodel.OCL.OclType) result;
	}
	
	@Override
	public void setElementType(atl.metamodel.OCL.OclType v) {
		EStructuralFeature f = object.eClass().getEStructuralFeature("elementType");
		Object o = v;

		o = v.original_();
	
		if ( f.isMany() ) {
			((List<Object>) object.eGet(f)).add(o);
		} else {
			object.eSet(f, o);
		}
	}

	public Class<BagType> getImplementedInterface() { return BagType.class; }

	@Override
	public void visit(atl.metamodel.ATLModelVisitor visitor) {
		atl.metamodel.ATLModelVisitor.VisitingActions v = visitor.preBagType(this);
		if ( v == null ) {
			return;
		}
	
		atl.metamodel.ATLModelBaseObject pop = visitor.getCurrent();
		visitor.setCurrent(this);
		visitor.beforeBagType(this);
			
		for(atl.metamodel.ATLModelVisitor.VisitingAction va : v.getActions(this)) {
			if ( va.isMethodCall() ) {
				va.performMethodCall();		
			} else if ( va.isFilter() ) {
				Object res = va.performMethodCall();
				if ( res instanceof java.util.Collection ) {
					for(Object o : (java.util.Collection<?>) res) {
						((atl.metamodel.ATLModelVisitable) o).visit(visitor);
					}
				} else {
					((atl.metamodel.ATLModelVisitable) res).visit(visitor);
				}
			} else if ( va.isReference() ) {
				EReference r = va.getEReference();
				
				Object refObj   = object.eGet(r);
				if ( refObj == null ) continue;
				Object res = manager.wrap(refObj);
				if ( res instanceof java.util.Collection ) {
					for(Object o : (java.util.Collection<?>) res) {
						((atl.metamodel.ATLModelVisitable) o).visit(visitor);
					}
				} else {
					((atl.metamodel.ATLModelVisitable) res).visit(visitor);
				}
			}
		}
					
		visitor.inBagType(this);
		visitor.setCurrent(pop);
	}	


}
