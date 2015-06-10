/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.gps.nmea1083;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Nmea Talker</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.gps.nmea1083.Nmea1083Package#getNmeaTalker()
 * @model
 * @generated
 */
public enum NmeaTalker implements Enumerator {
	/**
	 * The '<em><b>AG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AG_VALUE
	 * @generated
	 * @ordered
	 */
	AG(0, "AG", "AG"),

	/**
	 * The '<em><b>AP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AP_VALUE
	 * @generated
	 * @ordered
	 */
	AP(1, "AP", "AP"),

	/**
	 * The '<em><b>CD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CD_VALUE
	 * @generated
	 * @ordered
	 */
	CD(2, "CD", "CD"),

	/**
	 * The '<em><b>CR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CR_VALUE
	 * @generated
	 * @ordered
	 */
	CR(3, "CR", "CR"),

	/**
	 * The '<em><b>CS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CS_VALUE
	 * @generated
	 * @ordered
	 */
	CS(4, "CS", "CS"),

	/**
	 * The '<em><b>CT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CT_VALUE
	 * @generated
	 * @ordered
	 */
	CT(5, "CT", "CT"),

	/**
	 * The '<em><b>CV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CV_VALUE
	 * @generated
	 * @ordered
	 */
	CV(6, "CV", "CV"),

	/**
	 * The '<em><b>CX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CX_VALUE
	 * @generated
	 * @ordered
	 */
	CX(7, "CX", "CX"),

	/**
	 * The '<em><b>DF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DF_VALUE
	 * @generated
	 * @ordered
	 */
	DF(8, "DF", "DF"),

	/**
	 * The '<em><b>EC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EC_VALUE
	 * @generated
	 * @ordered
	 */
	EC(9, "EC", "EC"),

	/**
	 * The '<em><b>EP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EP_VALUE
	 * @generated
	 * @ordered
	 */
	EP(10, "EP", "EP"),

	/**
	 * The '<em><b>ER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ER_VALUE
	 * @generated
	 * @ordered
	 */
	ER(11, "ER", "ER"),

	/**
	 * The '<em><b>GP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GP_VALUE
	 * @generated
	 * @ordered
	 */
	GP(12, "GP", "GP"),

	/**
	 * The '<em><b>HC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HC_VALUE
	 * @generated
	 * @ordered
	 */
	HC(13, "HC", "HC"),

	/**
	 * The '<em><b>HE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HE_VALUE
	 * @generated
	 * @ordered
	 */
	HE(14, "HE", "HE"),

	/**
	 * The '<em><b>HN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HN_VALUE
	 * @generated
	 * @ordered
	 */
	HN(15, "HN", "HN"),

	/**
	 * The '<em><b>II</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #II_VALUE
	 * @generated
	 * @ordered
	 */
	II(16, "II", "II"),

	/**
	 * The '<em><b>IN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_VALUE
	 * @generated
	 * @ordered
	 */
	IN(17, "IN", "IN"),

	/**
	 * The '<em><b>LC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LC_VALUE
	 * @generated
	 * @ordered
	 */
	LC(18, "LC", "LC"),

	/**
	 * The '<em><b>P</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #P_VALUE
	 * @generated
	 * @ordered
	 */
	P(19, "P", "P"),

	/**
	 * The '<em><b>RA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RA_VALUE
	 * @generated
	 * @ordered
	 */
	RA(20, "RA", "RA"),

	/**
	 * The '<em><b>SD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SD_VALUE
	 * @generated
	 * @ordered
	 */
	SD(21, "SD", "SD"),

	/**
	 * The '<em><b>SN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SN_VALUE
	 * @generated
	 * @ordered
	 */
	SN(22, "SN", "SN"),

	/**
	 * The '<em><b>SS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SS_VALUE
	 * @generated
	 * @ordered
	 */
	SS(23, "SS", "SS"),

	/**
	 * The '<em><b>TI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TI_VALUE
	 * @generated
	 * @ordered
	 */
	TI(24, "TI", "TI"),

	/**
	 * The '<em><b>VD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VD_VALUE
	 * @generated
	 * @ordered
	 */
	VD(25, "VD", "VD"),

	/**
	 * The '<em><b>DM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DM_VALUE
	 * @generated
	 * @ordered
	 */
	DM(26, "DM", "DM"),

	/**
	 * The '<em><b>VW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VW_VALUE
	 * @generated
	 * @ordered
	 */
	VW(27, "VW", "VW"),

	/**
	 * The '<em><b>WI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WI_VALUE
	 * @generated
	 * @ordered
	 */
	WI(28, "WI", "WI"),

	/**
	 * The '<em><b>YX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YX_VALUE
	 * @generated
	 * @ordered
	 */
	YX(29, "YX", "YX"),

	/**
	 * The '<em><b>ZA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZA_VALUE
	 * @generated
	 * @ordered
	 */
	ZA(30, "ZA", "ZA"),

	/**
	 * The '<em><b>ZC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZC_VALUE
	 * @generated
	 * @ordered
	 */
	ZC(31, "ZC", "ZC"),

	/**
	 * The '<em><b>ZQ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZQ_VALUE
	 * @generated
	 * @ordered
	 */
	ZQ(32, "ZQ", "ZQ"),

