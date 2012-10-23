/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package genericity.language.gcomponent.resource.gcomponent.ui;

/**
 * A CodeCompletionHelper can be used to derive completion proposals for partial
 * documents. It runs the parser generated by EMFText in a special mode (i.e., the
 * rememberExpectedElements mode). Based on the elements that are expected by the
 * parser for different regions in the document, valid proposals are computed.
 */
public class GcomponentCodeCompletionHelper {
	
	private genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentAttributeValueProvider attributeValueProvider = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentAttributeValueProvider();
	
	/**
	 * Computes a set of proposals for the given document assuming the cursor is at
	 * 'cursorOffset'. The proposals are derived using the meta information, i.e., the
	 * generated language plug-in.
	 * 
	 * @param originalResource
	 * @param content the documents content
	 * @param cursorOffset
	 * 
	 * @return
	 */
	public genericity.language.gcomponent.resource.gcomponent.ui.GcomponentCompletionProposal[] computeCompletionProposals(genericity.language.gcomponent.resource.gcomponent.IGcomponentTextResource originalResource, String content, int cursorOffset) {
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
		// the shadow resource needs the same URI because reference resolvers may use the
		// URI to resolve external references
		genericity.language.gcomponent.resource.gcomponent.IGcomponentTextResource resource = (genericity.language.gcomponent.resource.gcomponent.IGcomponentTextResource) resourceSet.createResource(originalResource.getURI());
		java.io.ByteArrayInputStream inputStream = new java.io.ByteArrayInputStream(content.getBytes());
		genericity.language.gcomponent.resource.gcomponent.IGcomponentMetaInformation metaInformation = resource.getMetaInformation();
		genericity.language.gcomponent.resource.gcomponent.IGcomponentTextParser parser = metaInformation.createParser(inputStream, null);
		genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedTerminal[] expectedElements = parseToExpectedElements(parser, resource, cursorOffset);
		if (expectedElements == null) {
			return new genericity.language.gcomponent.resource.gcomponent.ui.GcomponentCompletionProposal[0];
		}
		if (expectedElements.length == 0) {
			return new genericity.language.gcomponent.resource.gcomponent.ui.GcomponentCompletionProposal[0];
		}
		java.util.List<genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedTerminal> expectedAfterCursor = java.util.Arrays.asList(getElementsExpectedAt(expectedElements, cursorOffset));
		java.util.List<genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedTerminal> expectedBeforeCursor = java.util.Arrays.asList(getElementsExpectedAt(expectedElements, cursorOffset - 1));
		setPrefixes(expectedAfterCursor, content, cursorOffset);
		setPrefixes(expectedBeforeCursor, content, cursorOffset);
		// First, we derive all possible proposals from the set of elements that are
		// expected at the cursor position.
		java.util.Collection<genericity.language.gcomponent.resource.gcomponent.ui.GcomponentCompletionProposal> allProposals = new java.util.LinkedHashSet<genericity.language.gcomponent.resource.gcomponent.ui.GcomponentCompletionProposal>();
		java.util.Collection<genericity.language.gcomponent.resource.gcomponent.ui.GcomponentCompletionProposal> rightProposals = deriveProposals(expectedAfterCursor, content, resource, cursorOffset);
		java.util.Collection<genericity.language.gcomponent.resource.gcomponent.ui.GcomponentCompletionProposal> leftProposals = deriveProposals(expectedBeforeCursor, content, resource, cursorOffset - 1);
		// Second, the set of left proposals (i.e., the ones before the cursor) is checked
		// for emptiness. If the set is empty, the right proposals (i.e., the ones after
		// the cursor) are also considered. If the set is not empty, the right proposal
		// are discarded, because it does not make sense to propose them until the element
		// before the cursor was completed.
		allProposals.addAll(leftProposals);
		if (leftProposals.isEmpty()) {
			allProposals.addAll(rightProposals);
		}
		// Third, the proposals are sorted according to their relevance. Proposals that
		// matched the prefix are preferred over ones that did not. Finally, proposals are
		// sorted alphabetically.
		final java.util.List<genericity.language.gcomponent.resource.gcomponent.ui.GcomponentCompletionProposal> sortedProposals = new java.util.ArrayList<genericity.language.gcomponent.resource.gcomponent.ui.GcomponentCompletionProposal>(allProposals);
		java.util.Collections.sort(sortedProposals);
		return sortedProposals.toArray(new genericity.language.gcomponent.resource.gcomponent.ui.GcomponentCompletionProposal[sortedProposals.size()]);
	}
	
