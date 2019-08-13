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


public class CounterTest {
    
    public CounterTest() {
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
     * Test of organizeHand method, of class Counter.
     */
    @Test
    public void testOrganizeHandGood() {
        System.out.println("organizeHand");
        Hand hand = null;
        Counter instance = new Counter();
        Hand expResult = null;
        Hand result = instance.organizeHand(hand);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     @Test
    public void testOrganizeHandBad() {
        System.out.println("organizeHand");
        Hand hand = null;
        Counter instance = new Counter();
        Hand expResult = null;
        Hand result = instance.organizeHand(hand);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     @Test
    public void testOrganizeHandBoundary() {
        System.out.println("organizeHand");
        Hand hand = null;
        Counter instance = new Counter();
        Hand expResult = null;
        Hand result = instance.organizeHand(hand);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calculateResult method, of class Counter.
     */
    @Test
    public void testCalculateResultGood() {
        System.out.println("calculateResult");
        Hand hand = null;
        Counter instance = new Counter();
        int expResult = 0;
        int result = instance.calculateResult(hand);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    @Test
    public void testCalculateResultBad() {
        System.out.println("calculateResult");
        Hand hand = null;
        Counter instance = new Counter();
        int expResult = 0;
        int result = instance.calculateResult(hand);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    @Test
    public void testCalculateResultBoundary() {
        System.out.println("calculateResult");
        Hand hand = null;
        Counter instance = new Counter();
        int expResult = 0;
        int result = instance.calculateResult(hand);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
