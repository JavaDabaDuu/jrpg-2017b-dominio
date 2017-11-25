
package dominio;

/**
 * La clase MyRandomStub es la encargada de relizar el testing.
 */
public class MyRandomStub extends RandomGenerator {
    /**
    * Valor double que se retornará.
    */
    private final double valDouble;
    /**
    * Valor entero que se retornará.
    */
    private final int valInt;

    /**
    * Constructor del MyRandomStub.
    *
    * @param valDoubl
    *            es el valor double que se fijará en el objeto.
    * @param valI
    *            es el valor entero que se fijará en el objeto.
    */
    public MyRandomStub(final double valDoubl, final int valI) {
        this.valDouble = valDoubl;
        this.valInt = valI;
        }

    /**
    * Método que retorna el valor entero del stub.
    *
    * @param val            valor que se pasa por parámetro.
    * @return el valor entero del stub
    */
    @Override
    public final int nextInt(final int val) {
        return this.valInt;
        }

    /**
    * Método que retorna el valor double del stub.
    *
    * @return el valor double del stub
    */
    @Override
    public final double nextDouble() {
        return this.valDouble;
        }

}
