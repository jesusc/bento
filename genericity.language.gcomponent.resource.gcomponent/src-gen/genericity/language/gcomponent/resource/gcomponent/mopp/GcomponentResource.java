/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gcomponent.resource.gcomponent.mopp;

public class GcomponentResource extends org.eclipse.emf.ecore.resource.impl.ResourceImpl implements genericity.language.gcomponent.resource.gcomponent.IGcomponentTextResource {
	
	public class ElementBasedTextDiagnostic implements genericity.language.gcomponent.resource.gcomponent.IGcomponentTextDiagnostic {
		
		private final genericity.language.gcomponent.resource.gcomponent.IGcomponentLocationMap locationMap;
		private final org.eclipse.emf.common.util.URI uri;
		private final org.eclipse.emf.ecore.EObject element;
		private final genericity.language.gcomponent.resource.gcomponent.IGcomponentProblem problem;
		
		public ElementBasedTextDiagnostic(genericity.language.gcomponent.resource.gcomponent.IGcomponentLocationMap locationMap, org.eclipse.emf.common.util.URI uri, genericity.language.gcomponent.resource.gcomponent.IGcomponentProblem problem, org.eclipse.emf.ecore.EObject element) {
			super();
			this.uri = uri;
			this.locationMap = locationMap;
			this.element = element;
			this.problem = problem;
		}
		
		public String getMessage() {
			return problem.getMessage();
		}
		
		public genericity.language.gcomponent.resource.gcomponent.IGcomponentProblem getProblem() {
			return problem;
		}
		
		public String getLocation() {
			return uri.toString();
		}
		
		public int getCharStart() {
			return Math.max(0, locationMap.getCharStart(element));
		}
		
		public int getCharEnd() {
			return Math.max(0, locationMap.getCharEnd(element));
		}
		
		public int getColumn() {
			return Math.max(0, locationMap.getColumn(element));
		}
		
		public int getLine() {
			return Math.max(0, locationMap.getLine(element));
		}
		
		public org.eclipse.emf.ecore.EObject getElement() {
			return element;
		}
		
		public boolean wasCausedBy(org.eclipse.emf.ecore.EObject element) {
			if (this.element == null) {
				return false;
			}
			return this.element.equals(element);
		}
		
		public String toString() {
			return getMessage() + " at " + getLocation() + " line " + getLine() + ", column " + getColumn();
		}
	}
	
	public class PositionBasedTextDiagnostic implements genericity.language.gcomponent.resource.gcomponent.IGcomponentTextDiagnostic {
		
		private final org.eclipse.emf.common.util.URI uri;
		
		private int column;
		private int line;
		private int charStart;
		private int charEnd;
		private genericity.language.gcomponent.resource.gcomponent.IGcomponentProblem problem;
		
		public PositionBasedTextDiagnostic(org.eclipse.emf.common.util.URI uri, genericity.language.gcomponent.resource.gcomponent.IGcomponentProblem problem, int column, int line, int charStart, int charEnd) {
			
			super();
			this.uri = uri;
			this.column = column;
			this.line = line;
			this.charStart = charStart;
			this.charEnd = charEnd;
			this.problem = problem;
		}
		
		public genericity.language.gcomponent.resource.gcomponent.IGcomponentProblem getProblem() {
			return problem;
		}
		
		public int getCharStart() {
			return charStart;
		}
		
		public int getCharEnd() {
			return charEnd;
		}
		
		public int getColumn() {
			return column;
		}
		
		public int getLine() {
			return line;
		}
		
		public String getLocation() {
			return uri.toString();
		}
		
		public String getMessage() {
			return problem.getMessage();
		}
		
		public boolean wasCausedBy(org.eclipse.emf.ecore.EObject element) {
			return false;
		}
		
		public String toString() {
			return getMessage() + " at " + getLocation() + " line " + getLine() + ", column " + getColumn();
		}
	}
	
