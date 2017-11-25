
package testsdominio;

import org.junit.Assert;
import org.junit.Test;

import dominio.Asesino;
import dominio.Hechicero;
import dominio.Humano;
import dominio.MyRandomStub;
import dominio.NonPlayableCharacter;
import dominio.Personaje;

/**
 * The Class TestHechieroNuevo.
 */
public class TestHechieroNuevo {
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
    private static final int VALOR3 = -20;
    /**
    * Valor usado en test.
    */
    private static final int VALOR4 = -100;
    /**
    * Test habilidad 3.
    */
    @Test
    public void testHabilidad3() {
        Personaje p1 = new Humano("Ben Affleck", new Hechicero(), 2);
        Personaje p2 = new Humano("Batman", new Asesino(), 2);
        p1.setRandom(new MyRandomStub(VALOR1, VALOR2));
        p2.setRandom(new MyRandomStub(VALOR1, VALOR2));
        p1.aumentarEnergia(VALOR4);
        Assert.assertFalse(p1.habilidadCasta3(p2));
        }

    /**
    * Test habilidad 2.
    */
    @Test
    public void testHabilidad2() {
        Personaje p1 = new Humano("Ben Affleck", new Hechicero(), 2);
        Personaje p2 = new Humano("Batman", new Asesino(), 2);
        p1.setRandom(new MyRandomStub(VALOR1, VALOR2));
        p2.setRandom(new MyRandomStub(VALOR1, VALOR2));
        p1.aumentarEnergia(VALOR4);
        Assert.assertFalse(p1.habilidadCasta2(p2));
        }

    /**
    * Test habilidad 1.
    */
    @Test
    public void testHabilidad1() {
        Personaje p1 = new Humano("Ben Affleck", new Hechicero(), 2);
        Personaje p2 = new Humano("Batman", new Asesino(), 2);
        p1.setRandom(new MyRandomStub(VALOR1, VALOR2));
        p2.setRandom(new MyRandomStub(VALOR1, VALOR2));
        p1.aumentarEnergia(VALOR4);
        Assert.assertFalse(p1.habilidadCasta1(p2));
        }

    /**
    * Test instance of horrible 1.
    */
    @Test
    public void testInstanceOfHorrible1() {
        Personaje p1 = new Humano("Ben Affleck", new Hechicero(), 2);
        p1.aumentarInteligencia(VALOR3);
        p1.setRandom(new MyRandomStub(VALOR1, VALOR2));
        NonPlayableCharacter npc = new NonPlayableCharacter(
            "Pepe", 1, 1);
        npc.setRandom(new MyRandomStub(VALOR1, VALOR2));

        Assert.assertFalse(p1.habilidadCasta1(npc));
        }

    /**
    * Test instance of horrible 2.
    */
    @Test
    public void testInstanceOfHorrible2() {
        Personaje p1 = new Humano("Ben Affleck", new Hechicero(), 2);
        NonPlayableCharacter npc = new NonPlayableCharacter(
            "Pepe", 1, 1);
        p1.setRandom(new MyRandomStub(VALOR1, VALOR2));
        npc.setRandom(new MyRandomStub(VALOR1, VALOR2));
        Assert.assertFalse(p1.habilidadCasta2(npc));
        }

    /**
    * Test instance of horrible 3.
    */
    @Test
    public void testInstanceOfHorrible3() {
        Personaje p1 = new Humano("Ben Affleck", new Hechicero(), 2);
        NonPlayableCharacter npc = new NonPlayableCharacter(
            "Pepe", 1, 1);
        p1.setRandom(new MyRandomStub(VALOR1, VALOR2));
        npc.setRandom(new MyRandomStub(VALOR1, VALOR2));
        Assert.assertFalse(p1.habilidadCasta3(npc));
        }

}
