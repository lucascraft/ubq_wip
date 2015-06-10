/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2008 - 2010, Lucas Bigeardel
 * 
 * The library is released under:
 * 
 * A) LGPL
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General
 * Public License along with this library; if not, write to the
 * Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor,
 * Boston, MA 02110-1301 USA
 * 
 * B) EPL
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Lucas Bigeardel <lucas.bigeardel@gmail.com> - Initial API and implementation
 ***********************************************************************************/

package net.sf.smbt.sequencer.diagram.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.xqz.engine.ext.service.AbstractCmdSetProvider;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.notify.AdapterFactory;

public class SequencerUtils {
	public final static SequencerUtils INSTANCE = new SequencerUtils();
	
	/**
	 * @return {@link AdapterFactory} map by uri keys
	 */
	public Map<String, AdapterFactory> getEMFEditfactoriesAsMap() {
		Map<String, AdapterFactory> adapterFactoriesMap = new HashMap<String, AdapterFactory>();
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		IExtensionPoint point = registry.getExtensionPoint("org.eclipse.emf.edit.itemProviderAdapterFactories");
		if (point == null) return null;
		IExtension[] extensions = point.getExtensions();
		for (int i = 0; i < extensions.length; i++) {
			for (IConfigurationElement elem : extensions[i].getConfigurationElements()) {
				String uri = elem.getAttribute("uri");
				AdapterFactory factory = null;
				try {
					factory = (AdapterFactory) elem.createExecutableExtension("class");
				} catch (CoreException e) {
					e.printStackTrace();
				}
				if (!adapterFactoriesMap.keySet().contains(uri) && factory != null) {
					adapterFactoriesMap.put(uri, factory);
				}
			}
		}
		return adapterFactoriesMap;
	}
	
	public List<AbstractCmdSetProvider> getCmdSetProviders() {
		List<AbstractCmdSetProvider> providers = new ArrayList<AbstractCmdSetProvider>();
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		IExtensionPoint point = registry.getExtensionPoint("net.sf.xqz.engine.cmdSetProvider");
		if (point == null) return null;
		IExtension[] extensions = point.getExtensions();
		for (int i = 0; i < extensions.length; i++) {
			for (IConfigurationElement elem : extensions[i].getConfigurationElements()) {
				AbstractCmdSetProvider cmdSetProvider = null;
				try {
					cmdSetProvider = (AbstractCmdSetProvider) elem.createExecutableExtension("provider");
				} catch (CoreException e) {
					e.printStackTrace();
				}
				if (cmdSetProvider != null) {
					providers.add(cmdSetProvider);
				}
			}
		}
		return providers;
	}

}
