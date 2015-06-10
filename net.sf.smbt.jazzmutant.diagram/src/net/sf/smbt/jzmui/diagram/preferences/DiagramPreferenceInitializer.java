package net.sf.smbt.jzmui.diagram.preferences;

import java.util.Locale;

import net.sf.smbt.jzmui.diagram.part.JzmuiDiagramEditorPlugin;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.gef.rulers.RulerProvider;
import org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	 * @generated NOT
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		DiagramGeneralPreferencePage.initDefaults(store);
		DiagramAppearancePreferencePage.initDefaults(store);
		DiagramConnectionsPreferencePage.initDefaults(store);
		DiagramPrintingPreferencePage.initDefaults(store);

		initDefaults(store);

	}

	/**
	 * Initializes the default preference values for the preferences.
	 * 
	 * @param IPreferenceStore preferences
	 */
	public static void initDefaults(IPreferenceStore preferenceStore) {
		preferenceStore
				.setDefault(IPreferenceConstants.PREF_SHOW_RULERS, false);
		String defaultCountry = Locale.getDefault().getCountry();
		if (defaultCountry == null
				|| defaultCountry.equals(Locale.US.getCountry())
				|| defaultCountry.equals(Locale.CANADA.getCountry())) {
			preferenceStore.setDefault(IPreferenceConstants.PREF_RULER_UNITS,
					RulerProvider.UNIT_INCHES);
		} else {
			preferenceStore.setDefault(IPreferenceConstants.PREF_RULER_UNITS,
					RulerProvider.UNIT_CENTIMETERS);
		}
		preferenceStore.setDefault(IPreferenceConstants.PREF_SHOW_GRID, false);
		preferenceStore
				.setDefault(IPreferenceConstants.PREF_SNAP_TO_GRID, true);
		preferenceStore.setDefault(IPreferenceConstants.PREF_SNAP_TO_GEOMETRY,
				true);
		preferenceStore
				.setDefault(IPreferenceConstants.PREF_GRID_SPACING, 0.25);
	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return JzmuiDiagramEditorPlugin.getInstance().getPreferenceStore();
	}
}
