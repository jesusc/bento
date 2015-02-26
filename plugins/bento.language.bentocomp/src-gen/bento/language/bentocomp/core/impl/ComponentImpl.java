/**
 */
package bento.language.bentocomp.core.impl;

import bento.language.bentocomp.core.Component;
import bento.language.bentocomp.core.Concept;
import bento.language.bentocomp.core.CorePackage;
import bento.language.bentocomp.core.GeneratedModel;
import bento.language.bentocomp.core.ParameterModel;
import bento.language.bentocomp.core.Status;

import bento.language.bentocomp.core.Tag;
import bento.language.bentocomp.core.Tagged;
import bento.language.bentocomp.variants.Parameter;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bento.language.bentocomp.core.impl.ComponentImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link bento.language.bentocomp.core.impl.ComponentImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link bento.language.bentocomp.core.impl.ComponentImpl#getContributors <em>Contributors</em>}</li>
 *   <li>{@link bento.language.bentocomp.core.impl.ComponentImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link bento.language.bentocomp.core.impl.ComponentImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link bento.language.bentocomp.core.impl.ComponentImpl#getSource <em>Source</em>}</li>
 *   <li>{@link bento.language.bentocomp.core.impl.ComponentImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link bento.language.bentocomp.core.impl.ComponentImpl#getSourceModels <em>Source Models</em>}</li>
 *   <li>{@link bento.language.bentocomp.core.impl.ComponentImpl#getTargetModels <em>Target Models</em>}</li>
 *   <li>{@link bento.language.bentocomp.core.impl.ComponentImpl#getGenerateModels <em>Generate Models</em>}</li>
 *   <li>{@link bento.language.bentocomp.core.impl.ComponentImpl#getFormalParameters <em>Formal Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ComponentImpl extends NamedElementImpl implements Component {
	/**
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected EList<Tag> tags;

	/**
	 * The default value of the '{@link #getOwner() <em>Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected static final String OWNER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected String owner = OWNER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContributors() <em>Contributors</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContributors()
	 * @generated
	 * @ordered
	 */
	protected EList<String> contributors;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = "0";

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final Status STATUS_EDEFAULT = Status.UNKNOWN;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Status status = STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EList<Concept> source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<Concept> target;

	/**
	 * The cached value of the '{@link #getSourceModels() <em>Source Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceModels()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterModel> sourceModels;

	/**
	 * The cached value of the '{@link #getTargetModels() <em>Target Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetModels()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterModel> targetModels;

	/**
	 * The cached value of the '{@link #getGenerateModels() <em>Generate Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerateModels()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneratedModel> generateModels;

	/**
	 * The cached value of the '{@link #getFormalParameters() <em>Formal Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormalParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> formalParameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tag> getTags() {
		if (tags == null) {
			tags = new EObjectContainmentEList<Tag>(Tag.class, this, CorePackage.COMPONENT__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(String newOwner) {
		String oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.COMPONENT__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getContributors() {
		if (contributors == null) {
			contributors = new EDataTypeUniqueEList<String>(String.class, this, CorePackage.COMPONENT__CONTRIBUTORS);
		}
		return contributors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.COMPONENT__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(Status newStatus) {
		Status oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.COMPONENT__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Concept> getSource() {
		if (source == null) {
			source = new EObjectContainmentEList<Concept>(Concept.class, this, CorePackage.COMPONENT__SOURCE);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Concept> getTarget() {
		if (target == null) {
			target = new EObjectContainmentEList<Concept>(Concept.class, this, CorePackage.COMPONENT__TARGET);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterModel> getSourceModels() {
		if (sourceModels == null) {
			sourceModels = new EObjectContainmentEList<ParameterModel>(ParameterModel.class, this, CorePackage.COMPONENT__SOURCE_MODELS);
		}
		return sourceModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterModel> getTargetModels() {
		if (targetModels == null) {
			targetModels = new EObjectContainmentEList<ParameterModel>(ParameterModel.class, this, CorePackage.COMPONENT__TARGET_MODELS);
		}
		return targetModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneratedModel> getGenerateModels() {
		if (generateModels == null) {
			generateModels = new EObjectContainmentEList<GeneratedModel>(GeneratedModel.class, this, CorePackage.COMPONENT__GENERATE_MODELS);
		}
		return generateModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getFormalParameters() {
		if (formalParameters == null) {
			formalParameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, CorePackage.COMPONENT__FORMAL_PARAMETERS);
		}
		return formalParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.COMPONENT__TAGS:
				return ((InternalEList<?>)getTags()).basicRemove(otherEnd, msgs);
			case CorePackage.COMPONENT__SOURCE:
				return ((InternalEList<?>)getSource()).basicRemove(otherEnd, msgs);
			case CorePackage.COMPONENT__TARGET:
				return ((InternalEList<?>)getTarget()).basicRemove(otherEnd, msgs);
			case CorePackage.COMPONENT__SOURCE_MODELS:
				return ((InternalEList<?>)getSourceModels()).basicRemove(otherEnd, msgs);
			case CorePackage.COMPONENT__TARGET_MODELS:
				return ((InternalEList<?>)getTargetModels()).basicRemove(otherEnd, msgs);
			case CorePackage.COMPONENT__GENERATE_MODELS:
				return ((InternalEList<?>)getGenerateModels()).basicRemove(otherEnd, msgs);
			case CorePackage.COMPONENT__FORMAL_PARAMETERS:
				return ((InternalEList<?>)getFormalParameters()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.COMPONENT__TAGS:
				return getTags();
			case CorePackage.COMPONENT__OWNER:
				return getOwner();
			case CorePackage.COMPONENT__CONTRIBUTORS:
				return getContributors();
			case CorePackage.COMPONENT__VERSION:
				return getVersion();
			case CorePackage.COMPONENT__STATUS:
				return getStatus();
			case CorePackage.COMPONENT__SOURCE:
				return getSource();
			case CorePackage.COMPONENT__TARGET:
				return getTarget();
			case CorePackage.COMPONENT__SOURCE_MODELS:
				return getSourceModels();
			case CorePackage.COMPONENT__TARGET_MODELS:
				return getTargetModels();
			case CorePackage.COMPONENT__GENERATE_MODELS:
				return getGenerateModels();
			case CorePackage.COMPONENT__FORMAL_PARAMETERS:
				return getFormalParameters();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.COMPONENT__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends Tag>)newValue);
				return;
			case CorePackage.COMPONENT__OWNER:
				setOwner((String)newValue);
				return;
			case CorePackage.COMPONENT__CONTRIBUTORS:
				getContributors().clear();
				getContributors().addAll((Collection<? extends String>)newValue);
				return;
			case CorePackage.COMPONENT__VERSION:
				setVersion((String)newValue);
				return;
			case CorePackage.COMPONENT__STATUS:
				setStatus((Status)newValue);
				return;
			case CorePackage.COMPONENT__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends Concept>)newValue);
				return;
			case CorePackage.COMPONENT__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends Concept>)newValue);
				return;
			case CorePackage.COMPONENT__SOURCE_MODELS:
				getSourceModels().clear();
				getSourceModels().addAll((Collection<? extends ParameterModel>)newValue);
				return;
			case CorePackage.COMPONENT__TARGET_MODELS:
				getTargetModels().clear();
				getTargetModels().addAll((Collection<? extends ParameterModel>)newValue);
				return;
			case CorePackage.COMPONENT__GENERATE_MODELS:
				getGenerateModels().clear();
				getGenerateModels().addAll((Collection<? extends GeneratedModel>)newValue);
				return;
			case CorePackage.COMPONENT__FORMAL_PARAMETERS:
				getFormalParameters().clear();
				getFormalParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CorePackage.COMPONENT__TAGS:
				getTags().clear();
				return;
			case CorePackage.COMPONENT__OWNER:
				setOwner(OWNER_EDEFAULT);
				return;
			case CorePackage.COMPONENT__CONTRIBUTORS:
				getContributors().clear();
				return;
			case CorePackage.COMPONENT__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case CorePackage.COMPONENT__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case CorePackage.COMPONENT__SOURCE:
				getSource().clear();
				return;
			case CorePackage.COMPONENT__TARGET:
				getTarget().clear();
				return;
			case CorePackage.COMPONENT__SOURCE_MODELS:
				getSourceModels().clear();
				return;
			case CorePackage.COMPONENT__TARGET_MODELS:
				getTargetModels().clear();
				return;
			case CorePackage.COMPONENT__GENERATE_MODELS:
				getGenerateModels().clear();
				return;
			case CorePackage.COMPONENT__FORMAL_PARAMETERS:
				getFormalParameters().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CorePackage.COMPONENT__TAGS:
				return tags != null && !tags.isEmpty();
			case CorePackage.COMPONENT__OWNER:
				return OWNER_EDEFAULT == null ? owner != null : !OWNER_EDEFAULT.equals(owner);
			case CorePackage.COMPONENT__CONTRIBUTORS:
				return contributors != null && !contributors.isEmpty();
			case CorePackage.COMPONENT__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case CorePackage.COMPONENT__STATUS:
				return status != STATUS_EDEFAULT;
			case CorePackage.COMPONENT__SOURCE:
				return source != null && !source.isEmpty();
			case CorePackage.COMPONENT__TARGET:
				return target != null && !target.isEmpty();
			case CorePackage.COMPONENT__SOURCE_MODELS:
				return sourceModels != null && !sourceModels.isEmpty();
			case CorePackage.COMPONENT__TARGET_MODELS:
				return targetModels != null && !targetModels.isEmpty();
			case CorePackage.COMPONENT__GENERATE_MODELS:
				return generateModels != null && !generateModels.isEmpty();
			case CorePackage.COMPONENT__FORMAL_PARAMETERS:
				return formalParameters != null && !formalParameters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Tagged.class) {
			switch (derivedFeatureID) {
				case CorePackage.COMPONENT__TAGS: return CorePackage.TAGGED__TAGS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Tagged.class) {
			switch (baseFeatureID) {
				case CorePackage.TAGGED__TAGS: return CorePackage.COMPONENT__TAGS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (owner: ");
		result.append(owner);
		result.append(", contributors: ");
		result.append(contributors);
		result.append(", version: ");
		result.append(version);
		result.append(", status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl
