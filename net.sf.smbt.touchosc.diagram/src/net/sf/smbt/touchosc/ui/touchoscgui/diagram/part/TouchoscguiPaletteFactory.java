package net.sf.smbt.touchosc.ui.touchoscgui.diagram.part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import net.sf.smbt.touchosc.ui.touchoscgui.diagram.providers.TouchoscguiElementTypes;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class TouchoscguiPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createContainers1Group());
		paletteRoot.add(createWidgets2Group());
	}

	/**
	 * Creates "Containers" palette tool group
	 * @generated
	 */
	private PaletteContainer createContainers1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Containers1Group_title);
		paletteContainer.setId("createContainers1Group"); //$NON-NLS-1$
		paletteContainer.setDescription(Messages.Containers1Group_desc);
		paletteContainer.add(createTab1CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Widgets" palette tool group
	 * @generated
	 */
	private PaletteContainer createWidgets2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Widgets2Group_title);
		paletteContainer.setId("createWidgets2Group"); //$NON-NLS-1$
		paletteContainer.add(createXYPad1CreationTool());
		paletteContainer.add(createRotaryH2CreationTool());
		paletteContainer.add(createRotaryV3CreationTool());
		paletteContainer.add(createFaderH4CreationTool());
		paletteContainer.add(createFaderV5CreationTool());
		paletteContainer.add(createLabelH6CreationTool());
		paletteContainer.add(createLabelV7CreationTool());
		paletteContainer.add(createLED8CreationTool());
		paletteContainer.add(createMultiFaderH9CreationTool());
		paletteContainer.add(createMultiFaderV10CreationTool());
		paletteContainer.add(createMultiToggle11CreationTool());
		paletteContainer.add(createPush12CreationTool());
		paletteContainer.add(createToggle13CreationTool());
		paletteContainer.add(createEncoder14CreationTool());
		paletteContainer.add(createMultiPush15CreationTool());
		paletteContainer.add(createBatteryH16CreationTool());
		paletteContainer.add(createBatteryV17CreationTool());
		paletteContainer.add(createTimeH18CreationTool());
		paletteContainer.add(createTimeV19CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createXYPad1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.XYPad1CreationTool_title,
				Messages.XYPad1CreationTool_desc,
				Collections
						.singletonList(TouchoscguiElementTypes.TouchOscXYPad_3010));
		entry.setId("createXYPad1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TouchoscguiElementTypes
				.getImageDescriptor(TouchoscguiElementTypes.TouchOscXYPad_3010));
		entry.setLargeIcon(TouchoscguiDiagramEditorPlugin
				.findImageDescriptor("/net.sf.smbt.touchosc.edit/icons/full/obj32/TouchOscXYPad.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRotaryH2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.RotaryH2CreationTool_title,
				Messages.RotaryH2CreationTool_desc,
				Collections
						.singletonList(TouchoscguiElementTypes.TouchOscRotaryH_3008));
		entry.setId("createRotaryH2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TouchoscguiDiagramEditorPlugin
				.findImageDescriptor("/net.sf.smbt.touchosc.edit/icons/full/obj32/TouchOscRotaryH.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRotaryV3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.RotaryV3CreationTool_title,
				Messages.RotaryV3CreationTool_desc,
				Collections
						.singletonList(TouchoscguiElementTypes.TouchOscRotaryV_3009));
		entry.setId("createRotaryV3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TouchoscguiDiagramEditorPlugin
				.findImageDescriptor("/net.sf.smbt.touchosc.edit/icons/full/obj32/TouchOscRotaryV.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFaderH4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.FaderH4CreationTool_title,
				Messages.FaderH4CreationTool_desc,
				Collections
						.singletonList(TouchoscguiElementTypes.TouchOscFaderH_3001));
		entry.setId("createFaderH4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TouchoscguiDiagramEditorPlugin
				.findImageDescriptor("/net.sf.smbt.touchosc.edit/icons/full/obj32/TouchOscFaderH.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFaderV5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.FaderV5CreationTool_title,
				Messages.FaderV5CreationTool_desc,
				Collections
						.singletonList(TouchoscguiElementTypes.TouchOscFaderV_3002));
		entry.setId("createFaderV5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TouchoscguiDiagramEditorPlugin
				.findImageDescriptor("/net.sf.smbt.touchosc.edit/icons/full/obj32/TouchOscFaderV.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLabelH6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.LabelH6CreationTool_title,
				Messages.LabelH6CreationTool_desc,
				Collections
						.singletonList(TouchoscguiElementTypes.TouchOscLabelH_3003));
		entry.setId("createLabelH6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TouchoscguiDiagramEditorPlugin
				.findImageDescriptor("/net.sf.smbt.touchosc.edit/icons/full/obj32/TouchOscLabelH.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLabelV7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.LabelV7CreationTool_title,
				Messages.LabelV7CreationTool_desc,
				Collections
						.singletonList(TouchoscguiElementTypes.TouchOscLabelV_3004));
		entry.setId("createLabelV7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TouchoscguiDiagramEditorPlugin
				.findImageDescriptor("/net.sf.smbt.touchosc.edit/icons/full/obj32/TouchOscLabelV.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLED8CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.LED8CreationTool_title,
				Messages.LED8CreationTool_desc,
				Collections
						.singletonList(TouchoscguiElementTypes.TouchOscLED_3005));
		entry.setId("createLED8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TouchoscguiDiagramEditorPlugin
				.findImageDescriptor("/net.sf.smbt.touchosc.edit/icons/full/obj32/TouchOscLED.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMultiFaderH9CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.MultiFaderH9CreationTool_title,
				Messages.MultiFaderH9CreationTool_desc,
				Collections
						.singletonList(TouchoscguiElementTypes.TouchOscMultiFaderH_3017));
		entry.setId("createMultiFaderH9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TouchoscguiDiagramEditorPlugin
				.findImageDescriptor("/net.sf.smbt.touchosc.edit/icons/full/obj32/TouchOscMultiFaderH.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMultiFaderV10CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.MultiFaderV10CreationTool_title,
				Messages.MultiFaderV10CreationTool_desc,
				Collections
						.singletonList(TouchoscguiElementTypes.TouchOscMultiFaderV_3018));
		entry.setId("createMultiFaderV10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TouchoscguiDiagramEditorPlugin
				.findImageDescriptor("/net.sf.smbt.touchosc.edit/icons/full/obj32/TouchOscMultiFaderV.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMultiToggle11CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.MultiToggle11CreationTool_title,
				Messages.MultiToggle11CreationTool_desc,
				Collections
						.singletonList(TouchoscguiElementTypes.TouchOscMultiToggle_3006));
		entry.setId("createMultiToggle11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TouchoscguiDiagramEditorPlugin
				.findImageDescriptor("/net.sf.smbt.touchosc.edit/icons/full/obj32/TouchOscMultiToggle.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPush12CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Push12CreationTool_title,
				Messages.Push12CreationTool_desc,
				Collections
						.singletonList(TouchoscguiElementTypes.TouchOscPush_3007));
		entry.setId("createPush12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TouchoscguiDiagramEditorPlugin
				.findImageDescriptor("/net.sf.smbt.touchosc.edit/icons/full/obj32/TouchOscPush.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createToggle13CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Toggle13CreationTool_title,
				Messages.Toggle13CreationTool_desc,
				Collections
						.singletonList(TouchoscguiElementTypes.TouchOscToggle_3011));
		entry.setId("createToggle13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TouchoscguiDiagramEditorPlugin
				.findImageDescriptor("/net.sf.smbt.touchosc.edit/icons/full/obj32/TouchOscToggle.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEncoder14CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Encoder14CreationTool_title,
				Messages.Encoder14CreationTool_desc,
				Collections
						.singletonList(TouchoscguiElementTypes.TouchOscEncoder_3014));
		entry.setId("createEncoder14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TouchoscguiDiagramEditorPlugin
				.findImageDescriptor("/net.sf.smbt.touchosc.edit/icons/full/obj32/TouchOscEncoder.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMultiPush15CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.MultiPush15CreationTool_title,
				Messages.MultiPush15CreationTool_desc,
				Collections
						.singletonList(TouchoscguiElementTypes.TouchOscMultiPush_3019));
		entry.setId("createMultiPush15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TouchoscguiDiagramEditorPlugin
				.findImageDescriptor("/net.sf.smbt.touchosc.edit/icons/full/obj32/TouchOscMultiPush.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBatteryH16CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.BatteryH16CreationTool_title,
				Messages.BatteryH16CreationTool_desc,
				Collections
						.singletonList(TouchoscguiElementTypes.TouchOscBatteryH_3015));
		entry.setId("createBatteryH16CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TouchoscguiDiagramEditorPlugin
				.findImageDescriptor("/net.sf.smbt.touchosc.edit/icons/full/obj32/TouchOscBatteryH.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBatteryV17CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.BatteryV17CreationTool_title,
				Messages.BatteryV17CreationTool_desc,
				Collections
						.singletonList(TouchoscguiElementTypes.TouchOscBatteryV_3016));
		entry.setId("createBatteryV17CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TouchoscguiDiagramEditorPlugin
				.findImageDescriptor("/net.sf.smbt.touchosc.edit/icons/full/obj32/TouchOscBatteryV.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTimeH18CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.TimeH18CreationTool_title,
				Messages.TimeH18CreationTool_desc,
				Collections
						.singletonList(TouchoscguiElementTypes.TouchOscTimeH_3012));
		entry.setId("createTimeH18CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TouchoscguiDiagramEditorPlugin
				.findImageDescriptor("/net.sf.smbt.touchosc.edit/icons/full/obj32/TouchOscTimeH.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTimeV19CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.TimeV19CreationTool_title,
				Messages.TimeV19CreationTool_desc,
				Collections
						.singletonList(TouchoscguiElementTypes.TouchOscTimeV_3013));
		entry.setId("createTimeV19CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TouchoscguiDiagramEditorPlugin
				.findImageDescriptor("/net.sf.smbt.touchosc.edit/icons/full/obj32/TouchOscTimeV.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTab1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Tab1CreationTool_title,
				Messages.Tab1CreationTool_desc,
				Collections
						.singletonList(TouchoscguiElementTypes.TouchOscTabPage_2001));
		entry.setId("createTab1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TouchoscguiDiagramEditorPlugin
				.findImageDescriptor("/net.sf.smbt.touchosc.edit/icons/full/obj32/TouchOscTab.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
