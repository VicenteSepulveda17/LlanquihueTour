package data;

import model.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class GestorDatos {
//Clase encargada de gestionar la carga, búsqueda y visualización de los datos utilizados por el sistema.

    // Lista que almacena todos los objetos registrables del sistema.
    private ArrayList<Registrable> listaRegistros;

    public GestorDatos() {
        listaRegistros = new ArrayList<>();
    }

    public ArrayList<Registrable> getListaRegistros() {
        return listaRegistros;
    }

    //Agrega un nuevo registro a la colección.
    public void agregarRegistro(Registrable registro) {
        listaRegistros.add(registro);
    }

    public void mostrarRegistros() {

        for (Registrable registro : listaRegistros) {
            registro.mostrarDatos();
            System.out.println("------------------------");
        }
    }

    public void crearDatosPrueba() {

        Direccion direccion = new Direccion(
                "Av. Costanera",
                "Llanquihue",
                123
        );

        Cliente cliente = new Cliente(
                direccion,
                "Vicente Sepúlveda",
                "12.345.678-8",
                "+569 1234 5678",
                "vicente@gmail.com"
        );

        GuiaTuristico guia = new GuiaTuristico(
                direccion,
                "Pedro González",
                "11.222.333-4",
                "+569 8765 4321",
                "Turismo Aventura",
                8

        );

        Proveedor proveedor = new Proveedor(
                direccion,
                "Transportes Llanquihue",
                "76.123.456-7",
                "+569 4444 5555",
                "Llanquihue Tours",
                "Transporte"
        );

        agregarRegistro(guia);
        agregarRegistro(proveedor);
    }
    //Lee el archivo clientes.txt y crea los objetos Cliente.
    public void cargarClientes() {

        try {

            BufferedReader lector = new BufferedReader(
                    new FileReader("resources/clientes.txt")
            );

            String linea;

            while ((linea = lector.readLine()) != null) {

                String[] datos = linea.split(";");

                Direccion direccion = new Direccion(
                        datos[4],
                        datos[5],
                        Integer.parseInt(datos[6])
                );

                Cliente cliente = new Cliente(
                        direccion,
                        datos[0],
                        datos[1],
                        datos[2],
                        datos[3]
                );

                agregarRegistro(cliente);

            }

            lector.close();

        } catch (IOException e) {
            System.out.println("Error al leer clientes.txt");
        }
    }
    // Lee el archivo tours.txt y almacena los tours en una colección.
    public ArrayList<Tour> cargarTours() {

        ArrayList<Tour> listaTours = new ArrayList<>();

        try {

            BufferedReader lector = new BufferedReader(
                    new FileReader("resources/tours.txt")
            );

            String linea;

            while ((linea = lector.readLine()) != null) {

                String[] datos = linea.split(";");

                Tour tour = new Tour(
                        datos[0],
                        datos[1],
                        datos[2],
                        Double.parseDouble(datos[3]),
                        Integer.parseInt(datos[4])
                );

                listaTours.add(tour);

            }

            lector.close();

        } catch (IOException e) {
            System.out.println("Error al leer tours.txt");
        }

        return listaTours;
    }

    public void mostrarClientes() {
        System.out.println("\n===== CLIENTES =====");

        for (Registrable registro : listaRegistros) {

            if (registro instanceof Cliente) {
                System.out.println(registro);
                System.out.println("------------------------");
            }
        }
    }

    public void mostrarGuias() {

        System.out.println("\n===== GUÍAS =====");

        for (Registrable registro : listaRegistros) {

            if (registro instanceof GuiaTuristico) {
                System.out.println(registro);
                System.out.println("----------------------------");
            }
        }
    }

    public void mostrarProveedores() {

        System.out.println("\n===== PROVEEDORES =====");

        for (Registrable registro : listaRegistros) {

            if (registro instanceof Proveedor) {
                System.out.println(registro);
                System.out.println("-------------------------");
            }
        }
    }

    public void iniciarSistema() {
        cargarClientes();
        crearDatosPrueba();

    }
    // Busca un cliente utilizando su RUT.
    public Cliente buscarClientePorRut(String rutBuscado) {
        for (Registrable registro : listaRegistros) {

            if (registro instanceof Cliente) {

                Cliente cliente = (Cliente) registro;

                if (cliente.getRut().equalsIgnoreCase(rutBuscado)) {
                    return cliente;
                }
            }
        }


        return null;


    }

    public Tour buscarTourPorNombre(String nombreBuscado) {

        ArrayList<Tour> listaTours = cargarTours();

        for (Tour tour : listaTours) {

            if (tour.getNombre().equalsIgnoreCase(nombreBuscado)) {
                return tour;
            }
        }

        return null;

    }
}