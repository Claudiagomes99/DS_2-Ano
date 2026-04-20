/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vendedor;

/**
 *
 * @author Cviei
 */
public class ConversorNumeros {
    
    //Converte as Strings para os tipos numéricos int e vice-versa, sendo o parâmetro a opção escolhida no menu principal, para avaliar a opção escolhida e executar a ação que a corresponde
    public Integer stringToInt(String opcao){
        int conversor = Integer.parseInt(opcao);
        return (conversor);//retorno
        
        
    }
    //Converte as Strings para os tipos numéricos double e vice-versa, sendo o parâmetro o salário base do vendedor e o valor vendido, para calcular a comissão
    public Double stringToDouble(String salarioBase){
        double conversor = Double.parseDouble(salarioBase);
        return (conversor);//retorno
    }
    //Converte os tipos numéricos int para String, para exibir a opção escolhida no menu principal
    public String intToString(String opcao){
        String conversor = String.valueOf(opcao);
        return (conversor);//retorno

    }
    //Converte os tipos numéricos double para String, sendo formatado para exibir apenas 2 casas decimais do valor da comissão
    public String doubleToString(double valorComissao){
        String conversor = String.format("%.2f", valorComissao);
        return (conversor);//retorno
    }
}