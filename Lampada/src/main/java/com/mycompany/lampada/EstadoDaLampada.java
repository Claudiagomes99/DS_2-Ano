/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lampada;

/**
 *
 * @author Cviei
 */
import javax.swing.JOptionPane;
public class EstadoDaLampada {
    
     public static void main(String[] args) {
       Lampada lamp = new Lampada();
 
        lamp.estadoDaLampada = "Funcionando";
 
        Lampada.mostraEstado(lamp.estadoDaLampada);
 
        String opcao = JOptionPane.showInputDialog("Digite 1 para ligar ou 2 para desligar: ");
 
        if (opcao.equals("1")) {
            lamp.estadoDaLampada = "acesa";
            Lampada.acende();
        } else if (opcao.equals("2")) {
            lamp.estadoDaLampada = "apagada";
            Lampada.apagar();
        }
 
        Lampada.mostraEstado(lamp.estadoDaLampada);
    }
    
}
