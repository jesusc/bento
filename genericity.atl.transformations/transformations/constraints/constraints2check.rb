# Given a file with constraints written in OCL,
# it generates an ATL transformation that is able
# of checking them, generating a "Problem" model.
# 
# This transformation has to be adapted using regular
# "apply_binding_from_dsl".
#
# It takes an optional paramter :strict_mode, in order
# to generate additional constraints from binding information.
#
# Input:
#   - Constraints  : Constraints in OCL
#   - Mismatches   : A mistmatch model obtaining from the typing phase  
#                    (only needed if :strict_mode => true)
# 
# Output:
#   - OUT  : Checking transformation
#

OCL = Constraints::OCL
DSL = Constraints::Genericity_ocl


class Util
  @@next_id = 0
  def self.next_id(str)
    str + (@@next_id = @@next_id + 1).to_s
  end
  
  def self.new_in_metamodel
    OUT::OCL::OclModel.new(:name => Parameters[:concept_name])
  end

  def self.new_in_ocl_model_element(type_name)
    OUT::OCL::OclModelElement.new do |m|
      m.name  = type_name
      m.model = self.new_in_metamodel   
    end
  end

  def self.new_out_ocl_model_element(type_name)
    OUT::OCL::OclModelElement.new do |m|
      m.name  = type_name
      m.model = self.new_out_metamodel   
    end
  end
  
  def self.new_out_metamodel
    OUT::OCL::OclModel.new(:name => 'Problems')  
  end
end


IN_MODEL  = OUT::OCL::OclModel.new(:name => 'IN',  :metamodel => Util.new_in_metamodel)
OUT_MODEL = OUT::OCL::OclModel.new(:name => 'OUT', :metamodel => Util.new_out_metamodel)


phase 'translate_constraints' do

  top_rule 'constraints_model2transformation_module' do
    from DSL::OclConstraintsModel
    to   OUT::ATL::Module
    mapping do |source, target| 
      target.name      = 'check_' + source.metamodel
      target.inModels  = IN_MODEL
      target.outModels = OUT_MODEL
      target.elements  = source.contexts
    end
  end
  
  rule 'context2helper_and_rule' do
    from DSL::Context
    to   OUT::ATL::Helper, OUT::ATL::MatchedRule
    mapping do |source, helper, matched_rule|
      attribute_helper_name =  Util.next_id('check_' + source.metaclass_.name)
      helper.definition = OUT::OCL::OclFeatureDefinition.new do |fd|
        fd.feature = OUT::OCL::Attribute.new do |attr|
          attr.name = attribute_helper_name        
          attr.type = OUT::OCL::BooleanType.new
          attr.initExpression = source.invariant.expr
        end
        fd.context_ = OUT::OCL::OclContextDefinition.new do |cd|
          cd.context_ = Util.new_in_ocl_model_element(source.metaclass_.name)
        end      
      end
      
      # In pattern
      matched_rule.name      = Util.next_id('rule_' + source.metaclass_.name)
      matched_rule.inPattern = OUT::ATL::InPattern.new do |p|
        p.elements = pattern_variable = OUT::ATL::SimpleInPatternElement.new do |pe|
          pe.varName  = 'source'
          pe.type  = Util.new_in_ocl_model_element(source.metaclass_.name)
        end
        p.filter = OUT::OCL::OperatorCallExp.new do |op|
          op.operationName = 'not'
          op.source        = OUT::OCL::NavigationOrAttributeCallExp.new do |call|
            call.source = OUT::OCL::VariableExp.new(:referredVariable => pattern_variable)
            call.name   = attribute_helper_name
          end
        end
      end

      # Out pattern
      matched_rule.outPattern = OUT::ATL::OutPattern.new do |p|
        p.elements = pattern_variable = OUT::ATL::SimpleOutPatternElement.new do |pe|
          pe.varName     = 'target'
          pe.type     = Util.new_out_ocl_model_element('Problem')
          pe.bindings = OUT::ATL::Binding.new do |b|
            b.propertyName = 'description'
            b.value        = OUT::OCL::StringExp.new(:stringSymbol => source.invariant.description || source.invariant.name)
          end 
        end
        
      end
                  
    end
  end

  IGNORED_RULES = ['VariableExp']
  OCL.all_klasses.each do |klass|
    next if klass.abstract
    next if IGNORED_RULES.include?(klass.name)
  
    klass_name = klass.name
    top_rule "copy_#{klass_name}" do
      from eval(" OCL::#{klass.name}")
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
  	from OCL::VariableExp
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

phase 'strict_check' do

  top_rule 'constraints_model2transformation_module' do
    from Mismatches::Info::ConcreteClassNotMapped
    to   OUT::ATL::MatchedRule
    mapping do |source, matched_rule| 

      # In pattern
      matched_rule.name      = Util.next_id('rule_not_exists' + source.dInvolvedConcreteClass)
      matched_rule.inPattern = OUT::ATL::InPattern.new do |p|
        p.elements = pattern_variable = OUT::ATL::SimpleInPatternElement.new do |pe|
          pe.varName  = 'source'
          pe.type  = Util.new_in_ocl_model_element(source.dInvolvedConcreteClass)
        end
      end

      # Out pattern
      matched_rule.outPattern = OUT::ATL::OutPattern.new do |p|
        p.elements = pattern_variable = OUT::ATL::SimpleOutPatternElement.new do |pe|
          pe.varName     = 'target'
          pe.type     = Util.new_out_ocl_model_element('Problem')
          pe.bindings = OUT::ATL::Binding.new do |b|
            b.propertyName = 'description'
            b.value        = OUT::OCL::StringExp.new(:stringSymbol => 'Object of type ' + source.dInvolvedConcreteClass + ' exists but type has not been bound')
          end 
        end
        
      end

    end
  end

end if Parameters[:strict_mode] # To avoid evaluation of the types used in the phase


scheduling do
  execute 'translate_constraints'
  #execute 'strict_check' if Parameters[:strict_mode]
end
