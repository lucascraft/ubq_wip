package net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.parts;

import net.sf.smbt.touchosc.ui.touchoscgui.diagram.part.TouchoscguiVisualIDRegistry;

import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;

/**
 * @generated
 */
public class TouchoscguiEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (TouchoscguiVisualIDRegistry.getVisualID(view)) {

			case TouchOscLayoutEditPart.VISUAL_ID:
				return new TouchOscLayoutEditPart(view);

			case TouchOscTabPageEditPart.VISUAL_ID:
				return new TouchOscTabPageEditPart(view);

			case TouchOscFaderHEditPart.VISUAL_ID:
				return new TouchOscFaderHEditPart(view);

			case TouchOscFaderVEditPart.VISUAL_ID:
				return new TouchOscFaderVEditPart(view);

			case TouchOscLabelHEditPart.VISUAL_ID:
				return new TouchOscLabelHEditPart(view);

			case TouchOscLabelVEditPart.VISUAL_ID:
				return new TouchOscLabelVEditPart(view);

			case TouchOscLEDEditPart.VISUAL_ID:
				return new TouchOscLEDEditPart(view);

			case TouchOscMultiToggleEditPart.VISUAL_ID:
				return new TouchOscMultiToggleEditPart(view);

			case TouchOscPushEditPart.VISUAL_ID:
				return new TouchOscPushEditPart(view);

			case TouchOscRotaryHEditPart.VISUAL_ID:
				return new TouchOscRotaryHEditPart(view);

			case TouchOscRotaryVEditPart.VISUAL_ID:
				return new TouchOscRotaryVEditPart(view);

			case TouchOscXYPadEditPart.VISUAL_ID:
				return new TouchOscXYPadEditPart(view);

			case TouchOscToggleEditPart.VISUAL_ID:
				return new TouchOscToggleEditPart(view);

			case TouchOscTimeHEditPart.VISUAL_ID:
				return new TouchOscTimeHEditPart(view);

			case TouchOscTimeVEditPart.VISUAL_ID:
				return new TouchOscTimeVEditPart(view);

			case TouchOscEncoderEditPart.VISUAL_ID:
				return new TouchOscEncoderEditPart(view);

			case TouchOscBatteryHEditPart.VISUAL_ID:
				return new TouchOscBatteryHEditPart(view);

			case TouchOscBatteryVEditPart.VISUAL_ID:
				return new TouchOscBatteryVEditPart(view);

			case TouchOscMultiFaderHEditPart.VISUAL_ID:
				return new TouchOscMultiFaderHEditPart(view);

			case TouchOscMultiFaderVEditPart.VISUAL_ID:
				return new TouchOscMultiFaderVEditPart(view);

			case TouchOscMultiPushEditPart.VISUAL_ID:
				return new TouchOscMultiPushEditPart(view);

			case TouchOscTabPageTouchOscTabPageCompartmentEditPart.VISUAL_ID:
				return new TouchOscTabPageTouchOscTabPageCompartmentEditPart(
						view);
			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		if (source.getFigure() instanceof WrappingLabel)
			return new TextCellEditorLocator((WrappingLabel) source.getFigure());
		else {
			return new LabelCellEditorLocator((Label) source.getFigure());
		}
	}

	/**
	 * @generated
	 */
	static private class TextCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private WrappingLabel wrapLabel;

		/**
		 * @generated
		 */
		public TextCellEditorLocator(WrappingLabel wrapLabel) {
			this.wrapLabel = wrapLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getWrapLabel() {
			return wrapLabel;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getWrapLabel().getTextBounds().getCopy();
			getWrapLabel().translateToAbsolute(rect);
			if (!text.getFont().isDisposed()) {
				if (getWrapLabel().isTextWrapOn()
						&& getWrapLabel().getText().length() > 0) {
					rect.setSize(new Dimension(text.computeSize(rect.width,
							SWT.DEFAULT)));
				} else {
					int avr = FigureUtilities.getFontMetrics(text.getFont())
							.getAverageCharWidth();
					rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
							SWT.DEFAULT)).expand(avr * 2, 0));
				}
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}

	/**
	 * @generated
	 */
	private static class LabelCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private Label label;

		/**
		 * @generated
		 */
		public LabelCellEditorLocator(Label label) {
			this.label = label;
		}

		/**
		 * @generated
		 */
		public Label getLabel() {
			return label;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getLabel().getTextBounds().getCopy();
			getLabel().translateToAbsolute(rect);
			if (!text.getFont().isDisposed()) {
				int avr = FigureUtilities.getFontMetrics(text.getFont())
						.getAverageCharWidth();
				rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
						SWT.DEFAULT)).expand(avr * 2, 0));
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}
}
