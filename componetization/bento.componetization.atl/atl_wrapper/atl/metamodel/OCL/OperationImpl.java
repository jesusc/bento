
package atl.metamodel.OCL;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class OperationImpl extends atl.metamodel.ATLModelBaseObject implements Operation {
	
	public OperationImpl(atl.metamodel.ATLModel manager, EObject object) {
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
	public atl.metamodel.OCL.OclFeatureDefinition getDefinition() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("definition");
		Object result = object.eGet(f);
		return (atl.metamodel.OCL.OclFeatureDefinition) result;
	}
	
	@Override
	public java.lang.String getName() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("name");
		Object result = object.eGet(f);
		return (java.lang.String) result;
	}
	
	@Override
	public List<atl.metamodel.OCL.Parameter> getParameters() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("parameters");
		Object result = object.eGet(f);
		return (List<atl.metamodel.OCL.Parameter>) result;
	}
	
	@Override
	public atl.metamodel.OCL.OclType getReturnType() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("returnType");
		Object result = object.eGet(f);
		return (atl.metamodel.OCL.OclType) result;
	}
	
	@Override
	public atl.metamodel.OCL.OclExpression getBody() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("body");
		Object result = object.eGet(f);
		return (atl.metamodel.OCL.OclExpression) result;
	}
	

	public Class<Operation> getImplementedInterface() { return Operation.class; }
}
