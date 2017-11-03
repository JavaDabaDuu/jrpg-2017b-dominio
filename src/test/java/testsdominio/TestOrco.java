
package testsdominio;

import org.junit.Assert;
import org.junit.Test;

import dominio.Asesino;
import dominio.Guerrero;
import dominio.Hechicero;
import dominio.Humano;
import dominio.MyRandomStub;
import dominio.Orco;


/**
 * The Class TestOrco.
 */
public class TestOrco {
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
    private static final int VALOR3 = 105;
    /**
    * Valor usado en test.
    */
    private static final int VALOR4 = 100;
    /**
    * Valor usado en test.
    */
    private static final double VALOR5 = 1.5;
    /**
    * Valor usado en test.
    */
    private static final double VALOR6 = 0.2;
    /**
    * Valor usado en test.
    */
    private static final double VALOR7 = 0.3;
    /**
    * Valor usado en test.
    */
    private static final int VALOR8 = 55;
    /**
    * Valor usado en test.
    */
    private static final int VALOR9 = 30;
    /**
    * Valor usado en test.
    */
    private static final int VALOR10 = 20;
    /**
    * Valor usado en test.
    */
    private static final int VALOR11 = 95;
    /**
    * Valor usado en test.
    */
    private static final int VALOR12 = 80;
    /**
    * Valor usado en test.
    */
    private static final int VALOR13 = 40;
    /**
    * Test golpe defensivo.
    */
    @Test
    public void testGolpeDefensivo() {
        Humano h = new Humano("Nicolas", new Guerrero(), 1);
        Orco o = new Orco("Hernan", new Guerrero(), 1);
        h.setRandom(new MyRandomStub(VALOR1, VALOR2));
        o.setRandom(new MyRandomStub(VALOR1, VALOR2));
        Assert.assertTrue(h.getSalud() == VALOR3);
        if (o.habilidadRaza1(h)) {
            Assert.assertTrue(h.getSalud() == VALOR11);
            } else {
                Assert.assertTrue(o.getSalud() == VALOR3);
                }
        }

    /**
    * Test mordisco de vida.
    */
    @Test
    public void testMordiscoDeVida() {
        Humano h = new Humano("Nico", VALOR4, VALOR4, VALOR8, VALOR10,
            VALOR9, new Hechicero(VALOR6, VALOR7, VALOR5),
            0, 1, 1);
        Orco o = new Orco("Nico", VALOR4, VALOR4, VALOR12, VALOR10,
            VALOR9, new Asesino(VALOR6, VALOR7, VALOR5),
            0, 1, 1);
        h.setRandom(new MyRandomStub(VALOR1, VALOR2));
        o.setRandom(new MyRandomStub(VALOR1, VALOR2));

        Assert.assertTrue(h.getSalud() == VALOR4);
        if (o.habilidadRaza2(h)) {
            Assert.assertEquals(VALOR13, h.getSalud());
            Assert.assertTrue(o.getSalud() == VALOR4);
            } else {
                Assert.assertTrue(o.getSalud() == VALOR4);
                Assert.assertTrue(h.getSalud() == VALOR4);
                }
        }
}
