/*
 * Copyright 2012 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.jboss.forge.ui.context;

import org.jboss.forge.ui.input.UIInputComponent;

public interface UIValidationContext extends UIContextProvider
{
   public void addValidationError(UIInputComponent<?, ?> input, String errorMessage);
}