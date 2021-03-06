//  The contents of this file are subject to the Mozilla Public License
//  Version 1.1 (the "License"); you may not use this file except in
//  compliance with the License. You may obtain a copy of the License
//  at http://www.mozilla.org/MPL/
//
//  Software distributed under the License is distributed on an "AS IS"
//  basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See
//  the License for the specific language governing rights and
//  limitations under the License.
//
//  The Original Code is RabbitMQ.
//
//  The Initial Developer of the Original Code is VMware, Inc.
//  Copyright (c) 2007-2013 VMware, Inc.  All rights reserved.
//


package com.rabbitmq.client.test.ssl;

import junit.framework.TestCase;
import junit.framework.TestSuite;

public class SSLTests extends TestCase {
    public static TestSuite suite() {
        TestSuite suite = new TestSuite("ssl");
        suite.addTestSuite(UnverifiedConnection.class);
        suite.addTestSuite(VerifiedConnection.class);
        suite.addTestSuite(BadVerifiedConnection.class);
        return suite;
    }
}
