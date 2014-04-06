package genericity.compiler.atl.analyser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;

import genericity.compiler.atl.analyser.namespaces.BooleanNamespace;
import genericity.compiler.atl.analyser.namespaces.ClassNamespace;
import genericity.compiler.atl.analyser.namespaces.CollectionNamespace;
import genericity.compiler.atl.analyser.namespaces.EnumNamespace;
import genericity.compiler.atl.analyser.namespaces.IMetamodelNamespace;
import genericity.compiler.atl.analyser.namespaces.MapTypeNamespace;
import genericity.compiler.atl.analyser.namespaces.OclTypeNamespace;
import genericity.compiler.atl.analyser.namespaces.PrimitiveGlobalNamespace;
import genericity.compiler.atl.analyser.namespaces.TupleTypeNamespace;
import genericity.compiler.atl.analyser.namespaces.TypeErrorNamespace;
import genericity.compiler.atl.analyser.namespaces.UnionTypeNamespace;
import genericity.compiler.atl.analyser.namespaces.UnknownNamespace;
import genericity.typing.atl_types.BooleanType;
import genericity.typing.atl_types.CollectionType;
import genericity.typing.atl_types.EmptyCollectionType;
import genericity.typing.atl_types.EnumType;
import genericity.typing.atl_types.FloatType;
import genericity.typing.atl_types.IntegerType;
import genericity.typing.atl_types.MapType;
import genericity.typing.atl_types.Metaclass;
import genericity.typing.atl_types.OclUndefinedType;
import genericity.typing.atl_types.PrimitiveType;
import genericity.typing.atl_types.ReflectiveClass;
import genericity.typing.atl_types.SequenceType;
import genericity.typing.atl_types.SetType;
import genericity.typing.atl_types.StringType;
import genericity.typing.atl_types.ThisModuleType;
import genericity.typing.atl_types.TupleAttribute;
import genericity.typing.atl_types.TupleType;
import genericity.typing.atl_types.Type;
import genericity.typing.atl_types.TypeError;
import genericity.typing.atl_types.UnionType;
import genericity.typing.atl_types.Unknown;
import genericity.typing.atl_types.annotations.AtlAnnotation;
import genericity.typing.atl_types.annotations.BindingAnn;
import genericity.typing.atl_types.annotations.CallExprAnn;
import genericity.typing.atl_types.annotations.CalledRuleAnn;
import genericity.typing.atl_types.annotations.CollectionExprAnn;
import genericity.typing.atl_types.annotations.ContextHelperAnn;
import genericity.typing.atl_types.annotations.ExpressionAnnotation;
import genericity.typing.atl_types.annotations.GenericExprAnn;
import genericity.typing.atl_types.annotations.IfExprAnn;
import genericity.typing.atl_types.annotations.IterateExprAnn;
import genericity.typing.atl_types.annotations.IteratorExprAnn;
import genericity.typing.atl_types.annotations.LazyRuleAnn;
import genericity.typing.atl_types.annotations.LetExprAnn;
import genericity.typing.atl_types.annotations.MapExprAnn;
import genericity.typing.atl_types.annotations.MatchedRuleAnn;
import genericity.typing.atl_types.annotations.MatchedRuleManyAnn;
import genericity.typing.atl_types.annotations.MatchedRuleOneAnn;
import genericity.typing.atl_types.annotations.ModuleHelperAnn;
import genericity.typing.atl_types.annotations.OutputPatternAnn;
import genericity.typing.atl_types.annotations.TransformationAnn;
import genericity.typing.atl_types.annotations.TupleExprAnn;

import org.eclectic.modeling.emf.BasicEMFModel;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;

import bento.analysis.atl_analysis.Problem;

