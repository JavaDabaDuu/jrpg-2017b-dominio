
package testsdominio;

import org.junit.Assert;
import org.junit.Test;

import dominio.NonPlayableCharacter;

/**
 * The Class TestNPC.
 */
public class TestNPC {
    /**
    * Valor usado en test.
    */
    private static final int VALOR = 30;
    /**
    * Test otorgar exp.
    */
    @Test
    public void testOtorgarExp() {
        NonPlayableCharacter npc = new NonPlayableCharacter(
            "Gigante", 1, -1);
        Assert.assertTrue(VALOR == npc.otorgarExp());
        }
}
