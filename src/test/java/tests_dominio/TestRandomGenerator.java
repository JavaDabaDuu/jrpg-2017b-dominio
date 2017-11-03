package tests_dominio;

import org.junit.Assert;
import org.junit.Test;

import dominio.RandomGenerator;

// TODO: Auto-generated Javadoc
/**
 * The Class TestRandomGenerator.
 */
public class TestRandomGenerator {

	/**
	 * Test.
	 */
	@Test
	public void test() {
		RandomGenerator ran = new RandomGenerator();
		Assert.assertEquals(0, ran.nextInt(3));
		Assert.assertEquals(0, ran.nextDouble(),0);
	}

}
