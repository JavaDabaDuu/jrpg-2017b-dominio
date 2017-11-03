
package testsdominio;

import org.junit.Assert;
import org.junit.Test;

import dominio.Asesino;
import dominio.Humano;
import dominio.Personaje;


/**
 * The Class TestNivelExp.
 */
public class TestNivelExp {
    /**
    * Valor usado en test.
    */
    private static final int VALOR1 = 4;
    /**
    * Valor usado en test.
    */
    private static final int VALOR2 = 300;
    /**
    * Valor usado en test.
    */
    private static final int VALOR3 = 45;
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
    private static final int VALOR11 = 10000;
    /**
    * Valor usado en test.
    */
    private static final int VALOR12 = 99;
    /**
    * Test ganar exp.
    */
    @Test
    public void testGanarExp() {
        Personaje.cargarTablaNivel();
        Humano h = new Humano("Nico", VALOR4, VALOR4, VALOR8, VALOR10,
            VALOR9, new Asesino(VALOR6, VALOR7, VALOR5),
            0, 1, 1);
        h.ganarExperiencia(VALOR3);
        Assert.assertTrue(h.getExperiencia() == VALOR3);
        }

    /**
    * Test subir nivel.
    */
    @Test
    public void testSubirNivel() {
        Personaje.cargarTablaNivel();
        Humano h = new Humano("Nico", VALOR4, VALOR4, VALOR8, VALOR10,
            VALOR9, new Asesino(VALOR6, VALOR7, VALOR5),
            0, 1, 1);
        h.ganarExperiencia(VALOR2);
        Assert.assertTrue(h.getNivel() == VALOR1);
        Assert.assertTrue(h.getExperiencia() == 0);
        }

    /**
    * Test level 100.
    */
    @Test
    public void testLevel100() {
        Personaje.cargarTablaNivel();
        Humano h = new Humano("Nico", VALOR4, VALOR4, VALOR8, VALOR10,
            VALOR9, new Asesino(VALOR6, VALOR7, VALOR5),
            0, VALOR12, 1);
        h.ganarExperiencia(VALOR11);
        Assert.assertTrue(h.getNivel() == VALOR4);
        }
}
