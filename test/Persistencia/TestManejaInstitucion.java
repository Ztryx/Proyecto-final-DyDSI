/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Aplicacion.ConexionOracle;

/**
 *
 * @author usuario
 */
public class TestManejaInstitucion {
    public static void main(String[] args) {
        ConexionOracle conn = new ConexionOracle();
        ManejaInstitucion mInst = new ManejaInstitucion(conn);
        conn.Conexion();
        mInst.eliminaInstitucion("A11111111");
        
        mInst.cambiaCIF("A11111112", "A11111113");
        
        conn.Desconexion();
    }
}
