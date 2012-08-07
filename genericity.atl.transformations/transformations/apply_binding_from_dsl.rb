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

import 'transformations/copy_atl.rb', :as => 'copy_atl'

Bind    = BindingDSL::Genericity_dsl
BindOCL = BindingDSL::OCL

#
# Renames OCLModelElement instances according to 
# the binding.
# 
# It assumes that copy_atl has been executed
# and all OclModelElement has been copied.
# 
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
  		end  	
      end
            
    end 
  end
end

phase 'create_helpers_for_renaming_feature_bindings' do
  refinement_rule 'module' do
  	from ATL::ATL::Module
  	to   OUT::ATL::Module  
  	mapping do |atl, out|
      out.elements = Bind::RenamingFeatureBinding.all_objects
      	
      # Additionally, any helper defined on a context that is now renamed
      # must be removed from the module.
# NOT SURE IF IT IS NEEDED
=begin
      atl.elements.select { |e| e.kind_of?(ATL::ATL::Helper) }.each do |h|
        ocl_type = h.definition.context_.context_ 
        if b = Bind::ClassBinding.all_objects.find { |cb| puts cb.model_.metamodel + " " + cb.concept.name; ocl_type.belongsTo(cb.model_.metamodel) && ocl_type.name == cb.concept.name }
          out_helper = trace_query(h).one!(OUT::ATL::Helper)
          out_helper.definition.context_.context_.name = b.concrete[0].name
        end         
      end
=end      
  	end
  end
  
  rule 'featureBinding2helper' do
  	from Bind::RenamingFeatureBinding
  	to   OUT::ATL::Helper  
  	mapping do |fb, out| 
      out.definition = OUT::OCL::OclFeatureDefinition.new;
      out.definition.feature = OUT::OCL::Attribute.new;
      out.definition.feature.name = fb.conceptFeature;
      
      out.definition.feature.initExpression = OUT::OCL::NavigationOrAttributeCallExp.new do |nav|
        nav.name = fb.concreteFeature;
        nav.source = OUT::OCL::VariableExp.new do |v|
          v.referredVariable = OUT::OCL::VariableDeclaration.new(:varName => 'self')
        end
      end
      
      out.definition.context_ = OUT::OCL::OclContextDefinition.new;
      out.definition.context_.context_ = OUT::OCL::OclModelElement.new;
  	
  	  if fb.qualifier 
  	     out.definition.context_.context_.name = fb.qualifier.name;
  	  else
  	     binding = Bind::ClassBinding.all_objects.find_one { |b| b.concept.name == fb.conceptClass.name }
  	     out.definition.context_.context_.name = binding.concrete[0].name; 
  	  end
  	    
  	   # out.definition.context_.context_.model = ATL::OCL::OclModel.all_objects.find_one { |m| m.name == MetamodelName }
       ocl_model = ATL::OCL::OclModel.all_objects.find { |m| m.name == fb.model_.metamodel }
  	   out.definition.context_.context_.model = trace_query(ocl_model).one!(OUT::OCL::OclModel)
  
    	   # // Poner el tipo, pero no está guardado en el concepto...
  	   out.definition.feature.type = OUT::OCL::OclAnyType.new;
  	end 
  end
end

