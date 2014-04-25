package genericity.compiler.atl.analyser;

import genericity.compiler.atl.analyser.namespaces.ClassNamespace;
import genericity.compiler.atl.analyser.namespaces.IMetamodelNamespace;
import genericity.compiler.atl.analyser.namespaces.MetamodelNamespace;
import genericity.typing.atl_types.CollectionType;
import genericity.typing.atl_types.EnumType;
import genericity.typing.atl_types.Metaclass;
import genericity.typing.atl_types.Type;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * This class converts Ecore types to ATL Types meta-model.
 * 
 * It is needed to compute the implicit types of the transformation,
 * which are only available when querying the meta-model.
 * 
 * @author jesus
 *
 */
public class EcoreTypeConverter {

	private TypingModel	typ;

	public EcoreTypeConverter(TypingModel typ) {
		this.typ = typ;
	}

	public Type convert(EStructuralFeature f, IMetamodelNamespace mspace) {
		// System.out.println(f.getName());
		Type t = convert(f.getEType(), mspace);
		if ( f.isMany() ) {
			return typ.newSequenceType(t);
		}
		return t;
	}

	public Type convert(EClassifier c, IMetamodelNamespace mspace) {
		if ( c instanceof EClass ) {
			return convertEClass((EClass) c, (ClassNamespace) mspace.getClassifier(c.getName()));
		} else if ( c instanceof EDataType ) {
			return convertEDataType((EDataType) c);
		}
		
		throw new UnsupportedOperationException("Type " + c.getName() + " not supported");
	}

	public Metaclass convertEClass(EClass eClass, ClassNamespace cspace) {
		Metaclass m = typ.newMetaclassType(eClass, false, cspace);
		return m;
	}
	
	public CollectionType convertAllInstancesOf(EClass eclass, ClassNamespace cspace) {
		return typ.newSequenceType( convertEClass(eclass, cspace) );
	}
	
	private Type convertEDataType(EDataType c) {
		String instance = c.getInstanceClassName() == null ? "" : c.getInstanceClassName();
		
		if ( c instanceof EEnum ) {
			return convertEEnum((EEnum) c);
		} else if ( c.getName().endsWith("String") || instance.equals("java.lang.String")) {
			return typ.newStringType();
		} else if ( c.getName().endsWith("Boolean") ) {
			return typ.newBooleanType();
		} else if ( c.getName().equals("EInt") || c.getName().endsWith("Integer") || 
				    c.getName().equals("UnlimitedNatural") ||
				    c.getName().endsWith("Long") ) {
			return typ.newIntegerType();
		} else if ( c.getName().equals("Double") ) {
			return typ.newFloatType();
		}
		throw new UnsupportedOperationException(getClass().getSimpleName() + ":" + "Type [" + c.getName() + "] not supported");
	}

	private Type convertEEnum(EEnum c) {
		EnumType e = (EnumType) typ.createEEnum(c);
		e.setEenum(c);
		e.setName(c.getName());
		// TODO: Add literals
		return e;
	}
	
	
}
