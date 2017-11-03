
package testsdominio;

import org.junit.Assert;
import org.junit.Test;

import dominio.Asesino;
import dominio.Elfo;
import dominio.Guerrero;
import dominio.Hechicero;
import dominio.Humano;
import dominio.Orco;
import dominio.Personaje;


/**
 * The Class TestRefactoreoAtributos.
 */
public class TestRefactoreoAtributos {
    /**
    * Valor usado en test.
    */
    private static final int VALOR1 = 15;
    /**
    * Valor usado en test.
    */
    private static final int VALOR2 = 105;
    /**
    * Valor usado en test.
    */
    private static final int VALOR3 = 100;
    /**
    * Valor usado en test.
    */
    private static final int VALOR4 = 110;
    /**
    * Test destreza asesino.
    */
    @Test
    public void testDestrezaAsesino() {
        Personaje p = new Humano("Ben Affleck", new Asesino(), 1);
        Assert.assertEquals(VALOR1, p.getDestreza());
        }

    /**
    * Test fuerza guerrero.
    */
    @Test
    public void testFuerzaGuerrero() {
        Personaje p = new Humano("Ben Affleck", new Guerrero(), 1);
        Assert.assertEquals(VALOR1, p.getFuerza());
        }

    /**
    * Test inteligencia hechicero.
    */
    @Test
    public void testInteligenciaHechicero() {
        Personaje p = new Humano("Ben Affleck", new Hechicero(), 1);
        Assert.assertEquals(VALOR1, p.getInteligencia());
        }

    /**
    * Test full humano.
    */
    @Test
    public void testFullHumano() {
        Personaje p = new Humano("Ben Affleck", new Asesino(), 1);
        Personaje p1 = new Humano("Ben Affleck", new Hechicero(), 1);
        Personaje p2 = new Humano("Ben Affleck", new Guerrero(), 1);
        /* Testeo que sin importar la casta, sigue teniendo
    la misma energia y salud porque eso depende de la Raza*/
        Assert.assertEquals(VALOR2, p.getSaludTope());
        Assert.assertEquals(VALOR2, p.getEnergiaTope());
        Assert.assertEquals(VALOR2, p1.getSaludTope());
        Assert.assertEquals(VALOR2, p1.getEnergiaTope());
        String[] hCastaA = {"Golpe Critico", "Aumentar Evasion",
            "Robar"};
        String[] hCastaH = {"Bola de Fuego", "Curar Aliado",
            "Robar Energia y Salud"};
        String[] hCastaG = {"Ataque Doble", "Aumentar Defensa",
            "Ignorar Defensa"};
        String[] hRaza = {"Incentivar", "Golpe Fatal"};
        Assert.assertArrayEquals(hCastaA, p.getHabilidadesCasta());
        Assert.assertArrayEquals(hCastaH, p1.getHabilidadesCasta());
        Assert.assertArrayEquals(hCastaG, p2.getHabilidadesCasta());
        Assert.assertArrayEquals(hRaza, p.getHabilidadesRaza());
        }

    /**
    * Test full orco.
    */
    @Test
    public void testFullOrco() {
        Personaje p = new Orco("Ben Affleck", new Asesino(), 1);
        Personaje p1 = new Orco("Ben Affleck", new Hechicero(), 1);
        Personaje p2 = new Orco("Ben Affleck", new Guerrero(), 1);
        /* Testeo que sin importar la casta, sigue teniendo la misma
        *  energia y salud porque eso depende de la Raza*/
        Assert.assertEquals(VALOR4, p.getSaludTope());
        Assert.assertEquals(VALOR3, p.getEnergiaTope());
        Assert.assertEquals(VALOR4, p1.getSaludTope());
        Assert.assertEquals(VALOR3, p1.getEnergiaTope());
        String[] hCastaA = {"Golpe Critico", "Aumentar Evasion",
            "Robar"};
        String[] hCastaH = {"Bola de Fuego", "Curar Aliado",
            "Robar Energia y Salud"};
        String[] hCastaG = {"Ataque Doble", "Aumentar Defensa",
            "Ignorar Defensa"};
        String[] hRaza = {"Golpe Defensa", "Mordisco de Vida"};
        Assert.assertArrayEquals(hCastaA, p.getHabilidadesCasta());
        Assert.assertArrayEquals(hCastaH, p1.getHabilidadesCasta());
        Assert.assertArrayEquals(hCastaG, p2.getHabilidadesCasta());
        Assert.assertArrayEquals(hRaza, p.getHabilidadesRaza());
        }

    /**
    * Test full elfo.
    */
    @Test
    public void testFullElfo() {
        Personaje p = new Elfo("Ben Affleck", new Asesino(), 1);
        Personaje p1 = new Elfo("Ben Affleck", new Hechicero(), 1);
        Personaje p2 = new Elfo("Ben Affleck", new Guerrero(), 1);
        /* Testeo que sin importar la casta, sigue teniendo la misma
        *  energia y salud porque eso depende de la Raza*/
        Assert.assertEquals(VALOR3, p.getSaludTope());
        Assert.assertEquals(VALOR4, p.getEnergiaTope());
        Assert.assertEquals(VALOR3, p1.getSaludTope());
        Assert.assertEquals(VALOR4, p1.getEnergiaTope());
        String[] hCastaA = {"Golpe Critico", "Aumentar Evasion",
            "Robar"};
        String[] hCastaH = {"Bola de Fuego", "Curar Aliado",
            "Robar Energia y Salud"};
        String[] hCastaG = {"Ataque Doble", "Aumentar Defensa",
            "Ignorar Defensa"};
        String[] hRaza = {"Golpe Level", "Ataque Bosque"};
        Assert.assertArrayEquals(hCastaA, p.getHabilidadesCasta());
        Assert.assertArrayEquals(hCastaH, p1.getHabilidadesCasta());
        Assert.assertArrayEquals(hCastaG, p2.getHabilidadesCasta());
        Assert.assertArrayEquals(hRaza, p.getHabilidadesRaza());
        }
}
