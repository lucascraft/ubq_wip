package net.sf.smbt.jzmui.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

import net.sf.smbt.jzmui.diagram.edit.parts.JZBreakPoint2EditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZBreakPointEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZContainer2EditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZContainerEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZCustomButton2EditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZCustomButtonEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZFader2EditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZFaderEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZGesture2EditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZGestureEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZJazzInterface2EditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZJazzInterfaceEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZJazzInterfaceJZJazzInterfaceCompartmentEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZKnob2EditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZKnobEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZLed2EditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZLedEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZLemurMenu2EditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZLemurMenuEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZLemurMonitor2EditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZLemurMonitorEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZMultiBalls2EditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZMultiBallsEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZPads2EditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZPadsEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZRange2EditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZRangeEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZRingArea2EditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZRingAreaEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZSignalScope2EditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZSignalScopeEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZSurfaceLCD2EditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZSurfaceLCDEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZSwitches2EditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZSwitchesEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZText2EditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZTextEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZTrack2EditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZTrackEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZmultiSlider2EditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZmultiSliderEditPart;
import net.sf.smbt.jzmui.diagram.part.JzmuiVisualIDRegistry;

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
public class JzmuiNavigatorContentProvider implements ICommonContentProvider {

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
	public JzmuiNavigatorContentProvider() {
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
			ArrayList<JzmuiNavigatorItem> result = new ArrayList<JzmuiNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(topViews,
							JZJazzInterfaceEditPart.MODEL_ID), file, false));
			return result.toArray();
		}

		if (parentElement instanceof JzmuiNavigatorGroup) {
			JzmuiNavigatorGroup group = (JzmuiNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof JzmuiNavigatorItem) {
			JzmuiNavigatorItem navigatorItem = (JzmuiNavigatorItem) parentElement;
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
		switch (JzmuiVisualIDRegistry.getVisualID(view)) {

		case JZJazzInterfaceEditPart.VISUAL_ID: {
			LinkedList<JzmuiAbstractNavigatorItem> result = new LinkedList<JzmuiAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					JzmuiVisualIDRegistry
							.getType(JZJazzInterface2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case JZJazzInterface2EditPart.VISUAL_ID: {
			LinkedList<JzmuiAbstractNavigatorItem> result = new LinkedList<JzmuiAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					JzmuiVisualIDRegistry
							.getType(JZJazzInterfaceJZJazzInterfaceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					JzmuiVisualIDRegistry
							.getType(JZBreakPointEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					JzmuiVisualIDRegistry
							.getType(JZJazzInterfaceJZJazzInterfaceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					JzmuiVisualIDRegistry
							.getType(JZContainerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					JzmuiVisualIDRegistry
							.getType(JZJazzInterfaceJZJazzInterfaceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					JzmuiVisualIDRegistry
							.getType(JZCustomButton2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					JzmuiVisualIDRegistry
							.getType(JZJazzInterfaceJZJazzInterfaceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					JzmuiVisualIDRegistry.getType(JZFader2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					JzmuiVisualIDRegistry
							.getType(JZJazzInterfaceJZJazzInterfaceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					JzmuiVisualIDRegistry.getType(JZGesture2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					JzmuiVisualIDRegistry
							.getType(JZJazzInterfaceJZJazzInterfaceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					JzmuiVisualIDRegistry.getType(JZKnob2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					JzmuiVisualIDRegistry
							.getType(JZJazzInterfaceJZJazzInterfaceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					JzmuiVisualIDRegistry.getType(JZLed2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					JzmuiVisualIDRegistry
							.getType(JZJazzInterfaceJZJazzInterfaceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					JzmuiVisualIDRegistry
							.getType(JZLemurMenu2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					JzmuiVisualIDRegistry
							.getType(JZJazzInterfaceJZJazzInterfaceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					JzmuiVisualIDRegistry
							.getType(JZLemurMonitor2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					JzmuiVisualIDRegistry
							.getType(JZJazzInterfaceJZJazzInterfaceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					JzmuiVisualIDRegistry
							.getType(JZMultiBalls2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					JzmuiVisualIDRegistry
							.getType(JZJazzInterfaceJZJazzInterfaceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					JzmuiVisualIDRegistry
							.getType(JZmultiSlider2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					JzmuiVisualIDRegistry
							.getType(JZJazzInterfaceJZJazzInterfaceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					JzmuiVisualIDRegistry.getType(JZPads2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					JzmuiVisualIDRegistry
							.getType(JZJazzInterfaceJZJazzInterfaceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					JzmuiVisualIDRegistry.getType(JZRange2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					JzmuiVisualIDRegistry
							.getType(JZJazzInterfaceJZJazzInterfaceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					JzmuiVisualIDRegistry
							.getType(JZRingArea2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					JzmuiVisualIDRegistry
							.getType(JZJazzInterfaceJZJazzInterfaceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					JzmuiVisualIDRegistry
							.getType(JZSignalScope2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					JzmuiVisualIDRegistry
							.getType(JZJazzInterfaceJZJazzInterfaceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					JzmuiVisualIDRegistry
							.getType(JZSurfaceLCD2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					JzmuiVisualIDRegistry
							.getType(JZJazzInterfaceJZJazzInterfaceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					JzmuiVisualIDRegistry
							.getType(JZSwitches2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					JzmuiVisualIDRegistry
							.getType(JZJazzInterfaceJZJazzInterfaceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					JzmuiVisualIDRegistry.getType(JZText2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					JzmuiVisualIDRegistry
							.getType(JZJazzInterfaceJZJazzInterfaceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					JzmuiVisualIDRegistry.getType(JZTrack2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case JZContainerEditPart.VISUAL_ID: {
			LinkedList<JzmuiAbstractNavigatorItem> result = new LinkedList<JzmuiAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					JzmuiVisualIDRegistry
							.getType(JZBreakPoint2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					JzmuiVisualIDRegistry
							.getType(JZContainer2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					JzmuiVisualIDRegistry
							.getType(JZCustomButtonEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					JzmuiVisualIDRegistry.getType(JZFaderEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					JzmuiVisualIDRegistry.getType(JZGestureEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					JzmuiVisualIDRegistry.getType(JZKnobEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					JzmuiVisualIDRegistry.getType(JZLedEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					JzmuiVisualIDRegistry
							.getType(JZLemurMenuEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					JzmuiVisualIDRegistry
							.getType(JZLemurMonitorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					JzmuiVisualIDRegistry
							.getType(JZMultiBallsEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					JzmuiVisualIDRegistry.getType(JZPadsEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					JzmuiVisualIDRegistry.getType(JZRangeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					JzmuiVisualIDRegistry.getType(JZRingAreaEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					JzmuiVisualIDRegistry
							.getType(JZSignalScopeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					JzmuiVisualIDRegistry
							.getType(JZSurfaceLCDEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					JzmuiVisualIDRegistry.getType(JZSwitchesEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					JzmuiVisualIDRegistry.getType(JZTextEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					JzmuiVisualIDRegistry.getType(JZTrackEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					JzmuiVisualIDRegistry
							.getType(JZmultiSliderEditPart.VISUAL_ID));
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
		return JZJazzInterfaceEditPart.MODEL_ID.equals(JzmuiVisualIDRegistry
				.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<JzmuiNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<JzmuiNavigatorItem> result = new ArrayList<JzmuiNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new JzmuiNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof JzmuiAbstractNavigatorItem) {
			JzmuiAbstractNavigatorItem abstractNavigatorItem = (JzmuiAbstractNavigatorItem) element;
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
