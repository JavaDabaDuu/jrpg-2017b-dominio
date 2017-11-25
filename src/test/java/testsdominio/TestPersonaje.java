
package testsdominio;

import org.junit.Assert;
import org.junit.Test;

import dominio.Asesino;
import dominio.Elfo;
import dominio.Guerrero;
import dominio.Hechicero;
import dominio.Humano;
import dominio.Orco;


/**
 * The Class TestPersonaje.
 */
public class TestPersonaje {
    /**
     * Valor de salud esperado para un humano.
     */
    private static final int SALUD_ESPERADA_HUMANO = 105;
    /**
     * Valor de energia esperado para un humano.
     */
    private static final int ENERGIA_ESPERADA_HUMANO = 105;
    /**
     * Valor de salud esperado para un elfo.
     */
    private static final int SALUD_ESPERADA_ELFO = 100;
    /**
     * Valor de energia esperado para un elfo.
     */
    private static final int ENERGIA_ESPERADA_ELFO = 110;
    /**
     * Valor de salud esperado para un orco.
     */
    private static final int SALUD_ESPERADA_ORCO = 110;
    /**
     * Valor de energia esperado para un orco.
     */
    private static final int ENERGIA_ESPERADA_ORCO = 100;
    /**
     * Valor de fuerza esperado para un guerrero.
     */
    private static final int FUERZA_ESPERADA_GUERRERO = 15;
    /**
     * Valor de inteligencia esperado para un guerrero.
     */
    private static final int INTELIGENCIA_ESPERADA_GUERRERO = 10;
    /**
     * Valor de destreza esperado para un guerrero.
     */
    private static final int DESTREZA_ESPERADA_GUERRERO = 10;
    /**
     * Valor de fuerza esperado para un hechicero.
     */
    private static final int FUERZA_ESPERADA_HECHICERO = 10;
    /**
     * Valor de inteligencia esperado para un hechicero.
     */
    private static final int INTELIGENCIA_ESPERADA_HECHICERO = 15;
    /**
     * Valor de destreza esperado para un hechicero.
     */
    private static final int DESTREZA_ESPERADA_HECHICERO = 10;
    /**
     * Valor de fuerza esperado para un asesino.
     */
    private static final int FUERZA_ESPARADA_ASESINO = 10;
    /**
     * Valor de inteligencia esperado para un asesino.
     */
    private static final int INTELIGENCIA_ESPERADA_ASESINO = 10;
    /**
     * Valor de destreza esperado para un asesino.
     */
    private static final int DESTREZA_ESPERADA_ASESINO = 15;
    /**
     * Valor de identificador para usar en test.
     */
    private static final int ID1 = 1;
    /**
     * Valor de identificador para usar en test.
     */
    private static final int ID2 = 2;
    /**
     * Valor de identificador para usar en test.
     */
    private static final int ID3 = 3;
    /**
    * Test humano.
    */
    @Test
    public void testHumano() {
        Humano h = new Humano("Nicolas", new Guerrero(), ID1);
        Assert.assertTrue(h.getSalud() == SALUD_ESPERADA_HUMANO);
        Assert.assertTrue(h.getEnergia() == ENERGIA_ESPERADA_HUMANO);
        Assert.assertTrue(h.getFuerza() == FUERZA_ESPERADA_GUERRERO);
        Assert.assertTrue(h.getDestreza()
                == DESTREZA_ESPERADA_GUERRERO);
        Assert.assertTrue(h.getInteligencia()
                == INTELIGENCIA_ESPERADA_GUERRERO);

        Humano h2 = new Humano("Lautaro", new Hechicero(), ID2);
        Assert.assertTrue(h2.getSalud() == SALUD_ESPERADA_HUMANO);
        Assert.assertTrue(h2.getEnergia() == ENERGIA_ESPERADA_HUMANO);
        Assert.assertTrue(h2.getFuerza() == FUERZA_ESPERADA_HECHICERO);
        Assert.assertTrue(h2.getDestreza()
                == DESTREZA_ESPERADA_HECHICERO);
        Assert.assertTrue(h2.getInteligencia()
                == INTELIGENCIA_ESPERADA_HECHICERO);

        Humano h3 = new Humano("Hernan", new Asesino(), ID3);
        Assert.assertTrue(h3.getSalud() == SALUD_ESPERADA_HUMANO);
        Assert.assertTrue(h3.getEnergia() == ENERGIA_ESPERADA_HUMANO);
        Assert.assertTrue(h3.getFuerza() == FUERZA_ESPARADA_ASESINO);
        Assert.assertTrue(h3.getDestreza()
                == DESTREZA_ESPERADA_ASESINO);
        Assert.assertTrue(h3.getInteligencia()
                == INTELIGENCIA_ESPERADA_ASESINO);
        }

