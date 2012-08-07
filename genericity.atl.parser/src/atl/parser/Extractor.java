package atl.parser;

import java.io.File;

import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IExtractor;
import org.eclipse.m2m.atl.core.IInjector;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFExtractor;
import org.eclipse.m2m.atl.core.emf.EMFInjector;
import org.eclipse.m2m.atl.core.emf.EMFModelFactory;
import org.eclipse.m2m.atl.engine.parser.AtlParser;

public class Extractor {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		if ( args.length < 3) 
			System.out.println("Usage: atl.parser.Extractor file input-dir outputdir");
		
		String file = args[0];
		String path = args[1];
		String outputPath = args[2];
		
		
		ModelFactory modelFactory = new EMFModelFactory();
		IReferenceModel atlMetamodel = modelFactory.getBuiltInResource("ATL.ecore"); //$NON-NLS-1$
		IModel atlModel = modelFactory.newModel(atlMetamodel);
		
		EMFInjector injector = new EMFInjector();
		injector.inject(atlModel, Util.normalizePath(path + File.separator + file));
		
		String extractedFile = outputPath + File.separator + file + ".atl";
		AtlParser atlParser = new AtlParser();
		atlParser.extract(atlModel, extractedFile);
		
		//atlParser.extract(atlModel, path + "java2uml.atl.xmi");
		System.out.println("Extracted in " + extractedFile);
	}

}
