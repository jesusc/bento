/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.plcopen.xml.tc60201.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.plcopen.xml.tc60201.ActionBlockType;
import org.plcopen.xml.tc60201.BlockType;
import org.plcopen.xml.tc60201.CommentType;
import org.plcopen.xml.tc60201.ConnectorType;
import org.plcopen.xml.tc60201.ContinuationType;
import org.plcopen.xml.tc60201.ErrorType;
import org.plcopen.xml.tc60201.FBDType1;
import org.plcopen.xml.tc60201.InOutVariableType;
import org.plcopen.xml.tc60201.InVariableType;
import org.plcopen.xml.tc60201.JumpType;
import org.plcopen.xml.tc60201.LabelType;
import org.plcopen.xml.tc60201.OutVariableType;
import org.plcopen.xml.tc60201.ReturnType;
import org.plcopen.xml.tc60201.Tc60201Package;
import org.plcopen.xml.tc60201.VendorElementType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FBD Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.plcopen.xml.tc60201.impl.FBDType1Impl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.FBDType1Impl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.FBDType1Impl#getError <em>Error</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.FBDType1Impl#getConnector <em>Connector</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.FBDType1Impl#getContinuation <em>Continuation</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.FBDType1Impl#getActionBlock <em>Action Block</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.FBDType1Impl#getVendorElement <em>Vendor Element</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.FBDType1Impl#getBlock <em>Block</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.FBDType1Impl#getInVariable <em>In Variable</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.FBDType1Impl#getOutVariable <em>Out Variable</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.FBDType1Impl#getInOutVariable <em>In Out Variable</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.FBDType1Impl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.FBDType1Impl#getJump <em>Jump</em>}</li>
 *   <li>{@link org.plcopen.xml.tc60201.impl.FBDType1Impl#getReturn <em>Return</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FBDType1Impl extends EObjectImpl implements FBDType1 {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FBDType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Tc60201Package.eINSTANCE.getFBDType1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, Tc60201Package.FBD_TYPE1__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommentType> getComment() {
		return getGroup().list(Tc60201Package.eINSTANCE.getFBDType1_Comment());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErrorType> getError() {
		return getGroup().list(Tc60201Package.eINSTANCE.getFBDType1_Error());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectorType> getConnector() {
		return getGroup().list(Tc60201Package.eINSTANCE.getFBDType1_Connector());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContinuationType> getContinuation() {
		return getGroup().list(Tc60201Package.eINSTANCE.getFBDType1_Continuation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionBlockType> getActionBlock() {
		return getGroup().list(Tc60201Package.eINSTANCE.getFBDType1_ActionBlock());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VendorElementType> getVendorElement() {
		return getGroup().list(Tc60201Package.eINSTANCE.getFBDType1_VendorElement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BlockType> getBlock() {
		return getGroup().list(Tc60201Package.eINSTANCE.getFBDType1_Block());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InVariableType> getInVariable() {
		return getGroup().list(Tc60201Package.eINSTANCE.getFBDType1_InVariable());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutVariableType> getOutVariable() {
		return getGroup().list(Tc60201Package.eINSTANCE.getFBDType1_OutVariable());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InOutVariableType> getInOutVariable() {
		return getGroup().list(Tc60201Package.eINSTANCE.getFBDType1_InOutVariable());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LabelType> getLabel() {
		return getGroup().list(Tc60201Package.eINSTANCE.getFBDType1_Label());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JumpType> getJump() {
		return getGroup().list(Tc60201Package.eINSTANCE.getFBDType1_Jump());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReturnType> getReturn() {
		return getGroup().list(Tc60201Package.eINSTANCE.getFBDType1_Return());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Tc60201Package.FBD_TYPE1__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case Tc60201Package.FBD_TYPE1__COMMENT:
				return ((InternalEList<?>)getComment()).basicRemove(otherEnd, msgs);
			case Tc60201Package.FBD_TYPE1__ERROR:
				return ((InternalEList<?>)getError()).basicRemove(otherEnd, msgs);
			case Tc60201Package.FBD_TYPE1__CONNECTOR:
				return ((InternalEList<?>)getConnector()).basicRemove(otherEnd, msgs);
			case Tc60201Package.FBD_TYPE1__CONTINUATION:
				return ((InternalEList<?>)getContinuation()).basicRemove(otherEnd, msgs);
			case Tc60201Package.FBD_TYPE1__ACTION_BLOCK:
				return ((InternalEList<?>)getActionBlock()).basicRemove(otherEnd, msgs);
			case Tc60201Package.FBD_TYPE1__VENDOR_ELEMENT:
				return ((InternalEList<?>)getVendorElement()).basicRemove(otherEnd, msgs);
			case Tc60201Package.FBD_TYPE1__BLOCK:
				return ((InternalEList<?>)getBlock()).basicRemove(otherEnd, msgs);
			case Tc60201Package.FBD_TYPE1__IN_VARIABLE:
				return ((InternalEList<?>)getInVariable()).basicRemove(otherEnd, msgs);
			case Tc60201Package.FBD_TYPE1__OUT_VARIABLE:
				return ((InternalEList<?>)getOutVariable()).basicRemove(otherEnd, msgs);
			case Tc60201Package.FBD_TYPE1__IN_OUT_VARIABLE:
				return ((InternalEList<?>)getInOutVariable()).basicRemove(otherEnd, msgs);
			case Tc60201Package.FBD_TYPE1__LABEL:
				return ((InternalEList<?>)getLabel()).basicRemove(otherEnd, msgs);
			case Tc60201Package.FBD_TYPE1__JUMP:
				return ((InternalEList<?>)getJump()).basicRemove(otherEnd, msgs);
			case Tc60201Package.FBD_TYPE1__RETURN:
				return ((InternalEList<?>)getReturn()).basicRemove(otherEnd, msgs);
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
			case Tc60201Package.FBD_TYPE1__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case Tc60201Package.FBD_TYPE1__COMMENT:
				return getComment();
			case Tc60201Package.FBD_TYPE1__ERROR:
				return getError();
			case Tc60201Package.FBD_TYPE1__CONNECTOR:
				return getConnector();
			case Tc60201Package.FBD_TYPE1__CONTINUATION:
				return getContinuation();
			case Tc60201Package.FBD_TYPE1__ACTION_BLOCK:
				return getActionBlock();
			case Tc60201Package.FBD_TYPE1__VENDOR_ELEMENT:
				return getVendorElement();
			case Tc60201Package.FBD_TYPE1__BLOCK:
				return getBlock();
			case Tc60201Package.FBD_TYPE1__IN_VARIABLE:
				return getInVariable();
			case Tc60201Package.FBD_TYPE1__OUT_VARIABLE:
				return getOutVariable();
			case Tc60201Package.FBD_TYPE1__IN_OUT_VARIABLE:
				return getInOutVariable();
			case Tc60201Package.FBD_TYPE1__LABEL:
				return getLabel();
			case Tc60201Package.FBD_TYPE1__JUMP:
				return getJump();
			case Tc60201Package.FBD_TYPE1__RETURN:
				return getReturn();
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
			case Tc60201Package.FBD_TYPE1__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case Tc60201Package.FBD_TYPE1__COMMENT:
				getComment().clear();
				getComment().addAll((Collection<? extends CommentType>)newValue);
				return;
			case Tc60201Package.FBD_TYPE1__ERROR:
				getError().clear();
				getError().addAll((Collection<? extends ErrorType>)newValue);
				return;
			case Tc60201Package.FBD_TYPE1__CONNECTOR:
				getConnector().clear();
				getConnector().addAll((Collection<? extends ConnectorType>)newValue);
				return;
			case Tc60201Package.FBD_TYPE1__CONTINUATION:
				getContinuation().clear();
				getContinuation().addAll((Collection<? extends ContinuationType>)newValue);
				return;
			case Tc60201Package.FBD_TYPE1__ACTION_BLOCK:
				getActionBlock().clear();
				getActionBlock().addAll((Collection<? extends ActionBlockType>)newValue);
				return;
			case Tc60201Package.FBD_TYPE1__VENDOR_ELEMENT:
				getVendorElement().clear();
				getVendorElement().addAll((Collection<? extends VendorElementType>)newValue);
				return;
			case Tc60201Package.FBD_TYPE1__BLOCK:
				getBlock().clear();
				getBlock().addAll((Collection<? extends BlockType>)newValue);
				return;
			case Tc60201Package.FBD_TYPE1__IN_VARIABLE:
				getInVariable().clear();
				getInVariable().addAll((Collection<? extends InVariableType>)newValue);
				return;
			case Tc60201Package.FBD_TYPE1__OUT_VARIABLE:
				getOutVariable().clear();
				getOutVariable().addAll((Collection<? extends OutVariableType>)newValue);
				return;
			case Tc60201Package.FBD_TYPE1__IN_OUT_VARIABLE:
				getInOutVariable().clear();
				getInOutVariable().addAll((Collection<? extends InOutVariableType>)newValue);
				return;
			case Tc60201Package.FBD_TYPE1__LABEL:
				getLabel().clear();
				getLabel().addAll((Collection<? extends LabelType>)newValue);
				return;
			case Tc60201Package.FBD_TYPE1__JUMP:
				getJump().clear();
				getJump().addAll((Collection<? extends JumpType>)newValue);
				return;
			case Tc60201Package.FBD_TYPE1__RETURN:
				getReturn().clear();
				getReturn().addAll((Collection<? extends ReturnType>)newValue);
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
			case Tc60201Package.FBD_TYPE1__GROUP:
				getGroup().clear();
				return;
			case Tc60201Package.FBD_TYPE1__COMMENT:
				getComment().clear();
				return;
			case Tc60201Package.FBD_TYPE1__ERROR:
				getError().clear();
				return;
			case Tc60201Package.FBD_TYPE1__CONNECTOR:
				getConnector().clear();
				return;
			case Tc60201Package.FBD_TYPE1__CONTINUATION:
				getContinuation().clear();
				return;
			case Tc60201Package.FBD_TYPE1__ACTION_BLOCK:
				getActionBlock().clear();
				return;
			case Tc60201Package.FBD_TYPE1__VENDOR_ELEMENT:
				getVendorElement().clear();
				return;
			case Tc60201Package.FBD_TYPE1__BLOCK:
				getBlock().clear();
				return;
			case Tc60201Package.FBD_TYPE1__IN_VARIABLE:
				getInVariable().clear();
				return;
			case Tc60201Package.FBD_TYPE1__OUT_VARIABLE:
				getOutVariable().clear();
				return;
			case Tc60201Package.FBD_TYPE1__IN_OUT_VARIABLE:
				getInOutVariable().clear();
				return;
			case Tc60201Package.FBD_TYPE1__LABEL:
				getLabel().clear();
				return;
			case Tc60201Package.FBD_TYPE1__JUMP:
				getJump().clear();
				return;
			case Tc60201Package.FBD_TYPE1__RETURN:
				getReturn().clear();
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
			case Tc60201Package.FBD_TYPE1__GROUP:
				return group != null && !group.isEmpty();
			case Tc60201Package.FBD_TYPE1__COMMENT:
				return !getComment().isEmpty();
			case Tc60201Package.FBD_TYPE1__ERROR:
				return !getError().isEmpty();
			case Tc60201Package.FBD_TYPE1__CONNECTOR:
				return !getConnector().isEmpty();
			case Tc60201Package.FBD_TYPE1__CONTINUATION:
				return !getContinuation().isEmpty();
			case Tc60201Package.FBD_TYPE1__ACTION_BLOCK:
				return !getActionBlock().isEmpty();
			case Tc60201Package.FBD_TYPE1__VENDOR_ELEMENT:
				return !getVendorElement().isEmpty();
			case Tc60201Package.FBD_TYPE1__BLOCK:
				return !getBlock().isEmpty();
			case Tc60201Package.FBD_TYPE1__IN_VARIABLE:
				return !getInVariable().isEmpty();
			case Tc60201Package.FBD_TYPE1__OUT_VARIABLE:
				return !getOutVariable().isEmpty();
			case Tc60201Package.FBD_TYPE1__IN_OUT_VARIABLE:
				return !getInOutVariable().isEmpty();
			case Tc60201Package.FBD_TYPE1__LABEL:
				return !getLabel().isEmpty();
			case Tc60201Package.FBD_TYPE1__JUMP:
				return !getJump().isEmpty();
			case Tc60201Package.FBD_TYPE1__RETURN:
				return !getReturn().isEmpty();
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
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //FBDType1Impl
