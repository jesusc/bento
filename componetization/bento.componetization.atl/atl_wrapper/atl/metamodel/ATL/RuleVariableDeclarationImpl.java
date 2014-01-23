
package atl.metamodel.ATL;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class RuleVariableDeclarationImpl extends atl.metamodel.ATLModelBaseObject implements RuleVariableDeclaration {
	
	public RuleVariableDeclarationImpl(atl.metamodel.ATLModel manager, EObject object) {
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
	public java.lang.String getId() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("id");
		Object result = object.eGet(f);
		return (java.lang.String) result;
	}
	
	@Override
	public java.lang.String getVarName() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("varName");
		Object result = object.eGet(f);
		return (java.lang.String) result;
	}
	
	@Override
	public atl.metamodel.OCL.OclType getType() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("type");
		Object result = object.eGet(f);
		return (atl.metamodel.OCL.OclType) result;
	}
	
	@Override
	public atl.metamodel.OCL.OclExpression getInitExpression() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("initExpression");
		Object result = object.eGet(f);
		return (atl.metamodel.OCL.OclExpression) result;
	}
	
	@Override
	public atl.metamodel.OCL.LetExp getLetExp() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("letExp");
		Object result = object.eGet(f);
		return (atl.metamodel.OCL.LetExp) result;
	}
	
	@Override
	public atl.metamodel.OCL.IterateExp getBaseExp() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("baseExp");
		Object result = object.eGet(f);
		return (atl.metamodel.OCL.IterateExp) result;
	}
	
	@Override
	public List<atl.metamodel.OCL.VariableExp> getVariableExp() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("variableExp");
		Object result = object.eGet(f);
		return (List<atl.metamodel.OCL.VariableExp>) result;
	}
	
	@Override
	public atl.metamodel.ATL.Rule getRule() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("rule");
		Object result = object.eGet(f);
		return (atl.metamodel.ATL.Rule) result;
	}
	

	public Class<RuleVariableDeclaration> getImplementedInterface() { return RuleVariableDeclaration.class; }
}
