package genericity.typecheck.atl;

import genericity.typing.atl_types.AtlTypingPackage;
import genericity.typing.atl_types.BooleanType;
import genericity.typing.atl_types.EmptyCollection;
import genericity.typing.atl_types.EnumType;
import genericity.typing.atl_types.FloatType;
import genericity.typing.atl_types.IntegerType;
import genericity.typing.atl_types.MapType;
import genericity.typing.atl_types.Metaclass;
import genericity.typing.atl_types.PrimitiveType;
import genericity.typing.atl_types.RefType;
import genericity.typing.atl_types.ReflectiveClass;
import genericity.typing.atl_types.StringType;
import genericity.typing.atl_types.ThisModuleType;
import genericity.typing.atl_types.TupleAttribute;
import genericity.typing.atl_types.TupleType;
import genericity.typing.atl_types.Type;
import genericity.typing.atl_types.UnionType;
import genericity.typing.atl_types.Unknown;
import genericity.typing.atl_types.UnknownFeature;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclectic.idc.datatypes.ImmutableList;
import org.eclectic.idc.datatypes.JavaListConverter;
import org.eclectic.idc.jvm.runtime.IMethodWrapper;
import org.eclectic.idc.jvm.runtime.IdcException;
import org.eclectic.modeling.emf.BasicEMFModel;
import org.eclectic.modeling.emf.EMFLoader;
import org.eclectic.modeling.emf.IModel;
import org.eclectic.modeling.emf.ModelManager;
import org.eclectic.modeling.emf.NoModelFoundException;
import org.eclectic.modeling.emf.Util;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public class TypeCheckLauncher {

	public static BasicEMFModel loadTransformationMetamodels(EMFLoader loader, String... metamodels) throws IOException {
		ResourceSetImpl rs = new ResourceSetImpl();
		Resource merged = rs.createResource(URI.createURI("typing_metamodels.ecore"));

		for (String path : metamodels) {
			Resource r1 = rs.getResource(URI.createURI(path), true);

			merged.getContents().addAll(r1.getContents());
		}
	
		BasicEMFModel mm = loader.basicModelFromMemory(EcorePackage.eINSTANCE, merged);	

		return mm;
	}
	
	private boolean isWarningMode = false;

	public void setWarningMode() { isWarningMode = true; }
	
	public void launch(BasicEMFModel mm, BasicEMFModel atlTransformation, BasicEMFModel out) throws IOException {

		eclectic.typecheck_atl transformation = new eclectic.typecheck_atl();

		Util.registerResourceFactory();
		ModelManager manager = new ModelManager();
		EMFLoader loader = new EMFLoader(new JavaListConverter());
		/*
		 * BasicEMFModel in = loader .basicModelFromFile( new String[] { //
		 * withDir("../be.ac.vub.simpleocl/metamodel/simpleocl.ecore"),
		 * withDir("../genericity.language.gbind/metamodel/gbind.ecore") },
		 * withDir(BINDING_MODEL));
		 */


		BasicEMFModel in = atlTransformation;
		
		// manager.register("gbind", in);
		// manager.register("socl", in);
		// manager.register("params", parameters);
		manager.register("atl", in);
		manager.register("typ", out);

		// in.registerMethodHandler(new
		// org.eclectic.idc.jvm.runtime.BasicMethodHandler(manager));
		// in.registerMethodHandler(new BasicMethodHandler(manager));
		in.registerMethodHandler(new CustomMethodHandler(mm, out, manager, isWarningMode));
		transformation.setModelManager(manager);

		transformation.configure_();
		transformation.start_();

		transformation.printPending();
		// TODO: Define in/out modes for EMFModels
		// out.serialize();

		// out.serialize(new FileOutputStream(withDir("tmp_/typing.xmi")));
		// merged.save(new FileOutputStream("tmp_/typing_metamodels.ecore"), null);
		// System.out.println("Finished " + TypeCheckLauncher.class.getSimpleName());
	}

	public static class CustomMethodHandler extends
			org.eclectic.idc.jvm.runtime.BasicMethodHandler {
		private BasicEMFModel mm;
		private BasicEMFModel types;
		private boolean isWarningMode;

		public CustomMethodHandler(BasicEMFModel mm, BasicEMFModel types, ModelManager m, boolean isWarningMode) {
			super(m);
			this.mm = mm;
			this.types = types;
			this.isWarningMode = isWarningMode;
		}

		@Override
		public IMethodWrapper wrap(Object o) {
			try {
				return new CustomMethodWrapper(mm, types, manager.getNamespace(o), o, isWarningMode);
			} catch (NoModelFoundException e) {
				throw new IdcException(e);
			}
		}
	}

	// I don't like this...
	private static EStructuralFeature lastNavigatedFeature;

	public static class CustomMethodWrapper extends
			org.eclectic.idc.jvm.runtime.BasicMethodWrapper {
		private BasicEMFModel mm;
		private BasicEMFModel types;
		private boolean isWarningMode;

		public CustomMethodWrapper(BasicEMFModel mm, BasicEMFModel types, IModel<?, ?> model, Object o, boolean isWarningMode) {
			super(model, o);
			this.mm = mm;
			this.types = types;
			this.isWarningMode = isWarningMode;
		}

		public Boolean is_eclass(EClassifier c) {
			return c instanceof EClass;
		}

		public EClassifier eClass() {
			// Assume type is OclModelElement
			String name = (String) model.getFeature(object, "name");
			return findMetaclass(name);
		}

		
		private EClassifier findMetaclass(String name) {
			List<EObject> classes = mm.allObjectsOf("EClass");
			for (EObject eObject : classes) {
				EClass eclass = (EClass) eObject;
				if ( eclass.getName().equals(name) ) 
					return eclass;
			}
			
			System.out.println("EClass " + name + " not found. Looking up enumerated types");
			List<EObject> enums = mm.allObjectsOf("EEnum");
			for (EObject eObject : enums) {
				EEnum eenum = (EEnum) eObject;
				if ( eenum.getName().equals(name) ) 
					return eenum;
			}
			
			throw new RuntimeException("EClass " + name + " not found");
		}

		protected Type findCommonTypeAux(Type t1, Type t2, boolean createUnionType) {
			if ( t1 instanceof RefType && t2 instanceof RefType) {
				
				if ( t1 instanceof Unknown || t2 instanceof Unknown ) 
					return (Type) types.createObject(Unknown.class.getSimpleName());
			
				Metaclass t1m = (Metaclass) t1;
				Metaclass t2m = (Metaclass) t2;
				if ( t1m.getKlass().isSuperTypeOf(t2m.getKlass()) ) 
					return t1m;
				else if ( t2m.getKlass().isSuperTypeOf(t1m.getKlass()) )
					return t2m;
				
			} else if ( t1 instanceof PrimitiveType && t1.eClass() == t2.eClass() ) {
				return t1;
			} else if ( t1 instanceof EmptyCollection ) {
				return t2;
			} else if ( t2 instanceof EmptyCollection ) {
				return t1; // TODO: Copy
			}
			
			if ( createUnionType ) {
				UnionType union = (UnionType) types.createObject(UnionType.class.getSimpleName());
				// TODO: Merge common types to avoid duplicates
				
				if ( t1 instanceof UnionType && t2 instanceof UnionType ) {
					UnionType u1 = (UnionType) t1;
					UnionType u2 = (UnionType) t1;
					
					for (Type type : u1.getPossibleTypes()) {
						union.getPossibleTypes().add(copyType(type, false));
					}
					
					for (Type type : u2.getPossibleTypes()) {
						union.getPossibleTypes().add(copyType(type, false));
					}
					
				} else if ( t1 instanceof UnionType ) {				
					UnionType u1 = (UnionType) t1;
					
					for (Type type : u1.getPossibleTypes()) {
						union.getPossibleTypes().add(copyType(type, false));
					}

					union.getPossibleTypes().add(copyType(t2, false));
				} else if ( t2 instanceof UnionType ) {				
					UnionType u2 = (UnionType) t2;
					
					for (Type type : u2.getPossibleTypes()) {
						union.getPossibleTypes().add(copyType(type, false));
					}

					union.getPossibleTypes().add(copyType(t1, false));
				} else {							
					union.getPossibleTypes().add( copyType(t1, false) );
					union.getPossibleTypes().add( copyType(t2, false) );
				}
				
				union.setMultivalued( t1.isMultivalued() || t2.isMultivalued() );
				return union;
			}
			
			return null;
		}

		public Type findCommonTypePossibleUnion(Type t1, Type t2) {
			Type t = findCommonTypeAux(t1, t2, true);
			if ( t == null )
				throw new RuntimeException("Incompatible types: "+ t1 + " - " + t2 + " at " + model.getFeature(object, "location"));			
			return t;
		}
		
		public Type findCommonType(Type t1, Type t2) {
			Type t = findCommonTypeAux(t1, t2, false);
			if ( t == null )
				throw new RuntimeException("Incompatible types: "+ t1 + " - " + t2 + " at " + model.getFeature(object, "location"));			
			return t;
		}

		
		public Type copyType(Type type, Boolean multivalued) {
			if ( type instanceof Metaclass ) {
				Metaclass original = (Metaclass) type;
				
				Metaclass metaclass = (Metaclass) types.createObject(Metaclass.class.getSimpleName());
				metaclass.setKlass(original.getKlass());
				metaclass.setName(original.getName());
				metaclass.setMultivalued(multivalued);
				return metaclass;				
			} else if ( type instanceof EnumType ) {
				EnumType original = (EnumType) type;
					
				EnumType eenum = (EnumType) types.createObject(EnumType.class.getSimpleName());
				eenum.setEenum(original.getEenum());
				eenum.setName(original.getName());
				eenum.setMultivalued(multivalued);
				return eenum;				
			} else if ( type instanceof PrimitiveType ) {
				PrimitiveType pt = (PrimitiveType) types.createObject(type.eClass().getName());
				pt.setMultivalued(multivalued);
				return pt;
			} else if ( type instanceof Unknown ) {
				return (Type) types.createObject(type.eClass().getName());
			} else if ( type instanceof UnionType ) {
				UnionType original = (UnionType) type;
				UnionType copy = (UnionType) types.createObject(UnionType.class.getSimpleName());
				EList<Type> types = original.getPossibleTypes();
				for (Type innerType : types) {
					copy.getPossibleTypes().add(copyType(innerType, innerType.isMultivalued()));
				}
				return copy;
			} else if ( type instanceof TupleType ) {
				TupleType original = (TupleType) type;
				TupleType tt = (TupleType) types.createObject(TupleType.class.getSimpleName());
				
				EList<TupleAttribute> attrs = original.getAttributes();
				for (TupleAttribute originalAttribute : attrs) {
					TupleAttribute att = (TupleAttribute) types.createObject(TupleAttribute.class.getSimpleName());
					att.setName(originalAttribute.getName());
					att.setType(copyType(originalAttribute.getType(), originalAttribute.getType().isMultivalued()));
					tt.getAttributes().add(att);
				}
				
				tt.setMultivalued(multivalued);
				
				return tt;
			}
			throw new UnsupportedOperationException(type.getClass().getSimpleName());			
		}
		
		public Type iteratorType(String iteratorName, Type receptorType, Type bodyType, ImmutableList restOfIterators) {
			if ( iteratorName.equals("collect") ) {
				return copyType(bodyType, true);
			} else if ( iteratorName.equals("select") || iteratorName.equals("reject") || iteratorName.equals("any")) {
				// This could be wiser, detecting filtering based on oclIsKindOf!!
				return copyType(receptorType, true);
			} else if ( iteratorName.equals("iterate") ) {
				Type iteratorVar = (Type) restOfIterators.first();
				return copyType(iteratorVar, iteratorVar.isMultivalued());
			} else if ( iteratorName.equals("exists") ) {
				return createBooleanType();
			} else if ( iteratorName.equals("forAll") ) {
				return createBooleanType();
			}
			
			throw new UnsupportedOperationException("Iterator " + iteratorName + " not supported");			
		}
		
		// for OperationCallExp
		public Type operationType(Type receptorType, EObject exp, ImmutableList arguments, ImmutableList operations) {
			String operationName = (String) model.getFeature(object, "operationName");
						
			if ( receptorType.isMultivalued() ) {
				return collectionOperationType(receptorType, arguments);
			}
			
			if ( receptorType instanceof TupleType ) {
				throw new IllegalArgumentException("Trying to apply operation " + operationName + " to tuple " + model.getFeature(object, "location"));
			}

			if ( receptorType instanceof MapType ) {
				return mapOperationType((MapType) receptorType, operationName, arguments);
			}
						
			// Default operations
			if ( operationName.equals("allInstances") ) {
				// Receptor type must be a ...?
				return copyType(receptorType, true); 
			} else if ( operationName.equals("oclAsType") ) {
				return copyType((Type) arguments.first(), false);
			} else if ( operationName.equals("oclType") ) {
				return (Type) types.createObject(ReflectiveClass.class.getSimpleName());
			} else if ( operationName.equals("oclIsKindOf") || operationName.equals("oclIsTypeOf") || 
					    operationName.equals("oclIsUndefined")) {
				return createBooleanType();
			} else if ( operationName.equals("+") ) {
				return receptorType; // TODO: Coercions?
			}
				

			if ( receptorType instanceof Unknown ) {
				System.out.println("Unknown type with operation " + operationName + (receptorType.isMultivalued() ? "* "  : " ")  + "OclAny : " + object + " " + model.getFeature(object, "location"));
				return receptorType;
			}
			
			/*
			boolean isModuleCall = false;
			if ( model.isKindOf(exp, "VariableExp") ) {
				Object vd = model.getFeature(exp, "referredVariable");
				String name = (String) model.getFeature(vd, "varName");
				isModuleCall = name.equals("thisModule");
			}
			*/
			boolean isModuleCall = receptorType instanceof ThisModuleType;
			
			if ( isModuleCall ) {
				Iterator<Object> iterator = operations.iterator();
				while ( iterator.hasNext() ) {
					EObject obj = (EObject) iterator.next();
					Object ctx        = model.getFeature(obj, "context_");
					if ( ctx == null )
						return findOclFeatureType((EObject) model.getFeature(obj, "feature"));
				}				
				
				// Look for called rules and lazy rules
				List<Object> rules = this.model.allObjectsOf("Rule");
				for (Object obj: rules) {
					if ( this.model.isKindOf(obj, "CalledRule") || this.model.isKindOf(obj, "MatchedRule") ) {
						if ( this.model.getFeature(obj, "name").equals(operationName) ) {
							Object outPattern = model.getFeature(obj, "outPattern");
							Object simpleOutPattern = ((ImmutableList) model.getFeature(outPattern, "elements")).get(0);
							Object oclType = model.getFeature(simpleOutPattern, "type");
							return createTypeFromAtlTypeDefinition((EObject) oclType);
						}
					}
				}
				
				if ( operationName.equals("resolveTemp") ) {
					System.err.println("WARNING! resolvedTemp ignored");
					return (Type) types.createObject(Unknown.class.getSimpleName());
				}
				
				throw new RuntimeException("No module operation " + operationName);
			}
			
			if ( receptorType instanceof PrimitiveType ) {
				Iterator<Object> iterator = operations.iterator();
				while ( iterator.hasNext() ) {
					EObject obj = (EObject) iterator.next();
					Object ctx        = model.getFeature(obj, "context_");
					
					EObject context    = (EObject) model.getFeature(ctx, "context_");
					if ( receptorType.eClass().getName().equals(context.eClass().getName()) )
						return findOclFeatureType((EObject) model.getFeature(obj, "feature"));						
				}
				
				// Default operations
				if ( operationName.equals("pow") ) {
					return (Type) types.createObject(IntegerType.class.getSimpleName());					
				} else if ( operationName.equals("sqrt") ) {
					return (Type) types.createObject(FloatType.class.getSimpleName());					
				} else if ( operationName.equals("concat") ) {
						return (Type) types.createObject(StringType.class.getSimpleName());					
				} else if ( operationName.equals("oclIsUndefined") ) {
					return (Type) types.createObject(BooleanType.class.getSimpleName());					
				} else if ( operationName.equals("toSequence") ) {
					return copyType(receptorType, true);
				} else if ( operationName.equals("debug") ) {
					return copyType(receptorType, receptorType.isMultivalued());
				} else if ( operationName.equals("toString") ) {
					return (Type) types.createObject(StringType.class.getSimpleName());	
				}
				
				throw new RuntimeException("No primitive operation " + operationName + " at " + model.getFeature(object, "location"));
			}

			EClass clazz = ((Metaclass) receptorType).getKlass();
			ArrayList<EClass> inheritanceChain = new ArrayList<EClass>();
			inheritanceChain.add(clazz);
			inheritanceChain.addAll(clazz.getEAllSuperTypes());

			for (EClass eClass : inheritanceChain) {
				Iterator<Object> iterator = operations.iterator();
				while ( iterator.hasNext() ) {
					EObject obj = (EObject) iterator.next();
					// Object oclFeature = model.getFeature(obj, "feature");
					Object ctx        = model.getFeature(obj, "context_");
					if ( ctx == null && isModuleCall)
						return findOclFeatureType((EObject) model.getFeature(obj, "feature"));
					else if ( ctx == null)
						continue;
						
					Object context    = model.getFeature(ctx, "context_");
					String name       = (String) model.getFeature(context, "name");
					if ( name.equals(eClass.getName()) ) 
						return findOclFeatureType((EObject) model.getFeature(obj, "feature"));
				}
			}

			
			throw new RuntimeException("No operation " + operationName + (receptorType.isMultivalued() ? "* "  : " ")  + clazz.getName() + " : " + object + " " + model.getFeature(object, "location"));

		}
		
		private Type createBooleanType() {
			return (Type) types.createObject(BooleanType.class.getSimpleName());
		}

		// Assume type is NavigationOrAttributeCallExp
		public Type featureType(Type receptortype, ImmutableList helpers, ImmutableList operations) {
			lastNavigatedFeature = null;
			
			String featureName = (String) model.getFeature(object, "name");

			if ( receptortype instanceof TupleType ) {
				return tupleAccessType((TupleType) receptortype, featureName);
			}

			
			if ( receptortype instanceof ThisModuleType) {
				if ( helpers.size() < 1 ) {
					throw new UnsupportedOperationException("Attribute " + featureName + " not found in module");					
				} else {
					Type t = null;
					for (Object h : helpers) {
						Object ctx = model.getFeature(h, "context_");
						if ( ctx == null ) {
							if ( t != null ) {
								throw new UnsupportedOperationException("Too many attributes " + featureName + " found in module");													
							}
							t = findOclFeatureType((EObject) model.getFeature(helpers.first(), "feature"));
						}
					}
					
					return t;
				}
			}

			if ( receptortype instanceof ReflectiveClass) {
				if ( featureName.equals("name") ) {
					return (Type) types.createObject(StringType.class.getSimpleName());	
				}
				throw new UnsupportedOperationException("Feature " + featureName + " not supported for reflective object");
			}
			
			
			if ( ! (receptortype instanceof Metaclass) ) {
				throw new UnsupportedOperationException("Unsupported " + receptortype + " "  + featureName + " at " + model.getFeature(object, "location"));
			}
			
			EClass clazz = ((Metaclass) receptortype).getKlass();
			
			ArrayList<EClass> inheritanceChain = new ArrayList<EClass>();
			inheritanceChain.add(clazz);
			inheritanceChain.addAll(clazz.getEAllSuperTypes());
			
			for (EClass eClass : inheritanceChain) {
				Iterator<Object> iterator = helpers.iterator();
				while ( iterator.hasNext() ) {
					EObject obj = (EObject) iterator.next();
					// Object oclFeature = model.getFeature(obj, "feature");
					Object ctx        = model.getFeature(obj, "context_");
					if ( ctx == null )
						continue;
						
					Object context    = model.getFeature(ctx, "context_");
					String name       = (String) model.getFeature(context, "name");
					if ( name.equals(eClass.getName()) ) 
						return findOclFeatureType((EObject) model.getFeature(obj, "feature"));
				}
			}
			
			// Assume type is OclModelElement
			EStructuralFeature f = clazz.getEStructuralFeature(featureName);
			if ( f == null ) {
				if ( helpers.size() == 1 ) {
					Type t = findOclFeatureType((EObject) model.getFeature(helpers.first(), "feature"));
					System.out.println("Assuming helper " + featureName + " at " + model.getFeature(object, "location") +
							" with type " + t);
					return t;				
				} else if ( helpers.size() > 1 ) {
					throw new RuntimeException("Too many " + featureName + " " + clazz.getName() + " : " + object + " " + model.getFeature(object, "location"));				
				} else { 
					if ( operations.size() == 1 && 
							((ImmutableList) model.getFeature(model.getFeature(operations.first(), "feature"), "parameters")).size() == 0) {
						Object op = operations.first();
						Type t = findOclFeatureType((EObject) model.getFeature(operations.first(), "feature"));
						System.out.println("Assuming operation " + featureName + " at " + model.getFeature(object, "location") +
								" with type " + t);
						return t;							
					}
					
					return signalNoFeatureError(clazz, featureName);
				}
			}
			
			// Cache the structural feature... just as a way to have multiple return values
			// The value is queried with getLastNavigatedFeature
			lastNavigatedFeature = f;
			return createType( f.getEType(), f.getUpperBound() == -1 || f.getUpperBound() > 1 );
		}

		private Type signalNoFeatureError(EClass clazz, String featureName) {
			Type t = null;
			List<EObject> allEClasses = mm.allObjectsOf("EClass");
			for (EObject obj : allEClasses) {
				EClass eClass = (EClass) obj;
				if ( eClass.getEAllSuperTypes().contains(clazz) ) {
					// Es un subtipo
					EStructuralFeature f = eClass.getEStructuralFeature(featureName);
					if ( f != null ) {
						lastNavigatedFeature = f;
						return createType( f.getEType(), f.getUpperBound() == -1 || f.getUpperBound() > 1 );						
					}
				}
			}
			
			// The feature not found in subclasses
			if ( t == null ) {
				UnknownFeature unknown = (UnknownFeature) types.createObject(UnknownFeature.class.getSimpleName());
				unknown.setTheContainingClass(clazz);
				unknown.setName(featureName);
				unknown.setEType(AtlTypingPackage.Literals.UNKNOWN);
				
				lastNavigatedFeature = unknown;
				t = (Type) types.createObject(Unknown.class.getSimpleName());
			}
			return signalError("No feature " + clazz.getName() + "." + featureName + "in line " + model.getFeature(object, "location") + " : " + object, t);
		}

		private Type signalError(String str, Type t) {
			if ( isWarningMode ) { 
				System.err.println("ANALYSIS WARNING: " + str);
				
				return t;
			}
			throw new RuntimeException(str);
		}

		public EStructuralFeature getLastNavigatedFeature() {
			return lastNavigatedFeature;
		}
		
		public Type tupleAccessType(TupleType tuple, String featureName) {
			String attrNames = "";
			EList<TupleAttribute> attributes = tuple.getAttributes();
			for (TupleAttribute tupleAttribute : attributes) {
				if ( tupleAttribute.getName().equals(featureName) ) {
					return copyType(tupleAttribute.getType(), tupleAttribute.getType().isMultivalued());
				}
				attrNames = attrNames + " " + tupleAttribute.getName();
			}
			throw new RuntimeException("Cannot find tuple attribute " + featureName + " at " + model.getFeature(object, "location") + " within [" + attrNames + "]");
		}

		private Type findOclFeatureType(EObject oclFeature) {
			EObject oclType = null;
			if ( model.hasFeature(oclFeature, "returnType") ) {
				oclType = (EObject) model.getFeature(oclFeature, "returnType");
			} else {
				oclType = (EObject) model.getFeature(oclFeature, "type");
			}
			
			return createTypeFromAtlTypeDefinition(oclType);
		}

		private Type createTypeFromAtlTypeDefinition(EObject oclType) {
			if ( model.isKindOf(oclType, "OclModelElement") ) {
				return createType(findMetaclass((String) model.getFeature(oclType, "name")), false);
			} else if ( model.isKindOf(oclType, "OclAnyType") ) {
				return createType( EcorePackage.eINSTANCE.getEObject(), false );
			} else {
				return createDataType(oclType); // createType(convertAtlDataType(oclType));
			}
		}

		private Type createDataType(EObject oclType) {
			String name = oclType.eClass().getName();
			if ( name.equals("BooleanType") ) {
				return (Type) types.createObject(BooleanType.class.getSimpleName());
			} else if ( name.equals("StringType") ) {
				return (Type) types.createObject(StringType.class.getSimpleName());
			} else if ( name.equals("IntegerType") ) {
				return (Type) types.createObject(IntegerType.class.getSimpleName());
			} else if ( name.equals("RealType") ) {
				return (Type) types.createObject(FloatType.class.getSimpleName());
			} else if ( name.equals("SequenceType") || name.equals("SetType") ) {
				// TODO: Mark the type with a flag indicating the type of collection
				Type t = createTypeFromAtlTypeDefinition((EObject) model.getFeature(oclType, "elementType"));
				t.setMultivalued(true);
				return t;
			} else if ( name.equals("MapType") ) {
				// TODO: This is also implemented as a rule in the transformation!
				MapType mt = (MapType) types.createObject(MapType.class.getSimpleName());
				EObject kt = (EObject) model.getFeature(oclType, "keyType");
				EObject vt = (EObject) model.getFeature(oclType, "valueType");

				mt.setKeyType( createTypeFromAtlTypeDefinition(kt) );
				mt.setValueType( createTypeFromAtlTypeDefinition(vt) );
				
				return mt;
			} else if ( name.equals("TupleType") ) {
				// TODO: This is also implemented as a rule in the transformation!
				TupleType tt = (TupleType) types.createObject(TupleType.class.getSimpleName());
				Iterator<Object> it = ((ImmutableList) model.getFeature(oclType, "attributes")).iterator();
				while ( it.hasNext() ) {
					EObject att = (EObject) it.next();
					TupleAttribute ta = (TupleAttribute) types.createObject(TupleAttribute.class.getSimpleName());
					types.setFeature(ta, "name", model.getFeature(att, "name"));
					types.setFeature(ta, "type", createTypeFromAtlTypeDefinition((EObject) model.getFeature(att, "type")) );
					types.setFeature(tt, "attributes", ta);
				}
				
				return tt;
				// return (Type) types.createObject(Unknown.class.getSimpleName()); // TODO: More precise?
			}

			throw new UnsupportedOperationException("Type " + name + " not supported");
		}

//		private EClassifier convertAtlDataType(EObject oclType) {
//			String name = oclType.eClass().getName();
//			if ( name.equals("BooleanType") ) {
//				return EcorePackage.eINSTANCE.getEBoolean();
//			} else if ( name.equals("StringType") ) {
//				return EcorePackage.eINSTANCE.getEString();
//			} else if ( name.equals("IntegerType") ) {
//				return EcorePackage.eINSTANCE.getEInt();
//			} 
//
//			throw new UnsupportedOperationException("Type " + name + " not supported");
//		}

		// Assume type is NavigationOrAttributeCallExp
		public Type createType(EClassifier classifier, boolean multivalued) {
			if ( classifier instanceof EEnum ) {
				EnumType e = (EnumType) types.createObject(EnumType.class.getSimpleName());
				e.setEenum((EEnum) classifier);
				e.setName(classifier.getName());
				return e;				
			} else if ( classifier instanceof EDataType ) {
				if ( classifier.getName().endsWith("String") ) 
					return (Type) types.createObject(StringType.class.getSimpleName());
				else if ( classifier.getName().endsWith("Boolean") ) 
					return (Type) types.createObject(BooleanType.class.getSimpleName());
				else if ( classifier.getName().endsWith("EInt") ) 
					return (Type) types.createObject(IntegerType.class.getSimpleName());

				// This should probably be a user-defined typing
				else if ( classifier.getName().endsWith("UnlimitedNatural") || classifier.getName().startsWith("Integer") ) 
					return (Type) types.createObject(IntegerType.class.getSimpleName());

				
				else throw new UnsupportedOperationException("Type " + classifier.getName() + " not supported");
			} else if ( classifier == EcorePackage.eINSTANCE.getEObject() ) {
				return (Type) types.createObject(Unknown.class.getSimpleName());
			} else {	
				Metaclass metaclass = (Metaclass) types.createObject(Metaclass.class.getSimpleName());
				metaclass.setKlass((EClass) classifier);
				metaclass.setName(classifier.getName());
				metaclass.setMultivalued(multivalued);
				return metaclass;
			}
		}

		private Type mapOperationType(MapType mt, String operationName, ImmutableList arguments) {
			if ( operationName.equals("including") ) {
				Type keyType = (Type) arguments.first();
				
				// TODO: This is probably not perfectly fince, since one unknown types leads to unknown...
				Type valueType = findCommonTypeAux(mt.getValueType(), (Type) arguments.tail().first(), true);

				MapType newMt = (MapType) types.createObject(MapType.class.getSimpleName());

				// newMt.setKeyType( copyType(mt.getKeyType(), false ) );

				// TODO: Not assume the key type is always consistent. 
				newMt.setKeyType( copyType(keyType, false ) );
				newMt.setValueType( copyType(valueType, false) );
				
				return mt;
			}
			else if ( operationName.equals("get") ) {
				return copyType(mt.getValueType(), mt.getValueType().isMultivalued());
			}
			
			throw new RuntimeException("No operation " + operationName + " for Map: " + model.getFeature(object, "location"));
		}

		public Type collectionOperationType(Type t, ImmutableList arguments) {
			String operationName = (String) model.getFeature(object, "operationName");
			if ( operationName.equals("first") || 
				 operationName.equals("at") ) {
				return copyType(t, false); // should I copy it...

			} else if ( operationName.equals("flatten") ) {
				return copyType(t, true);
			} else if ( operationName.equals("asSet") || operationName.equals("asSequence") ) {
				return copyType(t, true);
				
			} else if ( operationName.equals("excludes") || operationName.equals("includes") ||
					    operationName.equals("isEmpty")  || operationName.equals("notEmpty")) {
				return (Type) types.createObject(BooleanType.class.getSimpleName());
				
			} else if ( operationName.equals("size") ) {
				return (Type) types.createObject(IntegerType.class.getSimpleName());

			} else if ( operationName.equals("excluding") ) {
				return copyType(t, true);

			} else if ( operationName.equals("including") || operationName.equals("append") || operationName.equals("union")  ) {
				Type ct = findCommonTypeAux(t, (Type) arguments.first(), true);
				if ( ct == null ) {
					throw new UnsupportedOperationException("Cannot find common type: " + operationName + " " + t + " - " + arguments.first() + " " + model.getFeature(object, "location"));					
				}
				return ct;
			}
			throw new UnsupportedOperationException("Collection operation: " + operationName);
		}
	}
}
