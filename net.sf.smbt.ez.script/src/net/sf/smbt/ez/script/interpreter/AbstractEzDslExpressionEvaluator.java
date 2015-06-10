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

import net.sf.smbt.ez.script.ezDsl.ArrayAccess;
import net.sf.smbt.ez.script.ezDsl.Equals;
import net.sf.smbt.ez.script.ezDsl.Expression;
import net.sf.smbt.ez.script.ezDsl.Multi;
import net.sf.smbt.ez.script.ezDsl.NumberLiteral;
import net.sf.smbt.ez.script.ezDsl.Plus;
import net.sf.smbt.ez.script.ezDsl.StringLiteral;
import net.sf.smbt.ez.script.ezDsl.SymbolRef;

import org.eclipse.emf.ecore.EObject;

import de.itemis.interpreter.AbstractExpressionEvaluator;
import de.itemis.interpreter.ExecutionContext;
import de.itemis.interpreter.InterpreterException;
import de.itemis.interpreter.MethodNotImplementedException;
import de.itemis.interpreter.logging.LogEntry;


public abstract class AbstractEzDslExpressionEvaluator extends AbstractExpressionEvaluator {

	public AbstractEzDslExpressionEvaluator( ExecutionContext ctx ) {
		super(ctx);
	}

	public Object eval( EObject expr, LogEntry parentLog ) throws InterpreterException {

		LogEntry localLog = parentLog.child(LogEntry.Kind.eval, expr, "evaluating "+expr.eClass().getName());

		
		if ( expr instanceof Equals ) {
			return evalEquals( (Equals)expr, localLog );
		}
		
		if ( expr instanceof Plus ) {
			return evalPlus( (Plus)expr, localLog );
		}
		
		if ( expr instanceof Multi ) {
			return evalMulti( (Multi)expr, localLog );
		}
		
		if ( expr instanceof ArrayAccess ) {
			return evalArrayAccess( (ArrayAccess)expr, localLog );
		}
		
		if ( expr instanceof SymbolRef ) {
			return evalSymbolRef( (SymbolRef)expr, localLog );
		}
		
		if ( expr instanceof NumberLiteral ) {
			return evalNumberLiteral( (NumberLiteral)expr, localLog );
		}
		
		if ( expr instanceof StringLiteral ) {
			return evalStringLiteral( (StringLiteral)expr, localLog );
		}
		
		if ( expr instanceof Expression ) {
			return evalExpression( (Expression)expr, localLog );
		}
		
		
		throw new InterpreterException(expr, "generated eval(...) method cannot handle type "+expr.eClass().getName());
	}

	
	
	protected Object evalEquals( Equals expr, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(expr, "method evalEquals not implemented");
	} 
	
	protected Object evalPlus( Plus expr, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(expr, "method evalPlus not implemented");
	} 
	
	protected Object evalMulti( Multi expr, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(expr, "method evalMulti not implemented");
	} 
	
	protected Object evalArrayAccess( ArrayAccess expr, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(expr, "method evalArrayAccess not implemented");
	} 
	
	protected Object evalSymbolRef( SymbolRef expr, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(expr, "method evalSymbolRef not implemented");
	} 
	
	protected Object evalNumberLiteral( NumberLiteral expr, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(expr, "method evalNumberLiteral not implemented");
	} 
	
	protected Object evalStringLiteral( StringLiteral expr, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(expr, "method evalStringLiteral not implemented");
	} 
	
	protected Object evalExpression( Expression expr, LogEntry log )  throws InterpreterException {
		throw new MethodNotImplementedException(expr, "method evalExpression not implemented");
	} 
	


}
