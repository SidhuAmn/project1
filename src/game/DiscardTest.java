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


public class DiscardTest {
    
    public DiscardTest() {
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
     * Test of getTopCard method, of class Discard.
     */
    @Test
    public void testGetTopCardGood() {
        System.out.println("getTopCard");
        Discard instance = new Discard();
        Card expResult = null;
        Card result = instance.getTopCard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     @Test
    public void testGetTopCardBad() {
        System.out.println("getTopCard");
        Discard instance = new Discard();
        Card expResult = null;
        Card result = instance.getTopCard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     @Test
    public void testGetTopCardBoundary() {
        System.out.println("getTopCard");
        Discard instance = new Discard();
        Card expResult = null;
        Card result = instance.getTopCard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of draw method, of class Discard.
     */
    @Test
    public void testDrawGood() {
        System.out.println("draw");
        Discard instance = new Discard();
        Card expResult = null;
        Card result = instance.draw();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     @Test
    public void testDrawBad() {
        System.out.println("draw");
        Discard instance = new Discard();
        Card expResult = null;
        Card result = instance.draw();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     @Test
    public void testDrawBoundary() {
        System.out.println("draw");
        Discard instance = new Discard();
        Card expResult = null;
        Card result = instance.draw();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class Discard.
     */
    @Test
    public void testAddGood() {
        System.out.println("add");
        Card c = null;
        Discard instance = new Discard();
        instance.add(c);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     @Test
    public void testAddBad() {
        System.out.println("add");
        Card c = null;
        Discard instance = new Discard();
        instance.add(c);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     @Test
    public void testAddBoundary() {
        System.out.println("add");
        Card c = null;
        Discard instance = new Discard();
        instance.add(c);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Discard.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Discard instance = new Discard();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
