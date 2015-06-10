/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.jzmui;

import org.eclipse.emf.common.util.EList;
import org.eclipse.swt.graphics.Color;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JZ Pads</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.jzmui.JZPads#getNumbers <em>Numbers</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZPads#getColumns <em>Columns</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZPads#getRows <em>Rows</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZPads#isMultilabel <em>Multilabel</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZPads#isMulticolor <em>Multicolor</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZPads#getColorOn <em>Color On</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZPads#getColorOff <em>Color Off</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZPads#getValues <em>Values</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZPads#getAttack <em>Attack</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZPads#getDecay <em>Decay</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZPads#getHold <em>Hold</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZPads#getLight <em>Light</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZPads#getRelease <em>Release</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZPads#getSustain <em>Sustain</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZPads#getColor <em>Color</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZPads#isLabelVisible <em>Label Visible</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZPads#isCapture <em>Capture</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZPads#getX <em>X</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZPads#getFriction <em>Friction</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZPads#getHeight <em>Height</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZPads#getTension <em>Tension</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZPads()
 * @model
 * @generated
 */
public interface JZPads extends JZWidget {
	/**
	 * Returns the value of the '<em><b>Numbers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numbers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numbers</em>' attribute.
	 * @see #setNumbers(int)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZPads_Numbers()
	 * @model
	 * @generated
	 */
	int getNumbers();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZPads#getNumbers <em>Numbers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numbers</em>' attribute.
	 * @see #getNumbers()
	 * @generated
	 */
	void setNumbers(int value);

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' attribute.
	 * @see #setColumns(int)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZPads_Columns()
	 * @model
	 * @generated
	 */
	int getColumns();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZPads#getColumns <em>Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columns</em>' attribute.
	 * @see #getColumns()
	 * @generated
	 */
	void setColumns(int value);

	/**
	 * Returns the value of the '<em><b>Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rows</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rows</em>' attribute.
	 * @see #setRows(int)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZPads_Rows()
	 * @model
	 * @generated
	 */
	int getRows();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZPads#getRows <em>Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rows</em>' attribute.
	 * @see #getRows()
	 * @generated
	 */
	void setRows(int value);

	/**
	 * Returns the value of the '<em><b>Multilabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multilabel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multilabel</em>' attribute.
	 * @see #setMultilabel(boolean)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZPads_Multilabel()
	 * @model
	 * @generated
	 */
	boolean isMultilabel();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZPads#isMultilabel <em>Multilabel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multilabel</em>' attribute.
	 * @see #isMultilabel()
	 * @generated
	 */
	void setMultilabel(boolean value);

	/**
	 * Returns the value of the '<em><b>Multicolor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multicolor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multicolor</em>' attribute.
	 * @see #setMulticolor(boolean)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZPads_Multicolor()
	 * @model
	 * @generated
	 */
	boolean isMulticolor();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZPads#isMulticolor <em>Multicolor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multicolor</em>' attribute.
	 * @see #isMulticolor()
	 * @generated
	 */
	void setMulticolor(boolean value);

	/**
	 * Returns the value of the '<em><b>Color On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color On</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color On</em>' attribute.
	 * @see #setColorOn(Color)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZPads_ColorOn()
	 * @model dataType="net.sf.smbt.jzmui.Color"
	 * @generated
	 */
	Color getColorOn();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZPads#getColorOn <em>Color On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color On</em>' attribute.
	 * @see #getColorOn()
	 * @generated
	 */
	void setColorOn(Color value);

	/**
	 * Returns the value of the '<em><b>Color Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color Off</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color Off</em>' attribute.
	 * @see #setColorOff(Color)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZPads_ColorOff()
	 * @model dataType="net.sf.smbt.jzmui.Color"
	 * @generated
	 */
	Color getColorOff();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZPads#getColorOff <em>Color Off</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color Off</em>' attribute.
	 * @see #getColorOff()
	 * @generated
	 */
	void setColorOff(Color value);

	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' attribute list.
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZPads_Values()
	 * @model unique="false"
	 * @generated
	 */
	EList<Integer> getValues();

