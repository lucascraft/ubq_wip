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
 * A representation of the model object '<em><b>EZ Daap Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezdaap.EZDaapManager#getITunes <em>ITunes</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezdaap.EzdaapPackage#getEZDaapManager()
 * @model
 * @generated
 */
public interface EZDaapManager extends EObject {
	/**
	 * Returns the value of the '<em><b>ITunes</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.ezdaap.EZDaapITunesInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ITunes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ITunes</em>' containment reference list.
	 * @see net.sf.smbt.ezdaap.EzdaapPackage#getEZDaapManager_ITunes()
	 * @model containment="true"
	 * @generated
	 */
	EList<EZDaapITunesInstance> getITunes();

} // EZDaapManager
