package bento.sirius.adapter;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.description.AbstractNodeMapping;
import org.eclipse.sirius.diagram.description.DiagramDescription;
import org.eclipse.sirius.diagram.description.DiagramElementMapping;
import org.eclipse.sirius.diagram.description.EdgeMapping;
import org.eclipse.sirius.diagram.description.NodeMapping;
import org.eclipse.sirius.diagram.description.util.DescriptionSwitch;
import org.eclipse.sirius.diagram.util.DiagramSwitch;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;

/**
 * Utility methods to deal with Sirius models. Also check SiriusModel for more
 * utility methods.
 * 
 * @author jesus
 *
 */
public class SiriusUtils {

	public static String getRawClassName(String siriusClassName) {
		return siriusClassName.substring(siriusClassName.lastIndexOf(":") + 1);
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
			throw new AdapterError("Can't find proper container for " + nm_);		
	
		return containerClass;
	}

	private static final DomainClassSwitch DOMAIN_CLASS_SWITCH = new DomainClassSwitch();
	
	public static String getDomainClass(DiagramElementMapping mapping) {
		return DOMAIN_CLASS_SWITCH.doSwitch(mapping);
	}
	
	public static class DomainClassSwitch extends DescriptionSwitch<String> {
		@Override
		public String defaultCase(EObject object) {
			throw new UnsupportedOperationException();
		}
		
		@Override
		public String caseNodeMapping(NodeMapping object) {
			return object.getDomainClass();
		}
		
		@Override
		public String caseEdgeMapping(EdgeMapping object) {
			return object.getDomainClass();
		}
	}
	
}
