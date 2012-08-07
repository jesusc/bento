require File.join(PROJECT_DIR, 'rubylib', 'java')
require File.join(PROJECT_DIR, 'rubylib', 'models')
# require File.join(PROJECT_DIR, 'rubylib', 'files')

# Depends on nqc.concrete

CURRENT_BINDING = File.join(File.dirname(__FILE__), 'dgraph.gbind.xmi') 

model_to_model :apply_target_binding_DGRAPH do |t|
  t.sources :package   => 'ATL',
            :metamodel => 'metamodels/ATL.ecore',
            :model => "#{TMP_DIR}/basicblocks-adapted-4-nqc.xmi"

  t.sources :model => CURRENT_BINDING,
            :namespaces => {
              'BindingDSL' => BindingDSL_Metamodel,
              'BindATL' => 'metamodels/ATL.ecore'
            }

  t.targets :package   => 'OUT',
            :metamodel => 'metamodels/ATL.ecore',
            :model     => 'examples/tmp_/basicblocks-adapted-4-dgraph.xmi'  

  t.transformation 'transformations/apply_target_binding_from_dsl.rb'
end          

task :extract_adapted_transformation do
  # The extractor takes three arguments: file, input_dir, output_dir
  launch_java('atl.parser.Extractor', 
      'basicblocks-adapted-4-dgraph.xmi',
      TMP_DIR,
      TMP_DIR)
end

task :all_DGRAPH => [:apply_target_binding_DGRAPH, :extract_adapted_transformation] 


# The result is stored in a file called "graph.dot", within "tmp_"
# Visualize:
#     dotty graph.dot
# Generate svg:
#     dot -Tsvg graph.dot > graph.svg
#     inkview graph.svg
model_to_code :NQC_to_dot do |t|  
  t.sources :package   => 'BBL',
            :metamodel => 'examples/basicblocks/BasicBlocks.ecore',
            :model     => 'examples/tmp_/flow-result.xmi'  

  t.codebase = 'examples/tmp_/' 
  t.generate  'examples/basicblocks/blocks2dot.tpl.rb'
end


