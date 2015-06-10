package net.sf.smbt.jzmui.diagram.edit.parts;

import net.sf.smbt.jzmui.diagram.part.JzmuiVisualIDRegistry;

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
public class JzmuiEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (JzmuiVisualIDRegistry.getVisualID(view)) {

			case JZJazzInterfaceEditPart.VISUAL_ID:
				return new JZJazzInterfaceEditPart(view);

			case JZJazzInterface2EditPart.VISUAL_ID:
				return new JZJazzInterface2EditPart(view);

			case JZBreakPointEditPart.VISUAL_ID:
				return new JZBreakPointEditPart(view);

			case JZContainerEditPart.VISUAL_ID:
				return new JZContainerEditPart(view);

			case JZBreakPoint2EditPart.VISUAL_ID:
				return new JZBreakPoint2EditPart(view);

			case JZContainer2EditPart.VISUAL_ID:
				return new JZContainer2EditPart(view);

			case JZCustomButtonEditPart.VISUAL_ID:
				return new JZCustomButtonEditPart(view);

			case JZFaderEditPart.VISUAL_ID:
				return new JZFaderEditPart(view);

			case JZGestureEditPart.VISUAL_ID:
				return new JZGestureEditPart(view);

			case JZKnobEditPart.VISUAL_ID:
				return new JZKnobEditPart(view);

			case JZLedEditPart.VISUAL_ID:
				return new JZLedEditPart(view);

			case JZLemurMenuEditPart.VISUAL_ID:
				return new JZLemurMenuEditPart(view);

			case JZLemurMonitorEditPart.VISUAL_ID:
				return new JZLemurMonitorEditPart(view);

			case JZMultiBallsEditPart.VISUAL_ID:
				return new JZMultiBallsEditPart(view);

			case JZPadsEditPart.VISUAL_ID:
				return new JZPadsEditPart(view);

			case JZRangeEditPart.VISUAL_ID:
				return new JZRangeEditPart(view);

			case JZRingAreaEditPart.VISUAL_ID:
				return new JZRingAreaEditPart(view);

			case JZSignalScopeEditPart.VISUAL_ID:
				return new JZSignalScopeEditPart(view);

			case JZSurfaceLCDEditPart.VISUAL_ID:
				return new JZSurfaceLCDEditPart(view);

			case JZSwitchesEditPart.VISUAL_ID:
				return new JZSwitchesEditPart(view);

			case JZTextEditPart.VISUAL_ID:
				return new JZTextEditPart(view);

			case JZTrackEditPart.VISUAL_ID:
				return new JZTrackEditPart(view);

			case JZmultiSliderEditPart.VISUAL_ID:
				return new JZmultiSliderEditPart(view);

			case JZCustomButton2EditPart.VISUAL_ID:
				return new JZCustomButton2EditPart(view);

			case JZFader2EditPart.VISUAL_ID:
				return new JZFader2EditPart(view);

			case JZGesture2EditPart.VISUAL_ID:
				return new JZGesture2EditPart(view);

			case JZKnob2EditPart.VISUAL_ID:
				return new JZKnob2EditPart(view);

			case JZLed2EditPart.VISUAL_ID:
				return new JZLed2EditPart(view);

			case JZLemurMenu2EditPart.VISUAL_ID:
				return new JZLemurMenu2EditPart(view);

			case JZLemurMonitor2EditPart.VISUAL_ID:
				return new JZLemurMonitor2EditPart(view);

			case JZMultiBalls2EditPart.VISUAL_ID:
				return new JZMultiBalls2EditPart(view);

			case JZmultiSlider2EditPart.VISUAL_ID:
				return new JZmultiSlider2EditPart(view);

			case JZPads2EditPart.VISUAL_ID:
				return new JZPads2EditPart(view);

			case JZRange2EditPart.VISUAL_ID:
				return new JZRange2EditPart(view);

			case JZRingArea2EditPart.VISUAL_ID:
				return new JZRingArea2EditPart(view);

			case JZSignalScope2EditPart.VISUAL_ID:
				return new JZSignalScope2EditPart(view);

			case JZSurfaceLCD2EditPart.VISUAL_ID:
				return new JZSurfaceLCD2EditPart(view);

			case JZSwitches2EditPart.VISUAL_ID:
				return new JZSwitches2EditPart(view);

			case JZText2EditPart.VISUAL_ID:
				return new JZText2EditPart(view);

			case JZTrack2EditPart.VISUAL_ID:
				return new JZTrack2EditPart(view);

			case JZJazzInterfaceJZJazzInterfaceCompartmentEditPart.VISUAL_ID:
				return new JZJazzInterfaceJZJazzInterfaceCompartmentEditPart(
						view);

			case JZContainerJZContainerCompartmentEditPart.VISUAL_ID:
				return new JZContainerJZContainerCompartmentEditPart(view);
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
