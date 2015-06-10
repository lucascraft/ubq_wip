/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezdxxp.impl;

import net.sf.smbt.ezdxxp.DaapCmd;
import net.sf.smbt.ezdxxp.DaapListCmd;
import net.sf.smbt.ezdxxp.EzdxxpPackage;
import net.sf.smbt.ezdxxp.HttpProperty;
import net.sf.xqz.model.cmd.impl.CompoundCmdImpl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Daap List Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezdxxp.impl.DaapListCmdImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link net.sf.smbt.ezdxxp.impl.DaapListCmdImpl#getHttpProperties <em>Http Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DaapListCmdImpl extends CompoundCmdImpl implements DaapListCmd {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DaapListCmdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzdxxpPackage.Literals.DAAP_LIST_CMD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getTag() {
		return (byte[])eGet(EzdxxpPackage.Literals.DAAP_CMD__TAG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTag(byte[] newTag) {
		eSet(EzdxxpPackage.Literals.DAAP_CMD__TAG, newTag);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<HttpProperty> getHttpProperties() {
		return (EList<HttpProperty>)eGet(EzdxxpPackage.Literals.DAAP_CMD__HTTP_PROPERTIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == DaapCmd.class) {
			switch (derivedFeatureID) {
				case EzdxxpPackage.DAAP_LIST_CMD__TAG: return EzdxxpPackage.DAAP_CMD__TAG;
				case EzdxxpPackage.DAAP_LIST_CMD__HTTP_PROPERTIES: return EzdxxpPackage.DAAP_CMD__HTTP_PROPERTIES;
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
		if (baseClass == DaapCmd.class) {
			switch (baseFeatureID) {
				case EzdxxpPackage.DAAP_CMD__TAG: return EzdxxpPackage.DAAP_LIST_CMD__TAG;
				case EzdxxpPackage.DAAP_CMD__HTTP_PROPERTIES: return EzdxxpPackage.DAAP_LIST_CMD__HTTP_PROPERTIES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //DaapListCmdImpl
