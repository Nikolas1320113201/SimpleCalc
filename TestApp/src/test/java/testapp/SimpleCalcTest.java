/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testapp;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;

/**
 *
 * @author Николай
 */
public class SimpleCalcTest {
    
    private static SimpleCalc sc = null;
    
    @BeforeClass
    public static void setUpClass() {
        double p1 = 0 ;
        double p2 = -4 ;
        sc= new SimpleCalc(p1,p2);
        System.out.println("BeforeClass");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("AfterClass");
    }

    /**
     * Test of getSum method, of class sc.
     */
    @Test
    public void testGetSum() {
        System.out.println("getSum tested");
        assertEquals(-4, sc.getSum(), 0.0);
    }

    /**
     * Test of getDiv method, of class sc.
     */
    @Test
    public void testGetDiv() {
        System.out.println("getDiv tested");
        assertEquals(4, sc.getDiv(), 0.0);
    }
    /**
     * Test of getMult method, of class sc.
     */
    @Test
    public void testGetMult() {
        System.out.println("getMult tested");
        assertEquals(0, sc.getMult(), 0.0);

    }

    /**
     * Test of getDel method, of class sc.
     */
    @Test
    public void testGetDel() {
        System.out.println("getDel tested run"+sc.getDel());
        assertEquals(0, sc.getDel(), 0.0);

    }
    
    
}