	private genericity.language.gcomponent.resource.gcomponent.IGcomponentReferenceResolverSwitch resolverSwitch;
	private genericity.language.gcomponent.resource.gcomponent.IGcomponentLocationMap locationMap;
	private int proxyCounter = 0;
	private genericity.language.gcomponent.resource.gcomponent.IGcomponentTextParser parser;
	private java.util.Map<String, genericity.language.gcomponent.resource.gcomponent.IGcomponentContextDependentURIFragment<? extends org.eclipse.emf.ecore.EObject>> internalURIFragmentMap = new java.util.LinkedHashMap<String, genericity.language.gcomponent.resource.gcomponent.IGcomponentContextDependentURIFragment<? extends org.eclipse.emf.ecore.EObject>>();
	private java.util.Map<String, genericity.language.gcomponent.resource.gcomponent.IGcomponentQuickFix> quickFixMap = new java.util.LinkedHashMap<String, genericity.language.gcomponent.resource.gcomponent.IGcomponentQuickFix>();
	private java.util.Map<?, ?> loadOptions;
	
	/**
	 * If a post-processor is currently running, this field holds a reference to it.
	 * This reference is used to terminate post-processing if needed.
	 */
	private genericity.language.gcomponent.resource.gcomponent.IGcomponentResourcePostProcessor runningPostProcessor;
	
	/**
	 * A flag to indicate whether reloading of the resource shall be cancelled.
	 */
	private boolean terminateReload = false;
	
	public GcomponentResource() {
		super();
		resetLocationMap();
	}
	
	public GcomponentResource(org.eclipse.emf.common.util.URI uri) {
		super(uri);
		resetLocationMap();
	}
	
	protected void doLoad(java.io.InputStream inputStream, java.util.Map<?,?> options) throws java.io.IOException {
		this.loadOptions = options;
		this.terminateReload = false;
		String encoding = null;
		java.io.InputStream actualInputStream = inputStream;
		Object inputStreamPreProcessorProvider = null;
		if (options != null) {
			inputStreamPreProcessorProvider = options.get(genericity.language.gcomponent.resource.gcomponent.IGcomponentOptions.INPUT_STREAM_PREPROCESSOR_PROVIDER);
		}
		if (inputStreamPreProcessorProvider != null) {
			if (inputStreamPreProcessorProvider instanceof genericity.language.gcomponent.resource.gcomponent.IGcomponentInputStreamProcessorProvider) {
				genericity.language.gcomponent.resource.gcomponent.IGcomponentInputStreamProcessorProvider provider = (genericity.language.gcomponent.resource.gcomponent.IGcomponentInputStreamProcessorProvider) inputStreamPreProcessorProvider;
				genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentInputStreamProcessor processor = provider.getInputStreamProcessor(inputStream);
				actualInputStream = processor;
				encoding = processor.getOutputEncoding();
			}
		}
		
		parser = getMetaInformation().createParser(actualInputStream, encoding);
		parser.setOptions(options);
		genericity.language.gcomponent.resource.gcomponent.IGcomponentReferenceResolverSwitch referenceResolverSwitch = getReferenceResolverSwitch();
		referenceResolverSwitch.setOptions(options);
		genericity.language.gcomponent.resource.gcomponent.IGcomponentParseResult result = parser.parse();
		clearState();
		getContentsInternal().clear();
		org.eclipse.emf.ecore.EObject root = null;
		if (result != null) {
			root = result.getRoot();
			if (root != null) {
				getContentsInternal().add(root);
			}
			java.util.Collection<genericity.language.gcomponent.resource.gcomponent.IGcomponentCommand<genericity.language.gcomponent.resource.gcomponent.IGcomponentTextResource>> commands = result.getPostParseCommands();
			if (commands != null) {
				for (genericity.language.gcomponent.resource.gcomponent.IGcomponentCommand<genericity.language.gcomponent.resource.gcomponent.IGcomponentTextResource>  command : commands) {
					command.execute(this);
				}
			}
		}
		getReferenceResolverSwitch().setOptions(options);
		if (getErrors().isEmpty()) {
			runPostProcessors(options);
			if (root != null) {
				runValidators(root);
			}
		}
	}
	
	public void reload(java.io.InputStream inputStream, java.util.Map<?,?> options) throws java.io.IOException {
		try {
			isLoaded = false;
			java.util.Map<Object, Object> loadOptions = addDefaultLoadOptions(options);
			doLoad(inputStream, loadOptions);
			org.eclipse.emf.ecore.util.EcoreUtil.resolveAll(this.getResourceSet());
		} catch (genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentTerminateParsingException tpe) {
			// do nothing - the resource is left unchanged if this exception is thrown
		}
		isLoaded = true;
	}
	
