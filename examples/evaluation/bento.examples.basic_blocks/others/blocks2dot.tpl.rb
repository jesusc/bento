
class IdGenerator
  def self.next 
    @next = (@next || 0) + 1
  end
end

decorator BBL::BasicBlock do
  def unique_id
    @idx ||= 'id_' + IdGenerator.next.to_s
  end 
end

main do
  compose_file 'graph.dot' do
    println "digraph G {"
    println "node [ shape = box ];"
    
    
    BBL::BlockChunk.all_objects.each do |chunk|
      println "subgraph cluster_#{IdGenerator.next} {"    
      println "label = \"#{chunk.identifier}\""
      graph_blocks = chunk.blocks       
    
      inc_indent do
    
        graph_blocks.each do |b|
          # Look out! Not all edges has a target (e.g., else's)
          chain = b.unique_id  + ' -> {' + b.edges.select { |e| e.target }.map { |e| e.target.unique_id }.join(';') + ' }'     
          println chain + ";"
        end       
      
        graph_blocks.each do |b|
          println b.unique_id + ' [label = "' + b.identifier + '"];'
        end
      end
      println "}"
    end
    println "}"  
  end 
end
