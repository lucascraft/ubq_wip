/*
 * generated by Xtext
 */
package net.sf.smbt.osc.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import net.sf.smbt.osc.ui.internal.OscDslActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class OscDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return OscDslActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return OscDslActivator.getInstance().getInjector(OscDslActivator.NET_SF_SMBT_OSC_OSCDSL);
	}
	
}
