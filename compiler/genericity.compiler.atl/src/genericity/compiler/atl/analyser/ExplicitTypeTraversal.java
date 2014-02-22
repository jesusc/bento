package genericity.compiler.atl.analyser;

import genericity.compiler.atl.analyser.namespaces.GlobalNamespace;
import genericity.compiler.atl.analyser.namespaces.ITypeNamespace;
import genericity.compiler.atl.analyser.namespaces.MetamodelNamespace;
import genericity.typing.atl_types.Metaclass;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;

import atl.metamodel.ATLModel;
import atl.metamodel.ATL.Unit;
import atl.metamodel.OCL.BooleanType;
import atl.metamodel.OCL.IntegerType;
import atl.metamodel.OCL.OclModelElement;
import atl.metamodel.OCL.OrderedSetType;
import atl.metamodel.OCL.RealType;
import atl.metamodel.OCL.SequenceType;
import atl.metamodel.OCL.SetType;
import atl.metamodel.OCL.StringType;

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
	public void inOclModelElement(OclModelElement obj) {
		String mmName = obj.getModel().getName();
		MetamodelNamespace mmspace = mm.getHelper(mmName);
		if ( mmspace == null ) {
			errors.signalNoModel(mmName, obj);
		}
		
		ITypeNamespace tspace = mmspace.getClassifier(obj.getName());
		if ( tspace == null ) {
			errors.signalNoClass(obj.getName(), mmspace, obj);
		}
		attr.linkType(tspace.createType(true));
	}	

	// 
	// Primitive types
	//
	
	
	@Override
	public void inBooleanType(BooleanType self) {
		attr.linkType(typ.newBooleanType());
	}
	
	@Override
	public void inStringType(StringType self) {
		attr.linkType(typ.newStringType());
	}
	
	@Override
	public void inIntegerType(IntegerType self) {
		attr.linkType(typ.newIntegerType());
	}

	@Override
	public void inRealType(RealType self) {
		attr.linkType(typ.newFloatType());
	}
	
	//
	// Collection types
	//
	
	@Override
	public void inSequenceType(SequenceType self) {
		attr.linkType( typ.newSequenceType( attr.typeOf( self.getElementType() ) ) );
	}

	@Override
	public void inSetType(SetType self) {
		attr.linkType( typ.newSetType( attr.typeOf( self.getElementType() ) ) );
	}
	
	@Override
	public void inOrderedSetType(OrderedSetType self) {
		// TODO: Create proper OrderedSet type
		attr.linkType( typ.newSetType( attr.typeOf( self.getElementType() ) ) );
	}

}