#
# Generates helpers from feature bindings specifided with OCL (i.e., adapters).
#
phase 'copy_ocl_feature_bindings' do

  refinement_rule 'module' do
  	from ATL::ATL::Module
  	to   OUT::ATL::Module  
  	mapping do |atl, out|
      	out.elements = Bind::OclFeatureBinding.all_objects
  	end
  end
  
  rule 'featureBinding2helper' do
  	from Bind::OclFeatureBinding
  	to   OUT::ATL::Helper  
  	mapping do |fb, out| 
      out.definition = OUT::OCL::OclFeatureDefinition.new
      out.definition.feature = OUT::OCL::Attribute.new
      out.definition.feature.name = fb.conceptFeature
      out.definition.feature.initExpression = fb.concrete
      out.definition.context_ = OUT::OCL::OclContextDefinition.new
      out.definition.context_.context_ = OUT::OCL::OclModelElement.new
  	
  	
  	  if fb.qualifier 
  	     out.definition.context_.context_.name = fb.qualifier.name;
  	  else
  	     binding = Bind::ClassBinding.all_objects.find_one { |b| b.concept.name == fb.conceptClass.name }
  	     out.definition.context_.context_.name = binding.concrete[0].name;
  	  end
  	    
  	   # out.definition.context_.context_.model = ATL::OCL::OclModel.all_objects.find_one { |m| m.name == MetamodelName }
       ocl_model = ATL::OCL::OclModel.all_objects.find { |m| m.name == fb.model_.metamodel }
  	   out.definition.context_.context_.model = trace_query(ocl_model).one!(OUT::OCL::OclModel)
  
    	   # // Poner el tipo, pero no está guardado en el concepto...
  	   out.definition.feature.type = OUT::OCL::OclAnyType.new;

  	end 
  end

  IGNORED_RULES = ['VariableExp']
  BindOCL.all_klasses.each do |klass|
    next if klass.abstract
    next if IGNORED_RULES.include?(klass.name)
  
    klass_name = klass.name
    top_rule "copy_#{klass_name}" do
      from eval(" BindOCL::#{klass.name}")
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
  
  rule 'VariableExp_Bind' do
  	from BindOCL::VariableExp
  	to   OUT::OCL::VariableExp  
  	mapping do |atl, out|
     
      if atl.referredVariable.nil?
        # This is "self". It doesn't load the referred object
        # because it is in the original ATL model...
        out.referredVariable = OUT::OCL::VariableDeclaration.new(:varName => 'self')
      else
        out.referredVariable = atl.referredVariable;
  	  end 
  	end
  end
end

#
# Deal with attribute-to-class bindings. To do that, it performs to tasks:
# 
# * It copies the when clause OCL expression into an ATL helper. The helper will be
#   called whenever the OCL expression has to be used
# * 
#
phase 'attribute_to_class_binding' do

  refinement_rule 'module' do
  	from ATL::ATL::Module
  	to   OUT::ATL::Module  
  	mapping do |atl, out|
      	out.elements = Bind::ClassBinding.all_objects
  	end
  end
  
  refinement_rule 'refine_matched' do
    from ATL::ATL::MatchedRule
    to   OUT::ATL::MatchedRule
    filter { |atl, out|
      atl.inPattern.elements.size == 1 &&
      atl.inPattern.elements[0].get('type').has_class_to_attribute_binding?(Bind::ClassBinding.all_objects)
    }
    mapping do |atl, out|
      # type = out.inPattern.elements[0].get('type')
      # The original type is used to compute the name of the __filter__ helper
      type = atl.inPattern.elements[0].get('type')
      
      call = OUT::OCL::NavigationOrAttributeCallExp.new
      call.name = type.name + '__filter__'
      call.source = OUT::OCL::VariableExp.new do |v|
        v.referredVariable = out.inPattern.elements[0]
      end
      
      if out.inPattern.filter
        operator = OUT::OCL::OperatorCallExp.new
        operator.operationName = 'and'
        operator.source = out.inPattern.filter
        operator.arguments = call
        
        out.inPattern.filter = operator
      else
        out.inPattern.filter = call      
      end
    end
  end  
  
  refinement_rule 'oclKindOf' do
    from ATL::OCL::OperationCallExp
    to   OUT::OCL::OperationCallExp
    filter do |atl, out|     
      atl.operationName == 'oclIsKindOf' &&
      atl.arguments.first.kind_of?(ATL::OCL::OclModelElement) &&
      atl.arguments.first.has_class_to_attribute_binding?(Bind::ClassBinding.all_objects)      
    end   
    mapping do |atl, out|
      type = atl.arguments.first
      container = out.__container__
      
      let = OUT::OCL::LetExp.new
      let.variable = OUT::OCL::VariableDeclaration.new do |vd|
        vd.id = '__unique_id__'
        vd.varName = '__unique_id__'
        vd.type = OUT::OCL::OclAnyType.new;        
        vd.initExpression = out.source 
      end 

      # Re-arrange oclIsKindOf -> source now is Let variable
      out.source = OUT::OCL::VariableExp.new do |v|
        v.referredVariable = let.variable
      end
      
      # Call the filter
      # TODO: FACTORIZE IN UTIL!!
      call = OUT::OCL::NavigationOrAttributeCallExp.new
      call.name = type.name + '__filter__'
      call.source = OUT::OCL::VariableExp.new do |v|
        v.referredVariable = let.variable
      end

      # Create the "and" expression
      operator = OUT::OCL::OperatorCallExp.new
      operator.operationName = 'and'
      operator.source = call
      operator.arguments = out

      let.in_ = operator
      
      Util.put_expression_in_container(container, let)
    end    
  end
  
  ignore_rule Bind::ClassBinding => OUT::ATL::Helper 
  
  rule 'whenClause2helper' do
  	from Bind::ClassBinding
  	to   OUT::ATL::Helper
  	filter { |cb| cb.whenClause != nil }  
  	mapping do |cb, out| 
  	  type_name = cb.concrete[0].name
  	
      out.definition = OUT::OCL::OclFeatureDefinition.new;
      out.definition.feature = OUT::OCL::Attribute.new;
      out.definition.feature.name = cb.concept.name + '__filter__'
      out.definition.feature.initExpression = cb.whenClause
      out.definition.context_ = OUT::OCL::OclContextDefinition.new
      out.definition.context_.context_ = OUT::OCL::OclModelElement.new
  	
  	  out.definition.context_.context_.name = type_name 
  	  
  	  # Cardinality N not considered
  	  #if fb.qualifier 
  	  #   out.definition.context_.context_.name = fb.qualifier.name;
  	  #else
  	  #   binding = Bind::ClassBinding.all_objects.find_one { |b| b.concept.name == fb.conceptClass.name }
  	  #   out.definition.context_.context_.name = binding.concrete[0].name;
  	  #end
  	    
  	   # out.definition.context_.context_.model = ATL::OCL::OclModel.all_objects.find_one { |m| m.name == MetamodelName }
       ocl_model = ATL::OCL::OclModel.all_objects.find { |m| m.name == cb.model_.metamodel }
  	   out.definition.context_.context_.model = trace_query(ocl_model).one!(OUT::OCL::OclModel)
  
    	   # // Poner el tipo, pero no está guardado en el concepto...
  	   out.definition.feature.type = OUT::OCL::OclAnyType.new;

  	end 
  end

  #IGNORED_RULES = ['VariableExp']
  BindOCL.all_klasses.each do |klass|
    next if klass.abstract
    next if IGNORED_RULES.include?(klass.name)
  
    klass_name = klass.name
    top_rule "copy_#{klass_name}" do
      from eval(" BindOCL::#{klass.name}")
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
  
  rule 'VariableExp_Bind' do
  	from BindOCL::VariableExp
  	to   OUT::OCL::VariableExp  
  	mapping do |atl, out|
     
      if atl.referredVariable.nil?
        # This is "self". It doesn't load the referred object
        # because it is in the original ATL model...
        out.referredVariable = OUT::OCL::VariableDeclaration.new(:varName => 'self')
      else
        out.referredVariable = atl.referredVariable;
  	  end 
  	end
  end
