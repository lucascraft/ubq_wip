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
 * A representation of the model object '<em><b>PROJECT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.PROJECT#getHeight <em>Height</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.PROJECT#getId <em>Id</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.PROJECT#getKbmouseTarget <em>Kbmouse Target</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.PROJECT#getMidiTarget <em>Midi Target</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.PROJECT#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.PROJECT#getOscTarget <em>Osc Target</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.PROJECT#getStartpage <em>Startpage</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.PROJECT#getTitle <em>Title</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.PROJECT#getVersion <em>Version</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.PROJECT#getWelcometext <em>Welcometext</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.PROJECT#getWidth <em>Width</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.jazzmutant.model.jzml.JzmlPackage#getPROJECT()
 * @model extendedMetaData="name='PROJECT' kind='empty'"
 * @generated
 */
public interface PROJECT extends EObject {
	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(String)
	 * @see net.sf.smbt.jazzmutant.model.jzml.JzmlPackage#getPROJECT_Height()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='height'"
	 * @generated
	 */
	String getHeight();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jazzmutant.model.jzml.PROJECT#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see net.sf.smbt.jazzmutant.model.jzml.JzmlPackage#getPROJECT_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='version'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jazzmutant.model.jzml.PROJECT#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

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
	 * @see net.sf.smbt.jazzmutant.model.jzml.JzmlPackage#getPROJECT_OscTarget()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 *        extendedMetaData="kind='attribute' name='osc_target'"
	 * @generated
	 */
	String getOscTarget();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jazzmutant.model.jzml.PROJECT#getOscTarget <em>Osc Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Osc Target</em>' attribute.
	 * @see #getOscTarget()
	 * @generated
	 */
	void setOscTarget(String value);

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
	 * @see net.sf.smbt.jazzmutant.model.jzml.JzmlPackage#getPROJECT_MidiTarget()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 *        extendedMetaData="kind='attribute' name='midi_target'"
	 * @generated
	 */
	String getMidiTarget();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jazzmutant.model.jzml.PROJECT#getMidiTarget <em>Midi Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Midi Target</em>' attribute.
	 * @see #getMidiTarget()
	 * @generated
	 */
	void setMidiTarget(String value);

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
	 * @see net.sf.smbt.jazzmutant.model.jzml.JzmlPackage#getPROJECT_KbmouseTarget()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 *        extendedMetaData="kind='attribute' name='kbmouse_target'"
	 * @generated
	 */
	String getKbmouseTarget();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jazzmutant.model.jzml.PROJECT#getKbmouseTarget <em>Kbmouse Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kbmouse Target</em>' attribute.
	 * @see #getKbmouseTarget()
	 * @generated
	 */
	void setKbmouseTarget(String value);

	/**
	 * Returns the value of the '<em><b>Startpage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Startpage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Startpage</em>' attribute.
	 * @see #setStartpage(String)
	 * @see net.sf.smbt.jazzmutant.model.jzml.JzmlPackage#getPROJECT_Startpage()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 *        extendedMetaData="kind='attribute' name='startpage'"
	 * @generated
	 */
	String getStartpage();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jazzmutant.model.jzml.PROJECT#getStartpage <em>Startpage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Startpage</em>' attribute.
	 * @see #getStartpage()
	 * @generated
	 */
	void setStartpage(String value);

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
	 * @see net.sf.smbt.jazzmutant.model.jzml.JzmlPackage#getPROJECT_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jazzmutant.model.jzml.PROJECT#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Welcometext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Welcometext</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Welcometext</em>' attribute.
	 * @see #setWelcometext(String)
	 * @see net.sf.smbt.jazzmutant.model.jzml.JzmlPackage#getPROJECT_Welcometext()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='welcometext'"
	 * @generated
	 */
	String getWelcometext();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jazzmutant.model.jzml.PROJECT#getWelcometext <em>Welcometext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Welcometext</em>' attribute.
	 * @see #getWelcometext()
	 * @generated
	 */
	void setWelcometext(String value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(String)
	 * @see net.sf.smbt.jazzmutant.model.jzml.JzmlPackage#getPROJECT_Width()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='width'"
	 * @generated
	 */
	String getWidth();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jazzmutant.model.jzml.PROJECT#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see net.sf.smbt.jazzmutant.model.jzml.JzmlPackage#getPROJECT_Title()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='title'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jazzmutant.model.jzml.PROJECT#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

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
	 * @see net.sf.smbt.jazzmutant.model.jzml.JzmlPackage#getPROJECT_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jazzmutant.model.jzml.PROJECT#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // PROJECT
