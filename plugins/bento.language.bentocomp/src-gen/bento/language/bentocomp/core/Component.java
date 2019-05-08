/**
 */
package bento.language.bentocomp.core;

import bento.language.bentocomp.variants.Parameter;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bento.language.bentocomp.core.Component#getOwner <em>Owner</em>}</li>
 *   <li>{@link bento.language.bentocomp.core.Component#getContributors <em>Contributors</em>}</li>
 *   <li>{@link bento.language.bentocomp.core.Component#getVersion <em>Version</em>}</li>
 *   <li>{@link bento.language.bentocomp.core.Component#getStatus <em>Status</em>}</li>
 *   <li>{@link bento.language.bentocomp.core.Component#getSource <em>Source</em>}</li>
 *   <li>{@link bento.language.bentocomp.core.Component#getTarget <em>Target</em>}</li>
 *   <li>{@link bento.language.bentocomp.core.Component#getSourceModels <em>Source Models</em>}</li>
 *   <li>{@link bento.language.bentocomp.core.Component#getTargetModels <em>Target Models</em>}</li>
 *   <li>{@link bento.language.bentocomp.core.Component#getGenerateModels <em>Generate Models</em>}</li>
 *   <li>{@link bento.language.bentocomp.core.Component#getFormalParameters <em>Formal Parameters</em>}</li>
 * </ul>
 *
 * @see bento.language.bentocomp.core.CorePackage#getComponent()
 * @model abstract="true"
 * @generated
 */
public interface Component extends NamedElement, Tagged {
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' attribute.
	 * @see #setOwner(String)
	 * @see bento.language.bentocomp.core.CorePackage#getComponent_Owner()
	 * @model
	 * @generated
	 */
	String getOwner();

	/**
	 * Sets the value of the '{@link bento.language.bentocomp.core.Component#getOwner <em>Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' attribute.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(String value);

	/**
	 * Returns the value of the '<em><b>Contributors</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contributors</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contributors</em>' attribute list.
	 * @see bento.language.bentocomp.core.CorePackage#getComponent_Contributors()
	 * @model
	 * @generated
	 */
	EList<String> getContributors();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see bento.language.bentocomp.core.CorePackage#getComponent_Version()
	 * @model default="0" required="true"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link bento.language.bentocomp.core.Component#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link bento.language.bentocomp.core.Status}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see bento.language.bentocomp.core.Status
	 * @see #setStatus(Status)
	 * @see bento.language.bentocomp.core.CorePackage#getComponent_Status()
	 * @model required="true"
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link bento.language.bentocomp.core.Component#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see bento.language.bentocomp.core.Status
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference list.
	 * The list contents are of type {@link bento.language.bentocomp.core.Concept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference list.
	 * @see bento.language.bentocomp.core.CorePackage#getComponent_Source()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Concept> getSource();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference list.
	 * The list contents are of type {@link bento.language.bentocomp.core.Concept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference list.
	 * @see bento.language.bentocomp.core.CorePackage#getComponent_Target()
	 * @model containment="true"
	 * @generated
	 */
	EList<Concept> getTarget();

	/**
	 * Returns the value of the '<em><b>Source Models</b></em>' containment reference list.
	 * The list contents are of type {@link bento.language.bentocomp.core.ParameterModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Models</em>' containment reference list.
	 * @see bento.language.bentocomp.core.CorePackage#getComponent_SourceModels()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterModel> getSourceModels();

	/**
	 * Returns the value of the '<em><b>Target Models</b></em>' containment reference list.
	 * The list contents are of type {@link bento.language.bentocomp.core.ParameterModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Models</em>' containment reference list.
	 * @see bento.language.bentocomp.core.CorePackage#getComponent_TargetModels()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterModel> getTargetModels();

	/**
	 * Returns the value of the '<em><b>Generate Models</b></em>' containment reference list.
	 * The list contents are of type {@link bento.language.bentocomp.core.GeneratedModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generate Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generate Models</em>' containment reference list.
	 * @see bento.language.bentocomp.core.CorePackage#getComponent_GenerateModels()
	 * @model containment="true"
	 * @generated
	 */
	EList<GeneratedModel> getGenerateModels();

	/**
	 * Returns the value of the '<em><b>Formal Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link bento.language.bentocomp.variants.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formal Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formal Parameters</em>' containment reference list.
	 * @see bento.language.bentocomp.core.CorePackage#getComponent_FormalParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getFormalParameters();

} // Component
