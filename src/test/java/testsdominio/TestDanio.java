
package testsdominio;

import org.junit.Assert;
import org.junit.Test;

import dominio.Guerrero;
import dominio.Humano;
import dominio.MyRandomStub;
import dominio.Orco;

/**
 * The Class TestDaño.
 */
public class TestDanio {


    /**
    * Valor usado en test.
    */
    private static final double VALOR1 = 0.49;
    /**
    * Valor usado en test.
    */
    private static final int VALOR2 = 3;
    /**
    * Valor usado en test.
    */
    private static final double VALOR3 = 1.5;
    /**
    * Valor usado en test.
    */
    private static final double VALOR4 = 0.2;
    /**
    * Valor usado en test.
    */
    private static final double VALOR5 = 0.3;
    /**
    * Valor usado en test.
    */
    private static final int VALOR6 = 100;
    /**
    * Valor usado en test.
    */
    private static final int VALOR7 = 15;
    /**
    * Valor usado en test.
    */
    private static final int VALOR8 = 30;
    /**
    * Valor usado en test.
    */
    private static final int VALOR9 = 20;
    /**
    * Valor usado en test.
    */
    private static final int VALOR10 = 25;
    /**
    * Test ataque comun Y la salud no baje de 0.
    */
    @Test
    public void testAtaqueComunYLaSaludNoBajeDe0() {
        Humano h = new Humano("Nico", VALOR6, VALOR6, VALOR6, VALOR9,
            VALOR8, new Guerrero(VALOR4, VALOR5, VALOR3),
            0, 1, 1);
        Orco o = new Orco("Nico", VALOR6, VALOR6, VALOR7, 0, VALOR8,
            new Guerrero(VALOR4, 0, VALOR3), 0, 1, 1);
        h.setRandom(new MyRandomStub(VALOR1, VALOR2));
        o.setRandom(new MyRandomStub(VALOR1, VALOR2));
        Assert.assertTrue(o.getSalud() == VALOR6);
        if (h.atacar(o) != 0) {
            Assert.assertTrue(o.getSalud() == 0);
            h.atacar(o);
            Assert.assertTrue(o.getSalud() == 0);
            h.atacar(o);
            Assert.assertTrue(o.getSalud() == 0);
            } else {
                Assert.assertTrue(o.getSalud() == 0);
                }
        }

    /**
    * Test los muertos no atacan.
    */
    @Test
    public void testLosMuertosNoAtacan() {
        Humano h = new Humano("Nico", VALOR6, VALOR6, VALOR10, 0,
            VALOR8, new Guerrero(VALOR4, 0, VALOR3),
            0, 1, 1);
        Orco o = new Orco("Nico", VALOR6, VALOR6, VALOR7, 0, VALOR8,
            new Guerrero(VALOR4, 0, VALOR3), 0, 1, 1);
        h.setRandom(new MyRandomStub(VALOR1, VALOR2));
        o.setRandom(new MyRandomStub(VALOR1, VALOR2));
        h.atacar(o);
        h.atacar(o);
        h.atacar(o);
        h.atacar(o);

        o.atacar(h);
        Assert.assertEquals(VALOR6, h.getSalud());
        }


}
