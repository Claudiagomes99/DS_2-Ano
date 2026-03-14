/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conversao;

import javax.swing.JOptionPane;

/**
 *
 * @author Cviei
 */
public class ConversaoGraus {
    
    public static void main(String[] args) {
    
        Conversao Kelvin = new Conversao();
        Conversao Fahrenheit = new Conversao();
        
        //Kelvin
        Kelvin.Kelvin= Double.parseDouble(JOptionPane.showInputDialog("Digite o grau Kelvin: ")); 
        
        double grau = Kelvin. ConverKelvin(Kelvin.Kelvin);
        JOptionPane.showMessageDialog(null,"Os graus celsius são: "+ grau);//Resultado
        
        //Kelvin
        Fahrenheit.Fahrenheit= Double.parseDouble(JOptionPane.showInputDialog("Digite o grau Fahrenheit: ")); 
        
        double grau2 = Fahrenheit. ConverFahrenheit(Fahrenheit.Fahrenheit);
        JOptionPane.showMessageDialog(null,"Os graus celsius são: "+ grau2);//Resultado
        
        

        
    }
    
}
