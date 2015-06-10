/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezdxxp;

import net.sf.xqz.model.cmd.Cmd;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Daap Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezdxxp.DaapCmd#getTag <em>Tag</em>}</li>
 *   <li>{@link net.sf.smbt.ezdxxp.DaapCmd#getHttpProperties <em>Http Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezdxxp.EzdxxpPackage#getDaapCmd()
 * @model
 * @generated
 */
public interface DaapCmd extends Cmd {

	/**
	 * Returns the value of the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' attribute.
	 * @see #setTag(byte[])
	 * @see net.sf.smbt.ezdxxp.EzdxxpPackage#getDaapCmd_Tag()
	 * @model
	 * @generated
	 */
	byte[] getTag();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezdxxp.DaapCmd#getTag <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag</em>' attribute.
	 * @see #getTag()
	 * @generated
	 */
	void setTag(byte[] value);

	/**
	 * Returns the value of the '<em><b>Http Properties</b></em>' reference list.
	 * The list contents are of type {@link net.sf.smbt.ezdxxp.HttpProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Http Properties</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Http Properties</em>' reference list.
	 * @see net.sf.smbt.ezdxxp.EzdxxpPackage#getDaapCmd_HttpProperties()
	 * @model
	 * @generated
	 */
	EList<HttpProperty> getHttpProperties();
} // DaapCmd