end


# This phase takes two parameters (as global variables...):
#   - $N_binding_parameter: A class binding element
#   - $N_concrete_parameter: The concrete metaclass to be used for this execution
#
# This phase copies any rule or helper whose "from" type is the same as "$N_binding_parameter",
# making the type be $N_concrete_parameter. 
#
phase 'copy_rules_for_N_binding' do
  COPY_N_IGNORED_CLASSES = [ ATL::ATL::MatchedRule, ATL::ATL::Helper, ATL::OCL::OclModelElement ]# , ATL::OCL::OclModelElement ]
  
  top_rule 'copy_rule' do
    from ATL::ATL::MatchedRule
    to   OUT::ATL::MatchedRule
    filter { |atl| 
      ocl_element = atl.inPattern.elements.first.get('type')
      
      ocl_element.belongsTo($N_binding_parameter.model_.metamodel) && 
      ocl_element.name == $N_binding_parameter.concept.name
    }    
    mapping do |atl, out|
      out.module = trace_query(atl.module).one!(OUT::ATL::Module)
    
      out.name      = atl.name + '_copy_for' + $N_concrete_parameter.name
      out.inPattern = atl.inPattern
      out.outPattern = atl.outPattern
      out.actionBlock = atl.actionBlock
      out.variables   = atl.variables
      
      # Renaming is done here, just to simplify things
      ocl_element = out.inPattern.elements.first.get('type')
      ocl_element.name = $N_concrete_parameter.name
      
      raise "Not implemented yet" if atl.isAbstract
    end
  end
  
  top_rule 'copy_helper' do
    from ATL::ATL::Helper
    to   OUT::ATL::Helper
    filter { |atl|
      # This check is in case it is a global helper (with no context) 
      if atl.definition.context_ != nil && 
         atl.definition.context_.context_.kind_of?(ATL::OCL::OclModelElement)
        
        ocl_element = atl.definition.context_.context_

#        puts $N_binding_parameter.concept.name        
#        puts $N_concrete_parameter.name
#        puts atl.definition.feature.name        
        
        result = ocl_element.belongsTo($N_binding_parameter.model_.metamodel) && 
          ocl_element.name == $N_binding_parameter.concept.name
        
#        puts "--- #{result}"
        
        result
      else
        false
      end
    }    
    mapping do |atl, out|
      out.module = trace_query(atl.module).one!(OUT::ATL::Module)
    
      out.definition = atl.definition 
