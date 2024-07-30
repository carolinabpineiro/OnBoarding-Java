package day_4;

import java.util.InputMismatchException;
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
        if (opcion == 1) {
            System.out.println("Resultado: " + calculadora.sumar(a, b));
        } else if (opcion == 2) {
            System.out.println("Resultado: " + calculadora.restar(a, b));
        } else if (opcion == 3) {
            System.out.println("Resultado: " + calculadora.multiplicar(a, b));
        } else if (opcion == 4) {
            double resultado = calculadora.dividir(a, b);
            if (b != 0) { // Verificamos aquí para evitar mostrar resultados incorrectos
                System.out.println("Resultado: " + resultado);
            }
        } else if (opcion == 5) {
            System.out.println("Saliendo...");
            System.exit(0);
        } else {
            System.out.println("Opción no válida.");
        }
    }

    public void iniciar() {
        int opcion;
        double a = 0, b = 0;

        do {
            mostrarMenu();
            opcion = obtenerOpcion();

            if (opcion != 5) {
                a = obtenerNumero("Ingrese el primer número: ");
                b = obtenerNumero("Ingrese el segundo número: ");
                ejecutarOperacion(opcion, a, b);
            }
        } while (opcion != 5); // Continuar hasta que el usuario elija salir

        scanner.close();
    }

    private int obtenerOpcion() {
        int opcion = -1;
        while (opcion < 1 || opcion > 5) {
            System.out.print("Seleccione una opción: ");
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
            } else {
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
            if (scanner.hasNextDouble()) {
                numero = scanner.nextDouble();
                valido = true;
            } else {
                System.out.println("Entrada no válida. Ingrese un número decimal.");
                scanner.next(); // Limpiar el buffer
            }
        }
        return numero;
    }
}