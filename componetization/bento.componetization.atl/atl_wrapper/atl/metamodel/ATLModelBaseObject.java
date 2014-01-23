
package atl.metamodel;

import org.eclipse.emf.ecore.EObject;

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
	
	public interface Interface {
		public EObject original_();
		public ATLModelBaseObject container_();
	}
}
