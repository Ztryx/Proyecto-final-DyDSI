package Persistencia;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Aplicacion.ConexionOracle;
import Aplicacion.Fecha;
import Datos.Alimento;
import Datos.Establecimiento;
import Datos.Institucion;
import Datos.Persona;
import Persistencia.ManejaRecoge;
import java.util.Date;
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
        Alimento a = new Alimento(10, "papa cocia", new Date(2015, 4, 1));
        
        mr.registraRecogida(3, 1, a);
        
        Persona p = new Persona();
        Institucion i = new Institucion();
        LinkedList<Alimento> alimentos = new LinkedList<>();
        LinkedList<Establecimiento> establs = new LinkedList<>();
        boolean resultado = mr.productosRecogidos(3, p, i, alimentos, establs);
        if(!resultado) {
            for(int index=0;index<alimentos.size();index++) {
                System.out.println(alimentos.get(index).toString() +" " +  establs.get(index).toString());
            }
        }  else {
        //} else if(p != null) {
            System.out.println(p);
        //} else if(i != null){
            System.out.println(i);
        }
        a = new Alimento(11, "papa cocia", new Date(2015, 4, 1));
        mr.registraRecogida(3, 1, a);
        a = new Alimento(12, "papa cocia", new Date(2015, 4, 1));
        mr.registraRecogida(3, 1, a);
        a = new Alimento(13, "papa cocia", new Date(2015, 4, 1));
        mr.registraRecogida(3, 1, a);
        a = new Alimento(14, "papa cocia", new Date(2015, 4, 1));
        mr.registraRecogida(3, 1, a);
        a = new Alimento(15, "papa cocia", new Date(2015, 4, 1));
        mr.registraRecogida(3, 1, a);
        

        resultado = mr.productosRecogidos(3, p, i, alimentos, establs);
        if(!resultado) {
            for(int index=0;index<alimentos.size();index++) {
                System.out.println(alimentos.get(index).toString() +" " +  establs.get(index).toString());
            }
        }  else {
        //} else if(p != null) {
            System.out.println(p);
        //} else if(i != null){
            System.out.println(i);
        }
        
        conn.Desconexion();
    }
}
