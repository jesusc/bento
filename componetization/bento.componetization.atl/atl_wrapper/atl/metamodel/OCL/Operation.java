
package atl.metamodel.OCL;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface Operation extends atl.metamodel.ATLModelBaseObjectInterface, atl.metamodel.OCL.OclFeature {
	
	public java.lang.String getLocation();

	public void setLocation(java.lang.String v);
	public List<java.lang.String> getCommentsBefore();

	public void addCommentsBefore(java.lang.String v);
	public List<java.lang.String> getCommentsAfter();

	public void addCommentsAfter(java.lang.String v);
	public atl.metamodel.OCL.OclFeatureDefinition getDefinition();

	public void setDefinition(atl.metamodel.OCL.OclFeatureDefinition v);
	public java.lang.String getName();

	public void setName(java.lang.String v);
	public List<atl.metamodel.OCL.Parameter> getParameters();

	public void addParameters(atl.metamodel.OCL.Parameter v);
	public atl.metamodel.OCL.OclType getReturnType();

	public void setReturnType(atl.metamodel.OCL.OclType v);
	public atl.metamodel.OCL.OclExpression getBody();

	public void setBody(atl.metamodel.OCL.OclExpression v);

}
