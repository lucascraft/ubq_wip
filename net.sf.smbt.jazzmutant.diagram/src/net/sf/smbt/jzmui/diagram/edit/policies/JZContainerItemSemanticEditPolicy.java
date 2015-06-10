package net.sf.smbt.jzmui.diagram.edit.policies;

import java.util.Iterator;

import net.sf.smbt.jzmui.diagram.edit.commands.JZBreakPoint2CreateCommand;
import net.sf.smbt.jzmui.diagram.edit.commands.JZContainer2CreateCommand;
import net.sf.smbt.jzmui.diagram.edit.commands.JZCustomButtonCreateCommand;
import net.sf.smbt.jzmui.diagram.edit.commands.JZFaderCreateCommand;
import net.sf.smbt.jzmui.diagram.edit.commands.JZGestureCreateCommand;
import net.sf.smbt.jzmui.diagram.edit.commands.JZKnobCreateCommand;
import net.sf.smbt.jzmui.diagram.edit.commands.JZLedCreateCommand;
import net.sf.smbt.jzmui.diagram.edit.commands.JZLemurMenuCreateCommand;
import net.sf.smbt.jzmui.diagram.edit.commands.JZLemurMonitorCreateCommand;
import net.sf.smbt.jzmui.diagram.edit.commands.JZMultiBallsCreateCommand;
import net.sf.smbt.jzmui.diagram.edit.commands.JZPadsCreateCommand;
import net.sf.smbt.jzmui.diagram.edit.commands.JZRangeCreateCommand;
import net.sf.smbt.jzmui.diagram.edit.commands.JZRingAreaCreateCommand;
import net.sf.smbt.jzmui.diagram.edit.commands.JZSignalScopeCreateCommand;
import net.sf.smbt.jzmui.diagram.edit.commands.JZSurfaceLCDCreateCommand;
import net.sf.smbt.jzmui.diagram.edit.commands.JZSwitchesCreateCommand;
import net.sf.smbt.jzmui.diagram.edit.commands.JZTextCreateCommand;
import net.sf.smbt.jzmui.diagram.edit.commands.JZTrackCreateCommand;
import net.sf.smbt.jzmui.diagram.edit.commands.JZmultiSliderCreateCommand;
import net.sf.smbt.jzmui.diagram.edit.parts.JZBreakPoint2EditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZContainer2EditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZContainerJZContainerCompartmentEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZCustomButtonEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZFaderEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZGestureEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZKnobEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZLedEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZLemurMenuEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZLemurMonitorEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZMultiBallsEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZPadsEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZRangeEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZRingAreaEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZSignalScopeEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZSurfaceLCDEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZSwitchesEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZTextEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZTrackEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZmultiSliderEditPart;
import net.sf.smbt.jzmui.diagram.part.JzmuiVisualIDRegistry;
import net.sf.smbt.jzmui.diagram.providers.JzmuiElementTypes;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class JZContainerItemSemanticEditPolicy extends
		JzmuiBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public JZContainerItemSemanticEditPolicy() {
		super(JzmuiElementTypes.JZContainer_3002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (JzmuiElementTypes.JZBreakPoint_3003 == req.getElementType()) {
			return getGEFWrapper(new JZBreakPoint2CreateCommand(req));
		}
		if (JzmuiElementTypes.JZContainer_3004 == req.getElementType()) {
			return getGEFWrapper(new JZContainer2CreateCommand(req));
		}
		if (JzmuiElementTypes.JZCustomButton_3005 == req.getElementType()) {
			return getGEFWrapper(new JZCustomButtonCreateCommand(req));
		}
		if (JzmuiElementTypes.JZFader_3006 == req.getElementType()) {
			return getGEFWrapper(new JZFaderCreateCommand(req));
		}
		if (JzmuiElementTypes.JZGesture_3007 == req.getElementType()) {
			return getGEFWrapper(new JZGestureCreateCommand(req));
		}
		if (JzmuiElementTypes.JZKnob_3008 == req.getElementType()) {
			return getGEFWrapper(new JZKnobCreateCommand(req));
		}
		if (JzmuiElementTypes.JZLed_3009 == req.getElementType()) {
			return getGEFWrapper(new JZLedCreateCommand(req));
		}
		if (JzmuiElementTypes.JZLemurMenu_3010 == req.getElementType()) {
			return getGEFWrapper(new JZLemurMenuCreateCommand(req));
		}
		if (JzmuiElementTypes.JZLemurMonitor_3011 == req.getElementType()) {
			return getGEFWrapper(new JZLemurMonitorCreateCommand(req));
		}
		if (JzmuiElementTypes.JZMultiBalls_3012 == req.getElementType()) {
			return getGEFWrapper(new JZMultiBallsCreateCommand(req));
		}
		if (JzmuiElementTypes.JZPads_3013 == req.getElementType()) {
			return getGEFWrapper(new JZPadsCreateCommand(req));
		}
		if (JzmuiElementTypes.JZRange_3014 == req.getElementType()) {
			return getGEFWrapper(new JZRangeCreateCommand(req));
		}
		if (JzmuiElementTypes.JZRingArea_3015 == req.getElementType()) {
			return getGEFWrapper(new JZRingAreaCreateCommand(req));
		}
		if (JzmuiElementTypes.JZSignalScope_3016 == req.getElementType()) {
			return getGEFWrapper(new JZSignalScopeCreateCommand(req));
		}
		if (JzmuiElementTypes.JZSurfaceLCD_3017 == req.getElementType()) {
			return getGEFWrapper(new JZSurfaceLCDCreateCommand(req));
		}
		if (JzmuiElementTypes.JZSwitches_3018 == req.getElementType()) {
			return getGEFWrapper(new JZSwitchesCreateCommand(req));
		}
		if (JzmuiElementTypes.JZText_3019 == req.getElementType()) {
			return getGEFWrapper(new JZTextCreateCommand(req));
		}
		if (JzmuiElementTypes.JZTrack_3020 == req.getElementType()) {
			return getGEFWrapper(new JZTrackCreateCommand(req));
		}
		if (JzmuiElementTypes.JZmultiSlider_3021 == req.getElementType()) {
			return getGEFWrapper(new JZmultiSliderCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyChildNodesCommand(cmd);
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	private void addDestroyChildNodesCommand(ICompositeCommand cmd) {
		View view = (View) getHost().getModel();
		for (Iterator<?> nit = view.getChildren().iterator(); nit.hasNext();) {
			Node node = (Node) nit.next();
			switch (JzmuiVisualIDRegistry.getVisualID(node)) {
			case JZBreakPoint2EditPart.VISUAL_ID:
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(
						getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			case JZContainer2EditPart.VISUAL_ID:
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(
						getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			case JZCustomButtonEditPart.VISUAL_ID:
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(
						getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			case JZFaderEditPart.VISUAL_ID:
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(
						getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			case JZGestureEditPart.VISUAL_ID:
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(
						getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			case JZKnobEditPart.VISUAL_ID:
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(
						getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			case JZLedEditPart.VISUAL_ID:
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(
						getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			case JZLemurMenuEditPart.VISUAL_ID:
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(
						getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			case JZLemurMonitorEditPart.VISUAL_ID:
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(
						getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			case JZMultiBallsEditPart.VISUAL_ID:
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(
						getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			case JZPadsEditPart.VISUAL_ID:
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(
						getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			case JZRangeEditPart.VISUAL_ID:
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(
						getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			case JZRingAreaEditPart.VISUAL_ID:
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(
						getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			case JZSignalScopeEditPart.VISUAL_ID:
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(
						getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			case JZSurfaceLCDEditPart.VISUAL_ID:
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(
						getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			case JZSwitchesEditPart.VISUAL_ID:
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(
						getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			case JZTextEditPart.VISUAL_ID:
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(
						getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			case JZTrackEditPart.VISUAL_ID:
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(
						getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			case JZmultiSliderEditPart.VISUAL_ID:
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(
						getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			case JZContainerJZContainerCompartmentEditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit
						.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (JzmuiVisualIDRegistry.getVisualID(cnode)) {
					}
				}
				break;
			}
		}
	}

}
