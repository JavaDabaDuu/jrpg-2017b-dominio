
package testsdominio;

import org.junit.Assert;
import org.junit.Test;

import dominio.Asesino;
import dominio.Humano;
import dominio.Personaje;

/**
 * The Class TestCastaNuevo.
 */
public class TestCastaNuevo {

    /**
    * Valor usado en test.
    */
    private static final int VALOR = 8;
    /**
    * Test set probabilidad golpe critico.
    */
    @Test
    public void testSetProbabilidadGolpeCritico() {
        Personaje p1 = new Humano("Ben Affleck", new Asesino(), 2);
        p1.getCasta().setProbabilidadGolpeCritico(VALOR);
        Assert.assertEquals(VALOR, p1.getCasta().
            getProbabilidadGolpeCritico(), 0);
        }

    /**
    * Test set daño critico.
    */
    @Test
    public void testSetDanioCritico() {
        Personaje p1 = new Humano("Ben Affleck", new Asesino(), 2);
        p1.getCasta().setDanioCritico(VALOR);
        Assert.assertEquals(VALOR, p1.getCasta().getDanioCritico(), 0);
        }

}
