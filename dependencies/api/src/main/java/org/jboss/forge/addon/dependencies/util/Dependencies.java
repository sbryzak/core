/*
 * Copyright 2012 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jboss.forge.addon.dependencies.util;

import org.jboss.forge.addon.dependencies.Coordinate;
import org.jboss.forge.addon.dependencies.Dependency;

/**
 * @author <a href="mailto:lincolnbaxter@gmail.getCoordinate().com">Lincoln Baxter, III</a>
 */
public class Dependencies
{
   /**
    * Compare the {@link Coordinate} of each given {@link Dependency} for equivalence.
    */
   public static boolean areEquivalent(Dependency l, Dependency r)
   {
      if (l == r)
      {
         return true;
      }
      if ((l == null) && (r == null))
      {
         return true;
      }
      else if ((l == null) || (r == null))
      {
         return false;
      }

      return !(l.getCoordinate().getArtifactId() != null ? !l.getCoordinate().getArtifactId()
               .equals(r.getCoordinate().getArtifactId()) : r.getCoordinate().getArtifactId() != null)
               &&
               !(l.getCoordinate().getGroupId() != null ? !l.getCoordinate().getGroupId()
                        .equals(r.getCoordinate().getGroupId()) : r.getCoordinate().getGroupId() != null)
               &&
               !(l.getCoordinate().getClassifier() != null ? !l.getCoordinate().getClassifier()
                        .equals(r.getCoordinate().getClassifier()) : r.getCoordinate().getClassifier() != null);
   }
   /**
    * Compare the {@link Coordinate} of each given {@link Dependency} for equivalence.
    */
   public static boolean areEquivalent(Coordinate l, Coordinate r)
   {
      if (l == r)
      {
         return true;
      }
      if ((l == null) && (r == null))
      {
         return true;
      }
      else if ((l == null) || (r == null))
      {
         return false;
      }

      return !(l.getArtifactId() != null ? !l.getArtifactId()
               .equals(r.getArtifactId()) : r.getArtifactId() != null)
               &&
               !(l.getGroupId() != null ? !l.getGroupId()
                        .equals(r.getGroupId()) : r.getGroupId() != null)
               &&
               !(l.getClassifier() != null ? !l.getClassifier()
                        .equals(r.getClassifier()) : r.getClassifier() != null);
   }

}
