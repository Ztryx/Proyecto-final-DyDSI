package Aplicacion;

import Interfaz.Menu;




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
                            Menu.insertaPersona();
                            break;
                        case 2:
                            break;
                        case 3:
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
