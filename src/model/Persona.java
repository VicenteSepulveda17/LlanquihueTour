package model;

public class Persona {
    // Clase base que representa a todas las personas del sistema.

    private Direccion direccion;
    private String nombre;
    private String rut;
    private String telefono;

    public Persona(Direccion direccion, String nombre, String rut, String telefono) {
        this.direccion = direccion;
        this.nombre = nombre;
        this.rut = rut;
        this.telefono = telefono;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRut() {
        return rut;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                "\nRut: " + rut +
                "\nTeléfono: " + telefono +
                "\nDirección: " + direccion;
    }
}
