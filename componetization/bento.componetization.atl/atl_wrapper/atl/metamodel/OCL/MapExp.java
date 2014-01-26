
package atl.metamodel.OCL;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface MapExp extends atl.metamodel.ATLModelBaseObjectInterface, atl.metamodel.OCL.OclExpression {
	
	public java.lang.String getLocation();

	public void setLocation(java.lang.String v);
	public List<java.lang.String> getCommentsBefore();

	public void addCommentsBefore(List<java.lang.String> v);
	public List<java.lang.String> getCommentsAfter();

	public void addCommentsAfter(List<java.lang.String> v);
	public atl.metamodel.OCL.OclType getType();

	public void setType(atl.metamodel.OCL.OclType v);
	public atl.metamodel.OCL.IfExp getIfExp3();

	public void setIfExp3(atl.metamodel.OCL.IfExp v);
	public atl.metamodel.OCL.PropertyCallExp getAppliedProperty();

	public void setAppliedProperty(atl.metamodel.OCL.PropertyCallExp v);
	public atl.metamodel.OCL.CollectionExp getCollection();

	public void setCollection(atl.metamodel.OCL.CollectionExp v);
	public atl.metamodel.OCL.LetExp getLetExp();

	public void setLetExp(atl.metamodel.OCL.LetExp v);
	public atl.metamodel.OCL.LoopExp getLoopExp();

	public void setLoopExp(atl.metamodel.OCL.LoopExp v);
	public atl.metamodel.OCL.OperationCallExp getParentOperation();

	public void setParentOperation(atl.metamodel.OCL.OperationCallExp v);
	public atl.metamodel.OCL.VariableDeclaration getInitializedVariable();

	public void setInitializedVariable(atl.metamodel.OCL.VariableDeclaration v);
	public atl.metamodel.OCL.IfExp getIfExp2();

	public void setIfExp2(atl.metamodel.OCL.IfExp v);
	public atl.metamodel.OCL.Operation getOwningOperation();

	public void setOwningOperation(atl.metamodel.OCL.Operation v);
	public atl.metamodel.OCL.IfExp getIfExp1();

	public void setIfExp1(atl.metamodel.OCL.IfExp v);
	public atl.metamodel.OCL.Attribute getOwningAttribute();

	public void setOwningAttribute(atl.metamodel.OCL.Attribute v);
	public List<atl.metamodel.OCL.MapElement> getElements();

	public void addElements(List<atl.metamodel.OCL.MapElement> v);

}
