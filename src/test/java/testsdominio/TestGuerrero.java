
package testsdominio;

import org.junit.Assert;
import org.junit.Test;

import dominio.Asesino;
import dominio.Elfo;
import dominio.Guerrero;
import dominio.Humano;
import dominio.MyRandomStub;

/**
 * The Class TestGuerrero.
 */
public class TestGuerrero {
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
    * Test doble golpe.
    */
    @Test
    public void testDobleGolpe() {
        Humano h = new Humano("Nico", VALOR4, VALOR4, VALOR8, VALOR10,
            VALOR9, new Guerrero(VALOR6, VALOR7, VALOR5),
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
    * Test auto defensa.
    */
    @Test
    public void testAutoDefensa() {
        Humano h = new Humano("Nico", VALOR4, VALOR4, VALOR8, VALOR10,
            VALOR9, new Guerrero(VALOR6, VALOR7, VALOR5),
            0, 1, 1);
        h.setRandom(new MyRandomStub(VALOR1, VALOR2));
        Assert.assertTrue(h.getDefensa() == VALOR10);
        h.habilidadCasta2(null);
        Assert.assertTrue(h.getDefensa() == VALOR3);
        }

    /**
    * Test ignora defensa.
    */
    @Test
    public void testIgnoraDefensa() {
        Humano h = new Humano("Nico", VALOR4, VALOR4, VALOR8, VALOR10,
            VALOR9, new Guerrero(VALOR6, VALOR7, VALOR5),
            0, 1, 1);
        Elfo e = new Elfo("Nico", VALOR4, VALOR4, VALOR8, VALOR10,
            VALOR9, new Asesino(VALOR6, VALOR7, VALOR5),
            0, VALOR2, 1);
        h.setRandom(new MyRandomStub(VALOR1, VALOR2));
        e.setRandom(new MyRandomStub(VALOR1, VALOR2));
        Assert.assertTrue(e.getSalud() == VALOR4);
        if (h.habilidadCasta3(e)) {
            Assert.assertTrue(e.getSalud() < VALOR4);
            } else {
                Assert.assertTrue(e.getSalud() == VALOR4);
                }
        }

}
