
package atl.metamodel.ATL;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class BindingStatImpl extends atl.metamodel.ATLModelBaseObject implements BindingStat {
	
	public BindingStatImpl(atl.metamodel.ATLModel manager, EObject object) {
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
	public atl.metamodel.OCL.OclExpression getSource() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("source");
		Object result = object.eGet(f);
		return (atl.metamodel.OCL.OclExpression) result;
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
	
	@Override
	public atl.metamodel.OCL.OclExpression getValue() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("value");
		Object result = object.eGet(f);
		return (atl.metamodel.OCL.OclExpression) result;
	}
	

	public Class<BindingStat> getImplementedInterface() { return BindingStat.class; }
}
