package bento.sirius.tests;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.sirius.diagram.description.NodeMapping;
import org.eclipse.sirius.viewpoint.description.tool.ToolEntry;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;

import bento.component.interpreter.TechnologyConfiguration;
import bento.language.bentocomp.technologies.TechnologiesPackage;
import bento.sirius.adapter.EMFMetamodel;
import bento.sirius.adapter.SiriusModel;
import bento.sirius.adapter.SiriusTemplateHandler;
import bento.sirius.adapter.bindingmodel.SiriusBindingModel;
import bento.sirius.adapter.bindingmodel.SiriusInformationModel;
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
        
        EClass andGate = concrete.findEClass("AND_gate");
		EClass orGate = concrete.findEClass("OR_gate");
        
		// NodeMapping eventNode = sirius.findNodeById("EventNode");
		NodeMapping gateNode = sirius.findNodeById("GateNode");
		ToolEntry andGateTool = sirius.findToolById("AND Gate");
		ToolEntry orGateTool = sirius.findToolById("OR Gate");
		
		SiriusBindingModel model = new SiriusBindingModel(sirius, concrete);
		model.addClassBinding(andGate, gateNode, 1);
		model.addClassBinding(orGate, gateNode, 0);
		model.addNoneBinding(gateNode, 2);
		model.addNoneBinding(gateNode, 3);
		model.addNoneBinding(gateNode, 4);
		model.addNoneBinding(gateNode, 5);
		model.addNoneBinding(gateNode, 6);
		model.addNoneBinding(gateNode, 7);
		
		SiriusInformationModel info = new SiriusInformationModel();		
		info.addToolMapping(andGateTool, gateNode);
		info.addToolMapping(orGateTool, gateNode);
		
		ValidationReport report = new SiriusBindingValidator(model, info).validate();
		if (report.getErrors().size() > 0) {
			report.getErrors().forEach(System.out::println);
		}
		
		
		SiriusAdapter2 adapter = new SiriusAdapter2(model, info);
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