	public genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedTerminal[] parseToExpectedElements(genericity.language.gcomponent.resource.gcomponent.IGcomponentTextParser parser, genericity.language.gcomponent.resource.gcomponent.IGcomponentTextResource resource, int cursorOffset) {
		final java.util.List<genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedTerminal> expectedElements = parser.parseToExpectedElements(null, resource, cursorOffset);
		if (expectedElements == null) {
			return new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedTerminal[0];
		}
		removeDuplicateEntries(expectedElements);
		removeInvalidEntriesAtEnd(expectedElements);
		return expectedElements.toArray(new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedTerminal[expectedElements.size()]);
	}
	
	private void removeDuplicateEntries(java.util.List<genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedTerminal> expectedElements) {
		for (int i = 0; i < expectedElements.size() - 1; i++) {
			genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedTerminal elementAtIndex = expectedElements.get(i);
			for (int j = i + 1; j < expectedElements.size();) {
				genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedTerminal elementAtNext = expectedElements.get(j);
				if (elementAtIndex.equals(elementAtNext) && elementAtIndex.getStartExcludingHiddenTokens() == elementAtNext.getStartExcludingHiddenTokens()) {
					expectedElements.remove(j);
				} else {
					j++;
				}
			}
		}
	}
	
	private void removeInvalidEntriesAtEnd(java.util.List<genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedTerminal> expectedElements) {
		for (int i = 0; i < expectedElements.size() - 1;) {
			genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedTerminal elementAtIndex = expectedElements.get(i);
			genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedTerminal elementAtNext = expectedElements.get(i + 1);
			if (elementAtIndex.getStartExcludingHiddenTokens() == elementAtNext.getStartExcludingHiddenTokens() && shouldRemove(elementAtIndex.getFollowSetID(), elementAtNext.getFollowSetID())) {
				expectedElements.remove(i + 1);
			} else {
				i++;
			}
		}
	}
	
	public boolean shouldRemove(int followSetID1, int followSetID2) {
		return followSetID1 != followSetID2;
	}
	
	private String findPrefix(java.util.List<genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedTerminal> expectedElements, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedTerminal expectedAtCursor, String content, int cursorOffset) {
		if (cursorOffset < 0) {
			return "";
		}
		int end = 0;
		for (genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedTerminal expectedElement : expectedElements) {
			if (expectedElement == expectedAtCursor) {
				final int start = expectedElement.getStartExcludingHiddenTokens();
				if (start >= 0  && start < Integer.MAX_VALUE) {
					end = start;
				}
				break;
			}
		}
		end = Math.min(end, cursorOffset);
		final String prefix = content.substring(end, Math.min(content.length(), cursorOffset));
		return prefix;
	}
	
	private java.util.Collection<genericity.language.gcomponent.resource.gcomponent.ui.GcomponentCompletionProposal> deriveProposals(java.util.List<genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedTerminal> expectedElements, String content, genericity.language.gcomponent.resource.gcomponent.IGcomponentTextResource resource, int cursorOffset) {
		java.util.Collection<genericity.language.gcomponent.resource.gcomponent.ui.GcomponentCompletionProposal> resultSet = new java.util.LinkedHashSet<genericity.language.gcomponent.resource.gcomponent.ui.GcomponentCompletionProposal>();
		for (genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedTerminal expectedElement : expectedElements) {
			resultSet.addAll(deriveProposals(expectedElement, content, resource, cursorOffset));
		}
		return resultSet;
	}
	
