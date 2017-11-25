
package testsdominio;


import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;

import dominio.Asesino;
import dominio.Hechicero;
import dominio.Humano;
import dominio.MyRandomStub;
import dominio.Personaje;


/**
 * The Class TestPersonajeNuevo.
 */
public class TestPersonajeNuevo {
    /**
    * Valor usado en test.
    */
    private static final int VALOR1 = 3;
    /**
    * Valor usado en test.
    */
    private static final int VALOR2 = 105;
    /**
    * Valor usado en test.
    */
    private static final int VALOR3 = 130;
    /**
    * Valor usado en test.
    */
    private static final int VALOR4 = -96;
    /**
    * Valor usado en test.
    */
    private static final int VALOR5 = 9;
    /**
    * Valor usado en test.
    */
    private static final double VALOR6 = 0.49;
    /**
    * Valor usado en test.
    */
    private static final int VALOR7 = 985;
    /**
    * Valor usado en test.
    */
    private static final int VALOR8 = 1000;
    /**
    * Valor usado en test.
    */
    private static final int VALOR9 = 102;
    /**
    * Valor usado en test.
    */
    private static final int VALOR10 = 12;
    /**
    * Valor usado en test.
    */
    private static final int VALOR11 = 8;
    /**
    * Valor usado en test.
    */
    private static final int VALOR12 = 900;
    /**
    * Valor usado en test.
    */
    private static final int VALOR13 = -97;
    /**
    * Valor usado en test.
    */
    private static final int VALOR14 = 20;
    /**
    * Valor usado en test.
    */
    private static final int VALOR15 = 115;
    /**
    * Valor usado en test.
    */
    private static final int VALOR16 = 10;
    /**
    * Valor usado en test.
    */
    private static final double VALOR17 = 0.15;

    /**
    * Test distancia.
    */
    @Test
    public void testDistancia() {
        Personaje p1 = new Humano("Ben Affleck", new Asesino(), 2);
        Personaje p2 = new Humano("Link", new Hechicero(), 2);
        Assert.assertEquals(0, p1.distanciaCon(p2), 0);
        }

    /**
    * Test aliar ya teniendo alianza.
    */
    @Test
    public void testAliarYaTeniendoAlianza() {
        Personaje p1 = new Humano("Ben Affleck", new Asesino(), 2);
        Personaje p2 = new Humano("Link", new Hechicero(), 2);
        p1.crearAlianza("AndaPls");
        p2.crearAlianza("El 30 vuelve House of Cards");
        Assert.assertFalse(p1.aliar(p2));
        }

    /**
    * Test aliar por primera vez.
    */
    @Test
    public void testAliarPorPrimeraVez() {
        Personaje p1 = new Humano("Ben Affleck", new Asesino(), 2);

        p1.crearAlianza("AndaPls");
        Personaje p2 = new Humano("Link", new Hechicero(), 2);
        Assert.assertTrue(p1.aliar(p2));
        }

    /**
    * Test salir alianza.
    */
    @Test
    public void testSalirAlianza() {
        Personaje p1 = new Humano("Ben Affleck", new Asesino(), 2);
        p1.salirDeAlianza();
        p1.crearAlianza("AndaPls");
        Assert.assertNotNull(p1.getClan());
        p1.salirDeAlianza();
        Assert.assertNull(p1.getClan());
        }

    /**
    * Test ser robado.
    */
    @Test
    public void testSerRobado() {
        Personaje p1 = new Humano("Ben Affleck", new Asesino(), 2);
        // No le hace nada porque al defensa es mayor al dano
        Assert.assertEquals(0, p1.serRobadoSalud(VALOR1));
        // 105 de vida + 15 de defensa = 130
        Assert.assertEquals(VALOR2, p1.serRobadoSalud(VALOR3));
        Assert.assertEquals(0, p1.getSalud());
        }

    /**
    * Test ser desenergizado.
    */
    @Test
    public void testSerDesenergizado() {
        Personaje p1 = new Humano("Ben Affleck", new Asesino(), 2);
        // No le hace nada porque al defensa es mayor al dano
        Assert.assertEquals(0, p1.serDesenergizado(VALOR1));
        // 105 de energia + 15 de defensa = 130
        Assert.assertEquals(VALOR2, p1.serDesenergizado(VALOR3));
        Assert.assertEquals(0, p1.getEnergia());
        }

