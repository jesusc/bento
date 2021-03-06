/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bento.componetization.reveng.impl;

import bento.componetization.reveng.RevengModel;
import bento.componetization.reveng.RevengPackage;
import bento.componetization.reveng.Transformation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bento.componetization.reveng.impl.RevengModelImpl#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link bento.componetization.reveng.impl.RevengModelImpl#getTemplate <em>Template</em>}</li>
 *   <li>{@link bento.componetization.reveng.impl.RevengModelImpl#getComponentPath <em>Component Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RevengModelImpl extends EObjectImpl implements RevengModel {
	/**
	 * The cached value of the '{@link #getTransformation() <em>Transformation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformation()
	 * @generated
	 * @ordered
	 */
	protected Transformation transformation;

	/**
	 * The cached value of the '{@link #getTemplate() <em>Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplate()
	 * @generated
	 * @ordered
	 */
	protected Transformation template;

	/**
	 * The default value of the '{@link #getComponentPath() <em>Component Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentPath()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPONENT_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComponentPath() <em>Component Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentPath()
	 * @generated
	 * @ordered
	 */
	protected String componentPath = COMPONENT_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RevengModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RevengPackage.Literals.REVENG_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transformation getTransformation() {
		return transformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformation(Transformation newTransformation, NotificationChain msgs) {
		Transformation oldTransformation = transformation;
		transformation = newTransformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RevengPackage.REVENG_MODEL__TRANSFORMATION, oldTransformation, newTransformation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformation(Transformation newTransformation) {
		if (newTransformation != transformation) {
			NotificationChain msgs = null;
			if (transformation != null)
				msgs = ((InternalEObject)transformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RevengPackage.REVENG_MODEL__TRANSFORMATION, null, msgs);
			if (newTransformation != null)
				msgs = ((InternalEObject)newTransformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RevengPackage.REVENG_MODEL__TRANSFORMATION, null, msgs);
			msgs = basicSetTransformation(newTransformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RevengPackage.REVENG_MODEL__TRANSFORMATION, newTransformation, newTransformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transformation getTemplate() {
		return template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplate(Transformation newTemplate, NotificationChain msgs) {
		Transformation oldTemplate = template;
		template = newTemplate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RevengPackage.REVENG_MODEL__TEMPLATE, oldTemplate, newTemplate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplate(Transformation newTemplate) {
		if (newTemplate != template) {
			NotificationChain msgs = null;
			if (template != null)
				msgs = ((InternalEObject)template).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RevengPackage.REVENG_MODEL__TEMPLATE, null, msgs);
			if (newTemplate != null)
				msgs = ((InternalEObject)newTemplate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RevengPackage.REVENG_MODEL__TEMPLATE, null, msgs);
			msgs = basicSetTemplate(newTemplate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RevengPackage.REVENG_MODEL__TEMPLATE, newTemplate, newTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComponentPath() {
		return componentPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentPath(String newComponentPath) {
		String oldComponentPath = componentPath;
		componentPath = newComponentPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RevengPackage.REVENG_MODEL__COMPONENT_PATH, oldComponentPath, componentPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RevengPackage.REVENG_MODEL__TRANSFORMATION:
				return basicSetTransformation(null, msgs);
			case RevengPackage.REVENG_MODEL__TEMPLATE:
				return basicSetTemplate(null, msgs);
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
			case RevengPackage.REVENG_MODEL__TRANSFORMATION:
				return getTransformation();
			case RevengPackage.REVENG_MODEL__TEMPLATE:
				return getTemplate();
			case RevengPackage.REVENG_MODEL__COMPONENT_PATH:
				return getComponentPath();
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
			case RevengPackage.REVENG_MODEL__TRANSFORMATION:
				setTransformation((Transformation)newValue);
				return;
			case RevengPackage.REVENG_MODEL__TEMPLATE:
				setTemplate((Transformation)newValue);
				return;
			case RevengPackage.REVENG_MODEL__COMPONENT_PATH:
				setComponentPath((String)newValue);
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
			case RevengPackage.REVENG_MODEL__TRANSFORMATION:
				setTransformation((Transformation)null);
				return;
			case RevengPackage.REVENG_MODEL__TEMPLATE:
				setTemplate((Transformation)null);
				return;
			case RevengPackage.REVENG_MODEL__COMPONENT_PATH:
				setComponentPath(COMPONENT_PATH_EDEFAULT);
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
			case RevengPackage.REVENG_MODEL__TRANSFORMATION:
				return transformation != null;
			case RevengPackage.REVENG_MODEL__TEMPLATE:
				return template != null;
			case RevengPackage.REVENG_MODEL__COMPONENT_PATH:
				return COMPONENT_PATH_EDEFAULT == null ? componentPath != null : !COMPONENT_PATH_EDEFAULT.equals(componentPath);
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
		result.append(" (componentPath: ");
		result.append(componentPath);
		result.append(')');
		return result.toString();
	}

} //RevengModelImpl
