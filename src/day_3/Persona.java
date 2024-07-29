package day_3;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    // Propiedades
    private String nombre;
    private String apellido;
    private String dni;
    private int edad;
    private double altura;
    private boolean casado;
    private List<Mascota> mascotas; // Colección de mascotas

    // Constructor parametrizado
    public Persona(String nombre, String apellido, String dni, int edad, double altura, boolean casado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.altura = altura;
        this.casado = casado;
        this.mascotas = new ArrayList<>(); // Inicializa la lista de mascotas
    }

    // Métodos accesorios (getters y setters)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public List<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(List<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    // Método para añadir una mascota a la persona
    public void agregarMascota(Mascota mascota) {
        mascotas.add(mascota);
        mascota.setPropietario(this); // Establece el propietario de la mascota
    }

    // Método para presentar la información de la persona
    public void presentar() {
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("DNI: " + dni);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Estado civil: " + (casado ? "Casado/a" : "Soltero/a"));
        System.out.print("Mascotas: ");
        if (!mascotas.isEmpty()) {
            for (int i = 0; i < mascotas.size(); i++) {
                mascotas.get(i).presentar();
                if (i < mascotas.size() - 1) {
                    System.out.println(); // Línea en blanco para separar mascotas
                }
            }
        } else {
            System.out.print("No tiene mascotas");
        }
        System.out.println();
    }

    // Método para presentarse
    public void presentarse() {
        System.out.println("Hola, soy " + nombre + " " + apellido + ". Tengo " + edad + " años, mido " + altura + " metros, y estoy " + (casado ? "casado/a" : "soltero/a") + ".");
        if (!mascotas.isEmpty()) {
            System.out.print("Mis mascotas se llaman: ");
            for (int i = 0; i < mascotas.size(); i++) {
                System.out.print(mascotas.get(i).getNombre());
                if (i < mascotas.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println(".");
        } else {
            System.out.println("No tengo mascotas.");
        }
    }
}
