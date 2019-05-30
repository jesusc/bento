package com.odesign.generator.ui.popusmenu;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionDelegate;

import com.odesign.generator.ui.Activator;
import com.odesign.generator.ui.common.GenerateAll;




public class MetamodelGenerator extends ActionDelegate implements IActionDelegate {
	/**
	 * Selected model files.
	 */
	protected List<IFile> files;

	/**{@inheritDoc}
	 *
	 * @see org.eclipse.ui.actions.ActionDelegate#selectionChanged(org.eclipse.jface.action.IAction, org.eclipse.jface.viewers.ISelection)
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			files = ((IStructuredSelection) selection).toList();
		}
	}
	
	/**{@inheritDoc}
	 *
	 * @see org.eclipse.ui.actions.ActionDelegate#run(org.eclipse.jface.action.IAction)
	 * @generated
	 */
	public void run(IAction action) {
		if (files != null) {
			IRunnableWithProgress operation = new IRunnableWithProgress() {
				public void run(IProgressMonitor monitor) {
					try {
						Iterator<IFile> filesIt = files.iterator();
						while (filesIt.hasNext()) {
							IFile model = (IFile)filesIt.next();
							String modelURI = model.getLocation().toString();
							IContainer targetFolder = null;
							try {
								IContainer target = model.getProject().getFolder("generated-odesign");
								targetFolder = target;
								GenerateAll generator = new GenerateAll(modelURI, targetFolder, getArguments());
								try {
									generator.doGenerate(monitor);
								} catch (InstantiationException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								} catch (IllegalAccessException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							} catch (IOException e) {
								IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
								Activator.getDefault().getLog().log(status);
							} finally {
								if (targetFolder != null) {
									targetFolder.getProject().refreshLocal(IResource.DEPTH_INFINITE, monitor);
								}
							}
						}
					} catch (CoreException e) {
						IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
						Activator.getDefault().getLog().log(status);
					}
				}
			};
			try {
				PlatformUI.getWorkbench().getProgressService().run(true, true, operation);
			} catch (InvocationTargetException e) {
				IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
				Activator.getDefault().getLog().log(status);
			} catch (InterruptedException e) {
				IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
				Activator.getDefault().getLog().log(status);
			}
		}
	}

	/**
	 * Computes the arguments of the generator.
	 * 
	 * @return the arguments
	 * @generated
	 */
	protected List<? extends Object> getArguments() {
		return new ArrayList<String>();
	}

}


