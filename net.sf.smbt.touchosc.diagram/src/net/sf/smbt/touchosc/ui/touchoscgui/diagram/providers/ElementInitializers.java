package net.sf.smbt.touchosc.ui.touchoscgui.diagram.providers;

import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscBatteryH;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscBatteryV;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscEncoder;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscFaderH;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscFaderV;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLED;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLabelH;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLabelV;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscMultiFaderH;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscMultiFaderV;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscMultiPush;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscMultiToggle;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscPush;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscRotaryH;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscRotaryV;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTimeH;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTimeV;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscToggle;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscXYPad;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchoscguiPackage;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.expressions.TouchoscguiAbstractExpression;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.expressions.TouchoscguiOCLFactory;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.part.TouchoscguiDiagramEditorPlugin;

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
	public void init_TouchOscFaderH_3001(TouchOscFaderH instance) {
		try {
			Object value_0 = TouchoscguiOCLFactory.getExpression(0,
					TouchoscguiPackage.eINSTANCE.getTouchOscFaderH(), null)
					.evaluate(instance);
			instance.setType((String) value_0);
			Object value_1 = TouchoscguiOCLFactory.getExpression(1,
					TouchoscguiPackage.eINSTANCE.getTouchOscFaderH(), null)
					.evaluate(instance);

			value_1 = TouchoscguiAbstractExpression.performCast(value_1,
					EcorePackage.eINSTANCE.getEInt());
			instance.setX(((Integer) value_1).intValue());
			Object value_2 = TouchoscguiOCLFactory.getExpression(2,
					TouchoscguiPackage.eINSTANCE.getTouchOscFaderH(), null)
					.evaluate(instance);

			value_2 = TouchoscguiAbstractExpression.performCast(value_2,
					EcorePackage.eINSTANCE.getEInt());
			instance.setY(((Integer) value_2).intValue());
			Object value_3 = TouchoscguiOCLFactory.getExpression(3,
					TouchoscguiPackage.eINSTANCE.getTouchOscFaderH(), null)
					.evaluate(instance);

			value_3 = TouchoscguiAbstractExpression.performCast(value_3,
					EcorePackage.eINSTANCE.getEInt());
			instance.setW(((Integer) value_3).intValue());
			Object value_4 = TouchoscguiOCLFactory.getExpression(4,
					TouchoscguiPackage.eINSTANCE.getTouchOscFaderH(), null)
					.evaluate(instance);

			value_4 = TouchoscguiAbstractExpression.performCast(value_4,
					EcorePackage.eINSTANCE.getEInt());
			instance.setH(((Integer) value_4).intValue());
			Object value_5 = TouchoscguiOCLFactory.getExpression(5,
					TouchoscguiPackage.eINSTANCE.getTouchOscFaderH(), null)
					.evaluate(instance);
			instance.setFg((String) value_5);
			Object value_6 = TouchoscguiOCLFactory.getExpression(6,
					TouchoscguiPackage.eINSTANCE.getTouchOscFaderH(), null)
					.evaluate(instance);
			instance.setResponse((String) value_6);
		} catch (RuntimeException e) {
			TouchoscguiDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_TouchOscFaderV_3002(TouchOscFaderV instance) {
		try {
			Object value_0 = TouchoscguiOCLFactory.getExpression(7,
					TouchoscguiPackage.eINSTANCE.getTouchOscFaderV(), null)
					.evaluate(instance);
			instance.setType((String) value_0);
			Object value_1 = TouchoscguiOCLFactory.getExpression(8,
					TouchoscguiPackage.eINSTANCE.getTouchOscFaderV(), null)
					.evaluate(instance);

			value_1 = TouchoscguiAbstractExpression.performCast(value_1,
					EcorePackage.eINSTANCE.getEInt());
			instance.setX(((Integer) value_1).intValue());
			Object value_2 = TouchoscguiOCLFactory.getExpression(9,
					TouchoscguiPackage.eINSTANCE.getTouchOscFaderV(), null)
					.evaluate(instance);

			value_2 = TouchoscguiAbstractExpression.performCast(value_2,
					EcorePackage.eINSTANCE.getEInt());
			instance.setY(((Integer) value_2).intValue());
			Object value_3 = TouchoscguiOCLFactory.getExpression(10,
					TouchoscguiPackage.eINSTANCE.getTouchOscFaderV(), null)
					.evaluate(instance);

			value_3 = TouchoscguiAbstractExpression.performCast(value_3,
					EcorePackage.eINSTANCE.getEInt());
			instance.setW(((Integer) value_3).intValue());
			Object value_4 = TouchoscguiOCLFactory.getExpression(11,
					TouchoscguiPackage.eINSTANCE.getTouchOscFaderV(), null)
					.evaluate(instance);

			value_4 = TouchoscguiAbstractExpression.performCast(value_4,
					EcorePackage.eINSTANCE.getEInt());
			instance.setH(((Integer) value_4).intValue());
			Object value_5 = TouchoscguiOCLFactory.getExpression(12,
					TouchoscguiPackage.eINSTANCE.getTouchOscFaderV(), null)
					.evaluate(instance);
			instance.setFg((String) value_5);
			Object value_6 = TouchoscguiOCLFactory.getExpression(13,
					TouchoscguiPackage.eINSTANCE.getTouchOscFaderV(), null)
					.evaluate(instance);
			instance.setResponse((String) value_6);
		} catch (RuntimeException e) {
			TouchoscguiDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_TouchOscLabelH_3003(TouchOscLabelH instance) {
		try {
			Object value_0 = TouchoscguiOCLFactory.getExpression(14,
					TouchoscguiPackage.eINSTANCE.getTouchOscLabelH(), null)
					.evaluate(instance);
			instance.setType((String) value_0);
			Object value_1 = TouchoscguiOCLFactory.getExpression(15,
					TouchoscguiPackage.eINSTANCE.getTouchOscLabelH(), null)
					.evaluate(instance);

			value_1 = TouchoscguiAbstractExpression.performCast(value_1,
					EcorePackage.eINSTANCE.getEInt());
			instance.setX(((Integer) value_1).intValue());
			Object value_2 = TouchoscguiOCLFactory.getExpression(16,
					TouchoscguiPackage.eINSTANCE.getTouchOscLabelH(), null)
					.evaluate(instance);

			value_2 = TouchoscguiAbstractExpression.performCast(value_2,
					EcorePackage.eINSTANCE.getEInt());
			instance.setY(((Integer) value_2).intValue());
			Object value_3 = TouchoscguiOCLFactory.getExpression(17,
					TouchoscguiPackage.eINSTANCE.getTouchOscLabelH(), null)
					.evaluate(instance);

			value_3 = TouchoscguiAbstractExpression.performCast(value_3,
					EcorePackage.eINSTANCE.getEInt());
			instance.setW(((Integer) value_3).intValue());
			Object value_4 = TouchoscguiOCLFactory.getExpression(18,
					TouchoscguiPackage.eINSTANCE.getTouchOscLabelH(), null)
					.evaluate(instance);

			value_4 = TouchoscguiAbstractExpression.performCast(value_4,
					EcorePackage.eINSTANCE.getEInt());
			instance.setH(((Integer) value_4).intValue());
			Object value_5 = TouchoscguiOCLFactory.getExpression(19,
					TouchoscguiPackage.eINSTANCE.getTouchOscLabelH(), null)
					.evaluate(instance);
			instance.setFg((String) value_5);
			Object value_6 = TouchoscguiOCLFactory.getExpression(20,
					TouchoscguiPackage.eINSTANCE.getTouchOscLabelH(), null)
					.evaluate(instance);

			value_6 = TouchoscguiAbstractExpression.performCast(value_6,
					EcorePackage.eINSTANCE.getEInt());
			instance.setSize(((Integer) value_6).intValue());
			Object value_7 = TouchoscguiOCLFactory.getExpression(21,
					TouchoscguiPackage.eINSTANCE.getTouchOscLabelH(), null)
					.evaluate(instance);
			instance.setBackground(((Boolean) value_7).booleanValue());
		} catch (RuntimeException e) {
			TouchoscguiDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_TouchOscLabelV_3004(TouchOscLabelV instance) {
		try {
			Object value_0 = TouchoscguiOCLFactory.getExpression(22,
					TouchoscguiPackage.eINSTANCE.getTouchOscLabelV(), null)
					.evaluate(instance);
			instance.setType((String) value_0);
			Object value_1 = TouchoscguiOCLFactory.getExpression(23,
					TouchoscguiPackage.eINSTANCE.getTouchOscLabelV(), null)
					.evaluate(instance);

			value_1 = TouchoscguiAbstractExpression.performCast(value_1,
					EcorePackage.eINSTANCE.getEInt());
			instance.setX(((Integer) value_1).intValue());
			Object value_2 = TouchoscguiOCLFactory.getExpression(24,
					TouchoscguiPackage.eINSTANCE.getTouchOscLabelV(), null)
					.evaluate(instance);

			value_2 = TouchoscguiAbstractExpression.performCast(value_2,
					EcorePackage.eINSTANCE.getEInt());
			instance.setY(((Integer) value_2).intValue());
			Object value_3 = TouchoscguiOCLFactory.getExpression(25,
					TouchoscguiPackage.eINSTANCE.getTouchOscLabelV(), null)
					.evaluate(instance);

			value_3 = TouchoscguiAbstractExpression.performCast(value_3,
					EcorePackage.eINSTANCE.getEInt());
			instance.setW(((Integer) value_3).intValue());
			Object value_4 = TouchoscguiOCLFactory.getExpression(26,
					TouchoscguiPackage.eINSTANCE.getTouchOscLabelV(), null)
					.evaluate(instance);

			value_4 = TouchoscguiAbstractExpression.performCast(value_4,
					EcorePackage.eINSTANCE.getEInt());
			instance.setH(((Integer) value_4).intValue());
			Object value_5 = TouchoscguiOCLFactory.getExpression(27,
					TouchoscguiPackage.eINSTANCE.getTouchOscLabelV(), null)
					.evaluate(instance);
			instance.setFg((String) value_5);
			Object value_6 = TouchoscguiOCLFactory.getExpression(28,
					TouchoscguiPackage.eINSTANCE.getTouchOscLabelV(), null)
					.evaluate(instance);

			value_6 = TouchoscguiAbstractExpression.performCast(value_6,
					EcorePackage.eINSTANCE.getEInt());
			instance.setSize(((Integer) value_6).intValue());
			Object value_7 = TouchoscguiOCLFactory.getExpression(29,
					TouchoscguiPackage.eINSTANCE.getTouchOscLabelV(), null)
					.evaluate(instance);
			instance.setBackground(((Boolean) value_7).booleanValue());
		} catch (RuntimeException e) {
			TouchoscguiDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_TouchOscLED_3005(TouchOscLED instance) {
		try {
			Object value_0 = TouchoscguiOCLFactory.getExpression(30,
					TouchoscguiPackage.eINSTANCE.getTouchOscLED(), null)
					.evaluate(instance);
			instance.setType((String) value_0);
			Object value_1 = TouchoscguiOCLFactory.getExpression(31,
					TouchoscguiPackage.eINSTANCE.getTouchOscLED(), null)
					.evaluate(instance);

			value_1 = TouchoscguiAbstractExpression.performCast(value_1,
					EcorePackage.eINSTANCE.getEInt());
			instance.setX(((Integer) value_1).intValue());
			Object value_2 = TouchoscguiOCLFactory.getExpression(32,
					TouchoscguiPackage.eINSTANCE.getTouchOscLED(), null)
					.evaluate(instance);

			value_2 = TouchoscguiAbstractExpression.performCast(value_2,
					EcorePackage.eINSTANCE.getEInt());
			instance.setY(((Integer) value_2).intValue());
			Object value_3 = TouchoscguiOCLFactory.getExpression(33,
					TouchoscguiPackage.eINSTANCE.getTouchOscLED(), null)
					.evaluate(instance);

			value_3 = TouchoscguiAbstractExpression.performCast(value_3,
					EcorePackage.eINSTANCE.getEInt());
			instance.setW(((Integer) value_3).intValue());
			Object value_4 = TouchoscguiOCLFactory.getExpression(34,
					TouchoscguiPackage.eINSTANCE.getTouchOscLED(), null)
					.evaluate(instance);

			value_4 = TouchoscguiAbstractExpression.performCast(value_4,
					EcorePackage.eINSTANCE.getEInt());
			instance.setH(((Integer) value_4).intValue());
			Object value_5 = TouchoscguiOCLFactory.getExpression(35,
					TouchoscguiPackage.eINSTANCE.getTouchOscLED(), null)
					.evaluate(instance);
			instance.setFg((String) value_5);
		} catch (RuntimeException e) {
			TouchoscguiDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_TouchOscMultiToggle_3006(TouchOscMultiToggle instance) {
		try {
			Object value_0 = TouchoscguiOCLFactory
					.getExpression(
							36,
							TouchoscguiPackage.eINSTANCE
									.getTouchOscMultiToggle(), null).evaluate(
							instance);

			value_0 = TouchoscguiAbstractExpression.performCast(value_0,
					EcorePackage.eINSTANCE.getEInt());
			instance.setNumber_x(((Integer) value_0).intValue());
			Object value_1 = TouchoscguiOCLFactory
					.getExpression(
							37,
							TouchoscguiPackage.eINSTANCE
									.getTouchOscMultiToggle(), null).evaluate(
							instance);

			value_1 = TouchoscguiAbstractExpression.performCast(value_1,
					EcorePackage.eINSTANCE.getEInt());
			instance.setNumber_y(((Integer) value_1).intValue());
			Object value_2 = TouchoscguiOCLFactory
					.getExpression(
							38,
							TouchoscguiPackage.eINSTANCE
									.getTouchOscMultiToggle(), null).evaluate(
							instance);
			instance.setType((String) value_2);
			Object value_3 = TouchoscguiOCLFactory
					.getExpression(
							39,
							TouchoscguiPackage.eINSTANCE
									.getTouchOscMultiToggle(), null).evaluate(
							instance);

			value_3 = TouchoscguiAbstractExpression.performCast(value_3,
					EcorePackage.eINSTANCE.getEInt());
			instance.setX(((Integer) value_3).intValue());
			Object value_4 = TouchoscguiOCLFactory
					.getExpression(
							40,
							TouchoscguiPackage.eINSTANCE
									.getTouchOscMultiToggle(), null).evaluate(
							instance);

			value_4 = TouchoscguiAbstractExpression.performCast(value_4,
					EcorePackage.eINSTANCE.getEInt());
			instance.setY(((Integer) value_4).intValue());
			Object value_5 = TouchoscguiOCLFactory
					.getExpression(
							41,
							TouchoscguiPackage.eINSTANCE
									.getTouchOscMultiToggle(), null).evaluate(
							instance);

			value_5 = TouchoscguiAbstractExpression.performCast(value_5,
					EcorePackage.eINSTANCE.getEInt());
			instance.setW(((Integer) value_5).intValue());
			Object value_6 = TouchoscguiOCLFactory
					.getExpression(
							42,
							TouchoscguiPackage.eINSTANCE
									.getTouchOscMultiToggle(), null).evaluate(
							instance);

			value_6 = TouchoscguiAbstractExpression.performCast(value_6,
					EcorePackage.eINSTANCE.getEInt());
			instance.setH(((Integer) value_6).intValue());
			Object value_7 = TouchoscguiOCLFactory
					.getExpression(
							43,
							TouchoscguiPackage.eINSTANCE
									.getTouchOscMultiToggle(), null).evaluate(
							instance);
			instance.setFg((String) value_7);
			Object value_8 = TouchoscguiOCLFactory
					.getExpression(
							44,
							TouchoscguiPackage.eINSTANCE
									.getTouchOscMultiToggle(), null).evaluate(
							instance);
			instance.setResponse((String) value_8);
		} catch (RuntimeException e) {
			TouchoscguiDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_TouchOscPush_3007(TouchOscPush instance) {
		try {
			Object value_0 = TouchoscguiOCLFactory.getExpression(45,
					TouchoscguiPackage.eINSTANCE.getTouchOscPush(), null)
					.evaluate(instance);
			instance.setType((String) value_0);
			Object value_1 = TouchoscguiOCLFactory.getExpression(46,
					TouchoscguiPackage.eINSTANCE.getTouchOscPush(), null)
					.evaluate(instance);

			value_1 = TouchoscguiAbstractExpression.performCast(value_1,
					EcorePackage.eINSTANCE.getEInt());
			instance.setX(((Integer) value_1).intValue());
			Object value_2 = TouchoscguiOCLFactory.getExpression(47,
					TouchoscguiPackage.eINSTANCE.getTouchOscPush(), null)
					.evaluate(instance);

			value_2 = TouchoscguiAbstractExpression.performCast(value_2,
					EcorePackage.eINSTANCE.getEInt());
			instance.setY(((Integer) value_2).intValue());
			Object value_3 = TouchoscguiOCLFactory.getExpression(48,
					TouchoscguiPackage.eINSTANCE.getTouchOscPush(), null)
					.evaluate(instance);

			value_3 = TouchoscguiAbstractExpression.performCast(value_3,
					EcorePackage.eINSTANCE.getEInt());
			instance.setW(((Integer) value_3).intValue());
			Object value_4 = TouchoscguiOCLFactory.getExpression(49,
					TouchoscguiPackage.eINSTANCE.getTouchOscPush(), null)
					.evaluate(instance);

			value_4 = TouchoscguiAbstractExpression.performCast(value_4,
					EcorePackage.eINSTANCE.getEInt());
			instance.setH(((Integer) value_4).intValue());
			Object value_5 = TouchoscguiOCLFactory.getExpression(50,
					TouchoscguiPackage.eINSTANCE.getTouchOscPush(), null)
					.evaluate(instance);
			instance.setFg((String) value_5);
			Object value_6 = TouchoscguiOCLFactory.getExpression(51,
					TouchoscguiPackage.eINSTANCE.getTouchOscPush(), null)
					.evaluate(instance);
			instance.setResponse((String) value_6);
		} catch (RuntimeException e) {
			TouchoscguiDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_TouchOscRotaryH_3008(TouchOscRotaryH instance) {
		try {
			Object value_0 = TouchoscguiOCLFactory.getExpression(52,
					TouchoscguiPackage.eINSTANCE.getTouchOscRotaryH(), null)
					.evaluate(instance);
			instance.setCentered(((Boolean) value_0).booleanValue());
			Object value_1 = TouchoscguiOCLFactory.getExpression(53,
					TouchoscguiPackage.eINSTANCE.getTouchOscRotaryH(), null)
					.evaluate(instance);
			instance.setType((String) value_1);
			Object value_2 = TouchoscguiOCLFactory.getExpression(54,
					TouchoscguiPackage.eINSTANCE.getTouchOscRotaryH(), null)
					.evaluate(instance);

			value_2 = TouchoscguiAbstractExpression.performCast(value_2,
					EcorePackage.eINSTANCE.getEInt());
			instance.setX(((Integer) value_2).intValue());
			Object value_3 = TouchoscguiOCLFactory.getExpression(55,
					TouchoscguiPackage.eINSTANCE.getTouchOscRotaryH(), null)
					.evaluate(instance);

			value_3 = TouchoscguiAbstractExpression.performCast(value_3,
					EcorePackage.eINSTANCE.getEInt());
			instance.setY(((Integer) value_3).intValue());
			Object value_4 = TouchoscguiOCLFactory.getExpression(56,
					TouchoscguiPackage.eINSTANCE.getTouchOscRotaryH(), null)
					.evaluate(instance);

			value_4 = TouchoscguiAbstractExpression.performCast(value_4,
					EcorePackage.eINSTANCE.getEInt());
			instance.setW(((Integer) value_4).intValue());
			Object value_5 = TouchoscguiOCLFactory.getExpression(57,
					TouchoscguiPackage.eINSTANCE.getTouchOscRotaryH(), null)
					.evaluate(instance);

			value_5 = TouchoscguiAbstractExpression.performCast(value_5,
					EcorePackage.eINSTANCE.getEInt());
			instance.setH(((Integer) value_5).intValue());
			Object value_6 = TouchoscguiOCLFactory.getExpression(58,
					TouchoscguiPackage.eINSTANCE.getTouchOscRotaryH(), null)
					.evaluate(instance);
			instance.setFg((String) value_6);
			Object value_7 = TouchoscguiOCLFactory.getExpression(59,
					TouchoscguiPackage.eINSTANCE.getTouchOscRotaryH(), null)
					.evaluate(instance);
			instance.setResponse((String) value_7);
		} catch (RuntimeException e) {
			TouchoscguiDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_TouchOscRotaryV_3009(TouchOscRotaryV instance) {
		try {
			Object value_0 = TouchoscguiOCLFactory.getExpression(60,
					TouchoscguiPackage.eINSTANCE.getTouchOscRotaryV(), null)
					.evaluate(instance);
			instance.setCentered(((Boolean) value_0).booleanValue());
			Object value_1 = TouchoscguiOCLFactory.getExpression(61,
					TouchoscguiPackage.eINSTANCE.getTouchOscRotaryV(), null)
					.evaluate(instance);
			instance.setType((String) value_1);
			Object value_2 = TouchoscguiOCLFactory.getExpression(62,
					TouchoscguiPackage.eINSTANCE.getTouchOscRotaryV(), null)
					.evaluate(instance);

			value_2 = TouchoscguiAbstractExpression.performCast(value_2,
					EcorePackage.eINSTANCE.getEInt());
			instance.setX(((Integer) value_2).intValue());
			Object value_3 = TouchoscguiOCLFactory.getExpression(63,
					TouchoscguiPackage.eINSTANCE.getTouchOscRotaryV(), null)
					.evaluate(instance);

			value_3 = TouchoscguiAbstractExpression.performCast(value_3,
					EcorePackage.eINSTANCE.getEInt());
			instance.setY(((Integer) value_3).intValue());
			Object value_4 = TouchoscguiOCLFactory.getExpression(64,
					TouchoscguiPackage.eINSTANCE.getTouchOscRotaryV(), null)
					.evaluate(instance);

			value_4 = TouchoscguiAbstractExpression.performCast(value_4,
					EcorePackage.eINSTANCE.getEInt());
			instance.setW(((Integer) value_4).intValue());
			Object value_5 = TouchoscguiOCLFactory.getExpression(65,
					TouchoscguiPackage.eINSTANCE.getTouchOscRotaryV(), null)
					.evaluate(instance);

			value_5 = TouchoscguiAbstractExpression.performCast(value_5,
					EcorePackage.eINSTANCE.getEInt());
			instance.setH(((Integer) value_5).intValue());
			Object value_6 = TouchoscguiOCLFactory.getExpression(66,
					TouchoscguiPackage.eINSTANCE.getTouchOscRotaryV(), null)
					.evaluate(instance);
			instance.setFg((String) value_6);
			Object value_7 = TouchoscguiOCLFactory.getExpression(67,
					TouchoscguiPackage.eINSTANCE.getTouchOscRotaryV(), null)
					.evaluate(instance);
			instance.setResponse((String) value_7);
		} catch (RuntimeException e) {
			TouchoscguiDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_TouchOscXYPad_3010(TouchOscXYPad instance) {
		try {
			Object value_0 = TouchoscguiOCLFactory.getExpression(68,
					TouchoscguiPackage.eINSTANCE.getTouchOscXYPad(), null)
					.evaluate(instance);
			instance.setInverted_x(((Boolean) value_0).booleanValue());
			Object value_1 = TouchoscguiOCLFactory.getExpression(69,
					TouchoscguiPackage.eINSTANCE.getTouchOscXYPad(), null)
					.evaluate(instance);
			instance.setInverted_y(((Boolean) value_1).booleanValue());
			Object value_2 = TouchoscguiOCLFactory.getExpression(70,
					TouchoscguiPackage.eINSTANCE.getTouchOscXYPad(), null)
					.evaluate(instance);
			instance.setType((String) value_2);
			Object value_3 = TouchoscguiOCLFactory.getExpression(71,
					TouchoscguiPackage.eINSTANCE.getTouchOscXYPad(), null)
					.evaluate(instance);

			value_3 = TouchoscguiAbstractExpression.performCast(value_3,
					EcorePackage.eINSTANCE.getEInt());
			instance.setX(((Integer) value_3).intValue());
			Object value_4 = TouchoscguiOCLFactory.getExpression(72,
					TouchoscguiPackage.eINSTANCE.getTouchOscXYPad(), null)
					.evaluate(instance);

			value_4 = TouchoscguiAbstractExpression.performCast(value_4,
					EcorePackage.eINSTANCE.getEInt());
			instance.setY(((Integer) value_4).intValue());
			Object value_5 = TouchoscguiOCLFactory.getExpression(73,
					TouchoscguiPackage.eINSTANCE.getTouchOscXYPad(), null)
					.evaluate(instance);

			value_5 = TouchoscguiAbstractExpression.performCast(value_5,
					EcorePackage.eINSTANCE.getEInt());
			instance.setW(((Integer) value_5).intValue());
			Object value_6 = TouchoscguiOCLFactory.getExpression(74,
					TouchoscguiPackage.eINSTANCE.getTouchOscXYPad(), null)
					.evaluate(instance);

			value_6 = TouchoscguiAbstractExpression.performCast(value_6,
					EcorePackage.eINSTANCE.getEInt());
			instance.setH(((Integer) value_6).intValue());
			Object value_7 = TouchoscguiOCLFactory.getExpression(75,
					TouchoscguiPackage.eINSTANCE.getTouchOscXYPad(), null)
					.evaluate(instance);
			instance.setFg((String) value_7);
			Object value_8 = TouchoscguiOCLFactory.getExpression(76,
					TouchoscguiPackage.eINSTANCE.getTouchOscXYPad(), null)
					.evaluate(instance);
			instance.setResponse((String) value_8);
		} catch (RuntimeException e) {
			TouchoscguiDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_TouchOscToggle_3011(TouchOscToggle instance) {
		try {
			Object value_0 = TouchoscguiOCLFactory.getExpression(77,
					TouchoscguiPackage.eINSTANCE.getTouchOscToggle(), null)
					.evaluate(instance);
			instance.setType((String) value_0);
			Object value_1 = TouchoscguiOCLFactory.getExpression(78,
					TouchoscguiPackage.eINSTANCE.getTouchOscToggle(), null)
					.evaluate(instance);

			value_1 = TouchoscguiAbstractExpression.performCast(value_1,
					EcorePackage.eINSTANCE.getEInt());
			instance.setX(((Integer) value_1).intValue());
			Object value_2 = TouchoscguiOCLFactory.getExpression(79,
					TouchoscguiPackage.eINSTANCE.getTouchOscToggle(), null)
					.evaluate(instance);

			value_2 = TouchoscguiAbstractExpression.performCast(value_2,
					EcorePackage.eINSTANCE.getEInt());
			instance.setY(((Integer) value_2).intValue());
			Object value_3 = TouchoscguiOCLFactory.getExpression(80,
					TouchoscguiPackage.eINSTANCE.getTouchOscToggle(), null)
					.evaluate(instance);

			value_3 = TouchoscguiAbstractExpression.performCast(value_3,
					EcorePackage.eINSTANCE.getEInt());
			instance.setW(((Integer) value_3).intValue());
			Object value_4 = TouchoscguiOCLFactory.getExpression(81,
					TouchoscguiPackage.eINSTANCE.getTouchOscToggle(), null)
					.evaluate(instance);

			value_4 = TouchoscguiAbstractExpression.performCast(value_4,
					EcorePackage.eINSTANCE.getEInt());
			instance.setH(((Integer) value_4).intValue());
			Object value_5 = TouchoscguiOCLFactory.getExpression(82,
					TouchoscguiPackage.eINSTANCE.getTouchOscToggle(), null)
					.evaluate(instance);
			instance.setFg((String) value_5);
			Object value_6 = TouchoscguiOCLFactory.getExpression(83,
					TouchoscguiPackage.eINSTANCE.getTouchOscToggle(), null)
					.evaluate(instance);
			instance.setResponse((String) value_6);
		} catch (RuntimeException e) {
			TouchoscguiDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_TouchOscTimeH_3012(TouchOscTimeH instance) {
		try {
			Object value_0 = TouchoscguiOCLFactory.getExpression(84,
					TouchoscguiPackage.eINSTANCE.getTouchOscTimeH(), null)
					.evaluate(instance);
			instance.setType((String) value_0);
			Object value_1 = TouchoscguiOCLFactory.getExpression(85,
					TouchoscguiPackage.eINSTANCE.getTouchOscTimeH(), null)
					.evaluate(instance);

			value_1 = TouchoscguiAbstractExpression.performCast(value_1,
					EcorePackage.eINSTANCE.getEInt());
			instance.setX(((Integer) value_1).intValue());
			Object value_2 = TouchoscguiOCLFactory.getExpression(86,
					TouchoscguiPackage.eINSTANCE.getTouchOscTimeH(), null)
					.evaluate(instance);

			value_2 = TouchoscguiAbstractExpression.performCast(value_2,
					EcorePackage.eINSTANCE.getEInt());
			instance.setY(((Integer) value_2).intValue());
			Object value_3 = TouchoscguiOCLFactory.getExpression(87,
					TouchoscguiPackage.eINSTANCE.getTouchOscTimeH(), null)
					.evaluate(instance);

			value_3 = TouchoscguiAbstractExpression.performCast(value_3,
					EcorePackage.eINSTANCE.getEInt());
			instance.setW(((Integer) value_3).intValue());
			Object value_4 = TouchoscguiOCLFactory.getExpression(88,
					TouchoscguiPackage.eINSTANCE.getTouchOscTimeH(), null)
					.evaluate(instance);

			value_4 = TouchoscguiAbstractExpression.performCast(value_4,
					EcorePackage.eINSTANCE.getEInt());
			instance.setH(((Integer) value_4).intValue());
			Object value_5 = TouchoscguiOCLFactory.getExpression(89,
					TouchoscguiPackage.eINSTANCE.getTouchOscTimeH(), null)
					.evaluate(instance);
			instance.setFg((String) value_5);
			Object value_6 = TouchoscguiOCLFactory.getExpression(90,
					TouchoscguiPackage.eINSTANCE.getTouchOscTimeH(), null)
					.evaluate(instance);

			value_6 = TouchoscguiAbstractExpression.performCast(value_6,
					EcorePackage.eINSTANCE.getEInt());
			instance.setSize(((Integer) value_6).intValue());
			Object value_7 = TouchoscguiOCLFactory.getExpression(91,
					TouchoscguiPackage.eINSTANCE.getTouchOscTimeH(), null)
					.evaluate(instance);
			instance.setBackground(((Boolean) value_7).booleanValue());
			Object value_8 = TouchoscguiOCLFactory.getExpression(92,
					TouchoscguiPackage.eINSTANCE.getTouchOscTimeH(), null)
					.evaluate(instance);
			instance.setOutline(((Boolean) value_8).booleanValue());
		} catch (RuntimeException e) {
			TouchoscguiDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_TouchOscTimeV_3013(TouchOscTimeV instance) {
		try {
			Object value_0 = TouchoscguiOCLFactory.getExpression(93,
					TouchoscguiPackage.eINSTANCE.getTouchOscTimeV(), null)
					.evaluate(instance);
			instance.setType((String) value_0);
			Object value_1 = TouchoscguiOCLFactory.getExpression(94,
					TouchoscguiPackage.eINSTANCE.getTouchOscTimeV(), null)
					.evaluate(instance);

			value_1 = TouchoscguiAbstractExpression.performCast(value_1,
					EcorePackage.eINSTANCE.getEInt());
			instance.setX(((Integer) value_1).intValue());
			Object value_2 = TouchoscguiOCLFactory.getExpression(95,
					TouchoscguiPackage.eINSTANCE.getTouchOscTimeV(), null)
					.evaluate(instance);

			value_2 = TouchoscguiAbstractExpression.performCast(value_2,
					EcorePackage.eINSTANCE.getEInt());
			instance.setY(((Integer) value_2).intValue());
			Object value_3 = TouchoscguiOCLFactory.getExpression(96,
					TouchoscguiPackage.eINSTANCE.getTouchOscTimeV(), null)
					.evaluate(instance);

			value_3 = TouchoscguiAbstractExpression.performCast(value_3,
					EcorePackage.eINSTANCE.getEInt());
			instance.setW(((Integer) value_3).intValue());
			Object value_4 = TouchoscguiOCLFactory.getExpression(97,
					TouchoscguiPackage.eINSTANCE.getTouchOscTimeV(), null)
					.evaluate(instance);

			value_4 = TouchoscguiAbstractExpression.performCast(value_4,
					EcorePackage.eINSTANCE.getEInt());
			instance.setH(((Integer) value_4).intValue());
			Object value_5 = TouchoscguiOCLFactory.getExpression(98,
					TouchoscguiPackage.eINSTANCE.getTouchOscTimeV(), null)
					.evaluate(instance);
			instance.setFg((String) value_5);
			Object value_6 = TouchoscguiOCLFactory.getExpression(99,
					TouchoscguiPackage.eINSTANCE.getTouchOscTimeV(), null)
					.evaluate(instance);

			value_6 = TouchoscguiAbstractExpression.performCast(value_6,
					EcorePackage.eINSTANCE.getEInt());
			instance.setSize(((Integer) value_6).intValue());
			Object value_7 = TouchoscguiOCLFactory.getExpression(100,
					TouchoscguiPackage.eINSTANCE.getTouchOscTimeV(), null)
					.evaluate(instance);
			instance.setBackground(((Boolean) value_7).booleanValue());
			Object value_8 = TouchoscguiOCLFactory.getExpression(101,
					TouchoscguiPackage.eINSTANCE.getTouchOscTimeV(), null)
					.evaluate(instance);
			instance.setOutline(((Boolean) value_8).booleanValue());
		} catch (RuntimeException e) {
			TouchoscguiDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_TouchOscEncoder_3014(TouchOscEncoder instance) {
		try {
			Object value_0 = TouchoscguiOCLFactory.getExpression(102,
					TouchoscguiPackage.eINSTANCE.getTouchOscEncoder(), null)
					.evaluate(instance);
			instance.setCentered(((Boolean) value_0).booleanValue());
			Object value_1 = TouchoscguiOCLFactory.getExpression(103,
					TouchoscguiPackage.eINSTANCE.getTouchOscEncoder(), null)
					.evaluate(instance);
			instance.setType((String) value_1);
			Object value_2 = TouchoscguiOCLFactory.getExpression(104,
					TouchoscguiPackage.eINSTANCE.getTouchOscEncoder(), null)
					.evaluate(instance);

			value_2 = TouchoscguiAbstractExpression.performCast(value_2,
					EcorePackage.eINSTANCE.getEInt());
			instance.setX(((Integer) value_2).intValue());
			Object value_3 = TouchoscguiOCLFactory.getExpression(105,
					TouchoscguiPackage.eINSTANCE.getTouchOscEncoder(), null)
					.evaluate(instance);

			value_3 = TouchoscguiAbstractExpression.performCast(value_3,
					EcorePackage.eINSTANCE.getEInt());
			instance.setY(((Integer) value_3).intValue());
			Object value_4 = TouchoscguiOCLFactory.getExpression(106,
					TouchoscguiPackage.eINSTANCE.getTouchOscEncoder(), null)
					.evaluate(instance);

			value_4 = TouchoscguiAbstractExpression.performCast(value_4,
					EcorePackage.eINSTANCE.getEInt());
			instance.setW(((Integer) value_4).intValue());
			Object value_5 = TouchoscguiOCLFactory.getExpression(107,
					TouchoscguiPackage.eINSTANCE.getTouchOscEncoder(), null)
					.evaluate(instance);

			value_5 = TouchoscguiAbstractExpression.performCast(value_5,
					EcorePackage.eINSTANCE.getEInt());
			instance.setH(((Integer) value_5).intValue());
			Object value_6 = TouchoscguiOCLFactory.getExpression(108,
					TouchoscguiPackage.eINSTANCE.getTouchOscEncoder(), null)
					.evaluate(instance);
			instance.setFg((String) value_6);
			Object value_7 = TouchoscguiOCLFactory.getExpression(109,
					TouchoscguiPackage.eINSTANCE.getTouchOscEncoder(), null)
					.evaluate(instance);
			instance.setResponse((String) value_7);
		} catch (RuntimeException e) {
			TouchoscguiDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_TouchOscBatteryH_3015(TouchOscBatteryH instance) {
		try {
			Object value_0 = TouchoscguiOCLFactory.getExpression(110,
					TouchoscguiPackage.eINSTANCE.getTouchOscBatteryH(), null)
					.evaluate(instance);
			instance.setType((String) value_0);
			Object value_1 = TouchoscguiOCLFactory.getExpression(111,
					TouchoscguiPackage.eINSTANCE.getTouchOscBatteryH(), null)
					.evaluate(instance);

			value_1 = TouchoscguiAbstractExpression.performCast(value_1,
					EcorePackage.eINSTANCE.getEInt());
			instance.setX(((Integer) value_1).intValue());
			Object value_2 = TouchoscguiOCLFactory.getExpression(112,
					TouchoscguiPackage.eINSTANCE.getTouchOscBatteryH(), null)
					.evaluate(instance);

			value_2 = TouchoscguiAbstractExpression.performCast(value_2,
					EcorePackage.eINSTANCE.getEInt());
			instance.setY(((Integer) value_2).intValue());
			Object value_3 = TouchoscguiOCLFactory.getExpression(113,
					TouchoscguiPackage.eINSTANCE.getTouchOscBatteryH(), null)
					.evaluate(instance);

			value_3 = TouchoscguiAbstractExpression.performCast(value_3,
					EcorePackage.eINSTANCE.getEInt());
			instance.setW(((Integer) value_3).intValue());
			Object value_4 = TouchoscguiOCLFactory.getExpression(114,
					TouchoscguiPackage.eINSTANCE.getTouchOscBatteryH(), null)
					.evaluate(instance);

			value_4 = TouchoscguiAbstractExpression.performCast(value_4,
					EcorePackage.eINSTANCE.getEInt());
			instance.setH(((Integer) value_4).intValue());
			Object value_5 = TouchoscguiOCLFactory.getExpression(115,
					TouchoscguiPackage.eINSTANCE.getTouchOscBatteryH(), null)
					.evaluate(instance);
			instance.setFg((String) value_5);
			Object value_6 = TouchoscguiOCLFactory.getExpression(116,
					TouchoscguiPackage.eINSTANCE.getTouchOscBatteryH(), null)
					.evaluate(instance);

			value_6 = TouchoscguiAbstractExpression.performCast(value_6,
					EcorePackage.eINSTANCE.getEInt());
			instance.setSize(((Integer) value_6).intValue());
			Object value_7 = TouchoscguiOCLFactory.getExpression(117,
					TouchoscguiPackage.eINSTANCE.getTouchOscBatteryH(), null)
					.evaluate(instance);
			instance.setBackground(((Boolean) value_7).booleanValue());
			Object value_8 = TouchoscguiOCLFactory.getExpression(118,
					TouchoscguiPackage.eINSTANCE.getTouchOscBatteryH(), null)
					.evaluate(instance);
			instance.setOutline(((Boolean) value_8).booleanValue());
		} catch (RuntimeException e) {
			TouchoscguiDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_TouchOscBatteryV_3016(TouchOscBatteryV instance) {
		try {
			Object value_0 = TouchoscguiOCLFactory.getExpression(119,
					TouchoscguiPackage.eINSTANCE.getTouchOscBatteryV(), null)
					.evaluate(instance);
			instance.setType((String) value_0);
			Object value_1 = TouchoscguiOCLFactory.getExpression(120,
					TouchoscguiPackage.eINSTANCE.getTouchOscBatteryV(), null)
					.evaluate(instance);

			value_1 = TouchoscguiAbstractExpression.performCast(value_1,
					EcorePackage.eINSTANCE.getEInt());
			instance.setX(((Integer) value_1).intValue());
			Object value_2 = TouchoscguiOCLFactory.getExpression(121,
					TouchoscguiPackage.eINSTANCE.getTouchOscBatteryV(), null)
					.evaluate(instance);

			value_2 = TouchoscguiAbstractExpression.performCast(value_2,
					EcorePackage.eINSTANCE.getEInt());
			instance.setY(((Integer) value_2).intValue());
			Object value_3 = TouchoscguiOCLFactory.getExpression(122,
					TouchoscguiPackage.eINSTANCE.getTouchOscBatteryV(), null)
					.evaluate(instance);

			value_3 = TouchoscguiAbstractExpression.performCast(value_3,
					EcorePackage.eINSTANCE.getEInt());
			instance.setW(((Integer) value_3).intValue());
			Object value_4 = TouchoscguiOCLFactory.getExpression(123,
					TouchoscguiPackage.eINSTANCE.getTouchOscBatteryV(), null)
					.evaluate(instance);

			value_4 = TouchoscguiAbstractExpression.performCast(value_4,
					EcorePackage.eINSTANCE.getEInt());
			instance.setH(((Integer) value_4).intValue());
			Object value_5 = TouchoscguiOCLFactory.getExpression(124,
					TouchoscguiPackage.eINSTANCE.getTouchOscBatteryV(), null)
					.evaluate(instance);
			instance.setFg((String) value_5);
			Object value_6 = TouchoscguiOCLFactory.getExpression(125,
					TouchoscguiPackage.eINSTANCE.getTouchOscBatteryV(), null)
					.evaluate(instance);

			value_6 = TouchoscguiAbstractExpression.performCast(value_6,
					EcorePackage.eINSTANCE.getEInt());
			instance.setSize(((Integer) value_6).intValue());
			Object value_7 = TouchoscguiOCLFactory.getExpression(126,
					TouchoscguiPackage.eINSTANCE.getTouchOscBatteryV(), null)
					.evaluate(instance);
			instance.setBackground(((Boolean) value_7).booleanValue());
			Object value_8 = TouchoscguiOCLFactory.getExpression(127,
					TouchoscguiPackage.eINSTANCE.getTouchOscBatteryV(), null)
					.evaluate(instance);
			instance.setOutline(((Boolean) value_8).booleanValue());
		} catch (RuntimeException e) {
			TouchoscguiDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_TouchOscMultiFaderH_3017(TouchOscMultiFaderH instance) {
		try {
			Object value_0 = TouchoscguiOCLFactory
					.getExpression(
							128,
							TouchoscguiPackage.eINSTANCE
									.getTouchOscMultiFaderH(), null).evaluate(
							instance);

			value_0 = TouchoscguiAbstractExpression.performCast(value_0,
					EcorePackage.eINSTANCE.getEInt());
			instance.setNumber(((Integer) value_0).intValue());
			Object value_1 = TouchoscguiOCLFactory
					.getExpression(
							129,
							TouchoscguiPackage.eINSTANCE
									.getTouchOscMultiFaderH(), null).evaluate(
							instance);
			instance.setType((String) value_1);
			Object value_2 = TouchoscguiOCLFactory
					.getExpression(
							130,
							TouchoscguiPackage.eINSTANCE
									.getTouchOscMultiFaderH(), null).evaluate(
							instance);

			value_2 = TouchoscguiAbstractExpression.performCast(value_2,
					EcorePackage.eINSTANCE.getEInt());
			instance.setX(((Integer) value_2).intValue());
			Object value_3 = TouchoscguiOCLFactory
					.getExpression(
							131,
							TouchoscguiPackage.eINSTANCE
									.getTouchOscMultiFaderH(), null).evaluate(
							instance);

			value_3 = TouchoscguiAbstractExpression.performCast(value_3,
					EcorePackage.eINSTANCE.getEInt());
			instance.setY(((Integer) value_3).intValue());
			Object value_4 = TouchoscguiOCLFactory
					.getExpression(
							132,
							TouchoscguiPackage.eINSTANCE
									.getTouchOscMultiFaderH(), null).evaluate(
							instance);

			value_4 = TouchoscguiAbstractExpression.performCast(value_4,
					EcorePackage.eINSTANCE.getEInt());
			instance.setW(((Integer) value_4).intValue());
			Object value_5 = TouchoscguiOCLFactory
					.getExpression(
							133,
							TouchoscguiPackage.eINSTANCE
									.getTouchOscMultiFaderH(), null).evaluate(
							instance);

			value_5 = TouchoscguiAbstractExpression.performCast(value_5,
					EcorePackage.eINSTANCE.getEInt());
			instance.setH(((Integer) value_5).intValue());
			Object value_6 = TouchoscguiOCLFactory
					.getExpression(
							134,
							TouchoscguiPackage.eINSTANCE
									.getTouchOscMultiFaderH(), null).evaluate(
							instance);
			instance.setFg((String) value_6);
			Object value_7 = TouchoscguiOCLFactory
					.getExpression(
							135,
							TouchoscguiPackage.eINSTANCE
									.getTouchOscMultiFaderH(), null).evaluate(
							instance);
			instance.setResponse((String) value_7);
		} catch (RuntimeException e) {
			TouchoscguiDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_TouchOscMultiFaderV_3018(TouchOscMultiFaderV instance) {
		try {
			Object value_0 = TouchoscguiOCLFactory
					.getExpression(
							136,
							TouchoscguiPackage.eINSTANCE
									.getTouchOscMultiFaderV(), null).evaluate(
							instance);

			value_0 = TouchoscguiAbstractExpression.performCast(value_0,
					EcorePackage.eINSTANCE.getEInt());
			instance.setNumber(((Integer) value_0).intValue());
			Object value_1 = TouchoscguiOCLFactory
					.getExpression(
							137,
							TouchoscguiPackage.eINSTANCE
									.getTouchOscMultiFaderV(), null).evaluate(
							instance);
			instance.setType((String) value_1);
			Object value_2 = TouchoscguiOCLFactory
					.getExpression(
							138,
							TouchoscguiPackage.eINSTANCE
									.getTouchOscMultiFaderV(), null).evaluate(
							instance);

			value_2 = TouchoscguiAbstractExpression.performCast(value_2,
					EcorePackage.eINSTANCE.getEInt());
			instance.setX(((Integer) value_2).intValue());
			Object value_3 = TouchoscguiOCLFactory
					.getExpression(
							139,
							TouchoscguiPackage.eINSTANCE
									.getTouchOscMultiFaderV(), null).evaluate(
							instance);

			value_3 = TouchoscguiAbstractExpression.performCast(value_3,
					EcorePackage.eINSTANCE.getEInt());
			instance.setY(((Integer) value_3).intValue());
			Object value_4 = TouchoscguiOCLFactory
					.getExpression(
							140,
							TouchoscguiPackage.eINSTANCE
									.getTouchOscMultiFaderV(), null).evaluate(
							instance);

			value_4 = TouchoscguiAbstractExpression.performCast(value_4,
					EcorePackage.eINSTANCE.getEInt());
			instance.setW(((Integer) value_4).intValue());
			Object value_5 = TouchoscguiOCLFactory
					.getExpression(
							141,
							TouchoscguiPackage.eINSTANCE
									.getTouchOscMultiFaderV(), null).evaluate(
							instance);

			value_5 = TouchoscguiAbstractExpression.performCast(value_5,
					EcorePackage.eINSTANCE.getEInt());
			instance.setH(((Integer) value_5).intValue());
			Object value_6 = TouchoscguiOCLFactory
					.getExpression(
							142,
							TouchoscguiPackage.eINSTANCE
									.getTouchOscMultiFaderV(), null).evaluate(
							instance);
			instance.setFg((String) value_6);
			Object value_7 = TouchoscguiOCLFactory
					.getExpression(
							143,
							TouchoscguiPackage.eINSTANCE
									.getTouchOscMultiFaderV(), null).evaluate(
							instance);
			instance.setResponse((String) value_7);
		} catch (RuntimeException e) {
			TouchoscguiDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_TouchOscMultiPush_3019(TouchOscMultiPush instance) {
		try {
			Object value_0 = TouchoscguiOCLFactory.getExpression(144,
					TouchoscguiPackage.eINSTANCE.getTouchOscMultiPush(), null)
					.evaluate(instance);

			value_0 = TouchoscguiAbstractExpression.performCast(value_0,
					EcorePackage.eINSTANCE.getEInt());
			instance.setNumber_x(((Integer) value_0).intValue());
			Object value_1 = TouchoscguiOCLFactory.getExpression(145,
					TouchoscguiPackage.eINSTANCE.getTouchOscMultiPush(), null)
					.evaluate(instance);

			value_1 = TouchoscguiAbstractExpression.performCast(value_1,
					EcorePackage.eINSTANCE.getEInt());
			instance.setNumber_y(((Integer) value_1).intValue());
			Object value_2 = TouchoscguiOCLFactory.getExpression(146,
					TouchoscguiPackage.eINSTANCE.getTouchOscMultiPush(), null)
					.evaluate(instance);
			instance.setType((String) value_2);
			Object value_3 = TouchoscguiOCLFactory.getExpression(147,
					TouchoscguiPackage.eINSTANCE.getTouchOscMultiPush(), null)
					.evaluate(instance);

			value_3 = TouchoscguiAbstractExpression.performCast(value_3,
					EcorePackage.eINSTANCE.getEInt());
			instance.setX(((Integer) value_3).intValue());
			Object value_4 = TouchoscguiOCLFactory.getExpression(148,
					TouchoscguiPackage.eINSTANCE.getTouchOscMultiPush(), null)
					.evaluate(instance);

			value_4 = TouchoscguiAbstractExpression.performCast(value_4,
					EcorePackage.eINSTANCE.getEInt());
			instance.setY(((Integer) value_4).intValue());
			Object value_5 = TouchoscguiOCLFactory.getExpression(149,
					TouchoscguiPackage.eINSTANCE.getTouchOscMultiPush(), null)
					.evaluate(instance);

			value_5 = TouchoscguiAbstractExpression.performCast(value_5,
					EcorePackage.eINSTANCE.getEInt());
			instance.setW(((Integer) value_5).intValue());
			Object value_6 = TouchoscguiOCLFactory.getExpression(150,
					TouchoscguiPackage.eINSTANCE.getTouchOscMultiPush(), null)
					.evaluate(instance);

			value_6 = TouchoscguiAbstractExpression.performCast(value_6,
					EcorePackage.eINSTANCE.getEInt());
			instance.setH(((Integer) value_6).intValue());
			Object value_7 = TouchoscguiOCLFactory.getExpression(151,
					TouchoscguiPackage.eINSTANCE.getTouchOscMultiPush(), null)
					.evaluate(instance);
			instance.setFg((String) value_7);
			Object value_8 = TouchoscguiOCLFactory.getExpression(152,
					TouchoscguiPackage.eINSTANCE.getTouchOscMultiPush(), null)
					.evaluate(instance);
			instance.setResponse((String) value_8);
		} catch (RuntimeException e) {
			TouchoscguiDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = TouchoscguiDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			TouchoscguiDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
