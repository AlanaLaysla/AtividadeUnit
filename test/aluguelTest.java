/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 20121064010382
 */
public class aluguelTest {
    
    public aluguelTest() {
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
     * Test of getNomeDoFilme method, of class aluguel.
     */
    @Test
    public void testGetNomeDoFilme() {
        System.out.println("getNomeDoFilme");
        aluguel instance = new aluguel();
        String expResult = null;
        String result = instance.getNomeDoFilme();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNomeDoFilme method, of class aluguel.
     */
    @Test
    public void testSetNomeDoFilme() {
        System.out.println("setNomeDoFilme");
        String NomeDoFilme = "";
        aluguel instance = new aluguel();
        instance.setNomeDoFilme(NomeDoFilme);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAnoDoFilme method, of class aluguel.
     */
    @Test
    public void testGetAnoDoFilme() {
        System.out.println("getAnoDoFilme");
        aluguel instance = new aluguel();
        int expResult = 0;
        int result = instance.getAnoDoFilme();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAnoDoFilme method, of class aluguel.
     */
    @Test
    public void testSetAnoDoFilme() {
        System.out.println("setAnoDoFilme");
        int AnoDoFilme = 0;
        aluguel instance = new aluguel();
        instance.setAnoDoFilme(AnoDoFilme);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCategoria method, of class aluguel.
     */
    @Test
    public void testGetCategoria() {
        System.out.println("getCategoria");
        aluguel instance = new aluguel();
        String expResult = null;
        String result = instance.getCategoria();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCategoria method, of class aluguel.
     */
    @Test
    public void testSetCategoria() {
        System.out.println("setCategoria");
        String Categoria = "";
        aluguel instance = new aluguel();
        instance.setCategoria(Categoria);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
