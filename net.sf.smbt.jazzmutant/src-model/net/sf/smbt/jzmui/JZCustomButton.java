/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.jzmui;

import org.eclipse.swt.graphics.Color;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JZ Custom Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.jzmui.JZCustomButton#isOutline <em>Outline</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZCustomButton#getColorOff <em>Color Off</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZCustomButton#getColorOn <em>Color On</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZCustomButton#getLight <em>Light</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZCustomButton#getStyleOffText <em>Style Off Text</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZCustomButton#getTextAlign <em>Text Align</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZCustomButton#getStyleOn <em>Style On</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZCustomButton#getStyleOff <em>Style Off</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZCustomButton#getStyleOnText <em>Style On Text</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZCustomButton#getFontSize <em>Font Size</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZCustomButton#isCapture <em>Capture</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZCustomButton#getMode <em>Mode</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZCustomButton#getX <em>X</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZCustomButton()
 * @model
 * @generated
 */
public interface JZCustomButton extends JZWidget {
	/**
	 * Returns the value of the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outline</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outline</em>' attribute.
	 * @see #setOutline(boolean)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZCustomButton_Outline()
	 * @model
	 * @generated
	 */
	boolean isOutline();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZCustomButton#isOutline <em>Outline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outline</em>' attribute.
	 * @see #isOutline()
	 * @generated
	 */
	void setOutline(boolean value);

	/**
	 * Returns the value of the '<em><b>Style Off</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.jzmui.LEMUR_STYLE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Off</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Off</em>' attribute.
	 * @see net.sf.smbt.jzmui.LEMUR_STYLE
	 * @see #setStyleOff(LEMUR_STYLE)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZCustomButton_StyleOff()
	 * @model
	 * @generated
	 */
	LEMUR_STYLE getStyleOff();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZCustomButton#getStyleOff <em>Style Off</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Off</em>' attribute.
	 * @see net.sf.smbt.jzmui.LEMUR_STYLE
	 * @see #getStyleOff()
	 * @generated
	 */
	void setStyleOff(LEMUR_STYLE value);

	/**
	 * Returns the value of the '<em><b>Style On Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style On Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style On Text</em>' attribute.
	 * @see #setStyleOnText(String)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZCustomButton_StyleOnText()
	 * @model
	 * @generated
	 */
	String getStyleOnText();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZCustomButton#getStyleOnText <em>Style On Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style On Text</em>' attribute.
	 * @see #getStyleOnText()
	 * @generated
	 */
	void setStyleOnText(String value);

	/**
	 * Returns the value of the '<em><b>Font Size</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.jzmui.FONT_SIZE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Size</em>' attribute.
	 * @see net.sf.smbt.jzmui.FONT_SIZE
	 * @see #setFontSize(FONT_SIZE)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZCustomButton_FontSize()
	 * @model
	 * @generated
	 */
	FONT_SIZE getFontSize();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZCustomButton#getFontSize <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Size</em>' attribute.
	 * @see net.sf.smbt.jzmui.FONT_SIZE
	 * @see #getFontSize()
	 * @generated
	 */
	void setFontSize(FONT_SIZE value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZCustomButton_Capture()
	 * @model
	 * @generated
	 */
	boolean isCapture();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZCustomButton#isCapture <em>Capture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capture</em>' attribute.
	 * @see #isCapture()
	 * @generated
	 */
	void setCapture(boolean value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.jzmui.CUSTOM_BUTTON_MODE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see net.sf.smbt.jzmui.CUSTOM_BUTTON_MODE
	 * @see #setMode(CUSTOM_BUTTON_MODE)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZCustomButton_Mode()
	 * @model
	 * @generated
	 */
	CUSTOM_BUTTON_MODE getMode();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZCustomButton#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see net.sf.smbt.jzmui.CUSTOM_BUTTON_MODE
	 * @see #getMode()
	 * @generated
	 */
	void setMode(CUSTOM_BUTTON_MODE value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZCustomButton_X()
	 * @model
	 * @generated
	 */
	int getX();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZCustomButton#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(int value);

	/**
	 * Returns the value of the '<em><b>Style On</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.jzmui.LEMUR_STYLE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style On</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style On</em>' attribute.
	 * @see net.sf.smbt.jzmui.LEMUR_STYLE
	 * @see #setStyleOn(LEMUR_STYLE)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZCustomButton_StyleOn()
	 * @model
	 * @generated
	 */
	LEMUR_STYLE getStyleOn();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZCustomButton#getStyleOn <em>Style On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style On</em>' attribute.
	 * @see net.sf.smbt.jzmui.LEMUR_STYLE
	 * @see #getStyleOn()
	 * @generated
	 */
	void setStyleOn(LEMUR_STYLE value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZCustomButton_ColorOff()
	 * @model dataType="net.sf.smbt.jzmui.Color"
	 * @generated
	 */
	Color getColorOff();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZCustomButton#getColorOff <em>Color Off</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color Off</em>' attribute.
	 * @see #getColorOff()
	 * @generated
	 */
	void setColorOff(Color value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZCustomButton_ColorOn()
	 * @model dataType="net.sf.smbt.jzmui.Color"
	 * @generated
	 */
	Color getColorOn();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZCustomButton#getColorOn <em>Color On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color On</em>' attribute.
	 * @see #getColorOn()
	 * @generated
	 */
	void setColorOn(Color value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZCustomButton_Light()
	 * @model
	 * @generated
	 */
	float getLight();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZCustomButton#getLight <em>Light</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Light</em>' attribute.
	 * @see #getLight()
	 * @generated
	 */
	void setLight(float value);

	/**
	 * Returns the value of the '<em><b>Style Off Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Off Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Off Text</em>' attribute.
	 * @see #setStyleOffText(String)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZCustomButton_StyleOffText()
	 * @model
	 * @generated
	 */
	String getStyleOffText();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZCustomButton#getStyleOffText <em>Style Off Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Off Text</em>' attribute.
	 * @see #getStyleOffText()
	 * @generated
	 */
	void setStyleOffText(String value);

	/**
	 * Returns the value of the '<em><b>Text Align</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.jzmui.TEXT_ALIGN}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Align</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Align</em>' attribute.
	 * @see net.sf.smbt.jzmui.TEXT_ALIGN
	 * @see #setTextAlign(TEXT_ALIGN)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZCustomButton_TextAlign()
	 * @model
	 * @generated
	 */
	TEXT_ALIGN getTextAlign();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZCustomButton#getTextAlign <em>Text Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Align</em>' attribute.
	 * @see net.sf.smbt.jzmui.TEXT_ALIGN
	 * @see #getTextAlign()
	 * @generated
	 */
	void setTextAlign(TEXT_ALIGN value);

} // JZCustomButton
