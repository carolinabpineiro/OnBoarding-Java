package day_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

//        // Leer el nombre del usuario
//        System.out.print("Por favor, ingresa tu nombre: ");
//        String nombre = scanner.nextLine();
//
//        // Leer el apellido del usuario
//        System.out.print("Por favor, ingresa tu apellido: ");
//        String apellido = scanner.nextLine();
//
//        // Leer la edad del usuario
//        System.out.print("Por favor, ingresa tu edad: ");
//        int edad = scanner.nextInt();
//        scanner.nextLine(); // Consumir la nueva línea
//
//        // Imprimir los datos en una oración
//        System.out.println("Hola, " + nombre + " " + apellido + ". Tienes " + edad + " años.");
//
//        // Imprimir un mensaje de bienvenida
//        imprimirMensajeBienvenida();
//
//        // Leer tres números del usuario
//        System.out.println("Ingrese el primer número:");
//        int numero1 = scanner.nextInt();
//
//        System.out.println("Ingrese el segundo número:");
//        int numero2 = scanner.nextInt();
//
//        System.out.println("Ingrese el tercer número:");
//        int numero3 = scanner.nextInt();
//
//        // Determinar el número mayor
//        int mayor = numero1;
//
//        if (numero2 > mayor) {
//            mayor = numero2;
//        }
//
//        if (numero3 > mayor) {
//            mayor = numero3;
//        }
//
//        // Imprimir el número mayor
//        System.out.println("El número mayor es: " + mayor);
//
//        // Solicitar al usuario que ingrese un número para verificar si es par o impar
//        System.out.print("Ingresa un número entero para verificar si es par o impar: ");
//        int numero = scanner.nextInt();
//
//        // Llamar al método que determina si el número es par o impar
//        determinarParImpar(numero);

        // Leer la primera cadena del usuario
        System.out.print("Ingresa la primera cadena de caracteres: ");
        String cadena1 = scanner.nextLine();

        // Leer la segunda cadena del usuario
        System.out.print("Ingresa la segunda cadena de caracteres: ");
        String cadena2 = scanner.nextLine();

        // Comparar las cadenas e imprimir el resultado
        if (cadena1.equals(cadena2)) {
            System.out.println("Las cadenas son iguales.");
        } else {
            System.out.println("Las cadenas son diferentes.");
        }
        // Cerrar el objeto Scanner
        scanner.close();
    }

    // Método que imprime un mensaje de bienvenida en la consola
    public static void imprimirMensajeBienvenida() {
        System.out.println("¡Bienvenido a nuestro programa!");
    }

    // Método que determina si un número es par o impar
    public static void determinarParImpar(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " es un número par.");
        } else {
            System.out.println(num + " es un número impar.");
        }
    }

}


