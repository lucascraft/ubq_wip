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

import net.sf.smbt.ez.script.ezDsl.Expr;
import net.sf.smbt.ez.script.ezDsl.Formula;
import net.sf.smbt.ez.script.ezDsl.Return;
import net.sf.smbt.ez.script.ezDsl.VarDecl;
import de.itemis.interpreter.ExecutionContext;
import de.itemis.interpreter.logging.LogEntry;

public class StatementExecutor extends AbstractEzDslStatementExecutor {

	public StatementExecutor(ExecutionContext ctx ) {
		super(ctx);
	}
	
	@Override
	protected void executeVarDecl(VarDecl s, LogEntry log) {
		Expr init = ((VarDecl) s).getInit();
		if ( init != null) {
			ctx.environment.put(s, evalCheckNullLog( init, log ));
		}
	}
	
	@Override
	protected void executeFormula(Formula s, LogEntry log) {
		ctx.environment.put(s, evalCheckNullLog( s.getExpr(), log ) );
	}
	/*
	@Override
	protected void executeAssert(Assert s, LogEntry log) {
		Object expected = evalCheckNullLog( s.getExpected(), log );
		Object actual = evalCheckNullLog( s.getActual(), log );
		if ( !expected.equals(actual) ) {
			ctx.messages.addError(s, "Failed; expected "+expected+", but is "+actual );
		}
	}
	*/
	
	@Override
	protected void executeReturn(Return s, LogEntry log) {
		ctx.environment.put(Evaluator.RETURN_SYMBOL, evalCheckNullLog(s.getExpr(), log));
	}

} 
