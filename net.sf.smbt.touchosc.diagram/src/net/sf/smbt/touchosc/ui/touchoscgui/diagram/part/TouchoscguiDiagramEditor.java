package net.sf.smbt.touchosc.ui.touchoscgui.diagram.part;

import net.sf.smbt.quantic.agent.DnsSdUtil;
import net.sf.smbt.quantic.services.ISmartDnsServiceManager;
import net.sf.smbt.touchosc.diagram.outline.TouchOscOutlinePage;
import net.sf.smbt.touchosc.diagram.utilities.TouchOscGuiUtilities;
import net.sf.smbt.touchosc.touchosc.TOP;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLayout;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.navigator.TouchoscguiNavigatorItem;
import net.sf.smbt.touchosc.utils.TouchOSCUtils;
import net.sf.smbt.touchosc.utils.TouchOscBonjourSync;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.ui.palette.PaletteViewer;
import org.eclipse.gef.ui.palette.PaletteViewerPreferences;
import org.eclipse.gmf.runtime.common.ui.services.marker.MarkerNavigationService;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.ui.actions.ActionIds;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDiagramDocument;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDocument;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.document.IDocumentProvider;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorMatchingStrategy;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.SaveAsDialog;
import org.eclipse.ui.ide.IGotoMarker;
import org.eclipse.ui.navigator.resources.ProjectExplorer;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.IShowInTargetList;
import org.eclipse.ui.part.ShowInContext;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;

/**
 * @generated NOT
 */
