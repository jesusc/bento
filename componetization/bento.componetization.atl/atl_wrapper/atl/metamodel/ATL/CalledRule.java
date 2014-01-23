
package atl.metamodel.ATL;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface CalledRule extends atl.metamodel.ATLModelBaseObjectInterface, atl.metamodel.ATL.Rule {
	
	public java.lang.String getLocation();
	public List<java.lang.String> getCommentsBefore();
	public List<java.lang.String> getCommentsAfter();
	public atl.metamodel.ATL.Module getModule();
	public atl.metamodel.ATL.OutPattern getOutPattern();
	public atl.metamodel.ATL.ActionBlock getActionBlock();
	public List<atl.metamodel.ATL.RuleVariableDeclaration> getVariables();
	public java.lang.String getName();
	public List<atl.metamodel.OCL.Parameter> getParameters();
	public Boolean getIsEntrypoint();
	public Boolean getIsEndpoint();

}
