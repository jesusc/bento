
package atl.metamodel;

import org.eclipse.emf.ecore.EObject;

public interface ATLModelBaseObjectInterface {
	public EObject original_();
	public ATLModelBaseObject container_();

	public Class<?> getImplementedInterface();
}
