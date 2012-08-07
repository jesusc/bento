# TODO: Incluir en una librería

#IGNORED_RULES = [ATL::ATL::Module, ATL::ATL::OutPattern]
IGNORED_RULES = [ATL::ATL::MatchedRule, ATL::ATL::Helper] + ($ignore_parameter || [])
TOP_RULES = [] # Fine-grained options ofr the library
# TODO: Incluir Refining mode como una librería del lenguaje
# Podría usarse dentro de fases, o más interesante, dentro de mixins, para cuando haya herencia de reglas

#IN.all_subpackages.each { |p| eval("#{p.pkg_name} = p") }
#KlassPkg = Struct.new(:pkg, :klass)
#all_klasses = IN.all_subpackages.map { |p| p.all_klasses.map { |k| KlassPkg.new(p, k) } }.flatten

# This cannot be generated dynamically to be able to filter "NONE rules"  
top_rule 'matched_rule' do
  from ATL::ATL::MatchedRule
  to   OUT::ATL::MatchedRule # There should be some kind of anchor, to ensure that the same type is created... 
  filter do |atl, out|
    
    ocl_element = atl.inPattern.elements.first.get('type')

    atl.metaclass == ATL::ATL::MatchedRule && 
    (BindingDSL::Genericity_dsl::ClassBinding.all_objects.any? do |cb|
      if ( ocl_element.belongsTo(cb.model_.metamodel) && ocl_element.name == cb.concept.name ) 			
  		cb.concrete[0].name != 'NONE'
  	  else
  		false
  	  end  	
    end)

  end   
  mapping do |atl, out|
      out.name      = atl.name
      out.inPattern = atl.inPattern
      out.outPattern = atl.outPattern
  end    
end

top_rule 'copy_helper' do
  from ATL::ATL::Helper
  to   OUT::ATL::Helper
  filter { |atl|
    ocl_element = atl.definition.context_.context_

    # Replicated from above!
    atl.metaclass == ATL::ATL::Helper && ocl_element.metaclass == ATL::OCL::OclModelElement &&
    (BindingDSL::Genericity_dsl::ClassBinding.all_objects.any? do |cb|
      if ( ocl_element.belongsTo(cb.model_.metamodel) && ocl_element.name == cb.concept.name ) 			
  		cb.concrete[0].name != 'NONE'
  	  else
  		false
  	  end  	
    end)
        
  }    
  mapping do |atl, out|
    out.definition = atl.definition 
  end
end  

ignore_rule ATL::ATL::MatchedRule => OUT::ATL::MatchedRule
ignore_rule ATL::ATL::Helper      => OUT::ATL::Helper


ATL::ATL.all_klasses.each do |klass|
  next if klass.abstract
  next if IGNORED_RULES.include?(klass)

  klass_name = klass.name
  top_rule "copy_#{klass_name}" do
    from eval(" ATL::ATL::#{klass.name}")
    to   eval("OUT::ATL::#{klass.name}")
    filter do |source|
      source.metaclass == klass
    end
    mapping do |source, target|
      klass.all_structural_features.each do |feature|
        value = source.get(feature.name)
        target.send("#{feature.name}=", value) if value


        if feature.is_reference? && feature.eOpposite && feature.multivalued?
           eval("target.#{feature.name}.uniq!")
        end

      end
    end
  end
end


ATL::OCL.all_klasses.each do |klass|
  next if klass.abstract
  klass_name = klass.name
  
  top_rule "copy_#{klass_name}" do
    from eval(" ATL::OCL::#{klass.name}")
    to   eval("OUT::OCL::#{klass.name}")
    filter do |source|
      source.metaclass == klass
    end
    mapping do |source, target|
      klass.all_structural_features.each do |feature|
        if feature.name == 'id'
          eval("target.set('#{feature.name}', source.get('#{feature.name}'))", nil, __FILE__, __LINE__)
        else
          eval("target.#{feature.name} = source.#{feature.name} if source.#{feature.name}", nil, __FILE__, __LINE__)
        end
        
        if feature.is_reference? && feature.eOpposite && feature.multivalued?
           eval("target.#{feature.name}.uniq!")
        end
         
      end
    end
  end
end

=begin
top_rule 'module' do
	from ATL::ATL::Module
	to   OUT::ATL::Module  
	mapping do |atl, out|
    	out.name     = atl.name;
    	out.elements = atl.elements
    	out.inModels = atl.inModels;
    	out.outModels = atl.outModels;
	end
end

rule 'variableDeclaration' do
  from ATL::OCL::VariableDeclaration
  to   OUT::OCL::VariableDeclaration  
  filter { |atl| atl.metaclass == ATL::OCL::VariableDeclaration }
  mapping do |atl, out|
	  out.varName = atl.varName
	  out.type    = atl.get('type')
  end 
end

rule 'helper' do
	from ATL::ATL::Helper
	to   OUT::ATL::Helper  
	mapping do |atl, out|
	  out.definition = atl.definition;
	end 
end

