/*
 * File   : $Source: /alkacon/cvs/opencms/test/org/opencms/setup/Attic/CmsSetupDbTest.java,v $
 * Date   : $Date: 2004/05/25 09:43:49 $
 * Version: $Revision: 1.2 $
 *
 * This library is part of OpenCms -
 * the Open Source Content Mananagement System
 *
 * Copyright (C) 2002 - 2004 Alkacon Software (http://www.alkacon.com)
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * For further information about Alkacon Software, please see the
 * company website: http://www.alkacon.com
 *
 * For further information about OpenCms, please see the
 * project website: http://www.opencms.org
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
 
package org.opencms.setup;

import org.opencms.test.OpenCmsTestCase;

/** 
 * Tests the database creation / removal used during setup.<p>
 *
 * @author Alexander Kandzior (a.kandzior@alkacon.com)
 * @version $Revision: 1.2 $
 * 
 * @since 5.3.5
 */
public class CmsSetupDbTest extends OpenCmsTestCase {
    
    /**
     * Default JUnit constructor.<p>
     * 
     * @param arg0 JUnit parameters
     */    
    public CmsSetupDbTest(String arg0) {
        super(arg0);
    }
        
    /**
     * Tests database creation.<p>
     */
    public void testCreateDatabase() {
        
        // use create method form superclass
        CmsSetupDb setupDb = createDatabase();    
        
        // check for errors 
        checkErrors(setupDb);             
    }
    
    /**
     * Tests table creation.<p>
     */
    public void testCreateTables() {
        
        // use create method form superclass
        CmsSetupDb setupDb = createTables();     
        
        // check for errors 
        checkErrors(setupDb);         
    }
    
    /**
     * Tests table removal.<p>
     */
    public void testDropTables() {
        
        // use drop method form superclass
        CmsSetupDb setupDb = dropTables();         
        
        // check for errors 
        checkErrors(setupDb);         
    }
 
    /**
     * Tests database removal.<p>
     */
    public void testDropDatabase() {

        // use drop method form superclass
        CmsSetupDb setupDb = dropDatabase();     
        
        // check for errors 
        checkErrors(setupDb);         
    }
}
