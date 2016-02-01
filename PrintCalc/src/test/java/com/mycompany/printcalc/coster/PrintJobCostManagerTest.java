/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.printcalc.coster;

import com.mycompany.printcalc.model.PrintJob;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

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
        List<PrintJob> printJobs = instance.costJobsInFile(fileName);
        
        PrintJob printJob = printJobs.get(printJobs.size()-1);
        assertEquals("Invalid calc for double sided color",printJob.getJobCost().getColorCost() , 0,0.1);
       
    }
}