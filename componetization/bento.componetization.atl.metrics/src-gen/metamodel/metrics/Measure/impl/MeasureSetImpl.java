/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metamodel.metrics.Measure.impl;

import java.util.Collection;

import metamodel.metrics.Measure.ElementKind;
import metamodel.metrics.Measure.Measure;
import metamodel.metrics.Measure.MeasurePackage;
import metamodel.metrics.Measure.MeasureSet;
import metamodel.metrics.Measure.RootMeasureSet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link metamodel.metrics.Measure.impl.MeasureSetImpl#getElementName <em>Element Name</em>}</li>
 *   <li>{@link metamodel.metrics.Measure.impl.MeasureSetImpl#getElementType <em>Element Type</em>}</li>
 *   <li>{@link metamodel.metrics.Measure.impl.MeasureSetImpl#getMeasures <em>Measures</em>}</li>
 *   <li>{@link metamodel.metrics.Measure.impl.MeasureSetImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link metamodel.metrics.Measure.impl.MeasureSetImpl#getSubsets <em>Subsets</em>}</li>
 *   <li>{@link metamodel.metrics.Measure.impl.MeasureSetImpl#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MeasureSetImpl extends EObjectImpl implements MeasureSet {
	/**
	 * The default value of the '{@link #getElementName() <em>Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementName()
	 * @generated
	 * @ordered
	 */
	protected static final String ELEMENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElementName() <em>Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementName()
	 * @generated
	 * @ordered
	 */
	protected String elementName = ELEMENT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getElementType() <em>Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementType()
	 * @generated
	 * @ordered
	 */
	protected static final ElementKind ELEMENT_TYPE_EDEFAULT = ElementKind.METAMODEL;

	/**
	 * The cached value of the '{@link #getElementType() <em>Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementType()
	 * @generated
	 * @ordered
	 */
	protected ElementKind elementType = ELEMENT_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMeasures() <em>Measures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasures()
	 * @generated
	 * @ordered
	 */
	protected EList<Measure> measures;

	/**
	 * The cached value of the '{@link #getSubsets() <em>Subsets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsets()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasureSet> subsets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasureSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeasurePackage.Literals.MEASURE_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getElementName() {
		return elementName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementName(String newElementName) {
		String oldElementName = elementName;
		elementName = newElementName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasurePackage.MEASURE_SET__ELEMENT_NAME, oldElementName, elementName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementKind getElementType() {
		return elementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementType(ElementKind newElementType) {
		ElementKind oldElementType = elementType;
		elementType = newElementType == null ? ELEMENT_TYPE_EDEFAULT : newElementType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasurePackage.MEASURE_SET__ELEMENT_TYPE, oldElementType, elementType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Measure> getMeasures() {
		if (measures == null) {
			measures = new EObjectContainmentWithInverseEList<Measure>(Measure.class, this, MeasurePackage.MEASURE_SET__MEASURES, MeasurePackage.MEASURE__OWNER);
		}
		return measures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootMeasureSet getRoot() {
		if (eContainerFeatureID() != MeasurePackage.MEASURE_SET__ROOT) return null;
		return (RootMeasureSet)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoot(RootMeasureSet newRoot, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRoot, MeasurePackage.MEASURE_SET__ROOT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoot(RootMeasureSet newRoot) {
		if (newRoot != eInternalContainer() || (eContainerFeatureID() != MeasurePackage.MEASURE_SET__ROOT && newRoot != null)) {
			if (EcoreUtil.isAncestor(this, newRoot))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRoot != null)
				msgs = ((InternalEObject)newRoot).eInverseAdd(this, MeasurePackage.ROOT_MEASURE_SET__MEASURE_SETS, RootMeasureSet.class, msgs);
			msgs = basicSetRoot(newRoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasurePackage.MEASURE_SET__ROOT, newRoot, newRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureSet> getSubsets() {
		if (subsets == null) {
			subsets = new EObjectContainmentWithInverseEList<MeasureSet>(MeasureSet.class, this, MeasurePackage.MEASURE_SET__SUBSETS, MeasurePackage.MEASURE_SET__PARENT);
		}
		return subsets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureSet getParent() {
		if (eContainerFeatureID() != MeasurePackage.MEASURE_SET__PARENT) return null;
		return (MeasureSet)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(MeasureSet newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, MeasurePackage.MEASURE_SET__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(MeasureSet newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != MeasurePackage.MEASURE_SET__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, MeasurePackage.MEASURE_SET__SUBSETS, MeasureSet.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasurePackage.MEASURE_SET__PARENT, newParent, newParent));
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
			case MeasurePackage.MEASURE_SET__MEASURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMeasures()).basicAdd(otherEnd, msgs);
			case MeasurePackage.MEASURE_SET__ROOT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRoot((RootMeasureSet)otherEnd, msgs);
			case MeasurePackage.MEASURE_SET__SUBSETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubsets()).basicAdd(otherEnd, msgs);
			case MeasurePackage.MEASURE_SET__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((MeasureSet)otherEnd, msgs);
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
			case MeasurePackage.MEASURE_SET__MEASURES:
				return ((InternalEList<?>)getMeasures()).basicRemove(otherEnd, msgs);
			case MeasurePackage.MEASURE_SET__ROOT:
				return basicSetRoot(null, msgs);
			case MeasurePackage.MEASURE_SET__SUBSETS:
				return ((InternalEList<?>)getSubsets()).basicRemove(otherEnd, msgs);
			case MeasurePackage.MEASURE_SET__PARENT:
				return basicSetParent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case MeasurePackage.MEASURE_SET__ROOT:
				return eInternalContainer().eInverseRemove(this, MeasurePackage.ROOT_MEASURE_SET__MEASURE_SETS, RootMeasureSet.class, msgs);
			case MeasurePackage.MEASURE_SET__PARENT:
				return eInternalContainer().eInverseRemove(this, MeasurePackage.MEASURE_SET__SUBSETS, MeasureSet.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MeasurePackage.MEASURE_SET__ELEMENT_NAME:
				return getElementName();
			case MeasurePackage.MEASURE_SET__ELEMENT_TYPE:
				return getElementType();
			case MeasurePackage.MEASURE_SET__MEASURES:
				return getMeasures();
			case MeasurePackage.MEASURE_SET__ROOT:
				return getRoot();
			case MeasurePackage.MEASURE_SET__SUBSETS:
				return getSubsets();
			case MeasurePackage.MEASURE_SET__PARENT:
				return getParent();
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
			case MeasurePackage.MEASURE_SET__ELEMENT_NAME:
				setElementName((String)newValue);
				return;
			case MeasurePackage.MEASURE_SET__ELEMENT_TYPE:
				setElementType((ElementKind)newValue);
				return;
			case MeasurePackage.MEASURE_SET__MEASURES:
				getMeasures().clear();
				getMeasures().addAll((Collection<? extends Measure>)newValue);
				return;
			case MeasurePackage.MEASURE_SET__ROOT:
				setRoot((RootMeasureSet)newValue);
				return;
			case MeasurePackage.MEASURE_SET__SUBSETS:
				getSubsets().clear();
				getSubsets().addAll((Collection<? extends MeasureSet>)newValue);
				return;
			case MeasurePackage.MEASURE_SET__PARENT:
				setParent((MeasureSet)newValue);
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
			case MeasurePackage.MEASURE_SET__ELEMENT_NAME:
				setElementName(ELEMENT_NAME_EDEFAULT);
				return;
			case MeasurePackage.MEASURE_SET__ELEMENT_TYPE:
				setElementType(ELEMENT_TYPE_EDEFAULT);
				return;
			case MeasurePackage.MEASURE_SET__MEASURES:
				getMeasures().clear();
				return;
			case MeasurePackage.MEASURE_SET__ROOT:
				setRoot((RootMeasureSet)null);
				return;
			case MeasurePackage.MEASURE_SET__SUBSETS:
				getSubsets().clear();
				return;
			case MeasurePackage.MEASURE_SET__PARENT:
				setParent((MeasureSet)null);
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
			case MeasurePackage.MEASURE_SET__ELEMENT_NAME:
				return ELEMENT_NAME_EDEFAULT == null ? elementName != null : !ELEMENT_NAME_EDEFAULT.equals(elementName);
			case MeasurePackage.MEASURE_SET__ELEMENT_TYPE:
				return elementType != ELEMENT_TYPE_EDEFAULT;
			case MeasurePackage.MEASURE_SET__MEASURES:
				return measures != null && !measures.isEmpty();
			case MeasurePackage.MEASURE_SET__ROOT:
				return getRoot() != null;
			case MeasurePackage.MEASURE_SET__SUBSETS:
				return subsets != null && !subsets.isEmpty();
			case MeasurePackage.MEASURE_SET__PARENT:
				return getParent() != null;
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
		result.append(" (elementName: ");
		result.append(elementName);
		result.append(", elementType: ");
		result.append(elementType);
		result.append(')');
		return result.toString();
	}

} //MeasureSetImpl
