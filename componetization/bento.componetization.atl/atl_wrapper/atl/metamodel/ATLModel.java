
package atl.metamodel;

import java.util.HashMap;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EClass;


public class ATLModel {
	private Resource resource;
	private HashMap<EObject, Object> wrappers = new HashMap<EObject, Object>();
	private HashMap<Class<?>, EClass> classes = new HashMap<Class<?>, EClass>();
		
	public ATLModel(Resource r) {
		this.resource = r;
	
		TreeIterator<EObject> contents = resource.getAllContents();
		while ( contents.hasNext() ) {
			EObject o = contents.next();
			
			Object wrapper = createWrapperObject(o);
			
			classes.put(wrapper.getClass(), o.eClass());
			
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

	public Object createWrapperObject(EObject o) {
		if ( o.eClass().getName().equals("SuperExp") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.SuperExp(this, o);
		if ( o.eClass().getName().equals("OperationCallExp") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.OperationCallExp(this, o);
		if ( o.eClass().getName().equals("IfStat") && o.eClass().getEPackage().getName().equals("ATL") )
			return new atl.metamodel.ATL.IfStat(this, o);
		if ( o.eClass().getName().equals("VariableExp") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.VariableExp(this, o);
		if ( o.eClass().getName().equals("IteratorExp") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.IteratorExp(this, o);
		if ( o.eClass().getName().equals("SetType") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.SetType(this, o);
		if ( o.eClass().getName().equals("OrderedSetType") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.OrderedSetType(this, o);
		if ( o.eClass().getName().equals("CollectionType") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.CollectionType(this, o);
		if ( o.eClass().getName().equals("BooleanType") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.BooleanType(this, o);
		if ( o.eClass().getName().equals("OclContextDefinition") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.OclContextDefinition(this, o);
		if ( o.eClass().getName().equals("StringType") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.StringType(this, o);
		if ( o.eClass().getName().equals("PatternElement") && o.eClass().getEPackage().getName().equals("ATL") )
			return new atl.metamodel.ATL.PatternElement(this, o);
		if ( o.eClass().getName().equals("IfExp") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.IfExp(this, o);
		if ( o.eClass().getName().equals("SimpleOutPatternElement") && o.eClass().getEPackage().getName().equals("ATL") )
			return new atl.metamodel.ATL.SimpleOutPatternElement(this, o);
		if ( o.eClass().getName().equals("LoopExp") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.LoopExp(this, o);
		if ( o.eClass().getName().equals("PrimitiveExp") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.PrimitiveExp(this, o);
		if ( o.eClass().getName().equals("SetExp") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.SetExp(this, o);
		if ( o.eClass().getName().equals("Attribute") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.Attribute(this, o);
		if ( o.eClass().getName().equals("Parameter") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.Parameter(this, o);
		if ( o.eClass().getName().equals("Operation") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.Operation(this, o);
		if ( o.eClass().getName().equals("ActionBlock") && o.eClass().getEPackage().getName().equals("ATL") )
			return new atl.metamodel.ATL.ActionBlock(this, o);
		if ( o.eClass().getName().equals("EnumLiteralExp") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.EnumLiteralExp(this, o);
		if ( o.eClass().getName().equals("LocatedElement") && o.eClass().getEPackage().getName().equals("ATL") )
			return new atl.metamodel.ATL.LocatedElement(this, o);
		if ( o.eClass().getName().equals("ForStat") && o.eClass().getEPackage().getName().equals("ATL") )
			return new atl.metamodel.ATL.ForStat(this, o);
		if ( o.eClass().getName().equals("StringExp") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.StringExp(this, o);
		if ( o.eClass().getName().equals("RuleVariableDeclaration") && o.eClass().getEPackage().getName().equals("ATL") )
			return new atl.metamodel.ATL.RuleVariableDeclaration(this, o);
		if ( o.eClass().getName().equals("BagExp") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.BagExp(this, o);
		if ( o.eClass().getName().equals("Library") && o.eClass().getEPackage().getName().equals("ATL") )
			return new atl.metamodel.ATL.Library(this, o);
		if ( o.eClass().getName().equals("SequenceType") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.SequenceType(this, o);
		if ( o.eClass().getName().equals("BagType") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.BagType(this, o);
		if ( o.eClass().getName().equals("RealExp") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.RealExp(this, o);
		if ( o.eClass().getName().equals("TupleTypeAttribute") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.TupleTypeAttribute(this, o);
		if ( o.eClass().getName().equals("Iterator") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.Iterator(this, o);
		if ( o.eClass().getName().equals("Primitive") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.Primitive(this, o);
		if ( o.eClass().getName().equals("Unit") && o.eClass().getEPackage().getName().equals("ATL") )
			return new atl.metamodel.ATL.Unit(this, o);
		if ( o.eClass().getName().equals("NumericExp") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.NumericExp(this, o);
		if ( o.eClass().getName().equals("MapExp") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.MapExp(this, o);
		if ( o.eClass().getName().equals("LibraryRef") && o.eClass().getEPackage().getName().equals("ATL") )
			return new atl.metamodel.ATL.LibraryRef(this, o);
		if ( o.eClass().getName().equals("CollectionOperationCallExp") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.CollectionOperationCallExp(this, o);
		if ( o.eClass().getName().equals("BindingStat") && o.eClass().getEPackage().getName().equals("ATL") )
			return new atl.metamodel.ATL.BindingStat(this, o);
		if ( o.eClass().getName().equals("InPattern") && o.eClass().getEPackage().getName().equals("ATL") )
			return new atl.metamodel.ATL.InPattern(this, o);
		if ( o.eClass().getName().equals("LazyMatchedRule") && o.eClass().getEPackage().getName().equals("ATL") )
			return new atl.metamodel.ATL.LazyMatchedRule(this, o);
		if ( o.eClass().getName().equals("IntegerType") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.IntegerType(this, o);
		if ( o.eClass().getName().equals("CalledRule") && o.eClass().getEPackage().getName().equals("ATL") )
			return new atl.metamodel.ATL.CalledRule(this, o);
		if ( o.eClass().getName().equals("LetExp") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.LetExp(this, o);
		if ( o.eClass().getName().equals("OclModel") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.OclModel(this, o);
		if ( o.eClass().getName().equals("ExpressionStat") && o.eClass().getEPackage().getName().equals("ATL") )
			return new atl.metamodel.ATL.ExpressionStat(this, o);
		if ( o.eClass().getName().equals("TuplePart") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.TuplePart(this, o);
		if ( o.eClass().getName().equals("TupleType") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.TupleType(this, o);
		if ( o.eClass().getName().equals("ForEachOutPatternElement") && o.eClass().getEPackage().getName().equals("ATL") )
			return new atl.metamodel.ATL.ForEachOutPatternElement(this, o);
		if ( o.eClass().getName().equals("ModuleElement") && o.eClass().getEPackage().getName().equals("ATL") )
			return new atl.metamodel.ATL.ModuleElement(this, o);
		if ( o.eClass().getName().equals("OclType") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.OclType(this, o);
		if ( o.eClass().getName().equals("Rule") && o.eClass().getEPackage().getName().equals("ATL") )
			return new atl.metamodel.ATL.Rule(this, o);
		if ( o.eClass().getName().equals("InPatternElement") && o.eClass().getEPackage().getName().equals("ATL") )
			return new atl.metamodel.ATL.InPatternElement(this, o);
		if ( o.eClass().getName().equals("MatchedRule") && o.eClass().getEPackage().getName().equals("ATL") )
			return new atl.metamodel.ATL.MatchedRule(this, o);
		if ( o.eClass().getName().equals("BooleanExp") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.BooleanExp(this, o);
		if ( o.eClass().getName().equals("CollectionExp") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.CollectionExp(this, o);
		if ( o.eClass().getName().equals("IterateExp") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.IterateExp(this, o);
		if ( o.eClass().getName().equals("SimpleInPatternElement") && o.eClass().getEPackage().getName().equals("ATL") )
			return new atl.metamodel.ATL.SimpleInPatternElement(this, o);
		if ( o.eClass().getName().equals("OclUndefinedExp") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.OclUndefinedExp(this, o);
		if ( o.eClass().getName().equals("OclFeatureDefinition") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.OclFeatureDefinition(this, o);
		if ( o.eClass().getName().equals("Module") && o.eClass().getEPackage().getName().equals("ATL") )
			return new atl.metamodel.ATL.Module(this, o);
		if ( o.eClass().getName().equals("SequenceExp") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.SequenceExp(this, o);
		if ( o.eClass().getName().equals("OutPattern") && o.eClass().getEPackage().getName().equals("ATL") )
			return new atl.metamodel.ATL.OutPattern(this, o);
		if ( o.eClass().getName().equals("MapType") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.MapType(this, o);
		if ( o.eClass().getName().equals("IntegerExp") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.IntegerExp(this, o);
		if ( o.eClass().getName().equals("OclFeature") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.OclFeature(this, o);
		if ( o.eClass().getName().equals("OclModelElement") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.OclModelElement(this, o);
		if ( o.eClass().getName().equals("NavigationOrAttributeCallExp") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.NavigationOrAttributeCallExp(this, o);
		if ( o.eClass().getName().equals("Statement") && o.eClass().getEPackage().getName().equals("ATL") )
			return new atl.metamodel.ATL.Statement(this, o);
		if ( o.eClass().getName().equals("Query") && o.eClass().getEPackage().getName().equals("ATL") )
			return new atl.metamodel.ATL.Query(this, o);
		if ( o.eClass().getName().equals("Helper") && o.eClass().getEPackage().getName().equals("ATL") )
			return new atl.metamodel.ATL.Helper(this, o);
		if ( o.eClass().getName().equals("MapElement") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.MapElement(this, o);
		if ( o.eClass().getName().equals("VariableDeclaration") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.VariableDeclaration(this, o);
		if ( o.eClass().getName().equals("NumericType") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.NumericType(this, o);
		if ( o.eClass().getName().equals("OperatorCallExp") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.OperatorCallExp(this, o);
		if ( o.eClass().getName().equals("RealType") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.RealType(this, o);
		if ( o.eClass().getName().equals("OutPatternElement") && o.eClass().getEPackage().getName().equals("ATL") )
			return new atl.metamodel.ATL.OutPatternElement(this, o);
		if ( o.eClass().getName().equals("Binding") && o.eClass().getEPackage().getName().equals("ATL") )
			return new atl.metamodel.ATL.Binding(this, o);
		if ( o.eClass().getName().equals("OrderedSetExp") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.OrderedSetExp(this, o);
		if ( o.eClass().getName().equals("PropertyCallExp") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.PropertyCallExp(this, o);
		if ( o.eClass().getName().equals("TupleExp") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.TupleExp(this, o);
		if ( o.eClass().getName().equals("OclAnyType") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.OclAnyType(this, o);
		if ( o.eClass().getName().equals("OclExpression") && o.eClass().getEPackage().getName().equals("OCL") )
			return new atl.metamodel.OCL.OclExpression(this, o);
		
		throw new IllegalArgumentException("Object not found in resource: " + o);
	}

	public Object wrap(Object o) {
		if ( o instanceof java.util.List<?>) {
			java.util.ArrayList<Object> result = new java.util.ArrayList<Object>(); 
			for(Object content : (java.util.List<?>) o) {
				result.add( findWrapper(content) );
			} 
			return result;
		}
		return findWrapper(o);
	}
	
	private Object findWrapper(Object o) {
		Object w = wrappers.get(o);
		if ( w == null ) throw new IllegalArgumentException("No wrapper for object " + o);
		return w;
	}
}
