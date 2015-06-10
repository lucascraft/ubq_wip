package net.sf.smbt.ui.touchosc.actions;

import net.sf.smbt.ezmojo.EZMojoKind;
import net.sf.smbt.osc.ezmojo.utils.EzMojoCmdUtils;
import net.sf.smbt.osccmd.OscCmd;
import net.sf.smbt.quantic.warp.QuanticMojo;
import net.sf.smbt.touchosc.touchoscapp.TouchOscApp;
import net.sf.smbt.touchosc.utils.TouchOSCUtils;
import net.sf.smbt.ui.touchosc.ez.EzTouchOscUtils;
import net.sf.xqz.model.engine.CmdPipe;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

/**
 * Our sample action implements workbench action delegate.
 * The action proxy will be created by the workbench and
 * shown in the UI. When the user tries to use the action,
 * this delegate will be created and execution will be 
 * delegated to it.
 * @see IWorkbenchWindowActionDelegate
 */
public class ImportTouchOscConfigAction extends Action implements IWorkbenchWindowActionDelegate {
	@SuppressWarnings("unused")
	private IWorkbenchWindow window;
	/**
	 * The constructor.
	 */
	public ImportTouchOscConfigAction() {
	}

	@Override
	public void run() {
		FileDialog fileSelectionDialog = new FileDialog(Display.getDefault().getActiveShell());
		String touchoscFilePath = fileSelectionDialog.open();
		if (touchoscFilePath != null && !touchoscFilePath.equals("")) {
			TouchOscApp touchOscApp = TouchOSCUtils.INSTANCE.loadAppFromTouchOscXML(touchoscFilePath);
			CmdPipe ezMojoAgentEngine = QuanticMojo.INSTANCE.openUdpPipe(
				"ezmojo", 
				"localhost:4443", 
				new int[]{ 4445 }
			);
			ezMojoAgentEngine.setLocked(true);
			for (OscCmd cmd : EzTouchOscUtils.INSTANCE.dumpTouchOscCfgAsOSC(touchOscApp)) {
				if (ezMojoAgentEngine != null) {
					ezMojoAgentEngine.send(
						EzMojoCmdUtils.INSTANCE.createEZMojoCmd(EZMojoKind.SET, cmd)
					);
				}
			}
		}
	}
	
	/**
	 * The action has been activated. The argument of the
	 * method represents the 'real' action sitting
	 * in the workbench UI.
	 * @see IWorkbenchWindowActionDelegate#run
	 */
	public void run(IAction action) {
		run();
	}

	/**
	 * Selection in the workbench has been changed. We 
	 * can change the state of the 'real' action here
	 * if we want, but this can only happen after 
	 * the delegate has been created.
	 * @see IWorkbenchWindowActionDelegate#selectionChanged
	 */
	public void selectionChanged(IAction action, ISelection selection) {
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
		this.window = window;
	}
}