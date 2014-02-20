
package atl.metamodel;

import org.eclipse.emf.ecore.EObject;

public interface ATLModelBaseObjectInterface {
	public EObject original_();
	public ATLModelBaseObject container_();
	public <T> T container(Class<T> casting);
	

	public Class<?> getImplementedInterface();

	public void replaceBy(ATLModelBaseObjectInterface element);

}
