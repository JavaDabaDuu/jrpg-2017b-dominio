

package dominio;

/**
 * La clase Guerrero es una casta de Personaje. Hereda de la clase Casta. posee
 * dos constructores. El constructor, llama al constructor de la clase padre
 * (Casta), pasándole los argumentos recibidos por el constructor hijo
 */
@SuppressWarnings("serial")
public class Guerrero extends Casta {
    /**
    * Energía mínima requerida para realizar una habilidad.
    */
    private static final int ENERGIA_MINIMA = 10;
    /**
    * Número por el cual será multiplicado el ataque del guerrero.
    */
    private static final int MULTIPLICADOR_FUERZA = 2;
    /**
    * Bonus de fuerza por ser de la casta Guerrero.
    */
    private static final int BONUS_FUERZA = 5;

    /**
    * Constructor parametrizado de la clase Guerrero.<br>
    * Instancia un guerrero invocando al constructor paramentrizado de su padre
    * Casta.
    *
    * @param probCrit
    *            Probabilidad de que el personaje realice un golpe crítico
    * @param evasion
    *            Probabilidad de que el personaje evite un golpe crítico
    * @param danioCrit
    *            Valor por el cual será multiplicado el golpe básico
    */
    public Guerrero(final double probCrit, final double evasion,
                final double danioCrit) {
        super(probCrit, evasion, danioCrit);
        }

    /**
    * Constructor por defecto de la clase Guerrero.<br>
    * Instancia un guerrero invocando al contructor por defecto de su padre
    * Casta.
    */
    public Guerrero() {
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
    public final boolean habilidad1(final Personaje caster,
                                    final Peleable atacado) {
        if (caster.getEnergia() >= ENERGIA_MINIMA) {
            caster.reducirEnergia(ENERGIA_MINIMA);
            if (atacado.serAtacado(caster.getAtaque()
                                   * MULTIPLICADOR_FUERZA) > 0) {
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
    public final boolean habilidad2(final Personaje caster,
                                    final Peleable atacado) {
        if (caster.getEnergia() >= ENERGIA_MINIMA) {
            caster.reducirEnergia(ENERGIA_MINIMA);
            caster.aumentarDefensa(caster.getMagia());
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
    public final boolean habilidad3(final Personaje caster,
                                    final Peleable atacado) {
        if (caster.getEnergia() >= ENERGIA_MINIMA) {
            caster.reducirEnergia(ENERGIA_MINIMA);
            if (atacado instanceof Personaje) {
                int defensaOriginal = ((Personaje) atacado).getDefensa();
                ((Personaje) atacado).reducirDefensa(
                ((Personaje) atacado).getDefensa());
                if (atacado.serAtacado(caster.getAtaque()) > 0) {
                    ((Personaje) atacado).aumentarDefensa(defensaOriginal);
                    return CASTEO_EXITOSO;
                    }
                }

            }
        return CASTEO_FALLIDO;
        }

    /**
    * Getter del bonus de fuerza de la casta.
    *
    * @return la fuerza extra de la casta.
    */
    @Override
    public final int recibirFuerzaBonus() {
        return BONUS_FUERZA;
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
        return "Guerrero";
        }

    /**
    * Getter de las habilidades propias de la casta.
    *
    * @return array con los nombres de las habilidades propias de la casta.
    */
    @Override
    public final String[] getHabilidadesCasta() {
        return new String[] {"Ataque Doble", "Aumentar Defensa",
                             "Ignorar Defensa"};
        }
}

