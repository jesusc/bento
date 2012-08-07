require File.join(PROJECT_DIR, 'rubylib', 'java')
require File.join(PROJECT_DIR, 'rubylib', 'models')

CURRENT_EXAMPLE_DIR = File.join(EXAMPLES_DIR, 'flow_diagrams')
CURRENT_BINDING     = File.join(File.dirname(__FILE__), 'bpmn2.gbind.xmi') 
CURRENT_CONCEPT     = File.join(CURRENT_EXAMPLE_DIR, 'metamodels', 'flow_concept.ecore')
CURRENT_METAMODEL   = File.join(File.dirname(__FILE__), 'BPMN2.ecore')

task :inject_atl_file do
  # The injector takes three arguments: file, input_dir, output_dir
  launch_java('atl.parser.Injector', 
      'flow2pn.atl',
      CURRENT_EXAMPLE_DIR,
      TMP_DIR)
end

model_to_model :check_BPMN2 => :inject_atl_file do |t|
  t.sources :package   => 'ATL',
            :metamodel => 'metamodels/ATL.ecore',
            :model => 'examples/tmp_/flow2pn.atl.xmi'

  t.sources :model => CURRENT_BINDING,
            :namespaces => {
              'BindingDSL' => BindingDSL_Metamodel,
              'BindATL' => 'metamodels/ATL.ecore'
            }
            
  t.sources :package   => 'Concept',
            :metamodel => 'http://www.eclipse.org/emf/2002/Ecore',
            :model => CURRENT_CONCEPT

  t.sources :package   => 'Concrete',
            :metamodel => 'http://www.eclipse.org/emf/2002/Ecore',
            :model => CURRENT_METAMODEL

  t.targets :package   => 'OUT',
            :metamodel => 'metamodels/mismatches.ecore',
            :model     => File.join(TMP_DIR, 'problems-flow2pn-bpmn2.xmi')  

  t.parameters :stop_on_error => false
  t.transformation 'transformations/analysis/binding2problem.rb'
end  

model_to_model :apply_binding_BPMN2 do |t|
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
            :model     => 'examples/tmp_/flow2pn-adapted-4-bpmn2.xmi'  

  t.transformation 'transformations/apply_binding_from_dsl.rb'
end          

task :extract_adapted_transformation do
  # The extractor takes three arguments: file, input_dir, output_dir
  launch_java('atl.parser.Extractor', 
      'flow2pn-adapted-4-bpmn2.xmi',
      TMP_DIR,
      TMP_DIR)
end

task :all_BPMN2 => [:inject_atl_file, :apply_binding_BPMN2, :extract_adapted_transformation] 





