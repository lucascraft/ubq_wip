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

package net.sf.smbt.comm.script.ui.contentassist;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.naming.IQualifiedNameSupport;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.eclipse.xtext.ui.editor.contentassist.IFollowElementAcceptor;

/**
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#contentAssist on how to customize content assistant
 */
public class NetConfProposalProvider extends AbstractNetConfProposalProvider {
	@Override
	public void completeNetBind_Engine(EObject model, Assignment assignment,
			ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// TODO Auto-generated method stub
		super.completeNetBind_Engine(model, assignment, context, acceptor);
	}
	
	@Override
	public void setValueConverter(IValueConverterService valueConverter) {
		// TODO Auto-generated method stub
		super.setValueConverter(valueConverter);
	}
	
	@Override
	public void setQualifiedNameSupport(
			IQualifiedNameSupport qualifiedNameSupport) {
		// TODO Auto-generated method stub
		super.setQualifiedNameSupport(qualifiedNameSupport);
	}
	
	@Override
	public void setScopeProvider(IScopeProvider scopeProvider) {
		// TODO Auto-generated method stub
		super.setScopeProvider(scopeProvider);
	}
	
	@Override
	public void createProposals(ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		// TODO Auto-generated method stub
		super.createProposals(context, acceptor);
	}
	
	@Override
	public IFollowElementAcceptor createSelector(ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		// TODO Auto-generated method stub
		return super.createSelector(context, acceptor);
	}
}
