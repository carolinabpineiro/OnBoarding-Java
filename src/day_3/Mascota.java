package day_3;

public class Mascota {
    // Propiedades
    private String nombre;
    private TipoMascota tipo;
    private int edad;
    private Persona propietario; // La referencia a la clase Persona

    // Constructor parametrizado
    public Mascota(String nombre, TipoMascota tipo, int edad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.edad = edad;
        this.propietario = null; // Inicialmente sin propietario
    }

    // Métodos accesorios (getters y setters)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoMascota getTipo() {
        return tipo;
    }

    public void setTipo(TipoMascota tipo) {
        this.tipo = tipo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Persona getPropietario() {
        return propietario;
    }

    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }

    // Método para presentar la información de la mascota
    public void presentar() {

        System.out.println( nombre + " es un/a " + tipo.tolowerCase() + " y tiene  " + edad +  " año/s");

    }
}