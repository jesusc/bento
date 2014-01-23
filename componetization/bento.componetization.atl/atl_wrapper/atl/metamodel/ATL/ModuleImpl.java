
package atl.metamodel.ATL;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class ModuleImpl extends atl.metamodel.ATLModelBaseObject implements Module {
	
	public ModuleImpl(atl.metamodel.ATLModel manager, EObject object) {
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
	public List<atl.metamodel.ATL.LibraryRef> getLibraries() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("libraries");
		Object result = object.eGet(f);
		return (List<atl.metamodel.ATL.LibraryRef>) result;
	}
	
	@Override
	public java.lang.String getName() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("name");
		Object result = object.eGet(f);
		return (java.lang.String) result;
	}
	
	@Override
	public Boolean getIsRefining() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("isRefining");
		Object result = object.eGet(f);
		return (Boolean) result;
	}
	
	@Override
	public List<atl.metamodel.OCL.OclModel> getInModels() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("inModels");
		Object result = object.eGet(f);
		return (List<atl.metamodel.OCL.OclModel>) result;
	}
	
	@Override
	public List<atl.metamodel.OCL.OclModel> getOutModels() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("outModels");
		Object result = object.eGet(f);
		return (List<atl.metamodel.OCL.OclModel>) result;
	}
	
	@Override
	public List<atl.metamodel.ATL.ModuleElement> getElements() {
		EStructuralFeature f = object.eClass().getEStructuralFeature("elements");
		Object result = object.eGet(f);
		return (List<atl.metamodel.ATL.ModuleElement>) result;
	}
	

	public Class<Module> getImplementedInterface() { return Module.class; }
}
