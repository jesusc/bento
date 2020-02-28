package bento.sirius.adapter;

import java.util.HashSet;

import org.eclipse.emf.ecore.EObject;

import anatlyzer.atl.util.ATLSerializer;
import anatlyzer.atlext.OCL.OclModelElement;
import anatlyzer.atlext.OCL2.SelectByKind;

public class AQLSerializer extends ATLSerializer {

	public static String serialize(EObject obj) {
		AQLSerializer s = new AQLSerializer();
		s.startVisiting(obj);
		return s.g(obj);
	}
	
	@Override
	public void inOclModelElement(OclModelElement self) {
		s(self.getModel().getName() + "::" + norm(self.getName()));
	}
	
	@Override
	public void inSelectByKind(SelectByKind self) {
		s(g(self.getSource()) + "->filter(" + g(self.getArguments().get(0)) + ")");
	}
	
	// Sirius reserved words
	private static HashSet<String> reservedWords = new HashSet<String>();
	static {
		reservedWords.add("in");		
		reservedWords.add("OclType");
	}
	
	// TODO: Make this protected and override
	private String norm(String name) {
		if ( reservedWords.contains(name) ) 
			return '"' + name + '"';
		return name;
	}
}
