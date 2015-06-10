package net.sf.smbt.ezsequence.diagram.edit.parts;

import net.sf.smbt.ezsequence.diagram.edit.policies.TimedLinkItemSemanticEditPolicy;

import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.draw2d.Connection;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.Routing;
import org.eclipse.gmf.runtime.notation.RoutingStyle;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class TimedLinkEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4001;

	/**
	 * @generated
	 */
	public TimedLinkEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new TimedLinkItemSemanticEditPolicy());
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated NOT
	 */
	protected Connection createConnectionFigure() {
		PolylineConnectionEx figure = new PolylineConnectionEx();

		AbstractEMFOperation emfOp = new AbstractEMFOperation(
				getEditingDomain(), "line routing setting") {
			@Override
			protected IStatus doExecute(IProgressMonitor monitor,
					IAdaptable info) {
				RoutingStyle style = (RoutingStyle) ((View) getModel())
						.getStyle(NotationPackage.Literals.ROUTING_STYLE);
				style.setRouting(Routing.TREE_LITERAL);
				return Status.OK_STATUS;
			}
		};

		try {
			OperationHistoryFactory.getOperationHistory().execute(emfOp, null,
					null);
		} catch (org.eclipse.core.commands.ExecutionException e) {
		}

		return figure;
	}

	/**
	 * @generated
	 */
	public PolylineConnectionEx getPrimaryShape() {
		return (PolylineConnectionEx) getFigure();
	}

}
