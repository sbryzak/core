/*
 * Copyright 2012 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jboss.forge.ui.util;

import org.jboss.forge.ui.UIBuilder;
import org.jboss.forge.ui.UICommand;
import org.jboss.forge.ui.UICommandMetadata;
import org.jboss.forge.ui.context.UIContext;
import org.jboss.forge.ui.context.UIValidationContext;
import org.jboss.forge.ui.result.Result;

/**
 * @author <a href="mailto:lincolnbaxter@gmail.com">Lincoln Baxter, III</a>
 * 
 */
public class MockCommand2 implements UICommand
{

   @Override
   public UICommandMetadata getMetadata()
   {
      return Metadata.forCommand(MockCommand2.class)
               .description("A Description")
               .category(Categories.create("A Category"));
   }

   @Override
   public boolean isEnabled(UIContext context)
   {
      return false;
   }

   @Override
   public void initializeUI(UIBuilder builder) throws Exception
   {
   }

   @Override
   public void validate(UIValidationContext validator)
   {
   }

   @Override
   public Result execute(UIContext context) throws Exception
   {
      return null;
   }

}