
package dominio;

// TODO: Auto-generated Javadoc
/**
 * La clase Hechicero es una casta de Personaje. Hereda de la clase Casta. posee
 * dos constructores. El constructor, llama al constructor de la clase padre
 * (Casta), pasándole los argumentos recibidos por el constructor hijo
 */
@SuppressWarnings("serial")
public class Hechicero extends Casta {
	/**
	 * Energía mínima requerida para realizar una habilidad.
	 */
	private static final int ENERGIA_MINIMA = 10;
	/**
	 * Número por el cual será multiplicada la magia del hechicero.
	 */
	private static final double MULTIPLICADOR_MAGIA = 1.5;
	/**
	 * Número por el cual se dividirán los puntos de magia.
	 */
	private static final int DIVISOR_DE_MAGIA = 2;
	/**
	 * Bonus de inteligencia por ser de casta Hechicero.
	 */
	private static final int BONUS_INTELIGENCIA = 5;

	/**
	 * Constructor parametrizado de la clase Hechicero.<br>
	 * Instancia un hechicero invocando al constructor paramentrizado de su
	 * padre Casta.
	 * 
	 * @param probCrit
	 *            Probabilidad de que el personaje realice un golpe crítico
	 * @param evasion
	 *            Probabilidad de que el personaje evite un golpe crítico
	 * @param danioCrit
	 *            Valor por el cual será multiplicado el golpe básico
	 */
	public Hechicero(final double probCrit, final double evasion, final double danioCrit) {
		super(probCrit, evasion, danioCrit);

	}

	/**
	 * Constructor por defecto de la clase Hechicero.<br>
	 * Instancia un hechicero invocando al contructor por defecto de su padre
	 * Casta.
	 */
	public Hechicero() {
		super();
	}

	/**
	 * Sobreescritura del método del padre Casta que permite que un personaje
	 * caster aplique la habilidad 1 a un peleable que ataca.
	 * 
	 * @param caster
	 *            Personaje atacante.
	 * @param atacado
	 *            Personaje que recibirá el ataque.
	 * @return un booleano: true si el ataque fue realizado exitosamente, false
	 *         de lo contrario.
	 */
	@Override
	public final boolean habilidad1(final Personaje caster, final Peleable atacado) {
		if (caster.getEnergia() >= ENERGIA_MINIMA) {
			caster.reducirEnergia(ENERGIA_MINIMA);
			if (atacado.serAtacado((int) (caster.calcularPuntosDeMagia() * MULTIPLICADOR_MAGIA)) > 0) {
				return CASTEO_EXITOSO;
			}
		}
		return CASTEO_FALLIDO;
	}

	/**
	 * Sobreescritura del método del padre Casta que permite que un personaje
	 * caster aplique la habilidad 2 a un peleable que ataca.
	 *
	 * @param caster            Personaje atacante.
	 * @param aliado the aliado
	 * @return un booleano: true si el ataque fue realizado exitosamente, false
	 *         de lo contrario.
	 */
	@Override
	public final boolean habilidad2(final Personaje caster, final Peleable aliado) {
		if (caster.getEnergia() >= ENERGIA_MINIMA) {
			caster.reducirEnergia(ENERGIA_MINIMA);
			if (aliado instanceof Personaje) {
				((Personaje) aliado).serCurado(caster.calcularPuntosDeMagia());
				return CASTEO_EXITOSO;
			}
		}
		return CASTEO_FALLIDO;
	}

	/**
	 * Sobreescritura del método del padre Casta que permite que un personaje
	 * caster aplique la habilidad 3 a un peleable que ataca.
	 * 
	 * @param caster
	 *            Personaje atacante.
	 * @param atacado
	 *            Personaje que recibirá el ataque.
	 * @return un booleano: true si el ataque fue realizado exitosamente, false
	 *         de lo contrario.
	 */
	@Override
	public final boolean habilidad3(final Personaje caster, final Peleable atacado) {
		if (caster.getEnergia() >= ENERGIA_MINIMA) {
			caster.reducirEnergia(ENERGIA_MINIMA);
			if (atacado instanceof Personaje) {
				int energiaRobada = ((Personaje) atacado).serDesenergizado(caster.calcularPuntosDeMagia());
				int saludRobada = ((Personaje) atacado)
						.serRobadoSalud(caster.calcularPuntosDeMagia() / DIVISOR_DE_MAGIA);
				caster.serEnergizado(energiaRobada);
				caster.serCurado(saludRobada);
				return CASTEO_EXITOSO;
			}

		}
		return CASTEO_FALLIDO;
	}

	/**
	 * Getter del bonus de inteligencia de la casta.
	 *
	 * @return la inteligencia extra de la casta
	 */
	@Override
	public final int recibirInteligenciaBonus() {
		return BONUS_INTELIGENCIA;
	}

	/**
	 * Getter del bonus de destreza de la casta.
	 *
	 * @return 0 para esta casta.
	 */
	@Override
	public final int recibirDestrezaBonus() {
		return 0;
	}

	/**
	 * Getter del bonus de fuerza de la casta.
	 *
	 * @return 0 para esta casta
	 */
	@Override
	public final int recibirFuerzaBonus() {
		return 0;
	}

	/**
	 * Getter del nombre de la casta.
	 *
	 * @return el nombre de la casta.
	 */
	@Override
	public final String getNombreCasta() {
		return "Hechicero";
	}

	/**
	 * Getter de las habilidades propias de la casta.
	 *
	 * @return array con los nombres de las habilidades propias de la casta.
	 */
	@Override
	public final String[] getHabilidadesCasta() {
		return new String[] { "Bola de Fuego", "Curar Aliado", "Robar Energia y Salud" };
	}

}