#      puts "==> #{out.definition.feature.name}"
      
      # Renaming is done here, just to simplify things
      ocl_element = out.definition.context_.context_
      ocl_element.name = $N_concrete_parameter.name
    end
  end  

  # This 
  rule 'Copy_OclModelElement_In_helper' do
    from ATL::OCL::OclModelElement
    to   OUT::OCL::OclModelElement  
    filter { |ocl| ocl.__container__.kind_of?(ATL::OCL::OclContextDefinition) }
    mapping do |atl, out|
      result = atl.belongsTo($N_binding_parameter.model_.metamodel) && 
               atl.name == $N_binding_parameter.concept.name
      
      if result 
        out.name  = $N_concrete_parameter.name
      else
        out.name  = atl.name
      end 

      out.model = atl.model  
    end 
  end

  # Copied from "rename_classes"
  rule 'Copy_OclModelElement_Normal' do
    from ATL::OCL::OclModelElement
    to   OUT::OCL::OclModelElement  
    filter { |ocl| ! ocl.__container__.kind_of?(ATL::OCL::OclContextDefinition) }
    mapping do |atl, out|
      out.name = atl.name
      # Name rewritten if needed...
      Bind::ClassBinding.all_objects.each do |cb|
        if ( atl.belongsTo(cb.model_.metamodel) && atl.name == cb.concept.name ) 			
          #raise "Not considered. Concrete types: #{cb.concrete.map { |c| c.name }.join(', ')}" if cb.concrete.size > 1
  		  # Will be updated later if cb.concrete.size > 0 by rewritten the expression where this is involved
  		  out.name = cb.concrete[0].name;
  		end  	
      end
      out.model = atl.model  
    end 
  end
  
 

  ATL::ATL.all_klasses.each do |klass|
    next if klass.abstract
    next if COPY_N_IGNORED_CLASSES.include?(klass)
  
    klass_name = klass.name
    rule "copy_#{klass_name}" do
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
    next if COPY_N_IGNORED_CLASSES.include?(klass)
    
    klass_name = klass.name
    
    rule "copy_#{klass_name}" do
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

phase 'copy_helpers' do

  refinement_rule 'module' do
  	from ATL::ATL::Module
  	to   OUT::ATL::Module  
  	mapping do |atl, out|
      	out.elements = Bind::BHelper.all_objects
  	end
  end
  
  rule 'featureBinding2helper' do
  	from Bind::BHelper
  	to   OUT::ATL::Helper  
  	mapping do |helper, out| 
      out.definition = OUT::OCL::OclFeatureDefinition.new;
      out.definition.feature = OUT::OCL::Attribute.new;
      out.definition.feature.name = helper.feature;
      out.definition.feature.initExpression = helper.body;
      out.definition.context_ = OUT::OCL::OclContextDefinition.new;
      out.definition.context_.context_ = OUT::OCL::OclModelElement.new;
  	
  	
     out.definition.context_.context_.name = helper.contextClass.name;
  	    
      # out.definition.context_.context_.model = ATL::OCL::OclModel.all_objects.find_one { |m| m.name == MetamodelName }
     ocl_model = ATL::OCL::OclModel.all_objects.find { |m| m.name == helper.model_.metamodel }
  	 out.definition.context_.context_.model = trace_query(ocl_model).one(OUT::OCL::OclModel)
   #out.definition.context_.context_.model = trace_query(ocl_model).one!(OUT::OCL::OclModel)
   # TODO: WHY TOO MANY RESULTS?? (TRYING WITH SFC.GBIND.XMI) 
   
    
  	 #out.definition.feature.type = OUT::OCL::OclAnyType.new;
     out.definition.feature.type = helper.get('type') #OUT::OCL::OclAnyType.new;
  	end 
  end

  # Generates dynamically all rules to copy OCL elements
  HELPER_IGNORED_RULES = ['VariableExp']
  BindOCL.all_klasses.each do |klass|
    next if klass.abstract
    next if HELPER_IGNORED_RULES.include?(klass.name)
  
    klass_name = klass.name
    top_rule "copy_#{klass_name}" do
      from eval(" BindOCL::#{klass.name}")
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
  
  rule 'VariableExp_Bind' do
  	from BindOCL::VariableExp
  	to   OUT::OCL::VariableExp  
  	mapping do |atl, out|
     
      if atl.referredVariable.nil?
        # This is "self". It doesn't load the referred object
        # because it is in the original ATL model...
        out.referredVariable = OUT::OCL::VariableDeclaration.new(:varName => 'self')
      else
        out.referredVariable = atl.referredVariable;
  	  end 
  	end
  end
