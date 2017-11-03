package testsdominio;

import org.junit.Assert;
import org.junit.Test;

import dominio.Alianza;

/**
 * The Class TestAlianzaNuevo.
 */
public class TestAlianzaNuevo {


    /**
    * Test get nombre.
    */
    @Test
    public void testGetNombre() {
        Alianza ali = new Alianza("Los Isotopos");
        Assert.assertEquals("Los Isotopos", ali.obtenerNombre());
        }


}
