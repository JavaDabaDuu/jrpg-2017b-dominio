
package dominio;

import java.util.LinkedList;

/**
 * La clase Alianza agrupa a los jugadores que forman una alianza.
 */
public class Alianza {
	/**
	 * Nombre de la alianza.
	 */
	private final String nombre;
	/**
	 * Lista de integrantes que están aliados a la alianza.
	 */
	private LinkedList<Personaje> aliados;

	/**
	 * Constructor parametrizado de la clase Alianza
	 * 
	 * @param nombre
	 *            es el nombre de la alianzq.
	 */
	public Alianza(final String nombre) {
		this.nombre = nombre;
		this.aliados = new LinkedList<Personaje>();
	}

	/**
	 * Getter de la lista de personajes aliados a la alianza.
	 * 
	 * @return la lista de aliados a la alianza.
	 */
	public final LinkedList<Personaje> getAliados() {
		return new LinkedList<Personaje>(this.aliados);
	}

	/**
	 * Getter del nombre de la alianza.
	 * 
	 * @return el nombre de la alianza.
	 */
	public final String obtenerNombre() {
		return this.nombre;
	}

	/**
	 * Método que elimina un personaje de la alianza.
	 * 
	 * @param personaje
	 *            es el personaje a remover de la lista de aliados.
	 */
	public final void eliminarPersonaje(final Personaje personaje) {
		this.aliados.remove(personaje);
	}

	/**
	 * Método que agrega un personaje a la alianza.
	 * 
	 * @param personaje
	 *            es el personaje a agregar a la lista de aliados.
	 */
	public final void añadirPersonaje(final Personaje personaje) {
		this.aliados.add(personaje);
	}
}