import atl.metamodel.ATLModelBaseObjectInterface;
import atl.metamodel.ATL.Binding;
import atl.metamodel.ATL.CalledRule;
import atl.metamodel.ATL.Helper;
import atl.metamodel.ATL.LazyMatchedRule;
import atl.metamodel.ATL.MatchedRule;
import atl.metamodel.ATL.Module;
import atl.metamodel.ATL.OutPatternElement;
import atl.metamodel.OCL.IfExp;
import atl.metamodel.OCL.IterateExp;
import atl.metamodel.OCL.IteratorExp;
import atl.metamodel.OCL.LetExp;
import atl.metamodel.OCL.MapExp;
import atl.metamodel.OCL.OperatorCallExp;
import atl.metamodel.OCL.PropertyCallExp;
import atl.metamodel.OCL.TupleExp;

public class TypingModel {
	private BasicEMFModel	impl;

	private PrimitiveGlobalNamespace primitiveNamespace = new PrimitiveGlobalNamespace(this);
	private OclTypeNamespace oclTypeNamespace = new OclTypeNamespace(this);
	
	/** Links ATL nodes to its annotations */
	private HashMap<EObject, AtlAnnotation> nodesToAnnotations = new HashMap<EObject, AtlAnnotation>();
	
	public TypingModel(BasicEMFModel impl) {
		this.impl = impl;
	}

	
	public StringType newStringType() {
		return (StringType) createPType(StringType.class.getSimpleName(), PrimitiveGlobalNamespace.STRING_TYPE);		
	}

	private Type createPType(String className, String pTypeName) {
		Type t = (Type) impl.createObject(className);
		t.setMetamodelRef(primitiveNamespace.getClassifier(pTypeName));
		return t;
	}

	public IntegerType newIntegerType() {
		return (IntegerType) createPType(IntegerType.class.getSimpleName(), PrimitiveGlobalNamespace.INTEGER_TYPE);	
	}
	
	public FloatType newFloatType() {
		return (FloatType) createPType(FloatType.class.getSimpleName(), PrimitiveGlobalNamespace.FLOAT_TYPE);	
	}

	public BooleanType newBooleanType() {
		return (BooleanType) createPType(BooleanType.class.getSimpleName(), PrimitiveGlobalNamespace.BOOLEAN_TYPE);	
	}
	
	public BooleanType newBooleanType(Metaclass metaclass) {
		BooleanType t = (BooleanType) impl.createObject(BooleanType.class.getSimpleName());
		t.setMetamodelRef(new BooleanNamespace(t));
		t.getKindOfTypes().add(metaclass);
		return t;
	}


	/*
	public ExpressionAnnotation createExpressionAnnotation() {
		return (ExpressionAnnotation) impl.createObject(ExpressionAnnotation.class.getSimpleName());				
	}
	*/


	public TransformationAnn createTransformationAnnotation(Module self) {
		TransformationAnn t = (TransformationAnn) impl.createObject(TransformationAnn.class.getSimpleName());
		t.setModule(self.original_());
		return t;
	}
	
	public OclUndefinedType newOclUndefinedType() {
		return (OclUndefinedType) impl.createObject(OclUndefinedType.class.getSimpleName());				
	}

	public Metaclass newMetaclassType(EClass c, boolean isExplicitOcurrence, ClassNamespace cspace) {
		Metaclass metaclass = (Metaclass) impl.createObject(Metaclass.class.getSimpleName());
		metaclass.setKlass(c);
		metaclass.setName(c.getName());
		metaclass.setMultivalued(false);
		metaclass.setMetamodelRef(cspace);
		return metaclass;
	}

	public Unknown newUnknownType() {
		Unknown u = (Unknown) impl.createObject(Unknown.class.getSimpleName());
		u.setMetamodelRef(new UnknownNamespace());
		return u;
	}
	
	public Type newEmptyCollectionType() {
		EmptyCollectionType u = (EmptyCollectionType) impl.createObject(EmptyCollectionType.class.getSimpleName());
		u.setMetamodelRef(new UnknownNamespace());
		return u;
	}

