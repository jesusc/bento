
package atl.metamodel.ATL;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EReference;

public class ForStatImpl extends atl.metamodel.ATLModelBaseObject implements ForStat {
	
	public ForStatImpl(atl.metamodel.ATLModel manager, EObject object) {
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
	public atl.metamodel.OCL.Iterator getIterator() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("iterator");
		Object result = object.eGet(f);
		if ( result == null ) 
			return null;
		result = manager.wrap(result);
		return (atl.metamodel.OCL.Iterator) result;
	}
	
	@Override
	public void setIterator(atl.metamodel.OCL.Iterator v) {
		EStructuralFeature f = object.eClass().getEStructuralFeature("iterator");
		Object o = v;

		o = v.original_();
	
		if ( f.isMany() ) {
			((List<Object>) object.eGet(f)).add(o);
		} else {
			object.eSet(f, o);
		}
	}
	@Override
	public atl.metamodel.OCL.OclExpression getCollection() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("collection");
		Object result = object.eGet(f);
		if ( result == null ) 
			return null;
		result = manager.wrap(result);
		return (atl.metamodel.OCL.OclExpression) result;
	}
	
	@Override
	public void setCollection(atl.metamodel.OCL.OclExpression v) {
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
	public List<atl.metamodel.ATL.Statement> getStatements() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("statements");
		Object result = object.eGet(f);
		if ( result == null ) 
			return null;
		result = manager.wrap(result);
		return (List<atl.metamodel.ATL.Statement>) result;
	}
	
	@Override
	public void addStatements(atl.metamodel.ATL.Statement v) {
		EStructuralFeature f = object.eClass().getEStructuralFeature("statements");
		Object o = v;

		o = v.original_();
	
		if ( f.isMany() ) {
			((List<Object>) object.eGet(f)).add(o);
		} else {
			object.eSet(f, o);
		}
	}

	public Class<ForStat> getImplementedInterface() { return ForStat.class; }

	@Override
	public void visit(atl.metamodel.ATLModelVisitor visitor) {
		atl.metamodel.ATLModelVisitor.VisitedReferences v = visitor.preForStat(this);
		if ( v == null ) {
			return;
		}
	
		atl.metamodel.ATLModelBaseObject pop = visitor.getCurrent();
		visitor.setCurrent(this);
		visitor.beforeForStat(this);
			
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
					
		visitor.inForStat(this);
		visitor.setCurrent(pop);
	}	


}