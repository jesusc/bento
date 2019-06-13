/**
 */
package scenes_bdsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import scenes_bdsl.Comment;
import scenes_bdsl.Scenes_bdslPackage;
import scenes_bdsl.textComment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link scenes_bdsl.impl.CommentImpl#getText <em>Text</em>}</li>
 *   <li>{@link scenes_bdsl.impl.CommentImpl#getContainstextComment <em>Containstext Comment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommentImpl extends BindingElementImpl implements Comment {
	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContainstextComment() <em>Containstext Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainstextComment()
	 * @generated
	 * @ordered
	 */
	protected textComment containstextComment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Scenes_bdslPackage.Literals.COMMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Scenes_bdslPackage.COMMENT__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public textComment getContainstextComment() {
		return containstextComment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainstextComment(textComment newContainstextComment, NotificationChain msgs) {
		textComment oldContainstextComment = containstextComment;
		containstextComment = newContainstextComment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Scenes_bdslPackage.COMMENT__CONTAINSTEXT_COMMENT, oldContainstextComment, newContainstextComment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainstextComment(textComment newContainstextComment) {
		if (newContainstextComment != containstextComment) {
			NotificationChain msgs = null;
			if (containstextComment != null)
				msgs = ((InternalEObject)containstextComment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Scenes_bdslPackage.COMMENT__CONTAINSTEXT_COMMENT, null, msgs);
			if (newContainstextComment != null)
				msgs = ((InternalEObject)newContainstextComment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Scenes_bdslPackage.COMMENT__CONTAINSTEXT_COMMENT, null, msgs);
			msgs = basicSetContainstextComment(newContainstextComment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Scenes_bdslPackage.COMMENT__CONTAINSTEXT_COMMENT, newContainstextComment, newContainstextComment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Scenes_bdslPackage.COMMENT__CONTAINSTEXT_COMMENT:
				return basicSetContainstextComment(null, msgs);
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
			case Scenes_bdslPackage.COMMENT__TEXT:
				return getText();
			case Scenes_bdslPackage.COMMENT__CONTAINSTEXT_COMMENT:
				return getContainstextComment();
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
			case Scenes_bdslPackage.COMMENT__TEXT:
				setText((String)newValue);
				return;
			case Scenes_bdslPackage.COMMENT__CONTAINSTEXT_COMMENT:
				setContainstextComment((textComment)newValue);
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
			case Scenes_bdslPackage.COMMENT__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case Scenes_bdslPackage.COMMENT__CONTAINSTEXT_COMMENT:
				setContainstextComment((textComment)null);
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
			case Scenes_bdslPackage.COMMENT__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case Scenes_bdslPackage.COMMENT__CONTAINSTEXT_COMMENT:
				return containstextComment != null;
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
		result.append(" (text: ");
		result.append(text);
		result.append(')');
		return result.toString();
	}

} //CommentImpl
