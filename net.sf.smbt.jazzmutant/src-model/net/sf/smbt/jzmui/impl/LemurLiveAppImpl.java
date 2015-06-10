/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.jzmui.impl;

import java.util.List;

import net.sf.smbt.jzmui.JZConfigurationManager;
import net.sf.smbt.jzmui.JZUIElem;
import net.sf.smbt.jzmui.JzmuiPackage;
import net.sf.smbt.jzmui.LemurLiveApp;
import net.sf.xqz.model.engine.CmdPipe;
import net.sf.xqz.model.engine.EnginePackage;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lemur Live App</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.jzmui.impl.LemurLiveAppImpl#getEngines <em>Engines</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.LemurLiveAppImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.LemurLiveAppImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.LemurLiveAppImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.LemurLiveAppImpl#getId <em>Id</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.LemurLiveAppImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.LemurLiveAppImpl#getConfigurations <em>Configurations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LemurLiveAppImpl extends MinimalEObjectImpl.Container implements LemurLiveApp {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LemurLiveAppImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JzmuiPackage.Literals.LEMUR_LIVE_APP;
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
	@SuppressWarnings("unchecked")
	public List<CmdPipe> getEngines() {
		return (List<CmdPipe>)eGet(EnginePackage.Literals.ICONNECTED_UNIT__ENGINES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public CmdPipe getDefault() {
		CmdPipe pipe = (CmdPipe)eGet(EnginePackage.Literals.ICONNECTED_UNIT__DEFAULT, true);
		if (pipe == null && getEngines() != null && !getEngines().isEmpty()) {
			return getEngines().get(0);
		}
		return pipe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(CmdPipe newDefault) {
		eSet(EnginePackage.Literals.ICONNECTED_UNIT__DEFAULT, newDefault);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWidth() {
		return (Integer)eGet(JzmuiPackage.Literals.LEMUR_LIVE_APP__WIDTH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(int newWidth) {
		eSet(JzmuiPackage.Literals.LEMUR_LIVE_APP__WIDTH, newWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeight() {
		return (Integer)eGet(JzmuiPackage.Literals.LEMUR_LIVE_APP__HEIGHT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(int newHeight) {
		eSet(JzmuiPackage.Literals.LEMUR_LIVE_APP__HEIGHT, newHeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return (Integer)eGet(JzmuiPackage.Literals.LEMUR_LIVE_APP__ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		eSet(JzmuiPackage.Literals.LEMUR_LIVE_APP__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<JZUIElem> getElements() {
		return (EList<JZUIElem>)eGet(JzmuiPackage.Literals.LEMUR_LIVE_APP__ELEMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JZConfigurationManager getConfigurations() {
		return (JZConfigurationManager)eGet(JzmuiPackage.Literals.LEMUR_LIVE_APP__CONFIGURATIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurations(JZConfigurationManager newConfigurations) {
		eSet(JzmuiPackage.Literals.LEMUR_LIVE_APP__CONFIGURATIONS, newConfigurations);
	}

} //LemurLiveAppImpl
