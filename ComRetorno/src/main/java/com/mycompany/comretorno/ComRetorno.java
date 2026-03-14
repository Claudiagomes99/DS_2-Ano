/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.comretorno;

/**
 *
 * @author Cviei
 */
import javax.swing.JOptionPane;
public class ComRetorno {

    public static void main(String[] args) {
        int t;
        String p;
        p = JOptionPane.showInputDialog("Digite uma palavra:");
        t=tamanho(p);
        JOptionPane.showMessageDialog(null,p+ " possui "+t+" caracteres ");
    }
    static int tamanho(String x){
        return x.length();
    }
}