	public void cancelReload() {
		genericity.language.gcomponent.resource.gcomponent.IGcomponentTextParser parserCopy = parser;
		parserCopy.terminate();
		this.terminateReload = true;
		genericity.language.gcomponent.resource.gcomponent.IGcomponentResourcePostProcessor runningPostProcessorCopy = runningPostProcessor;
		if (runningPostProcessorCopy != null) {
			runningPostProcessorCopy.terminate();
		}
	}
	
	protected void doSave(java.io.OutputStream outputStream, java.util.Map<?,?> options) throws java.io.IOException {
		genericity.language.gcomponent.resource.gcomponent.IGcomponentTextPrinter printer = getMetaInformation().createPrinter(outputStream, this);
		genericity.language.gcomponent.resource.gcomponent.IGcomponentReferenceResolverSwitch referenceResolverSwitch = getReferenceResolverSwitch();
		referenceResolverSwitch.setOptions(options);
		for (org.eclipse.emf.ecore.EObject root : getContentsInternal()) {
			printer.print(root);
		}
	}
	
	protected String getSyntaxName() {
		return "gcomponent";
	}
	
	public genericity.language.gcomponent.resource.gcomponent.IGcomponentReferenceResolverSwitch getReferenceResolverSwitch() {
		if (resolverSwitch == null) {
			resolverSwitch = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentReferenceResolverSwitch();
		}
		return resolverSwitch;
	}
	
	public genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentMetaInformation getMetaInformation() {
		return new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentMetaInformation();
	}
	
	protected void resetLocationMap() {
		locationMap = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentLocationMap();
	}
	
	public void addURIFragment(String internalURIFragment, genericity.language.gcomponent.resource.gcomponent.IGcomponentContextDependentURIFragment<? extends org.eclipse.emf.ecore.EObject> uriFragment) {
		internalURIFragmentMap.put(internalURIFragment, uriFragment);
	}
	
	public <ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> void registerContextDependentProxy(genericity.language.gcomponent.resource.gcomponent.IGcomponentContextDependentURIFragmentFactory<ContainerType, ReferenceType> factory, ContainerType container, org.eclipse.emf.ecore.EReference reference, String id, org.eclipse.emf.ecore.EObject proxyElement, int position) {
		org.eclipse.emf.ecore.InternalEObject proxy = (org.eclipse.emf.ecore.InternalEObject) proxyElement;
		String internalURIFragment = genericity.language.gcomponent.resource.gcomponent.IGcomponentContextDependentURIFragment.INTERNAL_URI_FRAGMENT_PREFIX + (proxyCounter++) + "_" + id;
		genericity.language.gcomponent.resource.gcomponent.IGcomponentContextDependentURIFragment<?> uriFragment = factory.create(id, container, reference, position, proxy);
		proxy.eSetProxyURI(getURI().appendFragment(internalURIFragment));
		addURIFragment(internalURIFragment, uriFragment);
	}
	
	public org.eclipse.emf.ecore.EObject getEObject(String id) {
		if (internalURIFragmentMap.containsKey(id)) {
			genericity.language.gcomponent.resource.gcomponent.IGcomponentContextDependentURIFragment<? extends org.eclipse.emf.ecore.EObject> uriFragment = internalURIFragmentMap.get(id);
			boolean wasResolvedBefore = uriFragment.isResolved();
			genericity.language.gcomponent.resource.gcomponent.IGcomponentReferenceResolveResult<? extends org.eclipse.emf.ecore.EObject> result = null;
			// catch and report all Exceptions that occur during proxy resolving
			try {
				result = uriFragment.resolve();
			} catch (Exception e) {
				String message = "An expection occured while resolving the proxy for: "+ id + ". (" + e.toString() + ")";
				addProblem(new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentProblem(message, genericity.language.gcomponent.resource.gcomponent.GcomponentEProblemType.UNRESOLVED_REFERENCE, genericity.language.gcomponent.resource.gcomponent.GcomponentEProblemSeverity.ERROR),uriFragment.getProxy());
				genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentPlugin.logError(message, e);
			}
			if (result == null) {
				// the resolving did call itself
				return null;
			}
			if (!wasResolvedBefore && !result.wasResolved()) {
				attachResolveError(result, uriFragment.getProxy());
				return null;
			} else if (!result.wasResolved()) {
				return null;
			} else {
				org.eclipse.emf.ecore.EObject proxy = uriFragment.getProxy();
				// remove an error that might have been added by an earlier attempt
				removeDiagnostics(proxy, getErrors());
				// remove old warnings and attach new
				removeDiagnostics(proxy, getWarnings());
				attachResolveWarnings(result, proxy);
				genericity.language.gcomponent.resource.gcomponent.IGcomponentReferenceMapping<? extends org.eclipse.emf.ecore.EObject> mapping = result.getMappings().iterator().next();
				org.eclipse.emf.ecore.EObject resultElement = getResultElement(uriFragment, mapping, proxy, result.getErrorMessage());
				org.eclipse.emf.ecore.EObject container = uriFragment.getContainer();
				replaceProxyInLayoutAdapters(container, proxy, resultElement);
				return resultElement;
			}
		} else {
			return super.getEObject(id);
		}
	}
	
