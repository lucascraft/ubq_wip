/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezsequence.impl;

import net.sf.smbt.ezsequence.AbstractPort;
import net.sf.smbt.ezsequence.EzsequencePackage;
import net.sf.smbt.ezsequence.TimeSlot;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Slot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezsequence.impl.TimeSlotImpl#getTriggerLink <em>Trigger Link</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeSlotImpl extends MinimalEObjectImpl.Container implements TimeSlot {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeSlotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzsequencePackage.Literals.TIME_SLOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractPort getTriggerLink() {
		return (AbstractPort)eGet(EzsequencePackage.Literals.TIME_SLOT__TRIGGER_LINK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriggerLink(AbstractPort newTriggerLink) {
		eSet(EzsequencePackage.Literals.TIME_SLOT__TRIGGER_LINK, newTriggerLink);
	}

} //TimeSlotImpl
