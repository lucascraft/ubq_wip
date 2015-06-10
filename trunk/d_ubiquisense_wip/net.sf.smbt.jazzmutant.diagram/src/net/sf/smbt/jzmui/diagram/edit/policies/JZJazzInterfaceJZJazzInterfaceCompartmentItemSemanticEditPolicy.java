package net.sf.smbt.jzmui.diagram.edit.policies;

import net.sf.smbt.jzmui.diagram.edit.commands.JZBreakPointCreateCommand;
import net.sf.smbt.jzmui.diagram.edit.commands.JZContainerCreateCommand;
import net.sf.smbt.jzmui.diagram.edit.commands.JZCustomButton2CreateCommand;
import net.sf.smbt.jzmui.diagram.edit.commands.JZFader2CreateCommand;
import net.sf.smbt.jzmui.diagram.edit.commands.JZGesture2CreateCommand;
import net.sf.smbt.jzmui.diagram.edit.commands.JZKnob2CreateCommand;
import net.sf.smbt.jzmui.diagram.edit.commands.JZLed2CreateCommand;
import net.sf.smbt.jzmui.diagram.edit.commands.JZLemurMenu2CreateCommand;
import net.sf.smbt.jzmui.diagram.edit.commands.JZLemurMonitor2CreateCommand;
import net.sf.smbt.jzmui.diagram.edit.commands.JZMultiBalls2CreateCommand;
import net.sf.smbt.jzmui.diagram.edit.commands.JZPads2CreateCommand;
import net.sf.smbt.jzmui.diagram.edit.commands.JZRange2CreateCommand;
import net.sf.smbt.jzmui.diagram.edit.commands.JZRingArea2CreateCommand;
import net.sf.smbt.jzmui.diagram.edit.commands.JZSignalScope2CreateCommand;
import net.sf.smbt.jzmui.diagram.edit.commands.JZSurfaceLCD2CreateCommand;
import net.sf.smbt.jzmui.diagram.edit.commands.JZSwitches2CreateCommand;
import net.sf.smbt.jzmui.diagram.edit.commands.JZText2CreateCommand;
import net.sf.smbt.jzmui.diagram.edit.commands.JZTrack2CreateCommand;
import net.sf.smbt.jzmui.diagram.edit.commands.JZmultiSlider2CreateCommand;
import net.sf.smbt.jzmui.diagram.providers.JzmuiElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class JZJazzInterfaceJZJazzInterfaceCompartmentItemSemanticEditPolicy
		extends JzmuiBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public JZJazzInterfaceJZJazzInterfaceCompartmentItemSemanticEditPolicy() {
		super(JzmuiElementTypes.JZJazzInterface_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (JzmuiElementTypes.JZBreakPoint_3001 == req.getElementType()) {
			return getGEFWrapper(new JZBreakPointCreateCommand(req));
		}
		if (JzmuiElementTypes.JZContainer_3002 == req.getElementType()) {
			return getGEFWrapper(new JZContainerCreateCommand(req));
		}
		if (JzmuiElementTypes.JZCustomButton_3022 == req.getElementType()) {
			return getGEFWrapper(new JZCustomButton2CreateCommand(req));
		}
		if (JzmuiElementTypes.JZFader_3023 == req.getElementType()) {
			return getGEFWrapper(new JZFader2CreateCommand(req));
		}
		if (JzmuiElementTypes.JZGesture_3024 == req.getElementType()) {
			return getGEFWrapper(new JZGesture2CreateCommand(req));
		}
		if (JzmuiElementTypes.JZKnob_3025 == req.getElementType()) {
			return getGEFWrapper(new JZKnob2CreateCommand(req));
		}
		if (JzmuiElementTypes.JZLed_3026 == req.getElementType()) {
			return getGEFWrapper(new JZLed2CreateCommand(req));
		}
		if (JzmuiElementTypes.JZLemurMenu_3027 == req.getElementType()) {
			return getGEFWrapper(new JZLemurMenu2CreateCommand(req));
		}
		if (JzmuiElementTypes.JZLemurMonitor_3028 == req.getElementType()) {
			return getGEFWrapper(new JZLemurMonitor2CreateCommand(req));
		}
		if (JzmuiElementTypes.JZMultiBalls_3029 == req.getElementType()) {
			return getGEFWrapper(new JZMultiBalls2CreateCommand(req));
		}
		if (JzmuiElementTypes.JZmultiSlider_3030 == req.getElementType()) {
			return getGEFWrapper(new JZmultiSlider2CreateCommand(req));
		}
		if (JzmuiElementTypes.JZPads_3031 == req.getElementType()) {
			return getGEFWrapper(new JZPads2CreateCommand(req));
		}
		if (JzmuiElementTypes.JZRange_3032 == req.getElementType()) {
			return getGEFWrapper(new JZRange2CreateCommand(req));
		}
		if (JzmuiElementTypes.JZRingArea_3033 == req.getElementType()) {
			return getGEFWrapper(new JZRingArea2CreateCommand(req));
		}
		if (JzmuiElementTypes.JZSignalScope_3034 == req.getElementType()) {
			return getGEFWrapper(new JZSignalScope2CreateCommand(req));
		}
		if (JzmuiElementTypes.JZSurfaceLCD_3035 == req.getElementType()) {
			return getGEFWrapper(new JZSurfaceLCD2CreateCommand(req));
		}
		if (JzmuiElementTypes.JZSwitches_3036 == req.getElementType()) {
			return getGEFWrapper(new JZSwitches2CreateCommand(req));
		}
		if (JzmuiElementTypes.JZText_3037 == req.getElementType()) {
			return getGEFWrapper(new JZText2CreateCommand(req));
		}
		if (JzmuiElementTypes.JZTrack_3038 == req.getElementType()) {
			return getGEFWrapper(new JZTrack2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
