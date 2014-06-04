package genericity.compiler.atl.analyser;

import genericity.compiler.atl.analyser.namespaces.GlobalNamespace;
import genericity.compiler.atl.analyser.namespaces.ITypeNamespace;
import genericity.compiler.atl.analyser.namespaces.MetamodelNamespace;
import genericity.compiler.atl.analyser.namespaces.UnknownNamespace;
import genericity.typing.atl_types.Metaclass;
import genericity.typing.atl_types.Type;
import atl.metamodel.ATLModel;
import atl.metamodel.ATLModelBaseObject;
import atl.metamodel.ATL.CalledRule;
import atl.metamodel.ATL.Module;
import atl.metamodel.ATL.ModuleElement;
import atl.metamodel.ATL.Statement;
import atl.metamodel.ATL.Unit;
import atl.metamodel.OCL.BooleanType;
import atl.metamodel.OCL.IntegerType;
import atl.metamodel.OCL.MapType;
import atl.metamodel.OCL.OclAnyType;
import atl.metamodel.OCL.OclExpression;
import atl.metamodel.OCL.OclModel;
import atl.metamodel.OCL.OclModelElement;
import atl.metamodel.OCL.OrderedSetType;
import atl.metamodel.OCL.Parameter;
import atl.metamodel.OCL.RealType;
import atl.metamodel.OCL.SequenceType;
import atl.metamodel.OCL.SetType;
import atl.metamodel.OCL.StringType;
import atl.metamodel.OCL.TupleType;
import atl.metamodel.OCL.TupleTypeAttribute;

public class ExplicitTypeTraversal extends AbstractAnalyserVisitor {
	
	
	public ExplicitTypeTraversal(ATLModel model, GlobalNamespace mm, Unit root, TypingModel typ, ErrorModel errors) {
		super(model, mm, root, typ, errors);
	}
		
	public void perform(ComputedAttributes attr) {
		this.attr = attr.pushVisitor(this);
		startVisiting(root);
		attr.popVisitor(this);
	}

	//  
	// Variables and model access
	//

	@Override
	public void inOclModelElement(OclModelElement self) {
		OclModel metamodel = self.getModel();
		String mmName = metamodel.getName();
		MetamodelNamespace mmspace = mm.getNamespace(mmName);
		if ( mmspace == null ) {
			// TODO: As recovery action look up a model with the required
			//       type name
			errors.signalNoModel(mmName, self);
			
			attr.linkExprType(typ.newUnknownType());
			return;
		}
		
		ITypeNamespace tspace = mmspace.getClassifier(self.getName());
		if ( tspace == null ) {
			if ( self.getName().equals("OclAny") ) {
				attr.linkExprType(typ.newUnknownType());
				return;
			}

			errors.signalNoClass(self.getName(), mmspace, self);
			// TODO: Signal no class should recover more elegantly
			attr.linkExprType(typ.newUnknownType());
			return;
		}
		Type type = (Type) tspace.createType(true);
		// metaclass.setExplicitOcurrence(true);
		attr.linkExprType(type);

		
		// TODO: Reading target model: Not sure if this may catch false cases
		Module m = (Module) root;
		int numTargets = 0;
		for(OclModel outModel : m.getOutModels()) {
			if ( outModel.getMetamodel().getName().equals(metamodel.getName()) ) {
				numTargets++;
			}
		}
		
		boolean isTarget = numTargets > 0;
		if ( isTarget && self.container_() instanceof OclExpression ) {
			// Check it is not in a do block, typically invoking a newInstance
			//  	&& ! (self.container_() instanceof CalledRule)
			ATLModelBaseObject parent = self.container_();
			while ( !(parent instanceof ModuleElement) ) {
				// It is a do block?
				if ( parent instanceof Statement ) {
					return;
				}
				// Check it is in the parameters of a called rule
				if ( parent instanceof Parameter && parent.container_() instanceof CalledRule ) {
					return;
				}
				parent = parent.container_();
			}
			
			
			errors.signalReadingTargetModel(self);
		}
		
		if ( numTargets > 1 && metamodel.getModel().size() == 0 ) {
			errors.signalAmbiguousTargetModelReference(self);
		}
		
		// I think there are ambiguous cases if the same meta-model
		// appears in source and target, but perhaps only for bindings, so this is
		// not the place to check
	}	

	// 
	// Primitive types
	//
	
	
	@Override
	public void inBooleanType(BooleanType self) {
		attr.linkExprType(typ.newBooleanType());
	}
	
	@Override
	public void inStringType(StringType self) {
		attr.linkExprType(typ.newStringType());
	}
	
	@Override
	public void inIntegerType(IntegerType self) {
		attr.linkExprType(typ.newIntegerType());
	}

	@Override
	public void inRealType(RealType self) {
		attr.linkExprType(typ.newFloatType());
	}
	
	//
	// Collection types
	//
	
	@Override
	public void inSequenceType(SequenceType self) {
		attr.linkExprType( typ.newSequenceType( attr.typeOf( self.getElementType() ) ) );
	}

	@Override
	public void inSetType(SetType self) {
		attr.linkExprType( typ.newSetType( attr.typeOf( self.getElementType() ) ) );
	}
	
	@Override
	public void inOrderedSetType(OrderedSetType self) {
		// TODO: Create proper OrderedSet type
		attr.linkExprType( typ.newSetType( attr.typeOf( self.getElementType() ) ) );
	}

	@Override
	public void inMapType(MapType self) {
		attr.linkExprType( typ.newMapType( 
				attr.typeOf( self.getKeyType() ), 
				attr.typeOf( self.getValueType() ) ));
	}
	
	@Override
	public void inTupleType(TupleType self) {
		Type[] attTypes   = new Type[self.getAttributes().size()];
		String[] attNames = new String[self.getAttributes().size()];
		
		int i = 0;
		for(TupleTypeAttribute a : self.getAttributes()) {
			attTypes[i] = attr.typeOf(a.getType());
			attNames[i] = a.getName();
			i++;
		}
		attr.linkExprType( typ.newTupleTuple(attNames, attTypes) );
	}
	
	@Override
	public void inOclAnyType(OclAnyType self) {
		attr.linkExprType(typ.newUnknownType());
	}
}
