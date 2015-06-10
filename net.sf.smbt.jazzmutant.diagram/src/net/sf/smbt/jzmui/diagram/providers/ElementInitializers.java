package net.sf.smbt.jzmui.diagram.providers;

import net.sf.smbt.jzmui.JZBreakPoint;
import net.sf.smbt.jzmui.JZLed;
import net.sf.smbt.jzmui.JZMultiBalls;
import net.sf.smbt.jzmui.JZPads;
import net.sf.smbt.jzmui.JZSwitches;
import net.sf.smbt.jzmui.JZmultiSlider;
import net.sf.smbt.jzmui.JzmuiPackage;
import net.sf.smbt.jzmui.diagram.expressions.JzmuiAbstractExpression;
import net.sf.smbt.jzmui.diagram.expressions.JzmuiOCLFactory;
import net.sf.smbt.jzmui.diagram.part.JzmuiDiagramEditorPlugin;

import org.eclipse.emf.ecore.EcorePackage;

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
	public void init_JZBreakPoint_3001(JZBreakPoint instance) {
		try {
			Object value_0 = JzmuiOCLFactory.getExpression(0,
					JzmuiPackage.eINSTANCE.getJZBreakPoint(), null).evaluate(
					instance);

			value_0 = JzmuiAbstractExpression.performCast(value_0,
					EcorePackage.eINSTANCE.getEInt());
			instance.setPoints(((Integer) value_0).intValue());
		} catch (RuntimeException e) {
			JzmuiDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_JZBreakPoint_3003(JZBreakPoint instance) {
		try {
			Object value_0 = JzmuiOCLFactory.getExpression(1,
					JzmuiPackage.eINSTANCE.getJZBreakPoint(), null).evaluate(
					instance);

			value_0 = JzmuiAbstractExpression.performCast(value_0,
					EcorePackage.eINSTANCE.getEInt());
			instance.setPoints(((Integer) value_0).intValue());
		} catch (RuntimeException e) {
			JzmuiDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_JZLed_3009(JZLed instance) {
		try {
			Object value_0 = JzmuiOCLFactory.getExpression(2,
					JzmuiPackage.eINSTANCE.getJZLed(), null).evaluate(instance);

			value_0 = JzmuiAbstractExpression.performCast(value_0,
					EcorePackage.eINSTANCE.getEInt());
			instance.setRows(((Integer) value_0).intValue());
			Object value_1 = JzmuiOCLFactory.getExpression(3,
					JzmuiPackage.eINSTANCE.getJZLed(), null).evaluate(instance);

			value_1 = JzmuiAbstractExpression.performCast(value_1,
					EcorePackage.eINSTANCE.getEInt());
			instance.setColumns(((Integer) value_1).intValue());
		} catch (RuntimeException e) {
			JzmuiDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_JZMultiBalls_3012(JZMultiBalls instance) {
		try {
			Object value_0 = JzmuiOCLFactory.getExpression(4,
					JzmuiPackage.eINSTANCE.getJZMultiBalls(), null).evaluate(
					instance);
			instance.setNumbers(((Boolean) value_0).booleanValue());
		} catch (RuntimeException e) {
			JzmuiDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_JZPads_3013(JZPads instance) {
		try {
			Object value_0 = JzmuiOCLFactory.getExpression(5,
					JzmuiPackage.eINSTANCE.getJZPads(), null)
					.evaluate(instance);

			value_0 = JzmuiAbstractExpression.performCast(value_0,
					EcorePackage.eINSTANCE.getEInt());
			instance.setColumns(((Integer) value_0).intValue());
			Object value_1 = JzmuiOCLFactory.getExpression(6,
					JzmuiPackage.eINSTANCE.getJZPads(), null)
					.evaluate(instance);

			value_1 = JzmuiAbstractExpression.performCast(value_1,
					EcorePackage.eINSTANCE.getEInt());
			instance.setRows(((Integer) value_1).intValue());
		} catch (RuntimeException e) {
			JzmuiDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_JZSwitches_3018(JZSwitches instance) {
		try {
			Object value_0 = JzmuiOCLFactory.getExpression(7,
					JzmuiPackage.eINSTANCE.getJZSwitches(), null).evaluate(
					instance);

			value_0 = JzmuiAbstractExpression.performCast(value_0,
					EcorePackage.eINSTANCE.getEInt());
			instance.setColumns(((Integer) value_0).intValue());
			Object value_1 = JzmuiOCLFactory.getExpression(8,
					JzmuiPackage.eINSTANCE.getJZSwitches(), null).evaluate(
					instance);

			value_1 = JzmuiAbstractExpression.performCast(value_1,
					EcorePackage.eINSTANCE.getEInt());
			instance.setRows(((Integer) value_1).intValue());
		} catch (RuntimeException e) {
			JzmuiDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_JZmultiSlider_3021(JZmultiSlider instance) {
		try {
			Object value_0 = JzmuiOCLFactory.getExpression(9,
					JzmuiPackage.eINSTANCE.getJZmultiSlider(), null).evaluate(
					instance);

			value_0 = JzmuiAbstractExpression.performCast(value_0,
					EcorePackage.eINSTANCE.getEInt());
			instance.setSlider(((Integer) value_0).intValue());
		} catch (RuntimeException e) {
			JzmuiDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_JZLed_3026(JZLed instance) {
		try {
			Object value_0 = JzmuiOCLFactory.getExpression(10,
					JzmuiPackage.eINSTANCE.getJZLed(), null).evaluate(instance);

			value_0 = JzmuiAbstractExpression.performCast(value_0,
					EcorePackage.eINSTANCE.getEInt());
			instance.setRows(((Integer) value_0).intValue());
			Object value_1 = JzmuiOCLFactory.getExpression(11,
					JzmuiPackage.eINSTANCE.getJZLed(), null).evaluate(instance);

			value_1 = JzmuiAbstractExpression.performCast(value_1,
					EcorePackage.eINSTANCE.getEInt());
			instance.setColumns(((Integer) value_1).intValue());
		} catch (RuntimeException e) {
			JzmuiDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_JZMultiBalls_3029(JZMultiBalls instance) {
		try {
			Object value_0 = JzmuiOCLFactory.getExpression(12,
					JzmuiPackage.eINSTANCE.getJZMultiBalls(), null).evaluate(
					instance);
			instance.setNumbers(((Boolean) value_0).booleanValue());
		} catch (RuntimeException e) {
			JzmuiDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_JZmultiSlider_3030(JZmultiSlider instance) {
		try {
			Object value_0 = JzmuiOCLFactory.getExpression(13,
					JzmuiPackage.eINSTANCE.getJZmultiSlider(), null).evaluate(
					instance);

			value_0 = JzmuiAbstractExpression.performCast(value_0,
					EcorePackage.eINSTANCE.getEInt());
			instance.setSlider(((Integer) value_0).intValue());
		} catch (RuntimeException e) {
			JzmuiDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_JZPads_3031(JZPads instance) {
		try {
			Object value_0 = JzmuiOCLFactory.getExpression(14,
					JzmuiPackage.eINSTANCE.getJZPads(), null)
					.evaluate(instance);

			value_0 = JzmuiAbstractExpression.performCast(value_0,
					EcorePackage.eINSTANCE.getEInt());
			instance.setColumns(((Integer) value_0).intValue());
			Object value_1 = JzmuiOCLFactory.getExpression(15,
					JzmuiPackage.eINSTANCE.getJZPads(), null)
					.evaluate(instance);

			value_1 = JzmuiAbstractExpression.performCast(value_1,
					EcorePackage.eINSTANCE.getEInt());
			instance.setRows(((Integer) value_1).intValue());
		} catch (RuntimeException e) {
			JzmuiDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_JZSwitches_3036(JZSwitches instance) {
		try {
			Object value_0 = JzmuiOCLFactory.getExpression(16,
					JzmuiPackage.eINSTANCE.getJZSwitches(), null).evaluate(
					instance);

			value_0 = JzmuiAbstractExpression.performCast(value_0,
					EcorePackage.eINSTANCE.getEInt());
			instance.setColumns(((Integer) value_0).intValue());
			Object value_1 = JzmuiOCLFactory.getExpression(17,
					JzmuiPackage.eINSTANCE.getJZSwitches(), null).evaluate(
					instance);

			value_1 = JzmuiAbstractExpression.performCast(value_1,
					EcorePackage.eINSTANCE.getEInt());
			instance.setRows(((Integer) value_1).intValue());
		} catch (RuntimeException e) {
			JzmuiDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = JzmuiDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			JzmuiDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