	public EnumType createEEnum(EEnum c) {
		EnumType enumT = (EnumType) impl.createObject(EnumType.class.getSimpleName());
		enumT.setEenum(c);
		enumT.setName(c.getName());
		enumT.setMetamodelRef(new EnumNamespace(enumT));
		return enumT;
	}
	

	public SequenceType newSequenceType(Type nested) {
		SequenceType seq = (SequenceType) impl.createObject(SequenceType.class.getSimpleName());
		seq.setContainedType(nested);
		seq.setMultivalued(true);
		seq.setMetamodelRef(primitiveNamespace.getClassifier(PrimitiveGlobalNamespace.SEQUENCE_TYPE, nested));
		return seq;
	}

	public SetType newSetType(Type nested) {
		SetType seq = (SetType) impl.createObject(SetType .class.getSimpleName());
		seq.setContainedType(nested);
		seq.setMultivalued(true);
		seq.setMetamodelRef(primitiveNamespace.getClassifier(PrimitiveGlobalNamespace.SET_TYPE, nested));
		return seq;
	}

	public Type newMapType(Type keyType, Type valueType) {
		MapType map = (MapType) impl.createObject(MapType .class.getSimpleName());
		map.setKeyType(keyType);
		map.setValueType(valueType);
		map.setMultivalued(false);
		map.setMetamodelRef(new MapTypeNamespace(map));
		return map;
	}
	
	

	public Type newTupleTuple(String[] attNames, Type[] attTypes) {
		TupleType tuple = (TupleType) impl.createObject(TupleType .class.getSimpleName());
		for (int i = 0; i < attNames.length; i++) {
			TupleAttribute tupleAtt = (TupleAttribute) impl.createObject(TupleAttribute .class.getSimpleName());
			tupleAtt.setName(attNames[i]);
			tupleAtt.setType(attTypes[i]);
			tuple.getAttributes().add(tupleAtt);
		}
		tuple.setMetamodelRef(new TupleTypeNamespace(tuple));
		
		return tuple;
	}

	
	public Type newOclType() {
		ReflectiveClass rc = (ReflectiveClass) impl.createObject(ReflectiveClass.class.getSimpleName());
		rc.setMetamodelRef(oclTypeNamespace);
		return rc;
	}
	
	public ThisModuleType createThisModuleType() {
		ThisModuleType tm = (ThisModuleType) impl.createObject(ThisModuleType.class.getSimpleName());
		return tm;
	}


	public Type newTypeErrorType(Problem p) {
		TypeError te = (TypeError) impl.createObject(TypeError.class.getSimpleName());
		te.setMetamodelRef(new TypeErrorNamespace(p, te));
		return te;
	}

	public Type newTypeErrorType(Problem p, TypeError t) {
		TypeError te = (TypeError) impl.createObject(TypeError.class.getSimpleName());
		te.setMetamodelRef(new TypeErrorNamespace(p, te));

		// te.setMetamodelRef(te.getMetamodelRef());
		return te;
	}
	
	//
	// Type comparisons
	//
	
	public Type getCommonType(Type t1, Type t2) {
		if ( equalTypes(t1, t2) ) {
			return t1;
		}

		if ( (t1 instanceof UnionType) || (t1 instanceof UnionType) ) {
			ArrayList<Type> types = new ArrayList<Type>();
			if ( t1 instanceof UnionType ) {
				addUniqueTypes(types, ((UnionType) t1).getPossibleTypes());
			} else {
				addUniqueType(types, t1);
			}
			
			if ( t2 instanceof UnionType ) {
				addUniqueTypes(types, ((UnionType) t2).getPossibleTypes());
			} else {
				addUniqueType(types, t2);
			}

			if ( types.size() == 1 ) {
				return types.get(0);
			} else {				
				Type[] unionTypes = new Type[types.size()];
				return createUnionType(types.toArray(unionTypes));
			}
		} else {
			return createUnionType(t1, t2);
		}
		
		// throw new UnsupportedOperationException("CommonTypes: " + t1 + " - " + t2);
	}

	
	private void addUniqueTypes(ArrayList<Type> existingTypes, EList<Type> newTypes) {
		for (Type type : newTypes) {
			addUniqueType(existingTypes, type);
		}
	}

