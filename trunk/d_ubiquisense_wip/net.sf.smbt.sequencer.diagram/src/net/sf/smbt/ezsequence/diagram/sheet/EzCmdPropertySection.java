package net.sf.smbt.ezsequence.diagram.sheet;

import java.util.ArrayList;
import java.util.Iterator;

import net.sf.smbt.ezsequence.TimedEvent;
import net.sf.smbt.ezsequence.diagram.edit.parts.TimedEventEditPart;
import net.sf.smbt.sequencer.diagram.properties.TimedEventCustomPropertySource;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.diagram.ui.properties.sections.AdvancedPropertySection;
import org.eclipse.gmf.runtime.notation.impl.ShapeImpl;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.IPropertySourceProvider;

/**
 * @generated
 */
public class EzCmdPropertySection extends AdvancedPropertySection implements
		IPropertySourceProvider {

	/**
	 * @generated NOT
	 */
	public IPropertySource getPropertySource(Object object) {
		if (object instanceof TimedEventEditPart) {
			Object obj = ((TimedEventEditPart)object).getModel();
			if (obj instanceof ShapeImpl) {
				if (((ShapeImpl)obj).getElement() instanceof TimedEvent) {
					AdapterFactory af = getAdapterFactory(((ShapeImpl)obj).getElement());
					if (af != null) {
						IItemPropertySource ips = (IItemPropertySource) af.adapt(((ShapeImpl)obj).getElement(), IItemPropertySource.class);
						if (ips != null) {
							return new TimedEventCustomPropertySource(((ShapeImpl)obj).getElement(), af, ips);
						}
					}
				}
			}
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected IPropertySourceProvider getPropertySourceProvider() {
		return this;
	}

	/**
	 * Modify/unwrap selection.
	 * @generated
	 */
	protected Object transformSelection(Object selected) {
		return selected;
	}

	/**
	 * @generated
	 */
	public void setInput(IWorkbenchPart part, ISelection selection) {
		if (selection.isEmpty()
				|| false == selection instanceof StructuredSelection) {
			super.setInput(part, selection);
			return;
		}
		final StructuredSelection structuredSelection = ((StructuredSelection) selection);
		ArrayList transformedSelection = new ArrayList(
				structuredSelection.size());
		for (Iterator it = structuredSelection.iterator(); it.hasNext();) {
			Object r = transformSelection(it.next());
			if (r != null) {
				transformedSelection.add(r);
			}
		}
		super.setInput(part, new StructuredSelection(transformedSelection));
	}

	/**
	 * @generated
	 */
	protected AdapterFactory getAdapterFactory(Object object) {
		if (getEditingDomain() instanceof AdapterFactoryEditingDomain) {
			return ((AdapterFactoryEditingDomain) getEditingDomain())
					.getAdapterFactory();
		}
		TransactionalEditingDomain editingDomain = TransactionUtil
				.getEditingDomain(object);
		if (editingDomain != null) {
			return ((AdapterFactoryEditingDomain) editingDomain)
					.getAdapterFactory();
		}
		return null;
	}

}
