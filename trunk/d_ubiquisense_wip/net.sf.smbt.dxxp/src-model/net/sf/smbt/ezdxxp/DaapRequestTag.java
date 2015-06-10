/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezdxxp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Daap Request Tag</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.ezdxxp.EzdxxpPackage#getDaapRequestTag()
 * @model
 * @generated
 */
public enum DaapRequestTag implements Enumerator {
	/**
	 * The '<em><b>SERVER INFO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVER_INFO_VALUE
	 * @generated
	 * @ordered
	 */
	SERVER_INFO(0, "SERVER_INFO", "server-info"),

	/**
	 * The '<em><b>CONTENT CODES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTENT_CODES_VALUE
	 * @generated
	 * @ordered
	 */
	CONTENT_CODES(1, "CONTENT_CODES", "content-codes"),

	/**
	 * The '<em><b>LOGIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGIN_VALUE
	 * @generated
	 * @ordered
	 */
	LOGIN(2, "LOGIN", "login"),

	/**
	 * The '<em><b>UPDATE SESSION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPDATE_SESSION_VALUE
	 * @generated
	 * @ordered
	 */
	UPDATE_SESSION(3, "UPDATE_SESSION", "update?session-id=<%sid%>&revision-number=<%rid%>"), /**
	 * The '<em><b>DB LIST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DB_LIST_VALUE
	 * @generated
	 * @ordered
	 */
	DB_LIST(4, "DB_LIST", "databases?session-id=<%sid%>&revision-number=<%rid%>"), /**
	 * The '<em><b>SONG LIST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SONG_LIST_VALUE
	 * @generated
	 * @ordered
	 */
	SONG_LIST(5, "SONG_LIST", "databases/<%dbid%>/items?type=music&meta=<%listOfFields%>&session-id=<%sid%>&revision-id=<%rid%>"), /**
	 * The '<em><b>PLAYLIST LIST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLAYLIST_LIST_VALUE
	 * @generated
	 * @ordered
	 */
	PLAYLIST_LIST(6, "PLAYLIST_LIST", "databases/<%dbid%>/containers?meta=<%containerMeta%>&session-id=<%sid%>&revision-id=<%rid%>"), /**
	 * The '<em><b>PLAYLIST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLAYLIST_VALUE
	 * @generated
	 * @ordered
	 */
	PLAYLIST(7, "PLAYLIST", "databases/<%dbid%>/containers/<%plid%>/items?type=music&meta=<%playlistMeta%>&session-id=<%sid%>&revision-number=<%rid%>"), /**
	 * The '<em><b>STREAM SONG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STREAM_SONG_VALUE
	 * @generated
	 * @ordered
	 */
	STREAM_SONG(8, "STREAM_SONG", "databases/<%dbid%>/items/<%songid%>.mp3?session-id=session"), /**
	 * The '<em><b>LOGOUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGOUT_VALUE
	 * @generated
	 * @ordered
	 */
	LOGOUT(9, "LOGOUT", "logout?session-id=<%sid%>");

	/**
	 * The '<em><b>SERVER INFO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SERVER INFO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SERVER_INFO
	 * @model literal="server-info"
	 * @generated
	 * @ordered
	 */
	public static final int SERVER_INFO_VALUE = 0;

	/**
	 * The '<em><b>CONTENT CODES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONTENT CODES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTENT_CODES
	 * @model literal="content-codes"
	 * @generated
	 * @ordered
	 */
	public static final int CONTENT_CODES_VALUE = 1;

	/**
	 * The '<em><b>LOGIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LOGIN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOGIN
	 * @model literal="login"
	 * @generated
	 * @ordered
	 */
	public static final int LOGIN_VALUE = 2;

	/**
	 * The '<em><b>UPDATE SESSION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UPDATE SESSION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UPDATE_SESSION
	 * @model literal="update?session-id=<%sid%>&revision-number=<%rid%>"
	 * @generated
	 * @ordered
	 */
	public static final int UPDATE_SESSION_VALUE = 3;

	/**
	 * The '<em><b>DB LIST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DB LIST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DB_LIST
	 * @model literal="databases?session-id=<%sid%>&revision-number=<%rid%>"
	 * @generated
	 * @ordered
	 */
	public static final int DB_LIST_VALUE = 4;

	/**
	 * The '<em><b>SONG LIST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SONG LIST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SONG_LIST
	 * @model literal="databases/<%dbid%>/items?type=music&meta=<%listOfFields%>&session-id=<%sid%>&revision-id=<%rid%>"
	 * @generated
	 * @ordered
	 */
	public static final int SONG_LIST_VALUE = 5;

	/**
	 * The '<em><b>PLAYLIST LIST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PLAYLIST LIST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PLAYLIST_LIST
	 * @model literal="databases/<%dbid%>/containers?meta=<%containerMeta%>&session-id=<%sid%>&revision-id=<%rid%>"
	 * @generated
	 * @ordered
	 */
	public static final int PLAYLIST_LIST_VALUE = 6;

	/**
	 * The '<em><b>PLAYLIST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PLAYLIST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PLAYLIST
	 * @model literal="databases/<%dbid%>/containers/<%plid%>/items?type=music&meta=<%playlistMeta%>&session-id=<%sid%>&revision-number=<%rid%>"
	 * @generated
	 * @ordered
	 */
	public static final int PLAYLIST_VALUE = 7;

	/**
	 * The '<em><b>STREAM SONG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STREAM SONG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STREAM_SONG
	 * @model literal="databases/<%dbid%>/items/<%songid%>.mp3?session-id=session"
	 * @generated
	 * @ordered
	 */
	public static final int STREAM_SONG_VALUE = 8;

	/**
	 * The '<em><b>LOGOUT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LOGOUT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOGOUT
	 * @model literal="logout?session-id=<%sid%>"
	 * @generated
	 * @ordered
	 */
	public static final int LOGOUT_VALUE = 9;

	/**
	 * An array of all the '<em><b>Daap Request Tag</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DaapRequestTag[] VALUES_ARRAY =
		new DaapRequestTag[] {
			SERVER_INFO,
			CONTENT_CODES,
			LOGIN,
			UPDATE_SESSION,
			DB_LIST,
			SONG_LIST,
			PLAYLIST_LIST,
			PLAYLIST,
			STREAM_SONG,
			LOGOUT,
		};

	/**
	 * A public read-only list of all the '<em><b>Daap Request Tag</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DaapRequestTag> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Daap Request Tag</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DaapRequestTag get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DaapRequestTag result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Daap Request Tag</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DaapRequestTag getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DaapRequestTag result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Daap Request Tag</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DaapRequestTag get(int value) {
		switch (value) {
			case SERVER_INFO_VALUE: return SERVER_INFO;
			case CONTENT_CODES_VALUE: return CONTENT_CODES;
			case LOGIN_VALUE: return LOGIN;
			case UPDATE_SESSION_VALUE: return UPDATE_SESSION;
			case DB_LIST_VALUE: return DB_LIST;
			case SONG_LIST_VALUE: return SONG_LIST;
			case PLAYLIST_LIST_VALUE: return PLAYLIST_LIST;
			case PLAYLIST_VALUE: return PLAYLIST;
			case STREAM_SONG_VALUE: return STREAM_SONG;
			case LOGOUT_VALUE: return LOGOUT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DaapRequestTag(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //DaapRequestTag
