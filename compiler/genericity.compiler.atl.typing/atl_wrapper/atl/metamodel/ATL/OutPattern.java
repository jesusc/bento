
package atl.metamodel.ATL;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface OutPattern extends atl.metamodel.ATLModelBaseObjectInterface, atl.metamodel.ATL.LocatedElement, atl.metamodel.ATLModelVisitable {
	
	public java.lang.String getLocation();

	public void setLocation(java.lang.String v);
	public List<java.lang.String> getCommentsBefore();

	public void addCommentsBefore(java.lang.String v);
	public List<java.lang.String> getCommentsAfter();

	public void addCommentsAfter(java.lang.String v);
	public atl.metamodel.ATL.Rule getRule();

	public void setRule(atl.metamodel.ATL.Rule v);
	public List<atl.metamodel.ATL.OutPatternElement> getElements();

	public void addElements(atl.metamodel.ATL.OutPatternElement v);

}