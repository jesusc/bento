/**
 */
package metamodel_bdsl.impl;

import java.util.Collection;

import metamodel_bdsl.BindingElement;
import metamodel_bdsl.Metamodel_bdslPackage;
import metamodel_bdsl.NoneElement;
import metamodel_bdsl.Output;
import metamodel_bdsl.Probability;
import metamodel_bdsl.ProcessOutputFlow;
import metamodel_bdsl.SiriusTag;
import metamodel_bdsl.Storage;

import metamodel_bdsl.destinationProcessOutputFlow74;
import metamodel_bdsl.processOutputFlowDelayProcessOutputFlow73;
import metamodel_bdsl.quantityProcessOutputFlow71;
import metamodel_bdsl.sourceProcessOutputFlow72;
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
 * An implementation of the model object '<em><b>Process Output Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metamodel_bdsl.impl.ProcessOutputFlowImpl#getContainsSiriusTag <em>Contains Sirius Tag</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.ProcessOutputFlowImpl#getNoneElement <em>None Element</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.ProcessOutputFlowImpl#getSource <em>Source</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.ProcessOutputFlowImpl#getProcessOutputFlowDelay <em>Process Output Flow Delay</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.ProcessOutputFlowImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.ProcessOutputFlowImpl#getEref_quantityProcessOutputFlow71 <em>Eref quantity Process Output Flow71</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.ProcessOutputFlowImpl#getEref_sourceProcessOutputFlow72 <em>Eref source Process Output Flow72</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.ProcessOutputFlowImpl#getEref_processOutputFlowDelayProcessOutputFlow73 <em>Eref process Output Flow Delay Process Output Flow73</em>}</li>
 *   <li>{@link metamodel_bdsl.impl.ProcessOutputFlowImpl#getEref_destinationProcessOutputFlow74 <em>Eref destination Process Output Flow74</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessOutputFlowImpl extends FlowImpl implements ProcessOutputFlow {
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
	protected Output source;

	/**
	 * The cached value of the '{@link #getProcessOutputFlowDelay() <em>Process Output Flow Delay</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessOutputFlowDelay()
	 * @generated
	 * @ordered
	 */
	protected Probability processOutputFlowDelay;

	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected Storage destination;

	/**
	 * The cached value of the '{@link #getEref_quantityProcessOutputFlow71() <em>Eref quantity Process Output Flow71</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEref_quantityProcessOutputFlow71()
	 * @generated
	 * @ordered
	 */
	protected quantityProcessOutputFlow71 eref_quantityProcessOutputFlow71;

	/**
	 * The cached value of the '{@link #getEref_sourceProcessOutputFlow72() <em>Eref source Process Output Flow72</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEref_sourceProcessOutputFlow72()
	 * @generated
	 * @ordered
	 */
	protected sourceProcessOutputFlow72 eref_sourceProcessOutputFlow72;

	/**
	 * The cached value of the '{@link #getEref_processOutputFlowDelayProcessOutputFlow73() <em>Eref process Output Flow Delay Process Output Flow73</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEref_processOutputFlowDelayProcessOutputFlow73()
	 * @generated
	 * @ordered
	 */
	protected processOutputFlowDelayProcessOutputFlow73 eref_processOutputFlowDelayProcessOutputFlow73;

	/**
	 * The cached value of the '{@link #getEref_destinationProcessOutputFlow74() <em>Eref destination Process Output Flow74</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEref_destinationProcessOutputFlow74()
	 * @generated
	 * @ordered
	 */
	protected destinationProcessOutputFlow74 eref_destinationProcessOutputFlow74;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessOutputFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Metamodel_bdslPackage.Literals.PROCESS_OUTPUT_FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SiriusTag> getContainsSiriusTag() {
		if (containsSiriusTag == null) {
			containsSiriusTag = new EObjectContainmentEList<SiriusTag>(SiriusTag.class, this, Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__CONTAINS_SIRIUS_TAG);
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
			noneElement = new EObjectResolvingEList<NoneElement>(NoneElement.class, this, Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__NONE_ELEMENT);
		}
		return noneElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Output getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Output)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Output basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Output newSource, NotificationChain msgs) {
		Output oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Output newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, Metamodel_bdslPackage.OUTPUT__PROCESS_OUTPUT_FLOW, Output.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, Metamodel_bdslPackage.OUTPUT__PROCESS_OUTPUT_FLOW, Output.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Probability getProcessOutputFlowDelay() {
		return processOutputFlowDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcessOutputFlowDelay(Probability newProcessOutputFlowDelay, NotificationChain msgs) {
		Probability oldProcessOutputFlowDelay = processOutputFlowDelay;
		processOutputFlowDelay = newProcessOutputFlowDelay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__PROCESS_OUTPUT_FLOW_DELAY, oldProcessOutputFlowDelay, newProcessOutputFlowDelay);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessOutputFlowDelay(Probability newProcessOutputFlowDelay) {
		if (newProcessOutputFlowDelay != processOutputFlowDelay) {
			NotificationChain msgs = null;
			if (processOutputFlowDelay != null)
				msgs = ((InternalEObject)processOutputFlowDelay).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__PROCESS_OUTPUT_FLOW_DELAY, null, msgs);
			if (newProcessOutputFlowDelay != null)
				msgs = ((InternalEObject)newProcessOutputFlowDelay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__PROCESS_OUTPUT_FLOW_DELAY, null, msgs);
			msgs = basicSetProcessOutputFlowDelay(newProcessOutputFlowDelay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__PROCESS_OUTPUT_FLOW_DELAY, newProcessOutputFlowDelay, newProcessOutputFlowDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Storage getDestination() {
		if (destination != null && destination.eIsProxy()) {
			InternalEObject oldDestination = (InternalEObject)destination;
			destination = (Storage)eResolveProxy(oldDestination);
			if (destination != oldDestination) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__DESTINATION, oldDestination, destination));
			}
		}
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Storage basicGetDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDestination(Storage newDestination, NotificationChain msgs) {
		Storage oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__DESTINATION, oldDestination, newDestination);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestination(Storage newDestination) {
		if (newDestination != destination) {
			NotificationChain msgs = null;
			if (destination != null)
				msgs = ((InternalEObject)destination).eInverseRemove(this, Metamodel_bdslPackage.STORAGE__PROCESS_OUTPUT_FLOW, Storage.class, msgs);
			if (newDestination != null)
				msgs = ((InternalEObject)newDestination).eInverseAdd(this, Metamodel_bdslPackage.STORAGE__PROCESS_OUTPUT_FLOW, Storage.class, msgs);
			msgs = basicSetDestination(newDestination, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__DESTINATION, newDestination, newDestination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public quantityProcessOutputFlow71 getEref_quantityProcessOutputFlow71() {
		return eref_quantityProcessOutputFlow71;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEref_quantityProcessOutputFlow71(quantityProcessOutputFlow71 newEref_quantityProcessOutputFlow71, NotificationChain msgs) {
		quantityProcessOutputFlow71 oldEref_quantityProcessOutputFlow71 = eref_quantityProcessOutputFlow71;
		eref_quantityProcessOutputFlow71 = newEref_quantityProcessOutputFlow71;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__EREF_QUANTITY_PROCESS_OUTPUT_FLOW71, oldEref_quantityProcessOutputFlow71, newEref_quantityProcessOutputFlow71);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEref_quantityProcessOutputFlow71(quantityProcessOutputFlow71 newEref_quantityProcessOutputFlow71) {
		if (newEref_quantityProcessOutputFlow71 != eref_quantityProcessOutputFlow71) {
			NotificationChain msgs = null;
			if (eref_quantityProcessOutputFlow71 != null)
				msgs = ((InternalEObject)eref_quantityProcessOutputFlow71).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__EREF_QUANTITY_PROCESS_OUTPUT_FLOW71, null, msgs);
			if (newEref_quantityProcessOutputFlow71 != null)
				msgs = ((InternalEObject)newEref_quantityProcessOutputFlow71).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__EREF_QUANTITY_PROCESS_OUTPUT_FLOW71, null, msgs);
			msgs = basicSetEref_quantityProcessOutputFlow71(newEref_quantityProcessOutputFlow71, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__EREF_QUANTITY_PROCESS_OUTPUT_FLOW71, newEref_quantityProcessOutputFlow71, newEref_quantityProcessOutputFlow71));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public sourceProcessOutputFlow72 getEref_sourceProcessOutputFlow72() {
		return eref_sourceProcessOutputFlow72;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEref_sourceProcessOutputFlow72(sourceProcessOutputFlow72 newEref_sourceProcessOutputFlow72, NotificationChain msgs) {
		sourceProcessOutputFlow72 oldEref_sourceProcessOutputFlow72 = eref_sourceProcessOutputFlow72;
		eref_sourceProcessOutputFlow72 = newEref_sourceProcessOutputFlow72;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__EREF_SOURCE_PROCESS_OUTPUT_FLOW72, oldEref_sourceProcessOutputFlow72, newEref_sourceProcessOutputFlow72);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEref_sourceProcessOutputFlow72(sourceProcessOutputFlow72 newEref_sourceProcessOutputFlow72) {
		if (newEref_sourceProcessOutputFlow72 != eref_sourceProcessOutputFlow72) {
			NotificationChain msgs = null;
			if (eref_sourceProcessOutputFlow72 != null)
				msgs = ((InternalEObject)eref_sourceProcessOutputFlow72).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__EREF_SOURCE_PROCESS_OUTPUT_FLOW72, null, msgs);
			if (newEref_sourceProcessOutputFlow72 != null)
				msgs = ((InternalEObject)newEref_sourceProcessOutputFlow72).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__EREF_SOURCE_PROCESS_OUTPUT_FLOW72, null, msgs);
			msgs = basicSetEref_sourceProcessOutputFlow72(newEref_sourceProcessOutputFlow72, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__EREF_SOURCE_PROCESS_OUTPUT_FLOW72, newEref_sourceProcessOutputFlow72, newEref_sourceProcessOutputFlow72));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public processOutputFlowDelayProcessOutputFlow73 getEref_processOutputFlowDelayProcessOutputFlow73() {
		return eref_processOutputFlowDelayProcessOutputFlow73;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEref_processOutputFlowDelayProcessOutputFlow73(processOutputFlowDelayProcessOutputFlow73 newEref_processOutputFlowDelayProcessOutputFlow73, NotificationChain msgs) {
		processOutputFlowDelayProcessOutputFlow73 oldEref_processOutputFlowDelayProcessOutputFlow73 = eref_processOutputFlowDelayProcessOutputFlow73;
		eref_processOutputFlowDelayProcessOutputFlow73 = newEref_processOutputFlowDelayProcessOutputFlow73;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__EREF_PROCESS_OUTPUT_FLOW_DELAY_PROCESS_OUTPUT_FLOW73, oldEref_processOutputFlowDelayProcessOutputFlow73, newEref_processOutputFlowDelayProcessOutputFlow73);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEref_processOutputFlowDelayProcessOutputFlow73(processOutputFlowDelayProcessOutputFlow73 newEref_processOutputFlowDelayProcessOutputFlow73) {
		if (newEref_processOutputFlowDelayProcessOutputFlow73 != eref_processOutputFlowDelayProcessOutputFlow73) {
			NotificationChain msgs = null;
			if (eref_processOutputFlowDelayProcessOutputFlow73 != null)
				msgs = ((InternalEObject)eref_processOutputFlowDelayProcessOutputFlow73).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__EREF_PROCESS_OUTPUT_FLOW_DELAY_PROCESS_OUTPUT_FLOW73, null, msgs);
			if (newEref_processOutputFlowDelayProcessOutputFlow73 != null)
				msgs = ((InternalEObject)newEref_processOutputFlowDelayProcessOutputFlow73).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__EREF_PROCESS_OUTPUT_FLOW_DELAY_PROCESS_OUTPUT_FLOW73, null, msgs);
			msgs = basicSetEref_processOutputFlowDelayProcessOutputFlow73(newEref_processOutputFlowDelayProcessOutputFlow73, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__EREF_PROCESS_OUTPUT_FLOW_DELAY_PROCESS_OUTPUT_FLOW73, newEref_processOutputFlowDelayProcessOutputFlow73, newEref_processOutputFlowDelayProcessOutputFlow73));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public destinationProcessOutputFlow74 getEref_destinationProcessOutputFlow74() {
		return eref_destinationProcessOutputFlow74;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEref_destinationProcessOutputFlow74(destinationProcessOutputFlow74 newEref_destinationProcessOutputFlow74, NotificationChain msgs) {
		destinationProcessOutputFlow74 oldEref_destinationProcessOutputFlow74 = eref_destinationProcessOutputFlow74;
		eref_destinationProcessOutputFlow74 = newEref_destinationProcessOutputFlow74;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__EREF_DESTINATION_PROCESS_OUTPUT_FLOW74, oldEref_destinationProcessOutputFlow74, newEref_destinationProcessOutputFlow74);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEref_destinationProcessOutputFlow74(destinationProcessOutputFlow74 newEref_destinationProcessOutputFlow74) {
		if (newEref_destinationProcessOutputFlow74 != eref_destinationProcessOutputFlow74) {
			NotificationChain msgs = null;
			if (eref_destinationProcessOutputFlow74 != null)
				msgs = ((InternalEObject)eref_destinationProcessOutputFlow74).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__EREF_DESTINATION_PROCESS_OUTPUT_FLOW74, null, msgs);
			if (newEref_destinationProcessOutputFlow74 != null)
				msgs = ((InternalEObject)newEref_destinationProcessOutputFlow74).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__EREF_DESTINATION_PROCESS_OUTPUT_FLOW74, null, msgs);
			msgs = basicSetEref_destinationProcessOutputFlow74(newEref_destinationProcessOutputFlow74, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__EREF_DESTINATION_PROCESS_OUTPUT_FLOW74, newEref_destinationProcessOutputFlow74, newEref_destinationProcessOutputFlow74));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, Metamodel_bdslPackage.OUTPUT__PROCESS_OUTPUT_FLOW, Output.class, msgs);
				return basicSetSource((Output)otherEnd, msgs);
			case Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__DESTINATION:
				if (destination != null)
					msgs = ((InternalEObject)destination).eInverseRemove(this, Metamodel_bdslPackage.STORAGE__PROCESS_OUTPUT_FLOW, Storage.class, msgs);
				return basicSetDestination((Storage)otherEnd, msgs);
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
			case Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__CONTAINS_SIRIUS_TAG:
				return ((InternalEList<?>)getContainsSiriusTag()).basicRemove(otherEnd, msgs);
			case Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__SOURCE:
				return basicSetSource(null, msgs);
			case Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__PROCESS_OUTPUT_FLOW_DELAY:
				return basicSetProcessOutputFlowDelay(null, msgs);
			case Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__DESTINATION:
				return basicSetDestination(null, msgs);
			case Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__EREF_QUANTITY_PROCESS_OUTPUT_FLOW71:
				return basicSetEref_quantityProcessOutputFlow71(null, msgs);
			case Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__EREF_SOURCE_PROCESS_OUTPUT_FLOW72:
				return basicSetEref_sourceProcessOutputFlow72(null, msgs);
			case Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__EREF_PROCESS_OUTPUT_FLOW_DELAY_PROCESS_OUTPUT_FLOW73:
				return basicSetEref_processOutputFlowDelayProcessOutputFlow73(null, msgs);
			case Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__EREF_DESTINATION_PROCESS_OUTPUT_FLOW74:
				return basicSetEref_destinationProcessOutputFlow74(null, msgs);
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
			case Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__CONTAINS_SIRIUS_TAG:
				return getContainsSiriusTag();
			case Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__NONE_ELEMENT:
				return getNoneElement();
			case Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__PROCESS_OUTPUT_FLOW_DELAY:
				return getProcessOutputFlowDelay();
			case Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__DESTINATION:
				if (resolve) return getDestination();
				return basicGetDestination();
			case Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__EREF_QUANTITY_PROCESS_OUTPUT_FLOW71:
				return getEref_quantityProcessOutputFlow71();
			case Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__EREF_SOURCE_PROCESS_OUTPUT_FLOW72:
				return getEref_sourceProcessOutputFlow72();
			case Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__EREF_PROCESS_OUTPUT_FLOW_DELAY_PROCESS_OUTPUT_FLOW73:
				return getEref_processOutputFlowDelayProcessOutputFlow73();
			case Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__EREF_DESTINATION_PROCESS_OUTPUT_FLOW74:
				return getEref_destinationProcessOutputFlow74();
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
			case Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__CONTAINS_SIRIUS_TAG:
				getContainsSiriusTag().clear();
				getContainsSiriusTag().addAll((Collection<? extends SiriusTag>)newValue);
				return;
			case Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__NONE_ELEMENT:
				getNoneElement().clear();
				getNoneElement().addAll((Collection<? extends NoneElement>)newValue);
				return;
			case Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__SOURCE:
				setSource((Output)newValue);
				return;
			case Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__PROCESS_OUTPUT_FLOW_DELAY:
				setProcessOutputFlowDelay((Probability)newValue);
				return;
			case Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__DESTINATION:
				setDestination((Storage)newValue);
				return;
			case Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__EREF_QUANTITY_PROCESS_OUTPUT_FLOW71:
				setEref_quantityProcessOutputFlow71((quantityProcessOutputFlow71)newValue);
				return;
			case Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__EREF_SOURCE_PROCESS_OUTPUT_FLOW72:
				setEref_sourceProcessOutputFlow72((sourceProcessOutputFlow72)newValue);
				return;
			case Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__EREF_PROCESS_OUTPUT_FLOW_DELAY_PROCESS_OUTPUT_FLOW73:
				setEref_processOutputFlowDelayProcessOutputFlow73((processOutputFlowDelayProcessOutputFlow73)newValue);
				return;
			case Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__EREF_DESTINATION_PROCESS_OUTPUT_FLOW74:
				setEref_destinationProcessOutputFlow74((destinationProcessOutputFlow74)newValue);
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
			case Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__CONTAINS_SIRIUS_TAG:
				getContainsSiriusTag().clear();
				return;
			case Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__NONE_ELEMENT:
				getNoneElement().clear();
				return;
			case Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__SOURCE:
				setSource((Output)null);
				return;
			case Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__PROCESS_OUTPUT_FLOW_DELAY:
				setProcessOutputFlowDelay((Probability)null);
				return;
			case Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__DESTINATION:
				setDestination((Storage)null);
				return;
			case Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__EREF_QUANTITY_PROCESS_OUTPUT_FLOW71:
				setEref_quantityProcessOutputFlow71((quantityProcessOutputFlow71)null);
				return;
			case Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__EREF_SOURCE_PROCESS_OUTPUT_FLOW72:
				setEref_sourceProcessOutputFlow72((sourceProcessOutputFlow72)null);
				return;
			case Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__EREF_PROCESS_OUTPUT_FLOW_DELAY_PROCESS_OUTPUT_FLOW73:
				setEref_processOutputFlowDelayProcessOutputFlow73((processOutputFlowDelayProcessOutputFlow73)null);
				return;
			case Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__EREF_DESTINATION_PROCESS_OUTPUT_FLOW74:
				setEref_destinationProcessOutputFlow74((destinationProcessOutputFlow74)null);
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
			case Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__CONTAINS_SIRIUS_TAG:
				return containsSiriusTag != null && !containsSiriusTag.isEmpty();
			case Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__NONE_ELEMENT:
				return noneElement != null && !noneElement.isEmpty();
			case Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__SOURCE:
				return source != null;
			case Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__PROCESS_OUTPUT_FLOW_DELAY:
				return processOutputFlowDelay != null;
			case Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__DESTINATION:
				return destination != null;
			case Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__EREF_QUANTITY_PROCESS_OUTPUT_FLOW71:
				return eref_quantityProcessOutputFlow71 != null;
			case Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__EREF_SOURCE_PROCESS_OUTPUT_FLOW72:
				return eref_sourceProcessOutputFlow72 != null;
			case Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__EREF_PROCESS_OUTPUT_FLOW_DELAY_PROCESS_OUTPUT_FLOW73:
				return eref_processOutputFlowDelayProcessOutputFlow73 != null;
			case Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__EREF_DESTINATION_PROCESS_OUTPUT_FLOW74:
				return eref_destinationProcessOutputFlow74 != null;
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
				case Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__CONTAINS_SIRIUS_TAG: return Metamodel_bdslPackage.BINDING_ELEMENT__CONTAINS_SIRIUS_TAG;
				case Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__NONE_ELEMENT: return Metamodel_bdslPackage.BINDING_ELEMENT__NONE_ELEMENT;
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
				case Metamodel_bdslPackage.BINDING_ELEMENT__CONTAINS_SIRIUS_TAG: return Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__CONTAINS_SIRIUS_TAG;
				case Metamodel_bdslPackage.BINDING_ELEMENT__NONE_ELEMENT: return Metamodel_bdslPackage.PROCESS_OUTPUT_FLOW__NONE_ELEMENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ProcessOutputFlowImpl
