/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vendedor;

/**
 *
 * @author Cviei
 */
public class Vendedor {

     String nome; // Vai puxar o nome (String) do vendedor 
     double salarioBase; // Puxa o salario (double) do vendedor 
    
    
   public double calcularComissao(double valorVendido) {
        return valorVendido * (0.03 + (salarioBase * 0.00001)); // puxa o salario base e calcula a comissao para retornar 
    }
}
