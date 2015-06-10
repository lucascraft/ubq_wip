/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.jzmui.impl;

import net.sf.smbt.jzmui.JZJazzInterface;
import net.sf.smbt.jzmui.JzmuiPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JZ Jazz Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZJazzInterfaceImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZJazzInterfaceImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZJazzInterfaceImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZJazzInterfaceImpl#getOrientation <em>Orientation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JZJazzInterfaceImpl extends JZContainerImpl implements JZJazzInterface {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JZJazzInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JzmuiPackage.Literals.JZ_JAZZ_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWidth() {
		return (Integer)eGet(JzmuiPackage.Literals.JZ_JAZZ_INTERFACE__WIDTH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(int newWidth) {
		eSet(JzmuiPackage.Literals.JZ_JAZZ_INTERFACE__WIDTH, newWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeight() {
		return (Integer)eGet(JzmuiPackage.Literals.JZ_JAZZ_INTERFACE__HEIGHT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(int newHeight) {
		eSet(JzmuiPackage.Literals.JZ_JAZZ_INTERFACE__HEIGHT, newHeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMode() {
		return (String)eGet(JzmuiPackage.Literals.JZ_JAZZ_INTERFACE__MODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(String newMode) {
		eSet(JzmuiPackage.Literals.JZ_JAZZ_INTERFACE__MODE, newMode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrientation() {
		return (String)eGet(JzmuiPackage.Literals.JZ_JAZZ_INTERFACE__ORIENTATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrientation(String newOrientation) {
		eSet(JzmuiPackage.Literals.JZ_JAZZ_INTERFACE__ORIENTATION, newOrientation);
	}

} //JZJazzInterfaceImpl
