/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.typing.atl_types.annotations.impl;

import genericity.typing.atl_types.annotations.AnnotationsPackage;
import genericity.typing.atl_types.annotations.CallExprAnn;
import genericity.typing.atl_types.annotations.ContextHelperAnn;
import genericity.typing.atl_types.annotations.ExpressionAnnotation;

import genericity.typing.atl_types.annotations.ModuleCallableAnn;
import genericity.typing.atl_types.annotations.HelperAnn;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Expr Ann</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link genericity.typing.atl_types.annotations.impl.CallExprAnnImpl#getSource <em>Source</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.impl.CallExprAnnImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.impl.CallExprAnnImpl#getStaticResolver <em>Static Resolver</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.impl.CallExprAnnImpl#getDynamicResolvers <em>Dynamic Resolvers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CallExprAnnImpl extends ExpressionAnnotationImpl implements CallExprAnn {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected ExpressionAnnotation source;

	/**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<ExpressionAnnotation> arguments;

	/**
	 * The cached value of the '{@link #getStaticResolver() <em>Static Resolver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticResolver()
	 * @generated
	 * @ordered
	 */
	protected ModuleCallableAnn staticResolver;

	/**
	 * The cached value of the '{@link #getDynamicResolvers() <em>Dynamic Resolvers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicResolvers()
	 * @generated
	 * @ordered
	 */
	protected EList<ContextHelperAnn> dynamicResolvers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallExprAnnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnnotationsPackage.Literals.CALL_EXPR_ANN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionAnnotation getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(ExpressionAnnotation newSource, NotificationChain msgs) {
		ExpressionAnnotation oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnnotationsPackage.CALL_EXPR_ANN__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(ExpressionAnnotation newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnnotationsPackage.CALL_EXPR_ANN__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnnotationsPackage.CALL_EXPR_ANN__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsPackage.CALL_EXPR_ANN__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExpressionAnnotation> getArguments() {
		if (arguments == null) {
			arguments = new EObjectContainmentEList<ExpressionAnnotation>(ExpressionAnnotation.class, this, AnnotationsPackage.CALL_EXPR_ANN__ARGUMENTS);
		}
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleCallableAnn getStaticResolver() {
		if (staticResolver != null && staticResolver.eIsProxy()) {
			InternalEObject oldStaticResolver = (InternalEObject)staticResolver;
			staticResolver = (ModuleCallableAnn)eResolveProxy(oldStaticResolver);
			if (staticResolver != oldStaticResolver) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnnotationsPackage.CALL_EXPR_ANN__STATIC_RESOLVER, oldStaticResolver, staticResolver));
			}
		}
		return staticResolver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleCallableAnn basicGetStaticResolver() {
		return staticResolver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStaticResolver(ModuleCallableAnn newStaticResolver, NotificationChain msgs) {
		ModuleCallableAnn oldStaticResolver = staticResolver;
		staticResolver = newStaticResolver;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnnotationsPackage.CALL_EXPR_ANN__STATIC_RESOLVER, oldStaticResolver, newStaticResolver);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStaticResolver(ModuleCallableAnn newStaticResolver) {
		if (newStaticResolver != staticResolver) {
			NotificationChain msgs = null;
			if (staticResolver != null)
				msgs = ((InternalEObject)staticResolver).eInverseRemove(this, AnnotationsPackage.MODULE_CALLABLE_ANN__CALLED_BY, ModuleCallableAnn.class, msgs);
			if (newStaticResolver != null)
				msgs = ((InternalEObject)newStaticResolver).eInverseAdd(this, AnnotationsPackage.MODULE_CALLABLE_ANN__CALLED_BY, ModuleCallableAnn.class, msgs);
			msgs = basicSetStaticResolver(newStaticResolver, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsPackage.CALL_EXPR_ANN__STATIC_RESOLVER, newStaticResolver, newStaticResolver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContextHelperAnn> getDynamicResolvers() {
		if (dynamicResolvers == null) {
			dynamicResolvers = new EObjectWithInverseResolvingEList.ManyInverse<ContextHelperAnn>(ContextHelperAnn.class, this, AnnotationsPackage.CALL_EXPR_ANN__DYNAMIC_RESOLVERS, AnnotationsPackage.CONTEXT_HELPER_ANN__POLYMORPHIC_CALLED_BY);
		}
		return dynamicResolvers;
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
			case AnnotationsPackage.CALL_EXPR_ANN__STATIC_RESOLVER:
				if (staticResolver != null)
					msgs = ((InternalEObject)staticResolver).eInverseRemove(this, AnnotationsPackage.MODULE_CALLABLE_ANN__CALLED_BY, ModuleCallableAnn.class, msgs);
				return basicSetStaticResolver((ModuleCallableAnn)otherEnd, msgs);
			case AnnotationsPackage.CALL_EXPR_ANN__DYNAMIC_RESOLVERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDynamicResolvers()).basicAdd(otherEnd, msgs);
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
			case AnnotationsPackage.CALL_EXPR_ANN__SOURCE:
				return basicSetSource(null, msgs);
			case AnnotationsPackage.CALL_EXPR_ANN__ARGUMENTS:
				return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
			case AnnotationsPackage.CALL_EXPR_ANN__STATIC_RESOLVER:
				return basicSetStaticResolver(null, msgs);
			case AnnotationsPackage.CALL_EXPR_ANN__DYNAMIC_RESOLVERS:
				return ((InternalEList<?>)getDynamicResolvers()).basicRemove(otherEnd, msgs);
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
			case AnnotationsPackage.CALL_EXPR_ANN__SOURCE:
				return getSource();
			case AnnotationsPackage.CALL_EXPR_ANN__ARGUMENTS:
				return getArguments();
			case AnnotationsPackage.CALL_EXPR_ANN__STATIC_RESOLVER:
				if (resolve) return getStaticResolver();
				return basicGetStaticResolver();
			case AnnotationsPackage.CALL_EXPR_ANN__DYNAMIC_RESOLVERS:
				return getDynamicResolvers();
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
			case AnnotationsPackage.CALL_EXPR_ANN__SOURCE:
				setSource((ExpressionAnnotation)newValue);
				return;
			case AnnotationsPackage.CALL_EXPR_ANN__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends ExpressionAnnotation>)newValue);
				return;
			case AnnotationsPackage.CALL_EXPR_ANN__STATIC_RESOLVER:
				setStaticResolver((ModuleCallableAnn)newValue);
				return;
			case AnnotationsPackage.CALL_EXPR_ANN__DYNAMIC_RESOLVERS:
				getDynamicResolvers().clear();
				getDynamicResolvers().addAll((Collection<? extends ContextHelperAnn>)newValue);
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
			case AnnotationsPackage.CALL_EXPR_ANN__SOURCE:
				setSource((ExpressionAnnotation)null);
				return;
			case AnnotationsPackage.CALL_EXPR_ANN__ARGUMENTS:
				getArguments().clear();
				return;
			case AnnotationsPackage.CALL_EXPR_ANN__STATIC_RESOLVER:
				setStaticResolver((ModuleCallableAnn)null);
				return;
			case AnnotationsPackage.CALL_EXPR_ANN__DYNAMIC_RESOLVERS:
				getDynamicResolvers().clear();
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
			case AnnotationsPackage.CALL_EXPR_ANN__SOURCE:
				return source != null;
			case AnnotationsPackage.CALL_EXPR_ANN__ARGUMENTS:
				return arguments != null && !arguments.isEmpty();
			case AnnotationsPackage.CALL_EXPR_ANN__STATIC_RESOLVER:
				return staticResolver != null;
			case AnnotationsPackage.CALL_EXPR_ANN__DYNAMIC_RESOLVERS:
				return dynamicResolvers != null && !dynamicResolvers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CallExprAnnImpl
