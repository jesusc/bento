# Given a binding model, plus a model with the type 
# checking and infering information, a new binding model is derived
# that has not longer implicit mappings.
#
# Input:
#   - BindingDSL : Original binding specification
#   - Typing     : Typing and infering information
#   
# Output:
#   - OUT  : Adapted binding specification
#


Bind    = BindingDSL::Genericity_dsl
BindOCL = BindingDSL::OCL

OutBind = OUT::Genericity_dsl
OutOCL  = OUT::OCL

phase 'copy_binding' do

  # Generated rules are normal rules, so that they are executed
  # only on demand 
  rule 'BindingModel' do
    from Bind::BindingModel
    to   OutBind::BindingModel
    mapping do |source, target| 
        target.bindings  = source.bindings
        target.helpers   = source.helpers
        target.metamodel = source.metamodel
        target.name      = source.name
        target.variables = source.variables
    end
  end
  
  rule 'ConceptMetaclass' do
    from Bind::ConceptMetaclass
    to   OutBind::ConceptMetaclass
    mapping do |source, target| 
        target.name = source.name
    end
  end

  rule 'ConcreteMetaclass' do
    from Bind::ConcreteMetaclass
    to   OutBind::ConcreteMetaclass
    mapping do |source, target| 
        target.name = source.name
    end
  end

  rule 'ClassBinding' do
    from Bind::ClassBinding
    to   OutBind::ClassBinding
    mapping do |source, target| 
      target.debugName = source.debugName
      target.model_    = source.model_
    
      target.concept  = source.concept
      target.concrete = source.concrete
      target.whenClause = source.whenClause
    end
  end

  ignore_rule Bind::RenamingFeatureBinding => OutBind::RenamingFeatureBinding

  rule 'RenamingFeatureBinding' do
    from Bind::RenamingFeatureBinding
    to   OutBind::RenamingFeatureBinding
    filter { |b|
      ! Typing::Core::FeatureRenaming.all_objects.any? { |fr| fr.featureBinding == b && fr.equalNames }    
    }    
    mapping do |source, target| 
      target.debugName = source.debugName
      target.model_    = source.model_
    
      target.conceptFeature = source.conceptFeature
      target.conceptClass   = source.conceptClass
      target.qualifier      = source.qualifier

      target.concreteFeature = source.concreteFeature
    end
  end

  rule 'OclFeatureBinding' do
    from Bind::OclFeatureBinding
    to   OutBind::OclFeatureBinding
    mapping do |source, target| 
      target.debugName = source.debugName
      target.model_    = source.model_
    
      target.conceptFeature = source.conceptFeature
      target.conceptClass   = source.conceptClass
      target.qualifier      = source.qualifier

      target.concrete = source.concrete
    end
  end

  rule 'BHelper' do
    from Bind::BHelper
    to   OutBind::BHelper
    mapping do |source, target| 
      target.feature      = source.feature
      target.contextClass = source.contextClass
      target.body         = source.body
      target.type         = source.get('type')      
      target.model_       = source.model_
    end
  end

  
  IGNORED_RULES = []
  BindOCL.all_klasses.each do |klass|
    next if klass.abstract
    next if IGNORED_RULES.include?(klass.name)
  
    klass_name = klass.name
    rule "copy_#{klass_name}" do
      from eval(" BindOCL::#{klass.name}")
      to   eval("  OutOCL::#{klass.name}")
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
  execute 'copy_binding'
end