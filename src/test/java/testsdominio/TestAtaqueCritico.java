
package testsdominio;

import org.junit.Assert;
import org.junit.Test;

import dominio.Guerrero;
import dominio.Humano;


/**
 * The Class TestAtaqueCritico.
 */
public class TestAtaqueCritico {

    /**
     * Valor de identificador para usar en test.
     */
    private static int id1 = 1;
    /**
     * Valor double que se usa para multiplicar el ataque en el test.
     */
    private static final  double VALOR = 1.5;
    /**
    * Testgolpe crit.
    */
    @Test
    public void testgolpeCrit() {
        Humano h = new Humano("Nicolas", new Guerrero(), id1);
        Assert.assertEquals(h.getAtaque() * VALOR, h.golpeCritico(), 1);
        }


}
