
package dominio;

// TODO: Auto-generated Javadoc
/**
 * La clase Asesino es una casta de Personaje. Hereda de la clase Casta. posee
 * dos constructores. El constructor, llama al constructor de la clase padre
 * (Casta), pasándole los argumentos recibidos por el constructor hijo
 */
@SuppressWarnings("serial")
public class Asesino extends Casta {
	/**
	 * Energía mínima requerida para realizar una habilidad.
	 */
	private static final int ENERGIAMINIMA = 10;
	/**
	 * Bonus de destreza por ser de la casta Asesino.
	 */
	private static final int BONUSDESTREZA = 5;
	/**
	 * Bonus al realizar correctamente la habilidad2 sobre la probabilidad de
	 * evitar un daño.
	 */
	private static final double AUMENTAR_PROBABILIDAD_EVITAR = 0.15;
	/**
	 * Probabilidad de evitar daño por defecto.
	 */
	private static final double PROBABILIDAD_EVITAR_DANIO = 0.5;

	/**
	 * Constructor parametrizado de la clase Asesino.<br>
	 * Instancia un asesino invocando al constructor paramentrizado de su padre
	 * Casta.
	 * 
	 * @param probCrit
	 *            Probabilidad de que el personaje realice un golpe crítico
	 * @param evasion
	 *            Probabilidad de que el personaje evite un golpe crítico
	 * @param danioCrit
	 *            Valor por el cual será multiplicado el golpe básico
	 */
	public Asesino(final double probCrit, final double evasion, final double danioCrit) {
		super(probCrit, evasion, danioCrit);
	}

	/**
	 * Constructor por defecto de la clase Asesino.<br>
	 * Instancia un asesino invocando al contructor por defecto de su padre
	 * Casta.
	 */
	public Asesino() {
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
		if (caster.getEnergia() >= ENERGIAMINIMA) {
			caster.reducirEnergia(ENERGIAMINIMA);
			if (atacado.serAtacado((int) (caster.getAtaque() * caster.getCasta().getDañoCritico())) > 0) {
				return CASTEO_EXITOSO;
			}
		}
		return CASTEO_FALLIDO;
	}

	/**
	 * Sobreescritura del método del padre Casta que permite que un personaje
	 * caster aplique la habilidad 2 a un peleable que ataca.
	 * 
	 * @param caster
	 *            Personaje atacante.
	 * @param atacado
	 *            Personaje que recibirá el ataque.
	 * @return un booleano: true si el ataque fue realizado exitosamente, false
	 *         de lo contrario.
	 */
	@Override
	public final boolean habilidad2(final Personaje caster, final Peleable atacado) {
		if (caster.getEnergia() >= ENERGIAMINIMA) {
			caster.reducirEnergia(ENERGIAMINIMA);
			if (this.getProbabilidadEvitarDaño() + AUMENTAR_PROBABILIDAD_EVITAR < 0.5) {
				this.aumentarEvitarDaño(AUMENTAR_PROBABILIDAD_EVITAR);
			} else {
				this.setProbabilidadEvitarDaño(PROBABILIDAD_EVITAR_DANIO);
			}
			return CASTEO_EXITOSO;
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
		return CASTEO_FALLIDO;
	}

	/**
	 * Getter del bonus de destreza de la casta.
	 *
	 * @return la destreza extra de la casta
	 */
	@Override
	public final int recibirDestrezaBonus() {
		return BONUSDESTREZA;
	}

	/**
	 * Getter del bonus de fuerza de la casta.
	 *
	 * @return 0 para esta casta.
	 */
	@Override
	public final int recibirFuerzaBonus() {
		return 0;
	}

	/**
	 * Getter del bonus de inteligencia de la casta.
	 *
	 * @return 0 para esta casta.
	 */
	@Override
	public final int recibirInteligenciaBonus() {
		return 0;
	}

	/**
	 * Getter del nombre de la casta.
	 *
	 * @return el nombre de la casta.
	 */
	@Override
	public final String getNombreCasta() {
		return "Asesino";
	}

	/**
	 * Getter de las habilidades propias de la casta.
	 *
	 * @return array con los nombres de las habilidades propias de la casta.
	 */
	@Override
	public final String[] getHabilidadesCasta() {
		return new String[] { "Golpe Critico", "Aumentar Evasion", "Robar" };
	}

}
