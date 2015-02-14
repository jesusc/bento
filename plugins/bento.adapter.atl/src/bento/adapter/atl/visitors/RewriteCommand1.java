package bento.adapter.atl.visitors;

import java.util.function.Consumer;

import org.eclipse.emf.ecore.EObject;

@FunctionalInterface
public interface RewriteCommand1<T extends EObject> extends Consumer<T>{

}
