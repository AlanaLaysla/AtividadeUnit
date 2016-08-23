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
public class admTest {
    
    public admTest() {
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
     * Test of isVisualizarContaUsu method, of class adm.
     */
    @Test
    public void testIsVisualizarContaUsu() {
        System.out.println("isVisualizarContaUsu");
        adm instance = new adm();
        boolean expResult = false;
        boolean result = instance.isVisualizarContaUsu();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setVisualizarContaUsu method, of class adm.
     */
    @Test
    public void testSetVisualizarContaUsu() {
        System.out.println("setVisualizarContaUsu");
        boolean visualizarContaUsu = false;
        adm instance = new adm();
        instance.setVisualizarContaUsu(visualizarContaUsu);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isAlterarConta method, of class adm.
     */
    @Test
    public void testIsAlterarConta() {
        System.out.println("isAlterarConta");
        adm instance = new adm();
        boolean expResult = false;
        boolean result = instance.isAlterarConta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAlterarConta method, of class adm.
     */
    @Test
    public void testSetAlterarConta() {
        System.out.println("setAlterarConta");
        boolean alterarConta = false;
        adm instance = new adm();
        instance.setAlterarConta(alterarConta);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isDeletarConta method, of class adm.
     */
    @Test
    public void testIsDeletarConta() {
        System.out.println("isDeletarConta");
        adm instance = new adm();
        boolean expResult = false;
        boolean result = instance.isDeletarConta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDeletarConta method, of class adm.
     */
    @Test
    public void testSetDeletarConta() {
        System.out.println("setDeletarConta");
        boolean deletarConta = false;
        adm instance = new adm();
        instance.setDeletarConta(deletarConta);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
