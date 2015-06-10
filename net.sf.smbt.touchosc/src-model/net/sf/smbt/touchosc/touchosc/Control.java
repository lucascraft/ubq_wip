/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.touchosc.touchosc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.touchosc.touchosc.Control#getMidi <em>Midi</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchosc.Control#getBackground <em>Background</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchosc.Control#getCentered <em>Centered</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchosc.Control#getColor <em>Color</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchosc.Control#getH <em>H</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchosc.Control#getInverted <em>Inverted</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchosc.Control#getInvertedX <em>Inverted X</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchosc.Control#getInvertedY <em>Inverted Y</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchosc.Control#getLocalOff <em>Local Off</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchosc.Control#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchosc.Control#getNumber <em>Number</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchosc.Control#getNumberX <em>Number X</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchosc.Control#getNumberY <em>Number Y</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchosc.Control#getOscCs <em>Osc Cs</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchosc.Control#getOutline <em>Outline</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchosc.Control#getResponse <em>Response</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchosc.Control#getScalef <em>Scalef</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchosc.Control#getScalet <em>Scalet</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchosc.Control#getSeconds <em>Seconds</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchosc.Control#getSize <em>Size</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchosc.Control#getText <em>Text</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchosc.Control#getType <em>Type</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchosc.Control#getW <em>W</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchosc.Control#getX <em>X</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchosc.Control#getY <em>Y</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.touchosc.touchosc.TouchoscPackage#getControl()
 * @model extendedMetaData="name='control' kind='elementOnly'"
 * @generated
 */
public interface Control extends EObject {
	/**
	 * Returns the value of the '<em><b>Midi</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Midi</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Midi</em>' containment reference.
	 * @see #setMidi(Midi)
	 * @see net.sf.smbt.touchosc.touchosc.TouchoscPackage#getControl_Midi()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='midi'"
	 * @generated
	 */
	Midi getMidi();

	/**
	 * Sets the value of the '{@link net.sf.smbt.touchosc.touchosc.Control#getMidi <em>Midi</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Midi</em>' containment reference.
	 * @see #getMidi()
	 * @generated
	 */
	void setMidi(Midi value);

	/**
	 * Returns the value of the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Background</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background</em>' attribute.
	 * @see #setBackground(String)
	 * @see net.sf.smbt.touchosc.touchosc.TouchoscPackage#getControl_Background()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='background'"
	 * @generated
	 */
	String getBackground();

	/**
	 * Sets the value of the '{@link net.sf.smbt.touchosc.touchosc.Control#getBackground <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background</em>' attribute.
	 * @see #getBackground()
	 * @generated
	 */
	void setBackground(String value);

	/**
	 * Returns the value of the '<em><b>Centered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Centered</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Centered</em>' attribute.
	 * @see #setCentered(String)
	 * @see net.sf.smbt.touchosc.touchosc.TouchoscPackage#getControl_Centered()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='centered'"
	 * @generated
	 */
	String getCentered();

	/**
	 * Sets the value of the '{@link net.sf.smbt.touchosc.touchosc.Control#getCentered <em>Centered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Centered</em>' attribute.
	 * @see #getCentered()
	 * @generated
	 */
	void setCentered(String value);

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
	 * @see net.sf.smbt.touchosc.touchosc.TouchoscPackage#getControl_Color()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='color'"
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link net.sf.smbt.touchosc.touchosc.Control#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

	/**
	 * Returns the value of the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>H</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>H</em>' attribute.
	 * @see #setH(String)
	 * @see net.sf.smbt.touchosc.touchosc.TouchoscPackage#getControl_H()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='h'"
	 * @generated
	 */
	String getH();

	/**
	 * Sets the value of the '{@link net.sf.smbt.touchosc.touchosc.Control#getH <em>H</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>H</em>' attribute.
	 * @see #getH()
	 * @generated
	 */
	void setH(String value);

	/**
	 * Returns the value of the '<em><b>Inverted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inverted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inverted</em>' attribute.
	 * @see #setInverted(String)
	 * @see net.sf.smbt.touchosc.touchosc.TouchoscPackage#getControl_Inverted()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='inverted'"
	 * @generated
	 */
	String getInverted();

