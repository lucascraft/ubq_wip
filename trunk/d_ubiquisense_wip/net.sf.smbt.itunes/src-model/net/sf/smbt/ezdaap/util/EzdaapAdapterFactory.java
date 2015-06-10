/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezdaap.util;

import net.sf.smbt.ezdaap.EZDaapAlbum;
import net.sf.smbt.ezdaap.EZDaapArtist;
import net.sf.smbt.ezdaap.EZDaapDictionary;
import net.sf.smbt.ezdaap.EZDaapElem;
import net.sf.smbt.ezdaap.EZDaapITunesInstance;
import net.sf.smbt.ezdaap.EZDaapIntelPropertyElem;
import net.sf.smbt.ezdaap.EZDaapLibrary;
import net.sf.smbt.ezdaap.EZDaapLibraryUnit;
import net.sf.smbt.ezdaap.EZDaapManager;
import net.sf.smbt.ezdaap.EZDaapPlayList;
import net.sf.smbt.ezdaap.EZDaapSong;
import net.sf.smbt.ezdaap.EzdaapPackage;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.ezdaap.EzdaapPackage
 * @generated
 */
public class EzdaapAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EzdaapPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzdaapAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EzdaapPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EzdaapSwitch<Adapter> modelSwitch =
		new EzdaapSwitch<Adapter>() {
			@Override
			public Adapter caseEZDaapITunesInstance(EZDaapITunesInstance object) {
				return createEZDaapITunesInstanceAdapter();
			}
			@Override
			public Adapter caseEZDaapDictionary(EZDaapDictionary object) {
				return createEZDaapDictionaryAdapter();
			}
			@Override
			public Adapter caseEZDaapManager(EZDaapManager object) {
				return createEZDaapManagerAdapter();
			}
			@Override
			public Adapter caseEZDaapSong(EZDaapSong object) {
				return createEZDaapSongAdapter();
			}
			@Override
			public Adapter caseEZDaapArtist(EZDaapArtist object) {
				return createEZDaapArtistAdapter();
			}
			@Override
			public Adapter caseEZDaapAlbum(EZDaapAlbum object) {
				return createEZDaapAlbumAdapter();
			}
			@Override
			public Adapter caseEZDaapLibraryUnit(EZDaapLibraryUnit object) {
				return createEZDaapLibraryUnitAdapter();
			}
			@Override
			public Adapter caseEZDaapPlayList(EZDaapPlayList object) {
				return createEZDaapPlayListAdapter();
			}
			@Override
			public Adapter caseEZDaapLibrary(EZDaapLibrary object) {
				return createEZDaapLibraryAdapter();
			}
			@Override
			public Adapter caseEZDaapElem(EZDaapElem object) {
				return createEZDaapElemAdapter();
			}
			@Override
			public Adapter caseEZDaapIntelPropertyElem(EZDaapIntelPropertyElem object) {
				return createEZDaapIntelPropertyElemAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezdaap.EZDaapITunesInstance <em>EZ Daap ITunes Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezdaap.EZDaapITunesInstance
	 * @generated
	 */
	public Adapter createEZDaapITunesInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezdaap.EZDaapDictionary <em>EZ Daap Dictionary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezdaap.EZDaapDictionary
	 * @generated
	 */
	public Adapter createEZDaapDictionaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezdaap.EZDaapManager <em>EZ Daap Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezdaap.EZDaapManager
	 * @generated
	 */
	public Adapter createEZDaapManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezdaap.EZDaapSong <em>EZ Daap Song</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezdaap.EZDaapSong
	 * @generated
	 */
	public Adapter createEZDaapSongAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezdaap.EZDaapArtist <em>EZ Daap Artist</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezdaap.EZDaapArtist
	 * @generated
	 */
	public Adapter createEZDaapArtistAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezdaap.EZDaapAlbum <em>EZ Daap Album</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezdaap.EZDaapAlbum
	 * @generated
	 */
	public Adapter createEZDaapAlbumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezdaap.EZDaapLibraryUnit <em>EZ Daap Library Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezdaap.EZDaapLibraryUnit
	 * @generated
	 */
	public Adapter createEZDaapLibraryUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezdaap.EZDaapPlayList <em>EZ Daap Play List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezdaap.EZDaapPlayList
	 * @generated
	 */
	public Adapter createEZDaapPlayListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezdaap.EZDaapLibrary <em>EZ Daap Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezdaap.EZDaapLibrary
	 * @generated
	 */
	public Adapter createEZDaapLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezdaap.EZDaapElem <em>EZ Daap Elem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezdaap.EZDaapElem
	 * @generated
	 */
	public Adapter createEZDaapElemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezdaap.EZDaapIntelPropertyElem <em>EZ Daap Intel Property Elem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezdaap.EZDaapIntelPropertyElem
	 * @generated
	 */
	public Adapter createEZDaapIntelPropertyElemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EzdaapAdapterFactory
