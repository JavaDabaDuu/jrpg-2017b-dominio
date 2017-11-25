
package testsdominio;

import org.junit.Test;

import dominio.Guerrero;
import dominio.Humano;

import org.junit.Assert;

/**
 * The Class TestAtributos.
 */
public class TestAtributos {

    /**
    * Valor de skill usado en tests.
    */
    private static final int VALOR = 10;
    /**
    * Valor de magia usado en test.
    */
    private static final int VALOR_MAGIA = 15;
    /**
    * Valor de defensa usado en test.
    */
    private static final int VALOR_DEFENSA = 10;
    /**
    * Valor de ataque usado en test.
    */
    private static final int VALOR_ATAQUE = 22;
    /**
    * Test incrementar fuerza.
    */
    @Test
    public void testIncrementarFuerza() {
        Humano h = new Humano("Nicolas", new Guerrero(), 1);
        Assert.assertTrue(h.getAtaque() == VALOR_ATAQUE);
        h.AsignarPuntosSkills(VALOR, 0, 0);
        Assert.assertTrue(h.getAtaque() > VALOR_ATAQUE);
        }

    /**
    * Test incrementar destreza.
    */
    @Test
    public void testIncrementarDestreza() {
        Humano h = new Humano("Nicolas", new Guerrero(), 1);
        Assert.assertTrue(h.getDefensa() == VALOR_DEFENSA);
        h.AsignarPuntosSkills(0, VALOR, 0);
        Assert.assertTrue(h.getDefensa() > VALOR_DEFENSA);
        }

    /**
    * Test incrementar inteligencia.
    */
    @Test
    public void testIncrementarInteligencia() {
        Humano h = new Humano("Nicolas", new Guerrero(), 1);
        Assert.assertTrue(h.getMagia() == VALOR_MAGIA);
        h.AsignarPuntosSkills(0, 0, VALOR);
        Assert.assertTrue(h.getMagia() > VALOR_MAGIA);
        }
}
