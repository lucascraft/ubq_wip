/***********************************************************************************
 * Smbt - A smart ambient utilities framework 
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

package net.sf.smbt.sequencer.diagram.custom.dialogs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.smbt.sequencer.diagram.utils.SequencerUtils;
import net.sf.xqz.engine.ext.service.AbstractCmdSetProvider;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.swt.widgets.Shell;

public class XCmdChooserDialog extends AbstractFilteredMetaElementsSelectionDialog {

	protected Map<String, AdapterFactory> adapterFactoriesMap;
	protected Map<String, List<EClassifier>> cmdProviderMap;
	
	public XCmdChooserDialog(Shell parent, boolean multi) {
		super(parent, multi);
		adapterFactories = SequencerUtils.INSTANCE.getEMFEditfactoriesAsMap();
		cmdProviderMap = new HashMap<String, List<EClassifier>>();
	}

	@Override
	protected void computeResult() {
		super.computeResult();
	}

	@Override
	protected boolean isAnElementToConsider(Object item) {
		return true;
	}

	@Override
	protected List<AdapterFactory> getMetaElementComposeableAdapterFactories() {
		return new ArrayList<AdapterFactory>(SequencerUtils.INSTANCE.getEMFEditfactoriesAsMap().values());
	}

	@Override
	public String getElementName(Object item) {
		return item==null ? "** No Value **" : item.toString();
	}

	private List<EClassifier> getCommands() {
		List<EClassifier> list = new ArrayList<EClassifier>();
		for (List<EClassifier> xyz :  getCmdSetMap().values()) {
			list.addAll(xyz);
		}
		return list;
	}
	
	@Override
	protected void fillContentProvider(
		AbstractContentProvider contentProvider,
		ItemsFilter itemsFilter, 
		IProgressMonitor progressMonitor
	) throws CoreException {
		for (EClassifier cmd : getCommands()) {
			contentProvider.add(cmd, itemsFilter);
		}
	}

	
	protected Map<String, List<EClassifier>> getCmdSetMap() {
		for (AbstractCmdSetProvider p : SequencerUtils.INSTANCE.getCmdSetProviders()) {
			for (String k :  p.getCommandSets().keySet()) {
				for (List<EClassifier> lst : p.getCommandSets().values()) {
					cmdProviderMap.put(k, lst);
				}
			}
		}
		return cmdProviderMap;
	}
	
}
