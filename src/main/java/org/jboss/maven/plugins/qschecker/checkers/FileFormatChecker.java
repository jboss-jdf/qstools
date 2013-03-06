/*
 * JBoss, Home of Professional Open Source
 * Copyright 2013, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the 
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,  
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.maven.plugins.qschecker.checkers;

import org.codehaus.plexus.component.annotations.Component;
import org.jboss.maven.plugins.qschecker.QSChecker;

@Component(role = QSChecker.class, hint = "fileFormatChecker")
public class FileFormatChecker extends AbstractCheckstyleChecker {


    /* (non-Javadoc)
     * @see org.jboss.maven.plugins.qschecker.QSChecker#getCheckerDescription()
     */
    @Override
    public String getCheckerDescription() {
        return "Verifies if project sources (*.java) is using proper identation and spaces as tab";
    }

    @Override
    String getIncludes() {
        return "**/*.java";
    }

    @Override
    String getCheckstyleConfig() {
       return "checkstyle-format.xml";
    }

}