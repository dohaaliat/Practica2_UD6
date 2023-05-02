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

	 Este método realiza la operación de suma entre dos números enteros.
	 @param a El primer sumando que se sumará.
	 @param b El segundo sumando que se sumará.
	 @return El resultado de la suma de a y b.
	 */

	public int suma(int a, int b) {
		return a + b;
	}
	/**

	 Este método realiza la operación de resta entre dos números enteros.
	 @param a El minuendo que se restará.
	 @param b El sustraendo que se restará a 'a'.
	 @return El resultado de la resta de a y b.
	 */
	public int resta(int a, int b) {
		return a - b;
	}
/**

 Este método realiza la operación de multiplicación entre dos números enteros.
 @param a El multiplicando que es el primer factor que se multiplicará.
 @param b El multiplicador que es el segundo factor que se multiplicará.
 @return El producto de la multiplicación de a y b.
 */
	public int multiplica(int a, int b){
		return a*b;
	}
	/**

	 Este método realiza la operación de división entre dos números enteros.
	 @param a El dividiendo que se dividirá.
	 @param b El divisor por el que se dividirá 'a'.
	 @return El resultado de la división de a y b.
	 @throws ArithmeticException Si el divisor es cero, se lanza una excepción ArithmeticException.
	 ArithmeticException es una excepción que se lanza cuando ocurre un error durante la ejecución de una operación
	 matemática, como una división por cero o un desbordamiento de enteros. Es una excepción de tiempo de ejecución que
	 pertenece al paquete de excepciones de Java llamado java.lang.
	 */
	
	public int diveix(int a, int b) {
		return a/b;
	}

}

