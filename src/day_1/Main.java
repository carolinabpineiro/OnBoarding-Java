package day_1;

import java.util.Scanner;

public class Main {

    // 1. Leer e imprimir datos personales
    public void leerEImprimirDatos() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Introduce tu apellido: ");
        String apellido = scanner.nextLine();

        System.out.print("Introduce tu edad: ");
        int edad = scanner.nextInt();

        System.out.println("Hola, " + nombre + " " + apellido + ". Tienes " + edad + " años.");
    }

    // 2. Imprimir mensaje de bienvenida
    public void imprimirBienvenida() {
        System.out.println("¡Bienvenido/a a nuestro programa!");
    }

    // 3. Encontrar el mayor de tres números
    public void encontrarMayor() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Introduce el tercer número: ");
        int num3 = scanner.nextInt();

        int mayor = Math.max(num1, Math.max(num2, num3));
        System.out.println("El número mayor es: " + mayor);
    }

    // 4. Determinar si un número es par o impar
    public void determinarParidad() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }
    }

    // 5. Comparar dos cadenas de caracteres
    public void compararCadenas() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la primera cadena: ");
        String cadena1 = scanner.nextLine();

        System.out.print("Introduce la segunda cadena: ");
        String cadena2 = scanner.nextLine();

        if (cadena1.equals(cadena2)) {
            System.out.println("Las cadenas son iguales.");
        } else {
            System.out.println("Las cadenas son diferentes.");
        }
    }

    // 6. Determinar si un número es primo
    public boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 7. Sumar números impares en un array
    public int sumaImpares(int[] numeros) {
        int suma = 0;
        for (int numero : numeros) {
            if (numero % 2 != 0) {
                suma += numero;
            }
        }
        return suma;
    }

    // 8. Imprimir números pares y sumar números primos en un array
    public void imprimirParesYSumarPrimos(int[] numeros) {
        int sumaPrimos = 0;
        System.out.print("Números pares: ");
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                System.out.print(numero + " ");
            }
            if (esPrimo(numero)) {
                sumaPrimos += numero;
            }
        }
        System.out.println("\nLa suma de los números primos es: " + sumaPrimos);
    }

    // 9. Imprimir menú de calculadora
    public void imprimirMenuCalculadora() {
        System.out.println("Menú de Calculadora:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("0. Salir");
    }

    // 10. Realizar operaciones de calculadora
    public void ejecutarCalculadora() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            imprimirMenuCalculadora();
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            if (opcion == 0) {
                break;
            }
            System.out.print("Introduce el primer número: ");
            double num1 = scanner.nextDouble();
            System.out.print("Introduce el segundo número: ");
            double num2 = scanner.nextDouble();
            switch (opcion) {
                case 1:
                    System.out.println("Resultado: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Resultado: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Resultado: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Error: División por cero.");
                    } else {
                        System.out.println("Resultado: " + (num1 / num2));
                    }
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 0);
    }

    // 11. Gestión de entrada a una bolera
    private int capacidad = 500;
    private int dineroRecaudado = 0;

    public void gestionarBolera() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            imprimirMenuBolera();
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir nueva línea
            switch (opcion) {
                case 1:
                    ingresarDatosPersonales(scanner);
                    break;
                case 2:
                    System.out.println("Capacidad disponible: " + capacidad);
                    break;
                case 3:
                    System.out.println("Dinero recaudado: " + dineroRecaudado);
                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 0);
    }

    public void imprimirMenuBolera() {
        System.out.println("Menú de Bolera:");
        System.out.println("1. Entrada de datos");
        System.out.println("2. Capacidad disponible");
        System.out.println("3. Dinero recaudado");
        System.out.println("0. Salir del sistema");
    }

    public void ingresarDatosPersonales(Scanner scanner) {
        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Introduce tu edad: ");
        int edad = scanner.nextInt();
        System.out.print("Introduce tu ID: ");
        String id = scanner.next();
        System.out.print("¿Tienes un pase (VIP o descuento)? (ninguno/vip/descuento): ");
        String pase = scanner.next().toLowerCase();

        if (edad < 21) {
            System.out.println("Lo siento, debes tener al menos 21 años para entrar.");
            return;
        }

        int precioEntrada = 1500;
        if (pase.equals("vip")) {
            precioEntrada = 0;
        } else if (pase.equals("descuento")) {
            precioEntrada = 750;
        }

        System.out.print("¿Quieres comprar una entrada normal o VIP? (normal/vip): ");
        String tipoEntrada = scanner.next().toLowerCase();
        if (tipoEntrada.equals("vip")) {
            precioEntrada = 2000;
        }

        if (capacidad > 0) {
            capacidad--;
            dineroRecaudado += precioEntrada;
            System.out.println("¡Bienvenido/a, " + nombre + "! Disfruta tu tiempo en la bolera.");
        } else {
            System.out.println("Lo siento, la capacidad está llena.");
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.leerEImprimirDatos();
        main.imprimirBienvenida();
        main.encontrarMayor();
        main.determinarParidad();
        main.compararCadenas();
        System.out.println(main.esPrimo(17) ? "El número es primo." : "El número no es primo.");
        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println("La suma de los números impares es: " + main.sumaImpares(numeros));
        main.imprimirParesYSumarPrimos(numeros);
        main.ejecutarCalculadora();
        main.gestionarBolera();
    }
}