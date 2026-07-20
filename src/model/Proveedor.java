package model;

public class Proveedor extends Persona implements Registrable{
    // Representa a un proveedor de servicios asociado a la agencia.

    private String empresa;
    private String servicio;

    public Proveedor(Direccion direccion, String nombre, String rut, String telefono, String empresa, String servicio) {
        super(direccion, nombre, rut, telefono);
        this.empresa = empresa;
        this.servicio = servicio;
    }

    public String getEmpresa() {
        return empresa;
    }

    public String getServicio() {
        return servicio;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nEmpresa: " + empresa +
                "\nServicio: " + servicio;
    }

    @Override
    public void mostrarDatos(){
        System.out.println("===== PROVEEDOR =====");
        System.out.println(toString());
    }
}
