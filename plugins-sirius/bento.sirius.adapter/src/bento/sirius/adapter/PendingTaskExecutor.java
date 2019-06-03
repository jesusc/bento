package bento.sirius.adapter;

import java.util.function.Consumer;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.sirius.diagram.description.DiagramElementMapping;

public interface PendingTaskExecutor {

	public <T extends EObject> void add(T obj, Consumer<T> consumer);
	

	public Trace<DiagramElementMapping, DiagramElementMapping> getMappings();


	public void removeElement (@NonNull EObject obj);
}
