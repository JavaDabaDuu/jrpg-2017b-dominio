package testsdominio;

import static org.junit.Assert.*;

import org.junit.Test;

import dominio.MyItem;
import junit.framework.Assert;

/**
 * The Class TestMyItem.
 */
public class TestMyItem {

  /** The Constant ID1. */
  private static final int ID1 = 1;

  /**
  * Test setters Y getters.
   */
  @Test
public void testSettersYGetters() {
    MyItem item = new MyItem();

    item.setFoto("EspadaZ.png");
    item.setFotoEquipado("Gohan-EspadaZ.png");
    item.setIdItem(ID1);
    item.setNombre("Gohan");
    item.setWearLocation(300);
    item.setBonusDestreza(5);
    item.setBonusEnergia(5);
    item.setBonusFuerza(5);
    item.setBonusInteligencia(5);
    item.setBonusSalud(5);

    Assert.assertEquals(item.getBonusDestreza(), 5);
    Assert.assertEquals(item.getBonusFuerza(), 5);
    Assert.assertEquals(item.getBonusEnergia(), 5);
    Assert.assertEquals(item.getBonusInteligencia(), 5);
    Assert.assertEquals(item.getBonusSalud(), 5);
    Assert.assertEquals(item.getWearLocation(), 300);
    Assert.assertEquals(item.getNombre(), "Gohan");
    Assert.assertEquals(item.getIdItem(), ID1);
    Assert.assertEquals(item.getFoto(), "EspadaZ.png");
    Assert.assertEquals(item.getFotoEquipado(), "Gohan-EspadaZ.png");
  }

}