rule 'OclFeatureDefinition' do
	from ATL::OCL::OclFeatureDefinition
	to   OUT::OCL::OclFeatureDefinition  
	mapping do |atl, out|	
	  out.feature = atl.feature;
	  out.context_ = atl.context_;
	end 
end

rule 'Attribute' do
from ATL::OCL::Attribute
  to    OUT::OCL::Attribute  
  mapping do |atl, out|
	
	out.name = atl.name;
	out.initExpression = atl.initExpression;
	out.type    = atl.get('type')
  end 
end

rule 'ContextDefinition' do 
	from ATL::OCL::OclContextDefinition
	to   OUT::OCL::OclContextDefinition  
	mapping do |atl, out|	
	   out.context_ = atl.context_;
	end 
end

rule 'matchedRule' do 
	from ATL::ATL::MatchedRule
	to   OUT::ATL::MatchedRule  
	mapping do |atl, out|

    out.name       = atl.name;
	out.inPattern  = atl.inPattern;
	out.outPattern = atl.outPattern;
	end 
end

rule 'outPattern' do
	from ATL::ATL::OutPattern
	to   OUT::ATL::OutPattern  
	mapping do |atl, out|

	out.elements = atl.elements;
	end 
end

rule 'outPatternElement' do
	from ATL::ATL::SimpleOutPatternElement
	to   OUT::ATL::SimpleOutPatternElement  
	mapping do |atl, out|
     
    # // duplicated in inPatternElement
    out.id      = atl.get('id');
    out.varName = atl.varName;
    out.type   = atl.get('type');
	
	out.bindings = atl.bindings;
	end 
end

rule 'binding' do
	from ATL::ATL::Binding
	to   OUT::ATL::Binding  
	mapping do |atl, out|

	out.propertyName = atl.propertyName;
	out.value        = atl.value;
	end 
end


rule 'inPattern' do
	from ATL::ATL::InPattern
	to   OUT::ATL::InPattern  
	mapping do |atl, out|

	out.elements = atl.elements;
	out.filter   = atl.filter;
	end 
end

rule 'inPatternElement' do
	from ATL::ATL::SimpleInPatternElement
	to   OUT::ATL::SimpleInPatternElement  
	mapping do |atl, out|

    out.id      = atl.get('id')
    out.varName = atl.varName
    out.type   = atl.get('type')
    puts "paso" 
    puts out.type
	out.models = atl.models
	end 
end


rule 'OclModelElement' do
  from ATL::OCL::OclModelElement
  to   OUT::OCL::OclModelElement  
  mapping do |atl, out|

    out.name = atl.name
    out.model= atl.model

	#// renameClass:::: Separar de esta regla
	
  end
end

rule 'OclModel' do
  from ATL::OCL::OclModel
  to   OUT::OCL::OclModel  
  mapping do |atl, out|

    out.name = atl.name
    out.metamodel = atl.metamodel

    out.elements = atl.elements
    out.model    = atl.model
    
    out.model.uniq! # Hay que hacer esto por error al serializar bidireccionales N..N :-(
    out.elements.uniq!
  end 
end

# // == Begin-of OclExpressions

rule 'VariableExp' do
	from ATL::OCL::VariableExp
	to   OUT::OCL::VariableExp  
	mapping do |atl, out|

	out.referredVariable = atl.referredVariable;
	end 
end

rule 'NavigationOrAttributeCallExp' do
	from ATL::OCL::NavigationOrAttributeCallExp
	to   OUT::OCL::NavigationOrAttributeCallExp  
	mapping do |atl, out|

	out.name = atl.name;
	out.source = atl.source;
	end
end


rule 'CollectionOperationCallExp' do
	from ATL::OCL::CollectionOperationCallExp
	to   OUT::OCL::CollectionOperationCallExp  
	mapping do |atl, out|

	out.operationName = atl.operationName;
	out.source = atl.source;
	end
end

rule 'OperationCallExp' do
	from ATL::OCL::OperationCallExp
	to   OUT::OCL::OperationCallExp  
	mapping do |atl, out|

	out.operationName = atl.operationName
	out.source    = atl.source
	out.arguments = atl.arguments
	end
end

rule 'IteratorExp' do
	from ATL::OCL::IteratorExp  # // ver si hay un belongsTo del model como en ATL
	to   OUT::OCL::IteratorExp  
	mapping do |atl, out|
	 out.name   = atl.name;
	 out.source = atl.source;
	 out.body   = atl.body;
	 out.iterators = atl.iterators;
	end 
end

rule 'Iterator' do
	from ATL::OCL::Iterator
	to   OUT::OCL::Iterator  
	mapping do |atl, out|

	out.varName = atl.varName;
	end 
end

rule 'StringExp' do
	from ATL::OCL::StringExp
	to   OUT::OCL::StringExp  
	mapping do |atl, out|

	out.stringSymbol = atl.stringSymbol;
	end
end

rule 'BooleanType' do
	from ATL::OCL::BooleanType
	to   OUT::OCL::BooleanType
end
=end