	private void addUniqueType(ArrayList<Type> existingTypes, Type type) {
		ListIterator<Type> it = existingTypes.listIterator();
		while ( it.hasNext() ) {
			Type existing = it.next();
			
			if ( equalTypes(existing, type) ) {
				return;
			} else if ( existing instanceof Metaclass && type instanceof Metaclass ) {
				Metaclass existingMetaclass = (Metaclass) existing;
				Metaclass typeMetaclass     = (Metaclass) type;
				if ( existingMetaclass.getKlass().isSuperTypeOf(typeMetaclass.getKlass()) ) {
					return; // No need
				} else if ( typeMetaclass.getKlass().isSuperTypeOf(existingMetaclass.getKlass()) ) {
					it.set(type);
					return;
				}
			}
		}
		existingTypes.add(type);
	}

	private Type createUnionType(Type... types) {
		UnionType ut = (UnionType) impl.createObject(UnionType.class.getSimpleName());
		for (Type type : types) {
			ut.getPossibleTypes().add(type);
		}
		ut.setMetamodelRef(new UnionTypeNamespace(ut));
		return ut;
	}

	public boolean equalTypes(Type t1, Type t2) {
		if ( t1.getClass() != t2.getClass() ) 
			return false;
		
		if ( t1 instanceof Metaclass ) {
			return ( ((Metaclass) t1).getKlass().equals(((Metaclass) t2).getKlass()));
		} else if ( t1 instanceof PrimitiveType ) {
			return true;
		} else if ( (t1 instanceof CollectionType) && (t2 instanceof CollectionType) ) {
			CollectionType ct1 = (CollectionType) t1;
			CollectionType ct2 = (CollectionType) t2;
						
			// TODO: Equal types for collection does not take into account the concrete type of collection
			return equalTypes(ct1.getContainedType(), ct2.getContainedType());
		} else if ( t1 instanceof EnumType && t2 instanceof EnumType ) {
			return ((EnumType) t1).getName().equals(((EnumType) t2).getName());
		} else if ( t1 instanceof MapType ) {
			return equalTypes( ((MapType) t1).getKeyType(), ((MapType) t2).getKeyType()) &&
					equalTypes( ((MapType) t1).getValueType(), ((MapType) t2).getValueType()); 
		} else if ( t1 instanceof TupleType && t2 instanceof TupleType ) {
			TupleType tt1 = (TupleType) t1;
			TupleType tt2 = (TupleType) t2;
			if ( tt1.getAttributes().size() != tt2.getAttributes().size() ) 
				return false;
			
			for(int i = 0; i < tt1.getAttributes().size(); i++) {
				if ( ! equalTypes(tt1.getAttributes().get(i).getType(), tt2.getAttributes().get(i).getType()) )
					return false;
			}
			
			return true;
		}
		
		throw new UnsupportedOperationException("EqualTypes: " + t1 + " - " + t2);
	}

	public boolean assignableTypes(Type declaredType, Type runtimeType) {
		if ( declaredType.getClass() != runtimeType.getClass() )  // TODO: Refine this, some cases they may be compatible
			return false;

		if ( declaredType instanceof Metaclass ) {
			return TypeUtils.isClassAssignableTo(((Metaclass) runtimeType).getKlass(), ((Metaclass) declaredType).getKlass());
		} else if ( declaredType instanceof PrimitiveType ) {
			return true;
		} else if ( (declaredType instanceof CollectionType) && (runtimeType instanceof CollectionType) ) {
			CollectionType dcl = (CollectionType) declaredType;
			CollectionType rtm = (CollectionType) runtimeType;
			if ( rtm.getContainedType() instanceof Unknown ) return true; //

			return assignableTypes(dcl.getContainedType(), rtm.getContainedType());
		} else if ( declaredType instanceof EnumType && runtimeType instanceof EnumType ) {
			return ((EnumType) declaredType).getName().equals(((EnumType) runtimeType).getName());
		} else if ( declaredType instanceof MapType && runtimeType instanceof MapType ) {
			MapType dcl = (MapType) declaredType;
			MapType rtm = (MapType) runtimeType;
			
			if ( rtm.getKeyType() instanceof Unknown && rtm.getValueType() instanceof Unknown ) {
				return true;
			}
			
			return assignableTypes(dcl.getKeyType(), rtm.getKeyType()) &&
				assignableTypes(dcl.getValueType(), dcl.getValueType());
		}
		
		throw new UnsupportedOperationException("EqualTypes: " + declaredType + " - " + runtimeType);
	}

