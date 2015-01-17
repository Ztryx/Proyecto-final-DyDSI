/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Aplicacion.ConexionOracle;

/**
 *
 * @author caenrique93
 */
public class ManejaTabla {
    
    protected ConexionOracle conn;
    
    public ManejaTabla(ConexionOracle conn) {
        this.conn = conn;
    }
}
