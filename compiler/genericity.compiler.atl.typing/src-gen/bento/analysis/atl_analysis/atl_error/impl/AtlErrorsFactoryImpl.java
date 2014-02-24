/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bento.analysis.atl_analysis.atl_error.impl;

import bento.analysis.atl_analysis.atl_error.*;

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
public class AtlErrorsFactoryImpl extends EFactoryImpl implements AtlErrorsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AtlErrorsFactory init() {
		try {
			AtlErrorsFactory theAtlErrorsFactory = (AtlErrorsFactory)EPackage.Registry.INSTANCE.getEFactory("http://bento/analysis/atl/analysis/errors"); 
			if (theAtlErrorsFactory != null) {
				return theAtlErrorsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AtlErrorsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtlErrorsFactoryImpl() {
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
			case AtlErrorsPackage.COLLECTION_OPERATION_OVER_NO_COLLECTION_ERROR: return createCollectionOperationOverNoCollectionError();
			case AtlErrorsPackage.FEATURE_NOT_FOUND: return createFeatureNotFound();
			case AtlErrorsPackage.INVALID_OPERAND: return createInvalidOperand();
			case AtlErrorsPackage.NO_CONTAINER_FOR_REF_IMMEDIATE_COMPOSITE: return createNoContainerForRefImmediateComposite();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionOperationOverNoCollectionError createCollectionOperationOverNoCollectionError() {
		CollectionOperationOverNoCollectionErrorImpl collectionOperationOverNoCollectionError = new CollectionOperationOverNoCollectionErrorImpl();
		return collectionOperationOverNoCollectionError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureNotFound createFeatureNotFound() {
		FeatureNotFoundImpl featureNotFound = new FeatureNotFoundImpl();
		return featureNotFound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvalidOperand createInvalidOperand() {
		InvalidOperandImpl invalidOperand = new InvalidOperandImpl();
		return invalidOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoContainerForRefImmediateComposite createNoContainerForRefImmediateComposite() {
		NoContainerForRefImmediateCompositeImpl noContainerForRefImmediateComposite = new NoContainerForRefImmediateCompositeImpl();
		return noContainerForRefImmediateComposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtlErrorsPackage getAtlErrorsPackage() {
		return (AtlErrorsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AtlErrorsPackage getPackage() {
		return AtlErrorsPackage.eINSTANCE;
	}

} //AtlErrorsFactoryImpl
