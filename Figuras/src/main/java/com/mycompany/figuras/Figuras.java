/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.figuras;

/**
 *
 * @author Cviei
 */
public class Figuras {

     double base;
     double altura;
     double raio;
     double lado;
     
     
     
     static double CalcRetangulo(double b, double h){
         return b*h;
         
     }
     
     
      static double CalcCirculo(double r){
          return Math.PI*(r*r);
          
     }
      
      static double CalcQuadrado(double l){
         return l*l;
     }
      
      static double CalcTriangulo(double b, double h){
          return b*h/2;
      } 
    
}
