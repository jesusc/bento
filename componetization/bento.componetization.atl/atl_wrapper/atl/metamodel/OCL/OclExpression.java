
package atl.metamodel.OCL;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface OclExpression extends atl.metamodel.ATLModelBaseObjectInterface, atl.metamodel.ATL.LocatedElement {
	
	public java.lang.String getLocation();
	public List<java.lang.String> getCommentsBefore();
	public List<java.lang.String> getCommentsAfter();
	public atl.metamodel.OCL.OclType getType();
	public atl.metamodel.OCL.IfExp getIfExp3();
	public atl.metamodel.OCL.PropertyCallExp getAppliedProperty();
	public atl.metamodel.OCL.CollectionExp getCollection();
	public atl.metamodel.OCL.LetExp getLetExp();
	public atl.metamodel.OCL.LoopExp getLoopExp();
	public atl.metamodel.OCL.OperationCallExp getParentOperation();
	public atl.metamodel.OCL.VariableDeclaration getInitializedVariable();
	public atl.metamodel.OCL.IfExp getIfExp2();
	public atl.metamodel.OCL.Operation getOwningOperation();
	public atl.metamodel.OCL.IfExp getIfExp1();
	public atl.metamodel.OCL.Attribute getOwningAttribute();

}
