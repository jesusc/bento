package bento.validators;

import gbind.dsl.BindingModel;
import gbind.dsl.ConceptMetaclass;
import gbind.dsl.ConcreteMetaclass;
import gbind.dsl.MetamodelDeclaration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import bento.adapter.gbind.visitors.GBindVisitor;

/**
 * Validates a binding against the source and target meta-models.
 * 
 * Limitation: it should also validate the binding agains the template
 * 
 * @author jesus
 *
 */
public class BindingMetamodelConformanceValidator extends GBindVisitor {

	private BindingModel model;
	private HashMap<String, EClass> conceptClasses;
	private HashMap<String, EClass> concreteClasses;

	// private ATLModel atlModel;
	// private String currentMetamodel;

	private List<ValidationProblem> problems = new ArrayList<ValidationProblem>();

	public BindingMetamodelConformanceValidator(BindingModel model) {
		// this.atlModel = atlModel;
		// this.currentMetamodel = currentMetamodel;
		this.model = model;

		bento.binding.utils.BindingModel util = new bento.binding.utils.BindingModel(model.eResource());
		this.conceptClasses = util.getConceptClasses();
		this.concreteClasses = util.getConcreteClasses();
	}

	public List<ValidationProblem> getProblems() {
		return Collections.unmodifiableList(problems);
	}

	public void perform() {
		startVisiting(model);
	}

	public void perform(EObject obj) {
		startVisiting(obj);
	}
	
	@Override
	public void inConceptMetaclass(ConceptMetaclass self) {
		if (!conceptClasses.containsKey(self.getName())) {
			problems.add(new ValidationProblem("Class " + self.getName()
					+ " not found in concept", self));
		}
	}

	@Override
	public void inConcreteMetaclass(ConcreteMetaclass self) {
		if (!concreteClasses.containsKey(self.getName())) {
			problems.add(new ValidationProblem("Class " + self.getName()
					+ " not found in meta-model", self));
		}
	}

	public static class ValidationProblem extends BindingValidationProblem {
		private EObject element;

		public ValidationProblem(String message, EObject element) {
			super(message);
			this.element = element;
		}

		public EObject getElement() {
			return element;
		}
	}
}