	public boolean isCompatible(Type type_, Type supertype) {
		if ( type_ instanceof Metaclass && supertype instanceof Metaclass ) {
			Metaclass m1 = (Metaclass) type_;
			Metaclass m2 = (Metaclass) supertype;
			if ( m1.getKlass() == m2.getKlass() || m2.getKlass().isSuperTypeOf(m1.getKlass()) )
				return true;
		}
		return false;
	}

	
	//
	// Annotations
	//
	

	public AtlAnnotation createGenericExprAnnnotation(ATLModelBaseObjectInterface node, Type type) { //, Type receptorType) {
		GenericExprAnn ann = (GenericExprAnn) impl.createObject(GenericExprAnn.class.getSimpleName());	
		ann.setExpr(node.original_());
		ann.setType(type);

		linkNodeToAnnotation(node.original_(), ann);
		
		return ann;
	}


	public AtlAnnotation createMapExprAnnnotation(ATLModelBaseObjectInterface node, Type type) {
		MapExprAnn ann = (MapExprAnn) impl.createObject(MapExprAnn.class.getSimpleName());	
		ann.setExpr(node.original_());
		ann.setType(type);
		// TODO: Init initializers key, value
		
		linkNodeToAnnotation(node.original_(), ann);
		
		return ann;
	}


	public AtlAnnotation createTupleExprAnnotation(TupleExp self, Type type, ExpressionAnnotation[] parts) {
		TupleExprAnn ann = (TupleExprAnn) impl.createObject(TupleExprAnn.class.getSimpleName());	
		ann.setExpr(self.original_());
		ann.setType(type);
		for (ExpressionAnnotation expressionAnnotation : parts) {
			ann.getParts().add(expressionAnnotation);			
		}
		return ann;
	}
	
	public AtlAnnotation createCollectionExprAnnnotation(ATLModelBaseObjectInterface node, Type type, ExpressionAnnotation[] initializers) {
		CollectionExprAnn ann = (CollectionExprAnn) impl.createObject(CollectionExprAnn.class.getSimpleName());	
		ann.setExpr(node.original_());
		ann.setType(type);
		for(int i = 0; i < initializers.length; i++) 
			ann.getInitializers().add(initializers[i]);
		
		linkNodeToAnnotation(node.original_(), ann);
		
		return ann;
	}
	
	public BindingAnn createBindingAnnotation(Binding b, Type srcType, Type tgtType) {
		BindingAnn bt = (BindingAnn) impl.createObject(BindingAnn.class.getSimpleName());
		bt.setBinding(b.original_());
		
		bt.setSourceType(srcType);
		bt.setTargetType(tgtType);		
		
		linkNodeToAnnotation(b.original_(), bt);
		
		return bt;
		
	}

	public AtlAnnotation createCallExprAnnnotation(PropertyCallExp node, Type type, ExpressionAnnotation source, ExpressionAnnotation[] arguments) {
		CallExprAnn ann = (CallExprAnn) impl.createObject(CallExprAnn.class.getSimpleName());	
		ann.setExpr(node.original_());
		ann.setType(type);
		ann.setSource(source);
		for(int i = 0; i < arguments.length; i++) {
			ann.getArguments().add(arguments[i]);
		}
		
		linkNodeToAnnotation(node.original_(), ann);
		
		return ann;
	}

