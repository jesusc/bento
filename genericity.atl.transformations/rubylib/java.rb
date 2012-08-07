PARSER_DIR_PATH = File.join(PROJECT_DIR, '..', 'genericity.atl.parser', 'bin')
XSD_INJECTOR_DIR_PATH = File.join(PROJECT_DIR, '..', 'genericity.xsd', 'bin')
ECLIPSE_PATH    = PLATFORM.include?('w32') ? 
                      'C:/Software/eclipse_genericity' : 
                      File.join(PROJECT_DIR, '..', '..') 
ECLIPSE_PLUGINS = File.join(ECLIPSE_PATH, 'plugins')
EXAMPLES_DIR    = File.join(PROJECT_DIR, 'examples')
TMP_DIR         = File.join(EXAMPLES_DIR, 'tmp_')

TEST_DIR        = File.join(PROJECT_DIR, 'binding_tests')
TEST_DIR_TMP    = File.join(TEST_DIR, 'tmp_')

SEPARATOR       = PLATFORM.include?('w32') ? ';' : ':'

# The classpath is composed of:
#   Eclipse plugins, ATL plugins, ANTLR library, and
#   the injector/extractor compiled classes
def classpath
  emf_plugins = File.join(ECLIPSE_PLUGINS, "**", "*emf*.jar")
  atl_plugins = File.join(ECLIPSE_PLUGINS, "**", "*atl*.jar")
  antlr_plugins = File.join(ECLIPSE_PLUGINS, "**", "*org.antlr.runtime_3.0.0*.jar")
  classpath   = ( Dir.glob(emf_plugins) + Dir.glob(antlr_plugins) + Dir.glob(atl_plugins) + [ PARSER_DIR_PATH, XSD_INJECTOR_DIR_PATH ] ).join(SEPARATOR)
end

def launch_java(program, *args)
  system("java -cp #{classpath} #{program} #{args.join(' ')}")
end

