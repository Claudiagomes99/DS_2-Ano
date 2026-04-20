/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vendedor;

/**
 *
 * @author Cviei
 */
public class MenuComissao {
  
    

    // Armazena o valor da comissão calculada
    private double comissao;
    
    // Objeto que representa o vendedor
    private Vendedor vendedor;
    
    // Guarda a opção escolhida pelo usuário no menu
    private int opcao;
    
    // Responsável por converter String para números
    private ConversorNumeros conversor;
    
    // Responsável pela entrada e saída de dados (interface com o usuário)
    private EntradaSaidaDados io;
    
    // Construtor da classe MenuComissão
    public MenuComissao(){
        // Inicializa o vendedor
        this.vendedor = new Vendedor();
        
        // Define valor inicial inválido para o menu
        this.opcao = -1;
        
        // Inicializa conversor de dados
        this.conversor = new ConversorNumeros();
        
        // Inicializa entrada e saída de dados
        this.io = new EntradaSaidaDados();
    }
        
    // Método principal que controla a execução do menu
    public void executarComissao() {

        // Loop que mantém o menu rodando até o usuário escolher sair (opção 0)
        do {
            executarMenuPrincipal();
            avaliarOpcaoEscolhida();
        } while (opcao != 0);
    }

    // Exibe o menu e captura a opção do usuário
    private void executarMenuPrincipal() {

        String menu =
                "\n1 - Criar vendedor" +
                "\n2 - Calcular comissão" +
                "\n3 - Exibir vendedor" +
                "\n4 - Salário final" +
                "\n0 - Sair";

        // Lê a opção digitada e converte para inteiro
        opcao = conversor.stringToInt(
                io.entradaDados(menu)
        );
    }

    // Avalia qual opção o usuário escolheu
    private void avaliarOpcaoEscolhida() {

        switch (opcao) {

            case 1:
                // Recebe o nome do vendedor
                vendedor.nome =
                        io.entradaDados("Nome do vendedor:");

                // Recebe e converte o salário base
                vendedor.salarioBase =
                        conversor.stringToDouble(
                                io.entradaDados("Salário base:")
                        );
                break;

            case 2:

                // verifica se criou o vendedor primeiro
                if (vendedor.nome == null || vendedor.nome.isEmpty()) {
                            io.saidaDados("Primeiro crie o vendedor (Opção 1)!");
                break;
            }

                // Recebe o valor vendido
                double valorVendido =
                conversor.stringToDouble(
                     io.entradaDados("Valor vendido:")
            );

                // Calcula a comissão com base no valor vendido
                comissao = 
                vendedor.calcularComissao(valorVendido);

                // Exibe o valor da comissão
                io.saidaDados("Comissão: " + comissao);
                break;

            case 3:

                if (vendedor.nome == null || vendedor.nome.isEmpty()) {
                    io.saidaDados("Primeiro crie o vendedor (Opção 1)!");
                break;
            }

                // Exibe o nome do vendedor
                io.saidaDados("Nome do vendedor: " + vendedor.nome);

                break;
                
                
            case 4:

                if (vendedor.nome == null || vendedor.nome.isEmpty()) {
                    io.saidaDados("Primeiro crie o vendedor (Opção 1)!");
                break;
                }

                // Calcula o salário final (salário base + comissão)
                double salarioFinal = vendedor.salarioBase + comissao;

                // Exibe os valores detalhados
                io.saidaDados(
                      "Salário Base: " + vendedor.salarioBase +
                      "\nComissão: " + comissao +
                      "\nSalário Final: " + salarioFinal
                );
                break;

            case 0:
                // Mensagem ao encerrar o programa
                io.saidaDados("Encerrando...");
                break;

            default:
                // Caso o usuário digite uma opção inválida
                io.saidaDados("Opção inválida!");
        }
    }
}