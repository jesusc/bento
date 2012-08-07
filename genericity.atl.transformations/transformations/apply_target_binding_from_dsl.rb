# Apply the binding defined with the binding DSL
# to a generic transformation. 
#
# Input:
#   - ATL        : Generic transformation
#   - BindingDSL : Binding specification
# 
# Output:
#   - OUT  : Adapted transformation
#

use_library 'transformations/library/atl_bind.lib.rb'

Bind    = BindingDSL::Genericity_dsl
BindOCL = BindingDSL::OCL

phase 'rename_classes' do

  refinement_rule 'OclModelElement' do
    from ATL::OCL::OclModelElement
    to   OUT::OCL::OclModelElement  
    mapping do |atl, out|    
      # It has at least one binding to a concrete metaclasses.
      # If there are more bindings, they have to be treated by
      # other phases.
      Bind::ClassBinding.all_objects.each do |cb|
         
      
  		if ( atl.belongsTo(cb.model_.metamodel) && atl.name == cb.concept.name ) 			
  		  out.name = cb.concrete[0].name;
  		  raise "Only one concrete metaclass allowed in target renaming" if cb.concrete.size > 1 
  		end  	
      end
            
    end 
  end
end

phase 'copy_and_handle_bindings' do
  ignore_rule ATL::ATL::Binding => OUT::ATL::Binding
    
  rule 'SimpleOutPatternElement' do
    from ATL::ATL::Binding
    to   OUT::ATL::Binding
    filter do |b|
      # This filter avoid applying the rule for NONE property bindings
      # that is, removes bindings
    
      atl = b.__container__
      
      feature_binding = Bind::RenamingFeatureBinding.all_objects.find { |fb| 
        atl.get('type').belongsTo(fb.model_.metamodel) && 
        atl.get('type').name == fb.conceptClass.name   && 
        fb.conceptFeature == b.propertyName }
        
      ! (feature_binding && feature_binding.concreteFeature == 'NONE')
    end
    mapping do |b, out|
      atl = b.__container__
      feature_binding = Bind::RenamingFeatureBinding.all_objects.find { |fb| 
        atl.get('type').belongsTo(fb.model_.metamodel) && 
        atl.get('type').name == fb.conceptClass.name   && 
        fb.conceptFeature == b.propertyName }
      
      out.value        = b.value
      out.outPatternElement = b.outPatternElement
      out.propertyName = feature_binding ? feature_binding.concreteFeature : b.propertyName
    end 
  end

  # COPY
  IGNORED_RULES = [ATL::ATL::Binding]
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
  
end


scheduling do
  execute 'copy_and_handle_bindings'
  execute 'rename_classes'
end