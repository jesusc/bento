package bento.sirius.adapter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import bento.binding.utils.BindingModel;
import bento.common.adapter.IComponentInfoForBinding;
import bento.common.adapter.IComponentInfoForBinding.IBoundMetamodelInfo;
import bento.repository.common.BentoURIResolver;
import gbind.dsl.MetamodelDeclaration;

public class SiriusComponentInfo implements IComponentInfoForBinding {
	private String conceptMetamodelName;
	private BindingModel bindModel;
	private String componentName;
	private Map<String, EPackage> targetMetamodelNameToPackage;
	private Map<String, EPackage> siriusMetamodelNameToPackage;
	
	public SiriusComponentInfo(String conceptMetamodelName, BindingModel bindModel, String componentName) {
		this.conceptMetamodelName = conceptMetamodelName;
		this.bindModel = bindModel;
		this.componentName = componentName;

		this.targetMetamodelNameToPackage = new HashMap<>();
		this.siriusMetamodelNameToPackage = new HashMap<>();
		
		// Load the meta-models, we need them later
		for (IBoundMetamodelInfo mmInfo : this.getBoundMetamodels()) {
			EPackage pkg = loadPackage(mmInfo.getBoundMetamodelURI());
			targetMetamodelNameToPackage.put(mmInfo.getBoundMetamodelName(), pkg);
		}
	}
	
	private EPackage loadPackage(String uri) {
		ResourceSet rs = new ResourceSetImpl();
		Resource resource = rs.getResource(URI.createURI(uri), true);
		EPackage pkg = (EPackage) resource.getContents().get(0);		
		return pkg;
	}

	public EPackage getSiriusPackageFromMetamodelName(String mm) {
		return siriusMetamodelNameToPackage.get(mm);
	}

	public EPackage getTargetMetamodelPackage(String boundMetamodelName) {
		return targetMetamodelNameToPackage.get(boundMetamodelName);
	}
	
	@Override
	public String getConceptMetamodelName() {
		return conceptMetamodelName;
	}

	@Override
	public List<IBoundMetamodelInfo> getBoundMetamodels() {
		return this.bindModel.getRoot().getBoundMetamodels().stream().map(m -> new EclipseBoundMetamodel(m, bindModel)).collect(Collectors.toList());
	}

	public String getComponentName() {
		return componentName;
	}
	

	public static class EclipseBoundMetamodel implements IBoundMetamodelInfo {
	
		private MetamodelDeclaration metamodel;
		private BindingModel bindModel;
	
		public EclipseBoundMetamodel(MetamodelDeclaration m, BindingModel bindModel) {
			this.metamodel = m;
			this.bindModel = bindModel;
		}
	
		@Override
		public String getBoundMetamodelName() {
			return metamodel.getName();
		}
	
		@Override
		public String getBoundMetamodelURI() {
			String uri = BentoURIResolver.tryResolveMetamodel(metamodel.getMetamodelURI(), bindModel.getResource());
	//		String uri = bindModel.getRoot().getBoundMetamodel().getMetamodelURI();
	//		// quick trick			
			return uri.replace("platform:/resource", "");
			
		}		
	}


	public void addSiriusMetamodel(String name, EPackage ePackage) {
		siriusMetamodelNameToPackage.put(name, ePackage);
	}

	public Map<? extends String, EPackage> getSiriusPackages() {
		return siriusMetamodelNameToPackage;
	}
	
}
