/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezsequence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timed Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezsequence.TimedLink#getBefore <em>Before</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.TimedLink#getAfter <em>After</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezsequence.EzsequencePackage#getTimedLink()
 * @model
 * @generated
 */
public interface TimedLink extends TimedObj {
	/**
	 * Returns the value of the '<em><b>Before</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Before</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Before</em>' reference.
	 * @see #setBefore(AbstractPort)
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getTimedLink_Before()
	 * @model
	 * @generated
	 */
	AbstractPort getBefore();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezsequence.TimedLink#getBefore <em>Before</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Before</em>' reference.
	 * @see #getBefore()
	 * @generated
	 */
	void setBefore(AbstractPort value);

	/**
	 * Returns the value of the '<em><b>After</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>After</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>After</em>' reference.
	 * @see #setAfter(AbstractPort)
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getTimedLink_After()
	 * @model
	 * @generated
	 */
	AbstractPort getAfter();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezsequence.TimedLink#getAfter <em>After</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>After</em>' reference.
	 * @see #getAfter()
	 * @generated
	 */
	void setAfter(AbstractPort value);

} // TimedLink
