/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author caenrique93
 */
public class Recoge {
    private int voluntario;
    private int establecimiento;
    private int alimento;

    public Recoge() {
    }

    public Recoge(int voluntario, int establecimiento, int alimento) {
        this.voluntario = voluntario;
        this.establecimiento = establecimiento;
        this.alimento = alimento;
    }

    public int getVoluntario() { return voluntario; }
    public int getEstablecimiento() { return establecimiento; }
    public int getAlimento() { return alimento; }

    public void setVoluntario(int voluntario) { this.voluntario = voluntario; }
    public void setEstablecimiento(int establecimiento) { this.establecimiento = establecimiento; }
    public void setAlimento(int alimento) { this.alimento = alimento; }
}
