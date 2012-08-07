
class ::ProblemDetector

  # Checks:
  #   * For each concrete class "cc" bound to the class owning the feature "co"
  #     * There is a feature binding from "co"."feature" to something
  #       If "co" is mapped to several "cc" then qualifiers must be taken into account.
  #     or (if missing)
  #     * There is a binding 
  #       Would I need to look qualified classes recursively...? 
  #
  # Look out! With "flatten hierarchy" leaf nodes in the concept are mapped to something
  #           in the concrete, so you can find subclasses of the root(s) classes where
  #           the binding to corresponding features has to be done.
  #           
  #           With "class split" qualifiers are need to know to which replica are
  #           we referring to!
  #
  # PROBABLY RECURSIVE FUNCTION LOOKING FOR FEATURES IN SUBCLASSES!!
  #
  def self.check_feature_binding_exists(problem_context, efeature)
    klass    = efeature.__container__
    return unless klass.class_binding # This is because all checks are independent from each other...
    
    bindings = Bind::BaseFeatureBinding.all_objects.select { |b| b.conceptClass.name == klass.name && b.conceptFeature == efeature.name }
    ccs      = klass.class_binding.concrete_eclasses

    # TODO: Do a test to check that his condition works
    if bindings.size > ccs.size 
      problem_context.problems = OUT::Problem::TooManyFeatureBindings.new(:involvedConceptClasses => klass,
                                                                          :dInvolvedConceptClasses => klass.name,
                                                                          :featureName => efeature.name)
      return
    end
    
    if bindings.size == 0
      problem_context.problems = OUT::Problem::NotMappedFeature.new(:involvedConceptClasses => klass,
                                                                          :dInvolvedConceptClasses => klass.name,
                                                                          :featureName => efeature.name)
      return          
    end

    if ccs.size == 1
      # TODO: Check that the user have not used a qualifier!
      #       Don't know if related, but it should be though whether it make sense to qualify subclasses...
      yield(bindings.first) if block_given?
      return
    end
    
    not_mapped = ccs.reject { |cc| bindings.any? { |b| b.qualifier.name == cc.name } }
    unless not_mapped.empty?
      problem_context.problems = OUT::Problem::NotMappedFeature.new(:involvedConceptClasses => klass,
                                                                          :dInvolvedConceptClasses => klass.name,
                                                                          :featureName => efeature.name)
      return    
    end    

    bindings.each { |b| yield(b) } if block_given?
  end

  def self.check_target_class(problem_context, class_name)
    return if class_name == "NONE"
    unless klass = Concrete::EClass.all_objects.find { |c| c.name == class_name }
      problem_context.problems = OUT::Problem::ConcreteClassNotFound.new(:className => class_name)
    end
  end
  
  # Checks:
  # 
  #   1. Name clashes
  #   2. Rule conflicts
  #
  def self.check_double_role(problem_context, concrete_eclass, concept_classes)
    # Name clashes
    possible_clashes = { }
    concept_classes.each do |c|
      c.all_structural_features.each do |f|
        (possible_clashes[f.name] ||= []) << c
      end
    end
    
    possible_clashes.each do |key, value|
      if value.size > 1
        problem_context.problems = OUT::Problem::FeatureNameClash.new do |p|
          p.featureName = key
          p.dInvolvedConceptClasses = value.map(&:name) 
 	      p.set 'involvedConceptClasses', value          
        end        
      end
    end
    
    # Rule conflicts
    # A warning is always issued, in case the language is ATL
    # To look for binding-based conflict resolution:
    #   
    #   
    
    # Looks for bindings where the right part is of a type compatible with the concept class
    #                      and the  left part is of a type assignable from the concrete class    
    puts concept_classes.size
    shared_sites = concept_classes.map { |co|
      ATL::ATL::MatchedRule.all_objects.map { |r| r.binding_sites(co, concrete_eclass) }.compact
    }.flatten
    
    puts "shared sites"
    puts shared_sites.size
    puts shared_sites    
    #if shared_sites.size >= 1
    #  puts "Shared site!"
    #end
    
  
  end  
  
end

#
# Redefinition of to_s methods to improve standard ouput infomation 
#

decorator OUT::Problem::FeatureNameClash do
  def to_s
    " Feature: '" + self.featureName + "' clash in classes: " + self.involvedConceptClasses.map(&:name).join(', ')
  end
end

decorator OUT::Problem::TooManyFeatureBindings do
  def to_s
    " Feature: '" + self.featureName + "' mapped more than #{self.involvedConceptClasses.size} as required by classes: " + self.involvedConceptClasses.map(&:name).join(', ')
  end
end

decorator OUT::Problem::NotMappedFeature do
  def to_s
    " Feature: '" + self.featureName + "' no mapped for classes: " + self.involvedConceptClasses.map(&:name).join(', ')
  end
end

decorator OUT::Problem::NotMappedClass do
  def to_s
    " Class not mapped: '" + self.involvedConceptClasses.map(&:name).join(', ')
  end
end

