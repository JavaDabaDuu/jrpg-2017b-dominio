package testsdominio;

import static org.junit.Assert.*;

import org.junit.Test;

import dominio.Mochila;
import junit.framework.Assert;

/**
 * The Class TestMochila.
 */
public class TestMochila {

  /** The Constant ID1. */
  private static final int ID1 = 1;

  /** The Constant ITEMS_ESPERADO. */
  private static final int ITEMS_ESPERADO = -1;

  /**
  * Test creacion correcta mochila.
  */
  @Test
public void testCreacionCorrectaMochila() {
  Mochila m1 = new Mochila(ID1);
  Assert.assertEquals(m1.getItem1(), ITEMS_ESPERADO);
  Assert.assertEquals(m1.getItem2(), ITEMS_ESPERADO);
  Assert.assertEquals(m1.getItem3(), ITEMS_ESPERADO);
  Assert.assertEquals(m1.getItem4(), ITEMS_ESPERADO);
  Assert.assertEquals(m1.getItem5(), ITEMS_ESPERADO);
  Assert.assertEquals(m1.getItem6(), ITEMS_ESPERADO);
  Assert.assertEquals(m1.getItem7(), ITEMS_ESPERADO);
  Assert.assertEquals(m1.getItem8(), ITEMS_ESPERADO);
  Assert.assertEquals(m1.getItem9(), ITEMS_ESPERADO);
  Assert.assertEquals(m1.getItem10(), ITEMS_ESPERADO);
  Assert.assertEquals(m1.getItem11(), ITEMS_ESPERADO);
  Assert.assertEquals(m1.getItem12(), ITEMS_ESPERADO);
  Assert.assertEquals(m1.getItem13(), ITEMS_ESPERADO);
  Assert.assertEquals(m1.getItem14(), ITEMS_ESPERADO);
  Assert.assertEquals(m1.getItem15(), ITEMS_ESPERADO);
  Assert.assertEquals(m1.getItem16(), ITEMS_ESPERADO);
  Assert.assertEquals(m1.getItem17(), ITEMS_ESPERADO);
  Assert.assertEquals(m1.getItem18(), ITEMS_ESPERADO);
  Assert.assertEquals(m1.getItem19(), ITEMS_ESPERADO);
  Assert.assertEquals(m1.getItem20(), ITEMS_ESPERADO);
  }

  /**
   * Test creacion de mochila por parametro.
   */
  @Test
public void testCreacionDeMochilaPorParametro() {
    Mochila m1 = new Mochila(ID1, 1, 2, 3, 4, 5, 6, 7, 8, 9,
        10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

    Assert.assertEquals(m1.getIdMochila(), ID1);
    Assert.assertEquals(m1.getItem1(), 1);
    Assert.assertEquals(m1.getItem2(), 2);
    Assert.assertEquals(m1.getItem3(), 3);
    Assert.assertEquals(m1.getItem4(), 4);
    Assert.assertEquals(m1.getItem5(), 5);
    Assert.assertEquals(m1.getItem6(), 6);
    Assert.assertEquals(m1.getItem7(), 7);
    Assert.assertEquals(m1.getItem8(), 8);
    Assert.assertEquals(m1.getItem9(), 9);
    Assert.assertEquals(m1.getItem10(), 10);
    Assert.assertEquals(m1.getItem11(), 11);
    Assert.assertEquals(m1.getItem12(), 12);
    Assert.assertEquals(m1.getItem13(), 13);
    Assert.assertEquals(m1.getItem14(), 14);
    Assert.assertEquals(m1.getItem15(), 15);
    Assert.assertEquals(m1.getItem16(), 16);
    Assert.assertEquals(m1.getItem17(), 17);
    Assert.assertEquals(m1.getItem18(), 18);
    Assert.assertEquals(m1.getItem19(), 19);
    Assert.assertEquals(m1.getItem20(), 20);
  }
  /**
   * Test correcto seteo en la mochila.
   */
  @Test
public void testCorrectoSeteoEnLaMochila() {
  Mochila m1 = new Mochila();

  m1.setIdMochila(ID1);
  m1.setItem1(1);
  m1.setItem2(2);
  m1.setItem3(3);
  m1.setItem4(4);
  m1.setItem5(5);
  m1.setItem6(6);
  m1.setItem7(7);
  m1.setItem8(8);
  m1.setItem9(9);
  m1.setItem10(10);
  m1.setItem11(11);
  m1.setItem12(12);
  m1.setItem13(13);
  m1.setItem14(14);
  m1.setItem15(15);
  m1.setItem16(16);
  m1.setItem17(17);
  m1.setItem18(18);
  m1.setItem19(19);
  m1.setItem20(20);

  Assert.assertEquals(m1.getIdMochila(), ID1);
  Assert.assertEquals(m1.getItem1(), 1);
  Assert.assertEquals(m1.getItem2(), 2);
  Assert.assertEquals(m1.getItem3(), 3);
  Assert.assertEquals(m1.getItem4(), 4);
  Assert.assertEquals(m1.getItem5(), 5);
  Assert.assertEquals(m1.getItem6(), 6);
  Assert.assertEquals(m1.getItem7(), 7);
  Assert.assertEquals(m1.getItem8(), 8);
  Assert.assertEquals(m1.getItem9(), 9);
  Assert.assertEquals(m1.getItem10(), 10);
  Assert.assertEquals(m1.getItem11(), 11);
  Assert.assertEquals(m1.getItem12(), 12);
  Assert.assertEquals(m1.getItem13(), 13);
  Assert.assertEquals(m1.getItem14(), 14);
  Assert.assertEquals(m1.getItem15(), 15);
  Assert.assertEquals(m1.getItem16(), 16);
  Assert.assertEquals(m1.getItem17(), 17);
  Assert.assertEquals(m1.getItem18(), 18);
  Assert.assertEquals(m1.getItem19(), 19);
  Assert.assertEquals(m1.getItem20(), 20);
  }
  /**
  * Test probando agregar items por posicion.
   */
  @Test
  public void testProbandoAgregarItemsPorPosicion() {
    Mochila m1 = new Mochila();

    m1.setItem(1, 1);
    m1.setItem(5, 2);
    m1.setItem(10, 3);
    m1.setItem(20, 4);

    Assert.assertEquals(m1.getItemId(1), 1);
    Assert.assertEquals(m1.getItemId(5), 2);
    Assert.assertEquals(m1.getItemId(10), 3);
    Assert.assertEquals(m1.getItemId(20), 4);
  }

}
