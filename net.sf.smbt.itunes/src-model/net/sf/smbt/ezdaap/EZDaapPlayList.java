/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezdaap;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EZ Daap Play List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezdaap.EZDaapPlayList#getSongs <em>Songs</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezdaap.EzdaapPackage#getEZDaapPlayList()
 * @model
 * @generated
 */
public interface EZDaapPlayList extends EZDaapElem {

	/**
	 * Returns the value of the '<em><b>Songs</b></em>' reference list.
	 * The list contents are of type {@link net.sf.smbt.ezdaap.EZDaapSong}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Songs</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Songs</em>' reference list.
	 * @see net.sf.smbt.ezdaap.EzdaapPackage#getEZDaapPlayList_Songs()
	 * @model
	 * @generated
	 */
	EList<EZDaapSong> getSongs();
} // EZDaapPlayList