	/**
	 * The '<em><b>ZV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZV_VALUE
	 * @generated
	 * @ordered
	 */
	ZV(33, "ZV", "ZV");

	/**
	 * The '<em><b>AG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AG_VALUE = 0;

	/**
	 * The '<em><b>AP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AP_VALUE = 1;

	/**
	 * The '<em><b>CD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CD_VALUE = 2;

	/**
	 * The '<em><b>CR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CR_VALUE = 3;

	/**
	 * The '<em><b>CS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CS_VALUE = 4;

	/**
	 * The '<em><b>CT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CT_VALUE = 5;

	/**
	 * The '<em><b>CV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CV</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CV_VALUE = 6;

	/**
	 * The '<em><b>CX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CX_VALUE = 7;

	/**
	 * The '<em><b>DF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DF_VALUE = 8;

	/**
	 * The '<em><b>EC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EC_VALUE = 9;

	/**
	 * The '<em><b>EP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EP_VALUE = 10;

	/**
	 * The '<em><b>ER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ER_VALUE = 11;

	/**
	 * The '<em><b>GP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GP_VALUE = 12;

	/**
	 * The '<em><b>HC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HC_VALUE = 13;

	/**
	 * The '<em><b>HE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HE_VALUE = 14;

	/**
	 * The '<em><b>HN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HN_VALUE = 15;

	/**
	 * The '<em><b>II</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>II</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #II
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int II_VALUE = 16;

	/**
	 * The '<em><b>IN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IN_VALUE = 17;

	/**
	 * The '<em><b>LC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LC_VALUE = 18;

	/**
	 * The '<em><b>P</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>P</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #P
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int P_VALUE = 19;

	/**
	 * The '<em><b>RA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RA_VALUE = 20;

	/**
	 * The '<em><b>SD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SD_VALUE = 21;

	/**
	 * The '<em><b>SN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SN_VALUE = 22;

	/**
	 * The '<em><b>SS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SS_VALUE = 23;

	/**
	 * The '<em><b>TI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TI</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TI
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TI_VALUE = 24;

	/**
	 * The '<em><b>VD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VD_VALUE = 25;

	/**
	 * The '<em><b>DM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DM_VALUE = 26;

	/**
	 * The '<em><b>VW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VW_VALUE = 27;

	/**
	 * The '<em><b>WI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WI</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WI
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WI_VALUE = 28;

	/**
	 * The '<em><b>YX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>YX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #YX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int YX_VALUE = 29;

	/**
	 * The '<em><b>ZA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ZA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ZA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ZA_VALUE = 30;

	/**
	 * The '<em><b>ZC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ZC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ZC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ZC_VALUE = 31;

	/**
	 * The '<em><b>ZQ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ZQ</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ZQ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ZQ_VALUE = 32;

	/**
	 * The '<em><b>ZV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ZV</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ZV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ZV_VALUE = 33;

	/**
	 * An array of all the '<em><b>Nmea Talker</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NmeaTalker[] VALUES_ARRAY =
		new NmeaTalker[] {
			AG,
			AP,
			CD,
			CR,
			CS,
			CT,
			CV,
			CX,
			DF,
			EC,
			EP,
			ER,
			GP,
			HC,
			HE,
			HN,
			II,
			IN,
			LC,
			P,
			RA,
			SD,
			SN,
			SS,
			TI,
			VD,
			DM,
			VW,
			WI,
			YX,
			ZA,
			ZC,
			ZQ,
			ZV,
		};

	/**
	 * A public read-only list of all the '<em><b>Nmea Talker</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NmeaTalker> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Nmea Talker</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NmeaTalker get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NmeaTalker result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Nmea Talker</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NmeaTalker getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NmeaTalker result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Nmea Talker</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NmeaTalker get(int value) {
		switch (value) {
			case AG_VALUE: return AG;
			case AP_VALUE: return AP;
			case CD_VALUE: return CD;
			case CR_VALUE: return CR;
			case CS_VALUE: return CS;
			case CT_VALUE: return CT;
			case CV_VALUE: return CV;
			case CX_VALUE: return CX;
			case DF_VALUE: return DF;
			case EC_VALUE: return EC;
			case EP_VALUE: return EP;
			case ER_VALUE: return ER;
			case GP_VALUE: return GP;
			case HC_VALUE: return HC;
			case HE_VALUE: return HE;
			case HN_VALUE: return HN;
			case II_VALUE: return II;
			case IN_VALUE: return IN;
			case LC_VALUE: return LC;
			case P_VALUE: return P;
			case RA_VALUE: return RA;
			case SD_VALUE: return SD;
			case SN_VALUE: return SN;
			case SS_VALUE: return SS;
			case TI_VALUE: return TI;
			case VD_VALUE: return VD;
			case DM_VALUE: return DM;
			case VW_VALUE: return VW;
			case WI_VALUE: return WI;
			case YX_VALUE: return YX;
			case ZA_VALUE: return ZA;
			case ZC_VALUE: return ZC;
			case ZQ_VALUE: return ZQ;
			case ZV_VALUE: return ZV;
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
	private NmeaTalker(int value, String name, String literal) {
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
	
} //NmeaTalker
