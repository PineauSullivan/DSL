/*
 * generated by Xtext 2.10.0
 */
package org.xtext.univ.nantes.master.dsl.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.univ.nantes.master.dsl.ui.internal.DslActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class AgendaExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return DslActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return DslActivator.getInstance().getInjector(DslActivator.ORG_XTEXT_UNIV_NANTES_MASTER_DSL_AGENDA);
	}
	
}
