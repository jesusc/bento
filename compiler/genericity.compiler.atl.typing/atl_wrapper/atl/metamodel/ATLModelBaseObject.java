
package atl.metamodel;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;

public abstract class ATLModelBaseObject implements ATLModelBaseObjectInterface {
		
	protected EObject object;
	protected atl.metamodel.ATLModel manager;
	
	public  ATLModelBaseObject(atl.metamodel.ATLModel manager, EObject o) {
		this.manager = manager;
		this.object  = o;
	}
		
	public EObject original_() { return object; }
		
	public ATLModelBaseObject container_() {
		if ( object.eContainer() == null ) return null;
		return this.manager.findWrapper(object.eContainer());
	}
	
	public <T> T container(Class<T> casting) {
		return casting.cast(this.container_());
	}
	
	
	public void replaceBy(ATLModelBaseObjectInterface element) {
		EStructuralFeature f = object.eContainingFeature();
		EObject container    = object.eContainer();
		
		EcoreUtil.replace(container, f, object, element.original_());
	}
	
	public void delete() {
		EcoreUtil.delete(object);
	}
	
	public void deleteRecursive() {
		EcoreUtil.delete(object, true);
	}
	
	
}
