/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gcomponent.resource.gcomponent.mopp;

public class GcomponentPrinter implements genericity.language.gcomponent.resource.gcomponent.IGcomponentTextPrinter {
	
	protected genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolverFactory tokenResolverFactory = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTokenResolverFactory();
	
	protected java.io.OutputStream outputStream;
	
	/**
	 * Holds the resource that is associated with this printer. This may be null if
	 * the printer is used stand alone.
	 */
	private genericity.language.gcomponent.resource.gcomponent.IGcomponentTextResource resource;
	
	private java.util.Map<?, ?> options;
	private String encoding = System.getProperty("file.encoding");
	
	public GcomponentPrinter(java.io.OutputStream outputStream, genericity.language.gcomponent.resource.gcomponent.IGcomponentTextResource resource) {
		super();
		this.outputStream = outputStream;
		this.resource = resource;
	}
	
	protected int matchCount(java.util.Map<String, Integer> featureCounter, java.util.Collection<String> needed) {
		int pos = 0;
		int neg = 0;
		
		for (String featureName : featureCounter.keySet()) {
			if (needed.contains(featureName)) {
				int value = featureCounter.get(featureName);
				if (value == 0) {
					neg += 1;
				} else {
					pos += 1;
				}
			}
		}
		return neg > 0 ? -neg : pos;
	}
	
	protected void doPrint(org.eclipse.emf.ecore.EObject element, java.io.PrintWriter out, String globaltab) {
		if (element == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write.");
		}
		if (out == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write on.");
		}
		
		if (element instanceof genericity.language.gcomponent.dsl.DefinitionRoot) {
			print_genericity_language_gcomponent_dsl_DefinitionRoot((genericity.language.gcomponent.dsl.DefinitionRoot) element, globaltab, out);
			return;
		}
		if (element instanceof genericity.language.gcomponent.core.TransformationComponent) {
			print_genericity_language_gcomponent_core_TransformationComponent((genericity.language.gcomponent.core.TransformationComponent) element, globaltab, out);
			return;
		}
		if (element instanceof genericity.language.gcomponent.core.Concept) {
			print_genericity_language_gcomponent_core_Concept((genericity.language.gcomponent.core.Concept) element, globaltab, out);
			return;
		}
		if (element instanceof genericity.language.gcomponent.core.ParameterModel) {
			print_genericity_language_gcomponent_core_ParameterModel((genericity.language.gcomponent.core.ParameterModel) element, globaltab, out);
			return;
		}
		if (element instanceof genericity.language.gcomponent.core.Tag) {
			print_genericity_language_gcomponent_core_Tag((genericity.language.gcomponent.core.Tag) element, globaltab, out);
			return;
		}
		if (element instanceof genericity.language.gcomponent.variants.SingleFeature) {
			print_genericity_language_gcomponent_variants_SingleFeature((genericity.language.gcomponent.variants.SingleFeature) element, globaltab, out);
			return;
		}
		if (element instanceof genericity.language.gcomponent.variants.XorFeature) {
			print_genericity_language_gcomponent_variants_XorFeature((genericity.language.gcomponent.variants.XorFeature) element, globaltab, out);
			return;
		}
		if (element instanceof genericity.language.gcomponent.core.CompositeComponent) {
			print_genericity_language_gcomponent_core_CompositeComponent((genericity.language.gcomponent.core.CompositeComponent) element, globaltab, out);
			return;
		}
		if (element instanceof genericity.language.gcomponent.core.BindingDeclaration) {
			print_genericity_language_gcomponent_core_BindingDeclaration((genericity.language.gcomponent.core.BindingDeclaration) element, globaltab, out);
			return;
		}
		if (element instanceof genericity.language.gcomponent.flowcontrol.Composition) {
			print_genericity_language_gcomponent_flowcontrol_Composition((genericity.language.gcomponent.flowcontrol.Composition) element, globaltab, out);
			return;
		}
		if (element instanceof genericity.language.gcomponent.flowcontrol.Xor) {
			print_genericity_language_gcomponent_flowcontrol_Xor((genericity.language.gcomponent.flowcontrol.Xor) element, globaltab, out);
			return;
		}
		if (element instanceof genericity.language.gcomponent.flowcontrol.XorCond) {
			print_genericity_language_gcomponent_flowcontrol_XorCond((genericity.language.gcomponent.flowcontrol.XorCond) element, globaltab, out);
			return;
		}
		if (element instanceof genericity.language.gcomponent.flowcontrol.Apply) {
			print_genericity_language_gcomponent_flowcontrol_Apply((genericity.language.gcomponent.flowcontrol.Apply) element, globaltab, out);
			return;
		}
		if (element instanceof genericity.language.gcomponent.flowcontrol.ApplyParameter) {
			print_genericity_language_gcomponent_flowcontrol_ApplyParameter((genericity.language.gcomponent.flowcontrol.ApplyParameter) element, globaltab, out);
			return;
		}
		if (element instanceof genericity.language.gcomponent.flowcontrol.Seq) {
			print_genericity_language_gcomponent_flowcontrol_Seq((genericity.language.gcomponent.flowcontrol.Seq) element, globaltab, out);
			return;
		}
		if (element instanceof genericity.language.gcomponent.flowcontrol.FeatureRef) {
			print_genericity_language_gcomponent_flowcontrol_FeatureRef((genericity.language.gcomponent.flowcontrol.FeatureRef) element, globaltab, out);
			return;
		}
		if (element instanceof genericity.language.gcomponent.technologies.AtlTemplate) {
			print_genericity_language_gcomponent_technologies_AtlTemplate((genericity.language.gcomponent.technologies.AtlTemplate) element, globaltab, out);
			return;
		}
		if (element instanceof genericity.language.gcomponent.technologies.AtlParameter) {
			print_genericity_language_gcomponent_technologies_AtlParameter((genericity.language.gcomponent.technologies.AtlParameter) element, globaltab, out);
			return;
		}
		if (element instanceof genericity.language.gcomponent.technologies.JavaTemplate) {
			print_genericity_language_gcomponent_technologies_JavaTemplate((genericity.language.gcomponent.technologies.JavaTemplate) element, globaltab, out);
			return;
		}
		
		addWarningToResource("The printer can not handle " + element.eClass().getName() + " elements", element);
	}
	
