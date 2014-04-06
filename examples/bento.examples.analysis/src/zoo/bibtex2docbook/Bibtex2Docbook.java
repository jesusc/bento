package zoo.bibtex2docbook;


import java.io.FileOutputStream;
import java.io.IOException;

import org.eclectic.modeling.emf.Util;

import analysis.BaseTest;

public class Bibtex2Docbook extends BaseTest {
	public static final String BIBTEX2DOCBOOKL_TRANSFORMATION = "../bento.examples.analysis/third-party/zoo/bibtex2docbook/trafo/BibTeX2DocBook.atl.xmi";
	public static final String TARGET_METAMODEL_NAME = "DocBook";
	
	private static final String SOURCE_METAMODEL_NAME = "BibTeX";

	public static final String SOURCE_METAMODEL = "../bento.examples.analysis/third-party/zoo/bibtex2docbook/mm/BibTeX.ecore";
	public static final String TARGET_METAMODEL = "../bento.examples.analysis/third-party/zoo/bibtex2docbook/mm/DocBook.ecore";


	public static void main(String[] args) throws IOException {
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
		Util.registerResourceFactory();

		new Bibtex2Docbook().run();
	}
	
	public void run() throws IOException {
		typing(BIBTEX2DOCBOOKL_TRANSFORMATION, new Object[] { SOURCE_METAMODEL, TARGET_METAMODEL }, 
				   new String[] { SOURCE_METAMODEL_NAME, TARGET_METAMODEL_NAME }, true);

		generateGraphviz();
		generateCSP();
	}

}
