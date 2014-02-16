
package atl.metamodel.ATL;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface Binding extends atl.metamodel.ATLModelBaseObjectInterface, atl.metamodel.ATL.LocatedElement, atl.metamodel.ATLModelVisitable {
	
	public java.lang.String getLocation();

	public void setLocation(java.lang.String v);
	public List<java.lang.String> getCommentsBefore();

	public void addCommentsBefore(java.lang.String v);
	public List<java.lang.String> getCommentsAfter();

	public void addCommentsAfter(java.lang.String v);
	public atl.metamodel.OCL.OclExpression getValue();

	public void setValue(atl.metamodel.OCL.OclExpression v);
	public atl.metamodel.ATL.OutPatternElement getOutPatternElement();

	public void setOutPatternElement(atl.metamodel.ATL.OutPatternElement v);
	public java.lang.String getPropertyName();

	public void setPropertyName(java.lang.String v);
	public Boolean getIsAssignment();

	public void setIsAssignment(Boolean v);

}
