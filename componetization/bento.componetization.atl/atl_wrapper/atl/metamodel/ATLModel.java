
package atl.metamodel;

import java.util.HashMap;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EClass;


public class ATLModel {
	private Resource resource;
	private HashMap<EObject, ATLModelBaseObject> wrappers = new HashMap<EObject, ATLModelBaseObject>();
	private HashMap<Class<?>, EClass> classes = new HashMap<Class<?>, EClass>();
		
	public ATLModel(Resource r) {
		this.resource = r;
	
		TreeIterator<EObject> contents = resource.getAllContents();
		while ( contents.hasNext() ) {
			EObject o = contents.next();
			
			ATLModelBaseObject wrapper = createWrapperObject(o);
			
			classes.put(wrapper.getClass(), o.eClass());
			classes.put(wrapper.getImplementedInterface(), o.eClass());
			
			wrappers.put(o, wrapper);
		}
	}


	public <T> java.util.List<? extends T> allObjectsOf(Class<T> clazz) {
		java.util.List<T> list = new java.util.ArrayList<T>();
		
		EClass eclass = classes.get(clazz);
		
		TreeIterator<EObject> contents = resource.getAllContents();
		while ( contents.hasNext() ) {
			EObject o = contents.next();
		
			if ( eclass.isInstance(o) ) {
				T x = clazz.cast(findWrapper(o));
				list.add( x );
			}	
		
		}
			
		return list;
	}

