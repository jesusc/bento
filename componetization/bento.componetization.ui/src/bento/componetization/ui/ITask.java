package bento.componetization.ui;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.widgets.Display;

public interface ITask {
	public void run(IProgressMonitor monitor) throws Exception;
	public void guiAction() throws Exception;
	
	public static class Runner {
		public static void run(final ITask task) {
			IRunnableWithProgress op = new IRunnableWithProgress() {			
				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
					try {
						task.run(monitor);
					} catch (Throwable e) {
						e.printStackTrace();
						WorkspaceLogger.generateLogEntry(IStatus.ERROR, e);
					} finally {
						monitor.done();
					}
				}
			};
			
			try {
				new ProgressMonitorDialog(null).run(true, true, op);
				
				Display.getDefault().asyncExec(new Runnable() {
		              public void run() {
		            	  try {
							task.guiAction();
						} catch (Exception e) {
							e.printStackTrace();
							WorkspaceLogger.generateLogEntry(IStatus.ERROR, e);
						}
		              }
		        });				
				
			} catch (InvocationTargetException e) {
			} catch (InterruptedException e) {
			}			
		}
	}
}
