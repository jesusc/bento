
package atl.metamodel.OCL;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface Operation extends atl.metamodel.ATLModelBaseObjectInterface, atl.metamodel.OCL.OclFeature {
	
	public java.lang.String getLocation();
	public List<java.lang.String> getCommentsBefore();
	public List<java.lang.String> getCommentsAfter();
	public atl.metamodel.OCL.OclFeatureDefinition getDefinition();
	public java.lang.String getName();
	public List<atl.metamodel.OCL.Parameter> getParameters();
	public atl.metamodel.OCL.OclType getReturnType();
	public atl.metamodel.OCL.OclExpression getBody();

}
