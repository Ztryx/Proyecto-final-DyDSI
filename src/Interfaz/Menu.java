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
//    private String nombre;
        String nombre = null;
        do {
            if (nombre != null) 
                System.out.println("El nombre no puede estar vacío.");
            System.out.println("Introduzca nombre: ");
            nombre = Teclado.readString();
        } while (nombre.isEmpty());
//    private String apellido1;
//    private String apellido2;
//    private String tlf;
//    private String email;
//    private int edad;
//    private String localidad;
        return persona;
    }
}
