package day_2;

public class Main {
    public static void main(String[] args) {
        // Crear un arreglo de nombres de mascotas para el primer objeto
        String[] mascotas1 = {"Freya", "Moana"};
        Persona persona1 = new Persona("Thomas", "Maldonado", "55425514", 8, 1.60, false, mascotas1);

        // Crear un arreglo de nombres de mascotas para el segundo objeto
        String[] mascotas2 = {};
        Persona persona2 = new Persona("Ana", "Gómez", "33554887", 35, 1.65,  true, mascotas2);

        // Presentar información de las personas
        persona1.presentar();
//        persona1.presentarse();

        System.out.println(); // Línea en blanco para separar las salidas

        persona2.presentar();
//        persona2.presentarse();
    }
}
