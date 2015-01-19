/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Aplicacion.ConexionOracle;
import Datos.Institucion;
import java.util.LinkedList;

/**
 *
 * @author usuario
 */
public class TestManejaInstitucion {
    public static void main(String[] args) {
        ConexionOracle conn = new ConexionOracle();
        ManejaInstitucion mInst = new ManejaInstitucion(conn);
        conn.Conexion();
        
        // probar cambiaCIF()
        mInst.cambiaCIF("A11111112", "A11111113");
        
        // probar getVoluntario()
        mInst.getVoluntario(1);
        
        // probar getInstituciones()
        LinkedList<Institucion> instituciones = (LinkedList<Institucion>)
                 mInst.getInstituciones();
        
        // probar eliminaIstitucion
        mInst.eliminaInstitucion("A11111113");
        
        conn.Desconexion();
    }
}
