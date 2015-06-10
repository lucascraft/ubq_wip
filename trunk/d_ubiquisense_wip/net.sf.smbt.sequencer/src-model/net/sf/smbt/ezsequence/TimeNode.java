/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezsequence;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezsequence.TimeNode#getPoint <em>Point</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.TimeNode#getParameters <em>Parameters</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.TimeNode#getCompletion <em>Completion</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezsequence.EzsequencePackage#getTimeNode()
 * @model
 * @generated
 */
public interface TimeNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point</em>' attribute.
	 * @see #setPoint(Point)
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getTimeNode_Point()
	 * @model dataType="net.sf.smbt.ezsequence.Point"
	 * @generated
	 */
	Point getPoint();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezsequence.TimeNode#getPoint <em>Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point</em>' attribute.
	 * @see #getPoint()
	 * @generated
	 */
	void setPoint(Point value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.ezsequence.NodeParam}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getTimeNode_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<NodeParam> getParameters();

	/**
	 * Returns the value of the '<em><b>Completion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Completion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Completion</em>' attribute.
	 * @see #setCompletion(float)
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getTimeNode_Completion()
	 * @model
	 * @generated
	 */
	float getCompletion();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezsequence.TimeNode#getCompletion <em>Completion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Completion</em>' attribute.
	 * @see #getCompletion()
	 * @generated
	 */
	void setCompletion(float value);

} // TimeNode