	public ATLModelBaseObject createWrapperObject(EObject o) {
		if ( o.eClass().getName().equals("OclExpression") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.OclExpressionImpl(this, o);
		if ( o.eClass().getName().equals("PropertyCallExp") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.PropertyCallExpImpl(this, o);
		if ( o.eClass().getName().equals("ExpressionStat") && o.eClass().getEPackage().getName().equals("ATL") )
			return new atl.metamodel.ATL.ExpressionStatImpl(this, o);
		if ( o.eClass().getName().equals("ForStat") && o.eClass().getEPackage().getName().equals("ATL") )
			return new atl.metamodel.ATL.ForStatImpl(this, o);
		if ( o.eClass().getName().equals("LoopExp") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.LoopExpImpl(this, o);
		if ( o.eClass().getName().equals("OrderedSetType") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.OrderedSetTypeImpl(this, o);
		if ( o.eClass().getName().equals("RealType") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.RealTypeImpl(this, o);
		if ( o.eClass().getName().equals("Iterator") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.IteratorImpl(this, o);
		if ( o.eClass().getName().equals("Primitive") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.PrimitiveImpl(this, o);
		if ( o.eClass().getName().equals("MapType") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.MapTypeImpl(this, o);
		if ( o.eClass().getName().equals("OclType") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.OclTypeImpl(this, o);
		if ( o.eClass().getName().equals("InPattern") && o.eClass().getEPackage().getName().equals("ATL") )
			return new atl.metamodel.ATL.InPatternImpl(this, o);
		if ( o.eClass().getName().equals("IteratorExp") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.IteratorExpImpl(this, o);
		if ( o.eClass().getName().equals("SimpleInPatternElement") && o.eClass().getEPackage().getName().equals("ATL") )
			return new atl.metamodel.ATL.SimpleInPatternElementImpl(this, o);
		if ( o.eClass().getName().equals("OperatorCallExp") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.OperatorCallExpImpl(this, o);
		if ( o.eClass().getName().equals("VariableExp") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.VariableExpImpl(this, o);
		if ( o.eClass().getName().equals("OrderedSetExp") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.OrderedSetExpImpl(this, o);
		if ( o.eClass().getName().equals("OclContextDefinition") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.OclContextDefinitionImpl(this, o);
		if ( o.eClass().getName().equals("VariableDeclaration") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.VariableDeclarationImpl(this, o);
		if ( o.eClass().getName().equals("OclFeature") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.OclFeatureImpl(this, o);
		if ( o.eClass().getName().equals("RuleVariableDeclaration") && o.eClass().getEPackage().getName().equals("ATL") )
			return new atl.metamodel.ATL.RuleVariableDeclarationImpl(this, o);
		if ( o.eClass().getName().equals("MapExp") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.MapExpImpl(this, o);
		if ( o.eClass().getName().equals("BindingStat") && o.eClass().getEPackage().getName().equals("ATL") )
			return new atl.metamodel.ATL.BindingStatImpl(this, o);
		if ( o.eClass().getName().equals("SuperExp") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.SuperExpImpl(this, o);
		if ( o.eClass().getName().equals("ForEachOutPatternElement") && o.eClass().getEPackage().getName().equals("ATL") )
			return new atl.metamodel.ATL.ForEachOutPatternElementImpl(this, o);
		if ( o.eClass().getName().equals("IntegerExp") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.IntegerExpImpl(this, o);
		if ( o.eClass().getName().equals("OclModel") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.OclModelImpl(this, o);
		if ( o.eClass().getName().equals("LocatedElement") && o.eClass().getEPackage().getName().equals("ATL") )
			return new atl.metamodel.ATL.LocatedElementImpl(this, o);
		if ( o.eClass().getName().equals("Operation") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.OperationImpl(this, o);
		if ( o.eClass().getName().equals("BagType") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.BagTypeImpl(this, o);
		if ( o.eClass().getName().equals("IntegerType") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.IntegerTypeImpl(this, o);
		if ( o.eClass().getName().equals("BooleanExp") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.BooleanExpImpl(this, o);
		if ( o.eClass().getName().equals("OclAnyType") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.OclAnyTypeImpl(this, o);
		if ( o.eClass().getName().equals("IfExp") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.IfExpImpl(this, o);
		if ( o.eClass().getName().equals("CollectionType") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.CollectionTypeImpl(this, o);
		if ( o.eClass().getName().equals("StringExp") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.StringExpImpl(this, o);
		if ( o.eClass().getName().equals("TupleExp") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.TupleExpImpl(this, o);
		if ( o.eClass().getName().equals("Binding") && o.eClass().getEPackage().getName().equals("ATL") )
			return new atl.metamodel.ATL.BindingImpl(this, o);
		if ( o.eClass().getName().equals("OperationCallExp") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.OperationCallExpImpl(this, o);
		if ( o.eClass().getName().equals("Statement") && o.eClass().getEPackage().getName().equals("ATL") )
			return new atl.metamodel.ATL.StatementImpl(this, o);
		if ( o.eClass().getName().equals("LazyMatchedRule") && o.eClass().getEPackage().getName().equals("ATL") )
			return new atl.metamodel.ATL.LazyMatchedRuleImpl(this, o);
		if ( o.eClass().getName().equals("Rule") && o.eClass().getEPackage().getName().equals("ATL") )
			return new atl.metamodel.ATL.RuleImpl(this, o);
		if ( o.eClass().getName().equals("BooleanType") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.BooleanTypeImpl(this, o);
		if ( o.eClass().getName().equals("MatchedRule") && o.eClass().getEPackage().getName().equals("ATL") )
			return new atl.metamodel.ATL.MatchedRuleImpl(this, o);
		if ( o.eClass().getName().equals("IterateExp") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.IterateExpImpl(this, o);
		if ( o.eClass().getName().equals("Attribute") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.AttributeImpl(this, o);
		if ( o.eClass().getName().equals("ActionBlock") && o.eClass().getEPackage().getName().equals("ATL") )
			return new atl.metamodel.ATL.ActionBlockImpl(this, o);
		if ( o.eClass().getName().equals("SetExp") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.SetExpImpl(this, o);
		if ( o.eClass().getName().equals("SetType") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.SetTypeImpl(this, o);
		if ( o.eClass().getName().equals("OutPatternElement") && o.eClass().getEPackage().getName().equals("ATL") )
			return new atl.metamodel.ATL.OutPatternElementImpl(this, o);
		if ( o.eClass().getName().equals("Query") && o.eClass().getEPackage().getName().equals("ATL") )
			return new atl.metamodel.ATL.QueryImpl(this, o);
		if ( o.eClass().getName().equals("Parameter") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.ParameterImpl(this, o);
		if ( o.eClass().getName().equals("ModuleElement") && o.eClass().getEPackage().getName().equals("ATL") )
			return new atl.metamodel.ATL.ModuleElementImpl(this, o);
		if ( o.eClass().getName().equals("OutPattern") && o.eClass().getEPackage().getName().equals("ATL") )
			return new atl.metamodel.ATL.OutPatternImpl(this, o);
		if ( o.eClass().getName().equals("Helper") && o.eClass().getEPackage().getName().equals("ATL") )
			return new atl.metamodel.ATL.HelperImpl(this, o);
		if ( o.eClass().getName().equals("PrimitiveExp") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.PrimitiveExpImpl(this, o);
		if ( o.eClass().getName().equals("RealExp") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.RealExpImpl(this, o);
		if ( o.eClass().getName().equals("CollectionOperationCallExp") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.CollectionOperationCallExpImpl(this, o);
		if ( o.eClass().getName().equals("PatternElement") && o.eClass().getEPackage().getName().equals("ATL") )
			return new atl.metamodel.ATL.PatternElementImpl(this, o);
		if ( o.eClass().getName().equals("MapElement") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.MapElementImpl(this, o);
		if ( o.eClass().getName().equals("OclModelElement") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.OclModelElementImpl(this, o);
		if ( o.eClass().getName().equals("Library") && o.eClass().getEPackage().getName().equals("ATL") )
			return new atl.metamodel.ATL.LibraryImpl(this, o);
		if ( o.eClass().getName().equals("BagExp") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.BagExpImpl(this, o);
		if ( o.eClass().getName().equals("CalledRule") && o.eClass().getEPackage().getName().equals("ATL") )
			return new atl.metamodel.ATL.CalledRuleImpl(this, o);
		if ( o.eClass().getName().equals("TupleTypeAttribute") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.TupleTypeAttributeImpl(this, o);
		if ( o.eClass().getName().equals("NumericExp") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.NumericExpImpl(this, o);
		if ( o.eClass().getName().equals("OclFeatureDefinition") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.OclFeatureDefinitionImpl(this, o);
		if ( o.eClass().getName().equals("TupleType") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.TupleTypeImpl(this, o);
		if ( o.eClass().getName().equals("LibraryRef") && o.eClass().getEPackage().getName().equals("ATL") )
			return new atl.metamodel.ATL.LibraryRefImpl(this, o);
		if ( o.eClass().getName().equals("Unit") && o.eClass().getEPackage().getName().equals("ATL") )
			return new atl.metamodel.ATL.UnitImpl(this, o);
		if ( o.eClass().getName().equals("OclUndefinedExp") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.OclUndefinedExpImpl(this, o);
		if ( o.eClass().getName().equals("Module") && o.eClass().getEPackage().getName().equals("ATL") )
			return new atl.metamodel.ATL.ModuleImpl(this, o);
		if ( o.eClass().getName().equals("TuplePart") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.TuplePartImpl(this, o);
		if ( o.eClass().getName().equals("LetExp") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.LetExpImpl(this, o);
		if ( o.eClass().getName().equals("StringType") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.StringTypeImpl(this, o);
		if ( o.eClass().getName().equals("NavigationOrAttributeCallExp") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.NavigationOrAttributeCallExpImpl(this, o);
		if ( o.eClass().getName().equals("NumericType") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.NumericTypeImpl(this, o);
		if ( o.eClass().getName().equals("InPatternElement") && o.eClass().getEPackage().getName().equals("ATL") )
			return new atl.metamodel.ATL.InPatternElementImpl(this, o);
		if ( o.eClass().getName().equals("SimpleOutPatternElement") && o.eClass().getEPackage().getName().equals("ATL") )
			return new atl.metamodel.ATL.SimpleOutPatternElementImpl(this, o);
		if ( o.eClass().getName().equals("CollectionExp") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.CollectionExpImpl(this, o);
		if ( o.eClass().getName().equals("EnumLiteralExp") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.EnumLiteralExpImpl(this, o);
		if ( o.eClass().getName().equals("SequenceExp") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.SequenceExpImpl(this, o);
		if ( o.eClass().getName().equals("SequenceType") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.SequenceTypeImpl(this, o);
		if ( o.eClass().getName().equals("IfStat") && o.eClass().getEPackage().getName().equals("ATL") )
			return new atl.metamodel.ATL.IfStatImpl(this, o);
		
		throw new IllegalArgumentException("Object not found in resource: " + o);
	}

	public Object wrap(Object o) {
		if ( o instanceof java.util.List<?>) {
			java.util.ArrayList<ATLModelBaseObject> result = new java.util.ArrayList<ATLModelBaseObject>(); 
			for(Object content : (java.util.List<?>) o) {
				result.add( findWrapper(content) );
			} 
			return result;
		}
		return findWrapper(o);
	}
	
	protected ATLModelBaseObject findWrapper(Object o) {
		ATLModelBaseObject w = wrappers.get(o);
		if ( w == null ) throw new IllegalArgumentException("No wrapper for object " + o);
		return w;
	}
	
}
