/*
 * generated by Xtext 2.10.0
 */
package org.xtext.univ.nantes.master.dsl


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class AgendaStandaloneSetup extends AgendaStandaloneSetupGenerated {

	def static void doSetup() {
		new AgendaStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
