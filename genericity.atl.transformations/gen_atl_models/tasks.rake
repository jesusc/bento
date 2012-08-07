require File.join(PROJECT_DIR, 'rubylib', 'java')
require File.join(PROJECT_DIR, 'rubylib', 'models')

MODEL_DIR    = File.join(PROJECT_DIR, 'gen_atl_models')

task :inject_atl_file_1 do
  # The injector takes three arguments: file, input_dir, output_dir
  launch_java('atl.parser.Injector', 
      'example1.atl',
      MODEL_DIR,
      TMP_DIR)
end
