
package testsdominio;

import java.io.IOException;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

import org.junit.Assert;
import org.junit.Test;

import dominio.Asesino;
import dominio.Humano;
import dominio.Item;
import dominio.Personaje;




/**
 * The Class TestTrueque.
 */
public class TestTrueque {
    /**
    * Valor usado en test.
    */
    private static final int VALOR1 = 10;
    /**
    * Valor usado en test.
    */
    private static final int VALOR2 = 20;
    /**
    * Test trueque.
    */
    @Test
    public void testTrueque() {
        Personaje p1 = new Humano("Ben Affleck", new Asesino(), 2);
        ArrayList<Item> aPoner = new ArrayList<Item>();
        DefaultListModel<String> aSacar =
            new DefaultListModel<String>();
        aSacar.addElement("NombreItem1");
        try {
            Item item1 = new Item(VALOR2, "NombreItem1", 0,
                VALOR1, 0, 0, 0, 0, "foto1", "fotoE1");
            Item item3 = new Item(VALOR2, "NombreItem3", 0,
                VALOR1, 0, 0, 0, 0, "foto3", "fotoE3");

            Item item5 = new Item(VALOR2, "NombreItem5", 0,
                VALOR1, 0, 0, 0, 0, "foto5", "fotoE5");
            Item item6 = new Item(VALOR2, "NombreItem6", 0,
                VALOR1, 0, 0, 0, 0, "foto6", "fotoE6");

            aPoner.add(item5);
            aPoner.add(item6);
            p1.anadirItem(new Item(VALOR2, "NombreItem1", 0,
                VALOR1, 0, 0, 0, 0, "foto1", "fotoE1"));
            p1.anadirItem(new Item(VALOR2, "NombreItem2", 0,
                VALOR1, 0, 0, 0, 0, "foto2", "fotoE2"));
            p1.anadirItem(item3);
            p1.anadirItem(new Item(VALOR2, "NombreItem4", 0,
                VALOR1, 0, 0, 0, 0, "foto4", "fotoE4"));
            p1.trueque(p1.getItems(), aPoner, aSacar);
            Assert.assertTrue(p1.getItems().contains(item5));
            Assert.assertTrue(p1.getItems().contains(item6));
            Assert.assertTrue(p1.getItems().contains(item3));
            Assert.assertFalse(p1.getItems().contains(item1));


            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Falló");
                }

        }

    /**
    * Test trueque 2.
    */
    @Test
    public void testTrueque2() {
        Personaje p1 = new Humano("Ben Affleck", new Asesino(), 2);

        ArrayList<Item> aPoner = new ArrayList<Item>();
        DefaultListModel<String> aSacar =
            new DefaultListModel<String>();
        aSacar.addElement("NombreItem1");
        aSacar.addElement("NombreItem3");
        try {
            Item item1 = new Item(VALOR2, "NombreItem1", 0,
                VALOR1, 0, 0, 0, 0, "foto1", "fotoE1");
            Item item3 = new Item(VALOR2, "NombreItem3", 0,
                VALOR1, 0, 0, 0, 0, "foto3", "fotoE3");

            Item item5 = new Item(VALOR2, "NombreItem5", 0,
                VALOR1, 0, 0, 0, 0, "foto5", "fotoE5");

            aPoner.add(item5);
            p1.anadirItem(new Item(VALOR2, "NombreItem1", 0,
                VALOR1, 0, 0, 0, 0, "foto1", "fotoE1"));
            p1.anadirItem(new Item(VALOR2, "NombreItem2", 0,
                VALOR1, 0, 0, 0, 0, "foto2", "fotoE2"));
            p1.anadirItem(item3);
            p1.anadirItem(new Item(VALOR2, "NombreItem4", 0,
                VALOR1, 0, 0, 0, 0, "foto4", "fotoE4"));
            p1.trueque(p1.getItems(), aPoner, aSacar);
            Assert.assertTrue(p1.getItems().contains(item5));
            Assert.assertFalse(p1.getItems().contains(item3));
            Assert.assertFalse(p1.getItems().contains(item1));


            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Falló");
                }

        }

}
