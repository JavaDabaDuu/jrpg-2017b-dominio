package testsdominio;

import static org.junit.Assert.*;

import org.junit.Test;

import dominio.Inventario;
import junit.framework.Assert;

/**
 * The Class TestInventario.
 */
public class TestInventario {

  /** The Constant ID1. */
  private static final int ID1 = 1;

  /** The Constant MANO1_ESPERADA. */
  private static final int MANO1_ESPERADA = -1;

  /** The Constant MANO2_ESPERADA. */
  private static final int MANO2_ESPERADA = -1;

  /** The Constant PIE_ESPERADA. */
  private static final int PIE_ESPERADA = -1;

  /** The Constant CABEZA_ESPERADA. */
  private static final int CABEZA_ESPERADA = -1;

  /** The Constant PECHO_ESPERADA. */
  private static final int PECHO_ESPERADA = -1;

  /** The Constant ACCESORIO_ESPERADA. */
  private static final int ACCESORIO_ESPERADA = -1;

  /**
   * Test crecion correcta.
   */
  @Test
public void testCrecionCorrecta() {
  Inventario i = new Inventario(ID1);
  Assert.assertEquals(i.getidInventario(), ID1);
  Assert.assertEquals(i.getmanos1(), MANO1_ESPERADA);
  Assert.assertEquals(i.getmanos2(), MANO2_ESPERADA);
  Assert.assertEquals(i.getcabeza(), CABEZA_ESPERADA);
  Assert.assertEquals(i.getpecho(), PECHO_ESPERADA);
  Assert.assertEquals(i.getpie(), PIE_ESPERADA);
  Assert.assertEquals(i.getaccesorio(), ACCESORIO_ESPERADA);
  }

  /**
   * Test contruccion por parametro.
  */
  @Test
public void testContruccionPorParametro() {
  Inventario i = new Inventario(ID1, 1, 2, 3, 4, 5, 6);

  Assert.assertEquals(i.getidInventario(), ID1);
  Assert.assertEquals(i.getcabeza(), 4);
  Assert.assertEquals(i.getmanos1(), 1);
  Assert.assertEquals(i.getmanos2(), 2);
  Assert.assertEquals(i.getpecho(), 5);
  Assert.assertEquals(i.getpie(), 3);
  Assert.assertEquals(i.getaccesorio(), 6);
  }
  /**
   * Test correcto seteo en el invectario.
   */
  @Test
  public void testCorrectoSeteoEnElInvectario() {
    Inventario i = new Inventario(ID1);
    i.setidInventario(ID1);
    i.setcabeza(1);
    i.setmanos1(2);
    i.setmanos2(3);
    i.setpecho(4);
    i.setpie(5);
    i.setaccesorio(6);
    Assert.assertEquals(i.getidInventario(), ID1);
    Assert.assertEquals(i.getcabeza(), 1);
    Assert.assertEquals(i.getmanos1(), 2);
    Assert.assertEquals(i.getmanos2(), 3);
    Assert.assertEquals(i.getpecho(), 4);
    Assert.assertEquals(i.getpie(), 5);
    Assert.assertEquals(i.getaccesorio(), 6);
  }

}
