
package atl.metamodel.OCL;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EReference;

public class TupleTypeAttributeImpl extends atl.metamodel.ATLModelBaseObject implements TupleTypeAttribute {
	
	public TupleTypeAttributeImpl(atl.metamodel.ATLModel manager, EObject object) {
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
	public atl.metamodel.OCL.TupleType getTupleType() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("tupleType");
		Object result = object.eGet(f);
		if ( result == null ) 
			return null;
		result = manager.wrap(result);
		return (atl.metamodel.OCL.TupleType) result;
	}
	
	@Override
	public void setTupleType(atl.metamodel.OCL.TupleType v) {
		EStructuralFeature f = object.eClass().getEStructuralFeature("tupleType");
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

	public Class<TupleTypeAttribute> getImplementedInterface() { return TupleTypeAttribute.class; }

	@Override
	public void visit(atl.metamodel.ATLModelVisitor visitor) {
		atl.metamodel.ATLModelVisitor.VisitedReferences v = visitor.preTupleTypeAttribute(this);
		if ( v == null ) {
			return;
		}
	
		atl.metamodel.ATLModelBaseObject pop = visitor.getCurrent();
		visitor.setCurrent(this);
		visitor.beforeTupleTypeAttribute(this);
			
		for(EReference r : v.getReferences(this)) {
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
					
		visitor.inTupleTypeAttribute(this);
		visitor.setCurrent(pop);
	}	


}
