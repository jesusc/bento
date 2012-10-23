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
 *   <li>{@link gbind.dsl.impl.BindingModelImpl#getMetamodelURI <em>Metamodel URI</em>}</li>
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
	 * The default value of the '{@link #getMetamodel() <em>Metamodel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetamodel()
	 * @generated
	 * @ordered
	 */
	protected static final String METAMODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetamodel() <em>Metamodel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetamodel()
	 * @generated
	 * @ordered
	 */
	protected String metamodel = METAMODEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMetamodelURI() <em>Metamodel URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetamodelURI()
	 * @generated
	 * @ordered
	 */
	protected static final String METAMODEL_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetamodelURI() <em>Metamodel URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetamodelURI()
	 * @generated
	 * @ordered
	 */
	protected String metamodelURI = METAMODEL_URI_EDEFAULT;

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
	public String getMetamodel() {
		return metamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetamodel(String newMetamodel) {
		String oldMetamodel = metamodel;
		metamodel = newMetamodel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.BINDING_MODEL__METAMODEL, oldMetamodel, metamodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMetamodelURI() {
		return metamodelURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetamodelURI(String newMetamodelURI) {
		String oldMetamodelURI = metamodelURI;
		metamodelURI = newMetamodelURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.BINDING_MODEL__METAMODEL_URI, oldMetamodelURI, metamodelURI));
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
			case DslPackage.BINDING_MODEL__METAMODEL_URI:
				return getMetamodelURI();
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
				setMetamodel((String)newValue);
				return;
			case DslPackage.BINDING_MODEL__METAMODEL_URI:
				setMetamodelURI((String)newValue);
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
				setMetamodel(METAMODEL_EDEFAULT);
				return;
			case DslPackage.BINDING_MODEL__METAMODEL_URI:
				setMetamodelURI(METAMODEL_URI_EDEFAULT);
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
				return METAMODEL_EDEFAULT == null ? metamodel != null : !METAMODEL_EDEFAULT.equals(metamodel);
			case DslPackage.BINDING_MODEL__METAMODEL_URI:
				return METAMODEL_URI_EDEFAULT == null ? metamodelURI != null : !METAMODEL_URI_EDEFAULT.equals(metamodelURI);
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
		result.append(" (metamodel: ");
		result.append(metamodel);
		result.append(", metamodelURI: ");
		result.append(metamodelURI);
		result.append(", name: ");
		result.append(name);
		result.append(", componentURI: ");
		result.append(componentURI);
		result.append(')');
		return result.toString();
	}

} //BindingModelImpl
