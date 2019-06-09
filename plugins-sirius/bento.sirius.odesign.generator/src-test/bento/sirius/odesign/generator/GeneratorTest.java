package bento.sirius.odesign.generator;


import java.io.FileNotFoundException;
import java.io.IOException;

import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EPackage;
import org.junit.Test;

import com.odesign.generator.Generate;
import com.odesign.generator.ModelGenerator;
import com.odesign.generator.ui.common.GenerateAllModel;



public class GeneratorTest {

	@Test
	public void test() throws FileNotFoundException, IOException {
		String PATH="/home/souhaila/git/sirius-bento"
				+ "/plugins-sirius/bento.sirius.odesign.generator/";
		String sourceOdesignURI = PATH+"source/free.odesign";
		String sourceModelURI=PATH+"source/My.free";
		String outputURI   = PATH+"outputs";
		
		
		Generate generate=new Generate();
		generate.GenerateOdesignMM(sourceOdesignURI, new Path((outputURI)).toFile());
	
		EPackage ep = generate.getEpack();
		EPackage originalep = generate.getOriginaleEPakage();	
		new ModelGenerator(sourceModelURI,new Path((outputURI)).toFile() ,originalep,ep);

		
		
	}
	
	
}
