/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GinRummy;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class SuitTest {
    
    public SuitTest() {
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
     * Test of values method, of class Suit.
     */
    @Test
    public void testValuesGood() {
        System.out.println("values");
        Suit[] expResult = null;
        Suit[] result = Suit.values();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testValuesBad() {
        System.out.println("values");
        Suit[] expResult = null;
        Suit[] result = Suit.values();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testValuesBoundary() {
        System.out.println("values");
        Suit[] expResult = null;
        Suit[] result = Suit.values();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class Suit.
     */
    @Test
    public void testValueOfGood() {
        System.out.println("valueOf");
        String name = "";
        Suit expResult = null;
        Suit result = Suit.valueOf(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     @Test
    public void testValueOfBad() {
        System.out.println("valueOf");
        String name = "";
        Suit expResult = null;
        Suit result = Suit.valueOf(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     @Test
    public void testValueOfBoundary() {
        System.out.println("valueOf");
        String name = "";
        Suit expResult = null;
        Suit result = Suit.valueOf(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
