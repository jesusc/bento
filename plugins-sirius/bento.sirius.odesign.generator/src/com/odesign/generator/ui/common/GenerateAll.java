/*******************************************************************************
 * Copyright (c) 2008, 2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package com.odesign.generator.ui.common;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;

import com.odesign.generator.Generate;




public class GenerateAll {

	/**
	 * The model URI.
	 */
	private String modelURI;

	/**
	 * The output folder.
	 */
	private IContainer targetFolder;

	/**
	 * The other arguments.
	 */
	List<? extends Object> arguments;

	/**
	 * Constructor.
	 * 
	 * @param modelURI2
	 *            is the URI of the model.
	 * @param targetFolder
	 *            is the output folder
	 * @param arguments
	 *            are the other arguments
	 * @throws IOException
	 *             Thrown when the output cannot be saved.
	 * @generated
	 */
	public GenerateAll(String modelURI2, IContainer targetFolder, List<? extends Object> arguments) {
		this.modelURI = modelURI2;
		this.targetFolder = targetFolder;
		this.arguments = arguments;
		
		
	}

	/**
	 * Launches the generation.
	 *
	 * @param monitor
	 *            This will be used to display progress information to the user.
	 * @throws IOException
	 *             Thrown when the output cannot be saved.
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @generated
	 */
	public void doGenerate(IProgressMonitor monitor) throws IOException, InstantiationException, IllegalAccessException {
		if (!targetFolder.getLocation().toFile().exists()) {
			targetFolder.getLocation().toFile().mkdirs();
		}
		
		monitor.subTask("Loading...");
		System.out.println("---> target file iiis readyy !");
        Generate gen0 = new  Generate(modelURI, targetFolder.getLocation().toFile(), arguments);
		monitor.worked(1);

	
		
	}

}
