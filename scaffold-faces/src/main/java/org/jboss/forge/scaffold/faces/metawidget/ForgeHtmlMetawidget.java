/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat, Inc., and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.jboss.forge.scaffold.faces.metawidget;

import org.jboss.forge.project.Project;
import org.jboss.forge.scaffold.faces.metawidget.config.ForgeConfigReader;
import org.metawidget.config.ConfigReader;
import org.metawidget.statically.faces.component.html.StaticHtmlMetawidget;

/**
 * ConfigReader with Forge-specific features.
 *
 * @author Richard Kennard
 */

public class ForgeHtmlMetawidget
         extends StaticHtmlMetawidget
{
   //
   // Private members
   //

   private final ConfigReader configReader;

   //
   // Constructor
   //

   /**
    * Constructor for nested Metawidgets.
    */

   public ForgeHtmlMetawidget()
   {
      // (nested Metawidgets will not use a ConfigReader)

      this.configReader = null;
   }

   public ForgeHtmlMetawidget(Project project)
   {
      this.configReader = new ForgeConfigReader(project);
   }

   //
   // Protected methods
   //

   @Override
   protected ConfigReader getConfigReader()
   {
      return this.configReader;
   }
}
