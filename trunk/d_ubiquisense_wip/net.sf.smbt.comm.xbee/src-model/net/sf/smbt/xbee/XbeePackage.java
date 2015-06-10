/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.xbee;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.sf.smbt.xbee.XbeeFactory
 * @model kind="package"
 * @generated
 */
public interface XbeePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "xbee";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://xbee/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "xbee";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XbeePackage eINSTANCE = net.sf.smbt.xbee.impl.XbeePackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.xbee.impl.XbeeImpl <em>Xbee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.xbee.impl.XbeeImpl
	 * @see net.sf.smbt.xbee.impl.XbeePackageImpl#getXbee()
	 * @generated
	 */
	int XBEE = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBEE__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Series</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBEE__SERIES = 1;

	/**
	 * The feature id for the '<em><b>Freq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBEE__FREQ = 2;

	/**
	 * The feature id for the '<em><b>Modes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBEE__MODES = 3;

	/**
	 * The feature id for the '<em><b>Firmaware</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBEE__FIRMAWARE = 4;

	/**
	 * The number of structural features of the '<em>Xbee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBEE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link net.sf.smbt.xbee.XBEE_SERIES <em>XBEE SERIES</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.xbee.XBEE_SERIES
	 * @see net.sf.smbt.xbee.impl.XbeePackageImpl#getXBEE_SERIES()
	 * @generated
	 */
	int XBEE_SERIES = 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.xbee.XBEE_COMM_MODE <em>XBEE COMM MODE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.xbee.XBEE_COMM_MODE
	 * @see net.sf.smbt.xbee.impl.XbeePackageImpl#getXBEE_COMM_MODE()
	 * @generated
	 */
	int XBEE_COMM_MODE = 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.xbee.XBEE_FREQ <em>XBEE FREQ</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.xbee.XBEE_FREQ
	 * @see net.sf.smbt.xbee.impl.XbeePackageImpl#getXBEE_FREQ()
	 * @generated
	 */
	int XBEE_FREQ = 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.xbee.XBEE_FIRMAWARE <em>XBEE FIRMAWARE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.xbee.XBEE_FIRMAWARE
	 * @see net.sf.smbt.xbee.impl.XbeePackageImpl#getXBEE_FIRMAWARE()
	 * @generated
	 */
	int XBEE_FIRMAWARE = 4;

	/**
	 * The meta object id for the '{@link net.sf.smbt.xbee.XBEE_MANUFACTURER_ID <em>XBEE MANUFACTURER ID</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.xbee.XBEE_MANUFACTURER_ID
	 * @see net.sf.smbt.xbee.impl.XbeePackageImpl#getXBEE_MANUFACTURER_ID()
	 * @generated
	 */
	int XBEE_MANUFACTURER_ID = 5;

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.xbee.Xbee <em>Xbee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xbee</em>'.
	 * @see net.sf.smbt.xbee.Xbee
	 * @generated
	 */
	EClass getXbee();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.xbee.Xbee#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see net.sf.smbt.xbee.Xbee#getLabel()
	 * @see #getXbee()
	 * @generated
	 */
	EAttribute getXbee_Label();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.xbee.Xbee#getSeries <em>Series</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Series</em>'.
	 * @see net.sf.smbt.xbee.Xbee#getSeries()
	 * @see #getXbee()
	 * @generated
	 */
	EAttribute getXbee_Series();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.xbee.Xbee#getFreq <em>Freq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Freq</em>'.
	 * @see net.sf.smbt.xbee.Xbee#getFreq()
	 * @see #getXbee()
	 * @generated
	 */
	EAttribute getXbee_Freq();

	/**
	 * Returns the meta object for the attribute list '{@link net.sf.smbt.xbee.Xbee#getModes <em>Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Modes</em>'.
	 * @see net.sf.smbt.xbee.Xbee#getModes()
	 * @see #getXbee()
	 * @generated
	 */
	EAttribute getXbee_Modes();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.xbee.Xbee#getFirmaware <em>Firmaware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Firmaware</em>'.
	 * @see net.sf.smbt.xbee.Xbee#getFirmaware()
	 * @see #getXbee()
	 * @generated
	 */
	EAttribute getXbee_Firmaware();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.xbee.XBEE_SERIES <em>XBEE SERIES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>XBEE SERIES</em>'.
	 * @see net.sf.smbt.xbee.XBEE_SERIES
	 * @generated
	 */
	EEnum getXBEE_SERIES();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.xbee.XBEE_COMM_MODE <em>XBEE COMM MODE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>XBEE COMM MODE</em>'.
	 * @see net.sf.smbt.xbee.XBEE_COMM_MODE
	 * @generated
	 */
	EEnum getXBEE_COMM_MODE();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.xbee.XBEE_FREQ <em>XBEE FREQ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>XBEE FREQ</em>'.
	 * @see net.sf.smbt.xbee.XBEE_FREQ
	 * @generated
	 */
	EEnum getXBEE_FREQ();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.xbee.XBEE_FIRMAWARE <em>XBEE FIRMAWARE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>XBEE FIRMAWARE</em>'.
	 * @see net.sf.smbt.xbee.XBEE_FIRMAWARE
	 * @generated
	 */
	EEnum getXBEE_FIRMAWARE();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.xbee.XBEE_MANUFACTURER_ID <em>XBEE MANUFACTURER ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>XBEE MANUFACTURER ID</em>'.
	 * @see net.sf.smbt.xbee.XBEE_MANUFACTURER_ID
	 * @generated
	 */
	EEnum getXBEE_MANUFACTURER_ID();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XbeeFactory getXbeeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.sf.smbt.xbee.impl.XbeeImpl <em>Xbee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.xbee.impl.XbeeImpl
		 * @see net.sf.smbt.xbee.impl.XbeePackageImpl#getXbee()
		 * @generated
		 */
		EClass XBEE = eINSTANCE.getXbee();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XBEE__LABEL = eINSTANCE.getXbee_Label();

		/**
		 * The meta object literal for the '<em><b>Series</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XBEE__SERIES = eINSTANCE.getXbee_Series();

		/**
		 * The meta object literal for the '<em><b>Freq</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XBEE__FREQ = eINSTANCE.getXbee_Freq();

		/**
		 * The meta object literal for the '<em><b>Modes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XBEE__MODES = eINSTANCE.getXbee_Modes();

		/**
		 * The meta object literal for the '<em><b>Firmaware</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XBEE__FIRMAWARE = eINSTANCE.getXbee_Firmaware();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.xbee.XBEE_SERIES <em>XBEE SERIES</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.xbee.XBEE_SERIES
		 * @see net.sf.smbt.xbee.impl.XbeePackageImpl#getXBEE_SERIES()
		 * @generated
		 */
		EEnum XBEE_SERIES = eINSTANCE.getXBEE_SERIES();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.xbee.XBEE_COMM_MODE <em>XBEE COMM MODE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.xbee.XBEE_COMM_MODE
		 * @see net.sf.smbt.xbee.impl.XbeePackageImpl#getXBEE_COMM_MODE()
		 * @generated
		 */
		EEnum XBEE_COMM_MODE = eINSTANCE.getXBEE_COMM_MODE();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.xbee.XBEE_FREQ <em>XBEE FREQ</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.xbee.XBEE_FREQ
		 * @see net.sf.smbt.xbee.impl.XbeePackageImpl#getXBEE_FREQ()
		 * @generated
		 */
		EEnum XBEE_FREQ = eINSTANCE.getXBEE_FREQ();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.xbee.XBEE_FIRMAWARE <em>XBEE FIRMAWARE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.xbee.XBEE_FIRMAWARE
		 * @see net.sf.smbt.xbee.impl.XbeePackageImpl#getXBEE_FIRMAWARE()
		 * @generated
		 */
		EEnum XBEE_FIRMAWARE = eINSTANCE.getXBEE_FIRMAWARE();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.xbee.XBEE_MANUFACTURER_ID <em>XBEE MANUFACTURER ID</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.xbee.XBEE_MANUFACTURER_ID
		 * @see net.sf.smbt.xbee.impl.XbeePackageImpl#getXBEE_MANUFACTURER_ID()
		 * @generated
		 */
		EEnum XBEE_MANUFACTURER_ID = eINSTANCE.getXBEE_MANUFACTURER_ID();

	}

} //XbeePackage
