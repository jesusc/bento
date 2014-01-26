
package atl.metamodel.ATL;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface PatternElement extends atl.metamodel.ATLModelBaseObjectInterface, atl.metamodel.OCL.VariableDeclaration {
	
	public java.lang.String getLocation();

	public void setLocation(java.lang.String v);
	public List<java.lang.String> getCommentsBefore();

	public void addCommentsBefore(List<java.lang.String> v);
	public List<java.lang.String> getCommentsAfter();

	public void addCommentsAfter(List<java.lang.String> v);
	public java.lang.String getId();

	public void setId(java.lang.String v);
	public java.lang.String getVarName();

	public void setVarName(java.lang.String v);
	public atl.metamodel.OCL.OclType getType();

	public void setType(atl.metamodel.OCL.OclType v);
	public atl.metamodel.OCL.OclExpression getInitExpression();

	public void setInitExpression(atl.metamodel.OCL.OclExpression v);
	public atl.metamodel.OCL.LetExp getLetExp();

	public void setLetExp(atl.metamodel.OCL.LetExp v);
	public atl.metamodel.OCL.IterateExp getBaseExp();

	public void setBaseExp(atl.metamodel.OCL.IterateExp v);
	public List<atl.metamodel.OCL.VariableExp> getVariableExp();

	public void addVariableExp(List<atl.metamodel.OCL.VariableExp> v);

}
