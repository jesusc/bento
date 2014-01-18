/**
 * SISTEMA: Generador de Código Automático MDA
 * 
 * PAQUETE: eliop.pcci.perfil.ui.logs
 * 
 * COPYRIGHT CAF SIGNALLING
 */

package bento.componetization.ui;

import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

public class WorkspaceLogger
{
  private static final ILog LOGGER = Activator.getDefault().getLog();

  private static final String PLUGIN_ID = Activator.PLUGIN_ID;

  public static void generateLogEntry(int severidad, String mensaje)
  {
    openLogWiew();
    writeLog(severidad, mensaje);
  }

  public static void generateLogEntry(int severidad, Throwable excepcion)
  {
    String mensajeExcepcion = excepcion.getMessage();

    openLogWiew();
    writeLog(severidad, mensajeExcepcion);
  }

  private static void writeLog(int severidad, String mensaje)
  {
    IStatus estado = new Status(severidad, PLUGIN_ID, mensaje);
    LOGGER.log(estado);
  }

  private static void openLogWiew()
  {
    String mensajeExcepcion;

    try
    {
      PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
          .showView("org.eclipse.pde.runtime.LogView");
    }
    catch (PartInitException excepcion)
    {
      mensajeExcepcion = excepcion.getMessage();
      writeLog(IStatus.ERROR, mensajeExcepcion);
    }
  }// método abreVentanaLogError
}
