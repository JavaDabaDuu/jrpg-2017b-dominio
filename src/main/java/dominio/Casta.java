
package dominio;

import java.io.Serializable;


/**
 * La clase abstracta Casta representa una casta de personajes.<br>
 * Implementa la interfaz Serializable.<br>
 * Posee dos contructores: uno parametrizado y otro por defecto.
 */
@SuppressWarnings("serial")
public abstract class Casta implements Serializable {
    /**
    * Probabilidad de un personaje de la casta de realizar un golpe crítico.
    */
    private double probabilidadGolpeCritico;
    /**
    * Probabilidad de un personaje de la casta de evitar un daño.
    */
    private double probabilidadEvitarDanio;
    /**
    * Valor del daño crítico.
    */
    private double danioCritico;
    /**
    * Probabilidad por defecto de un personaje de evitar un golpe crítico.
    */
    private static final double PROBABILIDAD_EVITAR_GOLPE_CRITICO = 0.2;
    /**
    * Probabilidad por defecto de un personaje de la casta de evitar un daño.
    */
    private static final double PROBABILIDAD_EVITAR_DANIO = 0.2;
    /**
    * Valor por defecto del daño crítico.
    */
    private static final double DANIO_CRITICO = 1.5;

    /** Variable booleana que indica que no se pudo castear la habilidad. */
    protected static final boolean CASTEO_FALLIDO = false;

    /** Variable booleana que indica que se pudo castear la habilidad. */
    protected static final boolean CASTEO_EXITOSO = true;

    /**
    * Constructor por defecto de la clase Casta. Crea una casta que con los
    * valores por defecto.
    */
    public Casta() {
        this.probabilidadGolpeCritico = PROBABILIDAD_EVITAR_GOLPE_CRITICO;
        this.probabilidadEvitarDanio = PROBABILIDAD_EVITAR_DANIO;
        this.danioCritico = DANIO_CRITICO;
        }

    /**
    * Constructor parametrizado de la clas Casta. Crea una casta con los
    * valores indicados.
    *
    * @param probCrit
    *            Probabilidad de que el personaje realice un golpe crítico
    * @param evasion
    *            Probabilidad de que el personaje evite un golpe crítico
    * @param danioCrit
    *            Valor por el cual será multiplicado el golpe básico para
    *            aplicar un golpe crítico
    */
    public Casta(final double probCrit, final double evasion,
             final double danioCrit) {
        this.probabilidadGolpeCritico = probCrit;
        this.probabilidadEvitarDanio = evasion;
        this.danioCritico = danioCrit;
        }

    /**
    * Método abstracto que permite que un personaje cluster aplique la
    * habilidad 1 a un peleable que ataca.
    *
    * @param caster
    *            Personaje atacante.
    * @param atacado
    *            Personaje que recibirá el ataque.
    * @return un booleano: true si el ataque fue realizado exitosamente, false
    *         de lo contrario.
    */
    public abstract boolean habilidad1(Personaje caster, Peleable atacado);

    /**
    * Método abstracto que permite que un personaje cluster aplique la
    * habilidad 2 a un peleable que ataca.
    *
    * @param caster
    *            Personaje atacante.
    * @param atacado
    *            Personaje que recibirá el ataque.
    * @return un booleano: true si el ataque fue realizado exitosamente, false
    *         de lo contrario.
    */
    public abstract boolean habilidad2(Personaje caster, Peleable atacado);

    /**
    * Método abstracto que permite que un personaje cluster aplique la
    * habilidad3 a un peleable que ataca.
    *
    * @param caster
    *            Personaje atacante.
    * @param atacado
    *            Personaje que recibirá el ataque.
    * @return un booleano: true si el ataque fue realizado exitosamente, false
    *         de lo contrario.
    */
    public abstract boolean habilidad3(Personaje caster, Peleable atacado);

    /**
    * Método abstracto que permite recibir un bonus de fuerza extra de la casta.
    *
    * @return la fuerza extra de la casta.
    */
    public abstract int recibirFuerzaBonus();

    /**
    * Método abstracto que permite recibir un bonus de destreza extra de la
    * casta.
    *
    * @return la destreza extra de la casta.
    */
    public abstract int recibirDestrezaBonus();

    /**
    * Método abstracto que permite recibir un bonus de inteligencia extra de la
    * casta.
    *
    * @return la inteligencia extra de la casta.
    */
    public abstract int recibirInteligenciaBonus();

    /**
    * Getter del nombre de la casta.
    *
    * @return el nombre de la casta.
    */
    public abstract String getNombreCasta();

    /**
    * Getter abstracto de las habilidades propias de la casta.
    *
    * @return array de nombres de las habilidades propias de la casta.
    */
    public abstract String[] getHabilidadesCasta();

    /**
    * Getter de la probabilidad de realizar un golpe crítico que tiene un
    * personaje de la casta.
    *
    * @return la probabilidad de golpe critico propia de la casta.
    */
    public final double getProbabilidadGolpeCritico() {
        return this.probabilidadGolpeCritico;
        }

    /**
    * Setter de la probabilidad de realizar un golpe crítico que tiene un
    * personaje de la casta.
    *
    * @param probGolpeCritico    es la nueva probabilidad de realizar
    *  un golpe crítico que
    *            tiene un personaje de la casta
    */
    public final void setProbabilidadGolpeCritico(final
        double probGolpeCritico) {
        this.probabilidadGolpeCritico = probGolpeCritico;
        }

    /**
    * Getter de la probabilidad de evitar un daño que tiene un personaje de la
    * casta.
    *
    * @return la probabilidad de evitar un daño que tiene un personaje de la
    *         casta
    */
    public final double getProbabilidadEvitarDanio() {
        return this.probabilidadEvitarDanio;
        }

    /**
    * Setter de la probabilidad de evitar un daño que tiene un personaje de la
    * casta.
    *
    * @param probEvitarDanio            es la nueva probabilidad de evitar
    * un daño que tiene un personaje de la casta
    */
    public final void setProbabilidadEvitarDanio(final
                      double probEvitarDanio) {
        this.probabilidadEvitarDanio = probEvitarDanio;
        }

    /**
    * Getter del daño crítico que realiza un personaje de la casta.
    *
    * @return el daño crítico que realiza un personaje de la casta
    */
    public final double getDanioCritico() {
        return this.danioCritico;
        }

    /**
    * Setter del daño crítico que realiza un personaje de la casta.
    *
    * @param danioCrit            es el nuevo daño crítico que realiza
    * un personaje de la casta
    */
    public final void setDanioCritico(final double danioCrit) {
        this.danioCritico = danioCrit;
        }

    /**
    * Método que aumenta la probabilidad de evitar un daño que tiene un
    * personaje de la casta.
    *
    * @param bonus            es el bonificador que se agrega a la
    *  probabilidad de evit un daño que tiene un personajue de la casta
    */
    public final void aumentarEvitarDanio(final double bonus) {
        this.probabilidadEvitarDanio += bonus;
        }

}

