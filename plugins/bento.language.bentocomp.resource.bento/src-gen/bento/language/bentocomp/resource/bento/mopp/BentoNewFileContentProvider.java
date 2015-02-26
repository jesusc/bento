/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package bento.language.bentocomp.resource.bento.mopp;

public class BentoNewFileContentProvider {
	
	public bento.language.bentocomp.resource.bento.IBentoMetaInformation getMetaInformation() {
		return new bento.language.bentocomp.resource.bento.mopp.BentoMetaInformation();
	}
	
	public String getNewFileContent(String newFileName) {
		return getExampleContent(new org.eclipse.emf.ecore.EClass[] {
			bento.language.bentocomp.dsl.DslPackage.eINSTANCE.getDefinitionRoot(),
		}, getMetaInformation().getClassesWithSyntax(), newFileName);
	}
	
	protected String getExampleContent(org.eclipse.emf.ecore.EClass[] startClasses, org.eclipse.emf.ecore.EClass[] allClassesWithSyntax, String newFileName) {
		String content = "";
		for (org.eclipse.emf.ecore.EClass next : startClasses) {
			content = getExampleContent(next, allClassesWithSyntax, newFileName);
			if (content.trim().length() > 0) {
				break;
			}
		}
		return content;
	}
	
	protected String getExampleContent(org.eclipse.emf.ecore.EClass eClass, org.eclipse.emf.ecore.EClass[] allClassesWithSyntax, String newFileName) {
		// create a minimal model
		org.eclipse.emf.ecore.EObject root = new bento.language.bentocomp.resource.bento.util.BentoMinimalModelHelper().getMinimalModel(eClass, allClassesWithSyntax, newFileName);
		if (root == null) {
			// could not create a minimal model. returning an empty document is the best we
			// can do.
			return "";
		}
		// use printer to get text for model
		java.io.ByteArrayOutputStream buffer = new java.io.ByteArrayOutputStream();
		bento.language.bentocomp.resource.bento.IBentoTextPrinter printer = getPrinter(buffer);
		try {
			printer.print(root);
		} catch (java.io.IOException e) {
			new bento.language.bentocomp.resource.bento.util.BentoRuntimeUtil().logError("Exception while generating example content.", e);
		}
		return buffer.toString();
	}
	
	public bento.language.bentocomp.resource.bento.IBentoTextPrinter getPrinter(java.io.OutputStream outputStream) {
		return getMetaInformation().createPrinter(outputStream, new bento.language.bentocomp.resource.bento.mopp.BentoResource());
	}
	
}
