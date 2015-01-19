/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Aplicacion.ConexionOracle;
import Datos.Persona;
import Persistencia.ManejaPersona;

/**
 *
 * @author usuario
 */
public class TestManejaPersona {
    public static void main(String[] args) {
        ConexionOracle conn = new ConexionOracle();
        conn.Conexion();
        
        Persona p = new Persona("29621480X", "Cesar", "Enrique", "Ramirez", "722461083", "caenrique93@gmail.com", 21, "Huelva");
        ManejaPersona manejap = new ManejaPersona(conn);
        
        manejap.insertaPersona(p);
        
        conn.Desconexion();
    }
}
