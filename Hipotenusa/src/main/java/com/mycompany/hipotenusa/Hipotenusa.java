/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hipotenusa;

/**
 *
 * @author Cviei
 */
import java.util.Scanner;
public class Hipotenusa {

    public static void main(String[] args) {

        Scanner hip = new Scanner(System.in);
        System.out.println("-----Vamos cxalcular a hipotenusa-----");

        System.out.print("Digite a base: ");
        double base = hip.nextDouble();

        System.out.print("Digite a altura: ");
        double altura = hip.nextDouble();

        double resultado = Math.hypot(base, altura);

        System.out.println("Resultado final da hipotenusa = " + resultado);

        hip.close();    }
}
