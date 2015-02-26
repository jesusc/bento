package paper.metrics;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class Test {

	public static void main(String[] args) {
		
		EClass c1 = EcoreFactory.eINSTANCE.createEClass();
		c1.setName("c1");

		EClass c2 = EcoreFactory.eINSTANCE.createEClass();
		c2.setName("c2");
		c2.getESuperTypes().add(c1);
		
		EPackage pkg = EcoreFactory.eINSTANCE.createEPackage();
		pkg.getEClassifiers().add(c1);
		pkg.getEClassifiers().add(c2);

		System.out.println(c2.getESuperTypes());

		EcoreUtil.delete(c1);
		
		System.out.println(c2.getESuperTypes());
		
		
	}
}
