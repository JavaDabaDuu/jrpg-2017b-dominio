
package testsdominio;

import org.junit.Assert;
import org.junit.Test;

import dominio.Guerrero;
import dominio.Humano;
import dominio.Personaje;

/**
 * The Class TestAsignarPuntos.
 */
public class TestAsignarPuntos {

    /**
    * Valor usado en test.
    */
    private static final int VALOR1 = 130;
    /**
    * Valor usado en test.
    */
    private static final int VALOR2 = 50;
    /**
    * Valor usado en test.
    */
    private static final int VALOR3 = 105;
    /**
    * Valor usado en test.
    */
    private static final int VALOR4 = 125;
    /**
    * Valor usado en test.
    */
    private static final int VALOR5 = 184;
    /**
    * Valor usado en test.
    */
    private static final int VALOR6 = 189;
    /**
    * Valor usado en test.
    */
    private static final int VALOR7 = 199;
    /**
    * Test aumentar salud tope.
    */
    @Test
    public void testAumentarSaludTope() {
        Personaje.cargarTablaNivel();

        Humano h = new Humano("Nicolas", new Guerrero(), 1);
        Assert.assertTrue(h.getSaludTope() == VALOR3);
        h.ganarExperiencia(VALOR2);
        Assert.assertTrue(h.getSaludTope() == VALOR1);
        }

    /**
    * Test aumentar energia tope.
    */
    @Test
    public void testAumentarEnergiaTope() {
        Personaje.cargarTablaNivel();

        Humano h = new Humano("Nicolas", new Guerrero(), 1);
        Assert.assertTrue(h.getEnergiaTope() == VALOR3);
        h.ganarExperiencia(VALOR2);
        Assert.assertTrue(h.getEnergiaTope() == VALOR4);
        }

    /**
    * Test mas de 200 puntos.
    */
    @Test
    public void testMasDe200Puntos() {
        Humano h = new Humano("Nicolas", new Guerrero(), 1);
        h.aumentarFuerza(VALOR5);
        h.aumentarDestreza(VALOR6);
        h.aumentarInteligencia(VALOR6);
        h.AsignarPuntosSkills(2, 2, 2);
        Assert.assertTrue(h.getFuerza() == VALOR7);
        Assert.assertTrue(h.getDestreza() == VALOR7);
        Assert.assertTrue(h.getInteligencia() == VALOR7);
        }
}

