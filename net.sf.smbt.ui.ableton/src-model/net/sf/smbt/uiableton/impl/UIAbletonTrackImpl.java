/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.uiableton.impl;

import java.util.Collection;

import net.sf.smbt.uiableton.UIAbletonClip;
import net.sf.smbt.uiableton.UIAbletonTrack;
import net.sf.smbt.uiableton.UiabletonPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.swt.graphics.Image;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UI Ableton Track</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.uiableton.impl.UIAbletonTrackImpl#getText <em>Text</em>}</li>
 *   <li>{@link net.sf.smbt.uiableton.impl.UIAbletonTrackImpl#getImage <em>Image</em>}</li>
 *   <li>{@link net.sf.smbt.uiableton.impl.UIAbletonTrackImpl#getClips <em>Clips</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UIAbletonTrackImpl extends EObjectImpl implements UIAbletonTrack {
	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected static final Image IMAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected Image image = IMAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClips() <em>Clips</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClips()
	 * @generated
	 * @ordered
	 */
	protected EList<UIAbletonClip> clips;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UIAbletonTrackImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiabletonPackage.Literals.UI_ABLETON_TRACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiabletonPackage.UI_ABLETON_TRACK__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image getImage() {
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImage(Image newImage) {
		Image oldImage = image;
		image = newImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiabletonPackage.UI_ABLETON_TRACK__IMAGE, oldImage, image));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UIAbletonClip> getClips() {
		if (clips == null) {
			clips = new EObjectResolvingEList<UIAbletonClip>(UIAbletonClip.class, this, UiabletonPackage.UI_ABLETON_TRACK__CLIPS);
		}
		return clips;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UiabletonPackage.UI_ABLETON_TRACK__TEXT:
				return getText();
			case UiabletonPackage.UI_ABLETON_TRACK__IMAGE:
				return getImage();
			case UiabletonPackage.UI_ABLETON_TRACK__CLIPS:
				return getClips();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UiabletonPackage.UI_ABLETON_TRACK__TEXT:
				setText((String)newValue);
				return;
			case UiabletonPackage.UI_ABLETON_TRACK__IMAGE:
				setImage((Image)newValue);
				return;
			case UiabletonPackage.UI_ABLETON_TRACK__CLIPS:
				getClips().clear();
				getClips().addAll((Collection<? extends UIAbletonClip>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UiabletonPackage.UI_ABLETON_TRACK__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case UiabletonPackage.UI_ABLETON_TRACK__IMAGE:
				setImage(IMAGE_EDEFAULT);
				return;
			case UiabletonPackage.UI_ABLETON_TRACK__CLIPS:
				getClips().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UiabletonPackage.UI_ABLETON_TRACK__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case UiabletonPackage.UI_ABLETON_TRACK__IMAGE:
				return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
			case UiabletonPackage.UI_ABLETON_TRACK__CLIPS:
				return clips != null && !clips.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (text: ");
		result.append(text);
		result.append(", image: ");
		result.append(image);
		result.append(')');
		return result.toString();
	}

} //UIAbletonTrackImpl
