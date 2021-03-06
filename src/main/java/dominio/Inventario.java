
package dominio;


/**
 * The Class Inventario.
 */
public class Inventario {

/** The id inventario. */
private int idInventario;

/** The manos 1. */
private int manos1;

/** The manos 2. */
private int manos2;

/** The pie. */
private int pie;

/** The cabeza. */
private int cabeza;

/** The pecho. */
private int pecho;

/** The accesorio. */
private int accesorio;

/**
 * Instantiates a new inventario.
 */
public Inventario() {

}

/**
 * Instantiates a new inventario.
 *
 * @param idInventaro the id inventaro
 */
public Inventario(final int idInventaro) {
this.idInventario = idInventaro;
this.pie = -1;
this.cabeza = -1;
this.pecho = -1;
this.accesorio = -1;
this.manos1 = -1;
this.manos2 = -1;
}

/**
 * Instantiates a new inventario.
 *
 * @param idInventaro the id inventaro
 * @param mans1 the mans 1
 * @param mans2 the mans 2
 * @param pi the pi
 * @param cabez the cabez
 * @param pech the pech
 * @param accesori the accesori
 */
public Inventario(final int idInventaro, final int mans1,
final int mans2, final int pi,
final int cabez, final int pech, final int accesori) {
super();
this.idInventario = idInventaro;
this.manos1 = mans1;
this.manos2 = mans2;
this.pie = pi;
this.cabeza = cabez;
this.pecho = pech;
this.accesorio = accesori;
}

/**
 * Gets the id inventario.
 *
 * @return the id inventario
 */
public int getidInventario() {
return idInventario;
}

/**
 * Sets the id inventario.
 *
 * @param idInventarioAux
 *            the new id inventario
 */
public void setidInventario(final int idInventarioAux) {
this.idInventario = idInventarioAux;
}

/**
 * Gets the manos 1.
 *
 * @return the manos 1
 */
public int getmanos1() {
return manos1;
}

/**
 * Sets the manos 1.
 *
 * @param manos1Aux
 *            the new manos 1
 */
public void setmanos1(final int manos1Aux) {
this.manos1 = manos1Aux;
}

/**
 * Gets the manos 2.
 *
 * @return the manos 2
 */
public int getmanos2() {
return manos2;
}

/**
 * Sets the manos 2.
 *
 * @param manos2Aux
 *            the new manos 2
 */
public void setmanos2(final int manos2Aux) {
this.manos2 = manos2Aux;
}

/**
 * Gets the pie.
 *
 * @return the pie
 */
public int getpie() {
return pie;
}

/**
 * Sets the pie.
 *
 * @param pieAux
 *            the new pie
 */
public void setpie(final int pieAux) {
this.pie = pieAux;
}

/**
 * Gets the cabeza.
 *
 * @return the cabeza
 */
public int getcabeza() {
return cabeza;
}

/**
 * Sets the cabeza.
 *
 * @param cabezaAux
 *            the new cabeza
 */
public void setcabeza(final int cabezaAux) {
this.cabeza = cabezaAux;
}

/**
 * Gets the pecho.
 *
 * @return the pecho
 */
public int getpecho() {
return pecho;
}

/**
 * Sets the pecho.
 *
 * @param pechoAux
 *            the new pecho
 */
public void setpecho(final int pechoAux) {
this.pecho = pechoAux;
}

/**
 * Gets the accesorio.
 *
 * @return the accesorio
 */
public int getaccesorio() {
return accesorio;
}

/**
 * Sets the accesorio.
 *
 * @param accesorioAux
 *            the new accesorio
 */
public void setaccesorio(final int accesorioAux) {
this.accesorio = accesorioAux;
}

}
