
package net.sf.smbt.osc;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class OscDslStandaloneSetup extends OscDslStandaloneSetupGenerated{

	public static void doSetup() {
		new OscDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