	protected void replaceProxyInLayoutAdapters(org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EObject proxy, org.eclipse.emf.ecore.EObject target) {
		for (org.eclipse.emf.common.notify.Adapter adapter : container.eAdapters()) {
			if (adapter instanceof genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentLayoutInformationAdapter) {
				genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentLayoutInformationAdapter layoutInformationAdapter = (genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentLayoutInformationAdapter) adapter;
				layoutInformationAdapter.replaceProxy(proxy, target);
			}
		}
	}
	
	private org.eclipse.emf.ecore.EObject getResultElement(genericity.language.gcomponent.resource.gcomponent.IGcomponentContextDependentURIFragment<? extends org.eclipse.emf.ecore.EObject> uriFragment, genericity.language.gcomponent.resource.gcomponent.IGcomponentReferenceMapping<? extends org.eclipse.emf.ecore.EObject> mapping, org.eclipse.emf.ecore.EObject proxy, final String errorMessage) {
		if (mapping instanceof genericity.language.gcomponent.resource.gcomponent.IGcomponentURIMapping<?>) {
			org.eclipse.emf.common.util.URI uri = ((genericity.language.gcomponent.resource.gcomponent.IGcomponentURIMapping<? extends org.eclipse.emf.ecore.EObject>)mapping).getTargetIdentifier();
			if (uri != null) {
				org.eclipse.emf.ecore.EObject result = null;
				try {
					result = this.getResourceSet().getEObject(uri, true);
				} catch (Exception e) {
					// we can catch exceptions here, because EMF will try to resolve again and handle
					// the exception
				}
				if (result == null || result.eIsProxy()) {
					// unable to resolve: attach error
					if (errorMessage == null) {
						assert(false);
					} else {
						addProblem(new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentProblem(errorMessage, genericity.language.gcomponent.resource.gcomponent.GcomponentEProblemType.UNRESOLVED_REFERENCE, genericity.language.gcomponent.resource.gcomponent.GcomponentEProblemSeverity.ERROR), proxy);
					}
				}
				return result;
			}
			return null;
		} else if (mapping instanceof genericity.language.gcomponent.resource.gcomponent.IGcomponentElementMapping<?>) {
			org.eclipse.emf.ecore.EObject element = ((genericity.language.gcomponent.resource.gcomponent.IGcomponentElementMapping<? extends org.eclipse.emf.ecore.EObject>)mapping).getTargetElement();
			org.eclipse.emf.ecore.EReference reference = uriFragment.getReference();
			org.eclipse.emf.ecore.EReference oppositeReference = uriFragment.getReference().getEOpposite();
			if (!uriFragment.getReference().isContainment() && oppositeReference != null) {
				if (reference.isMany()) {
					org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList.ManyInverse<org.eclipse.emf.ecore.EObject> list = genericity.language.gcomponent.resource.gcomponent.util.GcomponentCastUtil.cast(element.eGet(oppositeReference, false));										// avoids duplicate entries in the reference caused by adding to the
					// oppositeReference
					list.basicAdd(uriFragment.getContainer(),null);
				} else {
					uriFragment.getContainer().eSet(uriFragment.getReference(), element);
				}
			}
			return element;
		} else {
			assert(false);
			return null;
		}
	}
	
