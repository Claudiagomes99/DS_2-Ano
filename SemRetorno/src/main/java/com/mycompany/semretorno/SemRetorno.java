/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.semretorno;

/**
 *
 * @author Cviei
 */
import javax.swing.JOptionPane;
public class SemRetorno {

    public static void main(String[] args) {
         
        int a;
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
    }
    static void dobro(int n){
        int d = n * 2;
        JOptionPane.showMessageDialog(null, "Dobro de "+n+" é " +d);
        
    } 
}
