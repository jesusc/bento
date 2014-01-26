
package atl.metamodel.ATL;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class BindingImpl extends atl.metamodel.ATLModelBaseObject implements Binding {
	
	public BindingImpl(atl.metamodel.ATLModel manager, EObject object) {
		super(manager, object);
	}
	
	@Override
	public java.lang.String getLocation() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("location");
		Object result = object.eGet(f);
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
		return (List<java.lang.String>) result;
	}
	
	@Override
	public void addCommentsBefore(List<java.lang.String> v) {
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
		return (List<java.lang.String>) result;
	}
	
	@Override
	public void addCommentsAfter(List<java.lang.String> v) {
		EStructuralFeature f = object.eClass().getEStructuralFeature("commentsAfter");
		Object o = v;
	
		if ( f.isMany() ) {
			((List<Object>) object.eGet(f)).add(o);
		} else {
			object.eSet(f, o);
		}
	}
	@Override
	public atl.metamodel.OCL.OclExpression getValue() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("value");
		Object result = object.eGet(f);
		result = manager.wrap(result);
		return (atl.metamodel.OCL.OclExpression) result;
	}
	
	@Override
	public void setValue(atl.metamodel.OCL.OclExpression v) {
		EStructuralFeature f = object.eClass().getEStructuralFeature("value");
		Object o = v;
	
		if ( f.isMany() ) {
			((List<Object>) object.eGet(f)).add(o);
		} else {
			object.eSet(f, o);
		}
	}
	@Override
	public atl.metamodel.ATL.OutPatternElement getOutPatternElement() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("outPatternElement");
		Object result = object.eGet(f);
		result = manager.wrap(result);
		return (atl.metamodel.ATL.OutPatternElement) result;
	}
	
	@Override
	public void setOutPatternElement(atl.metamodel.ATL.OutPatternElement v) {
		EStructuralFeature f = object.eClass().getEStructuralFeature("outPatternElement");
		Object o = v;
	
		if ( f.isMany() ) {
			((List<Object>) object.eGet(f)).add(o);
		} else {
			object.eSet(f, o);
		}
	}
	@Override
	public java.lang.String getPropertyName() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("propertyName");
		Object result = object.eGet(f);
		return (java.lang.String) result;
	}
	
	@Override
	public void setPropertyName(java.lang.String v) {
		EStructuralFeature f = object.eClass().getEStructuralFeature("propertyName");
		Object o = v;
	
		if ( f.isMany() ) {
			((List<Object>) object.eGet(f)).add(o);
		} else {
			object.eSet(f, o);
		}
	}
	@Override
	public Boolean getIsAssignment() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("isAssignment");
		Object result = object.eGet(f);
		return (Boolean) result;
	}
	
	@Override
	public void setIsAssignment(Boolean v) {
		EStructuralFeature f = object.eClass().getEStructuralFeature("isAssignment");
		Object o = v;
	
		if ( f.isMany() ) {
			((List<Object>) object.eGet(f)).add(o);
		} else {
			object.eSet(f, o);
		}
	}

	public Class<Binding> getImplementedInterface() { return Binding.class; }
}