	protected genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentReferenceResolverSwitch getReferenceResolverSwitch() {
		return (genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentReferenceResolverSwitch) new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentMetaInformation().getReferenceResolverSwitch();
	}
	
	protected void addWarningToResource(final String errorMessage, org.eclipse.emf.ecore.EObject cause) {
		genericity.language.gcomponent.resource.gcomponent.IGcomponentTextResource resource = getResource();
		if (resource == null) {
			// the resource can be null if the printer is used stand alone
			return;
		}
		resource.addProblem(new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentProblem(errorMessage, genericity.language.gcomponent.resource.gcomponent.GcomponentEProblemType.PRINT_PROBLEM, genericity.language.gcomponent.resource.gcomponent.GcomponentEProblemSeverity.WARNING), cause);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		this.options = options;
	}
	
	public java.util.Map<?,?> getOptions() {
		return options;
	}
	
	public void setEncoding(String encoding) {
		if (encoding != null) {
			this.encoding = encoding;
		}
	}
	
	public String getEncoding() {
		return encoding;
	}
	
	public genericity.language.gcomponent.resource.gcomponent.IGcomponentTextResource getResource() {
		return resource;
	}
	
	/**
	 * Calls {@link #doPrint(EObject, PrintWriter, String)} and writes the result to
	 * the underlying output stream.
	 */
	public void print(org.eclipse.emf.ecore.EObject element) throws java.io.IOException {
		java.io.PrintWriter out = new java.io.PrintWriter(new java.io.OutputStreamWriter(new java.io.BufferedOutputStream(outputStream), encoding));
		doPrint(element, out, "");
		out.flush();
		out.close();
	}
	