	private java.util.Collection<genericity.language.gcomponent.resource.gcomponent.ui.GcomponentCompletionProposal> deriveProposals(genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedTerminal expectedTerminal, String content, genericity.language.gcomponent.resource.gcomponent.IGcomponentTextResource resource, int cursorOffset) {
		genericity.language.gcomponent.resource.gcomponent.IGcomponentMetaInformation metaInformation = resource.getMetaInformation();
		genericity.language.gcomponent.resource.gcomponent.IGcomponentLocationMap locationMap = resource.getLocationMap();
		genericity.language.gcomponent.resource.gcomponent.IGcomponentExpectedElement expectedElement = (genericity.language.gcomponent.resource.gcomponent.IGcomponentExpectedElement) expectedTerminal.getTerminal();
		if (expectedElement instanceof genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString) {
			genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString csString = (genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString) expectedElement;
			return handleKeyword(csString, expectedTerminal.getPrefix());
		} else if (expectedElement instanceof genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedBooleanTerminal) {
			genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedBooleanTerminal expectedBooleanTerminal = (genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedBooleanTerminal) expectedElement;
			return handleBooleanTerminal(expectedBooleanTerminal, expectedTerminal.getPrefix());
		} else if (expectedElement instanceof genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedEnumerationTerminal) {
			genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedEnumerationTerminal expectedEnumerationTerminal = (genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedEnumerationTerminal) expectedElement;
			return handleEnumerationTerminal(expectedEnumerationTerminal, expectedTerminal.getPrefix());
		} else if (expectedElement instanceof genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedStructuralFeature) {
			genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedStructuralFeature expectedFeature = (genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedStructuralFeature) expectedElement;
			org.eclipse.emf.ecore.EStructuralFeature feature = expectedFeature.getFeature();
			org.eclipse.emf.ecore.EClassifier featureType = feature.getEType();
			java.util.List<org.eclipse.emf.ecore.EObject> elementsAtCursor = locationMap.getElementsAt(cursorOffset);
			org.eclipse.emf.ecore.EObject container = null;
			// we need to skip the proxy elements at the cursor, because they are not the
			// container for the reference we try to complete
			for (int i = 0; i < elementsAtCursor.size(); i++) {
				container = elementsAtCursor.get(i);
				if (!container.eIsProxy()) {
					break;
				}
			}
			// if no container can be found, the cursor is probably at the end of the
			// document. we need to create artificial containers.
			if (container == null) {
				boolean attachedArtificialContainer = false;
				org.eclipse.emf.ecore.EClass containerClass = expectedTerminal.getTerminal().getRuleMetaclass();
				org.eclipse.emf.ecore.EStructuralFeature[] containmentTrace = expectedTerminal.getContainmentTrace();
				java.util.List<org.eclipse.emf.ecore.EObject> contentList = null;
				for (org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature : containmentTrace) {
					if (attachedArtificialContainer) {
						break;
					}
					org.eclipse.emf.ecore.EClass neededClass = eStructuralFeature.getEContainingClass();
					// fill the content list during the first iteration of the loop
					if (contentList == null) {
						contentList = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>();
						java.util.Iterator<org.eclipse.emf.ecore.EObject> allContents = resource.getAllContents();
						while (allContents.hasNext()) {
							org.eclipse.emf.ecore.EObject next = allContents.next();
							contentList.add(next);
						}
					}
					// find object to attach artificial container to
					for (int i = contentList.size() - 1; i >= 0; i--) {
						org.eclipse.emf.ecore.EObject object = contentList.get(i);
						if (neededClass.isInstance(object)) {
							org.eclipse.emf.ecore.EObject newContainer = containerClass.getEPackage().getEFactoryInstance().create(containerClass);
							if (eStructuralFeature.getEType().isInstance(newContainer)) {
								genericity.language.gcomponent.resource.gcomponent.util.GcomponentEObjectUtil.setFeature(object, eStructuralFeature, newContainer, false);
								container = newContainer;
								attachedArtificialContainer = true;
							}
						}
					}
				}
			}
			
			if (feature instanceof org.eclipse.emf.ecore.EReference) {
				org.eclipse.emf.ecore.EReference reference = (org.eclipse.emf.ecore.EReference) feature;
				if (featureType instanceof org.eclipse.emf.ecore.EClass) {
					if (reference.isContainment()) {
						// the FOLLOW set should contain only non-containment references
						assert false;
					} else {
						return handleNCReference(metaInformation, container, reference, expectedTerminal.getPrefix(), expectedFeature.getTokenName());
					}
				}
			} else if (feature instanceof org.eclipse.emf.ecore.EAttribute) {
				org.eclipse.emf.ecore.EAttribute attribute = (org.eclipse.emf.ecore.EAttribute) feature;
				if (featureType instanceof org.eclipse.emf.ecore.EEnum) {
					org.eclipse.emf.ecore.EEnum enumType = (org.eclipse.emf.ecore.EEnum) featureType;
					return handleEnumAttribute(metaInformation, expectedFeature, enumType, expectedTerminal.getPrefix(), container);
				} else {
					// handle EAttributes (derive default value depending on the type of the
					// attribute, figure out token resolver, and call deResolve())
					return handleAttribute(metaInformation, expectedFeature, container, attribute, expectedTerminal.getPrefix());
				}
			} else {
				// there should be no other subclass of EStructuralFeature
				assert false;
			}
		} else {
			// there should be no other class implementing IExpectedElement
			assert false;
		}
		return java.util.Collections.emptyList();
	}
	
