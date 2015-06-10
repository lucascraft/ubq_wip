package net.sf.smbt.touchosc.ui.touchoscgui.diagram.part;

import net.sf.smbt.touchosc.diagram.utilities.TouchOscGuiUtilities;
import net.sf.smbt.touchosc.touchoscapp.TouchOscApp;
import net.sf.smbt.touchosc.ui.touchoscgui.TOP;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.parts.TouchOscLayoutEditPart;
import net.sf.smbt.touchosc.utils.TouchOSCUtils;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

/**
 * @generated NOT
 */
public class TouchoscguiInitDiagramFileAction implements IObjectActionDelegate {

	/**
	 * @generated
	 */
	private IWorkbenchPart targetPart;

	/**
	 * @generated
	 */
	private URI domainModelURI;

	private String path;

	/**
	 * @generated
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		this.targetPart = targetPart;
	}

	/**
	 * @generated
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		domainModelURI = null;
		action.setEnabled(false);
		if (selection instanceof IStructuredSelection == false
				|| selection.isEmpty()) {
			return;
		}
		IFile file = (IFile) ((IStructuredSelection) selection)
				.getFirstElement();
		domainModelURI = URI.createFileURI(file.getFullPath().toString());
		path = file.getLocation().toOSString();
		action.setEnabled(true);
	}

	/**
	 * @generated
	 */
	private Shell getShell() {
		return targetPart.getSite().getShell();
	}

	/**
	 * @generated NOT
	 */
	public void run(IAction action) {

		TouchOscApp app = TouchOSCUtils.INSTANCE.loadAppFromTouchOscXML(path);
		
		TOP top = TouchOscGuiUtilities.INSTANCE
				.createGUICanonicalFromTouchOscApp(app);

		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		ResourceSet resourceSet = new ResourceSetImpl();
		EObject diagramRoot = null;
		try {
			Resource resource = resourceSet.createResource(domainModelURI
					.appendFileExtension("tui"));
			resource.getContents().add(diagramRoot = top.getLayouts());
		} catch (WrappedException ex) {
			TouchoscguiDiagramEditorPlugin.getInstance().logError(
					"Unable to load resource: " + domainModelURI, ex); //$NON-NLS-1$
		}
		if (diagramRoot == null) {
			MessageDialog.openError(getShell(),
					Messages.InitDiagramFile_ResourceErrorDialogTitle,
					Messages.InitDiagramFile_ResourceErrorDialogMessage);
			return;
		}
		Wizard wizard = new TouchoscguiNewDiagramFileWizard(domainModelURI,
				diagramRoot, editingDomain);
		wizard.setWindowTitle(NLS.bind(Messages.InitDiagramFile_WizardTitle,
				TouchOscLayoutEditPart.MODEL_ID));
		TouchoscguiDiagramEditorUtil.runWizard(getShell(), wizard,
				"InitDiagramFile"); //$NON-NLS-1$
	}
}
