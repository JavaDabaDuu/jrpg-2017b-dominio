
package testsdominio;

import org.junit.Assert;
import org.junit.Test;

import dominio.Asesino;
import dominio.Humano;
import dominio.Personaje;

/**
 * The Class TestMadreDeTodo.
 */
public class TestMadreDeTodo {


    /**
    * Test set nombre.
    */
    @Test
    public void testSetNombre() {
        Personaje p1 = new Humano("Ben Affleck", new Asesino(), 2);
        p1.setNombre("I'm Batman");
        Assert.assertEquals("I'm Batman", p1.getNombre());
        }

}
