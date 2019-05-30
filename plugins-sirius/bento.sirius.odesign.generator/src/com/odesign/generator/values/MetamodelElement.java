package com.odesign.generator.values;
 /**
 * @author souhaila
 *
 */

public class MetamodelElement {

	public static String name = "MetamodelElement";
	public static String domainClass = "free_new::MetamodelElement";
	public static String semanticCandidateExpression = "feature:containsMetamodelElement";

	/**
	 * @return the Id 
	 */
	public static String getName() {
		return name;
	}

	/**
	 * @return
	 */
	public static String getDomainClass() {
		return domainClass;
	}

	/**
	 * @return
	 */
	public static String getSemanticCandidateExpression() {
		return semanticCandidateExpression;
	}

}