	private java.util.Collection<genericity.language.gcomponent.resource.gcomponent.ui.GcomponentCompletionProposal> handleEnumAttribute(genericity.language.gcomponent.resource.gcomponent.IGcomponentMetaInformation metaInformation, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedStructuralFeature expectedFeature, org.eclipse.emf.ecore.EEnum enumType, String prefix, org.eclipse.emf.ecore.EObject container) {
		java.util.Collection<org.eclipse.emf.ecore.EEnumLiteral> enumLiterals = enumType.getELiterals();
		java.util.Collection<genericity.language.gcomponent.resource.gcomponent.ui.GcomponentCompletionProposal> result = new java.util.LinkedHashSet<genericity.language.gcomponent.resource.gcomponent.ui.GcomponentCompletionProposal>();
		for (org.eclipse.emf.ecore.EEnumLiteral literal : enumLiterals) {
			String unResolvedLiteral = literal.getLiteral();
			// use token resolver to get de-resolved value of the literal
			genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolverFactory tokenResolverFactory = metaInformation.getTokenResolverFactory();
			genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver(expectedFeature.getTokenName());
			String resolvedLiteral = tokenResolver.deResolve(unResolvedLiteral, expectedFeature.getFeature(), container);
			boolean matchesPrefix = matches(resolvedLiteral, prefix);
			result.add(new genericity.language.gcomponent.resource.gcomponent.ui.GcomponentCompletionProposal(resolvedLiteral, prefix, matchesPrefix, expectedFeature.getFeature(), container));
		}
		return result;
	}
	
	private java.util.Collection<genericity.language.gcomponent.resource.gcomponent.ui.GcomponentCompletionProposal> handleNCReference(genericity.language.gcomponent.resource.gcomponent.IGcomponentMetaInformation metaInformation, org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EReference reference, String prefix, String tokenName) {
		// proposals for non-containment references are derived by calling the reference
		// resolver switch in fuzzy mode.
		genericity.language.gcomponent.resource.gcomponent.IGcomponentReferenceResolverSwitch resolverSwitch = metaInformation.getReferenceResolverSwitch();
		genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolverFactory tokenResolverFactory = metaInformation.getTokenResolverFactory();
		genericity.language.gcomponent.resource.gcomponent.IGcomponentReferenceResolveResult<org.eclipse.emf.ecore.EObject> result = new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentReferenceResolveResult<org.eclipse.emf.ecore.EObject>(true);
		resolverSwitch.resolveFuzzy(prefix, container, reference, 0, result);
		java.util.Collection<genericity.language.gcomponent.resource.gcomponent.IGcomponentReferenceMapping<org.eclipse.emf.ecore.EObject>> mappings = result.getMappings();
		if (mappings != null) {
			java.util.Collection<genericity.language.gcomponent.resource.gcomponent.ui.GcomponentCompletionProposal> resultSet = new java.util.LinkedHashSet<genericity.language.gcomponent.resource.gcomponent.ui.GcomponentCompletionProposal>();
			for (genericity.language.gcomponent.resource.gcomponent.IGcomponentReferenceMapping<org.eclipse.emf.ecore.EObject> mapping : mappings) {
				org.eclipse.swt.graphics.Image image = null;
				if (mapping instanceof genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentElementMapping<?>) {
					genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentElementMapping<?> elementMapping = (genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentElementMapping<?>) mapping;
					Object target = elementMapping.getTargetElement();
					// de-resolve reference to obtain correct identifier
					genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver(tokenName);
					final String identifier = tokenResolver.deResolve(elementMapping.getIdentifier(), reference, container);
					if (target instanceof org.eclipse.emf.ecore.EObject) {
						image = getImage((org.eclipse.emf.ecore.EObject) target);
					}
					boolean matchesPrefix = matches(identifier, prefix);
					resultSet.add(new genericity.language.gcomponent.resource.gcomponent.ui.GcomponentCompletionProposal(identifier, prefix, matchesPrefix, reference, container, image));
				}
			}
			return resultSet;
		}
		return java.util.Collections.emptyList();
	}
	
