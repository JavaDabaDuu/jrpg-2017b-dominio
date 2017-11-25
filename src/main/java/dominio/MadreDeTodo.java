

package dominio;

import java.util.ArrayList;

/**
 * La clase MadreDeTodo tiene las características comunes entre los NPC y los
 * personajes.
 */
public abstract class MadreDeTodo {

    /**
    * Fuerza del personaje o npc.
    */
    private int fuerza;
    /**
    * Defensa del personaje o npc.
    */
    private int defensa;
    /**
    * Nivel del personaje o npc.
    */
    private int nivel;
    /**
    * Nombre del personaje o npc.
    */
    private String nombre;
    /**
    * Generador de valores aleatorios.
    */
    private RandomGenerator random;

    /**
    * Lista de ítems que el npc o personaje tiene equipados.
    */
    private ArrayList<Item> items;

    /**
    * Constructor parametrizado de la clase MadreDeTodo.
    *
    * @param fuer
    *            es la fuerza del NPC o Personaje.
    * @param def
    *            es la defensa del NPC o Personaje.
    * @param niv
    *            es el nivel del NPC o Personaje.
    * @param nom
    *            es el nombre del NPC o Personaje.
    */
    public MadreDeTodo(final int fuer, final int def,
                       final int niv, final String nom) {
        this.fuerza = fuer;
        this.defensa = def;
        this.nivel = niv;
        this.nombre = nom;
        this.random = new MyRandom();
        this.items = new ArrayList<Item>();
        }

    /**
    * Getter de la fuerza del personaje o NPC.
    *
    * @return fuerza del personaje o NPC.
    */
    public final int getFuerza() {
        return this.fuerza;
        }

    /**
    * Getter de la defensa del personaje o NPC.
    *
    * @return defensa del personaje o NPC.
    */
    public final int getDefensa() {
        return this.defensa;
        }

    /**
    * Getter del nivel del personaje o NPC.
    *
    * @return nivel del personaje o NPC.
    */
    public final int getNivel() {
        return this.nivel;
        }

    /**
    * Getter del nombre del personaje o NPC.
    *
    * @return nombre del personaje o NPC.
    */
    public final String getNombre() {
        return this.nombre;
        }

    /**
    * Setter del nombre del personaje o NPC.
    *
    * @param nom
    *            es el nuevo nombre del personaje o NPC.
    */
    public final void setNombre(final String nom) {
        this.nombre = nom;
        }

    /**
    * Método que aumenta la fuerza del personaje o NPC.
    *
    * @param aumento
    *            es el aumento a aplicar sobre la fuerza.
    */
    public final void aumentarFuerza(final int aumento) {
        this.fuerza += aumento;
        }

    /**
    * Método que aumenta el nivel del personaje o NPC.
    */
    public final void aumentarNivel() {
        this.nivel++;
        }

    /**
    * Getter del Randomizador.
    *
    * @return retorna el randomizador.
    */
    public final RandomGenerator getRandom() {
        return this.random;
        }

    /**
    * Setter del Randomizador.
    *
    * @param rand
    *            es el nuevo randomizador.
    */
    public final void setRandom(final RandomGenerator rand) {
        this.random = rand;
        }

    /**
    * Metodo que aumenta la defensa del personaje o NPC.
    *
    * @param bonus
    *            es el bonus que se aplica sobre la defensa.
    */
    public final void aumentarDefensa(final int bonus) {
        this.defensa += bonus;
        }

    /**
    * Método que reduce la defensa del personaje o NPC.
    *
    * @param reduccion
    *            es el valor a descontar de la defensa.
    */
    public final void reducirDefensa(final int reduccion) {
        this.defensa -= reduccion;
        }

    /**
    * Método para añadir un nuevo ítem.
    *
    * @param item
    *            es el ítem a equipar.
    */
    public final void anadirItem(final Item item) {
        this.items.add(item);
        }

    /**
    * Método para remover un ítem equipado.
    *
    * @param item
    *            es el ítem equipado a remover.
    */
    public final void removerItem(final Item item) {
        this.items.remove(item);
        }

    /**
    * Getter de la lista de ítems.
    *
    * @return la lista de ítems del personaje o NPC.
    */
    public ArrayList<Item> getItems() {
        return this.items;
        }
    /**
     * Setter del array de items.
     *
     * @param its     es el nuevo array de items
     */
    public void setItems(final ArrayList<Item> its) {
        this.items = its;
        }
    /**
    * Setter de la defensa.
    * @param def   es el nuevo valor para la defensa.
    */
    public void setDefensa(final int def) {
        this.defensa = def;
        }

}
