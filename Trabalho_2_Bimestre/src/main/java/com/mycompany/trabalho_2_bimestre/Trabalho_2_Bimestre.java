/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabalho_2_bimestre;
import java.util.Scanner;

/**
 * Desenvolvedores:
 * Victor Fagundes Ramos (RA:00239823)
 * Mateus Martins da Silva (RA: 00231293)
 */
public class Trabalho_2_Bimestre {
    
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    Vetor vetor = new Vetor();
          
    while(true){
        System.out.println("\nEscolha usando um número inteiro:");
        System.out.println("(1) Inserir Vetor de Inteiros");
        System.out.println("(2) Ordenar por Inserção");
        System.out.println("(3) Ordenar por Seleção");
        System.out.println("(4) Ordenar por Bolha");
        System.out.println("(5) Pesquisa Binária");
        System.out.println("(6) Pesquisa Linear");
        System.out.println("(7) Exibir Vetor Original");
        System.out.println("(0) Sair");
        System.out.print("Opção: ");
        int opcao = ler.nextInt();
        
    
     switch (opcao) {
         case 1: 
             vetor.inserirNumeros();
         break;
          
         case 2: 
             vetor.exibirVetorOriginal();
             vetor.ordenarInsercao();
         break;
         
         case 3:
             vetor.exibirVetorOriginal();
             vetor.ordenarSelecao();
         break;
         
         case 4:
             vetor.exibirVetorOriginal();
             vetor.ordenarBolha();
         break;
         
         case 5:
             vetor.pesquisaLinear();
         break;
         
         case 6:
             vetor.pesquisaBinaria();
         break;
         case 7:
             vetor.exibirVetorOriginal();
              break;   
         case 0:
             System.out.println("\nVocê escolheu sair!");
             System.exit(0);
         default:
             System.out.println("\nOpção Inválida! Escolha novamente");
     }

        }
    }
}

