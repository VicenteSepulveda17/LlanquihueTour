package model;

public class Reserva {
    // Representa la reserva de un cliente para un tour con un guía turístico.

    private Cliente cliente;
    private GuiaTuristico guia;
    private Tour tour;

    public Reserva(Cliente cliente, GuiaTuristico guia, Tour tour) {
        this.cliente = cliente;
        this.guia = guia;
        this.tour = tour;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public GuiaTuristico getGuia() {
        return guia;
    }

    public Tour getTour() {
        return tour;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setGuia(GuiaTuristico guia) {
        this.guia = guia;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }

    @Override
    public String toString() {
        return "===== RESERVA =====" +
                "\nCliente: " + cliente.getNombre() +
                "\nGuia: " + guia.getNombre() +
                "\nTour: " + tour.getNombre();
    }
}
