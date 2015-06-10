package net.sf.smbt.ezsequence.diagram.providers;

import net.sf.smbt.ezsequence.EzsequenceFactory;
import net.sf.smbt.ezsequence.EzsequencePackage;
import net.sf.smbt.ezsequence.PortIn;
import net.sf.smbt.ezsequence.PortOut;
import net.sf.smbt.ezsequence.TimeBox;
import net.sf.smbt.ezsequence.TimedEvent;
import net.sf.smbt.ezsequence.diagram.expressions.EzsequenceOCLFactory;
import net.sf.smbt.ezsequence.diagram.part.EzsequenceDiagramEditorPlugin;
import net.sf.xqz.model.cmd.CmdFactory;
import net.sf.xqz.model.cmd.CmdPackage;
import net.sf.xqz.model.cmd.XCmd;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public void init_TimeBox_2001(TimeBox instance) {
		try {
			PortIn newInstance_0_0 = EzsequenceFactory.eINSTANCE.createPortIn();
			instance.setIn(newInstance_0_0);
			Object value_0_0_0 = EzsequenceOCLFactory.getExpression(0,
					EzsequencePackage.eINSTANCE.getPortIn(), null).evaluate(
					newInstance_0_0);
			newInstance_0_0.setLabel((String) value_0_0_0);

			PortOut newInstance_1_0 = EzsequenceFactory.eINSTANCE
					.createPortOut();
			instance.setOut(newInstance_1_0);
			Object value_1_0_0 = EzsequenceOCLFactory.getExpression(1,
					EzsequencePackage.eINSTANCE.getPortOut(), null).evaluate(
					newInstance_1_0);
			newInstance_1_0.setLabel((String) value_1_0_0);

		} catch (RuntimeException e) {
			EzsequenceDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_TimedEvent_3001(TimedEvent instance) {
		try {
			XCmd newInstance_0_0 = CmdFactory.eINSTANCE.createXCmd();
			instance.getCommand().add(newInstance_0_0);
			Object value_0_0_0 = EzsequenceOCLFactory.getExpression(2,
					CmdPackage.eINSTANCE.getXCmd(), null).evaluate(
					newInstance_0_0);
		//	newInstance_0_0.setId((String) value_0_0_0);

		} catch (RuntimeException e) {
			EzsequenceDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = EzsequenceDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			EzsequenceDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