	/**
	 * Returns the value of the '<em><b>Attack</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attack</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attack</em>' attribute.
	 * @see #setAttack(float)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZPads_Attack()
	 * @model
	 * @generated
	 */
	float getAttack();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZPads#getAttack <em>Attack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attack</em>' attribute.
	 * @see #getAttack()
	 * @generated
	 */
	void setAttack(float value);

	/**
	 * Returns the value of the '<em><b>Decay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decay</em>' attribute.
	 * @see #setDecay(float)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZPads_Decay()
	 * @model
	 * @generated
	 */
	float getDecay();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZPads#getDecay <em>Decay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decay</em>' attribute.
	 * @see #getDecay()
	 * @generated
	 */
	void setDecay(float value);

	/**
	 * Returns the value of the '<em><b>Hold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hold</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hold</em>' attribute.
	 * @see #setHold(float)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZPads_Hold()
	 * @model
	 * @generated
	 */
	float getHold();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZPads#getHold <em>Hold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hold</em>' attribute.
	 * @see #getHold()
	 * @generated
	 */
	void setHold(float value);

	/**
	 * Returns the value of the '<em><b>Light</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Light</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Light</em>' attribute.
	 * @see #setLight(float)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZPads_Light()
	 * @model
	 * @generated
	 */
	float getLight();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZPads#getLight <em>Light</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Light</em>' attribute.
	 * @see #getLight()
	 * @generated
	 */
	void setLight(float value);

	/**
	 * Returns the value of the '<em><b>Release</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Release</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Release</em>' attribute.
	 * @see #setRelease(float)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZPads_Release()
	 * @model
	 * @generated
	 */
	float getRelease();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZPads#getRelease <em>Release</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Release</em>' attribute.
	 * @see #getRelease()
	 * @generated
	 */
	void setRelease(float value);

	/**
	 * Returns the value of the '<em><b>Sustain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sustain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sustain</em>' attribute.
	 * @see #setSustain(float)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZPads_Sustain()
	 * @model
	 * @generated
	 */
	float getSustain();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZPads#getSustain <em>Sustain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sustain</em>' attribute.
	 * @see #getSustain()
	 * @generated
	 */
	void setSustain(float value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(Color)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZPads_Color()
	 * @model dataType="net.sf.smbt.jzmui.Color"
	 * @generated
	 */
	Color getColor();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZPads#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Color value);

	/**
	 * Returns the value of the '<em><b>Label Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Visible</em>' attribute.
	 * @see #setLabelVisible(boolean)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZPads_LabelVisible()
	 * @model
	 * @generated
	 */
	boolean isLabelVisible();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZPads#isLabelVisible <em>Label Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Visible</em>' attribute.
	 * @see #isLabelVisible()
	 * @generated
	 */
	void setLabelVisible(boolean value);

	/**
	 * Returns the value of the '<em><b>Capture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capture</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capture</em>' attribute.
	 * @see #setCapture(boolean)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZPads_Capture()
	 * @model
	 * @generated
	 */
	boolean isCapture();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZPads#isCapture <em>Capture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capture</em>' attribute.
	 * @see #isCapture()
	 * @generated
	 */
	void setCapture(boolean value);

	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(int)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZPads_X()
	 * @model
	 * @generated
	 */
	int getX();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZPads#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(int value);

	/**
	 * Returns the value of the '<em><b>Friction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Friction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Friction</em>' attribute.
	 * @see #setFriction(float)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZPads_Friction()
	 * @model
	 * @generated
	 */
	float getFriction();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZPads#getFriction <em>Friction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Friction</em>' attribute.
	 * @see #getFriction()
	 * @generated
	 */
	void setFriction(float value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(float)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZPads_Height()
	 * @model
	 * @generated
	 */
	float getHeight();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZPads#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(float value);

	/**
	 * Returns the value of the '<em><b>Tension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tension</em>' attribute.
	 * @see #setTension(float)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZPads_Tension()
	 * @model
	 * @generated
	 */
	float getTension();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZPads#getTension <em>Tension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tension</em>' attribute.
	 * @see #getTension()
	 * @generated
	 */
	void setTension(float value);

} // JZPads
