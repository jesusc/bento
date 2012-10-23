/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gcomponent.resource.gcomponent.util;

/**
 * This class provides basic infrastructure to interpret models. To implement
 * concrete interpreters, subclass this abstract interpreter and override the
 * interprete_* methods. The interpretation can be customized by binding the two
 * type parameters (ResultType, ContextType). The former is returned by all
 * interprete_* methods, while the latter is passed from method to method while
 * traversing the model. The concrete traversal strategy can also be exchanged.
 * One can use a static traversal strategy by pushing all objects to interpret on
 * the interpretation stack (using addObjectToInterprete()) before calling
 * interprete(). Alternatively, the traversal strategy can be dynamic by pushing
 * objects on the interpretation stack during interpretation.
 */
public class AbstractGcomponentInterpreter<ResultType, ContextType> {
	
	private java.util.Stack<org.eclipse.emf.ecore.EObject> interpretationStack = new java.util.Stack<org.eclipse.emf.ecore.EObject>();
	private java.util.List<genericity.language.gcomponent.resource.gcomponent.IGcomponentInterpreterListener> listeners = new java.util.ArrayList<genericity.language.gcomponent.resource.gcomponent.IGcomponentInterpreterListener>();
	private org.eclipse.emf.ecore.EObject nextObjectToInterprete;
	private Object currentContext;
	
	public ResultType interprete(ContextType context) {
		ResultType result = null;
		org.eclipse.emf.ecore.EObject next = null;
		currentContext = context;
		while (!interpretationStack.empty()) {
			try {
				next = interpretationStack.pop();
			} catch (java.util.EmptyStackException ese) {
				// this can happen when the interpreter was terminated between the call to empty()
				// and pop()
				break;
			}
			nextObjectToInterprete = next;
			notifyListeners(next);
			result = interprete(next, context);
			if (!continueInterpretation(context, result)) {
				break;
			}
		}
		currentContext = null;
		return result;
	}
	
	/**
	 * Override this method to stop the overall interpretation depending on the result
	 * of the interpretation of a single model elements.
	 */
	public boolean continueInterpretation(ContextType context, ResultType result) {
		return true;
	}
	
	public ResultType interprete(org.eclipse.emf.ecore.EObject object, ContextType context) {
		ResultType result = null;
		if (object instanceof genericity.language.gcomponent.Specification) {
			result = interprete_genericity_language_gcomponent_Specification((genericity.language.gcomponent.Specification) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof genericity.language.gcomponent.Parameter) {
			result = interprete_genericity_language_gcomponent_Parameter((genericity.language.gcomponent.Parameter) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof genericity.language.gcomponent.Concept) {
			result = interprete_genericity_language_gcomponent_Concept((genericity.language.gcomponent.Concept) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof genericity.language.gcomponent.Tag) {
			result = interprete_genericity_language_gcomponent_Tag((genericity.language.gcomponent.Tag) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof genericity.language.gcomponent.Metamodel) {
			result = interprete_genericity_language_gcomponent_Metamodel((genericity.language.gcomponent.Metamodel) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof genericity.language.gcomponent.OclConstraint) {
			result = interprete_genericity_language_gcomponent_OclConstraint((genericity.language.gcomponent.OclConstraint) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof genericity.language.gcomponent.Constraint) {
			result = interprete_genericity_language_gcomponent_Constraint((genericity.language.gcomponent.Constraint) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof genericity.language.gcomponent.TransformationComponent) {
			result = interprete_genericity_language_gcomponent_TransformationComponent((genericity.language.gcomponent.TransformationComponent) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof genericity.language.gcomponent.Tagged) {
			result = interprete_genericity_language_gcomponent_Tagged((genericity.language.gcomponent.Tagged) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof genericity.language.gcomponent.NamedElement) {
			result = interprete_genericity_language_gcomponent_NamedElement((genericity.language.gcomponent.NamedElement) object, context);
		}
		if (result != null) {
			return result;
		}
		return result;
	}
	
	public ResultType interprete_genericity_language_gcomponent_NamedElement(genericity.language.gcomponent.NamedElement object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_genericity_language_gcomponent_Tagged(genericity.language.gcomponent.Tagged object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_genericity_language_gcomponent_TransformationComponent(genericity.language.gcomponent.TransformationComponent object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_genericity_language_gcomponent_Constraint(genericity.language.gcomponent.Constraint object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_genericity_language_gcomponent_OclConstraint(genericity.language.gcomponent.OclConstraint object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_genericity_language_gcomponent_Metamodel(genericity.language.gcomponent.Metamodel object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_genericity_language_gcomponent_Tag(genericity.language.gcomponent.Tag object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_genericity_language_gcomponent_Concept(genericity.language.gcomponent.Concept object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_genericity_language_gcomponent_Parameter(genericity.language.gcomponent.Parameter object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_genericity_language_gcomponent_Specification(genericity.language.gcomponent.Specification object, ContextType context) {
		return null;
	}
	
	private void notifyListeners(org.eclipse.emf.ecore.EObject element) {
		for (genericity.language.gcomponent.resource.gcomponent.IGcomponentInterpreterListener listener : listeners) {
			listener.handleInterpreteObject(element);
		}
	}
	
	/**
	 * Adds the given object to the interpretation stack. Attention: Objects that are
	 * added first, are interpret last.
	 */
	public void addObjectToInterprete(org.eclipse.emf.ecore.EObject object) {
		interpretationStack.push(object);
	}
	
	/**
	 * Adds the given collection of objects to the interpretation stack. Attention:
	 * Collections that are added first, are interpret last.
	 */
	public void addObjectsToInterprete(java.util.Collection<? extends org.eclipse.emf.ecore.EObject> objects) {
		for (org.eclipse.emf.ecore.EObject object : objects) {
			addObjectToInterprete(object);
		}
	}
	
	/**
	 * Adds the given collection of objects in reverse order to the interpretation
	 * stack.
	 */
	public void addObjectsToInterpreteInReverseOrder(java.util.Collection<? extends org.eclipse.emf.ecore.EObject> objects) {
		java.util.List<org.eclipse.emf.ecore.EObject> reverse = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>(objects.size());
		reverse.addAll(objects);
		java.util.Collections.reverse(reverse);
		addObjectsToInterprete(reverse);
	}
	
	/**
	 * Adds the given object and all its children to the interpretation stack such
	 * that they are interpret in top down order.
	 */
	public void addObjectTreeToInterpreteTopDown(org.eclipse.emf.ecore.EObject root) {
		java.util.List<org.eclipse.emf.ecore.EObject> objects = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>();
		objects.add(root);
		java.util.Iterator<org.eclipse.emf.ecore.EObject> it = root.eAllContents();
		while (it.hasNext()) {
			org.eclipse.emf.ecore.EObject eObject = (org.eclipse.emf.ecore.EObject) it.next();
			objects.add(eObject);
		}
		addObjectsToInterpreteInReverseOrder(objects);
	}
	
	public void addListener(genericity.language.gcomponent.resource.gcomponent.IGcomponentInterpreterListener newListener) {
		listeners.add(newListener);
	}
	
	public boolean removeListener(genericity.language.gcomponent.resource.gcomponent.IGcomponentInterpreterListener listener) {
		return listeners.remove(listener);
	}
	
	public org.eclipse.emf.ecore.EObject getNextObjectToInterprete() {
		return nextObjectToInterprete;
	}
	
	public java.util.Stack<org.eclipse.emf.ecore.EObject> getInterpretationStack() {
		return interpretationStack;
	}
	
	public void terminate() {
		interpretationStack.clear();
	}
	
	public Object getCurrentContext() {
		return currentContext;
	}
	
}
