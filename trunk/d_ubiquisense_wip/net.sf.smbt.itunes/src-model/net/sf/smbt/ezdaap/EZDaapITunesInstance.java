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
 * A representation of the model object '<em><b>EZ Daap ITunes Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezdaap.EZDaapITunesInstance#getId <em>Id</em>}</li>
 *   <li>{@link net.sf.smbt.ezdaap.EZDaapITunesInstance#getLibraries <em>Libraries</em>}</li>
 *   <li>{@link net.sf.smbt.ezdaap.EZDaapITunesInstance#getPalylists <em>Palylists</em>}</li>
 *   <li>{@link net.sf.smbt.ezdaap.EZDaapITunesInstance#getSongs <em>Songs</em>}</li>
 *   <li>{@link net.sf.smbt.ezdaap.EZDaapITunesInstance#getAlbums <em>Albums</em>}</li>
 *   <li>{@link net.sf.smbt.ezdaap.EZDaapITunesInstance#getArtists <em>Artists</em>}</li>
 *   <li>{@link net.sf.smbt.ezdaap.EZDaapITunesInstance#getRevID <em>Rev ID</em>}</li>
 *   <li>{@link net.sf.smbt.ezdaap.EZDaapITunesInstance#getSessionID <em>Session ID</em>}</li>
 *   <li>{@link net.sf.smbt.ezdaap.EZDaapITunesInstance#getServerName <em>Server Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezdaap.EzdaapPackage#getEZDaapITunesInstance()
 * @model
 * @generated
 */
public interface EZDaapITunesInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see net.sf.smbt.ezdaap.EzdaapPackage#getEZDaapITunesInstance_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezdaap.EZDaapITunesInstance#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Libraries</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.ezdaap.EZDaapLibrary}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Libraries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Libraries</em>' containment reference list.
	 * @see net.sf.smbt.ezdaap.EzdaapPackage#getEZDaapITunesInstance_Libraries()
	 * @model containment="true"
	 * @generated
	 */
	EList<EZDaapLibrary> getLibraries();

	/**
	 * Returns the value of the '<em><b>Palylists</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.ezdaap.EZDaapPlayList}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Palylists</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Palylists</em>' containment reference list.
	 * @see net.sf.smbt.ezdaap.EzdaapPackage#getEZDaapITunesInstance_Palylists()
	 * @model containment="true"
	 * @generated
	 */
	EList<EZDaapPlayList> getPalylists();

	/**
	 * Returns the value of the '<em><b>Songs</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.ezdaap.EZDaapSong}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Songs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Songs</em>' containment reference list.
	 * @see net.sf.smbt.ezdaap.EzdaapPackage#getEZDaapITunesInstance_Songs()
	 * @model containment="true"
	 * @generated
	 */
	EList<EZDaapSong> getSongs();

	/**
	 * Returns the value of the '<em><b>Albums</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.ezdaap.EZDaapAlbum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Albums</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Albums</em>' containment reference list.
	 * @see net.sf.smbt.ezdaap.EzdaapPackage#getEZDaapITunesInstance_Albums()
	 * @model containment="true"
	 * @generated
	 */
	EList<EZDaapAlbum> getAlbums();

	/**
	 * Returns the value of the '<em><b>Artists</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.ezdaap.EZDaapArtist}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artists</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artists</em>' containment reference list.
	 * @see net.sf.smbt.ezdaap.EzdaapPackage#getEZDaapITunesInstance_Artists()
	 * @model containment="true"
	 * @generated
	 */
	EList<EZDaapArtist> getArtists();

	/**
	 * Returns the value of the '<em><b>Rev ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rev ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rev ID</em>' attribute.
	 * @see #setRevID(int)
	 * @see net.sf.smbt.ezdaap.EzdaapPackage#getEZDaapITunesInstance_RevID()
	 * @model
	 * @generated
	 */
	int getRevID();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezdaap.EZDaapITunesInstance#getRevID <em>Rev ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rev ID</em>' attribute.
	 * @see #getRevID()
	 * @generated
	 */
	void setRevID(int value);

	/**
	 * Returns the value of the '<em><b>Session ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Session ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Session ID</em>' attribute.
	 * @see #setSessionID(int)
	 * @see net.sf.smbt.ezdaap.EzdaapPackage#getEZDaapITunesInstance_SessionID()
	 * @model
	 * @generated
	 */
	int getSessionID();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezdaap.EZDaapITunesInstance#getSessionID <em>Session ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Session ID</em>' attribute.
	 * @see #getSessionID()
	 * @generated
	 */
	void setSessionID(int value);

	/**
	 * Returns the value of the '<em><b>Server Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Name</em>' attribute.
	 * @see #setServerName(String)
	 * @see net.sf.smbt.ezdaap.EzdaapPackage#getEZDaapITunesInstance_ServerName()
	 * @model
	 * @generated
	 */
	String getServerName();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezdaap.EZDaapITunesInstance#getServerName <em>Server Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Name</em>' attribute.
	 * @see #getServerName()
	 * @generated
	 */
	void setServerName(String value);

} // EZDaapITunesInstance
