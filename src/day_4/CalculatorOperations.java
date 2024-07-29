package day_4;

public interface CalculatorOperations {
    // Método para la suma
    double sumar(double a, double b);

    // Método para la resta
    double restar(double a, double b);

    // Método para la multiplicación
    double multiplicar(double a, double b);

    // Método para la división
    double dividir(double a, double b) throws ArithmeticException;
}