    /**
    * Test elfo.
    */
    @Test
    public void testElfo() {
        Elfo e = new Elfo("Nicolas", new Guerrero(), ID1);
        Assert.assertTrue(e.getSalud() == SALUD_ESPERADA_ELFO);
        Assert.assertTrue(e.getEnergia() == ENERGIA_ESPERADA_ELFO);
        Assert.assertTrue(e.getFuerza() == FUERZA_ESPERADA_GUERRERO);
        Assert.assertTrue(e.getDestreza()
            == DESTREZA_ESPERADA_GUERRERO);
        Assert.assertTrue(e.getInteligencia()
            == INTELIGENCIA_ESPERADA_GUERRERO);

        Elfo e2 = new Elfo("Lautaro", new Hechicero(), ID2);
        Assert.assertTrue(e2.getSalud() == SALUD_ESPERADA_ELFO);
        Assert.assertTrue(e2.getEnergia() == ENERGIA_ESPERADA_ELFO);
        Assert.assertTrue(e2.getFuerza() == FUERZA_ESPERADA_HECHICERO);
        Assert.assertTrue(e2.getDestreza()
            == DESTREZA_ESPERADA_HECHICERO);
        Assert.assertTrue(e2.getInteligencia()
            == INTELIGENCIA_ESPERADA_HECHICERO);

        Elfo e3 = new Elfo("Hernan", new Asesino(), ID3);
        Assert.assertTrue(e3.getSalud() == SALUD_ESPERADA_ELFO);
        Assert.assertTrue(e3.getEnergia() == ENERGIA_ESPERADA_ELFO);
        Assert.assertTrue(e3.getFuerza() == FUERZA_ESPARADA_ASESINO);
        Assert.assertTrue(e3.getDestreza()
            == DESTREZA_ESPERADA_ASESINO);
        Assert.assertTrue(e3.getInteligencia()
            == INTELIGENCIA_ESPERADA_ASESINO);
        }

    /**
    * Test orco.
    */
    @Test
    public void testOrco() {
        Orco o = new Orco("Nicolas", new Guerrero(), ID1);
        Assert.assertTrue(o.getSalud() == SALUD_ESPERADA_ORCO);
        Assert.assertTrue(o.getEnergia() == ENERGIA_ESPERADA_ORCO);
        Assert.assertTrue(o.getFuerza() == FUERZA_ESPERADA_GUERRERO);
        Assert.assertTrue(o.getDestreza()
            == DESTREZA_ESPERADA_GUERRERO);
        Assert.assertTrue(o.getInteligencia()
            == INTELIGENCIA_ESPERADA_GUERRERO);

        Orco o2 = new Orco("Lautaro", new Hechicero(), ID2);
        Assert.assertTrue(o2.getSalud() == SALUD_ESPERADA_ORCO);
        Assert.assertTrue(o2.getEnergia() == ENERGIA_ESPERADA_ORCO);
        Assert.assertTrue(o2.getFuerza() == FUERZA_ESPERADA_HECHICERO);
        Assert.assertTrue(o2.getDestreza()
            == DESTREZA_ESPERADA_HECHICERO);
        Assert.assertTrue(o2.getInteligencia()
            == INTELIGENCIA_ESPERADA_HECHICERO);

        Orco o3 = new Orco("Hernan", new Asesino(), ID3);
        Assert.assertTrue(o3.getSalud() == SALUD_ESPERADA_ORCO);
        Assert.assertTrue(o3.getEnergia() == ENERGIA_ESPERADA_ORCO);
        Assert.assertTrue(o3.getFuerza() == FUERZA_ESPARADA_ASESINO);
        Assert.assertTrue(o3.getDestreza()
            == DESTREZA_ESPERADA_ASESINO);
        Assert.assertTrue(o3.getInteligencia()
            == INTELIGENCIA_ESPERADA_ASESINO);
        }

    /**
     * Test funcionamiento correcto de la invisibilidad.
     */
    @Test
    public void testFuncionamientoCorrectoDeLaInvisibilidad() {
      Orco o = new Orco("Leonel", new Guerrero(), ID1);
      Assert.assertTrue(o.isInvisible() == false);
      o.setInvisible();
      Assert.assertTrue(o.isInvisible() == true);
    }

    /**
     * Test funcionamiento correcto de modo dios.
     */
    @Test
    public void testFuncionamientoCorrectoDeModoDios() {
      Orco o = new Orco("Leonel", new Guerrero(), ID1);
      Assert.assertTrue(o.modoDiosActivado() == false);
      o.activarModoDios();
      Assert.assertTrue(o.modoDiosActivado() == true);
    }
}
