package day_4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorWithMenu implements CalculatorMenu {
    private CalculatorOperations calculadora;
    private Scanner scanner;

    // Constructor
    public CalculatorWithMenu() {
        this.calculadora = new Calculator();
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void mostrarMenu() {
        System.out.println("---- Menú Calculadora ----");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
    }

    @Override
    public void ejecutarOperacion(int opcion, double a, double b) {
        try {
            switch (opcion) {
                case 1:
                    System.out.println("Resultado: " + calculadora.sumar(a, b));
                    break;
                case 2:
                    System.out.println("Resultado: " + calculadora.restar(a, b));
                    break;
                case 3:
                    System.out.println("Resultado: " + calculadora.multiplicar(a, b));
                    break;
                case 4:
                    System.out.println("Resultado: " + calculadora.dividir(a, b));
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public void iniciar() {
        while (true) {
            mostrarMenu();
            int opcion = obtenerOpcion();
            double a = obtenerNumero("Ingrese el primer número: ");
            double b = obtenerNumero("Ingrese el segundo número: ");
            ejecutarOperacion(opcion, a, b);
        }
    }

    private int obtenerOpcion() {
        int opcion = -1;
        while (opcion < 1 || opcion > 5) {
            try {
                opcion = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Ingrese un número entero.");
                scanner.next(); // Limpiar el buffer
            }
        }
        return opcion;
    }

    private double obtenerNumero(String mensaje) {
        double numero = 0;
        boolean valido = false;
        while (!valido) {
            System.out.print(mensaje);
            try {
                numero = scanner.nextDouble();
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Ingrese un número decimal.");
                scanner.next(); // Limpiar el buffer
            }
        }
        return numero;
    }
}