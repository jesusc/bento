
package atl.metamodel.ATL;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface Helper extends atl.metamodel.ATLModelBaseObjectInterface, atl.metamodel.ATL.ModuleElement {
	
	public java.lang.String getLocation();
	public List<java.lang.String> getCommentsBefore();
	public List<java.lang.String> getCommentsAfter();
	public atl.metamodel.ATL.Module getModule();
	public atl.metamodel.ATL.Query getQuery();
	public atl.metamodel.ATL.Library getLibrary();
	public atl.metamodel.OCL.OclFeatureDefinition getDefinition();

}
