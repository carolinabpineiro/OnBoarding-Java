package day_2;

public class Persona {
    // Propiedades
    private String nombre;
    private String apellido;
    private String dni;
    private int edad;
    private double altura;
    private boolean casado;
    private String[] nombresMascotas;

    // Constructor parametrizado
    public Persona(String nombre, String apellido, String dni, int edad, double altura, boolean casado, String[] nombresMascotas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.altura = altura;
        this.casado = casado;
        this.nombresMascotas = nombresMascotas;
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

    public String[] getNombresMascotas() {
        return nombresMascotas;
    }

    public void setNombresMascotas(String[] nombresMascotas) {
        this.nombresMascotas = nombresMascotas;
    }

    // Método para presentar la información de la persona
    public void presentar() {
        System.out.println("Hola! mi nombre es " + nombre +" "+ apellido);
        System.out.println("Tengo " + edad + " años y mido " + altura + " metros de altura.");
        if (casado) {
            System.out.println("Estoy casado/a");
        } else {
            System.out.println("No estoy casado/a");
        }

        System.out.println("Mi DNI es: " + dni);
        System.out.print("Mascotas: ");
        if (nombresMascotas.length > 0) {
            for (int i = 0; i < nombresMascotas.length; i++) {
                System.out.print(nombresMascotas[i]);
                if (i < nombresMascotas.length - 1) {
                    System.out.print(", ");
                }
            }
        } else {
            System.out.print("No tiene mascotas");
        }
        System.out.println();
    }

//    // Método para introducirse
//    public void presentarse() {
//        System.out.println("Hola, soy " + nombre + " " + apellido + ". Tengo " + edad + " años, mido " + altura + " metros, y estoy " + (casado ? "casado/a" : "soltero/a") + ".");
//        if (nombresMascotas.length > 0) {
//            System.out.print("Mis mascotas se llaman: ");
//            for (int i = 0; i < nombresMascotas.length; i++) {
//                System.out.print(nombresMascotas[i]);
//                if (i < nombresMascotas.length - 1) {
//                    System.out.print(", ");
//                }
//            }
//            System.out.println(".");
//        } else {
//            System.out.println("No tengo mascotas.");
//        }
//    }
}
