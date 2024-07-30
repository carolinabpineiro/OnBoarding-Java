package day_3;

public enum TipoMascota {
    PERRO,
    GATO,
    PÁJARO,
    PECES,
    OTROS;

    public String tolowerCase() {
        return name().toLowerCase();
    }
}
