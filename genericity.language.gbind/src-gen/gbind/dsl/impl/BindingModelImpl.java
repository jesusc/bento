/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gbind.dsl.impl;

import gbind.dsl.BaseHelper;
import gbind.dsl.BindingModel;
import gbind.dsl.ConceptBinding;
import gbind.dsl.ConceptMetaclass;
import gbind.dsl.ConcreteMetaclass;
import gbind.dsl.DslPackage;

import gbind.dsl.UsedMetamodel;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gbind.dsl.impl.BindingModelImpl#getBindings <em>Bindings</em>}</li>
 *   <li>{@link gbind.dsl.impl.BindingModelImpl#getHelpers <em>Helpers</em>}</li>
 *   <li>{@link gbind.dsl.impl.BindingModelImpl#getConceptMetaclasses <em>Concept Metaclasses</em>}</li>
 *   <li>{@link gbind.dsl.impl.BindingModelImpl#getConcreteMetaclasses <em>Concrete Metaclasses</em>}</li>
 *   <li>{@link gbind.dsl.impl.BindingModelImpl#getMetamodel <em>Metamodel</em>}</li>
 *   <li>{@link gbind.dsl.impl.BindingModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link gbind.dsl.impl.BindingModelImpl#getComponentURI <em>Component URI</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BindingModelImpl extends EObjectImpl implements BindingModel {
	/**
	 * The cached value of the '{@link #getBindings() <em>Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<ConceptBinding> bindings;

	/**
	 * The cached value of the '{@link #getHelpers() <em>Helpers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelpers()
	 * @generated
	 * @ordered
	 */
	protected EList<BaseHelper> helpers;

	/**
	 * The cached value of the '{@link #getConceptMetaclasses() <em>Concept Metaclasses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConceptMetaclasses()
	 * @generated
	 * @ordered
	 */
	protected EList<ConceptMetaclass> conceptMetaclasses;

	/**
	 * The cached value of the '{@link #getConcreteMetaclasses() <em>Concrete Metaclasses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcreteMetaclasses()
	 * @generated
	 * @ordered
	 */
	protected EList<ConcreteMetaclass> concreteMetaclasses;

	/**
	 * The cached value of the '{@link #getMetamodel() <em>Metamodel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetamodel()
	 * @generated
	 * @ordered
	 */
	protected UsedMetamodel metamodel;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getComponentURI() <em>Component URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentURI()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPONENT_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComponentURI() <em>Component URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentURI()
	 * @generated
	 * @ordered
	 */
	protected String componentURI = COMPONENT_URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslPackage.Literals.BINDING_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConceptBinding> getBindings() {
		if (bindings == null) {
			bindings = new EObjectContainmentWithInverseEList<ConceptBinding>(ConceptBinding.class, this, DslPackage.BINDING_MODEL__BINDINGS, DslPackage.CONCEPT_BINDING__MODEL_);
		}
		return bindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BaseHelper> getHelpers() {
		if (helpers == null) {
			helpers = new EObjectContainmentWithInverseEList<BaseHelper>(BaseHelper.class, this, DslPackage.BINDING_MODEL__HELPERS, DslPackage.BASE_HELPER__MODEL_);
		}
		return helpers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConceptMetaclass> getConceptMetaclasses() {
		if (conceptMetaclasses == null) {
			conceptMetaclasses = new EObjectContainmentEList<ConceptMetaclass>(ConceptMetaclass.class, this, DslPackage.BINDING_MODEL__CONCEPT_METACLASSES);
		}
		return conceptMetaclasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConcreteMetaclass> getConcreteMetaclasses() {
		if (concreteMetaclasses == null) {
			concreteMetaclasses = new EObjectContainmentEList<ConcreteMetaclass>(ConcreteMetaclass.class, this, DslPackage.BINDING_MODEL__CONCRETE_METACLASSES);
		}
		return concreteMetaclasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsedMetamodel getMetamodel() {
		return metamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetamodel(UsedMetamodel newMetamodel, NotificationChain msgs) {
		UsedMetamodel oldMetamodel = metamodel;
		metamodel = newMetamodel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.BINDING_MODEL__METAMODEL, oldMetamodel, newMetamodel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetamodel(UsedMetamodel newMetamodel) {
		if (newMetamodel != metamodel) {
			NotificationChain msgs = null;
			if (metamodel != null)
				msgs = ((InternalEObject)metamodel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.BINDING_MODEL__METAMODEL, null, msgs);
			if (newMetamodel != null)
				msgs = ((InternalEObject)newMetamodel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.BINDING_MODEL__METAMODEL, null, msgs);
			msgs = basicSetMetamodel(newMetamodel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.BINDING_MODEL__METAMODEL, newMetamodel, newMetamodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.BINDING_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComponentURI() {
		return componentURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentURI(String newComponentURI) {
		String oldComponentURI = componentURI;
		componentURI = newComponentURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.BINDING_MODEL__COMPONENT_URI, oldComponentURI, componentURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DslPackage.BINDING_MODEL__BINDINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBindings()).basicAdd(otherEnd, msgs);
			case DslPackage.BINDING_MODEL__HELPERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHelpers()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DslPackage.BINDING_MODEL__BINDINGS:
				return ((InternalEList<?>)getBindings()).basicRemove(otherEnd, msgs);
			case DslPackage.BINDING_MODEL__HELPERS:
				return ((InternalEList<?>)getHelpers()).basicRemove(otherEnd, msgs);
			case DslPackage.BINDING_MODEL__CONCEPT_METACLASSES:
				return ((InternalEList<?>)getConceptMetaclasses()).basicRemove(otherEnd, msgs);
			case DslPackage.BINDING_MODEL__CONCRETE_METACLASSES:
				return ((InternalEList<?>)getConcreteMetaclasses()).basicRemove(otherEnd, msgs);
			case DslPackage.BINDING_MODEL__METAMODEL:
				return basicSetMetamodel(null, msgs);
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
			case DslPackage.BINDING_MODEL__BINDINGS:
				return getBindings();
			case DslPackage.BINDING_MODEL__HELPERS:
				return getHelpers();
			case DslPackage.BINDING_MODEL__CONCEPT_METACLASSES:
				return getConceptMetaclasses();
			case DslPackage.BINDING_MODEL__CONCRETE_METACLASSES:
				return getConcreteMetaclasses();
			case DslPackage.BINDING_MODEL__METAMODEL:
				return getMetamodel();
			case DslPackage.BINDING_MODEL__NAME:
				return getName();
			case DslPackage.BINDING_MODEL__COMPONENT_URI:
				return getComponentURI();
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
			case DslPackage.BINDING_MODEL__BINDINGS:
				getBindings().clear();
				getBindings().addAll((Collection<? extends ConceptBinding>)newValue);
				return;
			case DslPackage.BINDING_MODEL__HELPERS:
				getHelpers().clear();
				getHelpers().addAll((Collection<? extends BaseHelper>)newValue);
				return;
			case DslPackage.BINDING_MODEL__CONCEPT_METACLASSES:
				getConceptMetaclasses().clear();
				getConceptMetaclasses().addAll((Collection<? extends ConceptMetaclass>)newValue);
				return;
			case DslPackage.BINDING_MODEL__CONCRETE_METACLASSES:
				getConcreteMetaclasses().clear();
				getConcreteMetaclasses().addAll((Collection<? extends ConcreteMetaclass>)newValue);
				return;
			case DslPackage.BINDING_MODEL__METAMODEL:
				setMetamodel((UsedMetamodel)newValue);
				return;
			case DslPackage.BINDING_MODEL__NAME:
				setName((String)newValue);
				return;
			case DslPackage.BINDING_MODEL__COMPONENT_URI:
				setComponentURI((String)newValue);
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
			case DslPackage.BINDING_MODEL__BINDINGS:
				getBindings().clear();
				return;
			case DslPackage.BINDING_MODEL__HELPERS:
				getHelpers().clear();
				return;
			case DslPackage.BINDING_MODEL__CONCEPT_METACLASSES:
				getConceptMetaclasses().clear();
				return;
			case DslPackage.BINDING_MODEL__CONCRETE_METACLASSES:
				getConcreteMetaclasses().clear();
				return;
			case DslPackage.BINDING_MODEL__METAMODEL:
				setMetamodel((UsedMetamodel)null);
				return;
			case DslPackage.BINDING_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DslPackage.BINDING_MODEL__COMPONENT_URI:
				setComponentURI(COMPONENT_URI_EDEFAULT);
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
			case DslPackage.BINDING_MODEL__BINDINGS:
				return bindings != null && !bindings.isEmpty();
			case DslPackage.BINDING_MODEL__HELPERS:
				return helpers != null && !helpers.isEmpty();
			case DslPackage.BINDING_MODEL__CONCEPT_METACLASSES:
				return conceptMetaclasses != null && !conceptMetaclasses.isEmpty();
			case DslPackage.BINDING_MODEL__CONCRETE_METACLASSES:
				return concreteMetaclasses != null && !concreteMetaclasses.isEmpty();
			case DslPackage.BINDING_MODEL__METAMODEL:
				return metamodel != null;
			case DslPackage.BINDING_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DslPackage.BINDING_MODEL__COMPONENT_URI:
				return COMPONENT_URI_EDEFAULT == null ? componentURI != null : !COMPONENT_URI_EDEFAULT.equals(componentURI);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", componentURI: ");
		result.append(componentURI);
		result.append(')');
		return result.toString();
	}

} //BindingModelImpl
