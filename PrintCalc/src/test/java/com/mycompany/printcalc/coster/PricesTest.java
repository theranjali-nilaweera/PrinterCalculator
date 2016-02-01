/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.printcalc.coster;

import java.util.Properties;
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
public class PricesTest {
    
    public PricesTest() {
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
     * Test of getInstance method, of class Prices.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        Prices price = Prices.getInstance();
        assertNotNull("Prices file can not be null", price);
    }

    /**
     * Test of initPrices method, of class Prices.
     */
     @Test
    public void testInitPrices() {
        System.out.println("initPrices");
        Prices prices = Prices.getInstance();
        Properties p = prices.initPrices();
        
        assertEquals("Failed to initialize costs ", prices.getSingleColor(), 0.25,0.1);
    }

   
}