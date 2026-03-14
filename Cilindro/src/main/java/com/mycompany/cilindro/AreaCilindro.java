/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cilindro;

/**
 *
 * @author Cviei
 */
import javax.swing.JOptionPane;
public class AreaCilindro {
        public static void main(String[] args) {
 
        Cilindro c = new Cilindro();
 
        c.raio   = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio: "));
        c.altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura: "));
 
        double areaLateral = c.calcularAreaLateral(c.raio, c.altura);
        double volume      = c.calcularVolume(c.raio, c.altura);
 
        JOptionPane.showMessageDialog(null, "Área Lateral: " + areaLateral + "\nVolume: " + volume);
    }

}
