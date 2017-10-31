package dominio;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;

import javax.imageio.ImageIO;

/**
 * La clase Item representa un ítem que puede ser equipado por un personaje.<br>
 * Implementa la inerfaz Serializable
 */
@SuppressWarnings({ "serial", "unused" })
public class Item implements Serializable {
	/*
	 * Id del ítem.
	 */
	private final int idItem;
	/**
	 * Nombre y extensión del archivo que contiene la foto del ítem.
	 */
	private final String foto;
	/**
	 * Nombre del ítem.
	 */
	private final String nombre;
	/**
	 * Valor de la ubicación de uso del ítem.
	 */
	private final int wearLocation;
	/**
	 * Bonus de salud que otorga el ítem cuando alguien lo tiene equipado
	 */
	private final int bonusSalud;
	/**
	 * Bonus de energía que otorga el ítem cuando alguien lo tiene equipado
	 */
	private final int bonusEnergia;
	/**
	 * Bonus de fuerza que otorga el ítem cuando alguien lo tiene equipado
	 */
	private final int bonusFuerza;
	/**
	 * Bonus de destreza que otorga el ítem cuando alguien lo tiene equipado
	 */
	private final int bonusDestreza;
	/**
	 * Bonus de inteligencia que otorga el ítem cuando alguien lo tiene equipado
	 */
	private final int bonusInteligencia;
	/**
	 * Nombre que tiene la foto cuando el ítem está equipado.
	 */
	private final String fotoEquipado;

	/**
	 * Constructor parametrizado de la clase Ítem.
	 * 
	 * @param idItem
	 *            Entero que representa el id del ítem.
	 * @param nombre
	 *            String que representa el nombre del ítem.
	 * @param wearLocation
	 *            Entero que representa donde se usa el ítem.
	 * @param bonusSalud
	 *            Entero que representa el bonus de salud del ítem.
	 * @param bonusEnergia
	 *            Entero que representa el bonus de energia del ítem.
	 * @param bonusFuerza
	 *            Entero que representa el bonus de fuerza del ítem.
	 * @param bonusDestreza
	 *            Entero que representa el bonus de destreza del ítem.
	 * @param bonusInteligencia
	 *            Entero que representa el bonus de inteligencia del ítem.
	 * @param foto
	 *            String que representa el path de la foto del ítem.
	 * @param fotoEquipado
	 *            String que representa la foto cuando el ítem está equipado.
	 * @throws IOException
	 *             Cuando no se encuentra la foto del ítem.
	 */
	public Item(final int idItem, final String nombre, final int wearLocation, final int bonusSalud,
			final int bonusEnergia, final int bonusFuerza, final int bonusDestreza, final int bonusInteligencia,
			final String foto, final String fotoEquipado) throws IOException {
		this.foto = foto;
		this.idItem = idItem;
		this.nombre = nombre;
		this.wearLocation = wearLocation;
		this.bonusSalud = bonusSalud;
		this.bonusEnergia = bonusEnergia;
		this.bonusFuerza = bonusFuerza;
		this.bonusDestreza = bonusDestreza;
		this.bonusInteligencia = bonusInteligencia;
		this.fotoEquipado = fotoEquipado;
	}

	/**
	 * Getter de la foto del ítem.
	 * 
	 * @return la foto del ítem.
	 * @throws IOException
	 *             Cuando no se encuentra la foto del ítem.
	 */
	public BufferedImage getFoto() throws IOException {
		return ImageIO.read(new File("recursos//" + this.foto));
	}

	/**
	 * Getter del nombre del ítem.
	 * 
	 * @return el nombre del ítem.
	 */
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * Getter del bonus de salud del ítem.
	 * 
	 * @return el bonus de salud.
	 */
	public int getBonusSalud() {
		return this.bonusSalud;
	}

	/**
	 * Getter del bonus de energía del ítem.
	 * 
	 * @return el bonus de energía.
	 */
	public int getBonusEnergia() {
		return this.bonusEnergia;
	}

	/**
	 * Getter del bonus de fuerza del ítem.
	 * 
	 * @return el bonus de fuerza.
	 */
	public int getBonusFuerza() {
		return this.bonusFuerza;
	}

	/**
	 * Getter del bonus de destreza del ítem.
	 * 
	 * @return el bonus de destreza.
	 */
	public int getBonusDestreza() {
		return this.bonusDestreza;
	}

	/**
	 * Getter del bonus de inteligencia del ítem.
	 * 
	 * @return el bonus de inteligencia.
	 */
	public int getBonusInteligencia() {
		return this.bonusInteligencia;
	}

	/**
	 * Getter del id del ítem.
	 * 
	 * @return el id del item.
	 */
	public int getIdItem() {
		return this.idItem;
	}

}
