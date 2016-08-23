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
public class CadstroAdmTest {
    
    public CadstroAdmTest() {
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
     * Test of getNome method, of class CadstroAdm.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        CadstroAdm instance = new CadstroAdm();
        String expResult = null;
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class CadstroAdm.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        CadstroAdm instance = new CadstroAdm();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSenha method, of class CadstroAdm.
     */
    @Test
    public void testGetSenha() {
        System.out.println("getSenha");
        CadstroAdm instance = new CadstroAdm();
        int expResult = 0;
        int result = instance.getSenha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSenha method, of class CadstroAdm.
     */
    @Test
    public void testSetSenha() {
        System.out.println("setSenha");
        int senha = 0;
        CadstroAdm instance = new CadstroAdm();
        instance.setSenha(senha);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCpf method, of class CadstroAdm.
     */
    @Test
    public void testGetCpf() {
        System.out.println("getCpf");
        CadstroAdm instance = new CadstroAdm();
        int expResult = 0;
        int result = instance.getCpf();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCpf method, of class CadstroAdm.
     */
    @Test
    public void testSetCpf() {
        System.out.println("setCpf");
        int cpf = 0;
        CadstroAdm instance = new CadstroAdm();
        instance.setCpf(cpf);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
