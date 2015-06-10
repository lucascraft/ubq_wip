package net.sf.smbt.ezsequence.diagram.edit.policies;

import net.sf.smbt.ezsequence.diagram.providers.EzsequenceElementTypes;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class TimeCursorItemSemanticEditPolicy extends
		EzsequenceBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public TimeCursorItemSemanticEditPolicy() {
		super(EzsequenceElementTypes.TimeCursor_2003);
	}

	/**
	 * @generated NOT
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return UnexecutableCommand.INSTANCE;
	}
}
