/**
 * Copyright 2013 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jboss.forge.addon.templates;

import java.io.IOException;
import java.io.Writer;

/**
 * Process a template
 * 
 * @author <a href="ggastald@redhat.com">George Gastaldi</a>
 */
public interface TemplateProcessor
{
   /**
    * Returns a {@link String}
    */
   String process(Object dataModel) throws IOException;

   /**
    * Writes the output to the {@link Writer}
    */
   void process(Object dataModel, Writer output) throws IOException;
}
