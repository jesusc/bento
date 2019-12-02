package bento.sirius.tests;

import java.io.File;
import java.io.FileOutputStream;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.sirius.diagram.description.DiagramDescription;
import org.eclipse.sirius.diagram.description.NodeMapping;
import org.eclipse.sirius.viewpoint.description.tool.ToolEntry;
import org.junit.BeforeClass;
import org.junit.Test;

import bento.sirius.adapter.EMFMetamodel;
import bento.sirius.adapter.SiriusModel;
import bento.sirius.adapter.bindingmodel.SiriusBindingModel;
import bento.sirius.adapter2.SiriusAdapter2;
import bento.sirius.adapter2.SiriusBindingValidator;
import bento.sirius.adapter2.SiriusBindingValidator.ValidationReport;

/**
 * This tests the adapter using a binding model based on links to
 * the odesign.
 * 
 * See SiriusBindingModel
 * 
 * @author jesus
 */
public class TestSiriusAdapter2 extends AbstractSiriusTest {

    @BeforeClass
    public static void setUpWorskpace() throws CoreException {
    	importProject(new File("."), "bento.sirius.tests");
    	importProject(new File("../bento.sirius.tests.metamodels"), "bento.sirius.tests.metamodels");
    }
	
    @Test
    public void testFTA() throws Exception {
        TestData data = t(catalogue("fault-tree-analysis/com.dsml.fta.design/description/FTdesign.odesign"), 
        		catalogue("fault-tree-analysis/com.dsml.fta.design/models/fta-example-1.xmi"));
        
        EMFMetamodel concrete = loadMetamodel(new File(concrete("com.fta.example.metamodel/model/concrete-running.ecore")));
		SiriusModel sirius = loadODesign(new File(data.getOdesign()));
		EMFMetamodel original = sirius.getMetamodel();

		/* Concrete meta-elements */
        EClass fta = concrete.findEClass("FaultTree");
        EReference ftElements_concrete = (EReference) fta.getEStructuralFeature("ftElements");
        EClass andGate = concrete.findEClass("AND_gate");
		EClass orGate = concrete.findEClass("OR_gate");
		EClass undevelopedEvent = concrete.findEClass("UndeveloppedEvenet");
		EClass intermediateEvent = concrete.findEClass("IntermediateEvent");
		EClass basicEvent = concrete.findEClass("BasicEvent");
		EClass externalEvent = concrete.findEClass("ExternalEvent");        

		/* Concept meta-elements */
        EClass fta_concept = original.findEClass("FTAModel");
		EReference gates_original = (EReference) fta_concept.getEStructuralFeature("gates");
		EReference events_original = (EReference) fta_concept.getEStructuralFeature("events");

		
		// NodeMapping eventNode = sirius.findNodeById("EventNode");
		NodeMapping concept_gateNode = sirius.findNodeById("GateNode");
		NodeMapping concept_basicEventNode = sirius.findNodeById("Basic Event");
		NodeMapping concept_conditioningEventNode = sirius.findNodeById("Conditioning Event");
		NodeMapping concept_intermediateEventNode = sirius.findNodeById("Intermediate");
		NodeMapping concept_undeveloppedEventNode = sirius.findNodeById("Undevelopped");
		NodeMapping concept_externalEventNode = sirius.findNodeById("External Event");
		
		ToolEntry andGateTool = sirius.findToolById("AND Gate");
		ToolEntry orGateTool = sirius.findToolById("OR Gate");
		ToolEntry basicEventTool = sirius.findToolById("Basic Event");
		ToolEntry intermediateEventTool = sirius.findToolById("Intemediate Event");
		ToolEntry undeveloppedEventTool = sirius.findToolById("Undeveleped Event");
		ToolEntry conditioningEventTool = sirius.findToolById("Conditionning Event");
		ToolEntry externalEventTool = sirius.findToolById("External Event");

		ToolEntry exclusiveOrGateTool = sirius.findToolById("Exclusive OR Gate");
		ToolEntry priorityAndGateTool = sirius.findToolById("Priority AND Gate");
		ToolEntry enhibitGateTool = sirius.findToolById("Enhibit  Gate");		
		
		NodeMapping basicEventNode = sirius.findNodeById("Basic Event");
		NodeMapping conditioningEventNode = sirius.findNodeById("Conditioning Event");
		NodeMapping intermediateEventNode = sirius.findNodeById("Intermediate");
		NodeMapping undevelopedEventNode = sirius.findNodeById("Undevelopped");
		NodeMapping externalEventNode = sirius.findNodeById("External Event");
		
		SiriusBindingModel model = new SiriusBindingModel(sirius, original, concrete);
		
		DiagramDescription root = sirius.findRoot("Fault Tree Diagram");
		model.setRootBinding(fta, root);
		
		model.addClassBinding(andGate, concept_gateNode, 1);
		model.addClassBinding(orGate, concept_gateNode, 0);
		model.addClassBinding(basicEvent, basicEventNode);
		model.addClassBinding(intermediateEvent, intermediateEventNode);
		model.addClassBinding(undevelopedEvent, undevelopedEventNode);
		model.addClassBinding(externalEvent, externalEventNode);
		
		
		
		model.addFeatureBinding(gates_original, andGate, "self.ftElements->filter(running_fta::Gate))");
		model.addFeatureBinding(gates_original, orGate, "self.ftElements->filter(running_fta::Gate))");
		
		model.addFeatureBinding(events_original, basicEvent, "self.ftElements->filter(running_fta::Event))");
		model.addFeatureBinding(events_original, intermediateEvent, "self.ftElements->filter(running_fta::Event))");
		model.addFeatureBinding(events_original, undevelopedEvent, "self.ftElements->filter(running_fta::Event))");
		model.addFeatureBinding(events_original, externalEvent, "self.ftElements->filter(running_fta::Event))");
		
		model.addNoneBinding(concept_gateNode, 2);
		model.addNoneBinding(concept_gateNode, 3);
		model.addNoneBinding(concept_gateNode, 4);
		model.addNoneBinding(concept_gateNode, 5);
		model.addNoneBinding(concept_gateNode, 6);
		model.addNoneBinding(concept_gateNode, 7);
		model.addNoneBinding(conditioningEventNode);
		
		model.addToolBinding(andGateTool, concept_gateNode, 1);
		model.addToolBinding(orGateTool, concept_gateNode, 0);
		model.addToolBinding(basicEventTool, concept_basicEventNode);
		model.addToolBinding(intermediateEventTool, concept_intermediateEventNode);
		model.addToolBinding(undeveloppedEventTool, concept_undeveloppedEventNode);
		model.addToolBinding(conditioningEventTool, concept_conditioningEventNode);
		model.addToolBinding(externalEventTool, concept_externalEventNode);
		
		model.addNoneToolBinding(exclusiveOrGateTool);
		model.addNoneToolBinding(priorityAndGateTool);
		model.addNoneToolBinding(enhibitGateTool);
		
		
		ValidationReport report = new SiriusBindingValidator(model).validate();
		if (report.getErrors().size() > 0) {
			report.getErrors().forEach(System.out::println);
		}
		
		
		SiriusAdapter2 adapter = new SiriusAdapter2(model);
		adapter.execute();
		
		save(sirius.getResource(), new File("test-outputs/sirius2.fta.odesign"));
    }
    
    private void save(Resource resource, File file) throws Exception {
		resource.save(new FileOutputStream(file), null);
	}

	private SiriusModel loadODesign(@NonNull File file) {
    	ResourceSet rs = new ResourceSetImpl();
		Resource r = rs.getResource(URI.createFileURI(file.getAbsolutePath()), true);
		return new SiriusModel(r);
    }
    
    private EMFMetamodel loadMetamodel(@NonNull File file) {
    	ResourceSet rs = new ResourceSetImpl();
		Resource r = rs.getResource(URI.createFileURI(file.getAbsolutePath()), true);
		return new EMFMetamodel(r);
    }
    
}
