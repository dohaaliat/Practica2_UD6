package ed.doha;
/**

 La clase Calculadora se utiliza para realizar operaciones matemáticas, en este caso realiza sumas, restas,
 multiplicaciones y divisiones.

 Incluye los métodos de suma, resta, multiplicación y división.

 @version 3.7

 @since 2.1 (junio de 2022)

 @author [Doha Aliat Belkas]
 */
public class Calculadora {
	/**
	 * Este método realiza la operación de suma entre dos números enteros.
	 *
	 * @param a El primer sumando que se sumará.
	 * @param b El segundo sumando que se sumará.
	 * @return El resultado de la suma de a y b.
	 */

	public int suma(int a, int b) {
		return a + b;
	}


	/**
	 * Este método realiza la operación de resta entre dos números enteros.
	 *
	 * @param a El minuendo que se restará.
	 * @param b El sustraendo que se restará a 'a'.
	 * @return El resultado de la resta de a y b.
	 */
	public int resta(int a, int b) {
		return a - b;
	}

	/**
	 * Este método realiza la operación de multiplicación entre dos números enteros.
	 *
	 * @param a El multiplicando que es el primer factor que se multiplicará.
	 * @param b El multiplicador que es el segundo factor que se multiplicará.
	 * @return El producto de la multiplicación de a y b.
	 */
	public int multiplica(int a, int b) {
		return a * b;
	}

	/**
	 * Este método realiza la operación de división entre dos números enteros.
	 *
	 * @param a El dividiendo que se dividirá.
	 * @param b El divisor por el que se dividirá 'a'.
	 * @return El resultado de la división de a y b.
	 * @throws ArithmeticException Si el divisor es cero, se lanza una excepción ArithmeticException.
	 *                             ArithmeticException es una excepción que se lanza cuando ocurre un error durante la ejecución de una operación
	 *                             matemática, como una división por cero o un desbordamiento de enteros. Es una excepción de tiempo de ejecución que
	 *                             pertenece al paquete de excepciones de Java llamado java.lang.
	 */

	public int diveix(int a, int b) {
		return a / b;
	}

	/**
	 * Calcula la potencia de un número 'base' elevado a la potencia 'exponente'.
	 * @param base El número base.
	 * @param exponente El exponente.
	 * @return La potencia 'base' elevado a la potencia 'exponente' que es guardada en la variable t.
	 */

	public int potencia(int base, int exponente) {

		int resultado = 1;

		for (int i = 0; i < exponente; i++) {
			resultado = resultado * base;
		}

		return resultado;
	}
	/**
	 * Verifica si un número entero es par o impar.
	 * @param numero El número a verificar.
	 * @return true si el número es par, false si es impar.
	 */


	public boolean esPar(int numero) {

		boolean resultado;

		resultado = numero % 2 == 0;

		return resultado;
	}

	/**
	 * Convierte un número entero a binario.
	 * @param numero El número entero a convertir.
	 * @return Una cadena de caracteres que representa el número en binario almacenada en la variable binario.
	 */

	public String conversorDecimalABinario(int numero) {

		StringBuilder binario = new StringBuilder();
		int cociente = numero;
		int resto;

		while (cociente > 0) {
			resto = cociente % 2;
			binario.insert(0, resto);
			cociente = cociente / 2;

		}
		return binario.toString();
	}
}


