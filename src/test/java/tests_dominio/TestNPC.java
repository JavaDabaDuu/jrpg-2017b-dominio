package tests_dominio;

import org.junit.Assert;
import org.junit.Test;

import dominio.NonPlayableCharacter;

// TODO: Auto-generated Javadoc
/**
 * The Class TestNPC.
 */
public class TestNPC {

	/**
	 * Test otorgar exp.
	 */
	@Test
	public void testOtorgarExp() {
		NonPlayableCharacter npc = new NonPlayableCharacter("Gigante", 1, -1);
		Assert.assertTrue(30 == npc.otorgarExp());
	}
}
