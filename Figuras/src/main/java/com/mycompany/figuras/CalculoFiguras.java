/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figuras;

/**
 *
 * @author Cviei
 */
import javax.swing.JOptionPane;
public class CalculoFiguras {
    
    public static void main(String[] args) {
        
        Figuras Quadrado = new Figuras();
        Figuras Retangulo = new Figuras();
        Figuras Circulo = new Figuras();
        Figuras Triangulo = new Figuras();
        
        //Quadrado
        Quadrado.lado = Double.parseDouble(JOptionPane.showInputDialog("Digite o lado do Quadrado: ")); 
        
        double area = Quadrado.CalcQuadrado(Quadrado.lado);
        JOptionPane.showMessageDialog(null,"A area do quadrado é: "+ area);//Resultado
        
        //Retangulo
        Retangulo.base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do retangulo: ")); 
        
        Retangulo.altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do retangulo: "));
        
        double area2 = Retangulo.CalcRetangulo(Retangulo.base, Retangulo.altura);
        JOptionPane.showMessageDialog(null,"A area do retangulo é: "+ area2);//Resultado
        
        
        //Circulo 
        Circulo.raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio do circulo: "));
        
        double area3 = Circulo.CalcCirculo(Circulo.raio);
        JOptionPane.showMessageDialog(null,"A area do circulo é: "+ area3);//Resultado
        
        
        //Tringulo
        Triangulo.base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do triangulo: ")); 
       
        Triangulo.altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do triangulo: ")); 
        
        double area4 = Triangulo.CalcTriangulo(Triangulo.base, Triangulo.altura);
        JOptionPane.showMessageDialog(null,"A area do triangulo é: "+ area4);//Resultado
    }
    
}
