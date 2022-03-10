/*
 * Proyecto EjerciciosProgramacion - Archivo Test1v2Test.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package Test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kevin Blanco Bañuls <blancodaw22@gmail.com>
 */
public class Test1v2Test {
    
    public Test1v2Test() {
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

  @Test
    public void testHay_mayor_tira() {
        System.out.println("hay_mayor_tira"); 
        assertEquals(false,Test1.hay_mayor_tira(new char[]{'a'}, 'a'));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
