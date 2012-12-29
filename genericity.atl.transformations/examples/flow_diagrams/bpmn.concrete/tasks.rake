require File.join(PROJECT_DIR, 'rubylib', 'java')
require File.join(PROJECT_DIR, 'rubylib', 'models')

CURRENT_EXAMPLE_DIR = File.join(EXAMPLES_DIR, 'flow_diagrams')
CURRENT_BINDING     = File.join(File.dirname(__FILE__), 'bpmn.gbind.xmi') 

task :inject_atl_file do
  # The injector takes three arguments: file, input_dir, output_dir
  launch_java('atl.parser.Injector', 
      'flow2pn.atl',
      CURRENT_EXAMPLE_DIR,
      TMP_DIR)
end

model_to_model :apply_binding_BPMN do |t|
  t.sources :package   => 'ATL',
            :metamodel => 'metamodels/ATL.ecore',
            :model => 'examples/tmp_/flow2pn.atl.xmi'

  t.sources :model => CURRENT_BINDING,
            :namespaces => {
              'BindingDSL' => BindingDSL_Metamodel,
              'BindATL' => 'metamodels/ATL.ecore'
            }

  t.targets :package   => 'OUT',
            :metamodel => 'metamodels/ATL.ecore',
            :model     => 'examples/tmp_/flow2pn-adapted-4-bpmn.xmi'  

  t.transformation 'transformations/apply_binding_from_dsl.rb'
end          

task :extract_adapted_transformation do
  # The extractor takes three arguments: file, input_dir, output_dir
  launch_java('atl.parser.Extractor', 
      'flow2pn-adapted-4-bpmn.xmi',
      TMP_DIR,
      TMP_DIR)
end

task :all_BPMN => [:inject_atl_file, :apply_binding_BPMN, :extract_adapted_transformation] 
task :all_BPMN_1 => [:apply_binding_BPMN, :extract_adapted_transformation] 





