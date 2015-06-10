/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.smbt.osc.oscDsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Ez Formats</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.osc.oscDsl.OscDslPackage#getEzFormats()
 * @model
 * @generated
 */
public enum EzFormats implements Enumerator
{
  /**
   * The '<em><b>Osc</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #OSC_VALUE
   * @generated
   * @ordered
   */
  OSC(0, "osc", "osc"),

  /**
   * The '<em><b>Midi</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MIDI_VALUE
   * @generated
   * @ordered
   */
  MIDI(1, "midi", "midi"),

  /**
   * The '<em><b>Dmx</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DMX_VALUE
   * @generated
   * @ordered
   */
  DMX(2, "dmx", "dmx"),

  /**
   * The '<em><b>Oscableton</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #OSCABLETON_VALUE
   * @generated
   * @ordered
   */
  OSCABLETON(3, "oscableton", "oscableton"),

  /**
   * The '<em><b>Oscwiimote</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #OSCWIIMOTE_VALUE
   * @generated
   * @ordered
   */
  OSCWIIMOTE(4, "oscwiimote", "oscwiimote"),

  /**
   * The '<em><b>Oscresolume</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #OSCRESOLUME_VALUE
   * @generated
   * @ordered
   */
  OSCRESOLUME(5, "oscresolume", "oscresolume"),

  /**
   * The '<em><b>Tuio</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TUIO_VALUE
   * @generated
   * @ordered
   */
  TUIO(6, "tuio", "tuio"),

  /**
   * The '<em><b>Tuio2</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TUIO2_VALUE
   * @generated
   * @ordered
   */
  TUIO2(7, "tuio2", "tuio2"),

  /**
   * The '<em><b>Thingm</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #THINGM_VALUE
   * @generated
   * @ordered
   */
  THINGM(8, "thingm", "thingm"),

  /**
   * The '<em><b>Firmata</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FIRMATA_VALUE
   * @generated
   * @ordered
   */
  FIRMATA(9, "firmata", "firmata"),

  /**
   * The '<em><b>I2cfirmata</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #I2CFIRMATA_VALUE
   * @generated
   * @ordered
   */
  I2CFIRMATA(10, "i2cfirmata", "i2cfirmata"),

  /**
   * The '<em><b>Pachube</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PACHUBE_VALUE
   * @generated
   * @ordered
   */
  PACHUBE(11, "pachube", "pachube"),

  /**
   * The '<em><b>Ubiquino</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UBIQUINO_VALUE
   * @generated
   * @ordered
   */
  UBIQUINO(12, "ubiquino", "ubiquino");

  /**
   * The '<em><b>Osc</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Osc</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #OSC
   * @model name="osc"
   * @generated
   * @ordered
   */
  public static final int OSC_VALUE = 0;

  /**
   * The '<em><b>Midi</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Midi</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MIDI
   * @model name="midi"
   * @generated
   * @ordered
   */
  public static final int MIDI_VALUE = 1;

  /**
   * The '<em><b>Dmx</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Dmx</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DMX
   * @model name="dmx"
   * @generated
   * @ordered
   */
  public static final int DMX_VALUE = 2;

  /**
   * The '<em><b>Oscableton</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Oscableton</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #OSCABLETON
   * @model name="oscableton"
   * @generated
   * @ordered
   */
  public static final int OSCABLETON_VALUE = 3;

  /**
   * The '<em><b>Oscwiimote</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Oscwiimote</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #OSCWIIMOTE
   * @model name="oscwiimote"
   * @generated
   * @ordered
   */
  public static final int OSCWIIMOTE_VALUE = 4;

  /**
   * The '<em><b>Oscresolume</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Oscresolume</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #OSCRESOLUME
   * @model name="oscresolume"
   * @generated
   * @ordered
   */
  public static final int OSCRESOLUME_VALUE = 5;

  /**
   * The '<em><b>Tuio</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Tuio</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TUIO
   * @model name="tuio"
   * @generated
   * @ordered
   */
  public static final int TUIO_VALUE = 6;

  /**
   * The '<em><b>Tuio2</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Tuio2</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TUIO2
   * @model name="tuio2"
   * @generated
   * @ordered
   */
  public static final int TUIO2_VALUE = 7;

  /**
   * The '<em><b>Thingm</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Thingm</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #THINGM
   * @model name="thingm"
   * @generated
   * @ordered
   */
  public static final int THINGM_VALUE = 8;

  /**
   * The '<em><b>Firmata</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Firmata</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FIRMATA
   * @model name="firmata"
   * @generated
   * @ordered
   */
  public static final int FIRMATA_VALUE = 9;

  /**
   * The '<em><b>I2cfirmata</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>I2cfirmata</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #I2CFIRMATA
   * @model name="i2cfirmata"
   * @generated
   * @ordered
   */
  public static final int I2CFIRMATA_VALUE = 10;

  /**
   * The '<em><b>Pachube</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Pachube</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PACHUBE
   * @model name="pachube"
   * @generated
   * @ordered
   */
  public static final int PACHUBE_VALUE = 11;

  /**
   * The '<em><b>Ubiquino</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Ubiquino</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #UBIQUINO
   * @model name="ubiquino"
   * @generated
   * @ordered
   */
  public static final int UBIQUINO_VALUE = 12;

  /**
   * An array of all the '<em><b>Ez Formats</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final EzFormats[] VALUES_ARRAY =
    new EzFormats[]
    {
      OSC,
      MIDI,
      DMX,
      OSCABLETON,
      OSCWIIMOTE,
      OSCRESOLUME,
      TUIO,
      TUIO2,
      THINGM,
      FIRMATA,
      I2CFIRMATA,
      PACHUBE,
      UBIQUINO,
    };

  /**
   * A public read-only list of all the '<em><b>Ez Formats</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<EzFormats> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Ez Formats</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EzFormats get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      EzFormats result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Ez Formats</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EzFormats getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      EzFormats result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Ez Formats</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EzFormats get(int value)
  {
    switch (value)
    {
      case OSC_VALUE: return OSC;
      case MIDI_VALUE: return MIDI;
      case DMX_VALUE: return DMX;
      case OSCABLETON_VALUE: return OSCABLETON;
      case OSCWIIMOTE_VALUE: return OSCWIIMOTE;
      case OSCRESOLUME_VALUE: return OSCRESOLUME;
      case TUIO_VALUE: return TUIO;
      case TUIO2_VALUE: return TUIO2;
      case THINGM_VALUE: return THINGM;
      case FIRMATA_VALUE: return FIRMATA;
      case I2CFIRMATA_VALUE: return I2CFIRMATA;
      case PACHUBE_VALUE: return PACHUBE;
      case UBIQUINO_VALUE: return UBIQUINO;
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
  private EzFormats(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //EzFormats
