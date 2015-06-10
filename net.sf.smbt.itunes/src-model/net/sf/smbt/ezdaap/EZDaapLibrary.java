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
 * A representation of the model object '<em><b>EZ Daap Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezdaap.EZDaapLibrary#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezdaap.EzdaapPackage#getEZDaapLibrary()
 * @model
 * @generated
 */
public interface EZDaapLibrary extends EZDaapLibraryUnit {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.ezdaap.EZDaapLibraryUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see net.sf.smbt.ezdaap.EzdaapPackage#getEZDaapLibrary_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<EZDaapLibraryUnit> getElements();

} // EZDaapLibrary
