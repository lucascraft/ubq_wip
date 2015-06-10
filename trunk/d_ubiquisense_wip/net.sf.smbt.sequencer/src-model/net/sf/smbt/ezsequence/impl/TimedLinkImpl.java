/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezsequence.impl;

import net.sf.smbt.ezsequence.AbstractPort;
import net.sf.smbt.ezsequence.EzsequencePackage;
import net.sf.smbt.ezsequence.TimedLink;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timed Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezsequence.impl.TimedLinkImpl#getBefore <em>Before</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.TimedLinkImpl#getAfter <em>After</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimedLinkImpl extends TimedObjImpl implements TimedLink {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimedLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzsequencePackage.Literals.TIMED_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractPort getBefore() {
		return (AbstractPort)eGet(EzsequencePackage.Literals.TIMED_LINK__BEFORE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBefore(AbstractPort newBefore) {
		eSet(EzsequencePackage.Literals.TIMED_LINK__BEFORE, newBefore);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractPort getAfter() {
		return (AbstractPort)eGet(EzsequencePackage.Literals.TIMED_LINK__AFTER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAfter(AbstractPort newAfter) {
		eSet(EzsequencePackage.Literals.TIMED_LINK__AFTER, newAfter);
	}

} //TimedLinkImpl
