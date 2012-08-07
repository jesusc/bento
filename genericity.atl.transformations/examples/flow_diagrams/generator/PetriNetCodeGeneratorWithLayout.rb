
class IdGenerator;
  def initialize; @next_id = -1; end 
  def next; 
    @next_id = @next_id + 1
  end
end

PlaceId = IdGenerator.new
TransitionId = IdGenerator.new

decorator PN::NamedElement do
  def x
    NODE::Node.all_objects.find_one { |n| n.ref == self }.x
  end

  def y
    NODE::Node.all_objects.find_one { |n| n.ref == self }.y
  end
end

decorator PN::Place do
  def place_id
    @id ||= self.metaclass.name + PlaceId.next.to_s  
  end  
end

decorator PN::Transition do
  def transition_id
    @id ||= self.metaclass.name + TransitionId.next.to_s  
  end
end

main do
  filename = 'pipe.xml'

  compose_file filename do
    println '<?xml version="1.0" encoding="iso-8859-1"?>'
    println '<pnml>'
    println '<net id="Net-One" type="P/T net">'

    inc_indent do
      apply_rule :gen_element, PN::Place.all_objects + PN::Transition.all_objects
    end

    println "</net>"
    println "</pnml>"
    
  end
end

rule :gen_element do
  from PN::Place do
    text do
      println "<place id='#{self.place_id}'>"
      inc_indent do 
        println "<name><value>#{self.name}</value></name>"
        println "<initialMarking><value>#{self.tokens || 0}</value></initialMarking>"
        println "<graphics><position x='#{self.x}' y='#{self.y}'/></graphics>"
      end   
      println "</place>" 
      println 
    end
  end

  from PN::Transition do
    text do
      println "<transition id='#{self.transition_id}'>"
      inc_indent do 
        println "<graphics><position x='#{self.x}' y='#{self.y}'/></graphics>"
        println "<name><value>#{self.name}</value></name>"
        println "<orientation><value>90</value></orientation>"
        println "<rate><value>1.0</value></rate>"
        println "<timed><value>false</value></timed>"        
      end   
      println "</transition>" 

      self.get('in').each do |place|
        println "<arc id='#{place.place_id} to #{self.transition_id}' source='#{place.place_id}' target='#{self.transition_id}'>"
        println "<graphics/>"
        println "<inscription>"
        println "   <value>1</value>" 
        println "   <graphics/>"  
        println "</inscription>"
        println '<arcpath id="000" x="436" y="167" curvePoint="false"/>'
        println '<arcpath id="001" x="428" y="207" curvePoint="false"/>'  
        println '</arc>'      
      end
      println 
      self.out.each do |place|
        println "<arc id='#{self.transition_id} to #{place.place_id}' source='#{self.transition_id}' target='#{place.place_id}'>"
        println "<graphics/>"
        println "<inscription>"
        println "   <value>1</value>" 
        println "   <graphics/>"  
        println "</inscription>"
        println '<arcpath id="000" x="436" y="167" curvePoint="false"/>'
        println '<arcpath id="001" x="428" y="207" curvePoint="false"/>'  
        println '</arc>'      
      end
      println
      println  
    end
  end

end