	/**
	 * Sets the value of the '{@link net.sf.smbt.touchosc.touchosc.Control#getInverted <em>Inverted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inverted</em>' attribute.
	 * @see #getInverted()
	 * @generated
	 */
	void setInverted(String value);

	/**
	 * Returns the value of the '<em><b>Inverted X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inverted X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inverted X</em>' attribute.
	 * @see #setInvertedX(String)
	 * @see net.sf.smbt.touchosc.touchosc.TouchoscPackage#getControl_InvertedX()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='inverted_x'"
	 * @generated
	 */
	String getInvertedX();

	/**
	 * Sets the value of the '{@link net.sf.smbt.touchosc.touchosc.Control#getInvertedX <em>Inverted X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inverted X</em>' attribute.
	 * @see #getInvertedX()
	 * @generated
	 */
	void setInvertedX(String value);

	/**
	 * Returns the value of the '<em><b>Inverted Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inverted Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inverted Y</em>' attribute.
	 * @see #setInvertedY(String)
	 * @see net.sf.smbt.touchosc.touchosc.TouchoscPackage#getControl_InvertedY()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='inverted_y'"
	 * @generated
	 */
	String getInvertedY();

	/**
	 * Sets the value of the '{@link net.sf.smbt.touchosc.touchosc.Control#getInvertedY <em>Inverted Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inverted Y</em>' attribute.
	 * @see #getInvertedY()
	 * @generated
	 */
	void setInvertedY(String value);

	/**
	 * Returns the value of the '<em><b>Local Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Off</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Off</em>' attribute.
	 * @see #setLocalOff(String)
	 * @see net.sf.smbt.touchosc.touchosc.TouchoscPackage#getControl_LocalOff()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='local_off'"
	 * @generated
	 */
	String getLocalOff();

	/**
	 * Sets the value of the '{@link net.sf.smbt.touchosc.touchosc.Control#getLocalOff <em>Local Off</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Off</em>' attribute.
	 * @see #getLocalOff()
	 * @generated
	 */
	void setLocalOff(String value);

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
	 * @see net.sf.smbt.touchosc.touchosc.TouchoscPackage#getControl_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.sf.smbt.touchosc.touchosc.Control#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(String)
	 * @see net.sf.smbt.touchosc.touchosc.TouchoscPackage#getControl_Number()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='number'"
	 * @generated
	 */
	String getNumber();

	/**
	 * Sets the value of the '{@link net.sf.smbt.touchosc.touchosc.Control#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(String value);

	/**
	 * Returns the value of the '<em><b>Number X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number X</em>' attribute.
	 * @see #setNumberX(String)
	 * @see net.sf.smbt.touchosc.touchosc.TouchoscPackage#getControl_NumberX()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='number_x'"
	 * @generated
	 */
	String getNumberX();

	/**
	 * Sets the value of the '{@link net.sf.smbt.touchosc.touchosc.Control#getNumberX <em>Number X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number X</em>' attribute.
	 * @see #getNumberX()
	 * @generated
	 */
	void setNumberX(String value);

	/**
	 * Returns the value of the '<em><b>Number Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Y</em>' attribute.
	 * @see #setNumberY(String)
	 * @see net.sf.smbt.touchosc.touchosc.TouchoscPackage#getControl_NumberY()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='number_y'"
	 * @generated
	 */
	String getNumberY();

	/**
	 * Sets the value of the '{@link net.sf.smbt.touchosc.touchosc.Control#getNumberY <em>Number Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Y</em>' attribute.
	 * @see #getNumberY()
	 * @generated
	 */
	void setNumberY(String value);

	/**
	 * Returns the value of the '<em><b>Osc Cs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Osc Cs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Osc Cs</em>' attribute.
	 * @see #setOscCs(String)
	 * @see net.sf.smbt.touchosc.touchosc.TouchoscPackage#getControl_OscCs()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='osc_cs'"
	 * @generated
	 */
	String getOscCs();

	/**
	 * Sets the value of the '{@link net.sf.smbt.touchosc.touchosc.Control#getOscCs <em>Osc Cs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Osc Cs</em>' attribute.
	 * @see #getOscCs()
	 * @generated
	 */
	void setOscCs(String value);

