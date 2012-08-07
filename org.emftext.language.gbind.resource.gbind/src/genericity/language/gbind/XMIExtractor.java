package genericity.language.gbind;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.emftext.language.gbind.resource.gbind.mopp.GbindResourceFactory;

public class XMIExtractor {
	public static void main(String[] args) throws IOException {

		String inputFile = args[0];
		String outputFile = args[1];

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				"gbind", new GbindResourceFactory());

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				Resource.Factory.Registry.DEFAULT_EXTENSION,
				new XMIResourceFactoryImpl());

		ResourceSet rs = new ResourceSetImpl();

		Resource dslResource = rs.getResource(URI.createFileURI(inputFile),
				true);

		Resource xmiResource = rs.createResource(URI.createFileURI(outputFile));

		// transfer content from XMI to DSL resource
		xmiResource.getContents().addAll(dslResource.getContents());

		// save the dsl resource (this will automatically use the <DSL>Printer)
		xmiResource.save(null);
	}

	
	
	/*
	 * // If you work outside Eclipse, you first have to register the different
	 * // resource factories with EMF:
	 * 
	 * //register <DSL>ResourceFactory for "dslExtension" file extension
	 * Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap(
	 * ).put("dslExtension", new <DSL>ResourceFactory());
	 * 
	 * //register XMI resource factory for all other extensions
	 * Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap(
	 * ).put(Resource.Factory.Registry.DEFAULT_EXTENSION, new
	 * XMIResourceFactoryImpl());
	 * 
	 * // Then you can load and save resources in the different // formats using
	 * a resource set: ResourceSet rs = new ResourceSetImpl();
	 * 
	 * //load xmi resource Resource xmiResource = rs.getResource(
	 * URI.createFileURI("MyFile.xmi"),true);
	 * 
	 * //create an empty DSL resource (will be an instance of <DSL>Resource)
	 * Resource dslResource = rs.createResource(
	 * URI.createFileURI("FileToPrintTo.dslExtension"));
	 * 
	 * //transfer content from XMI to DSL resource
	 * dslResource.getContents().addAll(xmiResource.getContents());
	 * 
	 * //save the dsl resource (this will automatically use the <DSL>Printer)
	 * dslResource.save(null);
	 */
}
