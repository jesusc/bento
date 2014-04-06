package zoo.families2persons;


import java.io.IOException;

import org.eclectic.modeling.emf.Util;

import analysis.BaseTest;

public class Families2Persons extends BaseTest {
	public static final String FAMILIES2PERSONS_TRANSFORMATION = "../bento.examples.analysis/third-party/zoo/families2persons/Families2Persons.atl.xmi";
	
	
	public static final String FAMILIES_METAMODEL = "../bento.examples.analysis/third-party/zoo/families2persons/Families.ecore";
	public static final String PERSONS_METAMODEL = "../bento.examples.analysis/third-party/zoo/families2persons/Persons.ecore";

	public static void main(String[] args) throws IOException {
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
		Util.registerResourceFactory();

		new Families2Persons().run();
	}
	
	public void run() throws IOException {
		typing(FAMILIES2PERSONS_TRANSFORMATION, new Object[] { FAMILIES_METAMODEL, PERSONS_METAMODEL}, 
				   new String[] { "Families", "Persons" });
		
		System.out.println("Finished typing of " + FAMILIES2PERSONS_TRANSFORMATION);
	}

}
