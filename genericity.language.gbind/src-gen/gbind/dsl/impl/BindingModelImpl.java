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

import gbind.dsl.MetamodelDeclaration;
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
 *   <li>{@link gbind.dsl.impl.BindingModelImpl#getBoundConcept <em>Bound Concept</em>}</li>
 *   <li>{@link gbind.dsl.impl.BindingModelImpl#getBoundMetamodel <em>Bound Metamodel</em>}</li>
 *   <li>{@link gbind.dsl.impl.BindingModelImpl#getName <em>Name</em>}</li>
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
	 * The cached value of the '{@link #getBoundConcept() <em>Bound Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundConcept()
	 * @generated
	 * @ordered
	 */
	protected MetamodelDeclaration boundConcept;

	/**
	 * The cached value of the '{@link #getBoundMetamodel() <em>Bound Metamodel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundMetamodel()
	 * @generated
	 * @ordered
	 */
	protected MetamodelDeclaration boundMetamodel;

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
	public MetamodelDeclaration getBoundConcept() {
		return boundConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoundConcept(MetamodelDeclaration newBoundConcept, NotificationChain msgs) {
		MetamodelDeclaration oldBoundConcept = boundConcept;
		boundConcept = newBoundConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.BINDING_MODEL__BOUND_CONCEPT, oldBoundConcept, newBoundConcept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoundConcept(MetamodelDeclaration newBoundConcept) {
		if (newBoundConcept != boundConcept) {
			NotificationChain msgs = null;
			if (boundConcept != null)
				msgs = ((InternalEObject)boundConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.BINDING_MODEL__BOUND_CONCEPT, null, msgs);
			if (newBoundConcept != null)
				msgs = ((InternalEObject)newBoundConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.BINDING_MODEL__BOUND_CONCEPT, null, msgs);
			msgs = basicSetBoundConcept(newBoundConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.BINDING_MODEL__BOUND_CONCEPT, newBoundConcept, newBoundConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelDeclaration getBoundMetamodel() {
		return boundMetamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoundMetamodel(MetamodelDeclaration newBoundMetamodel, NotificationChain msgs) {
		MetamodelDeclaration oldBoundMetamodel = boundMetamodel;
		boundMetamodel = newBoundMetamodel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.BINDING_MODEL__BOUND_METAMODEL, oldBoundMetamodel, newBoundMetamodel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoundMetamodel(MetamodelDeclaration newBoundMetamodel) {
		if (newBoundMetamodel != boundMetamodel) {
			NotificationChain msgs = null;
			if (boundMetamodel != null)
				msgs = ((InternalEObject)boundMetamodel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.BINDING_MODEL__BOUND_METAMODEL, null, msgs);
			if (newBoundMetamodel != null)
				msgs = ((InternalEObject)newBoundMetamodel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.BINDING_MODEL__BOUND_METAMODEL, null, msgs);
			msgs = basicSetBoundMetamodel(newBoundMetamodel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.BINDING_MODEL__BOUND_METAMODEL, newBoundMetamodel, newBoundMetamodel));
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
			case DslPackage.BINDING_MODEL__BOUND_CONCEPT:
				return basicSetBoundConcept(null, msgs);
			case DslPackage.BINDING_MODEL__BOUND_METAMODEL:
				return basicSetBoundMetamodel(null, msgs);
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
			case DslPackage.BINDING_MODEL__BOUND_CONCEPT:
				return getBoundConcept();
			case DslPackage.BINDING_MODEL__BOUND_METAMODEL:
				return getBoundMetamodel();
			case DslPackage.BINDING_MODEL__NAME:
				return getName();
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
			case DslPackage.BINDING_MODEL__BOUND_CONCEPT:
				setBoundConcept((MetamodelDeclaration)newValue);
				return;
			case DslPackage.BINDING_MODEL__BOUND_METAMODEL:
				setBoundMetamodel((MetamodelDeclaration)newValue);
				return;
			case DslPackage.BINDING_MODEL__NAME:
				setName((String)newValue);
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
			case DslPackage.BINDING_MODEL__BOUND_CONCEPT:
				setBoundConcept((MetamodelDeclaration)null);
				return;
			case DslPackage.BINDING_MODEL__BOUND_METAMODEL:
				setBoundMetamodel((MetamodelDeclaration)null);
				return;
			case DslPackage.BINDING_MODEL__NAME:
				setName(NAME_EDEFAULT);
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
			case DslPackage.BINDING_MODEL__BOUND_CONCEPT:
				return boundConcept != null;
			case DslPackage.BINDING_MODEL__BOUND_METAMODEL:
				return boundMetamodel != null;
			case DslPackage.BINDING_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(')');
		return result.toString();
	}

} //BindingModelImpl
