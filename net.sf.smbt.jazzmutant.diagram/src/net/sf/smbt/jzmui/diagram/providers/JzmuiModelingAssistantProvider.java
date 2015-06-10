package net.sf.smbt.jzmui.diagram.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import net.sf.smbt.jzmui.diagram.edit.parts.JZContainerEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZJazzInterfaceEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZJazzInterfaceJZJazzInterfaceCompartmentEditPart;
import net.sf.smbt.jzmui.diagram.part.JzmuiDiagramEditorPlugin;
import net.sf.smbt.jzmui.diagram.part.Messages;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

/**
 * @generated
 */
public class JzmuiModelingAssistantProvider extends ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof JZJazzInterfaceEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(JzmuiElementTypes.JZJazzInterface_2001);
			return types;
		}
		if (editPart instanceof JZContainerEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(19);
			types.add(JzmuiElementTypes.JZBreakPoint_3003);
			types.add(JzmuiElementTypes.JZContainer_3004);
			types.add(JzmuiElementTypes.JZCustomButton_3005);
			types.add(JzmuiElementTypes.JZFader_3006);
			types.add(JzmuiElementTypes.JZGesture_3007);
			types.add(JzmuiElementTypes.JZKnob_3008);
			types.add(JzmuiElementTypes.JZLed_3009);
			types.add(JzmuiElementTypes.JZLemurMenu_3010);
			types.add(JzmuiElementTypes.JZLemurMonitor_3011);
			types.add(JzmuiElementTypes.JZMultiBalls_3012);
			types.add(JzmuiElementTypes.JZPads_3013);
			types.add(JzmuiElementTypes.JZRange_3014);
			types.add(JzmuiElementTypes.JZRingArea_3015);
			types.add(JzmuiElementTypes.JZSignalScope_3016);
			types.add(JzmuiElementTypes.JZSurfaceLCD_3017);
			types.add(JzmuiElementTypes.JZSwitches_3018);
			types.add(JzmuiElementTypes.JZText_3019);
			types.add(JzmuiElementTypes.JZTrack_3020);
			types.add(JzmuiElementTypes.JZmultiSlider_3021);
			return types;
		}
		if (editPart instanceof JZJazzInterfaceJZJazzInterfaceCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(19);
			types.add(JzmuiElementTypes.JZBreakPoint_3001);
			types.add(JzmuiElementTypes.JZContainer_3002);
			types.add(JzmuiElementTypes.JZCustomButton_3022);
			types.add(JzmuiElementTypes.JZFader_3023);
			types.add(JzmuiElementTypes.JZGesture_3024);
			types.add(JzmuiElementTypes.JZKnob_3025);
			types.add(JzmuiElementTypes.JZLed_3026);
			types.add(JzmuiElementTypes.JZLemurMenu_3027);
			types.add(JzmuiElementTypes.JZLemurMonitor_3028);
			types.add(JzmuiElementTypes.JZMultiBalls_3029);
			types.add(JzmuiElementTypes.JZmultiSlider_3030);
			types.add(JzmuiElementTypes.JZPads_3031);
			types.add(JzmuiElementTypes.JZRange_3032);
			types.add(JzmuiElementTypes.JZRingArea_3033);
			types.add(JzmuiElementTypes.JZSignalScope_3034);
			types.add(JzmuiElementTypes.JZSurfaceLCD_3035);
			types.add(JzmuiElementTypes.JZSwitches_3036);
			types.add(JzmuiElementTypes.JZText_3037);
			types.add(JzmuiElementTypes.JZTrack_3038);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target,
			IElementType relationshipType) {
		return selectExistingElement(target,
				getTypesForSource(target, relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source,
			IElementType relationshipType) {
		return selectExistingElement(source,
				getTypesForTarget(source, relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		HashSet<EObject> elements = new HashSet<EObject>();
		for (Iterator<EObject> it = diagram.getElement().eAllContents(); it
				.hasNext();) {
			EObject element = it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements
				.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(
				element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(
				JzmuiDiagramEditorPlugin.getInstance()
						.getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage(Messages.JzmuiModelingAssistantProviderMessage);
		dialog.setTitle(Messages.JzmuiModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
