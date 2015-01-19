package Aplicacion;

import Interfaz.Principal;


public class Aplicacion_Cliente {
	public static void main(String[] args) {
		ConexionOracle conexion = new ConexionOracle();
		System.out.println("conectando...");
		conexion.Conexion();
		System.out.println("conectado !!");
                
                Principal ventana = new Principal("titulo de la ventana");
                ventana.setVisible(true);
                
		conexion.Desconexion();
	}
}
