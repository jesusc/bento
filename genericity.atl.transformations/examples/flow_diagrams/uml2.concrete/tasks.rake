require File.join(PROJECT_DIR, 'rubylib', 'java')
require File.join(PROJECT_DIR, 'rubylib', 'models')

CURRENT_EXAMPLE_DIR = File.join(EXAMPLES_DIR, 'flow_diagrams')
CURRENT_BINDING     = File.join(File.dirname(__FILE__), 'activity_uml2.gbind.xmi') 
CURRENT_CONCEPT     = File.join(CURRENT_EXAMPLE_DIR, 'metamodels', 'flow_concept.ecore')
CURRENT_METAMODEL   = File.join(File.dirname(__FILE__), 'UML.ecore')

model_mappings_definition do
  map 'platform:/plugin/org.eclipse.emf.ecore/model/Ecore.ecore' => 'http://www.eclipse.org/emf/2002/Ecore'
  map 'flow_concept' => CURRENT_CONCEPT  
  map 'http://www.eclipse.org/uml2/3.0.0/UML' => CURRENT_METAMODEL
end 

task :inject_atl_file do
  # The injector takes three arguments: file, input_dir, output_dir
  launch_java('atl.parser.Injector', 
  #    'flow2pn_noconflict.atl',
       'flow2pn.atl',
      CURRENT_EXAMPLE_DIR,
      TMP_DIR)
end

model_to_model :check_UML2 => :inject_atl_file do |t|
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
            :model     => File.join(TMP_DIR, 'flow2pn-mismatches-uml2.xmi')  

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
            :model     => File.join(TMP_DIR, 'problems-flow2pn-uml2.xmi')  

  t.targets :package   => 'OUT',
            :metamodel => BindingDSL_Metamodel,
            :model     => File.join(TMP_DIR, 'binding-flow2pn-uml2.xmi')  

  t.transformation 'transformations/binding2binding.rb'
end          

model_to_model :apply_binding_UML2 do |t|
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
            :model     => 'examples/tmp_/flow2pn-adapted-4-uml2.xmi'  

  t.transformation 'transformations/apply_binding_from_dsl.rb'
end          


task :extract_adapted_transformation do
  # The extractor takes three arguments: file, input_dir, output_dir
  launch_java('atl.parser.Extractor', 
      'flow2pn-adapted-4-uml2.xmi',
      TMP_DIR,
      TMP_DIR)
end

# Begin-of constraints
model_to_model :constraints_to_atl_UML2 do |t|
  t.sources :package   => 'Constraints',
            :metamodel => ConstraintsDSL_Metamodel,
            :model => File.join(CURRENT_EXAMPLE_DIR, 'metamodels', 'flow_diagrams.gocl.xmi')
            
  t.sources :package   => 'Mismatches',
            :metamodel => 'metamodels/mismatches.ecore',
            :model     => File.join(TMP_DIR, 'flow2pn-mismatches-uml2.xmi')  
            
  t.targets :package   => 'OUT',
            :metamodel => 'metamodels/ATL.ecore',
            :model     => 'examples/tmp_/flow2pn-constraints.xmi'  
  
  t.parameters :concept_name => 'FD',
               :strict_mode  => true
    
  t.transformation 'transformations/constraints/constraints2check.rb'
end          

model_to_model :apply_binding_to_constraints_UML2 do |t|
  t.sources :package   => 'ATL',
            :metamodel => 'metamodels/ATL.ecore',
            :model => 'examples/tmp_/flow2pn-constraints.xmi'

  t.sources :model => CURRENT_BINDING,
            :namespaces => {
              'BindingDSL' => BindingDSL_Metamodel,
              'BindATL' => 'metamodels/ATL.ecore'
            }

  t.targets :package   => 'OUT',
            :metamodel => 'metamodels/ATL.ecore',
            :model     => 'examples/tmp_/flow2pn-constraints-adapted-4-uml2.xmi'  

  t.transformation 'transformations/apply_binding_from_dsl.rb'
end          

task :extract_adapted_constraints do
  # The extractor takes three arguments: file, input_dir, output_dir
  launch_java('atl.parser.Extractor', 
      'flow2pn-constraints-adapted-4-uml2.xmi',
      TMP_DIR,
      TMP_DIR)
end

task :all_constraints_UML2 => [:constraints_to_atl_UML2, :apply_binding_to_constraints_UML2, :extract_adapted_constraints]

# End-of constraints

task :all_UML2 => [:inject_atl_file, :apply_binding_UML2, :extract_adapted_transformation] 






