package bento.sirius.adapter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.junit.Test;

import bento.sirius.adapter.SiriusAdapter.Result;

public class SiriusAdapterTest {
	
	@Test
	public void test() throws FileNotFoundException, IOException {
		String fileName = exampleURI("statemachine/bento.sirius.activities.design/description/flow_concept.odesign");
		String gbind    = exampleURI("statemachine/bento.sirius.stepeasy.design/bindings/stepeasy2workflow.gbind");
		String output   = "statemachine/bento.sirius.stepeasy.design/test-outputs/stepeasy.odesign";
		
		SiriusAdapter adapter = new SiriusAdapter(fileName, gbind, "WORKFLOW");		
		
		// Validate before
		validate(adapter);
		RUN:
		{
			Result r = adapter.perform();
			saveTo(r, example(output));
		}
		// Validate after
		validate(adapter);
		
		System.out.println("Odesign created!");
	}

	private void saveTo(Result r, String output) throws FileNotFoundException, IOException {
		File f = new File(output);
		System.out.println("Saving: " + output);
		f.getParentFile().mkdirs();
		r.getSiriusResource().save(new FileOutputStream(output), null);
	}

	private void validate(SiriusAdapter adapter) {
		List<String> errors = new ArrayList<String>();
		for (EObject obj : adapter.getSiriusResource().getContents()) {
			Diagnostic diagnostic = Diagnostician.INSTANCE.validate(obj);
			
			check(diagnostic, errors);	
		}
		
		if ( ! errors.isEmpty() ) {
			String message = errors.stream().collect(Collectors.joining("\n"));
			throw new AssertionError(message);
		}
	}

	private void check(Diagnostic diagnostic, List<String> errors) {
		if ( diagnostic.getSeverity() == Diagnostic.ERROR ) {
			errors.add(diagnostic.getMessage());
			// throw new AssertionError();
		}
		
		diagnostic.getChildren().forEach(d -> check(d, errors));
	}

	private String example(String path) {
		String examplesDir = "/home/jesus/research/wakame/bento-sirius-experiment/examples";
		return examplesDir + "/" + path;
	}
	
	private String exampleURI(String path) {
		return "file:" + example(path);
	}

}