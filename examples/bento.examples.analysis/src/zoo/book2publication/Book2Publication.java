package zoo.book2publication;


import java.io.FileOutputStream;
import java.io.IOException;

import org.eclectic.modeling.emf.Util;

import analysis.BaseTest;

public class Book2Publication extends BaseTest {
	public static final String ATL_TRANSFORMATION = "../bento.examples.analysis/third-party/zoo/book2publication/ATLFile/Book2Publication.atl.xmi";
	public static final String XML_TRANSFORMATION = "../bento.examples.analysis/third-party/zoo/book2publication/ATLFile/XML2Book.atl.xmi";
	
	public static final String TARGET_METAMODEL_NAME = "Publication";
	
	private static final String SOURCE_METAMODEL_NAME = "Book";

	public static final String SOURCE_METAMODEL = "../bento.examples.analysis/third-party/zoo/book2publication/Book/Book.ecore";
	public static final String TARGET_METAMODEL = "../bento.examples.analysis/third-party/zoo/book2publication/Publication/Publication.ecore";
	public static final String XML_METAMODEL = "../bento.examples.analysis/third-party/zoo/book2publication/XML/XML.xmi";


	public static void main(String[] args) throws IOException {
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
		Util.registerResourceFactory();

		new Book2Publication().run();
	}
	
	public void run() throws IOException {
		typing(ATL_TRANSFORMATION, new Object[] { SOURCE_METAMODEL, TARGET_METAMODEL }, 
				   new String[] { SOURCE_METAMODEL_NAME, TARGET_METAMODEL_NAME });

		//
		
		typing(XML_TRANSFORMATION, new Object[] { XML_METAMODEL, SOURCE_METAMODEL }, 
				   new String[] { "XML", SOURCE_METAMODEL_NAME });

	}

}
