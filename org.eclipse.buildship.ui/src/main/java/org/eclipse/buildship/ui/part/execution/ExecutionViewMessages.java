/*
 * Copyright (c) 2015 the original author or authors.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Etienne Studer & Donát Csikós (Gradle Inc.) - initial API and implementation and initial documentation
 */

package org.eclipse.buildship.ui.part.execution;

import org.eclipse.osgi.util.NLS;

/**
 * Lists the i18n resource keys for the execution view messages.
 */
public class ExecutionViewMessages extends NLS {

    private static final String BUNDLE_NAME = "org.eclipse.buildship.ui.part.execution.ExecutionViewMessages"; //$NON-NLS-1$

    public static String Label_No_Execution;

    public static String Tree_Column_Duration_Text;
    public static String Tree_Column_Operation_Text;

    public static String Tree_Item_Root_Text;
    public static String Tree_Item_Tests_Text;
    public static String Tree_Item_Test_Finished_Text;
    public static String Tree_Item_Test_Started_Text;

    static {
        // initialize resource bundle
        NLS.initializeMessages(BUNDLE_NAME, ExecutionViewMessages.class);
    }

    private ExecutionViewMessages() {
    }
}
