package bento.sirius.adapter;

import anatlyzer.atl.errors.ProblemStatus;
import anatlyzer.atl.util.AnalyserUtils;
import anatlyzer.atl.witness.ConstraintSatisfactionChecker;
import efinder.aql.AqlFinder;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.diagram.description.AbstractNodeMapping;
import org.eclipse.sirius.diagram.description.NodeMapping;
import org.eclipse.sirius.viewpoint.description.tool.ToolEntry;

/**
 * 
 * Looks for sirius elements whose pre-conditions are not satisfiable
 * and removes them. As a side effect, it removes tool elements associated
 * to such removed elements.
 * 
 * @author jesus
 *
 */
public class SiriusCleaner {

	private SiriusModel siriusModel;
	private Collection<? extends EPackage> packages;

	public SiriusCleaner(SiriusModel siriusModel, Collection<? extends EPackage> packages) {
		this.siriusModel = siriusModel;
		this.packages = packages;
	}

	public void perform() {
		List<AbstractNodeMapping> mappings = siriusModel.allInstancesOf(AbstractNodeMapping.class);
		for (AbstractNodeMapping m : mappings) {
			String precondition = m.getPreconditionExpression();
			if (precondition != null && ! precondition.trim().isEmpty()) {
				if (!isSat(precondition)) {
					
					EObject root = siriusModel.getResource().getContents().get(0);					
					Collection<Setting> settings = EcoreUtil.UsageCrossReferencer.find(m, root);
					
					// Remove relevant references.
					for(Setting s : settings) {						
						ToolEntry tool = SiriusUtils.getContainer(ToolEntry.class, s.getEObject());
						if (tool != null) {
							EcoreUtil.delete(tool);
						}
					}
					
					System.out.println("Deleted: " + m);
					EcoreUtil.delete(m);
				}
			}
		}
	}

	private boolean isSat(String precondition) {
		AqlFinder finder = new AqlFinder(packages).
				withExpression(precondition);
		
		ProblemStatus r = finder.check();
		if (AnalyserUtils.isErrorStatus(r)) {
			// We don't know, so we are conservative
			return true;
		} else if (AnalyserUtils.isConfirmed(r)) {
			return true;
		} else if (AnalyserUtils.isDiscarded(r)) {
			return false;
		}
		
		throw new IllegalStateException("Unknown result: " + r);
	}

}
