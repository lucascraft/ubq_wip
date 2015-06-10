package net.sf.smbt.jazzmutant.diagram.properties.breakpoint.osc;

import net.sf.smbt.jzmui.JzmuiPackage;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecoretools.tabbedproperties.sections.AbstractReferencePropertySection;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;

public class JZUIBreakPointOSCSection extends AbstractReferencePropertySection {

	@Override
	protected Object getListValues() {
		return null;
	}

	@Override
	protected IBaseLabelProvider getLabelProvider() {
		return new LabelProvider();
	}

	@Override
	protected EStructuralFeature getFeature() {
		return JzmuiPackage.Literals.JZUI_ELEM__OSC_PROPS;
	}

	@Override
	protected String getLabelText() {
		// TODO Auto-generated method stub
		return "OSC";
	}

}
