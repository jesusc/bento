
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
	public List<java.lang.String> getCommentsBefore() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("commentsBefore");
		Object result = object.eGet(f);
		return (List<java.lang.String>) result;
	}
	
	@Override
	public List<java.lang.String> getCommentsAfter() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("commentsAfter");
		Object result = object.eGet(f);
		return (List<java.lang.String>) result;
	}
	
	@Override
	public atl.metamodel.OCL.OclExpression getValue() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("value");
		Object result = object.eGet(f);
		return (atl.metamodel.OCL.OclExpression) result;
	}
	
	@Override
	public atl.metamodel.ATL.OutPatternElement getOutPatternElement() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("outPatternElement");
		Object result = object.eGet(f);
		return (atl.metamodel.ATL.OutPatternElement) result;
	}
	
	@Override
	public java.lang.String getPropertyName() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("propertyName");
		Object result = object.eGet(f);
		return (java.lang.String) result;
	}
	
	@Override
	public Boolean getIsAssignment() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("isAssignment");
		Object result = object.eGet(f);
		return (Boolean) result;
	}
	

	public Class<Binding> getImplementedInterface() { return Binding.class; }
}
