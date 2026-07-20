import data.GestorDatos;
import data.GestorReservas;
import model.Cliente;
import model.Direccion;
import model.GuiaTuristico;
import model.Tour;

// Punto de inicio del sistema.
// Permite cargar datos y demostrar las funcionalidades principales.
void main(String[] args) {

        // Crear gestor de datos
        GestorDatos gestor = new GestorDatos();

        // Cargar clientes desde archivo
        gestor.iniciarSistema();

        // Mostrar información cargada
        gestor.mostrarClientes();
        gestor.mostrarGuias();
        gestor.mostrarProveedores();

        // Buscar un cliente
        Cliente cliente = gestor.buscarClientePorRut("12.345.678-8");

        if (cliente != null) {
            System.out.println("\n¡¡CLIENTE ENCONTRADO!!");
            System.out.println(cliente);
        } else {
            System.out.println("Cliente no encontrado.");
        }

        // Buscar un tour
        Tour tour = gestor.buscarTourPorNombre("Tour Volcán Osorno");

        if (tour != null) {
            System.out.println("\n¡¡TOUR ENCONTRADO!!");
            System.out.println(tour);
        } else {
            System.out.println("Tour no encontrado.");
        }

        // Crear un guía de prueba
        Direccion direccion = new Direccion(
                "Av. Costanera",
                "Llanquihue",
                123
        );

        GuiaTuristico guia = new GuiaTuristico(
                direccion,
                "Pedro González",
                "11.222.333-4",
                "+56987654321",
                "Turismo Aventura",
                8
        );

        // Crear gestor de reservas
        GestorReservas gestorReservas = new GestorReservas();

        // Crear una reserva
        gestorReservas.crearReserva(cliente, guia, tour);

        // Mostrar reservas
        gestorReservas.mostrarReservas();

    }

