/*
* generated by Xtext
*/
package net.sf.smbt.ez.script.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class EzDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("net/sf/smbt/ez/script/parser/antlr/internal/InternalEzDsl.tokens");
	}
}