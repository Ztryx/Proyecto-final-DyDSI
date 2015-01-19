/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Aplicacion.ConexionOracle;
import Datos.Institucion;
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
    
    public void eliminaInstitucion(Institucion i) {
        try (Statement stmt = conn.createStatement()) {
            String statement = "delete from INSTITUCION where CIF=" +
                    "'" + i.getCIF()+ "'";
            stmt.executeUpdate(statement);
        } catch (SQLException e) {
            System.out.println("Error al eliminar de la tabla INSTITUCION");
            System.out.println(e.getMessage());
            System.out.println(e.getSQLState());
            System.out.println(e.getErrorCode());
        }
        try (Statement stmt = conn.createStatement()) {
            String statement = "delete from VOLUNTARIO where id=" +
                    "'" + i.getCIF()+ "'";
            stmt.executeUpdate(statement);
        } catch (SQLException e) {
            System.out.println("Error al eliminar de la tabla VOLUNTARIO");
            System.out.println(e.getMessage());
            System.out.println(e.getSQLState());
            System.out.println(e.getErrorCode());
        }
    }
    
    public void cambiaCIF(String cif_actual, String cif_nuevo) {
        try (Statement stmt = conn.createStatement()) {
            String statement = "update INSTITUCION set CIF='" +
                    cif_nuevo + "' where CIF='" + cif_actual + "'";
        } catch (SQLException e) {
            System.out.println("Error al eliminar de la tabla INSTITUCION");
            System.out.println(e.getMessage());
            System.out.println(e.getSQLState());
            System.out.println(e.getErrorCode());
        }
    }
}