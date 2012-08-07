require File.join(PROJECT_DIR, 'rubylib', 'java')
require File.join(PROJECT_DIR, 'rubylib', 'models')

CURRENT_EXAMPLE_DIR = File.join(EXAMPLES_DIR, 'flow_diagrams')
CURRENT_BINDING     = File.join(File.dirname(__FILE__), 'sfc.gbind.xmi') 

task :inject_plc_file do
  # The injector takes three arguments: file, input_dir, output_dir
  launch_java('genericity.xsd.LoadXML', 
      File.join(CURRENT_EXAMPLE_DIR, 'grafcet.concrete', 'plc.xml'),
      File.join(TMP_DIR, 'plc.xmi'))
end

task :inject_atl_file do
  # The injector takes three arguments: file, input_dir, output_dir
  launch_java('atl.parser.Injector', 
      'flow2pn.atl',
      CURRENT_EXAMPLE_DIR,
      TMP_DIR)
end

model_to_model :apply_binding_SFC do |t|
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
            :model     => 'examples/tmp_/flow2pn-adapted-4-sfc.xmi'  

  t.transformation 'transformations/apply_binding_from_dsl.rb'
end          

task :extract_adapted_transformation do
  # The extractor takes three arguments: file, input_dir, output_dir
  launch_java('atl.parser.Extractor', 
      'flow2pn-adapted-4-sfc.xmi',
      TMP_DIR,
      TMP_DIR)
end

task :all_SFC => [:inject_atl_file, :apply_binding_SFC, :extract_adapted_transformation] 





