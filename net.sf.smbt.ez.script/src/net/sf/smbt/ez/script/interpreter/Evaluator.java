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

import net.sf.smbt.ez.script.ezDsl.Formula;
import net.sf.smbt.ez.script.ezDsl.FunctionDeclaration;
import net.sf.smbt.ez.script.ezDsl.Multi;
import net.sf.smbt.ez.script.ezDsl.NumberLiteral;
import net.sf.smbt.ez.script.ezDsl.Parameter;
import net.sf.smbt.ez.script.ezDsl.Plus;
import net.sf.smbt.ez.script.ezDsl.StringLiteral;
import net.sf.smbt.ez.script.ezDsl.Symbol;
import net.sf.smbt.ez.script.ezDsl.SymbolRef;
import net.sf.smbt.ez.script.ezDsl.VarDecl;
import de.itemis.interpreter.ExecutionContext;
import de.itemis.interpreter.InterpreterException;
import de.itemis.interpreter.logging.LogEntry;

public class Evaluator extends AbstractEzDslExpressionEvaluator {

	public static final String RETURN_SYMBOL = "____ret____";

	public Evaluator(ExecutionContext ctx) {
		super(ctx);
	}
	
	@Override
	protected Object evalNumberLiteral(NumberLiteral expr, LogEntry log) {
		return new Double( expr.getValue().toString() );
	}
	
	@Override
	protected Object evalStringLiteral(StringLiteral expr, LogEntry log) {
		return expr.getValue();
	}
	
	@Override
	protected Object evalMulti(Multi expr, LogEntry log) {
		return doubleTimesDouble(expr.getLeft(), expr.getRight(), log);
	}
	
	@Override
	protected Object evalPlus(Plus expr, LogEntry log) {
		return doublePlusDouble(expr.getLeft(), expr.getRight(), log);
	}
	
	@Override
	protected Object evalSymbolRef(SymbolRef expr, LogEntry log) {
		Symbol symbol = expr.getSymbol();
		if ( symbol instanceof VarDecl ) {
			return log( symbol, ctx.environment.getCheckNull(symbol), log);
		}
		if ( symbol instanceof Formula ) {
			return evalCheckNullLog(((Formula) symbol).getExpr(), log);
		}
		if ( symbol instanceof Parameter ) {
			return log( symbol, ctx.environment.get(symbol), log );
		}
		if ( symbol instanceof FunctionDeclaration ) {
			FunctionDeclaration fd = (FunctionDeclaration) symbol;
			return callAndReturnWithPositionalArgs("calling "+fd.getName(), fd.getParams(), 
					expr.getActuals(), fd.getElements(), RETURN_SYMBOL, log);
		}
		throw new InterpreterException(expr, "interpreter failed; cannot resolve symbol reference "+expr.eClass().getName());
	}
	

}
