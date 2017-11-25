

package dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.DefaultListModel;

/**
 * La clase personaje representa a los personajes del juego que son manejados
 * por humanos.<br>
 * Un personaje tiene una raza y una casta.<br>
 * Hereda de la clase MadreDeTodo e implementa las interfaces peleable y
 * serializable.
 */

@SuppressWarnings({ "serial", "unused" })
public abstract class Personaje extends MadreDeTodo
                implements Peleable, Serializable {
    /**
    * Salud del personaje.
    */
    private int salud;
    /**
    * Energía del personaje.
    */
    private int energia;
    /**
    * Cantidad de habilidades que posee el personaje dada su casta.
    */
    private static final int CANTIDAD_HABILIDADES_CASTA = 3;
    /**
    * Cantidad de habilidades que posee el personaje dada su raza.
    */
    private static final int CANTIDAD_HABILIDADES_RAZA = 2;
    /**
    * Cantidad de niveles del personaje.
    */
    private static final int CANTIDAD_NIVELES = 101;
    /**
    * Constante que se suma al cargar la tabla de niveles.
    */
    private static final int CONSTANTE_NIVEL = 50;
    /**
    * Fuerza inicial del personaje.
    */
    private static final int FUERZA_INICIAL = 10;
    /**
    * Destreza inicial del personaje.
    */
    private static final int DESTREZA_INICIAL = 10;
    /**
    * Inteligencia inicial del personaje.
    */
    private static final int INTELIGENCIA_INICIAL = 10;
    /**
    * Defensa inicial del personaje.
    */
    private static final int DEFENSA_INICIAL = 0;
    /**
    * Experiencia inicial del personaje.
    */
    private static final int EXPERIENCIA_INICIAL = 0;
    /**
    * Nivel inicial del personaje.
    */
    private static final int NIVEL_INICIAL = 1;
    /**
    * Tope inicialde la salud del personaje.
    */
    private static final int SALUD_TOPE_INICIAL = 100;
    /**
    * Energía tope inicial del personaje.
    */
    private static final int ENERGIA_TOPE_INICIAL = 100;
    /**
    * Fuerza máxima del personaje.
    */
    private static final int FUERZA_MAXIMA = 200;
    /**
    * Defensa máxima del personaje.
    */
    private static final int DEFENSA_MAXIMA = 200;
    /**
    * Inteligencia máxima del personaje.
    */
    private static final int INTELIGENCIA_MAXIMA = 200;
    /**
    * Nivel máximo permitido.
    */
    private static final int NIVEL_MAXIMO = 100;
    /**
    * Aumento de salud tope al subir de nivel.
    */
    private static final int SALUD_TOPE_SUBIR_NIVEL = 25;
    /**
    * Aumento de energía tope al subir de nivel.
    */
    private static final int ENERGIA_TOPE_SUBIR_NIVEL = 20;
    /**
    * Multiplicador de la fuerza del personaje para obtener el ataque.
    */
    private static final double MULTIPLICADOR_FUERZA = 1.5;
    /**
    * Multiplicador de magia del personaje.
    */
    private static final double MULTIPLICADOR_MAGIA = 1.5;
    /**
    * Multiplicador de experiencia para calcular la experiencia otorgada por el
    * personaje cuando es vencido.
    */
    private static final int MULTIPLICADOR_EXPERIENCIA = 40;
    /**
    * Energia mínima necesaria para poder realizar una habilidad.
    */
    private static final int ENERGIA_MINIMA = 10;

    /** Número por el cual se divide la destreza del personaje
     *  para calcular la posibilidad de evitar el daño. */
    private static final int DIVISOR_DESTREZA = 1000;
    /**
    * Posición inicial del Personaje en eje X.
    */
    private static final int POS_X_INICIAL = 0;
    /**
    * Posición inicial del personaje en eje Y.
    */
    private static final int POS_Y_INICIAL = 0;
    /**
    * Ataque del personaje.
    */
    private int ataque;
    /**
    * Magia del personaje.
    */
    private int magia;
    /**
    * Nombre de la Raza del Personaje.
    */

    private String nombreRaza;
    /**
    * Salud tope del Personaje.
    */
    private int saludTope;
    /**
    * Energía tope del Personaje.
    */
    private int energiaTope;
    /**
    * Destreza del Personaje.
    */
    private int destreza;
    /**
    * Inteligencia del Personaje.
    */
    private int inteligencia;
    /**
    * Casta del Personaje.
    */
    private Casta casta;
    /**
    * Posición en X del Personaje.
    */
    private int x;
    /**
    * Posición en Y del Personaje.
    */
    private int y;
    /**
    * Experiencia del Personaje.
    */
    private int experiencia;
    /**
    * Identificador del Personaje.
    */
    private int idPersonaje;
    /**
    * Alianza del Personaje.
    */
    private Alianza clan;
    /**
    * Tabla de los niveles del personaje.
    */
    private static int[] tablaDeNiveles;
    /**
    * Habilidades obtenidas según la raza del personaje.
    */
    private String[] habilidadesRaza;
    /**
    * Habilidades obtenidas segín la casta del personaje.
    */
    private String[] habilidadesCasta;
    /**
    * Nombre de la casta del personaje.
    */
    private String nombreCasta;

    /**
     * Modo dios del personaje.
     */
    private boolean modoDios = false;

    /**
     * Modo invisible del personaje.
     */
    private boolean invisible = false;

    /**
    * Getter de las habilidades de casta del personaje.
    *
    * @return las habilidades de casta del personaje.
    */

    public final String[] getHabilidadesCasta() {
        return this.casta.getHabilidadesCasta();
        }

    /**
    * Método para cargar la tablade niveles del personaje.
    */
    public static void cargarTablaNivel() {
        Personaje.setTablaDeNiveles(new int[CANTIDAD_NIVELES]);
        Personaje.getTablaDeNiveles()[0] = 0;
        Personaje.getTablaDeNiveles()[1] = 0;
        for (int i = 2; i < CANTIDAD_NIVELES; i++) {
            Personaje.getTablaDeNiveles()[i] =
            Personaje.getTablaDeNiveles()[i - 1] + CONSTANTE_NIVEL;
            }
        }

    /**
    * Constructor parametrizado de la clase Personaje.
    *
    * @param nombre
    *            esel nombre del personaje
    * @param cast
    *            es la casta del personaje
    * @param i
    *            es el identificador del personaje
    */
    public Personaje(final String nombre, final Casta cast, final int i) {
        super(FUERZA_INICIAL, DEFENSA_INICIAL, NIVEL_INICIAL, nombre);

        this.casta = cast;
        this.idPersonaje = i;
        this.experiencia = EXPERIENCIA_INICIAL;
        this.inteligencia = INTELIGENCIA_INICIAL;
        this.destreza = DESTREZA_INICIAL;
        this.saludTope = SALUD_TOPE_INICIAL;
        this.energiaTope = ENERGIA_TOPE_INICIAL;
        this.aumentarEnergiaTope(this.getEnergiaBonus());
        this.aumentarSaludTope(this.getSaludBonus());
        this.aumentarDestreza(this.casta.recibirDestrezaBonus());
        this.aumentarFuerza(this.casta.recibirFuerzaBonus());
        this.aumentarInteligencia(this.casta.recibirInteligenciaBonus());
        this.nombreRaza = this.getNombreRaza();
        this.nombreCasta = this.casta.getNombreCasta();
        this.habilidadesRaza = this.getHabilidadesRaza();
        this.habilidadesCasta = this.casta.getHabilidadesCasta();
        this.x = POS_X_INICIAL;
        this.y = POS_Y_INICIAL;
        this.salud = saludTope;
        this.energia = energiaTope;
        this.ataque = this.calcularPuntosDeAtaque();
        this.magia = this.calcularPuntosDeMagia();
        this.aumentarDefensa(destreza);
        this.clan = null;
        this.habilidadesRaza = new String[CANTIDAD_HABILIDADES_RAZA];
        this.habilidadesCasta = new String[CANTIDAD_HABILIDADES_CASTA];
        }

    /**
    * Constructor parametrizado de la clase Personaje.
    *
    * @param nom
    *            es el nombre del personaje
    * @param sal
    *            es la salud del personaje
    * @param energ
    *            es la energía del personaje
    * @param fuer
    *            es la fuerza del Personaje
    * @param dest
    *            es la destreza del personaje
    * @param intelig
    *            es la inteligencia del personaje
    * @param cast
    *            es la casta del personaje
    * @param exp
    *            es la experiencia del personaje
    * @param niv
    *            es el nivel del personaje
    * @param idPer
    *            es el id del personaje
    */
    public Personaje(final String nom, final int sal, final int energ,
            final int fuer, final int dest, final int intelig,
            final Casta cast, final int exp, final int niv,
            final int idPer) {
        super(fuer, 0, niv, nom);

        this.salud = sal;
        this.energia = energ;

        this.destreza = dest;
        this.aumentarDefensa(dest);
        this.inteligencia = intelig;
        this.casta = cast;

        this.experiencia = exp;

        this.saludTope = this.salud;
        this.energiaTope = this.energia;

        this.idPersonaje = idPer;

        this.ataque = this.calcularPuntosDeAtaque();
        this.magia = this.calcularPuntosDeMagia();
        }

    /**
    * Getter del ataque del personaje.
    *
    * @return el ataque del personaje.
    */
    @Override
    public final int getAtaque() {
        return this.ataque;
        }

    /**
    * Setter del ataque del personsaje.
    *
    * @param ataq
    *            es el nuevo ataque del peronaje.
    */
    @Override
    public final void setAtaque(final int ataq) {
        this.ataque = ataq;
        }

    /**
    * Getter de la magia del personaje.
    *
    * @return la magia del personaje.
    */
    @Override
    public final int getMagia() {
        return this.magia;
        }

    /**
    * Setter de la magia del personaje.
    *
    * @param mag
    *            es la nueva magia del personaje.
    */
    public final void setMagia(final int mag) {
        this.magia = mag;
        }

    /**
    * Getter del clan del personaje.
    *
    * @return la alianza del personaje.
    */
    public final Alianza getClan() {
        return this.clan;
        }

    /**
    * Setter del clan del personaje.
    *
    * @param cl
    *            es el nuevo clan del personaje.
    */
    public final void setClan(final Alianza cl) {
        this.clan = cl;
        this.clan.aniadirPersonaje(this);
        }

    /**
    * Getter de la salud del personaje.
    *
    * @return Salud del personaje
    */
    @Override
    public final int getSalud() {
        return this.salud;
        }

    /**
    * Getter de la energia del personaje.
    *
    * @return la energía del personaje
    */
    public final int getEnergia() {
        return this.energia;
        }

    /**
    * Getter de la destreza del personaje.
    *
    * @return la destreza del personaje
    */
    public final int getDestreza() {
        return this.destreza;
        }

    /**
    * Getter de la inteligencia del personaje.
    *
    * @return la inteligencia del personaje
    */
    public final int getInteligencia() {
        return this.inteligencia;
        }

    /**
    * Getter de la casta del personaje.
    *
    * @return Casta del personaje
    */
    public final Casta getCasta() {
        return this.casta;
        }

    /**
    * Getter de la experiencia del personaje.
    *
    * @return la experiencia del personaje
    */
    public final int getExperiencia() {
        return this.experiencia;
        }

    /**
    * Getter del id del personaje.
    *
    * @return el id del personaje
    */
    public final int getIdPersonaje() {
        return this.idPersonaje;
        }

    /**
    * Getter del tope de salud del personaje.
    *
    * @return el tope de salud del personaje
    */
    public final int getSaludTope() {
        return this.saludTope;
        }

    /**
    * Getter de la energia máxima del personaje.
    *
    * @return la energía máxima del personaje.
    */
    public final int getEnergiaTope() {
        return this.energiaTope;
        }

    /**
    * Método que evalúa el daño efectuado en un ataque, dependiendo del
    * resultado de las comparaciones entre el Personaje llamador y peleable
    * atacado.<br>
    * La probabilidad de golpe crítico depende de la casta y destreza del
    * Personaje.<br>
    * Si la probabilidad junto con la destreza es mayor o igual al número
    * generado de manera aleatoria, entonces se atacará con golpe crítico,
    *  de lo contrario se realizará un ataque simple.
    *
    * @param atacado
    *            es el peleable que es atacado
    * @return el daño efectuado sobre la salud del peleable atacado.
    */
    @Override
    public final int atacar(final Peleable atacado) {
        if (this.salud == 0) {
            return 0;
            }
        if (atacado.getSalud() > 0) {

            if (this.getRandom().nextDouble() <= this.casta.
            getProbabilidadGolpeCritico() + this.destreza / DIVISOR_DESTREZA) {
                return atacado.serAtacado(this.golpeCritico());
                } else {
                    return atacado.serAtacado(this.ataque);
                    }
            }
        return 0;
        }

    /**
    * Metodo que obtiene el golpe crítico que puede efectuar
    * el personaje. El daño critico se obtiene de la clase casta,
    * siendo la multiplicación del ataque del personaje y el daño
    * crítico de la casta a la que pertenece.
    *
    * @return el golpeCrítico que puede realizar el personaje.
    */
    public final int golpeCritico() {
        return (int) (this.ataque * this.getCasta().getDanioCritico());
        }

    /**
    * Acción desencadenada tras un jugar un turno.
    */
    @Override
    public void despuesDeTurno() {

        }

    /**
    * Método que indica si el personaje puede atacar.
    *
    * @return un booleano que representa si puede o no atacar.
    */
    public final boolean puedeAtacar() {
        return this.energia > ENERGIA_MINIMA;
        }

    /**
    * Metodo que calcula los puntos de ataque del personaje en base a su fuerza
    * y al multiplicador de fuerza.
    *
    * @return los puntos de ataque del personaje.
    */
    public final int calcularPuntosDeAtaque() {
        return (int) (this.getFuerza() * MULTIPLICADOR_FUERZA);
        }

    /**
    * Método que calcula los puntos de defensa del personaje en base a su
    * destreza.
    *
    * @return los puntos de destreza del personaje.
    */
    public final int calcularPuntosDeDefensa() {
        return this.getDestreza();
        }

    /**
    * Método que calcula los puntos de magia del personaje en base a la
    * inteligencia y al multiplicador de magia del personaje.
    *
    * @return los puntos de magia del personaje
    */
    public final int calcularPuntosDeMagia() {
        return (int) (this.getInteligencia() * MULTIPLICADOR_MAGIA);
        }

    /**
    * Metodo que establece la salud actual del personaje a la máxima salud
    * posible.
    */
    public final void restablecerSalud() {
        this.salud = this.saludTope;
        }

    /**
    * Metodo que establece la energía actual del personaje
    *  a la máxima energía
    * posible.
    */
    public final void restablecerEnergia() {
        this.energia = this.energiaTope;
        }

    /**
    * Metodo que modifica los atributos de ataque, defensa y magia del
    * personaje.
    */
    public final void modificarAtributos() {
    /*
    * Tener en cuenta para cuando implementemos asignarPuntosSkills
    */
        this.ataque = this.calcularPuntosDeAtaque();
        this.aumentarDefensa(destreza);
        this.magia = this.calcularPuntosDeMagia();
        }

    /**
    * Método que evalúa si un personaje está vivo en base a su salud.
    *
    * @return un booleano que indica si está vivo o no el personaje.
    */
    @Override
    public final boolean estaVivo() {
        return this.salud > 0;
        }

    /**
    * Método que decide si disminuir el daño recibido en un ataque o
    * directamente no aplicarlo.
    *
    * @param danio
    *            es el daño recibido tras un ataque
    * @return retorna el daño que impactó sobre el personaje,
    */
    @Override
    public final int serAtacado(int danio) {

        if (this.getRandom().nextDouble() >= this.getCasta().
                getProbabilidadEvitarDanio()) {
            danio -= this.getDefensa();
            if (danio > 0) {
                if (this.salud <= danio) {
                    danio = this.salud;
                    this.salud = 0;
                    } else {
                        this.salud -= danio;
                        }
                return danio;
                }
            return 0;
            }
        return 0;
        }

    /**
    * Método que calcula y quita los puntos de salud que fueron robados al
    * recibir un daño.
    *
    * @param danio            es el daño causado al personaje
    * @return los puntos de vida quitados al personaje
    */
    public final int serRobadoSalud(int danio) {
        danio -= this.getDefensa();
        if (danio <= 0) {
            return 0;
            }
        if ((this.salud - danio) >= 0) {
            this.salud -= danio;
            } else {
                danio = this.salud;
                this.salud = 0;
                }
        return danio;
        }

    /**
    * Método que calcula y quita los puntos de energia que
    * fueron perdidos al recibir un daño.
    *
    * @param danio            es el daño causado al personaje
    * @return los puntos de energia quitados al personaje.
    */
    public final int serDesenergizado(int danio) {
        danio -= this.getDefensa();
        if (danio <= 0) {
            return 0;
            }
        if ((this.energia - danio) >= 0) {
            this.energia -= danio;
            } else {
                danio = this.energia;
                this.energia = 0;
                }
        return danio;
        }

    /**
    * Método que aumenta la salud actual del personaje. Si este
    * aumento es mayor al tope, establece como salud actual a la
    * máxima que puede tener el personaje.
    *
    * @param sal
    *            es la salud a sumar al personaje.
    */
    public final void serCurado(final int sal) {
        if ((this.salud + sal) <= this.saludTope) {
            this.salud += sal;
            } else {
                this.salud = this.saludTope;
                }
        }

    /**
    * Método que calcula y otorga los puntos de energia que
    * fueron ganados. Si este aumento es mayor al tope, establece
    * como energía actual a la máxima que puede tener el personaje.
    *
    * @param energ
    *            es la energia a sumar al Personaje.
    */
    public final void serEnergizado(final int energ) {
        if ((this.energia + energ) <= this.energiaTope) {
            this.energia += energ;
            } else {
                this.energia = this.energiaTope;
                }
        }

    /**
    * Método que crea una nueva alianza. Asigna a ésta al clan
    * actual del personaje y lo añade a la lista de Personajes que
    * integran la alianza.
    *
    * @param nombreAlianza
    *            es el nombre de la nueva alianza
    */
    public final void crearAlianza(final String nombreAlianza) {
        this.clan = new Alianza(nombreAlianza);
        this.clan.aniadirPersonaje(this);
        }

    /**
    * Metodo void que desvincula al personaje de la alianza y establece
    * que el personaje no pertenece a ninguna.
    */
    public final void salirDeAlianza() {
        if (this.clan != null) {
            this.clan.eliminarPersonaje(this);
            this.clan = null;
            }
        }

    /**
    * Método que retorna un boolean si pudo añadir un nuevo aliado a la
    * alianza en la que se encuentra el personaje. Si el personaje llamador
    * no pertenece a ninguna alianza se crea una con el nombre "Alianza 1"
    * por defecto. Luego se agrega al nuevo aliado a la alianza del
    * personaje llamador.
    *
    * @param nuevoAliado
    *            es el personaje que se añadirá al clan del llamador
    * @return un booleano que indica si pudo agregar al nuevo aliado
    */
    public final boolean aliar(final Personaje nuevoAliado) {
        if (this.clan == null) {
            Alianza a = new Alianza("Alianza 1");
            this.clan = a;
            a.aniadirPersonaje(this);
            }

        if (nuevoAliado.clan == null) {
            nuevoAliado.clan = this.clan;
            this.clan.aniadirPersonaje(nuevoAliado);
            return true;
            } else {
                return false;
                }
        }

    /**
    * Método utilizado para aumentar los puntos de fuerza, destreza
    * y de inteligencia del personaje. Nunca estos atributos superan
    * los maximos.
    * Una vez modificados los atributos mencionados, actualiza los nuevos
    * puntos de ataque,defensa y magia del personaje.
    *
    * @param fuer
    *            es la nueva fuerza del personaje
    * @param dest
    *            es la nueva destreza del personaje
    * @param intelig
    *            es la nueva inteligencia del personaje
    */
    public final void AsignarPuntosSkills(final int fuer, final int dest,
                                          final int intelig) {
        if (this.getFuerza() + fuer <= FUERZA_MAXIMA) {
            this.aumentarFuerza(fuer);
            }
        if (this.destreza + dest <= DEFENSA_MAXIMA) {
            this.destreza += dest;
            }
        if (this.inteligencia + intelig <= INTELIGENCIA_MAXIMA) {
            this.inteligencia += intelig;
            }
        this.modificarAtributos();
        }

    /**
    * Método que aumenta el nivel del personaje. Si ya se encuentra
    * en el nivel máximo, no realiza cambios. Pero si no se alcanzó
    * el nivel máximo, se actualizará la salud tope, la energía tope y
    * el nivel del personaje hasta que su experiencia sea menor a la de
    * un nivel preestablecido. Luego se le descuenta al atributo
    * experiencia, la experiencia que se utilizó para aumentar el nivel
    * del personaje.
    */
    public final void subirNivel() {

        int acumuladorExperiencia = 0;
        if (this.getNivel() == NIVEL_MAXIMO) {
            return;
            }
        while (this.getNivel() != NIVEL_MAXIMO
            && (this.experiencia >= Personaje.
                    getTablaDeNiveles()[this.getNivel() + 1]
                    + acumuladorExperiencia)) {
            acumuladorExperiencia += Personaje.
                         getTablaDeNiveles()[this.getNivel() + 1];
            this.aumentarNivel();
            this.modificarAtributos();
            this.saludTope += SALUD_TOPE_SUBIR_NIVEL;
            this.energiaTope += ENERGIA_TOPE_SUBIR_NIVEL;
            }
        this.experiencia -= acumuladorExperiencia;
        }

    /**
    * Método que indica si el personaje tiene la cantidad suficiente de
    * experiencia para aumentar el nivel o no.
    *
    * @param exp
    *            es la cantidad de experiencia que aumento el personaje
    * @return un booleano que indica si se aumentó o no de nivel al personaje
     */
    public final boolean ganarExperiencia(final int exp) {
        this.experiencia += exp;

        if (this.experiencia >= Personaje.
            getTablaDeNiveles()[this.getNivel() + 1]) {
            this.subirNivel();
            return true;
            }
        return false;
        }

    /**
    * Método calcula la experiencia equivalente del personaje que
    * depende del nivel del mismo y del multiplicador de experiencia.
    *
    * @return la experiencia brindada por el personaje
    */
    @Override
    public final int otorgarExp() {
        return this.getNivel() * MULTIPLICADOR_EXPERIENCIA;
        }

    /**
    * Método que clona un personaje.
    *
    * @return un clon con atributos copia fiel del personaje clonado.
    * @throws CloneNotSupportedException
    * Excepción de clonación cuando no está implementada
    */
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
        }

    /**
    * Método que calcula la distancia radial hasta un personaje.
    *
    * @param personaje
    *            es el personaje contra el que se calcula la distancia
    * @return la distancia entre los dos Personajes
    */
    public final double distanciaCon(final Personaje personaje) {
        return Math.sqrt(Math.pow(this.x - personaje.x, 2)
               + Math.pow(this.y - personaje.y, 2));
        }

    /**
    * Método que realiza la habilidad 1 de casta. Esta habilidad
    * dependerá de la casta a la que pertenece el personaje:
    * Asesino, Guerrero o Hechicero.
    * La energía del personaje debe ser mayor a la mínima para lograr la
    * habilidad.
    *
    * @param atacado
    *        es el personaje al cual le realizará la habilidad el personaje
    *            llamador.
    * @return un booleano que indica si pudo o no realizar la habilidad
    *  1 de la casta.
    */
    public final boolean habilidadCasta1(final Peleable atacado) {
        return this.getCasta().habilidad1(this, atacado);
        }

    /**
    * Método que realiza la habilidad 2 de casta. Esta habilidad
    * dependerá de la casta a la que pertenece el personaje:
    * Asesino, Guerrero o Hechicero.
    * La energía del personaje debe ser mayor a la mínima para lograr la
    * habilidad.
    *
    * @param atacado
    *       es el personaje al cual le realizará la habilidad el personaje
    *            llamador.
    * @return un booleano que indica si pudo o no realizar la
    * habilidad 2 de la casta.
    */
    public final boolean habilidadCasta2(final Peleable atacado) {
        return this.getCasta().habilidad2(this, atacado);
        }

    /**
    * Método que realiza la habilidad 3 de casta. Esta habilidad
    * dependerá de la casta a la que pertenece el personaje:
    * Asesino, Guerrero o Hechicero.
    * La energía del personaje debe ser mayor a la mínima para lograr la
    * habilidad.
    *
    * @param atacado
    *        es el personaje al cual le realizará la habilidad el personaje
    *            llamador.
    * @return un booleano que indica si pudo o no realizar la
    * habilidad 3 de la casta.
    */
    public final boolean habilidadCasta3(final Peleable atacado) {
        return this.getCasta().habilidad3(this, atacado);
        }

    /**
    * Método abstracto que realiza la habilidad 1 de raza. Esta habilidad
    * dependerá de la raza al que pertenece el personaje: Humano, Orco o Elfo.
    * La energía del personaje debe ser mayor a la mínima para lograr la
    * habilidad, independientemente de la raza que sea.
    *
    * @param atacado
    *            es el personaje al cual le realizará la habilidad
    *            el personaje llamador.
    * @return un booleano que indica si pudo o no realizar la habilidad 1 de la
    *         raza.
    */
    public abstract boolean habilidadRaza1(Peleable atacado);

    /**
    * Método abstracto que realiza la habilidad 2 de raza. Esta habilidad
    * dependerá de la raza al que pertenece el personaje:
    * Humano, Orco o Elfo.
    * La energía del personaje debe ser mayor a la mínima para lograr la
    * habilidad, independientemente de la raza que sea.
    *
    * @param atacado
    *       es el personaje al cual le realizará la habilidad el personaje
    *            llamador.
    * @return un booleano que indica si pudo o no realizar la
    *  habilidad 2 de la raza.
    */
    public abstract boolean habilidadRaza2(Peleable atacado);

    /**
    * Getter abstracto de los nombres de las habilidades de raza,
    * implementado en cada raza. Depende de la raza a la que pertenezca
    *  el personaje llamador: Humano, Orco o Elfo.
    *
    * @return un array con los nombres de las habilidades.
    */
    public abstract String[] getHabilidadesRaza();

    /**
    * Getter abstracto del bonus de salud implementado en cada raza.
    * Depende de la raza que sea el personaje llamador:
    * Humano, Orco o Elfo.
    *
    * @return el bonus de salud.
    */
    public abstract int getSaludBonus();

    /**
    * Getter abstracto del bonus de energia implementado en cada raza.
    * Depende de la raza que sea el personaje llamador:
    * Humano, Orco o Elfo.
    *
    * @return el bonus de energia.
    */
    public abstract int getEnergiaBonus();

    /**
    * Getter abstracto del nombre de raza del personaje, implementado
    * en cada raza. Depende de la raza a la que pertenezca el personaje
    * llamador: Humano, Orco o Elfo.
    *
    * @return el nombre de la Raza del personaje.
    */
    public abstract String getNombreRaza();

    /**
    * Método que aumenta la inteligencia del personaje según la cantidad
    * otorgada.
    *
    * @param bonus            es la inteligencia otorgada
    */
    public final void aumentarInteligencia(final int bonus) {
        this.inteligencia += bonus;
        }

    /**
    * Método que aumenta la destreza del personaje según
    * la cantidad otorgada.
    *
    * @param bonus            es la destreza otorgada
    */
    public final void aumentarDestreza(final int bonus) {
        this.destreza += bonus;
        }

    /**
    * Método que aumenta el tope de salud del personaje según la cantidad
    * otorgada.
    *
    * @param bonus            es la salud otorgada
    */
    public final void aumentarSaludTope(final int bonus) {
        this.saludTope += bonus;
        }

    /**
    * Método que aumenta el tope de energía del personaje según la cantidad
    * otorgada.
    *
    * @param bonus            es la energía otorgada
    */
    public final void aumentarEnergiaTope(final int bonus) {
        this.energiaTope += bonus;
        }

    /**
    * Getter de la tabla de niveles del personaje.
    *
    * @return la tabla de niveles
    */
    public static final int[] getTablaDeNiveles() {
        return Personaje.tablaDeNiveles;
        }

    /**
    * Setter de la tabla de niveles del personaje.
    *
    * @param tablaDeNiv      es la nueva tabla de niveles de personaje.
    */
    private static void setTablaDeNiveles(final int[] tablaDeNiv) {
        Personaje.tablaDeNiveles = tablaDeNiv;
        }

    /**
    * Método que aumenta la energía.
    *
    * @param bonus
    *            es el monto que será agregado a la energía
    */
    public final void aumentarEnergia(final int bonus) {
        this.energia += bonus;
        }

    /**
    * Método que reduce la energía.
    *
    * @param monto
    *            es el monto en que será reducido a la energía
    */
    public final void reducirEnergia(final int monto) {
        if (this.energia > monto) {
            this.energia -= monto;
            } else {
                this.energia = 0;
                }

    }

    /**
    * Método que reduce la salud.
    *
    * @param reduccion
    *            es el monto en que será reducida la salud
    */
    public final void reducirSalud(final int reduccion) {
        this.salud -= reduccion;
        }

    /**
    * Método que aumenta la salud.
    *
    * @param bonus
    *            es el monto que será agregado a la salud
    */
    public final void aumentarSalud(final int bonus) {
        this.salud += bonus;
        }

    /**
    * Método que actualiza la salud y la energía del personaje en batalla.
    *
    * @param map
    *            es un contenedor con los atributos a actualizar.
    */
    public final void actualizarAtributos(final HashMap<String,
                                          Number> map) {
        this.salud = map.get("salud").intValue();
        this.energia = map.get("energia").intValue();
        setDefensa(map.get("defensa").intValue());
        this.casta.setProbabilidadEvitarDanio(map.
                     get("probEvitarDanio").doubleValue());
        }

    /**
    * Método que realiza el trueque de ítems.
    *
    * @param misItems    son los ítems que posee el personaje actualmente.
    * @param aPoner            son los ítems a recibir
    * @param aSacar            son los ítems a sacar
    */
    public void trueque(final ArrayList<Item> misItems,
                        final ArrayList<Item> aPoner,
                        final DefaultListModel<String> aSacar) {
        int j = 0;
        boolean loop = true;
        ArrayList<Item> aux = misItems;
        while (aSacar.size() > 0) {
            while (loop) {
                if (misItems.get(j).getNombre().equals(aSacar.get(0))) {
                    aSacar.remove(0);
                    aux.remove(misItems.get(j));
                    loop = false;
                    }
                j++;
                }
            j = 0;
            loop = true;
            }
        for (Item item : aPoner) {
            aux.add(item);
            }
        setItems(aux);
        }

/**
 * Modo dios activado.
 *
 * @return true, if successful
 */
public boolean modoDiosActivado() {
return modoDios;
}

/**
 * Activar modo dios.
 */
public void activarModoDios() {
this.modoDios = !this.modoDios;
}

/**
 * Checks if is invisible.
 *
 * @return true, if is invisible
 */
public boolean isInvisible() {
return invisible;
}

/**
 * Sets the invisible.
 */
public void setInvisible() {
this.invisible = !(this.invisible);
}
}
