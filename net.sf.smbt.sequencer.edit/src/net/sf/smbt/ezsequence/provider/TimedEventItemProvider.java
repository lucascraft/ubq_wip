/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezsequence.provider;


import java.util.Collection;
import java.util.List;

import net.sf.smbt.dmx.model.ezdmx.EzdmxFactory;
import net.sf.smbt.ezmojo.EzmojoFactory;
import net.sf.smbt.ezsequence.EzsequenceFactory;
import net.sf.smbt.ezsequence.EzsequencePackage;
import net.sf.smbt.ezsequence.TimedEvent;
import net.sf.smbt.midi.ezmidi.EzmidiFactory;
import net.sf.smbt.osc.eztuio2.Eztuio2Factory;
import net.sf.smbt.osccmd.OsccmdFactory;
import net.sf.smbt.sequencer.diagram.properties.TimedEventCustomItemPropertyDescriptor;
import net.sf.xqz.model.cmd.CmdFactory;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.sf.smbt.ezsequence.TimedEvent} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TimedEventItemProvider
	extends TimedObjItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedEventItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);
			
			itemPropertyDescriptors.add(
				new TimedEventCustomItemPropertyDescriptor(
					adapterFactory, 
					"Commands", 
					"Timed event related commands", 
					EzsequencePackage.Literals.TIMED_EVENT__COMMAND, 
					true
				)
			);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Trigger feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTriggerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TimedEvent_trigger_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TimedEvent_trigger_feature", "_UI_TimedEvent_type"),
				 EzsequencePackage.Literals.TIMED_EVENT__TRIGGER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(EzsequencePackage.Literals.TIMED_EVENT__SCRIPT);
			childrenFeatures.add(EzsequencePackage.Literals.TIMED_EVENT__COMMAND);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns TimedEvent.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TimedEvent"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		TimedEvent timedEvent = (TimedEvent)object;
		return getString("_UI_TimedEvent_type") + " " + timedEvent.getTime();
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(TimedEvent.class)) {
			case EzsequencePackage.TIMED_EVENT__SCRIPT:
			case EzsequencePackage.TIMED_EVENT__COMMAND:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__SCRIPT,
				 EzsequenceFactory.eINSTANCE.createScript()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 EzmidiFactory.eINSTANCE.createDSLMidiMessage()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 EzmidiFactory.eINSTANCE.createSysexMessage()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 EzmidiFactory.eINSTANCE.createSysexGSReset()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 EzmidiFactory.eINSTANCE.createSysexPatchChanged()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 EzmidiFactory.eINSTANCE.createNoteON()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 EzmidiFactory.eINSTANCE.createNoteOFF()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 EzmidiFactory.eINSTANCE.createKeyPressure()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 EzmidiFactory.eINSTANCE.createControllerChange()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 EzmidiFactory.eINSTANCE.createProgramChange()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 EzmidiFactory.eINSTANCE.createChannelPressure()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 EzmidiFactory.eINSTANCE.createPitchBend()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 EzmidiFactory.eINSTANCE.createSystemExclusive()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 EzmidiFactory.eINSTANCE.createSongPosition()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 EzmidiFactory.eINSTANCE.createSongSelect()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 EzmidiFactory.eINSTANCE.createUnofficialBusSelect()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 EzmidiFactory.eINSTANCE.createTuneRequest()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 EzmidiFactory.eINSTANCE.createEndOfExclusive()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 EzmidiFactory.eINSTANCE.createTimingTick()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 EzmidiFactory.eINSTANCE.createStartSong()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 EzmidiFactory.eINSTANCE.createContinueSong()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 EzmidiFactory.eINSTANCE.createStopSong()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 EzmidiFactory.eINSTANCE.createActiveSensing()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 EzmidiFactory.eINSTANCE.createSystemReset()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 EzmidiFactory.eINSTANCE.createMidiTimeCode()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 EzmidiFactory.eINSTANCE.createPolyPressure()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 EzmidiFactory.eINSTANCE.createTimingClock()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 EzmidiFactory.eINSTANCE.createTimeCode()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 EzdmxFactory.eINSTANCE.createOpenDMXReprogramFirmwareRequestCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 EzdmxFactory.eINSTANCE.createOpenDMXProgramFlashPageRequestCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 EzdmxFactory.eINSTANCE.createOpenDMXProgramFlashPageReply()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 EzdmxFactory.eINSTANCE.createOpenDMXGetWidgetParamRequestCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 EzdmxFactory.eINSTANCE.createOpenDMXGetWidgetParamsReplyCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 EzdmxFactory.eINSTANCE.createOpenDMXSetWidgetParamsRequestCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 EzdmxFactory.eINSTANCE.createOpenDMXReceivedPacketsCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 EzdmxFactory.eINSTANCE.createOpenDMXOutputOnlySendDMXPacketsRequestCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 EzdmxFactory.eINSTANCE.createOpenDMXSendRDMPacketCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 EzdmxFactory.eINSTANCE.createOpenDMXReceiveDMXCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 EzdmxFactory.eINSTANCE.createOpenDMXChangeOfStatePacketCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 EzdmxFactory.eINSTANCE.createOpenDMXGetWidgetSerialNumberRequestCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 EzdmxFactory.eINSTANCE.createOpenDMXGetWidgetSerialNumberReplyCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 EzdmxFactory.eINSTANCE.createOpenDMXSendRDMDiscoveryRequestCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 EzdmxFactory.eINSTANCE.createOpenDMXFade()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 EzdmxFactory.eINSTANCE.createOpenDMXFadeWithStrobe()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 EzdmxFactory.eINSTANCE.createOpenDMXFadeFull()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 EzmojoFactory.eINSTANCE.createEZMojoCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 EzmojoFactory.eINSTANCE.createEZMojoAgentCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 EzmojoFactory.eINSTANCE.createEzMojoInfoCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 EzmojoFactory.eINSTANCE.createEZMojoTargetedCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 EzmojoFactory.eINSTANCE.createEzMojoKinematicCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 EzmojoFactory.eINSTANCE.createEZMojoMappedCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 CmdFactory.eINSTANCE.createCompoundCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 CmdFactory.eINSTANCE.createXCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 OsccmdFactory.eINSTANCE.createOscCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 OsccmdFactory.eINSTANCE.createOscSndCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 OsccmdFactory.eINSTANCE.createOscRcvCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 Eztuio2Factory.eINSTANCE.createTuio2Tok()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 Eztuio2Factory.eINSTANCE.createTuio2Ptr()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 Eztuio2Factory.eINSTANCE.createTuio2Sym()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 Eztuio2Factory.eINSTANCE.createTuio2T3D()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 Eztuio2Factory.eINSTANCE.createTuio2P3D()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 Eztuio2Factory.eINSTANCE.createTuio2B3D()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 Eztuio2Factory.eINSTANCE.createTuio2CHG()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 Eztuio2Factory.eINSTANCE.createTuio2OCG()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 Eztuio2Factory.eINSTANCE.createTuio2SKG()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 Eztuio2Factory.eINSTANCE.createTuio2SVG()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 Eztuio2Factory.eINSTANCE.createTuio2ARG()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 Eztuio2Factory.eINSTANCE.createTuio2RAW()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 Eztuio2Factory.eINSTANCE.createTuio2CTL()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 Eztuio2Factory.eINSTANCE.createTuio2DAT()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 Eztuio2Factory.eINSTANCE.createTuio2SIG()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 Eztuio2Factory.eINSTANCE.createTuio2ALA()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 Eztuio2Factory.eINSTANCE.createTuio2COA()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 Eztuio2Factory.eINSTANCE.createTuio2LIA()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 Eztuio2Factory.eINSTANCE.createTuio2LLA()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 Eztuio2Factory.eINSTANCE.createTuio2LTA()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 Eztuio2Factory.eINSTANCE.createTuio2FRM()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 Eztuio2Factory.eINSTANCE.createTuio2ALV()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.TIMED_EVENT__COMMAND,
				 Eztuio2Factory.eINSTANCE.createTuio2BND()));
	}

}
