/*
 * generated by Xtext 2.10.0
 */
package org.xtext.univ.nantes.master.dsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class AgendaAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/xtext/univ/nantes/master/dsl/parser/antlr/internal/InternalAgenda.tokens");
	}
}
