package genericity.compiler.atl.analyser.namespaces;

import genericity.typing.atl_types.Type;
import atl.metamodel.OCL.Attribute;
import atl.metamodel.OCL.OclFeature;

public class VirtualFeature<T extends ITypeNamespace, F extends OclFeature> {
	protected String featureName;
	protected T receptorType;
	protected Type returnType;
	protected F	definition;
	
	public VirtualFeature(T receptorType, String featureName, Type returnType, F definition) {
		this.receptorType = receptorType;
		this.featureName  = featureName;
		this.returnType   = returnType;
		this.definition = definition;
	}
}