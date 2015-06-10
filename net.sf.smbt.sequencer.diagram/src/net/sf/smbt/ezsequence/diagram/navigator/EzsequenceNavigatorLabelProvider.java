package net.sf.smbt.ezsequence.diagram.navigator;

import net.sf.smbt.ezsequence.EventTrigger;
import net.sf.smbt.ezsequence.PortIn;
import net.sf.smbt.ezsequence.PortOut;
import net.sf.smbt.ezsequence.Sequencer;
import net.sf.smbt.ezsequence.TimeCursor;
import net.sf.smbt.ezsequence.TimedEvent;
import net.sf.smbt.ezsequence.TimedLink;
import net.sf.smbt.ezsequence.diagram.edit.parts.EventTriggerEditPart;
import net.sf.smbt.ezsequence.diagram.edit.parts.PortInEditPart;
import net.sf.smbt.ezsequence.diagram.edit.parts.PortOutEditPart;
import net.sf.smbt.ezsequence.diagram.edit.parts.SequencerEditPart;
import net.sf.smbt.ezsequence.diagram.edit.parts.TimeBoxEditPart;
import net.sf.smbt.ezsequence.diagram.edit.parts.TimeBoxIDEditPart;
import net.sf.smbt.ezsequence.diagram.edit.parts.TimeCursorEditPart;
import net.sf.smbt.ezsequence.diagram.edit.parts.TimeLineEditPart;
import net.sf.smbt.ezsequence.diagram.edit.parts.TimedEventEditPart;
import net.sf.smbt.ezsequence.diagram.edit.parts.TimedLinkEditPart;
import net.sf.smbt.ezsequence.diagram.part.EzsequenceDiagramEditorPlugin;
import net.sf.smbt.ezsequence.diagram.part.EzsequenceVisualIDRegistry;
import net.sf.smbt.ezsequence.diagram.providers.EzsequenceElementTypes;
import net.sf.smbt.ezsequence.diagram.providers.EzsequenceParserProvider;
import net.sf.xqz.model.temporal.TimeLine;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class EzsequenceNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		EzsequenceDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		EzsequenceDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof EzsequenceNavigatorItem
				&& !isOwnView(((EzsequenceNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof EzsequenceNavigatorGroup) {
			EzsequenceNavigatorGroup group = (EzsequenceNavigatorGroup) element;
			return EzsequenceDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof EzsequenceNavigatorItem) {
			EzsequenceNavigatorItem navigatorItem = (EzsequenceNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (EzsequenceVisualIDRegistry.getVisualID(view)) {
		case EventTriggerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ezsequence/1.0?EventTrigger", EzsequenceElementTypes.EventTrigger_4002); //$NON-NLS-1$
		case SequencerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://ezsequence/1.0?Sequencer", EzsequenceElementTypes.Sequencer_1000); //$NON-NLS-1$
		case TimedEventEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ezsequence/1.0?TimedEvent", EzsequenceElementTypes.TimedEvent_3001); //$NON-NLS-1$
		case PortOutEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ezsequence/1.0?PortOut", EzsequenceElementTypes.PortOut_3003); //$NON-NLS-1$
		case TimedLinkEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://ezsequence/1.0?TimedLink", EzsequenceElementTypes.TimedLink_4001); //$NON-NLS-1$
		case TimeLineEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://net.sf.xqz/temporal/1.0.0?TimeLine", EzsequenceElementTypes.TimeLine_2002); //$NON-NLS-1$
		case PortInEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://ezsequence/1.0?PortIn", EzsequenceElementTypes.PortIn_3002); //$NON-NLS-1$
		case TimeBoxEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ezsequence/1.0?TimeBox", EzsequenceElementTypes.TimeBox_2001); //$NON-NLS-1$
		case TimeCursorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://ezsequence/1.0?TimeCursor", EzsequenceElementTypes.TimeCursor_2003); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = EzsequenceDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& EzsequenceElementTypes.isKnownElementType(elementType)) {
			image = EzsequenceElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof EzsequenceNavigatorGroup) {
			EzsequenceNavigatorGroup group = (EzsequenceNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof EzsequenceNavigatorItem) {
			EzsequenceNavigatorItem navigatorItem = (EzsequenceNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (EzsequenceVisualIDRegistry.getVisualID(view)) {
		case EventTriggerEditPart.VISUAL_ID:
			return getEventTrigger_4002Text(view);
		case SequencerEditPart.VISUAL_ID:
			return getSequencer_1000Text(view);
		case TimedEventEditPart.VISUAL_ID:
			return getTimedEvent_3001Text(view);
		case PortOutEditPart.VISUAL_ID:
			return getPortOut_3003Text(view);
		case TimedLinkEditPart.VISUAL_ID:
			return getTimedLink_4001Text(view);
		case TimeLineEditPart.VISUAL_ID:
			return getTimeLine_2002Text(view);
		case PortInEditPart.VISUAL_ID:
			return getPortIn_3002Text(view);
		case TimeBoxEditPart.VISUAL_ID:
			return getTimeBox_2001Text(view);
		case TimeCursorEditPart.VISUAL_ID:
			return getTimeCursor_2003Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getTimedEvent_3001Text(View view) {
		TimedEvent domainModelElement = (TimedEvent) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getTime());
		} else {
			EzsequenceDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTimeCursor_2003Text(View view) {
		TimeCursor domainModelElement = (TimeCursor) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getTime());
		} else {
			EzsequenceDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEventTrigger_4002Text(View view) {
		EventTrigger domainModelElement = (EventTrigger) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getId();
		} else {
			EzsequenceDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTimeBox_2001Text(View view) {
		IParser parser = EzsequenceParserProvider
				.getParser(EzsequenceElementTypes.TimeBox_2001, view
						.getElement() != null ? view.getElement() : view,
						EzsequenceVisualIDRegistry
								.getType(TimeBoxIDEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EzsequenceDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTimeLine_2002Text(View view) {
		TimeLine domainModelElement = (TimeLine) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			EzsequenceDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSequencer_1000Text(View view) {
		Sequencer domainModelElement = (Sequencer) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getID();
		} else {
			EzsequenceDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTimedLink_4001Text(View view) {
		TimedLink domainModelElement = (TimedLink) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getTime());
		} else {
			EzsequenceDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPortOut_3003Text(View view) {
		PortOut domainModelElement = (PortOut) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getLabel();
		} else {
			EzsequenceDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPortIn_3002Text(View view) {
		PortIn domainModelElement = (PortIn) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getLabel();
		} else {
			EzsequenceDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return SequencerEditPart.MODEL_ID.equals(EzsequenceVisualIDRegistry
				.getModelID(view));
	}

}
