package bento.validators;

import gbind.dsl.BindingModel;
import gbind.dsl.ClassBinding;
import gbind.dsl.ConceptMetaclass;
import gbind.dsl.HelperParameter;
import gbind.dsl.LocalHelper;
import gbind.dsl.MetamodelDeclaration;
import gbind.dsl.VirtualClassBinding;
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

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EClass;
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
 * Validates a binding against the source and target meta-models.
 * 
 * Limitation: it should also validate the binding agains the template
 * 
 * @author jesus
 *
 */
public class BindingValidator extends GBindVisitor {

	private BindingModel model;
	private HashMap<String, EClass> classes;
	private List<EClass> toCover;

	private List<BindingValidationProblem> problems;
	
	public BindingValidator(BindingModel model) {
		// this.atlModel = atlModel;
		// this.currentMetamodel = currentMetamodel;
		this.model = model;

		bento.binding.utils.BindingModel util = new bento.binding.utils.BindingModel(model.eResource());

		classes = util.getConceptClasses();
		toCover = classes.values().stream().filter(c -> ! c.isAbstract()).collect(Collectors.toList());
	}
	
	public List<BindingValidationProblem> perform() {
		startVisiting(model);

		problems = new ArrayList<BindingValidationProblem>();
		for (EClass eClass : toCover) {
			problems.add(new MissingBinding("Missing binding for " + eClass.getName(), eClass));
		}		
		
		return problems;
	}
	
	public List<BindingValidationProblem> getProblems() {
		return problems;
	}
	
	@Override
	public void inClassBinding(ClassBinding self) {
		processClass(self.getConcept());
	}

	private void processClass(ConceptMetaclass conceptMetaclass) {
		EClass c = classes.get(conceptMetaclass.getName());
		EClass remove = null;
		for (EClass eClass : toCover) {
			if ( c == eClass || c.isSuperTypeOf(eClass) ) {
				remove = eClass;
			}
		}
		
		if ( remove != null ) {
			toCover.remove(remove);
		}
	}
	
	@Override
	public void inVirtualClassBinding(VirtualClassBinding self) {
		processClass(self.getConcept());
	}
	
	public static class MissingBinding extends BindingValidationProblem {
		private EClass klass;

		public MissingBinding(String message, EClass klass) {
			super(message);
			this.klass = klass;
		}

		public EClass getKlass() {
			return klass;
		}
	}

}
