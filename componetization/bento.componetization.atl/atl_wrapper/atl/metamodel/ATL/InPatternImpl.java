
package atl.metamodel.ATL;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class InPatternImpl extends atl.metamodel.ATLModelBaseObject implements InPattern {
	
	public InPatternImpl(atl.metamodel.ATLModel manager, EObject object) {
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
	public List<atl.metamodel.ATL.InPatternElement> getElements() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("elements");
		Object result = object.eGet(f);
		if ( result == null ) 
			return null;
		result = manager.wrap(result);
		return (List<atl.metamodel.ATL.InPatternElement>) result;
	}
	
	@Override
	public void addElements(atl.metamodel.ATL.InPatternElement v) {
		EStructuralFeature f = object.eClass().getEStructuralFeature("elements");
		Object o = v;

		o = v.original_();
	
		if ( f.isMany() ) {
			((List<Object>) object.eGet(f)).add(o);
		} else {
			object.eSet(f, o);
		}
	}
	@Override
	public atl.metamodel.ATL.MatchedRule getRule() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("rule");
		Object result = object.eGet(f);
		if ( result == null ) 
			return null;
		result = manager.wrap(result);
		return (atl.metamodel.ATL.MatchedRule) result;
	}
	
	@Override
	public void setRule(atl.metamodel.ATL.MatchedRule v) {
		EStructuralFeature f = object.eClass().getEStructuralFeature("rule");
		Object o = v;

		o = v.original_();
	
		if ( f.isMany() ) {
			((List<Object>) object.eGet(f)).add(o);
		} else {
			object.eSet(f, o);
		}
	}
	@Override
	public atl.metamodel.OCL.OclExpression getFilter() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("filter");
		Object result = object.eGet(f);
		if ( result == null ) 
			return null;
		result = manager.wrap(result);
		return (atl.metamodel.OCL.OclExpression) result;
	}
	
	@Override
	public void setFilter(atl.metamodel.OCL.OclExpression v) {
		EStructuralFeature f = object.eClass().getEStructuralFeature("filter");
		Object o = v;

		o = v.original_();
	
		if ( f.isMany() ) {
			((List<Object>) object.eGet(f)).add(o);
		} else {
			object.eSet(f, o);
		}
	}

	public Class<InPattern> getImplementedInterface() { return InPattern.class; }
}
