
package testsdominio;

import org.junit.Assert;
import org.junit.Test;

import dominio.Asesino;
import dominio.Humano;
import dominio.MyRandomStub;
import dominio.NonPlayableCharacter;
import dominio.Personaje;


/**
 * The Class TestNPCNuevo.
 */
public class TestNPCNuevo {
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
    private static final double VALOR3 = 0.1;
    /**
    * Valor usado en test.
    */
    private static final int VALOR4 = 100;
    /**
    * Valor usado en test.
    */
    private static final int VALOR5 = 80;
    /**
    * Valor usado en test.
    */
    private static final int VALOR6 = 20;
    /**
    * Valor usado en test.
    */
    private static final int VALOR7 = 60;
    /**
    * Valor usado en test.
    */
    private static final int VALOR8 = 4;
    /**
    * Valor usado en test.
    */
    private static final int VALOR9 = 5;
    /**
    * Valor usado en test.
    */
    private static final int VALOR10 = 6;
    /**
    * Valor usado en test.
    */
    private static final int VALOR11 = 18;
    /**
    * Valor usado en test.
    */
    private static final int VALOR12 = 9;
    /**
    * Valor usado en test.
    */
    private static final int VALOR13 = 300;
    /**
    * Valor usado en test.
    */
    private static final int VALOR14 = 90;
    /**
    * Valor usado en test.
    */
    private static final int VALOR15 = 30;
    /**
    * Valor usado en test.
    */
    private static final int VALOR16 = 15;
    /**
    * Test nivel NPC 1.
    */
    @Test
    public void testNivelNPC1() {
        NonPlayableCharacter npc = new NonPlayableCharacter(
            "Pepe", 1, 1);
        Assert.assertEquals(VALOR8, npc.getDefensa());
        Assert.assertEquals(VALOR6, npc.getFuerza());
        Assert.assertEquals(VALOR7, npc.getSalud());
        }

    /**
    * Test daño menor A def.
    */
    @Test
    public void testDanioMenorADef() {
        NonPlayableCharacter npc = new NonPlayableCharacter(
            "Pepe", 1, 1);
        Assert.assertEquals(0, npc.serAtacado(1));
        }

    /**
    * Test get fuerza.
    */
    @Test
    public void testGetFuerza() {
        NonPlayableCharacter npc = new NonPlayableCharacter(
            "Pepe", 1, 1);
        Assert.assertEquals(VALOR6, npc.getFuerza());
        }

    /**
    * Test set ataque.
    */
    @Test
    public void testSetAtaque() {
        NonPlayableCharacter npc = new NonPlayableCharacter(
            "Pepe", 1, 1);
        // Set ataque suma su parametro a la fuerza actual, revisar
        npc.setAtaque(VALOR7);
        Assert.assertEquals(VALOR5, npc.getFuerza());
        }

    /**
    * Test get magia.
    */
    @Test
    public void testGetMagia() {
        NonPlayableCharacter npc = new NonPlayableCharacter(
            "Pepe", 1, 1);
        Assert.assertEquals(0, npc.getMagia());
        }

    /**
    * Test atacar.
    */
    @Test
    public void testAtacar() {
        NonPlayableCharacter npc = new NonPlayableCharacter(
            "Pepe", 1, 1);
        NonPlayableCharacter npc2 = new NonPlayableCharacter(
            "Pepe", 1, 1);
        Personaje p1 = new Humano("Ben Affleck", new Asesino(), 2);
        npc.setRandom(new MyRandomStub(VALOR1, VALOR2));
        npc2.setRandom(new MyRandomStub(VALOR1, VALOR2));
        p1.setRandom(new MyRandomStub(VALOR1, VALOR2));
        // Recordar que trunca porque es entero
        //NPC 20 - (5/2) = 18
        //P1 20 - 15 = 5
        Assert.assertEquals(VALOR11, npc.atacar(npc2));
        Assert.assertEquals(VALOR9, npc.atacar(p1));
        }

    /**
    * Test set salud.
    */
    @Test
    public void testSetSalud() {
        NonPlayableCharacter npc = new NonPlayableCharacter(
            "Pepe", 1, 1);
        npc.setSalud(VALOR5);
        Assert.assertEquals(VALOR5, npc.getSalud());
        }

    /**
    * Test nivel NPC default.
    */
    @Test
    public void testNivelNPCDefault() {
        NonPlayableCharacter npc = new NonPlayableCharacter(
            "Pepe", 1, VALOR12);
        Assert.assertEquals(VALOR6, npc.getDefensa());
        Assert.assertEquals(VALOR4, npc.getFuerza());
        Assert.assertEquals(VALOR13, npc.getSalud());
        }

    /**
    * Test nivel 3 NPC.
    */
    @Test
    public void testNivel3NPC() {
        NonPlayableCharacter npc = new NonPlayableCharacter(
            "Pepe", 1, 2);
        Assert.assertEquals(VALOR10, npc.getDefensa());
        Assert.assertEquals(VALOR14, npc.getSalud());
        Assert.assertEquals(VALOR15, npc.getFuerza());
        }

    /**
    * Test atacar 2.
    */
    @Test
    public void testAtacar2() {
        NonPlayableCharacter npc = new NonPlayableCharacter(
            "Pepe", 1, 1);
        NonPlayableCharacter npc2 = new NonPlayableCharacter(
            "Pepe", 1, 1);
        Personaje p1 = new Humano("Ben Affleck", new Asesino(), 2);
        npc.setRandom(new MyRandomStub(VALOR3, VALOR2));
        npc2.setRandom(new MyRandomStub(VALOR3, VALOR2));
        p1.setRandom(new MyRandomStub(VALOR1, VALOR2));
        // Recordar que trunca porque es entero
        //NPC 20 - (5/2) = 18
        //P1 20 - 15 = 5
        Assert.assertEquals(0, npc.atacar(npc2));
        Assert.assertEquals(VALOR16, npc.atacar(p1));
        }
}
