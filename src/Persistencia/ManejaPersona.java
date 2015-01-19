/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Aplicacion.ConexionOracle;
import Datos.Persona;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author caenrique93
 */
public class ManejaPersona extends ManejaTabla {

    public ManejaPersona(ConexionOracle conn) {
        super(conn);
    }
    
    public void insertaPersona(Persona p) {
        try (Statement stmt = conn.createStatement()) {
            String statement = "insert into PERSONA values (" +
                    "'" + p.getDni() + "'," +
                    "'" + p.getNombre() + "'," +
                    "'" + p.getApellido1() + "'," +
                    "'" + p.getApellido2() + "'," +
                    "'" + p.getTlf() + "'," +
                    "'" + p.getEmail() + "'," +
                    "'" + p.getLocalidad() + "')";
            stmt.executeQuery(statement);
        } catch (SQLException e) {
            System.out.println("Error al insertar en la tabla PERSONA");
            System.out.println(e.getMessage());
            System.out.println(e.getSQLState());
            System.out.println(e.getErrorCode());
        }
        try (Statement stmt = conn.createStatement()) {
            String statement = 
                    "insert into VOLUNTARIO values (" + p.getDni() + "')";
            stmt.executeQuery(statement);
        } catch (SQLException e) {
            System.out.println("Error al insertar en la tabla VOLUNTARIO");
            System.out.println(e.getMessage());
            System.out.println(e.getSQLState());
            System.out.println(e.getErrorCode());
        }
    }
    
    public Persona getVoluntario(int idVoluntario) {
        Persona persona = null;
        try(Statement stmt = conn.createStatement()) {
            String statement = "select * from PERSONA "
                    + "where idVoluntario='" + idVoluntario + "'";
            ResultSet rs = stmt.executeQuery(statement);
            rs.next();
            persona = new Persona(rs.getString("dni"),
                    rs.getString("nombre"), 
                    rs.getString("apellido1"),
                    rs.getString("apellido2"),
                    rs.getString("telefono"),
                    rs.getString("email"),
                    rs.getInt("edad"),
                    rs.getString("localidad"),
                    idVoluntario);
        } catch (Exception e) {
        }
        return persona;
    }
    
    public boolean existeVoluntario(int idVoluntario) {
        int cuenta = -1;
        try(Statement stmt = conn.createStatement()) {
            String statement = "select count(*) "
                        + "from PERSONA "
                        + "where idVoluntario='" + idVoluntario + "'";
            ResultSet rs = stmt.executeQuery(statement);
            rs.next();
            cuenta = rs.getInt(1);
        } catch (SQLException ex) {
            System.out.println("Error al consultar la tabla PERSONA");
            System.out.println(ex.getMessage());
            System.out.println(ex.getSQLState());
            System.out.println(ex.getErrorCode());
        }
        return cuenta==1;
    }
    
    public int generarClave() {
        ManejaVoluntario mVol = new ManejaVoluntario(conn);
        return mVol.generarClave();
    }
}
