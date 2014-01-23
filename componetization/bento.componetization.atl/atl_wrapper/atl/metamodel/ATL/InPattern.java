
package atl.metamodel.ATL;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface InPattern extends atl.metamodel.ATLModelBaseObjectInterface, atl.metamodel.ATL.LocatedElement {
	
	public java.lang.String getLocation();
	public List<java.lang.String> getCommentsBefore();
	public List<java.lang.String> getCommentsAfter();
	public List<atl.metamodel.ATL.InPatternElement> getElements();
	public atl.metamodel.ATL.MatchedRule getRule();
	public atl.metamodel.OCL.OclExpression getFilter();

}
