package day_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        // Leer el nombre del usuario
        System.out.print("Por favor, ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        // Leer el apellido del usuario
        System.out.print("Por favor, ingresa tu apellido: ");
        String apellido = scanner.nextLine();

        // Leer la edad del usuario
        System.out.print("Por favor, ingresa tu edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        // Imprimir los datos en una oración
        System.out.println("Hola, " + nombre + " " + apellido + ". Tienes " + edad + " años.");

        // Cerrar el objeto Scanner
        scanner.close();
    }
}