end

# 
# Update expressions that involves classes that has been
# mapped to NONE. In particular:
# 
# * allInstances
# * oclKindOf
#
phase 'update_none' do
  refinement_rule 'all_instances' do
    from ATL::OCL::OperationCallExp
    to   OUT::OCL::OperationCallExp
    filter do |atl, out| 
      atl.operationName == 'allInstances' &&
      atl.source.kind_of?(ATL::OCL::OclModelElement) &&
      out.source.name == 'NONE'
      
      # It is assumed that the model element has already been renamed 
    end   
    mapping do |atl, out|
      # TODO: Select the containing property from the container type
      container           = out.__container__
      containing_property = 'source'
      v = OUT::OCL::SequenceExp.new# do |ct|
        #t = OUT::OCL::SequenceType.new
        #ct.set('type', t)
      #end
      
      container.set(containing_property, v)
    end    
  end

  refinement_rule 'oclKindOf' do
    from ATL::OCL::OperationCallExp
    to   OUT::OCL::OperationCallExp
    filter do |atl, out| 
      atl.operationName == 'oclIsKindOf' &&
      atl.arguments.first.kind_of?(ATL::OCL::OclModelElement) &&
      out.arguments.first.name == 'NONE'      
      # It is assumed that the model element has already been renamed 
    end   
    mapping do |atl, out|
      v = OUT::OCL::BooleanExp.new# do |ct|
      v.booleanSymbol = false

      Util.replace_containing_property(out, v)
    end    
  end
end

phase 'update_cardinality_N' do

  refinement_rule 'oclKindOf' do
    from ATL::OCL::OperationCallExp
    to   OUT::OCL::OperationCallExp
    filter do |atl, out| 
      if atl.operationName == 'oclIsKindOf' && atl.arguments.first.kind_of?(ATL::OCL::OclModelElement)
        ocl_model_element = atl.arguments.first
        
        ocl_model_element.has_class_binding_cardinality_N?(Bind::ClassBinding.all_objects)
      else
        false
      end
    end   
    mapping do |atl, out|
      ocl_model_element = atl.arguments.first
      class_binding     = ocl_model_element.class_binding(Bind::ClassBinding.all_objects)
      
      let = OUT::OCL::LetExp.new
      let.variable = OUT::OCL::VariableDeclaration.new do |vd|
        vd.id = '__unique_id__'
        vd.varName = '__unique_id__'
        vd.type = OUT::OCL::OclAnyType.new;        
        vd.initExpression = out.source 
      end 
      
      target_oclm = OUT::OCL::OclModelElement.new(:name => class_binding.concrete.first.name)
      # Find the corresponding model element
      ocl_model = ATL::OCL::OclModel.all_objects.find { |m| m.metamodel == ocl_model_element.model.metamodel }
      target_oclm.model = trace_query(ocl_model).one(OUT::OCL::OclModel)

      initial_op = OUT::OCL::OperationCallExp.new
      initial_op.operationName = 'oclIsKindOf'
      initial_op.source = OUT::OCL::VariableExp.new do |v|
        v.referredVariable = let.variable
      end
      initial_op.arguments = target_oclm
            
      initial_or = OUT::OCL::OperatorCallExp.new
      initial_or.operationName = 'or'
      initial_or.source = initial_op
      # initial_or.arguments = ... put by the next one
      
      last_or = class_binding.concrete[1..class_binding.concrete.size - 2].inject(initial_or) { |tmp,  metaclass|
         target_oclm = OUT::OCL::OclModelElement.new(:name => metaclass.name)
         # Find the corresponding model element
         ocl_model = ATL::OCL::OclModel.all_objects.find { |m| m.metamodel == ocl_model_element.model.metamodel }
         target_oclm.model = trace_query(ocl_model).one(OUT::OCL::OclModel)
         
         op = OUT::OCL::OperationCallExp.new
         op.operationName = 'oclIsKindOf'
         op.source = OUT::OCL::VariableExp.new do |v|
           v.referredVariable = let.variable
         end
         
         op.arguments = target_oclm
         
         tmp.arguments = op
         
         next_or = OUT::OCL::OperatorCallExp.new
         next_or.operationName = 'or'
         next_or.source = tmp
         # next_or.arguments = ...
         next_or         
      }

      target_oclm = OUT::OCL::OclModelElement.new(:name => class_binding.concrete.last.name)
      # Find the corresponding model element
      ocl_model = ATL::OCL::OclModel.all_objects.find { |m| m.metamodel == ocl_model_element.model.metamodel }
      target_oclm.model = trace_query(ocl_model).one(OUT::OCL::OclModel)

      last_op = OUT::OCL::OperationCallExp.new
      last_op.operationName = 'oclIsKindOf'
      last_op.source = OUT::OCL::VariableExp.new do |v|
        v.referredVariable = let.variable
      end
      last_op.arguments = target_oclm      
      last_or.arguments = last_op 
      
      let.in_ = last_or
      
      Util.replace_containing_property(out, let)
      # out is detached, and is no longer part of the transformation AST tree
    end    
  end
