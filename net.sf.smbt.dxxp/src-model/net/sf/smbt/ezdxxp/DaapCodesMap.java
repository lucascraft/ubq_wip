/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezdxxp;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Daap Codes Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezdxxp.DaapCodesMap#getEntries <em>Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezdxxp.EzdxxpPackage#getDaapCodesMap()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface DaapCodesMap extends EObject {

	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.ezdxxp.DaapDictionnaryEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see net.sf.smbt.ezdxxp.EzdxxpPackage#getDaapCodesMap_Entries()
	 * @model containment="true"
	 * @generated
	 */
	EList<DaapDictionnaryEntry> getEntries();
} // DaapCodesMap
