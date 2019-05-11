package bento.sirius.adapter;

import java.util.List;
import java.util.stream.Collectors;

import bento.binding.utils.BindingModel;
import bento.common.adapter.IComponentInfoForBinding;
import bento.repository.common.BentoURIResolver;
import gbind.dsl.MetamodelDeclaration;

public class SiriusComponentInfo implements IComponentInfoForBinding {
	private String conceptMetamodelName;
	private BindingModel bindModel;
	private String componentName;

	public SiriusComponentInfo(String conceptMetamodelName, BindingModel bindModel, String componentName) {
		this.conceptMetamodelName = conceptMetamodelName;
		this.bindModel = bindModel;
		this.componentName = componentName;
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
	
}
