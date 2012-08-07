
Bind    = BindingDSL::Genericity_dsl
BindOCL = BindingDSL::OCL

use_library File.join(File.dirname(__FILE__), 'queries.rb')
use_library File.join(File.dirname(__FILE__), 'problems.rb')
use_library File.join(File.dirname(__FILE__), 'atl_typing.rb')
use_library 'library://util/query'

Model = OUT::Core::Model.new

phase 'simple' do
  rule 'classes' do
    from Concept::EClass
    to   OUT::Core::MClass
    mapping do |source, target|
      Model.classes = target
     
      target.name = source.name
      # target.features = source.eAllStructuralFeatures
      target.features = source.eStructuralFeatures
    end
  end
  
  rule 'attribute' do
    from Concept::EAttribute
    to   OUT::Core::MAttribute
    mapping do |source, target| 
      target.name = source.name
    end    
  end

  rule 'reference' do
    from Concept::EReference
    to   OUT::Core::MReference
    mapping do |source, target| 
      target.name = source.name
    end    
  end  
end


phase 'renamings' do
  refinement_rule 'classes' do
    from Concept::EClass
    to   OUT::Core::MClass
    filter { |c, _| c.class_binding_is_renaming? }
    mapping do |source, mclass|
      target_metaclass = source.class_binding.concrete.first
      mclass.mismatch  = OUT::Core::ClassRenaming.new do |cr|
        cr.conceptMetaclass  = source.name 
        cr.concreteMetaclass = target_metaclass.name
      end    
      
      ProblemDetector.check_target_class(mclass, target_metaclass.name)
    end
  end
end

phase 'class_binding' do
  refinement_rule 'classes' do
    from Concept::EClass
    to   OUT::Core::MClass
    filter { |klass, _| ! klass.class_binding }
    mapping do |source, target|
      target.problems = OUT::Problem::NotMappedClass.new(:involvedConceptClasses => source,
                                                         :dInvolvedConceptClasses => source.name)

    end
  end
end


phase 'feature_binding' do
  # Not sure this is complete, it has to be for "ALL" structual features of each class (including inherited)
  # to ensure that if a superclass is not bound (but their children do) then the check is performed
  refinement_rule 'feature' do
    from Concept::EStructuralFeature
    to   OUT::Core::MFeature
    mapping do |source, target| 
      ProblemDetector.check_feature_binding_exists(target.__container__, source) do |b|
        
        # Here is where we find renamings of the same name
        if b.kind_of?(Bind::RenamingFeatureBinding)
          fr = OUT::Core::FeatureRenaming.new
          fr.set 'featureBinding', b
          fr.equalNames = b.conceptFeature == b.concreteFeature
        end
      end
    end    
  end

end

phase 'double_role' do
  rule 'check_double_role' do
    from Concrete::EClass
    to   OUT::Core::DoubleRole
    filter { |c| c.is_double_role_pattern? }
    mapping do |concrete, pattern|
      pattern.dConcreteClass  = concrete.eclass.name
      pattern.dConceptClasses = concrete.double_role_classes.map { |c| c.name }
      pattern.set 'concreteClass', concrete.eclass
      pattern.set 'conceptClasses', concrete.double_role_classes
    
      ProblemDetector.check_double_role(pattern, concrete.eclass, concrete.double_role_classes)
    end
  end
end

phase 'additional_info' do
  rule 'concrete_not_mapped' do
    from Concrete::EClass
    to   OUT::Info::ConcreteClassNotMapped
    filter do |c|
      c.class_bindings.size == 0 && ! c.eclass.abstract
    end
    mapping do |concrete, info|
      info.dInvolvedConcreteClass = concrete.name
    end
  end
    
end

scheduling do
  execute 'simple'
  execute 'renamings'  
  
  # checking
  execute 'class_binding'
  execute 'feature_binding'
  execute 'double_role'

  # gather info...
  execute 'additional_info'
   
  problems = OUT::Problem::Problem.all_objects
  if problems.size > 0
    puts 
    puts "There are #{problems.size} problems:"  
    problems.each do |p|
      puts "  * #{p.metaclass.name}: #{p}"
    end
    puts
    if Parameters[:stop_on_error]
      puts "Terminated!"
      exit
    end
  end
  
end