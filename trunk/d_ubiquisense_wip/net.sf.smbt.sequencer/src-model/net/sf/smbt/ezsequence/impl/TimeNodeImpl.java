/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezsequence.impl;

import net.sf.smbt.ezsequence.EzsequencePackage;
import net.sf.smbt.ezsequence.NodeParam;
import net.sf.smbt.ezsequence.TimeNode;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezsequence.impl.TimeNodeImpl#getPoint <em>Point</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.TimeNodeImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.TimeNodeImpl#getCompletion <em>Completion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeNodeImpl extends MinimalEObjectImpl.Container implements TimeNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzsequencePackage.Literals.TIME_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point getPoint() {
		return (Point)eGet(EzsequencePackage.Literals.TIME_NODE__POINT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoint(Point newPoint) {
		eSet(EzsequencePackage.Literals.TIME_NODE__POINT, newPoint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<NodeParam> getParameters() {
		return (EList<NodeParam>)eGet(EzsequencePackage.Literals.TIME_NODE__PARAMETERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCompletion() {
		return (Float)eGet(EzsequencePackage.Literals.TIME_NODE__COMPLETION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompletion(float newCompletion) {
		eSet(EzsequencePackage.Literals.TIME_NODE__COMPLETION, newCompletion);
	}

} //TimeNodeImpl
