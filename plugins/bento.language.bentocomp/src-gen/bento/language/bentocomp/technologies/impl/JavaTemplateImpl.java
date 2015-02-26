/**
 */
package bento.language.bentocomp.technologies.impl;

import bento.language.bentocomp.core.impl.TemplateImpl;

import bento.language.bentocomp.technologies.JavaTemplate;
import bento.language.bentocomp.technologies.TechnologiesPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bento.language.bentocomp.technologies.impl.JavaTemplateImpl#getQualifiedClassname <em>Qualified Classname</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JavaTemplateImpl extends TemplateImpl implements JavaTemplate {
	/**
	 * The default value of the '{@link #getQualifiedClassname() <em>Qualified Classname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedClassname()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALIFIED_CLASSNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQualifiedClassname() <em>Qualified Classname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedClassname()
	 * @generated
	 * @ordered
	 */
	protected String qualifiedClassname = QUALIFIED_CLASSNAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TechnologiesPackage.Literals.JAVA_TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQualifiedClassname() {
		return qualifiedClassname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualifiedClassname(String newQualifiedClassname) {
		String oldQualifiedClassname = qualifiedClassname;
		qualifiedClassname = newQualifiedClassname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TechnologiesPackage.JAVA_TEMPLATE__QUALIFIED_CLASSNAME, oldQualifiedClassname, qualifiedClassname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TechnologiesPackage.JAVA_TEMPLATE__QUALIFIED_CLASSNAME:
				return getQualifiedClassname();
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
			case TechnologiesPackage.JAVA_TEMPLATE__QUALIFIED_CLASSNAME:
				setQualifiedClassname((String)newValue);
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
			case TechnologiesPackage.JAVA_TEMPLATE__QUALIFIED_CLASSNAME:
				setQualifiedClassname(QUALIFIED_CLASSNAME_EDEFAULT);
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
			case TechnologiesPackage.JAVA_TEMPLATE__QUALIFIED_CLASSNAME:
				return QUALIFIED_CLASSNAME_EDEFAULT == null ? qualifiedClassname != null : !QUALIFIED_CLASSNAME_EDEFAULT.equals(qualifiedClassname);
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
		result.append(" (qualifiedClassname: ");
		result.append(qualifiedClassname);
		result.append(')');
		return result.toString();
	}

} //JavaTemplateImpl
