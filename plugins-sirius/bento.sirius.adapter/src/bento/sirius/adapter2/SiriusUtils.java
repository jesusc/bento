package bento.sirius.adapter2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.sirius.diagram.description.AbstractNodeMapping;
import org.eclipse.sirius.diagram.description.DiagramDescription;
import org.eclipse.sirius.diagram.description.DiagramElementMapping;
import org.eclipse.sirius.diagram.description.EdgeMapping;
import org.eclipse.sirius.diagram.description.NodeMapping;
import org.eclipse.sirius.diagram.description.util.DescriptionSwitch;

/**
 * Utility methods to deal with Sirius models. Also check SiriusModel for more
 * utility methods.
 * 
 * @author jesus
 *
 */
public class SiriusUtils {

	@NonNull
	public static String getRawClassName(@NonNull String siriusClassName) {
		if (! siriusClassName.contains("::")) {
			return siriusClassName;
		}
		return siriusClassName.substring(siriusClassName.lastIndexOf(":") + 1);
	}
	
	@NonNull
	public static String getRawPackageName(@NonNull String siriusClassName) {
		if (! siriusClassName.contains("::")) {
			throw new IllegalArgumentException();
		}
		return siriusClassName.substring(0, siriusClassName.lastIndexOf(":"));
	}
	
	@NonNull
	public static String toSiriusClassName(@NonNull EClass klass) {
		return klass.getEPackage().getName() + "::" + klass.getName();
	}
	
	@NonNull
	public static <T extends DiagramElementMapping> List<T> filter(@NonNull List<? extends T> mappings, Predicate<String> filter) {
		List<T> result = new ArrayList<T>();
		for (T m: mappings) {
			String domainClass = getDomainClass(m);
			if (filter.test(domainClass)) {
				result.add(m);
			}
		}
		return result;
	}
	
	public static String getClosestContainerClass(EObject nm_) {
		EObject container = nm_.eContainer();
		String containerClass = null;
		while ( container != null ) {
			if ( container instanceof DiagramDescription ) {
				containerClass = ((DiagramDescription) container).getDomainClass();
				break;
			} else if ( container instanceof AbstractNodeMapping ) {
				containerClass = ((AbstractNodeMapping) container).getDomainClass();
				break;
			}
			container = container.eContainer();
		}
		
		if ( containerClass == null )
			throw new IllegalStateException("Can't find proper container for " + nm_);		
	
		return containerClass;
	}

	private static final DomainClassSwitch DOMAIN_CLASS_SWITCH = new DomainClassSwitch();
	
	public static String getDomainClass(DiagramElementMapping mapping) {
		return DOMAIN_CLASS_SWITCH.doSwitch(mapping);
	}
	
	public static class DomainClassSwitch extends DescriptionSwitch<String> {
		@Override
		public String defaultCase(EObject object) {
			throw new UnsupportedOperationException("Domain class: " + object);
		}
		
		@Override
		public String caseNodeMapping(NodeMapping object) {
			return object.getDomainClass();
		}
		
		@Override
		public String caseEdgeMapping(EdgeMapping object) {
			return object.getDomainClass();
		}
		
		public String caseContainerMapping(org.eclipse.sirius.diagram.description.ContainerMapping object) {
			return object.getDomainClass();
		}
	}

	public static EClass getCommonDomainClass(List<? extends DiagramElementMapping> mappings, Function<String, EClass> classNameToEClass) {
		List<EClass> classes = new ArrayList<EClass>();
		for (DiagramElementMapping m : mappings) {
			EClass eclass = classNameToEClass.apply(getDomainClass(m));			
			classes.add(eclass);
		}

		if (classes.size() > 1) {
			throw new UnsupportedOperationException();
		}
		
		return classes.get(0);
	}

	public static String toAQLIdentifier(String id) {
		// return "\"" + id + "\"";
		return "_" + id;
	}

	protected static <T> T getContainer(Class<T> klass, EObject obj) {
		if ( obj == null ) {
			return null;
		} else if ( klass.isInstance(obj) ) {
			return klass.cast(obj);
		} else {
			return getContainer(klass, obj.eContainer());
		}
	}
	
	@SuppressWarnings("unchecked")
	public static <T> List<T> findChildren(EObject container, Predicate<EObject> predicate) {
		List<T> result = new ArrayList<T>();
		TreeIterator<EObject> it = container.eAllContents();
		while (it.hasNext()) {
			EObject obj = it.next();
			if (predicate.test(obj)) {
				result.add((T) obj);
			}
		}
		return result;
	}
}
