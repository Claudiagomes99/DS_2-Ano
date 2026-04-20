/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cadastrocliente;

/**
 *
 * @author Cviei
 */
import javax.swing.*;
import java.awt.*;
public class CadastroCliente extends JFrame {
  
    
    JLabel rotulo1,rotulo2,rotulo3,rotulo4,rotulo5,rotulo6,rotulo7,Titulo;
    JTextField texto1,texto2,texto3,texto4,texto5,texto6,texto7;
    public CadastroCliente(){
        Container tela = getContentPane();
        setLayout(null);
        Titulo = new JLabel ("Cadastro de Cliente");
        rotulo1 = new JLabel ("Nome");
        rotulo2 = new JLabel ("CPF");
        rotulo3 = new JLabel ("RG");
        rotulo4 = new JLabel ("Endereço");
        rotulo5 = new JLabel ("Cidade");
        rotulo6 = new JLabel ("Estado");
        rotulo7 = new JLabel ("CEP");
        texto1 = new JTextField(50);
        texto2 = new JTextField(12);
        texto3 = new JTextField(11);
        texto4 = new JTextField(50);
        texto5 = new JTextField(30);
        texto6 = new JTextField(40);
        texto7 = new JTextField(17);
        
        Titulo.setForeground(Color.red);
        Titulo.setFont(new Font("Comic Sans MS",Font.BOLD,16));
        
        Titulo.setBounds(170,20,200,20);
        rotulo1.setBounds(50,50,80,20);
        rotulo2.setBounds(50,100,80,20);
        rotulo3.setBounds(50,150,80,20);
        rotulo4.setBounds(50,200,80,20);
        rotulo5.setBounds(50,250,80,20);
        rotulo6.setBounds(50,300,80,20);
        rotulo7.setBounds(50,350,80,20);
        texto1.setBounds(50,70,300,20);
        texto2.setBounds(50,120,150,20);
        texto3.setBounds(50,170,130,20);
        texto4.setBounds(50,220,300,20);
        texto5.setBounds(50,270,180,20);
        texto6.setBounds(50,320,160,20);
        texto7.setBounds(50,370,130,20);
        
        tela.add(Titulo);
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(rotulo4);
        tela.add(rotulo5);
        tela.add(rotulo6);
        tela.add(rotulo7);
        tela.add(texto1);
        tela.add(texto2);
        tela.add(texto3);
        tela.add(texto4);
        tela.add(texto5);
        tela.add(texto6);
        tela.add(texto7);
        setSize(500,600);
        setVisible(true);
        setLocationRelativeTo(null);
    }

   
}


