
package dominio;

import java.util.Random;


/**
 * La clase MyRandom se utiliza para obtener números aleatorios.<br>
 * Hereda de RandomGenerator.
 */
public class MyRandom extends RandomGenerator {

    /**
    * El método nextDobule retorna un número double generado de forma aleatoria.
    *
    * @return retorna un número double que varía entre 0.0 y 1.0
    */
    @Override
    public final double nextDouble() {
        return new Random().nextDouble();
        }

    /**
    * El método nextInt retorna un número entero generado de forma aleatoria.
    *
    * @param valor            es un número entero utilizado
    *  en la generación de número
    *            entero aleatorio
    * @return un número entero generado de forma aleatoria a partir de cierto
    *         valor indicado
    */
    @Override
    public final int nextInt(final int valor) {
        return new Random().nextInt(valor);
        }

}
