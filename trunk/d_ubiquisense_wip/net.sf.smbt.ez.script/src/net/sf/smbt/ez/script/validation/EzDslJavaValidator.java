/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2012, Lucas Bigeardel
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
package net.sf.smbt.ez.script.validation;

import net.sf.smbt.ez.script.ezDsl.Assert;
import net.sf.smbt.ez.script.ezDsl.Element;
import net.sf.smbt.ez.script.ezDsl.Expr;
import net.sf.smbt.ez.script.ezDsl.EzDslPackage;
import net.sf.smbt.ez.script.ezDsl.Formula;
import net.sf.smbt.ez.script.ezDsl.FunctionDeclaration;
import net.sf.smbt.ez.script.ezDsl.Model;
import net.sf.smbt.ez.script.ezDsl.Parameter;
import net.sf.smbt.ez.script.ezDsl.Return;
import net.sf.smbt.ez.script.ezDsl.Symbol;
import net.sf.smbt.ez.script.ezDsl.SymbolRef;
import net.sf.smbt.ez.script.ezDsl.VarDecl;
import net.sf.smbt.ez.script.interpreter.ExprModelInterpreter;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;

import com.google.inject.Inject;

import de.itemis.interpreter.InterpreterException;
import de.itemis.interpreter.MessageList;
import de.itemis.xtext.typesystem.ITypesystem;
import de.itemis.xtext.typesystem.trace.TypeCalculationTrace;
import de.itemis.xtext.typesystem.util.Utils;
 

public class EzDslJavaValidator extends AbstractEzDslJavaValidator {

	public static final String INTERPRETERFAILED = "INTERPRETERFAILED";

	@Inject
	private ITypesystem ts;
	
	private EzDslPackage lang = EzDslPackage.eINSTANCE;

	public void error(String msg, EObject eObj, int idx) {
		
	}
	public void error(String msg, EObject eObj, int idx, String str) {
		
	}
	public void warning(String msg, EObject eObj, int idx) {
		
	}
	public void warning(String msg, EObject eObj, int idx, String str) {
		
	}
	
	@Check
	public void checkTypesystemRules( EObject x ) {
		ts.checkTypesystemConstraints(x, this);
	}
	
	@Check 
	public void checkArgs( SymbolRef r ) {		// FUNC
		Symbol symbol = r.getSymbol();
		if ( symbol instanceof FunctionDeclaration && r.getActuals().isEmpty() ) {
			error( "arguments missing", r, -1 );
		}
	}
	
	@Check
	public void checkReturnOnlyInFunction( Return r ) {
		if ( Utils.ancestor(r, FunctionDeclaration.class) == null ) {
			error( "return can only be used inside of funtctions", r, -1);
		}
	}
	
	@Check()
	public void runAssertStatements( Model m ) {
		if ( !m.isIsTested() ) return;
		try {
			MessageList errors = new ExprModelInterpreter().runModel(m, ts);
			for (MessageList.MessageItem o: errors.getMessages()) {
				error( o.message, o.element, -1, INTERPRETERFAILED );
			}
		} catch (InterpreterException e) {
			if ( e.getFailedObject() != null ) {
				error( e.getMessage(), e.getFailedObject(), -1, INTERPRETERFAILED );
			} else {
				error( e.getMessage(), m, -1, INTERPRETERFAILED );
				e.printStackTrace();
			}
		}
	}
	
	@Check
	public void checkReturnExprType( Return r ) {
		FunctionDeclaration f = Utils.ancestor(r, FunctionDeclaration.class);
		EObject ftype = ts.typeof( f, new TypeCalculationTrace() );
		EObject rtype = ts.typeof( r.getExpr(), new TypeCalculationTrace() );
		if ( !ts.isCompatibleTypeOrdered(f, ftype, r, rtype, new TypeCalculationTrace()) ) {
			error( "incompatible types; expected "+
					ts.typeString(ftype)+", found "+
					ts.typeString(rtype), r, lang.RETURN__EXPR);
		}
	}

	@Check
	public void checkArgumentTypes( SymbolRef r ) {
		Symbol symbol = r.getSymbol();
		if ( symbol instanceof FunctionDeclaration ) {
			FunctionDeclaration fd = (FunctionDeclaration) symbol;
			if ( r.getActuals().size() != fd.getParams().size() ) {
				error( "wrong number of args ", r, -1 );
				return;
			}
			EList<Expr> actuals = r.getActuals();
			int i = 0;
			for (Expr a: actuals) {
				Parameter p = (Parameter) fd.getParams().get(i);
				EObject ptype = ts.typeof( p, new TypeCalculationTrace() );
				EObject atype = ts.typeof( a, new TypeCalculationTrace() );
				if ( !ts.isCompatibleTypeOrdered(p, ptype, a, atype, new TypeCalculationTrace()) ) {
					error( "incompatible types; expected "+
							ts.typeString(ptype)+", found "+
							ts.typeString(atype), a, -1);
				}
				i++;
			}
		}
	}
	
	@Check
	public void checkTestCoverage( Formula f )  {
		Model m = Utils.ancestor(f, Model.class);
		if ( !m.isIsTested() ) return;
		EList<Element> elements = m.getElements();
		for (Element element : elements) {
			if ( element instanceof Assert ) {
				Expr actual = ((Assert) element).getActual();
				if ( actual instanceof SymbolRef ) {
					if ( ((SymbolRef) actual).getSymbol() == f ) return; // alles ok!
				}
			}
		}
		warning("no test found for this formula", f, -1);
	}	
	
	@Check
	public void checkReadonlyStuff(VarDecl ctx) {
		if ( ctx.isReadonly() && ctx.getInit() == null ) {
			error("readonly vars must have an init expression", ctx, -1);
		}
	}

}
