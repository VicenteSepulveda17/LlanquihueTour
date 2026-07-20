# LlanquihueTour

## Descripción

LlanquihueTour es una aplicación desarrollada en Java que permite administrar la información de una agencia de turismo. El sistema registra clientes, guías turísticos, proveedores, tours y reservas, utilizando los principios de la Programación Orientada a Objetos.

Este proyecto fue desarrollado como evaluación final de la asignatura **Desarrollo Orientado a Objetos I**.

---

## Objetivo del proyecto

Implementar una aplicación de consola aplicando los conceptos fundamentales de Programación Orientada a Objetos, como:

- Encapsulamiento.
- Herencia.
- Polimorfismo.
- Colecciones (`ArrayList`).
- Lectura de archivos de texto.
- Manejo de objetos y relaciones entre clases.

---

## Funcionalidades

El sistema permite:

- Registrar clientes.
- Registrar guías turísticos.
- Registrar proveedores.
- Cargar clientes desde un archivo de texto.
- Cargar tours desde un archivo de texto.
- Buscar clientes mediante su RUT.
- Buscar tours por su nombre.
- Crear reservas asociando un cliente, un guía y un tour.
- Mostrar toda la información registrada en consola.

---

## Estructura del proyecto

```
src
│
├── app
│   └── Main.java
│
├── data
│   ├── GestorDatos.java
│   └── GestorReservas.java
│
├── exceptions
│   └── RutInvalidoException.java
│
└── model
    ├── Persona.java
    ├── Cliente.java
    ├── GuiaTuristico.java
    ├── Proveedor.java
    ├── Direccion.java
    ├── Tour.java
    ├── Reserva.java
    └── Registrable.java

resources
├── clientes.txt
└── tours.txt
```

---

## Tecnologías utilizadas

- Java
- IntelliJ IDEA
- Git
- GitHub

---

## Conceptos aplicados

Durante el desarrollo del proyecto se implementaron los siguientes conceptos:

- Clases y objetos.
- Encapsulamiento.
- Herencia.
- Polimorfismo.
- Interfaces.
- Sobrescritura del método `toString()`.
- Manejo de colecciones mediante `ArrayList`.
- Lectura de archivos utilizando `BufferedReader`.
- Organización del proyecto mediante paquetes.
- Manejo básico de excepciones.

---

## Ejecución del programa

Al ejecutar el proyecto, el sistema:

1. Carga los clientes desde el archivo `clientes.txt`.
2. Crea datos de ejemplo para guías y proveedores.
3. Muestra todos los clientes registrados.
4. Muestra los guías turísticos.
5. Muestra los proveedores.
6. Busca un cliente por su RUT.
7. Busca un tour por su nombre.
8. Crea una reserva.
9. Muestra las reservas registradas.

---

## Autor

**Vicente Sepúlveda**

Proyecto desarrollado para la asignatura **Desarrollo Orientado a Objetos I**.
