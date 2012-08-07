require File.join(PROJECT_DIR, 'rubylib', 'java')
require File.join(PROJECT_DIR, 'rubylib', 'models')

CURRENT_EXAMPLE_DIR = File.join(EXAMPLES_DIR, 'layout_algorithms')
CURRENT_BINDING     = File.join(File.dirname(__FILE__), 'layout4petrinets.gbind.xmi') 

task :inject_atl_file do
  # The injector takes three arguments: file, input_dir, output_dir
  launch_java('atl.parser.Injector', 
      'node2layout.atl',
      CURRENT_EXAMPLE_DIR,
      TMP_DIR)
end

model_to_model :apply_binding_LAYOUT do |t|
  t.sources :package   => 'ATL',
            :metamodel => 'metamodels/ATL.ecore',
            :model => 'examples/tmp_/node2layout.atl.xmi'

  t.sources :model => CURRENT_BINDING,
            :namespaces => {
              'BindingDSL' => BindingDSL_Metamodel,
              'BindATL' => 'metamodels/ATL.ecore'
            }

  t.targets :package   => 'OUT',
            :metamodel => 'metamodels/ATL.ecore',
            :model     => 'examples/tmp_/node2layout-adapted-4-petrinets.xmi'  

  t.transformation 'transformations/apply_binding_from_dsl.rb'
end          

task :extract_adapted_transformation do
  # The extractor takes three arguments: file, input_dir, output_dir
  launch_java('atl.parser.Extractor', 
      'node2layout-adapted-4-petrinets.xmi',
      TMP_DIR,
      TMP_DIR)
end

model_to_code :gen_pipe do |t|  
  t.sources :package   => 'PN',
            :metamodel => 'examples/flow_diagrams/metamodels/petri_nets.ecore',
            :model     => File.join(TMP_DIR, 'petri_net.xmi')  

  t.sources :package   => 'NODE',
            :metamodel => 'examples/layout_algorithms/metamodels/layout_nodes.ecore',
            :model     => File.join(TMP_DIR, 'layout.xmi')  

  t.codebase = TMP_DIR 
  t.generate  'examples/flow_diagrams/generator/PetriNetCodeGeneratorWithLayout.rb'
end

task :all_LAYOUT => [:inject_atl_file, :apply_binding_LAYOUT, :extract_adapted_transformation] 





