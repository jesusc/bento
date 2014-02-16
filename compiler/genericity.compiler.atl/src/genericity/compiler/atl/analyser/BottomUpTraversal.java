package genericity.compiler.atl.analyser;

import java.util.HashMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;

import genericity.typing.atl_types.Metaclass;
import genericity.typing.atl_types.Type;
import genericity.typing.atl_types.annotations.ExpressionAnnotation;
import atl.metamodel.ATLModel;
import atl.metamodel.ATLModelBaseObject;
import atl.metamodel.ATLModelBaseObjectInterface;
import atl.metamodel.ATLModelVisitor;
import atl.metamodel.ATL.SimpleInPatternElement;
import atl.metamodel.ATL.Unit;
import atl.metamodel.OCL.IntegerExp;
import atl.metamodel.OCL.Iterator;
import atl.metamodel.OCL.NavigationOrAttributeCallExp;
import atl.metamodel.OCL.OclModelElement;
import atl.metamodel.OCL.OclUndefinedExp;
import atl.metamodel.OCL.RealExp;
import atl.metamodel.OCL.StringExp;
import atl.metamodel.OCL.VariableDeclaration;

public class BottomUpTraversal extends ATLModelVisitor {
	
	private Unit	root;
	private TypingModel	typ;
	private MetamodelAccess	mm;
	private ErrorModel	errors;

	private HashMap<ATLModelBaseObject, Type> typeAttr = new HashMap<ATLModelBaseObject, Type>();
	
	public BottomUpTraversal(ATLModel model, MetamodelAccess mm, Unit root, TypingModel typ, ErrorModel errors) {
		this.root = root;
		this.typ  = typ;
		this.mm   = mm;
		this.errors = errors;
		// _debug = true;
	}
	
	public void perform() {
		startVisiting(root);
	}
	
	
	//  
	// Variables and model access
	//

	@Override
	public void inOclModelElement(OclModelElement obj) {
		String mmName = obj.getModel().getName();
		MetamodelHelper helper = mm.getHelper(mmName);
		if ( helper == null ) {
			errors.signalNoModel(mmName, obj);
		}
		
		EClassifier classifier = helper.getClassifier(obj.getName());
		if ( classifier instanceof EClass) {
			Metaclass t = typ.newMetaclassType((EClass) classifier, true);
			t.setMetamodelRef(helper);
			linkType(t);
		} else {
			throw new UnsupportedOperationException();
		}
	}	
	
	@Override
	public void inVariableDeclaration(VariableDeclaration self) {
		assert(!( self instanceof SimpleInPatternElement || self instanceof Iterator));
		if ( self.getVarName().equals("self") ||
			 self.getVarName().equals("thisModule")	) return;
		// TODO: Ver que debe estar partida en dos reglas de eclectic
		if ( self.getInitExpression() == null ) {
			// type[self] <- type[self.type]
			// TODO: Get the type of the variable declaration
		} else {
			// TODO: Get the type of the initExpression
			// type[self] <- type[self.initExpression]
		}		
	}
	
	@Override
	public void inSimpleInPatternElement(SimpleInPatternElement self) {
		linkType( typeOf(self.getType()) );
	}
	
	// 
	// Navigation
	//
	
	@Override
	public void inNavigationOrAttributeCallExp(NavigationOrAttributeCallExp self) {
		Type t = typeOf( self.getSource() );
		
		// FIX: Warn about navigation of collection with "." (ATL just crash)
		
		if ( t instanceof Metaclass ) {
			MetamodelHelper mm = (MetamodelHelper) ((Metaclass) t).getMetamodelRef();
			// mm.getFeatureType()
			// TODO: May be metaclass needs to carry the meta-model name
			
			
			
		} else {
			throw new UnsupportedOperationException();
		}
		
		/*
 * 		t       = type[self.source]		

		// This only works because the pattern module is at the beginning... 
		// (otherwise, it returns an empty collection (QoolTransformationBase access the queue to retrieve the objects))
		helpers    = atl_patterns!AttributeHelper.all_instances.select { |h| h.feature.name.eq(self.name) }
		operations = atl_patterns!OperationHelper.all_instances.select { |h| h.feature.name.eq(self.name) }

		ft = self.featureType(t, helpers, operations)
		// I am not passing the types of the helpers... So it is important to provide accurate return types

		// Get the navigated feature, cached by featureType
		navFeature[self] <- self.getLastNavigatedFeature
		//match ft
		//case EDataType => 
		//case EClass    =>
		//end

		type[self] <- ft
		
 */
	}
	
	// 
	// Literal values
	// 
	
	@Override
	public void inStringExp(StringExp obj) {
		linkType(typ.newStringType());
	}

	@Override
	public void inIntegerExp(IntegerExp obj) {
		linkType(typ.newIntegerType());
	}

	@Override
	public void inRealExp(RealExp obj) {
		linkType(typ.newFloatType());
	}

	@Override
	public void inOclUndefinedExp(OclUndefinedExp obj) {
		linkType(typ.newOclUndefinedType());		
	};
	
	
	
	//
	// Utilities
	//
	
	private void linkType(Type t) {
		ExpressionAnnotation ann = typ.createExpressionAnnotation();
		ann.setExpr(getCurrent().original_());
		ann.setType(t);
	
		typeAttr.put(getCurrent(), t);
	}
	
	private Type typeOf(ATLModelBaseObjectInterface obj) {
		Type t = typeAttr.get(obj);
		if ( t == null ) throw new IllegalStateException();
		return t;
	}

}
