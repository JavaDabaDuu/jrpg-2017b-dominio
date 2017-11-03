
package dominio;


/**
 * La clase RandomGenerator genera números random.
 */
public class RandomGenerator {
    /**
    * Método que siempre retorna 0. Será sobreescrito por las clases que
    * heredan.
    *
    * @param val
    *            es un valor pasado por parámetro
    * @return cero
    */
    public int nextInt(final int val) {
        return 0;
        }

    /**
    * Método que siempre retorna 0. Será sobreescrito por las clases que
    * heredan.
    *
    * @return cero
    */
    public double nextDouble() {
        return 0;
        }

    /**
    * Constructor de la clase RandomGenerator.
    */
    public RandomGenerator() {

        }
}
