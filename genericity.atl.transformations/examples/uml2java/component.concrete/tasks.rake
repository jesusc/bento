require File.join(PROJECT_DIR, 'rubylib', 'java')
require File.join(PROJECT_DIR, 'rubylib', 'models')

UML2JAVA_DIR    = File.join(EXAMPLES_DIR, 'uml2java')
CURRENT_BINDING = File.join(File.dirname(__FILE__), 'component.gbind.xmi') 

task :inject_atl_file do
  # The injector takes three arguments: file, input_dir, output_dir
  launch_java('atl.parser.Injector', 
      'uml2java.atl',
      UML2JAVA_DIR,
      TMP_DIR)
end

model_to_model :apply_binding_COMPONENT do |t|
  t.sources :package   => 'ATL',
            :metamodel => 'metamodels/ATL.ecore',
            :model => 'examples/tmp_/uml2java.atl.xmi'

  t.sources :model => CURRENT_BINDING,
            :namespaces => {
              'BindingDSL' => BindingDSL_Metamodel,
              'BindATL' => 'metamodels/ATL.ecore'
            }

  t.targets :package   => 'OUT',
            :metamodel => 'metamodels/ATL.ecore',
            :model     => 'examples/tmp_/uml2java-adapted-4-component.xmi'  

  t.transformation 'transformations/apply_binding_from_dsl.rb'
end          

task :extract_adapted_transformation do
  # The extractor takes three arguments: file, input_dir, output_dir
  launch_java('atl.parser.Extractor', 
      'uml2java-adapted-4-component.xmi',
      TMP_DIR,
      TMP_DIR)
end

task :all => [:inject_atl_file, :apply_binding_COMPONENT, :extract_adapted_transformation] 




