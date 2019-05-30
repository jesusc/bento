package com.odesign.generator.values;

public class EdgeCreationIntemediateElement {

	private static String changeContextExpression = "[source.eContainer()/]";
	private static String FeatureElementSet1 = "metamodElelement";
	private static String FeatureElementSet2 = "bindingElement";
	private static String valueExpressionSet1 = "[source/]";
	private static String valueExpressionSet2 = "[target/]";

	public static String getChangeContextExpression() {
		return changeContextExpression;
	}

	public static String getFeatureElementSet1() {
		return FeatureElementSet1;
	}

	public static String getFeatureElementSet2() {
		return FeatureElementSet2;
	}

	public static String getValueExpressionSet1() {
		return valueExpressionSet1;
	}

	public static String getValueExpressionSet2() {
		return valueExpressionSet2;
	}

}
