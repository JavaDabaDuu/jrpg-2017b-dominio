
package testsdominio;

import org.junit.Assert;
import org.junit.Test;

import dominio.Guerrero;
import dominio.Humano;
import dominio.Personaje;

/**
 * The Class TestSubirNivel.
 */
public class TestSubirNivel {

    /**
    * Valor de nivel para usar en test.
    */
    private static final int NIVEL3 = 3;
    /**
    * Valor de nivel para usar en test.
    */
    private static final int NIVEL100 = 100;
    /**
    * Valor de experiencia para usar en test.
    */
    private static final int EXP1 = 50;
    /**
    * Valor de experiencia para usar en test.
    */
    private static final int EXP2 = 300000;
    /**
    * Valor de experiencia para usar en test.
    */
    private static final int EXP3 = 150;
    /**
    * Test subirde nivel.
    */
    @Test
    public void testSubirdeNivel() {
        Personaje.cargarTablaNivel();
        Humano h = new Humano("Nicolas", new Guerrero(), 1);
        Assert.assertTrue(h.getNivel() == 1);
        h.ganarExperiencia(EXP1);
        Assert.assertTrue(h.getNivel() == 2);
    }

    /**
    * Test nivel 100.
    */
    @Test
    public void testNivel100() {
        Personaje.cargarTablaNivel();
        Humano h = new Humano("Nicolas", new Guerrero(), 1);
        h.ganarExperiencia(EXP2);
        Assert.assertTrue(h.getNivel() == NIVEL100);
        h.subirNivel();
        Assert.assertTrue(h.getNivel() == NIVEL100);

        }

    /**
    * Test ganar mucha exp.
    */
    @Test
    public void testGanarMuchaExp() {
        Personaje.cargarTablaNivel();
        Humano h = new Humano("Nicolas", new Guerrero(), 1);
        Assert.assertTrue(h.getNivel() == 1);
        h.ganarExperiencia(EXP3);
        Assert.assertTrue(h.getNivel() == NIVEL3);
        }
}
