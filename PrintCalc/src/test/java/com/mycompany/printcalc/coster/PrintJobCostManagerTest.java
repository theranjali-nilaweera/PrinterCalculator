/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.printcalc.coster;

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
public class PrintJobCostManagerTest {
    
    public PrintJobCostManagerTest() {
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
     * Test of costJobsInFile method, of class PrintJobCostManager.
     */
    @Test
    public void testCostJobsInFile() {
        System.out.println("costJobsInFile");
        String fileName = "TestPrintJobs.csv";
        PrintJobCostManager instance = new PrintJobCostManager();
        instance.costJobsInFile(fileName);
    }
}