package day_3;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de Mascota
        Mascota mascota1 = new Mascota("Rex", TipoMascota.PERRO, 3);
        Mascota mascota2 = new Mascota("Luna", TipoMascota.GATO, 2);

        // Crear instancias de Persona
        Persona persona1 = new Persona("Juan", "Pérez", "12345678-9", 30, 1.75, false);
        Persona persona2 = new Persona("Maria", "Garcia", "98765432-1", 25, 1.60, true);

        // Agregar mascotas a las personas
        persona1.agregarMascota(mascota1);
        persona1.agregarMascota(mascota2);
        persona2.agregarMascota(new Mascota("Coco", TipoMascota.PÁJARO, 1));

        // Presentar información de las personas
        persona1.presentar();
//        persona1.presentarse();

        System.out.println(); // Línea en blanco para separar las salidas

        persona2.presentar();
//        persona2.presentarse();
    }
}