	public AtlAnnotation createIteratorExprAnnnotation(IteratorExp node, Type type, ExpressionAnnotation source, ExpressionAnnotation body) {
		IteratorExprAnn ann = (IteratorExprAnn) impl.createObject(IteratorExprAnn.class.getSimpleName());	
		ann.setExpr(node.original_());
		ann.setType(type);
		ann.setSource(source);
		ann.setBody(body);

		linkNodeToAnnotation(node.original_(), ann);
		
		return ann;
	}
	

	public AtlAnnotation createIterateExprAnnnotation(IterateExp node, Type type, ExpressionAnnotation source,
			ExpressionAnnotation body, ExpressionAnnotation result) {

		IterateExprAnn ann = (IterateExprAnn) impl.createObject(IterateExprAnn.class.getSimpleName());	
		ann.setExpr(node.original_());
		ann.setType(type);
		ann.setSource(source);
		ann.setBody(body);
		ann.setResultVar(result);
		
		linkNodeToAnnotation(node.original_(), ann);
		
		return ann;

	}


	public AtlAnnotation createIfExprAnnnotation(IfExp node, Type type, ExpressionAnnotation condition,
			ExpressionAnnotation thenPart, ExpressionAnnotation elsePart) {

		IfExprAnn ann = (IfExprAnn) impl.createObject(IfExprAnn.class.getSimpleName());	
		ann.setExpr(node.original_());
		ann.setType(type);
		ann.setIfCondition(condition);
		ann.setThenPart(thenPart);
		ann.setElsePart(elsePart);

		linkNodeToAnnotation(node.original_(), ann);
		
		return ann;
	}

	public AtlAnnotation createLetExprAnnnotation(LetExp node, Type type, ExpressionAnnotation init,
			ExpressionAnnotation body) {

		LetExprAnn ann = (LetExprAnn) impl.createObject(LetExprAnn.class.getSimpleName());	
		ann.setExpr(node.original_());
		ann.setType(type);
		ann.setInit(init);
		ann.setBody(body);
		
		linkNodeToAnnotation(node.original_(), ann);
		
		return ann;
	}

	public MatchedRuleOneAnn createMatchedRuleOneAnn(MatchedRule node, Metaclass srcType, Metaclass tgtType) {
		MatchedRuleOneAnn ann = (MatchedRuleOneAnn) impl.createObject(MatchedRuleOneAnn.class.getSimpleName());	
		ann.setRule(node.original_());
		ann.setInPatternType(srcType);
		ann.setOutputPatternType(tgtType);
		ann.setName(node.getName());
		
		linkNodeToAnnotation(node.original_(), ann);
		
		return ann;
	}
	

	public MatchedRuleAnn createMatchedRuleManyAnn(MatchedRule node, Metaclass[] types, Metaclass tgtType) {
		MatchedRuleManyAnn ann = (MatchedRuleManyAnn) impl.createObject(MatchedRuleManyAnn.class.getSimpleName());	
		ann.setRule(node.original_());
		for (Metaclass type : types) {
			ann.getInPatternTypes().add(type);			
		}
		ann.setOutputPatternType(tgtType);
		ann.setName(node.getName());
		
		linkNodeToAnnotation(node.original_(), ann);
		
		return ann;
	}

	public LazyRuleAnn createLazyRuleAnn(LazyMatchedRule node, Metaclass srcType, Metaclass tgtType) {
		LazyRuleAnn ann = (LazyRuleAnn) impl.createObject(LazyRuleAnn.class.getSimpleName());	
		ann.setRule(node.original_());
		ann.setInPatternType(srcType);
		ann.setOutputPatternType(tgtType);
		ann.setName(node.getName());
		
		linkNodeToAnnotation(node.original_(), ann);
		
		return ann;
	}
	
