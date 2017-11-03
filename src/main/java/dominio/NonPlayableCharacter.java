
package dominio;

// TODO: Auto-generated Javadoc
/**
 * La clase NonPlayableCharacter (NPC) representa a los personajes del juego que
 * no son controlados por humanos.<br>
 * Hereda de la clase MadreDeTodo e implementa la interfaz Peleable.
 */

public class NonPlayableCharacter extends MadreDeTodo implements Peleable {
	/**
	 * Número que sirve de argumento para obtener la dificultad.
	 */
	private static final int ELEGIR_DIFERENCIA = 3;
	/**
	 * Salud del NPC.
	 */
	private int salud;
	/**
	 * Dificultad aleatoria del NPC.
	 */
	private static final int DIFICULTAD_ALEATORIA = -1;
	/**
	 * Multiplicador de experiencia otorgada por el npc.
	 */
	private static final int MULTIPLICADOR_EXPERIENCIA = 30;
	/**
	 * Multiplicador de fuerza para el golpe crítico del npc.
	 */
	private static final double MULTIPLICADOR_FUERZA_GOLPE_CRITICO = 1.5;
	/**
	 * Número a superar para poder ser atacado.
	 */
	private static final double NUMERO_PARA_SER_ATACADO = 0.15;
	/**
	 * Número a superar para poder atacar.
	 */
	private static final double NUMERO_PARA_ATACAR = 0.15;
	/**
	 * Número por el que se divide la defensa cuando el npc es atacado.
	 */
	private static final int DIVISOR_DE_DEFENSA = 2;
	/**
	 * Fuerza base del NPC.
	 */
	private static final int MODIFICADOR_BASE_FUERZA = 10;
	/**
	 * Salud base del NPC.
	 */
	private static final int MODIFICADOR_BASE_SALUD = 30;
	/**
	 * Defensa base del NPC.
	 */
	private static final int MODIFICADOR_BASE_DEFENSA = 2;
	/**
	 * Multiplicador de fuerza del NPC.
	 */
	private static final int MULTIPLICADOR_FUERZA = 3;
	/**
	 * Multiplicador de salud del NPC.
	 */
	private static final int MULTIPLICADOR_SALUD = 15;
	/**
	 * Multiplicador de defensa del NPC.
	 */
	private static final int MULTIPLICADOR_DEFENSA = 1;

	/**
	 * Constructor parametrizado de la clase NonPlayableCharacter. Dependiendo
	 * de la dificultad que se pasa por parámetro al constructor, aumentará o
	 * disminuirá el valor de los atributos fuerza salud y defensa.
	 * 
	 * @param nombre
	 *            es el nombre del NPC.
	 * @param nivel
	 *            es el nivel del NPC.
	 * @param dificultadNPC
	 *            es la dificultad del NPC.
	 */
	public NonPlayableCharacter(final String nombre, final int nivel, final int dificultadNPC) {
		super(0, 0, nivel, nombre);

		int dificultad;
		if (dificultadNPC == DIFICULTAD_ALEATORIA) {
			dificultad = this.getRandom().nextInt(ELEGIR_DIFERENCIA);
		} else {
			dificultad = dificultadNPC;
		}

		this.aumentarFuerza(
				MODIFICADOR_BASE_FUERZA * (dificultad + 1) + (nivel - 1) * MULTIPLICADOR_FUERZA * (dificultad + 1));
		this.salud = MODIFICADOR_BASE_SALUD * (dificultad + 1) + (nivel - 1) * MULTIPLICADOR_SALUD * (dificultad + 1);
		this.aumentarDefensa(
				MODIFICADOR_BASE_DEFENSA * (dificultad + 1) + (nivel - 1) * MULTIPLICADOR_DEFENSA * (dificultad + 1));
	}

	/**
	 * Método que indica la cantidad de experiencia que debe sumarse al
	 * personaje que produjo la disminución de la salud del NPC a 0, cuyo valor
	 * es proporcional al nivel del npc y calculado por el multiplicador de
	 * experiencia.
	 * 
	 * @return Cantidad de experiencia a otorgar al npc.
	 */
	@Override
	public final int otorgarExp() {
		return this.getNivel() * MULTIPLICADOR_EXPERIENCIA;
	}

	/**
	 * Método que indica si el NPC está vivo en base a salud.
	 * 
	 * @return un booleano que indica si está vivo.
	 */
	@Override
	public final boolean estaVivo() {
		return this.salud > 0;
	}

	/**
	 * Getter de la salud del NPC.
	 * 
	 * @return la salud del NPC
	 */
	@Override
	public final int getSalud() {
		return this.salud;
	}

	/**
	 * Setter de la salud del NPC.
	 * 
	 * @param salud
	 *            es la nueva salud del NPC.
	 */
	public final void setSalud(final int salud) {
		this.salud = salud;
	}

	/**
	 * Método que decide si atacar con golpe crítico a un peleable.
	 * 
	 * @param atacado
	 *            es el peleable que recibe el ataque del npc
	 * @return el daño infringido al peleable
	 */
	@Override
	public final int atacar(final Peleable atacado) {
		if (this.getRandom().nextDouble() <= NUMERO_PARA_ATACAR) {
			return atacado.serAtacado((int) (this.getAtaque() * MULTIPLICADOR_FUERZA_GOLPE_CRITICO));
		} else {
			return atacado.serAtacado(this.getAtaque());
		}
	}

	/**
	 * Método que decide si disminuir el daño recibido en un ataque o
	 * directamente no aplicarlo.
	 * 
	 * @param danio
	 *            es el daño que impacta sobre la salud del NPC.
	 * @return retorna el daño que hizo efecto sobre el NPC.
	 */
	@Override
	public final int serAtacado(int danio) {
		if (this.getRandom().nextDouble() >= NUMERO_PARA_SER_ATACADO) {
			danio -= this.getDefensa() / DIVISOR_DE_DEFENSA;
			if (danio > 0) {
				this.salud -= danio;
				return danio;
			}
			return 0;
		}
		return 0;
	}

	/**
	 * Acción desencadenada tras jugar un turno.
	 */
	@Override
	public void despuesDeTurno() {

	}

	/**
	 * Método que permite ganar experiencia.
	 * 
	 * @param experiencia
	 *            es la experiencia a aumentar al npc.
	 */
	public void ganarExperiencia(final int experiencia) {

	}

	/**
	 * Getter del ataque del NPC.
	 * 
	 * @return el atque del NPC.
	 */
	@Override
	public final int getAtaque() {
		return this.getFuerza();
	}

	/**
	 * Setter del ataque del NPC.
	 * 
	 * @param ataque
	 *            es la capacidad de ataque ganada.
	 */
	@Override
	public final void setAtaque(final int ataque) {
		this.aumentarFuerza(ataque);
	}

	/**
	 * Getter de la magia del NPC.
	 * 
	 * @return retorna 0 porque un NPC no tiene magia.
	 */
	@Override
	public final int getMagia() {
		return 0;
	}
}
