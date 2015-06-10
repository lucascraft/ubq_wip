/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezabletonctrl.impl;

import net.sf.smbt.ezabletonctrl.AbstractMixerDevice;
import net.sf.smbt.ezabletonctrl.EzabletonctrlPackage;
import net.sf.smbt.ezabletonctrl.LiveParam;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Mixer Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.AbstractMixerDeviceImpl#getVolume <em>Volume</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.AbstractMixerDeviceImpl#getPanning <em>Panning</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.AbstractMixerDeviceImpl#getSends <em>Sends</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbstractMixerDeviceImpl extends MinimalEObjectImpl.Container implements AbstractMixerDevice {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractMixerDeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzabletonctrlPackage.Literals.ABSTRACT_MIXER_DEVICE;
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
	public LiveParam getVolume() {
		return (LiveParam)eGet(EzabletonctrlPackage.Literals.ABSTRACT_MIXER_DEVICE__VOLUME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolume(LiveParam newVolume) {
		eSet(EzabletonctrlPackage.Literals.ABSTRACT_MIXER_DEVICE__VOLUME, newVolume);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveParam getPanning() {
		return (LiveParam)eGet(EzabletonctrlPackage.Literals.ABSTRACT_MIXER_DEVICE__PANNING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPanning(LiveParam newPanning) {
		eSet(EzabletonctrlPackage.Literals.ABSTRACT_MIXER_DEVICE__PANNING, newPanning);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<LiveParam> getSends() {
		return (EList<LiveParam>)eGet(EzabletonctrlPackage.Literals.ABSTRACT_MIXER_DEVICE__SENDS, true);
	}

} //AbstractMixerDeviceImpl
