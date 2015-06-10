/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezlemur;

import net.sf.smbt.dmx.model.ezdmx.EzdmxPackage;
import net.sf.smbt.midi.ezmidi.EzmidiPackage;
import net.sf.smbt.osccmd.OsccmdPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see net.sf.smbt.ezlemur.EzlemurFactory
 * @model kind="package"
 * @generated
 */
public interface EzlemurPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ezlemur";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ezlemur/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ezlemur";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EzlemurPackage eINSTANCE = net.sf.smbt.ezlemur.impl.EzlemurPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezlemur.impl.LemurOscCmdImpl <em>Lemur Osc Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezlemur.impl.LemurOscCmdImpl
	 * @see net.sf.smbt.ezlemur.impl.EzlemurPackageImpl#getLemurOscCmd()
	 * @generated
	 */
	int LEMUR_OSC_CMD = 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEMUR_OSC_CMD__PRIORITY = OsccmdPackage.OSC_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEMUR_OSC_CMD__STAMP = OsccmdPackage.OSC_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEMUR_OSC_CMD__MSG = OsccmdPackage.OSC_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEMUR_OSC_CMD__TARGET = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Lemur Osc Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEMUR_OSC_CMD_FEATURE_COUNT = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezlemur.impl.LemurMidiCmdImpl <em>Lemur Midi Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezlemur.impl.LemurMidiCmdImpl
	 * @see net.sf.smbt.ezlemur.impl.EzlemurPackageImpl#getLemurMidiCmd()
	 * @generated
	 */
	int LEMUR_MIDI_CMD = 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEMUR_MIDI_CMD__PRIORITY = EzmidiPackage.ABSTRACT_MIDI_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEMUR_MIDI_CMD__STAMP = EzmidiPackage.ABSTRACT_MIDI_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEMUR_MIDI_CMD__ADDR = EzmidiPackage.ABSTRACT_MIDI_CMD__ADDR;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEMUR_MIDI_CMD__MSG_SIZE = EzmidiPackage.ABSTRACT_MIDI_CMD__MSG_SIZE;

	/**
	 * The feature id for the '<em><b>Byte1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEMUR_MIDI_CMD__BYTE1 = EzmidiPackage.ABSTRACT_MIDI_CMD__BYTE1;

	/**
	 * The feature id for the '<em><b>Byte2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEMUR_MIDI_CMD__BYTE2 = EzmidiPackage.ABSTRACT_MIDI_CMD__BYTE2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEMUR_MIDI_CMD__MESSAGE = EzmidiPackage.ABSTRACT_MIDI_CMD__MESSAGE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEMUR_MIDI_CMD__TARGET = EzmidiPackage.ABSTRACT_MIDI_CMD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Lemur Midi Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEMUR_MIDI_CMD_FEATURE_COUNT = EzmidiPackage.ABSTRACT_MIDI_CMD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezlemur.impl.LemurDmxCmdImpl <em>Lemur Dmx Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezlemur.impl.LemurDmxCmdImpl
	 * @see net.sf.smbt.ezlemur.impl.EzlemurPackageImpl#getLemurDmxCmd()
	 * @generated
	 */
	int LEMUR_DMX_CMD = 2;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEMUR_DMX_CMD__PRIORITY = EzdmxPackage.OPEN_DMX_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEMUR_DMX_CMD__STAMP = EzdmxPackage.OPEN_DMX_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEMUR_DMX_CMD__START = EzdmxPackage.OPEN_DMX_CMD__START;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEMUR_DMX_CMD__LABEL = EzdmxPackage.OPEN_DMX_CMD__LABEL;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEMUR_DMX_CMD__DATA = EzdmxPackage.OPEN_DMX_CMD__DATA;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEMUR_DMX_CMD__END = EzdmxPackage.OPEN_DMX_CMD__END;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEMUR_DMX_CMD__TARGET = EzdmxPackage.OPEN_DMX_CMD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Lemur Dmx Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEMUR_DMX_CMD_FEATURE_COUNT = EzdmxPackage.OPEN_DMX_CMD_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link net.sf.smbt.ezlemur.impl.AbstractLemurOscCmdImpl <em>Abstract Lemur Osc Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezlemur.impl.AbstractLemurOscCmdImpl
	 * @see net.sf.smbt.ezlemur.impl.EzlemurPackageImpl#getAbstractLemurOscCmd()
	 * @generated
	 */
	int ABSTRACT_LEMUR_OSC_CMD = 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LEMUR_OSC_CMD__TARGET = 0;

	/**
	 * The number of structural features of the '<em>Abstract Lemur Osc Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LEMUR_OSC_CMD_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezlemur.LemurOscCmd <em>Lemur Osc Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lemur Osc Cmd</em>'.
	 * @see net.sf.smbt.ezlemur.LemurOscCmd
	 * @generated
	 */
	EClass getLemurOscCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezlemur.LemurMidiCmd <em>Lemur Midi Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lemur Midi Cmd</em>'.
	 * @see net.sf.smbt.ezlemur.LemurMidiCmd
	 * @generated
	 */
	EClass getLemurMidiCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezlemur.LemurDmxCmd <em>Lemur Dmx Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lemur Dmx Cmd</em>'.
	 * @see net.sf.smbt.ezlemur.LemurDmxCmd
	 * @generated
	 */
	EClass getLemurDmxCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezlemur.AbstractLemurOscCmd <em>Abstract Lemur Osc Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Lemur Osc Cmd</em>'.
	 * @see net.sf.smbt.ezlemur.AbstractLemurOscCmd
	 * @generated
	 */
	EClass getAbstractLemurOscCmd();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.ezlemur.AbstractLemurOscCmd#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see net.sf.smbt.ezlemur.AbstractLemurOscCmd#getTarget()
	 * @see #getAbstractLemurOscCmd()
	 * @generated
	 */
	EReference getAbstractLemurOscCmd_Target();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EzlemurFactory getEzlemurFactory();

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
		 * The meta object literal for the '{@link net.sf.smbt.ezlemur.impl.LemurOscCmdImpl <em>Lemur Osc Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezlemur.impl.LemurOscCmdImpl
		 * @see net.sf.smbt.ezlemur.impl.EzlemurPackageImpl#getLemurOscCmd()
		 * @generated
		 */
		EClass LEMUR_OSC_CMD = eINSTANCE.getLemurOscCmd();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezlemur.impl.LemurMidiCmdImpl <em>Lemur Midi Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezlemur.impl.LemurMidiCmdImpl
		 * @see net.sf.smbt.ezlemur.impl.EzlemurPackageImpl#getLemurMidiCmd()
		 * @generated
		 */
		EClass LEMUR_MIDI_CMD = eINSTANCE.getLemurMidiCmd();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezlemur.impl.LemurDmxCmdImpl <em>Lemur Dmx Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezlemur.impl.LemurDmxCmdImpl
		 * @see net.sf.smbt.ezlemur.impl.EzlemurPackageImpl#getLemurDmxCmd()
		 * @generated
		 */
		EClass LEMUR_DMX_CMD = eINSTANCE.getLemurDmxCmd();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezlemur.impl.AbstractLemurOscCmdImpl <em>Abstract Lemur Osc Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezlemur.impl.AbstractLemurOscCmdImpl
		 * @see net.sf.smbt.ezlemur.impl.EzlemurPackageImpl#getAbstractLemurOscCmd()
		 * @generated
		 */
		EClass ABSTRACT_LEMUR_OSC_CMD = eINSTANCE.getAbstractLemurOscCmd();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_LEMUR_OSC_CMD__TARGET = eINSTANCE.getAbstractLemurOscCmd_Target();

	}

} //EzlemurPackage
