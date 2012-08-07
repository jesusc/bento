
GenericityDSL_Project = File.join(PROJECT_DIR, '..', 'genericity_dsl')
GenericityOCL_Project = File.join(PROJECT_DIR, '..', 'genericity_ocl')

#GenericityDSL_Project = "/home/jesus/usr/genericity/workspace/genericity_dsl"

BindingDSL_Metamodel = File.join(GenericityDSL_Project, 'Metamodel', 'genericity_dsl.ecore')
ConstraintsDSL_Metamodel = File.join(GenericityOCL_Project, 'Metamodel', 'genericity_ocl.ecore')


model_mappings_definition do
  #map 'http://genericity/genericity_dsl' => BindingDSL_Metamodel
end 

if PLATFORM.include?('w32')
  class ::RMOF::ECore::FileModelAdapter
      def compute_relative_file_path(file_uri, base_file)
        uri = URI.parse(file_uri)
        raise "Not an file path" unless uri.scheme == 'file'
  
        path = Pathname.new(file_uri.sub('file://', ''))
        path.relative_path_from(Pathname.new(File.dirname(base_file))).to_s      
      end
  end
end