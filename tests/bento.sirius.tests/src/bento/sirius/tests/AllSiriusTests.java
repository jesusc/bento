package bento.sirius.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
	TestSiriusAdapter2.class, 
	TestSiriusValidity.class,
	TestGraphicalBindingGenerator.class,
	TestGbindGenerator.class
	})
public class AllSiriusTests {

}
