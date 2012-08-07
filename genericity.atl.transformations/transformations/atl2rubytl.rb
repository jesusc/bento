
OCL = ATLMM::OCL
ATL = ATLMM::ATL

main do
  ATL::Module.all_objects.each do |m|
    fname = Parameters[:filename] || m.name + 'atl.rb'

    compose_file fname  do
      println '# Generado a partir de ' + m.name
      println
      println '# Utilidades'
println %{
  class ::Array
    def append(obj); self + [obj]; end
    def including(obj); self.append(obj); end
  end     
  
  class ::FalseClass
    def not(); ! self; end
  end 

  class ::TrueClass
    def not(); ! self; end
  end 

}
      
      println
      apply_rule :map_rule_element, m.elements
    end
  end
end

rule 'map_rule_element' do
  from ATL::CalledRule do
    text do
      println "# TODO: CALLED RULES"
    end
  end

  from ATL::MatchedRule do
    text do
      raise "Not supported" if self.inPattern.elements.size > 1
      raise "Not supported" if self.outPattern.elements.size > 1
      source_element = self.inPattern.elements.first
      target_element = self.outPattern.elements.first
    
      println "top_rule '#{self.name}' do"
      inc_indent do
        println 'from ' + source_element.type.to_decorator_context
        println '  to ' + target_element.type.to_decorator_context
        if self.inPattern.filter
          println 'filter { |' + source_element.varName + '|' + self.inPattern.filter.text + '}'       
        end
        println "mapping do |" + source_element.varName + ',' + target_element.varName + '| '
        inc_indent do
          # TODO: MAPEAR USING!!
          apply_rule :map_rule_element, target_element.bindings
        end
        println "end"
      end
      println "end"
    end
  end  

  from ATL::Binding do
    text do
      println self.__container__.varName + '.' + self.propertyName + ' = ' + self.value.text
    end
  end

  from ATL::Helper do
    text do
      context = self.definition.context_.context_
      println "decorator #{context.to_decorator_context} do "
      inc_indent do
        println "def #{self.definition.feature.name}"
        inc_indent do
          println self.definition.feature.kind_of?(OCL::Attribute) ?
                     self.definition.feature.initExpression.text :
                     self.definition.feature.body.text
        end
        println "end"
      end
      println "end" 
    end
  end
end

decorator OCL::NavigationOrAttributeCallExp do
  def text
      #method_name = Mapper.map_method(self.name)
      method_name = self.name
      self.source.text + '.' + method_name    
  end
end

decorator OCL::OperationCallExp do
  def text    
    if Mapper.is_expr(self.operationName)
      expr_name = Mapper.map_expr(self.operationName)
      '(' + self.source.text + expr_name + self.arguments.first.text + ')'     
    else
      method_name = Mapper.map_method(self.operationName)
      self.source.text + '.' + method_name + '(' + self.arguments.map { |a| a.text }.join(', ') + ')'
    end
  end
end

decorator OCL::BooleanExp do
  def text
    self.booleanSymbol ? 'true' : 'false'
  end
end

decorator OCL::StringExp do
  def text
    '"' + self.stringSymbol + '"'
  end
end

decorator OCL::IntegerExp do
  def text
    (self.integerSymbol || 0).to_s
  end
end

decorator OCL::RealExp do
  def text
    self.realSymbol.to_s
  end
end

decorator OCL::VariableExp do
  def text
    self.referredVariable.varName
  end
end

decorator OCL::SequenceExp do
  def text
    "[" + self.elements.map { |e| e.text }.join(', ') + "]"
  end
end

decorator OCL::LetExp do
  def text
    "#{self.variable.varName} = #{self.variable.initExpression.text}" + $/ +
    self.in_.text    
  end
end

decorator OCL::TupleExp do
  def text
    "ATL_Tuple.new("+ self.tuplePart.map { |p| ':' + p.varName + ' => ' + p.initExpression.text  }.join(', ') + ")"
  end
end

decorator OCL::IterateExp do
  def text
    raise "Not supported" if self.iterators.size > 1
    self.source.text + ".inject(#{self.result.initExpression.text}) { |" + self.result.varName + "," + self.iterators.first.varName + "|" + $/ +
    '  ' + self.body.text + $/ +
    "}"
  end  
end

decorator OCL::IteratorExp do
  def text
    raise "Not supported" if self.iterators.size > 1
    method_name = Mapper.map_collection(self.name)
    iterator = self.source.text + '.' + method_name + '{ |' + self.iterators.first.varName + "|" + $/ +
    '  ' + self.body.text + $/ +    
    '}'
  end
end

decorator OCL::IfExp do
  def text
    "if #{self.condition.text}" + $/ +
      self.thenExpression.text + $/ +
    "else" + $/ + 
      self.elseExpression.text + $/ +
    "end"
  end
end

# End-of EXPRESSIONS

decorator OCL::OclModelElement do
  def to_decorator_context
    "#{self.model.name}::#{self.name}"
  end
  
  def text
    self.to_decorator_context
  end
end

decorator OCL::IntegerType do
  def to_decorator_context
    "::Integer"
  end
end


class Mapper 
  
  def self.map_collection(name)
    case name
    when 'collect' then 'map'
    when 'any'     then 'any?'
    when 'select'     then 'select'
    else 
      raise "Not known #{name}" 
    end
  end
  
  EXPR = {
    'or'  => '||',
    'and' => '&&',
    '<'  => '<',
    '>'  => '>',
    '<='  => '<=',
    '>='  => '>=',
    '*'  => '*',
    '+'  => '+',
    '-'  => '-',
    '='  => '==', 
    '<>' => '!='

  }
  
  def self.is_expr(name)
    EXPR.key?(name)
  end

  def self.map_expr(name)
    EXPR[name]
  end
  
  def self.map_method(name)
    case name
    when 'oclIsKindOf' then 'kind_of?'
    when 'oclIsUndefined' then 'nil?'
    when 'oclType'      then 'metaclass'
    when 'refImmediateComposite'      then '__container__'

    # boolean
    when 'not' then 'not'


    # for collections
    when 'union'       then '+'
    when 'flatten'     then 'flatten'    
    else 
      puts "Warning: method #{name}" 
      name
    end
  end
    
end