package ed.doha;

public class TestCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.suma(3,5));
        System.out.println(calculadora.resta(7, 5));
        System.out.println(calculadora.multiplica(5, 8));
        System.out.println(calculadora.diveix(4, 9));
        System.out.println(calculadora.potencia(5, 8));
        System.out.println(calculadora.conversorDecimalABinario(5));
        System.out.println(calculadora.esPar(5));
    }
}