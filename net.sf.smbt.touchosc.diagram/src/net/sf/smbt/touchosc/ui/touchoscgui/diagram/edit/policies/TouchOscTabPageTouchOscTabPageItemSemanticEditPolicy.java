package net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.policies;

import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.commands.TouchOscBatteryHCreateCommand;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.commands.TouchOscBatteryVCreateCommand;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.commands.TouchOscEncoderCreateCommand;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.commands.TouchOscFaderHCreateCommand;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.commands.TouchOscFaderVCreateCommand;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.commands.TouchOscLEDCreateCommand;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.commands.TouchOscLabelHCreateCommand;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.commands.TouchOscLabelVCreateCommand;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.commands.TouchOscMultiFaderHCreateCommand;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.commands.TouchOscMultiFaderVCreateCommand;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.commands.TouchOscMultiPushCreateCommand;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.commands.TouchOscMultiToggleCreateCommand;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.commands.TouchOscPushCreateCommand;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.commands.TouchOscRotaryHCreateCommand;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.commands.TouchOscRotaryVCreateCommand;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.commands.TouchOscTimeHCreateCommand;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.commands.TouchOscTimeVCreateCommand;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.commands.TouchOscToggleCreateCommand;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.commands.TouchOscXYPadCreateCommand;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.providers.TouchoscguiElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class TouchOscTabPageTouchOscTabPageItemSemanticEditPolicy extends
		TouchoscguiBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public TouchOscTabPageTouchOscTabPageItemSemanticEditPolicy() {
		super(TouchoscguiElementTypes.TouchOscTabPage_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (TouchoscguiElementTypes.TouchOscFaderH_3001 == req.getElementType()) {
			return getGEFWrapper(new TouchOscFaderHCreateCommand(req));
		}
		if (TouchoscguiElementTypes.TouchOscFaderV_3002 == req.getElementType()) {
			return getGEFWrapper(new TouchOscFaderVCreateCommand(req));
		}
		if (TouchoscguiElementTypes.TouchOscLabelH_3003 == req.getElementType()) {
			return getGEFWrapper(new TouchOscLabelHCreateCommand(req));
		}
		if (TouchoscguiElementTypes.TouchOscLabelV_3004 == req.getElementType()) {
			return getGEFWrapper(new TouchOscLabelVCreateCommand(req));
		}
		if (TouchoscguiElementTypes.TouchOscLED_3005 == req.getElementType()) {
			return getGEFWrapper(new TouchOscLEDCreateCommand(req));
		}
		if (TouchoscguiElementTypes.TouchOscMultiToggle_3006 == req
				.getElementType()) {
			return getGEFWrapper(new TouchOscMultiToggleCreateCommand(req));
		}
		if (TouchoscguiElementTypes.TouchOscPush_3007 == req.getElementType()) {
			return getGEFWrapper(new TouchOscPushCreateCommand(req));
		}
		if (TouchoscguiElementTypes.TouchOscRotaryH_3008 == req
				.getElementType()) {
			return getGEFWrapper(new TouchOscRotaryHCreateCommand(req));
		}
		if (TouchoscguiElementTypes.TouchOscRotaryV_3009 == req
				.getElementType()) {
			return getGEFWrapper(new TouchOscRotaryVCreateCommand(req));
		}
		if (TouchoscguiElementTypes.TouchOscXYPad_3010 == req.getElementType()) {
			return getGEFWrapper(new TouchOscXYPadCreateCommand(req));
		}
		if (TouchoscguiElementTypes.TouchOscToggle_3011 == req.getElementType()) {
			return getGEFWrapper(new TouchOscToggleCreateCommand(req));
		}
		if (TouchoscguiElementTypes.TouchOscTimeH_3012 == req.getElementType()) {
			return getGEFWrapper(new TouchOscTimeHCreateCommand(req));
		}
		if (TouchoscguiElementTypes.TouchOscTimeV_3013 == req.getElementType()) {
			return getGEFWrapper(new TouchOscTimeVCreateCommand(req));
		}
		if (TouchoscguiElementTypes.TouchOscEncoder_3014 == req
				.getElementType()) {
			return getGEFWrapper(new TouchOscEncoderCreateCommand(req));
		}
		if (TouchoscguiElementTypes.TouchOscBatteryH_3015 == req
				.getElementType()) {
			return getGEFWrapper(new TouchOscBatteryHCreateCommand(req));
		}
		if (TouchoscguiElementTypes.TouchOscBatteryV_3016 == req
				.getElementType()) {
			return getGEFWrapper(new TouchOscBatteryVCreateCommand(req));
		}
		if (TouchoscguiElementTypes.TouchOscMultiFaderH_3017 == req
				.getElementType()) {
			return getGEFWrapper(new TouchOscMultiFaderHCreateCommand(req));
		}
		if (TouchoscguiElementTypes.TouchOscMultiFaderV_3018 == req
				.getElementType()) {
			return getGEFWrapper(new TouchOscMultiFaderVCreateCommand(req));
		}
		if (TouchoscguiElementTypes.TouchOscMultiPush_3019 == req
				.getElementType()) {
			return getGEFWrapper(new TouchOscMultiPushCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}
}
