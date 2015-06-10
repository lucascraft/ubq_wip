package net.sf.smbt.ui.lemur.actions;

import java.util.HashMap;
import java.util.Map;

import net.sf.smbt.jazzmutant.utils.JzmlUtils;
import net.sf.smbt.jzmui.LemurLiveApp;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.eclipse.xpand2.XpandExecutionContext;
import org.eclipse.xpand2.XpandExecutionContextImpl;
import org.eclipse.xpand2.XpandFacade;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xpand2.output.OutputImpl;
import org.eclipse.xtend.expression.Variable;
import org.eclipse.xtend.type.impl.java.JavaBeansMetaModel;

/**
 * Our sample action implements workbench action delegate.
 * The action proxy will be created by the workbench and
 * shown in the UI. When the user tries to use the action,
 * this delegate will be created and execution will be 
 * delegated to it.
 * @see IWorkbenchWindowActionDelegate
 */
public class GenerateUIFromJzml implements IWorkbenchWindowActionDelegate {
	//private IWorkbenchWindow window;
	private String jzmlFilePath;
	
	public final static String JZML2UBQT = "JAZZMUTANT_PLUGIN";
	
	/**
	 * The constructor.
	 */
	public GenerateUIFromJzml() {
	}

	/**
	 * The action has been activated. The argument of the
	 * method represents the 'real' action sitting
	 * in the workbench UI.
	 * @see IWorkbenchWindowActionDelegate#run
	 */
	public void run(IAction action) {
		LemurLiveApp lemurLiveApp = JzmlUtils.INSTANCE.loadLemurLiveAppFromXML(jzmlFilePath);
		
		XpandFacade facade = XpandFacade.create(createExecutionContext());
		
		facade.evaluate(JZML2UBQT, lemurLiveApp);
	}

	private XpandExecutionContext createExecutionContext() {
		// configure outlets
		OutputImpl output = new OutputImpl();

		output.addOutlet(new Outlet(false, "UTF-8", JZML2UBQT, false, URI.createPlatformPluginURI("/net.sf.smbt.jazzmutant/src/template/jzmui2ubqt.xpt", false).toFileString()));
		Map<String,Variable> globalVars = new HashMap<String,Variable>();
		
		// create execution context
		XpandExecutionContextImpl execCtx = new XpandExecutionContextImpl(output, null,globalVars,null,null);
		//since our templates are all encoded in ISO-8859-1, we have to fix it here.
		execCtx.getResourceManager().setFileEncoding("ISO-8859-1");
		
		execCtx.registerMetaModel(new JavaBeansMetaModel());
		// add default value for 'modelPluginID' for generated GenModel required
		// for further .edit/.editor generation
		execCtx = (XpandExecutionContextImpl) execCtx.cloneContext();
		return execCtx;
	}

	/**
	 * Selection in the workbench has been changed. We 
	 * can change the state of the 'real' action here
	 * if we want, but this can only happen after 
	 * the delegate has been created.
	 * @see IWorkbenchWindowActionDelegate#selectionChanged
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			Object obj = ((IStructuredSelection)selection).getFirstElement();
			if (obj instanceof IFile) {
				if (((IFile)obj).getFileExtension().equals("jzml")) {
					jzmlFilePath = ((IFile)obj).getRawLocation().toOSString();
					action.setEnabled(true);
					return;
				}
			}
		}
		action.setEnabled(false);
	}

	/**
	 * We can use this method to dispose of any system
	 * resources we previously allocated.
	 * @see IWorkbenchWindowActionDelegate#dispose
	 */
	public void dispose() {
	}

	/**
	 * We will cache window object in order to
	 * be able to provide parent shell for the message dialog.
	 * @see IWorkbenchWindowActionDelegate#init
	 */
	public void init(IWorkbenchWindow window) {
		//this.window = window;
	}
}