package bento.sirius.adapter;

import org.eclipse.ui.IStartup;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import bento.component.interpreter.TechnologyConfiguration;
import bento.language.bentocomp.BentocompPackage;
import bento.language.bentocomp.core.CorePackage;
import bento.language.bentocomp.technologies.SiriusTemplate;
import bento.language.bentocomp.technologies.TechnologiesPackage;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin implements IStartup {

	// The plug-in ID
	public static final String PLUGIN_ID = "bento.sirius.adapter"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
	/**
	 * The constructor
	 */
	public Activator() {
	}

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	// Force the plugin to load through the startup extension point
	// This should probably be an extension point in bentocomp, but it is a bit heavyweight
	// given that I don't wan't this to be a general extension mechanism.
	@Override
	public void earlyStartup() {
		TechnologyConfiguration.INSTANCE.addHandler(TechnologiesPackage.Literals.SIRIUS_TEMPLATE, new SiriusTemplateHandler());
	}

}
