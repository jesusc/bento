/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.language.gcomponent.technologies.impl;

import genericity.language.gcomponent.technologies.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TechnologiesFactoryImpl extends EFactoryImpl implements TechnologiesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TechnologiesFactory init() {
		try {
			TechnologiesFactory theTechnologiesFactory = (TechnologiesFactory)EPackage.Registry.INSTANCE.getEFactory("http://genericity/language/gcomponent/technologies"); 
			if (theTechnologiesFactory != null) {
				return theTechnologiesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TechnologiesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TechnologiesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TechnologiesPackage.ATL_TEMPLATE: return createAtlTemplate();
			case TechnologiesPackage.ATL_PARAMETER: return createAtlParameter();
			case TechnologiesPackage.JAVA_TEMPLATE: return createJavaTemplate();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtlTemplate createAtlTemplate() {
		AtlTemplateImpl atlTemplate = new AtlTemplateImpl();
		return atlTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtlParameter createAtlParameter() {
		AtlParameterImpl atlParameter = new AtlParameterImpl();
		return atlParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaTemplate createJavaTemplate() {
		JavaTemplateImpl javaTemplate = new JavaTemplateImpl();
		return javaTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TechnologiesPackage getTechnologiesPackage() {
		return (TechnologiesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TechnologiesPackage getPackage() {
		return TechnologiesPackage.eINSTANCE;
	}

} //TechnologiesFactoryImpl
