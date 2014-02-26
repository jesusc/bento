
package atl.metamodel.OCL;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EReference;

public class OclModelImpl extends atl.metamodel.ATLModelBaseObject implements OclModel {
	
	public OclModelImpl(atl.metamodel.ATLModel manager, EObject object) {
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
	public atl.metamodel.OCL.OclModel getMetamodel() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("metamodel");
		Object result = object.eGet(f);
		if ( result == null ) 
			return null;
		result = manager.wrap(result);
		return (atl.metamodel.OCL.OclModel) result;
	}
	
	@Override
	public void setMetamodel(atl.metamodel.OCL.OclModel v) {
		EStructuralFeature f = object.eClass().getEStructuralFeature("metamodel");
		Object o = v;

		o = v.original_();
	
		if ( f.isMany() ) {
			((List<Object>) object.eGet(f)).add(o);
		} else {
			object.eSet(f, o);
		}
	}
	@Override
	public List<atl.metamodel.OCL.OclModelElement> getElements() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("elements");
		Object result = object.eGet(f);
		if ( result == null ) 
			return null;
		result = manager.wrap(result);
		return (List<atl.metamodel.OCL.OclModelElement>) result;
	}
	
	@Override
	public void addElements(atl.metamodel.OCL.OclModelElement v) {
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
	public List<atl.metamodel.OCL.OclModel> getModel() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("model");
		Object result = object.eGet(f);
		if ( result == null ) 
			return null;
		result = manager.wrap(result);
		return (List<atl.metamodel.OCL.OclModel>) result;
	}
	
	@Override
	public void addModel(atl.metamodel.OCL.OclModel v) {
		EStructuralFeature f = object.eClass().getEStructuralFeature("model");
		Object o = v;

		o = v.original_();
	
		if ( f.isMany() ) {
			((List<Object>) object.eGet(f)).add(o);
		} else {
			object.eSet(f, o);
		}
	}

	public Class<OclModel> getImplementedInterface() { return OclModel.class; }

	@Override
	public void visit(atl.metamodel.ATLModelVisitor visitor) {
		atl.metamodel.ATLModelVisitor.VisitingActions v = visitor.preOclModel(this);
		if ( v == null ) {
			return;
		}
	
		atl.metamodel.ATLModelBaseObject pop = visitor.getCurrent();
		visitor.setCurrent(this);
		visitor.beforeOclModel(this);
			
		for(atl.metamodel.ATLModelVisitor.VisitingAction va : v.getActions(this)) {
			if ( va.isMethodCall() ) {
				va.performMethodCall();		
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
					
		visitor.inOclModel(this);
		visitor.setCurrent(pop);
	}	


}
