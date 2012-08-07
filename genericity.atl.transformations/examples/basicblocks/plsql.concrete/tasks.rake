require File.join(PROJECT_DIR, 'rubylib', 'java')
require File.join(PROJECT_DIR, 'rubylib', 'models')

FLOWGRAPH_DIR    = File.join(EXAMPLES_DIR, 'basicblocks')
CURRENT_BINDING = File.join(File.dirname(__FILE__), 'plsql.gbind.xmi') 

task :inject_atl_file do
  # The injector takes three arguments: file, input_dir, output_dir
  launch_java('atl.parser.Injector', 
      'basicblocks.atl',
      FLOWGRAPH_DIR,
      TMP_DIR)
end

model_to_model :apply_binding_PLSQL do |t|
  t.sources :package   => 'ATL',
            :metamodel => 'metamodels/ATL.ecore',
            :model => 'examples/tmp_/basicblocks.atl.xmi'

  t.sources :model => CURRENT_BINDING,
            :namespaces => {
              'BindingDSL' => BindingDSL_Metamodel,
              'BindATL' => 'metamodels/ATL.ecore'
            }

  t.targets :package   => 'OUT',
            :metamodel => 'metamodels/ATL.ecore',
            :model     => 'examples/tmp_/basicblocks-plsql.xmi'  

  t.transformation 'transformations/apply_binding_from_dsl.rb'
end          

task :extract_adapted_transformation do
  # The extractor takes three arguments: file, input_dir, output_dir
  launch_java('atl.parser.Extractor', 
      'basicblocks-plsql.xmi',
      TMP_DIR,
      TMP_DIR)
end

task :all_PLSQL => [:inject_atl_file, :apply_binding_PLSQL, :extract_adapted_transformation] 


# The result is stored in a file called "graph.dot", within "tmp_"
# Visualize:
#     dotty graph.dot
# Generate svg:
#     dot -Tsvg graph.dot > graph.svg
#     inkview graph.svg
model_to_code :PLSQL_to_dot do |t|  
  t.sources :package   => 'BBL',
            :metamodel => 'examples/basicblocks/BasicBlocks.ecore',
            :model     => 'examples/tmp_/flow-result.xmi'  

  t.codebase = 'examples/tmp_/' 
  t.generate  'examples/basicblocks/blocks2dot.tpl.rb'
end


