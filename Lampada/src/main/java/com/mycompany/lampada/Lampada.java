/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lampada;

/**
 *
 * @author Cviei
 */
import javax.swing.JOptionPane;
public class Lampada {

  String estadoDaLampada;

 
    static void acende() {
        JOptionPane.showMessageDialog(null, "Você acendeu a lâmpada!");
    }
 
    static void apagar() {
        JOptionPane.showMessageDialog(null, "Você apagou a lâmpada!");
    }
 
    static void mostraEstado(String estado) {
        JOptionPane.showMessageDialog(null, "A lâmpada está: " + estado);
    }
}  
