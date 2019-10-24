/**
 */
package metamodel_bdsl.impl;

import java.util.Collection;

import metamodel_bdsl.Metamodel_bdslPackage;
import metamodel_bdsl.Query;
import metamodel_bdsl.QueryType;
import metamodel_bdsl.errorQuery;
import metamodel_bdsl.nameQuery;
import metamodel_bdsl.systemQuery;
import metamodel_bdsl.typeQuery;
import metamodel_bdsl.valueQuery;

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
 * An implementation of the model object '<em><b>Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metamodel_bdsl.impl.QueryImpl#getName <em>Name</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.QueryImpl#getValue <em>Value</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.QueryImpl#getError <em>Error</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.QueryImpl#getType <em>Type</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.QueryImpl#isSystem <em>System</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.QueryImpl#getContainsnameQuery <em>Containsname Query</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.QueryImpl#getContainsvalueQuery <em>Containsvalue Query</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.QueryImpl#getContainserrorQuery <em>Containserror Query</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.QueryImpl#getContainstypeQuery <em>Containstype Query</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.QueryImpl#getContainssystemQuery <em>Containssystem Query</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QueryImpl extends BindingElementImpl implements Query {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "query";

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
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getError() <em>Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getError()
	 * @generated
	 * @ordered
	 */
	protected static final String ERROR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getError() <em>Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getError()
	 * @generated
	 * @ordered
	 */
	protected String error = ERROR_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final QueryType TYPE_EDEFAULT = QueryType.UNDEFINED;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected QueryType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isSystem() <em>System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSystem()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SYSTEM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSystem() <em>System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSystem()
	 * @generated
	 * @ordered
	 */
	protected boolean system = SYSTEM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContainsnameQuery() <em>Containsname Query</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsnameQuery()
	 * @generated
	 * @ordered
	 */
	protected EList<nameQuery> containsnameQuery;

	/**
	 * The cached value of the '{@link #getContainsvalueQuery() <em>Containsvalue Query</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsvalueQuery()
	 * @generated
	 * @ordered
	 */
	protected EList<valueQuery> containsvalueQuery;

	/**
	 * The cached value of the '{@link #getContainserrorQuery() <em>Containserror Query</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainserrorQuery()
	 * @generated
	 * @ordered
	 */
	protected EList<errorQuery> containserrorQuery;

	/**
	 * The cached value of the '{@link #getContainstypeQuery() <em>Containstype Query</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainstypeQuery()
	 * @generated
	 * @ordered
	 */
	protected EList<typeQuery> containstypeQuery;

	/**
	 * The cached value of the '{@link #getContainssystemQuery() <em>Containssystem Query</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainssystemQuery()
	 * @generated
	 * @ordered
	 */
	protected EList<systemQuery> containssystemQuery;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Metamodel_bdslPackage.Literals.QUERY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.QUERY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.QUERY__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getError() {
		return error;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setError(String newError) {
		String oldError = error;
		error = newError;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.QUERY__ERROR, oldError, error));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(QueryType newType) {
		QueryType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.QUERY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSystem() {
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem(boolean newSystem) {
		boolean oldSystem = system;
		system = newSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.QUERY__SYSTEM, oldSystem, system));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<nameQuery> getContainsnameQuery() {
		if (containsnameQuery == null) {
			containsnameQuery = new EObjectContainmentEList<nameQuery>(nameQuery.class, this, Metamodel_bdslPackage.QUERY__CONTAINSNAME_QUERY);
		}
		return containsnameQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<valueQuery> getContainsvalueQuery() {
		if (containsvalueQuery == null) {
			containsvalueQuery = new EObjectContainmentEList<valueQuery>(valueQuery.class, this, Metamodel_bdslPackage.QUERY__CONTAINSVALUE_QUERY);
		}
		return containsvalueQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<errorQuery> getContainserrorQuery() {
		if (containserrorQuery == null) {
			containserrorQuery = new EObjectContainmentEList<errorQuery>(errorQuery.class, this, Metamodel_bdslPackage.QUERY__CONTAINSERROR_QUERY);
		}
		return containserrorQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<typeQuery> getContainstypeQuery() {
		if (containstypeQuery == null) {
			containstypeQuery = new EObjectContainmentEList<typeQuery>(typeQuery.class, this, Metamodel_bdslPackage.QUERY__CONTAINSTYPE_QUERY);
		}
		return containstypeQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<systemQuery> getContainssystemQuery() {
		if (containssystemQuery == null) {
			containssystemQuery = new EObjectContainmentEList<systemQuery>(systemQuery.class, this, Metamodel_bdslPackage.QUERY__CONTAINSSYSTEM_QUERY);
		}
		return containssystemQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Metamodel_bdslPackage.QUERY__CONTAINSNAME_QUERY:
				return ((InternalEList<?>)getContainsnameQuery()).basicRemove(otherEnd, msgs);
			case Metamodel_bdslPackage.QUERY__CONTAINSVALUE_QUERY:
				return ((InternalEList<?>)getContainsvalueQuery()).basicRemove(otherEnd, msgs);
			case Metamodel_bdslPackage.QUERY__CONTAINSERROR_QUERY:
				return ((InternalEList<?>)getContainserrorQuery()).basicRemove(otherEnd, msgs);
			case Metamodel_bdslPackage.QUERY__CONTAINSTYPE_QUERY:
				return ((InternalEList<?>)getContainstypeQuery()).basicRemove(otherEnd, msgs);
			case Metamodel_bdslPackage.QUERY__CONTAINSSYSTEM_QUERY:
				return ((InternalEList<?>)getContainssystemQuery()).basicRemove(otherEnd, msgs);
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
			case Metamodel_bdslPackage.QUERY__NAME:
				return getName();
			case Metamodel_bdslPackage.QUERY__VALUE:
				return getValue();
			case Metamodel_bdslPackage.QUERY__ERROR:
				return getError();
			case Metamodel_bdslPackage.QUERY__TYPE:
				return getType();
			case Metamodel_bdslPackage.QUERY__SYSTEM:
				return isSystem();
			case Metamodel_bdslPackage.QUERY__CONTAINSNAME_QUERY:
				return getContainsnameQuery();
			case Metamodel_bdslPackage.QUERY__CONTAINSVALUE_QUERY:
				return getContainsvalueQuery();
			case Metamodel_bdslPackage.QUERY__CONTAINSERROR_QUERY:
				return getContainserrorQuery();
			case Metamodel_bdslPackage.QUERY__CONTAINSTYPE_QUERY:
				return getContainstypeQuery();
			case Metamodel_bdslPackage.QUERY__CONTAINSSYSTEM_QUERY:
				return getContainssystemQuery();
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
			case Metamodel_bdslPackage.QUERY__NAME:
				setName((String)newValue);
				return;
			case Metamodel_bdslPackage.QUERY__VALUE:
				setValue((String)newValue);
				return;
			case Metamodel_bdslPackage.QUERY__ERROR:
				setError((String)newValue);
				return;
			case Metamodel_bdslPackage.QUERY__TYPE:
				setType((QueryType)newValue);
				return;
			case Metamodel_bdslPackage.QUERY__SYSTEM:
				setSystem((Boolean)newValue);
				return;
			case Metamodel_bdslPackage.QUERY__CONTAINSNAME_QUERY:
				getContainsnameQuery().clear();
				getContainsnameQuery().addAll((Collection<? extends nameQuery>)newValue);
				return;
			case Metamodel_bdslPackage.QUERY__CONTAINSVALUE_QUERY:
				getContainsvalueQuery().clear();
				getContainsvalueQuery().addAll((Collection<? extends valueQuery>)newValue);
				return;
			case Metamodel_bdslPackage.QUERY__CONTAINSERROR_QUERY:
				getContainserrorQuery().clear();
				getContainserrorQuery().addAll((Collection<? extends errorQuery>)newValue);
				return;
			case Metamodel_bdslPackage.QUERY__CONTAINSTYPE_QUERY:
				getContainstypeQuery().clear();
				getContainstypeQuery().addAll((Collection<? extends typeQuery>)newValue);
				return;
			case Metamodel_bdslPackage.QUERY__CONTAINSSYSTEM_QUERY:
				getContainssystemQuery().clear();
				getContainssystemQuery().addAll((Collection<? extends systemQuery>)newValue);
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
			case Metamodel_bdslPackage.QUERY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Metamodel_bdslPackage.QUERY__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case Metamodel_bdslPackage.QUERY__ERROR:
				setError(ERROR_EDEFAULT);
				return;
			case Metamodel_bdslPackage.QUERY__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case Metamodel_bdslPackage.QUERY__SYSTEM:
				setSystem(SYSTEM_EDEFAULT);
				return;
			case Metamodel_bdslPackage.QUERY__CONTAINSNAME_QUERY:
				getContainsnameQuery().clear();
				return;
			case Metamodel_bdslPackage.QUERY__CONTAINSVALUE_QUERY:
				getContainsvalueQuery().clear();
				return;
			case Metamodel_bdslPackage.QUERY__CONTAINSERROR_QUERY:
				getContainserrorQuery().clear();
				return;
			case Metamodel_bdslPackage.QUERY__CONTAINSTYPE_QUERY:
				getContainstypeQuery().clear();
				return;
			case Metamodel_bdslPackage.QUERY__CONTAINSSYSTEM_QUERY:
				getContainssystemQuery().clear();
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
			case Metamodel_bdslPackage.QUERY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Metamodel_bdslPackage.QUERY__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case Metamodel_bdslPackage.QUERY__ERROR:
				return ERROR_EDEFAULT == null ? error != null : !ERROR_EDEFAULT.equals(error);
			case Metamodel_bdslPackage.QUERY__TYPE:
				return type != TYPE_EDEFAULT;
			case Metamodel_bdslPackage.QUERY__SYSTEM:
				return system != SYSTEM_EDEFAULT;
			case Metamodel_bdslPackage.QUERY__CONTAINSNAME_QUERY:
				return containsnameQuery != null && !containsnameQuery.isEmpty();
			case Metamodel_bdslPackage.QUERY__CONTAINSVALUE_QUERY:
				return containsvalueQuery != null && !containsvalueQuery.isEmpty();
			case Metamodel_bdslPackage.QUERY__CONTAINSERROR_QUERY:
				return containserrorQuery != null && !containserrorQuery.isEmpty();
			case Metamodel_bdslPackage.QUERY__CONTAINSTYPE_QUERY:
				return containstypeQuery != null && !containstypeQuery.isEmpty();
			case Metamodel_bdslPackage.QUERY__CONTAINSSYSTEM_QUERY:
				return containssystemQuery != null && !containssystemQuery.isEmpty();
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", value: ");
		result.append(value);
		result.append(", error: ");
		result.append(error);
		result.append(", type: ");
		result.append(type);
		result.append(", system: ");
		result.append(system);
		result.append(')');
		return result.toString();
	}

} //QueryImpl
