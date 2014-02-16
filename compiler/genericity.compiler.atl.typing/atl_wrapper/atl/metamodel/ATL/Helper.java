
package atl.metamodel.ATL;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface Helper extends atl.metamodel.ATLModelBaseObjectInterface, atl.metamodel.ATL.ModuleElement, atl.metamodel.ATLModelVisitable {
	
	public java.lang.String getLocation();

	public void setLocation(java.lang.String v);
	public List<java.lang.String> getCommentsBefore();

	public void addCommentsBefore(java.lang.String v);
	public List<java.lang.String> getCommentsAfter();

	public void addCommentsAfter(java.lang.String v);
	public atl.metamodel.ATL.Module getModule();

	public void setModule(atl.metamodel.ATL.Module v);
	public atl.metamodel.ATL.Query getQuery();

	public void setQuery(atl.metamodel.ATL.Query v);
	public atl.metamodel.ATL.Library getLibrary();

	public void setLibrary(atl.metamodel.ATL.Library v);
	public atl.metamodel.OCL.OclFeatureDefinition getDefinition();

	public void setDefinition(atl.metamodel.OCL.OclFeatureDefinition v);

}
