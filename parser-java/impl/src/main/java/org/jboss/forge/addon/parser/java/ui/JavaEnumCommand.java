/**
 * Copyright 2014 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.jboss.forge.addon.parser.java.ui;

import org.jboss.forge.roaster.model.source.JavaEnumSource;
import org.jboss.forge.roaster.model.source.JavaSource;

/**
 *
 * @author <a href="ggastald@redhat.com">George Gastaldi</a>
 */
public class JavaEnumCommand extends AbstractJavaSourceCommand
{
   @Override
   protected Class<? extends JavaSource<?>> getSourceType()
   {
      return JavaEnumSource.class;
   }

   @Override
   protected String getType()
   {
      return "Enum";
   }
}
