
package testsdominio;

import org.junit.Assert;
import org.junit.Test;

import dominio.Alianza;
import dominio.Asesino;
import dominio.Guerrero;
import dominio.Humano;
import dominio.MyRandomStub;

/**
 * The Class TestAliarCombatir.
 */
public class TestAliarCombatir {

    /**
    * Valor double para realizar el test.
    */
    private static final double VALOR_DOUBLE = 0.49;
    /**
    * Valor int para realizar el test.
    */
    private static final int VALOR_INT = 3;
    /**
    * Valor de salud esperada para realizar el test.
    */
    private static final int SALUD_ESPERADA = 105;
    /**
    * Test crear alianza.
    */
    @Test
    public void testCrearAlianza() {
        Humano h = new Humano("Nicolas", new Guerrero(), 1);
        Humano h2 = new Humano("Lautaro", new Guerrero(), 1);

        Assert.assertNull(h.getClan());
        Assert.assertNull(h2.getClan());
        h.aliar(h2);
        Assert.assertNotNull(h.getClan());
        Assert.assertNotNull(h2.getClan());
        }

    /**
    * Test dañar.
    */
    @Test
    public void testDaniar() {
        Humano h = new Humano("Nicolas", new Guerrero(), 1);
        Humano h2 = new Humano("Lautaro", new Asesino(), 1);
        h.setRandom(new MyRandomStub(VALOR_DOUBLE, VALOR_INT));
        h2.setRandom(new MyRandomStub(VALOR_DOUBLE, VALOR_INT));
        Assert.assertTrue(h2.getSalud() == SALUD_ESPERADA);
        if (h.atacar(h2) != 0) {
            Assert.assertTrue(h2.getSalud() < SALUD_ESPERADA);
        }  else {
            Assert.assertTrue(h2.getSalud() == SALUD_ESPERADA);
        }
        }

    /**
    * Test aliar.
    */
    @Test
    public void testAliar() {
        Humano h = new Humano("Nicolas", new Guerrero(), 1);
        Humano h2 = new Humano("Lautaro", new Guerrero(), 1);
        Alianza a1 = new Alianza("Los CacheFC");
        h.setRandom(new MyRandomStub(VALOR_DOUBLE, VALOR_INT));
        h2.setRandom(new MyRandomStub(VALOR_DOUBLE, VALOR_INT));
        Assert.assertNull(h2.getClan());
        Assert.assertNull(h.getClan());
        h.setClan(a1);
        Assert.assertNotNull(h.getClan());
        h.aliar(h2);
        Assert.assertTrue(h.getClan() == h2.getClan());
        }



}