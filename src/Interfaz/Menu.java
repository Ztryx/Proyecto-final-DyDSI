/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Datos.Persona;

/**
 *
 * @author caenrique93
 */
public class Menu {

    public static int principal() {
        System.out.println("### MENU ###");
        System.out.println("1. Insertar Voluntario (Persona)");
        System.out.println("2. Insertar Voluntario (Institución)");
        System.out.println("3. Obtener listado de alimentos recogidos entre"
                + " dos fechas en un establecimiento");
        System.out.println("4. Insertar la información de la recogida de un "
                + "alimento por parte de un voluntario en "
                + "un determinado establecimiento");
        System.out.println("5. Actualizar el CIF de una institución ");
        System.out.println("6. Mostrar y eliminar alimentos caducados");
        System.out.println("7. Mostrar el número total de productos recogidos"
                + " por un voluntario");
        System.out.println("0. Salir");
        int eleccion = -1;
        do {
            if (eleccion != -1) {
                System.out.println("Opcion incorrecta.");
            }
            System.out.println("Opción: ");
            eleccion = Teclado.readInt();
        } while (eleccion < 0 || eleccion > 7);
        return eleccion;
    }

    public static Persona insertaPersona() {
        Persona persona = new Persona();
//    private int idVoluntario;
//    private String dni;
        String dni = null;
        do {
            if (dni != null) {
                System.out.println("DNI Incorrecto");
            }
            System.out.println("Introduzca DNI (con letra en mayuscula): ");
            dni = Teclado.readString();
        } while (!dni.matches("(\\d{8})([A-Z]{1})"));
        persona.setDni(dni);
//    private String nombre;
        String nombre = null;
        do {
            if (nombre != null) {
                System.out.println("El nombre no puede estar vacío.");
            }
            System.out.println("Introduzca nombre: ");
            nombre = Teclado.readString();
        } while (nombre.isEmpty());
        persona.setNombre(nombre);
//    private String apellido1;
        String apellido1 = null;
        do {
            if (apellido1 != null) {
                System.out.println("El apellido no puede estar vacío.");
            }
            System.out.println("Introduzca primer apellido: ");
            apellido1 = Teclado.readString();
        } while (apellido1.isEmpty());
        persona.setApellido1(apellido1);
//    private String apellido2;
        String apellido2 = null;
        do {
            if (apellido2 != null) {
                System.out.println("El apellido no puede estar vacío.");
            }
            System.out.println("Introduzca segundo apellido: ");
            apellido2 = Teclado.readString();
        } while (apellido2.isEmpty());
        persona.setApellido2(apellido2);
//    private String tlf;
        String telefono = null;
        do {
            if (telefono != null) {
                System.out.println("El teléfono no es correcto");
            }
            System.out.println("Introduzca telefono: ");
            telefono = Teclado.readString();
        } while (!telefono.matches("(\\d{9})"));
        persona.setTlf(telefono);
//    private String email;
        String email = null;
        do {
            if (email != null) {
                System.out.println("El email es incorrecto.");
            }
            System.out.println("Introduzca email: ");
            email = Teclado.readString();
        } while (!email.matches("([_a-z0-9-]+(\\.[_a-z0-9-]+)*@[a-z0-9-]+(\\.[a-z0-9-]+)*(\\.[a-z]{2,3}))"));
        persona.setEmail(email);
        //    private int edad;
        int edad = Integer.MIN_VALUE;
        do {
            if (edad != Integer.MIN_VALUE) 
                System.out.println("Edad incorrecta.");
            System.out.println("Introduzca edad: ");
            edad = Teclado.readInt();
        } while (edad <= 0);
        persona.setEdad(edad);
        //    private String localidad;
        String localidad = null;
        do {
            if (localidad != null) {
                System.out.println("La localidad no puede estar vacía.");
            }
            System.out.println("Introduzca localidad: ");
            localidad = Teclado.readString();
        } while (localidad.isEmpty());
        persona.setLocalidad(localidad);
        
        System.out.println(persona);
        return persona;
    }
}
