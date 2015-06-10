/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezdxxp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Daap Cmd Chunk</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezdxxp.DaapCmdChunk#getSize <em>Size</em>}</li>
 *   <li>{@link net.sf.smbt.ezdxxp.DaapCmdChunk#getData <em>Data</em>}</li>
 *   <li>{@link net.sf.smbt.ezdxxp.DaapCmdChunk#getReq <em>Req</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezdxxp.EzdxxpPackage#getDaapCmdChunk()
 * @model
 * @generated
 */
public interface DaapCmdChunk extends DaapCmd {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(byte[])
	 * @see net.sf.smbt.ezdxxp.EzdxxpPackage#getDaapCmdChunk_Size()
	 * @model
	 * @generated
	 */
	byte[] getSize();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezdxxp.DaapCmdChunk#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(byte[] value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' attribute.
	 * @see #setData(byte[])
	 * @see net.sf.smbt.ezdxxp.EzdxxpPackage#getDaapCmdChunk_Data()
	 * @model
	 * @generated
	 */
	byte[] getData();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezdxxp.DaapCmdChunk#getData <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' attribute.
	 * @see #getData()
	 * @generated
	 */
	void setData(byte[] value);

	/**
	 * Returns the value of the '<em><b>Req</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Req</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Req</em>' attribute.
	 * @see #setReq(String)
	 * @see net.sf.smbt.ezdxxp.EzdxxpPackage#getDaapCmdChunk_Req()
	 * @model
	 * @generated
	 */
	String getReq();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezdxxp.DaapCmdChunk#getReq <em>Req</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Req</em>' attribute.
	 * @see #getReq()
	 * @generated
	 */
	void setReq(String value);

} // DaapCmdChunk
