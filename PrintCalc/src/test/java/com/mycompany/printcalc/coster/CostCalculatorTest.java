/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.printcalc.coster;

import com.mycompany.printcalc.model.PrintJob;
import java.util.ArrayList;
import java.util.List;
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
public class CostCalculatorTest {
    private static final double DELTA = 1e-15;
    
    public CostCalculatorTest() {
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
     * Test of calulateCostForPrintJobs method, of class CostCalculator.
     */
    @Test
    public void testCalulateCostForPrintJobs() {
        System.out.println("calulateCostForPrintJobs");
        List<PrintJob> printJobs = new ArrayList<>();
        printJobs.add(new PrintJob(5, 2, true));//(2*0.20)+((5-2)*0.10)
        printJobs.add(new PrintJob(5, 0, true));//(0*0.20)+((5-0)*0.10)
        printJobs.add(new PrintJob(5, 2, false));//(2*0.25)+((5-2)*0.15)
        printJobs.add(new PrintJob(5, 5, false));//(5*0.25)+((5-5)*0.15)
        
        
        
        CostCalculator instance = new CostCalculator();
        printJobs = instance.calulateCostForPrintJobs(printJobs);
        
        PrintJob printJob = printJobs.get(0);
        assertEquals("Invalid calc for double sided color",printJob.getJobCost().getColorCost() , 0.40,0.1);
        
        printJob = printJobs.get(1);
        assertEquals("Invalid calc for double sided black",printJob.getJobCost().getBlackCost(), 0.5,0.1);
        
    }
}