    /**
    * Test puedo atacar.
    */
    @Test
    public void testPuedoAtacar() {
        Personaje p1 = new Humano("Ben Affleck", new Asesino(), 2);
        Assert.assertTrue(p1.puedeAtacar());
        p1.aumentarEnergia(VALOR4);
        Assert.assertEquals(VALOR5, p1.getEnergia());
        Assert.assertFalse(p1.puedeAtacar());
        }

    /**
    * Test atacar golpe critico.
    */
    @Test
    public void testAtacarGolpeCritico() {
        Personaje p1 = new Humano("Ben Affleck", new Asesino(), 2);
        Personaje p2 = new Humano("Link", new Hechicero(), 2);
        p1.setRandom(new MyRandomStub(VALOR6, VALOR1));
        p2.setRandom(new MyRandomStub(VALOR6, VALOR1));
        p1.aumentarDestreza(VALOR7);
        Assert.assertEquals(VALOR8, p1.getDestreza());
        //Me aseguro golpe critico, 12 porque 22.5 truncado
        // es 22 y la defensa de p2 es 10
        Assert.assertEquals(VALOR10, p1.atacar(p2));
        }

    /**
    * Test restablecer salud.
    */
    @Test
    public void testRestablecerSalud() {
        Personaje p1 = new Humano("Ben Affleck", new Asesino(), 2);
        p1.reducirSalud(VALOR9);
        Assert.assertEquals(VALOR1, p1.getSalud());
        p1.restablecerSalud();
        Assert.assertEquals(VALOR2, p1.getSalud());
        }

    /**
    * Test restablecer energia.
    */
    @Test
    public void testRestablecerEnergia() {
        Personaje p1 = new Humano("Ben Affleck", new Asesino(), 2);
        p1.aumentarEnergia(-VALOR9);
        Assert.assertEquals(VALOR1, p1.getEnergia());
        p1.restablecerEnergia();
        Assert.assertEquals(VALOR2, p1.getEnergia());
        }

    /**
    * Test ser atacado.
    */
    @Test
    public void testSerAtacado() {
        Personaje p1 = new Humano("Ben Affleck", new Asesino(), 2);
        Assert.assertEquals(0, p1.serAtacado(VALOR1));
        p1.getCasta().aumentarEvitarDanio(VALOR11);
        // Le aumento evitardano y vuelvo a probar con un dano
        // mucho mayor a la defensa y asi me devuelve 0
        // porque no entra al if
        Assert.assertEquals(0, p1.serAtacado(VALOR12));
        }

    /**
    * Test ser energizado.
    */
    @Test
    public void testSerEnergizado() {
        Personaje p1 = new Humano("Ben Affleck", new Asesino(), 2);
        p1.aumentarEnergia(VALOR13);
        Assert.assertEquals(VALOR11, p1.getEnergia());
        p1.serEnergizado(VALOR12);
        Assert.assertEquals(VALOR2, p1.getEnergia());
        }

    /**
    * Test nombre raza.
    */
    @Test
    public void testNombreRaza() {
        Personaje p1 = new Humano("Ben Affleck", new Asesino(), 2);
        Assert.assertEquals("Humano", p1.getNombreRaza());
        }

    /**
    * Test set magia.
    */
    @Test
    public void testSetMagia() {
        Personaje p1 = new Humano("Ben Affleck", new Asesino(), 2);
        p1.setMagia(VALOR14);
        Assert.assertEquals(VALOR14, p1.getMagia());
        }



    /**
    * Test get id personaje.
    */
    @Test
    public void testGetIdPersonaje() {
        Personaje p1 = new Humano("Ben Affleck", new Asesino(), 2);
        Assert.assertEquals(2, p1.getIdPersonaje());
        }

    /**
    * Test aumentar salud.
    */
    @Test
    public void testAumentarSalud() {
        Personaje p1 = new Humano("Ben Affleck", new Asesino(), 2);
        p1.aumentarSalud(VALOR16);
        Assert.assertEquals(VALOR15, p1.getSalud());
        }

    /**
    * Test actualizar atributos.
    */
    @Test
    public void testActualizarAtributos() {
        Personaje p1 = new Humano("Ben Affleck", new Asesino(), 2);
        HashMap<String, Number> mapaso = new HashMap<String, Number>();
        mapaso.put("salud", VALOR14);
        mapaso.put("energia", VALOR16);
        mapaso.put("defensa", VALOR16);
        mapaso.put("probEvitarDanio", VALOR17);
        p1.actualizarAtributos(mapaso);
        Assert.assertEquals(VALOR14, p1.getSalud());
        Assert.assertEquals(VALOR16, p1.getEnergia());
        Assert.assertTrue(p1.calcularPuntosDeDefensa()
            == p1.getDestreza());

        }
}
