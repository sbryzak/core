/**
 * Copyright 2013 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.jboss.forge.addon.shell.ui;

import org.jboss.aesh.console.ConsoleOutput;
import org.jboss.forge.addon.resource.FileResource;
import org.jboss.forge.addon.shell.Shell;
import org.jboss.forge.addon.ui.context.AbstractUIContext;
import org.jboss.forge.addon.ui.context.UISelection;
import org.jboss.forge.addon.ui.util.Selections;

/**
 * 
 * @author <a href="ggastald@redhat.com">George Gastaldi</a>
 */
public class ShellContextImpl extends AbstractUIContext implements ShellContext
{
   private Shell shell;
   private UISelection<?> initialSelection;
   private ConsoleOutput consoleOutput;

   @SuppressWarnings("unchecked")
   public ShellContextImpl(Shell shell, FileResource<?> initialSelection)
   {
      this.shell = shell;
      this.initialSelection = Selections.from(initialSelection);
   }

   @SuppressWarnings("unchecked")
   @Override
   public UISelection<?> getInitialSelection()
   {
      return initialSelection;
   }

   @Override
   public Shell getProvider()
   {
      return shell;
   }

   @Override
   public ConsoleOutput getConsoleOutput()
   {
      return consoleOutput;
   }

   public void setConsoleOutput(ConsoleOutput consoleOutput)
   {
      this.consoleOutput = consoleOutput;
   }
}
