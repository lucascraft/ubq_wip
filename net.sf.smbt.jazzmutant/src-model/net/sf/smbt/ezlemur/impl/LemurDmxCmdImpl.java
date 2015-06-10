/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezlemur.impl;

import net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXCmdImpl;
import net.sf.smbt.ezlemur.AbstractLemurOscCmd;
import net.sf.smbt.ezlemur.EzlemurPackage;
import net.sf.smbt.ezlemur.LemurDmxCmd;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lemur Dmx Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezlemur.impl.LemurDmxCmdImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LemurDmxCmdImpl extends OpenDMXCmdImpl implements LemurDmxCmd {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LemurDmxCmdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzlemurPackage.Literals.LEMUR_DMX_CMD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature getTarget() {
		return (EStructuralFeature)eGet(EzlemurPackage.Literals.ABSTRACT_LEMUR_OSC_CMD__TARGET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(EStructuralFeature newTarget) {
		eSet(EzlemurPackage.Literals.ABSTRACT_LEMUR_OSC_CMD__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractLemurOscCmd.class) {
			switch (derivedFeatureID) {
				case EzlemurPackage.LEMUR_DMX_CMD__TARGET: return EzlemurPackage.ABSTRACT_LEMUR_OSC_CMD__TARGET;
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
		if (baseClass == AbstractLemurOscCmd.class) {
			switch (baseFeatureID) {
				case EzlemurPackage.ABSTRACT_LEMUR_OSC_CMD__TARGET: return EzlemurPackage.LEMUR_DMX_CMD__TARGET;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //LemurDmxCmdImpl
