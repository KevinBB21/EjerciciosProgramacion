/*
 * Proyecto EjerciciosProgramacion - Archivo YepaTest.java - Compañia DAW
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
public class YepaTest {

    public YepaTest() {
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
    public void testBuscar_en() {
        System.out.println("buscar_en");

        assertEquals(0, Yepa.buscar_en(new char[]{}, 'a'));
        //fail("The test case is a prototype.");
    }

}
