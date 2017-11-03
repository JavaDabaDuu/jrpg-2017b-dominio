
package testsdominio;

import org.junit.Assert;
import org.junit.Test;

import dominio.Guerrero;
import dominio.Humano;
import dominio.MyRandomStub;
import dominio.NonPlayableCharacter;
import dominio.Personaje;

/**
 * The Class TestEnemigosExperiencia.
 */
public class TestEnemigosExperiencia {
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
    private static final int VALOR3 = 30;
    /**
    * Valor usado en test.
    */
    private static final int VALOR4 = 40;
    /**
    * Test pjvs NPC.
    */
    @Test
    public void testPjvsNPC() {

        Humano h = new Humano("Nicolas", new Guerrero(), 1);
        NonPlayableCharacter npc = new NonPlayableCharacter(
            "Gigante", 1, 0);
        Personaje.cargarTablaNivel();
        Assert.assertTrue(h.getExperiencia() == 0);
        h.setRandom(new MyRandomStub(VALOR1, VALOR2));
        npc.setRandom(new MyRandomStub(VALOR1, VALOR2));
        while (npc.estaVivo()) {
            h.atacar(npc);
            }
        h.ganarExperiencia(npc.otorgarExp());
        Assert.assertTrue(h.getExperiencia() == VALOR3);
        }

    /**
    * Test mas fuerte mas experiencia.
    */
    @Test
    public void testMasFuerteMasExperiencia() {
        NonPlayableCharacter npc = new NonPlayableCharacter(
            "Gigante", 1, 0);
        NonPlayableCharacter npc2 = new NonPlayableCharacter(
            "Gigante", 2, 0);

        Assert.assertTrue(npc.otorgarExp() < npc2.otorgarExp());
        }

    /**
    * Test pjvs pj.
    */
    @Test
    public void testPjvsPj() {
        Humano h = new Humano("Nicolas", new Guerrero(), 1);
        Humano h2 = new Humano("Lautaro", new Guerrero(), 2);
        Personaje.cargarTablaNivel();
        h.setRandom(new MyRandomStub(VALOR1, VALOR2));
        h2.setRandom(new MyRandomStub(VALOR1, VALOR2));
        Assert.assertTrue(h.getExperiencia() == 0);
        Assert.assertTrue(h2.getExperiencia() == 0);

        while (h2.estaVivo()) {
            h.atacar(h2);
            }

        h.ganarExperiencia(h2.otorgarExp());
        Assert.assertTrue(h.getExperiencia() == VALOR4);
        Assert.assertTrue(h2.getExperiencia() == 0);

        }
}
