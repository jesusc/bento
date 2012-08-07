
class Util
  def self.find_class_in(type, name)
    t = type.all_objects.find { |c| c.name == name }
    raise "Class not found #{name}" unless t
    t
  end
end

decorator BindingDSL::Genericity_dsl::ClassBinding do
  def concept_eclass
    @ce ||= Concept::EClass.all_objects.find_one { |c| c.name == self.concept.name }
  end

  def concrete_eclasses
    @cc ||= self.concrete.reject { |c| c.name == 'NONE' }.map { |cc| Util.find_class_in(Concrete::EClass, cc.name) }
  end
end

decorator Concept::EClass do
  def class_binding
    @cb ||= Bind::ClassBinding.all_objects.find { |cb| cb.concept.name == self.name }
  end
  
  def class_binding_is_renaming?
    self.class_binding && 
    self.class_binding.concrete.size == 1
  end

  def direct_subclasses
    @direct_subclasses ||= Concept::EClass.all_objects { |c| c.eSuperTypes.include?(self) }
  end
 
  def all_subclasses
    @subclasses ||= Concept::EClass.all_objects.select { |c| c.eAllSuperTypes.include?(self) }
  end
  
  def complete_hierarchy
    self.eAllSuperTypes + [self] + self.all_subclasses
  end
end 

decorator Concrete::EClass do
  def eclass
    Util.find_class_in(Concrete::EClass, self.name)
  end

  def class_bindings
    #@cbs ||= Bind::ClassBinding.all_objects.select { |cb| cb.concrete.any? { |c| c.name == self.name } }
    @sorted_cbs ||= Bind::ClassBinding.all_objects.select { |cb| cb.concrete.any? { |c| c.name == self.name } }.
                    sort_by { |cb| cb.concept_eclass.complete_hierarchy.map { |t| t.name }.index(cb.concept.name)  }

    #                sort_by { |cb| cb.concept_eclass.complete_hierarchy.map { |t| t.name }.index(self.name)  }
    # TODO: Not sure why this works (sometimes)...
  end

  def sort_all_class_bindings
    @sorted_all ||= Bind::ClassBinding.all_objects.
                    sort_by { |cb| cb.concept_eclass.complete_hierarchy.map { |t| t.name }.index(cb.concept.name)  }  
  end

  # == DoubleRole heterogeinity
  # 
  # Pattern detection rules:
  #  * The class is bound to two or more concept classes
  #    Such binding can be direct or indirect (because a superclass is bound),
  #    but bindings to the elements of the same hierarchy count only once.
  #    
  # == Return the list of concept classes (Concept::EClass) involved, or nil if not found
  #  
  def is_double_role_pattern?
    return double_role_classes != nil
  end
  
  def double_role_classes
    found = []
    sort_all_class_bindings.each do |cb|
      classes = cb.concrete_eclasses.select { |c| ([c] + c.all_subclasses).include?(self) }
      
      raise "Error " + self.name if classes.size > 1
      if classes.size == 1
        cc = cb.concept_eclass
        if idx = found.index { |c| ([cc] + cc.eAllSuperTypes).include?(c) }
          found[idx] = cc
        else
          found << cc
        end
      end
    end

    return nil if found.size < 2
    #return false unless found.include?(self) # not needed
    return found    
  end

  def all_subclasses
    @subclasses ||= Concrete::EClass.all_objects.select { |c| c.eAllSuperTypes.include?(self) }
  end
  
  def complete_hierarchy
    self.eAllSuperTypes + [self] + self.all_subclasses
  end


end
