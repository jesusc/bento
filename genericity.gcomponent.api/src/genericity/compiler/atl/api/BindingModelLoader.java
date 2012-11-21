package genericity.compiler.atl.api;

import java.io.IOException;

import org.eclectic.modeling.emf.BasicEMFModel;
import org.eclectic.modeling.emf.EMFLoader;
import org.eclipse.emf.ecore.resource.Resource;

public interface BindingModelLoader {

	BasicEMFModel load(EMFLoader loader) throws IOException;

	
	public static class ResourceBased implements BindingModelLoader {
		private Resource resource;
		public ResourceBased(Resource r) {
			this.resource = r;
		}
		
		@Override
		public BasicEMFModel load(EMFLoader loader) throws IOException {
			return loader.basicModelFromMemory(gbind.dsl.DslPackage.eINSTANCE, resource);
		}		
	}

	
	public static class FileBased implements BindingModelLoader {
		private String fileName;
		public FileBased(String f) {
			this.fileName = f;
		}
		
		@Override
		public BasicEMFModel load(EMFLoader loader) throws IOException {
			return loader.basicModelFromFile(gbind.dsl.DslPackage.eINSTANCE, fileName);
		}		
	}

}
