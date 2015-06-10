/*******************************************************************************
 * Copyright (c) 2008 Lucas Bigeardel and others. All rights reserved. This program
 * and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is
 * available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * GenModelSearchParticipantArea.java
 * 
 * Contributors: 
 * 		Lucas Bigeardel - initial API and implementation
 * 
 ******************************************************************************/

package net.sf.smbt.search.touchosc.ui.areas;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import net.sf.smbt.search.touchosc.ui.Activator;
import net.sf.smbt.search.touchosc.ui.providers.TouchOSCControlMetaModelParticipantsItemProvider;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscControl;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchoscguiPackage;
import net.sf.smbt.touchosc.ui.touchoscgui.provider.TouchoscguiEditPlugin;
import net.sf.smbt.touchosc.ui.touchoscgui.provider.TouchoscguiItemProviderAdapterFactory;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.provider.EcoreEditPlugin;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.search.ui.areas.AbstractModelSearchParticipantArea;
import org.eclipse.emf.search.ui.pages.AbstractModelSearchPage;
import org.eclipse.emf.search.ui.providers.AbstractMetaModelParticipantsItemProvider;
import org.eclipse.emf.search.utils.ModelSearchImagesUtil;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;

public final class TouchOSCControlSearchParticipantArea extends AbstractModelSearchParticipantArea {
	public TouchOSCControlSearchParticipantArea(Composite parent, AbstractModelSearchPage page, int style) {
		super(parent, page, style);
		createContent();
	}
	
	@Override
	protected boolean getDefaultParticpantsControlEnabling() {
		return false;
	}
	public List<AdapterFactory> getMetaElementComposeableAdapterFactories() {
		List<AdapterFactory> composeableAdapterFactories = new ArrayList<AdapterFactory>();

		composeableAdapterFactories.add(new TouchoscguiItemProviderAdapterFactory());
		composeableAdapterFactories.add(new ResourceItemProviderAdapterFactory());
		composeableAdapterFactories.add(new ReflectiveItemProviderAdapterFactory());
		
		return composeableAdapterFactories;
	}
	@Override
	public AbstractMetaModelParticipantsItemProvider getMetaModelParticipantsItemProvider() {
		return new TouchOSCControlMetaModelParticipantsItemProvider();
	}
	public Collection<String> getTargetMetaModelIDs() {
		return Arrays.asList(new String[] { TouchoscguiPackage.eINSTANCE.getNsURI() });
	}
	public EPackage getEPackage() {
		return TouchoscguiPackage.eINSTANCE;
	}
	@Override
	protected String getTargetModelElementText(Object object) {
		return object instanceof TouchOscControl ? ((ENamedElement)((TouchOscControl)object)).getName() : null;
	}
	@Override
	protected Image getTargetModelElementImage(Object object) {
		try {
			if (object instanceof ENamedElement) {
				String imagePath = "/icons/full/obj16/E" + ((ENamedElement)object).getName().substring(3) + ".gif"; //$NON-NLS-1$  //$NON-NLS-2$
				URL url = FileLocator.find(EcoreEditPlugin.getPlugin().getBundle(), new Path(imagePath), null);
				if (url != null) {
					return ModelSearchImagesUtil.getImage(url);
				}
			}
		} catch (Throwable t) {
			Activator.getDefault().getLog().log(new Status(Status.ERROR, net.sf.smbt.search.ui.Activator.PLUGIN_ID, "Error while attempmting to retrieve image from edit" + TouchoscguiEditPlugin.getPlugin().getBundle() + " bundle")); //$NON-NLS-1$  //$NON-NLS-2$
		} 
		return null;
	}
}
