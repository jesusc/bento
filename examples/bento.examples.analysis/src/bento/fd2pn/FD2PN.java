package bento.fd2pn;


import genericity.compiler.atl.analyser.TypeUtils;
import genericity.typing.atl_types.annotations.ExpressionAnnotation;

import java.io.IOException;
import java.util.List;

import org.eclectic.modeling.emf.Util;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

import analysis.BaseTest;

public class FD2PN extends BaseTest {
	public static final String FD2PN_TRANSFORMATION = 
			"../../examples/bento.examples.flow_diagrams.petrinets/trafo/flow2pn.atl.xmi";
			
	
	public static final String FD_METAMODEL = "../../examples/bento.examples.flow_diagrams.petrinets/metamodels/flow_concept.ecore";
	public static final String PN_METAMODEL = "../../examples/bento.examples.flow_diagrams.petrinets/metamodels/petri_nets.ecore";

	public static void main(String[] args) throws IOException {
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
		Util.registerResourceFactory();

		new FD2PN().run();
	}
	
	public void run() throws IOException {
		typing(FD2PN_TRANSFORMATION, new Object[] { FD_METAMODEL, PN_METAMODEL}, 
				   new String[] { "FD", "PN" }, false);
		
		/*
		TreeIterator<EObject> it = atlTransformation.getHandler().getResource().getAllContents();
		while ( it.hasNext() ) {
			EObject obj = it.next();
			
			if ( obj.eClass().getName().equals("RuleVariableDeclaration") ) { 
				obj  = (EObject) typingModel.getFeature(obj, "initExpression") ;

			//if ( obj.eClass().getName().equals("OperationCallExp") ) { 
			// if ( obj.eClass().getName().equals("IfExp") ) { 

				boolean found = false;
				List<EObject> annotations = typingModel.allObjectsOf("ExpressionAnnotation");
				for (EObject eObject : annotations) {
					ExpressionAnnotation ann = (ExpressionAnnotation) eObject;
					if ( ann.getExpr() == obj ) {
						System.out.println(
								typingModel.getFeature(obj, "location") + "-" + TypeUtils.typeToString(ann.getType()));
						found = true;
						break;
					}
				}
				
				if ( ! found ) {
					throw new IllegalStateException("OclExpression not typed: " + obj + " " + typingModel.getFeature(obj, "location"));
				}
			}
		}
		*/
		
		System.out.println("Finished typing of " + FD2PN_TRANSFORMATION);
	}

}
