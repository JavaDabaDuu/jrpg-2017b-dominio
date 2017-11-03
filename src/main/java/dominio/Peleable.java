
package dominio;

// TODO: Auto-generated Javadoc
/**
 * La interfaz Peleable define los comportamientos que debe tener quien sea
 * peleable.
 */
public interface Peleable {
	/**
	 * Metodo que permite recibir un daño al ser atacado.
	 *
	 * @param danio
	 *            es el daño recibido en un ataque.
	 * @return el daño que se efectúa sobre el peleable.
	 */
	int serAtacado(int danio);

	/**
	 * Getter de la salud del peleable.
	 *
	 * @return la salud del peleable.
	 */
	int getSalud();

	/**
	 * Getter de la magia del peleable.
	 *
	 * @return la magia del peleable.
	 */
	int getMagia();

	/**
	 * Acción desencadenada tras jugar un turno.
	 */
	void despuesDeTurno();

	/**
	 * Método que permite atacar a un peleable.
	 * 
	 * @param atacado
	 *            es el peleableque es atacado.
	 * @return daño causado al peleable atacado.
	 */
	int atacar(Peleable atacado);

	/**
	 * Método que indica la experiencia que se puede otorgar.
	 * 
	 * @return la experiencia a otorgar.
	 */
	int otorgarExp();

	/**
	 * Getter del ataque del peleable.
	 * 
	 * @return el ataque del peleable.
	 */
	int getAtaque();

	/**
	 * Getter del ataque del peleable.
	 * 
	 * @param ataque
	 *            es el ataque ganado por el personaje.
	 */
	void setAtaque(int ataque);

	/**
	 * Método que indica si el peleable está vivo.
	 *
	 * @return un booleano que indica si el peleable tiene vida.
	 */
	boolean estaVivo();

	/**
	 * Getter del nombre del peleable.
	 * 
	 * @return el nombre del peleable.
	 */
	String getNombre();
}