end


class Util
  def self.replace_containing_property(out, v)
    self.put_expression_in_container(out.__container__, v)
      #container           = out.__container__
      #containing_property = 
      #  if container.kind_of?(OUT::OCL::Attribute)
      #    'initExpression'
      #  else
      #    'source'
      #  end      
      #
      #container.set(containing_property, v)  
  end

  def self.put_expression_in_container(container, v)
      containing_property = 
        if container.kind_of?(OUT::OCL::Attribute)
          'initExpression'
        elsif container.kind_of?(OUT::OCL::IfExp)
          'condition'
        else
          'source'
        end      
      
      container.set(containing_property, v)  
  end

end

# Given a binding between a concept and a concrete class, 
# if there is a filter expression attached to the concrete class,
# it is added to the filter of the corresponding rule.z 
# 
# So far, this is only valid for mappings with cardinality 1, but
# with a change in the DSL syntax this can be generalized to cardinality N
#
=begin
phase 'update_filter' do
  
  refinement_rule 'oclKindOf' do
    from ATL::OCL::OperationCallExp
    to   OUT::OCL::OperationCallExp
    filter do |atl, out| 
      atl.operationName == 'oclIsKindOf' &&
      atl.arguments.first.kind_of?(ATL::OCL::OclModelElement) &&
      out.arguments.first.name == 'NONE'      
      # It is assumed that the model element has already been renamed 
    end   
    mapping do |atl, out|
      v = OUT::OCL::BooleanExp.new# do |ct|
      v.booleanSymbol = false

      Util.replace_containing_property(out, v)
    end    
  end
  
end
=end


scheduling do
  execute 'copy_atl'
  execute 'rename_classes'
  execute 'create_helpers_for_renaming_feature_bindings'
  execute 'copy_ocl_feature_bindings'
  
  execute 'attribute_to_class_binding'
  
  Bind::ClassBinding.all_objects.each do |cb|
    $N_binding_parameter = cb
    cb.concrete[1..-1].each do |concrete|
      $N_concrete_parameter = concrete
      
      execute 'copy_rules_for_N_binding'      
    end
  end
  
  execute 'copy_helpers'
#  execute 'rename_classes' # TODO: Make sure this works here...
  execute 'update_none'
  execute 'update_cardinality_N'
  
  # Delete comments...
  OUT::ATL::LocatedElement.all_objects.each { |l|   
    0.upto(l.commentsBefore.size - 1).each { |idx| l.commentsBefore[idx] = '' } 
    0.upto(l.commentsAfter.size - 1).each { |idx| l.commentsAfter[idx] = '' } 
  }  
end
