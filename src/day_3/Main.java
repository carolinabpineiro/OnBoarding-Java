package day_3;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de Mascota
        Mascota mascota1 = new Mascota("Fido", TipoMascota.PERRO, 4);
        Mascota mascota2 = new Mascota("Miau", TipoMascota.GATO, 2);

        // Crear instancias de Persona
        Persona persona1 = new Persona("Juan", "Pérez", "12345678A", 30, 1.80, true);
        Persona persona2 = new Persona("Ana", "Gómez", "87654321B", 25, 1.65, false);

        // Agregar mascotas a las personas
        persona1.agregarMascota(mascota1);
        persona1.agregarMascota(mascota2);
        persona2.agregarMascota(new Mascota("Peque", TipoMascota.PÁJARO, 1));

        // Presentar información de las personas
        persona1.presentar();
        persona1.presentarse();

        System.out.println(); // Línea en blanco para separar las salidas

        persona2.presentar();
        persona2.presentarse();
    }
}