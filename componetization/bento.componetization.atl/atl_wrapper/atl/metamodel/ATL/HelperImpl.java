
package atl.metamodel.ATL;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class HelperImpl extends atl.metamodel.ATLModelBaseObject implements Helper {
	
	public HelperImpl(atl.metamodel.ATLModel manager, EObject object) {
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
	public atl.metamodel.ATL.Query getQuery() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("query");
		Object result = object.eGet(f);
		return (atl.metamodel.ATL.Query) result;
	}
	
	@Override
	public atl.metamodel.ATL.Library getLibrary() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("library");
		Object result = object.eGet(f);
		return (atl.metamodel.ATL.Library) result;
	}
	
	@Override
	public atl.metamodel.OCL.OclFeatureDefinition getDefinition() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("definition");
		Object result = object.eGet(f);
		return (atl.metamodel.OCL.OclFeatureDefinition) result;
	}
	

	public Class<Helper> getImplementedInterface() { return Helper.class; }
}
