package com.odesign.generator.values;



import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EcorePackage;

public class Datatypes {
	private static EDataType _string= EcorePackage.eINSTANCE.getEString();
	private static EDataType _int=EcorePackage.eINSTANCE.getEInt();
	private static EDataType _float=EcorePackage.eINSTANCE.getEFloat();
	public static EDataType get_string() {
		return _string;
	}
	public static EDataType get_int() {
		return _int;
	}
	public static EDataType get_float() {
		return _float;
	}
	
	
	  
	  
}
