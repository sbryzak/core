/**
 * Copyright 2013 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.jboss.forge.addon.shell;

import java.io.File;

import javax.inject.Inject;

import org.jboss.aesh.console.settings.Settings;
import org.jboss.forge.addon.resource.FileResource;
import org.jboss.forge.addon.resource.ResourceFactory;
import org.jboss.forge.furnace.addons.AddonRegistry;
import org.jboss.forge.furnace.util.Assert;

/**
 * Creates {@link Shell} instances
 * 
 * @author <a href="ggastald@redhat.com">George Gastaldi</a>
 */
public class ShellFactoryImpl implements ShellFactory
{

   @Inject
   private AddonRegistry addonRegistry;

   @Inject
   private ResourceFactory resourceFactory;

   @Override
   public Shell createShell(File initialSelection, Settings settings)
   {
      Assert.notNull(settings, "Settings cannot be null");
      CommandManager commandManager = new CommandManager(addonRegistry);
      FileResource<?> initialResource = resourceFactory.create(initialSelection).reify(FileResource.class);
      return new ShellImpl(initialResource, commandManager, settings);
   }

}
