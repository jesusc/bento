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
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionDelegate;

import com.odesign.generator.ui.Activator;
import com.odesign.generator.ui.common.GenerateAll;
import com.odesign.generator.ui.common.GenerateAllModel;





public class MetamodelGenerator extends ActionDelegate implements IActionDelegate {
	/**
	 * Selected model files.
	 */
	protected List<IFile> files;
	protected EPackage ep;
	protected EPackage originalep;

	@SuppressWarnings("unchecked")
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			files = ((IStructuredSelection) selection).toList();
		}
	}
	

	
	
	public void run(IAction action) {
		if (files != null) {
			IRunnableWithProgress operation = new IRunnableWithProgress() {
				public void run(IProgressMonitor monitor) {
					
					List<IFile> listOdesignFiles= new ArrayList<>();
					List<IFile> listNonOdesignFiles= new ArrayList<>();
					List<IFile> listFiles= new ArrayList<>();
					for (IFile ifile:files) {
						
							listNonOdesignFiles.add(ifile);
							
						
						
					}
					for (IFile ifile:files) {
						if(ifile.getFileExtension().equals("odesign")) {
							listOdesignFiles.add(ifile);
							listNonOdesignFiles.remove(ifile);
							
						}
						
					}
					
					for (IFile ifile:listOdesignFiles) {
						listFiles.add(ifile);						
					}
					
					for (IFile ifile:listNonOdesignFiles) {
						listFiles.add(ifile);						
					}
					
					
					try {
						Iterator<IFile> filesIt = listFiles.iterator();
						while (filesIt.hasNext()) {
							IFile model = (IFile)filesIt.next();
							System.out.println(model.getFileExtension()+"  file uploaded");
							
							String modelURI = model.getLocation().toString();
							IContainer targetFolder = null;
							try {
								IContainer target = model.getProject().getFolder("generated-metamodel-and-odesign");
								targetFolder = target;
								
								
								try {
									if(model.getFileExtension().equals("odesign")) {
									GenerateAll generator = new GenerateAll();
									generator.doGenerate(modelURI, monitor, target, listFiles);
									ep=generator.getEPacakeg();
									originalep=generator.getOriginalEPackage();}
									
									else {
									
										GenerateAllModel generatemodel=new GenerateAllModel(modelURI, target);
										generatemodel.doGenerateModel(monitor,originalep,ep);
									}
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

	protected List<? extends Object> getArguments() {
		return new ArrayList<String>();
	}

}




