/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tp1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class mainTest {
    
    public mainTest() {
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
     * Test of add method, of class main.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int a = 2;
        int b = 3;
        main instance = new main();
        int expResult = 5;
        int result = instance.add(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of main method, of class main.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        main.main(args);
    }
    
}
