package com.odesign.generator.ui.common;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;

import com.odesign.generator.ModelGenerator;

public class GenerateAllModel {

	private String modelURI;
	private IContainer targetFolder;

	/**
	 * Constructor.
	 * 
	 * @param              modelURI, IContainer ta
	 * 
	 * @param modelURI2    is the URI of the model.
	 * @param targetFolder is the output folder
	 * @param arguments    are the other arguments
	 * @throws IOException Thrown when the output cannot be saved.
	 * @generated
	 */
	public GenerateAllModel(String modelURI, IContainer targetFolder, List<? extends Object> arguments) {
		this.modelURI = modelURI;
		this.targetFolder = targetFolder;

	}

	/**
	 * Launches the generation.
	 *
	 * @param monitor This will be used to display progress information to the user.
	 * @throws IOException            Thrown when the output cannot be saved.
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 */

	public void doGenerateModel(IProgressMonitor monitor, EPackage ep)
			throws IOException, InstantiationException, IllegalAccessException {
		if (!targetFolder.getLocation().toFile().exists()) {
			targetFolder.getLocation().toFile().mkdirs();
		}

		monitor.subTask("Loading Model...");
		System.out.println("\"generated-model\"");
		System.out.println(this.targetFolder.getLocation().toFile());
		new ModelGenerator(this.modelURI, targetFolder.getLocation().toFile(), ep);
		monitor.worked(1);

	}
}