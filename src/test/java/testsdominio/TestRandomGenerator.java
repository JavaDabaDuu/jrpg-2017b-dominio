
package testsdominio;

import org.junit.Assert;
import org.junit.Test;

import dominio.RandomGenerator;


/**
 * The Class TestRandomGenerator.
 */
public class TestRandomGenerator {
    /**
    * Valor usado en test.
    */
    private static final int VALOR = 3;
    /**
    * Test.
    */
    @Test
    public void test() {
        RandomGenerator ran = new RandomGenerator();
        Assert.assertEquals(0, ran.nextInt(VALOR));
        Assert.assertEquals(0, ran.nextDouble(), 0);
        }

}
