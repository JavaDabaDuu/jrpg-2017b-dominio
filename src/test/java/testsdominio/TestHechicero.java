
package testsdominio;

import org.junit.Assert;
import org.junit.Test;

import dominio.Asesino;
import dominio.Elfo;
import dominio.Hechicero;
import dominio.Humano;
import dominio.MyRandomStub;


/**
 * The Class TestHechicero.
 */
public class TestHechicero {
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
    private static final int VALOR3 = 65;
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
    private static final int VALOR11 = 50;
    /**
    * Valor usado en test.
    */
    private static final int VALOR12 = 55;
    /**
    * Valor usado en test.
    */
    private static final int VALOR13 = 35;
    /**
    * Test curar.
    */
    @Test
    public void testCurar() {
        Humano h = new Humano("Nico", VALOR4, VALOR4, VALOR12, VALOR10,
            VALOR9, new Hechicero(VALOR6, VALOR7, VALOR5),
            0, 1, 1);
        Elfo e = new Elfo("Nico", VALOR4, VALOR4, VALOR8, VALOR10,
            VALOR9, new Asesino(VALOR6, VALOR7, VALOR5),
            0, VALOR2, 1);
        h.setRandom(new MyRandomStub(VALOR1, VALOR2));
        e.setRandom(new MyRandomStub(VALOR1, VALOR2));
        Assert.assertTrue(e.getSalud() == VALOR4);
        e.reducirSalud(VALOR13);
        Assert.assertTrue(e.getSalud() == VALOR3);
        h.habilidadCasta2(e);
        Assert.assertTrue(e.getSalud() > VALOR3);
        }

    /**
    * Test bola de fuego.
    */
    @Test
    public void testBolaDeFuego() {
        Humano h = new Humano("Nico", VALOR4, VALOR4, VALOR12, VALOR10,
            VALOR9, new Hechicero(VALOR6, VALOR7, VALOR5),
            0, 1, 1);
        Elfo e = new Elfo("Nico", VALOR4, VALOR4, VALOR8, VALOR10,
            VALOR9, new Asesino(VALOR6, VALOR7, VALOR5),
            0, VALOR2, 1);
        h.setRandom(new MyRandomStub(VALOR1, VALOR2));
        e.setRandom(new MyRandomStub(VALOR1, VALOR2));
        Assert.assertTrue(e.getSalud() == VALOR4);
        if (h.habilidadCasta1(e)) {
            Assert.assertTrue(e.getSalud() < VALOR4);
            } else {
                Assert.assertTrue(e.getSalud() == VALOR4);
                }
        }

    /**
    * Test robar energia y salud.
    */
    @Test
    public void testRobarEnergiaySalud() {
        Humano h = new Humano("Nico", VALOR4, VALOR4, VALOR12, VALOR10,
            VALOR11, new Hechicero(VALOR6, VALOR7, VALOR5),
            0, 1, 1);
        Elfo e = new Elfo("Nico", VALOR4, VALOR4, VALOR8, VALOR10,
            VALOR9, new Asesino(VALOR6, VALOR7, VALOR5),
            0, VALOR2, 1);
        h.setRandom(new MyRandomStub(VALOR1, VALOR2));
        e.setRandom(new MyRandomStub(VALOR1, VALOR2));
        Assert.assertTrue(e.getSalud() == VALOR4);
        h.reducirSalud(VALOR11);
        h.aumentarEnergia(-VALOR12);
        if (h.habilidadCasta3(e)) {
            Assert.assertTrue(e.getSalud() < VALOR4);
            Assert.assertTrue(h.getEnergia() > VALOR11);
            Assert.assertTrue(h.getSalud() > VALOR11);
            } else {
                Assert.assertTrue(h.getSalud() == VALOR11);
                Assert.assertTrue(h.getEnergia() < VALOR11);
                Assert.assertTrue(e.getSalud() == VALOR4);
                }
        }
}
