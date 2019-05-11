/**
 */
package bento.sirius.tests.boxes.impl;

import bento.sirius.tests.boxes.Arrow;
import bento.sirius.tests.boxes.BoxNode;
import bento.sirius.tests.boxes.BoxesPackage;
import bento.sirius.tests.boxes.Model;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bento.sirius.tests.boxes.impl.ModelImpl#getBoxes <em>Boxes</em>}</li>
 *   <li>{@link bento.sirius.tests.boxes.impl.ModelImpl#getArrows <em>Arrows</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model {
	/**
	 * The cached value of the '{@link #getBoxes() <em>Boxes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoxes()
	 * @generated
	 * @ordered
	 */
	protected EList<BoxNode> boxes;

	/**
	 * The cached value of the '{@link #getArrows() <em>Arrows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrows()
	 * @generated
	 * @ordered
	 */
	protected EList<Arrow> arrows;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BoxesPackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BoxNode> getBoxes() {
		if (boxes == null) {
			boxes = new EObjectContainmentEList<BoxNode>(BoxNode.class, this, BoxesPackage.MODEL__BOXES);
		}
		return boxes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Arrow> getArrows() {
		if (arrows == null) {
			arrows = new EObjectContainmentEList<Arrow>(Arrow.class, this, BoxesPackage.MODEL__ARROWS);
		}
		return arrows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BoxesPackage.MODEL__BOXES:
				return ((InternalEList<?>)getBoxes()).basicRemove(otherEnd, msgs);
			case BoxesPackage.MODEL__ARROWS:
				return ((InternalEList<?>)getArrows()).basicRemove(otherEnd, msgs);
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
			case BoxesPackage.MODEL__BOXES:
				return getBoxes();
			case BoxesPackage.MODEL__ARROWS:
				return getArrows();
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
			case BoxesPackage.MODEL__BOXES:
				getBoxes().clear();
				getBoxes().addAll((Collection<? extends BoxNode>)newValue);
				return;
			case BoxesPackage.MODEL__ARROWS:
				getArrows().clear();
				getArrows().addAll((Collection<? extends Arrow>)newValue);
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
			case BoxesPackage.MODEL__BOXES:
				getBoxes().clear();
				return;
			case BoxesPackage.MODEL__ARROWS:
				getArrows().clear();
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
			case BoxesPackage.MODEL__BOXES:
				return boxes != null && !boxes.isEmpty();
			case BoxesPackage.MODEL__ARROWS:
				return arrows != null && !arrows.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelImpl
