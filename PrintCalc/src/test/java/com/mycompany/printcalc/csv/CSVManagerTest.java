/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.printcalc.csv;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.csv.CSVRecord;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author theranjalinilaweera
 */
public class CSVManagerTest {
    
    public CSVManagerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getPrintJobInResourceFile method, of class CSVManager.
     */
    @Test
    public void testGetPrintJobInResourceFile() {
        System.out.println("getPrintJobInResourceFile");
        String fileNameInResource = "TestPrintJobs.csv";
        CSVManager instance = new CSVManager();
        try {
             List<CSVRecord> csv = instance.getPrintJobInResourceFile(fileNameInResource);
            assertNotNull("File could not be parsed properly",csv);
        } catch (IOException ex) {
            Logger.getLogger(CSVManagerTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}