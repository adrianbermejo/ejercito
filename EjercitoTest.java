

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class EjercitoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class EjercitoTest
{
    /**
     * Default constructor for test class EjercitoTest
     */
    public EjercitoTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void tess()
    {
        Ejercito ejercito2 = new Ejercito();
        ejercito2.addTanque("T-34-85", "rusia", 26000);
        ejercito2.addTanque("M6 heavy tank", "United States", 57400);
        ejercito2.addTanque("Hetzer", " III Reich", 15750);
        ejercito2.addTanque("M18 Hellcat", "Estados Unidos", 17700);
        ejercito2.addTanque(" Churchill VII", " British", 38000);
        ejercito2.addTanque("Panzerkampfwagen VIII Maus", " Alemania Nacional Socialista", 188000);
        ejercito2.mostrarTanquesNumerados();
        ejercito2.imprimirTanqueMenorPeso();
        ejercito2.imprimirTanquePorPais();
        ejercito2.cambiarpeso(0, 16000);
        ejercito2.cambiarpeso(3, 50000);
        ejercito2.eiminar(20000);
        ejercito2.mostrarTanquesNumerados();
    }
}

