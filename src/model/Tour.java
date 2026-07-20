package model;

public class Tour {
    // Representa un tour disponible ofrecido por la agencia.

    private String nombre;
    private String destino;
    private String tipo;
    private double precio;
    private int cupos;

    public Tour(String nombre, String destino, String tipo, double precio, int cupos) {

        this.nombre = nombre;
        this.destino = destino;
        this.tipo = tipo;
        this.precio = precio;
        this.cupos = cupos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDestino() {
        return destino;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCupos() {
        return cupos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCupos(int cupos) {
        this.cupos = cupos;
    }

    @Override
    public String toString() {
        return "===== TOUR =====" +
                "\nNombre: " + nombre +
                "\nDestino: " + destino +
                "\nTipo: " + tipo +
                "\nPrecio: $" + (int) precio +
                "\nCupos disponibles: " + cupos;
    }
}
