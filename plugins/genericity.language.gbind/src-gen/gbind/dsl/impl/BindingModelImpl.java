/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gbind.dsl.impl;

import gbind.dsl.BaseHelper;
import gbind.dsl.BindingModel;
import gbind.dsl.BindingOptions;
import gbind.dsl.ConceptBinding;
import gbind.dsl.ConceptMetaclass;
import gbind.dsl.ConcreteMetaclass;
import gbind.dsl.DslPackage;
import gbind.dsl.MetamodelDeclaration;
import gbind.dsl.VirtualMetaclass;

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
 *   <li>{@link gbind.dsl.impl.BindingModelImpl#isTargetBinding <em>Target Binding</em>}</li>
 *   <li>{@link gbind.dsl.impl.BindingModelImpl#getBindings <em>Bindings</em>}</li>
 *   <li>{@link gbind.dsl.impl.BindingModelImpl#getHelpers <em>Helpers</em>}</li>
 *   <li>{@link gbind.dsl.impl.BindingModelImpl#getConceptMetaclasses <em>Concept Metaclasses</em>}</li>
 *   <li>{@link gbind.dsl.impl.BindingModelImpl#getConcreteMetaclasses <em>Concrete Metaclasses</em>}</li>
 *   <li>{@link gbind.dsl.impl.BindingModelImpl#getVirtualMetaclasses <em>Virtual Metaclasses</em>}</li>
 *   <li>{@link gbind.dsl.impl.BindingModelImpl#getBoundConcept <em>Bound Concept</em>}</li>
 *   <li>{@link gbind.dsl.impl.BindingModelImpl#getBoundMetamodel <em>Bound Metamodel</em>}</li>
 *   <li>{@link gbind.dsl.impl.BindingModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link gbind.dsl.impl.BindingModelImpl#getOptions <em>Options</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BindingModelImpl extends EObjectImpl implements BindingModel {
	/**
	 * The default value of the '{@link #isTargetBinding() <em>Target Binding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTargetBinding()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TARGET_BINDING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTargetBinding() <em>Target Binding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTargetBinding()
	 * @generated
	 * @ordered
	 */
	protected boolean targetBinding = TARGET_BINDING_EDEFAULT;

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
	 * The cached value of the '{@link #getVirtualMetaclasses() <em>Virtual Metaclasses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualMetaclasses()
	 * @generated
	 * @ordered
	 */
	protected EList<VirtualMetaclass> virtualMetaclasses;

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
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected BindingOptions options;

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
	public boolean isTargetBinding() {
		return targetBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetBinding(boolean newTargetBinding) {
		boolean oldTargetBinding = targetBinding;
		targetBinding = newTargetBinding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.BINDING_MODEL__TARGET_BINDING, oldTargetBinding, targetBinding));
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
	public EList<VirtualMetaclass> getVirtualMetaclasses() {
		if (virtualMetaclasses == null) {
			virtualMetaclasses = new EObjectContainmentEList<VirtualMetaclass>(VirtualMetaclass.class, this, DslPackage.BINDING_MODEL__VIRTUAL_METACLASSES);
		}
		return virtualMetaclasses;
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
	public BindingOptions getOptions() {
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOptions(BindingOptions newOptions, NotificationChain msgs) {
		BindingOptions oldOptions = options;
		options = newOptions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.BINDING_MODEL__OPTIONS, oldOptions, newOptions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptions(BindingOptions newOptions) {
		if (newOptions != options) {
			NotificationChain msgs = null;
			if (options != null)
				msgs = ((InternalEObject)options).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.BINDING_MODEL__OPTIONS, null, msgs);
			if (newOptions != null)
				msgs = ((InternalEObject)newOptions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.BINDING_MODEL__OPTIONS, null, msgs);
			msgs = basicSetOptions(newOptions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.BINDING_MODEL__OPTIONS, newOptions, newOptions));
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
			case DslPackage.BINDING_MODEL__VIRTUAL_METACLASSES:
				return ((InternalEList<?>)getVirtualMetaclasses()).basicRemove(otherEnd, msgs);
			case DslPackage.BINDING_MODEL__BOUND_CONCEPT:
				return basicSetBoundConcept(null, msgs);
			case DslPackage.BINDING_MODEL__BOUND_METAMODEL:
				return basicSetBoundMetamodel(null, msgs);
			case DslPackage.BINDING_MODEL__OPTIONS:
				return basicSetOptions(null, msgs);
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
			case DslPackage.BINDING_MODEL__TARGET_BINDING:
				return isTargetBinding();
			case DslPackage.BINDING_MODEL__BINDINGS:
				return getBindings();
			case DslPackage.BINDING_MODEL__HELPERS:
				return getHelpers();
			case DslPackage.BINDING_MODEL__CONCEPT_METACLASSES:
				return getConceptMetaclasses();
			case DslPackage.BINDING_MODEL__CONCRETE_METACLASSES:
				return getConcreteMetaclasses();
			case DslPackage.BINDING_MODEL__VIRTUAL_METACLASSES:
				return getVirtualMetaclasses();
			case DslPackage.BINDING_MODEL__BOUND_CONCEPT:
				return getBoundConcept();
			case DslPackage.BINDING_MODEL__BOUND_METAMODEL:
				return getBoundMetamodel();
			case DslPackage.BINDING_MODEL__NAME:
				return getName();
			case DslPackage.BINDING_MODEL__OPTIONS:
				return getOptions();
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
			case DslPackage.BINDING_MODEL__TARGET_BINDING:
				setTargetBinding((Boolean)newValue);
				return;
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
			case DslPackage.BINDING_MODEL__VIRTUAL_METACLASSES:
				getVirtualMetaclasses().clear();
				getVirtualMetaclasses().addAll((Collection<? extends VirtualMetaclass>)newValue);
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
			case DslPackage.BINDING_MODEL__OPTIONS:
				setOptions((BindingOptions)newValue);
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
			case DslPackage.BINDING_MODEL__TARGET_BINDING:
				setTargetBinding(TARGET_BINDING_EDEFAULT);
				return;
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
			case DslPackage.BINDING_MODEL__VIRTUAL_METACLASSES:
				getVirtualMetaclasses().clear();
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
			case DslPackage.BINDING_MODEL__OPTIONS:
				setOptions((BindingOptions)null);
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
			case DslPackage.BINDING_MODEL__TARGET_BINDING:
				return targetBinding != TARGET_BINDING_EDEFAULT;
			case DslPackage.BINDING_MODEL__BINDINGS:
				return bindings != null && !bindings.isEmpty();
			case DslPackage.BINDING_MODEL__HELPERS:
				return helpers != null && !helpers.isEmpty();
			case DslPackage.BINDING_MODEL__CONCEPT_METACLASSES:
				return conceptMetaclasses != null && !conceptMetaclasses.isEmpty();
			case DslPackage.BINDING_MODEL__CONCRETE_METACLASSES:
				return concreteMetaclasses != null && !concreteMetaclasses.isEmpty();
			case DslPackage.BINDING_MODEL__VIRTUAL_METACLASSES:
				return virtualMetaclasses != null && !virtualMetaclasses.isEmpty();
			case DslPackage.BINDING_MODEL__BOUND_CONCEPT:
				return boundConcept != null;
			case DslPackage.BINDING_MODEL__BOUND_METAMODEL:
				return boundMetamodel != null;
			case DslPackage.BINDING_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DslPackage.BINDING_MODEL__OPTIONS:
				return options != null;
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
		result.append(" (targetBinding: ");
		result.append(targetBinding);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //BindingModelImpl
