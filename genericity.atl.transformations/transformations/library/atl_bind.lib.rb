
decorator ATL::OCL::OclModelElement do
  # b : Bind::Bindings
  def belongsTo(metamodel_name)
    return false if self.model == nil  
     # // todo: check que self.model.metamodel == null
    self.model.name == metamodel_name 
  end 
  
  def has_class_binding?(class_binding_list)
    class_binding(class_binding_list) != nil
  end

  def has_class_binding_cardinality_N?(class_binding_list)
    cb = class_binding(class_binding_list)
    return false unless cb
    return cb.concrete.size > 1
  end

  def has_class_to_attribute_binding?(class_binding_list)
    cb = class_binding(class_binding_list)
    cb != nil && cb.whenClause != nil 
  end
  
  def class_binding(class_binding_list)
    class_binding_list.each do |cb|
  	   if ( self.belongsTo(cb.model_.metamodel) && self.name == cb.concept.name ) 			
  		  return cb
  	   end  	
    end    
    return nil
  end
end 
