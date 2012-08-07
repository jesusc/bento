require File.join(PROJECT_DIR, 'rubylib', 'java')
require File.join(PROJECT_DIR, 'rubylib', 'models')

CURRENT_EXAMPLE_DIR = File.join(EXAMPLES_DIR, 'flow_diagrams')
CURRENT_BINDING     = File.join(File.dirname(__FILE__), 'bender.gbind.xmi') 
CURRENT_CONCEPT     = File.join(CURRENT_EXAMPLE_DIR, 'metamodels', 'flow_concept.ecore')
CURRENT_METAMODEL   = File.join(File.dirname(__FILE__), 'StateMachine.ecore')

model_mappings_definition do
  map 'umbra.StateMachine' => CURRENT_METAMODEL
  map 'flow_concept' => CURRENT_CONCEPT  
end 

task :inject_atl_file do
  # The injector takes three arguments: file, input_dir, output_dir
  launch_java('atl.parser.Injector', 
  #    'flow2pn_noconflict.atl',
       'flow2pn.atl',
      CURRENT_EXAMPLE_DIR,
      TMP_DIR)
end

model_to_model :check_BENDER do |t|
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
            :model     => File.join(TMP_DIR, 'problems-flow2pn-bender.xmi')  

  t.parameters :stop_on_error => false
  t.transformation 'transformations/analysis/binding2problem.rb'
end          

model_to_model :binding2binding do |t|

  t.sources :model => CURRENT_BINDING,
            :namespaces => {
              'BindingDSL' => BindingDSL_Metamodel
            }

  t.sources :package   => 'Typing',
            :metamodel => 'metamodels/mismatches.ecore',
            :model     => File.join(TMP_DIR, 'problems-flow2pn-bender.xmi')  

  t.targets :package   => 'OUT',
            :metamodel => BindingDSL_Metamodel,
            :model     => File.join(TMP_DIR, 'binding-flow2pn-bender.xmi')  

  t.transformation 'transformations/binding2binding.rb'
end          

model_to_model :apply_binding_BENDER do |t|
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
            :model     => 'examples/tmp_/flow2pn-adapted-4-bender.xmi'  

  t.transformation 'transformations/apply_binding_from_dsl.rb'
end          

task :extract_adapted_transformation do
  # The extractor takes three arguments: file, input_dir, output_dir
  launch_java('atl.parser.Extractor', 
      'flow2pn-adapted-4-bender.xmi',
      TMP_DIR,
      TMP_DIR)
end

task :all_BENDER => [:inject_atl_file, :apply_binding_BENDER, :extract_adapted_transformation] 

model_to_code :convert_atl_to_rubytl do |t|  
  t.sources :package   => 'ATLMM',
            :metamodel => 'metamodels/ATL.ecore',
            :model     => File.join(TMP_DIR, 'flow2pn-adapted-4-bender.xmi')  

  t.parameters :filename => 'flow2pn-adapted-4-bender.atl.rb'
  t.codebase = TMP_DIR 
  t.generate  'transformations/atl2rubytl.rb'
end

model_to_model :bender2petri_net_with_rubytl do |t|
  t.sources :package   => 'FD',
            :metamodel => File.join(CURRENT_EXAMPLE_DIR, 'bender.concrete', 'StateMachine.ecore'),
            :model     => File.join(CURRENT_EXAMPLE_DIR, 'bender.concrete', 'collect_no_diagram.diagram')

  t.targets :package   => 'PN',
            :metamodel => File.join(CURRENT_EXAMPLE_DIR, 'metamodels', 'petri_nets.ecore'),
            :model     => File.join(TMP_DIR, 'petri_net.bender.xmi')

  t.transformation File.join(TMP_DIR, 'flow2pn-adapted-4-bender.atl.rb')
end          




