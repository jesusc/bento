/**
 */
package graph_bdsl.impl;

import graph_bdsl.Edge;
import graph_bdsl.Graph_bdslPackage;
import graph_bdsl.Node;
import graph_bdsl.labelEdge;
import graph_bdsl.srcEdge21;
import graph_bdsl.tgtEdge22;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graph_bdsl.impl.EdgeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link graph_bdsl.impl.EdgeImpl#getSrc <em>Src</em>}</li>
 *   <li>{@link graph_bdsl.impl.EdgeImpl#getTgt <em>Tgt</em>}</li>
 *   <li>{@link graph_bdsl.impl.EdgeImpl#getEref_srcEdge21 <em>Eref src Edge21</em>}</li>
 *   <li>{@link graph_bdsl.impl.EdgeImpl#getEref_tgtEdge22 <em>Eref tgt Edge22</em>}</li>
 *   <li>{@link graph_bdsl.impl.EdgeImpl#getContainslabelEdge <em>Containslabel Edge</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EdgeImpl extends BindingElementImpl implements Edge {
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSrc() <em>Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrc()
	 * @generated
	 * @ordered
	 */
	protected Node src;

	/**
	 * The cached value of the '{@link #getTgt() <em>Tgt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTgt()
	 * @generated
	 * @ordered
	 */
	protected Node tgt;

	/**
	 * The cached value of the '{@link #getEref_srcEdge21() <em>Eref src Edge21</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEref_srcEdge21()
	 * @generated
	 * @ordered
	 */
	protected srcEdge21 eref_srcEdge21;

	/**
	 * The cached value of the '{@link #getEref_tgtEdge22() <em>Eref tgt Edge22</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEref_tgtEdge22()
	 * @generated
	 * @ordered
	 */
	protected tgtEdge22 eref_tgtEdge22;

	/**
	 * The cached value of the '{@link #getContainslabelEdge() <em>Containslabel Edge</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainslabelEdge()
	 * @generated
	 * @ordered
	 */
	protected EList<labelEdge> containslabelEdge;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Graph_bdslPackage.Literals.EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graph_bdslPackage.EDGE__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Node getSrc() {
		if (src != null && src.eIsProxy()) {
			InternalEObject oldSrc = (InternalEObject)src;
			src = (Node)eResolveProxy(oldSrc);
			if (src != oldSrc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Graph_bdslPackage.EDGE__SRC, oldSrc, src));
			}
		}
		return src;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetSrc() {
		return src;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSrc(Node newSrc) {
		Node oldSrc = src;
		src = newSrc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graph_bdslPackage.EDGE__SRC, oldSrc, src));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Node getTgt() {
		if (tgt != null && tgt.eIsProxy()) {
			InternalEObject oldTgt = (InternalEObject)tgt;
			tgt = (Node)eResolveProxy(oldTgt);
			if (tgt != oldTgt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Graph_bdslPackage.EDGE__TGT, oldTgt, tgt));
			}
		}
		return tgt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetTgt() {
		return tgt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTgt(Node newTgt) {
		Node oldTgt = tgt;
		tgt = newTgt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graph_bdslPackage.EDGE__TGT, oldTgt, tgt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public srcEdge21 getEref_srcEdge21() {
		return eref_srcEdge21;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEref_srcEdge21(srcEdge21 newEref_srcEdge21, NotificationChain msgs) {
		srcEdge21 oldEref_srcEdge21 = eref_srcEdge21;
		eref_srcEdge21 = newEref_srcEdge21;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Graph_bdslPackage.EDGE__EREF_SRC_EDGE21, oldEref_srcEdge21, newEref_srcEdge21);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEref_srcEdge21(srcEdge21 newEref_srcEdge21) {
		if (newEref_srcEdge21 != eref_srcEdge21) {
			NotificationChain msgs = null;
			if (eref_srcEdge21 != null)
				msgs = ((InternalEObject)eref_srcEdge21).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Graph_bdslPackage.EDGE__EREF_SRC_EDGE21, null, msgs);
			if (newEref_srcEdge21 != null)
				msgs = ((InternalEObject)newEref_srcEdge21).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Graph_bdslPackage.EDGE__EREF_SRC_EDGE21, null, msgs);
			msgs = basicSetEref_srcEdge21(newEref_srcEdge21, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graph_bdslPackage.EDGE__EREF_SRC_EDGE21, newEref_srcEdge21, newEref_srcEdge21));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public tgtEdge22 getEref_tgtEdge22() {
		return eref_tgtEdge22;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEref_tgtEdge22(tgtEdge22 newEref_tgtEdge22, NotificationChain msgs) {
		tgtEdge22 oldEref_tgtEdge22 = eref_tgtEdge22;
		eref_tgtEdge22 = newEref_tgtEdge22;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Graph_bdslPackage.EDGE__EREF_TGT_EDGE22, oldEref_tgtEdge22, newEref_tgtEdge22);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEref_tgtEdge22(tgtEdge22 newEref_tgtEdge22) {
		if (newEref_tgtEdge22 != eref_tgtEdge22) {
			NotificationChain msgs = null;
			if (eref_tgtEdge22 != null)
				msgs = ((InternalEObject)eref_tgtEdge22).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Graph_bdslPackage.EDGE__EREF_TGT_EDGE22, null, msgs);
			if (newEref_tgtEdge22 != null)
				msgs = ((InternalEObject)newEref_tgtEdge22).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Graph_bdslPackage.EDGE__EREF_TGT_EDGE22, null, msgs);
			msgs = basicSetEref_tgtEdge22(newEref_tgtEdge22, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graph_bdslPackage.EDGE__EREF_TGT_EDGE22, newEref_tgtEdge22, newEref_tgtEdge22));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<labelEdge> getContainslabelEdge() {
		if (containslabelEdge == null) {
			containslabelEdge = new EObjectContainmentEList<labelEdge>(labelEdge.class, this, Graph_bdslPackage.EDGE__CONTAINSLABEL_EDGE);
		}
		return containslabelEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Graph_bdslPackage.EDGE__EREF_SRC_EDGE21:
				return basicSetEref_srcEdge21(null, msgs);
			case Graph_bdslPackage.EDGE__EREF_TGT_EDGE22:
				return basicSetEref_tgtEdge22(null, msgs);
			case Graph_bdslPackage.EDGE__CONTAINSLABEL_EDGE:
				return ((InternalEList<?>)getContainslabelEdge()).basicRemove(otherEnd, msgs);
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
			case Graph_bdslPackage.EDGE__LABEL:
				return getLabel();
			case Graph_bdslPackage.EDGE__SRC:
				if (resolve) return getSrc();
				return basicGetSrc();
			case Graph_bdslPackage.EDGE__TGT:
				if (resolve) return getTgt();
				return basicGetTgt();
			case Graph_bdslPackage.EDGE__EREF_SRC_EDGE21:
				return getEref_srcEdge21();
			case Graph_bdslPackage.EDGE__EREF_TGT_EDGE22:
				return getEref_tgtEdge22();
			case Graph_bdslPackage.EDGE__CONTAINSLABEL_EDGE:
				return getContainslabelEdge();
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
			case Graph_bdslPackage.EDGE__LABEL:
				setLabel((String)newValue);
				return;
			case Graph_bdslPackage.EDGE__SRC:
				setSrc((Node)newValue);
				return;
			case Graph_bdslPackage.EDGE__TGT:
				setTgt((Node)newValue);
				return;
			case Graph_bdslPackage.EDGE__EREF_SRC_EDGE21:
				setEref_srcEdge21((srcEdge21)newValue);
				return;
			case Graph_bdslPackage.EDGE__EREF_TGT_EDGE22:
				setEref_tgtEdge22((tgtEdge22)newValue);
				return;
			case Graph_bdslPackage.EDGE__CONTAINSLABEL_EDGE:
				getContainslabelEdge().clear();
				getContainslabelEdge().addAll((Collection<? extends labelEdge>)newValue);
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
			case Graph_bdslPackage.EDGE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case Graph_bdslPackage.EDGE__SRC:
				setSrc((Node)null);
				return;
			case Graph_bdslPackage.EDGE__TGT:
				setTgt((Node)null);
				return;
			case Graph_bdslPackage.EDGE__EREF_SRC_EDGE21:
				setEref_srcEdge21((srcEdge21)null);
				return;
			case Graph_bdslPackage.EDGE__EREF_TGT_EDGE22:
				setEref_tgtEdge22((tgtEdge22)null);
				return;
			case Graph_bdslPackage.EDGE__CONTAINSLABEL_EDGE:
				getContainslabelEdge().clear();
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
			case Graph_bdslPackage.EDGE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case Graph_bdslPackage.EDGE__SRC:
				return src != null;
			case Graph_bdslPackage.EDGE__TGT:
				return tgt != null;
			case Graph_bdslPackage.EDGE__EREF_SRC_EDGE21:
				return eref_srcEdge21 != null;
			case Graph_bdslPackage.EDGE__EREF_TGT_EDGE22:
				return eref_tgtEdge22 != null;
			case Graph_bdslPackage.EDGE__CONTAINSLABEL_EDGE:
				return containslabelEdge != null && !containslabelEdge.isEmpty();
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
		result.append(" (label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} //EdgeImpl
