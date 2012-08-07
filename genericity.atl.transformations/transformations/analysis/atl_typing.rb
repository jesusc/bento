
class TypeUtil
  def self.minimum_type(type1, type2)
    if type1.is_supertype_of?(type2)
      return type1
    elsif type2.is_supertype_of?(type1)
      return type2
    else
      return NoRecognizedType.object
    end
  end
  
  def self.find_helper(eclass, featureName)
    ATL::ATL::Helper.all_objects.each { |h|
      type_name   = h.definition.context_.context_.name
      next if not type_name
      helper_type = Util.find_class_in(Concept::EClass, type_name)
      
      if ([eclass] + eclass.eAllSuperTypes).include?(helper_type)
        return PossibleType.new(helper_type)
      end
    }
    return nil
  end
end

class ::NoRecognizedType
  def source_conforms_to?(concept_eclass)
    false
  end
  
  def is_supertype_of?(whatever); false; end
  
  def feature_type(feature_name)
    self.class.object
  end  

  def operation_call_type(op_name, argument_types)
    self.class.object
  end
    
  def self.object; NoRecognizedType.new; end
end

class CollectionType
  def initialize(*col_types)
    @types = col_types    
  end
  
  def source_conforms_to?(concept_eclass)
    @types.any? { |t| t.source_conforms_to?(concept_eclass) }
  end
  
  def operation_call_type(op_name, argument_types)
    case op_name
    when "collect" then raise "Not supported"
    when "select"  then return CollectionType.new(*@types)
    when "union"  then return CollectionType.new(*(@types + [argument_types.first]))
    when "append"  then return CollectionType.new(*(@types + [argument_types.first]))
    end
    puts "Collection type operation " + op_name + " not supported"
    
    NoRecognizedType.object
  end
end

class PossibleType
  def initialize(eclass)
    @eclass = eclass
  end
  
  def feature_type(feature_name)
    helper_type = TypeUtil.find_helper(@eclass, feature_name)
    return helper_type if helper_type
    
    f = @eclass.getEStructuralFeature(feature_name)       
    t = PossibleType.new(Util.find_class_in(Concept::EClass, f.eType.name))
    return f.multivalued? ? CollectionType.new(t) : t    
  end  

  def operation_call_type(op_name, argument_types)
    helper_type = TypeUtil.find_helper(@eclass, op_name)
    return helper_type if helper_type
    puts "No type for operation call #{op_name}"
    return NoRecognizedType.object  
  end
 
  def source_conforms_to?(concept_eclass)
    self.is_supertype_of?(concept_eclass)
  end
  
  def is_supertype_of?(concept_eclass)
     ([@eclass] + @eclass.eAllSuperTypes).include?(concept_eclass)
  end
  
end

decorator ATL::ATL::MatchedRule do

  # Computes places where this rule may be called
  #
  def binding_sites(concept_eclass, concrete_eclass)
    # I don't have typing information about the target...
    # I assume every binding may be target-compatible...

    

    source_type = self.inPattern.elements.first.get('type') 
    source_type_class = Util.find_class_in(Concept::EClass, source_type.name)
    
    target_type = self.outPattern.elements.first.get('type')
    
    return nil unless ([source_type_class] + source_type_class.eSuperTypes).include?( concept_eclass )
    
    # TODO: obtain target_type from the target concept 
    ATL::ATL::Binding.all_objects.map { |b| b.binding_sites(concept_eclass, target_type) }.compact.flatten
        
  end
end

class BindingSite
  def initialize(atl_binding)
    @atl_binding = atl_binding
  end
  
  def to_s
    "Binding site: rule " + Query.from(@atl_binding).up_to(ATL::ATL::MatchedRule).name + " & feature " + @atl_binding.propertyName
  end
end

decorator ATL::ATL::Binding do
  def binding_sites(concept_eclass, concrete_eclass)
    conforms = self.value.possible_type.source_conforms_to?(concept_eclass)
    return BindingSite.new(self) if conforms
    return nil
  end
end

decorator ATL::OCL::OperatorCallExp do
  # Assumed that operations only work for primitive objects
  def possible_type; NoRecognizedType.object; end
end

decorator ATL::OCL::IntegerExp do
  # Assumed that operations only work for primitive objects
  def possible_type; NoRecognizedType.object; end
end

decorator ATL::OCL::StringExp do
  # Assumed that operations only work for primitive objects
  def possible_type; NoRecognizedType.object; end
end

decorator ATL::OCL::IfExp do  
  def possible_type
    TypeUtil.minimum_type(self.thenExpression.possible_type,  
                          self.elseExpression.possible_type)
  end
end

decorator ATL::OCL::NavigationOrAttributeCallExp do  
  def possible_type
    self.source.possible_type.feature_type(self.name)    
  end
end

decorator ATL::OCL::OperationCallExp do  
  def possible_type
    self.source.possible_type.operation_call_type(self.operationName, self.arguments.map { |a| a.possible_type })    
  end
end

decorator ATL::OCL::VariableExp do  
  def possible_type
    self.referredVariable.possible_type
  end
end

decorator ATL::OCL::IterateExp do  
  def possible_type
    self.result.possible_type
  end
end

decorator ATL::OCL::IteratorExp do  
  def possible_type  
    CollectionType.new( self.body.possible_type )
    # TODO: Calcular select, collect...    
  end
end

decorator ATL::OCL::OclModelElement do
  def source_type
    PossibleType.new( Util.find_class_in(Concept::EClass, self.name) ) 
  end
end

decorator ATL::OCL::CollectionType do
  def source_type
    CollectionType.new( self.elementType.source_type ) 
  end
end

decorator ATL::OCL::OclAnyType do
  def source_type
    return NoRecognizedType.object 
  end
end

decorator ATL::OCL::VariableDeclaration do  
  def possible_type
    # TODO: INTENTAR INFERIR EXPRESIONES DE ITERATOR EXP
    return NoRecognizedType.object if self.get('type') == nil
    self.get('type').source_type
  end
end
