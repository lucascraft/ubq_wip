/*******************************************************************************
 * Copyright (c) 2008 Lucas Bigeardel and others. All rights reserved. This program
 * and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is
 * available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Messages.java
 * 
 * Contributors: Lucas Bigeardel (Anyware Technologies) - initial API and
 * implementation
 ******************************************************************************/

package net.sf.smbt.search.touchosc.ui.l10n;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * l10n/i18n localization, internationalization 
 * 
 * @author <a href="mailto:lucas.bigeardel@gmail.com">lucas.bigeardel@gmail.com</a>
 *
 */
public class Messages {
	private static final String BUNDLE_NAME = "messages"; //$NON-NLS-1$

	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle
			.getBundle(BUNDLE_NAME);

	private Messages() {
	}

	public static String getString(String key) {
		try {
			return RESOURCE_BUNDLE.getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}
}
