/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pessoa;

/**
 *
 * @author Cviei
 */
public class ExemploPessoa {
    
      public static void main(String[] args) {
         Pessoa umaPessoa = new Pessoa();
         
         umaPessoa.nome = "Heitor";
         umaPessoa.país = "Brasil";
         umaPessoa.sexo = "Masculino";
         
         
         umaPessoa.Andar();
         umaPessoa.Falar();
         umaPessoa.Correndo();
         umaPessoa.Estudar();
         umaPessoa.Brincando();
         umaPessoa.Nome();
         umaPessoa.Pais();
         umaPessoa.Sexo();
         
         
         umaPessoa = null;
         
      }
    
}
