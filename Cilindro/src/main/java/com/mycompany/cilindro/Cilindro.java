/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cilindro;

/**
 *
 * @author Cviei
 */
public class Cilindro {

       double raio;
    double altura;
 
    static double calcularAreaLateral(double r, double h) {
        return 2 * Math.PI * r * h;
    }
 
    static double calcularVolume(double r, double h) {
        return Math.PI * Math.pow(r, 2) * h;
    }
}
