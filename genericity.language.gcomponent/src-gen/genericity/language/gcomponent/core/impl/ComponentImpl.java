/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.language.gcomponent.core.impl;

import genericity.language.gcomponent.core.Component;
import genericity.language.gcomponent.core.Concept;
import genericity.language.gcomponent.core.CorePackage;
import genericity.language.gcomponent.core.GeneratedModel;
import genericity.language.gcomponent.core.ParameterModel;
import genericity.language.gcomponent.core.Status;

import genericity.language.gcomponent.variants.Parameter;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link genericity.language.gcomponent.core.impl.ComponentImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link genericity.language.gcomponent.core.impl.ComponentImpl#getMaintainer <em>Maintainer</em>}</li>
 *   <li>{@link genericity.language.gcomponent.core.impl.ComponentImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link genericity.language.gcomponent.core.impl.ComponentImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link genericity.language.gcomponent.core.impl.ComponentImpl#getSource <em>Source</em>}</li>
 *   <li>{@link genericity.language.gcomponent.core.impl.ComponentImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link genericity.language.gcomponent.core.impl.ComponentImpl#getSourceModels <em>Source Models</em>}</li>
 *   <li>{@link genericity.language.gcomponent.core.impl.ComponentImpl#getTargetModels <em>Target Models</em>}</li>
 *   <li>{@link genericity.language.gcomponent.core.impl.ComponentImpl#getGenerateModels <em>Generate Models</em>}</li>
 *   <li>{@link genericity.language.gcomponent.core.impl.ComponentImpl#getFormalParameters <em>Formal Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ComponentImpl extends NamedElementImpl implements Component {
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
	 * The default value of the '{@link #getMaintainer() <em>Maintainer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaintainer()
	 * @generated
	 * @ordered
	 */
	protected static final String MAINTAINER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaintainer() <em>Maintainer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaintainer()
	 * @generated
	 * @ordered
	 */
	protected String maintainer = MAINTAINER_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

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
	public String getMaintainer() {
		return maintainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaintainer(String newMaintainer) {
		String oldMaintainer = maintainer;
		maintainer = newMaintainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.COMPONENT__MAINTAINER, oldMaintainer, maintainer));
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
			case CorePackage.COMPONENT__OWNER:
				return getOwner();
			case CorePackage.COMPONENT__MAINTAINER:
				return getMaintainer();
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
			case CorePackage.COMPONENT__OWNER:
				setOwner((String)newValue);
				return;
			case CorePackage.COMPONENT__MAINTAINER:
				setMaintainer((String)newValue);
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
			case CorePackage.COMPONENT__OWNER:
				setOwner(OWNER_EDEFAULT);
				return;
			case CorePackage.COMPONENT__MAINTAINER:
				setMaintainer(MAINTAINER_EDEFAULT);
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
			case CorePackage.COMPONENT__OWNER:
				return OWNER_EDEFAULT == null ? owner != null : !OWNER_EDEFAULT.equals(owner);
			case CorePackage.COMPONENT__MAINTAINER:
				return MAINTAINER_EDEFAULT == null ? maintainer != null : !MAINTAINER_EDEFAULT.equals(maintainer);
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (owner: ");
		result.append(owner);
		result.append(", maintainer: ");
		result.append(maintainer);
		result.append(", version: ");
		result.append(version);
		result.append(", status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl
