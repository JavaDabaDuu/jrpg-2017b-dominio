package tests_dominio;

import org.junit.Assert;
import org.junit.Test;

import dominio.*;

// TODO: Auto-generated Javadoc
/**
 * The Class TestAtaqueCritico.
 */
public class TestAtaqueCritico {

	/**
	 * Testgolpe crit.
	 */
	@Test
	public void testgolpeCrit(){
		Humano h = new Humano("Nicolas",new Guerrero(),1);
		Assert.assertEquals(h.getAtaque()*1.5, h.golpe_critico(), 1);
	}
}
