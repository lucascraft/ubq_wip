package net.sf.smbt.ezsequence.diagram.part;

import java.util.Collections;
import java.util.List;

import net.sf.smbt.ezsequence.diagram.providers.EzsequenceElementTypes;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.PaletteSeparator;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class EzsequencePaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createDefault1Group());
		paletteRoot.add(createBoxes2Group());
		paletteRoot.add(createEvents3Group());
		paletteRoot.add(createConnections4Group());
	}

	/**
	 * Creates "Default" palette tool group
	 * @generated
	 */
	private PaletteContainer createDefault1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Default1Group_title);
		paletteContainer.setId("createDefault1Group"); //$NON-NLS-1$
		paletteContainer.setDescription(Messages.Default1Group_desc);
		paletteContainer.add(new PaletteSeparator());
		return paletteContainer;
	}

	/**
	 * Creates "Boxes" palette tool group
	 * @generated
	 */
	private PaletteContainer createBoxes2Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Boxes2Group_title);
		paletteContainer.setId("createBoxes2Group"); //$NON-NLS-1$
		paletteContainer.setDescription(Messages.Boxes2Group_desc);
		paletteContainer.add(createTimedBox1CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Events" palette tool group
	 * @generated
	 */
	private PaletteContainer createEvents3Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Events3Group_title);
		paletteContainer.setId("createEvents3Group"); //$NON-NLS-1$
		paletteContainer.setDescription(Messages.Events3Group_desc);
		paletteContainer.add(createEvents1CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Connections" palette tool group
	 * @generated
	 */
	private PaletteContainer createConnections4Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Connections4Group_title);
		paletteContainer.setId("createConnections4Group"); //$NON-NLS-1$
		paletteContainer.setDescription(Messages.Connections4Group_desc);
		paletteContainer.add(createLink1CreationTool());
		paletteContainer.add(createTrigger2CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTimedBox1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.TimedBox1CreationTool_title,
				Messages.TimedBox1CreationTool_desc,
				Collections.singletonList(EzsequenceElementTypes.TimeBox_2001));
		entry.setId("createTimedBox1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EzsequenceElementTypes
				.getImageDescriptor(EzsequenceElementTypes.TimeBox_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEvents1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Events1CreationTool_title,
				Messages.Events1CreationTool_desc,
				Collections
						.singletonList(EzsequenceElementTypes.TimedEvent_3001));
		entry.setId("createEvents1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EzsequenceElementTypes
				.getImageDescriptor(EzsequenceElementTypes.TimedEvent_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLink1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Link1CreationTool_title,
				Messages.Link1CreationTool_desc,
				Collections
						.singletonList(EzsequenceElementTypes.TimedLink_4001));
		entry.setId("createLink1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EzsequenceElementTypes
				.getImageDescriptor(EzsequenceElementTypes.TimedLink_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTrigger2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Trigger2CreationTool_title,
				Messages.Trigger2CreationTool_desc,
				Collections
						.singletonList(EzsequenceElementTypes.EventTrigger_4002));
		entry.setId("createTrigger2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EzsequenceElementTypes
				.getImageDescriptor(EzsequenceElementTypes.EventTrigger_4002));
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

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
