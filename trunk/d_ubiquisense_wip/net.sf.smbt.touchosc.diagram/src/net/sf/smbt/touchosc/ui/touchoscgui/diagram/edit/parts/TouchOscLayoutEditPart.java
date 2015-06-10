package net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.parts;

import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.policies.TouchOscLayoutCanonicalEditPolicy;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.policies.TouchOscLayoutItemSemanticEditPolicy;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class TouchOscLayoutEditPart extends DiagramEditPart {

	/**
	 * @generated
	 */
	public final static String MODEL_ID = "Touchoscgui"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 1000;

	/**
	 * @generated
	 */
	public TouchOscLayoutEditPart(View view) {
		super(view);
	}

	/**
	 * @generated NOT
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new TouchOscLayoutItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new TouchOscLayoutCanonicalEditPolicy());
		// diagram figure does layout; need to install child editpolicy to show selection feedback
		installEditPolicy(EditPolicy.LAYOUT_ROLE, new LayoutEditPolicy() {
			protected EditPolicy createChildEditPolicy(EditPart child) {
				final NonResizableEditPolicy p = new NonResizableEditPolicy();
				p.setDragAllowed(false);
				return p;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		});
		/*
		removeEditPolicy(EditPolicy.CONTAINER_ROLE);
		installEditPolicy(EditPolicy.CONTAINER_ROLE, new ContainerEditPolicy(){
			@Override
			public Command getCommand(Request request) {
				if (request instanceof ArrangeRequest) {
					request.setType("TouchOSC");
				}
				return super.getCommand(request);
			}
		});
		*/

		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.POPUPBAR_ROLE);
	}

	/**
	 * @generated NOT
	 */
	protected IFigure createFigure() {
		FreeformLayer l = new FreeformLayer();
		l.setBorder(new MarginBorder(50));
		FlowLayout lm = new FlowLayout();
		lm.setMajorSpacing(10);
		lm.setMinorSpacing(10);
		l.setLayoutManager(lm);
		l.setOpaque(true);
		l.setBackgroundColor(ColorConstants.darkGray);
		l.setForegroundColor(ColorConstants.darkGray);
		return l;
	}

}
