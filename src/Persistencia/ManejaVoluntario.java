/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Aplicacion.ConexionOracle;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author caenrique93
 */
public class ManejaVoluntario  extends ManejaTabla {

    public ManejaVoluntario(ConexionOracle conn) {
        super(conn);
    }
    
    public void eliminaVoluntario(int idVoluntario) {
        try (Statement stmt = conn.createStatement()) {
            String statement = "delete from VOLUNTARIO where id=" +
                    "'" + idVoluntario + "'";
            stmt.executeUpdate(statement);
        } catch (SQLException e) {
            System.out.println("Error al eliminar de la tabla VOLUNTARIO");
            System.out.println(e.getMessage());
            System.out.println(e.getSQLState());
            System.out.println(e.getErrorCode());
        }
    }
}
