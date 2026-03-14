/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bhaskara2;

/**
 *
 * @author Cviei
 */
import java.util.Scanner;
public class Bhaskara2 {

       public static void main(String[] args) {
        Scanner bh = new Scanner(System.in);
        
        
        
        System.out.println("Vamos fazer a fomula de Bhaskará ");
        System.out.println("Escolha os valores para efetuação");
        
        System.out.print("a:");
        double a = bh.nextDouble ();
        
        System.out.print("b:");
        double b = bh.nextDouble ();
        
        System.out.print("c:");
        double c = bh.nextDouble ();
        
         if (a == 0) {
            System.out.println("O valor de 'a' não pode ser zero! Não é uma equação do 2º grau.");
            return;
        }
         
         double delta = (b * b) - (4 * a * c);
        System.out.println("\nDelta = " + delta);

        if (delta < 0) {
            System.out.println("Delta negativo! A equação não possui raízes reais.");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Delta = 0! A equação possui uma raiz real:");
            System.out.println("x = " + x);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("A equação possui duas raízes reais:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }

        bh.close(); 
        
        
    }
}