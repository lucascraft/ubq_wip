/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezdaap;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.ezdaap.EzdaapPackage
 * @generated
 */
public interface EzdaapFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EzdaapFactory eINSTANCE = net.sf.smbt.ezdaap.impl.EzdaapFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>EZ Daap ITunes Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EZ Daap ITunes Instance</em>'.
	 * @generated
	 */
	EZDaapITunesInstance createEZDaapITunesInstance();

	/**
	 * Returns a new object of class '<em>EZ Daap Dictionary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EZ Daap Dictionary</em>'.
	 * @generated
	 */
	EZDaapDictionary createEZDaapDictionary();

	/**
	 * Returns a new object of class '<em>EZ Daap Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EZ Daap Manager</em>'.
	 * @generated
	 */
	EZDaapManager createEZDaapManager();

	/**
	 * Returns a new object of class '<em>EZ Daap Song</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EZ Daap Song</em>'.
	 * @generated
	 */
	EZDaapSong createEZDaapSong();

	/**
	 * Returns a new object of class '<em>EZ Daap Artist</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EZ Daap Artist</em>'.
	 * @generated
	 */
	EZDaapArtist createEZDaapArtist();

	/**
	 * Returns a new object of class '<em>EZ Daap Album</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EZ Daap Album</em>'.
	 * @generated
	 */
	EZDaapAlbum createEZDaapAlbum();

	/**
	 * Returns a new object of class '<em>EZ Daap Play List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EZ Daap Play List</em>'.
	 * @generated
	 */
	EZDaapPlayList createEZDaapPlayList();

	/**
	 * Returns a new object of class '<em>EZ Daap Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EZ Daap Library</em>'.
	 * @generated
	 */
	EZDaapLibrary createEZDaapLibrary();

	/**
	 * Returns a new object of class '<em>EZ Daap Elem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EZ Daap Elem</em>'.
	 * @generated
	 */
	EZDaapElem createEZDaapElem();

	/**
	 * Returns a new object of class '<em>EZ Daap Intel Property Elem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EZ Daap Intel Property Elem</em>'.
	 * @generated
	 */
	EZDaapIntelPropertyElem createEZDaapIntelPropertyElem();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EzdaapPackage getEzdaapPackage();

} //EzdaapFactory