	private void removeDiagnostics(org.eclipse.emf.ecore.EObject cause, java.util.List<org.eclipse.emf.ecore.resource.Resource.Diagnostic> diagnostics) {
		// remove all errors/warnings from this resource
		for (org.eclipse.emf.ecore.resource.Resource.Diagnostic errorCand : new org.eclipse.emf.common.util.BasicEList<org.eclipse.emf.ecore.resource.Resource.Diagnostic>(diagnostics)) {
			if (errorCand instanceof genericity.language.gcomponent.resource.gcomponent.IGcomponentTextDiagnostic) {
				if (((genericity.language.gcomponent.resource.gcomponent.IGcomponentTextDiagnostic) errorCand).wasCausedBy(cause)) {
					diagnostics.remove(errorCand);
					genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentMarkerHelper.unmark(this, cause);
				}
			}
		}
	}
	
	private void attachResolveError(genericity.language.gcomponent.resource.gcomponent.IGcomponentReferenceResolveResult<?> result, org.eclipse.emf.ecore.EObject proxy) {
		// attach errors to this resource
		assert result != null;
		final String errorMessage = result.getErrorMessage();
		if (errorMessage == null) {
			assert(false);
		} else {
			addProblem(new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentProblem(errorMessage, genericity.language.gcomponent.resource.gcomponent.GcomponentEProblemType.UNRESOLVED_REFERENCE, genericity.language.gcomponent.resource.gcomponent.GcomponentEProblemSeverity.ERROR, result.getQuickFixes()), proxy);
		}
	}
	
	private void attachResolveWarnings(genericity.language.gcomponent.resource.gcomponent.IGcomponentReferenceResolveResult<? extends org.eclipse.emf.ecore.EObject> result, org.eclipse.emf.ecore.EObject proxy) {
		assert result != null;
		assert result.wasResolved();
		if (result.wasResolved()) {
			for (genericity.language.gcomponent.resource.gcomponent.IGcomponentReferenceMapping<? extends org.eclipse.emf.ecore.EObject> mapping : result.getMappings()) {
				final String warningMessage = mapping.getWarning();
				if (warningMessage == null) {
					continue;
				}
				addProblem(new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentProblem(warningMessage, genericity.language.gcomponent.resource.gcomponent.GcomponentEProblemType.UNRESOLVED_REFERENCE, genericity.language.gcomponent.resource.gcomponent.GcomponentEProblemSeverity.WARNING), proxy);
			}
		}
	}
	
	/**
	 * Extends the super implementation by clearing all information about element
	 * positions.
	 */
	protected void doUnload() {
		super.doUnload();
		clearState();
		loadOptions = null;
	}
	
	protected void runPostProcessors(java.util.Map<?, ?> loadOptions) {
		genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentMarkerHelper.unmark(this, genericity.language.gcomponent.resource.gcomponent.GcomponentEProblemType.ANALYSIS_PROBLEM);
		if (terminateReload) {
			return;
		}
		// first, run the generated post processor
		runPostProcessor(new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentResourcePostProcessor());
		if (loadOptions == null) {
			return;
		}
		// then, run post processors that are registered via the load options extension
		// point
		Object resourcePostProcessorProvider = loadOptions.get(genericity.language.gcomponent.resource.gcomponent.IGcomponentOptions.RESOURCE_POSTPROCESSOR_PROVIDER);
		if (resourcePostProcessorProvider != null) {
			if (resourcePostProcessorProvider instanceof genericity.language.gcomponent.resource.gcomponent.IGcomponentResourcePostProcessorProvider) {
				runPostProcessor(((genericity.language.gcomponent.resource.gcomponent.IGcomponentResourcePostProcessorProvider) resourcePostProcessorProvider).getResourcePostProcessor());
			} else if (resourcePostProcessorProvider instanceof java.util.Collection<?>) {
				java.util.Collection<?> resourcePostProcessorProviderCollection = (java.util.Collection<?>) resourcePostProcessorProvider;
				for (Object processorProvider : resourcePostProcessorProviderCollection) {
					if (terminateReload) {
						return;
					}
					if (processorProvider instanceof genericity.language.gcomponent.resource.gcomponent.IGcomponentResourcePostProcessorProvider) {
						genericity.language.gcomponent.resource.gcomponent.IGcomponentResourcePostProcessorProvider csProcessorProvider = (genericity.language.gcomponent.resource.gcomponent.IGcomponentResourcePostProcessorProvider) processorProvider;
						genericity.language.gcomponent.resource.gcomponent.IGcomponentResourcePostProcessor postProcessor = csProcessorProvider.getResourcePostProcessor();
						runPostProcessor(postProcessor);
					}
				}
			}
		}
	}
	
