package genericity.compiler.atl.api;

import java.io.IOException;
import java.util.ArrayList;

import org.eclectic.modeling.emf.BasicEMFModel;
import org.eclectic.modeling.emf.EMFLoader;
import org.eclipse.emf.ecore.EPackage;
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
			ArrayList<EPackage> pkgs = new ArrayList<EPackage>();
			pkgs.add(gbind.dsl.DslPackage.eINSTANCE);
			pkgs.add(gbind.simpleocl.SimpleoclPackage.eINSTANCE);
			return loader.basicModelFromMemory(pkgs, resource);
		}		
	}

	
	public static class FileBased implements BindingModelLoader {
		private String fileName;
		public FileBased(String f) {
			this.fileName = f;
		}
		
		@Override
		public BasicEMFModel load(EMFLoader loader) throws IOException {
			ArrayList<EPackage> pkgs = new ArrayList<EPackage>();
			pkgs.add(gbind.dsl.DslPackage.eINSTANCE);
			pkgs.add(gbind.simpleocl.SimpleoclPackage.eINSTANCE);

			return loader.basicModelFromFile(pkgs, fileName);
		}		
	}

}
