package es.karames.ejemplojavadoc;

/**
 * Esta clase permite realizar las operaciones aritméticas básicas
 *
 * @author Nono Karames
 * @version 1.0.0
 */
public class Aritmetica {
    /**
     * Primer operando
     *
     * @var int
     */
    int operandoA;

    /**
     * Segundo operando
     *
     * @var int
     */
    int operandoB;

    /**
     * Constructor de la clase
     *
     * @param a Recibe el valor para operandoA
     * @param b Recibe el valor para operandoB
     */
    public Aritmetica(int a, int b) {
        this.operandoA = a;
        this.operandoB = b;
    }

    /**
     * Este método realiza la suma de dos operadores enteros
     *
     * @return int Resultado de la suma
     */
    public int sumar() {
        return operandoA + operandoB;
    }    
}
