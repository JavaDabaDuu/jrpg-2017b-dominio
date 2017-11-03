
package testsdominio;

import org.junit.Assert;
import org.junit.Test;

import dominio.Asesino;
import dominio.Humano;
import dominio.MyRandomStub;
import dominio.Personaje;


/**
 * The Class TestHumanoNuevo.
 */
public class TestHumanoNuevo {
    /**
    * Valor usado en test.
    */
    private static final double VALOR1 = 0.49;
    /**
    * Valor usado en test.
    */
    private static final int VALOR2 = 3;
    /**
    * Valor usado en test.
    */
    private static final int VALOR3 = 95;
    /**
    * Valor usado en test.
    */
    private static final int VALOR4 = -100;
    /**
    * Valor usado en test.
    */
    private static final int VALOR5 = 105;
    /**
    * Test habilidad raza 1.
    */
    @Test
    public void testHabilidadRaza1() {
        Personaje p1 = new Humano("Ben Affleck", new Asesino(), 2);
        Personaje p2 = new Humano("I'm Batman", new Asesino(), 2);
        p1.setRandom(new MyRandomStub(VALOR1, VALOR2));
        p2.setRandom(new MyRandomStub(VALOR1, VALOR2));
        p1.aumentarEnergia(VALOR4);
        Assert.assertFalse(p1.habilidadRaza1(p2));
        }

    /**
    * Test habilidad raza 2.
    */
    @Test
    public void testHabilidadRaza2() {
        Personaje p1 = new Humano("Ben Affleck", new Asesino(), 2);
        Personaje p2 = new Humano("I'm Batman", new Asesino(), 2);
        p1.setRandom(new MyRandomStub(VALOR1, VALOR2));
        p2.setRandom(new MyRandomStub(VALOR1, VALOR2));
        p2.reducirSalud(p2.getSalud());
        Assert.assertEquals(VALOR5, p1.getEnergia());
        Assert.assertFalse(p1.habilidadRaza2(p2));
        Assert.assertEquals(VALOR3, p1.getEnergia());
        }

    /**
    * Test habilidad raza 2 S.
    */
    @Test
    public void testHabilidadRaza2S() {
        Personaje p1 = new Humano("Ben Affleck", new Asesino(), 2);
        Personaje p2 = new Humano("I'm Batman", new Asesino(), 2);
        p1.setRandom(new MyRandomStub(VALOR1, VALOR2));
        p2.setRandom(new MyRandomStub(VALOR1, VALOR2));
        p1.aumentarEnergia(VALOR4);
        Assert.assertFalse(p1.habilidadRaza2(p2));
        }

}
