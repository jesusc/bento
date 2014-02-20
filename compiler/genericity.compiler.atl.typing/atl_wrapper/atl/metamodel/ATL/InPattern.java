
package atl.metamodel.ATL;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface InPattern extends atl.metamodel.ATLModelBaseObjectInterface, atl.metamodel.ATL.LocatedElement, atl.metamodel.ATLModelVisitable {
	
	public java.lang.String getLocation();

	public void setLocation(java.lang.String v);
	public List<java.lang.String> getCommentsBefore();

	public void addCommentsBefore(java.lang.String v);
	public List<java.lang.String> getCommentsAfter();

	public void addCommentsAfter(java.lang.String v);
	public List<atl.metamodel.ATL.InPatternElement> getElements();

	public void addElements(atl.metamodel.ATL.InPatternElement v);
	public atl.metamodel.ATL.MatchedRule getRule();

	public void setRule(atl.metamodel.ATL.MatchedRule v);
	public atl.metamodel.OCL.OclExpression getFilter();

	public void setFilter(atl.metamodel.OCL.OclExpression v);

}