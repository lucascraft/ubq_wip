package net.sf.smbt.ezsequence.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

import net.sf.smbt.ezsequence.diagram.edit.parts.EventTriggerEditPart;
import net.sf.smbt.ezsequence.diagram.edit.parts.PortInEditPart;
import net.sf.smbt.ezsequence.diagram.edit.parts.PortOutEditPart;
import net.sf.smbt.ezsequence.diagram.edit.parts.SequencerEditPart;
import net.sf.smbt.ezsequence.diagram.edit.parts.TimeBoxEditPart;
import net.sf.smbt.ezsequence.diagram.edit.parts.TimeBoxTimedEventsEditPart;
import net.sf.smbt.ezsequence.diagram.edit.parts.TimeCursorEditPart;
import net.sf.smbt.ezsequence.diagram.edit.parts.TimeLineEditPart;
import net.sf.smbt.ezsequence.diagram.edit.parts.TimedEventEditPart;
import net.sf.smbt.ezsequence.diagram.edit.parts.TimedLinkEditPart;
import net.sf.smbt.ezsequence.diagram.part.EzsequenceVisualIDRegistry;
import net.sf.smbt.ezsequence.diagram.part.Messages;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

/**
 * @generated
 */
public class EzsequenceNavigatorContentProvider implements
		ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public EzsequenceNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
				new WorkspaceSynchronizer.Delegate() {
					public void dispose() {
					}

					public boolean handleResourceChanged(final Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceDeleted(Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceMoved(Resource resource,
							final URI newURI) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}
				});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet()
				.getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay()
					.asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
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
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(
					fileURI, true);
			ArrayList<EzsequenceNavigatorItem> result = new ArrayList<EzsequenceNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(topViews, SequencerEditPart.MODEL_ID),
					file, false));
			return result.toArray();
		}

		if (parentElement instanceof EzsequenceNavigatorGroup) {
			EzsequenceNavigatorGroup group = (EzsequenceNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof EzsequenceNavigatorItem) {
			EzsequenceNavigatorItem navigatorItem = (EzsequenceNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (EzsequenceVisualIDRegistry.getVisualID(view)) {

		case EventTriggerEditPart.VISUAL_ID: {
			LinkedList<EzsequenceAbstractNavigatorItem> result = new LinkedList<EzsequenceAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			EzsequenceNavigatorGroup target = new EzsequenceNavigatorGroup(
					Messages.NavigatorGroupName_EventTrigger_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EzsequenceNavigatorGroup source = new EzsequenceNavigatorGroup(
					Messages.NavigatorGroupName_EventTrigger_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EzsequenceVisualIDRegistry
							.getType(TimedEventEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EzsequenceVisualIDRegistry
							.getType(TimedEventEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case SequencerEditPart.VISUAL_ID: {
			LinkedList<EzsequenceAbstractNavigatorItem> result = new LinkedList<EzsequenceAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			EzsequenceNavigatorGroup links = new EzsequenceNavigatorGroup(
					Messages.NavigatorGroupName_Sequencer_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EzsequenceVisualIDRegistry
							.getType(TimeBoxEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EzsequenceVisualIDRegistry
							.getType(TimeLineEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EzsequenceVisualIDRegistry
							.getType(TimeCursorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					EzsequenceVisualIDRegistry
							.getType(TimedLinkEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					EzsequenceVisualIDRegistry
							.getType(EventTriggerEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case TimedEventEditPart.VISUAL_ID: {
			LinkedList<EzsequenceAbstractNavigatorItem> result = new LinkedList<EzsequenceAbstractNavigatorItem>();
			Node sv = (Node) view;
			EzsequenceNavigatorGroup incominglinks = new EzsequenceNavigatorGroup(
					Messages.NavigatorGroupName_TimedEvent_3001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EzsequenceNavigatorGroup outgoinglinks = new EzsequenceNavigatorGroup(
					Messages.NavigatorGroupName_TimedEvent_3001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EzsequenceVisualIDRegistry
							.getType(EventTriggerEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EzsequenceVisualIDRegistry
							.getType(EventTriggerEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PortOutEditPart.VISUAL_ID: {
			LinkedList<EzsequenceAbstractNavigatorItem> result = new LinkedList<EzsequenceAbstractNavigatorItem>();
			Node sv = (Node) view;
			EzsequenceNavigatorGroup incominglinks = new EzsequenceNavigatorGroup(
					Messages.NavigatorGroupName_PortOut_3003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EzsequenceNavigatorGroup outgoinglinks = new EzsequenceNavigatorGroup(
					Messages.NavigatorGroupName_PortOut_3003_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EzsequenceVisualIDRegistry
							.getType(TimedLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EzsequenceVisualIDRegistry
							.getType(TimedLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case TimedLinkEditPart.VISUAL_ID: {
			LinkedList<EzsequenceAbstractNavigatorItem> result = new LinkedList<EzsequenceAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			EzsequenceNavigatorGroup target = new EzsequenceNavigatorGroup(
					Messages.NavigatorGroupName_TimedLink_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EzsequenceNavigatorGroup source = new EzsequenceNavigatorGroup(
					Messages.NavigatorGroupName_TimedLink_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EzsequenceVisualIDRegistry
							.getType(PortInEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					EzsequenceVisualIDRegistry
							.getType(PortOutEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EzsequenceVisualIDRegistry
							.getType(PortInEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					EzsequenceVisualIDRegistry
							.getType(PortOutEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case PortInEditPart.VISUAL_ID: {
			LinkedList<EzsequenceAbstractNavigatorItem> result = new LinkedList<EzsequenceAbstractNavigatorItem>();
			Node sv = (Node) view;
			EzsequenceNavigatorGroup incominglinks = new EzsequenceNavigatorGroup(
					Messages.NavigatorGroupName_PortIn_3002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			EzsequenceNavigatorGroup outgoinglinks = new EzsequenceNavigatorGroup(
					Messages.NavigatorGroupName_PortIn_3002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					EzsequenceVisualIDRegistry
							.getType(TimedLinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					EzsequenceVisualIDRegistry
							.getType(TimedLinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case TimeBoxEditPart.VISUAL_ID: {
			LinkedList<EzsequenceAbstractNavigatorItem> result = new LinkedList<EzsequenceAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EzsequenceVisualIDRegistry
							.getType(TimeBoxTimedEventsEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					EzsequenceVisualIDRegistry
							.getType(TimedEventEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EzsequenceVisualIDRegistry
							.getType(PortInEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					EzsequenceVisualIDRegistry
							.getType(PortOutEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType())
					&& isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(
			Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views,
			String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return SequencerEditPart.MODEL_ID.equals(EzsequenceVisualIDRegistry
				.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<EzsequenceNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<EzsequenceNavigatorItem> result = new ArrayList<EzsequenceNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new EzsequenceNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof EzsequenceAbstractNavigatorItem) {
			EzsequenceAbstractNavigatorItem abstractNavigatorItem = (EzsequenceAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