	public CalledRuleAnn createCalledRuleAnn(CalledRule node) {
		CalledRuleAnn ann = (CalledRuleAnn) impl.createObject(CalledRuleAnn.class.getSimpleName());	
		ann.setRule(node.original_());
		ann.setName(node.getName());

		linkNodeToAnnotation(node.original_(), ann);

		return ann;
	}

	public OutputPatternAnn createOutputPattern(OutPatternElement ope, Type type) {
		OutputPatternAnn ann = (OutputPatternAnn) impl.createObject(OutputPatternAnn.class.getSimpleName());	
		ann.setOutputPatternElement(ope.original_());
		ann.setType(type);
		
		linkNodeToAnnotation(ope.original_(), ann);
		
		return ann;
	}

	public ModuleHelperAnn createModuleHelper(Helper h, Type returnType) {
		ModuleHelperAnn ann = (ModuleHelperAnn) impl.createObject(ModuleHelperAnn.class.getSimpleName());	
		ann.setReturnType(returnType);
		ann.setHelper(h.original_());
		
		linkNodeToAnnotation(h.original_(), ann);
		
		return ann;
	}

	public ContextHelperAnn createContextHelper(Helper h, Type type, Type returnType) {
		ContextHelperAnn ann = (ContextHelperAnn) impl.createObject(ContextHelperAnn.class.getSimpleName());	
		ann.setReturnType(returnType);
		ann.setHelper(h.original_());
		ann.setContextType(type);
		
		linkNodeToAnnotation(h.original_(), ann);
		
		return ann;
	}
	
	private void linkNodeToAnnotation(EObject obj, AtlAnnotation ann) {
		if ( nodesToAnnotations.containsKey(obj) ) 
			throw new IllegalArgumentException();
		
		nodesToAnnotations.put(obj, ann);
	}
	
	public AtlAnnotation getAnnotation(EObject element) {
		if ( ! nodesToAnnotations.containsKey(element) ) 
			throw new IllegalArgumentException();
		
		return nodesToAnnotations.get(element);
	}


	/**
	 * Returns the more concrete type among the two given, or null if it cannot be
	 * decided.
	 * 
	 * @param t1
	 * @param t2
	 * @return
	 */
	public Type moreConcrete(Type t1, Type t2) {
		// Not sure about the rules for this, for the moment only for collections
		if ( t1 instanceof CollectionType && t2 instanceof CollectionType ) {
			CollectionType ct1 = (CollectionType) t1;
			CollectionType ct2 = (CollectionType) t2;
			
			// Unknown also covers EmptyCollectionType
			if ( ct1.getContainedType() instanceof Unknown && ! (ct2.getContainedType() instanceof EmptyCollectionType) ) return ct2;
			else if ( ct2.getContainedType() instanceof Unknown && ! (ct1.getContainedType() instanceof EmptyCollectionType) ) return ct1;
			else return null;
		}
		return null;
	}


	public Type getCommonType(List<? extends Type> types) {
		Type t1 = types.get(0);
		for(int i = 1; i < types.size(); i++) {
			Type t2 = types.get(0);
			t1 = AnalyserContext.getTypingModel().getCommonType(t1, t2);
		}
		return t1;
	}


	/**
	 * Given a type returns all metaclass involved.
	 */
	public List<Metaclass> getInvolvedMetaclasses(Type srcType) {
		ArrayList<Metaclass> result = new ArrayList<Metaclass>();
		ArrayList<Type> pending = new ArrayList<Type>();
		pending.add(srcType);
		
		while ( ! pending.isEmpty() ) {
			Type t = pending.remove(0);
			
			if ( t instanceof Metaclass) { 
				result.add((Metaclass) t);
			} else if ( t instanceof CollectionType ) {
				pending.add(((CollectionType) t).getContainedType() );
			} else if ( t instanceof UnionType ) {
				pending.addAll( ((UnionType) t).getPossibleTypes());
			} else if ( t instanceof PrimitiveType ) { 
				// ignore
			} else {
				throw new UnsupportedOperationException(t.getClass().getName());
			}
		}
		
		return result;
	}





	
}
