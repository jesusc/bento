package bento.analyser.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import atl.metamodel.ATLModel;
import atl.metamodel.ATLModelBaseObjectInterface;
import atl.metamodel.ATLModelVisitor;
import atl.metamodel.ATL.InPattern;
import atl.metamodel.ATL.InPatternElement;
import atl.metamodel.ATL.MatchedRule;
import atl.metamodel.ATL.Module;
import atl.metamodel.ATL.ModuleElement;
import atl.metamodel.ATL.OutPattern;
import atl.metamodel.ATL.OutPatternElement;
import atl.metamodel.ATL.SimpleInPatternElement;
import atl.metamodel.ATL.SimpleOutPatternElement;
import atl.metamodel.OCL.OclModel;
import atl.metamodel.OCL.OclModelElement;

public class ATLSerializer extends ATLModelVisitor {
	public static String serialize(ATLModel m) {		
		Module mod = m.allObjectsOf(Module.class).get(0);
		ATLSerializer s = new ATLSerializer();
		s.startVisiting(mod);
		return s.g(mod);
	}

	private HashMap<Object, String> str = new HashMap<Object, String>();
	
	@Override
	public void inModule(Module self) {
		String s = "";
		
		for(String c : self.getCommentsBefore()) {
			s += c + cr();
		}
		
		
		s += "module " + self.getName() + ";" + cr() +
		      "create ";
		
		List<String> l1 = sl();
		for (OclModel model: self.getOutModels()) {
			l1.add( model.getName() + " : " + model.getMetamodel().getName() );
		}

		List<String> l2 = sl();
		for (OclModel model: self.getInModels()) {
			l2.add( model.getName() + " : " + model.getMetamodel().getName() );
		}
		
		s += join(l1) + " from " + join(l2) + ";" + cr(2);

		for(ModuleElement r : self.getElements()) {
			s += g(r) + cr(2);
		}

		s(s);
	}
	
	private String join(List<String> l) {
		String r = "";
		for(int i = 0; i < l.size(); i++) {
			r += l.get(i);
			if ( i + 1 < l.size() ) {
				r += ", ";
			}
		}
		return r;
	}

	@Override
	public void inMatchedRule(MatchedRule self) {
		String s = ifs(self.getIsAbstract(), "abstract ") + "rule " + self.getName() + " {" + cr();
		
		s += tab(1) + "from " + g(self.getInPattern()) + cr();
		s += tab(1) + "  to " + g(self.getOutPattern()) + cr();
		
		
		
		s(s + cr() + "}");
	}
	
	@Override
	public void inInPattern(InPattern self) {
		List<String> l = sl();
		for(InPatternElement e : self.getElements()) {
			l.add(g(e));
		}
		
		String s = join(l);
		
		if ( self.getFilter() != null ) {
			System.out.println("TODO: add filter");
			// self.getFilter()
		}
		
		s(s);
	}

	@Override
	public void inSimpleInPatternElement(SimpleInPatternElement self) {
		s(self.getVarName() + " : " + g(self.getType()));
	}
	
	@Override
	public void inOutPattern(OutPattern self) {
		List<String> l = sl();
		for(OutPatternElement e : self.getElements()) {
			l.add(g(e));
		}
		
		String s = join(l);
		
		// TODO: Add bindings
		
		s(s);
	}
	
	@Override
	public void inSimpleOutPatternElement(SimpleOutPatternElement self) {
		s(self.getVarName() + " : " + g(self.getType()));
	}
	
	@Override
	public void inOclModelElement(OclModelElement self) {
		s(self.getModel().getName() + "!" + self.getName());
	}
	
	/*
	@Override
	public void inOclModel(OclModel self) {
		s(self.getMetamodel().getName() + "!" + self.getName());
	}
	*/
	
	//
	// Utilities
	//
	
	private ArrayList<String> sl() {
		return new ArrayList<String>();
	}
	
	private String cr() {
		return cr(1);
	}
	
	private String cr(int n) {
		String s = "";
		for(int i = 0; i < n; i++) {
			s += "\n";
		}
		return s;
	}
	
	private String ifs(boolean v, String t) {
		return ifs(v, t, "");
	}
	
	private String ifs(boolean v, String t, String f) {
		if ( v ) return t;
		return f;
	}
	
	private void s(String s) {
		str.put(this.getCurrent(), s);
	}
	
	private String g(ATLModelBaseObjectInterface obj) {
		if ( ! str.containsKey(obj) ) throw new IllegalArgumentException("Not found " + obj);
		return str.get(obj);
	}
	
	private String tab(int n) {
		String s = "";
		for(int i = 0; i < n; i++) {
			s += "   ";
		}
		return s;		
	}
	
}
