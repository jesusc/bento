
package atl.metamodel.ATL;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class CalledRuleImpl extends atl.metamodel.ATLModelBaseObject implements CalledRule {
	
	public CalledRuleImpl(atl.metamodel.ATLModel manager, EObject object) {
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
	public atl.metamodel.ATL.Module getModule() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("module");
		Object result = object.eGet(f);
		result = manager.wrap(result);
		return (atl.metamodel.ATL.Module) result;
	}
	
	@Override
	public void setModule(atl.metamodel.ATL.Module v) {
		EStructuralFeature f = object.eClass().getEStructuralFeature("module");
		Object o = v;
	
		if ( f.isMany() ) {
			((List<Object>) object.eGet(f)).add(o);
		} else {
			object.eSet(f, o);
		}
	}
	@Override
	public atl.metamodel.ATL.OutPattern getOutPattern() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("outPattern");
		Object result = object.eGet(f);
		result = manager.wrap(result);
		return (atl.metamodel.ATL.OutPattern) result;
	}
	
	@Override
	public void setOutPattern(atl.metamodel.ATL.OutPattern v) {
		EStructuralFeature f = object.eClass().getEStructuralFeature("outPattern");
		Object o = v;
	
		if ( f.isMany() ) {
			((List<Object>) object.eGet(f)).add(o);
		} else {
			object.eSet(f, o);
		}
	}
	@Override
	public atl.metamodel.ATL.ActionBlock getActionBlock() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("actionBlock");
		Object result = object.eGet(f);
		result = manager.wrap(result);
		return (atl.metamodel.ATL.ActionBlock) result;
	}
	
	@Override
	public void setActionBlock(atl.metamodel.ATL.ActionBlock v) {
		EStructuralFeature f = object.eClass().getEStructuralFeature("actionBlock");
		Object o = v;
	
		if ( f.isMany() ) {
			((List<Object>) object.eGet(f)).add(o);
		} else {
			object.eSet(f, o);
		}
	}
	@Override
	public List<atl.metamodel.ATL.RuleVariableDeclaration> getVariables() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("variables");
		Object result = object.eGet(f);
		result = manager.wrap(result);
		return (List<atl.metamodel.ATL.RuleVariableDeclaration>) result;
	}
	
	@Override
	public void addVariables(List<atl.metamodel.ATL.RuleVariableDeclaration> v) {
		EStructuralFeature f = object.eClass().getEStructuralFeature("variables");
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
	public List<atl.metamodel.OCL.Parameter> getParameters() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("parameters");
		Object result = object.eGet(f);
		result = manager.wrap(result);
		return (List<atl.metamodel.OCL.Parameter>) result;
	}
	
	@Override
	public void addParameters(List<atl.metamodel.OCL.Parameter> v) {
		EStructuralFeature f = object.eClass().getEStructuralFeature("parameters");
		Object o = v;
	
		if ( f.isMany() ) {
			((List<Object>) object.eGet(f)).add(o);
		} else {
			object.eSet(f, o);
		}
	}
	@Override
	public Boolean getIsEntrypoint() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("isEntrypoint");
		Object result = object.eGet(f);
		return (Boolean) result;
	}
	
	@Override
	public void setIsEntrypoint(Boolean v) {
		EStructuralFeature f = object.eClass().getEStructuralFeature("isEntrypoint");
		Object o = v;
	
		if ( f.isMany() ) {
			((List<Object>) object.eGet(f)).add(o);
		} else {
			object.eSet(f, o);
		}
	}
	@Override
	public Boolean getIsEndpoint() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("isEndpoint");
		Object result = object.eGet(f);
		return (Boolean) result;
	}
	
	@Override
	public void setIsEndpoint(Boolean v) {
		EStructuralFeature f = object.eClass().getEStructuralFeature("isEndpoint");
		Object o = v;
	
		if ( f.isMany() ) {
			((List<Object>) object.eGet(f)).add(o);
		} else {
			object.eSet(f, o);
		}
	}

	public Class<CalledRule> getImplementedInterface() { return CalledRule.class; }
}
