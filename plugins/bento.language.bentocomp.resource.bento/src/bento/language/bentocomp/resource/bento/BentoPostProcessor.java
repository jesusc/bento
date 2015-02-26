package bento.language.bentocomp.resource.bento;

import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;

import bento.language.bentocomp.core.BindingDeclaration;
import bento.language.bentocomp.core.Component;
import bento.language.bentocomp.core.CompositeComponent;
import bento.language.bentocomp.core.Metamodel;
import bento.language.bentocomp.core.TransformationComponent;
import bento.language.bentocomp.dsl.DefinitionRoot;
import bento.language.bentocomp.resource.bento.mopp.BentoProblem;
import bento.language.bentocomp.resource.bento.mopp.BentoResource;
import bento.language.bentocomp.technologies.AtlTemplate;
import bento.repository.common.BentoURIResolver;

public class BentoPostProcessor implements IBentoOptionProvider, IBentoResourcePostProcessorProvider, IBentoResourcePostProcessor {

	public BentoPostProcessor() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Map<?, ?> getOptions() {
		return Collections.singletonMap(
				IBentoOptions.RESOURCE_POSTPROCESSOR_PROVIDER,
				this
		);
	}
	
	@Override
	public IBentoResourcePostProcessor getResourcePostProcessor() {
		return this;
	}
	

	@Override
	public void process(BentoResource resource) {
		DefinitionRoot root = (DefinitionRoot) resource.getContents().get(0);
		if ( root.getComponent() != null ) {
			Component c = root.getComponent();
			c.getSource().forEach(m -> resolveMetamodel(resource, m));
			c.getTarget().forEach(m -> resolveMetamodel(resource, m));			
			
			if ( c instanceof CompositeComponent ) {
				((CompositeComponent) c).getBindings().forEach(b -> checkBinding(resource, b));
			}
			
			if ( c instanceof TransformationComponent ) {
				TransformationComponent tc = (TransformationComponent) c;
				if ( tc.getTemplate() instanceof AtlTemplate ) {
					AtlTemplate t = (AtlTemplate) tc.getTemplate();
					String file = t.getTemplate();
					if ( ! BentoURIResolver.transformationExists(file, resource) ) {
						BentoProblem p = new bento.language.bentocomp.resource.bento.mopp.BentoProblem("Cannot resolve " + file, 
								BentoEProblemType.ANALYSIS_PROBLEM, 
								bento.language.bentocomp.resource.bento.BentoEProblemSeverity.ERROR);
						
						resource.addProblem(p, t);
						
						
						// resource.addError("Cannot resolve " + file, BentoEProblemType.ANALYSIS_PROBLEM, t);						
					}
					// if ( )
				}
			}
		}
	}

	private void checkBinding(BentoResource resource, BindingDeclaration b) {
		if ( b.getFileName() != null ) {
			if ( ! BentoURIResolver.bindingExists(b.getFileName(), resource) ) {
				BentoProblem p = new bento.language.bentocomp.resource.bento.mopp.BentoProblem("Cannot resolve " + b.getFileName(), 
						BentoEProblemType.ANALYSIS_PROBLEM, 
						bento.language.bentocomp.resource.bento.BentoEProblemSeverity.ERROR);
				
				resource.addProblem(p, b);
				
			}
			
		}
	}

	private void resolveMetamodel(BentoResource resource, Metamodel m) {
		if ( m.getUri() != null ) { 
			String identifier  = BentoURIResolver.tryResolveMetamodel(m.getUri(), resource);
			String uriResource = m.getResource() != null ? m.getResource().getURI().toString() : "";
			// TODO: This check does not seem to be working because the AST is re-created 
			//       each time.
			
			if ( ! identifier.equals(uriResource) ) {
				Resource r = BentoURIResolver.loadMetamodel(identifier);
				if ( r != null ) {
					System.out.println("Loaded meta-model: " + r.getURI() + " " + m);
					m.setResource(r);
				} else {
					BentoProblem p = new bento.language.bentocomp.resource.bento.mopp.BentoProblem("Cannot resolve " + m.getUri(), 
							BentoEProblemType.ANALYSIS_PROBLEM, 
							bento.language.bentocomp.resource.bento.BentoEProblemSeverity.ERROR,
							new ResolveBentoQuickfix("Resolve component", null, m, m.getUri()));
					
					resource.addProblem(p, m);
					
					
					// resource.addError("Cannot resolve " + m.getUri(), BentoEProblemType.ANALYSIS_PROBLEM, m);
				} 
			}
			
		}
	}

	@Override
	public void terminate() {
		
	}

}