	protected void runPostProcessor(genericity.language.gcomponent.resource.gcomponent.IGcomponentResourcePostProcessor postProcessor) {
		try {
			this.runningPostProcessor = postProcessor;
			postProcessor.process(this);
		} catch (Exception e) {
			genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentPlugin.logError("Exception while running a post-processor.", e);
		}
		this.runningPostProcessor = null;
	}
	
	public void load(java.util.Map<?, ?> options) throws java.io.IOException {
		java.util.Map<Object, Object> loadOptions = addDefaultLoadOptions(options);
		super.load(loadOptions);
		org.eclipse.emf.ecore.util.EcoreUtil.resolveAll(this.getResourceSet());
	}
	
	public void setURI(org.eclipse.emf.common.util.URI uri) {
		// because of the context dependent proxy resolving it is essential to resolve all
		// proxies before the URI is changed which can cause loss of object identities
		org.eclipse.emf.ecore.util.EcoreUtil.resolveAll(this);
		super.setURI(uri);
	}
	
	public genericity.language.gcomponent.resource.gcomponent.IGcomponentLocationMap getLocationMap() {
		return locationMap;
	}
	
	public void addProblem(genericity.language.gcomponent.resource.gcomponent.IGcomponentProblem problem, org.eclipse.emf.ecore.EObject element) {
		ElementBasedTextDiagnostic diagnostic = new ElementBasedTextDiagnostic(locationMap, getURI(), problem, element);
		getDiagnostics(problem.getSeverity()).add(diagnostic);
		if (isMarkerCreationEnabled()) {
			genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentMarkerHelper.mark(this, diagnostic);
		}
		java.util.Collection<genericity.language.gcomponent.resource.gcomponent.IGcomponentQuickFix> quickFixes = problem.getQuickFixes();
		if (quickFixes != null) {
			for (genericity.language.gcomponent.resource.gcomponent.IGcomponentQuickFix quickFix : quickFixes) {
				if (quickFix != null) {
					quickFixMap.put(quickFix.getContextAsString(), quickFix);
				}
			}
		}
	}
	
	public void addProblem(genericity.language.gcomponent.resource.gcomponent.IGcomponentProblem problem, int column, int line, int charStart, int charEnd) {
		PositionBasedTextDiagnostic diagnostic = new PositionBasedTextDiagnostic(getURI(), problem, column, line, charStart, charEnd);
		getDiagnostics(problem.getSeverity()).add(diagnostic);
		if (isMarkerCreationEnabled()) {
			genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentMarkerHelper.mark(this, diagnostic);
		}
	}
	
	@Deprecated	
	public void addError(String message, org.eclipse.emf.ecore.EObject cause) {
		addError(message, genericity.language.gcomponent.resource.gcomponent.GcomponentEProblemType.UNKNOWN, cause);
	}
	
	public void addError(String message, genericity.language.gcomponent.resource.gcomponent.GcomponentEProblemType type, org.eclipse.emf.ecore.EObject cause) {
		addProblem(new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentProblem(message, type, genericity.language.gcomponent.resource.gcomponent.GcomponentEProblemSeverity.ERROR), cause);
	}
	
	@Deprecated	
	public void addWarning(String message, org.eclipse.emf.ecore.EObject cause) {
		addWarning(message, genericity.language.gcomponent.resource.gcomponent.GcomponentEProblemType.UNKNOWN, cause);
	}
	
	public void addWarning(String message, genericity.language.gcomponent.resource.gcomponent.GcomponentEProblemType type, org.eclipse.emf.ecore.EObject cause) {
		addProblem(new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentProblem(message, type, genericity.language.gcomponent.resource.gcomponent.GcomponentEProblemSeverity.WARNING), cause);
	}
	
	private java.util.List<org.eclipse.emf.ecore.resource.Resource.Diagnostic> getDiagnostics(genericity.language.gcomponent.resource.gcomponent.GcomponentEProblemSeverity severity) {
		if (severity == genericity.language.gcomponent.resource.gcomponent.GcomponentEProblemSeverity.ERROR) {
			return getErrors();
		} else {
			return getWarnings();
		}
	}
	
