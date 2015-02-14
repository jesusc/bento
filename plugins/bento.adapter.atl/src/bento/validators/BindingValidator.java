package bento.validators;

import gbind.dsl.HelperParameter;
import gbind.dsl.LocalHelper;
import gbind.dsl.MetamodelDeclaration;
import gbind.simpleocl.AddOpCallExp;
import gbind.simpleocl.BooleanExp;
import gbind.simpleocl.BooleanType;
import gbind.simpleocl.CollectionOperationCall;
import gbind.simpleocl.EnumLiteralExp;
import gbind.simpleocl.EqOpCallExp;
import gbind.simpleocl.IfExp;
import gbind.simpleocl.IntOpCallExp;
import gbind.simpleocl.IntegerExp;
import gbind.simpleocl.IntegerType;
import gbind.simpleocl.IterateExp;
import gbind.simpleocl.Iterator;
import gbind.simpleocl.IteratorExp;
import gbind.simpleocl.LetExp;
import gbind.simpleocl.LocalVariable;
import gbind.simpleocl.MulOpCallExp;
import gbind.simpleocl.NavigationOrAttributeCall;
import gbind.simpleocl.NotOpCallExp;
import gbind.simpleocl.OclAnyType;
import gbind.simpleocl.OclExpression;
import gbind.simpleocl.OclModelElementExp;
import gbind.simpleocl.OclUndefinedExp;
import gbind.simpleocl.OperationCall;
import gbind.simpleocl.OperatorCallExp;
import gbind.simpleocl.PropertyCall;
import gbind.simpleocl.PropertyCallExp;
import gbind.simpleocl.RealExp;
import gbind.simpleocl.RealType;
import gbind.simpleocl.RelOpCallExp;
import gbind.simpleocl.SelfExp;
import gbind.simpleocl.SequenceExp;
import gbind.simpleocl.StringExp;
import gbind.simpleocl.StringType;
import gbind.simpleocl.TupleExp;
import gbind.simpleocl.VariableExp;

import java.util.HashMap;
import java.util.function.BiFunction;
import java.util.function.Function;

import org.eclipse.emf.ecore.EObject;

import anatlyzer.atl.model.ATLModel;
import anatlyzer.atlext.ATL.ATLFactory;
import anatlyzer.atlext.ATL.ContextHelper;
import anatlyzer.atlext.OCL.CollectionOperationCallExp;
import anatlyzer.atlext.OCL.NavigationOrAttributeCallExp;
import anatlyzer.atlext.OCL.OCLFactory;
import anatlyzer.atlext.OCL.OclContextDefinition;
import anatlyzer.atlext.OCL.OclFeatureDefinition;
import anatlyzer.atlext.OCL.OclModel;
import anatlyzer.atlext.OCL.OclModelElement;
import anatlyzer.atlext.OCL.OclType;
import anatlyzer.atlext.OCL.Operation;
import anatlyzer.atlext.OCL.OperationCallExp;
import anatlyzer.atlext.OCL.Parameter;
import anatlyzer.atlext.OCL.TuplePart;
import anatlyzer.atlext.OCL.VariableDeclaration;
import bento.adapter.atl.util.TPat;
import bento.adapter.gbind.visitors.GBindVisitor;


/**
 * This visitor transforms an OCL expression in the GBind format to the
 * ATL format. 
 * 
 * @author jesus
 *
 */
public class BindingValidator extends GBindVisitor {

	private ATLModel atlModel;
	private String currentMetamodel;

	public BindingValidator(ATLModel atlModel, String currentMetamodel) {
		this.atlModel = atlModel;
		this.currentMetamodel = currentMetamodel;
	}
	
}
