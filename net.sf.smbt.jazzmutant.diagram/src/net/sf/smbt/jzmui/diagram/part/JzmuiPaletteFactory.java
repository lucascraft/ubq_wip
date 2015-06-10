package net.sf.smbt.jzmui.diagram.part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import net.sf.smbt.jzmui.diagram.providers.JzmuiElementTypes;

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
public class JzmuiPaletteFactory {

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
		paletteContainer.add(createPage1CreationTool());
		paletteContainer.add(createContainer2CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Widgets" palette tool group
	 * @generated NOT
	 */
	private PaletteContainer createWidgets2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Widgets2Group_title);
		paletteContainer.setId("createWidgets2Group"); //$NON-NLS-1$
		paletteContainer.setDescription(Messages.Widgets2Group_desc);
		paletteContainer.add(createKnob1CreationTool());
		paletteContainer.add(createPad2CreationTool());
		paletteContainer.add(createSignalScope3CreationTool());
		//paletteContainer.add(createGesture4CreationTool());
		paletteContainer.add(createMultiBalls5CreationTool());
		paletteContainer.add(createLED6CreationTool());
		//paletteContainer.add(createTrack7CreationTool());
		//paletteContainer.add(createMonitor8CreationTool());
		paletteContainer.add(createMultiSlider9CreationTool());
		paletteContainer.add(createSwitches10CreationTool());
		paletteContainer.add(createRange11CreationTool());
		//paletteContainer.add(createMenu12CreationTool());
		paletteContainer.add(createFader13CreationTool());
		paletteContainer.add(createBreakpoint14CreationTool());
		paletteContainer.add(createRingArea15CreationTool());
		//paletteContainer.add(createSurfaceLCD16CreationTool());
		paletteContainer.add(createCustomButton17CreationTool());
		paletteContainer.add(createText18CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated NOT
	 */
	private ToolEntry createPage1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Page1CreationTool_title,
				Messages.Page1CreationTool_desc,
				Collections
						.singletonList(JzmuiElementTypes.JZJazzInterface_2001));
		entry.setId("createPage1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(JzmuiDiagramEditorPlugin
				.findImageDescriptor("/net.sf.smbt.jazzmutant.edit/icons/full/obj32/JZJazzInterface.gif"));
		entry.setLargeIcon(JzmuiDiagramEditorPlugin
				.findImageDescriptor("/net.sf.smbt.jazzmutant.edit/icons/full/obj32/JZJazzInterface.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated NOT
	 */
	private ToolEntry createContainer2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(JzmuiElementTypes.JZContainer_3002);
		types.add(JzmuiElementTypes.JZContainer_3004);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Container2CreationTool_title,
				Messages.Container2CreationTool_desc, types);
		entry.setId("createContainer2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(JzmuiDiagramEditorPlugin
				.findImageDescriptor("/net.sf.smbt.jazzmutant.edit/icons/full/obj32/JZContainer.gif"));
		entry.setLargeIcon(JzmuiDiagramEditorPlugin
				.findImageDescriptor("/net.sf.smbt.jazzmutant.edit/icons/full/obj32/JZContainer.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated NOT
	 */
	private ToolEntry createKnob1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(JzmuiElementTypes.JZKnob_3008);
		types.add(JzmuiElementTypes.JZKnob_3025);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Knob1CreationTool_title,
				Messages.Knob1CreationTool_desc, types);
		entry.setId("createKnob1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(JzmuiDiagramEditorPlugin
				.findImageDescriptor("/net.sf.smbt.jazzmutant.edit/icons/full/obj32/JZKnob.gif"));
		entry.setLargeIcon(JzmuiDiagramEditorPlugin
				.findImageDescriptor("/net.sf.smbt.jazzmutant.edit/icons/full/obj32/JZKnob.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated NOT
	 */
	private ToolEntry createPad2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(JzmuiElementTypes.JZPads_3013);
		types.add(JzmuiElementTypes.JZPads_3031);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Pad2CreationTool_title,
				Messages.Pad2CreationTool_desc, types);
		entry.setId("createPad2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(JzmuiDiagramEditorPlugin
				.findImageDescriptor("/net.sf.smbt.jazzmutant.edit/icons/full/obj32/JZPad.gif"));
		entry.setLargeIcon(JzmuiDiagramEditorPlugin
				.findImageDescriptor("/net.sf.smbt.jazzmutant.edit/icons/full/obj32/JZPad.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated NOT
	 */
	private ToolEntry createSignalScope3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(JzmuiElementTypes.JZSignalScope_3016);
		types.add(JzmuiElementTypes.JZSignalScope_3034);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.SignalScope3CreationTool_title,
				Messages.SignalScope3CreationTool_desc, types);
		entry.setId("createSignalScope3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(JzmuiDiagramEditorPlugin
				.findImageDescriptor("/net.sf.smbt.jazzmutant.edit/icons/full/obj32/JZSignalScope.gif"));
		entry.setLargeIcon(JzmuiDiagramEditorPlugin
				.findImageDescriptor("/net.sf.smbt.jazzmutant.edit/icons/full/obj32/JZSignalScope.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated NOT
	 */
	private ToolEntry createGesture4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(JzmuiElementTypes.JZGesture_3007);
		types.add(JzmuiElementTypes.JZGesture_3024);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Gesture4CreationTool_title,
				Messages.Gesture4CreationTool_desc, types);
		entry.setId("createGesture4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(JzmuiDiagramEditorPlugin
				.findImageDescriptor("/net.sf.smbt.jazzmutant.edit/icons/full/obj32/JZGesture.gif"));
		entry.setLargeIcon(JzmuiDiagramEditorPlugin
				.findImageDescriptor("/net.sf.smbt.jazzmutant.edit/icons/full/obj32/JZGesture.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated NOT
	 */
	private ToolEntry createMultiBalls5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(JzmuiElementTypes.JZMultiBalls_3012);
		types.add(JzmuiElementTypes.JZMultiBalls_3029);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.MultiBalls5CreationTool_title,
				Messages.MultiBalls5CreationTool_desc, types);
		entry.setId("createMultiBalls5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(JzmuiDiagramEditorPlugin
				.findImageDescriptor("/net.sf.smbt.jazzmutant.edit/icons/full/obj32/JZMultiBalls.gif"));
		entry.setLargeIcon(JzmuiDiagramEditorPlugin
				.findImageDescriptor("/net.sf.smbt.jazzmutant.edit/icons/full/obj32/JZMultiBalls.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated NOT
	 */
	private ToolEntry createLED6CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(JzmuiElementTypes.JZLed_3009);
		types.add(JzmuiElementTypes.JZLed_3026);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.LED6CreationTool_title,
				Messages.LED6CreationTool_desc, types);
		entry.setId("createLED6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(JzmuiDiagramEditorPlugin
				.findImageDescriptor("/net.sf.smbt.jazzmutant.edit/icons/full/obj32/JZLED.gif"));
		entry.setLargeIcon(JzmuiDiagramEditorPlugin
				.findImageDescriptor("/net.sf.smbt.jazzmutant.edit/icons/full/obj32/JZLED.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated NOT
	 */
	private ToolEntry createTrack7CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(JzmuiElementTypes.JZTrack_3020);
		types.add(JzmuiElementTypes.JZTrack_3038);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Track7CreationTool_title,
				Messages.Track7CreationTool_desc, types);
		entry.setId("createTrack7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(JzmuiDiagramEditorPlugin
				.findImageDescriptor("/net.sf.smbt.jazzmutant.edit/icons/full/obj32/JZTrack.gif"));
		entry.setLargeIcon(JzmuiDiagramEditorPlugin
				.findImageDescriptor("/net.sf.smbt.jazzmutant.edit/icons/full/obj32/JZTrack.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated NOT
	 */
	private ToolEntry createMonitor8CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(JzmuiElementTypes.JZLemurMonitor_3011);
		types.add(JzmuiElementTypes.JZLemurMonitor_3028);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Monitor8CreationTool_title,
				Messages.Monitor8CreationTool_desc, types);
		entry.setId("createMonitor8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(JzmuiDiagramEditorPlugin
				.findImageDescriptor("/net.sf.smbt.jazzmutant.edit/icons/full/obj32/JZLemurMonitor.gif"));
		entry.setLargeIcon(JzmuiDiagramEditorPlugin
				.findImageDescriptor("/net.sf.smbt.jazzmutant.edit/icons/full/obj32/JZLemurMonitor.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated NOT
	 */
	private ToolEntry createMultiSlider9CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(JzmuiElementTypes.JZmultiSlider_3021);
		types.add(JzmuiElementTypes.JZmultiSlider_3030);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.MultiSlider9CreationTool_title,
				Messages.MultiSlider9CreationTool_desc, types);
		entry.setId("createMultiSlider9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(JzmuiDiagramEditorPlugin
				.findImageDescriptor("/net.sf.smbt.jazzmutant.edit/icons/full/obj32/JZMultiSlider.gif"));
		entry.setLargeIcon(JzmuiDiagramEditorPlugin
				.findImageDescriptor("/net.sf.smbt.jazzmutant.edit/icons/full/obj32/JZMultiSlider.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated NOT
	 */
	private ToolEntry createSwitches10CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(JzmuiElementTypes.JZSwitches_3018);
		types.add(JzmuiElementTypes.JZSwitches_3036);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Switches10CreationTool_title,
				Messages.Switches10CreationTool_desc, types);
		entry.setId("createSwitches10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(JzmuiDiagramEditorPlugin
				.findImageDescriptor("/net.sf.smbt.jazzmutant.edit/icons/full/obj32/JZSwitches.gif"));
		entry.setLargeIcon(JzmuiDiagramEditorPlugin
				.findImageDescriptor("/net.sf.smbt.jazzmutant.edit/icons/full/obj32/JZSwitches.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated NOT
	 */
	private ToolEntry createRange11CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(JzmuiElementTypes.JZRange_3014);
		types.add(JzmuiElementTypes.JZRange_3032);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Range11CreationTool_title,
				Messages.Range11CreationTool_desc, types);
		entry.setId("createRange11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(JzmuiDiagramEditorPlugin
				.findImageDescriptor("/net.sf.smbt.jazzmutant.edit/icons/full/obj32/JZRange.gif"));
		entry.setLargeIcon(JzmuiDiagramEditorPlugin
				.findImageDescriptor("/net.sf.smbt.jazzmutant.edit/icons/full/obj32/JZRange.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated NOT
	 */
	private ToolEntry createMenu12CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(JzmuiElementTypes.JZLemurMenu_3010);
		types.add(JzmuiElementTypes.JZLemurMenu_3027);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Menu12CreationTool_title,
				Messages.Menu12CreationTool_desc, types);
		entry.setId("createMenu12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(JzmuiDiagramEditorPlugin
				.findImageDescriptor("/net.sf.smbt.jazzmutant.edit/icons/full/obj32/JZLemurMenu.gif"));
		entry.setLargeIcon(JzmuiDiagramEditorPlugin
				.findImageDescriptor("/net.sf.smbt.jazzmutant.edit/icons/full/obj32/JZLemurMenu.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated NOT
	 */
	private ToolEntry createFader13CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(JzmuiElementTypes.JZFader_3006);
		types.add(JzmuiElementTypes.JZFader_3023);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Fader13CreationTool_title,
				Messages.Fader13CreationTool_desc, types);
		entry.setId("createFader13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(JzmuiDiagramEditorPlugin
				.findImageDescriptor("/net.sf.smbt.jazzmutant.edit/icons/full/obj32/JZFader.gif"));
		entry.setLargeIcon(JzmuiDiagramEditorPlugin
				.findImageDescriptor("/net.sf.smbt.jazzmutant.edit/icons/full/obj32/JZFader.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated NOT
	 */
	private ToolEntry createBreakpoint14CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(JzmuiElementTypes.JZBreakPoint_3001);
		types.add(JzmuiElementTypes.JZBreakPoint_3003);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Breakpoint14CreationTool_title,
				Messages.Breakpoint14CreationTool_desc, types);
		entry.setId("createBreakpoint14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(JzmuiDiagramEditorPlugin
				.findImageDescriptor("/net.sf.smbt.jazzmutant.edit/icons/full/obj32/JZBreakPoint.gif"));
		entry.setLargeIcon(JzmuiDiagramEditorPlugin
				.findImageDescriptor("/net.sf.smbt.jazzmutant.edit/icons/full/obj32/JZBreakPoint.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated NOT
	 */
	private ToolEntry createRingArea15CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(JzmuiElementTypes.JZRingArea_3015);
		types.add(JzmuiElementTypes.JZRingArea_3033);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.RingArea15CreationTool_title,
				Messages.RingArea15CreationTool_desc, types);
		entry.setId("createRingArea15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(JzmuiDiagramEditorPlugin
				.findImageDescriptor("/net.sf.smbt.jazzmutant.edit/icons/full/obj32/JZRingArea.gif"));
		entry.setLargeIcon(JzmuiDiagramEditorPlugin
				.findImageDescriptor("/net.sf.smbt.jazzmutant.edit/icons/full/obj32/JZRingArea.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated NOT
	 */
	private ToolEntry createSurfaceLCD16CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(JzmuiElementTypes.JZSurfaceLCD_3017);
		types.add(JzmuiElementTypes.JZSurfaceLCD_3035);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.SurfaceLCD16CreationTool_title,
				Messages.SurfaceLCD16CreationTool_desc, types);
		entry.setId("createSurfaceLCD16CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(JzmuiDiagramEditorPlugin
				.findImageDescriptor("/net.sf.smbt.jazzmutant.edit/icons/full/obj32/JZSurfaceLCD.gif"));
		entry.setLargeIcon(JzmuiDiagramEditorPlugin
				.findImageDescriptor("/net.sf.smbt.jazzmutant.edit/icons/full/obj32/JZSurfaceLCD.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated NOT
	 */
	private ToolEntry createCustomButton17CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(JzmuiElementTypes.JZCustomButton_3005);
		types.add(JzmuiElementTypes.JZCustomButton_3022);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CustomButton17CreationTool_title,
				Messages.CustomButton17CreationTool_desc, types);
		entry.setId("createCustomButton17CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(JzmuiDiagramEditorPlugin
				.findImageDescriptor("/net.sf.smbt.jazzmutant.edit/icons/full/obj32/JZCustomButton.gif"));
		entry.setLargeIcon(JzmuiDiagramEditorPlugin
				.findImageDescriptor("/net.sf.smbt.jazzmutant.edit/icons/full/obj32/JZCustomButton.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated NOT
	 */
	private ToolEntry createText18CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(JzmuiElementTypes.JZText_3019);
		types.add(JzmuiElementTypes.JZText_3037);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Text18CreationTool_title,
				Messages.Text18CreationTool_desc, types);
		entry.setId("createText18CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(JzmuiDiagramEditorPlugin
				.findImageDescriptor("/net.sf.smbt.jazzmutant.edit/icons/full/obj32/JZText.gif"));
		entry.setLargeIcon(JzmuiDiagramEditorPlugin
				.findImageDescriptor("/net.sf.smbt.jazzmutant.edit/icons/full/obj32/JZText.gif")); //$NON-NLS-1$
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