	private java.util.Collection<genericity.language.gcomponent.resource.gcomponent.ui.GcomponentCompletionProposal> handleAttribute(genericity.language.gcomponent.resource.gcomponent.IGcomponentMetaInformation metaInformation, genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedStructuralFeature expectedFeature, org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EAttribute attribute, String prefix) {
		java.util.Collection<genericity.language.gcomponent.resource.gcomponent.ui.GcomponentCompletionProposal> resultSet = new java.util.LinkedHashSet<genericity.language.gcomponent.resource.gcomponent.ui.GcomponentCompletionProposal>();
		Object[] defaultValues = attributeValueProvider.getDefaultValues(attribute);
		if (defaultValues != null) {
			for (Object defaultValue : defaultValues) {
				if (defaultValue != null) {
					genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolverFactory tokenResolverFactory = metaInformation.getTokenResolverFactory();
					String tokenName = expectedFeature.getTokenName();
					if (tokenName != null) {
						genericity.language.gcomponent.resource.gcomponent.IGcomponentTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver(tokenName);
						if (tokenResolver != null) {
							String defaultValueAsString = tokenResolver.deResolve(defaultValue, attribute, container);
							boolean matchesPrefix = matches(defaultValueAsString, prefix);
							resultSet.add(new genericity.language.gcomponent.resource.gcomponent.ui.GcomponentCompletionProposal(defaultValueAsString, prefix, matchesPrefix, expectedFeature.getFeature(), container));
						}
					}
				}
			}
		}
		return resultSet;
	}
	
	private java.util.Collection<genericity.language.gcomponent.resource.gcomponent.ui.GcomponentCompletionProposal> handleKeyword(genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedCsString csString, String prefix) {
		String proposal = csString.getValue();
		boolean matchesPrefix = matches(proposal, prefix);
		return java.util.Collections.singleton(new genericity.language.gcomponent.resource.gcomponent.ui.GcomponentCompletionProposal(proposal, prefix, matchesPrefix, null, null));
	}
	
	private java.util.Collection<genericity.language.gcomponent.resource.gcomponent.ui.GcomponentCompletionProposal> handleBooleanTerminal(genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedBooleanTerminal expectedBooleanTerminal, String prefix) {
		java.util.Collection<genericity.language.gcomponent.resource.gcomponent.ui.GcomponentCompletionProposal> result = new java.util.LinkedHashSet<genericity.language.gcomponent.resource.gcomponent.ui.GcomponentCompletionProposal>(2);
		genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentBooleanTerminal booleanTerminal = expectedBooleanTerminal.getBooleanTerminal();
		result.addAll(handleLiteral(booleanTerminal.getAttribute(), prefix, booleanTerminal.getTrueLiteral()));
		result.addAll(handleLiteral(booleanTerminal.getAttribute(), prefix, booleanTerminal.getFalseLiteral()));
		return result;
	}
	
	private java.util.Collection<genericity.language.gcomponent.resource.gcomponent.ui.GcomponentCompletionProposal> handleEnumerationTerminal(genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedEnumerationTerminal expectedEnumerationTerminal, String prefix) {
		java.util.Collection<genericity.language.gcomponent.resource.gcomponent.ui.GcomponentCompletionProposal> result = new java.util.LinkedHashSet<genericity.language.gcomponent.resource.gcomponent.ui.GcomponentCompletionProposal>(2);
		genericity.language.gcomponent.resource.gcomponent.grammar.GcomponentEnumerationTerminal enumerationTerminal = expectedEnumerationTerminal.getEnumerationTerminal();
		java.util.Map<String, String> literalMapping = enumerationTerminal.getLiteralMapping();
		for (String literalName : literalMapping.keySet()) {
			result.addAll(handleLiteral(enumerationTerminal.getAttribute(), prefix, literalMapping.get(literalName)));
		}
		return result;
	}
	
