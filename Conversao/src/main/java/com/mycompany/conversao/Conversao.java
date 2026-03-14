/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conversao;

/**
 *
 * @author Cviei
 */
public class Conversao {

    double Kelvin;
    double Fahrenheit;
    double Celsius;
    
    static double ConverFahrenheit(double f){
         return (f - 32) * 5/9;
    }
     
     static double ConverKelvin(double k){
         return k -273.15;
         
     }

    
}
