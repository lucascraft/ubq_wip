/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.jzmui;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JZUI Elem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.jzmui.JZUIElem#getFontStyle <em>Font Style</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZUIElem#getBounds <em>Bounds</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZUIElem#getFontName <em>Font Name</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZUIElem#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZUIElem#getOscProps <em>Osc Props</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZUIElem#getMidiProps <em>Midi Props</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZUIElem#getParentTarget <em>Parent Target</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZUIElem#getScripts <em>Scripts</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZUIElem#getTargetFeatures <em>Target Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZUIElem()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface JZUIElem extends EObject {
	/**
	 * Returns the value of the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Style</em>' attribute.
	 * @see #setFontStyle(int)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZUIElem_FontStyle()
	 * @model
	 * @generated
	 */
	int getFontStyle();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZUIElem#getFontStyle <em>Font Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Style</em>' attribute.
	 * @see #getFontStyle()
	 * @generated
	 */
	void setFontStyle(int value);

	/**
	 * Returns the value of the '<em><b>Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bounds</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bounds</em>' attribute.
	 * @see #setBounds(Rectangle)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZUIElem_Bounds()
	 * @model dataType="net.sf.smbt.jzmui.Rectangle"
	 * @generated
	 */
	Rectangle getBounds();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZUIElem#getBounds <em>Bounds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bounds</em>' attribute.
	 * @see #getBounds()
	 * @generated
	 */
	void setBounds(Rectangle value);

	/**
	 * Returns the value of the '<em><b>Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Name</em>' attribute.
	 * @see #setFontName(String)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZUIElem_FontName()
	 * @model
	 * @generated
	 */
	String getFontName();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZUIElem#getFontName <em>Font Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Name</em>' attribute.
	 * @see #getFontName()
	 * @generated
	 */
	void setFontName(String value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZUIElem_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZUIElem#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Osc Props</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.jzmui.JzOscVar}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Osc Props</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Osc Props</em>' containment reference list.
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZUIElem_OscProps()
	 * @model containment="true"
	 * @generated
	 */
	EList<JzOscVar> getOscProps();

	/**
	 * Returns the value of the '<em><b>Midi Props</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.jzmui.JzMidiVar}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Midi Props</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Midi Props</em>' containment reference list.
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZUIElem_MidiProps()
	 * @model containment="true"
	 * @generated
	 */
	EList<JzMidiVar> getMidiProps();

	/**
	 * Returns the value of the '<em><b>Parent Target</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.jzmui.LemurPreferences}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Target</em>' attribute.
	 * @see net.sf.smbt.jzmui.LemurPreferences
	 * @see #setParentTarget(LemurPreferences)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZUIElem_ParentTarget()
	 * @model
	 * @generated
	 */
	LemurPreferences getParentTarget();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZUIElem#getParentTarget <em>Parent Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Target</em>' attribute.
	 * @see net.sf.smbt.jzmui.LemurPreferences
	 * @see #getParentTarget()
	 * @generated
	 */
	void setParentTarget(LemurPreferences value);

	/**
	 * Returns the value of the '<em><b>Scripts</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.jzmui.Script}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scripts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scripts</em>' containment reference list.
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZUIElem_Scripts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Script> getScripts();

	/**
	 * Returns the value of the '<em><b>Target Features</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EStructuralFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Features</em>' containment reference list.
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZUIElem_TargetFeatures()
	 * @model containment="true"
	 * @generated
	 */
	EList<EStructuralFeature> getTargetFeatures();

} // JZUIElem
