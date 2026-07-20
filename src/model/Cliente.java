package model;



public class Cliente extends Persona implements Registrable{
    // Representa a un cliente registrado en la agencia.

    private String correo;

    public Cliente(Direccion direccion, String nombre, String rut, String telefono, String correo) {
        super(direccion, nombre, rut, telefono);
        this.correo = correo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return super.toString()+
              "\nCorreo " + correo;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("===== CLIENTE =====");
        System.out.println(toString());
    }

}
