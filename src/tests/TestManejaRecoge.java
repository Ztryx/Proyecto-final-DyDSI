/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import Aplicacion.ConexionOracle;
import Datos.Alimento;
import Datos.Establecimiento;
import Datos.Institucion;
import Datos.Persona;
import Persistencia.ManejaRecoge;
import java.sql.Date;
import java.util.LinkedList;

/**
 *
 * @author caenrique93
 */
public class TestManejaRecoge {
    public static void main(String args[]) {
        ConexionOracle conn = new ConexionOracle();
        conn.Conexion();
        ManejaRecoge mr = new ManejaRecoge(conn);
        Alimento a = new Alimento(1, "papa cocia", new Date(2015, 4, 1));
        mr.registraRecogida(1, 1, a);
        
        Persona p = null;
        Institucion i = null;
        LinkedList<Alimento> alimentos = new LinkedList<>();
        LinkedList<Establecimiento> establs = new LinkedList<>();
        mr.productosRecogidos(1, p, i, alimentos, establs);
        
        a = new Alimento(2, "papa cocia", new Date(2015, 4, 1));
        mr.registraRecogida(1, 1, a);
        a = new Alimento(3, "papa cocia", new Date(2015, 4, 1));
        mr.registraRecogida(1, 1, a);
        a = new Alimento(4, "papa cocia", new Date(2015, 4, 1));
        mr.registraRecogida(1, 1, a);
        a = new Alimento(5, "papa cocia", new Date(2015, 4, 1));
        mr.registraRecogida(1, 1, a);
        a = new Alimento(6, "papa cocia", new Date(2015, 4, 1));
        mr.registraRecogida(1, 1, a);
        
        mr.productosRecogidos(1, p, i, alimentos, establs);
        

        conn.Desconexion();
    }
}
