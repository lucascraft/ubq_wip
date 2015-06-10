/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezdaap;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EZ Daap Intel Property Elem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezdaap.EZDaapIntelPropertyElem#getArtists <em>Artists</em>}</li>
 *   <li>{@link net.sf.smbt.ezdaap.EZDaapIntelPropertyElem#getLicense <em>License</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezdaap.EzdaapPackage#getEZDaapIntelPropertyElem()
 * @model
 * @generated
 */
public interface EZDaapIntelPropertyElem extends EObject {
	/**
	 * Returns the value of the '<em><b>Artists</b></em>' reference list.
	 * The list contents are of type {@link net.sf.smbt.ezdaap.EZDaapArtist}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artists</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artists</em>' reference list.
	 * @see net.sf.smbt.ezdaap.EzdaapPackage#getEZDaapIntelPropertyElem_Artists()
	 * @model
	 * @generated
	 */
	EList<EZDaapArtist> getArtists();

	/**
	 * Returns the value of the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>License</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>License</em>' attribute.
	 * @see #setLicense(String)
	 * @see net.sf.smbt.ezdaap.EzdaapPackage#getEZDaapIntelPropertyElem_License()
	 * @model
	 * @generated
	 */
	String getLicense();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezdaap.EZDaapIntelPropertyElem#getLicense <em>License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>License</em>' attribute.
	 * @see #getLicense()
	 * @generated
	 */
	void setLicense(String value);

} // EZDaapIntelPropertyElem
