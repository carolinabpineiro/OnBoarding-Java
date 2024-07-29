package day_2;

public class Main {
    public static void main(String[] args) {
        // Crear un arreglo de nombres de mascotas para el primer objeto
        String[] mascotas1 = {"Fido", "Rex"};
        Persona persona1 = new Persona("Juan", "Pérez", "12345678A", 30, 1.80, true, mascotas1);

        // Crear un arreglo de nombres de mascotas para el segundo objeto
        String[] mascotas2 = {};
        Persona persona2 = new Persona("Ana", "Gómez", "87654321B", 25, 1.65, false, mascotas2);

        // Presentar información de las personas
        persona1.presentar();
        persona1.presentarse();

        System.out.println(); // Línea en blanco para separar las salidas

        persona2.presentar();
        persona2.presentarse();
    }
}
