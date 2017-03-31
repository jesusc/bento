/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gbind.mopp;

public class GbindPrinter implements genericity.language.gbind.IGbindTextPrinter {
	
	protected genericity.language.gbind.IGbindTokenResolverFactory tokenResolverFactory = new genericity.language.gbind.mopp.GbindTokenResolverFactory();
	
	protected java.io.OutputStream outputStream;
	
	/**
	 * Holds the resource that is associated with this printer. This may be null if
	 * the printer is used stand alone.
	 */
	private genericity.language.gbind.IGbindTextResource resource;
	
	private java.util.Map<?, ?> options;
	private String encoding = System.getProperty("file.encoding");
	
	public GbindPrinter(java.io.OutputStream outputStream, genericity.language.gbind.IGbindTextResource resource) {
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
		
		if (element instanceof gbind.simpleocl.Module) {
			print_gbind_simpleocl_Module((gbind.simpleocl.Module) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.simpleocl.Import) {
			print_gbind_simpleocl_Import((gbind.simpleocl.Import) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.simpleocl.OclFeatureDefinition) {
			print_gbind_simpleocl_OclFeatureDefinition((gbind.simpleocl.OclFeatureDefinition) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.simpleocl.OclContextDefinition) {
			print_gbind_simpleocl_OclContextDefinition((gbind.simpleocl.OclContextDefinition) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.simpleocl.OclInstanceModel) {
			print_gbind_simpleocl_OclInstanceModel((gbind.simpleocl.OclInstanceModel) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.simpleocl.Attribute) {
			print_gbind_simpleocl_Attribute((gbind.simpleocl.Attribute) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.simpleocl.Operation) {
			print_gbind_simpleocl_Operation((gbind.simpleocl.Operation) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.simpleocl.Parameter) {
			print_gbind_simpleocl_Parameter((gbind.simpleocl.Parameter) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.simpleocl.OclModelElementExp) {
			print_gbind_simpleocl_OclModelElementExp((gbind.simpleocl.OclModelElementExp) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.simpleocl.LambdaCallExp) {
			print_gbind_simpleocl_LambdaCallExp((gbind.simpleocl.LambdaCallExp) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.simpleocl.VariableExp) {
			print_gbind_simpleocl_VariableExp((gbind.simpleocl.VariableExp) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.simpleocl.SuperExp) {
			print_gbind_simpleocl_SuperExp((gbind.simpleocl.SuperExp) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.simpleocl.SelfExp) {
			print_gbind_simpleocl_SelfExp((gbind.simpleocl.SelfExp) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.simpleocl.EnvExp) {
			print_gbind_simpleocl_EnvExp((gbind.simpleocl.EnvExp) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.simpleocl.StringExp) {
			print_gbind_simpleocl_StringExp((gbind.simpleocl.StringExp) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.simpleocl.BooleanExp) {
			print_gbind_simpleocl_BooleanExp((gbind.simpleocl.BooleanExp) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.simpleocl.RealExp) {
			print_gbind_simpleocl_RealExp((gbind.simpleocl.RealExp) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.simpleocl.IntegerExp) {
			print_gbind_simpleocl_IntegerExp((gbind.simpleocl.IntegerExp) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.simpleocl.BagExp) {
			print_gbind_simpleocl_BagExp((gbind.simpleocl.BagExp) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.simpleocl.OrderedSetExp) {
			print_gbind_simpleocl_OrderedSetExp((gbind.simpleocl.OrderedSetExp) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.simpleocl.SequenceExp) {
			print_gbind_simpleocl_SequenceExp((gbind.simpleocl.SequenceExp) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.simpleocl.SetExp) {
			print_gbind_simpleocl_SetExp((gbind.simpleocl.SetExp) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.simpleocl.TuplePart) {
			print_gbind_simpleocl_TuplePart((gbind.simpleocl.TuplePart) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.simpleocl.MapExp) {
			print_gbind_simpleocl_MapExp((gbind.simpleocl.MapExp) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.simpleocl.MapElement) {
			print_gbind_simpleocl_MapElement((gbind.simpleocl.MapElement) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.simpleocl.EnumLiteralExp) {
			print_gbind_simpleocl_EnumLiteralExp((gbind.simpleocl.EnumLiteralExp) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.simpleocl.OclUndefinedExp) {
			print_gbind_simpleocl_OclUndefinedExp((gbind.simpleocl.OclUndefinedExp) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.simpleocl.LetExp) {
			print_gbind_simpleocl_LetExp((gbind.simpleocl.LetExp) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.simpleocl.IfExp) {
			print_gbind_simpleocl_IfExp((gbind.simpleocl.IfExp) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.simpleocl.BraceExp) {
			print_gbind_simpleocl_BraceExp((gbind.simpleocl.BraceExp) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.simpleocl.EqOpCallExp) {
			print_gbind_simpleocl_EqOpCallExp((gbind.simpleocl.EqOpCallExp) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.simpleocl.RelOpCallExp) {
			print_gbind_simpleocl_RelOpCallExp((gbind.simpleocl.RelOpCallExp) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.simpleocl.AddOpCallExp) {
			print_gbind_simpleocl_AddOpCallExp((gbind.simpleocl.AddOpCallExp) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.simpleocl.IntOpCallExp) {
			print_gbind_simpleocl_IntOpCallExp((gbind.simpleocl.IntOpCallExp) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.simpleocl.MulOpCallExp) {
			print_gbind_simpleocl_MulOpCallExp((gbind.simpleocl.MulOpCallExp) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.simpleocl.NotOpCallExp) {
			print_gbind_simpleocl_NotOpCallExp((gbind.simpleocl.NotOpCallExp) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.simpleocl.StaticPropertyCallExp) {
			print_gbind_simpleocl_StaticPropertyCallExp((gbind.simpleocl.StaticPropertyCallExp) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.simpleocl.StaticOperationCall) {
			print_gbind_simpleocl_StaticOperationCall((gbind.simpleocl.StaticOperationCall) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.simpleocl.StaticNavigationOrAttributeCall) {
			print_gbind_simpleocl_StaticNavigationOrAttributeCall((gbind.simpleocl.StaticNavigationOrAttributeCall) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.simpleocl.PropertyCallExp) {
			print_gbind_simpleocl_PropertyCallExp((gbind.simpleocl.PropertyCallExp) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.simpleocl.NavigationOrAttributeCall) {
			print_gbind_simpleocl_NavigationOrAttributeCall((gbind.simpleocl.NavigationOrAttributeCall) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.simpleocl.IterateExp) {
			print_gbind_simpleocl_IterateExp((gbind.simpleocl.IterateExp) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.simpleocl.IteratorExp) {
			print_gbind_simpleocl_IteratorExp((gbind.simpleocl.IteratorExp) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.simpleocl.Iterator) {
			print_gbind_simpleocl_Iterator((gbind.simpleocl.Iterator) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.simpleocl.CollectionOperationCall) {
			print_gbind_simpleocl_CollectionOperationCall((gbind.simpleocl.CollectionOperationCall) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.simpleocl.StringType) {
			print_gbind_simpleocl_StringType((gbind.simpleocl.StringType) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.simpleocl.BooleanType) {
			print_gbind_simpleocl_BooleanType((gbind.simpleocl.BooleanType) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.simpleocl.IntegerType) {
			print_gbind_simpleocl_IntegerType((gbind.simpleocl.IntegerType) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.simpleocl.RealType) {
			print_gbind_simpleocl_RealType((gbind.simpleocl.RealType) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.simpleocl.BagType) {
			print_gbind_simpleocl_BagType((gbind.simpleocl.BagType) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.simpleocl.OrderedSetType) {
			print_gbind_simpleocl_OrderedSetType((gbind.simpleocl.OrderedSetType) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.simpleocl.SequenceType) {
			print_gbind_simpleocl_SequenceType((gbind.simpleocl.SequenceType) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.simpleocl.SetType) {
			print_gbind_simpleocl_SetType((gbind.simpleocl.SetType) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.simpleocl.OclAnyType) {
			print_gbind_simpleocl_OclAnyType((gbind.simpleocl.OclAnyType) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.simpleocl.TupleType) {
			print_gbind_simpleocl_TupleType((gbind.simpleocl.TupleType) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.simpleocl.TupleTypeAttribute) {
			print_gbind_simpleocl_TupleTypeAttribute((gbind.simpleocl.TupleTypeAttribute) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.simpleocl.OclModelElement) {
			print_gbind_simpleocl_OclModelElement((gbind.simpleocl.OclModelElement) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.simpleocl.MapType) {
			print_gbind_simpleocl_MapType((gbind.simpleocl.MapType) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.simpleocl.LambdaType) {
			print_gbind_simpleocl_LambdaType((gbind.simpleocl.LambdaType) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.simpleocl.EnvType) {
			print_gbind_simpleocl_EnvType((gbind.simpleocl.EnvType) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.dsl.BindingModel) {
			print_gbind_dsl_BindingModel((gbind.dsl.BindingModel) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.dsl.BindingOptions) {
			print_gbind_dsl_BindingOptions((gbind.dsl.BindingOptions) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.dsl.MetamodelDeclaration) {
			print_gbind_dsl_MetamodelDeclaration((gbind.dsl.MetamodelDeclaration) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.dsl.ClassBinding) {
			print_gbind_dsl_ClassBinding((gbind.dsl.ClassBinding) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.dsl.IntermediateClassBinding) {
			print_gbind_dsl_IntermediateClassBinding((gbind.dsl.IntermediateClassBinding) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.dsl.ConcreteReferencDeclaringVar) {
			print_gbind_dsl_ConcreteReferencDeclaringVar((gbind.dsl.ConcreteReferencDeclaringVar) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.dsl.VirtualMetaclass) {
			print_gbind_dsl_VirtualMetaclass((gbind.dsl.VirtualMetaclass) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.dsl.VirtualTupleExp) {
			print_gbind_dsl_VirtualTupleExp((gbind.dsl.VirtualTupleExp) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.dsl.VirtualReference) {
			print_gbind_dsl_VirtualReference((gbind.dsl.VirtualReference) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.dsl.VirtualAttribute) {
			print_gbind_dsl_VirtualAttribute((gbind.dsl.VirtualAttribute) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.dsl.VirtualClassBinding) {
			print_gbind_dsl_VirtualClassBinding((gbind.dsl.VirtualClassBinding) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.dsl.ConceptFeatureRef) {
			print_gbind_dsl_ConceptFeatureRef((gbind.dsl.ConceptFeatureRef) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.dsl.OclFeatureBinding) {
			print_gbind_dsl_OclFeatureBinding((gbind.dsl.OclFeatureBinding) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.dsl.RenamingFeatureBinding) {
			print_gbind_dsl_RenamingFeatureBinding((gbind.dsl.RenamingFeatureBinding) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.dsl.ConceptHelper) {
			print_gbind_dsl_ConceptHelper((gbind.dsl.ConceptHelper) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.dsl.LocalHelper) {
			print_gbind_dsl_LocalHelper((gbind.dsl.LocalHelper) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.dsl.HelperParameter) {
			print_gbind_dsl_HelperParameter((gbind.dsl.HelperParameter) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.simpleocl.OclMetamodel) {
			print_gbind_simpleocl_OclMetamodel((gbind.simpleocl.OclMetamodel) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.simpleocl.LocalVariable) {
			print_gbind_simpleocl_LocalVariable((gbind.simpleocl.LocalVariable) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.simpleocl.TupleExp) {
			print_gbind_simpleocl_TupleExp((gbind.simpleocl.TupleExp) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.simpleocl.OperatorCallExp) {
			print_gbind_simpleocl_OperatorCallExp((gbind.simpleocl.OperatorCallExp) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.simpleocl.OperationCall) {
			print_gbind_simpleocl_OperationCall((gbind.simpleocl.OperationCall) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.simpleocl.CollectionType) {
			print_gbind_simpleocl_CollectionType((gbind.simpleocl.CollectionType) element, globaltab, out);
			return;
		}
		if (element instanceof gbind.simpleocl.OclType) {
			print_gbind_simpleocl_OclType((gbind.simpleocl.OclType) element, globaltab, out);
			return;
		}
		
		addWarningToResource("The printer can not handle " + element.eClass().getName() + " elements", element);
	}
	
	protected genericity.language.gbind.mopp.GbindReferenceResolverSwitch getReferenceResolverSwitch() {
		return (genericity.language.gbind.mopp.GbindReferenceResolverSwitch) new genericity.language.gbind.mopp.GbindMetaInformation().getReferenceResolverSwitch();
	}
	
	protected void addWarningToResource(final String errorMessage, org.eclipse.emf.ecore.EObject cause) {
		genericity.language.gbind.IGbindTextResource resource = getResource();
		if (resource == null) {
			// the resource can be null if the printer is used stand alone
			return;
		}
		resource.addProblem(new genericity.language.gbind.mopp.GbindProblem(errorMessage, genericity.language.gbind.GbindEProblemType.PRINT_PROBLEM, genericity.language.gbind.GbindEProblemSeverity.WARNING), cause);
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
	
	public genericity.language.gbind.IGbindTextResource getResource() {
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
	
	public void print_gbind_simpleocl_Module(gbind.simpleocl.Module element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(8);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MODULE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MODULE__METAMODELS));
		printCountingMap.put("metamodels", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MODULE__IMPORTS));
		printCountingMap.put("imports", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MODULE__ELEMENTS));
		printCountingMap.put("elements", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("module");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_gbind_simpleocl_Module_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_gbind_simpleocl_Module_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_gbind_simpleocl_Module_2(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_gbind_simpleocl_Module_3(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_gbind_simpleocl_Module_0(gbind.simpleocl.Module element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MODULE__NAME));
					if (o != null) {
						genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MODULE__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("name");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MODULE__NAME));
				if (o != null) {
					genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MODULE__NAME), element));
					out.print(" ");
				}
				printCountingMap.put("name", count - 1);
			}
		}
	}
	
	public void print_gbind_simpleocl_Module_1(gbind.simpleocl.Module element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("metamodels");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MODULE__METAMODELS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("metamodels", 0);
		}
	}
	
	public void print_gbind_simpleocl_Module_2(gbind.simpleocl.Module element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("imports");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MODULE__IMPORTS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("imports", 0);
		}
	}
	
	public void print_gbind_simpleocl_Module_3(gbind.simpleocl.Module element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elements");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MODULE__ELEMENTS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("elements", 0);
		}
	}
	
	
	public void print_gbind_simpleocl_Import(gbind.simpleocl.Import element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(6);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.IMPORT__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.IMPORT__MODULE));
		printCountingMap.put("module", temp == null ? 0 : 1);
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("import");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_gbind_simpleocl_Import_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
	}
	
	public void print_gbind_simpleocl_Import_0(gbind.simpleocl.Import element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.IMPORT__NAME));
					if (o != null) {
						genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.IMPORT__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("name");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.IMPORT__NAME));
				if (o != null) {
					genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.IMPORT__NAME), element));
					out.print(" ");
				}
				printCountingMap.put("name", count - 1);
			}
		}
	}
	
	
	public void print_gbind_simpleocl_OclFeatureDefinition(gbind.simpleocl.OclFeatureDefinition element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(8);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_FEATURE_DEFINITION__MODULE));
		printCountingMap.put("module", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_FEATURE_DEFINITION__FEATURE));
		printCountingMap.put("feature", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_FEATURE_DEFINITION__CONTEXT_));
		printCountingMap.put("context_", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_FEATURE_DEFINITION__STATIC));
		printCountingMap.put("static", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("context_");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_FEATURE_DEFINITION__CONTEXT_));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("context_", count - 1);
		}
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("static");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_FEATURE_DEFINITION__STATIC));
			if (o != null) {
			}
			printCountingMap.put("static", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("def");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("feature");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_FEATURE_DEFINITION__FEATURE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("feature", count - 1);
		}
	}
	
	
	public void print_gbind_simpleocl_OclContextDefinition(gbind.simpleocl.OclContextDefinition element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(6);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_CONTEXT_DEFINITION__DEFINITION));
		printCountingMap.put("definition", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_CONTEXT_DEFINITION__CONTEXT_));
		printCountingMap.put("context_", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("context");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("context_");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_CONTEXT_DEFINITION__CONTEXT_));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("context_", count - 1);
		}
	}
	
	
	public void print_gbind_simpleocl_OclMetamodel(gbind.simpleocl.OclMetamodel element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(8);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_METAMODEL__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_METAMODEL__ELEMENTS));
		printCountingMap.put("elements", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_METAMODEL__MODEL));
		printCountingMap.put("model", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_METAMODEL__URI));
		printCountingMap.put("uri", temp == null ? 0 : 1);
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("metamodel");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_gbind_simpleocl_OclMetamodel_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_gbind_simpleocl_OclMetamodel_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
	}
	
	public void print_gbind_simpleocl_OclMetamodel_0(gbind.simpleocl.OclMetamodel element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_METAMODEL__NAME));
					if (o != null) {
						genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_METAMODEL__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("name");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_METAMODEL__NAME));
				if (o != null) {
					genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_METAMODEL__NAME), element));
					out.print(" ");
				}
				printCountingMap.put("name", count - 1);
			}
		}
	}
	
	public void print_gbind_simpleocl_OclMetamodel_1(gbind.simpleocl.OclMetamodel element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("uri");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_METAMODEL__URI));
			if (o != null) {
				genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_39_39_92");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_METAMODEL__URI), element));
				out.print(" ");
			}
			printCountingMap.put("uri", count - 1);
		}
	}
	
	
	public void print_gbind_simpleocl_OclInstanceModel(gbind.simpleocl.OclInstanceModel element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(7);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_INSTANCE_MODEL__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_INSTANCE_MODEL__ELEMENTS));
		printCountingMap.put("elements", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_INSTANCE_MODEL__METAMODEL));
		printCountingMap.put("metamodel", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_gbind_simpleocl_OclInstanceModel_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("metamodel");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_INSTANCE_MODEL__METAMODEL));
			if (o != null) {
				genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getOclInstanceModelMetamodelReferenceResolver().deResolve((gbind.simpleocl.OclMetamodel) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_INSTANCE_MODEL__METAMODEL)), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_INSTANCE_MODEL__METAMODEL), element));
				out.print(" ");
			}
			printCountingMap.put("metamodel", count - 1);
		}
	}
	
	public void print_gbind_simpleocl_OclInstanceModel_0(gbind.simpleocl.OclInstanceModel element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_INSTANCE_MODEL__NAME));
					if (o != null) {
						genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_INSTANCE_MODEL__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("name");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_INSTANCE_MODEL__NAME));
				if (o != null) {
					genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_INSTANCE_MODEL__NAME), element));
					out.print(" ");
				}
				printCountingMap.put("name", count - 1);
			}
		}
	}
	
	
	public void print_gbind_simpleocl_LocalVariable(gbind.simpleocl.LocalVariable element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(11);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LOCAL_VARIABLE__VAR_NAME));
		printCountingMap.put("varName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LOCAL_VARIABLE__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LOCAL_VARIABLE__VARIABLE_EXP));
		printCountingMap.put("variableExp", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LOCAL_VARIABLE__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LOCAL_VARIABLE__INIT_EXPRESSION));
		printCountingMap.put("initExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LOCAL_VARIABLE__BASE_EXP));
		printCountingMap.put("baseExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LOCAL_VARIABLE__EQ));
		printCountingMap.put("eq", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("varName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LOCAL_VARIABLE__VAR_NAME));
			if (o != null) {
				genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LOCAL_VARIABLE__VAR_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("varName", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_gbind_simpleocl_LocalVariable_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("eq");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LOCAL_VARIABLE__EQ));
			if (o != null) {
				genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("EQ");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LOCAL_VARIABLE__EQ), element));
				out.print(" ");
			}
			printCountingMap.put("eq", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("initExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LOCAL_VARIABLE__INIT_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("initExpression", count - 1);
		}
	}
	
	public void print_gbind_simpleocl_LocalVariable_0(gbind.simpleocl.LocalVariable element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("type");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LOCAL_VARIABLE__TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("type", count - 1);
		}
	}
	
	
	public void print_gbind_simpleocl_Attribute(gbind.simpleocl.Attribute element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(9);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ATTRIBUTE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ATTRIBUTE__DEFINITION));
		printCountingMap.put("definition", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ATTRIBUTE__EQ));
		printCountingMap.put("eq", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ATTRIBUTE__INIT_EXPRESSION));
		printCountingMap.put("initExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ATTRIBUTE__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_gbind_simpleocl_Attribute_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("type");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ATTRIBUTE__TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("type", count - 1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("eq");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ATTRIBUTE__EQ));
			if (o != null) {
				genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("EQ");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ATTRIBUTE__EQ), element));
				out.print(" ");
			}
			printCountingMap.put("eq", count - 1);
		}
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("initExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ATTRIBUTE__INIT_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("initExpression", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
	}
	
	public void print_gbind_simpleocl_Attribute_0(gbind.simpleocl.Attribute element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ATTRIBUTE__NAME));
					if (o != null) {
						genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ATTRIBUTE__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("name");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ATTRIBUTE__NAME));
				if (o != null) {
					genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ATTRIBUTE__NAME), element));
					out.print(" ");
				}
				printCountingMap.put("name", count - 1);
			}
		}
	}
	
	
	public void print_gbind_simpleocl_Operation(gbind.simpleocl.Operation element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(10);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OPERATION__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OPERATION__DEFINITION));
		printCountingMap.put("definition", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OPERATION__EQ));
		printCountingMap.put("eq", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OPERATION__PARAMETERS));
		printCountingMap.put("parameters", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OPERATION__RETURN_TYPE));
		printCountingMap.put("returnType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OPERATION__BODY));
		printCountingMap.put("body", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_gbind_simpleocl_Operation_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_gbind_simpleocl_Operation_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("returnType");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OPERATION__RETURN_TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("returnType", count - 1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("eq");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OPERATION__EQ));
			if (o != null) {
				genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("EQ");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OPERATION__EQ), element));
				out.print(" ");
			}
			printCountingMap.put("eq", count - 1);
		}
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("body");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OPERATION__BODY));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("body", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
	}
	
	public void print_gbind_simpleocl_Operation_0(gbind.simpleocl.Operation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OPERATION__NAME));
					if (o != null) {
						genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OPERATION__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("name");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OPERATION__NAME));
				if (o != null) {
					genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OPERATION__NAME), element));
					out.print(" ");
				}
				printCountingMap.put("name", count - 1);
			}
		}
	}
	
	public void print_gbind_simpleocl_Operation_1(gbind.simpleocl.Operation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("parameters");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OPERATION__PARAMETERS));
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
			print_gbind_simpleocl_Operation_1_0(element, localtab, out1, printCountingMap1);
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
	
	public void print_gbind_simpleocl_Operation_1_0(gbind.simpleocl.Operation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("parameters");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OPERATION__PARAMETERS));
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
	
	
	public void print_gbind_simpleocl_Parameter(gbind.simpleocl.Parameter element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(8);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.PARAMETER__VAR_NAME));
		printCountingMap.put("varName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.PARAMETER__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.PARAMETER__VARIABLE_EXP));
		printCountingMap.put("variableExp", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.PARAMETER__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("varName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.PARAMETER__VAR_NAME));
			if (o != null) {
				genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.PARAMETER__VAR_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("varName", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("type");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.PARAMETER__TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("type", count - 1);
		}
	}
	
	
	public void print_gbind_simpleocl_OclModelElementExp(gbind.simpleocl.OclModelElementExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(19);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT_EXP__COLLECTION));
		printCountingMap.put("collection", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT_EXP__MODEL));
		printCountingMap.put("model", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT_EXP__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("model");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT_EXP__MODEL));
			if (o != null) {
				genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getOclModelElementExpModelReferenceResolver().deResolve((gbind.simpleocl.OclModel) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT_EXP__MODEL)), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT_EXP__MODEL), element));
				out.print(" ");
			}
			printCountingMap.put("model", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("!");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_gbind_simpleocl_OclModelElementExp_0(element, localtab, out, printCountingMap);
	}
	
	public void print_gbind_simpleocl_OclModelElementExp_0(gbind.simpleocl.OclModelElementExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT_EXP__NAME));
					if (o != null) {
						genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT_EXP__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("name");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT_EXP__NAME));
				if (o != null) {
					genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT_EXP__NAME), element));
					out.print(" ");
				}
				printCountingMap.put("name", count - 1);
			}
		}
	}
	
	
	public void print_gbind_simpleocl_LambdaCallExp(gbind.simpleocl.LambdaCallExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(19);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LAMBDA_CALL_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LAMBDA_CALL_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LAMBDA_CALL_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LAMBDA_CALL_EXP__COLLECTION));
		printCountingMap.put("collection", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LAMBDA_CALL_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LAMBDA_CALL_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LAMBDA_CALL_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LAMBDA_CALL_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LAMBDA_CALL_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LAMBDA_CALL_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LAMBDA_CALL_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LAMBDA_CALL_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LAMBDA_CALL_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LAMBDA_CALL_EXP__REFERRED_VARIABLE));
		printCountingMap.put("referredVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LAMBDA_CALL_EXP__ARGUMENTS));
		printCountingMap.put("arguments", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("referredVariable");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LAMBDA_CALL_EXP__REFERRED_VARIABLE));
			if (o != null) {
				genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getVariableExpReferredVariableReferenceResolver().deResolve((gbind.simpleocl.VariableDeclaration) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LAMBDA_CALL_EXP__REFERRED_VARIABLE)), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LAMBDA_CALL_EXP__REFERRED_VARIABLE), element));
				out.print(" ");
			}
			printCountingMap.put("referredVariable", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_gbind_simpleocl_LambdaCallExp_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_gbind_simpleocl_LambdaCallExp_0(gbind.simpleocl.LambdaCallExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("arguments");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LAMBDA_CALL_EXP__ARGUMENTS));
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
			printCountingMap.put("arguments", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_gbind_simpleocl_LambdaCallExp_0_0(element, localtab, out1, printCountingMap1);
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
	
	public void print_gbind_simpleocl_LambdaCallExp_0_0(gbind.simpleocl.LambdaCallExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("arguments");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LAMBDA_CALL_EXP__ARGUMENTS));
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
			printCountingMap.put("arguments", count - 1);
		}
	}
	
	
	public void print_gbind_simpleocl_VariableExp(gbind.simpleocl.VariableExp element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(18);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.VARIABLE_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.VARIABLE_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.VARIABLE_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.VARIABLE_EXP__COLLECTION));
		printCountingMap.put("collection", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.VARIABLE_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.VARIABLE_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.VARIABLE_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.VARIABLE_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.VARIABLE_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.VARIABLE_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.VARIABLE_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.VARIABLE_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.VARIABLE_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.VARIABLE_EXP__REFERRED_VARIABLE));
		printCountingMap.put("referredVariable", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("referredVariable");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.VARIABLE_EXP__REFERRED_VARIABLE));
			if (o != null) {
				genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getVariableExpReferredVariableReferenceResolver().deResolve((gbind.simpleocl.VariableDeclaration) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.VARIABLE_EXP__REFERRED_VARIABLE)), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.VARIABLE_EXP__REFERRED_VARIABLE), element));
				out.print(" ");
			}
			printCountingMap.put("referredVariable", count - 1);
		}
	}
	
	
	public void print_gbind_simpleocl_SuperExp(gbind.simpleocl.SuperExp element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(17);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SUPER_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SUPER_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SUPER_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SUPER_EXP__COLLECTION));
		printCountingMap.put("collection", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SUPER_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SUPER_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SUPER_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SUPER_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SUPER_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SUPER_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SUPER_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SUPER_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SUPER_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("super");
		out.print(" ");
	}
	
	
	public void print_gbind_simpleocl_SelfExp(gbind.simpleocl.SelfExp element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(17);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SELF_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SELF_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SELF_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SELF_EXP__COLLECTION));
		printCountingMap.put("collection", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SELF_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SELF_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SELF_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SELF_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SELF_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SELF_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SELF_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SELF_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SELF_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("self");
		out.print(" ");
	}
	
	
	public void print_gbind_simpleocl_EnvExp(gbind.simpleocl.EnvExp element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(17);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ENV_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ENV_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ENV_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ENV_EXP__COLLECTION));
		printCountingMap.put("collection", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ENV_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ENV_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ENV_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ENV_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ENV_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ENV_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ENV_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ENV_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ENV_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("env");
		out.print(" ");
	}
	
	
	public void print_gbind_simpleocl_StringExp(gbind.simpleocl.StringExp element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(18);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STRING_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STRING_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STRING_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STRING_EXP__COLLECTION));
		printCountingMap.put("collection", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STRING_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STRING_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STRING_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STRING_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STRING_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STRING_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STRING_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STRING_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STRING_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STRING_EXP__STRING_SYMBOL));
		printCountingMap.put("stringSymbol", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("stringSymbol");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STRING_EXP__STRING_SYMBOL));
			if (o != null) {
				genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_39_39_92");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STRING_EXP__STRING_SYMBOL), element));
				out.print(" ");
			}
			printCountingMap.put("stringSymbol", count - 1);
		}
	}
	
	
	public void print_gbind_simpleocl_BooleanExp(gbind.simpleocl.BooleanExp element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(18);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BOOLEAN_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BOOLEAN_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BOOLEAN_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BOOLEAN_EXP__COLLECTION));
		printCountingMap.put("collection", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BOOLEAN_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BOOLEAN_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BOOLEAN_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BOOLEAN_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BOOLEAN_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BOOLEAN_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BOOLEAN_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BOOLEAN_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BOOLEAN_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BOOLEAN_EXP__BOOLEAN_SYMBOL));
		printCountingMap.put("booleanSymbol", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("booleanSymbol");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BOOLEAN_EXP__BOOLEAN_SYMBOL));
			if (o != null) {
			}
			printCountingMap.put("booleanSymbol", count - 1);
		}
	}
	
	
	public void print_gbind_simpleocl_RealExp(gbind.simpleocl.RealExp element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(18);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.REAL_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.REAL_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.REAL_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.REAL_EXP__COLLECTION));
		printCountingMap.put("collection", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.REAL_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.REAL_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.REAL_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.REAL_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.REAL_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.REAL_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.REAL_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.REAL_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.REAL_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.REAL_EXP__REAL_SYMBOL));
		printCountingMap.put("realSymbol", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("realSymbol");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.REAL_EXP__REAL_SYMBOL));
			if (o != null) {
				genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("FLOAT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.REAL_EXP__REAL_SYMBOL), element));
				out.print(" ");
			}
			printCountingMap.put("realSymbol", count - 1);
		}
	}
	
	
	public void print_gbind_simpleocl_IntegerExp(gbind.simpleocl.IntegerExp element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(18);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.INTEGER_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.INTEGER_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.INTEGER_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.INTEGER_EXP__COLLECTION));
		printCountingMap.put("collection", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.INTEGER_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.INTEGER_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.INTEGER_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.INTEGER_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.INTEGER_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.INTEGER_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.INTEGER_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.INTEGER_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.INTEGER_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.INTEGER_EXP__INTEGER_SYMBOL));
		printCountingMap.put("integerSymbol", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("integerSymbol");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.INTEGER_EXP__INTEGER_SYMBOL));
			if (o != null) {
				genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.INTEGER_EXP__INTEGER_SYMBOL), element));
				out.print(" ");
			}
			printCountingMap.put("integerSymbol", count - 1);
		}
	}
	
	
	public void print_gbind_simpleocl_BagExp(gbind.simpleocl.BagExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(18);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BAG_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BAG_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BAG_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BAG_EXP__COLLECTION));
		printCountingMap.put("collection", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BAG_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BAG_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BAG_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BAG_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BAG_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BAG_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BAG_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BAG_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BAG_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BAG_EXP__ELEMENTS));
		printCountingMap.put("elements", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("Bag");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_gbind_simpleocl_BagExp_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_gbind_simpleocl_BagExp_0(gbind.simpleocl.BagExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elements");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BAG_EXP__ELEMENTS));
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
			printCountingMap.put("elements", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_gbind_simpleocl_BagExp_0_0(element, localtab, out1, printCountingMap1);
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
	
	public void print_gbind_simpleocl_BagExp_0_0(gbind.simpleocl.BagExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elements");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BAG_EXP__ELEMENTS));
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
			printCountingMap.put("elements", count - 1);
		}
	}
	
	
	public void print_gbind_simpleocl_OrderedSetExp(gbind.simpleocl.OrderedSetExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(18);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ORDERED_SET_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ORDERED_SET_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ORDERED_SET_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ORDERED_SET_EXP__COLLECTION));
		printCountingMap.put("collection", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ORDERED_SET_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ORDERED_SET_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ORDERED_SET_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ORDERED_SET_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ORDERED_SET_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ORDERED_SET_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ORDERED_SET_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ORDERED_SET_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ORDERED_SET_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ORDERED_SET_EXP__ELEMENTS));
		printCountingMap.put("elements", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("OrderedSet");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_gbind_simpleocl_OrderedSetExp_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_gbind_simpleocl_OrderedSetExp_0(gbind.simpleocl.OrderedSetExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elements");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ORDERED_SET_EXP__ELEMENTS));
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
			printCountingMap.put("elements", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_gbind_simpleocl_OrderedSetExp_0_0(element, localtab, out1, printCountingMap1);
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
	
	public void print_gbind_simpleocl_OrderedSetExp_0_0(gbind.simpleocl.OrderedSetExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elements");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ORDERED_SET_EXP__ELEMENTS));
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
			printCountingMap.put("elements", count - 1);
		}
	}
	
	
	public void print_gbind_simpleocl_SequenceExp(gbind.simpleocl.SequenceExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(18);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SEQUENCE_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SEQUENCE_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SEQUENCE_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SEQUENCE_EXP__COLLECTION));
		printCountingMap.put("collection", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SEQUENCE_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SEQUENCE_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SEQUENCE_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SEQUENCE_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SEQUENCE_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SEQUENCE_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SEQUENCE_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SEQUENCE_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SEQUENCE_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SEQUENCE_EXP__ELEMENTS));
		printCountingMap.put("elements", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("Sequence");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_gbind_simpleocl_SequenceExp_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_gbind_simpleocl_SequenceExp_0(gbind.simpleocl.SequenceExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elements");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SEQUENCE_EXP__ELEMENTS));
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
			printCountingMap.put("elements", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_gbind_simpleocl_SequenceExp_0_0(element, localtab, out1, printCountingMap1);
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
	
	public void print_gbind_simpleocl_SequenceExp_0_0(gbind.simpleocl.SequenceExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elements");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SEQUENCE_EXP__ELEMENTS));
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
			printCountingMap.put("elements", count - 1);
		}
	}
	
	
	public void print_gbind_simpleocl_SetExp(gbind.simpleocl.SetExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(18);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SET_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SET_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SET_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SET_EXP__COLLECTION));
		printCountingMap.put("collection", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SET_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SET_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SET_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SET_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SET_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SET_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SET_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SET_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SET_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SET_EXP__ELEMENTS));
		printCountingMap.put("elements", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("Set");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_gbind_simpleocl_SetExp_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_gbind_simpleocl_SetExp_0(gbind.simpleocl.SetExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elements");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SET_EXP__ELEMENTS));
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
			printCountingMap.put("elements", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_gbind_simpleocl_SetExp_0_0(element, localtab, out1, printCountingMap1);
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
	
	public void print_gbind_simpleocl_SetExp_0_0(gbind.simpleocl.SetExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elements");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SET_EXP__ELEMENTS));
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
			printCountingMap.put("elements", count - 1);
		}
	}
	
	
	public void print_gbind_simpleocl_TupleExp(gbind.simpleocl.TupleExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(18);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_EXP__COLLECTION));
		printCountingMap.put("collection", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_EXP__TUPLE_PART));
		printCountingMap.put("tuplePart", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("Tuple");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_gbind_simpleocl_TupleExp_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_gbind_simpleocl_TupleExp_0(gbind.simpleocl.TupleExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("tuplePart");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_EXP__TUPLE_PART));
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
			printCountingMap.put("tuplePart", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_gbind_simpleocl_TupleExp_0_0(element, localtab, out1, printCountingMap1);
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
	
	public void print_gbind_simpleocl_TupleExp_0_0(gbind.simpleocl.TupleExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("tuplePart");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_EXP__TUPLE_PART));
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
			printCountingMap.put("tuplePart", count - 1);
		}
	}
	
	
	public void print_gbind_simpleocl_TuplePart(gbind.simpleocl.TuplePart element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(12);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_PART__VAR_NAME));
		printCountingMap.put("varName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_PART__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_PART__VARIABLE_EXP));
		printCountingMap.put("variableExp", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_PART__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_PART__INIT_EXPRESSION));
		printCountingMap.put("initExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_PART__BASE_EXP));
		printCountingMap.put("baseExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_PART__EQ));
		printCountingMap.put("eq", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_PART__TUPLE));
		printCountingMap.put("tuple", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_gbind_simpleocl_TuplePart_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_gbind_simpleocl_TuplePart_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("eq");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_PART__EQ));
			if (o != null) {
				genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("EQ");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_PART__EQ), element));
				out.print(" ");
			}
			printCountingMap.put("eq", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("initExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_PART__INIT_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("initExpression", count - 1);
		}
	}
	
	public void print_gbind_simpleocl_TuplePart_0(gbind.simpleocl.TuplePart element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"varName"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"varName"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("varName");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_PART__VAR_NAME));
					if (o != null) {
						genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_PART__VAR_NAME), element));
						out.print(" ");
					}
					printCountingMap.put("varName", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("varName");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_PART__VAR_NAME));
				if (o != null) {
					genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_PART__VAR_NAME), element));
					out.print(" ");
				}
				printCountingMap.put("varName", count - 1);
			}
		}
	}
	
	public void print_gbind_simpleocl_TuplePart_1(gbind.simpleocl.TuplePart element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("type");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_PART__TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("type", count - 1);
		}
	}
	
	
	public void print_gbind_simpleocl_MapExp(gbind.simpleocl.MapExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(18);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MAP_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MAP_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MAP_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MAP_EXP__COLLECTION));
		printCountingMap.put("collection", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MAP_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MAP_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MAP_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MAP_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MAP_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MAP_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MAP_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MAP_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MAP_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MAP_EXP__ELEMENTS));
		printCountingMap.put("elements", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("Map");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_gbind_simpleocl_MapExp_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_gbind_simpleocl_MapExp_0(gbind.simpleocl.MapExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elements");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MAP_EXP__ELEMENTS));
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
			printCountingMap.put("elements", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_gbind_simpleocl_MapExp_0_0(element, localtab, out1, printCountingMap1);
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
	
	public void print_gbind_simpleocl_MapExp_0_0(gbind.simpleocl.MapExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elements");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MAP_EXP__ELEMENTS));
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
			printCountingMap.put("elements", count - 1);
		}
	}
	
	
	public void print_gbind_simpleocl_MapElement(gbind.simpleocl.MapElement element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(7);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MAP_ELEMENT__MAP));
		printCountingMap.put("map", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MAP_ELEMENT__KEY));
		printCountingMap.put("key", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MAP_ELEMENT__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("key");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MAP_ELEMENT__KEY));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("key", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MAP_ELEMENT__VALUE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("value", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_gbind_simpleocl_EnumLiteralExp(gbind.simpleocl.EnumLiteralExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(18);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ENUM_LITERAL_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ENUM_LITERAL_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ENUM_LITERAL_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ENUM_LITERAL_EXP__COLLECTION));
		printCountingMap.put("collection", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ENUM_LITERAL_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ENUM_LITERAL_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ENUM_LITERAL_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ENUM_LITERAL_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ENUM_LITERAL_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ENUM_LITERAL_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ENUM_LITERAL_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ENUM_LITERAL_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ENUM_LITERAL_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ENUM_LITERAL_EXP__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("#");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_gbind_simpleocl_EnumLiteralExp_0(element, localtab, out, printCountingMap);
	}
	
	public void print_gbind_simpleocl_EnumLiteralExp_0(gbind.simpleocl.EnumLiteralExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ENUM_LITERAL_EXP__NAME));
					if (o != null) {
						genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ENUM_LITERAL_EXP__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("name");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ENUM_LITERAL_EXP__NAME));
				if (o != null) {
					genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ENUM_LITERAL_EXP__NAME), element));
					out.print(" ");
				}
				printCountingMap.put("name", count - 1);
			}
		}
	}
	
	
	public void print_gbind_simpleocl_OclUndefinedExp(gbind.simpleocl.OclUndefinedExp element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(17);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_UNDEFINED_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_UNDEFINED_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_UNDEFINED_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_UNDEFINED_EXP__COLLECTION));
		printCountingMap.put("collection", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_UNDEFINED_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_UNDEFINED_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_UNDEFINED_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_UNDEFINED_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_UNDEFINED_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_UNDEFINED_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_UNDEFINED_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_UNDEFINED_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_UNDEFINED_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("OclUndefined");
		out.print(" ");
	}
	
	
	public void print_gbind_simpleocl_LetExp(gbind.simpleocl.LetExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(19);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LET_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LET_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LET_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LET_EXP__COLLECTION));
		printCountingMap.put("collection", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LET_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LET_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LET_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LET_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LET_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LET_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LET_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LET_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LET_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LET_EXP__VARIABLE));
		printCountingMap.put("variable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LET_EXP__IN_));
		printCountingMap.put("in_", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("let");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("variable");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LET_EXP__VARIABLE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("variable", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("in");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("in_");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LET_EXP__IN_));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("in_", count - 1);
		}
	}
	
	
	public void print_gbind_simpleocl_IfExp(gbind.simpleocl.IfExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(20);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.IF_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.IF_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.IF_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.IF_EXP__COLLECTION));
		printCountingMap.put("collection", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.IF_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.IF_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.IF_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.IF_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.IF_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.IF_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.IF_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.IF_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.IF_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.IF_EXP__THEN_EXPRESSION));
		printCountingMap.put("thenExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.IF_EXP__CONDITION));
		printCountingMap.put("condition", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.IF_EXP__ELSE_EXPRESSION));
		printCountingMap.put("elseExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("if");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("condition");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.IF_EXP__CONDITION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("condition", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("then");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("thenExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.IF_EXP__THEN_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("thenExpression", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("else");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elseExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.IF_EXP__ELSE_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("elseExpression", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("endif");
		out.print(" ");
	}
	
	
	public void print_gbind_simpleocl_BraceExp(gbind.simpleocl.BraceExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(18);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BRACE_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BRACE_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BRACE_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BRACE_EXP__COLLECTION));
		printCountingMap.put("collection", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BRACE_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BRACE_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BRACE_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BRACE_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BRACE_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BRACE_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BRACE_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BRACE_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BRACE_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BRACE_EXP__EXP));
		printCountingMap.put("exp", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("exp");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BRACE_EXP__EXP));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("exp", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_gbind_simpleocl_OperatorCallExp(gbind.simpleocl.OperatorCallExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(20);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OPERATOR_CALL_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OPERATOR_CALL_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OPERATOR_CALL_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OPERATOR_CALL_EXP__COLLECTION));
		printCountingMap.put("collection", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OPERATOR_CALL_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OPERATOR_CALL_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OPERATOR_CALL_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OPERATOR_CALL_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OPERATOR_CALL_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OPERATOR_CALL_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OPERATOR_CALL_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OPERATOR_CALL_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OPERATOR_CALL_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OPERATOR_CALL_EXP__ARGUMENT));
		printCountingMap.put("argument", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OPERATOR_CALL_EXP__OPERATION_NAME));
		printCountingMap.put("operationName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OPERATOR_CALL_EXP__SOURCE));
		printCountingMap.put("source", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("source");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OPERATOR_CALL_EXP__SOURCE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("source", count - 1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("operationName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OPERATOR_CALL_EXP__OPERATION_NAME));
			if (o != null) {
				genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("BOOLOP");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OPERATOR_CALL_EXP__OPERATION_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("operationName", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("argument");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OPERATOR_CALL_EXP__ARGUMENT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("argument", count - 1);
		}
	}
	
	
	public void print_gbind_simpleocl_EqOpCallExp(gbind.simpleocl.EqOpCallExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(20);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.EQ_OP_CALL_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.EQ_OP_CALL_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.EQ_OP_CALL_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.EQ_OP_CALL_EXP__COLLECTION));
		printCountingMap.put("collection", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.EQ_OP_CALL_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.EQ_OP_CALL_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.EQ_OP_CALL_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.EQ_OP_CALL_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.EQ_OP_CALL_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.EQ_OP_CALL_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.EQ_OP_CALL_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.EQ_OP_CALL_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.EQ_OP_CALL_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.EQ_OP_CALL_EXP__ARGUMENT));
		printCountingMap.put("argument", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.EQ_OP_CALL_EXP__OPERATION_NAME));
		printCountingMap.put("operationName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.EQ_OP_CALL_EXP__SOURCE));
		printCountingMap.put("source", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("source");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.EQ_OP_CALL_EXP__SOURCE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("source", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_gbind_simpleocl_EqOpCallExp_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("argument");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.EQ_OP_CALL_EXP__ARGUMENT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("argument", count - 1);
		}
	}
	
	public void print_gbind_simpleocl_EqOpCallExp_0(gbind.simpleocl.EqOpCallExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operationName"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operationName"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("operationName");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.EQ_OP_CALL_EXP__OPERATION_NAME));
					if (o != null) {
						genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("NEQ");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.EQ_OP_CALL_EXP__OPERATION_NAME), element));
						out.print(" ");
					}
					printCountingMap.put("operationName", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("operationName");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.EQ_OP_CALL_EXP__OPERATION_NAME));
				if (o != null) {
					genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("EQ");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.EQ_OP_CALL_EXP__OPERATION_NAME), element));
					out.print(" ");
				}
				printCountingMap.put("operationName", count - 1);
			}
		}
	}
	
	
	public void print_gbind_simpleocl_RelOpCallExp(gbind.simpleocl.RelOpCallExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(20);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.REL_OP_CALL_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.REL_OP_CALL_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.REL_OP_CALL_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.REL_OP_CALL_EXP__COLLECTION));
		printCountingMap.put("collection", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.REL_OP_CALL_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.REL_OP_CALL_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.REL_OP_CALL_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.REL_OP_CALL_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.REL_OP_CALL_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.REL_OP_CALL_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.REL_OP_CALL_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.REL_OP_CALL_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.REL_OP_CALL_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.REL_OP_CALL_EXP__ARGUMENT));
		printCountingMap.put("argument", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.REL_OP_CALL_EXP__OPERATION_NAME));
		printCountingMap.put("operationName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.REL_OP_CALL_EXP__SOURCE));
		printCountingMap.put("source", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("source");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.REL_OP_CALL_EXP__SOURCE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("source", count - 1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("operationName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.REL_OP_CALL_EXP__OPERATION_NAME));
			if (o != null) {
				genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("RELOP");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.REL_OP_CALL_EXP__OPERATION_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("operationName", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("argument");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.REL_OP_CALL_EXP__ARGUMENT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("argument", count - 1);
		}
	}
	
	
	public void print_gbind_simpleocl_AddOpCallExp(gbind.simpleocl.AddOpCallExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(20);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ADD_OP_CALL_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ADD_OP_CALL_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ADD_OP_CALL_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ADD_OP_CALL_EXP__COLLECTION));
		printCountingMap.put("collection", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ADD_OP_CALL_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ADD_OP_CALL_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ADD_OP_CALL_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ADD_OP_CALL_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ADD_OP_CALL_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ADD_OP_CALL_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ADD_OP_CALL_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ADD_OP_CALL_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ADD_OP_CALL_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ADD_OP_CALL_EXP__ARGUMENT));
		printCountingMap.put("argument", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ADD_OP_CALL_EXP__OPERATION_NAME));
		printCountingMap.put("operationName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ADD_OP_CALL_EXP__SOURCE));
		printCountingMap.put("source", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("source");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ADD_OP_CALL_EXP__SOURCE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("source", count - 1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("operationName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ADD_OP_CALL_EXP__OPERATION_NAME));
			if (o != null) {
				genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("ADDOP");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ADD_OP_CALL_EXP__OPERATION_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("operationName", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("argument");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ADD_OP_CALL_EXP__ARGUMENT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("argument", count - 1);
		}
	}
	
	
	public void print_gbind_simpleocl_IntOpCallExp(gbind.simpleocl.IntOpCallExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(20);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.INT_OP_CALL_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.INT_OP_CALL_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.INT_OP_CALL_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.INT_OP_CALL_EXP__COLLECTION));
		printCountingMap.put("collection", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.INT_OP_CALL_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.INT_OP_CALL_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.INT_OP_CALL_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.INT_OP_CALL_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.INT_OP_CALL_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.INT_OP_CALL_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.INT_OP_CALL_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.INT_OP_CALL_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.INT_OP_CALL_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.INT_OP_CALL_EXP__ARGUMENT));
		printCountingMap.put("argument", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.INT_OP_CALL_EXP__OPERATION_NAME));
		printCountingMap.put("operationName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.INT_OP_CALL_EXP__SOURCE));
		printCountingMap.put("source", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("source");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.INT_OP_CALL_EXP__SOURCE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("source", count - 1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("operationName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.INT_OP_CALL_EXP__OPERATION_NAME));
			if (o != null) {
				genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTOP");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.INT_OP_CALL_EXP__OPERATION_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("operationName", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("argument");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.INT_OP_CALL_EXP__ARGUMENT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("argument", count - 1);
		}
	}
	
	
	public void print_gbind_simpleocl_MulOpCallExp(gbind.simpleocl.MulOpCallExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(20);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MUL_OP_CALL_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MUL_OP_CALL_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MUL_OP_CALL_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MUL_OP_CALL_EXP__COLLECTION));
		printCountingMap.put("collection", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MUL_OP_CALL_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MUL_OP_CALL_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MUL_OP_CALL_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MUL_OP_CALL_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MUL_OP_CALL_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MUL_OP_CALL_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MUL_OP_CALL_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MUL_OP_CALL_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MUL_OP_CALL_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MUL_OP_CALL_EXP__ARGUMENT));
		printCountingMap.put("argument", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MUL_OP_CALL_EXP__OPERATION_NAME));
		printCountingMap.put("operationName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MUL_OP_CALL_EXP__SOURCE));
		printCountingMap.put("source", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("source");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MUL_OP_CALL_EXP__SOURCE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("source", count - 1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("operationName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MUL_OP_CALL_EXP__OPERATION_NAME));
			if (o != null) {
				genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("MULOP");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MUL_OP_CALL_EXP__OPERATION_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("operationName", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("argument");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MUL_OP_CALL_EXP__ARGUMENT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("argument", count - 1);
		}
	}
	
	
	public void print_gbind_simpleocl_NotOpCallExp(gbind.simpleocl.NotOpCallExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(20);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.NOT_OP_CALL_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.NOT_OP_CALL_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.NOT_OP_CALL_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.NOT_OP_CALL_EXP__COLLECTION));
		printCountingMap.put("collection", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.NOT_OP_CALL_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.NOT_OP_CALL_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.NOT_OP_CALL_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.NOT_OP_CALL_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.NOT_OP_CALL_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.NOT_OP_CALL_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.NOT_OP_CALL_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.NOT_OP_CALL_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.NOT_OP_CALL_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.NOT_OP_CALL_EXP__ARGUMENT));
		printCountingMap.put("argument", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.NOT_OP_CALL_EXP__OPERATION_NAME));
		printCountingMap.put("operationName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.NOT_OP_CALL_EXP__SOURCE));
		printCountingMap.put("source", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("operationName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.NOT_OP_CALL_EXP__OPERATION_NAME));
			if (o != null) {
				genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("NOTOP");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.NOT_OP_CALL_EXP__OPERATION_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("operationName", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("source");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.NOT_OP_CALL_EXP__SOURCE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("source", count - 1);
		}
	}
	
	
	public void print_gbind_simpleocl_StaticPropertyCallExp(gbind.simpleocl.StaticPropertyCallExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(19);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STATIC_PROPERTY_CALL_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STATIC_PROPERTY_CALL_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STATIC_PROPERTY_CALL_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STATIC_PROPERTY_CALL_EXP__COLLECTION));
		printCountingMap.put("collection", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STATIC_PROPERTY_CALL_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STATIC_PROPERTY_CALL_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STATIC_PROPERTY_CALL_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STATIC_PROPERTY_CALL_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STATIC_PROPERTY_CALL_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STATIC_PROPERTY_CALL_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STATIC_PROPERTY_CALL_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STATIC_PROPERTY_CALL_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STATIC_PROPERTY_CALL_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STATIC_PROPERTY_CALL_EXP__SOURCE));
		printCountingMap.put("source", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STATIC_PROPERTY_CALL_EXP__STATIC_CALL));
		printCountingMap.put("staticCall", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("source");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STATIC_PROPERTY_CALL_EXP__SOURCE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("source", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("staticCall");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STATIC_PROPERTY_CALL_EXP__STATIC_CALL));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("staticCall", count - 1);
		}
	}
	
	
	public void print_gbind_simpleocl_StaticOperationCall(gbind.simpleocl.StaticOperationCall element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(7);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STATIC_OPERATION_CALL__STATIC_CALL_EXP));
		printCountingMap.put("staticCallExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STATIC_OPERATION_CALL__ARGUMENTS));
		printCountingMap.put("arguments", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STATIC_OPERATION_CALL__OPERATION_NAME));
		printCountingMap.put("operationName", temp == null ? 0 : 1);
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("::");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_gbind_simpleocl_StaticOperationCall_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_gbind_simpleocl_StaticOperationCall_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_gbind_simpleocl_StaticOperationCall_0(gbind.simpleocl.StaticOperationCall element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operationName"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operationName"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("operationName");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STATIC_OPERATION_CALL__OPERATION_NAME));
					if (o != null) {
						genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STATIC_OPERATION_CALL__OPERATION_NAME), element));
						out.print(" ");
					}
					printCountingMap.put("operationName", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("operationName");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STATIC_OPERATION_CALL__OPERATION_NAME));
				if (o != null) {
					genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STATIC_OPERATION_CALL__OPERATION_NAME), element));
					out.print(" ");
				}
				printCountingMap.put("operationName", count - 1);
			}
		}
	}
	
	public void print_gbind_simpleocl_StaticOperationCall_1(gbind.simpleocl.StaticOperationCall element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("arguments");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STATIC_OPERATION_CALL__ARGUMENTS));
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
			printCountingMap.put("arguments", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_gbind_simpleocl_StaticOperationCall_1_0(element, localtab, out1, printCountingMap1);
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
	
	public void print_gbind_simpleocl_StaticOperationCall_1_0(gbind.simpleocl.StaticOperationCall element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("arguments");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STATIC_OPERATION_CALL__ARGUMENTS));
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
			printCountingMap.put("arguments", count - 1);
		}
	}
	
	
	public void print_gbind_simpleocl_StaticNavigationOrAttributeCall(gbind.simpleocl.StaticNavigationOrAttributeCall element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(6);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STATIC_NAVIGATION_OR_ATTRIBUTE_CALL__STATIC_CALL_EXP));
		printCountingMap.put("staticCallExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STATIC_NAVIGATION_OR_ATTRIBUTE_CALL__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("::");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_gbind_simpleocl_StaticNavigationOrAttributeCall_0(element, localtab, out, printCountingMap);
	}
	
	public void print_gbind_simpleocl_StaticNavigationOrAttributeCall_0(gbind.simpleocl.StaticNavigationOrAttributeCall element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STATIC_NAVIGATION_OR_ATTRIBUTE_CALL__NAME));
					if (o != null) {
						genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STATIC_NAVIGATION_OR_ATTRIBUTE_CALL__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("name");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STATIC_NAVIGATION_OR_ATTRIBUTE_CALL__NAME));
				if (o != null) {
					genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STATIC_NAVIGATION_OR_ATTRIBUTE_CALL__NAME), element));
					out.print(" ");
				}
				printCountingMap.put("name", count - 1);
			}
		}
	}
	
	
	public void print_gbind_simpleocl_PropertyCallExp(gbind.simpleocl.PropertyCallExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(19);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.PROPERTY_CALL_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.PROPERTY_CALL_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.PROPERTY_CALL_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.PROPERTY_CALL_EXP__COLLECTION));
		printCountingMap.put("collection", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.PROPERTY_CALL_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.PROPERTY_CALL_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.PROPERTY_CALL_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.PROPERTY_CALL_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.PROPERTY_CALL_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.PROPERTY_CALL_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.PROPERTY_CALL_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.PROPERTY_CALL_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.PROPERTY_CALL_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.PROPERTY_CALL_EXP__CALLS));
		printCountingMap.put("calls", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.PROPERTY_CALL_EXP__SOURCE));
		printCountingMap.put("source", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("source");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.PROPERTY_CALL_EXP__SOURCE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("source", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("calls");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.PROPERTY_CALL_EXP__CALLS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("calls", 0);
		}
	}
	
	
	public void print_gbind_simpleocl_OperationCall(gbind.simpleocl.OperationCall element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(7);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OPERATION_CALL__CALL_EXP));
		printCountingMap.put("callExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OPERATION_CALL__ARGUMENTS));
		printCountingMap.put("arguments", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OPERATION_CALL__OPERATION_NAME));
		printCountingMap.put("operationName", temp == null ? 0 : 1);
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_gbind_simpleocl_OperationCall_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_gbind_simpleocl_OperationCall_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_gbind_simpleocl_OperationCall_0(gbind.simpleocl.OperationCall element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operationName"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operationName"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("operationName");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OPERATION_CALL__OPERATION_NAME));
					if (o != null) {
						genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OPERATION_CALL__OPERATION_NAME), element));
						out.print(" ");
					}
					printCountingMap.put("operationName", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("operationName");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OPERATION_CALL__OPERATION_NAME));
				if (o != null) {
					genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OPERATION_CALL__OPERATION_NAME), element));
					out.print(" ");
				}
				printCountingMap.put("operationName", count - 1);
			}
		}
	}
	
	public void print_gbind_simpleocl_OperationCall_1(gbind.simpleocl.OperationCall element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("arguments");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OPERATION_CALL__ARGUMENTS));
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
			printCountingMap.put("arguments", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_gbind_simpleocl_OperationCall_1_0(element, localtab, out1, printCountingMap1);
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
	
	public void print_gbind_simpleocl_OperationCall_1_0(gbind.simpleocl.OperationCall element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("arguments");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OPERATION_CALL__ARGUMENTS));
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
			printCountingMap.put("arguments", count - 1);
		}
	}
	
	
	public void print_gbind_simpleocl_NavigationOrAttributeCall(gbind.simpleocl.NavigationOrAttributeCall element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(6);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.NAVIGATION_OR_ATTRIBUTE_CALL__CALL_EXP));
		printCountingMap.put("callExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.NAVIGATION_OR_ATTRIBUTE_CALL__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_gbind_simpleocl_NavigationOrAttributeCall_0(element, localtab, out, printCountingMap);
	}
	
	public void print_gbind_simpleocl_NavigationOrAttributeCall_0(gbind.simpleocl.NavigationOrAttributeCall element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.NAVIGATION_OR_ATTRIBUTE_CALL__NAME));
					if (o != null) {
						genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.NAVIGATION_OR_ATTRIBUTE_CALL__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("name");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.NAVIGATION_OR_ATTRIBUTE_CALL__NAME));
				if (o != null) {
					genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.NAVIGATION_OR_ATTRIBUTE_CALL__NAME), element));
					out.print(" ");
				}
				printCountingMap.put("name", count - 1);
			}
		}
	}
	
	
	public void print_gbind_simpleocl_IterateExp(gbind.simpleocl.IterateExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(8);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ITERATE_EXP__CALL_EXP));
		printCountingMap.put("callExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ITERATE_EXP__BODY));
		printCountingMap.put("body", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ITERATE_EXP__ITERATORS));
		printCountingMap.put("iterators", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ITERATE_EXP__RESULT));
		printCountingMap.put("result", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("->");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("iterate");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("iterators");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ITERATE_EXP__ITERATORS));
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
			printCountingMap.put("iterators", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_gbind_simpleocl_IterateExp_0(element, localtab, out1, printCountingMap1);
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
		out.print(";");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("result");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ITERATE_EXP__RESULT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("result", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("|");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("body");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ITERATE_EXP__BODY));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("body", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_gbind_simpleocl_IterateExp_0(gbind.simpleocl.IterateExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("iterators");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ITERATE_EXP__ITERATORS));
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
			printCountingMap.put("iterators", count - 1);
		}
	}
	
	
	public void print_gbind_simpleocl_IteratorExp(gbind.simpleocl.IteratorExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(8);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ITERATOR_EXP__CALL_EXP));
		printCountingMap.put("callExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ITERATOR_EXP__BODY));
		printCountingMap.put("body", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ITERATOR_EXP__ITERATORS));
		printCountingMap.put("iterators", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ITERATOR_EXP__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("->");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_gbind_simpleocl_IteratorExp_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("iterators");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ITERATOR_EXP__ITERATORS));
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
			printCountingMap.put("iterators", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_gbind_simpleocl_IteratorExp_1(element, localtab, out1, printCountingMap1);
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
		out.print("|");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("body");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ITERATOR_EXP__BODY));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("body", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_gbind_simpleocl_IteratorExp_0(gbind.simpleocl.IteratorExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ITERATOR_EXP__NAME));
					if (o != null) {
						genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ITERATOR_EXP__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("name");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ITERATOR_EXP__NAME));
				if (o != null) {
					genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ITERATOR_EXP__NAME), element));
					out.print(" ");
				}
				printCountingMap.put("name", count - 1);
			}
		}
	}
	
	public void print_gbind_simpleocl_IteratorExp_1(gbind.simpleocl.IteratorExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("iterators");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ITERATOR_EXP__ITERATORS));
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
			printCountingMap.put("iterators", count - 1);
		}
	}
	
	
	public void print_gbind_simpleocl_Iterator(gbind.simpleocl.Iterator element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(8);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ITERATOR__VAR_NAME));
		printCountingMap.put("varName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ITERATOR__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ITERATOR__VARIABLE_EXP));
		printCountingMap.put("variableExp", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ITERATOR__LOOP_EXPR));
		printCountingMap.put("loopExpr", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("varName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ITERATOR__VAR_NAME));
			if (o != null) {
				genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ITERATOR__VAR_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("varName", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_gbind_simpleocl_Iterator_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_gbind_simpleocl_Iterator_0(gbind.simpleocl.Iterator element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("type");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ITERATOR__TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("type", count - 1);
		}
	}
	
	
	public void print_gbind_simpleocl_CollectionOperationCall(gbind.simpleocl.CollectionOperationCall element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(7);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.COLLECTION_OPERATION_CALL__CALL_EXP));
		printCountingMap.put("callExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.COLLECTION_OPERATION_CALL__ARGUMENTS));
		printCountingMap.put("arguments", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.COLLECTION_OPERATION_CALL__OPERATION_NAME));
		printCountingMap.put("operationName", temp == null ? 0 : 1);
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("->");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_gbind_simpleocl_CollectionOperationCall_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_gbind_simpleocl_CollectionOperationCall_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_gbind_simpleocl_CollectionOperationCall_0(gbind.simpleocl.CollectionOperationCall element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operationName"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operationName"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("operationName");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.COLLECTION_OPERATION_CALL__OPERATION_NAME));
					if (o != null) {
						genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.COLLECTION_OPERATION_CALL__OPERATION_NAME), element));
						out.print(" ");
					}
					printCountingMap.put("operationName", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("operationName");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.COLLECTION_OPERATION_CALL__OPERATION_NAME));
				if (o != null) {
					genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.COLLECTION_OPERATION_CALL__OPERATION_NAME), element));
					out.print(" ");
				}
				printCountingMap.put("operationName", count - 1);
			}
		}
	}
	
	public void print_gbind_simpleocl_CollectionOperationCall_1(gbind.simpleocl.CollectionOperationCall element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("arguments");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.COLLECTION_OPERATION_CALL__ARGUMENTS));
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
			printCountingMap.put("arguments", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_gbind_simpleocl_CollectionOperationCall_1_0(element, localtab, out1, printCountingMap1);
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
	
	public void print_gbind_simpleocl_CollectionOperationCall_1_0(gbind.simpleocl.CollectionOperationCall element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("arguments");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.COLLECTION_OPERATION_CALL__ARGUMENTS));
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
			printCountingMap.put("arguments", count - 1);
		}
	}
	
	
	public void print_gbind_simpleocl_CollectionType(gbind.simpleocl.CollectionType element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(18);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.COLLECTION_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.COLLECTION_TYPE__DEFINITIONS));
		printCountingMap.put("definitions", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.COLLECTION_TYPE__OCL_EXPRESSION));
		printCountingMap.put("oclExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.COLLECTION_TYPE__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.COLLECTION_TYPE__MAP_TYPE2));
		printCountingMap.put("mapType2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.COLLECTION_TYPE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.COLLECTION_TYPE__MAP_TYPE));
		printCountingMap.put("mapType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.COLLECTION_TYPE__COLLECTION_TYPES));
		printCountingMap.put("collectionTypes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.COLLECTION_TYPE__TUPLE_TYPE_ATTRIBUTE));
		printCountingMap.put("tupleTypeAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.COLLECTION_TYPE__VARIABLE_DECLARATION));
		printCountingMap.put("variableDeclaration", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.COLLECTION_TYPE__LAMBDA_RETURN_TYPE));
		printCountingMap.put("lambdaReturnType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.COLLECTION_TYPE__LAMBDA_ARG_TYPE));
		printCountingMap.put("lambdaArgType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.COLLECTION_TYPE__STATIC_PROPERTY_CALL));
		printCountingMap.put("staticPropertyCall", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.COLLECTION_TYPE__ELEMENT_TYPE));
		printCountingMap.put("elementType", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.COLLECTION_TYPE__NAME));
			if (o != null) {
				genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("COLLECTIONTYPE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.COLLECTION_TYPE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elementType");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.COLLECTION_TYPE__ELEMENT_TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("elementType", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_gbind_simpleocl_StringType(gbind.simpleocl.StringType element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(17);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STRING_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STRING_TYPE__DEFINITIONS));
		printCountingMap.put("definitions", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STRING_TYPE__OCL_EXPRESSION));
		printCountingMap.put("oclExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STRING_TYPE__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STRING_TYPE__MAP_TYPE2));
		printCountingMap.put("mapType2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STRING_TYPE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STRING_TYPE__MAP_TYPE));
		printCountingMap.put("mapType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STRING_TYPE__COLLECTION_TYPES));
		printCountingMap.put("collectionTypes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STRING_TYPE__TUPLE_TYPE_ATTRIBUTE));
		printCountingMap.put("tupleTypeAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STRING_TYPE__VARIABLE_DECLARATION));
		printCountingMap.put("variableDeclaration", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STRING_TYPE__LAMBDA_RETURN_TYPE));
		printCountingMap.put("lambdaReturnType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STRING_TYPE__LAMBDA_ARG_TYPE));
		printCountingMap.put("lambdaArgType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STRING_TYPE__STATIC_PROPERTY_CALL));
		printCountingMap.put("staticPropertyCall", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STRING_TYPE__NAME));
			if (o != null) {
				genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRINGTYPE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.STRING_TYPE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	
	public void print_gbind_simpleocl_BooleanType(gbind.simpleocl.BooleanType element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(17);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BOOLEAN_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BOOLEAN_TYPE__DEFINITIONS));
		printCountingMap.put("definitions", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BOOLEAN_TYPE__OCL_EXPRESSION));
		printCountingMap.put("oclExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BOOLEAN_TYPE__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BOOLEAN_TYPE__MAP_TYPE2));
		printCountingMap.put("mapType2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BOOLEAN_TYPE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BOOLEAN_TYPE__MAP_TYPE));
		printCountingMap.put("mapType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BOOLEAN_TYPE__COLLECTION_TYPES));
		printCountingMap.put("collectionTypes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BOOLEAN_TYPE__TUPLE_TYPE_ATTRIBUTE));
		printCountingMap.put("tupleTypeAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BOOLEAN_TYPE__VARIABLE_DECLARATION));
		printCountingMap.put("variableDeclaration", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BOOLEAN_TYPE__LAMBDA_RETURN_TYPE));
		printCountingMap.put("lambdaReturnType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BOOLEAN_TYPE__LAMBDA_ARG_TYPE));
		printCountingMap.put("lambdaArgType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BOOLEAN_TYPE__STATIC_PROPERTY_CALL));
		printCountingMap.put("staticPropertyCall", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BOOLEAN_TYPE__NAME));
			if (o != null) {
				genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("BOOLEANTYPE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BOOLEAN_TYPE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	
	public void print_gbind_simpleocl_IntegerType(gbind.simpleocl.IntegerType element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(17);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.INTEGER_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.INTEGER_TYPE__DEFINITIONS));
		printCountingMap.put("definitions", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.INTEGER_TYPE__OCL_EXPRESSION));
		printCountingMap.put("oclExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.INTEGER_TYPE__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.INTEGER_TYPE__MAP_TYPE2));
		printCountingMap.put("mapType2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.INTEGER_TYPE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.INTEGER_TYPE__MAP_TYPE));
		printCountingMap.put("mapType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.INTEGER_TYPE__COLLECTION_TYPES));
		printCountingMap.put("collectionTypes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.INTEGER_TYPE__TUPLE_TYPE_ATTRIBUTE));
		printCountingMap.put("tupleTypeAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.INTEGER_TYPE__VARIABLE_DECLARATION));
		printCountingMap.put("variableDeclaration", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.INTEGER_TYPE__LAMBDA_RETURN_TYPE));
		printCountingMap.put("lambdaReturnType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.INTEGER_TYPE__LAMBDA_ARG_TYPE));
		printCountingMap.put("lambdaArgType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.INTEGER_TYPE__STATIC_PROPERTY_CALL));
		printCountingMap.put("staticPropertyCall", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.INTEGER_TYPE__NAME));
			if (o != null) {
				genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGERTYPE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.INTEGER_TYPE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	
	public void print_gbind_simpleocl_RealType(gbind.simpleocl.RealType element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(17);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.REAL_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.REAL_TYPE__DEFINITIONS));
		printCountingMap.put("definitions", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.REAL_TYPE__OCL_EXPRESSION));
		printCountingMap.put("oclExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.REAL_TYPE__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.REAL_TYPE__MAP_TYPE2));
		printCountingMap.put("mapType2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.REAL_TYPE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.REAL_TYPE__MAP_TYPE));
		printCountingMap.put("mapType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.REAL_TYPE__COLLECTION_TYPES));
		printCountingMap.put("collectionTypes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.REAL_TYPE__TUPLE_TYPE_ATTRIBUTE));
		printCountingMap.put("tupleTypeAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.REAL_TYPE__VARIABLE_DECLARATION));
		printCountingMap.put("variableDeclaration", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.REAL_TYPE__LAMBDA_RETURN_TYPE));
		printCountingMap.put("lambdaReturnType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.REAL_TYPE__LAMBDA_ARG_TYPE));
		printCountingMap.put("lambdaArgType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.REAL_TYPE__STATIC_PROPERTY_CALL));
		printCountingMap.put("staticPropertyCall", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.REAL_TYPE__NAME));
			if (o != null) {
				genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("REALTYPE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.REAL_TYPE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	
	public void print_gbind_simpleocl_BagType(gbind.simpleocl.BagType element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(18);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BAG_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BAG_TYPE__DEFINITIONS));
		printCountingMap.put("definitions", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BAG_TYPE__OCL_EXPRESSION));
		printCountingMap.put("oclExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BAG_TYPE__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BAG_TYPE__MAP_TYPE2));
		printCountingMap.put("mapType2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BAG_TYPE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BAG_TYPE__MAP_TYPE));
		printCountingMap.put("mapType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BAG_TYPE__COLLECTION_TYPES));
		printCountingMap.put("collectionTypes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BAG_TYPE__TUPLE_TYPE_ATTRIBUTE));
		printCountingMap.put("tupleTypeAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BAG_TYPE__VARIABLE_DECLARATION));
		printCountingMap.put("variableDeclaration", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BAG_TYPE__LAMBDA_RETURN_TYPE));
		printCountingMap.put("lambdaReturnType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BAG_TYPE__LAMBDA_ARG_TYPE));
		printCountingMap.put("lambdaArgType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BAG_TYPE__STATIC_PROPERTY_CALL));
		printCountingMap.put("staticPropertyCall", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BAG_TYPE__ELEMENT_TYPE));
		printCountingMap.put("elementType", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BAG_TYPE__NAME));
			if (o != null) {
				genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("BAGTYPE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BAG_TYPE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elementType");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.BAG_TYPE__ELEMENT_TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("elementType", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_gbind_simpleocl_OrderedSetType(gbind.simpleocl.OrderedSetType element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(18);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ORDERED_SET_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ORDERED_SET_TYPE__DEFINITIONS));
		printCountingMap.put("definitions", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ORDERED_SET_TYPE__OCL_EXPRESSION));
		printCountingMap.put("oclExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ORDERED_SET_TYPE__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ORDERED_SET_TYPE__MAP_TYPE2));
		printCountingMap.put("mapType2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ORDERED_SET_TYPE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ORDERED_SET_TYPE__MAP_TYPE));
		printCountingMap.put("mapType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ORDERED_SET_TYPE__COLLECTION_TYPES));
		printCountingMap.put("collectionTypes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ORDERED_SET_TYPE__TUPLE_TYPE_ATTRIBUTE));
		printCountingMap.put("tupleTypeAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ORDERED_SET_TYPE__VARIABLE_DECLARATION));
		printCountingMap.put("variableDeclaration", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ORDERED_SET_TYPE__LAMBDA_RETURN_TYPE));
		printCountingMap.put("lambdaReturnType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ORDERED_SET_TYPE__LAMBDA_ARG_TYPE));
		printCountingMap.put("lambdaArgType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ORDERED_SET_TYPE__STATIC_PROPERTY_CALL));
		printCountingMap.put("staticPropertyCall", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ORDERED_SET_TYPE__ELEMENT_TYPE));
		printCountingMap.put("elementType", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ORDERED_SET_TYPE__NAME));
			if (o != null) {
				genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("ORDEREDSETTYPE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ORDERED_SET_TYPE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elementType");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ORDERED_SET_TYPE__ELEMENT_TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("elementType", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_gbind_simpleocl_SequenceType(gbind.simpleocl.SequenceType element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(18);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SEQUENCE_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SEQUENCE_TYPE__DEFINITIONS));
		printCountingMap.put("definitions", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SEQUENCE_TYPE__OCL_EXPRESSION));
		printCountingMap.put("oclExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SEQUENCE_TYPE__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SEQUENCE_TYPE__MAP_TYPE2));
		printCountingMap.put("mapType2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SEQUENCE_TYPE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SEQUENCE_TYPE__MAP_TYPE));
		printCountingMap.put("mapType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SEQUENCE_TYPE__COLLECTION_TYPES));
		printCountingMap.put("collectionTypes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SEQUENCE_TYPE__TUPLE_TYPE_ATTRIBUTE));
		printCountingMap.put("tupleTypeAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SEQUENCE_TYPE__VARIABLE_DECLARATION));
		printCountingMap.put("variableDeclaration", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SEQUENCE_TYPE__LAMBDA_RETURN_TYPE));
		printCountingMap.put("lambdaReturnType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SEQUENCE_TYPE__LAMBDA_ARG_TYPE));
		printCountingMap.put("lambdaArgType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SEQUENCE_TYPE__STATIC_PROPERTY_CALL));
		printCountingMap.put("staticPropertyCall", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SEQUENCE_TYPE__ELEMENT_TYPE));
		printCountingMap.put("elementType", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SEQUENCE_TYPE__NAME));
			if (o != null) {
				genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("SEQUENCETYPE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SEQUENCE_TYPE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elementType");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SEQUENCE_TYPE__ELEMENT_TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("elementType", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_gbind_simpleocl_SetType(gbind.simpleocl.SetType element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(18);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SET_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SET_TYPE__DEFINITIONS));
		printCountingMap.put("definitions", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SET_TYPE__OCL_EXPRESSION));
		printCountingMap.put("oclExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SET_TYPE__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SET_TYPE__MAP_TYPE2));
		printCountingMap.put("mapType2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SET_TYPE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SET_TYPE__MAP_TYPE));
		printCountingMap.put("mapType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SET_TYPE__COLLECTION_TYPES));
		printCountingMap.put("collectionTypes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SET_TYPE__TUPLE_TYPE_ATTRIBUTE));
		printCountingMap.put("tupleTypeAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SET_TYPE__VARIABLE_DECLARATION));
		printCountingMap.put("variableDeclaration", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SET_TYPE__LAMBDA_RETURN_TYPE));
		printCountingMap.put("lambdaReturnType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SET_TYPE__LAMBDA_ARG_TYPE));
		printCountingMap.put("lambdaArgType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SET_TYPE__STATIC_PROPERTY_CALL));
		printCountingMap.put("staticPropertyCall", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SET_TYPE__ELEMENT_TYPE));
		printCountingMap.put("elementType", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SET_TYPE__NAME));
			if (o != null) {
				genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("SETTYPE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SET_TYPE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elementType");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.SET_TYPE__ELEMENT_TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("elementType", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_gbind_simpleocl_OclAnyType(gbind.simpleocl.OclAnyType element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(17);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_ANY_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_ANY_TYPE__DEFINITIONS));
		printCountingMap.put("definitions", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_ANY_TYPE__OCL_EXPRESSION));
		printCountingMap.put("oclExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_ANY_TYPE__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_ANY_TYPE__MAP_TYPE2));
		printCountingMap.put("mapType2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_ANY_TYPE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_ANY_TYPE__MAP_TYPE));
		printCountingMap.put("mapType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_ANY_TYPE__COLLECTION_TYPES));
		printCountingMap.put("collectionTypes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_ANY_TYPE__TUPLE_TYPE_ATTRIBUTE));
		printCountingMap.put("tupleTypeAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_ANY_TYPE__VARIABLE_DECLARATION));
		printCountingMap.put("variableDeclaration", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_ANY_TYPE__LAMBDA_RETURN_TYPE));
		printCountingMap.put("lambdaReturnType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_ANY_TYPE__LAMBDA_ARG_TYPE));
		printCountingMap.put("lambdaArgType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_ANY_TYPE__STATIC_PROPERTY_CALL));
		printCountingMap.put("staticPropertyCall", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_ANY_TYPE__NAME));
			if (o != null) {
				genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("OCLANYTYPE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_ANY_TYPE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	
	public void print_gbind_simpleocl_OclType(gbind.simpleocl.OclType element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(17);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_TYPE__DEFINITIONS));
		printCountingMap.put("definitions", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_TYPE__OCL_EXPRESSION));
		printCountingMap.put("oclExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_TYPE__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_TYPE__MAP_TYPE2));
		printCountingMap.put("mapType2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_TYPE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_TYPE__MAP_TYPE));
		printCountingMap.put("mapType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_TYPE__COLLECTION_TYPES));
		printCountingMap.put("collectionTypes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_TYPE__TUPLE_TYPE_ATTRIBUTE));
		printCountingMap.put("tupleTypeAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_TYPE__VARIABLE_DECLARATION));
		printCountingMap.put("variableDeclaration", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_TYPE__LAMBDA_RETURN_TYPE));
		printCountingMap.put("lambdaReturnType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_TYPE__LAMBDA_ARG_TYPE));
		printCountingMap.put("lambdaArgType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_TYPE__STATIC_PROPERTY_CALL));
		printCountingMap.put("staticPropertyCall", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_TYPE__NAME));
			if (o != null) {
				genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("OCLTYPE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_TYPE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	
	public void print_gbind_simpleocl_TupleType(gbind.simpleocl.TupleType element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(18);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_TYPE__DEFINITIONS));
		printCountingMap.put("definitions", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_TYPE__OCL_EXPRESSION));
		printCountingMap.put("oclExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_TYPE__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_TYPE__MAP_TYPE2));
		printCountingMap.put("mapType2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_TYPE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_TYPE__MAP_TYPE));
		printCountingMap.put("mapType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_TYPE__COLLECTION_TYPES));
		printCountingMap.put("collectionTypes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_TYPE__TUPLE_TYPE_ATTRIBUTE));
		printCountingMap.put("tupleTypeAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_TYPE__VARIABLE_DECLARATION));
		printCountingMap.put("variableDeclaration", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_TYPE__LAMBDA_RETURN_TYPE));
		printCountingMap.put("lambdaReturnType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_TYPE__LAMBDA_ARG_TYPE));
		printCountingMap.put("lambdaArgType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_TYPE__STATIC_PROPERTY_CALL));
		printCountingMap.put("staticPropertyCall", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_TYPE__ATTRIBUTES));
		printCountingMap.put("attributes", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_gbind_simpleocl_TupleType_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_gbind_simpleocl_TupleType_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_gbind_simpleocl_TupleType_0(gbind.simpleocl.TupleType element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_TYPE__NAME));
					if (o != null) {
						genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("TUPLE");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_TYPE__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("name");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_TYPE__NAME));
				if (o != null) {
					genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("TUPLETYPE");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_TYPE__NAME), element));
					out.print(" ");
				}
				printCountingMap.put("name", count - 1);
			}
		}
	}
	
	public void print_gbind_simpleocl_TupleType_1(gbind.simpleocl.TupleType element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("attributes");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_TYPE__ATTRIBUTES));
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
			printCountingMap.put("attributes", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_gbind_simpleocl_TupleType_1_0(element, localtab, out1, printCountingMap1);
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
	
	public void print_gbind_simpleocl_TupleType_1_0(gbind.simpleocl.TupleType element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("attributes");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_TYPE__ATTRIBUTES));
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
			printCountingMap.put("attributes", count - 1);
		}
	}
	
	
	public void print_gbind_simpleocl_TupleTypeAttribute(gbind.simpleocl.TupleTypeAttribute element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(7);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_TYPE_ATTRIBUTE__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_TYPE_ATTRIBUTE__TUPLE_TYPE));
		printCountingMap.put("tupleType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_TYPE_ATTRIBUTE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_gbind_simpleocl_TupleTypeAttribute_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("type");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_TYPE_ATTRIBUTE__TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("type", count - 1);
		}
	}
	
	public void print_gbind_simpleocl_TupleTypeAttribute_0(gbind.simpleocl.TupleTypeAttribute element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_TYPE_ATTRIBUTE__NAME));
					if (o != null) {
						genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_TYPE_ATTRIBUTE__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("name");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_TYPE_ATTRIBUTE__NAME));
				if (o != null) {
					genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.TUPLE_TYPE_ATTRIBUTE__NAME), element));
					out.print(" ");
				}
				printCountingMap.put("name", count - 1);
			}
		}
	}
	
	
	public void print_gbind_simpleocl_OclModelElement(gbind.simpleocl.OclModelElement element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(18);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT__DEFINITIONS));
		printCountingMap.put("definitions", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT__OCL_EXPRESSION));
		printCountingMap.put("oclExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT__MAP_TYPE2));
		printCountingMap.put("mapType2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT__MAP_TYPE));
		printCountingMap.put("mapType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT__COLLECTION_TYPES));
		printCountingMap.put("collectionTypes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT__TUPLE_TYPE_ATTRIBUTE));
		printCountingMap.put("tupleTypeAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT__VARIABLE_DECLARATION));
		printCountingMap.put("variableDeclaration", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT__LAMBDA_RETURN_TYPE));
		printCountingMap.put("lambdaReturnType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT__LAMBDA_ARG_TYPE));
		printCountingMap.put("lambdaArgType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT__STATIC_PROPERTY_CALL));
		printCountingMap.put("staticPropertyCall", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT__MODEL));
		printCountingMap.put("model", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("model");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT__MODEL));
			if (o != null) {
				genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getOclModelElementModelReferenceResolver().deResolve((gbind.simpleocl.OclModel) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT__MODEL)), element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT__MODEL), element));
				out.print(" ");
			}
			printCountingMap.put("model", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("!");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_gbind_simpleocl_OclModelElement_0(element, localtab, out, printCountingMap);
	}
	
	public void print_gbind_simpleocl_OclModelElement_0(gbind.simpleocl.OclModelElement element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT__NAME));
					if (o != null) {
						genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("name");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT__NAME));
				if (o != null) {
					genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.OCL_MODEL_ELEMENT__NAME), element));
					out.print(" ");
				}
				printCountingMap.put("name", count - 1);
			}
		}
	}
	
	
	public void print_gbind_simpleocl_MapType(gbind.simpleocl.MapType element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(19);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MAP_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MAP_TYPE__DEFINITIONS));
		printCountingMap.put("definitions", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MAP_TYPE__OCL_EXPRESSION));
		printCountingMap.put("oclExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MAP_TYPE__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MAP_TYPE__MAP_TYPE2));
		printCountingMap.put("mapType2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MAP_TYPE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MAP_TYPE__MAP_TYPE));
		printCountingMap.put("mapType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MAP_TYPE__COLLECTION_TYPES));
		printCountingMap.put("collectionTypes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MAP_TYPE__TUPLE_TYPE_ATTRIBUTE));
		printCountingMap.put("tupleTypeAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MAP_TYPE__VARIABLE_DECLARATION));
		printCountingMap.put("variableDeclaration", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MAP_TYPE__LAMBDA_RETURN_TYPE));
		printCountingMap.put("lambdaReturnType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MAP_TYPE__LAMBDA_ARG_TYPE));
		printCountingMap.put("lambdaArgType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MAP_TYPE__STATIC_PROPERTY_CALL));
		printCountingMap.put("staticPropertyCall", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MAP_TYPE__VALUE_TYPE));
		printCountingMap.put("valueType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MAP_TYPE__KEY_TYPE));
		printCountingMap.put("keyType", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MAP_TYPE__NAME));
			if (o != null) {
				genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("MAPTYPE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MAP_TYPE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("keyType");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MAP_TYPE__KEY_TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("keyType", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("valueType");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.MAP_TYPE__VALUE_TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("valueType", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_gbind_simpleocl_LambdaType(gbind.simpleocl.LambdaType element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(19);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LAMBDA_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LAMBDA_TYPE__DEFINITIONS));
		printCountingMap.put("definitions", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LAMBDA_TYPE__OCL_EXPRESSION));
		printCountingMap.put("oclExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LAMBDA_TYPE__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LAMBDA_TYPE__MAP_TYPE2));
		printCountingMap.put("mapType2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LAMBDA_TYPE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LAMBDA_TYPE__MAP_TYPE));
		printCountingMap.put("mapType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LAMBDA_TYPE__COLLECTION_TYPES));
		printCountingMap.put("collectionTypes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LAMBDA_TYPE__TUPLE_TYPE_ATTRIBUTE));
		printCountingMap.put("tupleTypeAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LAMBDA_TYPE__VARIABLE_DECLARATION));
		printCountingMap.put("variableDeclaration", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LAMBDA_TYPE__LAMBDA_RETURN_TYPE));
		printCountingMap.put("lambdaReturnType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LAMBDA_TYPE__LAMBDA_ARG_TYPE));
		printCountingMap.put("lambdaArgType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LAMBDA_TYPE__STATIC_PROPERTY_CALL));
		printCountingMap.put("staticPropertyCall", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LAMBDA_TYPE__RETURN_TYPE));
		printCountingMap.put("returnType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LAMBDA_TYPE__ARGUMENT_TYPES));
		printCountingMap.put("argumentTypes", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LAMBDA_TYPE__NAME));
			if (o != null) {
				genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("LAMBDATYPE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LAMBDA_TYPE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_gbind_simpleocl_LambdaType_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("returnType");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LAMBDA_TYPE__RETURN_TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("returnType", count - 1);
		}
	}
	
	public void print_gbind_simpleocl_LambdaType_0(gbind.simpleocl.LambdaType element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("argumentTypes");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LAMBDA_TYPE__ARGUMENT_TYPES));
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
			printCountingMap.put("argumentTypes", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_gbind_simpleocl_LambdaType_0_0(element, localtab, out1, printCountingMap1);
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
	
	public void print_gbind_simpleocl_LambdaType_0_0(gbind.simpleocl.LambdaType element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("argumentTypes");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.LAMBDA_TYPE__ARGUMENT_TYPES));
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
			printCountingMap.put("argumentTypes", count - 1);
		}
	}
	
	
	public void print_gbind_simpleocl_EnvType(gbind.simpleocl.EnvType element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(17);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ENV_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ENV_TYPE__DEFINITIONS));
		printCountingMap.put("definitions", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ENV_TYPE__OCL_EXPRESSION));
		printCountingMap.put("oclExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ENV_TYPE__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ENV_TYPE__MAP_TYPE2));
		printCountingMap.put("mapType2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ENV_TYPE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ENV_TYPE__MAP_TYPE));
		printCountingMap.put("mapType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ENV_TYPE__COLLECTION_TYPES));
		printCountingMap.put("collectionTypes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ENV_TYPE__TUPLE_TYPE_ATTRIBUTE));
		printCountingMap.put("tupleTypeAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ENV_TYPE__VARIABLE_DECLARATION));
		printCountingMap.put("variableDeclaration", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ENV_TYPE__LAMBDA_RETURN_TYPE));
		printCountingMap.put("lambdaReturnType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ENV_TYPE__LAMBDA_ARG_TYPE));
		printCountingMap.put("lambdaArgType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ENV_TYPE__STATIC_PROPERTY_CALL));
		printCountingMap.put("staticPropertyCall", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ENV_TYPE__NAME));
			if (o != null) {
				genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("ENVTYPE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.simpleocl.SimpleoclPackage.ENV_TYPE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	
	public void print_gbind_dsl_BindingModel(gbind.dsl.BindingModel element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(10);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.BINDING_MODEL__TARGET_BINDING));
		printCountingMap.put("targetBinding", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.BINDING_MODEL__BINDINGS));
		printCountingMap.put("bindings", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.BINDING_MODEL__HELPERS));
		printCountingMap.put("helpers", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.BINDING_MODEL__CONCEPT_METACLASSES));
		printCountingMap.put("conceptMetaclasses", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.BINDING_MODEL__CONCRETE_METACLASSES));
		printCountingMap.put("concreteMetaclasses", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.BINDING_MODEL__VIRTUAL_METACLASSES));
		printCountingMap.put("virtualMetaclasses", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.BINDING_MODEL__BOUND_CONCEPT));
		printCountingMap.put("boundConcept", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.BINDING_MODEL__BOUND_METAMODELS));
		printCountingMap.put("boundMetamodels", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.BINDING_MODEL__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.BINDING_MODEL__OPTIONS));
		printCountingMap.put("options", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("targetBinding");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.BINDING_MODEL__TARGET_BINDING));
			if (o != null) {
			}
			printCountingMap.put("targetBinding", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("binding");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.BINDING_MODEL__NAME));
			if (o != null) {
				genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.BINDING_MODEL__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_gbind_dsl_BindingModel_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("concept");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("boundConcept");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.BINDING_MODEL__BOUND_CONCEPT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("boundConcept", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_gbind_dsl_BindingModel_1(element, localtab, out, printCountingMap);
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_gbind_dsl_BindingModel_1(element, localtab, out1, printCountingMap1);
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
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_gbind_dsl_BindingModel_2(element, localtab, out1, printCountingMap1);
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
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("bindings");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.BINDING_MODEL__BINDINGS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("bindings", 0);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("helpers");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.BINDING_MODEL__HELPERS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("helpers", 0);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_gbind_dsl_BindingModel_0(gbind.dsl.BindingModel element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("options");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.BINDING_MODEL__OPTIONS));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("options", count - 1);
		}
	}
	
	public void print_gbind_dsl_BindingModel_1(gbind.dsl.BindingModel element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("metamodel");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("boundMetamodels");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.BINDING_MODEL__BOUND_METAMODELS));
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
			printCountingMap.put("boundMetamodels", count - 1);
		}
	}
	
	public void print_gbind_dsl_BindingModel_2(gbind.dsl.BindingModel element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("virtualMetaclasses");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.BINDING_MODEL__VIRTUAL_METACLASSES));
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
			printCountingMap.put("virtualMetaclasses", count - 1);
		}
	}
	
	
	public void print_gbind_dsl_BindingOptions(gbind.dsl.BindingOptions element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.BINDING_OPTIONS__ENABLE_CLASS_MERGE));
		printCountingMap.put("enableClassMerge", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("enableClassMerge");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.BINDING_OPTIONS__ENABLE_CLASS_MERGE));
			if (o != null) {
			}
			printCountingMap.put("enableClassMerge", count - 1);
		}
	}
	
	
	public void print_gbind_dsl_MetamodelDeclaration(gbind.dsl.MetamodelDeclaration element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(10);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.METAMODEL_DECLARATION__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.METAMODEL_DECLARATION__ELEMENTS));
		printCountingMap.put("elements", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.METAMODEL_DECLARATION__MODEL));
		printCountingMap.put("model", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.METAMODEL_DECLARATION__URI));
		printCountingMap.put("uri", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.METAMODEL_DECLARATION__METAMODEL_URI));
		printCountingMap.put("metamodelURI", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.METAMODEL_DECLARATION__RESOURCE));
		printCountingMap.put("resource", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.METAMODEL_DECLARATION__NAME));
			if (o != null) {
				genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.METAMODEL_DECLARATION__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("metamodelURI");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.METAMODEL_DECLARATION__METAMODEL_URI));
			if (o != null) {
				genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.METAMODEL_DECLARATION__METAMODEL_URI), element));
				out.print(" ");
			}
			printCountingMap.put("metamodelURI", count - 1);
		}
	}
	
	
	public void print_gbind_dsl_ClassBinding(gbind.dsl.ClassBinding element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(5);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.CLASS_BINDING__DEBUG_NAME));
		printCountingMap.put("debugName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.CLASS_BINDING__MODEL_));
		printCountingMap.put("model_", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.CLASS_BINDING__CONCEPT));
		printCountingMap.put("concept", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.CLASS_BINDING__CONCRETE));
		printCountingMap.put("concrete", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.CLASS_BINDING__WHEN_CLAUSE));
		printCountingMap.put("whenClause", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("class");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("concept");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.CLASS_BINDING__CONCEPT));
			if (o != null) {
				genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getClassBindingConceptReferenceResolver().deResolve((gbind.dsl.ConceptMetaclass) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.CLASS_BINDING__CONCEPT)), element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.CLASS_BINDING__CONCEPT), element));
				out.print(" ");
			}
			printCountingMap.put("concept", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("to");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("concrete");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.CLASS_BINDING__CONCRETE));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getClassBindingConcreteReferenceResolver().deResolve((gbind.dsl.ConcreteMetaclass) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.CLASS_BINDING__CONCRETE)), element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.CLASS_BINDING__CONCRETE), element));
				out.print(" ");
			}
			printCountingMap.put("concrete", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_gbind_dsl_ClassBinding_0(element, localtab, out1, printCountingMap1);
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
		print_gbind_dsl_ClassBinding_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_gbind_dsl_ClassBinding_0(gbind.dsl.ClassBinding element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("concrete");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.CLASS_BINDING__CONCRETE));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getClassBindingConcreteReferenceResolver().deResolve((gbind.dsl.ConcreteMetaclass) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.CLASS_BINDING__CONCRETE)), element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.CLASS_BINDING__CONCRETE), element));
				out.print(" ");
			}
			printCountingMap.put("concrete", count - 1);
		}
	}
	
	public void print_gbind_dsl_ClassBinding_1(gbind.dsl.ClassBinding element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("when");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("whenClause");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.CLASS_BINDING__WHEN_CLAUSE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("whenClause", count - 1);
		}
	}
	
	
	public void print_gbind_dsl_IntermediateClassBinding(gbind.dsl.IntermediateClassBinding element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(8);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.INTERMEDIATE_CLASS_BINDING__DEBUG_NAME));
		printCountingMap.put("debugName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.INTERMEDIATE_CLASS_BINDING__MODEL_));
		printCountingMap.put("model_", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.INTERMEDIATE_CLASS_BINDING__CONCEPT));
		printCountingMap.put("concept", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.INTERMEDIATE_CLASS_BINDING__CONCRETE_CLASS));
		printCountingMap.put("concreteClass", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.INTERMEDIATE_CLASS_BINDING__CONCRETE_REFERENCE));
		printCountingMap.put("concreteReference", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.INTERMEDIATE_CLASS_BINDING__CONCEPT_CONTEXT));
		printCountingMap.put("conceptContext", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.INTERMEDIATE_CLASS_BINDING__CONCEPT_REFERENCE_NAME));
		printCountingMap.put("conceptReferenceName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.INTERMEDIATE_CLASS_BINDING__FEATURE_BINDINGS));
		printCountingMap.put("featureBindings", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("class");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("concept");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.INTERMEDIATE_CLASS_BINDING__CONCEPT));
			if (o != null) {
				genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getIntermediateClassBindingConceptReferenceResolver().deResolve((gbind.dsl.ConceptMetaclass) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.INTERMEDIATE_CLASS_BINDING__CONCEPT)), element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.INTERMEDIATE_CLASS_BINDING__CONCEPT), element));
				out.print(" ");
			}
			printCountingMap.put("concept", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("to");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("concreteClass");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.INTERMEDIATE_CLASS_BINDING__CONCRETE_CLASS));
			if (o != null) {
				genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getIntermediateClassBindingConcreteClassReferenceResolver().deResolve((gbind.dsl.ConcreteMetaclass) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.INTERMEDIATE_CLASS_BINDING__CONCRETE_CLASS)), element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.INTERMEDIATE_CLASS_BINDING__CONCRETE_CLASS), element));
				out.print(" ");
			}
			printCountingMap.put("concreteClass", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("concreteReference");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.INTERMEDIATE_CLASS_BINDING__CONCRETE_REFERENCE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("concreteReference", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("/");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("conceptContext");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.INTERMEDIATE_CLASS_BINDING__CONCEPT_CONTEXT));
			if (o != null) {
				genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getIntermediateClassBindingConceptContextReferenceResolver().deResolve((gbind.dsl.ConceptMetaclass) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.INTERMEDIATE_CLASS_BINDING__CONCEPT_CONTEXT)), element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.INTERMEDIATE_CLASS_BINDING__CONCEPT_CONTEXT), element));
				out.print(" ");
			}
			printCountingMap.put("conceptContext", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_gbind_dsl_IntermediateClassBinding_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("featureBindings");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.INTERMEDIATE_CLASS_BINDING__FEATURE_BINDINGS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("featureBindings", 0);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_gbind_dsl_IntermediateClassBinding_0(gbind.dsl.IntermediateClassBinding element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"conceptReferenceName"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"conceptReferenceName"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("conceptReferenceName");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.INTERMEDIATE_CLASS_BINDING__CONCEPT_REFERENCE_NAME));
					if (o != null) {
						genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.INTERMEDIATE_CLASS_BINDING__CONCEPT_REFERENCE_NAME), element));
						out.print(" ");
					}
					printCountingMap.put("conceptReferenceName", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("conceptReferenceName");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.INTERMEDIATE_CLASS_BINDING__CONCEPT_REFERENCE_NAME));
				if (o != null) {
					genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.INTERMEDIATE_CLASS_BINDING__CONCEPT_REFERENCE_NAME), element));
					out.print(" ");
				}
				printCountingMap.put("conceptReferenceName", count - 1);
			}
		}
	}
	
	
	public void print_gbind_dsl_ConcreteReferencDeclaringVar(gbind.dsl.ConcreteReferencDeclaringVar element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(7);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.CONCRETE_REFERENC_DECLARING_VAR__VAR_NAME));
		printCountingMap.put("varName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.CONCRETE_REFERENC_DECLARING_VAR__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.CONCRETE_REFERENC_DECLARING_VAR__VARIABLE_EXP));
		printCountingMap.put("variableExp", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_gbind_dsl_ConcreteReferencDeclaringVar_0(element, localtab, out, printCountingMap);
	}
	
	public void print_gbind_dsl_ConcreteReferencDeclaringVar_0(gbind.dsl.ConcreteReferencDeclaringVar element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"varName"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"varName"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("varName");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.CONCRETE_REFERENC_DECLARING_VAR__VAR_NAME));
					if (o != null) {
						genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.CONCRETE_REFERENC_DECLARING_VAR__VAR_NAME), element));
						out.print(" ");
					}
					printCountingMap.put("varName", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("varName");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.CONCRETE_REFERENC_DECLARING_VAR__VAR_NAME));
				if (o != null) {
					genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.CONCRETE_REFERENC_DECLARING_VAR__VAR_NAME), element));
					out.print(" ");
				}
				printCountingMap.put("varName", count - 1);
			}
		}
	}
	
	
	public void print_gbind_dsl_VirtualMetaclass(gbind.dsl.VirtualMetaclass element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(5);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.VIRTUAL_METACLASS__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.VIRTUAL_METACLASS__ECLASS));
		printCountingMap.put("eclass", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.VIRTUAL_METACLASS__REFERENCES));
		printCountingMap.put("references", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.VIRTUAL_METACLASS__ATTRIBUTES));
		printCountingMap.put("attributes", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.VIRTUAL_METACLASS__INIT));
		printCountingMap.put("init", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("class");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.VIRTUAL_METACLASS__NAME));
			if (o != null) {
				genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.VIRTUAL_METACLASS__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_gbind_dsl_VirtualMetaclass_0(element, localtab, out1, printCountingMap1);
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
		out.print("}");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("init");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("init");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.VIRTUAL_METACLASS__INIT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("init", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
	}
	
	public void print_gbind_dsl_VirtualMetaclass_0(gbind.dsl.VirtualMetaclass element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"references"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"attributes"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (Containment)
				count = printCountingMap.get("attributes");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.VIRTUAL_METACLASS__ATTRIBUTES));
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
					printCountingMap.put("attributes", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (Containment)
			count = printCountingMap.get("references");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.VIRTUAL_METACLASS__REFERENCES));
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
				printCountingMap.put("references", count - 1);
			}
		}
	}
	
	
	public void print_gbind_dsl_VirtualTupleExp(gbind.dsl.VirtualTupleExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(19);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.VIRTUAL_TUPLE_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.VIRTUAL_TUPLE_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.VIRTUAL_TUPLE_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.VIRTUAL_TUPLE_EXP__COLLECTION));
		printCountingMap.put("collection", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.VIRTUAL_TUPLE_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.VIRTUAL_TUPLE_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.VIRTUAL_TUPLE_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.VIRTUAL_TUPLE_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.VIRTUAL_TUPLE_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.VIRTUAL_TUPLE_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.VIRTUAL_TUPLE_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.VIRTUAL_TUPLE_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.VIRTUAL_TUPLE_EXP__APPLIED_OPERATOR));
		printCountingMap.put("appliedOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.VIRTUAL_TUPLE_EXP__TUPLE_PART));
		printCountingMap.put("tuplePart", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.VIRTUAL_TUPLE_EXP__TYPE_NAME));
		printCountingMap.put("typeName", temp == null ? 0 : 1);
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("#");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_gbind_dsl_VirtualTupleExp_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_gbind_dsl_VirtualTupleExp_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_gbind_dsl_VirtualTupleExp_0(gbind.dsl.VirtualTupleExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"typeName"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"typeName"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("typeName");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.VIRTUAL_TUPLE_EXP__TYPE_NAME));
					if (o != null) {
						genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.VIRTUAL_TUPLE_EXP__TYPE_NAME), element));
						out.print(" ");
					}
					printCountingMap.put("typeName", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("typeName");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.VIRTUAL_TUPLE_EXP__TYPE_NAME));
				if (o != null) {
					genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.VIRTUAL_TUPLE_EXP__TYPE_NAME), element));
					out.print(" ");
				}
				printCountingMap.put("typeName", count - 1);
			}
		}
	}
	
	public void print_gbind_dsl_VirtualTupleExp_1(gbind.dsl.VirtualTupleExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("tuplePart");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.VIRTUAL_TUPLE_EXP__TUPLE_PART));
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
			printCountingMap.put("tuplePart", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_gbind_dsl_VirtualTupleExp_1_0(element, localtab, out1, printCountingMap1);
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
	
	public void print_gbind_dsl_VirtualTupleExp_1_0(gbind.dsl.VirtualTupleExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("tuplePart");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.VIRTUAL_TUPLE_EXP__TUPLE_PART));
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
			printCountingMap.put("tuplePart", count - 1);
		}
	}
	
	
	public void print_gbind_dsl_VirtualReference(gbind.dsl.VirtualReference element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.VIRTUAL_REFERENCE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.VIRTUAL_REFERENCE__TYPE_));
		printCountingMap.put("type_", temp == null ? 0 : 1);
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("ref");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_gbind_dsl_VirtualReference_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_gbind_dsl_VirtualReference_1(element, localtab, out, printCountingMap);
	}
	
	public void print_gbind_dsl_VirtualReference_0(gbind.dsl.VirtualReference element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.VIRTUAL_REFERENCE__NAME));
					if (o != null) {
						genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.VIRTUAL_REFERENCE__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("name");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.VIRTUAL_REFERENCE__NAME));
				if (o != null) {
					genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.VIRTUAL_REFERENCE__NAME), element));
					out.print(" ");
				}
				printCountingMap.put("name", count - 1);
			}
		}
	}
	
	public void print_gbind_dsl_VirtualReference_1(gbind.dsl.VirtualReference element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"type_"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"type_"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("type_");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.VIRTUAL_REFERENCE__TYPE_));
					if (o != null) {
						genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getVirtualReferenceType_ReferenceResolver().deResolve((gbind.dsl.ConcreteMetaclass) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.VIRTUAL_REFERENCE__TYPE_)), element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.VIRTUAL_REFERENCE__TYPE_), element));
						out.print(" ");
					}
					printCountingMap.put("type_", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("type_");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.VIRTUAL_REFERENCE__TYPE_));
				if (o != null) {
					genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getVirtualReferenceType_ReferenceResolver().deResolve((gbind.dsl.ConcreteMetaclass) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.VIRTUAL_REFERENCE__TYPE_)), element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.VIRTUAL_REFERENCE__TYPE_), element));
					out.print(" ");
				}
				printCountingMap.put("type_", count - 1);
			}
		}
	}
	
	
	public void print_gbind_dsl_VirtualAttribute(gbind.dsl.VirtualAttribute element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.VIRTUAL_ATTRIBUTE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.VIRTUAL_ATTRIBUTE__TYPE_));
		printCountingMap.put("type_", temp == null ? 0 : 1);
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("att");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_gbind_dsl_VirtualAttribute_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_gbind_dsl_VirtualAttribute_1(element, localtab, out, printCountingMap);
	}
	
	public void print_gbind_dsl_VirtualAttribute_0(gbind.dsl.VirtualAttribute element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.VIRTUAL_ATTRIBUTE__NAME));
					if (o != null) {
						genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.VIRTUAL_ATTRIBUTE__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("name");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.VIRTUAL_ATTRIBUTE__NAME));
				if (o != null) {
					genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.VIRTUAL_ATTRIBUTE__NAME), element));
					out.print(" ");
				}
				printCountingMap.put("name", count - 1);
			}
		}
	}
	
	public void print_gbind_dsl_VirtualAttribute_1(gbind.dsl.VirtualAttribute element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("type_");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.VIRTUAL_ATTRIBUTE__TYPE_));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("type_", count - 1);
		}
	}
	
	
	public void print_gbind_dsl_VirtualClassBinding(gbind.dsl.VirtualClassBinding element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(5);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.VIRTUAL_CLASS_BINDING__DEBUG_NAME));
		printCountingMap.put("debugName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.VIRTUAL_CLASS_BINDING__MODEL_));
		printCountingMap.put("model_", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.VIRTUAL_CLASS_BINDING__CONCEPT));
		printCountingMap.put("concept", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.VIRTUAL_CLASS_BINDING__VIRTUAL));
		printCountingMap.put("virtual", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.VIRTUAL_CLASS_BINDING__REF_FEATURES));
		printCountingMap.put("refFeatures", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("class");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("concept");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.VIRTUAL_CLASS_BINDING__CONCEPT));
			if (o != null) {
				genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getVirtualClassBindingConceptReferenceResolver().deResolve((gbind.dsl.ConceptMetaclass) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.VIRTUAL_CLASS_BINDING__CONCEPT)), element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.VIRTUAL_CLASS_BINDING__CONCEPT), element));
				out.print(" ");
			}
			printCountingMap.put("concept", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("to");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("virtual");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("virtual");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.VIRTUAL_CLASS_BINDING__VIRTUAL));
			if (o != null) {
				genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getVirtualClassBindingVirtualReferenceResolver().deResolve((gbind.dsl.VirtualMetaclass) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.VIRTUAL_CLASS_BINDING__VIRTUAL)), element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.VIRTUAL_CLASS_BINDING__VIRTUAL), element));
				out.print(" ");
			}
			printCountingMap.put("virtual", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_gbind_dsl_VirtualClassBinding_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_gbind_dsl_VirtualClassBinding_0(gbind.dsl.VirtualClassBinding element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("in");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("refFeatures");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.VIRTUAL_CLASS_BINDING__REF_FEATURES));
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
			printCountingMap.put("refFeatures", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_gbind_dsl_VirtualClassBinding_0_0(element, localtab, out1, printCountingMap1);
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
	
	public void print_gbind_dsl_VirtualClassBinding_0_0(gbind.dsl.VirtualClassBinding element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("refFeatures");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.VIRTUAL_CLASS_BINDING__REF_FEATURES));
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
			printCountingMap.put("refFeatures", count - 1);
		}
	}
	
	
	public void print_gbind_dsl_ConceptFeatureRef(gbind.dsl.ConceptFeatureRef element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.CONCEPT_FEATURE_REF__CONCEPT_CLASS));
		printCountingMap.put("conceptClass", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.CONCEPT_FEATURE_REF__FEATURE_NAME));
		printCountingMap.put("featureName", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("conceptClass");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.CONCEPT_FEATURE_REF__CONCEPT_CLASS));
			if (o != null) {
				genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getConceptFeatureRefConceptClassReferenceResolver().deResolve((gbind.dsl.ConceptMetaclass) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.CONCEPT_FEATURE_REF__CONCEPT_CLASS)), element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.CONCEPT_FEATURE_REF__CONCEPT_CLASS), element));
				out.print(" ");
			}
			printCountingMap.put("conceptClass", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_gbind_dsl_ConceptFeatureRef_0(element, localtab, out, printCountingMap);
	}
	
	public void print_gbind_dsl_ConceptFeatureRef_0(gbind.dsl.ConceptFeatureRef element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"featureName"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"featureName"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("featureName");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.CONCEPT_FEATURE_REF__FEATURE_NAME));
					if (o != null) {
						genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.CONCEPT_FEATURE_REF__FEATURE_NAME), element));
						out.print(" ");
					}
					printCountingMap.put("featureName", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("featureName");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.CONCEPT_FEATURE_REF__FEATURE_NAME));
				if (o != null) {
					genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.CONCEPT_FEATURE_REF__FEATURE_NAME), element));
					out.print(" ");
				}
				printCountingMap.put("featureName", count - 1);
			}
		}
	}
	
	
	public void print_gbind_dsl_OclFeatureBinding(gbind.dsl.OclFeatureBinding element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(6);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.OCL_FEATURE_BINDING__DEBUG_NAME));
		printCountingMap.put("debugName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.OCL_FEATURE_BINDING__MODEL_));
		printCountingMap.put("model_", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.OCL_FEATURE_BINDING__CONCEPT_FEATURE));
		printCountingMap.put("conceptFeature", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.OCL_FEATURE_BINDING__CONCEPT_CLASS));
		printCountingMap.put("conceptClass", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.OCL_FEATURE_BINDING__QUALIFIER));
		printCountingMap.put("qualifier", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.OCL_FEATURE_BINDING__CONCRETE));
		printCountingMap.put("concrete", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("feature");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("conceptClass");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.OCL_FEATURE_BINDING__CONCEPT_CLASS));
			if (o != null) {
				genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getBaseFeatureBindingConceptClassReferenceResolver().deResolve((gbind.dsl.ConceptMetaclass) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.OCL_FEATURE_BINDING__CONCEPT_CLASS)), element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.OCL_FEATURE_BINDING__CONCEPT_CLASS), element));
				out.print(" ");
			}
			printCountingMap.put("conceptClass", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_gbind_dsl_OclFeatureBinding_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_gbind_dsl_OclFeatureBinding_1(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("concrete");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.OCL_FEATURE_BINDING__CONCRETE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("concrete", count - 1);
		}
	}
	
	public void print_gbind_dsl_OclFeatureBinding_0(gbind.dsl.OclFeatureBinding element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("qualifier");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.OCL_FEATURE_BINDING__QUALIFIER));
			if (o != null) {
				genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_91_93");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getBaseFeatureBindingQualifierReferenceResolver().deResolve((gbind.dsl.ConcreteMetaclass) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.OCL_FEATURE_BINDING__QUALIFIER)), element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.OCL_FEATURE_BINDING__QUALIFIER), element));
				out.print(" ");
			}
			printCountingMap.put("qualifier", count - 1);
		}
	}
	
	public void print_gbind_dsl_OclFeatureBinding_1(gbind.dsl.OclFeatureBinding element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"conceptFeature"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"conceptFeature"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("conceptFeature");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.OCL_FEATURE_BINDING__CONCEPT_FEATURE));
					if (o != null) {
						genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.OCL_FEATURE_BINDING__CONCEPT_FEATURE), element));
						out.print(" ");
					}
					printCountingMap.put("conceptFeature", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("conceptFeature");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.OCL_FEATURE_BINDING__CONCEPT_FEATURE));
				if (o != null) {
					genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.OCL_FEATURE_BINDING__CONCEPT_FEATURE), element));
					out.print(" ");
				}
				printCountingMap.put("conceptFeature", count - 1);
			}
		}
	}
	
	
	public void print_gbind_dsl_RenamingFeatureBinding(gbind.dsl.RenamingFeatureBinding element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(6);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.RENAMING_FEATURE_BINDING__DEBUG_NAME));
		printCountingMap.put("debugName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.RENAMING_FEATURE_BINDING__MODEL_));
		printCountingMap.put("model_", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.RENAMING_FEATURE_BINDING__CONCEPT_FEATURE));
		printCountingMap.put("conceptFeature", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.RENAMING_FEATURE_BINDING__CONCEPT_CLASS));
		printCountingMap.put("conceptClass", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.RENAMING_FEATURE_BINDING__QUALIFIER));
		printCountingMap.put("qualifier", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.RENAMING_FEATURE_BINDING__CONCRETE_FEATURE));
		printCountingMap.put("concreteFeature", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("feature");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("conceptClass");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.RENAMING_FEATURE_BINDING__CONCEPT_CLASS));
			if (o != null) {
				genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getBaseFeatureBindingConceptClassReferenceResolver().deResolve((gbind.dsl.ConceptMetaclass) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.RENAMING_FEATURE_BINDING__CONCEPT_CLASS)), element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.RENAMING_FEATURE_BINDING__CONCEPT_CLASS), element));
				out.print(" ");
			}
			printCountingMap.put("conceptClass", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_gbind_dsl_RenamingFeatureBinding_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_gbind_dsl_RenamingFeatureBinding_1(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("is");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_gbind_dsl_RenamingFeatureBinding_2(element, localtab, out, printCountingMap);
	}
	
	public void print_gbind_dsl_RenamingFeatureBinding_0(gbind.dsl.RenamingFeatureBinding element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("qualifier");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.RENAMING_FEATURE_BINDING__QUALIFIER));
			if (o != null) {
				genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_91_93");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getBaseFeatureBindingQualifierReferenceResolver().deResolve((gbind.dsl.ConcreteMetaclass) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.RENAMING_FEATURE_BINDING__QUALIFIER)), element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.RENAMING_FEATURE_BINDING__QUALIFIER), element));
				out.print(" ");
			}
			printCountingMap.put("qualifier", count - 1);
		}
	}
	
	public void print_gbind_dsl_RenamingFeatureBinding_1(gbind.dsl.RenamingFeatureBinding element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"conceptFeature"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"conceptFeature"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("conceptFeature");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.RENAMING_FEATURE_BINDING__CONCEPT_FEATURE));
					if (o != null) {
						genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.RENAMING_FEATURE_BINDING__CONCEPT_FEATURE), element));
						out.print(" ");
					}
					printCountingMap.put("conceptFeature", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("conceptFeature");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.RENAMING_FEATURE_BINDING__CONCEPT_FEATURE));
				if (o != null) {
					genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.RENAMING_FEATURE_BINDING__CONCEPT_FEATURE), element));
					out.print(" ");
				}
				printCountingMap.put("conceptFeature", count - 1);
			}
		}
	}
	
	public void print_gbind_dsl_RenamingFeatureBinding_2(gbind.dsl.RenamingFeatureBinding element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"concreteFeature"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"concreteFeature"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("concreteFeature");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.RENAMING_FEATURE_BINDING__CONCRETE_FEATURE));
					if (o != null) {
						genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.RENAMING_FEATURE_BINDING__CONCRETE_FEATURE), element));
						out.print(" ");
					}
					printCountingMap.put("concreteFeature", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("concreteFeature");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.RENAMING_FEATURE_BINDING__CONCRETE_FEATURE));
				if (o != null) {
					genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.RENAMING_FEATURE_BINDING__CONCRETE_FEATURE), element));
					out.print(" ");
				}
				printCountingMap.put("concreteFeature", count - 1);
			}
		}
	}
	
	
	public void print_gbind_dsl_ConceptHelper(gbind.dsl.ConceptHelper element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(6);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.CONCEPT_HELPER__FEATURE));
		printCountingMap.put("feature", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.CONCEPT_HELPER__BODY));
		printCountingMap.put("body", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.CONCEPT_HELPER__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.CONCEPT_HELPER__MODEL_));
		printCountingMap.put("model_", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.CONCEPT_HELPER__QUALIFIER));
		printCountingMap.put("qualifier", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.CONCEPT_HELPER__CONTEXT_CLASS));
		printCountingMap.put("contextClass", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("operation");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("contextClass");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.CONCEPT_HELPER__CONTEXT_CLASS));
			if (o != null) {
				genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getConceptHelperContextClassReferenceResolver().deResolve((gbind.dsl.ConceptMetaclass) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.CONCEPT_HELPER__CONTEXT_CLASS)), element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.CONCEPT_HELPER__CONTEXT_CLASS), element));
				out.print(" ");
			}
			printCountingMap.put("contextClass", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_gbind_dsl_ConceptHelper_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("feature");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.CONCEPT_HELPER__FEATURE));
			if (o != null) {
				genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.CONCEPT_HELPER__FEATURE), element));
				out.print(" ");
			}
			printCountingMap.put("feature", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("type");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.CONCEPT_HELPER__TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("type", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("body");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.CONCEPT_HELPER__BODY));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("body", count - 1);
		}
	}
	
	public void print_gbind_dsl_ConceptHelper_0(gbind.dsl.ConceptHelper element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("qualifier");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.CONCEPT_HELPER__QUALIFIER));
			if (o != null) {
				genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_91_93");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getConceptHelperQualifierReferenceResolver().deResolve((gbind.dsl.ConcreteMetaclass) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.CONCEPT_HELPER__QUALIFIER)), element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.CONCEPT_HELPER__QUALIFIER), element));
				out.print(" ");
			}
			printCountingMap.put("qualifier", count - 1);
		}
	}
	
	
	public void print_gbind_dsl_LocalHelper(gbind.dsl.LocalHelper element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(6);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.LOCAL_HELPER__FEATURE));
		printCountingMap.put("feature", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.LOCAL_HELPER__BODY));
		printCountingMap.put("body", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.LOCAL_HELPER__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.LOCAL_HELPER__MODEL_));
		printCountingMap.put("model_", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.LOCAL_HELPER__CONTEXT));
		printCountingMap.put("context", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.LOCAL_HELPER__PARAMETERS));
		printCountingMap.put("parameters", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("helper");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_gbind_dsl_LocalHelper_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_gbind_dsl_LocalHelper_1(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_gbind_dsl_LocalHelper_2(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("type");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.LOCAL_HELPER__TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("type", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("body");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.LOCAL_HELPER__BODY));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("body", count - 1);
		}
	}
	
	public void print_gbind_dsl_LocalHelper_0(gbind.dsl.LocalHelper element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"context"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"context"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("context");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.LOCAL_HELPER__CONTEXT));
					if (o != null) {
						genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getLocalHelperContextReferenceResolver().deResolve((gbind.dsl.ConcreteMetaclass) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.LOCAL_HELPER__CONTEXT)), element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.LOCAL_HELPER__CONTEXT), element));
						out.print(" ");
					}
					printCountingMap.put("context", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("context");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.LOCAL_HELPER__CONTEXT));
				if (o != null) {
					genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getLocalHelperContextReferenceResolver().deResolve((gbind.dsl.ConcreteMetaclass) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.LOCAL_HELPER__CONTEXT)), element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.LOCAL_HELPER__CONTEXT), element));
					out.print(" ");
				}
				printCountingMap.put("context", count - 1);
			}
		}
	}
	
	public void print_gbind_dsl_LocalHelper_1(gbind.dsl.LocalHelper element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"feature"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"feature"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("feature");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.LOCAL_HELPER__FEATURE));
					if (o != null) {
						genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.LOCAL_HELPER__FEATURE), element));
						out.print(" ");
					}
					printCountingMap.put("feature", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("feature");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.LOCAL_HELPER__FEATURE));
				if (o != null) {
					genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.LOCAL_HELPER__FEATURE), element));
					out.print(" ");
				}
				printCountingMap.put("feature", count - 1);
			}
		}
	}
	
	public void print_gbind_dsl_LocalHelper_2(gbind.dsl.LocalHelper element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_gbind_dsl_LocalHelper_2_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_gbind_dsl_LocalHelper_2_0(gbind.dsl.LocalHelper element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("parameters");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.LOCAL_HELPER__PARAMETERS));
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
			print_gbind_dsl_LocalHelper_2_0_0(element, localtab, out1, printCountingMap1);
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
	
	public void print_gbind_dsl_LocalHelper_2_0_0(gbind.dsl.LocalHelper element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("parameters");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.LOCAL_HELPER__PARAMETERS));
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
	
	
	public void print_gbind_dsl_HelperParameter(gbind.dsl.HelperParameter element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(7);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.HELPER_PARAMETER__VAR_NAME));
		printCountingMap.put("varName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.HELPER_PARAMETER__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.HELPER_PARAMETER__VARIABLE_EXP));
		printCountingMap.put("variableExp", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("varName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.HELPER_PARAMETER__VAR_NAME));
			if (o != null) {
				genericity.language.gbind.IGbindTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.HELPER_PARAMETER__VAR_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("varName", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("type");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(gbind.dsl.DslPackage.HELPER_PARAMETER__TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("type", count - 1);
		}
	}
	
	
}
