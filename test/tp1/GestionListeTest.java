/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tp1;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Admin
 */
public class GestionListeTest{
    private static final Logger log = Logger.getLogger(GestionListe.class.getName());
    private GestionListe list;
    
    public GestionListeTest() {
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
     * Test of sum method, of class GestionListe.
     */
    @Test
    public void sum() {
        list = new GestionListe();
        Maillon maillon = new Maillon();
        maillon.setValue((float)15);
        list.add(maillon);
        Maillon maillon2 = new Maillon();
        maillon2.setValue((float)30);
        list.add(maillon2);
        log.info("Test of sum method, of class GestionListe");
        float result = list.sum();
        assertEquals(45.0, result, 0);
    }
    
}
