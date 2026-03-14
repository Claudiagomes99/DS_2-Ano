/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teorema;

/**
 *
 * @author Cviei
 */
import javax.swing.JOptionPane;
public class TeoremaDoTriangulo {
    
      public static void main(String[] args) {
       
        Teorema t = new Teorema();
 
        t.catetoA = Double.parseDouble(JOptionPane.showInputDialog("Digite o cateto a: "));
        t.catetoB = Double.parseDouble(JOptionPane.showInputDialog("Digite o cateto b: "));
 
        double hipotenusa = t.calcularHipotenusa(t.catetoA, t.catetoB);
        JOptionPane.showMessageDialog(null, "A hipotenusa é: " + hipotenusa);
    }
 
   
}
