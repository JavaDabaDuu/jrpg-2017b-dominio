
package testsdominio;

import org.junit.Assert;
import org.junit.Test;

import dominio.Asesino;
import dominio.Hechicero;
import dominio.Humano;
import dominio.MyRandomStub;

/**
 * The Class TestAsesino.
 */
public class TestAsesino {

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
    private static final int VALOR4 = 93;
    /**
    * Valor usado en test.
    */
    private static final int VALOR5 = 100;
    /**
    * Valor usado en test.
    */
    private static final double VALOR6 = 1.5;
    /**
    * Valor usado en test.
    */
    private static final double VALOR7 = 0.2;
    /**
    * Valor usado en test.
    */
    private static final double VALOR8 = 0.3;
    /**
    * Valor usado en test.
    */
    private static final double VALOR9 = 0.01;
    /**
    * Valor usado en test.
    */
    private static final double VALOR10 = 0.5;
    /**
    * Valor usado en test.
    */
    private static final double VALOR11 = 0.45;
    /**
    * Valor usado en test.
    */
    private static final int VALOR12 = 25;
    /**
    * Valor usado en test.
    */
    private static final int VALOR13 = 30;
    /**
    * Valor usado en test.
    */
    private static final int VALOR14 = 20;
    /**
    * Test robar.
    */
    @Test
    public void testRobar() { }

    /**
    * Test critico.
    */
    @Test
    public void testCritico() {
        Humano h = new Humano("Nicolas", new Asesino(), 1);
        Humano h2 = new Humano("Lautaro", new Hechicero(), 2);
        h.setRandom(new MyRandomStub(VALOR1, VALOR2));
        h2.setRandom(new MyRandomStub(VALOR1, VALOR2));
        Assert.assertEquals(VALOR3, h2.getSalud());
        if (h.habilidadCasta1(h2)) {
            Assert.assertTrue(VALOR4 == h2.getSalud());
            } else {
                Assert.assertEquals(VALOR3, h2.getSalud());
                }
        }

    /**
    * Test prob evasion.
    */
    @Test
    public void testProbEvasion() {
        Humano h = new Humano("Nico", VALOR5, VALOR5,
            VALOR12, VALOR14, VALOR13,
            new Asesino(VALOR7, VALOR8, VALOR6), 0, 1, 1);
        h.setRandom(new MyRandomStub(VALOR1, VALOR2));

        Assert.assertTrue(VALOR8 == h.getCasta().
            getProbabilidadEvitarDanio());
        h.habilidadCasta2(null);
        Assert.assertEquals(VALOR11, h.getCasta().
            getProbabilidadEvitarDanio(), VALOR9);
        h.habilidadCasta2(null);
        Assert.assertTrue(VALOR10 == h.getCasta().
            getProbabilidadEvitarDanio());
        }
}