	protected java.util.Map<Object, Object> addDefaultLoadOptions(java.util.Map<?, ?> loadOptions) {
		java.util.Map<Object, Object> loadOptionsCopy = genericity.language.gcomponent.resource.gcomponent.util.GcomponentMapUtil.copySafelyToObjectToObjectMap(loadOptions);
		if (org.eclipse.core.runtime.Platform.isRunning()) {
			// find default load option providers
			org.eclipse.core.runtime.IExtensionRegistry extensionRegistry = org.eclipse.core.runtime.Platform.getExtensionRegistry();
			org.eclipse.core.runtime.IConfigurationElement configurationElements[] = extensionRegistry.getConfigurationElementsFor(genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentPlugin.EP_DEFAULT_LOAD_OPTIONS_ID);
			for (org.eclipse.core.runtime.IConfigurationElement element : configurationElements) {
				try {
					genericity.language.gcomponent.resource.gcomponent.IGcomponentOptionProvider provider = (genericity.language.gcomponent.resource.gcomponent.IGcomponentOptionProvider) element.createExecutableExtension("class");
					final java.util.Map<?, ?> options = provider.getOptions();
					final java.util.Collection<?> keys = options.keySet();
					for (Object key : keys) {
						addLoadOption(loadOptionsCopy, key, options.get(key));
					}
				} catch (org.eclipse.core.runtime.CoreException ce) {
					genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentPlugin.logError("Exception while getting default options.", ce);
				}
			}
		}
		return loadOptionsCopy;
	}
	
	/**
	 * Adds a new key,value pair to the list of options. If there is already an option
	 * with the same key, the two values are collected in a list.
	 */
	private void addLoadOption(java.util.Map<Object, Object> options,Object key, Object value) {
		// check if there is already an option set
		if (options.containsKey(key)) {
			Object currentValue = options.get(key);
			if (currentValue instanceof java.util.List<?>) {
				// if the current value is a list, we add the new value to this list
				java.util.List<?> currentValueAsList = (java.util.List<?>) currentValue;
				java.util.List<Object> currentValueAsObjectList = genericity.language.gcomponent.resource.gcomponent.util.GcomponentListUtil.copySafelyToObjectList(currentValueAsList);
				if (value instanceof java.util.Collection<?>) {
					currentValueAsObjectList.addAll((java.util.Collection<?>) value);
				} else {
					currentValueAsObjectList.add(value);
				}
				options.put(key, currentValueAsObjectList);
			} else {
				// if the current value is not a list, we create a fresh list and add both the old
				// (current) and the new value to this list
				java.util.List<Object> newValueList = new java.util.ArrayList<Object>();
				newValueList.add(currentValue);
				if (value instanceof java.util.Collection<?>) {
					newValueList.addAll((java.util.Collection<?>) value);
				} else {
					newValueList.add(value);
				}
				options.put(key, newValueList);
			}
		} else {
			options.put(key, value);
		}
	}
	
	/**
	 * Extends the super implementation by clearing all information about element
	 * positions.
	 */
	protected void clearState() {
		// clear concrete syntax information
		resetLocationMap();
		internalURIFragmentMap.clear();
		getErrors().clear();
		getWarnings().clear();
		if (isMarkerCreationEnabled()) {
			genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentMarkerHelper.unmark(this, genericity.language.gcomponent.resource.gcomponent.GcomponentEProblemType.UNKNOWN);
			genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentMarkerHelper.unmark(this, genericity.language.gcomponent.resource.gcomponent.GcomponentEProblemType.SYNTAX_ERROR);
			genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentMarkerHelper.unmark(this, genericity.language.gcomponent.resource.gcomponent.GcomponentEProblemType.UNRESOLVED_REFERENCE);
		}
		proxyCounter = 0;
		resolverSwitch = null;
	}
	
	/**
	 * Returns a copy of the contents of this resource wrapped in a list that
	 * propagates changes to the original resource list. Wrapping is required to make
	 * sure that clients which obtain a reference to the list of contents do not
	 * interfere when changing the list.
	 */
	public org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> getContents() {
		return new genericity.language.gcomponent.resource.gcomponent.util.GcomponentCopiedEObjectInternalEList((org.eclipse.emf.ecore.util.InternalEList<org.eclipse.emf.ecore.EObject>) super.getContents());
	}
	
