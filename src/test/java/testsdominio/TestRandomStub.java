
package testsdominio;

import org.junit.Assert;
import org.junit.Test;

import dominio.MyRandomStub;
import dominio.RandomGenerator;

/**
 * The Class testRandomStub.
 */
public class TestRandomStub {
    /**
    * Valor usado en test.
    */
    private static final int VALOR1 = 3;
    /**
    * Valor usado en test.
    */
    private static final int VALOR2 = 2;
    /**
    * Test.
    */
    @Test
    public void test() {
        RandomGenerator ran = new MyRandomStub(VALOR1, VALOR2);
        Assert.assertEquals(2, ran.nextInt(VALOR1));
        Assert.assertEquals(VALOR1, ran.nextDouble(), 0);
        }

}
