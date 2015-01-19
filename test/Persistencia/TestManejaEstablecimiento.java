/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Aplicacion.ConexionOracle;
import Datos.Establecimiento;
import java.util.LinkedList;

/**
 *
 * @author caenrique93
 */
public class TestManejaEstablecimiento {
    
    public static void main(String[] args) {
        ConexionOracle conn = new ConexionOracle();
        conn.Conexion();
        ManejaEstablecimiento mEst = new ManejaEstablecimiento(conn);
        
        // prueba generarClave()
        int clave = mEst.generarClave();
        Establecimiento establecimiento = new Establecimiento(clave, 
                "pepito inc.", 
                "calle puerto", 
                "archidona");
        
        // prueba insertarEstablecimiento()
        mEst.insertarEstablecimiento(establecimiento);
        
        // prueba getEstablecimiento()
        Establecimiento est2 = mEst.getEstablecimiento(clave);
        
        // prueba getEstablecimientos()
        LinkedList<Establecimiento> ests = (LinkedList<Establecimiento>) 
                mEst.getEstablecimientos();
    }
}
