package model;

public class GuiaTuristico extends Persona implements Registrable{
    // Representa a un guía turístico disponible para realizar tours.

    private String especialidad;
    private int aniosexperiencia;

    public GuiaTuristico(Direccion direccion, String nombre, String rut, String telefono, String especialidad, int aniosexperiencia) {
        super(direccion, nombre, rut, telefono);
        this.especialidad = especialidad;
        this.aniosexperiencia = aniosexperiencia;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public int getAniosexperiencia() {
        return aniosexperiencia;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setAniosexperiencia(int aniosexperiencia) {
        this.aniosexperiencia = aniosexperiencia;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nEspecialidad: '" + especialidad +
                "\nAños de experiencia: " + aniosexperiencia;
    }

    @Override
    public void mostrarDatos(){
        System.out.println("===== GUÍA TURÍSTICO =====");
        System.out.println(toString());
    }
}