public class TouchoscguiDiagramEditor extends DiagramDocumentEditor implements
		IGotoMarker {

	@Override
	protected int getInitialDockLocation() {
		return PositionConstants.WEST;
	}

	/**
	 * @generated
	 */
	public static final String ID = "net.sf.smbt.touchosc.ui.touchoscgui.diagram.part.TouchoscguiDiagramEditorID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final String CONTEXT_ID = "net.sf.smbt.touchosc.ui.touchoscgui.diagram.ui.diagramContext"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public TouchoscguiDiagramEditor() {
		super(true);
	}

	/**
	 * @generated
	 */
	protected String getContextID() {
		return CONTEXT_ID;
	}

	/**
	 * @generated
	 */
	protected PaletteRoot createPaletteRoot(PaletteRoot existingPaletteRoot) {
		PaletteRoot root = super.createPaletteRoot(existingPaletteRoot);
		new TouchoscguiPaletteFactory().fillPalette(root);
		return root;
	}

	/**
	 * @generated
	 */
	protected PreferencesHint getPreferencesHint() {
		return TouchoscguiDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT;
	}

	/**
	 * @generated
	 */
	public String getContributorId() {
		return TouchoscguiDiagramEditorPlugin.ID;
	}

	/**
	 * @generated NOT
	 */
	@SuppressWarnings("rawtypes")
	public Object getAdapter(Class type) {
		if (type == IShowInTargetList.class) {
			return new IShowInTargetList() {
				public String[] getShowInTargetIds() {
					return new String[] { ProjectExplorer.VIEW_ID };
				}
			};
		}
		if (type == IContentOutlinePage.class) {
			return new TouchOscOutlinePage(this);
		}
		return super.getAdapter(type);
	}

	/**
	 * @generated
	 */
	protected IDocumentProvider getDocumentProvider(IEditorInput input) {
		if (input instanceof IFileEditorInput
				|| input instanceof URIEditorInput) {
			return TouchoscguiDiagramEditorPlugin.getInstance()
					.getDocumentProvider();
		}
		return super.getDocumentProvider(input);
	}

	/**
	 * @generated
	 */
	public TransactionalEditingDomain getEditingDomain() {
		IDocument document = getEditorInput() != null ? getDocumentProvider()
				.getDocument(getEditorInput()) : null;
		if (document instanceof IDiagramDocument) {
			return ((IDiagramDocument) document).getEditingDomain();
		}
		return super.getEditingDomain();
	}

	/**
	 * @generated
	 */
	protected void setDocumentProvider(IEditorInput input) {
		if (input instanceof IFileEditorInput
				|| input instanceof URIEditorInput) {
			setDocumentProvider(TouchoscguiDiagramEditorPlugin.getInstance()
					.getDocumentProvider());
		} else {
			super.setDocumentProvider(input);
		}
	}

	/**
	 * @generated
	 */
	public void gotoMarker(IMarker marker) {
		MarkerNavigationService.getInstance().gotoMarker(this, marker);
	}

	/**
	 * @generated
	 */
	public boolean isSaveAsAllowed() {
		return true;
	}

	/**
	 * @generated
	 */
	public void doSaveAs() {
		performSaveAs(new NullProgressMonitor());
	}

	/**
	 * @generated
	 */
	protected void performSaveAs(IProgressMonitor progressMonitor) {
		Shell shell = getSite().getShell();
		IEditorInput input = getEditorInput();
		SaveAsDialog dialog = new SaveAsDialog(shell);
		IFile original = input instanceof IFileEditorInput ? ((IFileEditorInput) input)
				.getFile() : null;
		if (original != null) {
			dialog.setOriginalFile(original);
		}
		dialog.create();
		IDocumentProvider provider = getDocumentProvider();
		if (provider == null) {
			// editor has been programmatically closed while the dialog was open
			return;
		}
		if (provider.isDeleted(input) && original != null) {
			String message = NLS.bind(
					Messages.TouchoscguiDiagramEditor_SavingDeletedFile,
					original.getName());
			dialog.setErrorMessage(null);
			dialog.setMessage(message, IMessageProvider.WARNING);
		}
		if (dialog.open() == Window.CANCEL) {
			if (progressMonitor != null) {
				progressMonitor.setCanceled(true);
			}
			return;
		}
		IPath filePath = dialog.getResult();
		if (filePath == null) {
			if (progressMonitor != null) {
				progressMonitor.setCanceled(true);
			}
			return;
		}
		IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		IFile file = workspaceRoot.getFile(filePath);
		final IEditorInput newInput = new FileEditorInput(file);
		// Check if the editor is already open
		IEditorMatchingStrategy matchingStrategy = getEditorDescriptor()
				.getEditorMatchingStrategy();
		IEditorReference[] editorRefs = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage()
				.getEditorReferences();
		for (int i = 0; i < editorRefs.length; i++) {
			if (matchingStrategy.matches(editorRefs[i], newInput)) {
				MessageDialog.openWarning(shell,
						Messages.TouchoscguiDiagramEditor_SaveAsErrorTitle,
						Messages.TouchoscguiDiagramEditor_SaveAsErrorMessage);
				return;
			}
		}
		boolean success = false;
		try {
			provider.aboutToChange(newInput);
			getDocumentProvider(newInput).saveDocument(progressMonitor,
					newInput,
					getDocumentProvider().getDocument(getEditorInput()), true);
			success = true;
		} catch (CoreException x) {
			IStatus status = x.getStatus();
			if (status == null || status.getSeverity() != IStatus.CANCEL) {
				ErrorDialog.openError(shell,
						Messages.TouchoscguiDiagramEditor_SaveErrorTitle,
						Messages.TouchoscguiDiagramEditor_SaveErrorMessage,
						x.getStatus());
			}
		} finally {
			provider.changed(newInput);
			if (success) {
				setInput(newInput);
			}
		}
		if (progressMonitor != null) {
			progressMonitor.setCanceled(!success);
		}
	}

	/**
	 * @generated
	 */
	public ShowInContext getShowInContext() {
		return new ShowInContext(getEditorInput(), getNavigatorSelection());
	}

	/**
	 * @generated
	 */
	private ISelection getNavigatorSelection() {
		IDiagramDocument document = getDiagramDocument();
		if (document == null) {
			return StructuredSelection.EMPTY;
		}
		Diagram diagram = document.getDiagram();
		IFile file = WorkspaceSynchronizer.getFile(diagram.eResource());
		if (file != null) {
			TouchoscguiNavigatorItem item = new TouchoscguiNavigatorItem(
					diagram, file, false);
			return new StructuredSelection(item);
		}
		return StructuredSelection.EMPTY;
	}

	/**
	 * @generated
	 */
	protected void configureGraphicalViewer() {
		super.configureGraphicalViewer();
		DiagramEditorContextMenuProvider provider = new DiagramEditorContextMenuProvider(
				this, getDiagramGraphicalViewer());
		getDiagramGraphicalViewer().setContextMenu(provider);
		getSite().registerContextMenu(ActionIds.DIAGRAM_EDITOR_CONTEXT_MENU,
				provider, getDiagramGraphicalViewer());
	}

	@Override
	public void doSave(IProgressMonitor progressMonitor) {
		IEditingDomainProvider domainProvider = (IEditingDomainProvider) getAdapter(IEditingDomainProvider.class);
		URI uri = domainProvider.getEditingDomain().getResourceSet()
				.getResources().get(0).getURI();
		
		
		String dirname = ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString() + uri.trimSegments(1).toPlatformString(true);
		String filename = uri.lastSegment().replace(".tui", "");
		
		// make de facto candidate for ipad sync
//		ISmartDnsServiceManager dnsService = DnsSdUtil.INSTANCE.getDnsServicesMap().get(TouchOscBonjourSync.ID);
//		if (dnsService instanceof TouchOscBonjourSync) {
//			TouchOscBonjourSync sync = (TouchOscBonjourSync) dnsService;
//			sync.setCurrentTouchOscFileToSync(dirname + "/" + filename);
//		}
		 
		EObject elem = getDiagram().getElement();

		String mode = ((TouchOscLayout) elem).getMode();
		String orientation = ((TouchOscLayout) elem).getOrientation();

		int w = "1".equals(mode) ? 1024 : 480;
		int h = "1".equals(mode) ? 768 : 320;

		int newW = "vertical".equals(orientation) ? h : w;
		int newH = "vertical".equals(orientation) ? w : h;

		Dimension dim = new Dimension(newW, newH);

		TOP top = TouchOscGuiUtilities.INSTANCE.createTouchOSCFromGUICanonical(
				dim, orientation, mode, ((TouchOscLayout) elem).getTabs());

		top.getLayout().setMode(((TouchOscLayout) elem).getMode());
		top.getLayout().setOrientation(
							"vertical".equals(((TouchOscLayout) elem)
									.getOrientation()) ? "horizontal"
									: "vertical"
		);
		
		TouchOSCUtils.INSTANCE.dumpTouchOsc(top, dirname, filename);
		
		super.doSave(progressMonitor);
		try {
			ResourcesPlugin
					.getWorkspace()
					.getRoot()
					.refreshLocal(IResource.DEPTH_INFINITE,
							new NullProgressMonitor());
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	private void forceColor(IFigure fig, Color color) {
		if (fig != null) {
			fig.setBackgroundColor(color);
			fig.setForegroundColor(color);
			for (Object f : fig.getChildren()) {
				forceColor((IFigure) f, color);
			}
		}
	}

	private void forceColor(EditPart ep, Color color) {
		if (ep instanceof GraphicalEditPart) {
			forceColor(((GraphicalEditPart) ep).getFigure(), color);
			for (Object part : ((GraphicalEditPart) ep).getChildren()) {
				forceColor((EditPart) part, color);
			}
		}
	}

	@Override
	protected void createGraphicalViewer(Composite parent) {
		super.createGraphicalViewer(parent);
		Object obj = getAdapter(PaletteViewer.class);
		if (obj instanceof PaletteViewer) {
			PaletteViewer paletteViewer = (PaletteViewer) obj;
			paletteViewer.getPaletteViewerPreferences().setAutoCollapseSetting(
					PaletteViewerPreferences.COLLAPSE_ALWAYS);
			paletteViewer.getPaletteViewerPreferences().setLayoutSetting(
					PaletteViewerPreferences.LAYOUT_COLUMNS);
			EditPart ep = paletteViewer.getContents();
			forceColor(ep, ColorConstants.black);
		}
	}

}