	private java.util.Collection<genericity.language.gcomponent.resource.gcomponent.ui.GcomponentCompletionProposal> handleLiteral(org.eclipse.emf.ecore.EAttribute attribute, String prefix, String literal) {
		if ("".equals(literal)) {
			return java.util.Collections.emptySet();
		}
		boolean matchesPrefix = matches(literal, prefix);
		return java.util.Collections.singleton(new genericity.language.gcomponent.resource.gcomponent.ui.GcomponentCompletionProposal(literal, prefix, matchesPrefix, null, null));
	}
	
	/**
	 * Calculates the prefix for each given expected element. The prefix depends on
	 * the current document content, the cursor position, and the position where the
	 * element is expected.
	 */
	private void setPrefixes(java.util.List<genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedTerminal> expectedElements, String content, int cursorOffset) {
		if (cursorOffset < 0) {
			return;
		}
		for (genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedTerminal expectedElement : expectedElements) {
			String prefix = findPrefix(expectedElements, expectedElement, content, cursorOffset);
			expectedElement.setPrefix(prefix);
		}
	}
	
	public genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedTerminal[] getElementsExpectedAt(genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedTerminal[] allExpectedElements, int cursorOffset) {
		java.util.List<genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedTerminal> expectedAtCursor = new java.util.ArrayList<genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedTerminal>();
		for (int i = 0; i < allExpectedElements.length; i++) {
			genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedTerminal expectedElement = allExpectedElements[i];
			int startIncludingHidden = expectedElement.getStartIncludingHiddenTokens();
			int end = getEnd(allExpectedElements, i);
			if (cursorOffset >= startIncludingHidden && cursorOffset <= end) {
				expectedAtCursor.add(expectedElement);
			}
		}
		return expectedAtCursor.toArray(new genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedTerminal[expectedAtCursor.size()]);
	}
	
	private int getEnd(genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedTerminal[] allExpectedElements, int indexInList) {
		genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedTerminal elementAtIndex = allExpectedElements[indexInList];
		int startIncludingHidden = elementAtIndex.getStartIncludingHiddenTokens();
		int startExcludingHidden = elementAtIndex.getStartExcludingHiddenTokens();
		for (int i = indexInList + 1; i < allExpectedElements.length; i++) {
			genericity.language.gcomponent.resource.gcomponent.mopp.GcomponentExpectedTerminal elementAtI = allExpectedElements[i];
			int startIncludingHiddenForI = elementAtI.getStartIncludingHiddenTokens();
			int startExcludingHiddenForI = elementAtI.getStartExcludingHiddenTokens();
			if (startIncludingHidden != startIncludingHiddenForI || startExcludingHidden != startExcludingHiddenForI) {
				return startIncludingHiddenForI - 1;
			}
		}
		return Integer.MAX_VALUE;
	}
	
	private boolean matches(String proposal, String prefix) {
		return (proposal.toLowerCase().startsWith(prefix.toLowerCase()) || genericity.language.gcomponent.resource.gcomponent.util.GcomponentStringUtil.matchCamelCase(prefix, proposal) != null) && !proposal.equals(prefix);
	}
	
	public org.eclipse.swt.graphics.Image getImage(org.eclipse.emf.ecore.EObject element) {
		if (!org.eclipse.core.runtime.Platform.isRunning()) {
			return null;
		}
		org.eclipse.emf.edit.provider.ComposedAdapterFactory adapterFactory = new org.eclipse.emf.edit.provider.ComposedAdapterFactory(org.eclipse.emf.edit.provider.ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		adapterFactory.addAdapterFactory(new org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new org.eclipse.emf.ecore.provider.EcoreItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory());
		org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider labelProvider = new org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider(adapterFactory);
		return labelProvider.getImage(element);
	}
}