	public void print_genericity_language_gcomponent_dsl_DefinitionRoot(genericity.language.gcomponent.dsl.DefinitionRoot element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.dsl.DslPackage.DEFINITION_ROOT__COMPONENT));
		printCountingMap.put("component", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("component");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.dsl.DslPackage.DEFINITION_ROOT__COMPONENT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("component", count - 1);
		}
	}
	
	
	public void print_genericity_language_gcomponent_core_TransformationComponent(genericity.language.gcomponent.core.TransformationComponent element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(15);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.TRANSFORMATION_COMPONENT__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.TRANSFORMATION_COMPONENT__OWNER));
		printCountingMap.put("owner", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.TRANSFORMATION_COMPONENT__MAINTAINER));
		printCountingMap.put("maintainer", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.TRANSFORMATION_COMPONENT__VERSION));
		printCountingMap.put("version", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.TRANSFORMATION_COMPONENT__STATUS));
		printCountingMap.put("status", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.TRANSFORMATION_COMPONENT__SOURCE));
		printCountingMap.put("source", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.TRANSFORMATION_COMPONENT__TARGET));
		printCountingMap.put("target", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.TRANSFORMATION_COMPONENT__SOURCE_MODELS));
		printCountingMap.put("sourceModels", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.TRANSFORMATION_COMPONENT__TARGET_MODELS));
		printCountingMap.put("targetModels", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.TRANSFORMATION_COMPONENT__GENERATE_MODELS));
		printCountingMap.put("generateModels", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.TRANSFORMATION_COMPONENT__FORMAL_PARAMETERS));
		printCountingMap.put("formalParameters", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.TRANSFORMATION_COMPONENT__TAGS));
		printCountingMap.put("tags", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.TRANSFORMATION_COMPONENT__IS_M2M));
		printCountingMap.put("isM2M", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.TRANSFORMATION_COMPONENT__TEMPLATE));
		printCountingMap.put("template", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.TRANSFORMATION_COMPONENT__CONSTRAINTS));
		printCountingMap.put("constraints", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("transformation");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("component");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.TRANSFORMATION_COMPONENT__NAME));
			if (o != null) {
				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.TRANSFORMATION_COMPONENT__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_genericity_language_gcomponent_core_TransformationComponent_0(element, localtab, out, printCountingMap);
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_genericity_language_gcomponent_core_TransformationComponent_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_genericity_language_gcomponent_core_TransformationComponent_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("definition");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("template");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.TRANSFORMATION_COMPONENT__TEMPLATE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("template", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_genericity_language_gcomponent_core_TransformationComponent_0(genericity.language.gcomponent.core.TransformationComponent element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_genericity_language_gcomponent_core_TransformationComponent_0_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_genericity_language_gcomponent_core_TransformationComponent_0_1(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_genericity_language_gcomponent_core_TransformationComponent_0_2(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_genericity_language_gcomponent_core_TransformationComponent_0_3(element, localtab, out, printCountingMap);
	}
	
	public void print_genericity_language_gcomponent_core_TransformationComponent_0_0(genericity.language.gcomponent.core.TransformationComponent element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("source");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("source");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.TRANSFORMATION_COMPONENT__SOURCE));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("source", count - 1);
		}
	}
	
	public void print_genericity_language_gcomponent_core_TransformationComponent_0_1(genericity.language.gcomponent.core.TransformationComponent element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("target");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("target");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.TRANSFORMATION_COMPONENT__TARGET));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("target", count - 1);
		}
	}
	
	public void print_genericity_language_gcomponent_core_TransformationComponent_0_2(genericity.language.gcomponent.core.TransformationComponent element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("source");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("sourceModels");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.TRANSFORMATION_COMPONENT__SOURCE_MODELS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("sourceModels", count - 1);
		}
	}
	
	public void print_genericity_language_gcomponent_core_TransformationComponent_0_3(genericity.language.gcomponent.core.TransformationComponent element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("target");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("targetModels");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.TRANSFORMATION_COMPONENT__TARGET_MODELS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("targetModels", count - 1);
		}
	}
	
	public void print_genericity_language_gcomponent_core_TransformationComponent_1(genericity.language.gcomponent.core.TransformationComponent element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("variants");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_genericity_language_gcomponent_core_TransformationComponent_1_0(element, localtab, out, printCountingMap);
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_genericity_language_gcomponent_core_TransformationComponent_1_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_genericity_language_gcomponent_core_TransformationComponent_1_0(genericity.language.gcomponent.core.TransformationComponent element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("formalParameters");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.TRANSFORMATION_COMPONENT__FORMAL_PARAMETERS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("formalParameters", count - 1);
		}
	}
	
	
	public void print_genericity_language_gcomponent_core_Concept(genericity.language.gcomponent.core.Concept element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.CONCEPT__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.CONCEPT__URI));
		printCountingMap.put("uri", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.CONCEPT__CONSTRAINTS));
		printCountingMap.put("constraints", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.CONCEPT__TAGS));
		printCountingMap.put("tags", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("concept");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.CONCEPT__NAME));
			if (o != null) {
				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.CONCEPT__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("uri");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.CONCEPT__URI));
			if (o != null) {
				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.CONCEPT__URI), element));
				out.print(" ");
			}
			printCountingMap.put("uri", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_genericity_language_gcomponent_core_Concept_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_genericity_language_gcomponent_core_Concept_0(genericity.language.gcomponent.core.Concept element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("tags");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("tags");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.CONCEPT__TAGS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("tags", 0);
		}
	}
	
	
	public void print_genericity_language_gcomponent_core_ParameterModel(genericity.language.gcomponent.core.ParameterModel element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.PARAMETER_MODEL__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.PARAMETER_MODEL__TYPE));
		printCountingMap.put("type", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.PARAMETER_MODEL__RESOURCE_NAME));
		printCountingMap.put("resourceName", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("model");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.PARAMETER_MODEL__NAME));
			if (o != null) {
				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.PARAMETER_MODEL__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("type");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.PARAMETER_MODEL__TYPE));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getParameterModelTypeReferenceResolver().deResolve((genericity.language.gcomponent.core.Concept) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.PARAMETER_MODEL__TYPE)), element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.PARAMETER_MODEL__TYPE), element));
				out.print(" ");
			}
			printCountingMap.put("type", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_genericity_language_gcomponent_core_ParameterModel_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_genericity_language_gcomponent_core_ParameterModel_0(genericity.language.gcomponent.core.ParameterModel element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("resourceName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.PARAMETER_MODEL__RESOURCE_NAME));
			if (o != null) {
				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.PARAMETER_MODEL__RESOURCE_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("resourceName", count - 1);
		}
	}
	
	
	public void print_genericity_language_gcomponent_core_Tag(genericity.language.gcomponent.core.Tag element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.TAG__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.TAG__VALUE));
			if (o != null) {
				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.TAG__VALUE), element));
				out.print(" ");
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	
	public void print_genericity_language_gcomponent_variants_SingleFeature(genericity.language.gcomponent.variants.SingleFeature element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.variants.VariantsPackage.SINGLE_FEATURE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("-");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.variants.VariantsPackage.SINGLE_FEATURE__NAME));
			if (o != null) {
				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(genericity.language.gcomponent.variants.VariantsPackage.SINGLE_FEATURE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	
	public void print_genericity_language_gcomponent_variants_XorFeature(genericity.language.gcomponent.variants.XorFeature element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.variants.VariantsPackage.XOR_FEATURE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.variants.VariantsPackage.XOR_FEATURE__CHILDREN));
		printCountingMap.put("children", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("+");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.variants.VariantsPackage.XOR_FEATURE__NAME));
			if (o != null) {
				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(genericity.language.gcomponent.variants.VariantsPackage.XOR_FEATURE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("xor");
		out.print(" ");
	}
	
	
	public void print_genericity_language_gcomponent_core_CompositeComponent(genericity.language.gcomponent.core.CompositeComponent element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(14);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.COMPOSITE_COMPONENT__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.COMPOSITE_COMPONENT__OWNER));
		printCountingMap.put("owner", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.COMPOSITE_COMPONENT__MAINTAINER));
		printCountingMap.put("maintainer", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.COMPOSITE_COMPONENT__VERSION));
		printCountingMap.put("version", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.COMPOSITE_COMPONENT__STATUS));
		printCountingMap.put("status", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.COMPOSITE_COMPONENT__SOURCE));
		printCountingMap.put("source", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.COMPOSITE_COMPONENT__TARGET));
		printCountingMap.put("target", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.COMPOSITE_COMPONENT__SOURCE_MODELS));
		printCountingMap.put("sourceModels", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.COMPOSITE_COMPONENT__TARGET_MODELS));
		printCountingMap.put("targetModels", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.COMPOSITE_COMPONENT__GENERATE_MODELS));
		printCountingMap.put("generateModels", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.COMPOSITE_COMPONENT__FORMAL_PARAMETERS));
		printCountingMap.put("formalParameters", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.COMPOSITE_COMPONENT__USES));
		printCountingMap.put("uses", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.COMPOSITE_COMPONENT__COMPOSITION));
		printCountingMap.put("composition", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.COMPOSITE_COMPONENT__BINDINGS));
		printCountingMap.put("bindings", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("composite");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("component");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.COMPOSITE_COMPONENT__NAME));
			if (o != null) {
				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.COMPOSITE_COMPONENT__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_genericity_language_gcomponent_core_CompositeComponent_0(element, localtab, out, printCountingMap);
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_genericity_language_gcomponent_core_CompositeComponent_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_genericity_language_gcomponent_core_CompositeComponent_1(element, localtab, out, printCountingMap);
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_genericity_language_gcomponent_core_CompositeComponent_1(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_genericity_language_gcomponent_core_CompositeComponent_2(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("composition");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.COMPOSITE_COMPONENT__COMPOSITION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("composition", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_genericity_language_gcomponent_core_CompositeComponent_0(genericity.language.gcomponent.core.CompositeComponent element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("uses");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("uses");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.COMPOSITE_COMPONENT__USES));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getCompositeComponentUsesReferenceResolver().deResolve((genericity.language.gcomponent.core.Component) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.COMPOSITE_COMPONENT__USES)), element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.COMPOSITE_COMPONENT__USES), element));
				out.print(" ");
			}
			printCountingMap.put("uses", count - 1);
		}
	}
	
	public void print_genericity_language_gcomponent_core_CompositeComponent_1(genericity.language.gcomponent.core.CompositeComponent element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_genericity_language_gcomponent_core_CompositeComponent_1_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_genericity_language_gcomponent_core_CompositeComponent_1_1(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_genericity_language_gcomponent_core_CompositeComponent_1_2(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_genericity_language_gcomponent_core_CompositeComponent_1_3(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_genericity_language_gcomponent_core_CompositeComponent_1_4(element, localtab, out, printCountingMap);
	}
	
	public void print_genericity_language_gcomponent_core_CompositeComponent_1_0(genericity.language.gcomponent.core.CompositeComponent element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("source");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("source");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.COMPOSITE_COMPONENT__SOURCE));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("source", count - 1);
		}
	}
	
	public void print_genericity_language_gcomponent_core_CompositeComponent_1_1(genericity.language.gcomponent.core.CompositeComponent element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("target");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("target");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.COMPOSITE_COMPONENT__TARGET));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("target", count - 1);
		}
	}
	
	public void print_genericity_language_gcomponent_core_CompositeComponent_1_2(genericity.language.gcomponent.core.CompositeComponent element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("source");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("sourceModels");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.COMPOSITE_COMPONENT__SOURCE_MODELS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("sourceModels", count - 1);
		}
	}
	
	public void print_genericity_language_gcomponent_core_CompositeComponent_1_3(genericity.language.gcomponent.core.CompositeComponent element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("target");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("targetModels");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.COMPOSITE_COMPONENT__TARGET_MODELS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("targetModels", count - 1);
		}
	}
	
	public void print_genericity_language_gcomponent_core_CompositeComponent_1_4(genericity.language.gcomponent.core.CompositeComponent element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("bindings");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.COMPOSITE_COMPONENT__BINDINGS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("bindings", count - 1);
		}
	}
	
	public void print_genericity_language_gcomponent_core_CompositeComponent_2(genericity.language.gcomponent.core.CompositeComponent element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("variants");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_genericity_language_gcomponent_core_CompositeComponent_2_0(element, localtab, out, printCountingMap);
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_genericity_language_gcomponent_core_CompositeComponent_2_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_genericity_language_gcomponent_core_CompositeComponent_2_0(genericity.language.gcomponent.core.CompositeComponent element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("formalParameters");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.COMPOSITE_COMPONENT__FORMAL_PARAMETERS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("formalParameters", count - 1);
		}
	}
	
	
	public void print_genericity_language_gcomponent_core_BindingDeclaration(genericity.language.gcomponent.core.BindingDeclaration element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.BINDING_DECLARATION__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.BINDING_DECLARATION__FILE_NAME));
		printCountingMap.put("fileName", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("binding");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.BINDING_DECLARATION__NAME));
			if (o != null) {
				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.BINDING_DECLARATION__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("fileName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.BINDING_DECLARATION__FILE_NAME));
			if (o != null) {
				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(genericity.language.gcomponent.core.CorePackage.BINDING_DECLARATION__FILE_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("fileName", count - 1);
		}
	}
	
	
	public void print_genericity_language_gcomponent_flowcontrol_Composition(genericity.language.gcomponent.flowcontrol.Composition element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.COMPOSITION__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.COMPOSITION__STEP));
		printCountingMap.put("step", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("compose");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("step");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.COMPOSITION__STEP));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("step", count - 1);
		}
	}
	
	
	public void print_genericity_language_gcomponent_flowcontrol_Xor(genericity.language.gcomponent.flowcontrol.Xor element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.XOR__CONDITIONS));
		printCountingMap.put("conditions", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("xor");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_genericity_language_gcomponent_flowcontrol_Xor_0(element, localtab, out, printCountingMap);
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_genericity_language_gcomponent_flowcontrol_Xor_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_genericity_language_gcomponent_flowcontrol_Xor_0(genericity.language.gcomponent.flowcontrol.Xor element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("when");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("conditions");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.XOR__CONDITIONS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("conditions", count - 1);
		}
	}
	
	
	public void print_genericity_language_gcomponent_flowcontrol_XorCond(genericity.language.gcomponent.flowcontrol.XorCond element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.XOR_COND__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.XOR_COND__STEP));
		printCountingMap.put("step", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.XOR_COND__VALUE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("value", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("->");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("step");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.XOR_COND__STEP));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("step", count - 1);
		}
	}
	
	
	public void print_genericity_language_gcomponent_flowcontrol_Apply(genericity.language.gcomponent.flowcontrol.Apply element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.APPLY__COMPONENT));
		printCountingMap.put("component", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.APPLY__INPUT_MODELS));
		printCountingMap.put("inputModels", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.APPLY__OUTPUT_MODELS));
		printCountingMap.put("outputModels", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("apply");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("component");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.APPLY__COMPONENT));
			if (o != null) {
				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getApplyComponentReferenceResolver().deResolve((genericity.language.gcomponent.core.Component) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.APPLY__COMPONENT)), element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.APPLY__COMPONENT), element));
				out.print(" ");
			}
			printCountingMap.put("component", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("inputModels");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.APPLY__INPUT_MODELS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("inputModels", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_genericity_language_gcomponent_flowcontrol_Apply_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("->");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("outputModels");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.APPLY__OUTPUT_MODELS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("outputModels", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_genericity_language_gcomponent_flowcontrol_Apply_1(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_genericity_language_gcomponent_flowcontrol_Apply_0(genericity.language.gcomponent.flowcontrol.Apply element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("inputModels");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.APPLY__INPUT_MODELS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("inputModels", count - 1);
		}
	}
	
	public void print_genericity_language_gcomponent_flowcontrol_Apply_1(genericity.language.gcomponent.flowcontrol.Apply element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("outputModels");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.APPLY__OUTPUT_MODELS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("outputModels", count - 1);
		}
	}
	
	
	public void print_genericity_language_gcomponent_flowcontrol_ApplyParameter(genericity.language.gcomponent.flowcontrol.ApplyParameter element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.APPLY_PARAMETER__MODEL));
		printCountingMap.put("model", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.APPLY_PARAMETER__BOUND_CONCEPT_QUALIFIER));
		printCountingMap.put("boundConceptQualifier", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.APPLY_PARAMETER__BOUND_CONCEPT));
		printCountingMap.put("boundConcept", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.APPLY_PARAMETER__BINDING));
		printCountingMap.put("binding", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("model");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.APPLY_PARAMETER__MODEL));
			if (o != null) {
				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getApplyParameterModelReferenceResolver().deResolve((genericity.language.gcomponent.core.Model) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.APPLY_PARAMETER__MODEL)), element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.APPLY_PARAMETER__MODEL), element));
				out.print(" ");
			}
			printCountingMap.put("model", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_genericity_language_gcomponent_flowcontrol_ApplyParameter_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_genericity_language_gcomponent_flowcontrol_ApplyParameter_0(genericity.language.gcomponent.flowcontrol.ApplyParameter element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_genericity_language_gcomponent_flowcontrol_ApplyParameter_0_0(element, localtab, out, printCountingMap);
	}
	
	public void print_genericity_language_gcomponent_flowcontrol_ApplyParameter_0_0(genericity.language.gcomponent.flowcontrol.ApplyParameter element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"boundConceptQualifier"		,
		"boundConcept"		,
		"binding"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"boundConcept"		,
		"binding"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
				count = printCountingMap.get("boundConcept");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.APPLY_PARAMETER__BOUND_CONCEPT));
					if (o != null) {
						genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getApplyParameterBoundConceptReferenceResolver().deResolve((genericity.language.gcomponent.core.Concept) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.APPLY_PARAMETER__BOUND_CONCEPT)), element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.APPLY_PARAMETER__BOUND_CONCEPT), element));
						out.print(" ");
					}
					printCountingMap.put("boundConcept", count - 1);
				}
				// DEFINITION PART BEGINS (CsString)
				out.print("[");
				out.print(" ");
				// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
				count = printCountingMap.get("binding");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.APPLY_PARAMETER__BINDING));
					if (o != null) {
						genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getApplyParameterBindingReferenceResolver().deResolve((genericity.language.gcomponent.core.BindingDeclaration) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.APPLY_PARAMETER__BINDING)), element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.APPLY_PARAMETER__BINDING), element));
						out.print(" ");
					}
					printCountingMap.put("binding", count - 1);
				}
				// DEFINITION PART BEGINS (CsString)
				out.print("]");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("boundConceptQualifier");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.APPLY_PARAMETER__BOUND_CONCEPT_QUALIFIER));
				if (o != null) {
					genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getApplyParameterBoundConceptQualifierReferenceResolver().deResolve((genericity.language.gcomponent.core.Component) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.APPLY_PARAMETER__BOUND_CONCEPT_QUALIFIER)), element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.APPLY_PARAMETER__BOUND_CONCEPT_QUALIFIER), element));
					out.print(" ");
				}
				printCountingMap.put("boundConceptQualifier", count - 1);
			}
			// DEFINITION PART BEGINS (CsString)
			out.print("::");
			out.print(" ");
			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("boundConcept");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.APPLY_PARAMETER__BOUND_CONCEPT));
				if (o != null) {
					genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getApplyParameterBoundConceptReferenceResolver().deResolve((genericity.language.gcomponent.core.Concept) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.APPLY_PARAMETER__BOUND_CONCEPT)), element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.APPLY_PARAMETER__BOUND_CONCEPT), element));
					out.print(" ");
				}
				printCountingMap.put("boundConcept", count - 1);
			}
			// DEFINITION PART BEGINS (CsString)
			out.print("[");
			out.print(" ");
			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("binding");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.APPLY_PARAMETER__BINDING));
				if (o != null) {
					genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getApplyParameterBindingReferenceResolver().deResolve((genericity.language.gcomponent.core.BindingDeclaration) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.APPLY_PARAMETER__BINDING)), element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.APPLY_PARAMETER__BINDING), element));
					out.print(" ");
				}
				printCountingMap.put("binding", count - 1);
			}
			// DEFINITION PART BEGINS (CsString)
			out.print("]");
			out.print(" ");
		}
	}
	
	
	public void print_genericity_language_gcomponent_flowcontrol_Seq(genericity.language.gcomponent.flowcontrol.Seq element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.SEQ__STEPS));
		printCountingMap.put("steps", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("seq");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("steps");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.SEQ__STEPS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("steps", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("steps");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.SEQ__STEPS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("steps", 0);
		}
	}
	
	
	public void print_genericity_language_gcomponent_flowcontrol_FeatureRef(genericity.language.gcomponent.flowcontrol.FeatureRef element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.FEATURE_REF__FEATURE));
		printCountingMap.put("feature", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("feature");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.FEATURE_REF__FEATURE));
			if (o != null) {
				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getFeatureRefFeatureReferenceResolver().deResolve((genericity.language.gcomponent.variants.Feature) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.FEATURE_REF__FEATURE)), element.eClass().getEStructuralFeature(genericity.language.gcomponent.flowcontrol.FlowcontrolPackage.FEATURE_REF__FEATURE), element));
				out.print(" ");
			}
			printCountingMap.put("feature", count - 1);
		}
	}
	
	
	public void print_genericity_language_gcomponent_technologies_AtlTemplate(genericity.language.gcomponent.technologies.AtlTemplate element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.technologies.TechnologiesPackage.ATL_TEMPLATE__TEMPLATE));
		printCountingMap.put("template", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.technologies.TechnologiesPackage.ATL_TEMPLATE__PARAMETERS));
		printCountingMap.put("parameters", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("atl");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("template");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.technologies.TechnologiesPackage.ATL_TEMPLATE__TEMPLATE));
			if (o != null) {
				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(genericity.language.gcomponent.technologies.TechnologiesPackage.ATL_TEMPLATE__TEMPLATE), element));
				out.print(" ");
			}
			printCountingMap.put("template", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("with");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("parameters");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.technologies.TechnologiesPackage.ATL_TEMPLATE__PARAMETERS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("parameters", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_genericity_language_gcomponent_technologies_AtlTemplate_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_genericity_language_gcomponent_technologies_AtlTemplate_0(genericity.language.gcomponent.technologies.AtlTemplate element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("parameters");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.technologies.TechnologiesPackage.ATL_TEMPLATE__PARAMETERS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("parameters", count - 1);
		}
	}
	
	
	public void print_genericity_language_gcomponent_technologies_AtlParameter(genericity.language.gcomponent.technologies.AtlParameter element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.technologies.TechnologiesPackage.ATL_PARAMETER__ATL_MODEL_NAME));
		printCountingMap.put("atlModelName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.technologies.TechnologiesPackage.ATL_PARAMETER__MODEL));
		printCountingMap.put("model", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("atlModelName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.technologies.TechnologiesPackage.ATL_PARAMETER__ATL_MODEL_NAME));
			if (o != null) {
				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(genericity.language.gcomponent.technologies.TechnologiesPackage.ATL_PARAMETER__ATL_MODEL_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("atlModelName", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("model");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.technologies.TechnologiesPackage.ATL_PARAMETER__MODEL));
			if (o != null) {
				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getAtlParameterModelReferenceResolver().deResolve((genericity.language.gcomponent.core.Model) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(genericity.language.gcomponent.technologies.TechnologiesPackage.ATL_PARAMETER__MODEL)), element.eClass().getEStructuralFeature(genericity.language.gcomponent.technologies.TechnologiesPackage.ATL_PARAMETER__MODEL), element));
				out.print(" ");
			}
			printCountingMap.put("model", count - 1);
		}
	}
	
	
	public void print_genericity_language_gcomponent_technologies_JavaTemplate(genericity.language.gcomponent.technologies.JavaTemplate element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.technologies.TechnologiesPackage.JAVA_TEMPLATE__QUALIFIED_CLASSNAME));
		printCountingMap.put("qualifiedClassname", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("java");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("qualifiedClassname");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(genericity.language.gcomponent.technologies.TechnologiesPackage.JAVA_TEMPLATE__QUALIFIED_CLASSNAME));
			if (o != null) {
				genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(genericity.language.gcomponent.technologies.TechnologiesPackage.JAVA_TEMPLATE__QUALIFIED_CLASSNAME), element));
				out.print(" ");
			}
			printCountingMap.put("qualifiedClassname", count - 1);
		}
	}
	
	
}
