package Aplicacion;

import Interfaz.Menu;
import Persistencia.ManejaAlimento;
import Persistencia.ManejaEstablecimiento;
import Persistencia.ManejaInstitucion;
import Persistencia.ManejaPersona;
import Persistencia.ManejaRecoge;

public class Aplicacion_Cliente {

    public static void main(String[] args) {
        ConexionOracle conexion = new ConexionOracle();
        System.out.println("conectando...");
        conexion.Conexion();
        System.out.println("conectado !!");

        int opcion;
        do {
            opcion = Menu.principal();
            switch (opcion) {
                case 1:
                    ManejaPersona mPersona = new ManejaPersona(conexion);
                    mPersona.insertaPersona(Menu.insertaPersona());
                    break;
                case 2:
                    Menu.eliminaInstitucion(new ManejaInstitucion(conexion));
                    break;
                case 3:
                    ManejaEstablecimiento mEstablecimiento = new ManejaEstablecimiento(conexion);
                    ManejaRecoge mRecoge = new ManejaRecoge(conexion);
                    Menu.alimentosRecogidos(mEstablecimiento, mRecoge);
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                default:
                    System.out.println("¡Adios!");
            }

        } while (opcion != 0);



        conexion.Desconexion();
    }
}
