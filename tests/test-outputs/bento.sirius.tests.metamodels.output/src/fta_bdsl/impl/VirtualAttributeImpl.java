/**
 */
package fta_bdsl.impl;

import fta_bdsl.BindingAttribute;
import fta_bdsl.Fta_bdslPackage;
import fta_bdsl.VirtualAttribute;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtual Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fta_bdsl.impl.VirtualAttributeImpl#getTo_virtualAttribute <em>To virtual Attribute</em>}</li>
 *   <li>{@link fta_bdsl.impl.VirtualAttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link fta_bdsl.impl.VirtualAttributeImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VirtualAttributeImpl extends MinimalEObjectImpl.Container implements VirtualAttribute {
	/**
	 * The cached value of the '{@link #getTo_virtualAttribute() <em>To virtual Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo_virtualAttribute()
	 * @generated
	 * @ordered
	 */
	protected BindingAttribute to_virtualAttribute;

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
	 * The default value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected String expression = EXPRESSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Fta_bdslPackage.Literals.VIRTUAL_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BindingAttribute getTo_virtualAttribute() {
		if (to_virtualAttribute != null && to_virtualAttribute.eIsProxy()) {
			InternalEObject oldTo_virtualAttribute = (InternalEObject)to_virtualAttribute;
			to_virtualAttribute = (BindingAttribute)eResolveProxy(oldTo_virtualAttribute);
			if (to_virtualAttribute != oldTo_virtualAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fta_bdslPackage.VIRTUAL_ATTRIBUTE__TO_VIRTUAL_ATTRIBUTE, oldTo_virtualAttribute, to_virtualAttribute));
			}
		}
		return to_virtualAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingAttribute basicGetTo_virtualAttribute() {
		return to_virtualAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTo_virtualAttribute(BindingAttribute newTo_virtualAttribute) {
		BindingAttribute oldTo_virtualAttribute = to_virtualAttribute;
		to_virtualAttribute = newTo_virtualAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_bdslPackage.VIRTUAL_ATTRIBUTE__TO_VIRTUAL_ATTRIBUTE, oldTo_virtualAttribute, to_virtualAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_bdslPackage.VIRTUAL_ATTRIBUTE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpression(String newExpression) {
		String oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fta_bdslPackage.VIRTUAL_ATTRIBUTE__EXPRESSION, oldExpression, expression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Fta_bdslPackage.VIRTUAL_ATTRIBUTE__TO_VIRTUAL_ATTRIBUTE:
				if (resolve) return getTo_virtualAttribute();
				return basicGetTo_virtualAttribute();
			case Fta_bdslPackage.VIRTUAL_ATTRIBUTE__NAME:
				return getName();
			case Fta_bdslPackage.VIRTUAL_ATTRIBUTE__EXPRESSION:
				return getExpression();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Fta_bdslPackage.VIRTUAL_ATTRIBUTE__TO_VIRTUAL_ATTRIBUTE:
				setTo_virtualAttribute((BindingAttribute)newValue);
				return;
			case Fta_bdslPackage.VIRTUAL_ATTRIBUTE__NAME:
				setName((String)newValue);
				return;
			case Fta_bdslPackage.VIRTUAL_ATTRIBUTE__EXPRESSION:
				setExpression((String)newValue);
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
			case Fta_bdslPackage.VIRTUAL_ATTRIBUTE__TO_VIRTUAL_ATTRIBUTE:
				setTo_virtualAttribute((BindingAttribute)null);
				return;
			case Fta_bdslPackage.VIRTUAL_ATTRIBUTE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Fta_bdslPackage.VIRTUAL_ATTRIBUTE__EXPRESSION:
				setExpression(EXPRESSION_EDEFAULT);
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
			case Fta_bdslPackage.VIRTUAL_ATTRIBUTE__TO_VIRTUAL_ATTRIBUTE:
				return to_virtualAttribute != null;
			case Fta_bdslPackage.VIRTUAL_ATTRIBUTE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Fta_bdslPackage.VIRTUAL_ATTRIBUTE__EXPRESSION:
				return EXPRESSION_EDEFAULT == null ? expression != null : !EXPRESSION_EDEFAULT.equals(expression);
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
		result.append(", Expression: ");
		result.append(expression);
		result.append(')');
		return result.toString();
	}

} //VirtualAttributeImpl
