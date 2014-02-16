
package atl.metamodel.ATL;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface Rule extends atl.metamodel.ATLModelBaseObjectInterface, atl.metamodel.ATL.ModuleElement, atl.metamodel.ATLModelVisitable {
	
	public java.lang.String getLocation();

	public void setLocation(java.lang.String v);
	public List<java.lang.String> getCommentsBefore();

	public void addCommentsBefore(java.lang.String v);
	public List<java.lang.String> getCommentsAfter();

	public void addCommentsAfter(java.lang.String v);
	public atl.metamodel.ATL.Module getModule();

	public void setModule(atl.metamodel.ATL.Module v);
	public atl.metamodel.ATL.OutPattern getOutPattern();

	public void setOutPattern(atl.metamodel.ATL.OutPattern v);
	public atl.metamodel.ATL.ActionBlock getActionBlock();

	public void setActionBlock(atl.metamodel.ATL.ActionBlock v);
	public List<atl.metamodel.ATL.RuleVariableDeclaration> getVariables();

	public void addVariables(atl.metamodel.ATL.RuleVariableDeclaration v);
	public java.lang.String getName();

	public void setName(java.lang.String v);

}
