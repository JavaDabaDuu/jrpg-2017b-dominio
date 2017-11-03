
package testsdominio;

import org.junit.Assert;
import org.junit.Test;

import dominio.Asesino;
import dominio.Elfo;
import dominio.Hechicero;
import dominio.Humano;
import dominio.MyRandomStub;


/**
 * The Class TestHumano.
 */
public class TestHumano {
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
    private static final int VALOR3 = 55;
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
    private static final int VALOR8 = 25;
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
    private static final int VALOR11 = 37;
    /**
    * Valor usado en test.
    */
    private static final int VALOR12 = 90;
    /**
    * Valor usado en test.
    */
    private static final int VALOR13 = 70;
    /**
    * Valor usado en test.
    */
    private static final int VALOR14 = 50;
    /**
    * Test incentivar.
    */
    @Test
    public void testIncentivar() {
        Humano h = new Humano("Nico", VALOR4, VALOR4, VALOR3, VALOR10,
            VALOR9, new Hechicero(VALOR6, VALOR7, VALOR5),
            0, 1, 1);
        Elfo e = new Elfo("Nico", VALOR4, VALOR4, VALOR8, VALOR10,
            VALOR9, new Asesino(VALOR6, VALOR7, VALOR5),
            0, VALOR2, 1);
        h.setRandom(new MyRandomStub(VALOR1, VALOR2));
        e.setRandom(new MyRandomStub(VALOR1, VALOR2));
        Assert.assertTrue(e.getAtaque() == VALOR11);
        h.habilidadRaza1(e);
        Assert.assertTrue(e.getAtaque() > VALOR11);
        }

    /**
    * Test golpe fatal.
    */
    @Test
    public void testGolpeFatal() {
        Humano h = new Humano("Nico", VALOR4, VALOR4, VALOR3, VALOR10,
            VALOR9, new Hechicero(VALOR6, VALOR7, VALOR5),
            0, 1, 1);
        Elfo e = new Elfo("Nico", VALOR4, VALOR4, VALOR8, VALOR10,
            VALOR9, new Asesino(VALOR6, VALOR7, VALOR5),
            0, VALOR2, 1);
        e.setRandom(new MyRandomStub(VALOR1, VALOR2));
        h.setRandom(new MyRandomStub(VALOR1, VALOR2));
        Assert.assertTrue(h.getEnergia() == VALOR4);
        Assert.assertTrue(e.getSalud() == VALOR4);
        if (h.habilidadRaza2(e)) {
            Assert.assertTrue(e.getSalud() == VALOR13);
            Assert.assertTrue(h.getEnergia() == VALOR14);
            } else {
                Assert.assertTrue(h.getEnergia() == VALOR12);
                Assert.assertTrue(e.getSalud() == VALOR4);
                }
        }
}
