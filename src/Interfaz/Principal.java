/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author caenrique93
 */
public class Principal extends JFrame {
    
    JPanel panel;
    JLabel label;
    
    public Principal(String titulo) {
        super(titulo);
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new FlowLayout());
        label = new JLabel("ajia, probando");
        add(label);
    }
}
