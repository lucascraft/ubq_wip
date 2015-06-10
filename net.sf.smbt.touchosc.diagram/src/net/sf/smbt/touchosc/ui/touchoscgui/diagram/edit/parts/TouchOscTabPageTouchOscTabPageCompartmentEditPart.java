package net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.parts;

import net.sf.smbt.touchosc.diagram.parts.TouchOscPageLayout;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.policies.TouchOscTabPageTouchOscTabPageCompartmentCanonicalEditPolicy;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.policies.TouchOscTabPageTouchOscTabPageCompartmentItemSemanticEditPolicy;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.part.Messages;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ContainerEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.ArrangeRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class TouchOscTabPageTouchOscTabPageCompartmentEditPart extends
		ShapeCompartmentEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 7001;

	/**
	 * @generated
	 */
	public TouchOscTabPageTouchOscTabPageCompartmentEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	public String getCompartmentName() {
		return Messages.TouchOscTabPageTouchOscTabPageCompartmentEditPart_title;
	}

	/**
	 * @generated NOT
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new TouchOscTabPageTouchOscTabPageCompartmentItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(
				EditPolicyRoles.CANONICAL_ROLE,
				new TouchOscTabPageTouchOscTabPageCompartmentCanonicalEditPolicy());
		removeEditPolicy(EditPolicy.CONTAINER_ROLE);
		installEditPolicy(EditPolicy.CONTAINER_ROLE, new ContainerEditPolicy() {
			@Override
			public Command getCommand(Request request) {
				if (request instanceof ArrangeRequest) {
					ArrangeRequest request2 = new ArrangeRequest(
							(String) request.getType(), "TouchOSC");
					((ArrangeRequest) request2)
							.setPartsToArrange(((ArrangeRequest) request)
									.getPartsToArrange());
					return super.getCommand(request2);
				}
				return null;
			}
		});
	}

	/**
	 * @generated
	 */
	protected void setRatio(Double ratio) {
		if (getFigure().getParent().getLayoutManager() instanceof ConstrainedToolbarLayout) {
			super.setRatio(ratio);
		}
	}
	
	
	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * 
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			TouchOscPageLayout layout = new TouchOscPageLayout();
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}


	
	
	

}
