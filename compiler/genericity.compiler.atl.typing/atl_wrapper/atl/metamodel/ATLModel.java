
package atl.metamodel;

import java.util.HashMap;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EcoreFactory;


public class ATLModel {
	private Resource resource;
	private HashMap<EObject, ATLModelBaseObject> wrappers = new HashMap<EObject, ATLModelBaseObject>();
	private HashMap<Class<?>, EClass> classes = new HashMap<Class<?>, EClass>();
		
	public ATLModel(Resource r) {
		this.resource = r;

		java.util.HashSet<EPackage> packages = new java.util.HashSet<EPackage>();
	
		TreeIterator<EObject> contents = resource.getAllContents();
		while ( contents.hasNext() ) {
			EObject o = contents.next();
			
			ATLModelBaseObject wrapper = createWrapperObject(o);
			
			classes.put(wrapper.getClass(), o.eClass());
			classes.put(wrapper.getImplementedInterface(), o.eClass());
			
			for(EClass c : o.eClass().getEAllSuperTypes()) {
				Class<?> iface = getInterfaceOfEClass(c);
				if ( classes.containsKey(iface) ) 
					continue; // break??? Only works if the supertypes are given in a proper order, which seems not to be enforced 
					
				classes.put(iface, c);
				classes.put(getClassOfEClass(c), c);
			}
						
			
			wrappers.put(o, wrapper);
			packages.add(o.eClass().getEPackage());
		}
		
		for (EPackage p : packages) {
			for(EClassifier c : p.getEClassifiers()) {
				if ( c instanceof EClass ) {
					classes.put(getInterfaceOfEClass((EClass) c), (EClass) c);
					classes.put(getClassOfEClass((EClass) c), (EClass) c);
				}
			}
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

	private Class<?> getInterfaceOfEClass(EClass c) {
		if ( c.getName().equals("OclExpression") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.OclExpression.class;
		if ( c.getName().equals("PropertyCallExp") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.PropertyCallExp.class;
		if ( c.getName().equals("ExpressionStat") && c.getEPackage().getName().equals("ATL") )
			return atl.metamodel.ATL.ExpressionStat.class;
		if ( c.getName().equals("ForStat") && c.getEPackage().getName().equals("ATL") )
			return atl.metamodel.ATL.ForStat.class;
		if ( c.getName().equals("LoopExp") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.LoopExp.class;
		if ( c.getName().equals("OrderedSetType") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.OrderedSetType.class;
		if ( c.getName().equals("RealType") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.RealType.class;
		if ( c.getName().equals("Iterator") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.Iterator.class;
		if ( c.getName().equals("Primitive") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.Primitive.class;
		if ( c.getName().equals("MapType") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.MapType.class;
		if ( c.getName().equals("OclType") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.OclType.class;
		if ( c.getName().equals("InPattern") && c.getEPackage().getName().equals("ATL") )
			return atl.metamodel.ATL.InPattern.class;
		if ( c.getName().equals("IteratorExp") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.IteratorExp.class;
		if ( c.getName().equals("SimpleInPatternElement") && c.getEPackage().getName().equals("ATL") )
			return atl.metamodel.ATL.SimpleInPatternElement.class;
		if ( c.getName().equals("OperatorCallExp") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.OperatorCallExp.class;
		if ( c.getName().equals("VariableExp") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.VariableExp.class;
		if ( c.getName().equals("OrderedSetExp") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.OrderedSetExp.class;
		if ( c.getName().equals("OclContextDefinition") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.OclContextDefinition.class;
		if ( c.getName().equals("VariableDeclaration") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.VariableDeclaration.class;
		if ( c.getName().equals("OclFeature") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.OclFeature.class;
		if ( c.getName().equals("RuleVariableDeclaration") && c.getEPackage().getName().equals("ATL") )
			return atl.metamodel.ATL.RuleVariableDeclaration.class;
		if ( c.getName().equals("MapExp") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.MapExp.class;
		if ( c.getName().equals("BindingStat") && c.getEPackage().getName().equals("ATL") )
			return atl.metamodel.ATL.BindingStat.class;
		if ( c.getName().equals("SuperExp") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.SuperExp.class;
		if ( c.getName().equals("ForEachOutPatternElement") && c.getEPackage().getName().equals("ATL") )
			return atl.metamodel.ATL.ForEachOutPatternElement.class;
		if ( c.getName().equals("IntegerExp") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.IntegerExp.class;
		if ( c.getName().equals("OclModel") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.OclModel.class;
		if ( c.getName().equals("LocatedElement") && c.getEPackage().getName().equals("ATL") )
			return atl.metamodel.ATL.LocatedElement.class;
		if ( c.getName().equals("Operation") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.Operation.class;
		if ( c.getName().equals("BagType") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.BagType.class;
		if ( c.getName().equals("IntegerType") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.IntegerType.class;
		if ( c.getName().equals("BooleanExp") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.BooleanExp.class;
		if ( c.getName().equals("OclAnyType") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.OclAnyType.class;
		if ( c.getName().equals("IfExp") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.IfExp.class;
		if ( c.getName().equals("CollectionType") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.CollectionType.class;
		if ( c.getName().equals("StringExp") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.StringExp.class;
		if ( c.getName().equals("TupleExp") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.TupleExp.class;
		if ( c.getName().equals("Binding") && c.getEPackage().getName().equals("ATL") )
			return atl.metamodel.ATL.Binding.class;
		if ( c.getName().equals("OperationCallExp") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.OperationCallExp.class;
		if ( c.getName().equals("Statement") && c.getEPackage().getName().equals("ATL") )
			return atl.metamodel.ATL.Statement.class;
		if ( c.getName().equals("LazyMatchedRule") && c.getEPackage().getName().equals("ATL") )
			return atl.metamodel.ATL.LazyMatchedRule.class;
		if ( c.getName().equals("Rule") && c.getEPackage().getName().equals("ATL") )
			return atl.metamodel.ATL.Rule.class;
		if ( c.getName().equals("BooleanType") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.BooleanType.class;
		if ( c.getName().equals("MatchedRule") && c.getEPackage().getName().equals("ATL") )
			return atl.metamodel.ATL.MatchedRule.class;
		if ( c.getName().equals("IterateExp") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.IterateExp.class;
		if ( c.getName().equals("Attribute") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.Attribute.class;
		if ( c.getName().equals("ActionBlock") && c.getEPackage().getName().equals("ATL") )
			return atl.metamodel.ATL.ActionBlock.class;
		if ( c.getName().equals("SetExp") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.SetExp.class;
		if ( c.getName().equals("SetType") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.SetType.class;
		if ( c.getName().equals("OutPatternElement") && c.getEPackage().getName().equals("ATL") )
			return atl.metamodel.ATL.OutPatternElement.class;
		if ( c.getName().equals("Query") && c.getEPackage().getName().equals("ATL") )
			return atl.metamodel.ATL.Query.class;
		if ( c.getName().equals("Parameter") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.Parameter.class;
		if ( c.getName().equals("ModuleElement") && c.getEPackage().getName().equals("ATL") )
			return atl.metamodel.ATL.ModuleElement.class;
		if ( c.getName().equals("OutPattern") && c.getEPackage().getName().equals("ATL") )
			return atl.metamodel.ATL.OutPattern.class;
		if ( c.getName().equals("Helper") && c.getEPackage().getName().equals("ATL") )
			return atl.metamodel.ATL.Helper.class;
		if ( c.getName().equals("PrimitiveExp") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.PrimitiveExp.class;
		if ( c.getName().equals("RealExp") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.RealExp.class;
		if ( c.getName().equals("CollectionOperationCallExp") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.CollectionOperationCallExp.class;
		if ( c.getName().equals("PatternElement") && c.getEPackage().getName().equals("ATL") )
			return atl.metamodel.ATL.PatternElement.class;
		if ( c.getName().equals("MapElement") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.MapElement.class;
		if ( c.getName().equals("OclModelElement") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.OclModelElement.class;
		if ( c.getName().equals("Library") && c.getEPackage().getName().equals("ATL") )
			return atl.metamodel.ATL.Library.class;
		if ( c.getName().equals("BagExp") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.BagExp.class;
		if ( c.getName().equals("CalledRule") && c.getEPackage().getName().equals("ATL") )
			return atl.metamodel.ATL.CalledRule.class;
		if ( c.getName().equals("TupleTypeAttribute") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.TupleTypeAttribute.class;
		if ( c.getName().equals("NumericExp") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.NumericExp.class;
		if ( c.getName().equals("OclFeatureDefinition") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.OclFeatureDefinition.class;
		if ( c.getName().equals("TupleType") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.TupleType.class;
		if ( c.getName().equals("LibraryRef") && c.getEPackage().getName().equals("ATL") )
			return atl.metamodel.ATL.LibraryRef.class;
		if ( c.getName().equals("Unit") && c.getEPackage().getName().equals("ATL") )
			return atl.metamodel.ATL.Unit.class;
		if ( c.getName().equals("OclUndefinedExp") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.OclUndefinedExp.class;
		if ( c.getName().equals("Module") && c.getEPackage().getName().equals("ATL") )
			return atl.metamodel.ATL.Module.class;
		if ( c.getName().equals("TuplePart") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.TuplePart.class;
		if ( c.getName().equals("LetExp") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.LetExp.class;
		if ( c.getName().equals("StringType") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.StringType.class;
		if ( c.getName().equals("NavigationOrAttributeCallExp") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.NavigationOrAttributeCallExp.class;
		if ( c.getName().equals("NumericType") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.NumericType.class;
		if ( c.getName().equals("InPatternElement") && c.getEPackage().getName().equals("ATL") )
			return atl.metamodel.ATL.InPatternElement.class;
		if ( c.getName().equals("SimpleOutPatternElement") && c.getEPackage().getName().equals("ATL") )
			return atl.metamodel.ATL.SimpleOutPatternElement.class;
		if ( c.getName().equals("CollectionExp") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.CollectionExp.class;
		if ( c.getName().equals("EnumLiteralExp") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.EnumLiteralExp.class;
		if ( c.getName().equals("SequenceExp") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.SequenceExp.class;
		if ( c.getName().equals("SequenceType") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.SequenceType.class;
		if ( c.getName().equals("IfStat") && c.getEPackage().getName().equals("ATL") )
			return atl.metamodel.ATL.IfStat.class;
		
		System.err.println("EClass not found: " + c.getName());
		return null;
		// throw new IllegalArgumentException("EClass not found: " + c.getName());
	}

	private Class<?> getClassOfEClass(EClass c) {
		if ( c.getName().equals("OclExpression") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.OclExpressionImpl.class;
		if ( c.getName().equals("PropertyCallExp") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.PropertyCallExpImpl.class;
		if ( c.getName().equals("ExpressionStat") && c.getEPackage().getName().equals("ATL") )
			return atl.metamodel.ATL.ExpressionStatImpl.class;
		if ( c.getName().equals("ForStat") && c.getEPackage().getName().equals("ATL") )
			return atl.metamodel.ATL.ForStatImpl.class;
		if ( c.getName().equals("LoopExp") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.LoopExpImpl.class;
		if ( c.getName().equals("OrderedSetType") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.OrderedSetTypeImpl.class;
		if ( c.getName().equals("RealType") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.RealTypeImpl.class;
		if ( c.getName().equals("Iterator") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.IteratorImpl.class;
		if ( c.getName().equals("Primitive") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.PrimitiveImpl.class;
		if ( c.getName().equals("MapType") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.MapTypeImpl.class;
		if ( c.getName().equals("OclType") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.OclTypeImpl.class;
		if ( c.getName().equals("InPattern") && c.getEPackage().getName().equals("ATL") )
			return atl.metamodel.ATL.InPatternImpl.class;
		if ( c.getName().equals("IteratorExp") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.IteratorExpImpl.class;
		if ( c.getName().equals("SimpleInPatternElement") && c.getEPackage().getName().equals("ATL") )
			return atl.metamodel.ATL.SimpleInPatternElementImpl.class;
		if ( c.getName().equals("OperatorCallExp") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.OperatorCallExpImpl.class;
		if ( c.getName().equals("VariableExp") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.VariableExpImpl.class;
		if ( c.getName().equals("OrderedSetExp") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.OrderedSetExpImpl.class;
		if ( c.getName().equals("OclContextDefinition") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.OclContextDefinitionImpl.class;
		if ( c.getName().equals("VariableDeclaration") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.VariableDeclarationImpl.class;
		if ( c.getName().equals("OclFeature") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.OclFeatureImpl.class;
		if ( c.getName().equals("RuleVariableDeclaration") && c.getEPackage().getName().equals("ATL") )
			return atl.metamodel.ATL.RuleVariableDeclarationImpl.class;
		if ( c.getName().equals("MapExp") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.MapExpImpl.class;
		if ( c.getName().equals("BindingStat") && c.getEPackage().getName().equals("ATL") )
			return atl.metamodel.ATL.BindingStatImpl.class;
		if ( c.getName().equals("SuperExp") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.SuperExpImpl.class;
		if ( c.getName().equals("ForEachOutPatternElement") && c.getEPackage().getName().equals("ATL") )
			return atl.metamodel.ATL.ForEachOutPatternElementImpl.class;
		if ( c.getName().equals("IntegerExp") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.IntegerExpImpl.class;
		if ( c.getName().equals("OclModel") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.OclModelImpl.class;
		if ( c.getName().equals("LocatedElement") && c.getEPackage().getName().equals("ATL") )
			return atl.metamodel.ATL.LocatedElementImpl.class;
		if ( c.getName().equals("Operation") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.OperationImpl.class;
		if ( c.getName().equals("BagType") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.BagTypeImpl.class;
		if ( c.getName().equals("IntegerType") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.IntegerTypeImpl.class;
		if ( c.getName().equals("BooleanExp") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.BooleanExpImpl.class;
		if ( c.getName().equals("OclAnyType") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.OclAnyTypeImpl.class;
		if ( c.getName().equals("IfExp") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.IfExpImpl.class;
		if ( c.getName().equals("CollectionType") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.CollectionTypeImpl.class;
		if ( c.getName().equals("StringExp") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.StringExpImpl.class;
		if ( c.getName().equals("TupleExp") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.TupleExpImpl.class;
		if ( c.getName().equals("Binding") && c.getEPackage().getName().equals("ATL") )
			return atl.metamodel.ATL.BindingImpl.class;
		if ( c.getName().equals("OperationCallExp") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.OperationCallExpImpl.class;
		if ( c.getName().equals("Statement") && c.getEPackage().getName().equals("ATL") )
			return atl.metamodel.ATL.StatementImpl.class;
		if ( c.getName().equals("LazyMatchedRule") && c.getEPackage().getName().equals("ATL") )
			return atl.metamodel.ATL.LazyMatchedRuleImpl.class;
		if ( c.getName().equals("Rule") && c.getEPackage().getName().equals("ATL") )
			return atl.metamodel.ATL.RuleImpl.class;
		if ( c.getName().equals("BooleanType") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.BooleanTypeImpl.class;
		if ( c.getName().equals("MatchedRule") && c.getEPackage().getName().equals("ATL") )
			return atl.metamodel.ATL.MatchedRuleImpl.class;
		if ( c.getName().equals("IterateExp") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.IterateExpImpl.class;
		if ( c.getName().equals("Attribute") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.AttributeImpl.class;
		if ( c.getName().equals("ActionBlock") && c.getEPackage().getName().equals("ATL") )
			return atl.metamodel.ATL.ActionBlockImpl.class;
		if ( c.getName().equals("SetExp") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.SetExpImpl.class;
		if ( c.getName().equals("SetType") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.SetTypeImpl.class;
		if ( c.getName().equals("OutPatternElement") && c.getEPackage().getName().equals("ATL") )
			return atl.metamodel.ATL.OutPatternElementImpl.class;
		if ( c.getName().equals("Query") && c.getEPackage().getName().equals("ATL") )
			return atl.metamodel.ATL.QueryImpl.class;
		if ( c.getName().equals("Parameter") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.ParameterImpl.class;
		if ( c.getName().equals("ModuleElement") && c.getEPackage().getName().equals("ATL") )
			return atl.metamodel.ATL.ModuleElementImpl.class;
		if ( c.getName().equals("OutPattern") && c.getEPackage().getName().equals("ATL") )
			return atl.metamodel.ATL.OutPatternImpl.class;
		if ( c.getName().equals("Helper") && c.getEPackage().getName().equals("ATL") )
			return atl.metamodel.ATL.HelperImpl.class;
		if ( c.getName().equals("PrimitiveExp") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.PrimitiveExpImpl.class;
		if ( c.getName().equals("RealExp") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.RealExpImpl.class;
		if ( c.getName().equals("CollectionOperationCallExp") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.CollectionOperationCallExpImpl.class;
		if ( c.getName().equals("PatternElement") && c.getEPackage().getName().equals("ATL") )
			return atl.metamodel.ATL.PatternElementImpl.class;
		if ( c.getName().equals("MapElement") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.MapElementImpl.class;
		if ( c.getName().equals("OclModelElement") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.OclModelElementImpl.class;
		if ( c.getName().equals("Library") && c.getEPackage().getName().equals("ATL") )
			return atl.metamodel.ATL.LibraryImpl.class;
		if ( c.getName().equals("BagExp") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.BagExpImpl.class;
		if ( c.getName().equals("CalledRule") && c.getEPackage().getName().equals("ATL") )
			return atl.metamodel.ATL.CalledRuleImpl.class;
		if ( c.getName().equals("TupleTypeAttribute") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.TupleTypeAttributeImpl.class;
		if ( c.getName().equals("NumericExp") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.NumericExpImpl.class;
		if ( c.getName().equals("OclFeatureDefinition") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.OclFeatureDefinitionImpl.class;
		if ( c.getName().equals("TupleType") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.TupleTypeImpl.class;
		if ( c.getName().equals("LibraryRef") && c.getEPackage().getName().equals("ATL") )
			return atl.metamodel.ATL.LibraryRefImpl.class;
		if ( c.getName().equals("Unit") && c.getEPackage().getName().equals("ATL") )
			return atl.metamodel.ATL.UnitImpl.class;
		if ( c.getName().equals("OclUndefinedExp") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.OclUndefinedExpImpl.class;
		if ( c.getName().equals("Module") && c.getEPackage().getName().equals("ATL") )
			return atl.metamodel.ATL.ModuleImpl.class;
		if ( c.getName().equals("TuplePart") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.TuplePartImpl.class;
		if ( c.getName().equals("LetExp") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.LetExpImpl.class;
		if ( c.getName().equals("StringType") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.StringTypeImpl.class;
		if ( c.getName().equals("NavigationOrAttributeCallExp") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.NavigationOrAttributeCallExpImpl.class;
		if ( c.getName().equals("NumericType") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.NumericTypeImpl.class;
		if ( c.getName().equals("InPatternElement") && c.getEPackage().getName().equals("ATL") )
			return atl.metamodel.ATL.InPatternElementImpl.class;
		if ( c.getName().equals("SimpleOutPatternElement") && c.getEPackage().getName().equals("ATL") )
			return atl.metamodel.ATL.SimpleOutPatternElementImpl.class;
		if ( c.getName().equals("CollectionExp") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.CollectionExpImpl.class;
		if ( c.getName().equals("EnumLiteralExp") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.EnumLiteralExpImpl.class;
		if ( c.getName().equals("SequenceExp") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.SequenceExpImpl.class;
		if ( c.getName().equals("SequenceType") && c.getEPackage().getName().equals("OCL") )
			return atl.metamodel.OCL.SequenceTypeImpl.class;
		if ( c.getName().equals("IfStat") && c.getEPackage().getName().equals("ATL") )
			return atl.metamodel.ATL.IfStatImpl.class;
		
		System.err.println("EClass not found: " + c.getName());
		return null;
		// throw new IllegalArgumentException("EClass not found: " + c.getName());
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
	
	public ATLModelBaseObject findWrapper(Object o) {
		ATLModelBaseObject w = wrappers.get(o);
		if ( w == null ) throw new IllegalArgumentException("No wrapper for object " + o);
		return w;
	}

	public <T> T create(Class<T> clazz) {
		EClass c = classes.get(clazz);
		EObject o = c.getEPackage().getEFactoryInstance().create(c);
	
		ATLModelBaseObject wrapper = createWrapperObject(o);
		
		wrappers.put(o, wrapper);
		
		// Add to the resource
		resource.getContents().add(o);
		
		return clazz.cast(wrapper);
	}
		
}
