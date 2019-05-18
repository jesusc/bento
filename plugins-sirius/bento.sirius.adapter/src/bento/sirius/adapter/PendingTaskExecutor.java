package bento.sirius.adapter;

import java.util.function.Consumer;

import org.eclipse.emf.ecore.EObject;

public interface PendingTaskExecutor {

	public <T extends EObject> void add(T obj, Consumer<T> consumer);
}
