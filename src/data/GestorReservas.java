package data;

import model.GuiaTuristico;
import model.Reserva;
import model.Tour;
import model.Cliente;
import java.util.ArrayList;

public class GestorReservas {
    // Gestiona el registro y la visualización de las reservas.

    private ArrayList<Reserva> listaReservas;

    public GestorReservas() {
        listaReservas = new ArrayList<>();
    }
    public ArrayList<Reserva> getListaReservas() {
        return listaReservas;
    }

    public void agregarReserva(Reserva reserva){
        listaReservas.add(reserva);
    }
    public void mostrarReservas(){
        System.out.println("\n==== RESERVAS ====");

        for (Reserva reserva : listaReservas){
            System.out.println(reserva);
            System.out.println("--------------------------");
        }
    }

    // Crea una nueva reserva y la agrega a la lista.
    public void crearReserva(Cliente cliente, GuiaTuristico guia, Tour tour){

        Reserva reserva = new Reserva(cliente,guia,tour);

        agregarReserva(reserva);

        System.out.println("\n¡Reserva creada correctamente!");
    }
}
