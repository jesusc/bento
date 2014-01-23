
package atl.metamodel.ATL;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class RuleImpl extends atl.metamodel.ATLModelBaseObject implements Rule {
	
	public RuleImpl(atl.metamodel.ATLModel manager, EObject object) {
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
	public atl.metamodel.ATL.Module getModule() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("module");
		Object result = object.eGet(f);
		return (atl.metamodel.ATL.Module) result;
	}
	
	@Override
	public atl.metamodel.ATL.OutPattern getOutPattern() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("outPattern");
		Object result = object.eGet(f);
		return (atl.metamodel.ATL.OutPattern) result;
	}
	
	@Override
	public atl.metamodel.ATL.ActionBlock getActionBlock() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("actionBlock");
		Object result = object.eGet(f);
		return (atl.metamodel.ATL.ActionBlock) result;
	}
	
	@Override
	public List<atl.metamodel.ATL.RuleVariableDeclaration> getVariables() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("variables");
		Object result = object.eGet(f);
		return (List<atl.metamodel.ATL.RuleVariableDeclaration>) result;
	}
	
	@Override
	public java.lang.String getName() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("name");
		Object result = object.eGet(f);
		return (java.lang.String) result;
	}
	

	public Class<Rule> getImplementedInterface() { return Rule.class; }
}
