/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.jazzmutant.model.jzml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VARIABLE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getColor <em>Color</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getId <em>Id</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getKbmouseMessage <em>Kbmouse Message</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getKbmouseScale <em>Kbmouse Scale</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getKbmouseTarget <em>Kbmouse Target</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getKbmouseTrigger <em>Kbmouse Trigger</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getLabel <em>Label</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getMeta <em>Meta</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getMidiMessage <em>Midi Message</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getMidiScale <em>Midi Scale</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getMidiTarget <em>Midi Target</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getMidiTrigger <em>Midi Trigger</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getOscMessage <em>Osc Message</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getOscScale <em>Osc Scale</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getOscTarget <em>Osc Target</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getOscTrigger <em>Osc Trigger</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getSend <em>Send</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getTabbar <em>Tabbar</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.jazzmutant.model.jzml.JzmlPackage#getVARIABLE()
 * @model extendedMetaData="name='VARIABLE' kind='empty'"
 * @generated
 */
public interface VARIABLE extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see net.sf.smbt.jazzmutant.model.jzml.JzmlPackage#getVARIABLE_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see net.sf.smbt.jazzmutant.model.jzml.JzmlPackage#getVARIABLE_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Send</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Send</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Send</em>' attribute.
	 * @see #setSend(String)
	 * @see net.sf.smbt.jazzmutant.model.jzml.JzmlPackage#getVARIABLE_Send()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='send'"
	 * @generated
	 */
	String getSend();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getSend <em>Send</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Send</em>' attribute.
	 * @see #getSend()
	 * @generated
	 */
	void setSend(String value);

	/**
	 * Returns the value of the '<em><b>Osc Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Osc Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Osc Target</em>' attribute.
	 * @see #setOscTarget(String)
	 * @see net.sf.smbt.jazzmutant.model.jzml.JzmlPackage#getVARIABLE_OscTarget()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='osc_target'"
	 * @generated
	 */
	String getOscTarget();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getOscTarget <em>Osc Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Osc Target</em>' attribute.
	 * @see #getOscTarget()
	 * @generated
	 */
	void setOscTarget(String value);

	/**
	 * Returns the value of the '<em><b>Osc Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Osc Trigger</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Osc Trigger</em>' attribute.
	 * @see #setOscTrigger(String)
	 * @see net.sf.smbt.jazzmutant.model.jzml.JzmlPackage#getVARIABLE_OscTrigger()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='osc_trigger'"
	 * @generated
	 */
	String getOscTrigger();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getOscTrigger <em>Osc Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Osc Trigger</em>' attribute.
	 * @see #getOscTrigger()
	 * @generated
	 */
	void setOscTrigger(String value);

	/**
	 * Returns the value of the '<em><b>Osc Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Osc Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Osc Message</em>' attribute.
	 * @see #setOscMessage(String)
	 * @see net.sf.smbt.jazzmutant.model.jzml.JzmlPackage#getVARIABLE_OscMessage()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='osc_message'"
	 * @generated
	 */
	String getOscMessage();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getOscMessage <em>Osc Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Osc Message</em>' attribute.
	 * @see #getOscMessage()
	 * @generated
	 */
	void setOscMessage(String value);

	/**
	 * Returns the value of the '<em><b>Osc Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Osc Scale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Osc Scale</em>' attribute.
	 * @see #setOscScale(String)
	 * @see net.sf.smbt.jazzmutant.model.jzml.JzmlPackage#getVARIABLE_OscScale()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='osc_scale'"
	 * @generated
	 */
	String getOscScale();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getOscScale <em>Osc Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Osc Scale</em>' attribute.
	 * @see #getOscScale()
	 * @generated
	 */
	void setOscScale(String value);

	/**
	 * Returns the value of the '<em><b>Midi Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Midi Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Midi Target</em>' attribute.
	 * @see #setMidiTarget(String)
	 * @see net.sf.smbt.jazzmutant.model.jzml.JzmlPackage#getVARIABLE_MidiTarget()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='midi_target'"
	 * @generated
	 */
	String getMidiTarget();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getMidiTarget <em>Midi Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Midi Target</em>' attribute.
	 * @see #getMidiTarget()
	 * @generated
	 */
	void setMidiTarget(String value);

	/**
	 * Returns the value of the '<em><b>Midi Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Midi Trigger</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Midi Trigger</em>' attribute.
	 * @see #setMidiTrigger(String)
	 * @see net.sf.smbt.jazzmutant.model.jzml.JzmlPackage#getVARIABLE_MidiTrigger()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='midi_trigger'"
	 * @generated
	 */
	String getMidiTrigger();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getMidiTrigger <em>Midi Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Midi Trigger</em>' attribute.
	 * @see #getMidiTrigger()
	 * @generated
	 */
	void setMidiTrigger(String value);

	/**
	 * Returns the value of the '<em><b>Midi Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Midi Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Midi Message</em>' attribute.
	 * @see #setMidiMessage(String)
	 * @see net.sf.smbt.jazzmutant.model.jzml.JzmlPackage#getVARIABLE_MidiMessage()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='midi_message'"
	 * @generated
	 */
	String getMidiMessage();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getMidiMessage <em>Midi Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Midi Message</em>' attribute.
	 * @see #getMidiMessage()
	 * @generated
	 */
	void setMidiMessage(String value);

	/**
	 * Returns the value of the '<em><b>Midi Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Midi Scale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Midi Scale</em>' attribute.
	 * @see #setMidiScale(String)
	 * @see net.sf.smbt.jazzmutant.model.jzml.JzmlPackage#getVARIABLE_MidiScale()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='midi_scale'"
	 * @generated
	 */
	String getMidiScale();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getMidiScale <em>Midi Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Midi Scale</em>' attribute.
	 * @see #getMidiScale()
	 * @generated
	 */
	void setMidiScale(String value);

	/**
	 * Returns the value of the '<em><b>Kbmouse Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kbmouse Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kbmouse Target</em>' attribute.
	 * @see #setKbmouseTarget(String)
	 * @see net.sf.smbt.jazzmutant.model.jzml.JzmlPackage#getVARIABLE_KbmouseTarget()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='kbmouse_target'"
	 * @generated
	 */
	String getKbmouseTarget();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getKbmouseTarget <em>Kbmouse Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kbmouse Target</em>' attribute.
	 * @see #getKbmouseTarget()
	 * @generated
	 */
	void setKbmouseTarget(String value);

	/**
	 * Returns the value of the '<em><b>Kbmouse Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kbmouse Trigger</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kbmouse Trigger</em>' attribute.
	 * @see #setKbmouseTrigger(String)
	 * @see net.sf.smbt.jazzmutant.model.jzml.JzmlPackage#getVARIABLE_KbmouseTrigger()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='kbmouse_trigger'"
	 * @generated
	 */
	String getKbmouseTrigger();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getKbmouseTrigger <em>Kbmouse Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kbmouse Trigger</em>' attribute.
	 * @see #getKbmouseTrigger()
	 * @generated
	 */
	void setKbmouseTrigger(String value);

	/**
	 * Returns the value of the '<em><b>Kbmouse Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kbmouse Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kbmouse Message</em>' attribute.
	 * @see #setKbmouseMessage(String)
	 * @see net.sf.smbt.jazzmutant.model.jzml.JzmlPackage#getVARIABLE_KbmouseMessage()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='kbmouse_message'"
	 * @generated
	 */
	String getKbmouseMessage();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getKbmouseMessage <em>Kbmouse Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kbmouse Message</em>' attribute.
	 * @see #getKbmouseMessage()
	 * @generated
	 */
	void setKbmouseMessage(String value);

	/**
	 * Returns the value of the '<em><b>Kbmouse Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kbmouse Scale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kbmouse Scale</em>' attribute.
	 * @see #setKbmouseScale(String)
	 * @see net.sf.smbt.jazzmutant.model.jzml.JzmlPackage#getVARIABLE_KbmouseScale()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='kbmouse_scale'"
	 * @generated
	 */
	String getKbmouseScale();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getKbmouseScale <em>Kbmouse Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kbmouse Scale</em>' attribute.
	 * @see #getKbmouseScale()
	 * @generated
	 */
	void setKbmouseScale(String value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(String)
	 * @see net.sf.smbt.jazzmutant.model.jzml.JzmlPackage#getVARIABLE_Color()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='color'"
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see net.sf.smbt.jazzmutant.model.jzml.JzmlPackage#getVARIABLE_Label()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='label'"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Tabbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tabbar</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tabbar</em>' attribute.
	 * @see #setTabbar(String)
	 * @see net.sf.smbt.jazzmutant.model.jzml.JzmlPackage#getVARIABLE_Tabbar()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='tabbar'"
	 * @generated
	 */
	String getTabbar();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getTabbar <em>Tabbar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tabbar</em>' attribute.
	 * @see #getTabbar()
	 * @generated
	 */
	void setTabbar(String value);

	/**
	 * Returns the value of the '<em><b>Meta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta</em>' attribute.
	 * @see #setMeta(String)
	 * @see net.sf.smbt.jazzmutant.model.jzml.JzmlPackage#getVARIABLE_Meta()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='meta'"
	 * @generated
	 */
	String getMeta();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getMeta <em>Meta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta</em>' attribute.
	 * @see #getMeta()
	 * @generated
	 */
	void setMeta(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see net.sf.smbt.jazzmutant.model.jzml.JzmlPackage#getVARIABLE_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // VARIABLE