	/**
	 * Returns the raw contents of this resource.
	 */
	public org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> getContentsInternal() {
		return super.getContents();
	}
	
	public org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.resource.Resource.Diagnostic> getWarnings() {
		return new genericity.language.gcomponent.resource.gcomponent.util.GcomponentCopiedEList<org.eclipse.emf.ecore.resource.Resource.Diagnostic>(super.getWarnings());
	}
	
	public org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.resource.Resource.Diagnostic> getErrors() {
		return new genericity.language.gcomponent.resource.gcomponent.util.GcomponentCopiedEList<org.eclipse.emf.ecore.resource.Resource.Diagnostic>(super.getErrors());
	}
	
	@SuppressWarnings("restriction")	
	private void runValidators(org.eclipse.emf.ecore.EObject root) {
		// checking constraints provided by EMF validator classes was disabled
		
		// check EMF validation constraints
		// EMF validation does not work if OSGi is not running
		// The EMF validation framework code throws a NPE if the validation plug-in is not
		// loaded. This is a bug, which is fixed in the Helios release. Nonetheless, we
		// need to catch the exception here.
		if (org.eclipse.core.runtime.Platform.isRunning()) {
			// The EMF validation framework code throws a NPE if the validation plug-in is not
			// loaded. This is a workaround for bug 322079.
			if (org.eclipse.emf.validation.internal.EMFModelValidationPlugin.getPlugin() != null) {
				try {
					org.eclipse.emf.validation.service.ModelValidationService service = org.eclipse.emf.validation.service.ModelValidationService.getInstance();
					org.eclipse.emf.validation.service.IBatchValidator validator = service.<org.eclipse.emf.ecore.EObject, org.eclipse.emf.validation.service.IBatchValidator>newValidator(org.eclipse.emf.validation.model.EvaluationMode.BATCH);
					validator.setIncludeLiveConstraints(true);
					org.eclipse.core.runtime.IStatus status = validator.validate(root);
					addStatus(status, root);
				} catch (Throwable t) {
					genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentPlugin.logError("Exception while checking contraints provided by EMF validator classes.", t);
				}
			}
		}
	}
	
	private void addStatus(org.eclipse.core.runtime.IStatus status, org.eclipse.emf.ecore.EObject root) {
		java.util.List<org.eclipse.emf.ecore.EObject> causes = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>();
		causes.add(root);
		if (status instanceof org.eclipse.emf.validation.model.ConstraintStatus) {
			org.eclipse.emf.validation.model.ConstraintStatus constraintStatus = (org.eclipse.emf.validation.model.ConstraintStatus) status;
			java.util.Set<org.eclipse.emf.ecore.EObject> resultLocus = constraintStatus.getResultLocus();
			causes.clear();
			causes.addAll(resultLocus);
		}
		boolean hasChildren = status.getChildren() != null && status.getChildren().length > 0;
		// Ignore composite status objects that have children. The actual status
		// information is then contained in the child objects.
		if (!status.isMultiStatus() || !hasChildren) {
			if (status.getSeverity() == org.eclipse.core.runtime.IStatus.ERROR) {
				for (org.eclipse.emf.ecore.EObject cause : causes) {
					addError(status.getMessage(), genericity.language.gcomponent.resource.gcomponent.GcomponentEProblemType.ANALYSIS_PROBLEM, cause);
				}
			}
			if (status.getSeverity() == org.eclipse.core.runtime.IStatus.WARNING) {
				for (org.eclipse.emf.ecore.EObject cause : causes) {
					addWarning(status.getMessage(), genericity.language.gcomponent.resource.gcomponent.GcomponentEProblemType.ANALYSIS_PROBLEM, cause);
				}
			}
		}
		for (org.eclipse.core.runtime.IStatus child : status.getChildren()) {
			addStatus(child, root);
		}
	}
	
	public genericity.language.gcomponent.resource.gcomponent.IGcomponentQuickFix getQuickFix(String quickFixContext) {
		return quickFixMap.get(quickFixContext);
	}
	
	public boolean isMarkerCreationEnabled() {
		if (loadOptions == null) {
			return true;
		}
		return !loadOptions.containsKey(genericity.language.gcomponent.resource.gcomponent.IGcomponentOptions.DISABLE_CREATING_MARKERS_FOR_PROBLEMS);
	}
}
