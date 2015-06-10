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

package net.sf.smbt.ez.script.interpreter;

import net.sf.smbt.ez.script.ezDsl.EnumDecl;
import net.sf.smbt.ez.script.ezDsl.EnumLiteral;
import net.sf.smbt.ez.script.ezDsl.Formula;
import net.sf.smbt.ez.script.ezDsl.FunctionDeclaration;
import net.sf.smbt.ez.script.ezDsl.Parameter;
import net.sf.smbt.ez.script.ezDsl.Return;
import net.sf.smbt.ez.script.ezDsl.Symbol;
import net.sf.smbt.ez.script.ezDsl.VarDecl;

import org.eclipse.emf.ecore.EObject;

import com.ibm.icu.impl.Assert;

import de.itemis.interpreter.AbstractStatementExecutor;
import de.itemis.interpreter.ExecutionContext;
import de.itemis.interpreter.InterpreterException;
import de.itemis.interpreter.MethodNotImplementedException;
import de.itemis.interpreter.logging.LogEntry;


public abstract class AbstractEzDslStatementExecutor extends AbstractStatementExecutor {

	public AbstractEzDslStatementExecutor( ExecutionContext ctx ) {
		super(ctx);
	}

	public void execute( EObject statement, LogEntry parentLog ) throws InterpreterException {
		
		LogEntry localLog = log( statement, parentLog );
	
		
		if ( statement instanceof FunctionDeclaration ) {
			executeFunctionDeclaration( (FunctionDeclaration)statement, localLog );
			return;
		}
		
		if ( statement instanceof Parameter ) {
			executeParameter( (Parameter)statement, localLog );
			return;
		}
		
		if ( statement instanceof EnumLiteral ) {
			executeEnumLiteral( (EnumLiteral)statement, localLog );
			return;
		}
		
		if ( statement instanceof VarDecl ) {
			executeVarDecl( (VarDecl)statement, localLog );
			return;
		}
		
		if ( statement instanceof Formula ) {
			executeFormula( (Formula)statement, localLog );
			return;
		}
		
		if ( statement instanceof Symbol ) {
			executeSymbol( (Symbol)statement, localLog );
			return;
		}
		
		if ( statement instanceof Return ) {
			executeReturn( (Return)statement, localLog );
			return;
		}
		
		if ( statement instanceof Assert ) {
			//executeAssert( (Assert)statement, localLog );
			return;
		}
		
		if ( statement instanceof EnumDecl ) {
			executeEnumDecl( (EnumDecl)statement, localLog );
			return;
		}
		
		
		throw new InterpreterException(statement, "generated execute(...) method cannot handle type "+statement.eClass().getName());
		
	}

	
	
	protected void executeFunctionDeclaration( FunctionDeclaration s, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(s, "method executeFunctionDeclaration not implemented");
	} 
	
	protected void executeParameter( Parameter s, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(s, "method executeParameter not implemented");
	} 
	
	protected void executeEnumLiteral( EnumLiteral s, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(s, "method executeEnumLiteral not implemented");
	} 
	
	protected void executeVarDecl( VarDecl s, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(s, "method executeVarDecl not implemented");
	} 
	
	protected void executeFormula( Formula s, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(s, "method executeFormula not implemented");
	} 
	
	protected void executeSymbol( Symbol s, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(s, "method executeSymbol not implemented");
	} 
	
	protected void executeReturn( Return s, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(s, "method executeReturn not implemented");
	} 
	/*
	protected void executeAssert( Assert s, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(s, "method executeAssert not implemented");
	} 
	*/
	protected void executeEnumDecl( EnumDecl s, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(s, "method executeEnumDecl not implemented");
	} 
	


}
