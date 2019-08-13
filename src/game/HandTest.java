/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GinRummy;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class HandTest {
    
    public HandTest() {
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
     * Test of getHand method, of class Hand.
     */
    @Test
    public void testGetHandGood() {
        System.out.println("getHand");
        Hand instance = new Hand();
        ArrayList<Card> expResult = null;
        ArrayList<Card> result = instance.getHand();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testGetHandBad() {
        System.out.println("getHand");
        Hand instance = new Hand();
        ArrayList<Card> expResult = null;
        ArrayList<Card> result = instance.getHand();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testGetHandBoundary() {
        System.out.println("getHand");
        Hand instance = new Hand();
        ArrayList<Card> expResult = null;
        ArrayList<Card> result = instance.getHand();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class Hand.
     */
    @Test
    public void testAddGood() {
        System.out.println("add");
        Card c = null;
        Hand instance = new Hand();
        instance.add(c);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     @Test
    public void testAddBad() {
        System.out.println("add");
        Card c = null;
        Hand instance = new Hand();
        instance.add(c);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     @Test
    public void testAddBoundary() {
        System.out.println("add");
        Card c = null;
        Hand instance = new Hand();
        instance.add(c);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class Hand.
     */
    
    @Test
    public void testRemoveGood() {
        System.out.println("remove");
        int index = 0;
        Hand instance = new Hand();
        Card expResult = null;
        Card result = instance.remove(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testRemoveBad() {
        System.out.println("remove");
        int index = 0;
        Hand instance = new Hand();
        Card expResult = null;
        Card result = instance.remove(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testRemoveBoundary() {
        System.out.println("remove");
        int index = 0;
        Hand instance = new Hand();
        Card expResult = null;
        Card result = instance.remove(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Hand.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Hand instance = new Hand();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
