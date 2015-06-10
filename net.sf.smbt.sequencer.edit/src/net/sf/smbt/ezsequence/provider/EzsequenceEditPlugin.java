/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezsequence.provider;

import net.sf.smbt.dmx.ezdmxctrl.provider.EzdmxctrlEditPlugin;
import net.sf.smbt.dmx.model.ezdmx.provider.EzdmxEditPlugin;
import net.sf.smbt.dmx.model.qxf.provider.QxfEditPlugin;
import net.sf.smbt.ezmojo.provider.EzmojoEditPlugin;
import net.sf.smbt.ezmotion.provider.EzmotionEditPlugin;
import net.sf.smbt.midi.ezmidi.provider.EzmidiEditPlugin;
import net.sf.smbt.osc.eztuio2.provider.EztuioX2EditPlugin;
import net.sf.smbt.osccmd.provider.OsccmdEditPlugin;
import net.sf.smbt.xcp.provider.XcpEditPlugin;
import net.sf.xqz.model.temporal.provider.TemporalEditPlugin;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.provider.EcoreEditPlugin;

/**
 * This is the central singleton for the Ezsequence edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class EzsequenceEditPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final EzsequenceEditPlugin INSTANCE = new EzsequenceEditPlugin();

	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Implementation plugin;

	/**
	 * Create the instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzsequenceEditPlugin() {
		super
		  (new ResourceLocator [] {
		     TemporalEditPlugin.INSTANCE,
		     EzmidiEditPlugin.INSTANCE,
		     EzdmxctrlEditPlugin.INSTANCE,
		     QxfEditPlugin.INSTANCE,
		     EzdmxEditPlugin.INSTANCE,
		     EzmojoEditPlugin.INSTANCE,
		     XcpEditPlugin.INSTANCE,
		     EcoreEditPlugin.INSTANCE,
		     EzmotionEditPlugin.INSTANCE,
		     OsccmdEditPlugin.INSTANCE,
		     EztuioX2EditPlugin.INSTANCE,
		   });
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	@Override
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	public static Implementation getPlugin() {
		return plugin;
	}

	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class Implementation extends EclipsePlugin {
		/**
		 * Creates an instance.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Implementation() {
			super();

			// Remember the static instance.
			//
			plugin = this;
		}
	}

}
