
package testsdominio;

import org.junit.Assert;
import org.junit.Test;

import dominio.Asesino;
import dominio.Elfo;
import dominio.Humano;
import dominio.MyRandomStub;


/**
 * The Class TestElfo.
 */
public class TestElfo {
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
    private static final int VALOR7 = 30;
    /**
    * Valor usado en test.
    */
    private static final int VALOR8 = 20;
    /**
    * Valor usado en test.
    */
    private static final int VALOR9 = 25;
    /**
    * Test golpe level.
    */
    @Test
    public void testGolpeLevel() {
        Elfo e = new Elfo("Nico", VALOR6, VALOR6, VALOR9, VALOR8, VALOR7,
            new Asesino(VALOR4, VALOR5, VALOR3), 0, VALOR2, 1);
        Humano h = new Humano("Nico", VALOR6, VALOR6, VALOR9, VALOR8, VALOR7,
            new Asesino(VALOR4, VALOR5, VALOR3), 0, 1, 1);
        e.setRandom(new MyRandomStub(VALOR1, VALOR2));
        h.setRandom(new MyRandomStub(VALOR1, VALOR2));
        Assert.assertTrue(h.getSalud() == VALOR6);
        if (e.habilidadRaza1(h)) {
            Assert.assertTrue(h.getSalud() < VALOR6);
            } else {
                Assert.assertTrue(h.getSalud() == VALOR6);
                }
        }

    /**
    * Test ataque bosque.
    */
    @Test
    public void testAtaqueBosque() {
        Elfo e = new Elfo("Nico", VALOR6, VALOR6, VALOR9, VALOR8, VALOR7,
           new Asesino(VALOR4, VALOR5, VALOR3), 0, VALOR2, 1);
        Humano h = new Humano("Nico", VALOR6, VALOR6, VALOR9, VALOR8, VALOR7,
           new Asesino(VALOR4, VALOR5, VALOR3), 0, 1, 1);
        e.setRandom(new MyRandomStub(VALOR1, VALOR2));
        h.setRandom(new MyRandomStub(VALOR1, VALOR2));
        Assert.assertTrue(h.getSalud() == VALOR6);
        if (e.habilidadRaza2(h)) {
            Assert.assertTrue(h.getSalud() < VALOR6);
            } else {
                Assert.assertTrue(h.getSalud() == VALOR6);
                }
        }
}
