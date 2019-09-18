/**
 */
package metamodel_bdsl.impl;

import java.util.Collection;

import metamodel_bdsl.BindingElement;
import metamodel_bdsl.Metamodel_bdslPackage;
import metamodel_bdsl.NoneElement;
import metamodel_bdsl.SiriusTag;
import metamodel_bdsl.Storage;
import metamodel_bdsl.StorageOutputFlow;

import metamodel_bdsl.destinationStorageOutputFlow63;
import metamodel_bdsl.quantityStorageOutputFlow61;
import metamodel_bdsl.sourceStorageOutputFlow62;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Storage Output Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metamodel_bdsl.impl.StorageOutputFlowImpl#getContainsSiriusTag <em>Contains Sirius Tag</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.StorageOutputFlowImpl#getNoneElement <em>None Element</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.StorageOutputFlowImpl#getSource <em>Source</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.StorageOutputFlowImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.StorageOutputFlowImpl#getEref_quantityStorageOutputFlow61 <em>Eref quantity Storage Output Flow61</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.StorageOutputFlowImpl#getEref_sourceStorageOutputFlow62 <em>Eref source Storage Output Flow62</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.StorageOutputFlowImpl#getEref_destinationStorageOutputFlow63 <em>Eref destination Storage Output Flow63</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StorageOutputFlowImpl extends FlowImpl implements StorageOutputFlow {
	/**
	 * The cached value of the '{@link #getContainsSiriusTag() <em>Contains Sirius Tag</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsSiriusTag()
	 * @generated
	 * @ordered
	 */
	protected EList<SiriusTag> containsSiriusTag;

	/**
	 * The cached value of the '{@link #getNoneElement() <em>None Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoneElement()
	 * @generated
	 * @ordered
	 */
	protected EList<NoneElement> noneElement;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Storage source;

	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected metamodel_bdsl.Process destination;

	/**
	 * The cached value of the '{@link #getEref_quantityStorageOutputFlow61() <em>Eref quantity Storage Output Flow61</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEref_quantityStorageOutputFlow61()
	 * @generated
	 * @ordered
	 */
	protected quantityStorageOutputFlow61 eref_quantityStorageOutputFlow61;

	/**
	 * The cached value of the '{@link #getEref_sourceStorageOutputFlow62() <em>Eref source Storage Output Flow62</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEref_sourceStorageOutputFlow62()
	 * @generated
	 * @ordered
	 */
	protected sourceStorageOutputFlow62 eref_sourceStorageOutputFlow62;

	/**
	 * The cached value of the '{@link #getEref_destinationStorageOutputFlow63() <em>Eref destination Storage Output Flow63</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEref_destinationStorageOutputFlow63()
	 * @generated
	 * @ordered
	 */
	protected destinationStorageOutputFlow63 eref_destinationStorageOutputFlow63;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StorageOutputFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Metamodel_bdslPackage.Literals.STORAGE_OUTPUT_FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SiriusTag> getContainsSiriusTag() {
		if (containsSiriusTag == null) {
			containsSiriusTag = new EObjectContainmentEList<SiriusTag>(SiriusTag.class, this, Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW__CONTAINS_SIRIUS_TAG);
		}
		return containsSiriusTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NoneElement> getNoneElement() {
		if (noneElement == null) {
			noneElement = new EObjectResolvingEList<NoneElement>(NoneElement.class, this, Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW__NONE_ELEMENT);
		}
		return noneElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Storage getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Storage)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Storage basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Storage newSource, NotificationChain msgs) {
		Storage oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Storage newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, Metamodel_bdslPackage.STORAGE__STORAGE_OUTPUT_FLOW, Storage.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, Metamodel_bdslPackage.STORAGE__STORAGE_OUTPUT_FLOW, Storage.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public metamodel_bdsl.Process getDestination() {
		if (destination != null && destination.eIsProxy()) {
			InternalEObject oldDestination = (InternalEObject)destination;
			destination = (metamodel_bdsl.Process)eResolveProxy(oldDestination);
			if (destination != oldDestination) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW__DESTINATION, oldDestination, destination));
			}
		}
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public metamodel_bdsl.Process basicGetDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDestination(metamodel_bdsl.Process newDestination, NotificationChain msgs) {
		metamodel_bdsl.Process oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW__DESTINATION, oldDestination, newDestination);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestination(metamodel_bdsl.Process newDestination) {
		if (newDestination != destination) {
			NotificationChain msgs = null;
			if (destination != null)
				msgs = ((InternalEObject)destination).eInverseRemove(this, Metamodel_bdslPackage.PROCESS__STORAGE_OUTPUT_FLOW, metamodel_bdsl.Process.class, msgs);
			if (newDestination != null)
				msgs = ((InternalEObject)newDestination).eInverseAdd(this, Metamodel_bdslPackage.PROCESS__STORAGE_OUTPUT_FLOW, metamodel_bdsl.Process.class, msgs);
			msgs = basicSetDestination(newDestination, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW__DESTINATION, newDestination, newDestination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public quantityStorageOutputFlow61 getEref_quantityStorageOutputFlow61() {
		return eref_quantityStorageOutputFlow61;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEref_quantityStorageOutputFlow61(quantityStorageOutputFlow61 newEref_quantityStorageOutputFlow61, NotificationChain msgs) {
		quantityStorageOutputFlow61 oldEref_quantityStorageOutputFlow61 = eref_quantityStorageOutputFlow61;
		eref_quantityStorageOutputFlow61 = newEref_quantityStorageOutputFlow61;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW__EREF_QUANTITY_STORAGE_OUTPUT_FLOW61, oldEref_quantityStorageOutputFlow61, newEref_quantityStorageOutputFlow61);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEref_quantityStorageOutputFlow61(quantityStorageOutputFlow61 newEref_quantityStorageOutputFlow61) {
		if (newEref_quantityStorageOutputFlow61 != eref_quantityStorageOutputFlow61) {
			NotificationChain msgs = null;
			if (eref_quantityStorageOutputFlow61 != null)
				msgs = ((InternalEObject)eref_quantityStorageOutputFlow61).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW__EREF_QUANTITY_STORAGE_OUTPUT_FLOW61, null, msgs);
			if (newEref_quantityStorageOutputFlow61 != null)
				msgs = ((InternalEObject)newEref_quantityStorageOutputFlow61).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW__EREF_QUANTITY_STORAGE_OUTPUT_FLOW61, null, msgs);
			msgs = basicSetEref_quantityStorageOutputFlow61(newEref_quantityStorageOutputFlow61, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW__EREF_QUANTITY_STORAGE_OUTPUT_FLOW61, newEref_quantityStorageOutputFlow61, newEref_quantityStorageOutputFlow61));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public sourceStorageOutputFlow62 getEref_sourceStorageOutputFlow62() {
		return eref_sourceStorageOutputFlow62;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEref_sourceStorageOutputFlow62(sourceStorageOutputFlow62 newEref_sourceStorageOutputFlow62, NotificationChain msgs) {
		sourceStorageOutputFlow62 oldEref_sourceStorageOutputFlow62 = eref_sourceStorageOutputFlow62;
		eref_sourceStorageOutputFlow62 = newEref_sourceStorageOutputFlow62;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW__EREF_SOURCE_STORAGE_OUTPUT_FLOW62, oldEref_sourceStorageOutputFlow62, newEref_sourceStorageOutputFlow62);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEref_sourceStorageOutputFlow62(sourceStorageOutputFlow62 newEref_sourceStorageOutputFlow62) {
		if (newEref_sourceStorageOutputFlow62 != eref_sourceStorageOutputFlow62) {
			NotificationChain msgs = null;
			if (eref_sourceStorageOutputFlow62 != null)
				msgs = ((InternalEObject)eref_sourceStorageOutputFlow62).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW__EREF_SOURCE_STORAGE_OUTPUT_FLOW62, null, msgs);
			if (newEref_sourceStorageOutputFlow62 != null)
				msgs = ((InternalEObject)newEref_sourceStorageOutputFlow62).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW__EREF_SOURCE_STORAGE_OUTPUT_FLOW62, null, msgs);
			msgs = basicSetEref_sourceStorageOutputFlow62(newEref_sourceStorageOutputFlow62, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW__EREF_SOURCE_STORAGE_OUTPUT_FLOW62, newEref_sourceStorageOutputFlow62, newEref_sourceStorageOutputFlow62));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public destinationStorageOutputFlow63 getEref_destinationStorageOutputFlow63() {
		return eref_destinationStorageOutputFlow63;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEref_destinationStorageOutputFlow63(destinationStorageOutputFlow63 newEref_destinationStorageOutputFlow63, NotificationChain msgs) {
		destinationStorageOutputFlow63 oldEref_destinationStorageOutputFlow63 = eref_destinationStorageOutputFlow63;
		eref_destinationStorageOutputFlow63 = newEref_destinationStorageOutputFlow63;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW__EREF_DESTINATION_STORAGE_OUTPUT_FLOW63, oldEref_destinationStorageOutputFlow63, newEref_destinationStorageOutputFlow63);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEref_destinationStorageOutputFlow63(destinationStorageOutputFlow63 newEref_destinationStorageOutputFlow63) {
		if (newEref_destinationStorageOutputFlow63 != eref_destinationStorageOutputFlow63) {
			NotificationChain msgs = null;
			if (eref_destinationStorageOutputFlow63 != null)
				msgs = ((InternalEObject)eref_destinationStorageOutputFlow63).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW__EREF_DESTINATION_STORAGE_OUTPUT_FLOW63, null, msgs);
			if (newEref_destinationStorageOutputFlow63 != null)
				msgs = ((InternalEObject)newEref_destinationStorageOutputFlow63).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW__EREF_DESTINATION_STORAGE_OUTPUT_FLOW63, null, msgs);
			msgs = basicSetEref_destinationStorageOutputFlow63(newEref_destinationStorageOutputFlow63, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW__EREF_DESTINATION_STORAGE_OUTPUT_FLOW63, newEref_destinationStorageOutputFlow63, newEref_destinationStorageOutputFlow63));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, Metamodel_bdslPackage.STORAGE__STORAGE_OUTPUT_FLOW, Storage.class, msgs);
				return basicSetSource((Storage)otherEnd, msgs);
			case Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW__DESTINATION:
				if (destination != null)
					msgs = ((InternalEObject)destination).eInverseRemove(this, Metamodel_bdslPackage.PROCESS__STORAGE_OUTPUT_FLOW, metamodel_bdsl.Process.class, msgs);
				return basicSetDestination((metamodel_bdsl.Process)otherEnd, msgs);
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
			case Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW__CONTAINS_SIRIUS_TAG:
				return ((InternalEList<?>)getContainsSiriusTag()).basicRemove(otherEnd, msgs);
			case Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW__SOURCE:
				return basicSetSource(null, msgs);
			case Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW__DESTINATION:
				return basicSetDestination(null, msgs);
			case Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW__EREF_QUANTITY_STORAGE_OUTPUT_FLOW61:
				return basicSetEref_quantityStorageOutputFlow61(null, msgs);
			case Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW__EREF_SOURCE_STORAGE_OUTPUT_FLOW62:
				return basicSetEref_sourceStorageOutputFlow62(null, msgs);
			case Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW__EREF_DESTINATION_STORAGE_OUTPUT_FLOW63:
				return basicSetEref_destinationStorageOutputFlow63(null, msgs);
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
			case Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW__CONTAINS_SIRIUS_TAG:
				return getContainsSiriusTag();
			case Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW__NONE_ELEMENT:
				return getNoneElement();
			case Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW__DESTINATION:
				if (resolve) return getDestination();
				return basicGetDestination();
			case Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW__EREF_QUANTITY_STORAGE_OUTPUT_FLOW61:
				return getEref_quantityStorageOutputFlow61();
			case Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW__EREF_SOURCE_STORAGE_OUTPUT_FLOW62:
				return getEref_sourceStorageOutputFlow62();
			case Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW__EREF_DESTINATION_STORAGE_OUTPUT_FLOW63:
				return getEref_destinationStorageOutputFlow63();
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
			case Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW__CONTAINS_SIRIUS_TAG:
				getContainsSiriusTag().clear();
				getContainsSiriusTag().addAll((Collection<? extends SiriusTag>)newValue);
				return;
			case Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW__NONE_ELEMENT:
				getNoneElement().clear();
				getNoneElement().addAll((Collection<? extends NoneElement>)newValue);
				return;
			case Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW__SOURCE:
				setSource((Storage)newValue);
				return;
			case Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW__DESTINATION:
				setDestination((metamodel_bdsl.Process)newValue);
				return;
			case Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW__EREF_QUANTITY_STORAGE_OUTPUT_FLOW61:
				setEref_quantityStorageOutputFlow61((quantityStorageOutputFlow61)newValue);
				return;
			case Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW__EREF_SOURCE_STORAGE_OUTPUT_FLOW62:
				setEref_sourceStorageOutputFlow62((sourceStorageOutputFlow62)newValue);
				return;
			case Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW__EREF_DESTINATION_STORAGE_OUTPUT_FLOW63:
				setEref_destinationStorageOutputFlow63((destinationStorageOutputFlow63)newValue);
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
			case Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW__CONTAINS_SIRIUS_TAG:
				getContainsSiriusTag().clear();
				return;
			case Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW__NONE_ELEMENT:
				getNoneElement().clear();
				return;
			case Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW__SOURCE:
				setSource((Storage)null);
				return;
			case Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW__DESTINATION:
				setDestination((metamodel_bdsl.Process)null);
				return;
			case Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW__EREF_QUANTITY_STORAGE_OUTPUT_FLOW61:
				setEref_quantityStorageOutputFlow61((quantityStorageOutputFlow61)null);
				return;
			case Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW__EREF_SOURCE_STORAGE_OUTPUT_FLOW62:
				setEref_sourceStorageOutputFlow62((sourceStorageOutputFlow62)null);
				return;
			case Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW__EREF_DESTINATION_STORAGE_OUTPUT_FLOW63:
				setEref_destinationStorageOutputFlow63((destinationStorageOutputFlow63)null);
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
			case Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW__CONTAINS_SIRIUS_TAG:
				return containsSiriusTag != null && !containsSiriusTag.isEmpty();
			case Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW__NONE_ELEMENT:
				return noneElement != null && !noneElement.isEmpty();
			case Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW__SOURCE:
				return source != null;
			case Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW__DESTINATION:
				return destination != null;
			case Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW__EREF_QUANTITY_STORAGE_OUTPUT_FLOW61:
				return eref_quantityStorageOutputFlow61 != null;
			case Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW__EREF_SOURCE_STORAGE_OUTPUT_FLOW62:
				return eref_sourceStorageOutputFlow62 != null;
			case Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW__EREF_DESTINATION_STORAGE_OUTPUT_FLOW63:
				return eref_destinationStorageOutputFlow63 != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == BindingElement.class) {
			switch (derivedFeatureID) {
				case Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW__CONTAINS_SIRIUS_TAG: return Metamodel_bdslPackage.BINDING_ELEMENT__CONTAINS_SIRIUS_TAG;
				case Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW__NONE_ELEMENT: return Metamodel_bdslPackage.BINDING_ELEMENT__NONE_ELEMENT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == BindingElement.class) {
			switch (baseFeatureID) {
				case Metamodel_bdslPackage.BINDING_ELEMENT__CONTAINS_SIRIUS_TAG: return Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW__CONTAINS_SIRIUS_TAG;
				case Metamodel_bdslPackage.BINDING_ELEMENT__NONE_ELEMENT: return Metamodel_bdslPackage.STORAGE_OUTPUT_FLOW__NONE_ELEMENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //StorageOutputFlowImpl
