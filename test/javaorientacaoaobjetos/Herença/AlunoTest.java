/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaorientacaoaobjetos.Herença;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Vinnycius
 */
public class AlunoTest {
    
    public AlunoTest() {
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
     * Test of cancelarMatricula method, of class Aluno.
     */
    @Test
    public void testCancelarMatricula() {
        System.out.println("cancelarMatricula");
        Aluno instance = new Aluno();
        instance.cancelarMatricula();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMatricula method, of class Aluno.
     */
    @Test
    public void testGetMatricula() {
        System.out.println("getMatricula");
        Aluno instance = new Aluno();
        int expResult = 0;
        int result = instance.getMatricula();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMatricula method, of class Aluno.
     */
    @Test
    public void testSetMatricula() {
        System.out.println("setMatricula");
        int mt = 0;
        Aluno instance = new Aluno();
        instance.setMatricula(mt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurso method, of class Aluno.
     */
    @Test
    public void testGetCurso() {
        System.out.println("getCurso");
        Aluno instance = new Aluno();
        String expResult = "";
        String result = instance.getCurso();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCurso method, of class Aluno.
     */
    @Test
    public void testSetCurso() {
        System.out.println("setCurso");
        String cur = "";
        Aluno instance = new Aluno();
        instance.setCurso(cur);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
