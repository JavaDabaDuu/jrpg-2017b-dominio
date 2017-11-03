
package dominio;

// TODO: Auto-generated Javadoc
/**
 * La clase Humano es una raza de Personaje. Hereda de la clase Personaje.<br>
 * Posee dos constructores. El constructor, llama al constructor de la clase
 * padre (Personaje), pasándole los argumentos recibidos por el constructor
 * hijo.<br>
 * Completa ciertos atributos que estaban declarados en la clase Personaje, como
 * por ejemplo habilidadesRaza[], características particulares de cada raza
 */
@SuppressWarnings("serial")
public class Humano extends Personaje {
	/**
	 * Energía mínima que se necesita para realizar una habilidad.
	 */
	private static final int ENERGIA_MINIMA = 10;
	/**
	 * Número por el cual se divide la salud.
	 */
	private static final int DIVISOR_SALUD = 2;
	/**
	 * Número por el cual se divide la energía.
	 */
	private static final int DIVISOR_ENERGIA = 2;
	/**
	 * Bonus de energía obtenido por ser de raza humano.
	 */
	private static final int BONUS_ENERGIA = 5;
	/**
	 * Bonus de salud obtenido por ser de raza humano.
	 */
	private static final int BONUS_SALUD = 5;

	/**
	 * Constructor parametrizado reducido de la clase Humano. Instancia un nuevo
	 * humano invocando al constructor parametrizado de su clase padre
	 * Personaje.
	 * 
	 * @param nombre
	 *            Indica el nombre del personaje
	 * @param casta
	 *            Indica la casta del personaje
	 * @param id
	 *            Identificador del personaje
	 */
	public Humano(final String nombre, final Casta casta, final int id) {
		super(nombre, casta, id);
	}

	/**
	 * Constructor parametrizado extendido de la clase Humano. Instancia un
	 * nuevo humano invocando al constructor parametrizado de su clase padre
	 * Personaje.
	 * 
	 * @param nombre
	 *            Nombre del personaje
	 * @param salud
	 *            Salud del personaje
	 * @param energia
	 *            Energía del personaje
	 * @param fuerza
	 *            Fuerza del Personaje
	 * @param destreza
	 *            Destreza del personaje
	 * @param inteligencia
	 *            Inteligencia del personaje
	 * @param casta
	 *            Casta(Raza) del personaje
	 * @param experiencia
	 *            Experiencia del personaje
	 * @param nivel
	 *            Nivel del personaje
	 * @param idPersonaje
	 *            Id del personaje
	 */
	public Humano(final String nombre, final int salud, final int energia, final int fuerza, final int destreza,
			final int inteligencia, final Casta casta, final int experiencia, final int nivel, final int idPersonaje) {
		super(nombre, salud, energia, fuerza, destreza, inteligencia, casta, experiencia, nivel, idPersonaje);
	}

	/**
	 * Sobreescritura del método del padre Personaje que permite que un
	 * personaje caster aplique la habilidad de raza 1 a un peleable que
	 * atacado.
	 * 
	 * @param atacado
	 *            Personaje que recibirá el ataque.
	 * @return un booleano: true si el ataque fue realizado exitosamente, false
	 *         de lo contrario.
	 */
	@Override
	public final boolean habilidadRaza1(final Peleable atacado) {
		if (this.getEnergia() >= ENERGIA_MINIMA) {
			this.reducirEnergia(ENERGIA_MINIMA);
			atacado.setAtaque(atacado.getAtaque() + this.getMagia());
			return true;
		}
		return false;
	}

	/**
	 * Sobreescritura del método del padre Personaje que permite que un
	 * personaje caster aplique la habilidad de raza 2 a un peleable que
	 * atacado.
	 * 
	 * @param atacado
	 *            Personaje que recibirá el ataque.
	 * @return un booleano: true si el ataque fue realizado exitosamente, false
	 *         de lo contrario.
	 */
	@Override
	public final boolean habilidadRaza2(final Peleable atacado) {
		if (this.getEnergia() >= ENERGIA_MINIMA) {
			if (atacado.serAtacado(atacado.getSalud() / DIVISOR_SALUD) > 0) {
				this.reducirEnergia(this.getEnergia() / DIVISOR_ENERGIA);
				return true;
			}
		}
		this.reducirEnergia(ENERGIA_MINIMA);
		return false;
	}

	/**
	 * Getter de las habilidades propias de la raza.
	 *
	 * @return array con los nombres de las habilidades propias de la raza
	 */
	@Override
	public final String[] getHabilidadesRaza() {
		return new String[] { "Incentivar", "Golpe Fatal" };
	}

	/**
	 * Getter del bonus de salud de la raza.
	 *
	 * @return la salud extra de la raza
	 */
	@Override
	public final int getSaludBonus() {
		return BONUS_SALUD;
	}

	/**
	 * Getter del bonus de energía de la raza.
	 *
	 * @return la energía extra de la raza
	 */
	@Override
	public final int getEnergiaBonus() {
		return BONUS_ENERGIA;
	}

	/**
	 * Getter del nombre de la raza.
	 *
	 * @return el nombre de la raza
	 */
	@Override
	public final String getNombreRaza() {
		return "Humano";
	}

}
