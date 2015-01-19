/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Aplicacion.ConexionOracle;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author caenrique93
 */
public class ManejaInstitucion extends ManejaTabla {

    public ManejaInstitucion(ConexionOracle conn) {
        super(conn);
    }
    
    public void eliminaInstitucion(String cif) {
        try (Statement stmt = conn.createStatement()) {
            String statement = "delete from INSTITUCION where CIF=" +
                    "'" + cif+ "'";
            stmt.executeUpdate(statement);
            conn.commit();
        } catch (SQLException e) {
            conn.rollBack();
            System.out.println("Error al eliminar de la tabla INSTITUCION");
            System.out.println(e.getMessage());
            System.out.println(e.getSQLState());
            System.out.println(e.getErrorCode());
        }
        int idVoluntario = -1;
        try (Statement stmt = conn.createStatement()) {
            String statement = "select idVoluntario from INSTITUCION where CIF=" 
                    + "'" + cif + "'";
            ResultSet rs = stmt.executeQuery(statement);
            rs.next();
            idVoluntario = rs.getInt("idVoluntario");
        } catch (SQLException e) {
            System.out.println("Error al consultar la tabla INSTITUCION");
            System.out.println(e.getMessage());
            System.out.println(e.getSQLState());
            System.out.println(e.getErrorCode());
        }
        
        ManejaVoluntario mVol = new ManejaVoluntario(conn);
        mVol.eliminaVoluntario(idVoluntario);
    }
    
    public void cambiaCIF(String cif_actual, String cif_nuevo) {
        try (Statement stmt = conn.createStatement()) {
            String statement = "update INSTITUCION set CIF='" +
                    cif_nuevo + "' where CIF='" + cif_actual + "'";
            stmt.executeUpdate(statement);
            conn.commit();
        } catch (SQLException e) {
            conn.rollBack();
            System.out.println("Error al eliminar de la tabla INSTITUCION");
            System.out.println(e.getMessage());
            System.out.println(e.getSQLState());
            System.out.println(e.getErrorCode());
        }
    }
}
