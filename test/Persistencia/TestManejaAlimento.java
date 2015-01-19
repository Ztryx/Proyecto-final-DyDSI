/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Aplicacion.ConexionOracle;
import Datos.Alimento;
import java.util.LinkedList;

/**
 *
 * @author caenrique93
 */
public class TestManejaAlimento {
    public static void main(String[] args) {
        ConexionOracle conn = new ConexionOracle();
        conn.Conexion();
        
        ManejaAlimento mAlim = new ManejaAlimento(conn);
        LinkedList<Alimento> caducados = 
                (LinkedList<Alimento>) mAlim.alimentosCaducados();
        for(Alimento a : caducados) {
            System.out.println(a.toString());
        }
        conn.Desconexion();
    }
}
