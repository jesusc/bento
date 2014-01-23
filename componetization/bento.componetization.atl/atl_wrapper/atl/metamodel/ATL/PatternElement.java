
package atl.metamodel.ATL;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface PatternElement extends atl.metamodel.ATLModelBaseObjectInterface, atl.metamodel.OCL.VariableDeclaration {
	
	public java.lang.String getLocation();
	public List<java.lang.String> getCommentsBefore();
	public List<java.lang.String> getCommentsAfter();
	public java.lang.String getId();
	public java.lang.String getVarName();
	public atl.metamodel.OCL.OclType getType();
	public atl.metamodel.OCL.OclExpression getInitExpression();
	public atl.metamodel.OCL.LetExp getLetExp();
	public atl.metamodel.OCL.IterateExp getBaseExp();
	public List<atl.metamodel.OCL.VariableExp> getVariableExp();

}
