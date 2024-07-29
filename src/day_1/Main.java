package day_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer nombre, apellido y edad
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingresa tu apellido: ");
        String apellido = scanner.nextLine();
        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        // Imprimir en la consola
        System.out.println("Hola, mi nombre es " + nombre + " " + apellido + " y tengo " + edad + " años.");

        // Llamar al método de bienvenida
        imprimirBienvenida();

        // Leer tres números y determinar el mayor
        System.out.print("Ingresa el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int num2 = scanner.nextInt();
        System.out.print("Ingresa el tercer número: ");
        int num3 = scanner.nextInt();

        int mayorNumero = encontrarMayor(num1, num2, num3);
        System.out.println("El mayor de los tres números es: " + mayorNumero);

        // Leer un número y determinar si es par o impar
        System.out.print("Ingresa un número para verificar si es par o impar: ");
        int numero = scanner.nextInt();
        System.out.println("El número " + numero + " es " + (esPar(numero) ? "par" : "impar"));

        // Leer dos cadenas y determinar si son iguales
        scanner.nextLine(); // Limpiar buffer
        System.out.print("Ingresa la primera cadena: ");
        String cadena1 = scanner.nextLine();
        System.out.print("Ingresa la segunda cadena: ");
        String cadena2 = scanner.nextLine();
        System.out.println("Las cadenas son " + (cadena1.equals(cadena2) ? "iguales" : "diferentes"));

        // Verificar si un número es primo
        System.out.print("Ingresa un número para verificar si es primo: ");
        int numeroPrimo = scanner.nextInt();
        System.out.println("El número " + numeroPrimo + " es " + (esPrimo(numeroPrimo) ? "primo" : "no primo"));

        // Sumar números impares de una matriz
        int[] matriz = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sumaImpares = sumaNumerosImpares(matriz);
        System.out.println("La suma de los números impares es: " + sumaImpares);

        // Imprimir números pares y sumar números primos de una matriz
        int sumaPrimos = imprimirParesYSumarPrimos(matriz);
        System.out.println("La suma de los números primos es: " + sumaPrimos);

        // Ejecutar la calculadora
        ejecutarCalculadora(scanner);

        // Gestionar ingreso a la bolera
        gestionarBolera(scanner);

        scanner.close();
    }

    // Método que imprime un mensaje de bienvenida
    public static void imprimirBienvenida() {
        System.out.println("¡Bienvenidos a MovieStack!");
    }

    // Método para encontrar el mayor de tres números
    public static int encontrarMayor(int num1, int num2, int num3) {
        int mayor = num1;
        if (num2 > mayor) {
            mayor = num2;
        }
        if (num3 > mayor) {
            mayor = num3;
        }
        return mayor;
    }

    // Método para verificar si un número es par
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    // Método para verificar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }

    // Método para sumar los números impares de una matriz
    public static int sumaNumerosImpares(int[] matriz) {
        int suma = 0;
        for (int num : matriz) {
            if (num % 2 != 0) {
                suma += num;
            }
        }
        return suma;
    }

    // Método para imprimir números pares y sumar números primos de una matriz
    public static int imprimirParesYSumarPrimos(int[] matriz) {
        int sumaPrimos = 0;
        System.out.print("Números pares: ");
        for (int num : matriz) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
            if (esPrimo(num)) {
                sumaPrimos += num;
            }
        }
        System.out.println();
        return sumaPrimos;
    }

    // Método para ejecutar la calculadora
    public static void ejecutarCalculadora(Scanner scanner) {
        int opcion;
        do {
            imprimirMenuCalculadora();
            opcion = scanner.nextInt();
            if (opcion != 0) {
                realizarOperacion(opcion, scanner);
            }
        } while (opcion != 0);
        System.out.println("Saliendo de la calculadora.");
    }

    // Método para imprimir el menú de la calculadora
    public static void imprimirMenuCalculadora() {
        System.out.println("\nCalculadora:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("0. Salir");
        System.out.print("Elige una opción: ");
    }

    // Método para realizar una operación de la calculadora
    public static void realizarOperacion(int opcion, Scanner scanner) {
        System.out.print("Ingresa el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int num2 = scanner.nextInt();
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
                if (num2 != 0) {
                    System.out.println("Resultado: " + (num1 / num2));
                } else {
                    System.out.println("Error: División por cero.");
                }
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }

    // Método para gestionar el ingreso a la bolera
    public static void gestionarBolera(Scanner scanner) {
        int capacidadMaxima = 500;
        int capacidadActual = 0;
        int dineroRecaudado = 0;
        int opcion;

        do {
            imprimirMenuBolera();
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer
            switch (opcion) {
                case 1:
                    if (capacidadActual < capacidadMaxima) {
                        System.out.print("Ingresa tu nombre: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Ingresa tu edad: ");
                        int edad = scanner.nextInt();
                        scanner.nextLine(); // Limpiar buffer
                        System.out.print("Ingresa tu DNI: ");
                        String dni = scanner.nextLine();
                        System.out.print("Ingresa tu contraseña: ");
                        String contrasena = scanner.nextLine();

                        if (edad > 21) {
                            System.out.print("¿Tienes un pase VIP (S/N)? ");
                            String esVip = scanner.nextLine();
                            boolean tieneVip = esVip.equalsIgnoreCase("S");
                            boolean paseDescuento = false;
                            if (!tieneVip) {
                                System.out.print("¿Tienes un pase de descuento (S/N)? ");
                                String esDescuento = scanner.nextLine();
                                paseDescuento = esDescuento.equalsIgnoreCase("S");
                            }

                            if (tieneVip) {
                                System.out.println("Entrada gratuita. ¡Bienvenido " + nombre + "!");
                            } else {
                                System.out.print("¿Deseas entrada normal (N) o VIP (V)? ");
                                String tipoEntrada = scanner.nextLine();
                                int costoEntrada = tipoEntrada.equalsIgnoreCase("V") ? 2000 : 1500;
                                if (paseDescuento) {
                                    costoEntrada /= 2;
                                }
                                dineroRecaudado += costoEntrada;
                                capacidadActual++;
                                System.out.println("Entrada " + (tipoEntrada.equalsIgnoreCase("V") ? "VIP" : "normal") + " pagada. ¡Bienvenido " + nombre + "!");
                            }
                        } else {
                            System.out.println("Lo siento, solo se permite el ingreso a mayores de 21 años.");
                        }
                    } else {
                        System.out.println("Capacidad máxima alcanzada. No se permiten más ingresos.");
                    }
                    break;
                case 2:
                    System.out.println("Capacidad disponible: " + (capacidadMaxima - capacidadActual));
                    break;
                case 3:
                    System.out.println("Dinero recaudado: " + dineroRecaudado);
                    break;
                case 4:
                    System.out.println("Cerrando sesión en el sistema.");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 4);
    }

    // Método para imprimir el menú de la bolera
    public static void imprimirMenuBolera() {
        System.out.println("\nMenú Bolera:");
        System.out.println("1. Entrada de datos");
        System.out.println("2. Capacidad disponible");
        System.out.println("3. Dinero recaudado");
        System.out.println("4. Cerrar sesión");
        System.out.print("Elige una opción: ");
    }
}