	/**
	 * Returns the value of the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outline</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outline</em>' attribute.
	 * @see #setOutline(String)
	 * @see net.sf.smbt.touchosc.touchosc.TouchoscPackage#getControl_Outline()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='outline'"
	 * @generated
	 */
	String getOutline();

	/**
	 * Sets the value of the '{@link net.sf.smbt.touchosc.touchosc.Control#getOutline <em>Outline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outline</em>' attribute.
	 * @see #getOutline()
	 * @generated
	 */
	void setOutline(String value);

	/**
	 * Returns the value of the '<em><b>Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response</em>' attribute.
	 * @see #setResponse(String)
	 * @see net.sf.smbt.touchosc.touchosc.TouchoscPackage#getControl_Response()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='response'"
	 * @generated
	 */
	String getResponse();

	/**
	 * Sets the value of the '{@link net.sf.smbt.touchosc.touchosc.Control#getResponse <em>Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response</em>' attribute.
	 * @see #getResponse()
	 * @generated
	 */
	void setResponse(String value);

	/**
	 * Returns the value of the '<em><b>Scalef</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scalef</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scalef</em>' attribute.
	 * @see #setScalef(String)
	 * @see net.sf.smbt.touchosc.touchosc.TouchoscPackage#getControl_Scalef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='scalef'"
	 * @generated
	 */
	String getScalef();

	/**
	 * Sets the value of the '{@link net.sf.smbt.touchosc.touchosc.Control#getScalef <em>Scalef</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scalef</em>' attribute.
	 * @see #getScalef()
	 * @generated
	 */
	void setScalef(String value);

	/**
	 * Returns the value of the '<em><b>Scalet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scalet</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scalet</em>' attribute.
	 * @see #setScalet(String)
	 * @see net.sf.smbt.touchosc.touchosc.TouchoscPackage#getControl_Scalet()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='scalet'"
	 * @generated
	 */
	String getScalet();

	/**
	 * Sets the value of the '{@link net.sf.smbt.touchosc.touchosc.Control#getScalet <em>Scalet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scalet</em>' attribute.
	 * @see #getScalet()
	 * @generated
	 */
	void setScalet(String value);

	/**
	 * Returns the value of the '<em><b>Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seconds</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seconds</em>' attribute.
	 * @see #setSeconds(String)
	 * @see net.sf.smbt.touchosc.touchosc.TouchoscPackage#getControl_Seconds()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='seconds'"
	 * @generated
	 */
	String getSeconds();

	/**
	 * Sets the value of the '{@link net.sf.smbt.touchosc.touchosc.Control#getSeconds <em>Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seconds</em>' attribute.
	 * @see #getSeconds()
	 * @generated
	 */
	void setSeconds(String value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(String)
	 * @see net.sf.smbt.touchosc.touchosc.TouchoscPackage#getControl_Size()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='size'"
	 * @generated
	 */
	String getSize();

	/**
	 * Sets the value of the '{@link net.sf.smbt.touchosc.touchosc.Control#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(String value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see net.sf.smbt.touchosc.touchosc.TouchoscPackage#getControl_Text()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='text'"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link net.sf.smbt.touchosc.touchosc.Control#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see net.sf.smbt.touchosc.touchosc.TouchoscPackage#getControl_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link net.sf.smbt.touchosc.touchosc.Control#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>W</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>W</em>' attribute.
	 * @see #setW(String)
	 * @see net.sf.smbt.touchosc.touchosc.TouchoscPackage#getControl_W()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='w'"
	 * @generated
	 */
	String getW();

	/**
	 * Sets the value of the '{@link net.sf.smbt.touchosc.touchosc.Control#getW <em>W</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>W</em>' attribute.
	 * @see #getW()
	 * @generated
	 */
	void setW(String value);

	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(String)
	 * @see net.sf.smbt.touchosc.touchosc.TouchoscPackage#getControl_X()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='x'"
	 * @generated
	 */
	String getX();

	/**
	 * Sets the value of the '{@link net.sf.smbt.touchosc.touchosc.Control#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(String value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(String)
	 * @see net.sf.smbt.touchosc.touchosc.TouchoscPackage#getControl_Y()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='y'"
	 * @generated
	 */
	String getY();

	/**
	 * Sets the value of the '{@link net.sf.smbt.touchosc.touchosc.Control#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(String value);

} // Control
